package org.apache.commons.io.output;

import am.j;
import java.io.InputStream;
import java.io.OutputStream;
import o2.c;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class ByteArrayOutputStream extends AbstractByteArrayOutputStream {
    public ByteArrayOutputStream(int i14) {
        if (i14 < 0) {
            h.s(j.h(i14, "Negative initial size: "));
            throw null;
        }
        synchronized (this) {
            needNewBuffer(i14);
        }
    }

    public static InputStream toBufferedInputStream(InputStream inputStream, int i14) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i14);
        try {
            byteArrayOutputStream.write(inputStream);
            InputStream inputStream2 = byteArrayOutputStream.toInputStream();
            byteArrayOutputStream.close();
            return inputStream2;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    th3.addSuppressed(th5);
                }
                throw th4;
            }
        }
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized void reset() {
        resetImpl();
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized int size() {
        return this.count;
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized byte[] toByteArray() {
        return toByteArrayImpl();
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized InputStream toInputStream() {
        return toInputStream(new c(25));
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i14, int i15) {
        int i16;
        if (i14 < 0 || i14 > bArr.length || i15 < 0 || (i16 = i14 + i15) > bArr.length || i16 < 0) {
            c.q();
        } else {
            if (i15 == 0) {
                return;
            }
            synchronized (this) {
                writeImpl(bArr, i14, i15);
            }
        }
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized void writeTo(OutputStream outputStream) {
        writeToImpl(outputStream);
    }

    public ByteArrayOutputStream() {
        this(1024);
    }

    public static InputStream toBufferedInputStream(InputStream inputStream) {
        return toBufferedInputStream(inputStream, 1024);
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i14) {
        writeImpl(i14);
    }

    @Override // org.apache.commons.io.output.AbstractByteArrayOutputStream
    public synchronized int write(InputStream inputStream) {
        return writeImpl(inputStream);
    }
}
