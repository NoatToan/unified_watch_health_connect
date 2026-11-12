package e33;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k23.d<? extends c> f62825a;

    public d(k23.d<? extends c> dVar) {
        dVar.getClass();
        this.f62825a = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f62825a.equals(((d) obj).f62825a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f62825a.hashCode();
    }

    public final String toString() {
        return dh.b.u(this.f62825a).getName();
    }
}
