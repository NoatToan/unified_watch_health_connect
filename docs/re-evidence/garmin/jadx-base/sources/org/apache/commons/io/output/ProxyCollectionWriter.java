package org.apache.commons.io.output;

import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
public class ProxyCollectionWriter extends FilterCollectionWriter {
    public ProxyCollectionWriter(Collection<Writer> collection) {
        super(collection);
    }

    public void afterWrite(int i14) {
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        try {
            int length = IOUtils.length(charSequence);
            beforeWrite(length);
            super.append(charSequence);
            afterWrite(length);
            return this;
        } catch (IOException e4) {
            handleIOException(e4);
            return this;
        }
    }

    public void beforeWrite(int i14) {
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
        } catch (IOException e4) {
            handleIOException(e4);
        }
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e4) {
            handleIOException(e4);
        }
    }

    public void handleIOException(IOException iOException) throws IOException {
        throw iOException;
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer
    public void write(char[] cArr) throws IOException {
        try {
            int length = IOUtils.length(cArr);
            beforeWrite(length);
            super.write(cArr);
            afterWrite(length);
        } catch (IOException e4) {
            handleIOException(e4);
        }
    }

    public ProxyCollectionWriter(Writer... writerArr) {
        super(writerArr);
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer
    public void write(char[] cArr, int i14, int i15) throws IOException {
        try {
            beforeWrite(i15);
            super.write(cArr, i14, i15);
            afterWrite(i15);
        } catch (IOException e4) {
            handleIOException(e4);
        }
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer, java.lang.Appendable
    public Writer append(char c14) throws IOException {
        try {
            beforeWrite(1);
            super.append(c14);
            afterWrite(1);
            return this;
        } catch (IOException e4) {
            handleIOException(e4);
            return this;
        }
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer
    public void write(int i14) throws IOException {
        try {
            beforeWrite(1);
            super.write(i14);
            afterWrite(1);
        } catch (IOException e4) {
            handleIOException(e4);
        }
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i14, int i15) throws IOException {
        int i16 = i15 - i14;
        try {
            beforeWrite(i16);
            super.append(charSequence, i14, i15);
            afterWrite(i16);
            return this;
        } catch (IOException e4) {
            handleIOException(e4);
            return this;
        }
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer
    public void write(String str) throws IOException {
        try {
            int length = IOUtils.length(str);
            beforeWrite(length);
            super.write(str);
            afterWrite(length);
        } catch (IOException e4) {
            handleIOException(e4);
        }
    }

    @Override // org.apache.commons.io.output.FilterCollectionWriter, java.io.Writer
    public void write(String str, int i14, int i15) throws IOException {
        try {
            beforeWrite(i15);
            super.write(str, i14, i15);
            afterWrite(i15);
        } catch (IOException e4) {
            handleIOException(e4);
        }
    }
}
