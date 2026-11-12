package n43;

import t23.r0;
import t23.y0;
import w23.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends n0 implements b {
    public final s33.o D;
    public final u33.d E;
    public final u33.h F;
    public final u33.j I;
    public final v P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(t23.l lVar, r0 r0Var, u23.h hVar, t23.a0 a0Var, t23.r rVar, boolean z14, x33.f fVar, t23.b.a aVar, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, s33.o oVar, u33.d dVar, u33.h hVar2, u33.j jVar, v vVar) {
        super(lVar, r0Var, hVar, a0Var, rVar, z14, fVar, aVar, y0.f162076a, z15, z16, z19, false, z17, z18);
        lVar.getClass();
        hVar.getClass();
        a0Var.getClass();
        rVar.getClass();
        fVar.getClass();
        aVar.getClass();
        oVar.getClass();
        dVar.getClass();
        hVar2.getClass();
        jVar.getClass();
        this.D = oVar;
        this.E = dVar;
        this.F = hVar2;
        this.I = jVar;
        this.P = vVar;
    }

    @Override // n43.w
    public final u33.d F() {
        return this.E;
    }

    @Override // n43.w
    public final v G() {
        return this.P;
    }

    @Override // w23.n0
    public final n0 H0(t23.l lVar, t23.a0 a0Var, t23.r rVar, r0 r0Var, t23.b.a aVar, x33.f fVar, y0 y0Var) {
        lVar.getClass();
        a0Var.getClass();
        rVar.getClass();
        aVar.getClass();
        fVar.getClass();
        y0Var.getClass();
        return new g0(lVar, r0Var, getAnnotations(), a0Var, rVar, this.f181567f, fVar, aVar, this.f181669n, this.f181670o, isExternal(), this.f181674t, this.f181671p, this.D, this.E, this.F, this.I, this.P);
    }

    @Override // n43.w
    public final u33.h X() {
        return this.F;
    }

    @Override // w23.n0, t23.z
    public final boolean isExternal() {
        return u33.b.E.d(this.D.f156769d).booleanValue();
    }

    @Override // n43.w
    public final z33.n w() {
        return this.D;
    }
}
