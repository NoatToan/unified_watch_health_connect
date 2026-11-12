package com.xiaomi.push.service;

/* JADX INFO: loaded from: classes22.dex */
class b0 extends XMPushService.j {
    public final /* synthetic */ az.b.c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(az.b.c cVar, int i) {
        super(i);
        this.b = cVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "clear peer job";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo3788a() {
        az.b.c cVar = this.b;
        if (cVar.b == cVar.a.o) {
            com.xiaomi.channel.commonutils.logger.b.b("clean peer, chid = " + this.b.a.g);
            this.b.a.o = null;
        }
    }
}
