package org.apache.commons.io.output;

import am.j;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import o2.c;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public final class UnsynchronizedByteArrayOutputStream extends AbstractByteArrayOutputStream {
    public UnsynchronizedByteArrayOutputStream(int i14) {
        if (i14 >= 0) {
            needNewBuffer(i14);
        } else {
            h.s(j.h(i14, "Negative initial size: "));
            throw null;
        }
    }

    public static InputStream toBufferedInputStream(InputStream inputStream, int i14) {
        UnsynchronizedByteArrayOutputStream unsynchronizedByteArrayOutputStream = new UnsynchronizedByteArrayOutputStream(i14);
        try {
            unsynchronizedByteArrayOutputStream.write(inputStream);
            InputStream inputStream2 = unsynchronizedByteArrayOutputStream.toInputStream();
            unsynchronizedByteArrayOutputStream.close();
            return inputStream2;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    unsynchronizedByteArrayOutputStream.close();
                } catch (Throwable th5) {
                    th3.addSuppressed(th5);
                }
                throw th4;
            }
        }
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public void reset() {
        resetImpl();
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public int size() {
        return this.count;
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public byte[] toByteArray() {
        return toByteArrayImpl();
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public InputStream toInputStream() {
        return toInputStream(new c(26));
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i14, int i15) {
        int i16;
        if (i14 < 0 || i14 > bArr.length || i15 < 0 || (i16 = i14 + i15) > bArr.length || i16 < 0) {
            throw new IndexOutOfBoundsException(String.format("offset=%,d, length=%,d", Integer.valueOf(i14), Integer.valueOf(i15)));
        }
        if (i15 == 0) {
            return;
        }
        writeImpl(bArr, i14, i15);
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public void writeTo(OutputStream outputStream) throws IOException {
        writeToImpl(outputStream);
    }

    public UnsynchronizedByteArrayOutputStream() {
        this(1024);
    }

    public static InputStream toBufferedInputStream(InputStream inputStream) {
        return toBufferedInputStream(inputStream, 1024);
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream, java.io.OutputStream
    public void write(int i14) {
        writeImpl(i14);
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public int write(InputStream inputStream) {
        return writeImpl(inputStream);
    }
}
