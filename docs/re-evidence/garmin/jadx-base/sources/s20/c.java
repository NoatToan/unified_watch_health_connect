package s20;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public static Bitmap a(Context context, Bitmap bitmap) {
        bitmap.getClass();
        int iE = fb2.g.e(48, context);
        int iMax = Math.max(bitmap.getWidth(), iE);
        int iMax2 = Math.max(bitmap.getHeight(), iE);
        if (iMax == bitmap.getWidth() && iMax2 == bitmap.getHeight()) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, (iMax - bitmap.getWidth()) / 2.0f, (iMax2 - bitmap.getHeight()) / 2.0f, (Paint) null);
        return bitmapCreateBitmap;
    }
}
