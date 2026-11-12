package org.apache.commons.io.input.buffer;

import am.j;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class CircularBufferInputStream extends InputStream {
    protected final CircularByteBuffer buffer;
    protected final int bufferSize;
    private boolean eofSeen;

    /* JADX INFO: renamed from: in, reason: collision with root package name */
    protected final InputStream f133448in;

    public CircularBufferInputStream(InputStream inputStream, int i14) {
        if (i14 <= 0) {
            h.s(j.h(i14, "Invalid bufferSize: "));
            throw null;
        }
        Objects.requireNonNull(inputStream, "inputStream");
        this.f133448in = inputStream;
        this.buffer = new CircularByteBuffer(i14);
        this.bufferSize = i14;
        this.eofSeen = false;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f133448in.close();
        this.eofSeen = true;
        this.buffer.clear();
    }

    public void fillBuffer() throws IOException {
        if (this.eofSeen) {
            return;
        }
        int space = this.buffer.getSpace();
        byte[] bArr = new byte[space];
        while (space > 0) {
            int i14 = this.f133448in.read(bArr, 0, space);
            if (i14 == -1) {
                this.eofSeen = true;
                return;
            } else if (i14 > 0) {
                this.buffer.add(bArr, 0, i14);
                space -= i14;
            }
        }
    }

    public boolean haveBytes(int i14) throws IOException {
        if (this.buffer.getCurrentNumberOfBytes() < i14) {
            fillBuffer();
        }
        return this.buffer.hasBytes();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i14, int i15) {
        Objects.requireNonNull(bArr, "Buffer");
        if (i14 < 0) {
            h.s("Offset must not be negative");
            return 0;
        }
        if (i15 < 0) {
            h.s("Length must not be negative");
            return 0;
        }
        if (!haveBytes(i15)) {
            return -1;
        }
        int iMin = Math.min(i15, this.buffer.getCurrentNumberOfBytes());
        for (int i16 = 0; i16 < iMin; i16++) {
            bArr[i14 + i16] = this.buffer.read();
        }
        return iMin;
    }

    public CircularBufferInputStream(InputStream inputStream) {
        this(inputStream, 8192);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read() {
        if (haveBytes(1)) {
            return this.buffer.read() & UnsignedBytes.MAX_VALUE;
        }
        return -1;
    }
}
