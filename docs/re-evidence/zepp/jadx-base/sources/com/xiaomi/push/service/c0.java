package com.xiaomi.push.service;

/* JADX INFO: loaded from: classes22.dex */
class c0 extends XMPushService.j {
    public final /* synthetic */ az.b.c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(az.b.c cVar, int i) {
        super(i);
        this.b = cVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "check peer job";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo3788a() {
        az azVarA = az.a();
        az.b bVar = this.b.a;
        if (azVarA.a(bVar.g, bVar.b).o == null) {
            XMPushService xMPushService = az.b.this.m;
            az.b bVar2 = this.b.a;
            xMPushService.a(bVar2.g, bVar2.b, 2, null, null);
        }
    }
}
