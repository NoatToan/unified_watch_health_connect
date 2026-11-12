package com.tsmclient.smartcard;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class ByteArray {
    public static final ByteArray EMPTY = wrap(new byte[0]);
    private byte[] mData;
    private int mLength;
    private int mOffset;

    private ByteArray(byte[] bArr, int i, int i2) {
        this.mData = bArr;
        this.mOffset = i;
        this.mLength = i2;
    }

    public static boolean equals(ByteArray byteArray, ByteArray byteArray2) {
        if (byteArray == null || byteArray2 == null || byteArray.mLength != byteArray2.mLength) {
            return false;
        }
        if (byteArray.mOffset == 0 && byteArray2.mOffset == 0 && Arrays.equals(byteArray.mData, byteArray2.mData)) {
            return true;
        }
        int i = byteArray.mOffset;
        int i2 = byteArray2.mOffset;
        int i3 = byteArray.mLength + i;
        while (i < i3) {
            if (byteArray.mData[i] != byteArray2.mData[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static ByteArray wrap(byte b2) {
        return wrap(new byte[]{b2}, 0, 1);
    }

    public ByteArray append(byte b2) {
        return append(new byte[]{b2});
    }

    public boolean contains(byte b2) {
        for (int i = this.mOffset; i < this.mLength; i++) {
            if (this.mData[i] == b2) {
                return true;
            }
        }
        return false;
    }

    public ByteArray copy() {
        return copy(0, length());
    }

    public ByteArray duplicate(int i, int i2) {
        return new ByteArray(this.mData, this.mOffset + i, i2);
    }

    public byte get(int i) {
        return this.mData[i + this.mOffset];
    }

    public int length() {
        return this.mLength;
    }

    public byte[] toBytes() {
        int i = this.mOffset;
        if (i == 0) {
            int i2 = this.mLength;
            byte[] bArr = this.mData;
            if (i2 == bArr.length) {
                return bArr;
            }
        }
        int i3 = this.mLength;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(this.mData, i, bArr2, 0, i3);
        return bArr2;
    }

    public String toString() {
        return Coder.bytesToHexString(toBytes());
    }

    public static ByteArray wrap(byte[] bArr) {
        return wrap(bArr, 0, bArr.length);
    }

    public ByteArray append(ByteArray byteArray) {
        if (byteArray != null) {
            return append(byteArray.toBytes());
        }
        throw new IllegalArgumentException("argument must not be null ");
    }

    public ByteArray copy(int i, int i2) {
        byte[] bArr = new byte[i2];
        System.arraycopy(this.mData, this.mOffset + i, bArr, 0, i2);
        return new ByteArray(bArr, 0, i2);
    }

    public static ByteArray wrap(byte[] bArr, int i, int i2) {
        return new ByteArray(bArr, i, i2);
    }

    public ByteArray append(byte[] bArr) {
        if (bArr != null) {
            int i = this.mLength;
            byte[] bArr2 = new byte[bArr.length + i];
            System.arraycopy(this.mData, this.mOffset, bArr2, 0, i);
            System.arraycopy(bArr, 0, bArr2, this.mLength, bArr.length);
            this.mData = bArr2;
            this.mLength += bArr.length;
            return this;
        }
        throw new IllegalArgumentException("argument must not be null ");
    }
}
