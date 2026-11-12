package com.xiaomi.push.service;

import com.xiaomi.push.ha;
import defpackage.css;
import defpackage.mvs;
import defpackage.x9s;

/* JADX INFO: loaded from: classes11.dex */
public class u extends XMPushService.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public XMPushService f14262b;
    public mvs c;

    public u(XMPushService xMPushService, mvs mvsVar) {
        super(4);
        this.f14262b = xMPushService;
        this.c = mvsVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send a message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public void b() {
        try {
            mvs mvsVar = this.c;
            if (mvsVar != null) {
                if (css.a(mvsVar)) {
                    this.c.A(System.currentTimeMillis() - this.c.b());
                }
                this.f14262b.a(this.c);
            }
        } catch (ha e) {
            x9s.s(e);
            this.f14262b.a(10, e);
        }
    }
}
