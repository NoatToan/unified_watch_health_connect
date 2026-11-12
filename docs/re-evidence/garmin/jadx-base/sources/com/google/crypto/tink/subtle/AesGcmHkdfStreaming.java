package com.google.crypto.tink.subtle;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes2.dex */
public final class AesGcmHkdfStreaming extends NonceBasedStreamingAead {
    private static final int NONCE_PREFIX_IN_BYTES = 7;
    private static final int NONCE_SIZE_IN_BYTES = 12;
    private static final int TAG_SIZE_IN_BYTES = 16;
    private final int ciphertextSegmentSize;
    private final int firstSegmentOffset;
    private final String hkdfAlg;
    private final byte[] ikm;
    private final int keySizeInBytes;
    private final int plaintextSegmentSize;

    public class AesGcmHkdfStreamDecrypter implements StreamSegmentDecrypter {
        private Cipher cipher;
        private SecretKeySpec keySpec;
        private byte[] noncePrefix;

        public AesGcmHkdfStreamDecrypter() {
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public synchronized void decryptSegment(ByteBuffer byteBuffer, int i14, boolean z14, ByteBuffer byteBuffer2) {
            this.cipher.init(2, this.keySpec, AesGcmHkdfStreaming.paramsForSegment(this.noncePrefix, i14, z14));
            this.cipher.doFinal(byteBuffer, byteBuffer2);
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public synchronized void init(ByteBuffer byteBuffer, byte[] bArr) {
            if (byteBuffer.remaining() != AesGcmHkdfStreaming.this.getHeaderLength()) {
                throw new InvalidAlgorithmParameterException("Invalid header length");
            }
            if (byteBuffer.get() != AesGcmHkdfStreaming.this.getHeaderLength()) {
                throw new GeneralSecurityException("Invalid ciphertext");
            }
            this.noncePrefix = new byte[7];
            byte[] bArr2 = new byte[AesGcmHkdfStreaming.this.keySizeInBytes];
            byteBuffer.get(bArr2);
            byteBuffer.get(this.noncePrefix);
            this.keySpec = AesGcmHkdfStreaming.this.deriveKeySpec(bArr2, bArr);
            this.cipher = AesGcmHkdfStreaming.cipherInstance();
        }
    }

    public AesGcmHkdfStreaming(byte[] bArr, String str, int i14, int i15, int i16) throws InvalidAlgorithmParameterException {
        if (bArr.length < 16 || bArr.length < i14) {
            throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, i14));
        }
        Validators.validateAesKeySize(i14);
        if (i15 <= getHeaderLength() + i16 + 16) {
            e.t("ciphertextSegmentSize too small");
            throw null;
        }
        this.ikm = Arrays.copyOf(bArr, bArr.length);
        this.hkdfAlg = str;
        this.keySizeInBytes = i14;
        this.ciphertextSegmentSize = i15;
        this.firstSegmentOffset = i16;
        this.plaintextSegmentSize = i15 - 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Cipher cipherInstance() {
        return EngineFactory.CIPHER.getInstance("AES/GCM/NoPadding");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SecretKeySpec deriveKeySpec(byte[] bArr, byte[] bArr2) {
        return new SecretKeySpec(Hkdf.computeHkdf(this.hkdfAlg, this.ikm, bArr, bArr2, this.keySizeInBytes), "AES");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GCMParameterSpec paramsForSegment(byte[] bArr, long j8, boolean z14) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.put(bArr);
        SubtleUtil.putAsUnsigedInt(byteBufferAllocate, j8);
        byteBufferAllocate.put(z14 ? (byte) 1 : (byte) 0);
        return new GCMParameterSpec(128, byteBufferAllocate.array());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] randomNonce() {
        return Random.randBytes(7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] randomSalt() {
        return Random.randBytes(this.keySizeInBytes);
    }

    public long expectedCiphertextSize(long j8) {
        long ciphertextOffset = j8 + ((long) getCiphertextOffset());
        int i14 = this.plaintextSegmentSize;
        long j14 = (ciphertextOffset / ((long) i14)) * ((long) this.ciphertextSegmentSize);
        long j15 = ciphertextOffset % ((long) i14);
        return j15 > 0 ? j15 + 16 + j14 : j14;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getCiphertextOffset() {
        return getHeaderLength() + this.firstSegmentOffset;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getCiphertextOverhead() {
        return 16;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getCiphertextSegmentSize() {
        return this.ciphertextSegmentSize;
    }

    public int getFirstSegmentOffset() {
        return this.firstSegmentOffset;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getHeaderLength() {
        return this.keySizeInBytes + 8;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getPlaintextSegmentSize() {
        return this.plaintextSegmentSize;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ ReadableByteChannel newDecryptingChannel(ReadableByteChannel readableByteChannel, byte[] bArr) {
        return super.newDecryptingChannel(readableByteChannel, bArr);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ InputStream newDecryptingStream(InputStream inputStream, byte[] bArr) {
        return super.newDecryptingStream(inputStream, bArr);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ WritableByteChannel newEncryptingChannel(WritableByteChannel writableByteChannel, byte[] bArr) {
        return super.newEncryptingChannel(writableByteChannel, bArr);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ OutputStream newEncryptingStream(OutputStream outputStream, byte[] bArr) {
        return super.newEncryptingStream(outputStream, bArr);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead, com.google.crypto.tink.StreamingAead
    public /* bridge */ /* synthetic */ SeekableByteChannel newSeekableDecryptingChannel(SeekableByteChannel seekableByteChannel, byte[] bArr) {
        return super.newSeekableDecryptingChannel(seekableByteChannel, bArr);
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public AesGcmHkdfStreamDecrypter newStreamSegmentDecrypter() {
        return new AesGcmHkdfStreamDecrypter();
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public AesGcmHkdfStreamEncrypter newStreamSegmentEncrypter(byte[] bArr) {
        return new AesGcmHkdfStreamEncrypter(bArr);
    }

    public class AesGcmHkdfStreamEncrypter implements StreamSegmentEncrypter {
        private final Cipher cipher = AesGcmHkdfStreaming.cipherInstance();
        private long encryptedSegments;
        private final ByteBuffer header;
        private final SecretKeySpec keySpec;
        private final byte[] noncePrefix;

        public AesGcmHkdfStreamEncrypter(byte[] bArr) {
            this.encryptedSegments = 0L;
            this.encryptedSegments = 0L;
            byte[] bArrRandomSalt = AesGcmHkdfStreaming.this.randomSalt();
            byte[] bArrRandomNonce = AesGcmHkdfStreaming.randomNonce();
            this.noncePrefix = bArrRandomNonce;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(AesGcmHkdfStreaming.this.getHeaderLength());
            this.header = byteBufferAllocate;
            byteBufferAllocate.put((byte) AesGcmHkdfStreaming.this.getHeaderLength());
            byteBufferAllocate.put(bArrRandomSalt);
            byteBufferAllocate.put(bArrRandomNonce);
            byteBufferAllocate.flip();
            this.keySpec = AesGcmHkdfStreaming.this.deriveKeySpec(bArrRandomSalt, bArr);
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public synchronized void encryptSegment(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z14, ByteBuffer byteBuffer3) {
            try {
                this.cipher.init(1, this.keySpec, AesGcmHkdfStreaming.paramsForSegment(this.noncePrefix, this.encryptedSegments, z14));
                this.encryptedSegments++;
                boolean zHasRemaining = byteBuffer2.hasRemaining();
                Cipher cipher = this.cipher;
                if (zHasRemaining) {
                    cipher.update(byteBuffer, byteBuffer3);
                    this.cipher.doFinal(byteBuffer2, byteBuffer3);
                } else {
                    cipher.doFinal(byteBuffer, byteBuffer3);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public ByteBuffer getHeader() {
            return this.header.asReadOnlyBuffer();
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public synchronized void encryptSegment(ByteBuffer byteBuffer, boolean z14, ByteBuffer byteBuffer2) {
            this.cipher.init(1, this.keySpec, AesGcmHkdfStreaming.paramsForSegment(this.noncePrefix, this.encryptedSegments, z14));
            this.encryptedSegments++;
            this.cipher.doFinal(byteBuffer, byteBuffer2);
        }
    }
}
