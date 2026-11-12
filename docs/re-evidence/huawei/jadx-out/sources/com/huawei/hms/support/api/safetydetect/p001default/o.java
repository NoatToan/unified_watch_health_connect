package com.huawei.hms.support.api.safetydetect.p001default;

import android.util.Log;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;

/* JADX INFO: loaded from: classes34.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f16564a = "o";

    public static byte[] a(int i) {
        try {
            EncryptUtil.setBouncycastleFlag(true);
            return EncryptUtil.generateSecureRandom(i);
        } catch (Exception e) {
            Log.e(f16564a, "generateSecureRandom: exception : " + e.getMessage());
            return new byte[0];
        }
    }
}
