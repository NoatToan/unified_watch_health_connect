package com.xiaomi.push.service;

import com.xiaomi.push.bi;
import com.xiaomi.push.bx;
import com.xiaomi.push.cj;
import com.xiaomi.push.service.XMPushService.d;
import com.xiaomi.push.service.XMPushService.m;

/* JADX INFO: loaded from: classes22.dex */
class l0 implements bx {
    public final /* synthetic */ XMPushService a;

    public l0(XMPushService xMPushService) {
        this.a = xMPushService;
    }

    @Override // com.xiaomi.push.bx
    public void a(bi biVar) {
        XMPushService xMPushService = this.a;
        xMPushService.a(xMPushService.new d(biVar));
    }

    @Override // com.xiaomi.push.bx
    public void a(cj cjVar) {
        XMPushService xMPushService = this.a;
        xMPushService.a(xMPushService.new m(cjVar));
    }
}
