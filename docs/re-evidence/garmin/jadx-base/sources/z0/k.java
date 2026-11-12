package z0;

import b0.g1;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class k extends e0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f200660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0.a f200661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g1.g f200662f;

    public k(int i14, e0.a aVar, g1.g gVar) {
        this.f200660d = i14;
        if (aVar == null) {
            j20.x.l("Null streamState");
            throw null;
        }
        this.f200661e = aVar;
        this.f200662f = gVar;
    }

    @Override // z0.e0
    public final int a() {
        return this.f200660d;
    }

    @Override // z0.e0
    public final g1.g b() {
        return this.f200662f;
    }

    @Override // z0.e0
    public final e0.a c() {
        return this.f200661e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (this.f200660d != e0Var.a() || !this.f200661e.equals(e0Var.c())) {
            return false;
        }
        g1.g gVar = this.f200662f;
        if (gVar == null) {
            return e0Var.b() == null;
        }
        return gVar.equals(e0Var.b());
    }

    public final int hashCode() {
        int iHashCode = (((this.f200660d ^ 1000003) * 1000003) ^ this.f200661e.hashCode()) * 1000003;
        g1.g gVar = this.f200662f;
        return iHashCode ^ (gVar == null ? 0 : gVar.hashCode());
    }

    public final String toString() {
        return "StreamInfo{id=" + this.f200660d + ", streamState=" + this.f200661e + ", inProgressTransformationInfo=" + this.f200662f + StringSubstitutor.DEFAULT_VAR_END;
    }
}
