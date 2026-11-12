package defpackage;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class f6d {
    public static void a(ImageWriter imageWriter) {
        g6d.a(imageWriter);
    }

    public static Image b(ImageWriter imageWriter) {
        return g6d.b(imageWriter);
    }

    public static ImageWriter c(Surface surface, @IntRange(from = 1) int i) {
        return g6d.c(surface, i);
    }

    public static ImageWriter d(Surface surface, @IntRange(from = 1) int i, int i2) {
        return Build.VERSION.SDK_INT >= 29 ? i6d.a(surface, i, i2) : h6d.a(surface, i, i2);
    }

    public static void e(ImageWriter imageWriter, Image image) {
        g6d.d(imageWriter, image);
    }
}
