package org.apache.commons.io.output;

import ch.qos.logback.classic.spi.CallerData;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class WriterOutputStream extends OutputStream {
    private static final int BUFFER_SIZE = 1024;
    private final CharsetDecoder decoder;
    private final ByteBuffer decoderIn;
    private final CharBuffer decoderOut;
    private final boolean writeImmediately;
    private final Writer writer;

    public WriterOutputStream(Writer writer, CharsetDecoder charsetDecoder, int i14, boolean z14) {
        this.decoderIn = ByteBuffer.allocate(128);
        checkIbmJdkWithBrokenUTF16(charsetDecoder.charset());
        this.writer = writer;
        this.decoder = charsetDecoder;
        this.writeImmediately = z14;
        this.decoderOut = CharBuffer.allocate(i14);
    }

    private static void checkIbmJdkWithBrokenUTF16(Charset charset) {
        if ("UTF-16".equals(charset.name())) {
            byte[] bytes = "vés".getBytes(charset);
            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            CharBuffer charBufferAllocate = CharBuffer.allocate(3);
            int length = bytes.length;
            int i14 = 0;
            while (i14 < length) {
                byteBufferAllocate.put(bytes[i14]);
                byteBufferAllocate.flip();
                try {
                    charsetDecoderNewDecoder.decode(byteBufferAllocate, charBufferAllocate, i14 == length + (-1));
                    byteBufferAllocate.compact();
                    i14++;
                } catch (IllegalArgumentException unused) {
                    e.w("UTF-16 requested when runninng on an IBM JDK with broken UTF-16 support. Please find a JDK that supports UTF-16 if you intend to use UF-16 with WriterOutputStream");
                    return;
                }
            }
            charBufferAllocate.rewind();
            if ("vés".equals(charBufferAllocate.toString())) {
                return;
            }
            e.w("UTF-16 requested when runninng on an IBM JDK with broken UTF-16 support. Please find a JDK that supports UTF-16 if you intend to use UF-16 with WriterOutputStream");
        }
    }

    private void flushOutput() throws IOException {
        if (this.decoderOut.position() > 0) {
            this.writer.write(this.decoderOut.array(), 0, this.decoderOut.position());
            this.decoderOut.rewind();
        }
    }

    private void processInput(boolean z14) throws IOException {
        CoderResult coderResultDecode;
        this.decoderIn.flip();
        while (true) {
            coderResultDecode = this.decoder.decode(this.decoderIn, this.decoderOut, z14);
            if (!coderResultDecode.isOverflow()) {
                break;
            } else {
                flushOutput();
            }
        }
        if (coderResultDecode.isUnderflow()) {
            this.decoderIn.compact();
        } else {
            h.C("Unexpected coder result");
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        processInput(true);
        flushOutput();
        this.writer.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        flushOutput();
        this.writer.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i14, int i15) throws IOException {
        while (i15 > 0) {
            int iMin = Math.min(i15, this.decoderIn.remaining());
            this.decoderIn.put(bArr, i14, iMin);
            processInput(false);
            i15 -= iMin;
            i14 += iMin;
        }
        if (this.writeImmediately) {
            flushOutput();
        }
    }

    public WriterOutputStream(Writer writer, CharsetDecoder charsetDecoder) {
        this(writer, charsetDecoder, 1024, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WriterOutputStream(Writer writer, Charset charset, int i14, boolean z14) {
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this(writer, charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).replaceWith(CallerData.NA), i14, z14);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i14) throws IOException {
        write(new byte[]{(byte) i14}, 0, 1);
    }

    public WriterOutputStream(Writer writer, Charset charset) {
        this(writer, charset, 1024, false);
    }

    public WriterOutputStream(Writer writer, String str, int i14, boolean z14) {
        this(writer, Charset.forName(str), i14, z14);
    }

    public WriterOutputStream(Writer writer, String str) {
        this(writer, str, 1024, false);
    }

    @Deprecated
    public WriterOutputStream(Writer writer) {
        this(writer, Charset.defaultCharset(), 1024, false);
    }
}
