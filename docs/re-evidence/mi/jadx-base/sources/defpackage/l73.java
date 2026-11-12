package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class l73 {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[bArr.length + bArr2.length + bArr3.length];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, bArr.length + bArr2.length, bArr3.length);
        return bArr4;
    }

    public static byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        byte[] bArr6 = new byte[bArr.length + bArr2.length + bArr3.length + bArr4.length + bArr5.length];
        System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr6, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr6, bArr.length + bArr2.length, bArr3.length);
        System.arraycopy(bArr4, 0, bArr6, bArr.length + bArr2.length + bArr3.length, bArr4.length);
        System.arraycopy(bArr5, 0, bArr6, bArr.length + bArr2.length + bArr3.length + bArr4.length, bArr5.length);
        return bArr6;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        byte[] bArr7 = new byte[bArr.length + bArr2.length + bArr3.length + bArr4.length + bArr5.length + bArr6.length];
        System.arraycopy(bArr, 0, bArr7, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr7, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr7, bArr.length + bArr2.length, bArr3.length);
        System.arraycopy(bArr4, 0, bArr7, bArr.length + bArr2.length + bArr3.length, bArr4.length);
        System.arraycopy(bArr5, 0, bArr7, bArr.length + bArr2.length + bArr3.length + bArr4.length, bArr5.length);
        System.arraycopy(bArr6, 0, bArr7, bArr.length + bArr2.length + bArr3.length + bArr4.length + bArr5.length, bArr6.length);
        return bArr7;
    }
}
