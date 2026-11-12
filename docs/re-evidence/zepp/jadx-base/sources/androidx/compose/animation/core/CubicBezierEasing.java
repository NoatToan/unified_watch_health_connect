package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, d2 = {"Landroidx/compose/animation/core/CubicBezierEasing;", "Landroidx/compose/animation/core/Easing;", "", "a", "b", "m", "evaluateCubic", "fraction", "transform", "", "other", "", "equals", "", "hashCode", "F", "c", GoogleApiAvailabilityLight.a, "<init>", "(FFFF)V", "animation-core_release"}, k = 1, mv = {1, 5, 1})
public final class CubicBezierEasing implements Easing {
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public CubicBezierEasing(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    private final float evaluateCubic(float a, float b, float m) {
        float f = 3;
        float f2 = 1 - m;
        return (a * f * f2 * f2 * m) + (f * b * f2 * m * m) + (m * m * m);
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof CubicBezierEasing) {
            CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) other;
            if (this.a == cubicBezierEasing.a) {
                if (this.b == cubicBezierEasing.b) {
                    if (this.c == cubicBezierEasing.c) {
                        if (this.d == cubicBezierEasing.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float fraction) {
        float f = 0.0f;
        if (fraction > 0.0f) {
            float f2 = 1.0f;
            if (fraction < 1.0f) {
                while (true) {
                    float f3 = (f + f2) / 2;
                    float fEvaluateCubic = evaluateCubic(this.a, this.c, f3);
                    if (Math.abs(fraction - fEvaluateCubic) < 0.001f) {
                        return evaluateCubic(this.b, this.d, f3);
                    }
                    if (fEvaluateCubic < fraction) {
                        f = f3;
                    } else {
                        f2 = f3;
                    }
                }
            }
        }
        return fraction;
    }
}
