package h0;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class d extends w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0.k<androidx.camera.core.e> f80460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80461b;

    public d(r0.k<androidx.camera.core.e> kVar, int i14) {
        if (kVar == null) {
            j20.x.l("Null packet");
            throw null;
        }
        this.f80460a = kVar;
        this.f80461b = i14;
    }

    @Override // h0.w.a
    public final int a() {
        return this.f80461b;
    }

    @Override // h0.w.a
    public final r0.k<androidx.camera.core.e> b() {
        return this.f80460a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w.a)) {
            return false;
        }
        w.a aVar = (w.a) obj;
        return this.f80460a.equals(aVar.b()) && this.f80461b == aVar.a();
    }

    public final int hashCode() {
        return ((this.f80460a.hashCode() ^ 1000003) * 1000003) ^ this.f80461b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("In{packet=");
        sb3.append(this.f80460a);
        sb3.append(", jpegQuality=");
        return am.j.q(sb3, this.f80461b, StringSubstitutor.DEFAULT_VAR_END);
    }
}
