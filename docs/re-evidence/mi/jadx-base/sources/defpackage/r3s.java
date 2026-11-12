package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class r3s {
    public static byte[] a(List<byte[]> list) {
        if (list.size() <= 0) {
            return null;
        }
        if (list.size() <= 1) {
            return list.get(0);
        }
        byte[] bArrB = b(list.get(0), list.get(1));
        for (int i = 2; i < list.size(); i++) {
            bArrB = b(bArrB, list.get(i));
        }
        return bArrB;
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }
}
