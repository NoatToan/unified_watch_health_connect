package org.apache.commons.io.output;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import mt0.b2;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
public class ProxyOutputStream extends FilterOutputStream {
    public ProxyOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    public void afterWrite(int i14) {
    }

    public void beforeWrite(int i14) {
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IOUtils.close(((FilterOutputStream) this).out, new b2(this, 23));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public void flush() {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException e4) {
            handleIOException(e4);
        }
    }

    public void handleIOException(IOException iOException) {
        throw iOException;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        try {
            int length = IOUtils.length(bArr);
            beforeWrite(length);
            ((FilterOutputStream) this).out.write(bArr);
            afterWrite(length);
        } catch (IOException e4) {
            handleIOException(e4);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i14) {
        try {
            beforeWrite(1);
            ((FilterOutputStream) this).out.write(i14);
            afterWrite(1);
        } catch (IOException e4) {
            handleIOException(e4);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i14, int i15) {
        try {
            beforeWrite(i15);
            ((FilterOutputStream) this).out.write(bArr, i14, i15);
            afterWrite(i15);
        } catch (IOException e4) {
            handleIOException(e4);
        }
    }
}
