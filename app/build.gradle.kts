plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
    id ("kotlinx-serialization")
}

android {
    namespace = "com.example.barutoapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.barutoapp"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    kapt {
        correctErrorTypes = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation(platform("androidx.compose:compose-bom:2023.08.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.08.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    kapt("groupId:artifactId:1.9.23")



    val nav_version = "2.7.7"
    implementation("androidx.navigation:navigation-compose:$nav_version")

    val room_version = "2.6.1"
    implementation("androidx.room:room-runtime:$room_version")
    kapt("androidx.room:room-compiler:$room_version")
    implementation("androidx.room:room-ktx:$room_version")

    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0")

//   paging 3
    implementation("androidx.paging:paging-compose:3.3.0-alpha05")

//    Kotlin serialization
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")

//    datastore preferences
    implementation("androidx.datastore:datastore-preferences:1.0.0")

//    dagger-hilt
    implementation("com.google.dagger:hilt-android:2.44")
    kapt("com.google.dagger:hilt-android-compiler:2.44")

    // Coil
    implementation("io.coil-kt:coil-compose:2.6.0")

    // Horizontal Pager and Indicators - Accompanist
    implementation("com.google.accompanist:accompanist-pager:0.35.0-alpha")
    implementation("com.google.accompanist:accompanist-pager-indicators:0.13.0")

    // Swipe to Refresh - Accompanist
    implementation("com.google.accompanist:accompanist-swiperefresh:0.35.0-alpha")

    // System UI Controller - Accompanist
    implementation("com.google.accompanist:accompanist-systemuicontroller:0.35.0-alpha")

    // Palette API
    implementation("androidx.palette:palette:1.0.0")




    androidTestImplementation ("androidx.test:runner:1.5.2")
    androidTestImplementation ("androidx.test:rules:1.5.0")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.compose.ui:ui-test-junit4:1.6.4")
    debugImplementation ("androidx.compose.ui:ui-test-manifest:1.6.4")

    testImplementation ("junit:junit:4.13.2")
    testImplementation ("org.jetbrains.kotlin:kotlin-test-junit:1.9.23")
    testImplementation ("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.1")



}