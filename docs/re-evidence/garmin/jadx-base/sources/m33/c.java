package m33;

import p43.m1;
import p43.s1;
import p43.v0;
import t23.d1;

/* JADX INFO: loaded from: classes3.dex */
public class c implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f116432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d1 f116433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f116434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m1 f116435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o33.i f116436e;

    public c(d dVar, d1 d1Var, a aVar, m1 m1Var, o33.i iVar) {
        this.f116432a = dVar;
        this.f116433b = d1Var;
        this.f116434c = aVar;
        this.f116435d = m1Var;
        this.f116436e = iVar;
    }

    @Override // e23.a
    public final Object invoke() {
        s1 s1Var = this.f116432a.f116440d;
        t23.h hVarT = this.f116435d.t();
        v0 v0VarP = hVarT != null ? hVarT.p() : null;
        a aVar = this.f116434c;
        aVar.getClass();
        return s1Var.b(this.f116433b, a.e(a.e(aVar, null, false, null, v0VarP, 31), null, this.f116436e.y(), null, null, 59));
    }
}
