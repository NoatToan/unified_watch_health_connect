package s0;

import j20.x;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0.f f155251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0.f f155252b;

    public a(t0.f fVar, t0.f fVar2) {
        if (fVar == null) {
            x.l("Null primaryOutConfig");
            throw null;
        }
        this.f155251a = fVar;
        if (fVar2 != null) {
            this.f155252b = fVar2;
        } else {
            x.l("Null secondaryOutConfig");
            throw null;
        }
    }

    @Override // s0.d
    public final t0.f a() {
        return this.f155251a;
    }

    @Override // s0.d
    public final t0.f b() {
        return this.f155252b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f155251a.equals(dVar.a()) && this.f155252b.equals(dVar.b());
    }

    public final int hashCode() {
        return ((this.f155251a.hashCode() ^ 1000003) * 1000003) ^ this.f155252b.hashCode();
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f155251a + ", secondaryOutConfig=" + this.f155252b + StringSubstitutor.DEFAULT_VAR_END;
    }
}
