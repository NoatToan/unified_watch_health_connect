package dj;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public class i extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f59834b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(ui.e.f171166a);

    @Override // ui.e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f59834b);
    }

    @Override // dj.f
    public final Bitmap c(xi.d dVar, Bitmap bitmap, int i14, int i15) {
        float width;
        float height;
        Paint paint = d0.f59815a;
        if (bitmap.getWidth() == i14 && bitmap.getHeight() == i15) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i15 > bitmap.getHeight() * i14) {
            width = i15 / bitmap.getHeight();
            width2 = (i14 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i14 / bitmap.getWidth();
            height = (i15 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapE = dVar.e(i14, i15, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapE.setHasAlpha(bitmap.hasAlpha());
        d0.a(bitmap, bitmapE, matrix);
        return bitmapE;
    }

    @Override // ui.e
    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // ui.e
    public final int hashCode() {
        return -599754482;
    }
}
