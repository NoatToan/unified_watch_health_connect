package com.xiaomi.push.service;

import defpackage.iht;
import defpackage.x9s;

/* JADX INFO: loaded from: classes11.dex */
public class k implements bg.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ XMPushService f14219a;

    public k(XMPushService xMPushService) {
        this.f14219a = xMPushService;
    }

    @Override // com.xiaomi.push.service.bg.b.a
    public void a(bg.c cVar, bg.c cVar2, int i) {
        if (cVar2 == bg.c.binded) {
            iht.d(this.f14219a, true);
            iht.c(this.f14219a);
        } else if (cVar2 == bg.c.unbind) {
            x9s.o("onChange unbind");
            iht.a(this.f14219a, 70000001, " the push is not connected.");
        }
    }
}
