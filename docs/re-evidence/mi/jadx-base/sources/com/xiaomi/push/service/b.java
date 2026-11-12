package com.xiaomi.push.service;

import com.xiaomi.push.ha;
import com.xiaomi.push.ix;
import defpackage.x9s;

/* JADX INFO: loaded from: classes11.dex */
public class b extends XMPushService.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XMPushService f14192b;
    public final /* synthetic */ ix c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i, XMPushService xMPushService, ix ixVar) {
        super(i);
        this.f14192b = xMPushService;
        this.c = ixVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send app absent message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public void b() {
        try {
            i.i(this.f14192b, i.a(this.c.b(), this.c.m748a()));
        } catch (ha e) {
            x9s.s(e);
            this.f14192b.a(10, e);
        }
    }
}
