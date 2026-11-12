package z0;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class h extends w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f200628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f200629b;

    public h(u uVar, int i14) {
        if (uVar == null) {
            j20.x.l("Null quality");
            throw null;
        }
        this.f200628a = uVar;
        this.f200629b = i14;
    }

    @Override // z0.w.a
    public final int a() {
        return this.f200629b;
    }

    @Override // z0.w.a
    public final u b() {
        return this.f200628a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w.a)) {
            return false;
        }
        w.a aVar = (w.a) obj;
        return this.f200628a.equals(aVar.b()) && this.f200629b == aVar.a();
    }

    public final int hashCode() {
        return ((this.f200628a.hashCode() ^ 1000003) * 1000003) ^ this.f200629b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("QualityRatio{quality=");
        sb3.append(this.f200628a);
        sb3.append(", aspectRatio=");
        return am.j.q(sb3, this.f200629b, StringSubstitutor.DEFAULT_VAR_END);
    }
}
