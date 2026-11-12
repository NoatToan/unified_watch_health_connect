package com.huawei.agconnect.common.api;

import com.huawei.secure.android.common.encrypt.hash.SHA;

/* JADX INFO: loaded from: classes22.dex */
public class SHAWrapper {
    public static String sha256Encrypt(String str) {
        return SHA.sha256Encrypt(str);
    }
}
