package com.garmin.android.apps.connectmobile.devices;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import bb2.l;
import bd0.s;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.framework.datamanagement.datasource.CacheDatabase;
import zb0.v0;
import zb0.w0;

/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"Instantiatable"})
public class GarminDeviceSWUpdateCheckerWakefulService extends Worker {
    public GarminDeviceSWUpdateCheckerWakefulService(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final d.a c() {
        bm2.d dVar;
        a2 a2Var = a2.DEVICES;
        i2.a(a2Var, "GarminDeviceSWUpdateCheckerWakefulService", "onHandleIntent");
        l lVarB = CacheDatabase.i().h().b(this.f11470b.f11427b.d("ARG_INPUT_TIMESTAMP", -1L));
        if (lVarB == null) {
            i2.f36769a.getClass();
            i2.a.f(a2Var, "GarminDeviceSWUpdateCheckerWakefulService", "INVALID device input data");
            return new d.a.C0165a();
        }
        CacheDatabase.i().h().c(lVarB);
        v0 v0Var = new v0();
        if (!v0Var.c()) {
            i2.f36769a.getClass();
            i2.a.f(a2Var, "GarminDeviceSWUpdateCheckerWakefulService", "onHandleIntent: initOTASoftwareVersionsJSONObj() failed, aborting");
            return new d.a.C0165a();
        }
        byte[] deviceXML = lVarB.getDeviceXML();
        if (deviceXML == null) {
            i2.f36769a.getClass();
            i2.a.f(a2Var, "GarminDeviceSWUpdateCheckerWakefulService", "deviceXMLBytes is null, aborting");
            return new d.a.C0165a();
        }
        if (deviceXML.length == 0) {
            i2.f36769a.getClass();
            i2.a.f(a2Var, "GarminDeviceSWUpdateCheckerWakefulService", "deviceXMLBytes length is zero, aborting");
            return new d.a.C0165a();
        }
        try {
            dVar = (bm2.d) GsonUtil.f47253b.fromJson(lVarB.getRemoteDeviceProfile(), bm2.d.class);
        } catch (Exception e4) {
            i2.f(a2.DEVICES, "GarminDeviceSWUpdateCheckerWakefulService", "ERROR parsing DeviceInfoDTO input: " + e4.getMessage());
            dVar = null;
        }
        if (dVar == null) {
            i2.f(a2.DEVICES, "GarminDeviceSWUpdateCheckerWakefulService", "device is null, aborting");
            return new d.a.C0165a();
        }
        if (v0Var.a(dVar.getF172494b())) {
            i2.a(a2.DEVICES, "GarminDeviceSWUpdateCheckerWakefulService", "performCheckHTTP BEGIN ****");
            new s(dVar.getF172494b(), deviceXML, new w0(this, dVar, deviceXML, v0Var)).a();
        }
        return new d.a.c();
    }
}
