package dj;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 implements ui.j<Bitmap, Bitmap> {

    public static final class a implements wi.u<Bitmap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bitmap f59821a;

        public a(Bitmap bitmap) {
            this.f59821a = bitmap;
        }

        @Override // wi.u
        public final Class<Bitmap> a() {
            return Bitmap.class;
        }

        @Override // wi.u
        public final void b() {
        }

        @Override // wi.u
        public final Bitmap get() {
            return this.f59821a;
        }

        @Override // wi.u
        public final int getSize() {
            return qj.m.c(this.f59821a);
        }
    }

    @Override // ui.j
    public final wi.u<Bitmap> a(Bitmap bitmap, int i14, int i15, ui.h hVar) {
        return new a(bitmap);
    }

    @Override // ui.j
    public final /* bridge */ /* synthetic */ boolean b(Bitmap bitmap, ui.h hVar) {
        return true;
    }
}
