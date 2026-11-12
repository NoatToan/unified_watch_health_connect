package s23;

import w23.i0;

/* JADX INFO: loaded from: classes3.dex */
public class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f156263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o43.n f156264b;

    public h(k kVar, o43.n nVar) {
        this.f156263a = kVar;
        this.f156264b = nVar;
    }

    @Override // e23.a
    public final Object invoke() {
        k23.l<Object>[] lVarArr = k.f156268h;
        k kVar = this.f156263a;
        i0 i0VarL = kVar.l();
        i0VarL.getClass();
        return new u(i0VarL, this.f156264b, new j(kVar));
    }
}
