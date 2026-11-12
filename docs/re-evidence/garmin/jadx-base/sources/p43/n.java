package p43;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o43.j<a> f135889b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Collection<n0> f135890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<? extends n0> f135891b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Collection<? extends n0> collection) {
            collection.getClass();
            this.f135890a = collection;
            r43.l.f150388a.getClass();
            this.f135891b = p13.w.c(r43.l.f150391d);
        }
    }

    public n(o43.n nVar) {
        nVar.getClass();
        this.f135889b = nVar.f(new i(this), j.f135859a, new k(this));
    }

    public abstract Collection<n0> d();

    public n0 f() {
        return null;
    }

    public Collection<n0> g(boolean z14) {
        return p13.j0.f134944a;
    }

    public abstract t23.b1 h();

    @Override // p43.m1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final List<n0> b() {
        return this.f135889b.invoke().f135891b;
    }

    public List<n0> j(List<n0> list) {
        list.getClass();
        return list;
    }

    public void k(n0 n0Var) {
        n0Var.getClass();
    }
}
