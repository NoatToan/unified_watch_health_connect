package okhttp3.internal.cache;

import e23.l;
import java.io.EOFException;
import java.io.IOException;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import w63.e;
import w63.f0;
import w63.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Lw63/n;", "Lw63/f0;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "", "onException", "<init>", "(Lw63/f0;Le23/l;)V", "Lw63/e;", "source", "", "byteCount", "write", "(Lw63/e;J)V", "flush", "()V", "close", "Le23/l;", "getOnException", "()Le23/l;", "", "hasErrors", "Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class FaultHidingSink extends n {
    private boolean hasErrors;
    private final l<IOException, Unit> onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(f0 f0Var, l<? super IOException, Unit> lVar) {
        super(f0Var);
        f0Var.getClass();
        lVar.getClass();
        this.onException = lVar;
    }

    @Override // w63.n, w63.f0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e4) {
            this.hasErrors = true;
            this.onException.invoke(e4);
        }
    }

    @Override // w63.n, w63.f0, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e4) {
            this.hasErrors = true;
            this.onException.invoke(e4);
        }
    }

    public final l<IOException, Unit> getOnException() {
        return this.onException;
    }

    @Override // w63.n, w63.f0
    public void write(e source, long byteCount) throws EOFException {
        source.getClass();
        if (this.hasErrors) {
            source.skip(byteCount);
            return;
        }
        try {
            super.write(source, byteCount);
        } catch (IOException e4) {
            this.hasErrors = true;
            this.onException.invoke(e4);
        }
    }
}
