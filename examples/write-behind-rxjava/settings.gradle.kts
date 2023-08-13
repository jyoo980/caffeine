plugins {
  id("com.gradle.enterprise") version "3.14.1"
  id("com.gradle.common-custom-user-data-gradle-plugin") version "1.11.1"
  id("org.gradle.toolchains.foojay-resolver-convention") version "0.6.0"
}

dependencyResolutionManagement {
  repositories {
    mavenCentral()
  }
}

apply(from = "../../gradle/gradle-enterprise.gradle")

rootProject.name = "writebehind-rxjava"