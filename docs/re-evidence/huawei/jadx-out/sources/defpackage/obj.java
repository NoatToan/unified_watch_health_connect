package defpackage;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes12.dex */
public class obj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f44050b = "MultiSimUtils";

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append(String.format("%02X ", Integer.valueOf(b2 & 255)));
        }
        return sb.toString();
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(bArr2, "HmacSHA1"));
            byte[] bArrDoFinal = mac.doFinal(bArr);
            ocq.e(f44050b, "byteHMAC.length = " + bArrDoFinal.length);
            return bArrDoFinal;
        } catch (InvalidKeyException unused) {
            ocq.e(f44050b, "InvalidKeyException");
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            ocq.e(f44050b, "NoSuchAlgorithmException");
            return null;
        }
    }
}
