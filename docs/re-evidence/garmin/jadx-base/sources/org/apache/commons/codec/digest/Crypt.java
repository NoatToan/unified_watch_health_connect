package org.apache.commons.codec.digest;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public class Crypt {
    @Deprecated
    public Crypt() {
    }

    public static String crypt(byte[] bArr, String str) {
        if (str == null) {
            return Sha2Crypt.sha512Crypt(bArr);
        }
        if (str.startsWith("$6$")) {
            return Sha2Crypt.sha512Crypt(bArr, str);
        }
        if (str.startsWith("$5$")) {
            return Sha2Crypt.sha256Crypt(bArr, str);
        }
        return str.startsWith("$1$") ? Md5Crypt.md5Crypt(bArr, str) : UnixCrypt.crypt(bArr, str);
    }

    public static String crypt(byte[] bArr) {
        return crypt(bArr, (String) null);
    }

    public static String crypt(String str) {
        return crypt(str, (String) null);
    }

    public static String crypt(String str, String str2) {
        return crypt(str.getBytes(StandardCharsets.UTF_8), str2);
    }
}
