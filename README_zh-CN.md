# UnknownAnimeGamePS
- 一直欢迎贡献者
- 更新至5.1版本

[English](README.md) | 简体中文

## 小丑板
琉璃服？把几乎所有东西的作者改成自己名字的傻X，把公开的东西改个名字就说是他做的。无耻又愚蠢。

## 当前功能

* 登录
* 战斗 (-)
* 好友列表 (-)
* 传送
* 抽卡系统 (-)
* 活动 (-)
* 联机模式 部分 可用 (-)
* 通过控制台生成怪物
* 背包功能（接收物品/角色，升级物品/角色等) (-)
* 尘歌壶 (-)

# 收藏历史图表
[![收藏历史图表](https://api.star-history.com/svg?repos=XeonSucksLAB/UnknownAnimeGamePS&type=Date)](https://star-history.com/#XeonSucksLAB/UnknownAnimeGamePS&Date)

# 安装指南

## 主要需求

- 获取 [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- 获取 [MongoDB Community Server](https://www.mongodb.com/try/download/community)
- 获取游戏版本 REL5.2.0（如果你没有5.1.0客户端，你可以在这里找到并下载）：


| 下载链接 | 包大小 | 解压后的包大小 | MD5校验码 |
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


- 从[这里](https://watchandy.me/5.2.0/version.dll)下载补丁。
- 将 `version.dll` 放入游戏客户端的文件夹中。

## 搭建服务器

### 1. 克隆仓库

```shell
git clone --recurse-submodules https://github.com/XeonSucksLAB/UnknownAnimeGamePS.git
cd UnknownAnimeGamePS
```

**Curiosity**: Grasscutter使用Gradle来处理依赖和构建。

### 2. 编译实际的服务器

**附注**：根据你的操作系统，确保在适当的位置添加前缀和后缀（Linux 系统使用 `./` | Windows 系统使用 `.\` | 当编译服务器 JAR/handbook 文件时，Windows 系统添加 `.bat`）。

**要求**：

[Java 开发工具包 17 | JDK](https://oracle.com/java/technologies/javase/jdk17-archive-downloads.html) 或更高版本

[Git](https://git-scm.com/downloads)

- **附注**：某些系统上可能会生成Handbook失败。要禁用手册生成，请在 `gradlew jar` 命令中追加 `-PskipHandbook=1`。

- **对于 Windows**：
```shell
.\gradlew.bat
.\gradlew.bat jar
```
*如果您想知道，第一个命令是设置环境，第二个命令是构建服务器 JAR 文件。*

- **对于 Linux**：
```bash
chmod +x gradlew
./gradlew jar
```
*如果你在想，第一个命令是为了使文件可执行，接下来的命令与 Windows 系统的解释相同。*

### 你可以在项目根目录找到输出的 JAR 文件。

### 手动编译Handbook
```shell
./gradlew generateHandbook
```


## 你已经完成了构建部分！

- 启动服务器。
- 启动客户端并登录。

- 享受吧！

### 故障排除
- 需要使用 Fiddler 或其他代理工具。
