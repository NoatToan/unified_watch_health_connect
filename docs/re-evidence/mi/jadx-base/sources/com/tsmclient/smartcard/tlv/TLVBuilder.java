package com.tsmclient.smartcard.tlv;

import com.tsmclient.smartcard.ByteArray;
import com.tsmclient.smartcard.Coder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class TLVBuilder {
    private static final int DEFAULT_SIZE = 5120;
    private static final int MAX_LENGTH_FOUR_BYTE = 16777216;
    private static final int MAX_LENGTH_ONE_BYTE = 128;
    private static final int MAX_LENGTH_THREE_BYTE = 65536;
    private static final int MAX_LENGTH_TWO_BYTE = 256;
    private byte[] mBuffer;
    private int mPos;
    private final ByteArray mTag;

    public TLVBuilder() {
        this(null);
    }

    private int build() {
        ByteArray byteArray = this.mTag;
        if (byteArray != null) {
            int length = byteArray.length();
            int iCalculateBytesCountForLength = calculateBytesCountForLength(this.mPos);
            int i = length + iCalculateBytesCountForLength;
            ensureCapacityInternal(this.mPos + i);
            byte[] bArr = this.mBuffer;
            System.arraycopy(bArr, 0, bArr, i, this.mPos);
            System.arraycopy(this.mTag.toBytes(), 0, this.mBuffer, 0, length);
            System.arraycopy(buildLength(this.mPos), 0, this.mBuffer, length, iCalculateBytesCountForLength);
            this.mPos += i;
        }
        return this.mPos;
    }

    private byte[] buildLength(int i) {
        if (i < 128) {
            return new byte[]{(byte) i};
        }
        if (i < 256) {
            return new byte[]{-127, (byte) i};
        }
        if (i < 65536) {
            return mergeBytes(new byte[]{-126}, Coder.hexStringToBytes(String.format("%04X", Integer.valueOf(i & 65535))));
        }
        if (i < 16777216) {
            return mergeBytes(new byte[]{-125}, Coder.hexStringToBytes(String.format("%06X", Integer.valueOf(i & 16777215))));
        }
        throw new IllegalStateException("length [" + i + "] out of range (0x1000000)");
    }

    private int calculateBytesCountForLength(int i) {
        if (i < 128) {
            return 1;
        }
        if (i < 256) {
            return 2;
        }
        if (i < 65536) {
            return 3;
        }
        if (i < 16777216) {
            return 4;
        }
        throw new IllegalStateException("length [" + i + "] out of range (0x1000000)");
    }

    private int calculateCapacity(int i) {
        return i == DEFAULT_SIZE ? Math.max(i, DEFAULT_SIZE) : i;
    }

    private void ensureCapacityInternal(int i) {
        ensureExplicitCapacity(calculateCapacity(i));
    }

    private void ensureExplicitCapacity(int i) {
        if (i - this.mBuffer.length > 0) {
            grow(i);
        }
    }

    private void grow(int i) {
        this.mBuffer = Arrays.copyOf(this.mBuffer, ((i / DEFAULT_SIZE) + 1) * DEFAULT_SIZE);
    }

    private byte[] mergeBytes(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public TLVBuilder addBytes(ByteArray byteArray, byte[] bArr) {
        return addBytes(byteArray, bArr, 0, bArr.length);
    }

    public TLVBuilder addEmpty(ByteArray byteArray) {
        return addBytes(byteArray, new byte[0], 0, 0);
    }

    public byte[] buildArray() {
        int iBuild = build();
        byte[] bArr = new byte[iBuild];
        System.arraycopy(this.mBuffer, 0, bArr, 0, iBuild);
        return bArr;
    }

    public TLVBuilder(ByteArray byteArray) {
        this(byteArray, new byte[DEFAULT_SIZE], 0);
    }

    public TLVBuilder addBytes(ByteArray byteArray, byte[] bArr, int i, int i2) {
        int length = byteArray.length();
        int iCalculateBytesCountForLength = calculateBytesCountForLength(i2);
        ensureCapacityInternal(length + iCalculateBytesCountForLength + this.mPos + i2);
        System.arraycopy(byteArray.toBytes(), 0, this.mBuffer, this.mPos, length);
        this.mPos += length;
        System.arraycopy(buildLength(i2), 0, this.mBuffer, this.mPos, iCalculateBytesCountForLength);
        int i3 = this.mPos + iCalculateBytesCountForLength;
        this.mPos = i3;
        System.arraycopy(bArr, i, this.mBuffer, i3, i2);
        this.mPos += i2;
        return this;
    }

    public TLVBuilder(ByteArray byteArray, byte[] bArr, int i) {
        this.mTag = byteArray;
        this.mBuffer = bArr;
        this.mPos = i;
    }
}
