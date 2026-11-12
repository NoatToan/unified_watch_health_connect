package cn.hutool.core.collection;

import cn.hutool.core.io.IORuntimeException;
import defpackage.cid;
import defpackage.qk1;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class LineIter implements Iterator<String>, Iterable<String>, Closeable, Serializable {
    private static final long serialVersionUID = 1;
    private final BufferedReader bufferedReader;
    private String cachedLine;
    private boolean finished;

    public LineIter(InputStream inputStream, Charset charset) throws IllegalArgumentException {
        this(cid.e(inputStream, charset));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.finished = true;
        cid.a(this.bufferedReader);
        this.cachedLine = null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws IORuntimeException {
        String line;
        if (this.cachedLine != null) {
            return true;
        }
        if (this.finished) {
            return false;
        }
        do {
            try {
                line = this.bufferedReader.readLine();
                if (line == null) {
                    this.finished = true;
                    return false;
                }
            } catch (IOException e) {
                close();
                throw new IORuntimeException(e);
            }
        } while (!isValidLine(line));
        this.cachedLine = line;
        return true;
    }

    public boolean isValidLine(String str) {
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return this;
    }

    public String nextLine() throws NoSuchElementException {
        if (!hasNext()) {
            throw new NoSuchElementException("No more lines");
        }
        String str = this.cachedLine;
        this.cachedLine = null;
        return str;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Remove unsupported on LineIterator");
    }

    public LineIter(Reader reader) throws IllegalArgumentException {
        this.finished = false;
        qk1.u(reader, "Reader must not be null", new Object[0]);
        this.bufferedReader = cid.f(reader);
    }

    @Override // java.util.Iterator
    public String next() throws NoSuchElementException {
        return nextLine();
    }
}
