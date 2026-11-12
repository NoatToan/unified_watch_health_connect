package h0;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0.k<byte[]> f80464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0.l0.h f80465b;

    public e(r0.k<byte[]> kVar, b0.l0.h hVar) {
        if (kVar == null) {
            j20.x.l("Null packet");
            throw null;
        }
        this.f80464a = kVar;
        if (hVar != null) {
            this.f80465b = hVar;
        } else {
            j20.x.l("Null outputFileOptions");
            throw null;
        }
    }

    @Override // h0.a0.a
    public final b0.l0.h a() {
        return this.f80465b;
    }

    @Override // h0.a0.a
    public final r0.k<byte[]> b() {
        return this.f80464a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.a)) {
            return false;
        }
        a0.a aVar = (a0.a) obj;
        return this.f80464a.equals(aVar.b()) && this.f80465b.equals(aVar.a());
    }

    public final int hashCode() {
        return ((this.f80464a.hashCode() ^ 1000003) * 1000003) ^ this.f80465b.hashCode();
    }

    public final String toString() {
        return "In{packet=" + this.f80464a + ", outputFileOptions=" + this.f80465b + StringSubstitutor.DEFAULT_VAR_END;
    }
}
