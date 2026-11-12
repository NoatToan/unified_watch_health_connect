package p43;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t implements m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f135926a;

    public abstract boolean a(t23.h hVar);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m1) && obj.hashCode() == hashCode()) {
            m1 m1Var = (m1) obj;
            if (m1Var.getParameters().size() == getParameters().size()) {
                t23.h hVarT = t();
                t23.h hVarT2 = m1Var.t();
                if (hVarT2 == null || r43.l.f(hVarT) || b43.i.m(hVarT) || r43.l.f(hVarT2) || b43.i.m(hVarT2)) {
                    return false;
                }
                return a(hVarT2);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i14 = this.f135926a;
        if (i14 != 0) {
            return i14;
        }
        t23.h hVarT = t();
        int iIdentityHashCode = (r43.l.f(hVarT) || b43.i.m(hVarT)) ? System.identityHashCode(this) : b43.i.f(hVarT).f188600a.hashCode();
        this.f135926a = iIdentityHashCode;
        return iIdentityHashCode;
    }
}
