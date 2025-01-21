plugins {
    kotlin("jvm") version "2.0.0"
    id("com.akuleshov7.vercraft.plugin-gradle") version("0.3.0")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}



kotlin {
    jvmToolchain(21)
}