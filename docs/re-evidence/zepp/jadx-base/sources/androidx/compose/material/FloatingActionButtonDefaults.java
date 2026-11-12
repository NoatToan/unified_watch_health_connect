package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/material/FloatingActionButtonDefaults;", "", "Landroidx/compose/ui/unit/Dp;", "defaultElevation", "pressedElevation", "Landroidx/compose/material/FloatingActionButtonElevation;", "elevation-ixp7dh8", "(FFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/FloatingActionButtonElevation;", "elevation", "<init>", "()V", "material_release"}, k = 1, mv = {1, 5, 1})
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final FloatingActionButtonDefaults INSTANCE = new FloatingActionButtonDefaults();

    private FloatingActionButtonDefaults() {
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: elevation-ixp7dh8, reason: not valid java name */
    public final FloatingActionButtonElevation m713elevationixp7dh8(float f, float f2, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(795786825);
        if ((i2 & 1) != 0) {
            f = Dp.m2965constructorimpl(6);
        }
        if ((i2 & 2) != 0) {
            f2 = Dp.m2965constructorimpl(12);
        }
        Dp dpM2963boximpl = Dp.m2963boximpl(f);
        Dp dpM2963boximpl2 = Dp.m2963boximpl(f2);
        composer.startReplaceableGroup(-3686552);
        boolean zChanged = composer.changed(dpM2963boximpl) | composer.changed(dpM2963boximpl2);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new DefaultFloatingActionButtonElevation(f, f2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation = (DefaultFloatingActionButtonElevation) objRememberedValue;
        composer.endReplaceableGroup();
        return defaultFloatingActionButtonElevation;
    }
}
