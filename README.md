# Configuration Change Demo

This project demonstrates how to preserve temporary UI state during configuration changes **without using a ViewModel**.

It includes the same registration form implemented in two different UI frameworks:

* **XML Views** using `onSaveInstanceState()`
* **Jetpack Compose** using `rememberSaveable()`

## Registration Form

Both implementations contain the same fields:

* Name
* Email
* Phone Number
* Gender
* Submit Button

## Demo

### XML Views

* **Name** ✅ Restored using `onSaveInstanceState()`
* **Email** ✅ Restored using `onSaveInstanceState()`
* **Gender** ✅ Restored using `onSaveInstanceState()`
* **Phone Number** ❌ Intentionally not restored

> **Note:** The Phone Number field has `android:saveEnabled="false"` and is intentionally excluded from `onSaveInstanceState()` to demonstrate what happens when a field is not saved.

### Jetpack Compose

* **Name** ✅ Restored using `rememberSaveable()`
* **Email** ✅ Restored using `rememberSaveable()`
* **Gender** ✅ Restored using `rememberSaveable()`
* **Phone Number** ❌ Intentionally not restored

> **Note:** The Phone Number field intentionally uses `remember()` instead of `rememberSaveable()` to demonstrate how state is lost after a configuration change.

## What You'll Learn

* What a configuration change is
* Why Activities are recreated
* How to preserve UI state using `onSaveInstanceState()`
* How to preserve UI state using `rememberSaveable()`
* The difference between `remember` and `rememberSaveable()`

## Tech Stack

* Kotlin
* Android SDK
* XML Views
* Jetpack Compose
* Material 3
