package h0;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class c extends t.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.camera.core.e f80457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0.l0.h f80459c;

    public c(androidx.camera.core.e eVar, int i14, b0.l0.h hVar) {
        if (eVar == null) {
            j20.x.l("Null imageProxy");
            throw null;
        }
        this.f80457a = eVar;
        this.f80458b = i14;
        if (hVar != null) {
            this.f80459c = hVar;
        } else {
            j20.x.l("Null outputFileOptions");
            throw null;
        }
    }

    @Override // h0.t.a
    public final androidx.camera.core.e a() {
        return this.f80457a;
    }

    @Override // h0.t.a
    public final b0.l0.h b() {
        return this.f80459c;
    }

    @Override // h0.t.a
    public final int c() {
        return this.f80458b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t.a)) {
            return false;
        }
        t.a aVar = (t.a) obj;
        return this.f80457a.equals(aVar.a()) && this.f80458b == aVar.c() && this.f80459c.equals(aVar.b());
    }

    public final int hashCode() {
        return ((((this.f80457a.hashCode() ^ 1000003) * 1000003) ^ this.f80458b) * 1000003) ^ this.f80459c.hashCode();
    }

    public final String toString() {
        return "In{imageProxy=" + this.f80457a + ", rotationDegrees=" + this.f80458b + ", outputFileOptions=" + this.f80459c + StringSubstitutor.DEFAULT_VAR_END;
    }
}
