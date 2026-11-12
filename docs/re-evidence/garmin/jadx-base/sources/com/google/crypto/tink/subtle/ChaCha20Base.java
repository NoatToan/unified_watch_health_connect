package com.google.crypto.tink.subtle;

import com.google.android.gms.internal.measurement.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
abstract class ChaCha20Base implements IndCpaCipher {
    public static final int BLOCK_SIZE_IN_BYTES = 64;
    public static final int BLOCK_SIZE_IN_INTS = 16;
    public static final int KEY_SIZE_IN_BYTES = 32;
    public static final int KEY_SIZE_IN_INTS = 8;
    private static final int[] SIGMA = toIntArray(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    private final int initialCounter;
    int[] key;

    public ChaCha20Base(byte[] bArr, int i14) throws InvalidKeyException {
        if (bArr.length != 32) {
            e.q("The key length in bytes must be 32.");
            throw null;
        }
        this.key = toIntArray(bArr);
        this.initialCounter = i14;
    }

    private void process(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int iRemaining = byteBuffer2.remaining();
        int i14 = iRemaining / 64;
        int i15 = i14 + 1;
        for (int i16 = 0; i16 < i15; i16++) {
            ByteBuffer byteBufferChacha20Block = chacha20Block(bArr, this.initialCounter + i16);
            if (i16 == i14) {
                Bytes.xor(byteBuffer, byteBuffer2, byteBufferChacha20Block, iRemaining % 64);
            } else {
                Bytes.xor(byteBuffer, byteBuffer2, byteBufferChacha20Block, 64);
            }
        }
    }

    public static void quarterRound(int[] iArr, int i14, int i15, int i16, int i17) {
        int i18 = iArr[i14] + iArr[i15];
        iArr[i14] = i18;
        int iRotateLeft = rotateLeft(i18 ^ iArr[i17], 16);
        iArr[i17] = iRotateLeft;
        int i19 = iArr[i16] + iRotateLeft;
        iArr[i16] = i19;
        int iRotateLeft2 = rotateLeft(iArr[i15] ^ i19, 12);
        iArr[i15] = iRotateLeft2;
        int i24 = iArr[i14] + iRotateLeft2;
        iArr[i14] = i24;
        int iRotateLeft3 = rotateLeft(iArr[i17] ^ i24, 8);
        iArr[i17] = iRotateLeft3;
        int i25 = iArr[i16] + iRotateLeft3;
        iArr[i16] = i25;
        iArr[i15] = rotateLeft(iArr[i15] ^ i25, 7);
    }

    private static int rotateLeft(int i14, int i15) {
        return (i14 >>> (-i15)) | (i14 << i15);
    }

    public static void setSigmaAndKey(int[] iArr, int[] iArr2) {
        int[] iArr3 = SIGMA;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    public static void shuffleState(int[] iArr) {
        for (int i14 = 0; i14 < 10; i14++) {
            quarterRound(iArr, 0, 4, 8, 12);
            quarterRound(iArr, 1, 5, 9, 13);
            quarterRound(iArr, 2, 6, 10, 14);
            quarterRound(iArr, 3, 7, 11, 15);
            quarterRound(iArr, 0, 5, 10, 15);
            quarterRound(iArr, 1, 6, 11, 12);
            quarterRound(iArr, 2, 7, 8, 13);
            quarterRound(iArr, 3, 4, 9, 14);
        }
    }

    public static int[] toIntArray(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    public ByteBuffer chacha20Block(byte[] bArr, int i14) {
        int[] iArrCreateInitialState = createInitialState(toIntArray(bArr), i14);
        int[] iArr = (int[]) iArrCreateInitialState.clone();
        shuffleState(iArr);
        for (int i15 = 0; i15 < iArrCreateInitialState.length; i15++) {
            iArrCreateInitialState[i15] = iArrCreateInitialState[i15] + iArr[i15];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrCreateInitialState, 0, 16);
        return byteBufferOrder;
    }

    public abstract int[] createInitialState(int[] iArr, int i14);

    public byte[] decrypt(ByteBuffer byteBuffer) throws GeneralSecurityException {
        if (byteBuffer.remaining() < nonceSizeInBytes()) {
            a.t("ciphertext too short");
            return null;
        }
        byte[] bArr = new byte[nonceSizeInBytes()];
        byteBuffer.get(bArr);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        process(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }

    public void encrypt(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - nonceSizeInBytes() < bArr.length) {
            h.s("Given ByteBuffer output is too small");
            return;
        }
        byte[] bArrRandBytes = Random.randBytes(nonceSizeInBytes());
        byteBuffer.put(bArrRandBytes);
        process(bArrRandBytes, byteBuffer, ByteBuffer.wrap(bArr));
    }

    public abstract int nonceSizeInBytes();

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] encrypt(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length <= Integer.MAX_VALUE - nonceSizeInBytes()) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(nonceSizeInBytes() + bArr.length);
            encrypt(byteBufferAllocate, bArr);
            return byteBufferAllocate.array();
        }
        a.t("plaintext too long");
        return null;
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] decrypt(byte[] bArr) {
        return decrypt(ByteBuffer.wrap(bArr));
    }
}
