package cn.hutool.crypto.digest;

import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;

/* JADX INFO: loaded from: classes.dex */
public enum HmacAlgorithm {
    HmacMD5(Coder.KEY_MAC),
    HmacSHA1("HmacSHA1"),
    HmacSHA256("HmacSHA256"),
    HmacSHA384("HmacSHA384"),
    HmacSHA512("HmacSHA512"),
    HmacSM3("HmacSM3");

    private final String value;

    HmacAlgorithm(String str) {
        this.value = str;
    }

    public String getValue() {
        return this.value;
    }
}
