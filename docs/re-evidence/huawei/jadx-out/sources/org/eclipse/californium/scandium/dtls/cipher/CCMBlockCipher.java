package org.eclipse.californium.scandium.dtls.cipher;

import androidx.media3.extractor.WavUtil;
import com.huawei.openalliance.ad.constant.Constants;
import defpackage.aaci;
import defpackage.aacn;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;

/* JADX INFO: loaded from: classes20.dex */
public class CCMBlockCipher {
    private static final aacn e = new aacn("AES/ECB/NoPadding");

    static abstract class Block {
        protected final byte[] block;
        protected final int blockSize;

        protected Block(int i) {
            this.blockSize = i;
            this.block = new byte[i];
        }

        protected int setIntAtEnd(int i, int i2) {
            int i3 = this.blockSize;
            while (i3 > i) {
                i3--;
                this.block[i3] = (byte) i2;
                i2 >>>= 8;
            }
            return i2;
        }
    }

    static class a extends Block {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f44568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Cipher f44569c;
        private final int d;

        private a(Cipher cipher, byte[] bArr) {
            super(cipher.getBlockSize());
            this.f44569c = cipher;
            int length = bArr.length;
            this.d = length;
            int i = (this.blockSize - 1) - length;
            if (i < 2 || i > 8) {
                StringBuilder sb = new StringBuilder("Nonce length ");
                sb.append(length);
                sb.append(" invalid for blocksize ");
                sb.append(this.blockSize);
                sb.append(" (valid length [");
                sb.append(this.blockSize - 9);
                sb.append(Constants.LINK);
                sb.append(this.blockSize - 3);
                sb.append("])");
                throw new IllegalArgumentException(sb.toString());
            }
            this.f44568b = new byte[this.blockSize];
            this.block[0] = (byte) (i - 1);
            System.arraycopy(bArr, 0, this.block, 1, length);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] e(int i) throws ShortBufferException {
            if (setIntAtEnd(this.d + 1, i) != 0) {
                throw new IllegalArgumentException("Index " + i + " too large for nonce " + this.d + " and blocksize " + this.blockSize + " bytes.");
            }
            this.f44569c.update(this.block, 0, this.blockSize, this.f44568b);
            return this.f44568b;
        }
    }

    static class e extends Block {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Cipher f44570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f44571b;

        private e(Cipher cipher, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) throws ShortBufferException {
            int i2;
            super(cipher.getBlockSize());
            this.f44570a = cipher;
            int length = bArr3.length;
            int length2 = bArr2.length;
            int length3 = bArr.length;
            int i3 = (this.blockSize - 1) - length3;
            if (i3 < 2 || i3 > 8) {
                StringBuilder sb = new StringBuilder("Nonce length ");
                sb.append(length3);
                sb.append(" invalid for blocksize ");
                sb.append(this.blockSize);
                sb.append(" (valid length [");
                sb.append(this.blockSize - 9);
                sb.append(Constants.LINK);
                sb.append(this.blockSize - 3);
                sb.append("])");
                throw new IllegalArgumentException(sb.toString());
            }
            this.block[0] = (byte) (((length2 > 0 ? 1 : 0) * 64) + (((i - 2) / 2) * 8) + (i3 - 1));
            System.arraycopy(bArr, 0, this.block, 1, length3);
            if (setIntAtEnd(length3 + 1, length) != 0) {
                throw new IllegalArgumentException("Length " + length + " too large for nonce " + length3 + " and blocksize " + this.blockSize + " bytes.");
            }
            cipher.update(this.block, 0, this.blockSize, this.block);
            if (length2 > 0) {
                if (length2 < 65280) {
                    e(0, 2, length2);
                    i2 = 2;
                } else {
                    e(0, 2, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                    e(2, 6, length2);
                    i2 = 6;
                }
                c(bArr2, i2);
            }
            c(bArr3, 0);
            this.f44571b = Arrays.copyOf(this.block, i);
        }

        private void c(byte[] bArr, int i) throws ShortBufferException {
            int length = bArr.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = (this.blockSize + i2) - i;
                if (i3 > length) {
                    i3 = length;
                }
                while (i2 < i3) {
                    byte[] bArr2 = this.block;
                    bArr2[i] = (byte) (bArr2[i] ^ bArr[i2]);
                    i2++;
                    i++;
                }
                this.f44570a.update(this.block, 0, this.blockSize, this.block);
                i = 0;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] e() {
            return this.f44571b;
        }

        protected int e(int i, int i2, int i3) {
            while (i2 > i) {
                byte[] bArr = this.block;
                i2--;
                bArr[i2] = (byte) (bArr[i2] ^ ((byte) i3));
                i3 >>>= 8;
            }
            return i3;
        }
    }

    public static final byte[] c(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3) throws GeneralSecurityException {
        Cipher cipherC = e.c();
        cipherC.init(1, secretKey);
        int i4 = i2 - i3;
        int blockSize = cipherC.getBlockSize();
        byte[] bArr4 = new byte[i4];
        byte[] bArr5 = new byte[i3];
        a aVar = new a(cipherC, bArr);
        byte[] bArrE = aVar.e(0);
        for (int i5 = 0; i5 < i3; i5++) {
            bArr5[i5] = (byte) (bArr3[(i + i4) + i5] ^ bArrE[i5]);
        }
        int i6 = 1;
        int i7 = 0;
        while (i7 < i4) {
            byte[] bArrE2 = aVar.e(i6);
            int i8 = i7 + blockSize;
            if (i8 > i4) {
                i8 = i4;
            }
            int i9 = 0;
            while (i7 < i8) {
                bArr4[i7] = (byte) (bArr3[i + i7] ^ bArrE2[i9]);
                i7++;
                i9++;
            }
            i6++;
        }
        byte[] bArrE3 = new e(cipherC, bArr, bArr2, bArr4, i3).e();
        if (MessageDigest.isEqual(bArr5, bArrE3)) {
            return bArr4;
        }
        throw new aaci(bArrE3, bArr5);
    }

    public static final byte[] a(int i, SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2) throws GeneralSecurityException {
        Cipher cipherC = e.c();
        cipherC.init(1, secretKey);
        int blockSize = cipherC.getBlockSize();
        int length = bArr3.length;
        byte[] bArrE = new e(cipherC, bArr, bArr2, bArr3, i2).e();
        int i3 = i + length;
        byte[] bArr4 = new byte[i3 + i2];
        a aVar = new a(cipherC, bArr);
        byte[] bArrE2 = aVar.e(0);
        for (int i4 = 0; i4 < i2; i4++) {
            bArr4[i4 + i3] = (byte) (bArrE[i4] ^ bArrE2[i4]);
        }
        int i5 = 0;
        int i6 = 1;
        while (i5 < length) {
            byte[] bArrE3 = aVar.e(i6);
            int i7 = i5 + blockSize;
            if (i7 > length) {
                i7 = length;
            }
            int i8 = 0;
            while (i5 < i7) {
                bArr4[i5 + i] = (byte) (bArr3[i5] ^ bArrE3[i8]);
                i5++;
                i8++;
            }
            i6++;
        }
        return bArr4;
    }
}
