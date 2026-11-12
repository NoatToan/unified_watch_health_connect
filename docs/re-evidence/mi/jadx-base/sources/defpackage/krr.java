package defpackage;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class krr extends us3 {
    public krr(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    public static int[] n(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        us3.k(iArr3, iArr);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        us3.l(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }

    @Override // defpackage.us3
    public int[] d(int[] iArr, int i) {
        if (iArr.length != g() / 4) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        us3.k(iArr2, n(this.f36074a, iArr));
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    @Override // defpackage.us3
    public int g() {
        return 24;
    }
}
