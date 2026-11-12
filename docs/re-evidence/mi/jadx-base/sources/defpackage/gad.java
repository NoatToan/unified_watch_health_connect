package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class gad extends cw3 {
    public final dw3 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public dw3.b f18780k;
    public long l;
    public volatile boolean m;

    public gad(a aVar, b bVar, Format format, int i, Object obj, dw3 dw3Var) {
        super(aVar, bVar, 2, format, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.j = dw3Var;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void b() {
        this.m = true;
    }

    public void f(dw3.b bVar) {
        this.f18780k = bVar;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void load() throws IOException {
        if (this.l == 0) {
            this.j.b(this.f18780k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            b bVarE = this.f14795b.e(this.l);
            jdo jdoVar = this.i;
            xu5 xu5Var = new xu5(jdoVar, bVarE.g, jdoVar.b(bVarE));
            while (!this.m && this.j.a(xu5Var)) {
                try {
                } catch (Throwable th) {
                    this.l = xu5Var.getPosition() - this.f14795b.g;
                    throw th;
                }
            }
            this.l = xu5Var.getPosition() - this.f14795b.g;
            wlq.n(this.i);
        } catch (Throwable th2) {
            wlq.n(this.i);
            throw th2;
        }
    }
}
