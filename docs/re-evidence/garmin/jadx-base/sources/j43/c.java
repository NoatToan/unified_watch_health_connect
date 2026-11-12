package j43;

import p43.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends a implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t23.a f97043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x33.f f97044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t23.a aVar, n0 n0Var, x33.f fVar, g gVar) {
        super(n0Var, gVar);
        aVar.getClass();
        n0Var.getClass();
        this.f97043c = aVar;
        this.f97044d = fVar;
    }

    @Override // j43.f
    public final x33.f a() {
        return this.f97044d;
    }

    public final String toString() {
        return "Cxt { " + this.f97043c + " }";
    }
}
