package com.google.crypto.tink.subtle;

import com.google.common.primitives.UnsignedBytes;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
class StreamingAeadDecryptingStream extends FilterInputStream {
    private static final int PLAINTEXT_SEGMENT_EXTRA_SIZE = 16;
    private final byte[] aad;
    private final ByteBuffer ciphertextSegment;
    private final int ciphertextSegmentSize;
    private final StreamSegmentDecrypter decrypter;
    private boolean decryptionErrorOccured;
    private boolean endOfCiphertext;
    private boolean endOfPlaintext;
    private final int firstCiphertextSegmentSize;
    private final int headerLength;
    private boolean headerRead;
    private final ByteBuffer plaintextSegment;
    private int segmentNr;

    public StreamingAeadDecryptingStream(NonceBasedStreamingAead nonceBasedStreamingAead, InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.decrypter = nonceBasedStreamingAead.newStreamSegmentDecrypter();
        this.headerLength = nonceBasedStreamingAead.getHeaderLength();
        this.aad = Arrays.copyOf(bArr, bArr.length);
        int ciphertextSegmentSize = nonceBasedStreamingAead.getCiphertextSegmentSize();
        this.ciphertextSegmentSize = ciphertextSegmentSize;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(ciphertextSegmentSize + 1);
        this.ciphertextSegment = byteBufferAllocate;
        byteBufferAllocate.limit(0);
        this.firstCiphertextSegmentSize = ciphertextSegmentSize - nonceBasedStreamingAead.getCiphertextOffset();
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(nonceBasedStreamingAead.getPlaintextSegmentSize() + 16);
        this.plaintextSegment = byteBufferAllocate2;
        byteBufferAllocate2.limit(0);
        this.headerRead = false;
        this.endOfCiphertext = false;
        this.endOfPlaintext = false;
        this.segmentNr = 0;
        this.decryptionErrorOccured = false;
    }

    private void loadSegment() throws IOException {
        byte b14;
        while (!this.endOfCiphertext && this.ciphertextSegment.remaining() > 0) {
            int i14 = ((FilterInputStream) this).in.read(this.ciphertextSegment.array(), this.ciphertextSegment.position(), this.ciphertextSegment.remaining());
            if (i14 > 0) {
                ByteBuffer byteBuffer = this.ciphertextSegment;
                byteBuffer.position(byteBuffer.position() + i14);
            } else if (i14 == -1) {
                this.endOfCiphertext = true;
            } else if (i14 == 0) {
                h.C("Could not read bytes from the ciphertext stream");
                return;
            }
        }
        if (this.endOfCiphertext) {
            b14 = 0;
        } else {
            ByteBuffer byteBuffer2 = this.ciphertextSegment;
            b14 = byteBuffer2.get(byteBuffer2.position() - 1);
            ByteBuffer byteBuffer3 = this.ciphertextSegment;
            byteBuffer3.position(byteBuffer3.position() - 1);
        }
        this.ciphertextSegment.flip();
        this.plaintextSegment.clear();
        try {
            this.decrypter.decryptSegment(this.ciphertextSegment, this.segmentNr, this.endOfCiphertext, this.plaintextSegment);
            this.segmentNr++;
            this.plaintextSegment.flip();
            this.ciphertextSegment.clear();
            if (this.endOfCiphertext) {
                return;
            }
            this.ciphertextSegment.clear();
            this.ciphertextSegment.limit(this.ciphertextSegmentSize + 1);
            this.ciphertextSegment.put(b14);
        } catch (GeneralSecurityException e4) {
            setDecryptionErrorOccured();
            throw new IOException(e4.getMessage() + "\n" + toString() + "\nsegmentNr:" + this.segmentNr + " endOfCiphertext:" + this.endOfCiphertext, e4);
        }
    }

    private void readHeader() throws IOException {
        if (this.headerRead) {
            setDecryptionErrorOccured();
            h.C("Decryption failed.");
            return;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.headerLength);
        while (byteBufferAllocate.remaining() > 0) {
            int i14 = ((FilterInputStream) this).in.read(byteBufferAllocate.array(), byteBufferAllocate.position(), byteBufferAllocate.remaining());
            if (i14 == -1) {
                setDecryptionErrorOccured();
                h.C("Ciphertext is too short");
                return;
            } else {
                if (i14 == 0) {
                    h.C("Could not read bytes from the ciphertext stream");
                    return;
                }
                byteBufferAllocate.position(byteBufferAllocate.position() + i14);
            }
        }
        byteBufferAllocate.flip();
        try {
            this.decrypter.init(byteBufferAllocate, this.aad);
            this.headerRead = true;
        } catch (GeneralSecurityException e4) {
            throw new IOException(e4);
        }
    }

    private void setDecryptionErrorOccured() {
        this.decryptionErrorOccured = true;
        this.plaintextSegment.limit(0);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return this.plaintextSegment.remaining();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i14) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i14, int i15) {
        try {
            if (this.decryptionErrorOccured) {
                throw new IOException("Decryption failed.");
            }
            if (!this.headerRead) {
                readHeader();
                this.ciphertextSegment.clear();
                this.ciphertextSegment.limit(this.firstCiphertextSegmentSize + 1);
            }
            if (this.endOfPlaintext) {
                return -1;
            }
            int i16 = 0;
            while (i16 < i15) {
                if (this.plaintextSegment.remaining() == 0) {
                    if (this.endOfCiphertext) {
                        this.endOfPlaintext = true;
                        break;
                    }
                    loadSegment();
                }
                int iMin = Math.min(this.plaintextSegment.remaining(), i15 - i16);
                this.plaintextSegment.get(bArr, i16 + i14, iMin);
                i16 += iMin;
            }
            if (i16 == 0 && this.endOfPlaintext) {
                return -1;
            }
            return i16;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j8) {
        int i14;
        long j14 = this.ciphertextSegmentSize;
        if (j8 <= 0) {
            return 0L;
        }
        int iMin = (int) Math.min(j14, j8);
        byte[] bArr = new byte[iMin];
        long j15 = j8;
        while (j15 > 0 && (i14 = read(bArr, 0, (int) Math.min(iMin, j15))) > 0) {
            j15 -= (long) i14;
        }
        return j8 - j15;
    }

    public synchronized String toString() {
        return "StreamingAeadDecryptingStream\nsegmentNr:" + this.segmentNr + "\nciphertextSegmentSize:" + this.ciphertextSegmentSize + "\nheaderRead:" + this.headerRead + "\nendOfCiphertext:" + this.endOfCiphertext + "\nendOfPlaintext:" + this.endOfPlaintext + "\ndecryptionErrorOccured:" + this.decryptionErrorOccured + "\nciphertextSgement position:" + this.ciphertextSegment.position() + " limit:" + this.ciphertextSegment.limit() + "\nplaintextSegment position:" + this.plaintextSegment.position() + " limit:" + this.plaintextSegment.limit();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = new byte[1];
        int i14 = read(bArr, 0, 1);
        if (i14 == 1) {
            return bArr[0] & UnsignedBytes.MAX_VALUE;
        }
        if (i14 == -1) {
            return i14;
        }
        h.C("Reading failed");
        return 0;
    }
}
