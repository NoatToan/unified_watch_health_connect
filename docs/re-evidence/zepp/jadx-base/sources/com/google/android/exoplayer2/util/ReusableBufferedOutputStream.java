package com.google.android.exoplayer2.util;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class ReusableBufferedOutputStream extends BufferedOutputStream {
    private boolean a;

    public ReusableBufferedOutputStream(OutputStream out) {
        super(out);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.a = true;
        flush();
        th = null;
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        if (th != null) {
            Util.sneakyThrow(th);
        }
    }

    public void reset(OutputStream out) {
        Assertions.checkState(this.a);
        ((BufferedOutputStream) this).out = out;
        ((BufferedOutputStream) this).count = 0;
        this.a = false;
    }

    public ReusableBufferedOutputStream(OutputStream out, int size) {
        super(out, size);
    }
}
