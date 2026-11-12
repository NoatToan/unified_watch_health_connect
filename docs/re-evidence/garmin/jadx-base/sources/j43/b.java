package j43;

import p43.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t23.e f97041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x33.f f97042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(t23.e eVar, n0 n0Var, x33.f fVar, g gVar) {
        super(n0Var, gVar);
        eVar.getClass();
        n0Var.getClass();
        this.f97041c = eVar;
        this.f97042d = fVar;
    }

    @Override // j43.f
    public final x33.f a() {
        return this.f97042d;
    }

    public final String toString() {
        return getType() + ": Ctx { " + this.f97041c + " }";
    }
}
