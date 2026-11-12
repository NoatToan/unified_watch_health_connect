package defpackage;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class g6d {
    public static void a(ImageWriter imageWriter) {
        imageWriter.close();
    }

    public static Image b(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    public static ImageWriter c(Surface surface, @IntRange(from = 1) int i) {
        return ImageWriter.newInstance(surface, i);
    }

    public static void d(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }
}
