package androidx.camera.core.impl;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class n extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f5637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f5638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2 f5639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f5640d;

    public n(b2 b2Var, b2 b2Var2, b2 b2Var3, b2 b2Var4) {
        if (b2Var == null) {
            j20.x.l("Null previewOutputSurface");
            throw null;
        }
        this.f5637a = b2Var;
        if (b2Var2 == null) {
            j20.x.l("Null imageCaptureOutputSurface");
            throw null;
        }
        this.f5638b = b2Var2;
        this.f5639c = b2Var3;
        this.f5640d = b2Var4;
    }

    @Override // androidx.camera.core.impl.c2
    public final b2 a() {
        return this.f5639c;
    }

    @Override // androidx.camera.core.impl.c2
    public final b2 b() {
        return this.f5638b;
    }

    @Override // androidx.camera.core.impl.c2
    public final b2 c() {
        return this.f5640d;
    }

    @Override // androidx.camera.core.impl.c2
    public final b2 d() {
        return this.f5637a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        if (!this.f5637a.equals(c2Var.d()) || !this.f5638b.equals(c2Var.b())) {
            return false;
        }
        b2 b2Var = this.f5639c;
        if (b2Var == null) {
            if (c2Var.a() != null) {
                return false;
            }
        } else if (!b2Var.equals(c2Var.a())) {
            return false;
        }
        b2 b2Var2 = this.f5640d;
        if (b2Var2 == null) {
            return c2Var.c() == null;
        }
        return b2Var2.equals(c2Var.c());
    }

    public final int hashCode() {
        int iHashCode = (((this.f5637a.hashCode() ^ 1000003) * 1000003) ^ this.f5638b.hashCode()) * 1000003;
        b2 b2Var = this.f5639c;
        int iHashCode2 = (iHashCode ^ (b2Var == null ? 0 : b2Var.hashCode())) * 1000003;
        b2 b2Var2 = this.f5640d;
        return iHashCode2 ^ (b2Var2 != null ? b2Var2.hashCode() : 0);
    }

    public final String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.f5637a + ", imageCaptureOutputSurface=" + this.f5638b + ", imageAnalysisOutputSurface=" + this.f5639c + ", postviewOutputSurface=" + this.f5640d + StringSubstitutor.DEFAULT_VAR_END;
    }
}
