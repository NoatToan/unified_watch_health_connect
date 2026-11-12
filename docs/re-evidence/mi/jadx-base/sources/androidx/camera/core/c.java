package androidx.camera.core;

/* JADX INFO: loaded from: classes.dex */
public final class c extends CameraState.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f1695b;

    public c(int i, Throwable th) {
        this.f1694a = i;
        this.f1695b = th;
    }

    @Override // androidx.camera.core.CameraState.a
    public Throwable c() {
        return this.f1695b;
    }

    @Override // androidx.camera.core.CameraState.a
    public int d() {
        return this.f1694a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraState.a)) {
            return false;
        }
        CameraState.a aVar = (CameraState.a) obj;
        if (this.f1694a == aVar.d()) {
            Throwable th = this.f1695b;
            if (th == null) {
                if (aVar.c() == null) {
                    return true;
                }
            } else if (th.equals(aVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = (this.f1694a ^ 1000003) * 1000003;
        Throwable th = this.f1695b;
        return i ^ (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.f1694a + ", cause=" + this.f1695b + "}";
    }
}
