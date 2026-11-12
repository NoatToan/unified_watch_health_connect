package mf;

import e23.l;
import java.io.EOFException;
import java.io.IOException;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import w63.f0;
import w63.h0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lmf/c;", "Lw63/f0;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "Lokio/IOException;", "", "onException", "<init>", "(Lw63/f0;Le23/l;)V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f118282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<IOException, Unit> f118283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f118284c;

    /* JADX WARN: Multi-variable type inference failed */
    public c(f0 f0Var, l<? super IOException, Unit> lVar) {
        this.f118282a = f0Var;
        this.f118283b = lVar;
    }

    @Override // w63.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f118282a.close();
        } catch (IOException e4) {
            this.f118284c = true;
            this.f118283b.invoke(e4);
        }
    }

    @Override // w63.f0, java.io.Flushable
    public final void flush() {
        try {
            this.f118282a.flush();
        } catch (IOException e4) {
            this.f118284c = true;
            this.f118283b.invoke(e4);
        }
    }

    @Override // w63.f0
    public final h0 timeout() {
        return this.f118282a.timeout();
    }

    @Override // w63.f0
    public final void write(w63.e eVar, long j8) throws EOFException {
        if (this.f118284c) {
            eVar.skip(j8);
            return;
        }
        try {
            this.f118282a.write(eVar, j8);
        } catch (IOException e4) {
            this.f118284c = true;
            this.f118283b.invoke(e4);
        }
    }
}
