package defpackage;

import java.security.PrivateKey;
import java.security.interfaces.RSAPrivateKey;

/* JADX INFO: loaded from: classes6.dex */
public class i9j {
    public static int a(PrivateKey privateKey) {
        if (!(privateKey instanceof RSAPrivateKey)) {
            return -1;
        }
        try {
            return ((RSAPrivateKey) privateKey).getModulus().bitLength();
        } catch (Exception unused) {
            return -1;
        }
    }
}
