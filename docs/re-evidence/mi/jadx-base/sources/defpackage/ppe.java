package defpackage;

import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class ppe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f30613a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile ppe f30614b = null;
    public static final int c = 20;

    public static class a extends ppe {
        public final int d;

        public a(int i) {
            super(i);
            this.d = i;
        }

        @Override // defpackage.ppe
        public void a(String str, String str2) {
        }

        @Override // defpackage.ppe
        public void b(String str, String str2, Throwable th) {
        }

        @Override // defpackage.ppe
        public void c(String str, String str2) {
        }

        @Override // defpackage.ppe
        public void d(String str, String str2, Throwable th) {
        }

        @Override // defpackage.ppe
        public void f(String str, String str2) {
        }

        @Override // defpackage.ppe
        public void g(String str, String str2, Throwable th) {
        }

        @Override // defpackage.ppe
        public void j(String str, String str2) {
        }

        @Override // defpackage.ppe
        public void k(String str, String str2) {
        }

        @Override // defpackage.ppe
        public void l(String str, String str2, Throwable th) {
        }
    }

    public ppe(int i) {
    }

    public static ppe e() {
        ppe ppeVar;
        synchronized (f30613a) {
            try {
                if (f30614b == null) {
                    f30614b = new a(3);
                }
                ppeVar = f30614b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ppeVar;
    }

    public static void h(ppe ppeVar) {
        synchronized (f30613a) {
            try {
                if (f30614b == null) {
                    f30614b = ppeVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = c;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th);
}
