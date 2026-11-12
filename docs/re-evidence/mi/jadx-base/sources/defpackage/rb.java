package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f32367a = new String[128];

    static {
        for (char c = 0; c < 128; c = (char) (c + 1)) {
            f32367a[c] = String.valueOf(c);
        }
    }

    public static String a(char c) {
        return c < 128 ? f32367a[c] : String.valueOf(c);
    }
}
