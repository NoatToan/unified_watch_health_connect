package defpackage;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public class ucb {
    public static byte[] a(byte[] bArr, byte[] bArr2) throws Exception {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        return mac.doFinal(bArr2);
    }
}
