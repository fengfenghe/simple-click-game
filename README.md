# 简单点击游戏 - Android APK演示程序

这是一个最简单的Android手机游戏演示程序，帮助您了解Android应用开发的基本流程。

## 游戏功能

- 点击绿色按钮增加分数
- 达到特定分数时显示祝贺消息（10分、50分、100分）
- 重置按钮可以清零分数
- 简洁美观的用户界面

## 项目结构

```
project1/
├── app/
│   ├── src/main/
│   │   ├── java/com/example/simplegame/
│   │   │   └── MainActivity.java          # 主活动类
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   └── activity_main.xml      # 主界面布局
│   │   │   ├── values/
│   │   │   │   ├── strings.xml            # 字符串资源
│   │   │   │   └── styles.xml             # 样式资源
│   │   │   └── mipmap-hdpi/
│   │   │       └── ic_launcher.png        # 应用图标
│   │   └── AndroidManifest.xml            # 应用清单文件
│   ├── build.gradle                       # 应用级构建配置
│   └── proguard-rules.pro                 # 代码混淆规则
├── build.gradle                           # 项目级构建配置
├── settings.gradle                        # 项目设置
├── gradle.properties                      # Gradle属性配置
├── gradlew.bat                            # Windows Gradle包装器
└── gradle/wrapper/
    └── gradle-wrapper.properties          # Gradle包装器配置
```

## 构建要求

- Android Studio 或 命令行工具
- Java Development Kit (JDK) 8 或更高版本
- Android SDK (API Level 21 或更高)

## 构建步骤

### 方法1：使用Android Studio（推荐）

1. 打开Android Studio
2. 选择 "Open an existing Android Studio project"
3. 选择项目根目录
4. 等待Gradle同步完成
5. 点击 "Run" 按钮或按 Shift+F10

### 方法2：使用提供的构建脚本

1. 双击运行 `build-apk.bat` 文件
2. 按照脚本提示选择构建方式
3. 脚本会指导您完成构建过程

### 方法3：使用命令行

1. 确保已安装Android SDK和Java JDK
2. 在项目根目录打开命令行
3. 运行以下命令：

```bash
# 如果gradlew.bat可用
gradlew.bat assembleDebug

# 或者直接使用gradle（如果已安装）
gradle assembleDebug
```

4. APK文件将生成在 `app/build/outputs/apk/debug/` 目录中

## 故障排除

### gradlew.bat 无法运行

如果遇到 `gradlew.bat` 无法运行的问题，请尝试以下解决方案：

1. **运行设置脚本**：
   ```bash
   setup-gradle.bat
   ```

2. **检查Java环境**：
   - 确保已安装JDK 8或更高版本
   - 设置JAVA_HOME环境变量

3. **使用Android Studio**：
   - 这是最简单的方法
   - Android Studio会自动处理Gradle配置

4. **手动安装Gradle**：
   - 下载并安装Gradle：https://gradle.org/install/
   - 将Gradle添加到系统PATH

### 常见错误及解决方案

- **"JAVA_HOME is not set"**：设置JAVA_HOME环境变量指向JDK安装目录
- **"Android SDK not found"**：安装Android SDK并设置ANDROID_HOME环境变量
- **"Gradle sync failed"**：检查网络连接，确保可以下载依赖

## 安装和运行

1. 将生成的APK文件传输到Android设备
2. 在设备上启用"未知来源"安装
3. 点击APK文件进行安装
4. 安装完成后，在应用列表中找到"简单点击游戏"并运行

## 开发流程说明

这个演示项目展示了Android应用开发的基本流程：

1. **项目结构创建** - 建立标准的Android项目目录结构
2. **Java代码编写** - 实现MainActivity类，包含游戏逻辑
3. **界面设计** - 使用XML布局文件设计用户界面
4. **资源配置** - 定义字符串、样式等资源
5. **清单配置** - 在AndroidManifest.xml中声明应用信息
6. **构建配置** - 使用Gradle配置构建过程
7. **编译打包** - 生成可安装的APK文件

## 学习要点

- Android应用的基本架构（Activity + Layout）
- Java代码与XML布局的配合
- 事件处理（按钮点击监听器）
- 资源管理（字符串、样式、图标）
- Gradle构建系统
- APK打包和安装流程

这个简单的演示程序为您提供了Android开发的基础框架，您可以在此基础上添加更多功能，如音效、动画、数据存储等。
