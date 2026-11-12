package org.apache.commons.io.output;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;
import mt0.b2;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
public class ProxyWriter extends FilterWriter {
    public ProxyWriter(Writer writer) {
        super(writer);
    }

    public void afterWrite(int i14) {
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        try {
            int length = IOUtils.length(charSequence);
            beforeWrite(length);
            ((FilterWriter) this).out.append(charSequence);
            afterWrite(length);
            return this;
        } catch (IOException e4) {
            handleIOException(e4);
            return this;
        }
    }

    public void beforeWrite(int i14) {
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IOUtils.close(((FilterWriter) this).out, new b2(this, 24));
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Flushable
    public void flush() {
        try {
            ((FilterWriter) this).out.flush();
        } catch (IOException e4) {
            handleIOException(e4);
        }
    }

    public void handleIOException(IOException iOException) {
        throw iOException;
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        try {
            int length = IOUtils.length(cArr);
            beforeWrite(length);
            ((FilterWriter) this).out.write(cArr);
            afterWrite(length);
        } catch (IOException e4) {
            handleIOException(e4);
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int i14) {
        try {
            beforeWrite(1);
            ((FilterWriter) this).out.write(i14);
            afterWrite(1);
        } catch (IOException e4) {
            handleIOException(e4);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c14) {
        try {
            beforeWrite(1);
            ((FilterWriter) this).out.append(c14);
            afterWrite(1);
            return this;
        } catch (IOException e4) {
            handleIOException(e4);
            return this;
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i14, int i15) {
        try {
            beforeWrite(i15);
            ((FilterWriter) this).out.write(cArr, i14, i15);
            afterWrite(i15);
        } catch (IOException e4) {
            handleIOException(e4);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i14, int i15) {
        int i16 = i15 - i14;
        try {
            beforeWrite(i16);
            ((FilterWriter) this).out.append(charSequence, i14, i15);
            afterWrite(i16);
            return this;
        } catch (IOException e4) {
            handleIOException(e4);
            return this;
        }
    }

    @Override // java.io.Writer
    public void write(String str) {
        try {
            int length = IOUtils.length(str);
            beforeWrite(length);
            ((FilterWriter) this).out.write(str);
            afterWrite(length);
        } catch (IOException e4) {
            handleIOException(e4);
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(String str, int i14, int i15) {
        try {
            beforeWrite(i15);
            ((FilterWriter) this).out.write(str, i14, i15);
            afterWrite(i15);
        } catch (IOException e4) {
            handleIOException(e4);
        }
    }
}
