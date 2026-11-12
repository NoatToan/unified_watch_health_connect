package wh;

import p005kotlin.Metadata;
import w63.f0;
import w63.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lwh/a;", "Lw63/f0;", "delegate", "<init>", "(Lw63/f0;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class a implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f185214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f185215b;

    public a(f0 f0Var) {
        f0Var.getClass();
        this.f185214a = f0Var;
    }

    @Override // w63.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f185214a.close();
    }

    @Override // w63.f0, java.io.Flushable
    public final void flush() {
        this.f185214a.flush();
    }

    @Override // w63.f0
    public final h0 timeout() {
        return this.f185214a.timeout();
    }

    @Override // w63.f0
    public final void write(w63.e eVar, long j8) {
        eVar.getClass();
        this.f185214a.write(eVar, j8);
        this.f185215b += j8;
    }
}
