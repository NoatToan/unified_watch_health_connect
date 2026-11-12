package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.io.ElementTypesAreNonnullByDefault;
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

/* JADX INFO: loaded from: classes21.dex */
@ElementTypesAreNonnullByDefault
public final class apf extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharsetEncoder f650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer f651c;
    private boolean d;
    private CharBuffer e;
    private final byte[] f;
    private boolean g;
    private final Reader h;

    public apf(Reader reader, Charset charset, int i) {
        this(reader, charset.newEncoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE), i);
    }

    apf(Reader reader, CharsetEncoder charsetEncoder, int i) {
        this.f = new byte[1];
        this.h = (Reader) Preconditions.checkNotNull(reader);
        this.f650b = (CharsetEncoder) Preconditions.checkNotNull(charsetEncoder);
        Preconditions.checkArgument(i > 0, "bufferSize must be positive: %s", i);
        charsetEncoder.reset();
        CharBuffer charBufferAllocate = CharBuffer.allocate(i);
        this.e = charBufferAllocate;
        apd.b(charBufferAllocate);
        this.f651c = ByteBuffer.allocate(i);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.h.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f) == 1) {
            return UnsignedBytes.c(this.f[0]);
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        CoderResult coderResultEncode;
        Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        if (i2 == 0) {
            return 0;
        }
        boolean z = this.g;
        int iC = 0;
        while (true) {
            if (this.f649a) {
                iC += c(bArr, i + iC, i2 - iC);
                if (iC == i2 || this.d) {
                    break;
                }
                this.f649a = false;
                apd.d(this.f651c);
            }
            while (true) {
                if (this.d) {
                    coderResultEncode = CoderResult.UNDERFLOW;
                } else if (z) {
                    coderResultEncode = this.f650b.flush(this.f651c);
                } else {
                    coderResultEncode = this.f650b.encode(this.e, this.f651c, this.g);
                }
                if (coderResultEncode.isOverflow()) {
                    b(true);
                    break;
                }
                if (coderResultEncode.isUnderflow()) {
                    if (z) {
                        this.d = true;
                        b(false);
                        break;
                    }
                    if (this.g) {
                        z = true;
                    } else {
                        d();
                    }
                } else if (coderResultEncode.isError()) {
                    coderResultEncode.throwException();
                    return 0;
                }
            }
        }
        if (iC > 0) {
            return iC;
        }
        return -1;
    }

    private static CharBuffer a(CharBuffer charBuffer) {
        CharBuffer charBufferWrap = CharBuffer.wrap(Arrays.copyOf(charBuffer.array(), charBuffer.capacity() * 2));
        apd.d(charBufferWrap, charBuffer.position());
        apd.a(charBufferWrap, charBuffer.limit());
        return charBufferWrap;
    }

    private void d() throws IOException {
        if (d(this.e) == 0) {
            if (this.e.position() > 0) {
                apd.b(this.e.compact());
            } else {
                this.e = a(this.e);
            }
        }
        int iLimit = this.e.limit();
        int i = this.h.read(this.e.array(), iLimit, d(this.e));
        if (i == -1) {
            this.g = true;
        } else {
            apd.a(this.e, iLimit + i);
        }
    }

    private static int d(Buffer buffer) {
        return buffer.capacity() - buffer.limit();
    }

    private void b(boolean z) {
        apd.b(this.f651c);
        if (z && this.f651c.remaining() == 0) {
            this.f651c = ByteBuffer.allocate(this.f651c.capacity() * 2);
        } else {
            this.f649a = true;
        }
    }

    private int c(byte[] bArr, int i, int i2) {
        int iMin = Math.min(i2, this.f651c.remaining());
        this.f651c.get(bArr, i, iMin);
        return iMin;
    }
}
