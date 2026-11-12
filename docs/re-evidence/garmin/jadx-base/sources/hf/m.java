package hf;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes7.dex */
public final class m {
    public static final Drawable a(h hVar, Resources resources) {
        if (hVar instanceof d) {
            return ((d) hVar).f83553a;
        }
        return hVar instanceof a ? new BitmapDrawable(resources, ((a) hVar).f83537a) : new i(hVar);
    }

    public static final h b(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? c(((BitmapDrawable) drawable).getBitmap()) : new d(drawable, false);
    }

    public static a c(Bitmap bitmap) {
        return new a(bitmap, true);
    }

    public static Bitmap d(h hVar) {
        int width = hVar.getWidth();
        int height = hVar.getHeight();
        boolean z14 = hVar instanceof a;
        Bitmap.Config config = z14 ? ((a) hVar).f83537a.getConfig() : null;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (z14) {
            Bitmap bitmap = ((a) hVar).f83537a;
            if (bitmap.getWidth() == width && bitmap.getHeight() == height && bitmap.getConfig() == config) {
                return bitmap;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        hVar.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }
}
