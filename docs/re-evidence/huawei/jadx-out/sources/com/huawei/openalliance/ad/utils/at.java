package com.huawei.openalliance.ad.utils;

import com.huawei.openalliance.ad.hw;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes12.dex */
public abstract class at {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20427a = "at";

    public static String a(String str, String str2) {
        String str3;
        String str4;
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str.getBytes("UTF-8"), "HmacSHA256"));
            return ar.a(mac.doFinal(str2.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException unused) {
            str3 = f20427a;
            str4 = "fail to cipher UnsupportedEncodingException";
            hw.d(str3, str4);
            return null;
        } catch (InvalidKeyException unused2) {
            str3 = f20427a;
            str4 = "fail to cipher InvalidKeyException";
            hw.d(str3, str4);
            return null;
        } catch (NoSuchAlgorithmException unused3) {
            str3 = f20427a;
            str4 = "fail to cipher NoSuchAlgorithmException";
            hw.d(str3, str4);
            return null;
        }
    }
}
