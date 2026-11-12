package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\f\u001a\u00020\u000b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "component", "", "getMinValue", "getMaxValue", "", "v", "toXyz", "fromXyz", "", "isWideGamut", "()Z", "", "name", "id", "<init>", "(Ljava/lang/String;I)V", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 5, 1})
public final class Lab extends ColorSpace {
    private static final float A = 0.008856452f;
    private static final float B = 7.787037f;
    private static final float C = 0.13793103f;
    private static final float D = 0.20689656f;

    public Lab(@NotNull String str, int i) {
        super(str, ColorModel.INSTANCE.m1539getLabxdoWZVw(), i, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] fromXyz(@NotNull float[] v) {
        float f = v[0];
        Illuminant illuminant = Illuminant.INSTANCE;
        float f2 = f / illuminant.getD50Xyz$ui_graphics_release()[0];
        float f3 = v[1] / illuminant.getD50Xyz$ui_graphics_release()[1];
        float f4 = v[2] / illuminant.getD50Xyz$ui_graphics_release()[2];
        float fPow = f2 > A ? (float) Math.pow(f2, 0.33333334f) : (f2 * B) + C;
        float fPow2 = f3 > A ? (float) Math.pow(f3, 0.33333334f) : (f3 * B) + C;
        float fPow3 = f4 > A ? (float) Math.pow(f4, 0.33333334f) : (f4 * B) + C;
        v[0] = e.coerceIn((116.0f * fPow2) - 16.0f, 0.0f, 100.0f);
        v[1] = e.coerceIn((fPow - fPow2) * 500.0f, -128.0f, 128.0f);
        v[2] = e.coerceIn((fPow2 - fPow3) * 200.0f, -128.0f, 128.0f);
        return v;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int component) {
        return component == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int component) {
        return component == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: isWideGamut */
    public boolean getIsWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    @NotNull
    public float[] toXyz(@NotNull float[] v) {
        v[0] = e.coerceIn(v[0], 0.0f, 100.0f);
        v[1] = e.coerceIn(v[1], -128.0f, 128.0f);
        v[2] = e.coerceIn(v[2], -128.0f, 128.0f);
        float f = (v[0] + 16.0f) / 116.0f;
        float f2 = (v[1] * 0.002f) + f;
        float f3 = f - (v[2] * 0.005f);
        float f4 = f2 > D ? f2 * f2 * f2 : (f2 - C) * 0.12841855f;
        float f5 = f > D ? f * f * f : (f - C) * 0.12841855f;
        float f6 = f3 > D ? f3 * f3 * f3 : (f3 - C) * 0.12841855f;
        Illuminant illuminant = Illuminant.INSTANCE;
        v[0] = f4 * illuminant.getD50Xyz$ui_graphics_release()[0];
        v[1] = f5 * illuminant.getD50Xyz$ui_graphics_release()[1];
        v[2] = f6 * illuminant.getD50Xyz$ui_graphics_release()[2];
        return v;
    }
}
