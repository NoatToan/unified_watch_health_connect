package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class z6h implements il8 {
    public static final nl8 d = new nl8() { // from class: y6h
        @Override // defpackage.nl8
        public final il8[] c() {
            return z6h.d();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kl8 f40951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xio f40952b;
    public boolean c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ il8[] d() {
        return new il8[]{new z6h()};
    }

    public static okh e(okh okhVar) {
        okhVar.P(0);
        return okhVar;
    }

    @Override // defpackage.il8
    public void a(long j, long j2) {
        xio xioVar = this.f40952b;
        if (xioVar != null) {
            xioVar.m(j, j2);
        }
    }

    @Override // defpackage.il8
    public void b(kl8 kl8Var) {
        this.f40951a = kl8Var;
    }

    @Override // defpackage.il8
    public int f(jl8 jl8Var, r4i r4iVar) throws IOException {
        rk1.i(this.f40951a);
        if (this.f40952b == null) {
            if (!h(jl8Var)) {
                throw new ParserException("Failed to determine bitstream type");
            }
            jl8Var.l();
        }
        if (!this.c) {
            snp snpVarD = this.f40951a.d(0, 1);
            this.f40951a.m();
            this.f40952b.d(this.f40951a, snpVarD);
            this.c = true;
        }
        return this.f40952b.g(jl8Var, r4iVar);
    }

    @Override // defpackage.il8
    public boolean g(jl8 jl8Var) throws IOException {
        try {
            return h(jl8Var);
        } catch (ParserException unused) {
            return false;
        }
    }

    public final boolean h(jl8 jl8Var) throws IOException {
        b7h b7hVar = new b7h();
        if (b7hVar.b(jl8Var, true) && (b7hVar.f3885b & 2) == 2) {
            int iMin = Math.min(b7hVar.i, 8);
            okh okhVar = new okh(iMin);
            jl8Var.i(okhVar.d(), 0, iMin);
            if (cx9.p(e(okhVar))) {
                this.f40952b = new cx9();
            } else if (a3r.r(e(okhVar))) {
                this.f40952b = new a3r();
            } else if (fch.o(e(okhVar))) {
                this.f40952b = new fch();
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.il8
    public void release() {
    }
}
