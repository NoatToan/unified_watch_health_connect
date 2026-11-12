package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService.e;

/* JADX INFO: loaded from: classes22.dex */
class d0 {
    private static int f = 300000;
    private XMPushService a;
    private int d = 0;
    private int e = 0;
    private int b = 500;
    private long c = 0;

    public d0(XMPushService xMPushService) {
        this.a = xMPushService;
    }

    private int a() {
        if (this.d > 8) {
            return 300000;
        }
        double dRandom = (Math.random() * 2.0d) + 1.0d;
        int i = this.d;
        if (i > 4) {
            return (int) (dRandom * 60000.0d);
        }
        if (i > 1) {
            return (int) (dRandom * 10000.0d);
        }
        if (this.c == 0) {
            return 0;
        }
        if (System.currentTimeMillis() - this.c >= 310000) {
            this.b = 1000;
            this.e = 0;
            return 0;
        }
        int i2 = this.b;
        int i3 = f;
        if (i2 >= i3) {
            return i2;
        }
        int i4 = this.e + 1;
        this.e = i4;
        if (i4 >= 4) {
            return i3;
        }
        this.b = (int) (((double) i2) * 1.5d);
        return i2;
    }

    public void b() {
        this.c = System.currentTimeMillis();
        this.a.a(1);
        this.d = 0;
    }

    public void c(boolean z) {
        if (!this.a.m3809b()) {
            com.xiaomi.channel.commonutils.logger.b.c("should not reconnect as no client or network.");
            return;
        }
        if (z) {
            if (!this.a.m3806a(1)) {
                this.d++;
            }
            this.a.a(1);
            XMPushService xMPushService = this.a;
            xMPushService.getClass();
            xMPushService.a(xMPushService.new e());
            return;
        }
        if (this.a.m3806a(1)) {
            return;
        }
        int iA = a();
        this.d++;
        com.xiaomi.channel.commonutils.logger.b.m3434a("schedule reconnect in " + iA + "ms");
        XMPushService xMPushService2 = this.a;
        xMPushService2.getClass();
        xMPushService2.a(xMPushService2.new e(), (long) iA);
        if (this.d == 2) {
            aj.b();
        }
        if (this.d == 3) {
            aj.a();
        }
    }
}
