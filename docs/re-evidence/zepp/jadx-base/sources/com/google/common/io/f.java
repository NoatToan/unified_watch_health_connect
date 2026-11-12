package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
final class f extends InputStream {
    private final Reader a;
    private final CharsetEncoder b;
    private final byte[] c;
    private CharBuffer d;
    private ByteBuffer e;
    private boolean f;
    private boolean g;
    private boolean h;

    public f(Reader reader, Charset charset, int i) {
        this(reader, charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE), i);
    }

    private static int a(Buffer buffer) {
        return buffer.capacity() - buffer.limit();
    }

    private int b(byte[] bArr, int i, int i2) {
        int iMin = Math.min(i2, this.e.remaining());
        this.e.get(bArr, i, iMin);
        return iMin;
    }

    private static CharBuffer c(CharBuffer charBuffer) {
        CharBuffer charBufferWrap = CharBuffer.wrap(Arrays.copyOf(charBuffer.array(), charBuffer.capacity() * 2));
        charBufferWrap.position(charBuffer.position());
        charBufferWrap.limit(charBuffer.limit());
        return charBufferWrap;
    }

    private void d() throws IOException {
        if (a(this.d) == 0) {
            if (this.d.position() > 0) {
                this.d.compact().flip();
            } else {
                this.d = c(this.d);
            }
        }
        int iLimit = this.d.limit();
        int i = this.a.read(this.d.array(), iLimit, a(this.d));
        if (i == -1) {
            this.f = true;
        } else {
            this.d.limit(iLimit + i);
        }
    }

    private void e(boolean z) {
        this.e.flip();
        if (z && this.e.remaining() == 0) {
            this.e = ByteBuffer.allocate(this.e.capacity() * 2);
        } else {
            this.g = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.c) == 1) {
            return UnsignedBytes.toInt(this.c[0]);
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        CoderResult coderResultFlush;
        Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        if (i2 == 0) {
            return 0;
        }
        boolean z = this.f;
        int iB = 0;
        while (true) {
            if (this.g) {
                iB += b(bArr, i + iB, i2 - iB);
                if (iB == i2 || this.h) {
                    break;
                }
                this.g = false;
                this.e.clear();
            }
            while (true) {
                if (this.h) {
                    coderResultFlush = CoderResult.UNDERFLOW;
                } else {
                    coderResultFlush = z ? this.b.flush(this.e) : this.b.encode(this.d, this.e, this.f);
                }
                if (coderResultFlush.isOverflow()) {
                    e(true);
                    break;
                }
                if (coderResultFlush.isUnderflow()) {
                    if (z) {
                        this.h = true;
                        e(false);
                        break;
                    }
                    if (this.f) {
                        z = true;
                    } else {
                        d();
                    }
                } else if (coderResultFlush.isError()) {
                    coderResultFlush.throwException();
                    return 0;
                }
            }
        }
        if (iB > 0) {
            return iB;
        }
        return -1;
    }

    public f(Reader reader, CharsetEncoder charsetEncoder, int i) {
        this.c = new byte[1];
        this.a = (Reader) Preconditions.checkNotNull(reader);
        this.b = (CharsetEncoder) Preconditions.checkNotNull(charsetEncoder);
        Preconditions.checkArgument(i > 0, "bufferSize must be positive: %s", i);
        charsetEncoder.reset();
        CharBuffer charBufferAllocate = CharBuffer.allocate(i);
        this.d = charBufferAllocate;
        charBufferAllocate.flip();
        this.e = ByteBuffer.allocate(i);
    }
}
