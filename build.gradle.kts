plugins {
    java
    id("org.openrewrite.rewrite") version "latest.release"
}

group = "me.alexprogrammerde"
version = "1.0.0"

allprojects {
    repositories {
        mavenCentral()
        maven {
            url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
        }
        maven {
            url = uri("https://oss.sonatype.org/content/groups/public/")
        }
    }
}

dependencies {
    compileOnly("org.spigotmc:spigot-api:1.12.2-R0.1-SNAPSHOT")
    
    rewrite(platform("org.openrewrite.recipe:rewrite-recipe-bom:latest.release"))
    rewrite("org.openrewrite:rewrite-java")
}

rewrite {
    activeRecipe("org.openrewrite.java.ShortenFullyQualifiedTypeReferences")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
