package com.xiaomi.push.service;

import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.push.service.XMPushService.g;
import defpackage.x9s;

/* JADX INFO: loaded from: classes11.dex */
public class e0 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ XMPushService f14210a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(XMPushService xMPushService, Handler handler) {
        super(handler);
        this.f14210a = xMPushService;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        super.onChange(z);
        boolean zM824g = this.f14210a.m824g();
        x9s.o("SuperPowerMode:" + zM824g);
        this.f14210a.e();
        if (!zM824g) {
            this.f14210a.a(true);
        } else {
            XMPushService xMPushService = this.f14210a;
            xMPushService.a(xMPushService.new g(24, null));
        }
    }
}
