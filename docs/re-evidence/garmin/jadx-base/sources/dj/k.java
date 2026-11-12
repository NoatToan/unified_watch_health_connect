package dj;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes7.dex */
public class k extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f59836b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(ui.e.f171166a);

    @Override // ui.e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f59836b);
    }

    @Override // dj.f
    public final Bitmap c(xi.d dVar, Bitmap bitmap, int i14, int i15) {
        Paint paint = d0.f59815a;
        int iMin = Math.min(i14, i15);
        float f14 = iMin;
        float f15 = f14 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f14 / width, f14 / height);
        float f16 = width * fMax;
        float f17 = fMax * height;
        float f18 = (f14 - f16) / 2.0f;
        float f19 = (f14 - f17) / 2.0f;
        RectF rectF = new RectF(f18, f19, f16 + f18, f17 + f19);
        Bitmap bitmapC = d0.c(bitmap, dVar);
        Bitmap.Config config = Bitmap.Config.RGBA_F16;
        if (!config.equals(bitmap.getConfig())) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapE = dVar.e(iMin, iMin, config);
        bitmapE.setHasAlpha(true);
        Lock lock = d0.f59818d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapE);
            canvas.drawCircle(f15, f15, f15, d0.f59816b);
            canvas.drawBitmap(bitmapC, (Rect) null, rectF, d0.f59817c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapC.equals(bitmap)) {
                dVar.c(bitmapC);
            }
            return bitmapE;
        } catch (Throwable th3) {
            lock.unlock();
            throw th3;
        }
    }

    @Override // ui.e
    public final boolean equals(Object obj) {
        return obj instanceof k;
    }

    @Override // ui.e
    public final int hashCode() {
        return 1101716364;
    }
}
