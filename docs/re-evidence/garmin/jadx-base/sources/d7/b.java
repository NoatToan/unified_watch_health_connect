package d7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final Bitmap a(Drawable drawable, int i14, int i15, Bitmap.Config config) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                h.s("bitmap is null");
                return null;
            }
            if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                return (i14 == bitmapDrawable.getBitmap().getWidth() && i15 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i14, i15, true);
            }
        }
        Rect bounds = drawable.getBounds();
        int i16 = bounds.left;
        int i17 = bounds.top;
        int i18 = bounds.right;
        int i19 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i14, i15, config);
        drawable.setBounds(0, 0, i14, i15);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(i16, i17, i18, i19);
        return bitmapCreateBitmap;
    }

    public static /* synthetic */ Bitmap b(Drawable drawable, int i14, int i15, int i16) {
        if ((i16 & 1) != 0) {
            i14 = drawable.getIntrinsicWidth();
        }
        if ((i16 & 2) != 0) {
            i15 = drawable.getIntrinsicHeight();
        }
        return a(drawable, i14, i15, null);
    }

    public static Bitmap c(Drawable drawable, int i14, int i15) {
        if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() == null) {
            return null;
        }
        return a(drawable, i14, i15, null);
    }
}
