package com.xiaomi.push.service;

import defpackage.x9s;

/* JADX INFO: loaded from: classes11.dex */
public class q extends XMPushService.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bg.b.c f14252b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(bg.b.c cVar, int i) {
        super(i);
        this.f14252b = cVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "clear peer job";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public void b() {
        bg.b.c cVar = this.f14252b;
        if (cVar.f14202b == cVar.f14201a.f14199r) {
            x9s.y("clean peer, chid = " + this.f14252b.f14201a.h);
            this.f14252b.f14201a.f14199r = null;
        }
    }
}
