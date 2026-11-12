package cn.hutool.crypto.asymmetric;

import com.miuipub.internal.hybrid.SignUtils;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;

/* JADX INFO: loaded from: classes.dex */
public enum SignAlgorithm {
    NONEwithRSA("NONEwithRSA"),
    MD2withRSA("MD2withRSA"),
    MD5withRSA(SignUtils.SIGNATURE_MD5_WITH_RSA),
    SHA1withRSA(SignUtils.SIGNATURE_SHA1_WITH_RSA),
    SHA256withRSA("SHA256withRSA"),
    SHA384withRSA("SHA384withRSA"),
    SHA512withRSA("SHA512withRSA"),
    NONEwithDSA("NONEwithDSA"),
    SHA1withDSA("SHA1withDSA"),
    NONEwithECDSA("NONEwithECDSA"),
    SHA1withECDSA("SHA1withECDSA"),
    SHA256withECDSA(PluginPackageConstant.RN_BUNDLE_SIGNATURE_ALGORITHM),
    SHA384withECDSA("SHA384withECDSA"),
    SHA512withECDSA("SHA512withECDSA"),
    SHA256withRSA_PSS("SHA256WithRSA/PSS"),
    SHA384withRSA_PSS("SHA384WithRSA/PSS"),
    SHA512withRSA_PSS("SHA512WithRSA/PSS");

    private final String value;

    SignAlgorithm(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
