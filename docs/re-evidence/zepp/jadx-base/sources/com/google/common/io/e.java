package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
class e extends Reader {
    private final Iterator<? extends CharSource> a;

    @NullableDecl
    private Reader b;

    public e(Iterator<? extends CharSource> it2) throws IOException {
        this.a = it2;
        a();
    }

    private void a() throws IOException {
        close();
        if (this.a.hasNext()) {
            this.b = this.a.next().openStream();
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Reader reader = this.b;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.b = null;
            }
        }
    }

    @Override // java.io.Reader
    public int read(@NullableDecl char[] cArr, int i, int i2) throws IOException {
        Reader reader = this.b;
        if (reader == null) {
            return -1;
        }
        int i3 = reader.read(cArr, i, i2);
        if (i3 != -1) {
            return i3;
        }
        a();
        return read(cArr, i, i2);
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        Reader reader = this.b;
        return reader != null && reader.ready();
    }

    @Override // java.io.Reader
    public long skip(long j) throws IOException {
        Preconditions.checkArgument(j >= 0, "n is negative");
        if (j > 0) {
            while (true) {
                Reader reader = this.b;
                if (reader == null) {
                    break;
                }
                long jSkip = reader.skip(j);
                if (jSkip > 0) {
                    return jSkip;
                }
                a();
            }
        }
        return 0L;
    }
}
