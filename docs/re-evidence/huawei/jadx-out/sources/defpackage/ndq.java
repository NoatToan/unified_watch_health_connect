package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwdevice.phoneprocess.framework.hwdevicemgr.dmsmanager.HwDeviceMgrInterface;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ndq implements ParserInterface {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42956c = new Object();
    private static ndq d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f42957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42958b;
    private String e;
    private HwDeviceMgrInterface g;
    private String i;
    private Map<String, String> j = new HashMap();
    private BroadcastReceiver f = new BroadcastReceiver() { // from class: ndq.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            DeviceInfo deviceInfo;
            LogUtil.a("HwTempPhoneServiceManager", "mConnectStateChangedReceiver action:", intent == null ? Constants.NULL : intent.getAction());
            if (intent == null || (action = intent.getAction()) == null || !action.equals("com.huawei.bone.action.CONNECTION_STATE_CHANGED")) {
                return;
            }
            try {
                deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
            } catch (ClassCastException unused) {
                LogUtil.e("HwTempPhoneServiceManager", "ClassCastException");
                deviceInfo = null;
            }
            if (deviceInfo == null) {
                LogUtil.j("HwTempPhoneServiceManager", "mConnectStateChangedReceiver deviceInfo is null");
                return;
            }
            LogUtil.a("HwTempPhoneServiceManager", "mConnectStateChangedReceiver ConnectState is :", Integer.valueOf(deviceInfo.getDeviceConnectState()), " deviceName: ", deviceInfo.getDeviceName());
            if (deviceInfo.getDeviceConnectState() == 2) {
                if (!ndq.this.d(deviceInfo)) {
                    LogUtil.j("HwTempPhoneServiceManager", "mConnectStateChangedReceiver sendTmpCommandToDevice, isn't support temp.");
                } else if (ndq.this.a(deviceInfo) && !Utils.o()) {
                    ndq.this.f(deviceInfo);
                } else {
                    ndq.this.e(deviceInfo);
                    ndq.this.i(deviceInfo);
                }
            }
        }
    };

    public static ndq c() {
        ndq ndqVar;
        synchronized (f42956c) {
            if (d == null) {
                d = new ndq();
            }
            ndqVar = d;
        }
        return ndqVar;
    }

    private ndq() {
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.f, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
        this.g = mkf.e(BaseApplication.getContext());
    }

    public void d(DeviceInfo deviceInfo, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("HwTempPhoneServiceManager", "handlerUnitHiSync value isEmpty");
            return;
        }
        UnitUtil.d(!"false".equals(str2));
        if (str2.equals(this.f42958b)) {
            LogUtil.j("HwTempPhoneServiceManager", "handlerUnitHiSync value equals last");
            return;
        }
        if (deviceInfo == null) {
            LogUtil.j("HwTempPhoneServiceManager", "handlerUnitHiSync deviceInfo == null");
        } else if (!d(deviceInfo)) {
            LogUtil.j("HwTempPhoneServiceManager", "handlerUnitHiSync, Device isn't support temp.");
        } else {
            e(deviceInfo);
        }
    }

    public void e(DeviceInfo deviceInfo) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(12);
        deviceCommand.setCommandID(5);
        boolean zA = UnitUtil.a();
        int i = !zA ? 1 : 0;
        LogUtil.a("HwTempPhoneServiceManager", "Need set temperature unit info:", Integer.valueOf(i));
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(eeq.d(1)).append(eeq.d(1)).append(eeq.d(i));
        deviceCommand.setDataLen(eeq.c(stringBuffer.toString()).length);
        deviceCommand.setDataContent(eeq.c(stringBuffer.toString()));
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        this.g.sendDeviceData(deviceCommand);
        LogUtil.a("HwTempPhoneServiceManager", "sendTmpCommandToDevice Command:", deviceCommand.toString());
        this.f42958b = String.valueOf(zA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(DeviceInfo deviceInfo) {
        if (Utils.o()) {
            LogUtil.a("HwTempPhoneServiceManager", "sendTempDataToDevice, oversea setTemperatureSwitchToDevice");
            b(deviceInfo, mim.d("continuous_temp_monitoring"));
        } else {
            LogUtil.a("HwTempPhoneServiceManager", "sendTempDataToDevice, inland setTempUpperAndLowerRemindToDevice");
            d(deviceInfo, mim.d("temperature_upper_remind"));
            a(deviceInfo, mim.d("temperature_lower_remind"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(DeviceInfo deviceInfo) {
        c(4, deviceInfo, 0, 0);
    }

    private void b(DeviceInfo deviceInfo, String str) {
        ReleaseLogUtil.d("R_HwTempPhoneServiceManager", "setTemperatureSwitchToDevice value:", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c(1, deviceInfo, CommonUtil.n(BaseApplication.getContext(), str) == 1 ? 1 : 0, -1);
        this.f42957a = str;
    }

    private void d(DeviceInfo deviceInfo, String str) {
        int i;
        ReleaseLogUtil.d("R_HwTempPhoneServiceManager", "setTempUpperRemindToDevice value:", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int i2 = 0;
        try {
            float f = Float.parseFloat(str);
            if (f < 340.0f) {
                f *= 10.0f;
            }
            i = (int) f;
        } catch (NumberFormatException unused) {
            LogUtil.e("HwTempPhoneServiceManager", "setTemperatureDataToDevice NumberFormatException tempData : ", str);
            i = 0;
        }
        if (i != 0) {
            if (c(deviceInfo) && i != 372) {
                LogUtil.a("HwTempPhoneServiceManager", "setTemperatureDataToDevice setTempUpperRemindToCloud");
                str = c(372);
                i = 372;
            }
            i2 = 1;
        }
        c(2, deviceInfo, i2, i);
        this.i = str;
    }

    private void a(DeviceInfo deviceInfo, String str) {
        int i;
        ReleaseLogUtil.d("R_HwTempPhoneServiceManager", "setTempLowerRemindToDevice value:", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            float f = Float.parseFloat(str);
            if (f < 340.0f) {
                f *= 10.0f;
            }
            i = (int) f;
        } catch (NumberFormatException unused) {
            LogUtil.e("HwTempPhoneServiceManager", "setTemperatureDataToDevice NumberFormatException tempData : ", str);
            i = 0;
        }
        c(3, deviceInfo, i != 0 ? 1 : 0, i);
        this.e = str;
    }

    private void c(int i, DeviceInfo deviceInfo, int i2, int i3) {
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(eeq.d(1)).append(eeq.d(1)).append(eeq.d(i));
        stringBuffer.append(eeq.d(2)).append(eeq.d(1)).append(eeq.d(i2));
        String strE = eeq.e(i3);
        if (i3 != 0) {
            stringBuffer.append(eeq.d(3)).append(eeq.d(strE.length() / 2)).append(strE);
        }
        byte[] bArrC = eeq.c(stringBuffer.toString());
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(7);
        deviceCommand.setCommandID(42);
        deviceCommand.setDataLen(bArrC.length);
        deviceCommand.setDataContent(bArrC);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        this.g.sendDeviceData(deviceCommand);
        ReleaseLogUtil.d("R_HwTempPhoneServiceManager", "setTemperatureDataToDevice switchType : ", Integer.valueOf(i), ", switchStatus : ", Integer.valueOf(i2), ", switchValue : ", Integer.valueOf(i3));
    }

    private String c(int i) {
        String string = Float.toString(i / 10.0f);
        mim.d("temperature_upper_remind", string);
        return string;
    }

    public boolean d(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 29);
        LogUtil.a("HwTempPhoneServiceManager", "isDeviceSupportTemperature : ", Boolean.valueOf(zD));
        return zD;
    }

    public boolean c(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return false;
        }
        if (TextUtils.isEmpty(deviceInfo.getExpandCapability())) {
            LogUtil.a("HwTempPhoneServiceManager", "isDeviceSportTempClassification mExpandCapability is empty");
            deviceInfo.setExpandCapability(b(deviceInfo.getDeviceIdentify()));
        }
        boolean zD = eey.d(deviceInfo, 186);
        LogUtil.a("HwTempPhoneServiceManager", "isSupportTempClassification : ", Boolean.valueOf(zD), " deviceName: ", deviceInfo.getDeviceName());
        return zD;
    }

    private String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
        hwGetDevicesParameter.setDeviceIdentify(str);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, "HwTempPhoneServiceManager");
        if (deviceList == null || deviceList.isEmpty() || deviceList.get(0) == null) {
            LogUtil.j("HwTempPhoneServiceManager", "getDefiniteDeviceInfo deviceInfoList is null");
            return null;
        }
        return deviceList.get(0).getExpandCapability();
    }

    public boolean a(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 67);
        LogUtil.a("HwTempPhoneServiceManager", "isDeviceSupportTemperatureStudy : ", Boolean.valueOf(zD));
        return zD;
    }

    private void c(byte[] bArr, DeviceInfo deviceInfo) {
        boolean z;
        if (Utils.o()) {
            LogUtil.a("HwTempPhoneServiceManager", "handleTempStudyData, oversea");
            return;
        }
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("HwTempPhoneServiceManager", "handleTempStudyData data is error");
            return;
        }
        try {
            Iterator<eew> it = new eet().b(strE.substring(4, strE.length())).e().iterator();
            String strB = "";
            loop0: while (true) {
                z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    eew next = it.next();
                    int iV = CommonUtil.v(next.e());
                    if (iV != 1) {
                        if (iV == 2) {
                            strB = next.b();
                        } else {
                            LogUtil.j("HwTempPhoneServiceManager", "handleTempStudyData default");
                        }
                    } else if (CommonUtil.v(next.b()) == 4) {
                        z = true;
                    }
                }
            }
            LogUtil.a("HwTempPhoneServiceManager", "handleTempStudyData isStudy: ", Boolean.valueOf(z), "  status: ", strB);
            if (z) {
                if (CommonUtil.n(BaseApplication.getContext(), strB) == 1) {
                    h(deviceInfo);
                }
                e(deviceInfo, strB);
                Intent intent = new Intent();
                intent.setPackage(BaseApplication.getAppPackage());
                intent.setAction(c("tempStudyStatus"));
                BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
                return;
            }
            LogUtil.j("HwTempPhoneServiceManager", "handleTempStudyData isStudy : false");
        } catch (eeu unused) {
            LogUtil.e("HwTempPhoneServiceManager", "handleTempStudyData error");
        }
    }

    private void e(DeviceInfo deviceInfo, String str) {
        String strB = b(deviceInfo);
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        this.j.put(strB, str);
        mhs.a().setSwitchSettingToDb(strB, str);
    }

    private String b(DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            return deviceInfo.getDeviceName() + "_" + deviceInfo.getSoftVersion() + "_dbTempStudyStatusKey";
        }
        return "";
    }

    private String c(String str) {
        return BaseApplication.getAppPackage() + "." + str;
    }

    private void h(DeviceInfo deviceInfo) {
        e(deviceInfo);
        d(deviceInfo, mim.d("temperature_upper_remind"));
        a(deviceInfo, mim.d("temperature_lower_remind"));
    }

    public void e() {
        BaseApplication.getContext().unregisterReceiver(this.f);
        d();
    }

    private static void d() {
        synchronized (f42956c) {
            d = null;
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        c(bArr, deviceInfo);
    }

    public void c(DeviceInfo deviceInfo, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwTempPhoneServiceManager", "handlerTempMonitoring value isEmpty");
            return;
        }
        if (str.equals(this.f42957a)) {
            LogUtil.j("HwTempPhoneServiceManager", "handlerTempMonitoring value equals last");
            return;
        }
        if (deviceInfo == null) {
            LogUtil.j("HwTempPhoneServiceManager", "handlerTempMonitoring deviceInfo == null");
            return;
        }
        if (!d(deviceInfo)) {
            LogUtil.j("HwTempPhoneServiceManager", "handlerTempMonitoring Device isn't support temp.");
        } else if (!Utils.o()) {
            LogUtil.j("HwTempPhoneServiceManager", "handlerTempMonitoring, is not Oversea");
        } else {
            b(deviceInfo, str);
        }
    }

    public void a(DeviceInfo deviceInfo, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            LogUtil.j("HwTempPhoneServiceManager", "handlerTempRemind value isEmpty");
            return;
        }
        if (str2.equals("temperature_upper_remind".equals(str) ? this.i : this.e)) {
            LogUtil.j("HwTempPhoneServiceManager", "handlerTempRemind value equals last");
            return;
        }
        if (deviceInfo == null) {
            LogUtil.j("HwTempPhoneServiceManager", "handlerTempRemind deviceInfo == null");
            return;
        }
        if (!d(deviceInfo)) {
            LogUtil.j("HwTempPhoneServiceManager", "handlerTempRemind Device isn't support temp.");
            return;
        }
        if (Utils.o()) {
            LogUtil.j("HwTempPhoneServiceManager", "handlerTempRemind, is Oversea");
            return;
        }
        if (a(deviceInfo)) {
            if (CommonUtil.n(BaseApplication.getContext(), this.j.get(b(deviceInfo))) != 1) {
                LogUtil.j("HwTempPhoneServiceManager", "handlerTempRemind Device isn't join Study.");
                return;
            }
        }
        if ("temperature_upper_remind".equals(str)) {
            d(deviceInfo, str2);
        } else {
            a(deviceInfo, str2);
        }
    }
}
