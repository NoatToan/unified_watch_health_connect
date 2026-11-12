package com.xiaomi.push.service;

import android.os.SystemClock;
import com.xiaomi.push.service.XMPushService.d;
import com.xiaomi.push.service.XMPushService.m;
import defpackage.css;
import defpackage.fys;
import defpackage.mvs;
import defpackage.pws;

/* JADX INFO: loaded from: classes11.dex */
public class y implements pws {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ XMPushService f14270a;

    public y(XMPushService xMPushService) {
        this.f14270a = xMPushService;
    }

    @Override // defpackage.pws
    public void a(fys fysVar) {
        XMPushService xMPushService = this.f14270a;
        xMPushService.a(xMPushService.new m(fysVar));
    }

    @Override // defpackage.pws
    public void b(mvs mvsVar) {
        if (css.a(mvsVar)) {
            t.a().d(mvsVar.D(), SystemClock.elapsedRealtime(), this.f14270a.m827a());
        }
        XMPushService xMPushService = this.f14270a;
        xMPushService.a(xMPushService.new d(mvsVar));
    }
}
