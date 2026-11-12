package com.xiaomi.push.service;

import com.xiaomi.mipush.sdk.ErrorCode;

/* JADX INFO: loaded from: classes22.dex */
final class h implements az.b.a {
    public final /* synthetic */ XMPushService a;

    public h(XMPushService xMPushService) {
        this.a = xMPushService;
    }

    @Override // com.xiaomi.push.service.az.b.a
    public void a(az.c cVar, az.c cVar2, int i) {
        if (cVar2 == az.c.binded) {
            u.a(this.a);
            u.b(this.a);
        } else if (cVar2 == az.c.unbind) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("onChange unbind");
            u.a(this.a, ErrorCode.ERROR_SERVICE_UNAVAILABLE, " the push is not connected.");
        }
    }
}
