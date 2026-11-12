package dj;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class f implements ui.l<Bitmap> {
    @Override // ui.l
    public final wi.u<Bitmap> a(Context context, wi.u<Bitmap> uVar, int i14, int i15) {
        if (!qj.m.i(i14, i15)) {
            vb.h.s(am.j.g(i14, i15, "Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
            return null;
        }
        xi.d dVar = com.bumptech.glide.b.b(context).f28454b;
        Bitmap bitmap = uVar.get();
        if (i14 == Integer.MIN_VALUE) {
            i14 = bitmap.getWidth();
        }
        if (i15 == Integer.MIN_VALUE) {
            i15 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(dVar, bitmap, i14, i15);
        return bitmap.equals(bitmapC) ? uVar : e.c(bitmapC, dVar);
    }

    public abstract Bitmap c(xi.d dVar, Bitmap bitmap, int i14, int i15);
}
