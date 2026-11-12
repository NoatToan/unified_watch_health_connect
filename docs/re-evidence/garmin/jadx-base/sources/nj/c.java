package nj;

import android.graphics.drawable.Drawable;
import mj.j;
import qj.m;
import tn.k;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c<T> implements h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f126221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f126222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mj.d f126223c;

    public c(int i14, int i15) {
        if (!m.i(i14, i15)) {
            vb.h.s(k.e(i14, i15, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", " and height: "));
            throw null;
        }
        this.f126221a = i14;
        this.f126222b = i15;
    }

    @Override // nj.h
    public final void b(j jVar) throws Throwable {
        jVar.c(this.f126221a, this.f126222b);
    }

    @Override // nj.h
    public void c(Drawable drawable) {
    }

    @Override // nj.h
    public final void e(j jVar) {
    }

    @Override // nj.h
    public final mj.d getRequest() {
        return this.f126223c;
    }

    @Override // nj.h
    public final void h(Drawable drawable) {
    }

    @Override // nj.h
    public final void i(mj.d dVar) {
        this.f126223c = dVar;
    }

    @Override // jj.m
    public final void onDestroy() {
    }

    @Override // jj.m
    public final void onStart() {
    }

    @Override // jj.m
    public final void onStop() {
    }

    public c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
