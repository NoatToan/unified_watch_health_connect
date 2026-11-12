package com.xiaomi.push.service;

import com.xiaomi.push.ha;
import defpackage.mvs;
import defpackage.x9s;

/* JADX INFO: loaded from: classes11.dex */
public class h0 extends XMPushService.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public XMPushService f14217b;
    public mvs[] c;

    public h0(XMPushService xMPushService, mvs[] mvsVarArr) {
        super(4);
        this.f14217b = xMPushService;
        this.c = mvsVarArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "batch send message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public void b() {
        try {
            mvs[] mvsVarArr = this.c;
            if (mvsVarArr != null) {
                this.f14217b.a(mvsVarArr);
            }
        } catch (ha e) {
            x9s.s(e);
            this.f14217b.a(10, e);
        }
    }
}
