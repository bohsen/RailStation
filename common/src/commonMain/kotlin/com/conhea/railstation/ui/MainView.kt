package com.conhea.railstation.ui

import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.conhea.railstation.platform.HomeFolder
import com.conhea.railstation.platform.PlatformTheme
import com.conhea.railstation.ui.common.AppTheme
import com.conhea.railstation.ui.common.Settings
import com.conhea.railstation.ui.editor.Editors
import com.conhea.railstation.ui.filetree.FileTree

@Composable
fun MainView() {
    val codeViewer = remember {
        val editors = Editors()

        CodeViewer(
            editors = editors,
            fileTree = FileTree(HomeFolder, editors),
            settings = Settings()
        )
    }

    DisableSelection {
        MaterialTheme(
            colors = AppTheme.colors.material
        ) {
            PlatformTheme {
                Surface {
                    CodeViewerView(codeViewer)
                }
            }
        }
    }
}