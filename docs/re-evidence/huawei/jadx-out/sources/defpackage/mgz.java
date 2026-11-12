package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.network.embedded.w9;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.outofprocess.mgr.device.ProfileAgent;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.profile.client.profile.ProfileClient;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.profile.profile.DeviceProfile;
import com.huawei.profile.profile.ServiceCharacteristicProfile;
import com.huawei.profile.profile.ServiceProfile;
import com.huawei.utils.FoundationCommonUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentUtils;
import health.compact.a.KeyValDbManager;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class mgz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<List<String>> f41666a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f41667b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f41668c = "";
    private String d = "";

    public static List<String> d() {
        ArrayList arrayList = new ArrayList();
        f41666a.add(arrayList);
        return arrayList;
    }

    public static void a(List<String> list) {
        f41666a.remove(list);
    }

    private static void f(String str) {
        Iterator it = new ArrayList(f41666a).iterator();
        while (it.hasNext()) {
            ((List) it.next()).add(str);
        }
    }

    public void d(DeviceInfo deviceInfo, String str) {
        if (deviceInfo == null) {
            LogUtil.j("IntellLife", "add device is null");
            return;
        }
        if (mgb.d(deviceInfo.getDeviceIdentify()) == 2) {
            LogUtil.j("IntellLife", "not support student mode to cloud");
            return;
        }
        if (b(deviceInfo)) {
            LogUtil.j("IntellLife", "remove device");
            return;
        }
        String deviceName = deviceInfo.getDeviceName();
        int deviceIdType = deviceInfo.getDeviceIdType();
        int productType = deviceInfo.getProductType();
        LogUtil.a("IntellLife", "add device to profile , deviceName is ", deviceName, " deviceIdType is ", Integer.valueOf(deviceIdType), " productType is ", Integer.valueOf(productType), " mSoftVersion is ", deviceInfo.getSoftVersion());
        c(deviceInfo);
        HashMap map = new HashMap(10);
        if (!e(map, deviceInfo)) {
            ReleaseLogUtil.e("DEVMGR_IntellLife", "add device to profile end , unknown device type");
        } else {
            c(deviceInfo, map, str);
            ReleaseLogUtil.d("DEVMGR_IntellLife", "add device to profile end");
        }
    }

    private void c(DeviceInfo deviceInfo) {
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (TextUtils.isEmpty(deviceIdentify)) {
            ReleaseLogUtil.e("DEVMGR_IntellLife", "checkDeviceInvalid deviceIdentify isEmpty");
            return;
        }
        int length = deviceIdentify.length();
        if (length < 8) {
            ReleaseLogUtil.e("DEVMGR_IntellLife", "checkDeviceInvalid deviceIdentify deviceIdentify:", CommonUtil.n(deviceIdentify), " length:", Integer.valueOf(length));
        }
    }

    private boolean b(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceConnectState() == 2) {
            return false;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "IntellLife");
        if (deviceList != null && !deviceList.isEmpty()) {
            String deviceIdentify = deviceInfo.getDeviceIdentify();
            if (TextUtils.isEmpty(deviceIdentify)) {
                return true;
            }
            Iterator<DeviceInfo> it = deviceList.iterator();
            while (it.hasNext()) {
                if (deviceIdentify.equalsIgnoreCase(it.next().getDeviceIdentify())) {
                    return false;
                }
            }
        }
        return true;
    }

    private void e(DeviceInfo deviceInfo, String str) {
        LogUtil.a("IntellLife", "putBtConnectionStatusProfile start");
        HashMap map = new HashMap(16);
        map.put("characteristic.bt.connectionStatus", "0");
        if (a(deviceInfo, w9.h, "bt.connection", map)) {
            b(deviceInfo, str);
        } else {
            ReleaseLogUtil.e("DEVMGR_IntellLife", "putServiceCharacteristic error");
        }
    }

    private void o(DeviceInfo deviceInfo) {
        Integer num = mej.d().get(Integer.valueOf(deviceInfo.getDeviceConnectState()));
        int iIntValue = num == null ? 0 : num.intValue();
        LogUtil.a("IntellLife", "putDeviceConnectStatusProfile state:", Integer.valueOf(iIntValue));
        HashMap map = new HashMap(16);
        map.put("peerConnectStatus", Integer.valueOf(iIntValue));
        ReleaseLogUtil.d("DEVMGR_IntellLife", "putDeviceConnectStatusProfile : ", Boolean.valueOf(a(deviceInfo, BleConstants.DEV_INFO, BleConstants.DEV_INFO, map)));
    }

    private void n(DeviceInfo deviceInfo) {
        LogUtil.a("IntellLife", "putWearCapabilityProfile start");
        HashMap map = new HashMap(16);
        map.put("digitalTherapy128", Boolean.valueOf(eey.d(deviceInfo, 128)));
        ReleaseLogUtil.d("DEVMGR_IntellLife", "putWearCapabilityProfile : ", Boolean.valueOf(a(deviceInfo, "wearCapabilityList", "wearCapabilityService", map)));
    }

    private boolean a(DeviceInfo deviceInfo, String str, String str2, Map<String, Object> map) {
        String strE = e(deviceInfo);
        if (a(str, strE)) {
            LogUtil.j("IntellLife", "serviceId is not exits, put serviceId and character.");
            return c(deviceInfo, str, str2, map, 1);
        }
        ServiceCharacteristicProfile serviceCharacteristics = ProfileAgent.PROFILE_AGENT.getClientAgent().getServiceCharacteristics(strE, str, false, Collections.singletonList(ProfileClient.DEFAULT_TRUST_DOMAIN));
        if (serviceCharacteristics == null) {
            LogUtil.j("IntellLife", "isNewParamServiceIdSuccess serviceProfile is null.");
            return c(deviceInfo, str, str2, map, 1);
        }
        Map<String, Object> profile = serviceCharacteristics.getProfile();
        if (map == null || map.isEmpty()) {
            LogUtil.j("IntellLife", "serviceId wrong ,please check : ", str);
            return false;
        }
        LogUtil.d("IntellLife", "serviceId : ", str, " local : ", profile.toString(), " params : ", map.toString());
        if (a(profile)) {
            LogUtil.a("IntellLife", "new device, put service.");
            return c(deviceInfo, str, str2, map, 1);
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!entry.getValue().equals(profile.get(entry.getKey()))) {
                return c(deviceInfo, str, str2, map, 2);
            }
        }
        return true;
    }

    private boolean a(String str, String str2) {
        List<ServiceProfile> servicesOfDevice = ProfileAgent.PROFILE_AGENT.getClientAgent().getServicesOfDevice(str2, false, Collections.singletonList(ProfileClient.DEFAULT_TRUST_DOMAIN));
        if (servicesOfDevice == null || servicesOfDevice.isEmpty()) {
            LogUtil.j("IntellLife", "service id not exit, put all.");
            return true;
        }
        Iterator<ServiceProfile> it = servicesOfDevice.iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase(it.next().getId())) {
                return false;
            }
        }
        return true;
    }

    private boolean a(Map<String, Object> map) {
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Object value = it.next().getValue();
            if (value == null || TextUtils.isEmpty(value.toString())) {
                return true;
            }
        }
        return false;
    }

    private void g(DeviceInfo deviceInfo) {
        for (Map.Entry<String, Integer> entry : mej.e().entrySet()) {
            String key = entry.getKey();
            HashMap map = new HashMap(16);
            map.put(key, key);
            map.put("ability", Integer.valueOf(d(deviceInfo.getExpandCapability(), entry.getValue().intValue())));
            LogUtil.j("IntellLife", "putDeviceCapabilityName : ", Boolean.valueOf(a(deviceInfo, "WEAR" + key, "wearCapabilityService", map)));
        }
    }

    private void j(DeviceInfo deviceInfo) {
        LogUtil.a("IntellLife", "capability : ", deviceInfo.getExpandCapability());
        String multiLinkBleMac = deviceInfo.getMultiLinkBleMac();
        if (multiLinkBleMac == null || multiLinkBleMac.isEmpty()) {
            LogUtil.j("IntellLife", "wrong , ble mac is wrong, please check 5.1.7 command");
            return;
        }
        String strH = h(multiLinkBleMac);
        if (TextUtils.isEmpty(strH)) {
            LogUtil.j("IntellLife", "putDeviceBleLast , ble mac is wrong, please check 5.1.7 command");
            return;
        }
        HashMap map = new HashMap(16);
        map.put("address", strH);
        ReleaseLogUtil.d("DEVMGR_IntellLife", "putDeviceBleLast : ", Boolean.valueOf(a(deviceInfo, "bt", "bt", map)));
    }

    private boolean c(DeviceInfo deviceInfo, String str, String str2, Map<String, Object> map, int i) {
        if ((i & 1) == 1) {
            a(deviceInfo, str, str2);
        }
        return e(e(deviceInfo), str, map);
    }

    private String e(DeviceInfo deviceInfo) {
        if (!TextUtils.isEmpty(deviceInfo.getDeviceUdid())) {
            return deviceInfo.getDeviceUdid();
        }
        return b(deviceInfo.getSecurityUuid());
    }

    private int d(String str, int i) {
        return CommonUtil.a(eeq.c(str), i) ? 1 : 0;
    }

    private void b(DeviceInfo deviceInfo, String str) {
        ReleaseLogUtil.d("DEVMGR_IntellLife", "putManagerNodeProfile start");
        String strC = c(j());
        String strD = d(e(deviceInfo), "managerNode", "characteristic.managerIdentifierList");
        HashMap map = new HashMap(16);
        if (g(strD)) {
            ReleaseLogUtil.d("DEVMGR_IntellLife", "putManagerNodeProfile characterValue is empty");
            map.put("characteristic.managerIdentifierList", strC);
        } else if (!strD.contains(strC)) {
            map.put("characteristic.managerIdentifierList", strD + "," + strC);
        } else {
            ReleaseLogUtil.d("DEVMGR_IntellLife", "cloud Characteristics has already exists.");
        }
        d(deviceInfo, map, str);
        ReleaseLogUtil.d("DEVMGR_IntellLife", "putManagerNodeProfile end : ", Boolean.valueOf(a(deviceInfo, "managerNode", "managerNode", map)));
    }

    private void d(DeviceInfo deviceInfo, Map<String, Object> map, String str) {
        LogUtil.a("IntellLife", "putManagerNodeNew start");
        String strD = d(e(deviceInfo), "managerNode", "managerIdentifierList2");
        if (g(strD)) {
            LogUtil.a("IntellLife", "putManagerNodeNew characterValue is empty");
            map.put("managerIdentifierList2", str);
        } else {
            if (!strD.contains(str)) {
                LogUtil.a("IntellLife", "putManagerNodeNew characterValue not empty");
                map.put("managerIdentifierList2", strD + "," + str);
                return;
            }
            LogUtil.j("IntellLife", "putManagerNodeNew cloud Characteristics has already exists characterValue:", strD);
        }
    }

    public String c() {
        return CommonUtil.k(BaseApplication.getContext());
    }

    private String c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("IntellLife", "checkInvalidSerialNumber number isEmpty");
            return " ";
        }
        if (!"unknown".equals(str) && !Constants.NULL.equals(str)) {
            return str;
        }
        LogUtil.j("IntellLife", "checkInvalidSerialNumber number is null , number:", str);
        return " ";
    }

    private boolean g(String str) {
        if (!Constants.NULL.equals(str) && !"".equals(str)) {
            return false;
        }
        LogUtil.j("IntellLife", "isEmptyCharacterValue characterValue is null");
        return true;
    }

    public void a(String str) {
        LogUtil.a("IntellLife", "removeDeviceToProfile start deviceId:", CommonUtil.n(str));
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("IntellLife", "removeDeviceToProfile deviceId is null");
            return;
        }
        f(str);
        e(str);
        a();
        KeyValDbManager.d(BaseApplication.getContext()).b(str, "");
    }

    private void e(String str) {
        String str2;
        LogUtil.a("IntellLife", "deleteDeviceById start");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("IntellLife", "deleteDeviceById deviceId is null");
            return;
        }
        ProfileClient clientAgent = ProfileAgent.PROFILE_AGENT.getClientAgent();
        List<DeviceProfile> devices = clientAgent.getDevices(true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (devices == null) {
            LogUtil.j("IntellLife", "deleteDeviceById deviceProfiles is null");
            return;
        }
        for (DeviceProfile deviceProfile : devices) {
            String id = deviceProfile.getId();
            Map<String, Object> profile = deviceProfile.getProfile();
            if (profile.get("sn") instanceof String) {
                str2 = (String) profile.get("sn");
                LogUtil.a("IntellLife", "deleteDeviceById serial string:", CommonUtil.n(str2));
            } else {
                str2 = null;
            }
            if (str.equals(id) || (!TextUtils.isEmpty(str2) && str.equals(str2))) {
                d(id);
                this.f41667b = str2;
                if (profile.get("mac") instanceof String) {
                    String str3 = (String) profile.get("mac");
                    this.f41668c = str3;
                    LogUtil.a("IntellLife", "deleteDeviceById mac:", str3);
                }
                if (profile.get("prodId") instanceof String) {
                    String str4 = (String) profile.get("prodId");
                    this.d = str4;
                    LogUtil.a("IntellLife", "deleteDeviceById prodId:", str4);
                }
                boolean zDeleteDevice = clientAgent.deleteDevice(id);
                LogUtil.a("IntellLife", "deleteDeviceById deleteDevice : ", Boolean.valueOf(zDeleteDevice));
                a(zDeleteDevice);
                return;
            }
        }
    }

    private void a() {
        String str;
        String str2;
        String str3;
        LogUtil.a("IntellLife", "deleteErrorDeviceInfo mDeleteDeviceMac:", this.f41668c, "; mDeleteDeviceSn:", CommonUtil.n(this.f41667b), "; mDeleteDeviceProdId:", this.d);
        ProfileClient clientAgent = ProfileAgent.PROFILE_AGENT.getClientAgent();
        List<DeviceProfile> devices = clientAgent.getDevices(true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (devices == null) {
            LogUtil.j("IntellLife", "deleteErrorDeviceInfo deviceProfiles is null");
            return;
        }
        for (DeviceProfile deviceProfile : devices) {
            String id = deviceProfile.getId();
            Map<String, Object> profile = deviceProfile.getProfile();
            String str4 = null;
            if (profile.get("sn") instanceof String) {
                str = (String) profile.get("sn");
                LogUtil.a("IntellLife", "deleteErrorDeviceInfo serial string:", CommonUtil.n(str));
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str) && (str3 = this.f41667b) != null && str3.equals(str)) {
                d(id);
                boolean zDeleteDevice = clientAgent.deleteDevice(id);
                LogUtil.a("IntellLife", "deleteErrorDeviceInfo deleteDevice by sn: ", Boolean.valueOf(zDeleteDevice));
                a(zDeleteDevice);
            } else {
                if (profile.get("prodId") instanceof String) {
                    str4 = (String) profile.get("prodId");
                    LogUtil.a("IntellLife", "deleteErrorDeviceInfo prodId:", str4);
                }
                if (str4 == null || !TextUtils.equals(this.d, str4)) {
                    LogUtil.a("IntellLife", "deleteErrorDeviceInfo prodId not equal");
                } else if (str != null && !TextUtils.isEmpty(str) && !str.contains("#ANDROID21")) {
                    String strH = h(str);
                    LogUtil.a("IntellLife", "deleteErrorDeviceInfo wrongSn: ", strH);
                    if (!TextUtils.isEmpty(strH) && (str2 = this.f41668c) != null && str2.equals(strH)) {
                        d(id);
                        boolean zDeleteDevice2 = clientAgent.deleteDevice(id);
                        LogUtil.a("IntellLife", "deleteErrorDeviceInfo deleteDevice by wrong sn: ", Boolean.valueOf(zDeleteDevice2));
                        a(zDeleteDevice2);
                    }
                }
            }
        }
        this.f41667b = "";
        this.f41668c = "";
        this.d = "";
    }

    private String d(String str, String str2, String str3) {
        if (!ProfileAgent.PROFILE_AGENT.getConnected()) {
            LogUtil.j("IntellLife", "getDevices profile has not connect");
            return "";
        }
        ServiceCharacteristicProfile serviceCharacteristics = ProfileAgent.PROFILE_AGENT.getClientAgent().getServiceCharacteristics(str, str2, false, Collections.singletonList(ProfileClient.DEFAULT_TRUST_DOMAIN));
        if (serviceCharacteristics == null) {
            LogUtil.j("IntellLife", "serviceCharacteristicProfiles is null");
            return "";
        }
        return String.valueOf(serviceCharacteristics.getProfile().get(str3));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    private boolean e(Map<String, Object> map, DeviceInfo deviceInfo) {
        String deviceName;
        if (deviceInfo.getDeviceName() == null) {
            LogUtil.j("IntellLife", "setBasicProfileInfo getDeviceName is null");
            return false;
        }
        mec mecVarA = a(deviceInfo);
        if (mecVarA == null) {
            LogUtil.j("IntellLife", "setBasicProfileInfo unknown device");
            return false;
        }
        String strE = e(deviceInfo);
        List<DeviceProfile> devicesById = ProfileAgent.PROFILE_AGENT.getClientAgent().getDevicesById(strE, false, Collections.singletonList(ProfileClient.DEFAULT_TRUST_DOMAIN));
        if (devicesById != null && !devicesById.isEmpty()) {
            Map<String, Object> profile = devicesById.get(0).getProfile();
            if (!profile.isEmpty()) {
                deviceName = (String) profile.get("deviceName");
                net.b("IntellLife", strE, deviceName);
                LogUtil.a("IntellLife", "setBasicProfileInfo localProfiles is not null, deviceName: ", deviceName);
            } else {
                deviceName = "";
            }
        } else {
            deviceName = "";
        }
        LogUtil.a("IntellLife", "setBasicProfileInfo deviceModeInfo:", mecVarA.toString());
        map.put("model", b(deviceInfo, mecVarA));
        map.put("devType", mecVarA.c());
        c(map, deviceInfo);
        map.put("prodId", mecVarA.e());
        map.put(ProfileRequestConstants.SWV, deviceInfo.getSoftVersion());
        LogUtil.a("IntellLife", " deviceModeInfo SoftVersion:", deviceInfo.getSoftVersion());
        map.put(ProfileRequestConstants.HIV, "1");
        if (TextUtils.isEmpty(deviceName)) {
            deviceName = deviceInfo.getDeviceName();
        }
        map.put("deviceName", deviceName);
        if (!TextUtils.isEmpty(deviceInfo.getDeviceUdid())) {
            LogUtil.a("IntellLife", "getDeviceUdid is not null");
            map.put("udid", deviceInfo.getDeviceUdid());
        } else {
            map.put("udid", b(deviceInfo.getSecurityUuid()));
        }
        Object obj = map.get("udid");
        if (obj instanceof String) {
            LogUtil.a("IntellLife", " deviceModeInfo udid:", CommonUtil.n((String) obj));
        }
        String strH = h(deviceInfo);
        if (!TextUtils.isEmpty(strH)) {
            map.put("sn", strH);
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (TextUtils.isEmpty(deviceIdentify)) {
            LogUtil.a("IntellLife", "setBasicProfileInfo() subMac is null");
            return false;
        }
        map.put("mac", deviceIdentify);
        String hwUdid = deviceInfo.getHwUdid();
        if (!TextUtils.isEmpty(hwUdid)) {
            map.put("hwUdid", hwUdid);
        }
        map.put(ProfileRequestConstants.PROT_TYPE, 4);
        if (!TextUtils.isEmpty(mecVarA.d())) {
            map.put(ProfileRequestConstants.INTERNAL_MODEL, mecVarA.d());
        }
        if (TextUtils.isEmpty(deviceInfo.getDeviceSubModelId())) {
            return true;
        }
        LogUtil.a("IntellLife", "getDeviceSubModelId is:", deviceInfo.getDeviceSubModelId());
        map.put(ProfileRequestConstants.SUB_PROD_ID, deviceInfo.getDeviceSubModelId());
        return true;
    }

    private String h(DeviceInfo deviceInfo) {
        int deviceIdType = deviceInfo.getDeviceIdType();
        int productType = deviceInfo.getProductType();
        if (deviceIdType != 1 && productType != 10) {
            if (productType >= 72) {
                return eeq.d(deviceInfo.getUuid()) + "#ANDROID21";
            }
            return "";
        }
        if (deviceIdType == 1) {
            return eeq.d(deviceInfo.getUuid()) + "#ANDROID21";
        }
        return deviceInfo.getUuid() + "#ANDROID21";
    }

    private String b(DeviceInfo deviceInfo, mec mecVar) {
        String certModel = deviceInfo.getCertModel();
        if (!TextUtils.isEmpty(certModel) && deviceInfo.getProductType() != 75) {
            return certModel;
        }
        LogUtil.a("IntellLife", "getDeviceModel, deviceModel is empty or device is bolt");
        return mecVar.d();
    }

    private String h(String str) {
        String strReplaceAll = str.replaceAll(":", "");
        int length = strReplaceAll.length();
        if (length > 3) {
            return strReplaceAll.substring(length - 3, length);
        }
        return null;
    }

    public mec a(DeviceInfo deviceInfo) {
        int productType = deviceInfo.getProductType();
        String deviceName = deviceInfo.getDeviceName();
        LogUtil.a("IntellLife", "getDeviceModeInfo () type:", Integer.valueOf(productType), " deviceNameKey:", deviceName);
        return d(deviceInfo, productType, deviceName);
    }

    private mec c(DeviceInfo deviceInfo, int i, String str) {
        if (i == 7) {
            LogUtil.a("IntellLife", "getLikeByMap device is HUAWEI B3-");
            return new mec("GMN-BX9", "004Z", "06E");
        }
        if (i == 12) {
            return new mec("AW61", "0056", "06E");
        }
        if (i == 19) {
            LogUtil.a("IntellLife", "getLikeByMap device is HUAWEI Band 3 Pro-");
            return new mec("TER-B19", "002K", "06E");
        }
        if (i == 45) {
            LogUtil.a("IntellLife", "getLikeByMap device is HUAWEI Band 3i-");
            return new mec("ADS-B29", "005U", "06E");
        }
        if (i == 23) {
            LogUtil.a("IntellLife", "getLikeByMap device is HUAWEI Band 3e-");
            return new mec("AW70-B29", "004X", "06E");
        }
        if (i == 24) {
            return new mec("AW70-B19", "0053", "06E");
        }
        if (i == 36) {
            return new mec("AW70-B39", "006X", "06E");
        }
        if (i != 37) {
            switch (i) {
                case 14:
                    LogUtil.a("IntellLife", "getLikeByMap device is HUAWEI B3 Lite-");
                    return new mec("GRU-B09", "0050", "06E");
                case 15:
                    LogUtil.a("IntellLife", "getLikeByMap device is HUAWEI Sport");
                    return new mec("ERS-B19", "0051", "06E");
                case 16:
                    LogUtil.a("IntellLife", "getLikeByMap device is HUAWEI B5-");
                    return new mec("JNS-BX9", "004Y", "06E");
                default:
                    return b(deviceInfo, i, str);
            }
        }
        return new mec("AW70-B39HN", "006Y", "06E");
    }

    private mec b(DeviceInfo deviceInfo, int i, String str) {
        if (i == 13) {
            LogUtil.a("IntellLife", "getLikeByMap device is honor Band 3-");
            return new mec("NYX-B10", "0054", "06E");
        }
        if (i != 18) {
            if (i == 44) {
                LogUtil.a("IntellLife", "getLikeByMap device is HONOR Band 5i-");
                return new mec("ADS-B19", "005T", "06E");
            }
            if (i < 55) {
                LogUtil.j("IntellLife", "getDeviceModeInfo() no device Matching");
                return null;
            }
            return i(deviceInfo);
        }
        mec mecVarI = i(deviceInfo);
        if (mecVarI != null) {
            LogUtil.a("IntellLife", "get HONOR Band 5 model from deviceInfo not null");
            return mecVarI;
        }
        if (!TextUtils.isEmpty(str) && str.toUpperCase(Locale.ENGLISH).indexOf("HONOR BAND 5-") != -1) {
            LogUtil.a("IntellLife", "getLikeByMap device is HONOR Band5");
            return new mec("CRS-B19S", "005R", "06E");
        }
        LogUtil.a("IntellLife", "getLikeByMap device is HONOR Band4");
        return new mec("CRS-B19", "002I", "06E");
    }

    private mec i(DeviceInfo deviceInfo) {
        String hiLinkDeviceId = deviceInfo.getHiLinkDeviceId();
        String deviceModel = deviceInfo.getDeviceModel();
        if (TextUtils.isEmpty(hiLinkDeviceId) || TextUtils.isEmpty(deviceModel)) {
            LogUtil.j("IntellLife", "getModelInfoFromDeviceInfo() not get DeviceId and DeviceMode");
            return null;
        }
        if (hiLinkDeviceId.length() != 4) {
            LogUtil.j("IntellLife", "getModelInfoFromDeviceInfo() hiLinkDeviceId is Illegal");
            return null;
        }
        return new mec(deviceModel, hiLinkDeviceId, f(deviceInfo));
    }

    private String f(DeviceInfo deviceInfo) {
        String strJ;
        int iAf;
        if (EnvironmentUtils.d()) {
            strJ = lvi.j(deviceInfo.getProductType());
            LogUtil.a("IntellLife", "mainprocess getModelInfoFromDeviceInfo uuid：", strJ);
            edn ednVarA = lvi.a(strJ);
            if (ednVarA != null && ednVarA.f() != -1) {
                ReleaseLogUtil.e("DEVMGR_IntellLife", "getDeviceType DeviceCategory():", Integer.valueOf(ednVarA.f()));
                return c(ednVarA.f());
            }
        } else {
            strJ = mmx.j(deviceInfo.getProductType());
            LogUtil.a("IntellLife", "phoneservice getModelInfoFromDeviceInfo uuid：", strJ);
            mmt mmtVarA = mmx.a(strJ);
            if (mmtVarA != null && mmtVarA.d() != -1) {
                ReleaseLogUtil.e("DEVMGR_IntellLife", "getDeviceType DeviceCategory():", Integer.valueOf(mmtVarA.d()));
                return c(mmtVarA.d());
            }
        }
        LogUtil.j("IntellLife", "getModelInfoFromDeviceInfo deviceInfoNew is null");
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strJ);
        if (pluginInfoByUuid != null && pluginInfoByUuid.i() != null && (iAf = pluginInfoByUuid.i().af()) != -1) {
            ReleaseLogUtil.e("DEVMGR_IntellLife", "getDeviceType from description DeviceCategory():", Integer.valueOf(iAf));
            return c(iAf);
        }
        if (!EnvironmentUtils.d() || !lvi.f(deviceInfo.getProductType())) {
            if (EnvironmentUtils.e() && mmx.g(deviceInfo.getProductType())) {
                return "06E";
            }
            return "06D";
        }
        return "06E";
    }

    private String c(int i) {
        if (i == 1) {
            return "06E";
        }
        if (i == 6) {
            return "A12";
        }
        return "06D";
    }

    private mec d(DeviceInfo deviceInfo, int i, String str) {
        if (i == 8) {
            LogUtil.a("IntellLife", "getLikeByMap device is honor Watch S1-");
            return new mec("MES-B19", "004W", "06D");
        }
        if (i == 10) {
            if (!TextUtils.isEmpty(str) && str.toUpperCase(Locale.ENGLISH).indexOf("PORSCHE DESIGN") != -1) {
                LogUtil.a("IntellLife", "getLikeByMap device is PORSCHE DESIGN");
                return new mec("LEO-BX9", "004U", "06D");
            }
            LogUtil.a("IntellLife", "getLikeByMap device is HUAWEI WATCH 2");
            return new mec("LEO-DLXX", "004Q", "06D");
        }
        if (i != 34) {
            if (i == 20) {
                LogUtil.a("IntellLife", "getLikeByMap device is honor Watch-");
                return new mec("TLS-B19", "002M", "06D");
            }
            if (i == 21) {
                LogUtil.a("IntellLife", "getLikeByMap device is HUAWEI WATCH GT-");
                return new mec("FTN-B19", "003N", "06D");
            }
            return a(deviceInfo, i, str);
        }
        mec mecVarI = i(deviceInfo);
        if (mecVarI != null) {
            LogUtil.a("IntellLife", "getLikeByMap device is HUAWEI WATCH GT 2 pro vidar");
            return mecVarI;
        }
        if (!TextUtils.isEmpty(deviceInfo.getManufacture())) {
            if ("010404".equals(deviceInfo.getManufacture())) {
                mec mecVar = new mec("LTN-B19", "005W", "06D");
                LogUtil.a("IntellLife", "getLikeByMap device is HUAWEI WATCH GT 2 Latona");
                return mecVar;
            }
            if ("010303".equals(deviceInfo.getManufacture())) {
                return d(deviceInfo);
            }
            LogUtil.j("IntellLife", "HUAWEI WATCH GT 2 unknown Manufacture");
            return mecVarI;
        }
        LogUtil.j("IntellLife", "HUAWEI WATCH GT 2 Manufacture is empty");
        return mecVarI;
    }

    private mec a(DeviceInfo deviceInfo, int i, String str) {
        if (i == 35) {
            mec mecVarI = i(deviceInfo);
            if (mecVarI != null) {
                LogUtil.a("IntellLife", "get MagicWatch 2 model from deviceInfo not null");
                return mecVarI;
            }
            if (TextUtils.isEmpty(deviceInfo.getManufacture())) {
                LogUtil.j("IntellLife", "MagicWatch 2 Manufacture is empty");
                return mecVarI;
            }
            if ("010404".equals(deviceInfo.getManufacture())) {
                LogUtil.a("IntellLife", "getLikeByMap device is MagicWatch 2 minos");
                return new mec("MNS-B19", "005Y", "06D");
            }
            if ("010303".equals(deviceInfo.getManufacture())) {
                LogUtil.a("IntellLife", "getLikeByMap device is MagicWatch 2 heibe");
                return new mec("HBE-B19", "005Z", "06D");
            }
            LogUtil.j("IntellLife", "MagicWatch 2 unknown Manufacture");
            return mecVarI;
        }
        return c(deviceInfo, i, str);
    }

    private mec d(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceModel().toUpperCase(Locale.ENGLISH).contains("HECTOR")) {
            LogUtil.a("IntellLife", "getLikeByMap device is HUAWEI WATCH Hector");
            return new mec("HCT-B19", "M003", "06D");
        }
        LogUtil.a("IntellLife", "getLikeByMap device is HUAWEI WATCH GT 2 Diana");
        return new mec("DAN-B19", "005X", "06D");
    }

    private void c(Map<String, Object> map, DeviceInfo deviceInfo) {
        String strJ;
        String str = "002";
        if (EnvironmentUtils.d()) {
            int iP = lvi.a(deviceInfo.getProductType()).p();
            ReleaseLogUtil.d("DEVMGR_IntellLife", "ManufactureId is ", Integer.valueOf(iP));
            if (iP != -1) {
                map.put(ProfileRequestConstants.MANU, iP == 2 ? "002" : "001");
                return;
            }
            strJ = lvi.j(deviceInfo.getProductType());
        } else {
            int iH = mmx.d(deviceInfo.getProductType()).h();
            ReleaseLogUtil.d("DEVMGR_IntellLife", "ManufactureId is ", Integer.valueOf(iH));
            if (iH != -1) {
                map.put(ProfileRequestConstants.MANU, iH == 2 ? "002" : "001");
                return;
            }
            strJ = mmx.j(deviceInfo.getProductType());
        }
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strJ);
        if (pluginInfoByUuid != null && pluginInfoByUuid.i() != null) {
            String strJ2 = pluginInfoByUuid.i().j();
            if (!TextUtils.isEmpty(strJ2)) {
                try {
                    int i = Integer.parseInt(strJ2);
                    ReleaseLogUtil.d("DEVMGR_IntellLife", "getManufactureId manu type : ", Integer.valueOf(i));
                    if (i != 2) {
                        str = "001";
                    }
                    map.put(ProfileRequestConstants.MANU, str);
                    return;
                } catch (NumberFormatException e) {
                    LogUtil.e("IntellLife", e.getMessage());
                }
            }
        }
        map.put(ProfileRequestConstants.MANU, "001");
    }

    private void c(DeviceInfo deviceInfo, Map<String, Object> map, String str) {
        if (!ProfileAgent.PROFILE_AGENT.getConnected()) {
            LogUtil.j("IntellLife", "putDeviceProfile profile not connected");
            return;
        }
        String strE = e(deviceInfo);
        boolean zB = b(strE, map);
        ReleaseLogUtil.d("DEVMGR_IntellLife", "putDeviceProfile isNeedNewDeviceProfile", Boolean.valueOf(zB));
        boolean zPutDevice = true;
        if (zB) {
            LogUtil.a("IntellLife", "new profile, need put device.");
            DeviceProfile deviceProfile = new DeviceProfile();
            deviceProfile.setId(e(deviceInfo));
            deviceProfile.setIsNeedCloud(true);
            if (map.get("devType") instanceof String) {
                deviceProfile.setType((String) map.get("devType"));
            }
            deviceProfile.addEntities(map);
            zPutDevice = ProfileAgent.PROFILE_AGENT.getClientAgent().putDevice(deviceProfile);
        }
        ReleaseLogUtil.d("DEVMGR_IntellLife", "putDevice is success: ", Boolean.valueOf(zPutDevice));
        if (zPutDevice) {
            e(deviceInfo, str);
            o(deviceInfo);
            j(deviceInfo);
            g(deviceInfo);
            n(deviceInfo);
            l(deviceInfo);
        }
        i(strE);
    }

    private void l(DeviceInfo deviceInfo) {
        LogUtil.a("IntellLife", "putOsProfile start");
        HashMap map = new HashMap(16);
        int osType = deviceInfo.getOsType();
        if (osType != -1) {
            map.put("type", Integer.valueOf(osType));
        }
        int apiVersion = deviceInfo.getApiVersion();
        if (apiVersion != -1) {
            map.put("apiLevel", Integer.valueOf(apiVersion));
        }
        String abi = deviceInfo.getAbi();
        if (!TextUtils.isEmpty(abi)) {
            map.put("abi", abi);
        }
        String deviceOStVersion = deviceInfo.getDeviceOStVersion();
        if (!TextUtils.isEmpty(deviceOStVersion)) {
            map.put("version", deviceOStVersion);
        }
        if (map.isEmpty()) {
            ReleaseLogUtil.d("DEVMGR_IntellLife", "param is empty, not putOsProfile");
        } else {
            ReleaseLogUtil.d("DEVMGR_IntellLife", "putOsProfile : ", Boolean.valueOf(a(deviceInfo, "os", "os", map)));
        }
    }

    private boolean b(String str, Map<String, Object> map) {
        List<DeviceProfile> devicesById = ProfileAgent.PROFILE_AGENT.getClientAgent().getDevicesById(str, false, Collections.singletonList(ProfileClient.DEFAULT_TRUST_DOMAIN));
        if (devicesById == null || devicesById.isEmpty()) {
            LogUtil.j("IntellLife", "new device profile, need put device.");
            return true;
        }
        for (DeviceProfile deviceProfile : devicesById) {
            LogUtil.d("IntellLife", "test ", str, " deviceProfile : ", devicesById.toString());
            if (!c(map, deviceProfile.getProfile())) {
                return true;
            }
        }
        return false;
    }

    private boolean c(Map<String, Object> map, Map<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object obj = map2.get(key);
            Object value = entry.getValue();
            if (value != null && !value.equals(obj) && !ProfileRequestConstants.HIV.equalsIgnoreCase(key)) {
                return false;
            }
        }
        return true;
    }

    private void a(DeviceInfo deviceInfo, String str, String str2) {
        if (!ProfileAgent.PROFILE_AGENT.getConnected()) {
            LogUtil.j("IntellLife", "putDeviceService profile not connected");
            return;
        }
        String strE = e(deviceInfo);
        ServiceProfile serviceProfile = new ServiceProfile();
        serviceProfile.setDeviceId(strE);
        serviceProfile.setIsNeedCloud(true);
        serviceProfile.setId(str);
        serviceProfile.setType(str2);
        HashMap map = new HashMap(10);
        map.put("serviceId", str);
        map.put("type", str2);
        serviceProfile.addEntities(map);
        ReleaseLogUtil.d("DEVMGR_IntellLife", "putDeviceService is ", Boolean.valueOf(ProfileAgent.PROFILE_AGENT.getClientAgent().putServiceOfDevice(strE, serviceProfile)));
    }

    private boolean e(String str, String str2, Map<String, Object> map) {
        if (!ProfileAgent.PROFILE_AGENT.getConnected()) {
            LogUtil.j("IntellLife", "putServiceCharacteristicAddEntities profile not connected");
            return false;
        }
        ServiceCharacteristicProfile serviceCharacteristicProfile = new ServiceCharacteristicProfile();
        serviceCharacteristicProfile.addEntities(map);
        serviceCharacteristicProfile.addEntityInfo("timestamp", Long.valueOf(System.currentTimeMillis()));
        serviceCharacteristicProfile.setIsNeedCloud(true);
        LogUtil.d("IntellLife", "putServiceCharacteristicAddEntities serviceCharacteristicProfile ", serviceCharacteristicProfile.toString());
        boolean zPutServiceCharacteristic = ProfileAgent.PROFILE_AGENT.getClientAgent().putServiceCharacteristic(str, str2, serviceCharacteristicProfile);
        ReleaseLogUtil.d("DEVMGR_IntellLife", "putServiceCharacteristicAddEntities put isSuccess:", Boolean.valueOf(zPutServiceCharacteristic));
        return zPutServiceCharacteristic;
    }

    private String j() {
        if (Build.VERSION.SDK_INT >= 29) {
            String androidId = FoundationCommonUtil.getAndroidId(BaseApplication.getContext());
            if (!TextUtils.isEmpty(androidId)) {
                return androidId.toUpperCase(Locale.ENGLISH);
            }
            LogUtil.e("IntellLife", "androidId is isEmpty");
        }
        LogUtil.a("IntellLife", "getSerialNumber version < VERSION_CODES.Q");
        return CommonUtil.ah();
    }

    private void d(String str) {
        ProfileClient clientAgent = ProfileAgent.PROFILE_AGENT.getClientAgent();
        List<ServiceProfile> servicesOfDevice = clientAgent.getServicesOfDevice(str, true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (servicesOfDevice == null || servicesOfDevice.isEmpty()) {
            boolean zDeleteDevice = clientAgent.deleteDevice(str);
            LogUtil.j("IntellLife", "deleteAllServices deleteDevice success:", Boolean.valueOf(zDeleteDevice));
            a(zDeleteDevice);
        } else {
            Iterator<ServiceProfile> it = servicesOfDevice.iterator();
            while (it.hasNext()) {
                String id = it.next().getId();
                LogUtil.a("IntellLife", " deleteAllServices serviceId:", id);
                d(str, id);
                LogUtil.a("IntellLife", "deleteAllServices deleteDevice success:", Boolean.valueOf(clientAgent.deleteServiceOfDevice(str, id)));
            }
        }
    }

    private void d(String str, String str2) {
        ProfileClient clientAgent = ProfileAgent.PROFILE_AGENT.getClientAgent();
        ServiceCharacteristicProfile serviceCharacteristics = clientAgent.getServiceCharacteristics(str, str2, true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (serviceCharacteristics == null) {
            LogUtil.j("IntellLife", "characteristicProfile is empty");
            return;
        }
        Map<String, Object> profile = serviceCharacteristics.getProfile();
        if (profile.isEmpty()) {
            LogUtil.j("IntellLife", "deleteAllCharacter profile map is empty");
            return;
        }
        Iterator<Map.Entry<String, Object>> it = profile.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            LogUtil.d("IntellLife", " deleteAllCharacter character key:", key);
            LogUtil.d("IntellLife", " deleteAllCharacter is success:", Boolean.valueOf(clientAgent.deleteServiceCharacteristic(str, str2, key)));
        }
    }

    public void b() {
        LogUtil.a("IntellLife", "updateCloudDeviceMessage()");
        e();
        HashMap map = new HashMap(10);
        HashMap map2 = new HashMap(10);
        e(map, map2);
        String strC = c();
        for (Map.Entry<String, DeviceInfo> entry : map.entrySet()) {
            String key = entry.getKey();
            if (map2.get(key) != null) {
                LogUtil.a("IntellLife", "localDevice the theme as cloudDevice");
                DeviceInfo deviceInfo = map.get(key);
                if (deviceInfo == null) {
                    LogUtil.j("IntellLife", "updateCloudDeviceMessage(): local device in cloud , but local deviceInfo is null");
                } else {
                    if (a(deviceInfo) == null) {
                        LogUtil.j("IntellLife", "updateCloudDeviceMessage(): not Matching device form modeList");
                    }
                    b(deviceInfo, strC);
                    o(deviceInfo);
                }
            } else {
                LogUtil.a("IntellLife", "localDevice not add cloud");
                d(entry.getValue(), strC);
            }
        }
    }

    private void e(Map<String, DeviceInfo> map, Map<String, DeviceProfile> map2) {
        LogUtil.a("IntellLife", "initDeviceMap()");
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "IntellLife");
        if (deviceList == null && lug.c() == null) {
            SystemClock.sleep(5000L);
            LogUtil.a("IntellLife", "initDeviceMap getPhoneServiceBinder() == null");
            deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "IntellLife");
        }
        if (deviceList == null) {
            if (mga.d()) {
                LogUtil.j("IntellLife", "initDeviceMap() isHasBondedDevice");
                return;
            }
            deviceList = new ArrayList<>(16);
        }
        for (DeviceInfo deviceInfo : deviceList) {
            String strE = e(deviceInfo);
            LogUtil.d("IntellLife", "localDeviceId:", strE);
            map.put(strE, deviceInfo);
        }
        if (CommonUtil.ca()) {
            LogUtil.a("IntellLife", "getCloudDeviceList isStoreDemoVersion");
            return;
        }
        List<DeviceProfile> devices = ProfileAgent.PROFILE_AGENT.getClientAgent().getDevices(true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (CollectionUtils.a(devices)) {
            LogUtil.j("IntellLife", "initDeviceMap deviceCloudProfiles isEmpty");
        } else {
            LogUtil.a("IntellLife", "initDeviceMap deviceCloudProfiles:", Integer.valueOf(devices.size()));
            e(map2, devices);
        }
    }

    private void e(Map<String, DeviceProfile> map, List<DeviceProfile> list) {
        String str;
        for (DeviceProfile deviceProfile : list) {
            Map<String, Object> profile = deviceProfile.getProfile();
            try {
                String str2 = profile.get("devType") instanceof String ? (String) profile.get("devType") : null;
                if (str2 == null) {
                    LogUtil.j("IntellLife", "cloudDevice type is null");
                } else if (!str2.equals("06E") && !str2.equals("06D") && !str2.equals("A12")) {
                    LogUtil.j("IntellLife", "cloudDevice type not is watch or band");
                } else {
                    if (!(profile.get("sn") instanceof String)) {
                        str = "";
                    } else {
                        str = (String) profile.get("sn");
                        LogUtil.a("IntellLife", "serial string:", CommonUtil.n(str));
                    }
                    String id = deviceProfile.getId();
                    LogUtil.a("IntellLife", "deviceProfileId string:", CommonUtil.n(id));
                    if (!TextUtils.isEmpty(id) && (id.contains("#ANDROID21") || str.contains("#ANDROID21"))) {
                        map.put(id, deviceProfile);
                    }
                }
            } catch (ClassCastException unused) {
                LogUtil.e("IntellLife", "initDeviceMap() ClassCastException");
            } catch (NumberFormatException unused2) {
                LogUtil.e("IntellLife", "initDeviceMap() NumberFormatException");
            }
        }
    }

    private String b(String str) {
        return str + "#ANDROID21";
    }

    private void e() {
        List<DeviceProfile> devices = ProfileAgent.PROFILE_AGENT.getClientAgent().getDevices(true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (devices != null) {
            for (DeviceProfile deviceProfile : devices) {
                try {
                    Map<String, Object> profile = deviceProfile.getProfile();
                    String str = profile.get("prodId") instanceof String ? (String) profile.get("prodId") : "";
                    String str2 = profile.get("deviceName") instanceof String ? (String) profile.get("deviceName") : "";
                    LogUtil.a("IntellLife", "deleteErrorMessage productId:", str, " deleteErrorMessage deviceName:", str2);
                    if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                        LogUtil.j("IntellLife", "deleteErrorMessage() productId or deviceName is empty");
                    } else if ("0054".equals(str) && str2.toUpperCase(Locale.ENGLISH).indexOf("HONOR BAND 4") > -1) {
                        String id = deviceProfile.getId();
                        if (!TextUtils.isEmpty(id)) {
                            e(id);
                        }
                    }
                } catch (ClassCastException unused) {
                    LogUtil.e("IntellLife", "deleteErrorMessage() ClassCastException");
                } catch (NumberFormatException unused2) {
                    LogUtil.e("IntellLife", "deleteErrorMessage() NumberFormatException");
                }
            }
        }
    }

    private void i(String str) {
        String strJ = j(str);
        ReleaseLogUtil.d("DEVMGR_IntellLife", "putWiseDeviceId wiseDeviceId:", CommonUtil.n(strJ));
        if (TextUtils.isEmpty(strJ)) {
            return;
        }
        KeyValDbManager.d(BaseApplication.getContext()).b(str, strJ);
    }

    private String j(String str) {
        List<DeviceProfile> devices = ProfileAgent.PROFILE_AGENT.getClientAgent().getDevices(true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (devices == null) {
            LogUtil.j("IntellLife", "getWiseDeviceIdByDeviceId deviceProfiles is null");
            return "";
        }
        LogUtil.a("IntellLife", "getWiseDeviceIdByDeviceId deviceProfile size: ", Integer.valueOf(devices.size()));
        for (DeviceProfile deviceProfile : devices) {
            if (str.equalsIgnoreCase(deviceProfile.getId())) {
                Map<String, Object> profile = deviceProfile.getProfile();
                if (!(profile.get("mac") instanceof String)) {
                    LogUtil.j("IntellLife", "getWiseDeviceIdByDeviceId mac not instanceof String");
                } else if (TextUtils.isEmpty((String) profile.get("mac"))) {
                    LogUtil.j("IntellLife", "getWiseDeviceIdByDeviceId mac is empty");
                } else if (!(profile.get("wiseDeviceId") instanceof String)) {
                    LogUtil.j("IntellLife", "getWiseDeviceIdByDeviceId wiseDeviceId not instanceof String");
                } else {
                    String str2 = (String) profile.get("wiseDeviceId");
                    if (TextUtils.isEmpty(str2) || Constants.NULL.equals(str2)) {
                        LogUtil.j("IntellLife", "getWiseDeviceIdByDeviceId wiseDeviceId is empty");
                    } else {
                        LogUtil.a("IntellLife", "getWiseDeviceIdByDeviceId wiseDeviceId not empty");
                        return str2;
                    }
                }
            }
        }
        return "";
    }

    public static void a(boolean z) {
        if (z) {
            for (int i = 0; i < cin.f1618a.size(); i++) {
                KeyValDbManager.d(BaseApplication.getContext()).b("profile_devices_last_query_time_01" + cin.f1618a.get(i), String.valueOf(0));
            }
        }
    }
}
