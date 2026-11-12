package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
final class z1 implements u {
    private /* synthetic */ b0 a;
    private final /* synthetic */ d1 b;
    private final /* synthetic */ Runnable c;

    public z1(b0 b0Var, d1 d1Var, Runnable runnable) {
        this.a = b0Var;
        this.b = d1Var;
        this.c = runnable;
    }

    @Override // com.sogou.map.loc.u
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.b.d((c1) obj);
        this.a.a(this.c);
    }
}
