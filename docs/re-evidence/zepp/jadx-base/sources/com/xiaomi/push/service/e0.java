package com.xiaomi.push.service;

import com.xiaomi.push.bi;
import com.xiaomi.push.cd;

/* JADX INFO: loaded from: classes22.dex */
class e0 extends XMPushService.j {
    private XMPushService b;
    private bi c;

    public e0(XMPushService xMPushService, bi biVar) {
        super(4);
        this.b = null;
        this.b = xMPushService;
        this.c = biVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send a message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo3788a() {
        try {
            bi biVar = this.c;
            if (biVar != null) {
                this.b.a(biVar);
            }
        } catch (cd e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            this.b.a(10, e);
        }
    }
}
