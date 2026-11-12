package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class hj2 {
    public static String a(byte[] bArr) {
        if (bArr.length == 0) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < bArr.length; i++) {
            String string = Long.toString(bArr[i] & 255, 2);
            if (string.length() < 8) {
                StringBuilder sb = new StringBuilder();
                for (int i2 = 8; i2 > string.length(); i2--) {
                    sb.append("0");
                }
                stringBuffer.append(((Object) sb) + string + ",");
            } else {
                stringBuffer.append(Long.toString(bArr[i] & 255, 2) + ",");
            }
        }
        return stringBuffer.toString().substring(0, stringBuffer.length() - 1);
    }
}
