package com.xiaomi.push.service;

/* JADX INFO: loaded from: classes22.dex */
class q0 implements Runnable {
    public final /* synthetic */ XMPushService a;

    public q0(XMPushService xMPushService) {
        this.a = xMPushService;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.f200a = true;
        try {
            com.xiaomi.channel.commonutils.logger.b.m3434a("try to trigger the wifi digest broadcast.");
            Object systemService = this.a.getApplicationContext().getSystemService("MiuiWifiService");
            if (systemService != null) {
                com.xiaomi.push.z.b(systemService, "sendCurrentWifiDigestInfo", new Object[0]);
            }
        } catch (Throwable unused) {
        }
    }
}
