package com.xiaomi.push.service;

import com.xiaomi.push.bi;
import com.xiaomi.push.cd;

/* JADX INFO: loaded from: classes22.dex */
class o0 extends XMPushService.j {
    private XMPushService b;
    private bi[] c;

    public o0(XMPushService xMPushService, bi[] biVarArr) {
        super(4);
        this.b = null;
        this.b = xMPushService;
        this.c = biVarArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "batch send message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo3788a() {
        try {
            bi[] biVarArr = this.c;
            if (biVarArr != null) {
                this.b.a(biVarArr);
            }
        } catch (cd e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            this.b.a(10, e);
        }
    }
}
