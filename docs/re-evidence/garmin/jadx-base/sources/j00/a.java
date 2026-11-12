package j00;

import o13.p;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj00/a;", "", "<init>", "()V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f95964a = new a();

    private a() {
    }

    public static p a(a aVar, float f14, float f15, int i14) {
        aVar.getClass();
        float f16 = i14;
        float f17 = f16 - ((f15 - f14) % f16);
        if (f17 == f16) {
            f17 = 0.0f;
        }
        if (f17 > 0.0f) {
            float fCeil = (float) Math.ceil(f17 / 2);
            float f18 = f14 - fCeil;
            if (f18 < 0.0f) {
                fCeil -= f14;
                f14 = 0.0f;
            } else {
                f14 = f18;
            }
            f15 += f17 - fCeil;
        }
        return new p(Float.valueOf(f14), Float.valueOf(f15));
    }

    public static float b(Float f14, float f15, float f16) {
        return f14 != null ? f14.floatValue() + f15 : f16;
    }

    public static float c(a aVar, Float f14, float f15, float f16) {
        aVar.getClass();
        if (f14 == null) {
            return f16;
        }
        float fFloatValue = f14.floatValue() - f15;
        if (fFloatValue >= 0.0f) {
            return fFloatValue;
        }
        return 0.0f;
    }
}
