package defpackage;

import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class kpe extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public StringBuilder f24139b = new StringBuilder(128);

    public kpe(String str) {
        this.f24138a = str;
    }

    public final void a() {
        if (this.f24139b.length() > 0) {
            this.f24139b.toString();
            StringBuilder sb = this.f24139b;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                a();
            } else {
                this.f24139b.append(c);
            }
        }
    }
}
