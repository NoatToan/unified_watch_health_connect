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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/material/RadioButtonDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "selectedColor", "unselectedColor", "disabledColor", "Landroidx/compose/material/RadioButtonColors;", "colors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/RadioButtonColors;", "colors", "<init>", "()V", "material_release"}, k = 1, mv = {1, 5, 1})
public final class RadioButtonDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final RadioButtonDefaults INSTANCE = new RadioButtonDefaults();

    private RadioButtonDefaults() {
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: colors-RGew2ao, reason: not valid java name */
    public final RadioButtonColors m782colorsRGew2ao(long j, long j2, long j3, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1165740466);
        long jM640getSecondary0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 0).m640getSecondary0d7_KjU() : j;
        long jM1211copywmQWz5c$default = (i2 & 2) != 0 ? Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m637getOnSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM1211copywmQWz5c$default2 = (i2 & 4) != 0 ? Color.m1211copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 0).m637getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 0), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        Color colorM1202boximpl = Color.m1202boximpl(jM640getSecondary0d7_KjU);
        Color colorM1202boximpl2 = Color.m1202boximpl(jM1211copywmQWz5c$default);
        Color colorM1202boximpl3 = Color.m1202boximpl(jM1211copywmQWz5c$default2);
        composer.startReplaceableGroup(-3686095);
        boolean zChanged = composer.changed(colorM1202boximpl) | composer.changed(colorM1202boximpl2) | composer.changed(colorM1202boximpl3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new DefaultRadioButtonColors(jM640getSecondary0d7_KjU, jM1211copywmQWz5c$default, jM1211copywmQWz5c$default2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultRadioButtonColors defaultRadioButtonColors = (DefaultRadioButtonColors) objRememberedValue;
        composer.endReplaceableGroup();
        return defaultRadioButtonColors;
    }
}
