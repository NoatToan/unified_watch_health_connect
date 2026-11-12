package org.apache.commons.io.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import mt0.b2;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ProxyInputStream extends FilterInputStream {
    public ProxyInputStream(InputStream inputStream) {
        super(inputStream);
    }

    public void afterRead(int i14) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        try {
            return super.available();
        } catch (IOException e4) {
            handleIOException(e4);
            return 0;
        }
    }

    public void beforeRead(int i14) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IOUtils.close(((FilterInputStream) this).in, new b2(this, 22));
    }

    public void handleIOException(IOException iOException) throws IOException {
        throw iOException;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i14) {
        ((FilterInputStream) this).in.mark(i14);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i14 = 1;
        try {
            beforeRead(1);
            int i15 = ((FilterInputStream) this).in.read();
            if (i15 == -1) {
                i14 = -1;
            }
            afterRead(i14);
            return i15;
        } catch (IOException e4) {
            handleIOException(e4);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        try {
            ((FilterInputStream) this).in.reset();
        } catch (IOException e4) {
            handleIOException(e4);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j8) throws IOException {
        try {
            return ((FilterInputStream) this).in.skip(j8);
        } catch (IOException e4) {
            handleIOException(e4);
            return 0L;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            beforeRead(IOUtils.length(bArr));
            int i14 = ((FilterInputStream) this).in.read(bArr);
            afterRead(i14);
            return i14;
        } catch (IOException e4) {
            handleIOException(e4);
            return -1;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i14, int i15) throws IOException {
        try {
            beforeRead(i15);
            int i16 = ((FilterInputStream) this).in.read(bArr, i14, i15);
            afterRead(i16);
            return i16;
        } catch (IOException e4) {
            handleIOException(e4);
            return -1;
        }
    }
}
