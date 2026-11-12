package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.ui.unit.Density;
import androidx.exifinterface.media.ExifInterface;
import com.xiaomi.market.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b\"\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e\"\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e\"\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e\"\u0016\u0010\u0012\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"", "splinePositions", "splineTimes", "", "nbSamples", "", "computeSplineInfo", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/unit/Density;", Constants.JSON_DENSITY, "Landroidx/compose/animation/core/DecayAnimationSpec;", "splineBasedDecay", "", "Inflection", "F", "StartTension", "EndTension", "P1", "P2", "animation_release"}, k = 2, mv = {1, 5, 1})
public final class SplineBasedDecayKt {
    private static final float EndTension = 1.0f;
    private static final float Inflection = 0.35f;
    private static final float P1 = 0.175f;
    private static final float P2 = 0.35000002f;
    private static final float StartTension = 0.5f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void computeSplineInfo(float[] fArr, float[] fArr2, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11 = 1.0f;
        if (i > 0) {
            float f12 = 0.0f;
            float f13 = 0.0f;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                float f14 = i2 / i;
                float f15 = 1.0f;
                while (true) {
                    f = 2.0f;
                    f2 = ((f15 - f12) / 2.0f) + f12;
                    f3 = f11 - f2;
                    f4 = f2 * 3.0f * f3;
                    f5 = f2 * f2 * f2;
                    float f16 = (((f3 * P1) + (f2 * P2)) * f4) + f5;
                    if (Math.abs(f16 - f14) < 1.0E-5d) {
                        break;
                    }
                    float f17 = f12;
                    if (f16 > f14) {
                        f15 = f2;
                        f12 = f17;
                    } else {
                        f12 = f2;
                    }
                    f11 = 1.0f;
                }
                fArr[i2] = (f4 * ((f3 * 0.5f) + f2)) + f5;
                float f18 = 1.0f;
                while (true) {
                    f6 = ((f18 - f13) / f) + f13;
                    f7 = f11 - f6;
                    f8 = f6 * 3.0f * f7;
                    f9 = f6 * f6 * f6;
                    float f19 = (((f7 * 0.5f) + f6) * f8) + f9;
                    f10 = f12;
                    if (Math.abs(f19 - f14) < 1.0E-5d) {
                        break;
                    }
                    if (f19 > f14) {
                        f18 = f6;
                    } else {
                        f13 = f6;
                    }
                    f12 = f10;
                    f11 = 1.0f;
                    f = 2.0f;
                }
                fArr2[i2] = (f8 * ((f7 * P1) + (f6 * P2))) + f9;
                if (i3 >= i) {
                    break;
                }
                i2 = i3;
                f12 = f10;
                f11 = 1.0f;
            }
            f11 = 1.0f;
        }
        fArr2[i] = f11;
        fArr[i] = fArr2[i];
    }

    @NotNull
    public static final <T> DecayAnimationSpec<T> splineBasedDecay(@NotNull Density density) {
        return DecayAnimationSpecKt.generateDecayAnimationSpec(new SplineBasedFloatDecayAnimationSpec(density));
    }
}
