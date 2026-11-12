package n43;

import t23.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends w23.k implements b {
    public final s33.e P;
    public final u33.d T;
    public final u33.h X;
    public final u33.j Y;
    public final v Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t23.e eVar, t23.k kVar, u23.h hVar, boolean z14, t23.b.a aVar, s33.e eVar2, u33.d dVar, u33.h hVar2, u33.j jVar, v vVar, y0 y0Var) {
        super(eVar, kVar, hVar, z14, aVar, y0Var == null ? y0.f162076a : y0Var);
        eVar.getClass();
        hVar.getClass();
        aVar.getClass();
        eVar2.getClass();
        dVar.getClass();
        hVar2.getClass();
        jVar.getClass();
        this.P = eVar2;
        this.T = dVar;
        this.X = hVar2;
        this.Y = jVar;
        this.Z = vVar;
    }

    @Override // w23.k, w23.x
    public final /* bridge */ /* synthetic */ w23.x E0(t23.l lVar, t23.v vVar, u23.h hVar, x33.f fVar, t23.b.a aVar, y0 y0Var) {
        return R0(lVar, vVar, aVar, hVar, y0Var);
    }

    @Override // n43.w
    public final u33.d F() {
        return this.T;
    }

    @Override // n43.w
    public final v G() {
        return this.Z;
    }

    @Override // w23.k
    /* JADX INFO: renamed from: N0 */
    public final /* bridge */ /* synthetic */ w23.k E0(t23.l lVar, t23.v vVar, u23.h hVar, x33.f fVar, t23.b.a aVar, y0 y0Var) {
        return R0(lVar, vVar, aVar, hVar, y0Var);
    }

    public final c R0(t23.l lVar, t23.v vVar, t23.b.a aVar, u23.h hVar, y0 y0Var) {
        lVar.getClass();
        aVar.getClass();
        hVar.getClass();
        c cVar = new c((t23.e) lVar, (t23.k) vVar, hVar, this.I, aVar, this.P, this.T, this.X, this.Y, this.Z, y0Var);
        cVar.f181741y = this.f181741y;
        return cVar;
    }

    @Override // w23.x, t23.v
    public final boolean W() {
        return false;
    }

    @Override // n43.w
    public final u33.h X() {
        return this.X;
    }

    @Override // w23.x, t23.z
    public final boolean isExternal() {
        return false;
    }

    @Override // w23.x, t23.v
    public final boolean isInline() {
        return false;
    }

    @Override // w23.x, t23.v
    public final boolean isSuspend() {
        return false;
    }

    @Override // n43.w
    public final z33.n w() {
        return this.P;
    }

    public /* synthetic */ c(t23.e eVar, t23.k kVar, u23.h hVar, boolean z14, t23.b.a aVar, s33.e eVar2, u33.d dVar, u33.h hVar2, u33.j jVar, v vVar, y0 y0Var, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(eVar, kVar, hVar, z14, aVar, eVar2, dVar, hVar2, jVar, vVar, (i14 & 1024) != 0 ? null : y0Var);
    }
}
