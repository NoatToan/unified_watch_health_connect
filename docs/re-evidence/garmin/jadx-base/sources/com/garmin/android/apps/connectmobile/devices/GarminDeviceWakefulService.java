package com.garmin.android.apps.connectmobile.devices;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.d;
import bb2.l;
import cd0.n;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.android.framework.datamanagement.datasource.CacheDatabase;
import com.garmin.device.datatypes.DeviceProfile;
import hk0.p;
import zb0.u0;

/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"Instantiatable"})
public class GarminDeviceWakefulService extends Worker {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f33825e = false;

    public GarminDeviceWakefulService(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static void d(String str) {
        i2.a(a2.DEVICES, "GarminDeviceWakefulService", Thread.currentThread().getId() + ": " + str);
    }

    public static void e(Exception exc, String str) {
        if (exc == null) {
            i2.f(a2.DEVICES, "GarminDeviceWakefulService", Thread.currentThread().getId() + ": " + str);
            return;
        }
        i2.f(a2.DEVICES, "GarminDeviceWakefulService", Thread.currentThread().getId() + ": " + str + "error: " + exc.getMessage());
    }

    public static void f(String str) {
        i2.m(a2.DEVICES, "GarminDeviceWakefulService", Thread.currentThread().getId() + ": " + str);
    }

    public static synchronized void g(String str, boolean z14) {
        f33825e = z14;
        i2.a(a2.DEVICES, "GarminDeviceWakefulService", ".setIsUserInPairingFlow(" + z14 + ") called from [" + str + "]");
    }

    @Override // androidx.work.Worker
    public final d.a c() {
        DeviceProfile deviceProfile;
        DeviceProfile deviceProfile2;
        l lVarB = CacheDatabase.i().h().b(this.f11470b.f11427b.d("ARG_INPUT_TIMESTAMP", -1L));
        if (lVarB == null) {
            e(null, "INVALID device input data");
            return new d.a.C0165a();
        }
        String inputAction = lVarB.getInputAction();
        d("handle worker action [" + inputAction + "].");
        CacheDatabase.i().h().c(lVarB);
        inputAction.getClass();
        boolean zEquals = inputAction.equals("com.garmin.android.gdi.ACTION_GARMIN_DEVICE_XML_READ_FAILURE");
        Context context = this.f11469a;
        if (zEquals) {
            try {
                deviceProfile = (DeviceProfile) GsonUtil.f47253b.fromJson(lVarB.getRemoteDeviceProfile(), DeviceProfile.class);
            } catch (Exception e4) {
                e(e4, "ERROR parsing RemoteDeviceProfile input");
                deviceProfile = null;
            }
            if (deviceProfile != null) {
                long f172494b = deviceProfile.getF92746j();
                int f172495c = deviceProfile.getF92744h();
                d("doDeviceXMLFileDownloadFailure: " + deviceProfile.getF92742f());
                if (f172494b == -1) {
                    e(null, "doDeviceXMLFileDownloadFailure: unitID is -1, aborting...");
                } else if (f172495c == -1) {
                    e(null, "doDeviceXMLFileDownloadFailure: productNbr is -1, aborting...");
                } else {
                    u0 u0Var = (u0) u0.f203782n6.get(String.valueOf(f172495c));
                    if (u0Var == null) {
                        e(null, "doDeviceXMLFileDownloadFailure: GarminDeviceEnum does not contain an entry for product number [" + f172495c + "], aborting...");
                    } else {
                        String str = u0Var.f203857d;
                        if (str == null) {
                            f("doDeviceXMLFileDownloadFailure: " + u0Var.name() + " 'nonSetupFlowGarminDeviceXMLDownloadCompleteStrategyClassName' is null. This is only a warning, as it may be null on purpose, aborting...");
                        } else {
                            p.h(GarminConnectMobileApp.f28688j);
                            try {
                                bm2.d dVar = new bm2.d(deviceProfile);
                                if (!u0Var.f203859f) {
                                    n nVar = (n) Class.forName(str).newInstance();
                                    nVar.getClass();
                                    i2.a(a2.DEVICES, "BaseNonSetupFlowGarminDeviceXMLDownloadCompleteStrategy", "onGarminDeviceXmlReadFailure");
                                    nVar.f26830a = context;
                                    nVar.f26831b = dVar;
                                }
                            } catch (ReflectiveOperationException e14) {
                                e(e14, "doDeviceXMLFileDownloadFailure: ReflectiveOperationException");
                            }
                        }
                    }
                }
            }
            return new d.a.c();
        }
        if (!inputAction.equals("com.garmin.android.gdi.ACTION_GARMIN_DEVICE_XML_READ")) {
            e(null, "FIX ME DEVELOPER! I am not handling action [" + inputAction + "]");
            return new d.a.C0165a();
        }
        if (f33825e) {
            f("doDeviceXMLFileDownloadComplete: user is in pairing flow, aborting.");
        } else {
            try {
                deviceProfile2 = (DeviceProfile) GsonUtil.f47253b.fromJson(lVarB.getRemoteDeviceProfile(), DeviceProfile.class);
            } catch (Exception e15) {
                e(e15, "ERROR parsing RemoteDeviceProfile input");
                deviceProfile2 = null;
            }
            if (deviceProfile2 != null) {
                long f172494b2 = deviceProfile2.getF92746j();
                int f172495c2 = deviceProfile2.getF92744h();
                byte[] deviceXML = lVarB.getDeviceXML();
                d("doDeviceXMLFileDownloadComplete: " + deviceProfile2.getF92742f());
                if (f172494b2 == -1) {
                    e(null, "doDeviceXMLFileDownloadComplete: unitID is -1, aborting...");
                } else if (f172495c2 == -1) {
                    e(null, "doDeviceXMLFileDownloadComplete: productNbr is -1, aborting...");
                } else if (deviceXML == null) {
                    e(null, "doDeviceXMLFileDownloadComplete: deviceXMLBytes is null, aborting...");
                } else {
                    if (deviceXML.length == 0) {
                        e(null, "doDeviceXMLFileDownloadComplete: deviceXMLBytes length is zero, aborting...");
                    }
                    u0 u0Var2 = (u0) u0.f203782n6.get(String.valueOf(f172495c2));
                    if (u0Var2 == null) {
                        e(null, "doDeviceXMLFileDownloadComplete: GarminDeviceEnum does not contain an entry for product number [" + f172495c2 + "], aborting...");
                    } else {
                        String str2 = u0Var2.f203857d;
                        if (str2 == null) {
                            f("doDeviceXMLFileDownloadComplete: " + u0Var2.name() + " 'nonSetupFlowGarminDeviceXMLDownloadCompleteStrategyClassName' is null. This is only a warning, as it may be null on purpose, aborting...");
                        } else {
                            p.h(GarminConnectMobileApp.f28688j);
                            try {
                                bm2.d dVar2 = new bm2.d(deviceProfile2);
                                if (!u0Var2.f203859f) {
                                    ((n) Class.forName(str2).newInstance()).b(context, dVar2, deviceXML);
                                }
                            } catch (ReflectiveOperationException e16) {
                                e(e16, "doDeviceXMLFileDownloadComplete: ReflectiveOperationException");
                            }
                        }
                    }
                }
            }
        }
        return new d.a.c();
    }
}
