package com.xiaomi.push.service;

/* JADX INFO: loaded from: classes22.dex */
class a0 implements az.b.a {
    public final /* synthetic */ az.b a;

    public a0(az.b bVar) {
        this.a = bVar;
    }

    @Override // com.xiaomi.push.service.az.b.a
    public void a(az.c cVar, az.c cVar2, int i) {
        if (cVar2 == az.c.binding) {
            this.a.m.a(this.a.q, 60000L);
        } else {
            this.a.m.b(this.a.q);
        }
    }
}
