package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class CharSequenceInputStream extends InputStream {
    private static final int f = 2048;
    private static final int g = -1;
    private final CharsetEncoder a;
    private final CharBuffer b;
    private final ByteBuffer c;
    private int d;
    private int e;

    public CharSequenceInputStream(CharSequence charSequence, Charset charset, int i) {
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
        this.a = charsetEncoderOnUnmappableCharacter;
        float fMaxBytesPerChar = charsetEncoderOnUnmappableCharacter.maxBytesPerChar();
        if (i < fMaxBytesPerChar) {
            throw new IllegalArgumentException("Buffer size " + i + " is less than maxBytesPerChar " + fMaxBytesPerChar);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        this.c = byteBufferAllocate;
        byteBufferAllocate.flip();
        this.b = CharBuffer.wrap(charSequence);
        this.d = -1;
        this.e = -1;
    }

    private void a() throws CharacterCodingException {
        this.c.compact();
        CoderResult coderResultEncode = this.a.encode(this.b, this.c, true);
        if (coderResultEncode.isError()) {
            coderResultEncode.throwException();
        }
        this.c.flip();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.c.remaining() + this.b.remaining();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        this.d = this.b.position();
        this.e = this.c.position();
        this.b.mark();
        this.c.mark();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        Objects.requireNonNull(bArr, "Byte array is null");
        if (i2 < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException("Array Size=" + bArr.length + ", offset=" + i + ", length=" + i2);
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (!this.c.hasRemaining() && !this.b.hasRemaining()) {
            return -1;
        }
        while (i2 > 0) {
            if (!this.c.hasRemaining()) {
                a();
                if (!this.c.hasRemaining() && !this.b.hasRemaining()) {
                    break;
                }
            } else {
                int iMin = Math.min(this.c.remaining(), i2);
                this.c.get(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
                i3 += iMin;
            }
        }
        if (i3 != 0 || this.b.hasRemaining()) {
            return i3;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.d != -1) {
            if (this.b.position() != 0) {
                this.a.reset();
                this.b.rewind();
                this.c.rewind();
                this.c.limit(0);
                while (this.b.position() < this.d) {
                    this.c.rewind();
                    this.c.limit(0);
                    a();
                }
            }
            if (this.b.position() != this.d) {
                throw new IllegalStateException("Unexpected CharBuffer postion: actual=" + this.b.position() + " expected=" + this.d);
            }
            this.c.position(this.e);
            this.d = -1;
            this.e = -1;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long j2 = 0;
        while (j > 0 && available() > 0) {
            read();
            j--;
            j2++;
        }
        return j2;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (!this.c.hasRemaining()) {
            a();
            if (!this.c.hasRemaining() && !this.b.hasRemaining()) {
                return -1;
            }
        }
        return this.c.get() & 255;
    }

    public CharSequenceInputStream(CharSequence charSequence, String str, int i) {
        this(charSequence, Charset.forName(str), i);
    }

    public CharSequenceInputStream(CharSequence charSequence, Charset charset) {
        this(charSequence, charset, 2048);
    }

    public CharSequenceInputStream(CharSequence charSequence, String str) {
        this(charSequence, str, 2048);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
