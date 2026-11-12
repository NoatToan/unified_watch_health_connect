package com.garmin.android.apps.connectmobile.devices;

import am.j;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import bm2.d;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.DeviceStatusProtobufRequestManager;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.EventSharingSubscriptionHandler;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.ProtobufRequestManager;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.SwingSensorProtobufRequestManager;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.devices.common.ConnectionChangeReceiver;
import com.garmin.android.apps.connectmobile.util.location.SignificantLocationUpdateJobService;
import com.garmin.android.apps.connectmobile.y;
import com.garmin.android.apps.connectmobile.z;
import com.garmin.android.framework.datamanagement.datasource.CacheDatabase;
import com.garmin.android.gfdi.configuration.Configuration;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.android.library.connectdatabase.ConnectDatabase;
import com.garmin.android.music.MusicManager;
import com.garmin.device.datatypes.DeviceProfile;
import com.garmin.device.pairing.impl.gdi.reconnection.AbstractDeviceConnectionWorker;
import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.GDISwingSensor;
import com.garmin.proto.generated.GDISwingSensorExtension;
import hk0.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o53.c0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import pi2.g;
import rd2.f;
import rd2.i;
import rd2.m;
import s80.c;
import tv.s;
import v.e0;
import vg1.t;
import wl0.e;
import wl0.h;
import yc.l2;
import zb0.n0;
import zb0.u0;
import zb0.v0;

/* JADX INFO: loaded from: classes8.dex */
public class DeviceConnectionWorker extends AbstractDeviceConnectionWorker {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f33798i = 0;

    public class a implements DeviceStatusProtobufRequestManager.BatteryStatusResponseListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f33799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f33800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f33801c;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.devices.DeviceConnectionWorker$a$a, reason: collision with other inner class name */
        public class C0572a implements e {
            public C0572a() {
            }

            @Override // wl0.e
            public final void onClubListRequestFailed(long j8, e.a aVar) {
                a aVar2 = a.this;
                DeviceConnectionWorker deviceConnectionWorker = DeviceConnectionWorker.this;
                String strO = j.o(aVar != null ? aVar.name() : "", "]", new StringBuilder("handleSwingSensorConnected: failed to retrieve club list, error status ["));
                int i14 = DeviceConnectionWorker.f33798i;
                deviceConnectionWorker.getClass();
                AbstractDeviceConnectionWorker.i(null, strO);
                int i15 = aVar2.f33801c;
                if (i15 > 0) {
                    DeviceConnectionWorker.this.j(aVar2.f33800b, i15 - 1);
                }
            }

            @Override // wl0.e
            public final void onClubListRetrieved(long j8, List<com.garmin.android.apps.connectmobile.golf.truswing.model.a> list, long j14) {
                a aVar = a.this;
                DeviceConnectionWorker deviceConnectionWorker = DeviceConnectionWorker.this;
                DeviceConnectionWorker deviceConnectionWorker2 = DeviceConnectionWorker.this;
                String str = "handleSwingSensorConnected: club list retrieved with [" + ((ArrayList) list).size() + "] clubs, active club is [" + j14 + "]";
                int i14 = DeviceConnectionWorker.f33798i;
                deviceConnectionWorker.getClass();
                AbstractDeviceConnectionWorker.h(str);
                h hVar = aVar.f33799a;
                hVar.r(list);
                hVar.q(j14);
                for (DeviceProfile deviceProfile : p.d()) {
                    Configuration configuration = deviceProfile.getConfiguration();
                    if (configuration != null) {
                        if (l2.q(SupportedCapability.SWING_SENSOR_REMOTE, configuration.getCapabilityFlagsAsSet())) {
                            String str2 = "handleSwingSensorConnected: sending connection notification to SENSOR_REMOTE, unit ID [" + deviceProfile.getF92746j() + "]";
                            deviceConnectionWorker2.getClass();
                            AbstractDeviceConnectionWorker.h(str2);
                            long f92746j = deviceProfile.getF92746j();
                            deviceConnectionWorker2.getClass();
                            DeviceConnectionWorker.m(f92746j);
                        }
                    }
                }
            }
        }

        public a(h hVar, d dVar, int i14) {
            this.f33799a = hVar;
            this.f33800b = dVar;
            this.f33801c = i14;
        }

