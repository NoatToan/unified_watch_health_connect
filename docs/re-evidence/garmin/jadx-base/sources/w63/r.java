package w63;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lw63/r;", "Lw63/g0;", "Lw63/g;", "source", "Ljava/util/zip/Inflater;", "inflater", "<init>", "(Lw63/g;Ljava/util/zip/Inflater;)V", "(Lw63/g0;Ljava/util/zip/Inflater;)V", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f183396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Inflater f183397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f183398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f183399d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(g0 g0Var, Inflater inflater) {
        this((g) new b0(g0Var), inflater);
        g0Var.getClass();
        inflater.getClass();
    }

    public final long a(e eVar, long j8) throws IOException {
        Inflater inflater = this.f183397b;
        eVar.getClass();
        if (j8 < 0) {
            vb.h.x(org.apache.commons.lang3.e.e(j8, "byteCount < 0: "));
            return 0L;
        }
        if (this.f183399d) {
            vb.h.z("closed");
            return 0L;
        }
        if (j8 != 0) {
            try {
                c0 c0VarC = eVar.C(1);
                int iMin = (int) Math.min(j8, 8192 - c0VarC.f183338c);
                boolean zNeedsInput = inflater.needsInput();
                g gVar = this.f183396a;
                if (zNeedsInput && !gVar.F1()) {
                    c0 c0Var = gVar.getF183329b().f183348a;
                    c0Var.getClass();
                    int i14 = c0Var.f183338c;
                    int i15 = c0Var.f183337b;
                    int i16 = i14 - i15;
                    this.f183398c = i16;
                    inflater.setInput(c0Var.f183336a, i15, i16);
                }
                int iInflate = inflater.inflate(c0VarC.f183336a, c0VarC.f183338c, iMin);
                int i17 = this.f183398c;
                if (i17 != 0) {
                    int remaining = i17 - inflater.getRemaining();
                    this.f183398c -= remaining;
                    gVar.skip(remaining);
                }
                if (iInflate > 0) {
                    c0VarC.f183338c += iInflate;
                    long j14 = iInflate;
                    eVar.f183349b += j14;
                    return j14;
                }
                if (c0VarC.f183337b == c0VarC.f183338c) {
                    eVar.f183348a = c0VarC.a();
                    d0.a(c0VarC);
                }
            } catch (DataFormatException e4) {
                throw new IOException(e4);
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f183399d) {
            return;
        }
        this.f183397b.end();
        this.f183399d = true;
        this.f183396a.close();
    }

    @Override // w63.g0
    public final long read(e eVar, long j8) throws IOException {
        eVar.getClass();
        do {
            long jA = a(eVar, j8);
            if (jA > 0) {
                return jA;
            }
            Inflater inflater = this.f183397b;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f183396a.F1());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // w63.g0
    /* JADX INFO: renamed from: timeout */
    public final h0 getF183401b() {
        return this.f183396a.getF183401b();
    }

    public r(g gVar, Inflater inflater) {
        gVar.getClass();
        inflater.getClass();
        this.f183396a = gVar;
        this.f183397b = inflater;
    }
}
