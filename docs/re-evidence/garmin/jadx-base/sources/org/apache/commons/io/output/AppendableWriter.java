package org.apache.commons.io.output;

import ds.e0;
import java.io.IOException;
import java.io.Writer;
import java.lang.Appendable;
import java.util.Objects;
import yc.l2;

/* JADX INFO: loaded from: classes3.dex */
public class AppendableWriter<T extends Appendable> extends Writer {
    private final T appendable;

    public AppendableWriter(T t7) {
        this.appendable = t7;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c14) throws IOException {
        this.appendable.append(c14);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public T getAppendable() {
        return this.appendable;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i14, int i15) throws IOException {
        Objects.requireNonNull(cArr, "Character array is missing");
        if (i15 < 0 || i14 + i15 > cArr.length) {
            StringBuilder sb3 = new StringBuilder("Array Size=");
            e0.m(cArr.length, i14, ", offset=", ", length=", sb3);
            l2.j(i15, sb3);
        } else {
            for (int i16 = 0; i16 < i15; i16++) {
                this.appendable.append(cArr[i14 + i16]);
            }
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        this.appendable.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i14, int i15) throws IOException {
        this.appendable.append(charSequence, i14, i15);
        return this;
    }

    @Override // java.io.Writer
    public void write(int i14) throws IOException {
        this.appendable.append((char) i14);
    }

    @Override // java.io.Writer
    public void write(String str, int i14, int i15) throws IOException {
        Objects.requireNonNull(str, "String is missing");
        this.appendable.append(str, i14, i15 + i14);
    }
}
