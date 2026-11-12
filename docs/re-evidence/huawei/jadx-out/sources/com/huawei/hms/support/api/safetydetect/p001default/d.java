package com.huawei.hms.support.api.safetydetect.p001default;

import android.util.Base64;
import android.util.Log;

/* JADX INFO: loaded from: classes34.dex */
public class d {
    public static byte[] a(String str) {
        byte[] bArr = new byte[0];
        if (str == null) {
            return new byte[0];
        }
        try {
            return Base64.decode(str, 2);
        } catch (Exception e) {
            Log.e("Base64Util", "Base64 Decode failed, " + e.getMessage());
            return bArr;
        }
    }
}
