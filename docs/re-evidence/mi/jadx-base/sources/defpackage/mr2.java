package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class mr2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f27116a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile b f27117b;

    public class a implements b {
        @Override // mr2.b
        public void d(String str, String str2) {
        }

        @Override // mr2.b
        public void e(String str, String str2) {
        }

        @Override // mr2.b
        public void w(String str, String str2) {
        }
    }

    public interface b {
        void d(String str, String str2);

        void e(String str, String str2);

        void w(String str, String str2);
    }

    public static void a(String str, String str2) {
        c().d(str, str2);
    }

    public static void b(String str, String str2) {
        c().e(str, str2);
    }

    public static b c() {
        return f27117b != null ? f27117b : f27116a;
    }

    public static void d(b bVar) {
        f27117b = bVar;
    }

    public static void e(String str, String str2) {
        c().w(str, str2);
    }
}
