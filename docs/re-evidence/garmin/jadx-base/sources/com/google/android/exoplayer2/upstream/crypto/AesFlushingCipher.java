package com.google.android.exoplayer2.upstream.crypto;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o2.c;

/* JADX INFO: loaded from: classes14.dex */
public final class AesFlushingCipher {
    private final int blockSize;
    private final Cipher cipher;
    private final byte[] flushedBlock;
    private int pendingXorBytes;
    private final byte[] zerosBlock;

    public AesFlushingCipher(int i14, byte[] bArr, long j8, long j14) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.cipher = cipher;
            int blockSize = cipher.getBlockSize();
            this.blockSize = blockSize;
            this.zerosBlock = new byte[blockSize];
            this.flushedBlock = new byte[blockSize];
            long j15 = j14 / ((long) blockSize);
            int i15 = (int) (j14 % ((long) blockSize));
            cipher.init(i14, new SecretKeySpec(bArr, Util.splitAtFirst(cipher.getAlgorithm(), "/")[0]), new IvParameterSpec(getInitializationVector(j8, j15)));
            if (i15 != 0) {
                updateInPlace(new byte[i15], 0, i15);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e4) {
            c.p(e4);
            throw null;
        }
    }

    private static long getFNV64Hash(String str) {
        long j8 = 0;
        if (str == null) {
            return 0L;
        }
        for (int i14 = 0; i14 < str.length(); i14++) {
            long jCharAt = j8 ^ ((long) str.charAt(i14));
            j8 = jCharAt + (jCharAt << 1) + (jCharAt << 4) + (jCharAt << 5) + (jCharAt << 7) + (jCharAt << 8) + (jCharAt << 40);
        }
        return j8;
    }

    private byte[] getInitializationVector(long j8, long j14) {
        return ByteBuffer.allocate(16).putLong(j8).putLong(j14).array();
    }

    private int nonFlushingUpdate(byte[] bArr, int i14, int i15, byte[] bArr2, int i16) {
        try {
            return this.cipher.update(bArr, i14, i15, bArr2, i16);
        } catch (ShortBufferException e4) {
            c.p(e4);
            return 0;
        }
    }

    public void update(byte[] bArr, int i14, int i15, byte[] bArr2, int i16) {
        int i17 = i14;
        int i18 = i15;
        int i19 = i16;
        do {
            int i24 = this.pendingXorBytes;
            if (i24 <= 0) {
                int iNonFlushingUpdate = nonFlushingUpdate(bArr, i17, i18, bArr2, i19);
                if (i18 == iNonFlushingUpdate) {
                    return;
                }
                int i25 = i18 - iNonFlushingUpdate;
                int i26 = 0;
                Assertions.checkState(i25 < this.blockSize);
                int i27 = i19 + iNonFlushingUpdate;
                int i28 = this.blockSize - i25;
                this.pendingXorBytes = i28;
                Assertions.checkState(nonFlushingUpdate(this.zerosBlock, 0, i28, this.flushedBlock, 0) == this.blockSize);
                while (i26 < i25) {
                    bArr2[i27] = this.flushedBlock[i26];
                    i26++;
                    i27++;
                }
                return;
            }
            bArr2[i19] = (byte) (bArr[i17] ^ this.flushedBlock[this.blockSize - i24]);
            i19++;
            i17++;
            this.pendingXorBytes = i24 - 1;
            i18--;
        } while (i18 != 0);
    }

    public void updateInPlace(byte[] bArr, int i14, int i15) {
        update(bArr, i14, i15, bArr, i14);
    }

    public AesFlushingCipher(int i14, byte[] bArr, String str, long j8) {
        this(i14, bArr, getFNV64Hash(str), j8);
    }
}
