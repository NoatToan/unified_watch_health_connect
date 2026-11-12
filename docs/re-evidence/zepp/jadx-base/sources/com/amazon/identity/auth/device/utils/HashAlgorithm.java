package com.amazon.identity.auth.device.utils;

import com.huami.identity.auth.alexa.ConstantsKt;

/* JADX INFO: loaded from: classes2.dex */
public enum HashAlgorithm {
    MD5("MD5"),
    SHA_256(ConstantsKt.ALGORITHM_SHA_256);

    private String algorithmName;

    HashAlgorithm(String str) {
        this.algorithmName = str;
    }

    public String getAlgorithmName() {
        return this.algorithmName;
    }
}
