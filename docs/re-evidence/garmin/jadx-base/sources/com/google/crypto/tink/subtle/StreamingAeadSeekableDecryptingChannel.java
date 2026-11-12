package com.google.crypto.tink.subtle;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.SeekableByteChannel;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
class StreamingAeadSeekableDecryptingChannel implements SeekableByteChannel {
    private static final int PLAINTEXT_SEGMENT_EXTRA_SIZE = 16;
    private final byte[] aad;
    private final SeekableByteChannel ciphertextChannel;
    private final long ciphertextChannelSize;
    private final int ciphertextOffset;
    private final ByteBuffer ciphertextSegment;
    private final int ciphertextSegmentSize;
    private int currentSegmentNr;
    private final StreamSegmentDecrypter decrypter;
    private final int firstSegmentOffset;
    private final ByteBuffer header;
    private boolean headerRead;
    private boolean isCurrentSegmentDecrypted;
    private boolean isopen;
    private final int lastCiphertextSegmentSize;
    private final int numberOfSegments;
    private long plaintextPosition;
    private final ByteBuffer plaintextSegment;
    private final int plaintextSegmentSize;
    private long plaintextSize;

    public StreamingAeadSeekableDecryptingChannel(NonceBasedStreamingAead nonceBasedStreamingAead, SeekableByteChannel seekableByteChannel, byte[] bArr) throws IOException {
        this.decrypter = nonceBasedStreamingAead.newStreamSegmentDecrypter();
        this.ciphertextChannel = seekableByteChannel;
        this.header = ByteBuffer.allocate(nonceBasedStreamingAead.getHeaderLength());
        int ciphertextSegmentSize = nonceBasedStreamingAead.getCiphertextSegmentSize();
        this.ciphertextSegmentSize = ciphertextSegmentSize;
        this.ciphertextSegment = ByteBuffer.allocate(ciphertextSegmentSize);
        int plaintextSegmentSize = nonceBasedStreamingAead.getPlaintextSegmentSize();
        this.plaintextSegmentSize = plaintextSegmentSize;
        this.plaintextSegment = ByteBuffer.allocate(plaintextSegmentSize + 16);
        this.plaintextPosition = 0L;
        this.headerRead = false;
        this.currentSegmentNr = -1;
        this.isCurrentSegmentDecrypted = false;
        long size = seekableByteChannel.size();
        this.ciphertextChannelSize = size;
        this.aad = Arrays.copyOf(bArr, bArr.length);
        this.isopen = seekableByteChannel.isOpen();
        int i14 = (int) (size / ((long) ciphertextSegmentSize));
        int i15 = (int) (size % ((long) ciphertextSegmentSize));
        int ciphertextOverhead = nonceBasedStreamingAead.getCiphertextOverhead();
        if (i15 > 0) {
            this.numberOfSegments = i14 + 1;
            if (i15 < ciphertextOverhead) {
                h.C("Invalid ciphertext size");
                throw null;
            }
            this.lastCiphertextSegmentSize = i15;
        } else {
            this.numberOfSegments = i14;
            this.lastCiphertextSegmentSize = ciphertextSegmentSize;
        }
        int ciphertextOffset = nonceBasedStreamingAead.getCiphertextOffset();
        this.ciphertextOffset = ciphertextOffset;
        int headerLength = ciphertextOffset - nonceBasedStreamingAead.getHeaderLength();
        this.firstSegmentOffset = headerLength;
        if (headerLength < 0) {
            h.C("Invalid ciphertext offset or header length");
            throw null;
        }
        long j8 = (((long) this.numberOfSegments) * ((long) ciphertextOverhead)) + ((long) ciphertextOffset);
        if (j8 <= size) {
            this.plaintextSize = size - j8;
        } else {
            h.C("Ciphertext is too short");
            throw null;
        }
    }

    private int getSegmentNr(long j8) {
        return (int) ((j8 + ((long) this.ciphertextOffset)) / ((long) this.plaintextSegmentSize));
    }

    private boolean reachedEnd() {
        return this.isCurrentSegmentDecrypted && this.currentSegmentNr == this.numberOfSegments - 1 && this.plaintextSegment.remaining() == 0;
    }

    private boolean tryLoadSegment(int i14) throws IOException {
        int i15;
        if (i14 < 0 || i14 >= (i15 = this.numberOfSegments)) {
            h.C("Invalid position");
            return false;
        }
        boolean z14 = i14 == i15 - 1;
        if (i14 != this.currentSegmentNr) {
            int i16 = this.ciphertextSegmentSize;
            long j8 = ((long) i14) * ((long) i16);
            if (z14) {
                i16 = this.lastCiphertextSegmentSize;
            }
            if (i14 == 0) {
                int i17 = this.ciphertextOffset;
                i16 -= i17;
                j8 = i17;
            }
            this.ciphertextChannel.position(j8);
            this.ciphertextSegment.clear();
            this.ciphertextSegment.limit(i16);
            this.currentSegmentNr = i14;
            this.isCurrentSegmentDecrypted = false;
        } else if (this.isCurrentSegmentDecrypted) {
            return true;
        }
        if (this.ciphertextSegment.remaining() > 0) {
            this.ciphertextChannel.read(this.ciphertextSegment);
        }
        if (this.ciphertextSegment.remaining() > 0) {
            return false;
        }
        this.ciphertextSegment.flip();
        this.plaintextSegment.clear();
        try {
            this.decrypter.decryptSegment(this.ciphertextSegment, i14, z14, this.plaintextSegment);
            this.plaintextSegment.flip();
            this.isCurrentSegmentDecrypted = true;
            return true;
        } catch (GeneralSecurityException e4) {
            this.currentSegmentNr = -1;
            h.u("Failed to decrypt", e4);
            return false;
        }
    }

