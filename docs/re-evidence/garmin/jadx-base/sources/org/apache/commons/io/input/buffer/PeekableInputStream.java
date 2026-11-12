package org.apache.commons.io.input.buffer;

import am.j;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class PeekableInputStream extends CircularBufferInputStream {
    public PeekableInputStream(InputStream inputStream, int i14) {
        super(inputStream, i14);
    }

    public boolean peek(byte[] bArr) throws IOException {
        Objects.requireNonNull(bArr, "Buffer");
        if (bArr.length <= this.bufferSize) {
            if (this.buffer.getCurrentNumberOfBytes() < bArr.length) {
                fillBuffer();
            }
            return this.buffer.peek(bArr, 0, bArr.length);
        }
        StringBuilder sb3 = new StringBuilder("Peek request size of ");
        sb3.append(bArr.length);
        sb3.append(" bytes exceeds buffer size of ");
        h.s(j.q(sb3, this.bufferSize, " bytes"));
        return false;
    }

    public PeekableInputStream(InputStream inputStream) {
        super(inputStream);
    }

    public boolean peek(byte[] bArr, int i14, int i15) throws IOException {
        Objects.requireNonNull(bArr, "Buffer");
        if (bArr.length <= this.bufferSize) {
            if (this.buffer.getCurrentNumberOfBytes() < bArr.length) {
                fillBuffer();
            }
            return this.buffer.peek(bArr, i14, i15);
        }
        StringBuilder sb3 = new StringBuilder("Peek request size of ");
        sb3.append(bArr.length);
        sb3.append(" bytes exceeds buffer size of ");
        h.s(j.q(sb3, this.bufferSize, " bytes"));
        return false;
    }
}
