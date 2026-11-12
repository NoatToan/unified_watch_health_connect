package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;

/* JADX INFO: loaded from: classes11.dex */
public class mtx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final BitSet f42411b = new BitSet(256);

    static {
        for (int i = 33; i <= 60; i++) {
            f42411b.set(i);
        }
        for (int i2 = 62; i2 <= 126; i2++) {
            f42411b.set(i2);
        }
        BitSet bitSet = f42411b;
        bitSet.set(9);
        bitSet.set(32);
    }

    public static String b(String str) {
        if (str == null) {
            LogUtil.a("ContactSync", 1, "QuotedPrintableCodec", "the parameter 'enCodeStr' is null in encode(String,String)");
            return "";
        }
        try {
            return b(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            LogUtil.j("ContactSync", 1, "QuotedPrintableCodec", e.getMessage());
            return "";
        }
    }

    public static String b(String str, String str2) throws UnsupportedEncodingException {
        if (str == null) {
            LogUtil.j("ContactSync", 1, "QuotedPrintableCodec", "the parameter 'encodeString' is null in encode(String,String)");
            return "";
        }
        return new String(d(str.getBytes(str2)), StandardCharsets.US_ASCII);
    }

    public static byte[] d(byte[] bArr) {
        return b(f42411b, bArr);
    }

    public static byte[] b(BitSet bitSet, byte[] bArr) {
        if (bArr == null) {
            LogUtil.j("ContactSync", 1, "QuotedPrintableCodec", "encodeQuotedPrintable: bytes is null.");
            return new byte[0];
        }
        if (bitSet == null) {
            bitSet = f42411b;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            byte b2 = bArr[i];
            int i2 = b2 < 0 ? b2 + 256 : b2;
            if (bitSet.get(i2)) {
                byteArrayOutputStream.write(i2);
            } else {
                byteArrayOutputStream.write(61);
                char upperCase = Character.toUpperCase(Character.forDigit((b2 >> 4) & 15, 16));
                char upperCase2 = Character.toUpperCase(Character.forDigit(b2 & 15, 16));
                byteArrayOutputStream.write(upperCase);
                byteArrayOutputStream.write(upperCase2);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
}
