package com.huawei.hms.network.embedded;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes34.dex */
public final class mb extends hb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MessageDigest f15099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Mac f15100c;

    @Override // com.huawei.hms.network.embedded.hb, com.huawei.hms.network.embedded.zb
    public long read(bb bbVar, long j) throws IOException {
        long j2 = super.read(bbVar, j);
        if (j2 != -1) {
            long j3 = bbVar.f14653b;
            long j4 = j3 - j2;
            vb vbVar = bbVar.f14652a;
            while (j3 > j4) {
                vbVar = vbVar.g;
                j3 -= (long) (vbVar.f15548c - vbVar.f15547b);
            }
            while (j3 < bbVar.f14653b) {
                int i = (int) ((((long) vbVar.f15547b) + j4) - j3);
                MessageDigest messageDigest = this.f15099b;
                if (messageDigest != null) {
                    messageDigest.update(vbVar.f15546a, i, vbVar.f15548c - i);
                } else {
                    this.f15100c.update(vbVar.f15546a, i, vbVar.f15548c - i);
                }
                j4 = ((long) (vbVar.f15548c - vbVar.f15547b)) + j3;
                vbVar = vbVar.f;
                j3 = j4;
            }
        }
        return j2;
    }

    public final eb c() {
        MessageDigest messageDigest = this.f15099b;
        return eb.e(messageDigest != null ? messageDigest.digest() : this.f15100c.doFinal());
    }

    public static mb c(zb zbVar) {
        return new mb(zbVar, "SHA-256");
    }

    public static mb b(zb zbVar, eb ebVar) {
        return new mb(zbVar, ebVar, "HmacSHA256");
    }

    public static mb b(zb zbVar) {
        return new mb(zbVar, "SHA-1");
    }

    public static mb a(zb zbVar, eb ebVar) {
        return new mb(zbVar, ebVar, "HmacSHA1");
    }

    public static mb a(zb zbVar) {
        return new mb(zbVar, "MD5");
    }

    public mb(zb zbVar, String str) {
        super(zbVar);
        try {
            this.f15099b = MessageDigest.getInstance(str);
            this.f15100c = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public mb(zb zbVar, eb ebVar, String str) {
        super(zbVar);
        try {
            Mac mac = Mac.getInstance(str);
            this.f15100c = mac;
            mac.init(new SecretKeySpec(ebVar.m(), str));
            this.f15099b = null;
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }
}
