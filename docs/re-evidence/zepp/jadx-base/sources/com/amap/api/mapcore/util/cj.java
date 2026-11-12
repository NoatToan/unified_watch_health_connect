package com.amap.api.mapcore.util;

/* JADX INFO: loaded from: classes2.dex */
public final class cj extends cb {
    public cj(ax axVar) {
        super(1, axVar);
    }

    @Override // com.amap.api.mapcore.util.cb
    public final void a(int i) {
        a(this.b.h);
        ax axVar = this.b;
        axVar.a(axVar.h);
        this.b.c().h();
    }

    @Override // com.amap.api.mapcore.util.cb
    public final void c() {
        this.b.d();
    }

    @Override // com.amap.api.mapcore.util.cb
    public final void g() {
        a(this.b.f);
        ax axVar = this.b;
        axVar.a(axVar.f);
        this.b.c().h();
    }

    @Override // com.amap.api.mapcore.util.cf
    public final void h() {
        this.b.setCompleteCode(0);
        this.b.d();
    }
}
