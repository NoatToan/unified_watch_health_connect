package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y2 f5712b;

    public class a implements b0.x0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f5713b;

        public a(q0 q0Var, long j8) {
            this.f5713b = j8;
        }

        @Override // b0.x0
        public final long b() {
            return this.f5713b;
        }

        @Override // b0.x0
        public final b0.x0.c c(p0 p0Var) {
            return p0Var.f5680a == 1 ? b0.x0.c.f14115d : b0.x0.c.f14116e;
        }
    }

    public static final class b implements k2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q0 f5714b;

        public b(long j8) {
            this.f5714b = new q0(j8);
        }

        @Override // androidx.camera.core.impl.k2
        public final b0.x0 a(long j8) {
            return new b(j8);
        }

        @Override // b0.x0
        public final long b() {
            return this.f5714b.f5712b.f5865b;
        }

        @Override // b0.x0
        public final b0.x0.c c(p0 p0Var) {
            if (this.f5714b.f5712b.c(p0Var).f14119b) {
                return b0.x0.c.f14116e;
            }
            Throwable th3 = p0Var.f5682c;
            return (!(th3 instanceof CameraValidator.CameraIdListIncorrectException) || ((CameraValidator.CameraIdListIncorrectException) th3).getAvailableCameraCount() <= 0) ? b0.x0.c.f14115d : b0.x0.c.f14117f;
        }
    }

    public q0(long j8) {
        this.f5712b = new y2(j8, new a(this, j8));
    }

    @Override // androidx.camera.core.impl.k2
    public final b0.x0 a(long j8) {
        return new q0(j8);
    }

    @Override // b0.x0
    public final long b() {
        return this.f5712b.f5865b;
    }

    @Override // b0.x0
    public final b0.x0.c c(p0 p0Var) {
        return this.f5712b.c(p0Var);
    }
}
