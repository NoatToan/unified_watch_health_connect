package com.xiaomi.push.service;

/* JADX INFO: loaded from: classes11.dex */
public class b0 extends XMPushService.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ XMPushService f14193b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(XMPushService xMPushService, int i) {
        super(i);
        this.f14193b = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "disconnect for service destroy.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public void b() {
        if (this.f14193b.f431a != null) {
            this.f14193b.f431a.v(15, null);
            this.f14193b.f431a = null;
        }
    }
}
