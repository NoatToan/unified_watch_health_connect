package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public class oqk implements tqk<Uri, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vqk f29394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cq2 f29395b;

    public oqk(vqk vqkVar, cq2 cq2Var) {
        this.f29394a = vqkVar;
        this.f29395b = cq2Var;
    }

    @Override // defpackage.tqk
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public kqk<Bitmap> b(Uri uri, int i, int i2, cch cchVar) {
        kqk<Drawable> kqkVarB = this.f29394a.b(uri, i, i2, cchVar);
        if (kqkVarB == null) {
            return null;
        }
        return r47.a(this.f29395b, kqkVarB.get(), i, i2);
    }

    @Override // defpackage.tqk
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri, cch cchVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
