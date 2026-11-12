package cn.hutool.crypto.asymmetric;

import com.miuipub.internal.hybrid.SignUtils;

/* JADX INFO: loaded from: classes.dex */
public enum AsymmetricAlgorithm {
    RSA(SignUtils.KEY_RSA),
    RSA_ECB_PKCS1(SignUtils.CIPHER_RSA),
    RSA_ECB("RSA/ECB/NoPadding"),
    RSA_None("RSA/None/NoPadding");

    private final String value;

    AsymmetricAlgorithm(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
