package com.xiaomi.push.service;

/* JADX INFO: loaded from: classes22.dex */
class n0 extends XMPushService.j {
    public final /* synthetic */ XMPushService b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(XMPushService xMPushService, int i) {
        super(i);
        this.b = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "disconnect for service destroy.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo3788a() {
        if (this.b.f185a != null) {
            this.b.f185a.b(15, (Exception) null);
            this.b.f185a = null;
        }
    }
}
