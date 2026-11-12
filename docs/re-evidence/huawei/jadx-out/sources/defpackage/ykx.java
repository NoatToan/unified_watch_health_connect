package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.EcologyDeviceApi;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearengine.common.WearEngineBiOperate;
import com.huawei.wearengine.device.Device;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.Sha256;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class ykx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f53606a = {"Vidar-"};

    public static int b(List<eew> list, int i) {
        eew eewVarD;
        if (list == null || list.size() == 0 || (eewVarD = d(list, i)) == null) {
            return -1;
        }
        return a(eewVarD);
    }

    public static eew d(List<eew> list, int i) {
        if (list == null || list.size() == 0) {
            return null;
        }
        for (eew eewVar : list) {
            if (CommonUtil.v(eewVar.e()) == i) {
                return eewVar;
            }
        }
        LogUtil.a("WearEngine_HiWearCommonUtil", "getTlvByTag tag:", Integer.valueOf(i), " tlv is null");
        return null;
    }

    public static int a(eew eewVar) {
        if (eewVar == null) {
            LogUtil.j("WearEngine_HiWearCommonUtil", "handleNum tlv is null");
            return -1;
        }
        String strB = eewVar.b();
        int iV = TextUtils.isEmpty(strB) ? -1 : CommonUtil.v(strB);
        LogUtil.a("WearEngine_HiWearCommonUtil", "handleNum num is:", Integer.valueOf(iV));
        return iV;
    }

    public static String e(eew eewVar) {
        String str = "";
        if (eewVar == null) {
            LogUtil.j("WearEngine_HiWearCommonUtil", "handleString tlv is null");
            return "";
        }
        String strB = eewVar.b();
        if (!TextUtils.isEmpty(strB)) {
            String strD = eeq.d(strB);
            if (strD == null) {
                LogUtil.a("WearEngine_HiWearCommonUtil", "handleString hexToString value is null");
            } else {
                str = strD;
            }
        }
        LogUtil.a("WearEngine_HiWearCommonUtil", "handleString value is:", str);
        return str;
    }

    public static List<eew> b(byte[] bArr) {
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE) || strE.length() < 4) {
            LogUtil.j("WearEngine_HiWearCommonUtil", "info data is error");
            return null;
        }
        String strSubstring = strE.substring(4);
        LogUtil.a("WearEngine_HiWearCommonUtil", "tlvsString is:", strSubstring);
        try {
            return new eet().b(strSubstring).e();
        } catch (eeu unused) {
            LogUtil.e("WearEngine_HiWearCommonUtil", "getResponseTlvFather TlvException");
            return null;
        }
    }

    public static List<Device> b(List<DeviceInfo> list, String str) {
        Device deviceB;
        ArrayList arrayList = new ArrayList(16);
        if (list != null && !list.isEmpty()) {
            for (DeviceInfo deviceInfo : list) {
                if (!o(deviceInfo) || b(str)) {
                    if (!d(deviceInfo, str) && (deviceB = b(deviceInfo, str)) != null) {
                        LogUtil.a("WearEngine_HiWearCommonUtil", "device is bonded, deviceName is ", deviceB.getName());
                        a(deviceInfo, deviceB, str);
                        arrayList.add(deviceB);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean d(DeviceInfo deviceInfo, String str) {
        boolean z = false;
        if (deviceInfo == null || TextUtils.isEmpty(str)) {
            LogUtil.a("WearEngine_HiWearCommonUtil", "isFilterPowerSaveModelDevice params is null or empty");
            return false;
        }
        if (deviceInfo.getPowerSaveModel() != 1) {
            LogUtil.a("WearEngine_HiWearCommonUtil", "isFilterPowerSaveModelDevice powerSaveModel off");
            return false;
        }
        if ("com.huawei.deveco.assistant".equals(str)) {
            return false;
        }
        int iE = yln.e(str);
        LogUtil.a("WearEngine_HiWearCommonUtil", "isFilterPowerSaveModelDevice clientApiLevel is ", Integer.valueOf(iE));
        if (iE == 0) {
            z = !b(str);
        } else if (iE < 12) {
            z = true;
        }
        LogUtil.a("WearEngine_HiWearCommonUtil", "isFilterPowerSaveModelDevice : ", Boolean.valueOf(z));
        return z;
    }

    public static void b(Device device, DeviceInfo deviceInfo, boolean z) {
        int iB;
        int iD;
        if (device == null || deviceInfo == null) {
            LogUtil.e("WearEngine_HiWearCommonUtil", "setDetailCapability device or deviceInfo isnull");
            return;
        }
        try {
            ylh ylhVar = new ylh(ylh.a(device));
            int iD2 = yie.d(deviceInfo, z);
            if (d(deviceInfo.getDeviceModel())) {
                iB = 0;
                iD = 0;
            } else {
                iB = yie.b(deviceInfo);
                iD = yie.d(deviceInfo);
            }
            int iF = yie.f(deviceInfo);
            ylhVar.b(iD2);
            ylhVar.c(iB);
            ylhVar.a(iD);
            ylhVar.d(iF);
            device.setReservedness(ylhVar.toString());
        } catch (JSONException unused) {
            LogUtil.e("WearEngine_HiWearCommonUtil", "setDetailCapability new DeviceJson exception");
        }
    }

    public static boolean b(DeviceInfo deviceInfo, boolean z) {
        int iB;
        int iD;
        if (deviceInfo == null) {
            LogUtil.j("WearEngine_HiWearCommonUtil", "isSupportCommonDeviceCapability deviceInfo is null");
            return false;
        }
        int iD2 = yie.d(deviceInfo, z);
        if (d(deviceInfo.getDeviceModel())) {
            iB = 0;
            iD = 0;
        } else {
            iB = yie.b(deviceInfo);
            iD = yie.d(deviceInfo);
        }
        return iD2 == 0 || iB == 0 || iD == 0 || yie.f(deviceInfo) == 0;
    }

    public static void b(Device device) {
        if (device == null) {
            LogUtil.e("WearEngine_HiWearCommonUtil", "setHealthAppCapability device is null");
            return;
        }
        try {
            ylh ylhVar = new ylh(ylh.a(device));
            ylhVar.b(0);
            ylhVar.c(1);
            ylhVar.a(1);
            ylhVar.d(1);
            device.setReservedness(ylhVar.toString());
        } catch (JSONException unused) {
            LogUtil.e("WearEngine_HiWearCommonUtil", "setHealthAppCapability new DeviceJson exception");
        }
    }

    public static boolean o(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("WearEngine_HiWearCommonUtil", "isGalileoPowerSaveModel deviceInfo is null");
            return false;
        }
        if (!g(deviceInfo)) {
            return false;
        }
        LogUtil.a("WearEngine_HiWearCommonUtil", "isGalileoPowerSaveModel powerSaveModel is ", Integer.valueOf(deviceInfo.getPowerSaveModel()));
        return deviceInfo.getPowerSaveModel() == 1;
    }

    public static boolean g(DeviceInfo deviceInfo) {
        String deviceModel = deviceInfo.getDeviceModel();
        if (TextUtils.isEmpty(deviceModel)) {
            LogUtil.j("WearEngine_HiWearCommonUtil", "isGalileoDevice deviceModel is empty");
            return false;
        }
        LogUtil.a("WearEngine_HiWearCommonUtil", "isGalileoDevice deviceModel is ", deviceModel);
        return deviceModel.contains("Galileo-");
    }

    public static boolean b(String str) {
        if (!TextUtils.equals(str, "com.huawei.health")) {
            LogUtil.a("WearEngine_HiWearCommonUtil", "isHealthCall false");
            return false;
        }
        LogUtil.a("WearEngine_HiWearCommonUtil", "isHealthCall true");
        return true;
    }

    public static List<DeviceInfo> b() {
        LogUtil.a("WearEngine_HiWearCommonUtil", "foundHiWearDevices enter");
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "WearEngine_HiWearCommonUtil");
        if (deviceList == null || deviceList.isEmpty()) {
            LogUtil.j("WearEngine_HiWearCommonUtil", "discoverDevices device is empty");
            return new ArrayList(16);
        }
        ArrayList arrayList = new ArrayList(16);
        for (DeviceInfo deviceInfo : deviceList) {
            if (!t(deviceInfo)) {
                LogUtil.a("WearEngine_HiWearCommonUtil", "device not support hiwearkit, deviceName is ", deviceInfo.getDeviceName(), "connect state: ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
            } else if (!o(deviceInfo) && !d(deviceInfo, "com.huawei.health") && p(deviceInfo)) {
                arrayList.add(deviceInfo);
            }
        }
        LogUtil.a("WearEngine_HiWearCommonUtil", "foundHiWearDevices device is ok");
        return arrayList;
    }

    private static boolean p(DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            return yie.f(deviceInfo) == 0 || yie.b(deviceInfo) == 0 || yie.d(deviceInfo) == 0 || yie.c(deviceInfo) == 0;
        }
        LogUtil.e("WearEngine_HiWearCommonUtil", "isHaveCapability deviceInfo is null");
        return false;
    }

    public static DeviceInfo d(Device device, List<DeviceInfo> list) {
        if (device == null) {
            LogUtil.j("WearEngine_HiWearCommonUtil", "getDeviceInfoByDevice device is null");
            return null;
        }
        String uuid = device.getUuid();
        if (TextUtils.isEmpty(uuid)) {
            LogUtil.j("WearEngine_HiWearCommonUtil", "getDeviceInfoByDevice device Uuid is null");
            return null;
        }
        if (list == null || list.isEmpty()) {
            LogUtil.j("WearEngine_HiWearCommonUtil", "getDeviceInfoByDevice deviceInfoList is null");
            return null;
        }
        for (DeviceInfo deviceInfo : list) {
            if (uuid.equals(deviceInfo.getUuid()) || uuid.equals(deviceInfo.getDeviceUdid())) {
                return deviceInfo;
            }
        }
        LogUtil.a("WearEngine_HiWearCommonUtil", "getDeviceInfoByDevice deviceInfo is not found");
        return null;
    }

    public static Device a(DeviceInfo deviceInfo) {
        Device deviceI = i(deviceInfo);
        if (deviceI == null || !deviceI.isConnected()) {
            return null;
        }
        LogUtil.a("WearEngine_HiWearCommonUtil", "device is connected, deviceName is ", deviceI.getName());
        return deviceI;
    }

    public static Device i(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("WearEngine_HiWearCommonUtil", "device is null");
            return null;
        }
        if (!r(deviceInfo)) {
            LogUtil.a("WearEngine_HiWearCommonUtil", "device not support hiwearkit, deviceName is ", deviceInfo.getDeviceName(), "connect state: ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
            return null;
        }
        LogUtil.a("WearEngine_HiWearCommonUtil", "device is not null, deviceName is ", deviceInfo.getDeviceName(), ", connect state: ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
        return d(deviceInfo);
    }

    private static boolean r(DeviceInfo deviceInfo) {
        LogUtil.a("WearEngine_HiWearCommonUtil", "enter isSupportHiWearCapability");
        DeviceCapability deviceCapabilityC = c(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityC != null) {
            LogUtil.a("WearEngine_HiWearCommonUtil", "deviceCapability != null: ", Boolean.valueOf(deviceCapabilityC.isSupportHiWear()));
            return deviceCapabilityC.isSupportHiWear();
        }
        boolean zA = yie.a(deviceInfo);
        LogUtil.a("WearEngine_HiWearCommonUtil", "isSupportHiWearCapability: ", Boolean.valueOf(zA));
        return zA;
    }

    public static boolean f(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.a("WearEngine_HiWearCommonUtil", "isDeviceInfoSupportHiWear deviceInfo is null");
            return false;
        }
        if (r(deviceInfo)) {
            return true;
        }
        LogUtil.a("WearEngine_HiWearCommonUtil", "isDeviceInfoSupportHiWear device not support hiwearkit.");
        return false;
    }

    public static boolean j(DeviceInfo deviceInfo) {
        Iterator<DeviceInfo> it = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "WearEngine_HiWearCommonUtil").iterator();
        while (it.hasNext()) {
            if (it.next().getDeviceIdentify().equals(deviceInfo.getDeviceIdentify())) {
                return false;
            }
        }
        return true;
    }

    public static Device b(DeviceInfo deviceInfo, String str) {
        LogUtil.a("WearEngine_HiWearCommonUtil", "callingPackageName is :", str);
        Device deviceI = i(deviceInfo);
        ylh ylhVar = null;
        if (deviceI == null) {
            LogUtil.e("WearEngine_HiWearCommonUtil", "getHiWearDevice device is null");
            return null;
        }
        if ("com.huawei.deveco.assistant".equals(str)) {
            String strA = ylh.a(deviceI);
            String strM = m(deviceInfo);
            try {
                ylhVar = new ylh(strA);
            } catch (JSONException unused) {
                LogUtil.e("WearEngine_HiWearCommonUtil", "getHiWearDevice new DeviceJson exception");
            }
            if (ylhVar != null) {
                ylhVar.a(strM);
                deviceI.setReservedness(ylhVar.toString());
            }
        }
        return deviceI;
    }

    private static String m(DeviceInfo deviceInfo) {
        String strL;
        if (deviceInfo == null) {
            LogUtil.e("WearEngine_HiWearCommonUtil", "getDeviceUdId btDeviceInfo is null");
            return "";
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (deviceIdentify == null) {
            LogUtil.e("WearEngine_HiWearCommonUtil", "getDeviceUdId currentMac is null");
            return "";
        }
        String securityDeviceId = deviceInfo.getSecurityDeviceId();
        String str = securityDeviceId + deviceIdentify;
        if (deviceIdentify.equals(securityDeviceId)) {
            LogUtil.a("WearEngine_HiWearCommonUtil", "getDeviceUdId currentMac equals securityDeviceSn");
        } else {
            deviceIdentify = str;
        }
        if (deviceInfo.getProductType() >= 34) {
            strL = nio.c(deviceIdentify);
        } else {
            LogUtil.a("WearEngine_HiWearCommonUtil", "getDeviceUdId productType < Latona");
            strL = mjh.l(securityDeviceId);
        }
        if (strL != null) {
            return strL;
        }
        LogUtil.e("WearEngine_HiWearCommonUtil", "getDeviceUdId shaDeviceId is null");
        return "";
    }

    private static DeviceCapability c(String str) {
        return mkf.e(BaseApplication.getContext()).queryDeviceCapability(3, "", "WearEngine_HiWearCommonUtil").get(str);
    }

    public static Device d(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("WearEngine_HiWearCommonUtil", "device is null");
            return null;
        }
        Device device = new Device();
        device.setName(deviceInfo.getDeviceName());
        String deviceUdid = deviceInfo.getDeviceUdid();
        if (TextUtils.isEmpty(deviceUdid)) {
            LogUtil.a("WearEngine_HiWearCommonUtil", "udId is empty, use uuId");
            device.setUuid(deviceInfo.getUuid());
        } else {
            device.setUuid(deviceUdid);
        }
        device.setModel(deviceInfo.getDeviceModel());
        device.setProductType(0);
        device.setConnectState(deviceInfo.getDeviceConnectState());
        ylh ylhVarS = s(deviceInfo);
        device.setReservedness(ylhVarS == null ? "{}" : ylhVarS.toString());
        return device;
    }

    private static ylh s(DeviceInfo deviceInfo) {
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (!TextUtils.isEmpty(deviceIdentify)) {
            deviceIdentify = deviceIdentify.substring(0, deviceIdentify.length() - 4);
        }
        String strD = Sha256.d(deviceIdentify, "SHA-256");
        String wearEngineDeviceId = deviceInfo.getWearEngineDeviceId();
        LogUtil.a("WearEngine_HiWearCommonUtil", "convertToWearDevice wearEngineDeviceId ");
        String softVersion = deviceInfo.getSoftVersion();
        LogUtil.a("WearEngine_HiWearCommonUtil", "convertToWearDevice softVersion:", softVersion);
        return new ylh.d().e(strD).d(wearEngineDeviceId).c(softVersion).e(h(deviceInfo)).c();
    }

    public static int h(DeviceInfo deviceInfo) {
        int sportVersion = deviceInfo.getSportVersion();
        LogUtil.a("WearEngine_HiWearCommonUtil", "getDeviceType source deviceType: ", Integer.valueOf(sportVersion));
        if (deviceInfo.getSportVersion() == -1) {
            sportVersion = g(deviceInfo) ? 1 : 0;
        }
        LogUtil.a("WearEngine_HiWearCommonUtil", "getDeviceType final deviceType: ", Integer.valueOf(sportVersion));
        return sportVersion;
    }

    public static int b(DeviceInfo deviceInfo) {
        int powerSaveModel = deviceInfo.getPowerSaveModel();
        LogUtil.a("WearEngine_HiWearCommonUtil", "getDevicePowerMode source devicePowerMode is: ", Integer.valueOf(powerSaveModel));
        if (h(deviceInfo) == 0 || o(deviceInfo)) {
            powerSaveModel = -1;
        }
        LogUtil.a("WearEngine_HiWearCommonUtil", "getDevicePowerMode final devicePowerMode: ", Integer.valueOf(powerSaveModel));
        return powerSaveModel;
    }

    public static void a(DeviceInfo deviceInfo, Device device) {
        JSONObject jSONObject;
        try {
            ylh ylhVar = new ylh(ylh.a(device));
            String strB = ylhVar.b();
            if (!TextUtils.isEmpty(strB)) {
                jSONObject = new JSONObject(strB);
            } else {
                jSONObject = new JSONObject();
            }
            String securityDeviceId = deviceInfo.getSecurityDeviceId();
            jSONObject.put("deviceUdid", Sha256.d(securityDeviceId, "SHA-256"));
            jSONObject.put(HealthEngineRequestManager.PARAMS_DEVICE_SN, securityDeviceId);
            ylhVar.e(jSONObject.toString());
            ylhVar.b(deviceInfo.getDeviceFid());
            device.setReservedness(ylhVar.toString());
        } catch (JSONException unused) {
            LogUtil.e("WearEngine_HiWearCommonUtil", "setExtraInfo has an JSONException");
        }
    }

    public static Device a(dru druVar) {
        String nonWearableDeviceName = ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).getNonWearableDeviceName(druVar);
        Device device = new Device();
        device.setName(nonWearableDeviceName);
        device.setProductType(1);
        return device;
    }

    public static Intent e(Context context, Intent intent) {
        LogUtil.a("WearEngine_HiWearCommonUtil", "createExplicitFromImplicitIntent enter");
        if (context == null || intent == null) {
            LogUtil.j("WearEngine_HiWearCommonUtil", "createExplicitFromImplicitIntent context or implicitIntent is null");
            return null;
        }
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.size() != 1) {
            LogUtil.j("WearEngine_HiWearCommonUtil", "createExplicitFromImplicitIntent resolveInfoList is null");
            return null;
        }
        ResolveInfo resolveInfo = listQueryIntentServices.get(0);
        ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
        LogUtil.d("WearEngine_HiWearCommonUtil", "createExplicitFromImplicitIntent component = ", componentName.toString());
        Intent intent2 = new Intent(intent);
        intent2.setComponent(componentName);
        return intent2;
    }

    public static Device c() {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "WearEngine_HiWearCommonUtil");
        if (deviceList.size() > 0) {
            for (DeviceInfo deviceInfo2 : deviceList) {
                if (!eel.d(deviceInfo2.getProductType())) {
                    deviceInfo = deviceInfo2;
                    break;
                }
            }
        }
        return d(deviceInfo);
    }

    public static void c(DeviceCommand deviceCommand) {
        if (mkb.q(deviceCommand.getmIdentify())) {
            LogUtil.j("WearEngine_HiWearCommonUtil", "OTA update, other command can't send...");
            throw new IllegalStateException(String.valueOf(12));
        }
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private static boolean t(DeviceInfo deviceInfo) {
        LogUtil.a("WearEngine_HiWearCommonUtil", "enter isSupportHiWearCapabilityFromFromDeviceCfgMgr");
        DeviceCapability deviceCapabilityG = g(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityG != null) {
            LogUtil.a("WearEngine_HiWearCommonUtil", "deviceCapability != null: ", Boolean.valueOf(deviceCapabilityG.isSupportHiWear()));
            return deviceCapabilityG.isSupportHiWear();
        }
        boolean zA = yie.a(deviceInfo);
        LogUtil.a("WearEngine_HiWearCommonUtil", "isSupportHiWearCapabilityFromDeviceCfgMgr: ", Boolean.valueOf(zA));
        return zA;
    }

    private static DeviceCapability g(String str) {
        Map<String, DeviceCapability> mapD = lvb.e().d(3, "", "WearEngine_HiWearCommonUtil");
        if (mapD == null || !mapD.containsKey(str)) {
            return null;
        }
        return mapD.get(str);
    }

    public static List<DeviceInfo> c(List<DeviceInfo> list) {
        ArrayList arrayList = new ArrayList(16);
        if (list == null) {
            LogUtil.j("WearEngine_HiWearCommonUtil", "deviceInfoList is null");
            return arrayList;
        }
        for (DeviceInfo deviceInfo : list) {
            if (deviceInfo != null) {
                String deviceModel = deviceInfo.getDeviceModel();
                if (!TextUtils.isEmpty(deviceModel) && a(deviceModel)) {
                    arrayList.add(deviceInfo);
                } else {
                    byte[] bArrC = eeq.c(deviceInfo.getExpandCapability());
                    LogUtil.d("WearEngine_HiWearCommonUtil", "getExpandCapability expandCapability is " + deviceInfo.getExpandCapability());
                    boolean zA = CommonUtil.a(bArrC, 14);
                    LogUtil.a("WearEngine_HiWearCommonUtil", "modelName is " + deviceModel + ", isSupport  " + zA);
                    if (zA) {
                        arrayList.add(deviceInfo);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WearEngine_HiWearCommonUtil", "modelName is Empty");
            return false;
        }
        for (String str2 : f53606a) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("WearEngine_HiWearCommonUtil", "isFaraDevice modelName is Empty");
            return false;
        }
        return str.contains("Fara-");
    }

    private static boolean a(List list) {
        return list == null || list.isEmpty();
    }

    private static boolean d() {
        if (CommonUtil.ab(BaseApplication.getContext())) {
            return true;
        }
        LogUtil.j("WearEngine_HiWearCommonUtil", "not have net");
        return false;
    }

    public static void a(DeviceInfo deviceInfo, Device device, String str) {
        String strJ;
        String hiLinkDeviceId = deviceInfo.getHiLinkDeviceId();
        if (TextUtils.isEmpty(hiLinkDeviceId)) {
            strJ = deviceInfo.getProductType() == 34 ? "06D" : "unknown";
            LogUtil.a("WearEngine_HiWearCommonUtil", "setDeviceCategory ProductType is ", Integer.valueOf(deviceInfo.getProductType()));
        } else {
            strJ = j(hiLinkDeviceId);
        }
        try {
            ylh ylhVar = new ylh(ylh.a(device));
            ylhVar.c(strJ);
            device.setReservedness(ylhVar.toString());
        } catch (JSONException unused) {
            LogUtil.e("WearEngine_HiWearCommonUtil", "setDeviceCategory has JSONException");
        }
        WearEngineBiOperate wearEngineBiOperate = new WearEngineBiOperate();
        wearEngineBiOperate.init();
        int i = strJ.equals("unknown") ? -1 : 0;
        if (i == -1) {
            j();
        }
        wearEngineBiOperate.biApiCalling(BaseApplication.getContext(), str, "getDeviceCategory", String.valueOf(i));
    }

    public static String e(DeviceInfo deviceInfo) {
        String strJ;
        if (deviceInfo == null) {
            LogUtil.e("WearEngine_HiWearCommonUtil", "getDeviceCategory deviceInfo is null");
            return "unknown";
        }
        String hiLinkDeviceId = deviceInfo.getHiLinkDeviceId();
        if (TextUtils.isEmpty(hiLinkDeviceId)) {
            strJ = deviceInfo.getProductType() == 34 ? "06D" : "unknown";
            LogUtil.a("WearEngine_HiWearCommonUtil", "setDeviceCategory ProductType is ", Integer.valueOf(deviceInfo.getProductType()));
        } else {
            strJ = j(hiLinkDeviceId);
        }
        if (strJ.equals("unknown")) {
            j();
            mec mecVarA = new mgz().a(deviceInfo);
            if (mecVarA != null) {
                return mecVarA.c();
            }
        }
        return strJ;
    }

    public static void b(final DeviceInfo deviceInfo, final SimpleChain.Emitter emitter) {
        SimpleChain.b("WearEngine_HiWearCommonUtil").e(new SimpleChain.INext() { // from class: yla
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public final void onNext(SimpleChain.Emitter emitter2, Object[] objArr) {
                emitter2.onSuccess(ykx.e(deviceInfo));
            }
        }).e(new SimpleChain.INext() { // from class: yld
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
            public final void onNext(SimpleChain.Emitter emitter2, Object[] objArr) {
                ykx.b(deviceInfo, emitter, emitter2, objArr);
            }
        }).d(new SimpleChain.Emitter() { // from class: ylg
            @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
            public final void onSuccess(Object[] objArr) {
                ykx.b(emitter, objArr);
            }
        }, new Object[0]);
    }

    static /* synthetic */ void b(final DeviceInfo deviceInfo, final SimpleChain.Emitter emitter, final SimpleChain.Emitter emitter2, Object[] objArr) {
        if (objArr.length > 0) {
            String string = objArr[0].toString();
            if ("unknown".equals(string)) {
                ProductMapParseUtil.a(BaseApplication.getContext());
                String strE = e(deviceInfo);
                if ("unknown".equals(strE)) {
                    c(new IBaseResponseCallback() { // from class: yle
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public final void a(int i, Object obj) {
                            ykx.b(emitter2, deviceInfo, emitter, i, obj);
                        }
                    });
                    return;
                } else {
                    LogUtil.a("WearEngine_HiWearCommonUtil", "jumpPageToDoCenter deviceType:", strE);
                    emitter2.onSuccess(strE);
                    return;
                }
            }
            emitter2.onSuccess(string);
            return;
        }
        emitter.onError("next deviceType  is empty");
    }

    static /* synthetic */ void b(SimpleChain.Emitter emitter, DeviceInfo deviceInfo, SimpleChain.Emitter emitter2, int i, Object obj) {
        if (i == 0) {
            ProductMapParseUtil.a(BaseApplication.getContext());
            emitter.onSuccess(e(deviceInfo));
        } else {
            emitter2.onError("deviceType is null");
        }
    }

    static /* synthetic */ void b(SimpleChain.Emitter emitter, Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            emitter.onError("subscribe args is empty");
        } else {
            emitter.onSuccess(objArr);
        }
    }

    private static String j(String str) {
        if (TextUtils.isEmpty("unknown")) {
            return "unknown";
        }
        List<ProductMapInfo> listC = ProductMap.c("smartProductId", str);
        if (!a(listC) && listC.get(0) != null) {
            String strE = listC.get(0).e();
            if (!TextUtils.isEmpty(strE)) {
                return strE;
            }
            LogUtil.j("WearEngine_HiWearCommonUtil", "getDeviceCategoryByHiLinkId deviceType is empty");
            return "unknown";
        }
        LogUtil.a("WearEngine_HiWearCommonUtil", "getDeviceCategoryByHiLinkId productMapInfoList is Empty");
        return "unknown";
    }

    private static void j() {
        c((IBaseResponseCallback) null);
    }

    public static void c(final IBaseResponseCallback iBaseResponseCallback) {
        boolean z = System.currentTimeMillis() - a() > 86400000;
        LogUtil.a("WearEngine_HiWearCommonUtil", "UpdateProductMap isNeedUpdate: ", Boolean.valueOf(z));
        if (!z) {
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, "");
            }
        } else if (d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: ylb
                @Override // java.lang.Runnable
                public final void run() {
                    ykx.a(iBaseResponseCallback);
                }
            });
        } else if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(-1, "");
        }
    }

    static /* synthetic */ void a(IBaseResponseCallback iBaseResponseCallback) {
        boolean zB = lql.b(BaseApplication.getContext(), 1);
        e();
        if (zB) {
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(0, "");
            }
            LogUtil.a("WearEngine_HiWearCommonUtil", "UpdateProductMap download map Success");
        } else {
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(-1, "");
            }
            LogUtil.a("WearEngine_HiWearCommonUtil", "UpdateProductMap download map fail");
        }
    }

    private static void e() {
        SharedPreferenceManager.c(String.valueOf(53), "key_productMap_Updated_Time", System.currentTimeMillis());
        LogUtil.a("WearEngine_HiWearCommonUtil", "setProductMapUpdatedTime success");
    }

    private static long a() {
        long jD = SharedPreferenceManager.d(String.valueOf(53), "key_productMap_Updated_Time", 0L);
        LogUtil.a("WearEngine_HiWearCommonUtil", "getProductMapUpdatedTime is " + jD);
        return jD;
    }

    public static void l(final DeviceInfo deviceInfo) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: ylc
            @Override // java.lang.Runnable
            public final void run() {
                ykx.n(deviceInfo);
            }
        });
    }

    static /* synthetic */ void n(DeviceInfo deviceInfo) {
        if (!k(deviceInfo)) {
            LogUtil.a("WearEngine_HiWearCommonUtil", "updateProductMapForDeviceConnected is not need update.");
            q(deviceInfo);
        }
        ProductMapParseUtil.a(BaseApplication.getContext());
    }

    private static void q(DeviceInfo deviceInfo) {
        if (d()) {
            LogUtil.a("WearEngine_HiWearCommonUtil", "updateProductMapForDeviceConnected result: ", Boolean.valueOf(lql.b(BaseApplication.getContext(), 1)));
            x(deviceInfo);
        }
    }

    private static void x(DeviceInfo deviceInfo) {
        SharedPreferenceManager.a(String.valueOf(53), ymi.c(deviceInfo.getDeviceIdentify(), "SHA-256"), true);
        LogUtil.a("WearEngine_HiWearCommonUtil", "setProductMapUpdatedFlag success");
    }

    private static boolean k(DeviceInfo deviceInfo) {
        boolean zB = SharedPreferenceManager.b(String.valueOf(53), ymi.c(deviceInfo.getDeviceIdentify(), "SHA-256"), false);
        LogUtil.a("WearEngine_HiWearCommonUtil", "getProductMapUpdatedFlag is " + zB);
        return zB;
    }

    public static void c(DeviceInfo deviceInfo) {
        SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(53), ymi.c(deviceInfo.getDeviceIdentify(), "SHA-256"));
        LogUtil.a("WearEngine_HiWearCommonUtil", "deleteProductMapUpdatedFlag is Success.");
    }

    public static boolean e(String str) {
        Intent intent = new Intent();
        intent.setAction(str);
        List<ResolveInfo> listQueryIntentContentProviders = BaseApplication.getContext().getPackageManager().queryIntentContentProviders(intent, 0);
        if (listQueryIntentContentProviders != null && listQueryIntentContentProviders.size() == 1) {
            return true;
        }
        yit.c("WearEngine_HiWearCommonUtil", "contentProvider List are null");
        return false;
    }
}
