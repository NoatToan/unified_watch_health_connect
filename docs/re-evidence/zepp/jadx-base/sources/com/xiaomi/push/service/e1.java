package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.cd;
import com.xiaomi.push.dq;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
final class e1 extends XMPushService.j {
    public final /* synthetic */ XMPushService b;
    public final /* synthetic */ dq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(int i, XMPushService xMPushService, dq dqVar) {
        super(i);
        this.b = xMPushService;
        this.c = dqVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send ack message for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo3788a() {
        Map<String, String> mapA = null;
        try {
            if (com.xiaomi.channel.commonutils.android.f.m3427a((Context) this.b)) {
                try {
                    mapA = ac.a((Context) this.b, this.c);
                } catch (Throwable unused) {
                }
            }
            f.i(this.b, v.a(this.b, this.c, mapA));
        } catch (cd e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
            this.b.a(10, e);
        }
    }
}
