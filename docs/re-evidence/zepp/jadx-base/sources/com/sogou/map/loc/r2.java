package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
final class r2 implements u {
    private /* synthetic */ SGLocClient a;
    private final /* synthetic */ u b;

    public r2(SGLocClient sGLocClient, u uVar) {
        this.a = sGLocClient;
        this.b = uVar;
    }

    @Override // com.sogou.map.loc.u
    public final /* synthetic */ void a(Object obj) {
        k2 k2VarJ = ((SGLocService) obj).j(this.a, false);
        u uVar = this.b;
        k2VarJ.b(uVar, uVar);
    }
}
