package com.garmin.android.apps.connectmobile.settings.devices;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import hb2.i;
import ig1.o;

/* JADX INFO: loaded from: classes10.dex */
public class VivoActive3ActivityTrackingAndAutoActivityStart extends BaseActivityTrackingAndAutoActivityStart {
    @Override // com.garmin.android.apps.connectmobile.settings.devices.BaseActivityTrackingAndAutoActivityStart
    public final void ea() {
        if (i.a(this)) {
            showProgressOverlay();
            i2.a(a2.SETTINGS, "VA3ActivityTrackingAndAutoActivityStart", "Getting running threshold");
            e eVarN = e.N();
            long j8 = this.f41910r;
            e.a aVar = e.a.RUNNING;
            e.b bVar = e.b.ALL;
            eVarN.getClass();
            this.f41900h = e.M(j8, aVar, bVar, this.f41915y);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.BaseActivityTrackingAndAutoActivityStart
    public final void ga() {
        if (i.a(this)) {
            showProgressOverlay();
            i2.a(a2.SETTINGS, "VA3ActivityTrackingAndAutoActivityStart", "Getting walking threshold");
            e eVarN = e.N();
            long j8 = this.f41910r;
            e.a aVar = e.a.WALKING;
            e.b bVar = e.b.ALL;
            eVarN.getClass();
            this.f41901i = e.M(j8, aVar, bVar, this.f41916z);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.BaseActivityTrackingAndAutoActivityStart
    public final void ha() {
        this.f41894b = new o(this, this.f41895c, this.f41896d, this.f41897e, this.f41898f, this.f41899g, this.f41914x, this, this, this, this, this, this.f41913w);
        super.ha();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.BaseActivityTrackingAndAutoActivityStart, ng1.p0
    public final void r7(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        i2.a(a2.SETTINGS, "VA3ActivityTrackingAndAutoActivityStart", "Editing running threshold");
        String strH = fVar.h();
        e eVarN = e.N();
        long j8 = this.f41910r;
        e.a aVar = e.a.RUNNING;
        e.b bVar = e.b.ALL;
        eVarN.getClass();
        this.f41905m = e.O(j8, aVar, bVar, strH, this.A);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.BaseActivityTrackingAndAutoActivityStart, ng1.r0
    public final void u2(com.garmin.android.apps.connectmobile.devices.model.f fVar) {
        i2.a(a2.SETTINGS, "VA3ActivityTrackingAndAutoActivityStart", "Editing walking threshold");
        String strH = fVar.h();
        e eVarN = e.N();
        long j8 = this.f41910r;
        e.a aVar = e.a.WALKING;
        e.b bVar = e.b.ALL;
        eVarN.getClass();
        this.f41906n = e.O(j8, aVar, bVar, strH, this.B);
    }
}
