package org.apache.commons.io.output;

import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public class StringBuilderWriter extends Writer implements Serializable {
    private static final long serialVersionUID = -146927496096066153L;
    private final StringBuilder builder;

    public StringBuilderWriter(StringBuilder sb3) {
        this.builder = sb3 == null ? new StringBuilder() : sb3;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c14) {
        this.builder.append(c14);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public StringBuilder getBuilder() {
        return this.builder;
    }

    public String toString() {
        return this.builder.toString();
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.builder.append(str);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i14, int i15) {
        if (cArr != null) {
            this.builder.append(cArr, i14, i15);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.builder.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i14, int i15) {
        this.builder.append(charSequence, i14, i15);
        return this;
    }

    public StringBuilderWriter(int i14) {
        this.builder = new StringBuilder(i14);
    }

    public StringBuilderWriter() {
        this.builder = new StringBuilder();
    }
}
