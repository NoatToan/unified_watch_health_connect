package w63;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0002\u001a\u00020\u00018G¢\u0006\f\n\u0004\b\u0002\u0010\u0017\u001a\u0004\b\u0002\u0010\u0016¨\u0006\u0018"}, d2 = {"Lw63/n;", "Lw63/f0;", "delegate", "<init>", "(Lw63/f0;)V", "Lw63/e;", "source", "", "byteCount", "", "write", "(Lw63/e;J)V", "flush", "()V", "Lw63/h0;", "timeout", "()Lw63/h0;", "close", "", "toString", "()Ljava/lang/String;", "-deprecated_delegate", "()Lw63/f0;", "Lw63/f0;", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class n implements f0 {
    private final f0 delegate;

    public n(f0 f0Var) {
        f0Var.getClass();
        this.delegate = f0Var;
    }

    @o13.e
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name and from getter */
    public final f0 getDelegate() {
        return this.delegate;
    }

    @Override // w63.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    public final f0 delegate() {
        return this.delegate;
    }

    @Override // w63.f0, java.io.Flushable
    public void flush() {
        this.delegate.flush();
    }

    @Override // w63.f0
    public h0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + CoreConstants.LEFT_PARENTHESIS_CHAR + this.delegate + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // w63.f0
    public void write(e source, long byteCount) {
        source.getClass();
        this.delegate.write(source, byteCount);
    }
}
