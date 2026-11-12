package defpackage;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public class v0e {
    public static SecretKey a(SecretKey secretKey) {
        if (secretKey == null) {
            return null;
        }
        return new SecretKeySpec(secretKey.getEncoded(), "AES");
    }
}
