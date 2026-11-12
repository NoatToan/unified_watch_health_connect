package com.xiaomi.push.service;

import com.xiaomi.push.cd;
import com.xiaomi.push.cz;
import com.xiaomi.push.df;
import com.xiaomi.push.dm;
import com.xiaomi.push.dq;
import com.xiaomi.push.dt;

/* JADX INFO: loaded from: classes22.dex */
final class e extends XMPushService.j {
    public final /* synthetic */ dt b;
    public final /* synthetic */ dq c;
    public final /* synthetic */ XMPushService d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i, dt dtVar, dq dqVar, XMPushService xMPushService) {
        super(i);
        this.b = dtVar;
        this.c = dqVar;
        this.d = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send ack message for clear push message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo3788a() {
        try {
            dm dmVar = new dm();
            dmVar.c(df.CancelPushMessageACK.f77a);
            dmVar.a(this.b.m3716a());
            dmVar.a(this.b.a());
            dmVar.b(this.b.b());
            dmVar.e(this.b.c());
            dmVar.a(0L);
            dmVar.d("success clear push message.");
            f.i(this.d, f.m(this.c.b(), this.c.m3702a(), dmVar, cz.Notification));
        } catch (cd e) {
            com.xiaomi.channel.commonutils.logger.b.d("clear push message. " + e);
            this.d.a(10, e);
        }
    }
}
