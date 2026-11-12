package com.xiaomi.push.service;

import com.xiaomi.push.cd;
import com.xiaomi.push.dq;

/* JADX INFO: loaded from: classes22.dex */
final class c extends XMPushService.j {
    public final /* synthetic */ XMPushService b;
    public final /* synthetic */ dq c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i, XMPushService xMPushService, dq dqVar, String str, String str2) {
        super(i);
        this.b = xMPushService;
        this.c = dqVar;
        this.d = str;
        this.e = str2;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send wrong message ack for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo3788a() {
        try {
            dq dqVarA = v.a(this.b, this.c);
            dqVarA.f120a.a("error", this.d);
            dqVarA.f120a.a("reason", this.e);
            f.i(this.b, dqVarA);
        } catch (cd e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            this.b.a(10, e);
        }
    }
}
