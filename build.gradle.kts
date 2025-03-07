// Root-level build.gradle.kts

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.5.2") // Update as needed
        classpath("com.google.gms:google-services:4.3.15") // Update as needed
    }
}


tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
