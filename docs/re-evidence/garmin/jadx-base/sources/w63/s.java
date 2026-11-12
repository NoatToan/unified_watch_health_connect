package w63;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lw63/s;", "Lw63/g0;", "Ljava/io/InputStream;", "input", "Lw63/h0;", "timeout", "<init>", "(Ljava/io/InputStream;Lw63/h0;)V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class s implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f183400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f183401b;

    public s(InputStream inputStream, h0 h0Var) {
        inputStream.getClass();
        h0Var.getClass();
        this.f183400a = inputStream;
        this.f183401b = h0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f183400a.close();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    @Override // w63.g0
    public final long read(e eVar, long j8) throws IOException {
        boolean z14;
        eVar.getClass();
        if (j8 == 0) {
            return 0L;
        }
        if (j8 < 0) {
            vb.h.x(org.apache.commons.lang3.e.e(j8, "byteCount < 0: "));
            return 0L;
        }
        try {
            this.f183401b.throwIfReached();
            c0 c0VarC = eVar.C(1);
            int i14 = this.f183400a.read(c0VarC.f183336a, c0VarC.f183338c, (int) Math.min(j8, 8192 - c0VarC.f183338c));
            if (i14 != -1) {
                c0VarC.f183338c += i14;
                long j14 = i14;
                eVar.f183349b += j14;
                return j14;
            }
            if (c0VarC.f183337b != c0VarC.f183338c) {
                return -1L;
            }
            eVar.f183348a = c0VarC.a();
            d0.a(c0VarC);
            return -1L;
        } catch (AssertionError e4) {
            Logger logger = x63.l.f189351a;
            if (e4.getCause() != null) {
                String message = e4.getMessage();
                z14 = message != null ? d53.w.z(message, "getsockname failed", false) : false;
            }
            if (z14) {
                throw new IOException(e4);
            }
            throw e4;
        }
    }

    @Override // w63.g0
    /* JADX INFO: renamed from: timeout, reason: from getter */
    public final h0 getF183401b() {
        return this.f183401b;
    }

    public final String toString() {
        return "source(" + this.f183400a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
