package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
public final class j47 implements grk<Drawable, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cq2 f22399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final grk<Bitmap, byte[]> f22400b;
    public final grk<kza, byte[]> c;

    public j47(cq2 cq2Var, grk<Bitmap, byte[]> grkVar, grk<kza, byte[]> grkVar2) {
        this.f22399a = cq2Var;
        this.f22400b = grkVar;
        this.c = grkVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static kqk<kza> b(kqk<Drawable> kqkVar) {
        return kqkVar;
    }

    @Override // defpackage.grk
    public kqk<byte[]> a(kqk<Drawable> kqkVar, cch cchVar) {
        Drawable drawable = kqkVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f22400b.a(gq2.c(((BitmapDrawable) drawable).getBitmap(), this.f22399a), cchVar);
        }
        if (drawable instanceof kza) {
            return this.c.a(b(kqkVar), cchVar);
        }
        return null;
    }
}
