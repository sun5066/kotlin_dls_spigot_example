plugins {
    kotlin("jvm") version "1.4.20"
    id("com.github.johnrengelman.shadow") version "5.0.0"
    application
}

group = "github.sun5066"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        name = "spigotmc-repo"
        url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    }
    maven {
        name = "sonatype"
        url = uri("https://oss.sonatype.org/content/groups/public/")
    }
    maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.12.2-R0.1-SNAPSHOT")
    shadow("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

val shadowJar: com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar by tasks
shadowJar.apply {
    manifest.attributes (mapOf("Main-Class" to "github.sun5066.example.Example"))
    baseName = "shadow"
    classifier = null
}