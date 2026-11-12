package defpackage;

/* JADX INFO: loaded from: classes9.dex */
public class fg8 {
    public static float a(float f) {
        if (f < 5.0f) {
            return 0.04f;
        }
        return f <= 10.0f ? 0.06f : 0.1f;
    }

    public static float b(int i, float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        return i / f;
    }
}
