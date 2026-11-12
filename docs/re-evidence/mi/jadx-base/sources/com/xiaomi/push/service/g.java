package com.xiaomi.push.service;

import com.xiaomi.push.ha;
import com.xiaomi.push.ix;
import defpackage.x9s;

/* JADX INFO: loaded from: classes11.dex */
public class g extends XMPushService.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XMPushService f14213b;
    public final /* synthetic */ ix c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i, XMPushService xMPushService, ix ixVar, String str, String str2) {
        super(i);
        this.f14213b = xMPushService;
        this.c = ixVar;
        this.d = str;
        this.e = str2;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send wrong message ack for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public void b() {
        try {
            ix ixVarB = a.b(this.f14213b, this.c);
            ixVarB.f246a.a("error", this.d);
            ixVarB.f246a.a("reason", this.e);
            i.i(this.f14213b, ixVarB);
        } catch (ha e) {
            x9s.s(e);
            this.f14213b.a(10, e);
        }
    }
}
