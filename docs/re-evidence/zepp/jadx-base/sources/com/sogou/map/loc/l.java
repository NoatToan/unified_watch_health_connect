package com.sogou.map.loc;

/* JADX INFO: loaded from: classes18.dex */
final class l implements u {
    private /* synthetic */ i a;

    public l(i iVar) {
        this.a = iVar;
    }

    @Override // com.sogou.map.loc.u
    public final /* synthetic */ void a(Object obj) {
        this.a.g.e.n();
        StringBuilder sb = new StringBuilder("定位请求");
        sb.append(this.a.a.d() ? "成功" : "失败");
        r0.b(sb.toString());
        this.a.d();
        this.a.g.c.removeCallbacks(this.a.b);
    }
}
