package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class kbt {
    public static String a(byte[] bArr, String str) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i] & 255);
            if (hexString.length() < 2) {
                sb.append("0");
            }
            sb.append(hexString);
            if (str.length() > 0 && i < bArr.length - 1) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static byte[] b(long j) {
        byte[] bArr = new byte[6];
        for (int i = 0; i < 6; i++) {
            bArr[i] = (byte) ((j >> ((5 - i) * 8)) & 255);
        }
        return bArr;
    }
}
