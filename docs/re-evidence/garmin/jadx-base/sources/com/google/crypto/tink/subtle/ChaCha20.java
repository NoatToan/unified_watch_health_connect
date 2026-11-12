package com.google.crypto.tink.subtle;

import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes2.dex */
class ChaCha20 extends ChaCha20Base {
    public ChaCha20(byte[] bArr, int i14) {
        super(bArr, i14);
    }

    @Override // com.google.crypto.tink.subtle.ChaCha20Base
    public int[] createInitialState(int[] iArr, int i14) {
        if (iArr.length != nonceSizeInBytes() / 4) {
            e.s("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)});
            return null;
        }
        int[] iArr2 = new int[16];
        ChaCha20Base.setSigmaAndKey(iArr2, this.key);
        iArr2[12] = i14;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }

    @Override // com.google.crypto.tink.subtle.ChaCha20Base
    public int nonceSizeInBytes() {
        return 12;
    }
}
