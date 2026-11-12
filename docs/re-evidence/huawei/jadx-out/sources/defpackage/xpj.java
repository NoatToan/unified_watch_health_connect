package defpackage;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes20.dex */
public class xpj {
    public static SecureRandom e() {
        try {
            return SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException unused) {
            xnd.b("SecureCommonUtil", "can't get strong secureRandom", false);
            try {
                return SecureRandom.getInstance("SHA1PRNG");
            } catch (NoSuchAlgorithmException unused2) {
                xnd.b("SecureCommonUtil", "can't get SHA1PRNG secureRandom", false);
                return new SecureRandom();
            }
        }
    }
}
