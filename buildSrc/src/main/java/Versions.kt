/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

object Versions {
    val versionName = "7.0.15" // X.Y.Z; X = Major, Y = minor, Z = Patch level
    private val versionCodeBase = 70150 // XYYZZM; M = Module (tv, mobile)
    val versionCodeMobile = versionCodeBase + 3

    const val COMPILE_SDK = 32
    const val COMPILE_PREVIEW_SDK = "Tiramisu"
    const val TARGET_SDK = 32
    const val TARGET_PREVIEW_SDK = "Tiramisu"
    const val MIN_SDK = 21
    const val MIN_PREVIEW_SDK = "Tiramisu"

    const val ANDROID_GRADLE_PLUGIN = "7.3.0-alpha09"
    const val BENCHMARK = "1.1.0-rc01"
    const val COMPOSE = "1.2.0-alpha08"
    const val FIREBASE_CRASHLYTICS = "2.8.1"
    const val GOOGLE_SERVICES = "4.3.10"
    const val KOTLIN = "1.6.20"
    const val NAVIGATION = "2.5.0-beta01"
    const val HILT_AGP = "2.40.5"

    // TODO: Remove this once the version for
    //  "org.threeten:threetenbp:${Versions.threetenbp}:no-tzdb" using java-platform in the
    //  depconstraints/build.gradle.kts is defined
    const val THREETENBP = "1.6.0"
}
