package com.xiaomi.push.service;

import com.xiaomi.push.cz;
import com.xiaomi.push.dt;
import com.xiaomi.push.ee;

/* JADX INFO: loaded from: classes22.dex */
final class k0 implements Runnable {
    public final /* synthetic */ dt a;

    public k0(dt dtVar) {
        this.a = dtVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArrA = ee.a(f.d(this.a.c(), this.a.b(), this.a, cz.Notification));
        if (bv.c instanceof XMPushService) {
            ((XMPushService) bv.c).a(this.a.c(), bArrA, true);
        } else {
            com.xiaomi.channel.commonutils.logger.b.m3434a("UNDatas UploadNotificationDatas failed because not xmsf");
        }
    }
}
