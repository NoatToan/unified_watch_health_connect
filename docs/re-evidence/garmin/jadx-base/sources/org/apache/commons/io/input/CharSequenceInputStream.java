package org.apache.commons.io.input;

import com.google.common.primitives.UnsignedBytes;
import ds.e0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Objects;
import yc.l2;

/* JADX INFO: loaded from: classes3.dex */
public class CharSequenceInputStream extends InputStream {
    private static final int BUFFER_SIZE = 2048;
    private static final int NO_MARK = -1;
    private final ByteBuffer bbuf;
    private final CharBuffer cbuf;
    private final CharsetEncoder encoder;
    private int mark_bbuf;
    private int mark_cbuf;

    public CharSequenceInputStream(CharSequence charSequence, Charset charset, int i14) {
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        this.encoder = charsetEncoderOnUnmappableCharacter;
        float fMaxBytesPerChar = charsetEncoderOnUnmappableCharacter.maxBytesPerChar();
        if (i14 < fMaxBytesPerChar) {
            throw new IllegalArgumentException("Buffer size " + i14 + " is less than maxBytesPerChar " + fMaxBytesPerChar);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i14);
        this.bbuf = byteBufferAllocate;
        byteBufferAllocate.flip();
        this.cbuf = CharBuffer.wrap(charSequence);
        this.mark_cbuf = -1;
        this.mark_bbuf = -1;
    }

    private void fillBuffer() throws CharacterCodingException {
        this.bbuf.compact();
        CoderResult coderResultEncode = this.encoder.encode(this.cbuf, this.bbuf, true);
        if (coderResultEncode.isError()) {
            coderResultEncode.throwException();
        }
        this.bbuf.flip();
    }

    @Override // java.io.InputStream
    public int available() {
        return this.cbuf.remaining() + this.bbuf.remaining();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i14) {
        this.mark_cbuf = this.cbuf.position();
        this.mark_bbuf = this.bbuf.position();
        this.cbuf.mark();
        this.bbuf.mark();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i14, int i15) throws CharacterCodingException {
        Objects.requireNonNull(bArr, "array");
        if (i15 < 0 || i14 + i15 > bArr.length) {
            StringBuilder sb3 = new StringBuilder("Array Size=");
            e0.m(bArr.length, i14, ", offset=", ", length=", sb3);
            l2.j(i15, sb3);
            return 0;
        }
        int i16 = 0;
        if (i15 == 0) {
            return 0;
        }
        if (!this.bbuf.hasRemaining() && !this.cbuf.hasRemaining()) {
            return -1;
        }
        while (i15 > 0) {
            if (!this.bbuf.hasRemaining()) {
                fillBuffer();
                if (!this.bbuf.hasRemaining() && !this.cbuf.hasRemaining()) {
                    break;
                }
            } else {
                int iMin = Math.min(this.bbuf.remaining(), i15);
                this.bbuf.get(bArr, i14, iMin);
                i14 += iMin;
                i15 -= iMin;
                i16 += iMin;
            }
        }
        if (i16 != 0 || this.cbuf.hasRemaining()) {
            return i16;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        try {
            if (this.mark_cbuf != -1) {
                if (this.cbuf.position() != 0) {
                    this.encoder.reset();
                    this.cbuf.rewind();
                    this.bbuf.rewind();
                    this.bbuf.limit(0);
                    while (this.cbuf.position() < this.mark_cbuf) {
                        this.bbuf.rewind();
                        this.bbuf.limit(0);
                        fillBuffer();
                    }
                }
                if (this.cbuf.position() != this.mark_cbuf) {
                    throw new IllegalStateException("Unexpected CharBuffer position: actual=" + this.cbuf.position() + " expected=" + this.mark_cbuf);
                }
                this.bbuf.position(this.mark_bbuf);
                this.mark_cbuf = -1;
                this.mark_bbuf = -1;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j8) throws CharacterCodingException {
        long j14 = 0;
        while (j8 > 0 && available() > 0) {
            read();
            j8--;
            j14++;
        }
        return j14;
    }

    public CharSequenceInputStream(CharSequence charSequence, String str, int i14) {
        this(charSequence, Charset.forName(str), i14);
    }

    public CharSequenceInputStream(CharSequence charSequence, Charset charset) {
        this(charSequence, charset, 2048);
    }

    public CharSequenceInputStream(CharSequence charSequence, String str) {
        this(charSequence, str, 2048);
    }

    @Override // java.io.InputStream
    public int read() throws CharacterCodingException {
        while (!this.bbuf.hasRemaining()) {
            fillBuffer();
            if (!this.bbuf.hasRemaining() && !this.cbuf.hasRemaining()) {
                return -1;
            }
        }
        return this.bbuf.get() & UnsignedBytes.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
