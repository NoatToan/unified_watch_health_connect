package com.google.android.exoplayer2.upstream.crypto;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class AesFlushingCipher {
    private final Cipher a;
    private final int b;
    private final byte[] c;
    private final byte[] d;
    private int e;

    public AesFlushingCipher(int mode, byte[] secretKey, long nonce, long offset) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.a = cipher;
            int blockSize = cipher.getBlockSize();
            this.b = blockSize;
            this.c = new byte[blockSize];
            this.d = new byte[blockSize];
            int i = (int) (offset % ((long) blockSize));
            cipher.init(mode, new SecretKeySpec(secretKey, Util.splitAtFirst(cipher.getAlgorithm(), FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)[0]), new IvParameterSpec(a(nonce, offset / ((long) blockSize))));
            if (i != 0) {
                updateInPlace(new byte[i], 0, i);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new RuntimeException(e);
        }
    }

    private byte[] a(long nonce, long counter) {
        return ByteBuffer.allocate(16).putLong(nonce).putLong(counter).array();
    }

    private int b(byte[] in, int inOffset, int length, byte[] out, int outOffset) {
        try {
            return this.a.update(in, inOffset, length, out, outOffset);
        } catch (ShortBufferException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(byte[] in, int inOffset, int length, byte[] out, int outOffset) {
        int i = inOffset;
        do {
            int i2 = this.e;
            if (i2 <= 0) {
                int iB = b(in, i, length, out, outOffset);
                if (length == iB) {
                    return;
                }
                int i3 = length - iB;
                int i4 = 0;
                Assertions.checkState(i3 < this.b);
                int i5 = outOffset + iB;
                int i6 = this.b - i3;
                this.e = i6;
                Assertions.checkState(b(this.c, 0, i6, this.d, 0) == this.b);
                while (i4 < i3) {
                    out[i5] = this.d[i4];
                    i4++;
                    i5++;
                }
                return;
            }
            out[outOffset] = (byte) (in[i] ^ this.d[this.b - i2]);
            outOffset++;
            i++;
            this.e = i2 - 1;
            length--;
        } while (length != 0);
    }

    public void updateInPlace(byte[] data, int offset, int length) {
        update(data, offset, length, data, offset);
    }
}
