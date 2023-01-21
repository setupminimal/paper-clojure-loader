# Paper Clojure Loader

[![Build, Test, and Release](https://github.com/setupminimal/paper-clojure-loader/actions/workflows/main.yml/badge.svg)](https://github.com/setupminimal/paper-clojure-loader/actions/workflows/main.yml)

This Paper plugin (probably also compatible with Spigot and other Bukkit-derived minecraft servers) is a shim that lets you load custom clojure scripts which can then pretend to be JavaPlugins.

Put a `main.clj` file in your server folder that provides a `register` function. This function will be called when the plugin is enabled, and can from there register its own listeners. See the provided `example-main.clj`.

## Creating a Release
Below are the steps you should follow to create a release.

1. Create a tag on `main` using semantic versioning (e.g. v0.1.0)
2. Push the tag and get some coffee while the workflows run
3. Publish the release draft once it's been automatically created

## Contributing
### General workflow
0. (External contributors only) Create a fork of the repository
1. Pull any changes from `main` to make sure you're up-to-date
2. Create a branch from `main`
    * Give your branch a name that describes your change (e.g. add-scoreboard)
    * Focus on one change per branch
    * Keep your commits small (<300 LOC), and write descriptive commit messages
3. When you're ready, create a pull request to `main` with a descriptive title, and listing any changes made in its description
    * Link any issues that your pull request is related to as well

#### Example:
```text
Create scoreboard for total points

ADDED - Scoreboard displayed in-game at game end  
CHANGED - Updated `StorageManager` class to persist scoreboard data
```

After the pull request has been reviewed, approved, and passes all automated checks, it will be merged into main.

### Building locally
Thanks to [Gradle](https://gradle.org/), building locally is easy no matter what platform you're on. Simply run the following command:

```text
./gradlew build
```

This build step will also run all checks and tests, making sure your code is clean.

JARs can be found in `build/libs/`.