        @Override // com.garmin.android.apps.connectmobile.gfdi.protobuf.DeviceStatusProtobufRequestManager.BatteryStatusResponseListener
        public final void onBatteryStatusRequestFailed(long j8, DeviceStatusProtobufRequestManager.BatteryStatusResponseListener.ErrorStatus errorStatus) {
            String strO = j.o(errorStatus != null ? errorStatus.name() : "", "]", new StringBuilder("handleSwingSensorConnected: failed to retrieve battery status, error status ["));
            int i14 = DeviceConnectionWorker.f33798i;
            DeviceConnectionWorker deviceConnectionWorker = DeviceConnectionWorker.this;
            deviceConnectionWorker.getClass();
            AbstractDeviceConnectionWorker.i(null, strO);
            int i15 = this.f33801c;
            if (i15 > 0) {
                deviceConnectionWorker.j(this.f33800b, i15 - 1);
            }
        }

        @Override // com.garmin.android.apps.connectmobile.gfdi.protobuf.DeviceStatusProtobufRequestManager.BatteryStatusResponseListener
        public final void onBatteryStatusRetrieved(long j8, int i14) {
            String strF = e0.f(i14, "handleSwingSensorConnected: battery status retrieved, current level [", "]");
            int i15 = DeviceConnectionWorker.f33798i;
            DeviceConnectionWorker deviceConnectionWorker = DeviceConnectionWorker.this;
            deviceConnectionWorker.getClass();
            AbstractDeviceConnectionWorker.h(strF);
            this.f33799a.s(i14);
            AbstractDeviceConnectionWorker.h("handleSwingSensorConnected: retrieving club list from SENSOR");
            SwingSensorProtobufRequestManager.getGolfClubList(deviceConnectionWorker.f11469a, this.f33800b.getF92746j(), new C0572a());
        }
    }

    public DeviceConnectionWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters, new v0());
    }

    public static void m(long j8) {
        GDISwingSensor.SwingSensorConnectedNotification.Builder builderNewBuilder = GDISwingSensor.SwingSensorConnectedNotification.newBuilder();
        GDISwingSensor.SwingSensorService.Builder builderNewBuilder2 = GDISwingSensor.SwingSensorService.newBuilder();
        builderNewBuilder2.setSwingSensorConnectedNotification(builderNewBuilder);
        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
        builderNewBuilder3.setExtension(GDISwingSensorExtension.swingSensorService, builderNewBuilder2.build());
        ProtobufRequestManager.getInstance().initiateRequest(builderNewBuilder3.build(), j8, (wm2.b) null);
    }

    @Override // com.garmin.device.pairing.impl.gdi.reconnection.AbstractDeviceConnectionWorker
    public final void e(DeviceProfile deviceProfile) {
        int i14;
        long f92746j = deviceProfile.getF92746j();
        if (f92746j < 0) {
            AbstractDeviceConnectionWorker.i(null, "doDeviceDisconnected: invalid remote device ID, so I can't update the 'is_connected' database column to false!");
            return;
        }
        c cVar = (c) KoinJavaComponent.get(c.class);
        if (cVar != null) {
            cVar.i(f92746j);
        }
        f.a().f152047c.getClass();
        Logger logger = i.f152075b;
        try {
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("is_connected", (Integer) 0);
            i14 = i.i(contentValues, f92746j);
        } catch (Exception e4) {
            logger.error("updateAsNotConnected", (Throwable) e4);
            i14 = -1;
        }
        StringBuilder sbW = v.h.w(i14, "updateAsNotConnected: unitID [", "], nbrRows [", f92746j);
        sbW.append("]");
        logger.debug(sbW.toString());
        i.e(i14);
        k(deviceProfile, deviceProfile.getF92742f(), false);
        Bundle bundle = new Bundle();
        bundle.putLong("GCM_extra_device_connected_unit_id", f92746j);
        bundle.putParcelable("GCM_extra_device_profile", deviceProfile);
        int iC = this.f11470b.f11427b.c("GATT_STATUS_KEY", -1);
        bundle.putInt("com.garmin.android.gdi.EXTRA_GATT_STATUS_VALUE", iC);
        pi2.h hVar = new pi2.h(bundle);
        oi2.a.f132270a.getClass();
        l73.c.b().e(hVar);
        l(iC, f92746j);
        AbstractDeviceConnectionWorker.h("doDeviceDisconnected: updated device unitID [" + f92746j + "] as disconnected and locally broadcasted this event.");
        if (km2.a.i(f92746j, null, SupportedCapability.SWING_SENSOR.ordinal())) {
            AbstractDeviceConnectionWorker.h("handleSwingSensorDisconnected");
            h hVarI = h.i();
            if (hVarI != null) {
                hVarI.r(null);
                hVarI.q(-1L);
                hVarI.f185932j = -1;
            }
            for (DeviceProfile deviceProfile2 : p.d()) {
                Configuration configuration = deviceProfile2.getConfiguration();
                if (configuration != null) {
                    if (l2.q(SupportedCapability.SWING_SENSOR_REMOTE, configuration.getCapabilityFlagsAsSet())) {
                        AbstractDeviceConnectionWorker.h("handleSwingSensorDisconnected: sending disconnect notification to SENSOR_REMOTE, unit ID [" + deviceProfile2.getF92746j() + "]");
                        long f92746j2 = deviceProfile2.getF92746j();
                        GDISwingSensor.SwingSensorDisconnectedNotification.Builder builderNewBuilder = GDISwingSensor.SwingSensorDisconnectedNotification.newBuilder();
                        GDISwingSensor.SwingSensorService.Builder builderNewBuilder2 = GDISwingSensor.SwingSensorService.newBuilder();
                        builderNewBuilder2.setSwingSensorDisconnectedNotification(builderNewBuilder);
                        GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
                        builderNewBuilder3.setExtension(GDISwingSensorExtension.swingSensorService, builderNewBuilder2.build());
                        ProtobufRequestManager.getInstance().initiateRequest(builderNewBuilder3.build(), f92746j2, (wm2.b) null);
                    }
                }
            }
        }
        SignificantLocationUpdateJobService.f47270e.getClass();
        Context context = this.f11469a;
        context.getClass();
        SignificantLocationUpdateJobService.a.b(context);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "SignifLocUpdJobService", "onDeviceDisconnected: device=" + f92746j);
        MusicManager.getInstance().unsubscribe(deviceProfile.getF92741e());
        f.a().f152045a.getClass();
        sd2.f fVarI = rd2.j.i(f92746j, null);
        if (fVarI != null) {
            hi1.b bVar = (hi1.b) KoinJavaComponent.get(hi1.b.class);
            bVar.getClass();
            if (!bVar.f83863a.a(fVarI)) {
                StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(f92746j, "Device not supported [deviceId=", ", productNumber=", fVarI.getProductNumber());
                sbK.append("]");
                i2.a.b(a2Var, "UpdateFindMyDeviceLocationIfSupportedUseCase", sbK.toString());
            } else {
                StringBuilder sbK2 = com.airbnb.lottie.animation.keyframe.a.k(f92746j, "Updating location [deviceId=", ", productNumber=", fVarI.getProductNumber());
                sbK2.append("]");
                i2.a.b(a2Var, "UpdateFindMyDeviceLocationIfSupportedUseCase", sbK2.toString());
                ge1.b.T(c0.a(bVar.f83865c), null, null, new hi1.c(bVar, f92746j, null), 3);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0527  */
    @Override // com.garmin.device.pairing.impl.gdi.reconnection.AbstractDeviceConnectionWorker
    public final void f(DeviceProfile deviceProfile) throws Throwable {
        int iUpdate;
        boolean zG;
        boolean zG2;
        bm2.c cVarC;
        Cursor cursor;
        Cursor cursor2;
        long j8;
        i22.d dVar;
        boolean zG3;
        boolean zG4;
        boolean zG5;
        boolean zG6;
        eq0.a aVarA;
        d dVar2 = new d(deviceProfile);
        try {
            Configuration configurationB = dVar2.b();
            if (configurationB != null) {
                AbstractDeviceConnectionWorker.h("saveSupportedCapabilities: " + dVar2.getF92742f() + " >> " + configurationB);
                sd2.e eVar = new sd2.e();
                eVar.f158646a = dVar2.getF92746j();
                eVar.f158647b = dVar2.f();
                eVar.f158648c = configurationB.getCapabilityFlags();
                ConnectDatabase.g().f().c(eVar);
                km2.a.j();
            } else {
                AbstractDeviceConnectionWorker.h("saveSupportedCapabilities: " + dVar2.getF92742f() + " >> mDeviceInfo.configuration is null for device " + dVar2.getF92742f() + ". Device does not yet support GDI message 5050.");
            }
        } catch (Exception e4) {
            AbstractDeviceConnectionWorker.i(e4, "saveSupportedCapabilities");
        }
        String strValueOf = String.valueOf(dVar2.getF92744h());
        yl2.b bVar = (yl2.b) yl2.b.B6.get(strValueOf);
        boolean z14 = true;
        if (bVar != null && td2.a.c(bVar.f197834c)) {
            bz.b bVar2 = new bz.b(bVar.f197834c, true);
            oi2.a.f132270a.getClass();
            l73.c.b().e(bVar2);
        }
        if (u0.n(strValueOf, u0.N5, u0.O5, u0.R5, u0.U5)) {
            s.b(this.f11469a, dVar2.getF92746j()).e(String.valueOf(dVar2.getF92745i()));
        }
        CacheDatabase.i().g().a(deviceProfile.getF92746j());
        i iVar = f.a().f152047c;
        long f92746j = dVar2.getF92746j();
        int connectionType = dVar2.getConnectionType();
        String strF = dVar2.f();
        iVar.getClass();
        Logger logger = i.f152075b;
        try {
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("mac_address", strF);
            contentValues.put("is_connected", (Integer) 1);
            iUpdate = rd2.a.b().update("devices", contentValues, "unit_id=? AND connection_type=?", new String[]{String.valueOf(f92746j), connectionType != 1 ? connectionType != 2 ? PrivacyUpdateRequestError.UNKNOWN : "btc" : "ble"});
        } catch (Exception e14) {
            logger.error("refreshPairing", (Throwable) e14);
            iUpdate = -1;
        }
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(f92746j, "refreshPairing: unitID [", "], macAddr [", strF);
        androidx.core.view.j.m(connectionType, iUpdate, "], connType [", "], nbrRows [", sbK);
        sbK.append("]");
        logger.debug(sbK.toString());
        i.e(iUpdate);
        String f92742f = deviceProfile.getF92742f();
        k(deviceProfile, f92742f, true);
        Bundle bundle = new Bundle();
        bundle.putString("GCM_extra_device_connected_name", f92742f);
        bundle.putString("GCM_extra_device_connected_product_number", strValueOf);
        bundle.putLong("GCM_extra_device_connected_unit_id", dVar2.getF92746j());
        bundle.putParcelable("GCM_extra_device_profile", deviceProfile);
        g gVar = new g(bundle);
        oi2.a.f132270a.getClass();
        l73.c.b().e(gVar);
        l(this.f11470b.f11427b.c("GATT_STATUS_KEY", -1), dVar2.getF92746j());
        AbstractDeviceConnectionWorker.h("doHandshakeCompleted: updated device " + f92742f + ", unitID [" + dVar2.getF92746j() + "] as connected and locally broadcasted this event.");
        hk0.e eVarF = hk0.e.f(this.f11469a);
        if (eVarF.i(dVar2.getF92746j())) {
            j(dVar2, 3);
        }
        long f92746j2 = dVar2.getF92746j();
        if (f92746j2 >= 0) {
            zG = hk0.e.g(f92746j2, SupportedCapability.SWING_SENSOR_REMOTE);
        } else {
            i2.l(eVarF.b(), "isGolfSwingSensorRemoteCapable(): FYI - Unable to execute operation. Invalid unit ID (" + f92746j2 + ")");
            zG = false;
        }
        if (zG) {
            AbstractDeviceConnectionWorker.h("handleSwingSensorRemoteConnected");
            for (DeviceProfile deviceProfile2 : p.d()) {
                Configuration configuration = deviceProfile2.getConfiguration();
                if (configuration != null) {
                    if (l2.q(SupportedCapability.SWING_SENSOR, configuration.getCapabilityFlagsAsSet())) {
                        AbstractDeviceConnectionWorker.h("handleSwingSensorRemoteConnected: sending connection notification to newly connected SENSOR_REMOTE, unit ID [" + deviceProfile2.getF92746j() + "]");
                        m(deviceProfile2.getF92746j());
                    }
                }
            }
        }
        long f92746j3 = dVar2.getF92746j();
        if (f92746j3 >= 0) {
            zG2 = hk0.e.g(f92746j3, SupportedCapability.INCIDENT_DETECTION);
        } else {
            i2.l(eVarF.b(), "isIncidentDetectionSupported(): FYI - Unable to execute operation. Invalid unit ID (" + f92746j3 + ")");
            zG2 = false;
        }
        if (zG2) {
            eq0.a.C1382a c1382a = eq0.a.f65038b;
            synchronized (eq0.a.class) {
                aVarA = eq0.a.f65038b.a();
            }
            long f92746j4 = dVar2.getF92746j();
            aVarA.getClass();
            com.garmin.android.library.backgroundtaskmanagement.c.d(new fq0.b(f92746j4), null);
        }
        if (GarminDeviceWakefulService.f33825e) {
            AbstractDeviceConnectionWorker.f50925g.warn(Thread.currentThread().getId() + ": doHandshakeCompleted: user is in pairing flow, GarminDeviceEnum's 'nonSetupFlowHandshakeCompletedStrategy' will NOT be called.");
            long f92746j5 = dVar2.getF92746j();
            if (f92746j5 >= 0) {
                zG3 = hk0.e.g(f92746j5, SupportedCapability.CONNECTIQ_DATA_FIELD_DOWNLOAD);
            } else {
                i2.l(eVarF.b(), "isConnectIQDataFieldDownloadSupported(): FYI - Unable to execute operation. Invalid unit ID (" + f92746j5 + ")");
                zG3 = false;
            }
            if (!zG3) {
                if (f92746j5 >= 0) {
                    zG4 = hk0.e.g(f92746j5, SupportedCapability.CONNECTIQ_WATCH_APP_DOWNLOAD);
                } else {
                    i2.l(eVarF.b(), "isConnectIQWatchAppDownloadSupported(): FYI - Unable to execute operation. Invalid unit ID (" + f92746j5 + ")");
                    zG4 = false;
                }
                if (!zG4) {
                    if (f92746j5 >= 0) {
                        zG5 = hk0.e.g(f92746j5, SupportedCapability.CONNECTIQ_WATCH_FACE_DOWNLOAD);
                    } else {
                        i2.l(eVarF.b(), "isConnectIQWatchFaceDownloadSupported(): FYI - Unable to execute operation. Invalid unit ID (" + f92746j5 + ")");
                        zG5 = false;
                    }
                    if (!zG5) {
                        if (f92746j5 >= 0) {
                            zG6 = hk0.e.g(f92746j5, SupportedCapability.CONNECTIQ_WIDGET_DOWNLOAD);
                        } else {
                            i2.l(eVarF.b(), "isConnectIQWidgetDownloadSupported(): FYI - Unable to execute operation. Invalid unit ID (" + f92746j5 + ")");
                            zG6 = false;
                        }
                        if (!zG6) {
                            z14 = false;
                        }
                    }
                }
            }
            if (z14) {
                if (!yj2.b.c(dVar2.getF92744h(), this.f11469a)) {
                    yj2.b.b(this.f11469a, GCMSettingManager.k().f77335a);
                }
            }
        } else {
            Context context = this.f11469a;
            long f92746j6 = dVar2.getF92746j();
            boolean zI = km2.a.i(f92746j6, null, SupportedCapability.EVENT_SHARING.ordinal());
            boolean zI2 = km2.a.i(f92746j6, null, SupportedCapability.DEVICE_DRIVEN_LIVETRACK_SUPPORT.ordinal());
            boolean zContains = GCMSettingManager.f41536b.contains(GCMSettingManager.f41535a.getString(R.string.key_live_event_sharing_alerts) + "_" + f92746j6);
            if (zI2 && zI && !zContains) {
                EventSharingSubscriptionHandler.fetchDeviceSupportedEvents(f92746j6);
                EventSharingSubscriptionHandler.askDeviceForLTSupportedFeatures(f92746j6);
            }
            u0 u0Var = (u0) u0.f203782n6.get(String.valueOf(dVar2.getF92744h()));
            if (u0Var == null) {
                AbstractDeviceConnectionWorker.h("doHandshakeCompletedUserInPairingFlowFalse: device == null, executing default BleNonSetupHandshakeStrategy");
                new mm2.c().b(context, dVar2);
            } else {
                String str = u0Var.f203860g;
                String str2 = u0Var.f203856c;
                if (str2 == null) {
                    AbstractDeviceConnectionWorker.f50925g.warn(Thread.currentThread().getId() + ": " + ("doHandshakeCompletedUserInPairingFlowFalse: " + u0Var.name() + ".nonSetupFlowHandshakeCompletedStrategyClassName is null. This is only a warning, as it may be null on purpose."));
                } else {
                    p.h(this.f50928f);
                    yl2.b bVarValueOf = yl2.b.f197686f;
                    try {
                        bVarValueOf = yl2.b.valueOf(str);
                    } catch (Exception e15) {
                        AbstractDeviceConnectionWorker.i(e15, "doHandshakeCompletedUserInPairingFlowFalse: Exception getting GarminDeviceType for " + str);
                    }
                    boolean z15 = (bVarValueOf.f197833b == null || TextUtils.isEmpty(bVarValueOf.f197835d)) ? false : true;
                    if ((!u0Var.f203859f && !z15) || u0Var == u0.L5) {
                        AbstractDeviceConnectionWorker.h("doHandshakeCompletedUserInPairingFlowFalse: executing ".concat(str2));
                        try {
                            cd0.i iVar2 = (cd0.i) Class.forName(str2).newInstance();
                            iVar2.f26813a = context;
                            iVar2.d(dVar2, false);
                        } catch (ReflectiveOperationException e16) {
                            AbstractDeviceConnectionWorker.i(e16, "doHandshakeCompletedUserInPairingFlowFalse: ReflectiveOperationException");
                        }
                    }
                }
            }
            zb0.b bVarA = zb0.b.a();
            bVarA.getClass();
            if (!GarminDeviceWakefulService.f33825e) {
                rd2.j jVar = f.a().f152045a;
                long f92746j7 = dVar2.getF92746j();
                jVar.getClass();
                if (rd2.j.h(f92746j7) == null && (cVarC = zb0.b.c(String.valueOf(dVar2.getF92744h()))) != null) {
                    m mVarF = m.f();
                    long f92746j8 = dVar2.getF92746j();
                    int f92744h = dVar2.getF92744h();
                    String strF2 = dVar2.f();
                    String f143516f = cVarC.getF143516f();
                    String f143516f2 = cVarC.getF143516f();
                    String str3 = cVarC.f18909g;
                    String str4 = cVarC.f18899b;
                    mVarF.getClass();
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("unit_id", Long.valueOf(f92746j8));
                    contentValues2.put("product_nbr", String.valueOf(f92744h));
                    contentValues2.put("mac_address", strF2);
                    contentValues2.put("product_display_name", f143516f);
                    contentValues2.put("bt_friendly_name", f143516f2);
                    contentValues2.put("image_url", str3);
                    contentValues2.put("part_nbr", str4);
                    try {
                        Cursor cursorQuery = qd2.a.b().f144484a.query("orphan_devices", null, "unit_id=?", new String[]{String.valueOf(f92746j8)}, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    j8 = cursorQuery.getLong(0);
                                } else {
                                    j8 = -1;
                                }
                            } catch (SQLException e17) {
                                e = e17;
                                cursor2 = cursorQuery;
                                try {
                                    m.f152083a.error("recordExists(" + f92746j8 + ")", (Throwable) e);
                                    throw e;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor = cursor2;
                                    rd2.a.a(cursor);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                cursor = cursorQuery;
                                rd2.a.a(cursor);
                                throw th;
                            }
                        } else {
                            j8 = -1;
                        }
                        rd2.a.a(cursorQuery);
                        if (j8 == -1) {
                            qd2.a.b().f144484a.insert("orphan_devices", null, contentValues2);
                        } else {
                            qd2.a.b().f144484a.update("orphan_devices", contentValues2, "_id=?", new String[]{String.valueOf(j8)});
                        }
                        String strF3 = dVar2.f();
                        if (dVar2.getF92743g() && dVar2.getConnectionType() != 1) {
                            strF3 = dVar2.d();
                        }
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 100;
                        Bundle bundle2 = new Bundle();
                        bundle2.putParcelable("extra_ble_device", new bd0.a(strF3, cVarC.getF143516f()));
                        bundle2.putParcelable("extra_device_dto", cVarC);
                        messageObtain.setData(bundle2);
                        bVarA.sendMessage(messageObtain);
                    } catch (SQLException e18) {
                        e = e18;
                        cursor2 = null;
                    } catch (Throwable th5) {
                        th = th5;
                        cursor = null;
                    }
                }
            }
        }
        if (GCMSettingManager.f41536b.getBoolean(GCMSettingManager.f41535a.getString(R.string.key_sync_on_connect) + dVar2.getF92746j(), false)) {
            GCMSettingManager.I(dVar2.getF92746j(), false);
            yr1.e.e(null, dVar2.getF92746j(), "DeviceConnectionWorker");
        }
        Context context2 = this.f11469a;
        long f92746j9 = dVar2.getF92746j();
        SignificantLocationUpdateJobService.f47270e.getClass();
        context2.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "SignifLocUpdJobService", "onDeviceConnected: device=" + f92746j9);
        HashMap mapP = GCMSettingManager.p();
        if (mapP.containsKey(Long.valueOf(f92746j9)) && (dVar = (i22.d) mapP.get(Long.valueOf(f92746j9))) != null) {
            h81.a aVar2 = new h81.a(21);
            qw0.b.a aVar3 = qw0.b.f148296j;
            i22.e eVar2 = new i22.e(aVar2, dVar, f92746j9);
            aVar3.getClass();
            qw0.b.a.a(context2, "SignifLocUpdJobService", eVar2);
        }
        SignificantLocationUpdateJobService.a.a(context2);
        c.f157877a.getClass();
        ((c) KoinJavaComponent.get$default(c.class, null, null, 6, null)).f(deviceProfile.getF92746j());
    }

    @Override // com.garmin.device.pairing.impl.gdi.reconnection.AbstractDeviceConnectionWorker
    public final void g() {
        p.g(this.f11469a);
    }

    public final void j(d dVar, int i14) {
        AbstractDeviceConnectionWorker.h("handleSwingSensorConnected");
        h hVarI = h.i();
        if (hVarI == null) {
            return;
        }
        Context context = this.f11469a;
        hVarI.p(context);
        g22.f.a("LoadUserGolfClubs", new wl0.g(hVarI, 1));
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e4) {
            AbstractDeviceConnectionWorker.i(e4, "handleSwingSensorConnected");
            Thread.currentThread().interrupt();
        }
        AbstractDeviceConnectionWorker.h("handleSwingSensorConnected: retrieving battery status from SENSOR");
        DeviceStatusProtobufRequestManager.getBatteryStatus(context, dVar.getF92746j(), new a(hVarI, dVar, i14));
    }

    public final void k(DeviceProfile deviceProfile, String str, boolean z14) {
        long f92746j = deviceProfile.getF92746j();
        String strValueOf = String.valueOf(deviceProfile.getF92744h());
        String macAddress = deviceProfile.getMacAddress();
        boolean z15 = deviceProfile.getF92738b() == 2 && f92746j != -1;
        boolean zI = hk0.e.f(this.f11469a).i(f92746j);
        Map<u0, t> map = n0.f203577a;
        a1 a1Var = new a1(z14, f92746j, strValueOf, str, macAddress, zI, !TextUtils.isEmpty(strValueOf) && (n0.i(u0.L5, strValueOf) || n0.i(u0.R5, strValueOf)), deviceProfile.getF92743g() && deviceProfile.getConnectionType() == 2, z15);
        z.f49770a.getClass();
        z.f49771b.j(new y<>(a1Var));
    }

    public final void l(int i14, long j8) {
        Map<u0, t> map = n0.f203577a;
        if (km2.a.i(j8, null, SupportedCapability.FIND_MY_WATCH.ordinal()) && km2.a.i(j8, null, SupportedCapability.ANTI_THEFT_ALARM.ordinal())) {
            Context context = this.f11469a;
            Intent intentD = l2.d(context, ConnectionChangeReceiver.class, "GCM_extra_device_connected_unit_id", j8);
            intentD.putExtra("GCM_extra_gatt_status", i14);
            context.sendBroadcast(intentD);
        }
    }
}
