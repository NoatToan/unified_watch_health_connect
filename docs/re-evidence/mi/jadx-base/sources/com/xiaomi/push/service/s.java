package com.xiaomi.push.service;

import com.xiaomi.fitness.sync.init.SyncComponent;
import com.xiaomi.push.service.XMPushService.e;
import defpackage.f7s;
import defpackage.x9s;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class s {
    public static int f = 300000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public XMPushService f14256a;
    public int d = 0;
    public int e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14257b = 500;
    public long c = 0;

    public s(XMPushService xMPushService) {
        this.f14256a = xMPushService;
    }

    public final int a() {
        double d;
        if (this.d > 8) {
            return SyncComponent.SYNC_WIFI_TIME;
        }
        double dRandom = (Math.random() * 2.0d) + 1.0d;
        int i = this.d;
        if (i > 4) {
            d = 60000.0d;
        } else {
            if (i <= 1) {
                if (this.c == 0) {
                    return 0;
                }
                if (System.currentTimeMillis() - this.c >= 310000) {
                    this.f14257b = 1000;
                    this.e = 0;
                    return 0;
                }
                int i2 = this.f14257b;
                int i3 = f;
                if (i2 >= i3) {
                    return i2;
                }
                int i4 = this.e + 1;
                this.e = i4;
                if (i4 >= 4) {
                    return i3;
                }
                this.f14257b = (int) (((double) i2) * 1.5d);
                return i2;
            }
            d = 10000.0d;
        }
        return (int) (dRandom * d);
    }

    public void b() {
        this.c = System.currentTimeMillis();
        this.f14256a.a(1);
        this.d = 0;
    }

    public void c(boolean z) {
        if (!this.f14256a.m831a()) {
            x9s.B("should not reconnect as no client or network.");
            return;
        }
        if (z) {
            if (!this.f14256a.m832a(1)) {
                this.d++;
            }
            this.f14256a.a(1);
            x9s.p("ReconnectionManager", "-->tryReconnect(): exec ConnectJob");
            XMPushService xMPushService = this.f14256a;
            Objects.requireNonNull(xMPushService);
            xMPushService.a(xMPushService.new e());
            return;
        }
        if (this.f14256a.m832a(1)) {
            return;
        }
        int iA = a();
        this.d++;
        x9s.o("schedule reconnect in " + iA + "ms");
        XMPushService xMPushService2 = this.f14256a;
        Objects.requireNonNull(xMPushService2);
        xMPushService2.a(xMPushService2.new e(), (long) iA);
        if (this.d == 2 && com.xiaomi.push.b.e().k()) {
            f7s.e();
        }
        if (this.d == 3) {
            f7s.b();
        }
    }
}
