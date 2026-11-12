package org.apache.commons.codec.binary;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import o2.c;

/* JADX INFO: loaded from: classes3.dex */
public class BaseNCodecOutputStream extends FilterOutputStream {
    private final BaseNCodec baseNCodec;
    private final BaseNCodec.Context context;
    private final boolean doEncode;
    private final byte[] singleByte;

    public BaseNCodecOutputStream(OutputStream outputStream, BaseNCodec baseNCodec, boolean z14) {
        super(outputStream);
        this.singleByte = new byte[1];
        this.context = new BaseNCodec.Context();
        this.baseNCodec = baseNCodec;
        this.doEncode = z14;
    }

    private void flush(boolean z14) throws IOException {
        byte[] bArr;
        int results;
        int iAvailable = this.baseNCodec.available(this.context);
        if (iAvailable > 0 && (results = this.baseNCodec.readResults((bArr = new byte[iAvailable]), 0, iAvailable, this.context)) > 0) {
            ((FilterOutputStream) this).out.write(bArr, 0, results);
        }
        if (z14) {
            ((FilterOutputStream) this).out.flush();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        eof();
        flush();
        ((FilterOutputStream) this).out.close();
    }

    public void eof() {
        boolean z14 = this.doEncode;
        BaseNCodec baseNCodec = this.baseNCodec;
        if (z14) {
            baseNCodec.encode(this.singleByte, 0, -1, this.context);
        } else {
            baseNCodec.decode(this.singleByte, 0, -1, this.context);
        }
    }

    public boolean isStrictDecoding() {
        return this.baseNCodec.isStrictDecoding();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i14, int i15) throws IOException {
        Objects.requireNonNull(bArr, "array");
        if (i14 < 0 || i15 < 0) {
            c.q();
            return;
        }
        if (i14 > bArr.length || i14 + i15 > bArr.length) {
            c.q();
            return;
        }
        if (i15 > 0) {
            boolean z14 = this.doEncode;
            BaseNCodec baseNCodec = this.baseNCodec;
            if (z14) {
                baseNCodec.encode(bArr, i14, i15, this.context);
            } else {
                baseNCodec.decode(bArr, i14, i15, this.context);
            }
            flush(false);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        flush(true);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i14) throws IOException {
        byte[] bArr = this.singleByte;
        bArr[0] = (byte) i14;
        write(bArr, 0, 1);
    }
}
