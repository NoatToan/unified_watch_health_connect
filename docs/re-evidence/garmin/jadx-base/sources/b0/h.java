package b0;

import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class h extends c1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c1 f13930b;

    public h(int i14, c1 c1Var) {
        this.f13929a = i14;
        if (c1Var != null) {
            this.f13930b = c1Var;
        } else {
            j20.x.l("Null surfaceOutput");
            throw null;
        }
    }

    @Override // b0.c1.b
    public final int a() {
        return this.f13929a;
    }

    @Override // b0.c1.b
    public final c1 b() {
        return this.f13930b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c1.b)) {
            return false;
        }
        c1.b bVar = (c1.b) obj;
        return this.f13929a == bVar.a() && this.f13930b.equals(bVar.b());
    }

    public final int hashCode() {
        return ((this.f13929a ^ 1000003) * 1000003) ^ this.f13930b.hashCode();
    }

    public final String toString() {
        return "Event{eventCode=" + this.f13929a + ", surfaceOutput=" + this.f13930b + StringSubstitutor.DEFAULT_VAR_END;
    }
}
