package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService.g;

/* JADX INFO: loaded from: classes11.dex */
public class c0 implements bg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ XMPushService f14206a;

    public c0(XMPushService xMPushService) {
        this.f14206a = xMPushService;
    }

    @Override // com.xiaomi.push.service.bg.a
    public void a() {
        this.f14206a.e();
        if (bg.c().a() <= 0) {
            XMPushService xMPushService = this.f14206a;
            xMPushService.a(xMPushService.new g(12, null));
        }
    }
}
