plugins {
  id("java-library")
  id("kotlin")
  id("kotlin-kapt")
}

dependencies {
  implementationProject(Projects.common)
  implementationProject(Projects.sourceApi)

  implementation(Deps.kotlin.stdlib)
  implementation(Deps.rxJava)
  implementation(Deps.rxRelay)
  implementation(Deps.rxKotlin)

  implementation(Deps.toothpick.runtime)
  kapt(Deps.toothpick.compiler)

  testImplementation(Deps.junit)
  testImplementation(Deps.mockito)
  testImplementation(Deps.mockitokt)
  testImplementation(Deps.toothpick.testing)
  kaptTest(Deps.toothpick.compiler)
}