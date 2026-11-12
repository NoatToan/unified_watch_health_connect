package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJG\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/material/CheckboxDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "checkedColor", "uncheckedColor", "checkmarkColor", "disabledColor", "disabledIndeterminateColor", "Landroidx/compose/material/CheckboxColors;", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/CheckboxColors;", "colors", "<init>", "()V", "material_release"}, k = 1, mv = {1, 5, 1})
public final class CheckboxDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();

    private CheckboxDefaults() {
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: colors-zjMxDiM, reason: not valid java name */
    public final CheckboxColors m614colorszjMxDiM(long j, long j2, long j3, long j4, long j5, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-533071607);
        int i3 = 0;
        long jM640getSecondary0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 0).m640getSecondary0d7_KjU() : j;
        long jM1211copywmQWz5c$default = (i2 & 2) != 0 ? Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m637getOnSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM642getSurface0d7_KjU = (i2 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 0).m642getSurface0d7_KjU() : j3;
        long jM1211copywmQWz5c$default2 = (i2 & 8) != 0 ? Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m637getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 0), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long jM1211copywmQWz5c$default3 = (i2 & 16) != 0 ? Color.m1211copywmQWz5c$default(jM640getSecondary0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, 0), 0.0f, 0.0f, 0.0f, 14, null) : j5;
        Object[] objArr = {Color.m1202boximpl(jM640getSecondary0d7_KjU), Color.m1202boximpl(jM1211copywmQWz5c$default), Color.m1202boximpl(jM642getSurface0d7_KjU), Color.m1202boximpl(jM1211copywmQWz5c$default2), Color.m1202boximpl(jM1211copywmQWz5c$default3)};
        composer.startReplaceableGroup(-3685570);
        boolean zChanged = false;
        while (i3 < 5) {
            Object obj = objArr[i3];
            i3++;
            zChanged |= composer.changed(obj);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new DefaultCheckboxColors(jM642getSurface0d7_KjU, Color.m1211copywmQWz5c$default(jM642getSurface0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), jM640getSecondary0d7_KjU, Color.m1211copywmQWz5c$default(jM640getSecondary0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), jM1211copywmQWz5c$default2, Color.m1211copywmQWz5c$default(jM1211copywmQWz5c$default2, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), jM1211copywmQWz5c$default3, jM640getSecondary0d7_KjU, jM1211copywmQWz5c$default, jM1211copywmQWz5c$default2, jM1211copywmQWz5c$default3, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultCheckboxColors defaultCheckboxColors = (DefaultCheckboxColors) objRememberedValue;
        composer.endReplaceableGroup();
        return defaultCheckboxColors;
    }
}
