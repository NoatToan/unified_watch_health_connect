package defpackage;

import com.amap.api.col.p0003sl.bb;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ags implements qgs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bb f1004b;

    public ags(int i, bb bbVar) {
        this.f1003a = i;
        this.f1004b = bbVar;
    }

    public void a() {
        d();
        getClass().toString();
    }

    public void b(int i) {
        d();
        getClass().toString();
    }

    public final boolean c(ags agsVar) {
        return agsVar.d() == d();
    }

    public final int d() {
        return this.f1003a;
    }

    public final void e(ags agsVar) {
        d();
        agsVar.d();
        getClass().toString();
        agsVar.getClass().toString();
    }

    public void f() {
        d();
        getClass().toString();
    }

    public void g() {
        d();
        getClass().toString();
    }

    public void i() {
        d();
        getClass().toString();
    }

    public void j() {
        d();
        getClass().toString();
    }

    public void k() {
        d();
        getClass().toString();
    }
}
