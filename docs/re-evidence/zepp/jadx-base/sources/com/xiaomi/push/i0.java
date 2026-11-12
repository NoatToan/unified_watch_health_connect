package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

/* JADX INFO: loaded from: classes22.dex */
class i0 extends XMPushService.j {
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ bz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(bz bzVar, int i, long j, long j2) {
        super(i);
        this.d = bzVar;
        this.b = j;
        this.c = j2;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "check the ping-pong." + this.c;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void mo3788a() {
        Thread.yield();
        if (!this.d.m3610c() || this.d.a(this.b)) {
            return;
        }
        com.xiaomi.push.service.n.a(this.d.b).b();
        this.d.b.a(22, (Exception) null);
    }
}
