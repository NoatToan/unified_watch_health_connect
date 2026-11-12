package n43;

import t23.x0;
import t23.y0;
import w23.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends r0 implements b {
    public final s33.j I;
    public final u33.d P;
    public final u33.h T;
    public final u33.j X;
    public final v Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(t23.l lVar, x0 x0Var, u23.h hVar, x33.f fVar, t23.b.a aVar, s33.j jVar, u33.d dVar, u33.h hVar2, u33.j jVar2, v vVar, y0 y0Var) {
        super(lVar, x0Var, hVar, fVar, aVar, y0Var == null ? y0.f162076a : y0Var);
        lVar.getClass();
        hVar.getClass();
        fVar.getClass();
        aVar.getClass();
        jVar.getClass();
        dVar.getClass();
        hVar2.getClass();
        jVar2.getClass();
        this.I = jVar;
        this.P = dVar;
        this.T = hVar2;
        this.X = jVar2;
        this.Y = vVar;
    }

    @Override // w23.r0, w23.x
    public final w23.x E0(t23.l lVar, t23.v vVar, u23.h hVar, x33.f fVar, t23.b.a aVar, y0 y0Var) {
        x33.f fVar2;
        lVar.getClass();
        aVar.getClass();
        hVar.getClass();
        x0 x0Var = (x0) vVar;
        if (fVar == null) {
            x33.f name = getName();
            name.getClass();
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        h0 h0Var = new h0(lVar, x0Var, hVar, fVar2, aVar, this.I, this.P, this.T, this.X, this.Y, y0Var);
        h0Var.f181741y = this.f181741y;
        return h0Var;
    }

    @Override // n43.w
    public final u33.d F() {
        return this.P;
    }

    @Override // n43.w
    public final v G() {
        return this.Y;
    }

    @Override // n43.w
    public final u33.h X() {
        return this.T;
    }

    @Override // n43.w
    public final z33.n w() {
        return this.I;
    }

    public /* synthetic */ h0(t23.l lVar, x0 x0Var, u23.h hVar, x33.f fVar, t23.b.a aVar, s33.j jVar, u33.d dVar, u33.h hVar2, u33.j jVar2, v vVar, y0 y0Var, int i14, p005kotlin.jvm.internal.j jVar3) {
        this(lVar, x0Var, hVar, fVar, aVar, jVar, dVar, hVar2, jVar2, vVar, (i14 & 1024) != 0 ? null : y0Var);
    }
}
