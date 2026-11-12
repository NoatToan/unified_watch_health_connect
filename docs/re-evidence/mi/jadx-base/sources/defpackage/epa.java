package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class epa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f16919a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile d f16920b = null;

    public interface b {
    }

    public static final class c implements b {
        public c() {
        }
    }

    public interface d {
        boolean a();

        void beginSection(String str);

        void endSection();
    }

    public static void a(String str) {
        c().beginSection(str);
    }

    public static void b() {
        c().endSection();
    }

    public static d c() {
        if (f16920b == null) {
            synchronized (epa.class) {
                try {
                    if (f16920b == null) {
                        f16920b = new cv5();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16920b;
    }

    public static boolean d() {
        return c().a();
    }
}
