package defpackage;

import android.text.TextUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.network.embedded.w9;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.intelligentlifemgr.ProfileAgent;
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
import health.compact.a.KeyValDbManager;
import health.compact.a.Sha256;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class nar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f42834a = new Object();
    private static volatile nar e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f42836c = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42835b = "";
    private String d = "";

    private nar() {
    }

    public static nar d() {
        if (e == null) {
            synchronized (f42834a) {
                if (e == null) {
                    e = new nar();
                }
            }
        }
        return e;
    }

    public void e(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwAccessoryLife", "add device is null");
            return;
        }
        LogUtil.a("HwAccessoryLife", "add device to profile , device is ", deviceInfo, ",HiLinkDeviceId is ", deviceInfo.getHiLinkDeviceId(), ",DeviceModel is ", deviceInfo.getDeviceModel());
        HashMap map = new HashMap(10);
        if (!a(map, deviceInfo)) {
            LogUtil.j("HwAccessoryLife", "add device to profile end , unknown device type");
        } else {
            b(deviceInfo, map);
            LogUtil.a("HwAccessoryLife", "add device to profile end");
        }
    }

    private void f(DeviceInfo deviceInfo) {
        LogUtil.a("HwAccessoryLife", "putBtConnectionStatusProfile start");
        HashMap map = new HashMap(16);
        map.put("characteristic.bt.connectionStatus", "0");
        if (d(deviceInfo, w9.h, "bt.connection", map)) {
            j(deviceInfo);
        } else {
            LogUtil.j("HwAccessoryLife", "putServiceCharacteristic error");
        }
    }

    private void i(DeviceInfo deviceInfo) {
        Integer num = nak.b().get(Integer.valueOf(deviceInfo.getDeviceConnectState()));
        int iIntValue = num == null ? 0 : num.intValue();
        HashMap map = new HashMap(16);
        map.put("peerConnectStatus", Integer.valueOf(iIntValue));
        LogUtil.j("HwAccessoryLife", "putDeviceConnectStatusProfile : ", Boolean.valueOf(d(deviceInfo, BleConstants.DEV_INFO, BleConstants.DEV_INFO, map)));
    }

    private boolean d(DeviceInfo deviceInfo, String str, String str2, Map<String, Object> map) {
        String strC = c(deviceInfo);
        if (c(str, strC)) {
            LogUtil.j("HwAccessoryLife", "serviceId is not exits, put serviceId and character.");
            return b(deviceInfo, str, str2, map, 1);
        }
        ServiceCharacteristicProfile serviceCharacteristics = ProfileAgent.PROFILE_AGENT.getClientAgent().getServiceCharacteristics(strC, str, false, Collections.singletonList(ProfileClient.DEFAULT_TRUST_DOMAIN));
        if (serviceCharacteristics == null) {
            LogUtil.j("HwAccessoryLife", "isNewParamServiceIdSuccess serviceProfile is null.");
            return b(deviceInfo, str, str2, map, 1);
        }
        Map<String, Object> profile = serviceCharacteristics.getProfile();
        if (map == null || map.isEmpty()) {
            LogUtil.j("HwAccessoryLife", "serviceId wrong ,please check : ", str);
            return false;
        }
        LogUtil.d("HwAccessoryLife", "serviceId : ", str, " local : ", profile.toString(), " params : ", map.toString());
        if (c(profile)) {
            LogUtil.a("HwAccessoryLife", "new device, put service.");
            return b(deviceInfo, str, str2, map, 1);
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!entry.getValue().equals(profile.get(entry.getKey()))) {
                return b(deviceInfo, str, str2, map, 2);
            }
        }
        return true;
    }

    private boolean c(String str, String str2) {
        List<ServiceProfile> servicesOfDevice = ProfileAgent.PROFILE_AGENT.getClientAgent().getServicesOfDevice(str2, false, Collections.singletonList(ProfileClient.DEFAULT_TRUST_DOMAIN));
        if (servicesOfDevice == null || servicesOfDevice.isEmpty()) {
            LogUtil.j("HwAccessoryLife", "service id not exit, put all.");
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

    private boolean c(Map<String, Object> map) {
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
        for (Map.Entry<String, Integer> entry : nak.e().entrySet()) {
            String key = entry.getKey();
            HashMap map = new HashMap(16);
            map.put(key, key);
            map.put("ability", Integer.valueOf(b(deviceInfo.getExpandCapability(), entry.getValue().intValue())));
            LogUtil.j("HwAccessoryLife", "putDeviceCapabilityName : ", Boolean.valueOf(d(deviceInfo, "WEAR" + key, "wearCapabilityService", map)));
        }
    }

    private void h(DeviceInfo deviceInfo) {
        LogUtil.a("HwAccessoryLife", "capability : ", deviceInfo.getExpandCapability());
        String multiLinkBleMac = deviceInfo.getMultiLinkBleMac();
        if (TextUtils.isEmpty(multiLinkBleMac)) {
            LogUtil.j("HwAccessoryLife", "wrong , ble mac is wrong, please check 5.1.7 command");
            return;
        }
        String strF = f(multiLinkBleMac);
        HashMap map = new HashMap(16);
        map.put("address", strF);
        LogUtil.j("HwAccessoryLife", "putDeviceBleLast : ", Boolean.valueOf(d(deviceInfo, "bt", "bt", map)));
    }

    private boolean b(DeviceInfo deviceInfo, String str, String str2, Map<String, Object> map, int i) {
        if ((i & 1) == 1) {
            a(deviceInfo, str, str2);
        }
        return e(c(deviceInfo), str, map);
    }

    private String c(DeviceInfo deviceInfo) {
        if (!TextUtils.isEmpty(deviceInfo.getDeviceUdid())) {
            return deviceInfo.getDeviceUdid();
        }
        return j(deviceInfo.getSecurityUuid());
    }

    private int b(String str, int i) {
        return CommonUtil.a(eeq.c(str), i) ? 1 : 0;
    }

    private void j(DeviceInfo deviceInfo) {
        LogUtil.a("HwAccessoryLife", "putManagerNodeProfile start");
        String strD = d(e());
        String strC = c(j(deviceInfo.getSecurityUuid()), "managerNode", "characteristic.managerIdentifierList");
        HashMap map = new HashMap(16);
        if (i(strC)) {
            LogUtil.a("HwAccessoryLife", "putManagerNodeProfile characterValue is empty");
            map.put("characteristic.managerIdentifierList", strD);
        } else if (!strC.contains(strD)) {
            map.put("characteristic.managerIdentifierList", strC + "," + strD);
        } else {
            LogUtil.j("HwAccessoryLife", "cloud Characteristics has already exists.");
        }
        a(deviceInfo, map);
        LogUtil.a("HwAccessoryLife", "putManagerNodeProfile end : ", Boolean.valueOf(d(deviceInfo, "managerNode", "managerNode", map)));
    }

    private void a(DeviceInfo deviceInfo, Map<String, Object> map) {
        LogUtil.a("HwAccessoryLife", "putManagerNodeNew start");
        String strB = b();
        String strC = c(j(deviceInfo.getSecurityUuid()), "managerNode", "managerIdentifierList2");
        if (i(strC)) {
            LogUtil.a("HwAccessoryLife", "putManagerNodeNew characterValue is empty");
            map.put("managerIdentifierList2", strB);
        } else {
            if (!strC.contains(strB)) {
                LogUtil.a("HwAccessoryLife", "putManagerNodeNew characterValue not empty");
                map.put("managerIdentifierList2", strC + "," + strB);
                return;
            }
            LogUtil.j("HwAccessoryLife", "putManagerNodeNew cloud Characteristics has already exists characterValue:", strC);
        }
    }

    private String b() {
        String strK = CommonUtil.k(BaseApplication.getContext());
        if (strK != null && !TextUtils.isEmpty(strK)) {
            String strReplace = strK.replace(":", "");
            StringBuilder sb = new StringBuilder(strReplace.length() / 2);
            for (int i = 1; i < strReplace.length(); i += 2) {
                sb.append(strReplace.charAt(i));
            }
            LogUtil.a("HwAccessoryLife", "getConfusedMac evenDigitsMac ", sb.toString());
            String strD = Sha256.d(sb.toString(), "SHA-256");
            LogUtil.a("HwAccessoryLife", "getConfusedMac address:", CommonUtil.n(strD));
            return strD;
        }
        LogUtil.j("HwAccessoryLife", "getConfusedMac mac is null");
        return "";
    }

    private String d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwAccessoryLife", "checkInvalidSerialNumber number isEmpty");
            return " ";
        }
        if (!"unknown".equals(str) && !Constants.NULL.equals(str)) {
            return str;
        }
        LogUtil.j("HwAccessoryLife", "checkInvalidSerialNumber number is null , number:", str);
        return " ";
    }

    private boolean i(String str) {
        if (!Constants.NULL.equals(str) && !"".equals(str)) {
            return false;
        }
        LogUtil.j("HwAccessoryLife", "isEmptyCharacterValue characterValue is null");
        return true;
    }

    public void e(String str) {
        LogUtil.a("HwAccessoryLife", "removeDeviceToProfile start deviceId:", CommonUtil.n(str));
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwAccessoryLife", "removeDeviceToProfile deviceId is null");
            return;
        }
        c(str);
        a();
        KeyValDbManager.d(BaseApplication.getContext()).b(str, "");
    }

    private void c(String str) {
        String str2;
        LogUtil.a("HwAccessoryLife", "deleteDeviceById start");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwAccessoryLife", "deleteDeviceById deviceId is null");
            return;
        }
        ProfileClient clientAgent = ProfileAgent.PROFILE_AGENT.getClientAgent();
        List<DeviceProfile> devices = clientAgent.getDevices(true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (devices == null) {
            LogUtil.j("HwAccessoryLife", "deleteDeviceById deviceProfiles is null");
            return;
        }
        for (DeviceProfile deviceProfile : devices) {
            String id = deviceProfile.getId();
            Map<String, Object> profile = deviceProfile.getProfile();
            if (profile.get("sn") instanceof String) {
                str2 = (String) profile.get("sn");
                LogUtil.a("HwAccessoryLife", "deleteDeviceById serial string:", CommonUtil.n(str2));
            } else {
                str2 = null;
            }
            if (str.equals(id) || (!TextUtils.isEmpty(str2) && str.equals(str2))) {
                a(id);
                this.f42836c = str2;
                if (profile.get("mac") instanceof String) {
                    String str3 = (String) profile.get("mac");
                    this.f42835b = str3;
                    LogUtil.a("HwAccessoryLife", "deleteDeviceById mac:", str3);
                }
                if (profile.get("prodId") instanceof String) {
                    String str4 = (String) profile.get("prodId");
                    this.d = str4;
                    LogUtil.a("HwAccessoryLife", "deleteDeviceById prodId:", str4);
                }
                LogUtil.a("HwAccessoryLife", "deleteDeviceById deleteDevice : ", Boolean.valueOf(clientAgent.deleteDevice(id)));
                return;
            }
        }
    }

    private void a() {
        String str;
        String str2;
        String str3;
        LogUtil.a("HwAccessoryLife", "deleteErrorDeviceInfo mDeleteDeviceMac:", this.f42835b, "; mDeleteDeviceSn:", CommonUtil.n(this.f42836c), "; mDeleteDeviceProdId:", this.d);
        ProfileClient clientAgent = ProfileAgent.PROFILE_AGENT.getClientAgent();
        List<DeviceProfile> devices = clientAgent.getDevices(true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (devices == null) {
            LogUtil.j("HwAccessoryLife", "deleteErrorDeviceInfo deviceProfiles is null");
            return;
        }
        for (DeviceProfile deviceProfile : devices) {
            String id = deviceProfile.getId();
            Map<String, Object> profile = deviceProfile.getProfile();
            String str4 = null;
            if (profile.get("sn") instanceof String) {
                str = (String) profile.get("sn");
                LogUtil.a("HwAccessoryLife", "deleteErrorDeviceInfo serial string:", CommonUtil.n(str));
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str) && (str3 = this.f42836c) != null && str3.equals(str)) {
                a(id);
                LogUtil.a("HwAccessoryLife", "deleteErrorDeviceInfo deleteDevice by sn: ", Boolean.valueOf(clientAgent.deleteDevice(id)));
            } else {
                if (profile.get("prodId") instanceof String) {
                    str4 = (String) profile.get("prodId");
                    LogUtil.a("HwAccessoryLife", "deleteErrorDeviceInfo prodId:", str4);
                }
                if (str4 == null || !TextUtils.equals(this.d, str4)) {
                    LogUtil.a("HwAccessoryLife", "deleteErrorDeviceInfo prodId not equal");
                } else if (str != null && !TextUtils.isEmpty(str) && !str.contains("#ANDROID21")) {
                    String strF = f(str);
                    LogUtil.a("HwAccessoryLife", "deleteErrorDeviceInfo wrongSn: ", strF);
                    if (!TextUtils.isEmpty(strF) && (str2 = this.f42835b) != null && str2.equals(strF)) {
                        a(id);
                        LogUtil.a("HwAccessoryLife", "deleteErrorDeviceInfo deleteDevice by wrong sn: ", Boolean.valueOf(clientAgent.deleteDevice(id)));
                    }
                }
            }
        }
        this.f42836c = "";
        this.f42835b = "";
        this.d = "";
    }

    private String c(String str, String str2, String str3) {
        if (!ProfileAgent.PROFILE_AGENT.getConnected()) {
            LogUtil.j("HwAccessoryLife", "getDevices profile has not connect");
            return "";
        }
        ServiceCharacteristicProfile serviceCharacteristics = ProfileAgent.PROFILE_AGENT.getClientAgent().getServiceCharacteristics(str, str2, true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (serviceCharacteristics == null) {
            LogUtil.j("HwAccessoryLife", "serviceCharacteristicProfiles is null");
            return "";
        }
        return String.valueOf(serviceCharacteristics.getProfile().get(str3));
    }

    private boolean a(Map<String, Object> map, DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceName() == null) {
            LogUtil.j("HwAccessoryLife", "setBasicProfileInfo getDeviceName is null");
            return false;
        }
        nas nasVarB = b(deviceInfo);
        if (nasVarB == null) {
            LogUtil.j("HwAccessoryLife", "setBasicProfileInfo unknown device");
            return false;
        }
        LogUtil.a("HwAccessoryLife", "setBasicProfileInfo deviceModeInfo:", nasVarB.toString());
        map.put("model", nasVarB.b());
        map.put("devType", nasVarB.c());
        map.put(ProfileRequestConstants.MANU, "001");
        map.put("prodId", nasVarB.a());
        map.put(ProfileRequestConstants.HIV, "1");
        map.put("deviceName", deviceInfo.getDeviceName());
        if (!TextUtils.isEmpty(deviceInfo.getDeviceUdid())) {
            LogUtil.a("HwAccessoryLife", "getDeviceUdid is not null");
            map.put("udid", deviceInfo.getDeviceUdid());
        } else {
            map.put("udid", j(deviceInfo.getSecurityUuid()));
        }
        map.put("sn", j(deviceInfo.getSecurityUuid()));
        String strF = f(deviceInfo.getDeviceIdentify());
        if (TextUtils.isEmpty(strF)) {
            LogUtil.a("HwAccessoryLife", "setBasicProfileInfo() subMac is null");
            return false;
        }
        map.put("mac", strF);
        map.put(ProfileRequestConstants.PROT_TYPE, 4);
        return true;
    }

    private String f(String str) {
        String strReplaceAll = str.replaceAll(":", "");
        int length = strReplaceAll.length();
        if (length > 3) {
            return strReplaceAll.substring(length - 3, length);
        }
        return null;
    }

    private nas b(DeviceInfo deviceInfo) {
        int productType = deviceInfo.getProductType();
        LogUtil.a("HwAccessoryLife", "getDeviceModeInfo () type:", Integer.valueOf(productType), " deviceNameKey:", deviceInfo.getDeviceName());
        return a(deviceInfo);
    }

    private nas a(DeviceInfo deviceInfo) {
        String hiLinkDeviceId = deviceInfo.getHiLinkDeviceId();
        String deviceModel = deviceInfo.getDeviceModel();
        if (TextUtils.isEmpty(hiLinkDeviceId) || TextUtils.isEmpty(deviceModel)) {
            LogUtil.j("HwAccessoryLife", "getModelInfoFromDeviceInfo() not get DeviceId and DeviceMode");
            return null;
        }
        if (hiLinkDeviceId.length() != 4) {
            LogUtil.j("HwAccessoryLife", "getModelInfoFromDeviceInfo() hiLinkDeviceId is Illegal");
            return null;
        }
        String strD = d(deviceInfo);
        LogUtil.a("HwAccessoryLife", "getModelInfoFromDeviceInfo() not get DeviceId and curDeviceType: ", strD, hiLinkDeviceId, deviceModel);
        return new nas(deviceModel, hiLinkDeviceId, strD);
    }

    private void b(DeviceInfo deviceInfo, Map<String, Object> map) {
        if (!ProfileAgent.PROFILE_AGENT.getConnected()) {
            LogUtil.j("HwAccessoryLife", "putDeviceProfile profile not connected");
            return;
        }
        boolean zPutDevice = true;
        if (a(c(deviceInfo), map)) {
            LogUtil.a("HwAccessoryLife", "new profile, need put device.");
            DeviceProfile deviceProfile = new DeviceProfile();
            deviceProfile.setId(c(deviceInfo));
            deviceProfile.setIsNeedCloud(true);
            if (map.get("devType") instanceof String) {
                deviceProfile.setType((String) map.get("devType"));
            }
            deviceProfile.addEntities(map);
            zPutDevice = ProfileAgent.PROFILE_AGENT.getClientAgent().putDevice(deviceProfile);
        } else {
            LogUtil.j("HwAccessoryLife", "profile put device age. no need put age.");
        }
        LogUtil.a("HwAccessoryLife", "putDevice is success: ", Boolean.valueOf(zPutDevice));
        if (zPutDevice) {
            f(deviceInfo);
            i(deviceInfo);
            h(deviceInfo);
            g(deviceInfo);
            b(c(deviceInfo));
            return;
        }
        LogUtil.j("HwAccessoryLife", "putDeviceProfile error");
    }

    private boolean a(String str, Map<String, Object> map) {
        List<DeviceProfile> devicesById = ProfileAgent.PROFILE_AGENT.getClientAgent().getDevicesById(str, false, Collections.singletonList(ProfileClient.DEFAULT_TRUST_DOMAIN));
        if (devicesById == null || devicesById.isEmpty()) {
            LogUtil.j("HwAccessoryLife", "new device profile, need put device.");
            return true;
        }
        for (DeviceProfile deviceProfile : devicesById) {
            LogUtil.d("HwAccessoryLife", "test ", str, " deviceProfile : ", devicesById.toString());
            if (!d(map, deviceProfile.getProfile())) {
                return true;
            }
        }
        return false;
    }

    private boolean d(Map<String, Object> map, Map<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!entry.getValue().equals(map2.get(key)) && !ProfileRequestConstants.HIV.equalsIgnoreCase(key)) {
                return false;
            }
        }
        return true;
    }

    private void a(DeviceInfo deviceInfo, String str, String str2) {
        if (!ProfileAgent.PROFILE_AGENT.getConnected()) {
            LogUtil.j("HwAccessoryLife", "putDeviceService profile not connected");
            return;
        }
        String strC = c(deviceInfo);
        ServiceProfile serviceProfile = new ServiceProfile();
        serviceProfile.setDeviceId(strC);
        serviceProfile.setIsNeedCloud(true);
        serviceProfile.setId(str);
        serviceProfile.setType(str2);
        HashMap map = new HashMap(10);
        map.put("serviceId", str);
        map.put("type", str2);
        serviceProfile.addEntities(map);
        LogUtil.a("HwAccessoryLife", "putDeviceService is ", Boolean.valueOf(ProfileAgent.PROFILE_AGENT.getClientAgent().putServiceOfDevice(strC, serviceProfile)));
    }

    private boolean e(String str, String str2, Map<String, Object> map) {
        if (!ProfileAgent.PROFILE_AGENT.getConnected()) {
            LogUtil.j("HwAccessoryLife", "putServiceCharacteristicAddEntities profile not connected");
            return false;
        }
        ServiceCharacteristicProfile serviceCharacteristicProfile = new ServiceCharacteristicProfile();
        serviceCharacteristicProfile.addEntities(map);
        serviceCharacteristicProfile.addEntityInfo("timestamp", Long.valueOf(System.currentTimeMillis()));
        serviceCharacteristicProfile.setIsNeedCloud(true);
        LogUtil.d("HwAccessoryLife", "putServiceCharacteristicAddEntities serviceCharacteristicProfile ", serviceCharacteristicProfile.toString());
        boolean zPutServiceCharacteristic = ProfileAgent.PROFILE_AGENT.getClientAgent().putServiceCharacteristic(str, str2, serviceCharacteristicProfile);
        LogUtil.a("HwAccessoryLife", "putServiceCharacteristicAddEntities put isSuccess:", Boolean.valueOf(zPutServiceCharacteristic));
        return zPutServiceCharacteristic;
    }

    private String e() {
        String androidId = FoundationCommonUtil.getAndroidId(BaseApplication.getContext());
        if (!TextUtils.isEmpty(androidId)) {
            return androidId.toUpperCase(Locale.ENGLISH);
        }
        LogUtil.e("HwAccessoryLife", "androidId is isEmpty");
        return androidId;
    }

    private void a(String str) {
        ProfileClient clientAgent = ProfileAgent.PROFILE_AGENT.getClientAgent();
        List<ServiceProfile> servicesOfDevice = clientAgent.getServicesOfDevice(str, true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (servicesOfDevice == null || servicesOfDevice.isEmpty()) {
            LogUtil.j("HwAccessoryLife", "deleteAllServices deleteDevice success:", Boolean.valueOf(clientAgent.deleteDevice(str)));
            return;
        }
        Iterator<ServiceProfile> it = servicesOfDevice.iterator();
        while (it.hasNext()) {
            String id = it.next().getId();
            LogUtil.a("HwAccessoryLife", "deleteAllServices serviceId:", id);
            b(str, id);
            LogUtil.a("HwAccessoryLife", "deleteAllServices deleteDevice success:", Boolean.valueOf(clientAgent.deleteServiceOfDevice(str, id)));
        }
    }

    private void b(String str, String str2) {
        ProfileClient clientAgent = ProfileAgent.PROFILE_AGENT.getClientAgent();
        ServiceCharacteristicProfile serviceCharacteristics = clientAgent.getServiceCharacteristics(str, str2, true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (serviceCharacteristics == null) {
            LogUtil.j("HwAccessoryLife", "characteristicProfile is empty");
            return;
        }
        Map<String, Object> profile = serviceCharacteristics.getProfile();
        if (profile.isEmpty()) {
            LogUtil.j("HwAccessoryLife", "deleteAllCharacter profile map is empty");
            return;
        }
        Iterator<Map.Entry<String, Object>> it = profile.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            LogUtil.d("HwAccessoryLife", " deleteAllCharacter character key:", key);
            LogUtil.d("HwAccessoryLife", " deleteAllCharacter is success:", Boolean.valueOf(clientAgent.deleteServiceCharacteristic(str, str2, key)));
        }
    }

    private String j(String str) {
        return str + "#ANDROID21";
    }

    public void b(String str) {
        String strG = g(str);
        LogUtil.a("HwAccessoryLife", "putWiseDeviceId wiseDeviceId:", CommonUtil.n(strG));
        KeyValDbManager.d(BaseApplication.getContext()).b(str, strG);
    }

    private String g(String str) {
        List<DeviceProfile> devices = ProfileAgent.PROFILE_AGENT.getClientAgent().getDevices(true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (devices == null) {
            LogUtil.j("HwAccessoryLife", "getWiseDeviceIdByDeviceId deviceProfiles is null");
            return "";
        }
        for (DeviceProfile deviceProfile : devices) {
            if (str.equalsIgnoreCase(deviceProfile.getId())) {
                Map<String, Object> profile = deviceProfile.getProfile();
                if (!(profile.get("mac") instanceof String)) {
                    LogUtil.j("HwAccessoryLife", "getWiseDeviceIdByDeviceId mac not instanceof String");
                } else if (TextUtils.isEmpty((String) profile.get("mac"))) {
                    LogUtil.j("HwAccessoryLife", "getWiseDeviceIdByDeviceId mac is empty");
                } else if (!(profile.get("wiseDeviceId") instanceof String)) {
                    LogUtil.j("HwAccessoryLife", "getWiseDeviceIdByDeviceId wiseDeviceId not instanceof String");
                } else {
                    String str2 = (String) profile.get("wiseDeviceId");
                    if (TextUtils.isEmpty(str2) || Constants.NULL.equals(str2)) {
                        LogUtil.j("HwAccessoryLife", "getWiseDeviceIdByDeviceId wiseDeviceId is empty");
                    } else {
                        LogUtil.a("HwAccessoryLife", "getWiseDeviceIdByDeviceId wiseDeviceId not empty");
                        return str2;
                    }
                }
            }
        }
        return "";
    }

    public String d(DeviceInfo deviceInfo) {
        String strA = mmx.a(deviceInfo.getProductType());
        LogUtil.j("HwAccessoryLife", "getModelInfoFromDeviceInfo uuid：", strA);
        mmt mmtVarA = mmx.a(strA);
        if (mmtVarA != null && mmtVarA.d() != -1) {
            LogUtil.j("HwAccessoryLife", "getModelInfoFromDeviceInfo DeviceCategory():", Integer.valueOf(mmtVarA.d()));
            if (mmtVarA.d() == 1) {
                return "06E";
            }
            return mmtVarA.d() == 6 ? "A12" : "06D";
        }
        LogUtil.j("HwAccessoryLife", "getModelInfoFromDeviceInfo deviceInfoNew is null");
        return mmx.g(deviceInfo.getProductType()) ? "06E" : "06D";
    }
}
