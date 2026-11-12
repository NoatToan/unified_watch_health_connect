package org.apache.commons.codec.binary;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import o2.c;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class BaseNCodecInputStream extends FilterInputStream {
    private final BaseNCodec baseNCodec;
    private final byte[] buf;
    private final BaseNCodec.Context context;
    private final boolean doEncode;
    private final byte[] singleByte;

    public BaseNCodecInputStream(InputStream inputStream, BaseNCodec baseNCodec, boolean z14) {
        super(inputStream);
        this.singleByte = new byte[1];
        this.context = new BaseNCodec.Context();
        this.doEncode = z14;
        this.baseNCodec = baseNCodec;
        this.buf = new byte[z14 ? 4096 : 8192];
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return !this.context.eof ? 1 : 0;
    }

    public boolean isStrictDecoding() {
        return this.baseNCodec.isStrictDecoding();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i14) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i14, int i15) throws IOException {
        Objects.requireNonNull(bArr, "array");
        if (i14 < 0 || i15 < 0) {
            c.q();
            return 0;
        }
        if (i14 > bArr.length || i14 + i15 > bArr.length) {
            c.q();
            return 0;
        }
        if (i15 == 0) {
            return 0;
        }
        int i16 = 0;
        while (i16 < i15) {
            if (!this.baseNCodec.hasData(this.context)) {
                int i17 = ((FilterInputStream) this).in.read(this.buf);
                boolean z14 = this.doEncode;
                BaseNCodec baseNCodec = this.baseNCodec;
                if (z14) {
                    baseNCodec.encode(this.buf, 0, i17, this.context);
                } else {
                    baseNCodec.decode(this.buf, 0, i17, this.context);
                }
            }
            int results = this.baseNCodec.readResults(bArr, i14 + i16, i15 - i16, this.context);
            if (results < 0) {
                if (i16 != 0) {
                    break;
                }
                return -1;
            }
            i16 += results;
        }
        return i16;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        throw new IOException("mark/reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j8) {
        int i14;
        if (j8 < 0) {
            h.s(e.e(j8, "Negative skip length: "));
            return 0L;
        }
        byte[] bArr = new byte[512];
        long j14 = j8;
        while (j14 > 0 && (i14 = read(bArr, 0, (int) Math.min(512, j14))) != -1) {
            j14 -= (long) i14;
        }
        return j8 - j14;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i14 = read(this.singleByte, 0, 1);
        while (i14 == 0) {
            i14 = read(this.singleByte, 0, 1);
        }
        if (i14 <= 0) {
            return -1;
        }
        byte b14 = this.singleByte[0];
        return b14 < 0 ? b14 + 256 : b14;
    }
}
