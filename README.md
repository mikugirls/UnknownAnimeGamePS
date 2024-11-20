# UnknownAnimeGamePS
- Contributors are always welcome
- Updated to 5.1

English | [简体中文](README_zh-CN.md)

## Joker Board
GlazePS who? The fucking retarded guy who modify mostly everything's author to his own, saying all public stuff like thats what he made. SHAMELESS and RETARDED.

## Current features

* Logging in
* Combat (-)
* Friends list (-)
* Teleportation
* Gacha system (-)
* Activity (-)
* Co-op *partially* works (-)
* Spawning monsters via console
* Inventory features (receiving items/characters, upgrading items/characters, etc) (-)
* Teapot (-)

# Star History Chart
[![Star History Chart](https://api.star-history.com/svg?repos=XeonSucksLAB/UnknownAnimeGamePS&type=Date)](https://star-history.com/#XeonSucksLAB/UnknownAnimeGamePS&Date)

# Setup Guide

## Main Requirements

- Get [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- Get [MongoDB Community Server](https://www.mongodb.com/try/download/community)
- Get game version REL5.1.0 (If you don't have a 5.1.0 client, you can find it here and download it) :


| Download link | Package size | Decompressed package size | MD5 checksum |
| :---: | :---: | :---: | :---: |
| [GenshinImpact_5.2.0.zip.001](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241108173711_97p3DLcQqGoVFVR0/GenshinImpact_5.2.0.zip.001) | 10.0 GB | 20.0 GB | 651a72b1adb3bb5be28dcffded9ee7ec |
| [GenshinImpact_5.2.0.zip.002](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241108173711_97p3DLcQqGoVFVR0/GenshinImpact_5.2.0.zip.002) | 10.0 GB | 20.0 GB | ecfcb0aa4b403608aa0089e8cbc0c618 |
| [GenshinImpact_5.2.0.zip.003](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241108173711_97p3DLcQqGoVFVR0/GenshinImpact_5.2.0.zip.003) | 10.0 GB | 20.0 GB | 5bac8cd01f87d13dd3e20cbf897731d9 |
| [GenshinImpact_5.2.0.zip.004](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241108173711_97p3DLcQqGoVFVR0/GenshinImpact_5.2.0.zip.004) | 10.0 GB | 20.0 GB | 84501620dded6000f758bfc4bde68d50 |
| [GenshinImpact_5.2.0.zip.005](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241108173711_97p3DLcQqGoVFVR0/GenshinImpact_5.2.0.zip.005) | 10.0 GB | 20.0 GB | 2d47ee68d07fd698c02001311998498f |
| [GenshinImpact_5.2.0.zip.006](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241108173711_97p3DLcQqGoVFVR0/GenshinImpact_5.2.0.zip.006) | 10.0 GB | 20.0 GB | 8246d93ee1f93ed787bf87314220ed4e |
| [GenshinImpact_5.2.0.zip.007](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241108173711_97p3DLcQqGoVFVR0/GenshinImpact_5.2.0.zip.007) | 7.24 GB | 14.49 GB | fda38b6c9a5f746829abd8b561f51f54 |
| [Audio_Chinese_5.2.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241108173711_97p3DLcQqGoVFVR0/Audio_Chinese_5.2.0.zip) | 13.42 GB | 26.84 GB | 10dd6595c3687dec572afdc329c47eec |
| [Audio_English(US)_5.2.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241108173711_97p3DLcQqGoVFVR0/Audio_English(US)_5.2.0.zip) | 15.46 GB | 30.93 GB | c67d7e98f823afce67fe662f76d27388 |
| [Audio_Korean_5.2.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241108173711_97p3DLcQqGoVFVR0/Audio_Korean_5.0.0.zip) | 13.17 GB | 26.35 GB | 071cfaab116ac1578fb6d755c34634e0 |
| [Audio_Japanese_5.2.0.zip](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20241108173711_97p3DLcQqGoVFVR0/Audio_Japanese_5.0.0.zip) | 17.41 GB | 34.84 GB | 285fba0cf723fc0ec033944caa1ada5c |


- Download the patch from [here](https://watchandy.me/5.2.0/version.dll).
- Put the `version.dll` in to the folder of your game client.

## Let's build the server

### 1. Clone the repository

```shell
git clone --recurse-submodules https://github.com/XeonSucksLAB/UnknownAnimeGamePS.git
cd UnknownAnimeGamePS
```

**Curiosity**: Grasscutter uses Gradle to handle dependencies and building.

### 2. Compile the actual Server

**Sidenote**: Make sure to append the right prefix and suffix based on your operating system (./ for linux | .\ for windows | add .bat for windows systems when compiling server JAR/handbook).

**Requirements**:

[Java Development Kit 17 | JDK](https://oracle.com/java/technologies/javase/jdk17-archive-downloads.html) or higher

[Git](https://git-scm.com/downloads)

- **Sidenote**: Handbook generation may fail on some systems. To disable handbook generation, append `-PskipHandbook=1` to the `gradlew jar` command.

- **For Windows**:
```shell
.\gradlew.bat
.\gradlew.bat jar
```
*If you are wondering, the first command is to set up the environment while the 2nd one is for building the server JAR file.*

- **For Linux**:
```bash
chmod +x gradlew
./gradlew jar
```
*If you are wondering, the first command is to make the file executeable and for the rest refer to the windows explanation.*

### You can find the output JAR in the project root folder.

### Manually compile the handbook
```shell
./gradlew generateHandbook
```


## You're done with the building part!

- Launch the server.
- Launch the client and login.

- Enjoy!

### Troubleshooting
- Fiddler or any proxy is required.

### Resources credit
- Dimbreath | AnimeGameData (BinOutput, ExcelBinOutput, TextMap) - https://github.com/DimbreathBot/AnimeGameData
- Hiro420 | GS_Lua (Scripts) - https://github.com/Hiro420/GS_Lua/tree/5.0.0 -- The Lua scripts used in the game client have not been updated
- YuukiPS | GC-Resources (ScriptSceneData, Server) - https://gitlab.com/YuukiPS/GC-Resources -- Server Resources has not been updated
