package defpackage;

import android.text.TextUtils;
import com.huawei.appgallery.agd.api.AgdConstant;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class myo {
    public static void a(DeviceInfo deviceInfo) {
        HiDeviceInfo hiDeviceInfo;
        LogUtil.a("DeviceManagerUtils", "registerDeviceToHiHealth enter");
        if (deviceInfo == null) {
            LogUtil.j("DeviceManagerUtils", "device is null");
            return;
        }
        if ("Crius-B29".equals(deviceInfo.getDeviceModel())) {
            hiDeviceInfo = new HiDeviceInfo(97);
        } else {
            try {
                hiDeviceInfo = new HiDeviceInfo(a(deviceInfo.getProductType()));
            } catch (IllegalArgumentException unused) {
                LogUtil.e("DeviceManagerUtils", "get hiDevcieId error, save info fail, please check, originalType : ", Integer.valueOf(deviceInfo.getProductType()));
                e(deviceInfo.getProductType());
                return;
            }
        }
        e(hiDeviceInfo, deviceInfo);
        int iB = b(deviceInfo.getHiLinkDeviceId());
        ReleaseLogUtil.d("BTSYNC_AlarmData_DeviceManagerUtils", "registerDeviceToHiHealth hilinkID", deviceInfo.getHiLinkDeviceId());
        int iB2 = mij.b(deviceInfo);
        if (iB != -1) {
            LogUtil.a("DeviceManagerUtils", "registerDeviceToHiHealth getDeviceProductIdByHiLinId is ", Integer.valueOf(iB));
            hiDeviceInfo.setDeviceType(iB);
        } else if (iB2 >= 1) {
            ReleaseLogUtil.d("BTSYNC_AlarmData_DeviceManagerUtils", "registerDeviceToHiHealth getCloudId from db:", Integer.valueOf(iB2));
            hiDeviceInfo.setDeviceType(iB2);
        }
        if (!TextUtils.isEmpty(deviceInfo.getDeviceSubModelId())) {
            hiDeviceInfo.setSubProdId(deviceInfo.getDeviceSubModelId());
        }
        hiDeviceInfo.setDeviceUniqueCode(deviceInfo.getSecurityUuid() + "#ANDROID21");
        hiDeviceInfo.setDeviceName(net.c("DeviceManagerUtils", deviceInfo));
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
        LogUtil.a("DeviceManagerUtils", "device.getDeviceModel():", deviceInfo.getDeviceModel());
        if (CommonUtil.ap() && "-1".equals(hiDeviceInfo.getDeviceUniqueCode()) && hiDeviceInfo.getDeviceType() == 10001) {
            LogUtil.j("DeviceManagerUtils", "deviceInfo error");
            return;
        }
        if (CommonUtil.ap() && !"-1".equals(hiDeviceInfo.getDeviceUniqueCode()) && hiDeviceInfo.getDeviceType() == 1) {
            LogUtil.j("DeviceManagerUtils", "deviceInfo error");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(0);
        HiHealthManager.d(BaseApplication.getContext()).registerDataClient(hiDeviceInfo, arrayList, null);
    }

    public static int a(int i) {
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

    public static boolean e(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return true;
        }
        int productType = deviceInfo.getProductType();
        int iA = a(productType);
        LogUtil.a("DeviceManagerUtils", "checkHiHealthType productType = ", Integer.valueOf(productType), " ,hiHealthDevType", Integer.valueOf(iA));
        boolean z = iA != 0;
        if (!z) {
            e(productType);
        }
        return z;
    }

    private static void e(HiDeviceInfo hiDeviceInfo, DeviceInfo deviceInfo) {
        String deviceModel = deviceInfo.getDeviceModel();
        if (TextUtils.isEmpty(deviceModel) || !deviceModel.toUpperCase(Locale.ROOT).contains("HECTOR")) {
            return;
        }
        hiDeviceInfo.setDeviceType(112);
    }

    public static int b(String str) {
        try {
            JSONObject jSONObjectB = eev.b(str);
            if (jSONObjectB == null) {
                LogUtil.j("DeviceManagerUtils", "getDeviceProductIdByHiLinId aiTipsJson is null");
                return -1;
            }
            if (jSONObjectB.has("health_cloud_productId")) {
                int i = jSONObjectB.getInt("health_cloud_productId");
                LogUtil.a("DeviceManagerUtils", "healthCloudId is ", Integer.valueOf(i));
                return i;
            }
            LogUtil.j("DeviceManagerUtils", "getDeviceProductIdByHiLinId aiTipsJson no health_cloud_productId key");
            return -1;
        } catch (JSONException unused) {
            LogUtil.e("DeviceManagerUtils", "getDeviceProductIdByHiLinId JSONException");
            return -1;
        }
    }

    private static void e(int i) {
        LogUtil.j("DeviceManagerUtils", "device list info is wrong, can not get right device info now, please check download device info from net");
        HashMap map = new HashMap(16);
        map.put("status", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_DEVICE_HI_TYPE_ERROR_1040065.value(), map, 0);
    }

    public static String b() {
        DeviceInfo deviceInfoE = e("DeviceManagerUtils");
        if (deviceInfoE != null) {
            return deviceInfoE.getSecurityUuid() + "#ANDROID21";
        }
        return "";
    }

    public static DeviceInfo e(String str) {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ACTIVE_MAIN_DEVICES, null, str);
        if (deviceList == null) {
            LogUtil.j("DeviceManagerUtils", "getActiveDeviceInfo() deviceInfoList is null.", str);
            return null;
        }
        for (DeviceInfo deviceInfo2 : deviceList) {
            if (!eel.d(deviceInfo2.getProductType())) {
                deviceInfo = deviceInfo2;
                break;
            }
        }
        LogUtil.a("DeviceManagerUtils", "getActiveDeviceInfo deviceInfo ", deviceInfo, ", tag is ", str);
        return deviceInfo;
    }

    public static long d(long j) {
        String str = new SimpleDateFormat("yyyyMMdd").format(new Date(j * 1000));
        try {
            return new SimpleDateFormat("yyyyMMddhhmm").parse(str + AgdConstant.INSTALL_TYPE_DEFAULT).getTime() / 1000;
        } catch (ParseException e) {
            LogUtil.e("DeviceManagerUtils", "getBeginOfDate ParseException : ", ExceptionUtils.c(e));
            return j;
        }
    }

    public static DeviceCapability c(String str) {
        DeviceCapability value = null;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceManagerUtils", "getCapability mac is null.");
            return null;
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(2, str, "DeviceManagerUtils");
        if (mapQueryDeviceCapability != null && !mapQueryDeviceCapability.isEmpty()) {
            Iterator<Map.Entry<String, DeviceCapability>> it = mapQueryDeviceCapability.entrySet().iterator();
            while (it.hasNext() && (value = it.next().getValue()) == null) {
            }
        }
        return value;
    }

    public static void e() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(10001);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setForceSync(true);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }
}
