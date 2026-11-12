package h0;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f80474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.camera.core.e f80475b;

    public h(j0 j0Var, androidx.camera.core.e eVar) {
        if (j0Var == null) {
            j20.x.l("Null processingRequest");
            throw null;
        }
        this.f80474a = j0Var;
        if (eVar != null) {
            this.f80475b = eVar;
        } else {
            j20.x.l("Null imageProxy");
            throw null;
        }
    }

    @Override // h0.i0.b
    public final androidx.camera.core.e a() {
        return this.f80475b;
    }

    @Override // h0.i0.b
    public final j0 b() {
        return this.f80474a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i0.b)) {
            return false;
        }
        i0.b bVar = (i0.b) obj;
        return this.f80474a.equals(bVar.b()) && this.f80475b.equals(bVar.a());
    }

    public final int hashCode() {
        return ((this.f80474a.hashCode() ^ 1000003) * 1000003) ^ this.f80475b.hashCode();
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.f80474a + ", imageProxy=" + this.f80475b + StringSubstitutor.DEFAULT_VAR_END;
    }
}
