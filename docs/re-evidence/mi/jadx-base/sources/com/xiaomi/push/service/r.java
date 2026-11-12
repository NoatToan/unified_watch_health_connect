package com.xiaomi.push.service;

/* JADX INFO: loaded from: classes11.dex */
public class r extends XMPushService.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bg.b.c f14253b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(bg.b.c cVar, int i) {
        super(i);
        this.f14253b = cVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "check peer job";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public void b() {
        bg bgVarC = bg.c();
        bg.b bVar = this.f14253b.f14201a;
        if (bgVarC.b(bVar.h, bVar.f14197b).f14199r == null) {
            XMPushService xMPushService = bg.b.this.p;
            bg.b bVar2 = this.f14253b.f14201a;
            xMPushService.a(bVar2.h, bVar2.f14197b, 2, null, null);
        }
    }
}
