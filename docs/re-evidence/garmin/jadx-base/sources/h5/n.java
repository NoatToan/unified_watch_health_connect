package h5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lh5/n;", "", "", "extraAssertions", "<init>", "(Z)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f81895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p1.p0<e0> f81896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2<e0> f81897c = new a2<>(o.f81927a);

    public n(boolean z14) {
        this.f81895a = z14;
    }

    public final void a(e0 e0Var) {
        if (!e0Var.isAttached()) {
            e5.a.b("DepthSortedSet.add called on an unattached node");
        }
        if (this.f81895a) {
            if (this.f81896b == null) {
                this.f81896b = p1.z0.a();
            }
            p1.p0<e0> p0Var = this.f81896b;
            p0Var.getClass();
            int iA = p0Var.a(e0Var);
            int i14 = iA >= 0 ? p0Var.f134875c[iA] : Integer.MAX_VALUE;
            int i15 = e0Var.f81776p;
            if (i14 == Integer.MAX_VALUE) {
                p0Var.h(e0Var, i15);
            } else if (i14 != i15) {
                e5.a.b("invalid node depth");
            }
        }
        this.f81897c.add(e0Var);
    }

    public final boolean b(e0 e0Var) {
        boolean zContains = this.f81897c.contains(e0Var);
        if (this.f81895a) {
            if (this.f81896b == null) {
                this.f81896b = p1.z0.a();
            }
            p1.p0<e0> p0Var = this.f81896b;
            p0Var.getClass();
            if (zContains == (p0Var.a(e0Var) >= 0)) {
                return zContains;
            }
            e5.a.b("inconsistency in TreeSet");
        }
        return zContains;
    }

    public final boolean c(e0 e0Var) {
        if (!e0Var.isAttached()) {
            e5.a.b("DepthSortedSet.remove called on an unattached node");
        }
        boolean zRemove = this.f81897c.remove(e0Var);
        if (this.f81895a) {
            if (this.f81896b == null) {
                this.f81896b = p1.z0.a();
            }
            p1.p0<e0> p0Var = this.f81896b;
            p0Var.getClass();
            if (p0Var.a(e0Var) >= 0) {
                int iB = p0Var.b(e0Var);
                int iA = p0Var.a(e0Var);
                if (iA >= 0) {
                    p0Var.g(iA);
                }
                if (iB == (zRemove ? e0Var.f81776p : Integer.MAX_VALUE)) {
                    return zRemove;
                }
                e5.a.b("invalid node depth");
            }
        }
        return zRemove;
    }

    public final String toString() {
        return this.f81897c.toString();
    }
}
