package ue;

/* JADX INFO: loaded from: classes7.dex */
public interface y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b.c f170132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b.C3178b f170133b;

    static {
        f170132a = new b.c();
        f170133b = new b.C3178b();
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f170134a;

            public a(Throwable th3) {
                this.f170134a = th3;
            }

            public final String toString() {
                return "FAILURE (" + this.f170134a.getMessage() + ")";
            }
        }

        /* JADX INFO: renamed from: ue.y$b$b, reason: collision with other inner class name */
        public static final class C3178b extends b {
            public final String toString() {
                return "IN_PROGRESS";
            }

            private C3178b() {
            }
        }

        public static final class c extends b {
            public final String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }
    }
}
