package defpackage;

import com.huawei.health.device.callback.HeartRateDeviceSelectedCallback;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class fhi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f34062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HeartRateDeviceSelectedCallback f34063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthDevice f34064c;
    private IBaseResponseCallback d;

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final fhi f34066b = new fhi();
    }

    private fhi() {
        this.f34062a = new ArrayList(10);
        this.d = new IBaseResponseCallback() { // from class: fhi.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 100000 && (obj instanceof JSONObject)) {
                    fhf.b().a((JSONObject) obj, 50001);
                }
            }
        };
        this.f34063b = new HeartRateDeviceSelectedCallback() { // from class: fhi.1
            @Override // com.huawei.health.device.callback.HeartRateDeviceSelectedCallback
            public void onResponse(HealthDevice healthDevice) {
                if (healthDevice == null) {
                    LogUtil.a("HWhealthLinkage_", "HeartRateDeviceSelectedCallback device is null");
                    return;
                }
                LogUtil.a("HWhealthLinkage_", "HeartRateDeviceSelectedCallback " + healthDevice.getDeviceName());
                fhi.this.f34064c = healthDevice;
                if (fic.e().d() == -1) {
                    LogUtil.a("HWhealthLinkage_", "HeartRateDeviceSelectedCallback failed to open heartrate");
                    fic.e().d(1, fhi.this.d);
                }
            }
        };
    }

    public static final fhi d() {
        return b.f34066b;
    }

    public void b() {
        LogUtil.a("HWhealthLinkage_", "Enter removeHeartRateDevice");
        this.f34064c = null;
    }

    public boolean a() {
        eny.a().b(this.f34063b);
        return true;
    }

    public void a(String str) {
        this.f34062a.add(str);
    }

    public void b(DeviceInfo deviceInfo) {
        LogUtil.a("HWhealthLinkage_", "putDevicesInfoInPluginDevice enter");
        if (deviceInfo == null) {
            LogUtil.j("HWhealthLinkage_", "no heartRate devices");
            return;
        }
        if (eel.d(deviceInfo.getProductType())) {
            LogUtil.a("HWhealthLinkage_", "aw70 device not support heart rate, do not put into PluginDevice");
            return;
        }
        LogUtil.d("HWhealthLinkage_", "deviceInfo is ", deviceInfo.toString(), ",deviceInfo deviceName is ", deviceInfo.getDeviceName(), ",deviceInfo uuid size ", Integer.valueOf(this.f34062a.size()));
        String string = UUID.randomUUID().toString();
        LogUtil.d("HWhealthLinkage_", "randomUUidString is " + string);
        String deviceName = deviceInfo.getDeviceName();
        String securityUuid = deviceInfo.getSecurityUuid();
        this.f34062a.add(securityUuid);
        if (deviceName != null && securityUuid != null) {
            drw.e().a(string, (String) null, new dmt(deviceInfo.getDeviceName(), deviceInfo.getSecurityUuid() + "#ANDROID21", deviceInfo.getProductType()), (IDeviceEventHandler) null);
            return;
        }
        LogUtil.j("HWhealthLinkage_", "deviceName is null or uniqueId is null");
    }

    public void e() {
        for (int i = 0; i < this.f34062a.size(); i++) {
            if (c(this.f34062a.get(i))) {
                LogUtil.a("HWhealthLinkage_", "succeed to delete device in device.db");
                fhz.d().e().remove(i);
                fhz.d().a(false);
                fhz.d().c(false);
                fhz.d().d(false);
            } else {
                LogUtil.j("HWhealthLinkage_", "failed to delete device in device.db");
            }
        }
        this.f34062a.clear();
        fhz.d().e().clear();
    }

    private boolean c(String str) {
        if (fhz.d().e(str)) {
            return true;
        }
        return drw.e().l(str + "#ANDROID21");
    }
}
