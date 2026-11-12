package com.google.crypto.tink.subtle;

/* JADX INFO: loaded from: classes2.dex */
public final class ImmutableByteArray {
    private final byte[] data;

    private ImmutableByteArray(byte[] bArr, int i14, int i15) {
        byte[] bArr2 = new byte[i15];
        this.data = bArr2;
        System.arraycopy(bArr, i14, bArr2, 0, i15);
    }

    public static ImmutableByteArray of(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return of(bArr, 0, bArr.length);
    }

    public byte[] getBytes() {
        byte[] bArr = this.data;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public int getLength() {
        return this.data.length;
    }

    public static ImmutableByteArray of(byte[] bArr, int i14, int i15) {
        return new ImmutableByteArray(bArr, i14, i15);
    }
}
