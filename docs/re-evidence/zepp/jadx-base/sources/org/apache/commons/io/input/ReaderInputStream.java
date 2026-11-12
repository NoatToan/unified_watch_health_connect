package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Objects;

/* JADX INFO: loaded from: classes23.dex */
public class ReaderInputStream extends InputStream {
    private static final int g = 1024;
    private final Reader a;
    private final CharsetEncoder b;
    private final CharBuffer c;
    private final ByteBuffer d;
    private CoderResult e;
    private boolean f;

    public ReaderInputStream(Reader reader, CharsetEncoder charsetEncoder) {
        this(reader, charsetEncoder, 1024);
    }

    private void a() throws IOException {
        CoderResult coderResult;
        if (!this.f && ((coderResult = this.e) == null || coderResult.isUnderflow())) {
            this.c.compact();
            int iPosition = this.c.position();
            int i = this.a.read(this.c.array(), iPosition, this.c.remaining());
            if (i == -1) {
                this.f = true;
            } else {
                this.c.position(iPosition + i);
            }
            this.c.flip();
        }
        this.d.compact();
        this.e = this.b.encode(this.c, this.d, this.f);
        this.d.flip();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        Objects.requireNonNull(bArr, "Byte array must not be null");
        if (i2 < 0 || i < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException("Array Size=" + bArr.length + ", offset=" + i + ", length=" + i2);
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i2 > 0) {
            if (!this.d.hasRemaining()) {
                a();
                if (this.f && !this.d.hasRemaining()) {
                    break;
                }
            } else {
                int iMin = Math.min(this.d.remaining(), i2);
                this.d.get(bArr, i, iMin);
                i += iMin;
                i2 -= iMin;
                i3 += iMin;
            }
        }
        if (i3 == 0 && this.f) {
            return -1;
        }
        return i3;
    }

    public ReaderInputStream(Reader reader, CharsetEncoder charsetEncoder, int i) {
        this.a = reader;
        this.b = charsetEncoder;
        CharBuffer charBufferAllocate = CharBuffer.allocate(i);
        this.c = charBufferAllocate;
        charBufferAllocate.flip();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(128);
        this.d = byteBufferAllocate;
        byteBufferAllocate.flip();
    }

    public ReaderInputStream(Reader reader, Charset charset, int i) {
        this(reader, charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE), i);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (!this.d.hasRemaining()) {
            a();
            if (this.f && !this.d.hasRemaining()) {
                return -1;
            }
        }
        return this.d.get() & 255;
    }

    public ReaderInputStream(Reader reader, Charset charset) {
        this(reader, charset, 1024);
    }

    public ReaderInputStream(Reader reader, String str, int i) {
        this(reader, Charset.forName(str), i);
    }

    public ReaderInputStream(Reader reader, String str) {
        this(reader, str, 1024);
    }

    @Deprecated
    public ReaderInputStream(Reader reader) {
        this(reader, Charset.defaultCharset());
    }
}
