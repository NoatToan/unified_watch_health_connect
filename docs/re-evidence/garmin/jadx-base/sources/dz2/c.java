package dz2;

import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes13.dex */
public class c {
    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "[None]";
        }
        StringBuffer stringBuffer = new StringBuffer("[ ");
        for (byte b14 : bArr) {
            stringBuffer.append(String.format("%02X", Byte.valueOf(b14)));
            stringBuffer.append(StringUtils.SPACE);
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
