package com.amap.api.col.p0003sl;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    lx f3080c;

    protected abstract boolean c();

    public lx() {
    }

    public lx(lx lxVar) {
        this.f3080c = lxVar;
    }

    public void a_(boolean z) {
        lx lxVar = this.f3080c;
        if (lxVar != null) {
            lxVar.a_(z);
        }
    }

    public int a() {
        lx lxVar = this.f3080c;
        return Math.min(Integer.MAX_VALUE, lxVar != null ? lxVar.a() : Integer.MAX_VALUE);
    }

    public void a_(int i) {
        lx lxVar = this.f3080c;
        if (lxVar != null) {
            lxVar.a_(i);
        }
    }

    public final boolean d() {
        lx lxVar = this.f3080c;
        if (lxVar == null || lxVar.d()) {
            return c();
        }
        return false;
    }
}
