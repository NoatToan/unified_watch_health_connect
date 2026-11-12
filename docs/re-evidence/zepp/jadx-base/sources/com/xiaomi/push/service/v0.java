package com.xiaomi.push.service;

import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.push.service.XMPushService.g;

/* JADX INFO: loaded from: classes22.dex */
class v0 extends ContentObserver {
    public final /* synthetic */ XMPushService a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(XMPushService xMPushService, Handler handler) {
        super(handler);
        this.a = xMPushService;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        boolean zM3800h = this.a.m3800h();
        com.xiaomi.channel.commonutils.logger.b.m3434a("SuperPowerMode:" + zM3800h);
        this.a.e();
        if (!zM3800h) {
            this.a.a(true);
        } else {
            XMPushService xMPushService = this.a;
            xMPushService.a(xMPushService.new g(24, null));
        }
    }
}
