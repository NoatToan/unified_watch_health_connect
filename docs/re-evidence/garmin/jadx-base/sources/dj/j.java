package dj;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public class j extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f59835b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(ui.e.f171166a);

    @Override // ui.e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f59835b);
    }

    @Override // dj.f
    public final Bitmap c(xi.d dVar, Bitmap bitmap, int i14, int i15) {
        Paint paint = d0.f59815a;
        return (bitmap.getWidth() > i14 || bitmap.getHeight() > i15) ? d0.b(dVar, bitmap, i14, i15) : bitmap;
    }

    @Override // ui.e
    public final boolean equals(Object obj) {
        return obj instanceof j;
    }

    @Override // ui.e
    public final int hashCode() {
        return -670243078;
    }
}
