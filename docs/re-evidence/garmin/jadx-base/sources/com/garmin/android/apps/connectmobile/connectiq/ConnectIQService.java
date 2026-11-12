package com.garmin.android.apps.connectmobile.connectiq;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.garmin.android.connectiq.IQApp;
import com.garmin.android.connectiq.IQDevice;
import com.garmin.android.connectiq.IQMessage;
import com.garmin.device.datatypes.DeviceProfile;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes7.dex */
public class ConnectIQService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f31801a = new a();

    public class a extends t0.a {
        public a() {
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.t0
        public final boolean F(String str) {
            if (!km2.a.h(km2.a.c())) {
                return false;
            }
            Intent intent = new Intent("com.garmin.android.connectmobile.OPEN_STORE");
            if (str != null) {
                intent.putExtra("CONNECT_IQ_APP_ID", str);
            }
            intent.setFlags(268435456);
            ConnectIQService.this.startActivity(intent);
            return true;
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.t0
        public final int J(IQDevice iQDevice) {
            int iOrdinal = IQDevice.IQDeviceStatus.UNKNOWN.ordinal();
            if (iQDevice != null && iQDevice.getDeviceIdentifier() > 0) {
                if (hk0.p.k(iQDevice.getDeviceIdentifier())) {
                    return IQDevice.IQDeviceStatus.CONNECTED.ordinal();
                }
                iOrdinal = IQDevice.IQDeviceStatus.NOT_PAIRED.ordinal();
                Iterator it = km2.a.a(km2.a.c()).iterator();
                while (it.hasNext()) {
                    if (((sd2.f) it.next()).getUnitID() == iQDevice.getDeviceIdentifier()) {
                        return IQDevice.IQDeviceStatus.NOT_CONNECTED.ordinal();
                    }
                }
            }
            return iOrdinal;
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.t0
        public final void M(IQMessage iQMessage, IQDevice iQDevice, IQApp iQApp) {
            z0.f(ConnectIQService.this).n(iQMessage.notificationPackage, iQMessage.notificationAction, iQDevice.getDeviceIdentifier(), iQApp.getApplicationId(), iQMessage.messageData, true);
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.t0
        public final void O(String str, String str2) {
            u0 u0VarB = u0.b();
            u0VarB.getClass();
            u0.b bVar = (u0.b) u0VarB.f32028b.remove(u0.a(str, str2));
            if (bVar != null) {
                bVar.f32034c.b();
            }
            u0VarB.d();
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.t0
        public final ArrayList P() {
            ArrayList arrayList = new ArrayList();
            for (sd2.f fVar : km2.a.a(km2.a.c())) {
                arrayList.add(new IQDevice(fVar.getUnitID(), !TextUtils.isEmpty(fVar.getDisplayName()) ? fVar.getDisplayName() : fVar.getProductDisplayName()));
            }
            return arrayList;
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.t0
        public final void X(IQApp iQApp, String str, String str2) {
            u0 u0VarB = u0.b();
            String applicationId = iQApp.getApplicationId();
            u0VarB.getClass();
            if (u0VarB.f32027a.putIfAbsent(u0.a(applicationId, str2), new u0.a(u0VarB, applicationId, str, str2)) == null) {
                u0VarB.d();
            }
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.t0
        public final void a0(IQApp iQApp, String str) {
            u0 u0VarB = u0.b();
            String applicationId = iQApp.getApplicationId();
            u0VarB.getClass();
            u0VarB.f32027a.remove(u0.a(applicationId, str));
            u0VarB.d();
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.t0
        public final void e0(String str, String str2, String str3) {
            try {
                o0 o0Var = o0.f31930a;
                Context applicationContext = ConnectIQService.this.getApplicationContext();
                o0Var.getClass();
                o0.b(applicationContext);
                if (u0.b().c(str) == null) {
                    u0 u0VarB = u0.b();
                    u0VarB.getClass();
                    if (u0VarB.f32028b.putIfAbsent(u0.a(str, str2), new u0.b(u0VarB, str, str2, str3)) == null) {
                        u0VarB.d();
                    }
                }
            } catch (SecurityException unused) {
                u0 u0VarB2 = u0.b();
                u0VarB2.getClass();
                u0.b bVar = (u0.b) u0VarB2.f32028b.remove(u0.a(str, str2));
                if (bVar != null) {
                    bVar.f32034c.b();
                }
                u0VarB2.d();
            }
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.t0
        public final void f0(IQMessage iQMessage, IQDevice iQDevice, IQApp iQApp) {
            z0.f(ConnectIQService.this).n(iQMessage.notificationPackage, iQMessage.notificationAction, iQDevice.getDeviceIdentifier(), iQApp.getApplicationId(), iQMessage.messageData, false);
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.t0
        public final ArrayList getConnectedDevices() {
            ArrayList<DeviceProfile> arrayListD = hk0.p.d();
            ArrayList arrayList = new ArrayList(arrayListD.size());
            HashSet hashSet = new HashSet();
            for (DeviceProfile deviceProfile : arrayListD) {
                if (!hashSet.contains(Long.valueOf(deviceProfile.getF92746j())) && km2.a.d(deviceProfile.getF92746j(), km2.a.c())) {
                    arrayList.add(new IQDevice(deviceProfile.getF92746j(), deviceProfile.getDeviceFullName()));
                    hashSet.add(Long.valueOf(deviceProfile.getF92746j()));
                }
            }
            return arrayList;
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.t0
        public final void l(String str, String str2, IQDevice iQDevice, String str3) {
            z0 z0VarF = z0.f(ConnectIQService.this);
            long deviceIdentifier = iQDevice.getDeviceIdentifier();
            ea2.d dVarE = z0VarF.e(deviceIdentifier);
            if (dVarE != null) {
                dVarE.getApplicationInfo(str3);
                z0VarF.l(deviceIdentifier, z0.d.APPLICATION_INFO, str3, str, str2, null, false);
            }
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.t0
        public final String o(IQDevice iQDevice) {
            for (sd2.f fVar : km2.a.a(km2.a.c())) {
                if (fVar.getUnitID() == iQDevice.getDeviceIdentifier()) {
                    return fVar.getPartNumber();
                }
            }
            return null;
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.t0
        public final ArrayList r() {
            ArrayList arrayList = new ArrayList();
            ArrayList<sd2.f> arrayListA = km2.a.a(km2.a.c());
            m80.a aVar = (m80.a) KoinJavaComponent.get(m80.a.class);
            for (sd2.f fVar : arrayListA) {
                if (aVar.e(fVar)) {
                    arrayList.add(new IQDevice(fVar.getUnitID(), !TextUtils.isEmpty(fVar.getDisplayName()) ? fVar.getDisplayName() : fVar.getProductDisplayName()));
                }
            }
            return arrayList;
        }

        @Override // com.garmin.android.apps.connectmobile.connectiq.t0
        public final void x(String str, String str2, IQDevice iQDevice, IQApp iQApp) {
            z0 z0VarF = z0.f(ConnectIQService.this);
            long deviceIdentifier = iQDevice.getDeviceIdentifier();
            String applicationId = iQApp.getApplicationId();
            z0VarF.getClass();
            z0VarF.l(deviceIdentifier, z0.d.OPEN_APPLICATION, applicationId, str, str2, null, false);
            ea2.d dVarE = z0VarF.e(deviceIdentifier);
            if (dVarE != null) {
                dVarE.d(applicationId);
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f31801a;
    }
}
