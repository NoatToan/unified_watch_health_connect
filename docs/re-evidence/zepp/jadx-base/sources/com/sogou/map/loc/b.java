package com.sogou.map.loc;

import android.location.LocationListener;
import android.location.LocationManager;

/* JADX INFO: loaded from: classes18.dex */
final class b extends f {
    private final LocationManager f;
    private final LocationListener g;
    public final /* synthetic */ SGLocService h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SGLocService sGLocService, boolean z) {
        super(sGLocService, true);
        this.h = sGLocService;
        this.g = new c(this);
        this.f = j0.s(sGLocService);
    }

    @Override // com.sogou.map.loc.f
    public final void b() {
        if (!this.h.l()) {
            r0.b("GPS未开启,放弃GPS定位");
            this.a.f(new SGLocation(2, "GPS_OFF"));
        } else {
            r0.b("开始GPS定位");
            try {
                this.f.requestLocationUpdates("gps", 1000L, -1.0f, this.g);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.sogou.map.loc.f
    public final void d() {
        r0.b("取消GPS定位");
        this.a = null;
        this.f.removeUpdates(this.g);
    }
}
