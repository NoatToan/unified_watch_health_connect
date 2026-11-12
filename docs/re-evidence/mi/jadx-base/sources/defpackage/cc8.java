package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class cc8 {
    public static byte[] a(zb8 zb8Var, int i) {
        byte[] bArr = new byte[i];
        if (i * 8 <= zb8Var.b()) {
            System.arraycopy(zb8Var.a(), 0, bArr, 0, i);
        } else {
            int iB = zb8Var.b() / 8;
            for (int i2 = 0; i2 < i; i2 += iB) {
                byte[] bArrA = zb8Var.a();
                int i3 = i - i2;
                if (bArrA.length <= i3) {
                    System.arraycopy(bArrA, 0, bArr, i2, bArrA.length);
                } else {
                    System.arraycopy(bArrA, 0, bArr, i2, i3);
                }
            }
        }
        return bArr;
    }
}
