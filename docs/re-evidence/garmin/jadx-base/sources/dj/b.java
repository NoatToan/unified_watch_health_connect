package dj;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
public class b implements ui.k<BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi.d f59804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ui.k<Bitmap> f59805b;

    public b(xi.d dVar, ui.k<Bitmap> kVar) {
        this.f59804a = dVar;
        this.f59805b = kVar;
    }

    @Override // ui.k
    public final ui.c a(ui.h hVar) {
        return this.f59805b.a(hVar);
    }

    @Override // ui.d
    public final boolean b(Object obj, File file, ui.h hVar) {
        return this.f59805b.b(new e(((BitmapDrawable) ((wi.u) obj).get()).getBitmap(), this.f59804a), file, hVar);
    }
}
