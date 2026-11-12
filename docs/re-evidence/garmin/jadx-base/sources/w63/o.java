package w63;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0002\u001a\u00020\u00018G¢\u0006\f\n\u0004\b\u0002\u0010\u0016\u001a\u0004\b\u0002\u0010\u0015¨\u0006\u0017"}, d2 = {"Lw63/o;", "Lw63/g0;", "delegate", "<init>", "(Lw63/g0;)V", "Lw63/e;", "sink", "", "byteCount", "read", "(Lw63/e;J)J", "Lw63/h0;", "timeout", "()Lw63/h0;", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "-deprecated_delegate", "()Lw63/g0;", "Lw63/g0;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class o implements g0 {
    private final g0 delegate;

    public o(g0 g0Var) {
        g0Var.getClass();
        this.delegate = g0Var;
    }

    @o13.e
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name and from getter */
    public final g0 getDelegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final g0 delegate() {
        return this.delegate;
    }

    @Override // w63.g0
    public long read(e sink, long byteCount) {
        sink.getClass();
        return this.delegate.read(sink, byteCount);
    }

    @Override // w63.g0
    public h0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.delegate + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
