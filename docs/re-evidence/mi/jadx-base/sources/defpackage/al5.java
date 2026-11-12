package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class al5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f1159a = "0123456789ABCDEF".toCharArray();

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static byte b(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    public static byte[] c(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (b(charArray[i2 + 1]) | (b(charArray[i2]) << 4));
        }
        return bArr;
    }
}
