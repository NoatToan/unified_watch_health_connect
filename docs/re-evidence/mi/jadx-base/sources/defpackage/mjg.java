package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public class mjg {
    public static void a(byte[] bArr) {
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b2 = bArr[i];
            bArr[i] = bArr[(bArr.length - i) - 1];
            bArr[(bArr.length - i) - 1] = b2;
        }
    }
}
