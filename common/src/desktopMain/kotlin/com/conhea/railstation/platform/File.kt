@file:Suppress("NewApi")

package com.conhea.railstation.platform

actual val HomeFolder: File get() = java.io.File(System.getProperty("user.home")).toProjectFile()