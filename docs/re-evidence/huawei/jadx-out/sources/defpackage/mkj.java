package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.utils.ScreenUtil;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.ads.dynamic.a;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mkj {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f41807b = new Object();
    private static mkj d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f41808c = BaseApplication.getContext();
    private lof e;

    private mkj() {
        this.e = null;
        LogUtil.j("HwDevicePartMgr", "Init HwDevicePartMgr.");
        this.e = lof.d(this.f41808c);
    }

    public static mkj d() {
        mkj mkjVar;
        synchronized (f41807b) {
            if (d == null) {
                d = new mkj();
            }
            mkjVar = d;
        }
        return mkjVar;
    }

    public static boolean a(String str) {
        Date dateC;
        LogUtil.a("HwDevicePartMgr", "isAlreadyUpdated: lastTime", str);
        if (TextUtils.isEmpty(str) || (dateC = c(str)) == null) {
            return false;
        }
        return Math.abs(System.currentTimeMillis() - dateC.getTime()) <= 259200000;
    }

    private static Date c(String str) {
        try {
            return new SimpleDateFormat(HwDrmConstant.TIME_FORMAT).parse(str);
        } catch (ParseException unused) {
            LogUtil.e("HwDevicePartMgr", "exception parseException");
            return null;
        }
    }

    public boolean e(DeviceInfo deviceInfo, JSONObject jSONObject) {
        if (deviceInfo == null || jSONObject == null) {
            LogUtil.j("HwDevicePartMgr", "isExistHiLinkDeviceId deviceInfo or jsonObject is null.");
            return true;
        }
        if ((CompileParameterUtil.d("IS_DEBUG_VERSION") || CompileParameterUtil.c("IS_BETA_VERSION", false)) && deviceInfo.getProductType() >= 55) {
            if (!jSONObject.has("hilink_device_id")) {
                LogUtil.a("HwDevicePartMgr", "isExistHiLinkDeviceId not exist hilink device id.");
                return false;
            }
            try {
                if (jSONObject.getString("hilink_device_id").length() != 4) {
                    LogUtil.a("HwDevicePartMgr", "isExistHiLinkDeviceId hilinkDeviceId length is error.");
                    return false;
                }
            } catch (JSONException unused) {
                LogUtil.e("HwDevicePartMgr", "isExistHiLinkDeviceId JSONException.");
                return false;
            }
        }
        LogUtil.a("HwDevicePartMgr", "isExistHiLinkDeviceId exist hilink device id.");
        return true;
    }

    public void e(Intent intent, boolean z, List<DeviceInfo> list) {
        lnr lnrVarA;
        if (intent == null) {
            LogUtil.j("HwDevicePartMgr", "sendTimeSync intent is null");
            return;
        }
        if ("android.intent.action.TIMEZONE_CHANGED".equals(intent.getAction()) || "android.intent.action.TIME_SET".equals(intent.getAction()) || "android.intent.action.DATE_CHANGED".equals(intent.getAction()) || z) {
            LogUtil.a("HwDevicePartMgr", "System Time changed with type:", intent.getAction());
            List<String> listD = mkb.d();
            if (listD == null || listD.isEmpty()) {
                return;
            }
            nfm.d().a();
            for (String str : listD) {
                if (mkb.r(str) == 0) {
                    lnrVarA = lmw.a(this.f41808c);
                } else {
                    DeviceCapability deviceCapabilityB = b(str, list);
                    if (deviceCapabilityB != null && deviceCapabilityB.isSupportZoneId()) {
                        LogUtil.a("HwDevicePartMgr", "support zone id:", Boolean.valueOf(deviceCapabilityB.isSupportZoneId()));
                        lnrVarA = lmw.n();
                    } else {
                        lnrVarA = lmw.a(false);
                    }
                }
                if (str.length() == 0) {
                    return;
                }
                if (lnrVarA != null) {
                    lnrVarA.e(str);
                }
                if (this.e != null) {
                    LogUtil.a("HwDevicePartMgr", "Start to set device time when system change.");
                    this.e.b(e(str, list), lnrVarA);
                }
            }
        }
    }

    private DeviceCapability b(String str, List<DeviceInfo> list) {
        DeviceInfo deviceInfoC = c(str, list);
        if (deviceInfoC == null) {
            LogUtil.j("HwDevicePartMgr", "getCapability deviceInfo is null");
            return null;
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, deviceInfoC.getDeviceIdentify(), "HwDevicePartMgr");
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            return null;
        }
        return mapQueryDeviceCapability.get(deviceInfoC.getDeviceIdentify());
    }

    private String e() {
        return SharedPreferenceManager.e(this.f41808c, String.valueOf(1018), "deviceAutoRemoveIdentify");
    }

    public void b(DeviceInfo deviceInfo, byte[] bArr) {
        LogUtil.a("HwDevicePartMgr", "enter handleGetGoldCard.");
        if (deviceInfo == null) {
            LogUtil.j("HwDevicePartMgr", "handleGetGoldCard btDeviceInfo is null.");
            return;
        }
        if (lmw.e(this.f41808c, deviceInfo.getDeviceProtocol(), bArr)) {
            LogUtil.a("HwDevicePartMgr", "handleGetGoldCard timeout.");
            return;
        }
        LogUtil.a("HwDevicePartMgr", "Start to handle handleGetGoldCard.");
        boolean zJ = lmw.j(bArr);
        DeviceCapability deviceCapabilityC = mkb.c(deviceInfo.getDeviceIdentify());
        LogUtil.a("HwDevicePartMgr", " , isSupportGold :", Boolean.valueOf(zJ));
        if (zJ) {
            deviceCapabilityC.configureGoldCard(true);
        } else {
            deviceCapabilityC.configureGoldCard(false);
        }
    }

    public void e(List<DeviceInfo> list) {
        LogUtil.a("HwDevicePartMgr", "EMUI sendDisconnectBroadcastToEmui.");
        if (list == null || list.isEmpty()) {
            LogUtil.j("HwDevicePartMgr", "btDeviceInfoList is null.");
            return;
        }
        for (DeviceInfo deviceInfo : list) {
            if (!deviceInfo.getDeviceIdentify().equalsIgnoreCase("AndroidWear")) {
                if (!TextUtils.isEmpty(deviceInfo.getNodeId())) {
                    return;
                }
                try {
                    Intent intent = new Intent("com.huawei.iconnect.action.DEVICE_BOND_STATE_CHANGED");
                    intent.setComponent(new ComponentName("com.huawei.iconnect", "com.huawei.iconnect.MessageIntentService"));
                    if (mke.b()) {
                        intent.putExtra("DEVICE_ID", mke.e(deviceInfo.getDeviceIdentify()));
                    } else {
                        intent.putExtra("com.huawei.iconnect.extra.DEVICE_MAC_ADDRESS", deviceInfo.getDeviceIdentify());
                    }
                    intent.putExtra("android.bluetooth.device.extra.BOND_STATE", 10);
                    intent.putExtra("com.huawei.iconnect.extra.PACKAGE_NAME", "com.huawei.health");
                    this.f41808c.startService(intent);
                } catch (SecurityException unused) {
                    LogUtil.e("HwDevicePartMgr", "0xA0200008", ",securityException");
                }
                LogUtil.d("HwDevicePartMgr", "EMUI SendDisconnectBroadcastToEmui, send BOND_NONE broadcast, DeviceIdentify", BTDeviceMgrUtil.c().e(deviceInfo.getDeviceIdentify()));
            } else {
                LogUtil.d("HwDevicePartMgr", "EMUI SendDisconnectBroadcastToEmui, don't need send broadcast for AndroidWear");
            }
        }
    }

    public void c(DeviceCapability deviceCapability) {
        if (deviceCapability == null) {
            LogUtil.j("HwDevicePartMgr", "refreshLeoProblemCapability deviceCapability is null.");
            return;
        }
        deviceCapability.resetDeviceCapability();
        deviceCapability.configureSupportTimeSetting(false);
        deviceCapability.configureSupportGetFirmwareVersion(true);
        deviceCapability.configureSupportGetBattery(true);
        deviceCapability.configureAutoLightScreen(false);
        deviceCapability.configureAvoidDisturb(false);
        deviceCapability.configureFactoryReset(false);
        deviceCapability.configureSupportPairDevice(false);
        deviceCapability.configureSupportGetHandsetInfo(true);
        deviceCapability.configureSupportNotificationIntervalInfo(true);
        deviceCapability.configureSupportActivityType(true);
        deviceCapability.configureSupportAuthenticDevice(true);
        deviceCapability.configureGoldCard(true);
        deviceCapability.configureMessageAlert(false);
        deviceCapability.configureSupportMessageAlertInfo(false);
        deviceCapability.configureSupportMessageSupportInfo(false);
        deviceCapability.configureSupportWearMessagePush(false);
        deviceCapability.configureContacts(false);
        deviceCapability.configureSupportCallingOperationType(false);
        deviceCapability.configureMotionGoalCap(1);
        deviceCapability.configureFitnessFrameType(3);
        deviceCapability.configureActivityReminder(false);
        deviceCapability.configureSupportSetUserInfoEncrypt(false);
        deviceCapability.configureSupportSampleFrame(true);
        deviceCapability.configureSupportThreshold(true);
        deviceCapability.configureReserveSync(true);
        deviceCapability.configureIsSupportHeartRateZone(true);
        deviceCapability.configureSupportGetUserInfo(true);
        deviceCapability.configureIsSupportCoreSleep(false);
        deviceCapability.configureisSupportHeartRateEnable(false);
        deviceCapability.configureIsSupportSendCoreSleepOutState(false);
        deviceCapability.configureIsSupportQueryDeviceCoreSleepSwitch(false);
        deviceCapability.configureEventAlarm(false);
        deviceCapability.configureEventAlarmNum(0);
        deviceCapability.configureSmartAlarm(false);
        deviceCapability.configureOtaUpdate(false);
        deviceCapability.configureMaintenance(true);
        deviceCapability.configureMaintenanceInTime(false);
        deviceCapability.configureMaintenanceGetData(false);
        deviceCapability.configureSupportAntiLost(false);
        deviceCapability.configureBluetoothOffAlert(false);
        deviceCapability.configureLanguage(true);
        deviceCapability.configureWeatherPush(false);
        deviceCapability.configureSupportUnitWeather(false);
        deviceCapability.configureAtmosphereSupportExpand(false);
        deviceCapability.configureWeatherSupportErrorCode(false);
        deviceCapability.configureSupportExerciseAdvice(true);
        a(deviceCapability);
    }

    public void a(DeviceCapability deviceCapability) {
        if (deviceCapability == null) {
            LogUtil.j("HwDevicePartMgr", "refreshLeoProblemCapabilityPart deviceCapability is null.");
            return;
        }
        deviceCapability.configureSupportExerciseAdviceTime(true);
        deviceCapability.configureSupportExerciseAdviceMonitor(false);
        deviceCapability.configureSupportWorkout(false);
        deviceCapability.configureSupportWorkoutInfo(false);
        deviceCapability.configureSupportWorkoutReminder(false);
        deviceCapability.configureSupportWorkoutRecord(true);
        deviceCapability.configureSupportWorkoutExerciseDisplayLink(false);
        deviceCapability.configureSupportWorkoutRecordPaceMap(false);
        deviceCapability.configureSupportGpsLocation(false);
        deviceCapability.configureSupportGpsData(false);
        deviceCapability.configureSupportGpsSetParameter(false);
        deviceCapability.configureSupportHeartRateInfo(false);
        deviceCapability.configureSleep(false);
        deviceCapability.configureClimb(true);
        deviceCapability.configureRiding(false);
        deviceCapability.configureStand(false);
        deviceCapability.configureSleepShallow(false);
        deviceCapability.configureSleepDeep(false);
        deviceCapability.configureWalk(true);
        deviceCapability.configureRun(true);
        deviceCapability.configureStep(true);
        deviceCapability.configureCalorie(true);
        deviceCapability.configureDistance(true);
        deviceCapability.configureIsSupportHeartRate(false);
        deviceCapability.configurePromptPush(0);
        deviceCapability.configureCallMute(false);
        deviceCapability.configureIsSupportHelp(true);
        deviceCapability.configureDistanceDetail(true);
        deviceCapability.configureSupportPay(true);
        deviceCapability.configureSupportEsim(false);
        deviceCapability.configureSupportMultiSim(false);
        deviceCapability.configureRotateSwitchScreen(false);
        deviceCapability.configureSupportLeftRightHandWearMode(false);
        deviceCapability.configureSupportStress(false);
    }

    public void b(String str) {
        if (str == null) {
            return;
        }
        if (str.isEmpty()) {
            LogUtil.a(a.t, 1, "HwDevicePartMgr", "saveAutoRemoveDevice clear auto remove device info");
        }
        LogUtil.a("HwDevicePartMgr", "saveAutoRemoveDevice identify", BTDeviceMgrUtil.c().e(str));
        SharedPreferenceManager.e(this.f41808c, String.valueOf(1018), "deviceAutoRemoveIdentify", str, new StorageParams(1));
    }

    public void c() {
        b("");
    }

    public void a(DeviceInfo deviceInfo, List<DeviceInfo> list) {
        if (list == null || deviceInfo == null || list.isEmpty()) {
            LogUtil.j("HwDevicePartMgr", "deviceInfoList or btDeviceInfo is null.");
            return;
        }
        boolean z = false;
        for (DeviceInfo deviceInfo2 : list) {
            if (deviceInfo2.getDeviceActiveState() == 1 && deviceInfo2.getAutoDetectSwitchStatus() == 0 && !deviceInfo2.getDeviceIdentify().equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                LogUtil.a("HwDevicePartMgr", "restoreAutoRemoveDeviceConnect has other band connected");
                z = true;
            }
        }
        if (z) {
            return;
        }
        String strE = e();
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        c();
        DeviceInfo deviceInfo3 = null;
        for (DeviceInfo deviceInfo4 : list) {
            if (strE.equalsIgnoreCase(deviceInfo4.getDeviceIdentify())) {
                LogUtil.a("HwDevicePartMgr", "restoreAutoRemoveDeviceConnect find ");
                deviceInfo4.setDeviceActiveState(1);
                deviceInfo3 = deviceInfo4;
            }
        }
        if (deviceInfo3 != null && deviceInfo3.getDeviceBluetoothType() == 1) {
            this.e.b(deviceInfo3, true);
        } else {
            this.e.b(true, strE);
            this.e.g(strE);
        }
    }

    public boolean e(DeviceInfo deviceInfo, List<DeviceInfo> list) {
        LogUtil.a("HwDevicePartMgr", "handleAutoDetectSwitchStatusAndWorkMode ", ",has already connected device goingDisconnectDevice :", deviceInfo);
        if (list != null && deviceInfo != null && !list.isEmpty()) {
            for (DeviceInfo deviceInfo2 : list) {
                if (deviceInfo.getDeviceIdentify().equalsIgnoreCase(deviceInfo2.getDeviceIdentify())) {
                    LogUtil.a("HwDevicePartMgr", "handleAutoDetectSwitchStatusAndWorkMode find ");
                    deviceInfo2.setDeviceActiveState(0);
                }
            }
            lof lofVar = this.e;
            if (lofVar != null) {
                lofVar.a(deviceInfo.getDeviceIdentify());
                this.e.b(false, deviceInfo.getDeviceIdentify());
                this.e.i(deviceInfo.getDeviceIdentify());
                this.e.n(deviceInfo.getDeviceIdentify());
            }
        }
        return false;
    }

    public List<DeviceInfo> d(List<DeviceInfo> list) {
        LogUtil.a("HwDevicePartMgr", "Enter getConnectedDeviceInfo");
        ArrayList arrayList = new ArrayList(24);
        if (list != null && !list.isEmpty()) {
            for (DeviceInfo deviceInfo : list) {
                if (deviceInfo != null && deviceInfo.getDeviceActiveState() == 1 && deviceInfo.getDeviceConnectState() == 2) {
                    ReleaseLogUtil.d("R_HwDevicePartMgr", "getConnectedDevices deviceName:", deviceInfo.getDeviceName());
                    arrayList.add(deviceInfo);
                }
            }
        }
        return arrayList;
    }

    public List<Integer> b(List<DeviceInfo> list) {
        LogUtil.a("HwDevicePartMgr", "Enter getActiveDevicesIndex().");
        ArrayList arrayList = new ArrayList(24);
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getDeviceActiveState() == 1) {
                    LogUtil.a("HwDevicePartMgr", "active device name:", list.get(i).getDeviceName());
                    arrayList.add(Integer.valueOf(i));
                }
            }
        }
        return arrayList;
    }

    public boolean d(String str, List<DeviceInfo> list) {
        LogUtil.a("HwDevicePartMgr", "Enter checkActiveDevice.");
        List<Integer> listB = b(list);
        if (listB == null || list == null || listB.isEmpty() || list.isEmpty()) {
            return false;
        }
        Iterator<Integer> it = listB.iterator();
        while (it.hasNext()) {
            if (list.get(it.next().intValue()).getDeviceIdentify().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public int a(String str, List<DeviceInfo> list) {
        if (str == null || list == null || list.size() == 0) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (str.equalsIgnoreCase(list.get(i).getDeviceIdentify())) {
                return i;
            }
        }
        return -1;
    }

    public DeviceInfo a(DeviceInfo deviceInfo) {
        DeviceInfo deviceInfo2 = new DeviceInfo();
        if (deviceInfo == null) {
            LogUtil.j("HwDevicePartMgr", "createDeviceInfo devInfo is null");
            return deviceInfo2;
        }
        deviceInfo2.setBluetoothVersion(deviceInfo.getBluetoothVersion());
        deviceInfo2.setDeviceActiveState(deviceInfo.getDeviceActiveState());
        deviceInfo2.setDeviceConnectState(deviceInfo.getDeviceConnectState());
        deviceInfo2.setDeviceName(deviceInfo.getDeviceName());
        deviceInfo2.setProductType(deviceInfo.getProductType());
        deviceInfo2.setLastConnectedTime(deviceInfo.getLastConnectedTime());
        deviceInfo2.setDeviceIdentify(deviceInfo.getDeviceIdentify());
        deviceInfo2.setAuthVersion(deviceInfo.getAuthVersion());
        deviceInfo2.setAutoDetectSwitchStatus(deviceInfo.getAutoDetectSwitchStatus());
        deviceInfo2.setFootWearPosition(deviceInfo.getFootWearPosition());
        deviceInfo2.setDeviceModel(deviceInfo.getDeviceModel());
        deviceInfo2.setSoftVersion(deviceInfo.getSoftVersion());
        if (TextUtils.isEmpty(deviceInfo.getUuid())) {
            deviceInfo2.setUuid(deviceInfo.getDeviceIdentify());
        } else {
            deviceInfo2.setUuid(deviceInfo.getUuid());
        }
        deviceInfo2.setDeviceIdType(deviceInfo.getDeviceIdType());
        deviceInfo2.setDeviceProtocol(deviceInfo.getDeviceProtocol());
        deviceInfo2.setEncryptType(deviceInfo.getEncryptType());
        deviceInfo2.setDeviceBluetoothType(deviceInfo.getDeviceBluetoothType());
        deviceInfo2.setNodeId(deviceInfo.getNodeId());
        deviceInfo2.setPowerSaveModel(deviceInfo.getPowerSaveModel());
        deviceInfo2.setUdidFromDevice(deviceInfo.getUdidFromDevice());
        deviceInfo2.setUnConvertedUdid(deviceInfo.getUnConvertedUdid());
        deviceInfo2.setSupportAccountSwitch(deviceInfo.getSupportAccountSwitch());
        deviceInfo2.setCertModel(deviceInfo.getCertModel());
        deviceInfo2.setManufacture(deviceInfo.getManufacture());
        deviceInfo2.setDeviceUdid(deviceInfo.getDeviceUdid());
        deviceInfo2.setHiLinkDeviceId(deviceInfo.getHiLinkDeviceId());
        deviceInfo2.setVersionType(deviceInfo.getVersionType());
        deviceInfo2.setExpandCapability(deviceInfo.getExpandCapability());
        deviceInfo2.setWearEngineDeviceId(deviceInfo.getWearEngineDeviceId());
        deviceInfo2.setMultiLinkBleMac(deviceInfo.getMultiLinkBleMac());
        if (deviceInfo.getProductType() == 10 && (!TextUtils.isEmpty(deviceInfo.getDeviceName()) || !TextUtils.isEmpty(deviceInfo.getDeviceModel()))) {
            deviceInfo2.setDeviceModel(deviceInfo.getDeviceModel());
            LogUtil.a("HwDevicePartMgr", "device name:", deviceInfo.getDeviceName(), ",deviceModel:", deviceInfo.getDeviceName());
            if (TextUtils.equals(deviceInfo.getDeviceName(), "PORSCHE DESIGN") || TextUtils.equals(deviceInfo.getDeviceModel(), "PORSCHE DESIGN")) {
                deviceInfo2.setDeviceName("PORSCHE DESIGN");
            }
        }
        return deviceInfo2;
    }

    public List<Integer> e(List<DeviceInfo> list, String str) {
        LogUtil.a("HwDevicePartMgr", "findWantedSwitchDevice enter");
        ArrayList arrayList = new ArrayList(24);
        if (list == null) {
            LogUtil.j("HwDevicePartMgr", "findWantedSwitchDevice targetDevices is null");
            return arrayList;
        }
        for (int i = 0; i < list.size(); i++) {
            DeviceInfo deviceInfo = list.get(i);
            if (deviceInfo != null && deviceInfo.getDeviceActiveState() == 1 && deviceInfo.getDeviceConnectState() != 2) {
                if (!deviceInfo.getDeviceIdentify().equals(str)) {
                    LogUtil.j("HwDevicePartMgr", "manual reconnect:", BTDeviceMgrUtil.c().e(str), ",traversal:", BTDeviceMgrUtil.c().e(deviceInfo.getDeviceIdentify()));
                } else {
                    LogUtil.a("HwDevicePartMgr", "findWantedSwitchDevice find ", deviceInfo.getDeviceName());
                    arrayList.add(Integer.valueOf(i));
                }
            }
        }
        return arrayList;
    }

    public void c(DeviceInfo deviceInfo, List<DeviceInfo> list) {
        LogUtil.a("HwDevicePartMgr", "Enter handleSameTypeDevice(). deviceInfo isNull :", Boolean.valueOf(deviceInfo == null), ", deviceInfoList isNull :", Boolean.valueOf(list == null));
        mxg mxgVarB = mxg.b();
        if (deviceInfo == null || list == null) {
            return;
        }
        if (mxgVarB.e(deviceInfo.getProductType(), deviceInfo.getDeviceIdentify())) {
            LogUtil.a("HwDevicePartMgr", "handleSameTypeDevice device is follow and is not aw70");
            return;
        }
        if (eel.d(deviceInfo.getProductType())) {
            for (DeviceInfo deviceInfo2 : list) {
                if (eel.d(deviceInfo2.getProductType()) && deviceInfo2.getDeviceActiveState() == 1 && !deviceInfo.getDeviceIdentify().equalsIgnoreCase(deviceInfo2.getDeviceIdentify())) {
                    LogUtil.a("HwDevicePartMgr", "handleSameTypeDevice has active aw70 device");
                    d(deviceInfo2);
                }
            }
            return;
        }
        for (DeviceInfo deviceInfo3 : list) {
            if (!eel.d(deviceInfo3.getProductType(), deviceInfo3.getAutoDetectSwitchStatus()) && deviceInfo3.getDeviceActiveState() == 1 && !deviceInfo.getDeviceIdentify().equalsIgnoreCase(deviceInfo3.getDeviceIdentify()) && !mxgVarB.e(deviceInfo3.getProductType(), deviceInfo3.getDeviceIdentify())) {
                LogUtil.a("HwDevicePartMgr", "handleSameTypeDevice has active band mode device");
                d(deviceInfo3);
            }
        }
    }

    private void d(DeviceInfo deviceInfo) {
        deviceInfo.setDeviceActiveState(0);
        lof lofVar = this.e;
        if (lofVar != null) {
            lofVar.n(deviceInfo.getDeviceIdentify());
            this.e.f(deviceInfo.getDeviceIdentify());
        }
    }

    public boolean d(DeviceInfo deviceInfo, List<DeviceInfo> list) {
        if (list == null || deviceInfo == null) {
            return true;
        }
        for (DeviceInfo deviceInfo2 : list) {
            if (deviceInfo2.getDeviceIdentify().equalsIgnoreCase(deviceInfo.getDeviceIdentify()) && deviceInfo2.getDeviceActiveState() == 0) {
                return false;
            }
        }
        return true;
    }

    public int d(int i, String str, List<DeviceInfo> list) {
        if (i != -1 || str == null) {
            return i;
        }
        for (DeviceInfo deviceInfo : list) {
            if (str.equals(deviceInfo.getDeviceIdentify())) {
                return deviceInfo.getProductType();
            }
        }
        return i;
    }

    public void e(DeviceInfo deviceInfo, byte[] bArr, List<DeviceInfo> list) {
        LogUtil.a("HwDevicePartMgr", "Enter reportConnectFail()");
        if (deviceInfo == null) {
            LogUtil.j("HwDevicePartMgr", "reportConnectFail btDeviceInfo is null");
            return;
        }
        mkb.e(deviceInfo.getDeviceIdentify(), 4);
        deviceInfo.setDeviceConnectState(4);
        int iA = a(deviceInfo.getDeviceIdentify(), list);
        if (iA != -1 && list != null) {
            LogUtil.a("HwDevicePartMgr", "Update DeviceInfo state");
            list.get(iA).setDeviceConnectState(4);
        }
        lof lofVar = this.e;
        if (lofVar != null) {
            lofVar.d(deviceInfo, bArr);
            this.e.a(deviceInfo.getDeviceIdentify());
        }
    }

    public void d(DeviceInfo deviceInfo, byte[] bArr, JSONObject jSONObject, int i, List<DeviceInfo> list) {
        LogUtil.a("HwDevicePartMgr", "handleGetProductTypeContent() enter.");
        if (deviceInfo == null || jSONObject == null) {
            LogUtil.j("HwDevicePartMgr", "handleGetProductTypeContent() btDeviceInfo or jsonObject is null");
            return;
        }
        try {
            String deviceIdentify = deviceInfo.getDeviceIdentify();
            mkb.f(deviceIdentify, deviceIdentify);
            if (jSONObject.has("UUID")) {
                mkb.r(deviceInfo.getDeviceIdentify(), jSONObject.getString("UUID"));
                deviceInfo.setUuid(jSONObject.getString("UUID"));
            }
            if (jSONObject.has("force_sn")) {
                deviceInfo.setDeviceIdType(jSONObject.getInt("force_sn"));
                mkb.k(deviceInfo.getDeviceIdentify(), b(deviceInfo, i));
            }
            deviceInfo.setProductType(i);
            if (!e(deviceInfo, jSONObject)) {
                LogUtil.a("HwDevicePartMgr", "not exist hilink device id.");
                e(deviceInfo, bArr, list);
                lof lofVar = this.e;
                if (lofVar != null) {
                    lofVar.o();
                    return;
                }
                return;
            }
            if (i == -1) {
                LogUtil.a("HwDevicePartMgr", "Get Wrong Version Command.");
                e(deviceInfo, bArr, list);
                return;
            }
            LogUtil.a("HwDevicePartMgr", "the productType is not HUAWEI_UNKNOWN.");
            lnr lnrVarA = lmw.a(false);
            lnrVarA.e(deviceInfo.getDeviceIdentify());
            if (this.e != null) {
                LogUtil.a("HwDevicePartMgr", "Start to set device time.");
                this.e.b(deviceInfo.getDeviceBluetoothType(), lnrVarA);
            }
        } catch (JSONException unused) {
            LogUtil.e("HwDevicePartMgr", "0xA0200008", ",handleGetProductTypeContent jsonException.");
        }
    }

    public String b(DeviceInfo deviceInfo, int i) {
        String strL;
        LogUtil.a("HwDevicePartMgr", "getPhdDeviceUdid enter");
        if (deviceInfo == null) {
            LogUtil.j("HwDevicePartMgr", "getPhdDeviceUdid() btDeviceInfo is null");
            return null;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (deviceIdentify == null) {
            return null;
        }
        String securityDeviceId = deviceInfo.getSecurityDeviceId();
        String str = securityDeviceId + deviceIdentify;
        if (!deviceIdentify.equals(securityDeviceId)) {
            deviceIdentify = str;
        }
        if (i >= 34 && (!Utils.o() || CommonUtil.cj())) {
            strL = nio.c(deviceIdentify);
        } else {
            strL = mjh.l(securityDeviceId);
        }
        if (strL != null) {
            return strL;
        }
        LogUtil.j("HwDevicePartMgr", "shaDeviceId is null");
        return null;
    }

    public void c(DeviceInfo deviceInfo, byte[] bArr, List<DeviceInfo> list) {
        LogUtil.a("HwDevicePartMgr", "Start to check GATT Response.");
        if (deviceInfo == null) {
            LogUtil.j("HwDevicePartMgr", "handleSetDeviceTime() btDeviceInfo is null");
            return;
        }
        if (lmw.e(this.f41808c, deviceInfo.getDeviceProtocol(), bArr)) {
            LogUtil.a("HwDevicePartMgr", "GATT Command send timeout.");
            e(deviceInfo, bArr, list);
            return;
        }
        boolean[] zArrB = lmw.b(this.f41808c, bArr);
        if (!zArrB[0]) {
            LogUtil.j("HwDevicePartMgr", "GATT Time Set fail.");
            e(deviceInfo, bArr, list);
            return;
        }
        LogUtil.a("HwDevicePartMgr", "handleSetDeviceTime:", zArrB, ",isNeedRetry:", Boolean.valueOf(zArrB[1]));
        if (zArrB[1]) {
            b(deviceInfo);
            return;
        }
        mkb.c(deviceInfo.getDeviceIdentify()).resetDeviceCapability();
        if (2 == deviceInfo.getDeviceProtocol()) {
            lnr lnrVarC = lmw.c(this.f41808c);
            lnrVarC.e(deviceInfo.getDeviceIdentify());
            if (this.e != null) {
                LogUtil.a("HwDevicePartMgr", "Start to get device service id list info. Command:", eeq.d(lnrVarC.h()), ", ", eeq.d(lnrVarC.c()), ", ", eeq.e(lnrVarC.d()));
                this.e.b(deviceInfo.getDeviceBluetoothType(), lnrVarC);
            }
        }
    }

    public void d(DeviceInfo deviceInfo, byte[] bArr, List<DeviceInfo> list) {
        if (deviceInfo == null) {
            LogUtil.j("HwDevicePartMgr", "handleGetServiceIdListInfo() btDeviceInfo is null");
            return;
        }
        if (lmw.e(this.f41808c, deviceInfo.getDeviceProtocol(), bArr)) {
            LogUtil.a("HwDevicePartMgr", "Get device service id list info send timeout.");
            e(deviceInfo, bArr, list);
            return;
        }
        lnr lnrVarD = lmw.d(this.f41808c, lmw.c(this.f41808c, bArr));
        if (lnrVarD == null) {
            LogUtil.j("HwDevicePartMgr", "btDeviceCommand is null.");
            return;
        }
        int iR = mkb.r(deviceInfo.getDeviceIdentify());
        String strL = mkb.l(deviceInfo.getDeviceIdentify());
        String strH = mkb.h(deviceInfo.getDeviceIdentify());
        if (iR == 10 && "73617766697368".equals(strL) && "372E312E31".equals(strH)) {
            LogUtil.j("HwDevicePartMgr", "refresh.");
            lnrVarD.c(eeq.c("0103814E020101030C040708090A0D0E1011121314020107030B01050708090A0E1013161502010A030301090A02010C03010102011603030103070201170306010406070B0C02011903010102011B030101"));
            lnrVarD.c(82);
        }
        lnrVarD.e(deviceInfo.getDeviceIdentify());
        if (this.e != null) {
            LogUtil.a("HwDevicePartMgr", "start to get device command id list info.command", eeq.d(lnrVarD.h()), ", ", eeq.d(lnrVarD.c()), ", ", eeq.e(lnrVarD.d()));
            this.e.b(deviceInfo.getDeviceBluetoothType(), lnrVarD);
        }
    }

    public void a(List<DeviceInfo> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("HwDevicePartMgr", "unPairBtDevices deviceList is null.");
            return;
        }
        for (DeviceInfo deviceInfo : list) {
            if (deviceInfo != null && deviceInfo.getDeviceBluetoothType() == 2 && deviceInfo.getDeviceActiveState() == 0 && !BTDeviceMgrUtil.c().a(deviceInfo.getDeviceIdentify())) {
                LogUtil.j("HwDevicePartMgr", "removeBTDeviceInstance Remove bond device fail.");
            }
        }
    }

    public void b(DeviceInfo deviceInfo, List<DeviceInfo> list) {
        LogUtil.a("HwDevicePartMgr", "EMUI SendConnectBroadcastToEmui, btDeviceInfo.getDeviceConnectState, ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
        oqm.c().d(deviceInfo);
        e(deviceInfo);
        nfj.e(deviceInfo);
        nfj.a(deviceInfo);
        nfj.b(deviceInfo);
        nfi.b(this.f41808c, deviceInfo);
        ned.b(deviceInfo);
        mwk.c(deviceInfo);
        if (deviceInfo == null) {
            LogUtil.j("HwDevicePartMgr", "sendConnectBroadcastToEmui() btDeviceInfo is null");
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 2) {
            ReleaseLogUtil.d("HWWEAR_HwDevicePartMgr", "Enter sendConnectStateBroadcast isScreenOn:", Boolean.valueOf(ScreenUtil.d()));
            a(list);
            if (deviceInfo.getDeviceIdentify().equalsIgnoreCase("AndroidWear")) {
                LogUtil.d("HwDevicePartMgr", "EMUI SendConnectBroadcastToEmui, don't need send broadcast for AndroidWear");
                return;
            }
            if (TextUtils.isEmpty(deviceInfo.getNodeId())) {
                try {
                    Intent intent = new Intent("com.huawei.iconnect.action.DEVICE_BOND_STATE_CHANGED");
                    intent.setComponent(new ComponentName("com.huawei.iconnect", "com.huawei.iconnect.MessageIntentService"));
                    if (mke.b()) {
                        intent.putExtra("DEVICE_ID", mke.e(deviceInfo.getDeviceIdentify()));
                    } else {
                        intent.putExtra("com.huawei.iconnect.extra.DEVICE_MAC_ADDRESS", deviceInfo.getDeviceIdentify());
                    }
                    intent.putExtra("android.bluetooth.device.extra.BOND_STATE", 12);
                    intent.putExtra("com.huawei.iconnect.extra.PACKAGE_NAME", "com.huawei.health");
                    this.f41808c.startService(intent);
                } catch (SecurityException unused) {
                    LogUtil.e("HwDevicePartMgr", "0xA0200008", ",securityException");
                }
                LogUtil.d("HwDevicePartMgr", "EMUI SendConnectBroadcastToEmui, send BOND_BONDED broadcast, getDeviceIdentify:", BTDeviceMgrUtil.c().e(deviceInfo.getDeviceIdentify()));
            }
        }
    }

    private void e(DeviceInfo deviceInfo) {
        LogUtil.a("HwDevicePartMgr", "notifyRemoteCameraCapability enter");
        if (deviceInfo.getDeviceConnectState() != 2) {
            return;
        }
        ndk ndkVarB = ndk.b();
        boolean zD = ndkVarB.d(deviceInfo);
        LogUtil.a("HwDevicePartMgr", "notifyRemoteCameraCapability isSupportControlCapability:", Boolean.valueOf(zD));
        if (zD) {
            ndkVarB.a(deviceInfo);
            return;
        }
        DeviceCapability deviceCapabilityC = c(deviceInfo);
        if (deviceCapabilityC == null || !deviceCapabilityC.isSupportRemoteCamera()) {
            LogUtil.j("HwDevicePartMgr", "device not support remoteCamera.");
            return;
        }
        if (CommonUtil.bp() || (CommonUtil.bd() && !Utils.o())) {
            LogUtil.a("HwDevicePartMgr", "isMoreThanEmui80");
            d(deviceInfo, 1, 42, new byte[]{1, 1, 0});
        } else {
            LogUtil.a("HwDevicePartMgr", "lower than Emui8.1");
        }
    }

    private void d(DeviceInfo deviceInfo, int i, int i2, byte[] bArr) {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(i);
        deviceCommand.setCommandID(i2);
        deviceCommand.setDataLen(bArr.length);
        deviceCommand.setDataContent(bArr);
        deviceCommand.setPriority(1);
        deviceCommand.setmIdentify(deviceInfo.getDeviceIdentify());
        LogUtil.a("notifyDeviceCapability", "sendDeviceData command", deviceCommand.toString());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(deviceCommand.getDataLen() + 2);
        byteBufferAllocate.put(eeq.c(eeq.d(deviceCommand.getServiceID())));
        byteBufferAllocate.put(eeq.c(eeq.d(deviceCommand.getCommandID())));
        if (deviceCommand.getDataContent() != null) {
            byteBufferAllocate.put(deviceCommand.getDataContent());
            LogUtil.a("HwDevicePartMgr", "command data", eeq.e(deviceCommand.getDataContent()));
        } else {
            LogUtil.j("HwDevicePartMgr", "command data is null");
        }
        byteBufferAllocate.flip();
        lnr lnrVar = new lnr();
        lnrVar.c(byteBufferAllocate.array());
        lnrVar.c(byteBufferAllocate.array().length);
        lnrVar.c(deviceCommand.getNeedAck());
        lnrVar.d(deviceCommand.getPriority());
        lnrVar.e(deviceCommand.getmIdentify());
        lnrVar.d(deviceCommand.getNeedEncrypt());
        lnrVar.g(i);
        lnrVar.e(i2);
        this.e.b(deviceInfo.getDeviceBluetoothType(), lnrVar);
    }

    private int e(String str, List<DeviceInfo> list) {
        DeviceInfo deviceInfo;
        int iA = a(str, list);
        if (list == null || iA == -1 || iA >= list.size() || (deviceInfo = list.get(iA)) == null) {
            return -1;
        }
        return deviceInfo.getDeviceBluetoothType();
    }

    private DeviceInfo c(String str, List<DeviceInfo> list) {
        int iA = a(str, list);
        if (list == null || iA == -1 || iA >= list.size()) {
            return null;
        }
        return list.get(iA);
    }

    public boolean e(DeviceInfo deviceInfo, byte[] bArr) {
        if (deviceInfo == null || bArr == null) {
            LogUtil.j("HwDevicePartMgr", "handlerSetTimeRetry deviceInfo or dataContents is null");
            return false;
        }
        if (bArr[0] == 1 && bArr[1] == 5) {
            LogUtil.a("HwDevicePartMgr", "otherCommandReceivedMethod 1.5");
            boolean[] zArrB = lmw.b(this.f41808c, bArr);
            if (!zArrB[0]) {
                LogUtil.j("HwDevicePartMgr", "GATT Time Set fail.");
                return false;
            }
            LogUtil.a("HwDevicePartMgr", "handleSetDeviceTime:", zArrB, ",isNeedRetry:", Boolean.valueOf(zArrB[1]));
            if (zArrB[1]) {
                b(deviceInfo);
                return true;
            }
        }
        return false;
    }

    private void b(DeviceInfo deviceInfo) {
        if (deviceInfo == null || this.e == null) {
            LogUtil.j("HwDevicePartMgr", "sendGattTimeRetry deviceInfo or mBtSdkApi is null");
            return;
        }
        lnr lnrVarA = lmw.a(true);
        LogUtil.a("HwDevicePartMgr", "resend set time Command:", lnrVarA);
        lnrVarA.e(deviceInfo.getDeviceIdentify());
        this.e.b(deviceInfo.getDeviceBluetoothType(), lnrVarA);
    }

    public void b() {
        lof lofVar;
        if (this.f41808c != null && (lofVar = this.e) != null) {
            lofVar.g();
        }
        a();
    }

    private static void a() {
        synchronized (f41807b) {
            d = null;
        }
    }

    private DeviceCapability c(DeviceInfo deviceInfo) {
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "HwDevicePartMgr");
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            return null;
        }
        return mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
    }
}
