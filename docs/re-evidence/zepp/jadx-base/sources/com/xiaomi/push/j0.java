package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

/* JADX INFO: loaded from: classes22.dex */
class j0 extends XMPushService.j {
    public final /* synthetic */ int b;
    public final /* synthetic */ Exception c;
    public final /* synthetic */ bz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(bz bzVar, int i, int i2, Exception exc) {
        super(i);
        this.d = bzVar;
        this.b = i2;
        this.c = exc;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "shutdown the connection. " + this.b + ", " + this.c;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo3788a() {
        this.d.b.a(this.b, this.c);
    }
}
