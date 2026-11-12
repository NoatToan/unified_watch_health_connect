package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iq2 implements lyp<Bitmap> {
    @Override // defpackage.lyp
    public final kqk<Bitmap> b(Context context, kqk<Bitmap> kqkVar, int i, int i2) {
        if (!ulq.u(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        cq2 cq2VarG = a.d(context).g();
        Bitmap bitmap = kqkVar.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(cq2VarG, bitmap, i, i2);
        return bitmap.equals(bitmapC) ? kqkVar : gq2.c(bitmapC, cq2VarG);
    }

    public abstract Bitmap c(cq2 cq2Var, Bitmap bitmap, int i, int i2);
}
