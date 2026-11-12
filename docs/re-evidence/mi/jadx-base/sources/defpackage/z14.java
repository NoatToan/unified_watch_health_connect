package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes4.dex */
public class z14 extends t14 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w14<Bitmap> f40769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Bitmap f40770b;
    public final tfi c;
    public final int d;
    public final int e;

    public z14(Bitmap bitmap, frk<Bitmap> frkVar, tfi tfiVar, int i) {
        this(bitmap, frkVar, tfiVar, i, 0);
    }

    public static int m(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    public static int n(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    @Override // defpackage.u14
    public tfi a() {
        return this.c;
    }

    @Override // defpackage.u14
    public int b() {
        return jq2.e(this.f40770b);
    }

    @Override // defpackage.u14, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        w14<Bitmap> w14VarL = l();
        if (w14VarL != null) {
            w14VarL.close();
        }
    }

    @Override // defpackage.t14
    public Bitmap d() {
        return this.f40770b;
    }

    @Override // defpackage.p4d
    public int getHeight() {
        int i;
        return (this.d % 180 != 0 || (i = this.e) == 5 || i == 7) ? n(this.f40770b) : m(this.f40770b);
    }

    @Override // defpackage.p4d
    public int getWidth() {
        int i;
        return (this.d % 180 != 0 || (i = this.e) == 5 || i == 7) ? m(this.f40770b) : n(this.f40770b);
    }

    @Override // defpackage.u14
    public synchronized boolean isClosed() {
        return this.f40769a == null;
    }

    public final synchronized w14<Bitmap> l() {
        w14<Bitmap> w14Var;
        w14Var = this.f40769a;
        this.f40769a = null;
        this.f40770b = null;
        return w14Var;
    }

    public int o() {
        return this.e;
    }

    public int p() {
        return this.d;
    }

    public z14(Bitmap bitmap, frk<Bitmap> frkVar, tfi tfiVar, int i, int i2) {
        this.f40770b = (Bitmap) b6i.g(bitmap);
        this.f40769a = w14.K(this.f40770b, (frk) b6i.g(frkVar));
        this.c = tfiVar;
        this.d = i;
        this.e = i2;
    }

    public z14(w14<Bitmap> w14Var, tfi tfiVar, int i, int i2) {
        w14<Bitmap> w14Var2 = (w14) b6i.g(w14Var.c());
        this.f40769a = w14Var2;
        this.f40770b = w14Var2.n();
        this.c = tfiVar;
        this.d = i;
        this.e = i2;
    }
}
