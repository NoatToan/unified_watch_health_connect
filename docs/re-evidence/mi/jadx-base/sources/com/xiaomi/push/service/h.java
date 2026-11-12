package com.xiaomi.push.service;

import com.xiaomi.push.ha;
import com.xiaomi.push.ib;
import com.xiaomi.push.il;
import com.xiaomi.push.is;
import com.xiaomi.push.ix;
import com.xiaomi.push.ja;
import defpackage.x9s;

/* JADX INFO: loaded from: classes11.dex */
public class h extends XMPushService.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ja f14216b;
    public final /* synthetic */ ix c;
    public final /* synthetic */ XMPushService d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i, ja jaVar, ix ixVar, XMPushService xMPushService) {
        super(i);
        this.f14216b = jaVar;
        this.c = ixVar;
        this.d = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send ack message for clear push message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public void b() {
        try {
            is isVar = new is();
            isVar.c(il.CancelPushMessageACK.f125a);
            isVar.a(this.f14216b.m762a());
            isVar.a(this.f14216b.a());
            isVar.b(this.f14216b.b());
            isVar.e(this.f14216b.d());
            isVar.a(0L);
            isVar.d("success clear push message.");
            i.i(this.d, i.n(this.c.b(), this.c.m748a(), isVar, ib.Notification));
        } catch (ha e) {
            x9s.D("clear push message. " + e);
            this.d.a(10, e);
        }
    }
}
