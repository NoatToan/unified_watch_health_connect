package com.huawei.wisesecurity.ucs.credential.entity;

/* JADX INFO: loaded from: classes20.dex */
public enum UcsKeyStoreProvider {
    ANDROID_KEYSTORE("AndroidKeyStore"),
    HUAWEI_KEYSTORE("HwKeystore");

    private final String name;

    public String getName() {
        return this.name;
    }

    UcsKeyStoreProvider(String str) {
        this.name = str;
    }
}
