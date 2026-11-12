package defpackage;

import com.alipay.sdk.m.o0.b;
import com.google.common.base.Ascii;
import com.huawei.hms.network.okhttp.PublicSuffixDatabase;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okio.Utf8;

/* JADX INFO: loaded from: classes4.dex */
public class ne {
    public static String a(String str) {
        byte[] bArrE;
        try {
            bArrE = e(b(), str.getBytes());
        } catch (Exception unused) {
            bArrE = null;
        }
        if (bArrE != null) {
            return c(bArrE);
        }
        return null;
    }

    public static String d(String str) {
        try {
            return new String(d(b(), c(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(e()));
        return cipher.doFinal(bArr2);
    }

    public static byte[] c(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }

    public static byte[] b() throws Exception {
        return nc.b(new byte[]{PublicSuffixDatabase.i, 83, -50, -89, -84, -114, 80, 99, 10, Utf8.REPLACEMENT_BYTE, Ascii.SYN, -65, -11, Ascii.RS, 101, -118});
    }

    public static byte[] e() {
        try {
            byte[] bArrE = b.e("IUQSvE6r1TfFPdPEjfklLw==".getBytes("UTF-8"), 2);
            if (bArrE != null) {
                return nc.b(bArrE);
            }
        } catch (Exception unused) {
        }
        return new byte[16];
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(e()));
        return cipher.doFinal(bArr2);
    }

    public static String c(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b2 : bArr) {
            e(stringBuffer, b2);
        }
        return stringBuffer.toString();
    }

    public static void e(StringBuffer stringBuffer, byte b2) {
        stringBuffer.append("0123456789ABCDEF".charAt((b2 >> 4) & 15)).append("0123456789ABCDEF".charAt(b2 & 15));
    }
}
