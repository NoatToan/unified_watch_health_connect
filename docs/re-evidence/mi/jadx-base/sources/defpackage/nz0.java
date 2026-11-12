package defpackage;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
public final class nz0 {
    public static String a(byte[] bArr, int i) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec("3e4f2550-0818-4665-9bfb-edbe9b15f586".getBytes(), "HMACSHA256");
            Mac mac = Mac.getInstance("HMACSHA256");
            mac.init(secretKeySpec);
            for (int i2 = 0; i2 < i; i2++) {
                mac.update(bArr);
                bArr = mac.doFinal();
            }
            return x12.c(bArr);
        } catch (Exception e) {
            ycm.a("Error: " + e.getMessage());
            return "";
        }
    }

    public static String b(byte[] bArr, int i) {
        return a(bArr, i);
    }
}
