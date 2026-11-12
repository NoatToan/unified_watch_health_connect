package x0;

import b0.q;
import j20.x;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class a extends e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f188204b;

    public a(int i14, q qVar) {
        this.f188203a = i14;
        if (qVar != null) {
            this.f188204b = qVar;
        } else {
            x.l("Null cameraIdentifier");
            throw null;
        }
    }

    @Override // x0.e.a
    public final q a() {
        return this.f188204b;
    }

    @Override // x0.e.a
    public final int b() {
        return this.f188203a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e.a)) {
            return false;
        }
        e.a aVar = (e.a) obj;
        return this.f188203a == aVar.b() && this.f188204b.equals(aVar.a());
    }

    public final int hashCode() {
        return ((this.f188203a ^ 1000003) * 1000003) ^ this.f188204b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwnerHash=" + this.f188203a + ", cameraIdentifier=" + this.f188204b + StringSubstitutor.DEFAULT_VAR_END;
    }
}
