package androidx.fragment.app;

import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f7318a = new StringBuilder(128);

    public o0(String str) {
    }

    public final void a() {
        StringBuilder sb3 = this.f7318a;
        if (sb3.length() > 0) {
            sb3.toString();
            sb3.delete(0, sb3.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i14, int i15) {
        for (int i16 = 0; i16 < i15; i16++) {
            char c14 = cArr[i14 + i16];
            if (c14 == '\n') {
                a();
            } else {
                this.f7318a.append(c14);
            }
        }
    }
}
