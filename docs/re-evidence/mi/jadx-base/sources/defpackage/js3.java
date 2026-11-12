package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes4.dex */
public class js3 extends iq2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f23082b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(pzd.f30934a);

    @Override // defpackage.pzd
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f23082b);
    }

    @Override // defpackage.iq2
    public Bitmap c(cq2 cq2Var, Bitmap bitmap, int i, int i2) {
        return oyp.c(cq2Var, bitmap, i, i2);
    }

    @Override // defpackage.pzd
    public boolean equals(Object obj) {
        return obj instanceof js3;
    }

    @Override // defpackage.pzd
    public int hashCode() {
        return -670243078;
    }
}
