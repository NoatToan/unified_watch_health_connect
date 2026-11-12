package com.google.crypto.tink.subtle;

import am.j;
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
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes2.dex */
public final class AesCtrHmacStreaming extends NonceBasedStreamingAead {
    private static final int HMAC_KEY_SIZE_IN_BYTES = 32;
    private static final int NONCE_PREFIX_IN_BYTES = 7;
    private static final int NONCE_SIZE_IN_BYTES = 16;
    private final int ciphertextSegmentSize;
    private final int firstSegmentOffset;
    private final String hkdfAlgo;
    private final byte[] ikm;
    private final int keySizeInBytes;
    private final int plaintextSegmentSize;
    private final String tagAlgo;
    private final int tagSizeInBytes;

    public class AesCtrHmacStreamDecrypter implements StreamSegmentDecrypter {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private Cipher cipher;
        private SecretKeySpec hmacKeySpec;
        private SecretKeySpec keySpec;
        private Mac mac;
        private byte[] noncePrefix;

        public AesCtrHmacStreamDecrypter() {
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public synchronized void decryptSegment(ByteBuffer byteBuffer, int i14, boolean z14, ByteBuffer byteBuffer2) {
            int iPosition = byteBuffer.position();
            byte[] bArrNonceForSegment = AesCtrHmacStreaming.this.nonceForSegment(this.noncePrefix, i14, z14);
            int iRemaining = byteBuffer.remaining();
            if (iRemaining < AesCtrHmacStreaming.this.tagSizeInBytes) {
                throw new GeneralSecurityException("Ciphertext too short");
            }
            int i15 = (iRemaining - AesCtrHmacStreaming.this.tagSizeInBytes) + iPosition;
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.limit(i15);
            ByteBuffer byteBufferDuplicate2 = byteBuffer.duplicate();
            byteBufferDuplicate2.position(i15);
            this.mac.init(this.hmacKeySpec);
            this.mac.update(bArrNonceForSegment);
            this.mac.update(byteBufferDuplicate);
            byte[] bArrCopyOf = Arrays.copyOf(this.mac.doFinal(), AesCtrHmacStreaming.this.tagSizeInBytes);
            byte[] bArr = new byte[AesCtrHmacStreaming.this.tagSizeInBytes];
            byteBufferDuplicate2.get(bArr);
            if (!Bytes.equal(bArr, bArrCopyOf)) {
                throw new GeneralSecurityException("Tag mismatch");
            }
            byteBuffer.limit(i15);
            this.cipher.init(1, this.keySpec, new IvParameterSpec(bArrNonceForSegment));
            this.cipher.doFinal(byteBuffer, byteBuffer2);
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentDecrypter
        public synchronized void init(ByteBuffer byteBuffer, byte[] bArr) {
            if (byteBuffer.remaining() != AesCtrHmacStreaming.this.getHeaderLength()) {
                throw new InvalidAlgorithmParameterException("Invalid header length");
            }
            if (byteBuffer.get() != AesCtrHmacStreaming.this.getHeaderLength()) {
                throw new GeneralSecurityException("Invalid ciphertext");
            }
            this.noncePrefix = new byte[7];
            byte[] bArr2 = new byte[AesCtrHmacStreaming.this.keySizeInBytes];
            byteBuffer.get(bArr2);
            byteBuffer.get(this.noncePrefix);
            byte[] bArrDeriveKeyMaterial = AesCtrHmacStreaming.this.deriveKeyMaterial(bArr2, bArr);
            this.keySpec = AesCtrHmacStreaming.this.deriveKeySpec(bArrDeriveKeyMaterial);
            this.hmacKeySpec = AesCtrHmacStreaming.this.deriveHmacKeySpec(bArrDeriveKeyMaterial);
            this.cipher = AesCtrHmacStreaming.cipherInstance();
            this.mac = AesCtrHmacStreaming.this.macInstance();
        }
    }

    public AesCtrHmacStreaming(byte[] bArr, String str, int i14, String str2, int i15, int i16, int i17) throws InvalidAlgorithmParameterException {
        validateParameters(bArr.length, i14, str2, i15, i16, i17);
        this.ikm = Arrays.copyOf(bArr, bArr.length);
        this.hkdfAlgo = str;
        this.keySizeInBytes = i14;
        this.tagAlgo = str2;
        this.tagSizeInBytes = i15;
        this.ciphertextSegmentSize = i16;
        this.firstSegmentOffset = i17;
        this.plaintextSegmentSize = i16 - i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Cipher cipherInstance() {
        return EngineFactory.CIPHER.getInstance("AES/CTR/NoPadding");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SecretKeySpec deriveHmacKeySpec(byte[] bArr) {
        return new SecretKeySpec(bArr, this.keySizeInBytes, 32, this.tagAlgo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] deriveKeyMaterial(byte[] bArr, byte[] bArr2) {
        return Hkdf.computeHkdf(this.hkdfAlgo, this.ikm, bArr, bArr2, this.keySizeInBytes + 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SecretKeySpec deriveKeySpec(byte[] bArr) {
        return new SecretKeySpec(bArr, 0, this.keySizeInBytes, "AES");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Mac macInstance() {
        return EngineFactory.MAC.getInstance(this.tagAlgo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] nonceForSegment(byte[] bArr, long j8, boolean z14) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.put(bArr);
        SubtleUtil.putAsUnsigedInt(byteBufferAllocate, j8);
        byteBufferAllocate.put(z14 ? (byte) 1 : (byte) 0);
        byteBufferAllocate.putInt(0);
        return byteBufferAllocate.array();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] randomNonce() {
        return Random.randBytes(7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] randomSalt() {
        return Random.randBytes(this.keySizeInBytes);
    }

    private static void validateParameters(int i14, int i15, String str, int i16, int i17, int i18) throws InvalidAlgorithmParameterException {
        if (i14 < 16 || i14 < i15) {
            throw new InvalidAlgorithmParameterException("ikm too short, must be >= " + Math.max(16, i15));
        }
        Validators.validateAesKeySize(i15);
        if (i16 < 10) {
            throw new InvalidAlgorithmParameterException(j.h(i16, "tag size too small "));
        }
        if ((str.equals("HmacSha1") && i16 > 20) || ((str.equals("HmacSha256") && i16 > 32) || (str.equals("HmacSha512") && i16 > 64))) {
            e.t("tag size too big");
        } else {
            if ((((i17 - i18) - i16) - i15) - 8 > 0) {
                return;
            }
            e.t("ciphertextSegmentSize too small");
        }
    }

    public long expectedCiphertextSize(long j8) {
        long ciphertextOffset = j8 + ((long) getCiphertextOffset());
        int i14 = this.plaintextSegmentSize;
        long j14 = (ciphertextOffset / ((long) i14)) * ((long) this.ciphertextSegmentSize);
        long j15 = ciphertextOffset % ((long) i14);
        return j15 > 0 ? j15 + ((long) this.tagSizeInBytes) + j14 : j14;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getCiphertextOffset() {
        return getHeaderLength() + this.firstSegmentOffset;
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public int getCiphertextOverhead() {
        return this.tagSizeInBytes;
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
    public AesCtrHmacStreamDecrypter newStreamSegmentDecrypter() {
        return new AesCtrHmacStreamDecrypter();
    }

    @Override // com.google.crypto.tink.subtle.NonceBasedStreamingAead
    public AesCtrHmacStreamEncrypter newStreamSegmentEncrypter(byte[] bArr) {
        return new AesCtrHmacStreamEncrypter(bArr);
    }

    public class AesCtrHmacStreamEncrypter implements StreamSegmentEncrypter {
        private final Cipher cipher = AesCtrHmacStreaming.cipherInstance();
        private long encryptedSegments;
        private ByteBuffer header;
        private final SecretKeySpec hmacKeySpec;
        private final SecretKeySpec keySpec;
        private final Mac mac;
        private final byte[] noncePrefix;

        public AesCtrHmacStreamEncrypter(byte[] bArr) {
            this.encryptedSegments = 0L;
            this.mac = AesCtrHmacStreaming.this.macInstance();
            this.encryptedSegments = 0L;
            byte[] bArrRandomSalt = AesCtrHmacStreaming.this.randomSalt();
            byte[] bArrRandomNonce = AesCtrHmacStreaming.this.randomNonce();
            this.noncePrefix = bArrRandomNonce;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(AesCtrHmacStreaming.this.getHeaderLength());
            this.header = byteBufferAllocate;
            byteBufferAllocate.put((byte) AesCtrHmacStreaming.this.getHeaderLength());
            this.header.put(bArrRandomSalt);
            this.header.put(bArrRandomNonce);
            this.header.flip();
            byte[] bArrDeriveKeyMaterial = AesCtrHmacStreaming.this.deriveKeyMaterial(bArrRandomSalt, bArr);
            this.keySpec = AesCtrHmacStreaming.this.deriveKeySpec(bArrDeriveKeyMaterial);
            this.hmacKeySpec = AesCtrHmacStreaming.this.deriveHmacKeySpec(bArrDeriveKeyMaterial);
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public synchronized void encryptSegment(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, boolean z14, ByteBuffer byteBuffer3) {
            int iPosition = byteBuffer3.position();
            byte[] bArrNonceForSegment = AesCtrHmacStreaming.this.nonceForSegment(this.noncePrefix, this.encryptedSegments, z14);
            this.cipher.init(1, this.keySpec, new IvParameterSpec(bArrNonceForSegment));
            this.encryptedSegments++;
            this.cipher.update(byteBuffer, byteBuffer3);
            this.cipher.doFinal(byteBuffer2, byteBuffer3);
            ByteBuffer byteBufferDuplicate = byteBuffer3.duplicate();
            byteBufferDuplicate.flip();
            byteBufferDuplicate.position(iPosition);
            this.mac.init(this.hmacKeySpec);
            this.mac.update(bArrNonceForSegment);
            this.mac.update(byteBufferDuplicate);
            byteBuffer3.put(this.mac.doFinal(), 0, AesCtrHmacStreaming.this.tagSizeInBytes);
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public ByteBuffer getHeader() {
            return this.header.asReadOnlyBuffer();
        }

        @Override // com.google.crypto.tink.subtle.StreamSegmentEncrypter
        public synchronized void encryptSegment(ByteBuffer byteBuffer, boolean z14, ByteBuffer byteBuffer2) {
            int iPosition = byteBuffer2.position();
            byte[] bArrNonceForSegment = AesCtrHmacStreaming.this.nonceForSegment(this.noncePrefix, this.encryptedSegments, z14);
            this.cipher.init(1, this.keySpec, new IvParameterSpec(bArrNonceForSegment));
            this.encryptedSegments++;
            this.cipher.doFinal(byteBuffer, byteBuffer2);
            ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
            byteBufferDuplicate.flip();
            byteBufferDuplicate.position(iPosition);
            this.mac.init(this.hmacKeySpec);
            this.mac.update(bArrNonceForSegment);
            this.mac.update(byteBufferDuplicate);
            byteBuffer2.put(this.mac.doFinal(), 0, AesCtrHmacStreaming.this.tagSizeInBytes);
        }
    }
}
