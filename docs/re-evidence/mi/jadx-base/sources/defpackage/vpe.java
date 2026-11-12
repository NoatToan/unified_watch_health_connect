package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class vpe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f37106a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static cqe f37107b = new a();

    public static class a implements cqe {
        @Override // defpackage.cqe
        public void d(String str, String str2) {
        }

        @Override // defpackage.cqe
        public void e(String str, String str2) {
        }

        @Override // defpackage.cqe
        public void i(String str, String str2) {
        }

        @Override // defpackage.cqe
        public void w(String str, String str2) {
        }
    }

    public static void a(String str, String str2) {
        if (f37106a >= 3) {
            f37107b.d(str, str2);
        }
    }

    public static void b(String str, String str2) {
        if (f37106a >= 0) {
            f37107b.e(str, str2);
        }
    }

    public static void c(String str, String str2) {
        if (f37106a >= 2) {
            f37107b.i(str, str2);
        }
    }

    public static void d(String str, String str2) {
        if (f37106a >= 1) {
            f37107b.w(str, str2);
        }
    }
}
