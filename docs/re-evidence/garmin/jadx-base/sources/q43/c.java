package q43;

import p43.a2;
import p43.g2;
import p43.l1;
import p43.n0;
import p43.v0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends l1.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f142784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2 f142785b;

    public c(b bVar, a2 a2Var) {
        this.f142784a = bVar;
        this.f142785b = a2Var;
    }

    @Override // p43.l1.c
    public final t43.i a(l1 l1Var, t43.h hVar) {
        l1Var.getClass();
        hVar.getClass();
        b bVar = this.f142784a;
        n0 n0Var = (n0) bVar.A0(hVar);
        v0 v0VarM0 = bVar.m0(this.f142785b.h(g2.INVARIANT, n0Var));
        v0VarM0.getClass();
        return v0VarM0;
    }
}
