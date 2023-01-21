package com.crimsonwarpedcraft.exampleplugin;

import io.papermc.lib.PaperLib;
import org.bukkit.plugin.java.JavaPlugin;

public class TreePlugin extends JavaPlugin {

  @Override
  public void onEnable() {
    PaperLib.suggestPaper(this);

    saveDefaultConfig();
  }
}
