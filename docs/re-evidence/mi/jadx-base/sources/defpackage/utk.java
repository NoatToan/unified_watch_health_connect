package defpackage;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class utk extends BufferedOutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f36121a;

    public utk(OutputStream outputStream) {
        super(outputStream);
    }

    public void a(OutputStream outputStream) {
        rk1.g(this.f36121a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f36121a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f36121a = true;
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
            wlq.K0(th);
        }
    }

    public utk(OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
