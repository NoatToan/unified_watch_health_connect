package com.huawei.ui.device.interactors;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.google.gson.Gson;
import com.huawei.datatype.Contact;
import com.huawei.datatype.DataDeviceAvoidDisturbInfo;
import com.huawei.datatype.EventAlarmInfo;
import com.huawei.datatype.SmartAlarmInfo;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.service.HandleIntentService;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.R;
import defpackage.ecu;
import defpackage.eej;
import defpackage.ltb;
import defpackage.lvb;
import defpackage.lvv;
import defpackage.lvx;
import defpackage.lwl;
import defpackage.lxg;
import defpackage.lzb;
import defpackage.mas;
import defpackage.mbr;
import defpackage.meo;
import defpackage.mev;
import defpackage.mga;
import defpackage.mgg;
import defpackage.mhs;
import defpackage.mim;
import defpackage.nio;
import defpackage.nvd;
import defpackage.rcw;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class DeviceSettingsInteractors {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile DeviceSettingsInteractors f24949c;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private lvb f24950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f24951b;
    private lwl d;
    private lzb h;
    private IBaseResponseCallback i = null;

    public DeviceSettingsInteractors(Context context) {
        this.f24950a = null;
        this.h = null;
        if (context == null) {
            LogUtil.j("DeviceSettingsInteractors", "DeviceSettingsInteractors is null");
            return;
        }
        this.f24951b = context;
        this.f24950a = lvb.e();
        this.h = lzb.b();
        this.d = lwl.e(this.f24951b);
    }

    public static DeviceSettingsInteractors e(Context context) {
        DeviceSettingsInteractors deviceSettingsInteractors;
        synchronized (e) {
            if (f24949c == null) {
                f24949c = new DeviceSettingsInteractors(BaseApplication.getContext());
            }
            deviceSettingsInteractors = f24949c;
        }
        return deviceSettingsInteractors;
    }

    public DeviceCapability d() {
        LogUtil.a("DeviceSettingsInteractors", "serviceCapabilityNegotiation()");
        return eej.c();
    }

    public DeviceCapability e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceSettingsInteractors", "capabilityNegotiation id is empty");
            return null;
        }
        LogUtil.a("DeviceSettingsInteractors", "serviceCapabilityNegotiation(id):", CommonUtil.n(str));
        if (eej.a(str) == null) {
            DeviceInfo deviceInfoB = mgg.b(str, "DeviceSettingsInteractors");
            if (deviceInfoB != null && deviceInfoB.getDeviceConnectState() == 2) {
                Map<String, DeviceCapability> mapD = this.f24950a.d(3, "", "DeviceSettingsInteractors");
                if (mapD != null && mapD.get(str) != null) {
                    eej.a(str, mapD.get(str));
                    return mapD.get(str);
                }
                LogUtil.j("DeviceSettingsInteractors", "serviceCapabilityNegotiation(id) cap is null");
                return null;
            }
            LogUtil.j("DeviceSettingsInteractors", "serviceCapabilityNegotiation(id) device is not connected");
            return null;
        }
        return eej.a(str);
    }

    public List<DeviceInfo> b(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 3) {
            LogUtil.j("DeviceSettingsInteractors", "getDeviceInfoAsSmartLifeMac id is empty");
            return new ArrayList();
        }
        if (this.f24950a == null) {
            LogUtil.j("DeviceSettingsInteractors", "getDeviceInfoAsSmartLifeMac() mHwDeviceConfigManager is null");
            return new ArrayList();
        }
        String strSubstring = str.substring(str.length() - 3, str.length());
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "DeviceSettingsInteractors");
        ArrayList arrayList = new ArrayList(16);
        if (deviceList != null) {
            for (DeviceInfo deviceInfo : deviceList) {
                String strReplaceAll = deviceInfo.getDeviceIdentify().replaceAll(":", "");
                int length = strReplaceAll.length();
                if (length < 3) {
                    LogUtil.j("DeviceSettingsInteractors", "deviceMac length too short");
                } else if (strSubstring.equals(strReplaceAll.substring(length - 3, length))) {
                    LogUtil.a("DeviceSettingsInteractors", " id equals device mac");
                    arrayList.add(deviceInfo);
                }
            }
            LogUtil.a("DeviceSettingsInteractors", "not find submac = ", str);
            return arrayList;
        }
        LogUtil.j("DeviceSettingsInteractors", "getDeviceInfoAsSmartLifeMac() deviceInfoList is null");
        return arrayList;
    }

    public void c(IBaseResponseCallback iBaseResponseCallback) {
        mev.d().c(iBaseResponseCallback);
    }

    public void e(IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("DeviceSettingsInteractors", "getDevicePhoneInfo");
        mev.d().b(iBaseResponseCallback);
    }

    public void d(String str, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("DeviceSettingsInteractors", "setBluetoothOffalertSwitchStatus() isChecked ", Boolean.valueOf(z));
        this.h.b(str, z, iBaseResponseCallback);
    }

    public void a(String str, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("DeviceSettingsInteractors", "factoryReset()");
        mev.d().c(str, z, iBaseResponseCallback);
        lvv.c(this.f24951b).b("");
    }

    public void g() {
        LogUtil.a("DeviceSettingsInteractors", "removeFactoryResetCallback mRestoreFactoryCallBack:", this.i);
        mev.d().c(13, this.i);
    }

    public void e(String str, int i, IBaseResponseCallback iBaseResponseCallback) {
        this.d.c(str, i, iBaseResponseCallback);
    }

    public void a(String str, IBaseResponseCallback iBaseResponseCallback) {
        this.d.e(str, iBaseResponseCallback);
    }

    public void c(boolean z) {
        lxg.c(this.f24951b).c(z);
    }

    public void c(int i) {
        lxg.c(this.f24951b).c(i);
    }

    public void a(int i) {
        lxg.c(this.f24951b).d(i);
    }

    public void c(int i, int i2, boolean z) {
        lxg.c(this.f24951b).a(i, i2, z);
    }

    public void e(int i, int i2, boolean z) {
        lxg.c(this.f24951b).c(i, i2, z);
    }

    public void d(int i) {
        lxg.c(this.f24951b).b(i);
    }

    public void a(int i, int i2, boolean z) {
        lxg.c(this.f24951b).d(i, i2, z);
    }

    public void a(int i, int i2, int i3) {
        lxg.c(this.f24951b).d(i, i2, i3);
    }

    public void b(String str, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("DeviceSettingsInteractors", "getDeviceEventAlarm()");
        lvv.c(this.f24951b).e(str, iBaseResponseCallback);
    }

    public List<EventAlarmInfo> d(Object obj) {
        LogUtil.a("DeviceSettingsInteractors", "getEventAlarmList()");
        return lvv.c(this.f24951b).a(obj);
    }

    public void c(String str, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("DeviceSettingsInteractors", "getDeviceSmartAlarmList()");
        lvv.c(this.f24951b).b(str, iBaseResponseCallback);
    }

    public List<SmartAlarmInfo> a(Object obj) {
        LogUtil.a("DeviceSettingsInteractors", "getDeviceEventAlarm()");
        return lvv.c(this.f24951b).c(obj);
    }

    public void d(List<EventAlarmInfo> list) {
        if (list == null) {
            LogUtil.j("DeviceSettingsInteractors", "saveEventAlarmInfoList is null");
            return;
        }
        StorageParams storageParams = new StorageParams(0);
        String json = new Gson().toJson(list);
        LogUtil.a("DeviceSettingsInteractors", "saveEventAlarmLists json:", json);
        SharedPreferenceManager.e(this.f24951b, String.valueOf(10022), "DEVICE_EVENT_ALARM_INFO", json, storageParams);
        e(list);
    }

    public void b(List<SmartAlarmInfo> list) {
        if (list == null) {
            LogUtil.j("DeviceSettingsInteractors", "saveEventAlarmInfoList is null");
            return;
        }
        StorageParams storageParams = new StorageParams(0);
        String json = new Gson().toJson(list);
        LogUtil.a("DeviceSettingsInteractors", "saveEventAlarmLists json:", json);
        SharedPreferenceManager.e(this.f24951b, String.valueOf(10022), "DEVICE_SMART_ALARM_INFO", json, storageParams);
    }

    public void a(String str, List<EventAlarmInfo> list, IBaseResponseCallback iBaseResponseCallback) {
        lvv.c(this.f24951b).b(str, list, iBaseResponseCallback);
    }

    public void e(String str, List<SmartAlarmInfo> list, IBaseResponseCallback iBaseResponseCallback) {
        lvv.c(this.f24951b).c(str, list, iBaseResponseCallback);
    }

    public void c(List<EventAlarmInfo> list, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("DeviceSettingsInteractors", "setEventAlarm()");
        lvv.c(this.f24951b).b(list, iBaseResponseCallback, false);
        e(list);
    }

    public void e(List<EventAlarmInfo> list) {
        if (list == null) {
            LogUtil.j("DeviceSettingsInteractors", "saveOnceAlarm eventAlarmInfoList is null");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < list.size(); i++) {
            EventAlarmInfo eventAlarmInfo = list.get(i);
            if (eventAlarmInfo.getEventAlarmRepeat() == 0 && eventAlarmInfo.getEventAlarmEnable() == 1) {
                arrayList.add(eventAlarmInfo.resetAlarm(eventAlarmInfo, i));
            }
        }
        LogUtil.a("DeviceSettingsInteractors", "once eventAlarm saveAlarmInfoList.size():", Integer.valueOf(arrayList.size()));
        if (arrayList.size() > 0) {
            StorageParams storageParams = new StorageParams(0);
            String json = new Gson().toJson(arrayList);
            LogUtil.a("DeviceSettingsInteractors", "once eventAlarm saveOnceAlarm() json:", json);
            SharedPreferenceManager.e(this.f24951b, String.valueOf(10022), "ONCE_EVENT_ALARM_INFO", json, storageParams);
        }
    }

    public void e(List<SmartAlarmInfo> list, IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("DeviceSettingsInteractors", "setSmartAlarm()");
        lvv.c(this.f24951b).c(list, iBaseResponseCallback, false);
        a(list);
    }

    public void a(List<SmartAlarmInfo> list) {
        if (list == null) {
            LogUtil.j("DeviceSettingsInteractors", "saveOnceAlarm eventAlarmInfoList is null");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < list.size(); i++) {
            SmartAlarmInfo smartAlarmInfo = list.get(i);
            if (smartAlarmInfo.getSmartAlarmRepeat() == 0 && smartAlarmInfo.getSmartAlarmEnable() == 1) {
                arrayList.add(smartAlarmInfo.resetSmartAlarm(smartAlarmInfo, i));
            }
        }
        LogUtil.a("DeviceSettingsInteractors", "once saveOnceSmartAlarm saveAlarmInfoList.size():", Integer.valueOf(arrayList.size()));
        if (arrayList.size() > 0) {
            StorageParams storageParams = new StorageParams(0);
            String json = new Gson().toJson(arrayList);
            LogUtil.a("DeviceSettingsInteractors", "once saveOnceSmartAlarm() json:", json);
            SharedPreferenceManager.e(this.f24951b, String.valueOf(10022), "ONCE_SMART_ALARM_INFO", json, storageParams);
        }
    }

    public String c(String str) {
        LogUtil.a("DeviceSettingsInteractors", "getDeviceName by id");
        DeviceInfo deviceInfoB = mgg.b(str, "DeviceSettingsInteractors");
        if (deviceInfoB != null) {
            return deviceInfoB.getDeviceName();
        }
        return "";
    }

    public DeviceInfo e() {
        DeviceInfo deviceInfoC = mgg.c("DeviceSettingsInteractors");
        if (deviceInfoC != null) {
            return deviceInfoC;
        }
        return null;
    }

    public void e(boolean z) {
        ReleaseLogUtil.d("R_DeviceSettingsInteractors", "setWeatherReportSwitch setSwitchSetting.WEATHER_SWITCH_STATUS isChecked:", Boolean.valueOf(z));
        mim.d("weather_switch_status", String.valueOf(z));
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.getState() == 10) {
            LogUtil.j("DeviceSettingsInteractors", "setWeatherReportSwitch switch not on, not need start service!");
            return;
        }
        if (!mga.c()) {
            LogUtil.j("DeviceSettingsInteractors", "setWeatherReportSwitch have no device so do not start PhoneService.");
            return;
        }
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) HandleIntentService.class);
        intent.setAction("com.huawei.health.ACTION_WEATHER_PUSH");
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.huawei.health.ACTION_WEATHER_PUSH_VALUE", z);
        intent.putExtras(bundle);
        LogUtil.a("DeviceSettingsInteractors", "start to push notification msg.");
        BaseApplication.getContext().startService(intent);
    }

    public void b() {
        LogUtil.a("DeviceSettingsInteractors", "pushLocalPressure");
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.getState() == 10) {
            LogUtil.a("DeviceSettingsInteractors", "pushLocalPressure switch not on, not need start service!");
            return;
        }
        if (!mga.c()) {
            LogUtil.a("DeviceSettingsInteractors", "pushLocalPressure have no device so do not start PhoneService.");
            return;
        }
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) HandleIntentService.class);
        intent.setAction("com.huawei.health.ACTION_LOCAL_PRESSURE_PUSH");
        LogUtil.a("DeviceSettingsInteractors", "start to push pushLocalPressure msg.");
        BaseApplication.getContext().startService(intent);
    }

    public void a() {
        LogUtil.a("DeviceSettingsInteractors", "pushWeatherData");
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.getState() == 10) {
            LogUtil.j("DeviceSettingsInteractors", "pushWeatherData switch not on, not need start service!");
            return;
        }
        if (!mga.c()) {
            LogUtil.j("DeviceSettingsInteractors", "pushWeatherData have no device so do not start PhoneService.");
            return;
        }
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) HandleIntentService.class);
        intent.setAction("com.huawei.health.ACTION_WEATHER_DATA_PUSH");
        LogUtil.a("DeviceSettingsInteractors", "start to push weather data msg.");
        BaseApplication.getContext().startService(intent);
    }

    public void a(boolean z) {
        LogUtil.a("DeviceSettingsInteractors", "setWeatherReportUnit weatherReportUnit ", Boolean.valueOf(z));
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.getState() == 10) {
            LogUtil.j("DeviceSettingsInteractors", "setWeatherReportUnit switch not on, not need start service!");
        } else {
            ReleaseLogUtil.d("R_DeviceSettingsInteractors", "setWeatherReportUnit setSwitchSetting.WEATHER_SWITCH_UNIT_STATUS isChecked:", Boolean.valueOf(z));
            mhs.a().setSwitchSetting("weather_switch_unit_status", String.valueOf(z), new IBaseResponseCallback() { // from class: com.huawei.ui.device.interactors.DeviceSettingsInteractors.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    ReleaseLogUtil.d("R_DeviceSettingsInteractors", "setSwitchSetting.WEATHER_SWITCH_UNIT_STATUS errorCode:", Integer.valueOf(i));
                    if (i == 0) {
                        if (!mga.c()) {
                            LogUtil.j("DeviceSettingsInteractors", "setWeatherReportUnit have no device so do not start PhoneService.");
                            return;
                        }
                        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) HandleIntentService.class);
                        intent.setAction("com.huawei.health.ACTION_WEATHER_DATA_PUSH");
                        LogUtil.a("DeviceSettingsInteractors", "start to push weather unit data msg.");
                        BaseApplication.getContext().startService(intent);
                    }
                }
            });
        }
    }

    public void a(String str, final Handler handler, boolean z) {
        if (handler == null || TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceSettingsInteractors", "restoreFactory handler or id is null");
            return;
        }
        final DeviceInfo deviceInfoB = mgg.b(str, "DeviceSettingsInteractors");
        if (deviceInfoB == null) {
            LogUtil.j("DeviceSettingsInteractors", "restoreFactory currentDeviceInfo is null");
            handler.removeMessages(11);
            handler.sendEmptyMessage(11);
            return;
        }
        if (this.i != null) {
            g();
        }
        this.i = new IBaseResponseCallback() { // from class: com.huawei.ui.device.interactors.DeviceSettingsInteractors.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("DeviceSettingsInteractors", "mRestoreFactoryCallback,err_code:", Integer.valueOf(i));
                if (i == 0) {
                    LogUtil.a("DeviceSettingsInteractors", "objData is :", obj);
                    e(((Integer) obj).intValue());
                } else {
                    b();
                }
                DeviceSettingsInteractors.this.g();
            }

            private void e(int i) {
                if (i == 100000) {
                    LogUtil.a("DeviceSettingsInteractors", "restoreFactory reset success");
                    handler.sendEmptyMessage(8);
                    DeviceSettingsInteractors.this.e(deviceInfoB);
                } else if (i == 101901) {
                    LogUtil.a("DeviceSettingsInteractors", "restoreFactory reset failed delete esim failed");
                    handler.sendEmptyMessage(10);
                } else {
                    LogUtil.a("DeviceSettingsInteractors", "restoreFactory reset failed others");
                    b();
                }
            }

            private void b() {
                handler.removeMessages(11);
                handler.sendEmptyMessage(11);
                LogUtil.j("DeviceSettingsInteractors", "mRestoreFactory failed.");
            }
        };
        int productType = deviceInfoB.getProductType();
        LogUtil.a("DeviceSettingsInteractors", "restoreFactory productType:", Integer.valueOf(productType), ",mRestoreFactoryCallBack:", this.i);
        a(str, z, this.i);
    }

    public void c() {
        LogUtil.a("DeviceSettingsInteractors", "enter handleRestoreFactorySuccess()");
    }

    public void e(Context context, IBaseResponseCallback iBaseResponseCallback) {
        if (context == null) {
            LogUtil.j("DeviceSettingsInteractors", "getNoDisturbInfo context is null");
        } else if (iBaseResponseCallback == null) {
            LogUtil.j("DeviceSettingsInteractors", "getNoDisturbInfo() hwDeviceConfigManager is null or callback is null");
        } else {
            mev.d().e(iBaseResponseCallback);
        }
    }

    public void e(String str, DataDeviceAvoidDisturbInfo dataDeviceAvoidDisturbInfo, IBaseResponseCallback iBaseResponseCallback) {
        if (dataDeviceAvoidDisturbInfo == null) {
            LogUtil.j("DeviceSettingsInteractors", "setNoDisturb2Device() hwDeviceConfigManager or dataDeviceAvoidDisturbInfo is null");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(dataDeviceAvoidDisturbInfo);
        mev.d().b(str, arrayList, iBaseResponseCallback, false);
    }

    public List<Contact> d(Context context) {
        lvx lvxVarD = lvx.d();
        if (lvxVarD == null) {
            LogUtil.j("DeviceSettingsInteractors", "getContact() hwAddressBookManager is null");
            return new ArrayList();
        }
        return lvxVarD.a();
    }

    public void b(Context context, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null && context == null) {
            LogUtil.j("DeviceSettingsInteractors", "updateContact callback or context is null");
            return;
        }
        lvx lvxVarD = lvx.d();
        if (lvxVarD == null) {
            LogUtil.j("DeviceSettingsInteractors", "getContact() hwAddressBookManager is null");
            iBaseResponseCallback.a(0, null);
        } else {
            lvxVarD.d(iBaseResponseCallback);
        }
    }

    public void d(Context context, List<Contact> list, IBaseResponseCallback iBaseResponseCallback) {
        lvx lvxVarD = lvx.d();
        if (lvxVarD == null || list == null) {
            LogUtil.j("DeviceSettingsInteractors", "hwAddressBookManager is null or list is null");
        } else {
            LogUtil.a("DeviceSettingsInteractors", "before list.size:", Integer.valueOf(list.size()));
            lvxVarD.c(list, iBaseResponseCallback, false);
        }
    }

    public int b(Context context) {
        lvx lvxVarD = lvx.d();
        if (lvxVarD == null) {
            LogUtil.j("DeviceSettingsInteractors", "hwAddressBookManager is null");
            return 0;
        }
        return lvxVarD.b();
    }

    public void d(Context context, String str, IBaseResponseCallback iBaseResponseCallback) {
        mas masVarC = mas.c(context);
        if (masVarC == null) {
            LogUtil.j("DeviceSettingsInteractors", "getOneLevelMenu() hwOneLevelMenuManager is null");
        } else {
            masVarC.d(str, iBaseResponseCallback);
        }
    }

    public void a(Context context, String str, List<Integer> list, IBaseResponseCallback iBaseResponseCallback) {
        mas masVarC = mas.c(context);
        if (masVarC == null || list == null) {
            LogUtil.j("DeviceSettingsInteractors", "hwOneLevelMenuManager is null or list is null");
        } else {
            LogUtil.a("DeviceSettingsInteractors", "before list.size :", Integer.valueOf(list.size()));
            masVarC.e(str, list, iBaseResponseCallback);
        }
    }

    public String c(Context context, int i, int i2) {
        String strA;
        String strB = ltb.b(i);
        String strB2 = ltb.b(i2);
        String strA2 = a(strB);
        if (i > i2) {
            strA = context.getResources().getString(R.string.IDS_no_disturb_setting_next_day, a(strB2));
        } else {
            strA = a(strB2);
        }
        return strA2 + System.lineSeparator() + strA;
    }

    public String a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceSettingsInteractors", "getTimeStr time is null");
        }
        String str2 = "";
        try {
            str2 = DateFormat.getTimeFormat(this.f24951b.getApplicationContext()).format(Long.valueOf(new SimpleDateFormat("HH:mm").parse(str).getTime()));
            LogUtil.a("DeviceSettingsInteractors", "getOffsetTimeStr dateFormat time:", str2);
            return str2;
        } catch (ParseException e2) {
            LogUtil.e("DeviceSettingsInteractors", "e.getMessage() is:", e2.getMessage());
            return str2;
        }
    }

    public void e(int i) {
        LogUtil.a("DeviceSettingsInteractors", "push data to device: (5.32.9)------", Integer.valueOf(i));
        mbr.a().e(i);
    }

    public void d(boolean z) {
        LogUtil.a("DeviceSettingsInteractors", "setPressAutoMonitorSwitch isChecked :", Boolean.valueOf(z));
        mbr.a().b(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DeviceInfo deviceInfo) {
        LogUtil.a("DeviceSettingsInteractors", "delete shared preference when reset");
        String strE = nio.e(deviceInfo.getDeviceIdentify());
        String strE2 = SharedPreferenceManager.e(this.f24951b, String.valueOf(PrebakedEffectId.RT_COIN_DROP), strE);
        LogUtil.a("DeviceSettingsInteractors", "sharedPreferenceResult is ", strE2);
        if ("0".equals(strE2)) {
            SharedPreferenceManager.b(this.f24951b, String.valueOf(PrebakedEffectId.RT_COIN_DROP), strE);
        }
        meo.a().e(deviceInfo);
        rcw.b(BaseApplication.getContext()).b(deviceInfo);
        nvd.e("", BaseApplication.getContext(), deviceInfo.getSoftVersion(), deviceInfo.getDeviceIdentify());
        LogUtil.a("DeviceSettingsInteractors", "Delete setDeviceNewContent success");
    }
}
