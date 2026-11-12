package com.xiaomi.push.service;

import com.xiaomi.push.ha;
import com.xiaomi.push.ix;
import defpackage.x9s;

/* JADX INFO: loaded from: classes11.dex */
public class d extends XMPushService.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XMPushService f14207b;
    public final /* synthetic */ ix c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i, XMPushService xMPushService, ix ixVar) {
        super(i);
        this.f14207b = xMPushService;
        this.c = ixVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send ack message for obsleted message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public void b() {
        try {
            ix ixVarB = a.b(this.f14207b, this.c);
            ixVarB.m747a().a("message_obsleted", "1");
            i.i(this.f14207b, ixVarB);
        } catch (ha e) {
            x9s.s(e);
            this.f14207b.a(10, e);
        }
    }
}
