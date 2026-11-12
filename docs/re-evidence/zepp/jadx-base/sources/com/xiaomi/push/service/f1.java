package com.xiaomi.push.service;

import com.xiaomi.push.cd;
import com.xiaomi.push.dq;

/* JADX INFO: loaded from: classes22.dex */
final class f1 extends XMPushService.j {
    public final /* synthetic */ XMPushService b;
    public final /* synthetic */ dq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(int i, XMPushService xMPushService, dq dqVar) {
        super(i);
        this.b = xMPushService;
        this.c = dqVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send ack message for obsleted message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo3788a() {
        try {
            dq dqVarA = v.a(this.b, this.c);
            dqVarA.m3701a().a("message_obsleted", "1");
            f.i(this.b, dqVarA);
        } catch (cd e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            this.b.a(10, e);
        }
    }
}
