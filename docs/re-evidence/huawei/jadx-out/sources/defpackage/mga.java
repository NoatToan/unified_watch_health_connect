package defpackage;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiRegisterClientListener;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.PushMessageToDeviceReq;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.DeviceUtil;
import health.compact.a.EnvironmentUtils;
import health.compact.a.ProcessUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mga {
    public static int e(int i) {
        if (i == -1) {
            return 0;
        }
        if (EnvironmentUtils.e()) {
            int iC = mmx.d(i).c();
            return iC < 1 ? mmx.e(i) : iC;
        }
        int iK = lvi.a(i).k();
        return iK < 1 ? lvi.b(i) : iK;
    }

    public static String e() {
        DeviceInfo deviceInfoC = mgg.c("DeviceMgrUtils");
        if (deviceInfoC != null) {
            return deviceInfoC.getSecurityUuid() + "#ANDROID21";
        }
        return "";
    }

    public static String b() {
        DeviceInfo deviceInfoC = mgi.c("DeviceMgrUtils");
        if (deviceInfoC != null) {
            return deviceInfoC.getSecurityUuid() + "#ANDROID21";
        }
        return "";
    }

    public static void h(DeviceInfo deviceInfo) {
        LogUtil.a("DeviceMgrUtils", "registerDeviceToHiHealth enter");
        if (deviceInfo == null) {
            LogUtil.j("DeviceMgrUtils", "device is null");
            return;
        }
        HiDeviceInfo hiDeviceInfoE = e(deviceInfo);
        LogUtil.a("DeviceMgrUtils", "device.getDeviceModel():", deviceInfo.getDeviceModel());
        if (CommonUtil.ap() && "-1".equals(hiDeviceInfoE.getDeviceUniqueCode()) && hiDeviceInfoE.getDeviceType() == 10001) {
            ReleaseLogUtil.e("R_DeviceMgrUtils", "deviceInfo error");
            return;
        }
        if (CommonUtil.ap() && !"-1".equals(hiDeviceInfoE.getDeviceUniqueCode()) && hiDeviceInfoE.getDeviceType() == 1) {
            ReleaseLogUtil.e("R_DeviceMgrUtils", "deviceInfo error");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(0);
        HiHealthManager.d(BaseApplication.getContext()).registerDataClient(hiDeviceInfoE, arrayList, new HiRegisterClientListener() { // from class: mga.4
            @Override // com.huawei.hihealth.data.listener.HiRegisterClientListener
            public void onResult(HiHealthClient hiHealthClient) {
                LogUtil.a("DeviceMgrUtils", "registerDeviceToHiHealth onResult enter.");
                if (hiHealthClient != null) {
                    HiSyncOption hiSyncOption = new HiSyncOption();
                    hiSyncOption.setSyncModel(2);
                    hiSyncOption.setSyncAction(0);
                    hiSyncOption.setSyncMethod(2);
                    hiSyncOption.setSyncScope(1);
                    hiSyncOption.setSyncDataType(22);
                    HiHealthManager.d(BaseApplication.getContext()).synCloud(hiSyncOption, null);
                    return;
                }
                LogUtil.e("DeviceMgrUtils", "registerDeviceToHiHealth onResult fail.");
            }
        });
    }

    public static void f() {
        LogUtil.a("DeviceMgrUtils", "synCloud");
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(900000000);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setForceSync(true);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    public static HiDeviceInfo e(DeviceInfo deviceInfo) {
        HiDeviceInfo hiDeviceInfo;
        HiDeviceInfo hiDeviceInfo2 = new HiDeviceInfo(1);
        if (deviceInfo == null) {
            LogUtil.j("DeviceMgrUtils", "device is null");
            return hiDeviceInfo2;
        }
        if ("Crius-B29".equals(deviceInfo.getDeviceModel())) {
            hiDeviceInfo = new HiDeviceInfo(97);
        } else {
            try {
                int iE = e(deviceInfo.getProductType());
                if (iE <= 0) {
                    edl pluginInfoByDeviceType = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByDeviceType(deviceInfo.getProductType());
                    if (pluginInfoByDeviceType == null || pluginInfoByDeviceType.i() == null) {
                        LogUtil.e("DeviceMgrUtils", "getHiDeviceInfo descriptionInfo is null.");
                        iE = 0;
                    } else {
                        iE = pluginInfoByDeviceType.i().at();
                    }
                }
                hiDeviceInfo = new HiDeviceInfo(iE);
            } catch (IllegalArgumentException unused) {
                LogUtil.e("DeviceMgrUtils", "get hiDevcieId error, save info fail, please check, originalType : ", Integer.valueOf(deviceInfo.getProductType()));
                d(deviceInfo.getProductType());
                return hiDeviceInfo2;
            }
        }
        d(hiDeviceInfo, deviceInfo);
        int iC = c(deviceInfo.getHiLinkDeviceId());
        ReleaseLogUtil.d("R_DeviceMgrUtils", "registerDeviceToHiHealth hilinkID", deviceInfo.getHiLinkDeviceId());
        int iB = mij.b(deviceInfo);
        if (iC != -1) {
            LogUtil.a("DeviceMgrUtils", "registerDeviceToHiHealth getDeviceProductIdByHiLinId is ", Integer.valueOf(iC));
            hiDeviceInfo.setDeviceType(iC);
        } else if (iB >= 1) {
            ReleaseLogUtil.d("R_DeviceMgrUtils", "registerDeviceToHiHealth getCloudId from db:", Integer.valueOf(iB));
            hiDeviceInfo.setDeviceType(iB);
        }
        if (!TextUtils.isEmpty(deviceInfo.getDeviceSubModelId())) {
            hiDeviceInfo.setSubProdId(deviceInfo.getDeviceSubModelId());
        }
        hiDeviceInfo.setDeviceUniqueCode(deviceInfo.getSecurityUuid() + "#ANDROID21");
        hiDeviceInfo.setDeviceName(net.c("DeviceMgrUtils", deviceInfo));
        if (!TextUtils.isEmpty(deviceInfo.getUuid())) {
            if (deviceInfo.getDeviceIdType() == 10) {
                hiDeviceInfo.setDeviceSN(deviceInfo.getUuid());
            } else {
                hiDeviceInfo.setDeviceSN(eeq.d(deviceInfo.getUuid()));
            }
        }
        if (!TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
            hiDeviceInfo.setDeviceMac(deviceInfo.getDeviceIdentify());
        }
        if (!TextUtils.isEmpty(deviceInfo.getDeviceUdid())) {
            hiDeviceInfo.setDeviceUdid(deviceInfo.getDeviceUdid());
        }
        return hiDeviceInfo;
    }

    private static void d(HiDeviceInfo hiDeviceInfo, DeviceInfo deviceInfo) {
        String deviceModel = deviceInfo.getDeviceModel();
        if (TextUtils.isEmpty(deviceModel) || !deviceModel.toUpperCase(Locale.ENGLISH).contains("HECTOR")) {
            return;
        }
        hiDeviceInfo.setDeviceType(112);
    }

    private static void d(int i) {
        LogUtil.j("DeviceMgrUtils", "device list info is wrong, can not get right device info now, please check download device info from net");
        HashMap map = new HashMap(16);
        map.put("status", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_DEVICE_HI_TYPE_ERROR_1040065.value(), map, 0);
    }

    public static boolean a(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return true;
        }
        int productType = deviceInfo.getProductType();
        LogUtil.a("DeviceMgrUtils", "checkHiHealthType productType is: ", Integer.valueOf(productType));
        int iE = e(productType);
        if (iE <= 0) {
            edl pluginInfoByDeviceType = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByDeviceType(deviceInfo.getProductType());
            if (pluginInfoByDeviceType == null || pluginInfoByDeviceType.i() == null) {
                LogUtil.e("DeviceMgrUtils", "getHiDeviceInfo descriptionInfo is null.");
                iE = 0;
            } else {
                iE = pluginInfoByDeviceType.i().at();
            }
        }
        LogUtil.a("DeviceMgrUtils", "checkHiHealthType hiHealthDevType is: ", Integer.valueOf(iE));
        boolean z = iE != 0;
        if (!z) {
            d(productType);
        }
        return z;
    }

    public static int c(String str) {
        try {
            JSONObject jSONObjectB = eev.b(str);
            if (jSONObjectB == null) {
                LogUtil.j("DeviceMgrUtils", "getDeviceProductIdByHiLinId aiTipsJson is null");
                return -1;
            }
            if (jSONObjectB.has("health_cloud_productId")) {
                int i = jSONObjectB.getInt("health_cloud_productId");
                LogUtil.a("DeviceMgrUtils", "healthCloudId is ", Integer.valueOf(i));
                return i;
            }
            LogUtil.j("DeviceMgrUtils", "getDeviceProductIdByHiLinId aiTipsJson no health_cloud_productId key");
            return -1;
        } catch (JSONException unused) {
            LogUtil.e("DeviceMgrUtils", "getDeviceProductIdByHiLinId JSONException");
            return -1;
        }
    }

    public static void a(String str, Context context) {
        PushMessageToDeviceReq pushMessageToDeviceReq = new PushMessageToDeviceReq();
        String strD = CommonUtil.d(context, false);
        pushMessageToDeviceReq.setReqId(strD + System.currentTimeMillis());
        pushMessageToDeviceReq.setDeviceType("00E");
        pushMessageToDeviceReq.setUdId(strD);
        pushMessageToDeviceReq.setTimeOut(30);
        String strReplace = str.replace(":", "");
        int length = strReplace.length();
        if (length > 3) {
            strReplace = strReplace.substring(length - 3);
        }
        pushMessageToDeviceReq.setTargetDevice(strReplace);
        CloudCommonReponse cloudCommonReponseE = lqo.b(BaseApplication.getContext()).e(pushMessageToDeviceReq);
        if (cloudCommonReponseE != null) {
            if (cloudCommonReponseE.getResultCode().intValue() == 0) {
                LogUtil.a("DeviceMgrUtils", "send push message is success");
            } else {
                LogUtil.a("DeviceMgrUtils", "send push message is failed:", cloudCommonReponseE.getResultDesc());
            }
        }
    }

    public static boolean c() {
        LogUtil.a("DeviceMgrUtils", "isHasBondedDevice enter.");
        if (!CompileParameterUtil.d("IS_RELEASE_VERSION")) {
            String strB = CommonUtil.b(Process.myPid());
            if (!TextUtils.isEmpty(strB) && !BaseApplication.getAppPackage().equals(strB)) {
                throw new RuntimeException("DeviceMgrUtils#isHasWearDevice must run in main process.");
            }
        }
        if (mfy.e(1)) {
            LogUtil.a("DeviceMgrUtils", "use device cache from memory.");
        } else {
            boolean zB = DeviceUtil.b();
            mfy.b(1, true);
            mfy.b(Integer.MIN_VALUE, zB);
        }
        return mfy.e(Integer.MIN_VALUE);
    }

    public static boolean d() {
        LogUtil.a("DeviceMgrUtils", "isHasBondedDevice enter.");
        if (mfy.e(1)) {
            LogUtil.a("DeviceMgrUtils", "use device cache from memory.");
        } else {
            boolean zB = DeviceUtil.b();
            mfy.b(1, true);
            mfy.b(Integer.MIN_VALUE, zB);
        }
        if (mfy.e(2)) {
            LogUtil.a("DeviceMgrUtils", "use device cache from memory.");
        } else {
            boolean zIsNoneHonourAm16BondedDevice = ((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isNoneHonourAm16BondedDevice();
            mfy.b(2, true);
            mfy.b(1073741824, zIsNoneHonourAm16BondedDevice);
        }
        return mfy.e(Integer.MIN_VALUE) || mfy.e(1073741824);
    }

    public static String d(DeviceInfo deviceInfo) {
        HashMap<Integer, String> mapC;
        String strS;
        if (deviceInfo == null) {
            LogUtil.j("DeviceMgrUtils", "deviceInfo is null");
            return null;
        }
        if (ProcessUtil.c().endsWith(":PhoneService")) {
            mapC = mmx.e();
        } else {
            mapC = lvi.c();
        }
        int productType = deviceInfo.getProductType();
        if (mapC != null && mapC.containsKey(Integer.valueOf(productType))) {
            LogUtil.a("DeviceMgrUtils", "getDeviceName mapDeviceType: ", mapC.get(Integer.valueOf(productType)));
            return mapC.get(Integer.valueOf(productType));
        }
        if (ProcessUtil.c().endsWith(":PhoneService")) {
            strS = mmx.d(productType).i();
        } else {
            strS = lvi.a(productType).s();
        }
        if (TextUtils.isEmpty(strS)) {
            strS = com.huawei.hms.hihealth.data.DeviceInfo.STR_TYPE_UNKNOWN;
        }
        LogUtil.a("DeviceMgrUtils", "getDeviceName deviceType: ", strS);
        return strS;
    }

    public static boolean b(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapability;
        if (deviceInfo == null) {
            return false;
        }
        if (deviceInfo.getSportVersion() == 1) {
            return true;
        }
        if (deviceInfo.getSportVersion() == 0) {
            return false;
        }
        Map<String, DeviceCapability> mapD = lvb.e().d(3, "", "DeviceMgrUtils");
        if (mapD != null) {
            LogUtil.j("DeviceMgrUtils", "filter deviceCapabilityMap is null");
            deviceCapability = mapD.get(deviceInfo.getDeviceIdentify());
        } else {
            deviceCapability = null;
        }
        return deviceCapability != null && deviceCapability.isSupportSmartWatchVersionStatus();
    }

    public static boolean c(DeviceInfo deviceInfo) {
        return deviceInfo != null && b(deviceInfo) && deviceInfo.getPowerSaveModel() == 0;
    }

    public static boolean a() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "DeviceMgrUtils");
        if (deviceInfo == null) {
            ReleaseLogUtil.e("DeviceMgrUtils", "isSmartWatchApMode: currentDevice is null");
            return false;
        }
        LogUtil.a("DeviceMgrUtils", "isSmartWatchApMode: getSportVersion=" + deviceInfo.getSportVersion() + ", getPowerSaveModel=" + deviceInfo.getPowerSaveModel());
        return b(deviceInfo) && deviceInfo.getPowerSaveModel() == 0;
    }

    public static boolean h() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "DeviceMgrUtils");
        if (deviceInfo == null) {
            ReleaseLogUtil.e("DeviceMgrUtils", "isSmartWatchMcuMode: currentDevice is null");
            return false;
        }
        LogUtil.a("DeviceMgrUtils", "isSmartWatchMcuMode: getSportVersion=" + deviceInfo.getSportVersion() + ", getPowerSaveModel=" + deviceInfo.getPowerSaveModel());
        return b(deviceInfo) && deviceInfo.getPowerSaveModel() == 1;
    }
}
