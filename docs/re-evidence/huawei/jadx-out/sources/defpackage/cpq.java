package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class cpq {
    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return "";
        }
        return cph.b((int) bArr[0]) + cph.b((int) bArr[1]);
    }
}
