package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
final class o2 implements u {
    private /* synthetic */ m2 a;
    private final /* synthetic */ u b;

    public o2(m2 m2Var, u uVar) {
        this.a = m2Var;
        this.b = uVar;
    }

    @Override // com.sogou.map.loc.u
    public final /* synthetic */ void a(Object obj) {
        SGLocService sGLocService = (SGLocService) obj;
        if (sGLocService != null) {
            SGLocClient sGLocClient = this.a.a;
            k2 k2VarJ = sGLocService.j(this.a.a, true);
            u uVar = this.b;
            sGLocClient.u = k2VarJ.b(uVar, uVar);
            return;
        }
        this.a.a.p = false;
        this.a.a.n = -1;
        r0.b(this + ".clearWatch()");
        this.a.a.h.post(this.a.a.s);
    }
}
