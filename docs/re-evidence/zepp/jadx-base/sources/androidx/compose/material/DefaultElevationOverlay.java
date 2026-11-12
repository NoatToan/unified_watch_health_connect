package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/material/DefaultElevationOverlay;", "Landroidx/compose/material/ElevationOverlay;", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/unit/Dp;", "elevation", "apply-7g2Lkgo", "(JFLandroidx/compose/runtime/Composer;I)J", "apply", "<init>", "()V", "material_release"}, k = 1, mv = {1, 5, 1})
final class DefaultElevationOverlay implements ElevationOverlay {

    @NotNull
    public static final DefaultElevationOverlay INSTANCE = new DefaultElevationOverlay();

    private DefaultElevationOverlay() {
    }

    @Override // androidx.compose.material.ElevationOverlay
    @Composable
    @ReadOnlyComposable
    /* JADX INFO: renamed from: apply-7g2Lkgo, reason: not valid java name */
    public long mo672apply7g2Lkgo(long j, float f, @Nullable Composer composer, int i) {
        Colors colors = MaterialTheme.INSTANCE.getColors(composer, 0);
        if (Dp.m2964compareTo0680j_4(f, Dp.m2965constructorimpl(0)) <= 0 || colors.isLight()) {
            composer.startReplaceableGroup(-1272525098);
            composer.endReplaceableGroup();
            return j;
        }
        composer.startReplaceableGroup(-1272525241);
        long jM1258compositeOverOWjLjI = ColorKt.m1258compositeOverOWjLjI(ElevationOverlayKt.m699calculateForegroundColorCLU3JFs(j, f, composer, (i & 112) | (i & 14)), j);
        composer.endReplaceableGroup();
        return jM1258compositeOverOWjLjI;
    }
}
