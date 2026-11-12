package w63;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.OutputStream;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw63/x;", "Lw63/f0;", "Ljava/io/OutputStream;", "out", "Lw63/h0;", "timeout", "<init>", "(Ljava/io/OutputStream;Lw63/h0;)V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OutputStream f183406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f183407b;

    public x(OutputStream outputStream, h0 h0Var) {
        outputStream.getClass();
        h0Var.getClass();
        this.f183406a = outputStream;
        this.f183407b = h0Var;
    }

    @Override // w63.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f183406a.close();
    }

    @Override // w63.f0, java.io.Flushable
    public final void flush() throws IOException {
        this.f183406a.flush();
    }

    @Override // w63.f0
    /* JADX INFO: renamed from: timeout, reason: from getter */
    public final h0 getF183407b() {
        return this.f183407b;
    }

    public final String toString() {
        return "sink(" + this.f183406a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // w63.f0
    public final void write(e eVar, long j8) throws IOException {
        eVar.getClass();
        b.b(eVar.f183349b, 0L, j8);
        while (j8 > 0) {
            this.f183407b.throwIfReached();
            c0 c0Var = eVar.f183348a;
            c0Var.getClass();
            int iMin = (int) Math.min(j8, c0Var.f183338c - c0Var.f183337b);
            this.f183406a.write(c0Var.f183336a, c0Var.f183337b, iMin);
            int i14 = c0Var.f183337b + iMin;
            c0Var.f183337b = i14;
            long j14 = iMin;
            j8 -= j14;
            eVar.f183349b -= j14;
            if (i14 == c0Var.f183338c) {
                eVar.f183348a = c0Var.a();
                d0.a(c0Var);
            }
        }
    }
}
