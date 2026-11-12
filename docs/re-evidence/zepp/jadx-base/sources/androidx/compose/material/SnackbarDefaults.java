package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.google.android.exoplayer2.text.ttml.b;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u00020\u00058G@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\u00020\u00058G@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Landroidx/compose/material/SnackbarDefaults;", "", "", "SnackbarOverlayAlpha", "F", "Landroidx/compose/ui/graphics/Color;", "getBackgroundColor", "(Landroidx/compose/runtime/Composer;I)J", b.H, "getPrimaryActionColor", "primaryActionColor", "<init>", "()V", "material_release"}, k = 1, mv = {1, 5, 1})
public final class SnackbarDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final SnackbarDefaults INSTANCE = new SnackbarDefaults();
    private static final float SnackbarOverlayAlpha = 0.8f;

    private SnackbarDefaults() {
    }

    @Composable
    @JvmName(name = "getBackgroundColor")
    public final long getBackgroundColor(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-465860777);
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        long jM1258compositeOverOWjLjI = ColorKt.m1258compositeOverOWjLjI(Color.m1211copywmQWz5c$default(materialTheme.getColors(composer, 0).m637getOnSurface0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 0).m642getSurface0d7_KjU());
        composer.endReplaceableGroup();
        return jM1258compositeOverOWjLjI;
    }

    @Composable
    @JvmName(name = "getPrimaryActionColor")
    public final long getPrimaryActionColor(@Nullable Composer composer, int i) {
        long jM639getPrimaryVariant0d7_KjU;
        composer.startReplaceableGroup(894573386);
        Colors colors = MaterialTheme.INSTANCE.getColors(composer, 0);
        if (colors.isLight()) {
            jM639getPrimaryVariant0d7_KjU = ColorKt.m1258compositeOverOWjLjI(Color.m1211copywmQWz5c$default(colors.m642getSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), colors.m638getPrimary0d7_KjU());
        } else {
            jM639getPrimaryVariant0d7_KjU = colors.m639getPrimaryVariant0d7_KjU();
        }
        composer.endReplaceableGroup();
        return jM639getPrimaryVariant0d7_KjU;
    }
}
