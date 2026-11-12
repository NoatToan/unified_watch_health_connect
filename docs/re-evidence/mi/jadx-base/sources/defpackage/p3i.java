package defpackage;

import com.facebook.common.memory.PooledByteBuffer;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class p3i extends OutputStream {
    public abstract PooledByteBuffer a();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        try {
            super.close();
        } catch (IOException e) {
            wdp.a(e);
        }
    }

    public abstract int size();
}
