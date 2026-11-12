package com.xiaomi.push.service;

import defpackage.kds;

/* JADX INFO: loaded from: classes11.dex */
public class d0 implements XMPushService.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ XMPushService f14208a;

    public d0(XMPushService xMPushService) {
        this.f14208a = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.n
    public void a() {
        kds.b(this.f14208a.getApplicationContext());
    }
}
