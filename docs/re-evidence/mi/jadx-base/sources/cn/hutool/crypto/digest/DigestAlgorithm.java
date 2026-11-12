package cn.hutool.crypto.digest;

import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;

/* JADX INFO: loaded from: classes.dex */
public enum DigestAlgorithm {
    MD2("MD2"),
    MD5(Coder.KEY_MD5),
    SHA1("SHA-1"),
    SHA256(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM),
    SHA384("SHA-384"),
    SHA512("SHA-512");

    private final String value;

    DigestAlgorithm(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
