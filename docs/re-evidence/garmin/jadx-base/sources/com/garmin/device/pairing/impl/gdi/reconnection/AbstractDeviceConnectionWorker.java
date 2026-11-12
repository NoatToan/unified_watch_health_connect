package com.garmin.device.pairing.impl.gdi.reconnection;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.d;
import bd0.c0;
import com.garmin.android.apps.connectmobile.devices.GarminDeviceWakefulService;
import com.garmin.device.datatypes.DeviceProfile;
import hm2.b;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import lm2.g;
import lm2.h;
import nm2.a;
import o53.s0;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ue.i0;
import ue.l;
import ue.x;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractDeviceConnectionWorker extends Worker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Logger f50925g = LoggerFactory.getLogger("DeviceConnectionWorker");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f50926h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f50927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f50928f;

    static {
        new hm2.a();
        f50926h = new b();
    }

    public AbstractDeviceConnectionWorker(Context context, WorkerParameters workerParameters, a aVar) {
        super(context, workerParameters);
        this.f50927e = aVar;
        this.f50928f = context;
    }

    public static <T extends d> void d(DeviceProfile deviceProfile, String str, Class<T> cls, Context context, c.a aVar) {
        Logger logger = f50925g;
        if (deviceProfile == null) {
            logger.warn("beginWork called with no device");
            return;
        }
        logger.debug("Start worker with action [" + str + "] for device [" + deviceProfile + "].");
        if (aVar == null) {
            aVar = new c.a();
        }
        LinkedHashMap linkedHashMap = aVar.f11467a;
        f50926h.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("unitId", deviceProfile.getF92746j());
        jSONObject.put("productNumber", deviceProfile.getF92744h());
        jSONObject.put("deviceName", deviceProfile.getF92742f());
        jSONObject.put("softwareVersion", deviceProfile.getF92745i());
        jSONObject.put("macAddress", deviceProfile.getMacAddress());
        jSONObject.put("connectionType", deviceProfile.getConnectionType());
        jSONObject.put("configuration", new JSONArray((Collection) deviceProfile.getConfigurationFlags()));
        jSONObject.put("dualPairingMacAddress", deviceProfile.getDualPairingMacAddress());
        jSONObject.put("supportsMultiLink", deviceProfile.isMultiLinkSupported());
        jSONObject.put("bluetoothLimitation", deviceProfile.getF92738b());
        String string = jSONObject.toString();
        string.getClass();
        linkedHashMap.put("DEVICE_KEY", string);
        linkedHashMap.put("DEVICE_ACTION_KEY", str);
        x xVarA = new x.a((Class<? extends d>) cls).f(aVar.a()).e(0L, TimeUnit.MILLISECONDS).a();
        i0.f170088a.getClass();
        i0.a.a(context).a(deviceProfile.getMacAddress(), l.REPLACE, xVarA).a();
    }

    public static void h(String str) {
        f50925g.debug(Thread.currentThread().getId() + ": " + str);
    }

    public static void i(Exception exc, String str) {
        Logger logger = f50925g;
        if (exc != null) {
            logger.error(Thread.currentThread().getId() + ": " + str, (Throwable) exc);
            return;
        }
        logger.error(Thread.currentThread().getId() + ": " + str);
    }

    @Override // androidx.work.Worker
    public final d.a c() {
        WorkerParameters workerParameters = this.f11470b;
        c cVar = workerParameters.f11427b;
        c cVar2 = workerParameters.f11427b;
        String strE = cVar.e("DEVICE_ACTION_KEY");
        if (strE != null) {
            h("Handle intent action [" + strE + "].");
            DeviceProfile deviceProfileA = null;
            if (strE.equals("com.garmin.android.gdi.ACTION_DEVICE_AUTHENTICATED")) {
                String strE2 = cVar2.e("DEVICE_MAC_KEY");
                if (TextUtils.isEmpty(strE2)) {
                    return new d.a.C0165a();
                }
                byte[] bArrB = cVar2.b("GBLE_DIV_KEY");
                byte[] bArrB2 = cVar2.b("GBLE_RAND_KEY");
                byte[] bArrB3 = cVar2.b("GBLE_LTK_KEY");
                Logger logger = hm2.d.f84501a;
                strE2.getClass();
                if (!h.f113619b) {
                    g();
                }
                h.d();
                if (GarminDeviceWakefulService.f33825e) {
                    logger.warn("handleDeviceAuthenticated: user is in pairing flow, Bonding keys will not be updated here.");
                } else if (bArrB == null || bArrB2 == null || bArrB3 == null) {
                    logger.warn("One or more Garmin auth fields are missing. Cannot update Garmin auth for ".concat(strE2));
                } else {
                    u53.d dVar = hm2.d.f84502b;
                    x53.c cVar3 = s0.f129406a;
                    ge1.b.T(dVar, x53.b.f189152a, null, new hm2.c(strE2, bArrB, bArrB2, bArrB3, null), 2);
                }
            } else {
                String strE3 = cVar2.e("DEVICE_KEY");
                if (strE3 != null) {
                    try {
                        deviceProfileA = f50926h.a(strE3);
                    } catch (Exception e4) {
                        i(e4, "ERROR parsing RemoteDeviceProfile input");
                    }
                }
                if (deviceProfileA == null) {
                    return new d.a.C0165a();
                }
                if (strE.equals("com.garmin.android.gdi.ACTION_DEVICE_HANDSHAKE_COMPLETED")) {
                    h51.a aVar = new h51.a(this);
                    Logger logger2 = hm2.d.f84501a;
                    a aVar2 = this.f50927e;
                    aVar2.getClass();
                    if (!h.f113619b) {
                        g();
                    }
                    h.d();
                    if (GarminDeviceWakefulService.f33825e) {
                        hm2.d.f84501a.warn("handleDeviceConnected: user is in pairing flow, nonSetup strategy will NOT be called.");
                    } else {
                        bm2.d dVar2 = new bm2.d(deviceProfileA);
                        mm2.d dVar3 = (mm2.d) aVar.invoke(deviceProfileA, aVar2);
                        if (dVar3 != null) {
                            dVar3.b(((c0) h.d()).f17547a, dVar2);
                        }
                    }
                    f(deviceProfileA);
                } else if (strE.equals("com.garmin.android.gdi.ACTION_DEVICE_DISCONNECTED")) {
                    Logger logger3 = hm2.d.f84501a;
                    if (!h.f113619b) {
                        g();
                    }
                    long f92746j = deviceProfileA.getF92746j();
                    if (f92746j < 0) {
                        logger3.error("handleDeviceDisconnected: invalid remote device ID");
                    } else {
                        g gVarC = h.c();
                        String macAddress = deviceProfileA.getMacAddress();
                        macAddress.getClass();
                        if (((fm2.c) gVarC).h(macAddress) != null) {
                            logger3.warn("handleDeviceDisconnected: Device [" + f92746j + "] is connected. Ignoring unexpected broadcast");
                        } else {
                            e(deviceProfileA);
                        }
                    }
                }
            }
        }
        return new d.a.c();
    }

    public abstract void e(DeviceProfile deviceProfile);

    public abstract void f(DeviceProfile deviceProfile);

    public abstract void g();
}
