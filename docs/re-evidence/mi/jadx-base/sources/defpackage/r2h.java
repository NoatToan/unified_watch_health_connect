package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class r2h {
    public static njh<Integer, Integer> a(float f) {
        return new njh<>(Integer.valueOf((int) f), Integer.valueOf(f >= 1.0f ? ((int) (10.0f * f)) % 10 : (int) (10.0f * f)));
    }
}
