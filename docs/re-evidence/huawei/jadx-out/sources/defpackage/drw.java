package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.devicesdk.callback.DeviceScanCallback;
import com.huawei.devicesdk.entity.ScanMode;
import com.huawei.health.device.callback.HeartRateDeviceSelectedCallback;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.model.MeasureResult;
import com.huawei.health.device.open.MeasureKit;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.device.wifi.entity.utils.JsonParser;
import com.huawei.health.devicemgr.api.constant.ExecuteMode;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.device.open.IDeviceEventHandler;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class drw {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static drw f32280c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private drv f32281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MeasurableDevice f32282b;
    private dmp e;

    private drw() {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter constructor");
        this.f32281a = new drv();
        this.e = dmp.d();
    }

    public static drw e() {
        if (f32280c == null) {
            f32280c = new drw();
        }
        return f32280c;
    }

    public boolean j(String str) {
        return !njy.e(d(etn.a(str)));
    }

    public MeasureKit i(String str) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter getMeasureKit");
        return dnf.e().a(str);
    }

    public HealthDevice c(String str) {
        return ecf.d(str);
    }

    public ArrayList<String> a() {
        return this.e.i();
    }

    public ArrayList<eby> d() {
        return this.e.b();
    }

    public HealthDevice b(String str) {
        return this.e.b(str);
    }

    public ArrayList<ContentValues> d(String str) {
        return this.e.c(str);
    }

    public HealthDevice a(String str) {
        return this.e.b(str, false);
    }

    public com.huawei.hihealth.device.open.HealthDevice e(String str) {
        return this.e.a(str);
    }

    public com.huawei.hihealth.device.open.HealthDevice a(String str, String str2) {
        return this.e.e(str, str2);
    }

    public ArrayList<String> d(HealthDevice.HealthDeviceKind healthDeviceKind) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter getBondedProducts");
        return this.e.a(healthDeviceKind);
    }

    public ArrayList<ContentValues> e(HealthDevice.HealthDeviceKind healthDeviceKind) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter getBondedProducts");
        return this.e.c(healthDeviceKind);
    }

    public ArrayList<String> a(HealthDevice.HealthDeviceKind healthDeviceKind) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter getBondedProductsForDeviceOnly");
        return this.e.b(healthDeviceKind);
    }

    public void a(ScanMode scanMode, List<cmy> list, DeviceScanCallback deviceScanCallback) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter scanDevice with UDS");
        this.e.c(scanMode, list, deviceScanCallback);
    }

    public boolean d(String str, IDeviceEventHandler iDeviceEventHandler) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter scanDeviceUniversal");
        if (iDeviceEventHandler == null) {
            return false;
        }
        return this.e.d(str, iDeviceEventHandler);
    }

    public boolean h(String str) {
        return this.e.h(str);
    }

    public void f() {
        this.e.g();
    }

    public boolean a(String str, HealthDevice healthDevice, com.huawei.health.device.callback.IDeviceEventHandler iDeviceEventHandler) {
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD == null) {
            return false;
        }
        return a(str, elhVarD.q(), healthDevice, iDeviceEventHandler);
    }

    public boolean a(final String str, String str2, final HealthDevice healthDevice, com.huawei.health.device.callback.IDeviceEventHandler iDeviceEventHandler) {
        boolean zB;
        ReleaseLogUtil.d("R_Weight_Plugin_HealthDeviceEntry", "Enter bindDevice");
        if (healthDevice instanceof dmt) {
            zB = this.e.c(str, healthDevice);
        } else if (healthDevice instanceof eby) {
            zB = this.e.a(str, str2, (eby) healthDevice, iDeviceEventHandler);
        } else if (healthDevice instanceof MeasurableDevice) {
            MeasurableDevice measurableDevice = (MeasurableDevice) healthDevice;
            this.f32282b = measurableDevice;
            zB = this.e.b(str, str2, measurableDevice, iDeviceEventHandler);
        } else {
            LogUtil.a("Plugin_HealthDeviceEntry", "other device type");
            zB = false;
        }
        lsy.a(new Runnable() { // from class: drw.3
            @Override // java.lang.Runnable
            public void run() {
                drw.this.a(str, healthDevice);
            }
        });
        return zB;
    }

    public boolean e(String str, final String str2, String str3, final MeasurableDevice measurableDevice, com.huawei.health.device.callback.IDeviceEventHandler iDeviceEventHandler) {
        String productId;
        String strName;
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter bindDevice");
        if (measurableDevice == null || TextUtils.isEmpty(measurableDevice.getUniqueId())) {
            LogUtil.j("Plugin_HealthDeviceEntry", "bindDevice device is null or device uniqueId is empty");
            iDeviceEventHandler.onStateChanged(-1);
            return false;
        }
        MeasurableDevice measurableDeviceB = this.e.b(str, false);
        if (measurableDeviceB == null) {
            productId = "";
            strName = productId;
        } else {
            strName = measurableDeviceB.getKind().name();
            productId = measurableDeviceB.getProductId();
        }
        if (!TextUtils.isEmpty(strName) && !TextUtils.isEmpty(productId)) {
            ContentValues contentValuesD = this.e.d(str2, str3, measurableDevice, "");
            contentValuesD.put("kind", HealthDevice.HealthDeviceKind.HDK_FITTINGS.name());
            contentValuesD.put("showInList", (Integer) 0);
            contentValuesD.put(KnitFragment.KEY_EXTRA, this.e.c(strName, productId, str, ""));
            boolean zE = this.e.e(str2, measurableDevice, iDeviceEventHandler, contentValuesD, "");
            if (zE) {
                dmp dmpVar = this.e;
                dmpVar.i(str, dmpVar.c("", str2, measurableDevice.getUniqueId(), str));
            }
            lsy.a(new Runnable() { // from class: drw.1
                @Override // java.lang.Runnable
                public void run() {
                    drw.this.a(str2, measurableDevice);
                }
            });
            return zE;
        }
        LogUtil.j("Plugin_HealthDeviceEntry", "attachKind or attachUuid is empty");
        iDeviceEventHandler.onStateChanged(-1);
        return false;
    }

    public void d(String str, String str2, String str3, MeasurableDevice measurableDevice, com.huawei.health.device.callback.IDeviceEventHandler iDeviceEventHandler) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter bind fittings device");
        if (TextUtils.isEmpty(str) || measurableDevice == null || TextUtils.isEmpty(measurableDevice.getUniqueId())) {
            LogUtil.j("Plugin_HealthDeviceEntry", "bindDevice device is null or device uniqueId or attachUniqueId is empty");
            iDeviceEventHandler.onStateChanged(-1);
            return;
        }
        if (this.e.b(measurableDevice.getUniqueId(), false) == null) {
            LogUtil.a("Plugin_HealthDeviceEntry", "fittingDevice is null");
            e(str, str2, str3, measurableDevice, iDeviceEventHandler);
            return;
        }
        LogUtil.a("Plugin_HealthDeviceEntry", "device is not null");
        MeasurableDevice measurableDeviceB = this.e.b(str, false);
        if (measurableDeviceB == null) {
            LogUtil.a("Plugin_HealthDeviceEntry", "attachDevice is null");
            iDeviceEventHandler.onStateChanged(-1);
        } else {
            dmp dmpVar = this.e;
            dmpVar.i(str, dmpVar.c("", str2, measurableDevice.getUniqueId(), str));
            this.e.i(measurableDevice.getUniqueId(), this.e.c(measurableDeviceB.getKind().name(), measurableDeviceB.getProductId(), measurableDeviceB.getUniqueId(), measurableDevice.getUniqueId()));
            measurableDevice.doCreateBond(iDeviceEventHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, HealthDevice healthDevice) {
        String uniqueId;
        if (str == null || healthDevice == null || (uniqueId = healthDevice.getUniqueId()) == null) {
            return;
        }
        elh elhVarD = ResourceManager.c().d(str);
        MeasurableDevice measurableDeviceB = dmp.d().b(uniqueId, false);
        if (elhVarD == null || measurableDeviceB == null) {
            return;
        }
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("privacy_data_source_device_name_4F32F873AE094ACAA75E35D53690B72C");
        String str2 = elo.a(str, elhVarD.l().d()) + Constants.LINK + dxm.h(uniqueId);
        String strD = d(uniqueId, measurableDeviceB);
        String serialNumber = measurableDeviceB.getSerialNumber();
        if (userPreference != null) {
            Map<String, Object> mapA = JsonParser.a(userPreference.getValue());
            mapA.put(strD, str2);
            if (!TextUtils.isEmpty(serialNumber)) {
                mapA.put(uniqueId, str2);
            }
            String string = JsonParser.a(mapA).toString();
            userPreference.setKey("privacy_data_source_device_name_4F32F873AE094ACAA75E35D53690B72C");
            userPreference.setValue(string);
            userPreference.setSyncStatus(0);
            LogUtil.a("Plugin_HealthDeviceEntry", "privacy hiUserPreference set ", Boolean.valueOf(HiHealthManager.d(BaseApplication.getContext()).setUserPreference(userPreference)));
            return;
        }
        HiUserPreference hiUserPreference = new HiUserPreference();
        HashMap map = new HashMap();
        map.put(strD, str2);
        if (!TextUtils.isEmpty(serialNumber)) {
            map.put(uniqueId, str2);
        }
        String string2 = JsonParser.a(map).toString();
        hiUserPreference.setKey("privacy_data_source_device_name_4F32F873AE094ACAA75E35D53690B72C");
        hiUserPreference.setValue(string2);
        LogUtil.a("Plugin_HealthDeviceEntry", "privacy hiUserPreference set ", Boolean.valueOf(HiHealthManager.d(BaseApplication.getContext()).setUserPreference(hiUserPreference)));
    }

    private String d(String str, MeasurableDevice measurableDevice) {
        String serialNumber = measurableDevice.getSerialNumber();
        return !TextUtils.isEmpty(serialNumber) ? serialNumber : str;
    }

    public boolean c(String str, String str2, HealthDevice healthDevice, com.huawei.health.device.callback.IDeviceEventHandler iDeviceEventHandler) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter bindWiFiUpdateDevice");
        if (!(healthDevice instanceof eby)) {
            return false;
        }
        return this.e.b(str, str2, (eby) healthDevice, iDeviceEventHandler);
    }

    public boolean c(String str, String str2, com.huawei.hihealth.device.open.HealthDevice healthDevice, IDeviceEventHandler iDeviceEventHandler) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter bindDeviceUniversal");
        boolean zC = this.e.c(str, str2, healthDevice, iDeviceEventHandler);
        ecu.d().executeDeviceRelatedLogic(ExecuteMode.CLEAR_AM_16_CACHE, null, "Plugin_HealthDeviceEntry");
        return zC;
    }

    public boolean m(String str) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter unbindDevice");
        return this.e.n(str);
    }

    public boolean o(String str) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter unbindDevice");
        return this.e.l(str);
    }

    public boolean l(String str) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter unbindDevice");
        return this.e.o(str);
    }

    public boolean f(String str) {
        return this.e.m(str);
    }

    public boolean j(String str, String str2) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter unbindDeviceUniversal");
        boolean zG = this.e.g(str, str2);
        ecu.d().executeDeviceRelatedLogic(ExecuteMode.CLEAR_AM_16_CACHE, null, "Plugin_HealthDeviceEntry");
        return zG;
    }

    public int c() {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter deleteWearDevice");
        return this.e.a();
    }

    public int g() {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter getWearDeviceSize");
        return this.e.j();
    }

    public boolean b() {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter cancelBinding");
        return this.e.c(this.f32282b);
    }

    public boolean e(String str, String str2, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle, MeasurableDevice measurableDevice) {
        ReleaseLogUtil.d("R_Weight_Plugin_HealthDeviceEntry", "Enter startMeasureDevice");
        return this.f32281a.c(str, str2, iHealthDeviceCallback, bundle, measurableDevice);
    }

    public boolean a(String str, String str2, IHealthDeviceCallback iHealthDeviceCallback) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter startBackgroundMeasure");
        Bundle bundle = new Bundle();
        bundle.putBoolean("isBackgroundMeasure", true);
        return this.f32281a.e(str, str2, iHealthDeviceCallback, bundle);
    }

    public boolean b(String str, String str2, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter startMeasure");
        return this.f32281a.e(str, str2, iHealthDeviceCallback, bundle);
    }

    public boolean g(String str) {
        return this.f32281a.b(str);
    }

    public boolean a(String str, String str2, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle, boolean z) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter startMeasureReconnect");
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("Plugin_HealthDeviceEntry", "startMeasureReconnect uniqueId is empty");
            return this.f32281a.c(str, iHealthDeviceCallback, bundle, z);
        }
        return this.f32281a.d(str, str2, iHealthDeviceCallback, bundle, z);
    }

    public boolean a(String str, String str2, com.huawei.hihealth.device.open.IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter startMeasureUniversal");
        return this.f32281a.b(str, str2, iHealthDeviceCallback, bundle);
    }

    public String b(HealthDevice.HealthDeviceKind healthDeviceKind, IHealthDeviceCallback iHealthDeviceCallback, HeartRateDeviceSelectedCallback heartRateDeviceSelectedCallback, com.huawei.hihealth.device.open.IHealthDeviceCallback iHealthDeviceCallback2, MeasureResult.MeasureResultListener measureResultListener) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter startMeasureHeartRate");
        return this.f32281a.a(healthDeviceKind, iHealthDeviceCallback, heartRateDeviceSelectedCallback, iHealthDeviceCallback2, measureResultListener);
    }

    public void e(String str, String str2) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter stopMeasure");
        this.f32281a.a(str, str2);
    }

    public void d(String str, String str2, int i) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter stopMeasureBleScale");
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("Plugin_HealthDeviceEntry", "stopMeasureBleScale unique is empty");
            this.f32281a.b(str, i);
        } else {
            this.f32281a.d(str, str2, i);
        }
    }

    public void d(String str, int i) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter stopMeasureBleScale");
        this.f32281a.b(str, i);
    }

    public void d(String str, String str2) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter stopMeasureUniversal");
        this.f32281a.c(str, str2);
    }

    public void c(String str, String str2) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter sendLocalBroadcast");
        this.e.a(str, str2);
    }

    public void d(String str, String str2, String str3) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter sendLocalBroadcast");
        this.e.e(str, str2, str3);
    }

    public void a(String str, String str2, String str3) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter sendLocalBroadcastUniversal");
        this.e.b(str, str2, str3);
    }

    public void b(String str, String str2) {
        LogUtil.a("Plugin_HealthDeviceEntry", "Enter cleanupMeasureUniversal");
        this.f32281a.d(str, str2);
    }

    public boolean d(Context context, ContentValues contentValues, String str) {
        return this.e.a(context, contentValues, str);
    }

    public void i() {
        ContentValues contentValuesH = h();
        if (contentValuesH == null) {
            LogUtil.j("Plugin_HealthDeviceEntry", "scale info is null");
            return;
        }
        String asString = contentValuesH.getAsString("productId");
        String asString2 = contentValuesH.getAsString("uniqueId");
        if (!dxm.al(asString) || TextUtils.isEmpty(asString2)) {
            LogUtil.j("Plugin_HealthDeviceEntry", "latest scale is not support, ", dyg.b(asString2));
            return;
        }
        eny.a().d(asString);
        dti.b(asString, asString2);
        ReleaseLogUtil.d("R_Weight_Plugin_HealthDeviceEntry", "start connect latest scale, mac address:", dyg.b(asString2));
        MeasurableDevice measurableDeviceB = dmp.d().b(asString2, true);
        if ((measurableDeviceB instanceof efx) && ((efx) measurableDeviceB).a()) {
            ReleaseLogUtil.d("R_Weight_Plugin_HealthDeviceEntry", "device has connected");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("type", -1);
        bundle.putString("productId", asString);
        bundle.putBoolean("isConnectAction", true);
        e(asString, asString2, new IHealthDeviceCallback() { // from class: drw.4
            @Override // com.huawei.health.device.callback.IHealthDeviceCallback
            public void onDataChanged(HealthDevice healthDevice, HealthData healthData) {
            }

            @Override // com.huawei.health.device.callback.IHealthDeviceCallback
            public void onDataChanged(HealthDevice healthDevice, List<HealthData> list) {
            }

            @Override // com.huawei.health.device.callback.IHealthDeviceCallback
            public void onFailed(HealthDevice healthDevice, int i) {
            }

            @Override // com.huawei.health.device.callback.IHealthDeviceCallback
            public void onProgressChanged(HealthDevice healthDevice, HealthData healthData) {
            }

            @Override // com.huawei.health.device.callback.IHealthDeviceCallback
            public void onStatusChanged(HealthDevice healthDevice, int i) {
                LogUtil.a("Plugin_HealthDeviceEntry", "connect latest scale, onStatusChanged, device:", Integer.valueOf(System.identityHashCode(healthDevice)), ", status: ", Integer.valueOf(i));
            }
        }, bundle, measurableDeviceB);
    }

    public ContentValues h() {
        ArrayList<ContentValues> arrayListC = dmp.d().c(HealthDevice.HealthDeviceKind.HDK_WEIGHT);
        ContentValues contentValues = null;
        if (arrayListC == null || arrayListC.isEmpty()) {
            LogUtil.j("Plugin_HealthDeviceEntry", "contentValues is empty");
            return null;
        }
        dsa dsaVar = new dsa("deviceUsedTime");
        long j = 0;
        for (ContentValues contentValues2 : arrayListC) {
            String asString = contentValues2.getAsString("productId");
            String asString2 = contentValues2.getAsString("uniqueId");
            if (TextUtils.isEmpty(asString) || TextUtils.isEmpty(asString2)) {
                LogUtil.j("Plugin_HealthDeviceEntry", "get latest scale : productId or deviceIdentify is empty");
            } else {
                long jB = dsaVar.b(dxw.d(), asString2);
                if (contentValues == null || j < jB) {
                    contentValues = contentValues2;
                    j = jB;
                }
            }
        }
        return contentValues;
    }
}
