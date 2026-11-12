package b0;

/* JADX INFO: loaded from: classes.dex */
public interface x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.camera.core.impl.q0.b f14112a = new androidx.camera.core.impl.q0.b(6000);

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x0 f14113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f14114b;

        public b(x0 x0Var) {
            this.f14113a = x0Var;
            this.f14114b = x0Var.b();
        }
    }

    static {
        new androidx.camera.core.impl.q0(6000L);
    }

    default long b() {
        return 0L;
    }

    c c(androidx.camera.core.impl.p0 p0Var);

    public static final class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f14115d = new c(false, 0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final c f14116e = new c(true);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final c f14117f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f14118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f14119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f14120c;

        static {
            new c(true, 100L);
            f14117f = new c(false, 0L, true);
        }

        private c(boolean z14, long j8, boolean z15) {
            this.f14119b = z14;
            this.f14118a = j8;
            if (z15) {
                k7.h.b(!z14, "shouldRetry must be false when completeWithoutFailure is set to true");
            }
            this.f14120c = z15;
        }

        private c(boolean z14) {
            this(z14, 500L);
        }

        private c(boolean z14, long j8) {
            this(z14, j8, false);
        }
    }
}