    private boolean tryReadHeader() throws IOException {
        this.ciphertextChannel.position(this.header.position() + this.firstSegmentOffset);
        this.ciphertextChannel.read(this.header);
        if (this.header.remaining() > 0) {
            return false;
        }
        this.header.flip();
        try {
            this.decrypter.init(this.header, this.aad);
            this.headerRead = true;
            return true;
        } catch (GeneralSecurityException e4) {
            throw new IOException(e4);
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.ciphertextChannel.close();
        this.isopen = false;
    }

    @Override // java.nio.channels.Channel
    public synchronized boolean isOpen() {
        return this.isopen;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized long position() {
        return this.plaintextPosition;
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.ReadableByteChannel
    public synchronized int read(ByteBuffer byteBuffer) {
        if (!this.isopen) {
            throw new ClosedChannelException();
        }
        if (!this.headerRead && !tryReadHeader()) {
            return 0;
        }
        int iPosition = byteBuffer.position();
        while (byteBuffer.remaining() > 0) {
            long j8 = this.plaintextPosition;
            if (j8 >= this.plaintextSize) {
                break;
            }
            int segmentNr = getSegmentNr(j8);
            long j14 = this.plaintextPosition;
            if (segmentNr != 0) {
                j14 = (j14 + ((long) this.ciphertextOffset)) % ((long) this.plaintextSegmentSize);
            }
            int i14 = (int) j14;
            if (!tryLoadSegment(segmentNr)) {
                break;
            }
            this.plaintextSegment.position(i14);
            if (this.plaintextSegment.remaining() <= byteBuffer.remaining()) {
                this.plaintextPosition += (long) this.plaintextSegment.remaining();
                byteBuffer.put(this.plaintextSegment);
            } else {
                int iRemaining = byteBuffer.remaining();
                ByteBuffer byteBufferDuplicate = this.plaintextSegment.duplicate();
                byteBufferDuplicate.limit(byteBufferDuplicate.position() + iRemaining);
                byteBuffer.put(byteBufferDuplicate);
                this.plaintextPosition += (long) iRemaining;
                ByteBuffer byteBuffer2 = this.plaintextSegment;
                byteBuffer2.position(byteBuffer2.position() + iRemaining);
            }
        }
        int iPosition2 = byteBuffer.position() - iPosition;
        if (iPosition2 == 0 && reachedEnd()) {
            return -1;
        }
        return iPosition2;
    }

    @Override // java.nio.channels.SeekableByteChannel
    public long size() {
        return this.plaintextSize;
    }

    public synchronized String toString() {
        StringBuilder sb3;
        String str;
        sb3 = new StringBuilder();
        try {
            str = "position:" + this.ciphertextChannel.position();
        } catch (IOException unused) {
            str = "position: n/a";
        }
        sb3.append("StreamingAeadSeekableDecryptingChannel\nciphertextChannel");
        sb3.append(str);
        sb3.append("\nciphertextChannelSize:");
        sb3.append(this.ciphertextChannelSize);
        sb3.append("\nplaintextSize:");
        sb3.append(this.plaintextSize);
        sb3.append("\nciphertextSegmentSize:");
        sb3.append(this.ciphertextSegmentSize);
        sb3.append("\nnumberOfSegments:");
        sb3.append(this.numberOfSegments);
        sb3.append("\nheaderRead:");
        sb3.append(this.headerRead);
        sb3.append("\nplaintextPosition:");
        sb3.append(this.plaintextPosition);
        sb3.append("\nHeader position:");
        sb3.append(this.header.position());
        sb3.append(" limit:");
        sb3.append(this.header.position());
        sb3.append("\ncurrentSegmentNr:");
        sb3.append(this.currentSegmentNr);
        sb3.append("\nciphertextSgement position:");
        sb3.append(this.ciphertextSegment.position());
        sb3.append(" limit:");
        sb3.append(this.ciphertextSegment.limit());
        sb3.append("\nisCurrentSegmentDecrypted:");
        sb3.append(this.isCurrentSegmentDecrypted);
        sb3.append("\nplaintextSegment position:");
        sb3.append(this.plaintextSegment.position());
        sb3.append(" limit:");
        sb3.append(this.plaintextSegment.limit());
        return sb3.toString();
    }

    @Override // java.nio.channels.SeekableByteChannel
    public SeekableByteChannel truncate(long j8) {
        throw new NonWritableChannelException();
    }

    public synchronized long verifiedSize() {
        if (!tryLoadSegment(this.numberOfSegments - 1)) {
            throw new IOException("could not verify the size");
        }
        return this.plaintextSize;
    }

    @Override // java.nio.channels.SeekableByteChannel, java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        throw new NonWritableChannelException();
    }

    @Override // java.nio.channels.SeekableByteChannel
    public synchronized SeekableByteChannel position(long j8) {
        this.plaintextPosition = j8;
        return this;
    }

    public synchronized int read(ByteBuffer byteBuffer, long j8) {
        int i14;
        long jPosition = position();
        try {
            position(j8);
            i14 = read(byteBuffer);
            position(jPosition);
        } catch (Throwable th3) {
            position(jPosition);
            throw th3;
        }
        return i14;
    }
}
