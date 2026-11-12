package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u14 implements Closeable, p4d {
    public tfi a() {
        return z6d.d;
    }

    public abstract int b();

    public boolean c() {
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        cm8.E("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public abstract boolean isClosed();
}
