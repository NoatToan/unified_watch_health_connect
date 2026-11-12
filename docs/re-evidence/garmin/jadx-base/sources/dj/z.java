package dj;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: loaded from: classes7.dex */
public class z implements ui.j<Uri, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fj.e f59893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi.d f59894b;

    public z(fj.e eVar, xi.d dVar) {
        this.f59893a = eVar;
        this.f59894b = dVar;
    }

    @Override // ui.j
    public final wi.u<Bitmap> a(Uri uri, int i14, int i15, ui.h hVar) {
        wi.u uVarC = this.f59893a.c(uri, hVar);
        if (uVarC == null) {
            return null;
        }
        return n.a(this.f59894b, (Drawable) ((fj.c) uVarC).get(), i14, i15);
    }

    @Override // ui.j
    public final boolean b(Uri uri, ui.h hVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
