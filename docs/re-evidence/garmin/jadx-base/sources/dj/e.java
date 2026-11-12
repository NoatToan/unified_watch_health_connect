package dj;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes7.dex */
public class e implements wi.u<Bitmap>, wi.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f59819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi.d f59820b;

    public e(Bitmap bitmap, xi.d dVar) {
        qj.l.c(bitmap, "Bitmap must not be null");
        this.f59819a = bitmap;
        qj.l.c(dVar, "BitmapPool must not be null");
        this.f59820b = dVar;
    }

    public static e c(Bitmap bitmap, xi.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, dVar);
    }

    @Override // wi.u
    public final Class<Bitmap> a() {
        return Bitmap.class;
    }

    @Override // wi.u
    public final void b() {
        this.f59820b.c(this.f59819a);
    }

    @Override // wi.u
    public final Bitmap get() {
        return this.f59819a;
    }

    @Override // wi.u
    public final int getSize() {
        return qj.m.c(this.f59819a);
    }

    @Override // wi.q
    public final void initialize() {
        this.f59819a.prepareToDraw();
    }
}
