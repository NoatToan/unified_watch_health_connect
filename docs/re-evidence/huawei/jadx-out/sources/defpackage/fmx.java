package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.ContentValues;
import android.os.Bundle;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.device.callback.HeartRateDeviceSelectedCallback;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.model.MeasureResult;
import com.huawei.health.device.open.MeasureKit;
import com.huawei.hmf.annotation.ApiDefine;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = HealthDeviceEntryApi.class)
public class fmx implements HealthDeviceEntryApi {
    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public HealthDevice getBondedDevice(String str) {
        LogUtil.a("HealthDeviceEntryImpl", "getBondedDevice");
        return drw.e().b(str);
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public boolean isDeviceKitUniversal(String str) {
        LogUtil.a("HealthDeviceEntryImpl", "isDeviceKitUniversal");
        return drw.e().h(str);
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public com.huawei.hihealth.device.open.HealthDevice getBondedDeviceUniversal(String str) {
        LogUtil.a("HealthDeviceEntryImpl", "getBondedDeviceUniversal");
        return drw.e().e(str);
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public com.huawei.hihealth.device.open.HealthDevice getBondedDeviceUniversal(String str, String str2) {
        LogUtil.a("HealthDeviceEntryImpl", "getBondedDeviceUniversal");
        return drw.e().a(str, str2);
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public HealthDevice getBondedDeviceByUniqueId(String str) {
        LogUtil.a("HealthDeviceEntryImpl", "getBondedDeviceByUniqueId");
        return drw.e().a(str);
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public boolean unbindDeviceByUniqueId(String str) {
        LogUtil.a("HealthDeviceEntryImpl", "unbindDeviceByUniqueId");
        return drw.e().l(str);
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public boolean unbindDeviceUniversalByUniqueId(String str, String str2) {
        return drw.e().j(str, str2);
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public boolean bindDevice(String str, HealthDevice healthDevice, IDeviceEventHandler iDeviceEventHandler) {
        return drw.e().a(str, healthDevice, iDeviceEventHandler);
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public boolean bindDevice(String str, String str2, HealthDevice healthDevice, IDeviceEventHandler iDeviceEventHandler) {
        return drw.e().a(str, str2, healthDevice, iDeviceEventHandler);
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public ArrayList<ContentValues> getBondedDeviceByDeviceKind(HealthDevice.HealthDeviceKind healthDeviceKind) {
        return drw.e().e(healthDeviceKind);
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public void stopMeasureUniversal(String str, String str2) {
        drw.e().d(str, str2);
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public void cleanupMeasureUniversal(String str, String str2) {
        drw.e().b(str, str2);
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public void stopMeasure(String str, String str2) {
        drw.e().e(str, str2);
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public String startMeasureHeartRate(HealthDevice.HealthDeviceKind healthDeviceKind, IHealthDeviceCallback iHealthDeviceCallback, HeartRateDeviceSelectedCallback heartRateDeviceSelectedCallback, com.huawei.hihealth.device.open.IHealthDeviceCallback iHealthDeviceCallback2, MeasureResult.MeasureResultListener measureResultListener) {
        return drw.e().b(healthDeviceKind, iHealthDeviceCallback, heartRateDeviceSelectedCallback, iHealthDeviceCallback2, measureResultListener);
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public boolean unbindDevice(String str) {
        return drw.e().m(str);
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public MeasureKit getMeasureKit(String str) {
        return drw.e().i(str);
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public void sendLocalBroadcastUniversal(String str, String str2, String str3) {
        drw.e().a(str, str2, str3);
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public void sendLocalBroadcast(String str, String str2, String str3) {
        drw.e().d(str, str2, str3);
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public void stopMeasureBleScale(String str, String str2, int i) {
        drw.e().d(str, str2, i);
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public boolean startMeasureUniversal(String str, String str2, com.huawei.hihealth.device.open.IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle) {
        return drw.e().a(str, str2, iHealthDeviceCallback, bundle);
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public boolean startMeasureReconnect(String str, String str2, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle, boolean z) {
        return drw.e().a(str, str2, iHealthDeviceCallback, bundle, z);
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public boolean startMeasure(String str, String str2, IHealthDeviceCallback iHealthDeviceCallback, Bundle bundle) {
        return drw.e().b(str, str2, iHealthDeviceCallback, bundle);
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public ArrayList<String> getBondedWiFiDevices() {
        return drw.e().a();
    }

    @Override // com.huawei.health.device.api.HealthDeviceEntryApi
    public void startConnectLatestScale() {
        if (BluetoothAdapter.getDefaultAdapter().getState() == 10) {
            LogUtil.d("HealthDeviceEntryImpl", "bluetooth is not open");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: fmy
                @Override // java.lang.Runnable
                public final void run() {
                    drw.e().i();
                }
            });
        }
    }
}
