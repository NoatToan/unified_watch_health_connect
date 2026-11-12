package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public class hlo {
    public static String a(byte[] bArr) {
        String str = "";
        for (byte b2 : bArr) {
            str = str + Integer.toString((b2 & 255) + 256, 16).substring(1);
        }
        return str;
    }
}
