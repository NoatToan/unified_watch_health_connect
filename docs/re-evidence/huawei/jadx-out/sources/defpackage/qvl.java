package defpackage;

import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.ui.device.activity.heartrate.HeartRateManager;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class qvl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeviceInfo f46904c;
    private int f;
    private mhs e = mhs.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private rer f46903b = new rer();
    private lxg d = lxg.c(BaseApplication.getContext());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceSettingsInteractors f46902a = DeviceSettingsInteractors.e(BaseApplication.getContext());

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        this.f = i;
    }

    private int d() {
        return this.f;
    }

    private DeviceCapability b() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_MAIN_DEVICES, null, "HeartRateControl");
        if (njy.e(deviceList)) {
            LogUtil.j("HeartRateControl", "jumpMusic currentDeviceInfo is null");
            return null;
        }
        for (DeviceInfo deviceInfo : deviceList) {
            if (deviceInfo.getDeviceConnectState() == 2) {
                return DeviceSettingsInteractors.e(BaseApplication.getContext()).e(deviceInfo.getDeviceIdentify());
            }
        }
        return null;
    }

    private int a() {
        DeviceCapability deviceCapabilityB = b();
        if (deviceCapabilityB == null) {
            return 0;
        }
        if (deviceCapabilityB.isSupportContinueHeartRate()) {
            LogUtil.a("HeartRateControl", "prepare add press continue heart rate item");
            return 1;
        }
        if (deviceCapabilityB.isSupportHeartRateEnable() && !deviceCapabilityB.isSupportContinueHeartRate()) {
            LogUtil.a("HeartRateControl", "prepare add press cycle heart rate item");
        }
        return 0;
    }

    private void c() {
        if (Utils.o()) {
            return;
        }
        this.d.d(1, 0, -1);
        this.d.d(2, 0, 0);
        this.d.d(3, 0, 0);
    }

    private boolean e() {
        String strD = mim.d("temperature_upper_remind");
        String strD2 = mim.d("temperature_lower_remind");
        LogUtil.a("HeartRateControl", "isTemperatureClosed upperValue : ", strD, ", lowerValue : ", strD2);
        return ((qrs.h(strD) > 0.0f ? 1 : (qrs.h(strD) == 0.0f ? 0 : -1)) <= 0) && ((qrs.h(strD2) > 0.0f ? 1 : (qrs.h(strD2) == 0.0f ? 0 : -1)) <= 0);
    }

    public void e(final HeartRateManager.HeartRateCallback heartRateCallback) {
        LogUtil.a("HeartRateControl", "queryHeartRateSwitch start");
        if (heartRateCallback == null) {
            LogUtil.j("HeartRateControl", "queryHeartRateSwitch: callback is null");
            return;
        }
        if (a() == 1) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add("continue_heart_rate");
            this.e.getSwitchSetting(arrayList, new IBaseResponseCallback() { // from class: qvl.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i == 0 && (obj instanceof List)) {
                        String strC = qvm.c((List) obj, "continue_heart_rate");
                        LogUtil.a("HeartRateControl", "stateStr", strC);
                        int iB = CommonUtil.b(BaseApplication.getContext(), strC, 0);
                        LogUtil.a("HeartRateControl", "CONTINUE_HEART_RATE status:", Integer.valueOf(iB));
                        heartRateCallback.onSuccess(Integer.valueOf(iB));
                    }
                }
            });
            return;
        }
        DeviceInfo deviceInfoD = mgg.d("HeartRateControl");
        this.f46904c = deviceInfoD;
        if (deviceInfoD != null && mgb.d(deviceInfoD.getDeviceIdentify()) == 2) {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "102", "heart_rate_button");
            LogUtil.a("HeartRateControl", "familyStatus", strE);
            heartRateCallback.onSuccess(Integer.valueOf(Integer.parseInt(strE)));
        } else {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add("heart_rate_button");
            this.e.getSwitchSetting(arrayList2, new IBaseResponseCallback() { // from class: qvl.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HeartRateControl", "initHeartRemind list errCode is ", Integer.valueOf(i));
                    if (i == 0 && (obj instanceof List)) {
                        String strC = qvm.c((List) obj, "heart_rate_button");
                        LogUtil.a("HeartRateControl", CloudParamKeys.INFO, strC);
                        heartRateCallback.onSuccess(Integer.valueOf(CommonUtil.j(strC)));
                    }
                }
            });
        }
    }

    public void g(HeartRateManager.HeartRateCallback heartRateCallback) {
        LogUtil.a("HeartRateControl", "querySupportLimitRemind start");
        if (heartRateCallback == null) {
            LogUtil.j("HeartRateControl", "querySupportLimitRemind: callback is null");
            return;
        }
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC != null) {
            if (deviceCapabilityC.isSupportHeartRateRaiseAlarm() && deviceCapabilityC.isSupportHeartRateDownAlarm()) {
                heartRateCallback.onSuccess(3);
                return;
            }
            if (deviceCapabilityC.isSupportHeartRateRaiseAlarm() && !deviceCapabilityC.isSupportHeartRateDownAlarm()) {
                heartRateCallback.onSuccess(2);
            } else if (!deviceCapabilityC.isSupportHeartRateRaiseAlarm() && deviceCapabilityC.isSupportHeartRateDownAlarm()) {
                heartRateCallback.onSuccess(1);
            } else {
                heartRateCallback.onSuccess(0);
            }
        }
    }

    public void b(final HeartRateManager.HeartRateCallback heartRateCallback) {
        LogUtil.a("HeartRateControl", "queryDownRemind start");
        if (heartRateCallback == null) {
            LogUtil.j("HeartRateControl", "queryDownRemind: callback is null");
            return;
        }
        if (a() == 1) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add("custom.heart_rate_down_remind");
            this.e.getSwitchSetting(arrayList, new IBaseResponseCallback() { // from class: qvl.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i == 0 && (obj instanceof List)) {
                        String strC = qvm.c((List) obj, "custom.heart_rate_down_remind");
                        LogUtil.a("HeartRateControl", "downNumber", strC);
                        if (strC == null) {
                            heartRateCallback.onSuccess(40);
                        } else {
                            heartRateCallback.onSuccess(Integer.valueOf(CommonUtil.j(strC)));
                        }
                    }
                }
            });
            return;
        }
        DeviceInfo deviceInfoD = mgg.d("HeartRateControl");
        this.f46904c = deviceInfoD;
        if (deviceInfoD != null && mgb.d(deviceInfoD.getDeviceIdentify()) == 2) {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "105", "custom.heart_rate_down_remind");
            LogUtil.a("HeartRateControl", "downValue", strE);
            if (strE == null) {
                heartRateCallback.onSuccess(40);
                return;
            } else {
                heartRateCallback.onSuccess(Integer.valueOf(CommonUtil.j(strE)));
                return;
            }
        }
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add("custom.heart_rate_down_remind");
        this.e.getSwitchSetting(arrayList2, new IBaseResponseCallback() { // from class: qvl.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("HeartRateControl", "initHeartRemind list errCode is ", Integer.valueOf(i));
                if (i == 0 && (obj instanceof List)) {
                    String strC = qvm.c((List) obj, "custom.heart_rate_down_remind");
                    LogUtil.a("HeartRateControl", "downNumber", strC);
                    if (strC == null) {
                        heartRateCallback.onSuccess(40);
                    } else {
                        heartRateCallback.onSuccess(Integer.valueOf(CommonUtil.j(strC)));
                    }
                }
            }
        });
    }

    public void i(final HeartRateManager.HeartRateCallback heartRateCallback) {
        LogUtil.a("HeartRateControl", "queryUpRemind start");
        if (heartRateCallback == null) {
            LogUtil.j("HeartRateControl", "queryUpRemind: callback is null");
            return;
        }
        if (a() == 1) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add("custom.heart_rate_raise_remind");
            this.e.getSwitchSetting(arrayList, new IBaseResponseCallback() { // from class: qvl.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i == 0 && (obj instanceof List)) {
                        String strC = qvm.c((List) obj, "custom.heart_rate_raise_remind");
                        LogUtil.a("HeartRateControl", "raiseNumber", strC);
                        if (strC == null) {
                            heartRateCallback.onSuccess(120);
                        } else {
                            heartRateCallback.onSuccess(Integer.valueOf(CommonUtil.j(strC)));
                        }
                    }
                }
            });
            return;
        }
        DeviceInfo deviceInfoD = mgg.d("HeartRateControl");
        this.f46904c = deviceInfoD;
        if (deviceInfoD != null && mgb.d(deviceInfoD.getDeviceIdentify()) == 2) {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "104", "custom.heart_rate_raise_remind");
            LogUtil.a("HeartRateControl", "raiseValue", strE);
            if (strE == null) {
                heartRateCallback.onSuccess(120);
                return;
            } else {
                heartRateCallback.onSuccess(Integer.valueOf(CommonUtil.j(strE)));
                return;
            }
        }
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add("custom.heart_rate_raise_remind");
        this.e.getSwitchSetting(arrayList2, new IBaseResponseCallback() { // from class: qvl.9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("HeartRateControl", "initHeartRemind list errCode is ", Integer.valueOf(i));
                if (i == 0 && (obj instanceof List)) {
                    String strC = qvm.c((List) obj, "custom.heart_rate_raise_remind");
                    LogUtil.a("HeartRateControl", "raiseNumber", strC);
                    if (strC == null) {
                        heartRateCallback.onSuccess(120);
                    } else {
                        heartRateCallback.onSuccess(Integer.valueOf(CommonUtil.j(strC)));
                    }
                }
            }
        });
    }

    public void a(HeartRateManager.HeartRateCallback heartRateCallback) {
        LogUtil.a("HeartRateControl", "querySupportContinueMeasurement start");
        if (heartRateCallback == null) {
            LogUtil.j("HeartRateControl", "querySupportContinueMeasurement: callback is null");
        } else if (a() == 1) {
            heartRateCallback.onSuccess(1);
        } else {
            heartRateCallback.onSuccess(0);
        }
    }

    public void d(final HeartRateManager.HeartRateCallback heartRateCallback) {
        LogUtil.a("HeartRateControl", "queryMeasurementMethod start");
        if (heartRateCallback == null) {
            LogUtil.j("HeartRateControl", "queryMeasurementMethod: callback is null");
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("heart_rate_mode");
        this.e.getSwitchSetting(arrayList, new IBaseResponseCallback() { // from class: qvl.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                int iJ;
                if (i == 0 && (obj instanceof List)) {
                    iJ = CommonUtil.j(qvm.c((List) obj, "heart_rate_mode"));
                    LogUtil.a("HeartRateControl", "supportValue", Integer.valueOf(iJ));
                } else {
                    iJ = 1;
                }
                if (iJ == 1) {
                    qvl.this.e(1);
                    heartRateCallback.onSuccess(1);
                }
                if (iJ == 0) {
                    qvl.this.e(2);
                    heartRateCallback.onSuccess(2);
                }
            }
        });
    }

    public void e(int i, HeartRateManager.HeartRateCallback heartRateCallback) {
        LogUtil.a("HeartRateControl", "setUpRemind start");
        if (heartRateCallback == null) {
            LogUtil.j("HeartRateControl", "setUpRemind: callback is null");
            return;
        }
        if (i == 0) {
            this.f46902a.c(0, i, true);
        } else {
            this.f46902a.c(1, i, true);
        }
        heartRateCallback.onSuccess(Integer.valueOf(i));
    }

    public void d(int i, HeartRateManager.HeartRateCallback heartRateCallback) {
        LogUtil.a("HeartRateControl", "setDownRemind start");
        if (heartRateCallback == null) {
            LogUtil.j("HeartRateControl", "setDownRemind: callback is null");
            return;
        }
        if (i == 0) {
            this.f46902a.e(0, i, true);
        } else {
            this.f46902a.e(1, i, true);
        }
        heartRateCallback.onSuccess(Integer.valueOf(i));
    }

    public void a(int i, HeartRateManager.HeartRateCallback heartRateCallback) {
        LogUtil.a("HeartRateControl", "setMeasurementMethod start");
        if (heartRateCallback == null) {
            LogUtil.j("HeartRateControl", "setMeasurementMethod: callback is null");
            return;
        }
        LogUtil.a("HeartRateControl", "setMeasurementMethod", Integer.valueOf(i));
        if (i == 1) {
            DeviceSettingsInteractors deviceSettingsInteractors = this.f46902a;
            if (deviceSettingsInteractors != null) {
                deviceSettingsInteractors.a(1);
                this.f46903b.d("biContinueHeartRateModeSwitch", 1);
            } else {
                LogUtil.j("HeartRateControl", "send cycle heart rate mDeviceInteractors is null");
            }
        }
        if (i == 2) {
            DeviceSettingsInteractors deviceSettingsInteractors2 = this.f46902a;
            if (deviceSettingsInteractors2 != null) {
                deviceSettingsInteractors2.c(1);
                this.f46903b.d("biContinueHeartRateModeSwitch", 0);
            } else {
                LogUtil.j("HeartRateControl", "send continue heart rate mDeviceInteractors is null");
            }
        }
        e(i);
        heartRateCallback.onSuccess(1);
    }

    public void c(HeartRateManager.HeartRateCallback heartRateCallback) {
        LogUtil.a("HeartRateControl", "offHeartRateAndHyperTempSwitch start");
        if (heartRateCallback == null) {
            LogUtil.j("HeartRateControl", "offHeartRateAndHyperTempSwitch: callback is null");
            return;
        }
        if (a() == 1) {
            if (d() == 1) {
                this.f46902a.a(0);
                this.f46903b.d("biContinueHeartRateSwitch", 1);
            }
            if (d() == 2) {
                this.f46902a.c(0);
                this.f46903b.d("biContinueHeartRateModeSwitch", 0);
            }
        } else {
            this.f46902a.c(false);
            ObserverManagerUtil.e(ObserveLabels.HEART_RATE_SWITCH_STATUS, 0);
        }
        c();
        heartRateCallback.onSuccess(1);
    }

    public void c(int i, HeartRateManager.HeartRateCallback heartRateCallback) {
        DeviceSettingsInteractors deviceSettingsInteractors;
        LogUtil.a("HeartRateControl", "setHeartRateSwitch start");
        if (heartRateCallback == null) {
            LogUtil.j("HeartRateControl", "setHeartRateSwitch: callback is null");
            return;
        }
        LogUtil.a("HeartRateControl", "HeartRateSwitch=", Integer.valueOf(i));
        LogUtil.a("HeartRateControl", "isHeartRateType=", Integer.valueOf(a()));
        if (a() == 1) {
            LogUtil.a("HeartRateControl", "getMeasurementType=", Integer.valueOf(d()));
            if (i == 0) {
                if (mbw.a() && !e()) {
                    LogUtil.a("HeartRateControl", "isTemperatureClosed=", "false");
                    heartRateCallback.onSuccess(2);
                } else {
                    LogUtil.a("HeartRateControl", "isTemperatureClosed=", "true");
                    d(i);
                    heartRateCallback.onSuccess(1);
                }
            }
            if (i == 1) {
                d(i);
                heartRateCallback.onSuccess(1);
            }
        } else {
            if (i == 0) {
                if (this.f46902a != null && mbw.a() && !e()) {
                    heartRateCallback.onSuccess(2);
                } else {
                    DeviceSettingsInteractors deviceSettingsInteractors2 = this.f46902a;
                    if (deviceSettingsInteractors2 != null) {
                        deviceSettingsInteractors2.c(false);
                        heartRateCallback.onSuccess(1);
                    } else {
                        LogUtil.a("HeartRateControl", " mDeviceInteractors is null");
                    }
                }
            }
            if (i == 1 && (deviceSettingsInteractors = this.f46902a) != null) {
                deviceSettingsInteractors.c(true);
                heartRateCallback.onSuccess(1);
            }
            this.f46903b.d("biAutoHeartRateSwitch", i);
        }
        ObserverManagerUtil.e(ObserveLabels.HEART_RATE_SWITCH_STATUS, Integer.valueOf(i));
    }

    private void d(int i) {
        LogUtil.a("HeartRateControl", " ContinueHeartRateSwitch status :", Integer.valueOf(i));
        if (d() == 1) {
            this.f46902a.a(i);
        }
        if (d() == 2) {
            this.f46902a.c(i);
        }
        this.f46903b.d("biContinueHeartRateSwitch", i);
    }
}
