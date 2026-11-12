package z0;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class e extends n.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f200610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f200611c;

    public e(u uVar, int i14) {
        if (uVar == null) {
            j20.x.l("Null fallbackQuality");
            throw null;
        }
        this.f200610b = uVar;
        this.f200611c = i14;
    }

    @Override // z0.n.b
    public final u a() {
        return this.f200610b;
    }

    @Override // z0.n.b
    public final int b() {
        return this.f200611c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n.b)) {
            return false;
        }
        n.b bVar = (n.b) obj;
        return this.f200610b.equals(bVar.a()) && this.f200611c == bVar.b();
    }

    public final int hashCode() {
        return ((this.f200610b.hashCode() ^ 1000003) * 1000003) ^ this.f200611c;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb3.append(this.f200610b);
        sb3.append(", fallbackRule=");
        return am.j.q(sb3, this.f200611c, StringSubstitutor.DEFAULT_VAR_END);
    }
}
