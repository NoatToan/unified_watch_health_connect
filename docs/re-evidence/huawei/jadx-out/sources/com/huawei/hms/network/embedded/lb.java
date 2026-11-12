package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes34.dex */
public final class lb extends gb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final MessageDigest f15068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Mac f15069c;

    @Override // com.huawei.hms.network.embedded.gb, com.huawei.hms.network.embedded.yb
    public void write(bb bbVar, long j) throws IOException {
        cc.a(bbVar.f14653b, 0L, j);
        vb vbVar = bbVar.f14652a;
        long j2 = 0;
        while (j2 < j) {
            int iMin = (int) Math.min(j - j2, vbVar.f15548c - vbVar.f15547b);
            MessageDigest messageDigest = this.f15068b;
            if (messageDigest != null) {
                messageDigest.update(vbVar.f15546a, vbVar.f15547b, iMin);
            } else {
                this.f15069c.update(vbVar.f15546a, vbVar.f15547b, iMin);
            }
            j2 += (long) iMin;
            vbVar = vbVar.f;
        }
        super.write(bbVar, j);
    }

    public final eb f() {
        MessageDigest messageDigest = this.f15068b;
        return eb.e(messageDigest != null ? messageDigest.digest() : this.f15069c.doFinal());
    }

    public static lb d(yb ybVar) {
        return new lb(ybVar, "SHA-512");
    }

    public static lb c(yb ybVar, eb ebVar) {
        return new lb(ybVar, ebVar, "HmacSHA512");
    }

    public static lb c(yb ybVar) {
        return new lb(ybVar, "SHA-256");
    }

    public static lb b(yb ybVar, eb ebVar) {
        return new lb(ybVar, ebVar, "HmacSHA256");
    }

    public static lb b(yb ybVar) {
        return new lb(ybVar, "SHA-1");
    }

    public static lb a(yb ybVar, eb ebVar) {
        return new lb(ybVar, ebVar, "HmacSHA1");
    }

    public static lb a(yb ybVar) {
        return new lb(ybVar, "MD5");
    }

    public lb(yb ybVar, String str) {
        super(ybVar);
        try {
            this.f15068b = MessageDigest.getInstance(str);
            this.f15069c = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public lb(yb ybVar, eb ebVar, String str) {
        super(ybVar);
        try {
            Mac mac = Mac.getInstance(str);
            this.f15069c = mac;
            mac.init(new SecretKeySpec(ebVar.m(), str));
            this.f15068b = null;
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }
}
