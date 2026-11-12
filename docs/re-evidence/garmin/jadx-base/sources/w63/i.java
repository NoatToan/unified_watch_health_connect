package w63;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.zip.Deflater;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lw63/i;", "Lw63/f0;", "Lw63/f;", "sink", "Ljava/util/zip/Deflater;", "deflater", "<init>", "(Lw63/f;Ljava/util/zip/Deflater;)V", "(Lw63/f0;Ljava/util/zip/Deflater;)V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f183366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Deflater f183367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f183368c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(f0 f0Var, Deflater deflater) {
        this((f) new a0(f0Var), deflater);
        f0Var.getClass();
        deflater.getClass();
    }

    public final void a(boolean z14) throws IOException {
        c0 c0VarC;
        int iDeflate;
        f fVar = this.f183366a;
        e f183323b = fVar.getF183323b();
        while (true) {
            c0VarC = f183323b.C(1);
            byte[] bArr = c0VarC.f183336a;
            int i14 = c0VarC.f183338c;
            Deflater deflater = this.f183367b;
            if (z14) {
                try {
                    iDeflate = deflater.deflate(bArr, i14, 8192 - i14, 2);
                } catch (NullPointerException e4) {
                    vb.h.u("Deflater already closed", e4);
                    return;
                }
            } else {
                iDeflate = deflater.deflate(bArr, i14, 8192 - i14);
            }
            if (iDeflate > 0) {
                c0VarC.f183338c += iDeflate;
                f183323b.f183349b += (long) iDeflate;
                fVar.Z0();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (c0VarC.f183337b == c0VarC.f183338c) {
            f183323b.f183348a = c0VarC.a();
            d0.a(c0VarC);
        }
    }

    @Override // w63.f0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.f183367b;
        if (this.f183368c) {
            return;
        }
        deflater.finish();
        a(false);
        th = null;
        try {
            deflater.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f183366a.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f183368c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // w63.f0, java.io.Flushable
    public final void flush() throws IOException {
        a(true);
        this.f183366a.flush();
    }

    @Override // w63.f0
    /* JADX INFO: renamed from: timeout */
    public final h0 getF183407b() {
        return this.f183366a.getF183407b();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f183366a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // w63.f0
    public final void write(e eVar, long j8) throws IOException {
        eVar.getClass();
        b.b(eVar.f183349b, 0L, j8);
        while (true) {
            Deflater deflater = this.f183367b;
            if (j8 <= 0) {
                deflater.setInput(x63.b.f189311b, 0, 0);
                return;
            }
            c0 c0Var = eVar.f183348a;
            c0Var.getClass();
            int iMin = (int) Math.min(j8, c0Var.f183338c - c0Var.f183337b);
            deflater.setInput(c0Var.f183336a, c0Var.f183337b, iMin);
            a(false);
            long j14 = iMin;
            eVar.f183349b -= j14;
            int i14 = c0Var.f183337b + iMin;
            c0Var.f183337b = i14;
            if (i14 == c0Var.f183338c) {
                eVar.f183348a = c0Var.a();
                d0.a(c0Var);
            }
            j8 -= j14;
        }
    }

    public i(f fVar, Deflater deflater) {
        fVar.getClass();
        deflater.getClass();
        this.f183366a = fVar;
        this.f183367b = deflater;
    }
}
