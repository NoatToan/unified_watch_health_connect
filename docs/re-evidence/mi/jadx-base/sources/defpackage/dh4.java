package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class dh4 extends f92 {
    public final int o;
    public final long p;
    public final dw3 q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f15526r;
    public volatile boolean s;
    public boolean t;

    public dh4(a aVar, b bVar, Format format, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, dw3 dw3Var) {
        super(aVar, bVar, format, i, obj, j, j2, j3, j4, j5);
        this.o = i2;
        this.p = j6;
        this.q = dw3Var;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void b() {
        this.s = true;
    }

    @Override // defpackage.tif
    public long f() {
        return this.j + ((long) this.o);
    }

    @Override // defpackage.tif
    public boolean g() {
        return this.t;
    }

    public dw3.b k(h92 h92Var) {
        return h92Var;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public final void load() throws IOException {
        if (this.f15526r == 0) {
            h92 h92VarI = i();
            h92VarI.b(this.p);
            dw3 dw3Var = this.q;
            dw3.b bVarK = k(h92VarI);
            long j = this.f17542k;
            long j2 = j == -9223372036854775807L ? -9223372036854775807L : j - this.p;
            long j3 = this.l;
            dw3Var.b(bVarK, j2, j3 == -9223372036854775807L ? -9223372036854775807L : j3 - this.p);
        }
        try {
            b bVarE = this.f14795b.e(this.f15526r);
            jdo jdoVar = this.i;
            xu5 xu5Var = new xu5(jdoVar, bVarE.g, jdoVar.b(bVarE));
            do {
                try {
                    if (this.s) {
                        break;
                    }
                } catch (Throwable th) {
                    this.f15526r = xu5Var.getPosition() - this.f14795b.g;
                    throw th;
                }
            } while (this.q.a(xu5Var));
            this.f15526r = xu5Var.getPosition() - this.f14795b.g;
            wlq.n(this.i);
            this.t = !this.s;
        } catch (Throwable th2) {
            wlq.n(this.i);
            throw th2;
        }
    }
}
