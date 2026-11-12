package com.xiaomi.push.service;

/* JADX INFO: loaded from: classes11.dex */
public class p implements bg.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg.b f14250a;

    public p(bg.b bVar) {
        this.f14250a = bVar;
    }

    @Override // com.xiaomi.push.service.bg.b.a
    public void a(bg.c cVar, bg.c cVar2, int i) {
        if (cVar2 == bg.c.binding) {
            this.f14250a.p.a(this.f14250a.t, 60000L);
        } else {
            this.f14250a.p.b(this.f14250a.t);
        }
    }
}
