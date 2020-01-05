import org.gradle.jvm.tasks.Jar

plugins {
    `maven-publish`
    kotlin("jvm") version "1.3.61"
    id("org.jetbrains.dokka") version "0.10.0"
}

group = "cn.tustlitao"
version = "0.0.1"

repositories {
    jcenter()
}

tasks.dokka {
    outputFormat = "html"
    outputDirectory = "$buildDir/javadoc"
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}