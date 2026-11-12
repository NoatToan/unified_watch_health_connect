package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class r5n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f32216a = 1;

    public static int a() {
        if (f32216a >= 65534) {
            f32216a = 1;
        }
        int i = f32216a + 1;
        f32216a = i;
        return i;
    }
}
