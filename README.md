📱 PhonePe UI 
A pixel-perfect clone of the PhonePe mobile app UI — built with Kotlin + Jetpack Compose. Pure UI only, no backend or database.
---
🖼️ Preview
> Home screen · Payment flow · Transaction history · UPI PIN screen
---
✨ Features
Home Dashboard — Balance card, quick action buttons (Send Money, Add Money, Pay Bills)
UPI Payment Flow — Enter mobile/UPI ID → Amount → UPI PIN confirmation screen
Transaction History — Recent payments list with status badges (Success / Failed / Pending)
Bottom Navigation Bar — Home, History, Rewards, Profile tabs
Dark / Light Mode — Compose MaterialTheme dark/light support
---
🛠️ Tech Stack
Layer	Technology
Language	Kotlin
UI	Jetpack Compose
Navigation	Compose Navigation
Icons	Material Icons Extended
Theme	Material 3 (Material You)
Build System	Gradle (Kotlin DSL)
> ⚠️ **UI only** — No ViewModel, no Hilt, no Retrofit, no Room. All data is hardcoded/dummy.
---
📁 Project Structure
```
phonepe-ui/
├── app/
│   └── src/main/
│       ├── java/com/example/phonepe/
│       │   ├── ui/
│       │   │   ├── home/
│       │   │   │   └── HomeScreen.kt
│       │   │   ├── payment/
│       │   │   │   └── PaymentScreen.kt
│       │   │   ├── pin/
│       │   │   │   └── PinScreen.kt
│       │   │   ├── status/
│       │   │   │   └── StatusScreen.kt
│       │   │   ├── history/
│       │   │   │   └── HistoryScreen.kt
│       │   │   ├── components/
│       │   │   │   ├── BottomNavBar.kt
│       │   │   │   ├── BalanceCard.kt
│       │   │   │   ├── QuickActionButton.kt
│       │   │   │   └── TransactionItem.kt
│       │   │   └── theme/
│       │   │       ├── Color.kt
│       │   │       ├── Theme.kt
│       │   │       └── Type.kt
│       │   ├── navigation/
│       │   │   └── NavGraph.kt
│       │   └── MainActivity.kt
│       └── res/
│           ├── drawable/
│           └── values/
│               └── strings.xml
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```
---
🚀 Getting Started
Prerequisites
Android Studio Hedgehog or later
JDK 17+
Android SDK min API 26 (Android 8.0)
1. Clone the repo
```bash
git clone https://github.com/your-username/phonepe-ui-clone.git
cd phonepe-ui-clone
```
2. Open in Android Studio
```
File → Open → select the project folder
```
3. Run the app
```
Shift + F10  (or click ▶ Run)
```
> Recommended emulator: Pixel 6, API 33+
---
📦 Dependencies (build.gradle.kts)
```kotlin
dependencies {
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.navigation:navigation-compose:2.7.7")
    implementation("androidx.compose.material:material-icons-extended")
    implementation("androidx.activity:activity-compose:1.9.0")
    debugImplementation("androidx.compose.ui:ui-tooling")
}
```
---
📸 Screens
Screen	File	Description
Home	`HomeScreen.kt`	Balance card, quick actions
Send Money	`PaymentScreen.kt`	UPI ID entry + amount input
UPI PIN	`PinScreen.kt`	6-digit PIN keyboard UI
Success / Failure	`StatusScreen.kt`	Payment result screen
Transaction History	`HistoryScreen.kt`	List of dummy transactions
---
🎨 Theme
```kotlin
// ui/theme/Color.kt
val PhonePePurple     = Color(0xFF5F259F)
val PhonePePurpleDark = Color(0xFF3D1070)
val CyanAccent        = Color(0xFF00BAF2)
val SuccessGreen      = Color(0xFF00C48C)
val ErrorRed          = Color(0xFFFF4D4F)

// ui/theme/Theme.kt
@Composable
fun PhonePeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) darkColorScheme() else lightColorScheme(),
        typography = Typography,
        content = content
    )
}
```
---
⚠️ Disclaimer
Built for educational / portfolio purposes only.  
Not affiliated with or endorsed by PhonePe Pvt. Ltd.
---
📄 License
MIT License
---
🙋‍♂️ Author
Mohammed Raza  
Student @ MDSU, Ajmer  
GitHub · LinkedIn
