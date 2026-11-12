package com.xiaomi.push.service;

import com.xiaomi.push.ha;
import com.xiaomi.push.ix;
import defpackage.x9s;

/* JADX INFO: loaded from: classes11.dex */
public class f extends XMPushService.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XMPushService f14211b;
    public final /* synthetic */ ix c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i, XMPushService xMPushService, ix ixVar, String str) {
        super(i);
        this.f14211b = xMPushService;
        this.c = ixVar;
        this.d = str;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send app absent ack message for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public void b() {
        try {
            ix ixVarB = a.b(this.f14211b, this.c);
            ixVarB.m747a().a("absent_target_package", this.d);
            i.i(this.f14211b, ixVarB);
        } catch (ha e) {
            x9s.s(e);
            this.f14211b.a(10, e);
        }
    }
}
