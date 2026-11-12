package b0;

import android.view.Surface;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class i extends g1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Surface f13940b;

    public i(int i14, Surface surface) {
        this.f13939a = i14;
        if (surface != null) {
            this.f13940b = surface;
        } else {
            j20.x.l("Null surface");
            throw null;
        }
    }

    @Override // b0.g1.f
    public final int a() {
        return this.f13939a;
    }

    @Override // b0.g1.f
    public final Surface b() {
        return this.f13940b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g1.f)) {
            return false;
        }
        g1.f fVar = (g1.f) obj;
        return this.f13939a == fVar.a() && this.f13940b.equals(fVar.b());
    }

    public final int hashCode() {
        return ((this.f13939a ^ 1000003) * 1000003) ^ this.f13940b.hashCode();
    }

    public final String toString() {
        return "Result{resultCode=" + this.f13939a + ", surface=" + this.f13940b + StringSubstitutor.DEFAULT_VAR_END;
    }
}
