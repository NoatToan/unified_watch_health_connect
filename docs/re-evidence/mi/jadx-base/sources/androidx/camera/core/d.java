package androidx.camera.core;

import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class d extends r.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Surface f1697b;

    public d(int i, Surface surface) {
        this.f1696a = i;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.f1697b = surface;
    }

    @Override // androidx.camera.core.r.f
    public int a() {
        return this.f1696a;
    }

    @Override // androidx.camera.core.r.f
    public Surface b() {
        return this.f1697b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r.f)) {
            return false;
        }
        r.f fVar = (r.f) obj;
        return this.f1696a == fVar.a() && this.f1697b.equals(fVar.b());
    }

    public int hashCode() {
        return ((this.f1696a ^ 1000003) * 1000003) ^ this.f1697b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f1696a + ", surface=" + this.f1697b + "}";
    }
}
