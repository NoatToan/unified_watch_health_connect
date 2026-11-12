package zb0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.devices.GarminDeviceSWUpdateCheckerWakefulService;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes8.dex */
public class w0 implements bd0.s.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bm2.d f203867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f203868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nm2.a f203869c;

    public w0(GarminDeviceSWUpdateCheckerWakefulService garminDeviceSWUpdateCheckerWakefulService, bm2.d dVar, byte[] bArr, nm2.a aVar) {
        this.f203867a = dVar;
        this.f203868b = bArr;
        this.f203869c = aVar;
    }

    @Override // bd0.s.c
    public final void a() {
    }

    @Override // bd0.s.c
    public final void b(bd0.b0 b0Var) {
        a2 a2Var = a2.DEVICES;
        i2.f(a2Var, "GarminDeviceSWUpdateCheckerWakefulService", "performCheckHTTP: onFail: " + b0Var.name());
        i2.f36769a.getClass();
        i2.a.b(a2Var, "GarminDeviceSWUpdateCheckerWakefulService", "performCheckHTTP END ****");
    }

    @Override // bd0.s.c
    public final void c(lj0.e.a aVar) {
        byte[] bArr = this.f203868b;
        bm2.d dVar = this.f203867a;
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "GarminDeviceSWUpdateCheckerWakefulService", "performCheckHTTP: onSucceed");
        try {
            if (rd2.f.a().f152047c.j(dVar.getF172494b(), bArr)) {
                i2.a(a2Var, "GarminDeviceSWUpdateCheckerWakefulService", "performCheckHTTP: updated device XML in local database");
            } else {
                i2.m(a2Var, "GarminDeviceSWUpdateCheckerWakefulService", "performCheckHTTP: error updating device XML in local database, perhaps there is no DB record for deviceUnitID [" + dVar.getF172494b() + "]");
            }
            this.f203869c.b(dVar, bArr, aVar != null ? (String) aVar.f112977a : null);
        } catch (Exception e4) {
            i2.f(a2.DEVICES, "GarminDeviceSWUpdateCheckerWakefulService", "Exception attempting to update garmin device xml : " + e4.getMessage());
        }
        i2.a(a2.DEVICES, "GarminDeviceSWUpdateCheckerWakefulService", "performCheckHTTP END ****");
    }
}
