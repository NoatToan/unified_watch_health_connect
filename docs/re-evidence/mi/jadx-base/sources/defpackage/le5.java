package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class le5<T> implements e0p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24965b;
    public zmk c;

    public le5() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // defpackage.e0p
    public final void c(zem zemVar) {
    }

    @Override // defpackage.e0p
    public final void d(zem zemVar) {
        zemVar.d(this.f24964a, this.f24965b);
    }

    @Override // defpackage.e0p
    public void e(Drawable drawable) {
    }

    @Override // defpackage.e0p
    public final void f(zmk zmkVar) {
        this.c = zmkVar;
    }

    @Override // defpackage.e0p
    public void g(Drawable drawable) {
    }

    @Override // defpackage.e0p
    public final zmk getRequest() {
        return this.c;
    }

    @Override // defpackage.mfe
    public void onDestroy() {
    }

    @Override // defpackage.mfe
    public void onStart() {
    }

    @Override // defpackage.mfe
    public void onStop() {
    }

    public le5(int i, int i2) {
        if (ulq.u(i, i2)) {
            this.f24964a = i;
            this.f24965b = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }
}
