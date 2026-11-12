package com.ximalaya.ting.android.opensdk.httputil.util;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes22.dex */
public class HMACSHA1 {
    private static final String ENCODING = "UTF-8";
    private static final String MAC_NAME = "HmacSHA1";

    public static byte[] HmacSHA1Encrypt(String str, String str2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("UTF-8"), MAC_NAME);
        Mac mac = Mac.getInstance(MAC_NAME);
        mac.init(secretKeySpec);
        return mac.doFinal(str.getBytes("UTF-8"));
    }
}
