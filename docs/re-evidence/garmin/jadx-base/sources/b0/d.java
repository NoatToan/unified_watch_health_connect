package b0;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class d extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u.b f13863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u.a f13864b;

    public d(u.b bVar, u.a aVar) {
        if (bVar == null) {
            j20.x.l("Null type");
            throw null;
        }
        this.f13863a = bVar;
        this.f13864b = aVar;
    }

    @Override // b0.u
    public final u.a a() {
        return this.f13864b;
    }

    @Override // b0.u
    public final u.b b() {
        return this.f13863a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (!this.f13863a.equals(uVar.b())) {
            return false;
        }
        u.a aVar = this.f13864b;
        if (aVar == null) {
            return uVar.a() == null;
        }
        return aVar.equals(uVar.a());
    }

    public final int hashCode() {
        int iHashCode = (this.f13863a.hashCode() ^ 1000003) * 1000003;
        u.a aVar = this.f13864b;
        return iHashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "CameraState{type=" + this.f13863a + ", error=" + this.f13864b + StringSubstitutor.DEFAULT_VAR_END;
    }
}
