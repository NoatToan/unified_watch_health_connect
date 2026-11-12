package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.SecurityRandomHelper;
import com.huawei.secure.android.common.encrypt.keystore.aes.AesGcmKS;

/* JADX INFO: loaded from: classes34.dex */
public class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f15585a = "KeyGen";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f15586b = "RestClient_8.0.1.320_apple";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f15587c = 16;

    public static String b(String str) {
        return AesGcmKS.encrypt(f15586b, str);
    }

    public static byte[] a() {
        return SecurityRandomHelper.getInstance().generateSecureRandom(16);
    }

    public static String a(String str) {
        return AesGcmKS.decrypt(f15586b, str);
    }
}
