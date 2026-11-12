package w63;

import java.io.EOFException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw63/d;", "Lw63/f0;", "<init>", "()V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements f0 {
    @Override // w63.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // w63.f0, java.io.Flushable
    public final void flush() {
    }

    @Override // w63.f0
    public final h0 timeout() {
        return h0.NONE;
    }

    @Override // w63.f0
    public final void write(e eVar, long j8) throws EOFException {
        eVar.getClass();
        eVar.skip(j8);
    }
}
