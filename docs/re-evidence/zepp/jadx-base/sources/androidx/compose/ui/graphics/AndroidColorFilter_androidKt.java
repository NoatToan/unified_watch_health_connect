package androidx.compose.ui.graphics;

import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import com.huami.watch.notification.TransportUri;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0001\u001a%\u0010\n\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013*\f\b\u0000\u0010\u0015\"\u00020\u00012\u00020\u0001\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/ColorFilter;", "Landroid/graphics/ColorFilter;", "asAndroidColorFilter", "asComposeColorFilter", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "actualTintColorFilter-xETnrds", "(JI)Landroidx/compose/ui/graphics/ColorFilter;", "actualTintColorFilter", "Landroidx/compose/ui/graphics/ColorMatrix;", "colorMatrix", "actualColorMatrixColorFilter-jHG-Opc", "([F)Landroidx/compose/ui/graphics/ColorFilter;", "actualColorMatrixColorFilter", "multiply", TransportUri.ACTION_ADD, "actualLightingColorFilter--OWjLjI", "(JJ)Landroidx/compose/ui/graphics/ColorFilter;", "actualLightingColorFilter", "NativeColorFilter", "ui-graphics_release"}, k = 2, mv = {1, 5, 1})
public final class AndroidColorFilter_androidKt {
    @NotNull
    /* JADX INFO: renamed from: actualColorMatrixColorFilter-jHG-Opc, reason: not valid java name */
    public static final ColorFilter m1089actualColorMatrixColorFilterjHGOpc(@NotNull float[] fArr) {
        return new ColorFilter(new ColorMatrixColorFilter(fArr));
    }

    @NotNull
    /* JADX INFO: renamed from: actualLightingColorFilter--OWjLjI, reason: not valid java name */
    public static final ColorFilter m1090actualLightingColorFilterOWjLjI(long j, long j2) {
        return new ColorFilter(new LightingColorFilter(ColorKt.m1267toArgb8_81llA(j), ColorKt.m1267toArgb8_81llA(j2)));
    }

    @NotNull
    /* JADX INFO: renamed from: actualTintColorFilter-xETnrds, reason: not valid java name */
    public static final ColorFilter m1091actualTintColorFilterxETnrds(long j, int i) {
        return new ColorFilter(Build.VERSION.SDK_INT >= 29 ? BlendModeColorFilterHelper.INSTANCE.m1165BlendModeColorFilterxETnrds(j, i) : new PorterDuffColorFilter(ColorKt.m1267toArgb8_81llA(j), AndroidBlendMode_androidKt.m1076toPorterDuffModes9anfk8(i)));
    }

    @NotNull
    public static final android.graphics.ColorFilter asAndroidColorFilter(@NotNull ColorFilter colorFilter) {
        return colorFilter.getNativeColorFilter();
    }

    @NotNull
    public static final ColorFilter asComposeColorFilter(@NotNull android.graphics.ColorFilter colorFilter) {
        return new ColorFilter(colorFilter);
    }
}
