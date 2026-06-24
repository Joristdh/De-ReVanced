/*
 * Forked from:
 * https://github.com/humzakh/HK-Morphe-Patches/raw/refs/heads/test/swipe_to_return_predictive_back_gesture/patches/src/main/kotlin/app/template/patches/reddit/customclients/sync/syncforreddit/Constants.kt
 */

package app.morphe.patches.reddit.customclients.sync.syncforreddit

import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

internal val SyncForRedditFreeCompatible = Compatibility(
    name = "Sync for Reddit",
    packageName = "com.laurencedawson.reddit_sync",
    targets = listOf(AppTarget(version = "v23.06.30-13:39"))
)

internal val SyncForLemmyCompatible = Compatibility(
    name = "Sync for Lemmy",
    packageName = "io.syncapps.lemmy_sync",
    targets = listOf(AppTarget(version = null))
)

internal val SyncForRedditCompatible = arrayOf(
    SyncForRedditFreeCompatible,
    Compatibility(
        name = "Sync for Reddit Pro",
        packageName = "com.laurencedawson.reddit_sync.pro",
        targets = listOf(AppTarget(version = null))
    ),
    Compatibility(
        name = "Sync for Reddit Dev",
        packageName = "com.laurencedawson.reddit_sync.dev",
        targets = listOf(AppTarget(version = null))
    )
)
