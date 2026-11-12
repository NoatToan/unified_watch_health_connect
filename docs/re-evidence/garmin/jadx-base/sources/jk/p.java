package jk;

/* JADX INFO: loaded from: classes7.dex */
public abstract class p extends ok.e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j.i f99180k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j.k f99181l;

    public p(j.k kVar) {
        this.f99181l = kVar;
    }

    @Override // ok.e
    public final void i() {
        this.f99180k = j.i.FAIL_EXECUTOR_CANCELLED_TASK;
        this.f99181l.a(j.h.NOT_CONNECTED, j.g.CONNECTION_LOST);
    }

    @Override // ok.e
    public final boolean j() {
        return true;
    }

    @Override // ok.e
    public void n() {
    }

    public abstract boolean s(j.h hVar);
}
