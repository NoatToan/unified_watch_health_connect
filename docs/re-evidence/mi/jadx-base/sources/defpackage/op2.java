package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes4.dex */
public class op2 implements grk<Bitmap, BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f29354a;

    public op2(Resources resources) {
        this.f29354a = (Resources) a6i.d(resources);
    }

    @Override // defpackage.grk
    public kqk<BitmapDrawable> a(kqk<Bitmap> kqkVar, cch cchVar) {
        return gee.c(this.f29354a, kqkVar);
    }
}
