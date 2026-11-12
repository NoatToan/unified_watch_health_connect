package com.xiaomi.push.service;

import defpackage.obs;

/* JADX INFO: loaded from: classes11.dex */
public class f0 extends XMPushService.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XMPushService f14212b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(XMPushService xMPushService, int i) {
        super(i);
        this.f14212b = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "prepare the mi push account.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public void b() {
        i.h(this.f14212b);
        if (obs.v(this.f14212b)) {
            this.f14212b.a(true);
        }
    }
}
