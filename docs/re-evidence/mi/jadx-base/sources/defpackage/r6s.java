package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes5.dex */
public abstract class r6s implements Closeable {
    public abstract long a();

    public abstract InputStream b(long j, long j2) throws IOException;

    public final synchronized InputStream c() throws IOException {
        return b(0L, a());
    }
}
