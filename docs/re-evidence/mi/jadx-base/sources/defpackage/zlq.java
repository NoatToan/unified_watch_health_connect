package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public class zlq {
    public static float a(float f, float f2) {
        float f3 = Float.MAX_VALUE / f2;
        if (f > f3) {
            return Float.MAX_VALUE;
        }
        if (f < (-f3)) {
            return Float.MIN_VALUE;
        }
        return f * f2;
    }
}
