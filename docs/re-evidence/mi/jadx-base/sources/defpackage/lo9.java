package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public class lo9 extends iq2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f25262b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(pzd.f30934a);

    @Override // defpackage.pzd
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f25262b);
    }

    @Override // defpackage.iq2
    public Bitmap c(cq2 cq2Var, Bitmap bitmap, int i, int i2) {
        return oyp.e(cq2Var, bitmap, i, i2);
    }

    @Override // defpackage.pzd
    public boolean equals(Object obj) {
        return obj instanceof lo9;
    }

    @Override // defpackage.pzd
    public int hashCode() {
        return 1572326941;
    }
}
