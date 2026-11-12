package defpackage;

/* JADX INFO: loaded from: classes41.dex */
public final class peg {
    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(128);
        if (bArr != null) {
            for (byte b2 : bArr) {
                int i = b2 & 255;
                if (i < 16) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(i));
            }
        }
        return sb.toString();
    }
}
