package com.example.composereactnativeapp.react

class FromNativeActivity: BaseReactNativeActivity() {
    /**
     * Returns the name of the main component registered from JavaScript. This is used to schedule
     * rendering of the component.
     */
    override fun getMainComponentName(): String = "FromNative"
}