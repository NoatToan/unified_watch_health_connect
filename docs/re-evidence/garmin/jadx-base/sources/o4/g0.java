package o4;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lo4/g0;", "", "values", "", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f128854a;

    public static float[] a() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    }

    public static final void b(float f14, float[] fArr) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f15 = 1 - f14;
        float f16 = 0.213f * f15;
        float f17 = 0.715f * f15;
        float f18 = f15 * 0.072f;
        fArr[0] = f16 + f14;
        fArr[1] = f17;
        fArr[2] = f18;
        fArr[5] = f16;
        fArr[6] = f17 + f14;
        fArr[7] = f18;
        fArr[10] = f16;
        fArr[11] = f17;
        fArr[12] = f18 + f14;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g0) {
            return p005kotlin.jvm.internal.s.g(this.f128854a, ((g0) obj).f128854a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f128854a);
    }

    public final String toString() {
        return "ColorMatrix(values=" + Arrays.toString(this.f128854a) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
