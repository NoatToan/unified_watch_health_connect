package defpackage;

import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes5.dex */
public class ts3 extends us3 {
    public ts3(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // defpackage.us3
    public int[] d(int[] iArr, int i) {
        if (iArr.length != g() / 4) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        us3.k(iArr2, this.f36074a);
        iArr2[12] = i;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }

    @Override // defpackage.us3
    public int g() {
        return 12;
    }
}
