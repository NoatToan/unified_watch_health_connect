package dj;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes7.dex */
public class q extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f59863b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(ui.e.f171166a);

    @Override // ui.e
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f59863b);
    }

    @Override // dj.f
    public final Bitmap c(xi.d dVar, Bitmap bitmap, int i14, int i15) {
        return d0.b(dVar, bitmap, i14, i15);
    }

    @Override // ui.e
    public final boolean equals(Object obj) {
        return obj instanceof q;
    }

    @Override // ui.e
    public final int hashCode() {
        return 1572326941;
    }
}
