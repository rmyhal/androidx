// WARNING: DO NOT EDIT THIS FILE MANUALLY. It's automatically generated by running:
//    frameworks/support/compose/ui/ui-inspection/generate-packages/generate_compose_packages.py -r
package androidx.compose.ui.inspection.inspector

import androidx.annotation.VisibleForTesting
import androidx.collection.intSetOf
import kotlin.math.absoluteValue

@VisibleForTesting
fun packageNameHash(packageName: String) =
    packageName.fold(0) { hash, char -> hash * 31 + char.code }.absoluteValue

val systemPackages =
    intSetOf(
        -1,
        packageNameHash("androidx.compose.animation"),
        packageNameHash("androidx.compose.animation.core"),
        packageNameHash("androidx.compose.animation.graphics.vector"),
        packageNameHash("androidx.compose.desktop"),
        packageNameHash("androidx.compose.foundation"),
        packageNameHash("androidx.compose.foundation.contextmenu"),
        packageNameHash("androidx.compose.foundation.gestures"),
        packageNameHash("androidx.compose.foundation.gestures.snapping"),
        packageNameHash("androidx.compose.foundation.interaction"),
        packageNameHash("androidx.compose.foundation.layout"),
        packageNameHash("androidx.compose.foundation.lazy"),
        packageNameHash("androidx.compose.foundation.lazy.grid"),
        packageNameHash("androidx.compose.foundation.lazy.layout"),
        packageNameHash("androidx.compose.foundation.lazy.staggeredgrid"),
        packageNameHash("androidx.compose.foundation.pager"),
        packageNameHash("androidx.compose.foundation.text"),
        packageNameHash("androidx.compose.foundation.text.input"),
        packageNameHash("androidx.compose.foundation.text.selection"),
        packageNameHash("androidx.compose.foundation.window"),
        packageNameHash("androidx.compose.material"),
        packageNameHash("androidx.compose.material.internal"),
        packageNameHash("androidx.compose.material.navigation"),
        packageNameHash("androidx.compose.material.pullrefresh"),
        packageNameHash("androidx.compose.material.ripple"),
        packageNameHash("androidx.compose.material3"),
        packageNameHash("androidx.compose.material3.adaptive"),
        packageNameHash("androidx.compose.material3.adaptive.layout"),
        packageNameHash("androidx.compose.material3.adaptive.navigation"),
        packageNameHash("androidx.compose.material3.adaptive.navigationsuite"),
        packageNameHash("androidx.compose.material3.carousel"),
        packageNameHash("androidx.compose.material3.common"),
        packageNameHash("androidx.compose.material3.internal"),
        packageNameHash("androidx.compose.material3.pulltorefresh"),
        packageNameHash("androidx.compose.material3.windowsizeclass"),
        packageNameHash("androidx.compose.runtime"),
        packageNameHash("androidx.compose.runtime.internal"),
        packageNameHash("androidx.compose.runtime.livedata"),
        packageNameHash("androidx.compose.runtime.mock"),
        packageNameHash("androidx.compose.runtime.reflect"),
        packageNameHash("androidx.compose.runtime.rxjava2"),
        packageNameHash("androidx.compose.runtime.rxjava3"),
        packageNameHash("androidx.compose.runtime.saveable"),
        packageNameHash("androidx.compose.ui"),
        packageNameHash("androidx.compose.ui.awt"),
        packageNameHash("androidx.compose.ui.draw"),
        packageNameHash("androidx.compose.ui.graphics"),
        packageNameHash("androidx.compose.ui.graphics.benchmark"),
        packageNameHash("androidx.compose.ui.graphics.vector"),
        packageNameHash("androidx.compose.ui.layout"),
        packageNameHash("androidx.compose.ui.platform"),
        packageNameHash("androidx.compose.ui.text"),
        packageNameHash("androidx.compose.ui.util"),
        packageNameHash("androidx.compose.ui.viewinterop"),
        packageNameHash("androidx.compose.ui.window"),
        packageNameHash("androidx.navigation.compose"),
        packageNameHash("androidx.wear.compose.foundation"),
        packageNameHash("androidx.wear.compose.foundation.lazy"),
        packageNameHash("androidx.wear.compose.foundation.rotary"),
        packageNameHash("androidx.wear.compose.material"),
        packageNameHash("androidx.wear.compose.material.dialog"),
        packageNameHash("androidx.wear.compose.material3"),
        packageNameHash("androidx.wear.compose.materialcore"),
        packageNameHash("androidx.wear.compose.navigation"),
    )
