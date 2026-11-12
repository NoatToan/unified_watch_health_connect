package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class ey9 {
    public static boolean a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) && Float.isNaN(f2);
        }
        return Math.abs(f2 - f) < 1.0E-5f;
    }
}
