package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class i77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile i77 f20855a;

    public static i77 b() {
        if (f20855a == null) {
            synchronized (i77.class) {
                try {
                    if (f20855a == null) {
                        f20855a = new i77();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20855a;
    }

    public String a(String str) {
        return null;
    }

    public boolean c(String str) {
        return false;
    }
}
