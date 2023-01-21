package io.github.setupminimal.treeplugin;

import clojure.lang.IFn;
import io.papermc.lib.PaperLib;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * A plugin class that loads clojure code.
 */
public class TreePlugin extends JavaPlugin {

  private void reload() {
    // Set the contextual classloader for clojure code
    Thread.currentThread().setContextClassLoader(
        this.getClass().getClassLoader());

    IFn loadFile = Clojure.var("clojure.core", "load-file");
    loadFile.invoke("main.clj");

    IFn registerFn = Clojure.var("main", "register");
    registerFn.invoke(this);
  }

  @Override
  public void onEnable() {
    PaperLib.suggestPaper(this);

    reload();

    getLogger().info("Tree plugin has been enabled");
  }
}
