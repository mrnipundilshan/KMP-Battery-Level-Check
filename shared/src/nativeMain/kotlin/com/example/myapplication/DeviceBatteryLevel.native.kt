package com.example.myapplication

import platform.UIKit.UIDevice
import kotlin.math.roundToInt

actual class DeviceBatteryLevel {
    actual fun getBatteryLevel(): Int {
        UIDevice.currentDevice.batteryMonitoringEnabled = true;
        val batteryLevel = UIDevice.currentDevice.batteryLevel

        return (batteryLevel * 100).roundToInt()
    }
}