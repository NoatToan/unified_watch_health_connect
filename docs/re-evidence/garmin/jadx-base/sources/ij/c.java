package ij;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ui.h;
import wi.u;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements e<Drawable, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi.d f93799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e<Bitmap, byte[]> f93800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e<hj.c, byte[]> f93801c;

    public c(xi.d dVar, e<Bitmap, byte[]> eVar, e<hj.c, byte[]> eVar2) {
        this.f93799a = dVar;
        this.f93800b = eVar;
        this.f93801c = eVar2;
    }

    @Override // ij.e
    public final u<byte[]> a(u<Drawable> uVar, h hVar) {
        Drawable drawable = uVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f93800b.a(dj.e.c(((BitmapDrawable) drawable).getBitmap(), this.f93799a), hVar);
        }
        if (drawable instanceof hj.c) {
            return this.f93801c.a(uVar, hVar);
        }
        return null;
    }
}
