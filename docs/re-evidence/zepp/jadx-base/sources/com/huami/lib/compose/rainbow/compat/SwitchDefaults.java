package com.huami.lib.compose.rainbow.compat;

import androidx.compose.material.ColorsKt;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013Jy\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Lcom/huami/lib/compose/rainbow/compat/SwitchDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "checkedThumbColor", "checkedTrackColor", "", "checkedTrackAlpha", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedTrackAlpha", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "Lcom/huami/lib/compose/rainbow/compat/SwitchColors;", "colors-SQMK_m0", "(JJFJJFJJJJLandroidx/compose/runtime/Composer;III)Lcom/huami/lib/compose/rainbow/compat/SwitchColors;", "colors", "<init>", "()V", "rainbow_release"}, k = 1, mv = {1, 5, 1})
public final class SwitchDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();

    private SwitchDefaults() {
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: colors-SQMK_m0, reason: not valid java name */
    public final SwitchColors m3371colorsSQMK_m0(long j, long j2, float f, long j3, long j4, float f2, long j5, long j6, long j7, long j8, @Nullable Composer composer, int i, int i2, int i3) {
        long jM1258compositeOverOWjLjI;
        long jM1258compositeOverOWjLjI2;
        int i4;
        long jM1258compositeOverOWjLjI3;
        long jM1258compositeOverOWjLjI4;
        composer.startReplaceableGroup(-995834912);
        long jM642getSurface0d7_KjU = (i3 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 8).m642getSurface0d7_KjU() : j;
        long primarySurface = (i3 & 2) != 0 ? ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composer, 8)) : j2;
        float f3 = (i3 & 4) != 0 ? 1.0f : f;
        long jM642getSurface0d7_KjU2 = (i3 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 8).m642getSurface0d7_KjU() : j3;
        long jM637getOnSurface0d7_KjU = (i3 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 8).m637getOnSurface0d7_KjU() : j4;
        float f4 = (i3 & 32) != 0 ? 0.38f : f2;
        if ((i3 & 64) != 0) {
            jM1258compositeOverOWjLjI = ColorKt.m1258compositeOverOWjLjI(Color.m1211copywmQWz5c$default(jM642getSurface0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, 8), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 8).m642getSurface0d7_KjU());
        } else {
            jM1258compositeOverOWjLjI = j5;
        }
        if ((i3 & 128) != 0) {
            jM1258compositeOverOWjLjI2 = ColorKt.m1258compositeOverOWjLjI(Color.m1211copywmQWz5c$default(primarySurface, ContentAlpha.INSTANCE.getDisabled(composer, 8), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 8).m642getSurface0d7_KjU());
        } else {
            jM1258compositeOverOWjLjI2 = j6;
        }
        if ((i3 & 256) != 0) {
            i4 = 8;
            jM1258compositeOverOWjLjI3 = ColorKt.m1258compositeOverOWjLjI(Color.m1211copywmQWz5c$default(jM642getSurface0d7_KjU2, ContentAlpha.INSTANCE.getDisabled(composer, 8), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 8).m642getSurface0d7_KjU());
        } else {
            i4 = 8;
            jM1258compositeOverOWjLjI3 = j7;
        }
        if ((i3 & 512) != 0) {
            jM1258compositeOverOWjLjI4 = ColorKt.m1258compositeOverOWjLjI(Color.m1211copywmQWz5c$default(jM637getOnSurface0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, i4), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 8).m642getSurface0d7_KjU());
        } else {
            jM1258compositeOverOWjLjI4 = j8;
        }
        a aVar = new a(jM642getSurface0d7_KjU, Color.m1211copywmQWz5c$default(primarySurface, f3, 0.0f, 0.0f, 0.0f, 14, null), jM642getSurface0d7_KjU2, Color.m1211copywmQWz5c$default(jM637getOnSurface0d7_KjU, f4, 0.0f, 0.0f, 0.0f, 14, null), jM1258compositeOverOWjLjI, Color.m1211copywmQWz5c$default(jM1258compositeOverOWjLjI2, f3, 0.0f, 0.0f, 0.0f, 14, null), jM1258compositeOverOWjLjI3, Color.m1211copywmQWz5c$default(jM1258compositeOverOWjLjI4, f4, 0.0f, 0.0f, 0.0f, 14, null), null);
        composer.endReplaceableGroup();
        return aVar;
    }
}
