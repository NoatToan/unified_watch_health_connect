package com.xiaomi.push.service;

import com.tencent.connect.common.Constants;
import com.xiaomi.push.cz;
import com.xiaomi.push.dt;
import com.xiaomi.push.ee;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes22.dex */
public class b extends com.xiaomi.push.o.a {
    private dt a;
    private WeakReference<XMPushService> b;
    private boolean c;

    public b(dt dtVar, WeakReference<XMPushService> weakReference, boolean z) {
        this.c = false;
        this.a = dtVar;
        this.b = weakReference;
        this.c = z;
    }

    @Override // com.xiaomi.push.o.a
    public String a() {
        return Constants.VIA_REPORT_TYPE_DATALINE;
    }

    @Override // java.lang.Runnable
    public void run() {
        XMPushService xMPushService;
        WeakReference<XMPushService> weakReference = this.b;
        if (weakReference == null || this.a == null || (xMPushService = weakReference.get()) == null) {
            return;
        }
        this.a.a(aw.a());
        this.a.a(false);
        com.xiaomi.channel.commonutils.logger.b.c("MoleInfo aw_ping : send aw_Ping msg " + this.a.m3716a());
        try {
            String strC = this.a.c();
            xMPushService.a(strC, ee.a(f.d(strC, this.a.b(), this.a, cz.Notification)), this.c);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.d("MoleInfo aw_ping : send help app ping error" + e.toString());
        }
    }
}
