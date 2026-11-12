package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j0i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f22296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f22297b;

    static {
        int iC = c();
        f22296a = iC;
        f22297b = iC != 0;
    }

    public static int a() {
        return f22296a;
    }

    public static boolean b() {
        return f22297b;
    }

    public static int c() {
        try {
            return ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }
}
