package org.apache.commons.io.input;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ProxyReader extends FilterReader {
    public ProxyReader(Reader reader) {
        super(reader);
    }

    public void afterRead(int i14) {
    }

    public void beforeRead(int i14) {
    }

    @Override // java.io.FilterReader, java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            ((FilterReader) this).in.close();
        } catch (IOException e4) {
            handleIOException(e4);
        }
    }

    public void handleIOException(IOException iOException) throws IOException {
        throw iOException;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public synchronized void mark(int i14) {
        try {
            ((FilterReader) this).in.mark(i14);
        } catch (IOException e4) {
            handleIOException(e4);
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public boolean markSupported() {
        return ((FilterReader) this).in.markSupported();
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        int i14 = 1;
        try {
            beforeRead(1);
            int i15 = ((FilterReader) this).in.read();
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

    @Override // java.io.FilterReader, java.io.Reader
    public boolean ready() throws IOException {
        try {
            return ((FilterReader) this).in.ready();
        } catch (IOException e4) {
            handleIOException(e4);
            return false;
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public synchronized void reset() {
        try {
            ((FilterReader) this).in.reset();
        } catch (IOException e4) {
            handleIOException(e4);
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public long skip(long j8) throws IOException {
        try {
            return ((FilterReader) this).in.skip(j8);
        } catch (IOException e4) {
            handleIOException(e4);
            return 0L;
        }
    }

    @Override // java.io.Reader
    public int read(char[] cArr) throws IOException {
        try {
            beforeRead(IOUtils.length(cArr));
            int i14 = ((FilterReader) this).in.read(cArr);
            afterRead(i14);
            return i14;
        } catch (IOException e4) {
            handleIOException(e4);
            return -1;
        }
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i14, int i15) throws IOException {
        try {
            beforeRead(i15);
            int i16 = ((FilterReader) this).in.read(cArr, i14, i15);
            afterRead(i16);
            return i16;
        } catch (IOException e4) {
            handleIOException(e4);
            return -1;
        }
    }

    @Override // java.io.Reader, java.lang.Readable
    public int read(CharBuffer charBuffer) throws IOException {
        try {
            beforeRead(IOUtils.length(charBuffer));
            int i14 = ((FilterReader) this).in.read(charBuffer);
            afterRead(i14);
            return i14;
        } catch (IOException e4) {
            handleIOException(e4);
            return -1;
        }
    }
}
