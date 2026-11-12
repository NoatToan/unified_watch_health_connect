package defpackage;

import android.media.ImageWriter;
import android.view.Surface;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class i6d {
    public static ImageWriter a(Surface surface, @IntRange(from = 1) int i, int i2) {
        return ImageWriter.newInstance(surface, i, i2);
    }
}
