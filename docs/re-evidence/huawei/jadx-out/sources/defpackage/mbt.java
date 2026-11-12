package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HEXUtils;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class mbt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static mbt f41352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f41353b = new Object();

    private mbt() {
    }

    public static mbt a() {
        mbt mbtVar;
        synchronized (f41353b) {
            if (f41352a == null) {
                LogUtil.a("HwSleepBreatheManager", "getInstance");
                f41352a = new mbt();
            }
            mbtVar = f41352a;
        }
        return mbtVar;
    }

    public boolean b(DeviceInfo deviceInfo) {
        return eey.d(deviceInfo, 178) && fej.a("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.sleep-apnea") && (Utils.o() ? true : eey.d(deviceInfo, 107));
    }

    public boolean b() {
        fdi fdiVarD = fej.d("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.sleep-apnea");
        if (fdiVarD == null) {
            ReleaseLogUtil.e("HwSleepBreatheManager", "isEnableNMPA featureConfig is null");
            return false;
        }
        Map mapE = fdiVarD.e();
        Object obj = mapE.get("medical");
        ReleaseLogUtil.d("HwSleepBreatheManager", "isEnableNMPA medicalValue = ", obj);
        if (!(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
            return false;
        }
        Object obj2 = mapE.get("medicalType");
        ReleaseLogUtil.d("HwSleepBreatheManager", "isEnableNMPA medicalTypeValue = ", obj2);
        return "NMPA".equals(obj2);
    }

    public boolean d() {
        fdi fdiVarD = fej.d("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.emotion");
        if (fdiVarD == null) {
            ReleaseLogUtil.e("HwSleepBreatheManager", "isEnableForEmotionNMPA featureConfig is null");
            return true;
        }
        Object obj = fdiVarD.e().get("medical");
        ReleaseLogUtil.d("HwSleepBreatheManager", "isEnableForEmotionNMPA medicalValue = ", obj);
        if (obj instanceof Boolean) {
            return obj.equals(true);
        }
        return false;
    }

    public void a(String str) {
        mhs.a().setSwitchSetting("sleep_breathe_key", str, new IBaseResponseCallback() { // from class: mbv
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                LogUtil.a("HwSleepBreatheManager", "setSleepBreatheSwitch errorCode: ", Integer.valueOf(i));
            }
        });
        d(str);
    }

    public void d(String str) {
        DeviceInfo deviceInfoC = mgg.c("HwSleepBreatheManager");
        if (deviceInfoC == null || TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("R_HwSleepBreatheManager", "sendSettingDeviceCommand, deviceInfo is null or switchStatus isEmpty.");
            return;
        }
        if (deviceInfoC.getDeviceConnectState() != 2) {
            ReleaseLogUtil.e("R_HwSleepBreatheManager", "device is not connected.");
            return;
        }
        if (eey.d(deviceInfoC, 107)) {
            eef eefVarC = c(str);
            ReleaseLogUtil.d("R_HwSleepBreatheManager", "constructSampleConfig: ", eefVarC);
            edc.e().sendSampleConfigCommand(deviceInfoC, eefVarC, "HwSleepBreatheManager");
        } else {
            boolean zEquals = "true".equals(str);
            ReleaseLogUtil.d("R_HwSleepBreatheManager", "setSleepBreatheSwitch sendSettingDeviceCommand: ", Boolean.valueOf(zEquals));
            lxw.h(zEquals ? 2 : 0, deviceInfoC);
        }
    }

    private eef c(String str) {
        eef eefVar = new eef();
        eefVar.setSrcPkgName("hw.health.apneajsmodule");
        eefVar.setWearPkgName("hw.watch.health.osa");
        eefVar.setCommandId(1);
        eeg eegVar = new eeg();
        eegVar.b(900300008L);
        boolean zEquals = "true".equals(str);
        String str2 = HEXUtils.b(1) + HEXUtils.b(1) + HEXUtils.b(zEquals ? 1 : 0);
        LogUtil.a("HwSleepBreatheManager", "constructSampleConfig status is: ", Integer.valueOf(zEquals ? 1 : 0));
        eegVar.d(HEXUtils.a(str2));
        eegVar.b(1);
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        return eefVar;
    }
}
