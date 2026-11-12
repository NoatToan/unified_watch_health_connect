package com.xiaomi.push.service;

import android.content.Context;

/* JADX INFO: loaded from: classes22.dex */
class w0 extends XMPushService.j {
    public final /* synthetic */ XMPushService b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(XMPushService xMPushService, int i) {
        super(i);
        this.b = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "prepare the mi push account.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* JADX INFO: renamed from: a */
    public void mo3788a() {
        f.h(this.b);
        if (com.xiaomi.push.y.m3842a((Context) this.b)) {
            this.b.a(true);
        }
    }
}
