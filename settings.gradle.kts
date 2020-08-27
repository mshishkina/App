pluginManagement {
    repositories {
        mavenCentral()
        jcenter()
        gradlePluginPortal()
        maven {
            url = uri("https://dl.bintray.com/kotlin/kotlin-dev")
            maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev")

        }
    }
    
}
rootProject.name = "App"

