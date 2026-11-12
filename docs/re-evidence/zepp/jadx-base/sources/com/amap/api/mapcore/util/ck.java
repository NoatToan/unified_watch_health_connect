package com.amap.api.mapcore.util;

/* JADX INFO: loaded from: classes2.dex */
public final class ck extends ca {
    public ck(ax axVar) {
        super(2, axVar);
    }

    @Override // com.amap.api.mapcore.util.cb
    public final void a(int i) {
        a(this.b.b(i));
        ax axVar = this.b;
        axVar.a(axVar.b(i));
        this.b.c().h();
    }

    @Override // com.amap.api.mapcore.util.cb
    public final void c() {
        a(this.b.c);
        ax axVar = this.b;
        axVar.a(axVar.c);
        this.b.c().h();
    }

    @Override // com.amap.api.mapcore.util.cb
    public final void e() {
        a(this.b.d);
        ax axVar = this.b;
        axVar.a(axVar.d);
        this.b.c().h();
    }

    @Override // com.amap.api.mapcore.util.cf
    public final void h() {
        this.b.g();
        this.b.d();
    }
}
