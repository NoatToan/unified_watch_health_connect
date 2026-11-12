package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class pem extends f92 {
    public final int o;
    public final Format p;
    public long q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f30326r;

    public pem(a aVar, b bVar, Format format, int i, Object obj, long j, long j2, long j3, int i2, Format format2) {
        super(aVar, bVar, format, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.o = i2;
        this.p = format2;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void b() {
    }

    @Override // defpackage.tif
    public boolean g() {
        return this.f30326r;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void load() throws IOException {
        h92 h92VarI = i();
        h92VarI.b(0L);
        snp snpVarD = h92VarI.d(0, this.o);
        snpVarD.b(this.p);
        try {
            long jB = this.i.b(this.f14795b.e(this.q));
            if (jB != -1) {
                jB += this.q;
            }
            xu5 xu5Var = new xu5(this.i, this.q, jB);
            for (int iC = 0; iC != -1; iC = snpVarD.c(xu5Var, Integer.MAX_VALUE, true)) {
                this.q += (long) iC;
            }
            snpVarD.e(this.g, 1, (int) this.q, 0, null);
            wlq.n(this.i);
            this.f30326r = true;
        } catch (Throwable th) {
            wlq.n(this.i);
            throw th;
        }
    }
}
