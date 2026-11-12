package ch.qos.logback.core.encoder;

import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes7.dex */
public class ByteArrayUtil {
    public static byte[] hexStringToByteArray(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = i14 * 2;
            bArr[i14] = (byte) (Integer.parseInt(str.substring(i15, i15 + 2), 16) & 255);
        }
        return bArr;
    }

    public static int readInt(byte[] bArr, int i14) {
        int i15 = 0;
        for (int i16 = 0; i16 < 4; i16++) {
            i15 += (bArr[i14 + i16] & 255) << (24 - (i16 * 8));
        }
        return i15;
    }

    public static String toHexString(byte[] bArr) {
        StringBuilder sb3 = new StringBuilder();
        for (byte b14 : bArr) {
            String hexString = Integer.toHexString(b14 & UnsignedBytes.MAX_VALUE);
            if (hexString.length() == 1) {
                sb3.append('0');
            }
            sb3.append(hexString);
        }
        return sb3.toString();
    }

    public static void writeInt(byte[] bArr, int i14, int i15) {
        for (int i16 = 0; i16 < 4; i16++) {
            bArr[i14 + i16] = (byte) (i15 >>> (24 - (i16 * 8)));
        }
    }

    public static void writeInt(ByteArrayOutputStream byteArrayOutputStream, int i14) {
        for (int i15 = 0; i15 < 4; i15++) {
            byteArrayOutputStream.write((byte) (i14 >>> (24 - (i15 * 8))));
        }
    }
}
