package org.apache.commons.io.input;

import com.google.common.primitives.UnsignedBytes;
import ds.e0;
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
import yc.l2;

/* JADX INFO: loaded from: classes3.dex */
public class ReaderInputStream extends InputStream {
    private static final int DEFAULT_BUFFER_SIZE = 1024;
    private final CharsetEncoder encoder;
    private final CharBuffer encoderIn;
    private final ByteBuffer encoderOut;
    private boolean endOfInput;
    private CoderResult lastCoderResult;
    private final Reader reader;

    public ReaderInputStream(Reader reader, CharsetEncoder charsetEncoder, int i14) {
        this.reader = reader;
        this.encoder = charsetEncoder;
        CharBuffer charBufferAllocate = CharBuffer.allocate(i14);
        this.encoderIn = charBufferAllocate;
        charBufferAllocate.flip();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(128);
        this.encoderOut = byteBufferAllocate;
        byteBufferAllocate.flip();
    }

    private void fillBuffer() throws IOException {
        CoderResult coderResult;
        if (!this.endOfInput && ((coderResult = this.lastCoderResult) == null || coderResult.isUnderflow())) {
            this.encoderIn.compact();
            int iPosition = this.encoderIn.position();
            int i14 = this.reader.read(this.encoderIn.array(), iPosition, this.encoderIn.remaining());
            if (i14 == -1) {
                this.endOfInput = true;
            } else {
                this.encoderIn.position(iPosition + i14);
            }
            this.encoderIn.flip();
        }
        this.encoderOut.compact();
        this.lastCoderResult = this.encoder.encode(this.encoderIn, this.encoderOut, this.endOfInput);
        this.encoderOut.flip();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.reader.close();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i14, int i15) throws IOException {
        Objects.requireNonNull(bArr, "array");
        if (i15 < 0 || i14 < 0 || i14 + i15 > bArr.length) {
            StringBuilder sb3 = new StringBuilder("Array Size=");
            e0.m(bArr.length, i14, ", offset=", ", length=", sb3);
            l2.j(i15, sb3);
            return 0;
        }
        int i16 = 0;
        if (i15 == 0) {
            return 0;
        }
        while (i15 > 0) {
            if (!this.encoderOut.hasRemaining()) {
                fillBuffer();
                if (this.endOfInput && !this.encoderOut.hasRemaining()) {
                    break;
                }
            } else {
                int iMin = Math.min(this.encoderOut.remaining(), i15);
                this.encoderOut.get(bArr, i14, iMin);
                i14 += iMin;
                i15 -= iMin;
                i16 += iMin;
            }
        }
        if (i16 == 0 && this.endOfInput) {
            return -1;
        }
        return i16;
    }

    public ReaderInputStream(Reader reader, CharsetEncoder charsetEncoder) {
        this(reader, charsetEncoder, 1024);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ReaderInputStream(Reader reader, Charset charset, int i14) {
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this(reader, charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction), i14);
    }

    public ReaderInputStream(Reader reader, Charset charset) {
        this(reader, charset, 1024);
    }

    public ReaderInputStream(Reader reader, String str, int i14) {
        this(reader, Charset.forName(str), i14);
    }

    public ReaderInputStream(Reader reader, String str) {
        this(reader, str, 1024);
    }

    @Deprecated
    public ReaderInputStream(Reader reader) {
        this(reader, Charset.defaultCharset());
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (!this.encoderOut.hasRemaining()) {
            fillBuffer();
            if (this.endOfInput && !this.encoderOut.hasRemaining()) {
                return -1;
            }
        }
        return this.encoderOut.get() & UnsignedBytes.MAX_VALUE;
    }
}
