package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import com.huawei.health.device.api.DeviceDataBaseHelperApi;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.ecologydevice.manager.ProfileManager;
import com.huawei.hiai.awareness.client.AwarenessRequest;
import com.huawei.hms.network.embedded.w9;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdataaccessmodel.utils.StorageDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.profile.client.profile.ProfileClient;
import com.huawei.profile.profile.DeviceProfile;
import com.huawei.profile.profile.ServiceCharacteristicProfile;
import com.huawei.profile.profile.ServiceProfile;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.Services;
import health.compact.a.StorageResult;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class eng {
    public boolean d(enf enfVar, String str) {
        if (enfVar == null || enfVar.a() == null || enfVar.a().getProfile() == null) {
            ReleaseLogUtil.e("R_smartlife_IntellLife", "cloudValidInformation is invalid");
            return false;
        }
        DeviceProfile deviceProfileA = enfVar.a();
        Object obj = deviceProfileA.getProfile().get("prodId");
        boolean zIsHuaweiOrHonourScaleProdId = obj instanceof String ? ((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isHuaweiOrHonourScaleProdId((String) obj) : false;
        Object obj2 = deviceProfileA.getProfile().get("mac");
        if (zIsHuaweiOrHonourScaleProdId) {
            if (!(obj2 instanceof String)) {
                ReleaseLogUtil.e("R_smartlife_IntellLife", "mac address is invalid");
            } else {
                deviceProfileA.getProfile().put("mac", a((String) obj2));
            }
        }
        Map<String, Object> mapB = enfVar.b();
        if (!a(deviceProfileA)) {
            ReleaseLogUtil.e("R_smartlife_IntellLife", "fail to put device Profile");
            return false;
        }
        if (!a(enm.c(deviceProfileA, w9.h, enm.c(w9.h)), mapB)) {
            ReleaseLogUtil.e("R_smartlife_IntellLife", "fail to put device Profile");
            return false;
        }
        Object obj3 = deviceProfileA.getProfile().get("udid");
        String str2 = obj3 instanceof String ? (String) obj3 : "";
        if (zIsHuaweiOrHonourScaleProdId) {
            LogUtil.a("smartlife_IntellLife", "put device prodId: ", obj);
            j(str2);
            if (obj2 instanceof String) {
                str2 = (String) obj2;
            }
        }
        ReleaseLogUtil.d("R_smartlife_IntellLife", "deviceId or macAddress: ", CommonUtil.n(str2));
        boolean zD = d(enm.c(deviceProfileA, "managerNode", enm.c("managerNode")), enfVar.e(), str);
        if (zD) {
            StorageDataCallback storageDataCallback = new StorageDataCallback() { // from class: enl
                @Override // com.huawei.hwdataaccessmodel.utils.StorageDataCallback
                public final void onProcessed(StorageResult storageResult) {
                    LogUtil.a("smartlife_IntellLife", "set device name to cp, result = ", storageResult == null ? Constants.NULL : storageResult.c());
                }
            };
            String strE = nio.e(str2);
            String str3 = (String) deviceProfileA.getProfile().get("deviceName");
            ReleaseLogUtil.d("R_smartlife_IntellLife", "deviceName: ", str3);
            KeyValDbManager.d(BaseApplication.getContext()).c(strE, str3, storageDataCallback);
        }
        return zD;
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("smartlife_IntellLife", "empty mac");
            return "";
        }
        String strReplaceAll = str.replaceAll(":", "");
        int length = strReplaceAll.length();
        return length > 3 ? strReplaceAll.substring(length - 3, length) : strReplaceAll;
    }

    private void j(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("smartlife_IntellLife", "deviceId is empty");
            return;
        }
        String strD = enm.d(str);
        LogUtil.a("smartlife_IntellLife", "get wiseDeviceId, result = ", strD);
        ContentValues contentValues = new ContentValues();
        contentValues.put("mDeviceId", strD);
        if (((DeviceDataBaseHelperApi) Services.b("PluginDevice", DeviceDataBaseHelperApi.class)).update(contentValues, "uniqueId = ? or sn = ?", new String[]{str, str}) <= 0) {
            LogUtil.j("smartlife_IntellLife", "fail to udpate wisedeviceid");
        }
    }

    public boolean e(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("smartlife_IntellLife", "addPeerConnectStatus:device id is empty!!");
            return false;
        }
        List<DeviceProfile> devices = ProfileManager.INSTANCE.getDevices(true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (devices == null) {
            LogUtil.j("smartlife_IntellLife", "addPeerConnectStatus:deviceCloudProfiles is empty!!");
            return false;
        }
        for (DeviceProfile deviceProfile : devices) {
            if (deviceProfile.getId().equals(str)) {
                HashMap map = new HashMap(16);
                map.put("peerConnectStatus", Integer.valueOf(i));
                return d(deviceProfile, BleConstants.DEV_INFO, BleConstants.DEV_INFO, map);
            }
        }
        LogUtil.j("smartlife_IntellLife", "addPeerConnectStatus:device id not found in cloud.");
        return false;
    }

    private boolean d(DeviceProfile deviceProfile, String str, String str2, Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            LogUtil.j("smartlife_IntellLife", "characterEntity is empty");
            return false;
        }
        String id = deviceProfile.getId();
        if (a(str, id)) {
            LogUtil.j("smartlife_IntellLife", "serviceId is not exits, put serviceId and character.");
            return c(deviceProfile, str, str2, map, 1);
        }
        ServiceCharacteristicProfile serviceCharacteristics = ProfileManager.INSTANCE.getServiceCharacteristics(id, str, true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (serviceCharacteristics == null) {
            LogUtil.j("smartlife_IntellLife", "isNewParamServiceIdSuccess serviceProfile is null.");
            return c(deviceProfile, str, str2, map, 1);
        }
        Map<String, Object> profile = serviceCharacteristics.getProfile();
        if (b(profile)) {
            LogUtil.a("smartlife_IntellLife", "new device, put service.");
            return c(deviceProfile, str, str2, map, 1);
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (!entry.getValue().equals(profile.get(entry.getKey()))) {
                return c(deviceProfile, str, str2, map, 2);
            }
        }
        return true;
    }

    private boolean c(DeviceProfile deviceProfile, String str, String str2, Map<String, Object> map, int i) {
        if ((i & 1) == 1) {
            d(enm.c(deviceProfile, str, str2));
        }
        return c(deviceProfile.getId(), str, enm.e(map));
    }

    private boolean a(String str, String str2) {
        List<ServiceProfile> servicesOfDevice = ProfileManager.INSTANCE.getServicesOfDevice(str2, false, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (servicesOfDevice == null || servicesOfDevice.isEmpty()) {
            LogUtil.j("smartlife_IntellLife", "service id not exit, put all.");
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

    private boolean b(Map<String, Object> map) {
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

    public String b(String str) {
        List<DeviceProfile> devices = ProfileManager.INSTANCE.getDevices(true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (devices == null) {
            LogUtil.j("smartlife_IntellLife", "deleteDeviceById deviceProfiles is null");
            return "";
        }
        for (DeviceProfile deviceProfile : devices) {
            if (str.equalsIgnoreCase(deviceProfile.getId())) {
                if (String.valueOf(deviceProfile.getProfile().get("wiseDeviceId")).equals(Constants.NULL)) {
                    return "";
                }
                return String.valueOf(deviceProfile.getProfile().get("wiseDeviceId"));
            }
        }
        return "";
    }

    public Map<String, String> c(List<String> list) {
        List<DeviceProfile> devices = ProfileManager.INSTANCE.getDevices(true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (devices == null) {
            LogUtil.j("smartlife_IntellLife", "deleteDeviceById deviceProfiles is null");
            return Collections.EMPTY_MAP;
        }
        LogUtil.a("smartlife_IntellLife", "enter intellife");
        HashMap map = new HashMap();
        for (String str : list) {
            for (DeviceProfile deviceProfile : devices) {
                if (str.equalsIgnoreCase(deviceProfile.getId())) {
                    if (deviceProfile.getProfile().get("wiseDeviceId") != null) {
                        map.put(str, String.valueOf(deviceProfile.getProfile().get("wiseDeviceId")));
                        if (KeyValDbManager.d(BaseApplication.getContext()).c(nio.e(str)) != null) {
                            break;
                        }
                        KeyValDbManager.d(BaseApplication.getContext()).c(deviceProfile.getProfile().get("udid") instanceof String ? nio.e((String) deviceProfile.getProfile().get("udid")) : null, deviceProfile.getProfile().get("deviceName") instanceof String ? (String) deviceProfile.getProfile().get("deviceName") : null, new StorageDataCallback() { // from class: enn
                            @Override // com.huawei.hwdataaccessmodel.utils.StorageDataCallback
                            public final void onProcessed(StorageResult storageResult) {
                                LogUtil.a("smartlife_IntellLife", "set device name to cp, result = ", storageResult == null ? Constants.NULL : storageResult.c());
                            }
                        });
                        break;
                    }
                    break;
                }
            }
        }
        return map;
    }

    public void c(String str, String str2, String str3) {
        LogUtil.a("smartlife_IntellLife", "removeDeviceToProfile start deviceId , type ", str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("smartlife_IntellLife", "removeDeviceToProfile illegal arguments");
            return;
        }
        String strC = c(str);
        LogUtil.a("smartlife_IntellLife", "removeDeviceToProfile currentType:", strC);
        if (g(strC) && !str2.equals(strC)) {
            LogUtil.j("smartlife_IntellLife", "removeDeviceToProfile current device Type is not target type");
            return;
        }
        e(str, str3);
        String strD = d(str, "managerNode", "characteristic.managerIdentifierList2");
        if (!enm.e(strD) || AwarenessRequest.MessageType.DISCONNECT.equals(strD)) {
            return;
        }
        d(str);
    }

    private boolean g(String str) {
        return (TextUtils.isEmpty(str) || Constants.NULL.equalsIgnoreCase(str)) ? false : true;
    }

    private void a(final Map<String, enf> map, final Map<String, DeviceProfile> map2, final List<String> list) {
        ecu.d().getDevicesFromCloud("smartlife_IntellLife", new IBaseResponseCallback() { // from class: enh
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f33229c.c(map2, list, map, i, obj);
            }
        });
    }

    /* synthetic */ void c(Map map, List list, Map map2, int i, Object obj) {
        if (i == 0 && njy.b(obj, DeviceProfile.class)) {
            if (obj instanceof List) {
                enm.b((Map<String, DeviceProfile>) map, (List<DeviceProfile>) obj, (List<String>) list);
            }
        } else {
            LogUtil.j("smartlife_IntellLife", "getCloudDeviceList errorCode:", Integer.valueOf(i));
        }
        String strB = enm.b();
        e(map2, map, strB);
        b(map, map2, strB);
    }

    private boolean a(DeviceProfile deviceProfile) {
        if (deviceProfile == null) {
            LogUtil.j("smartlife_IntellLife", "putDeviceProfile profile is null");
            return false;
        }
        boolean zPutDevice = ProfileManager.INSTANCE.putDevice(deviceProfile);
        LogUtil.a("smartlife_IntellLife", "isPutDeviceSuccess=", Boolean.valueOf(zPutDevice));
        return zPutDevice;
    }

    private boolean d(ServiceProfile serviceProfile) {
        if (enm.e(serviceProfile)) {
            return ProfileManager.INSTANCE.putServiceOfDevice(serviceProfile.getDeviceId(), serviceProfile);
        }
        return false;
    }

    private boolean c(String str, String str2, ServiceCharacteristicProfile serviceCharacteristicProfile) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("smartlife_IntellLife", "putServiceCharacteristic deviceId or serviceId is null");
            return false;
        }
        boolean zPutServiceCharacteristic = ProfileManager.INSTANCE.putServiceCharacteristic(str, str2, serviceCharacteristicProfile);
        LogUtil.a("smartlife_IntellLife", "isSuccess=", Boolean.valueOf(zPutServiceCharacteristic));
        return zPutServiceCharacteristic;
    }

    private boolean a(ServiceProfile serviceProfile, Map<String, Object> map) {
        if (d(serviceProfile)) {
            return c(serviceProfile.getDeviceId(), w9.h, enm.e(map));
        }
        LogUtil.j("smartlife_IntellLife", "putConnectionService fail");
        return false;
    }

    private boolean d(ServiceProfile serviceProfile, Map<String, Object> map, String str) {
        if (d(serviceProfile)) {
            a(serviceProfile.getDeviceId(), map, str);
            return true;
        }
        LogUtil.j("smartlife_IntellLife", "put manageNode service fail");
        return false;
    }

    public void e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("smartlife_IntellLife", "removeDeviceToProfile deviceId is null");
            return;
        }
        ServiceCharacteristicProfile serviceCharacteristics = ProfileManager.INSTANCE.getServiceCharacteristics(str, "managerNode", true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (serviceCharacteristics == null) {
            LogUtil.j("smartlife_IntellLife", "removeServiceCharacterValue characteristicProfiles is null");
            return;
        }
        String strA = enm.a(enm.a());
        String strD = d(str, "managerNode", "characteristic.managerIdentifierList");
        if (AwarenessRequest.MessageType.DISCONNECT.equals(strD)) {
            LogUtil.e("smartlife_IntellLife", "removeServiceCharacterValue phoneSerialNumberList profile disconnect!");
            return;
        }
        String strE = enm.e(strD, strA);
        String strD2 = d(str, "managerNode", "characteristic.managerIdentifierList2");
        if (AwarenessRequest.MessageType.DISCONNECT.equals(strD2)) {
            LogUtil.e("smartlife_IntellLife", "removeServiceCharacterValue phoneMacAddressList profile disconnect!");
            return;
        }
        String strE2 = enm.e(strD2, str2);
        if (strD.equalsIgnoreCase(strE) && strD2.equalsIgnoreCase(strE2)) {
            LogUtil.j("smartlife_IntellLife", "removeServiceCharacterValue do nothing");
            return;
        }
        Map<String, Object> profile = serviceCharacteristics.getProfile();
        profile.put("characteristic.managerIdentifierList", strE);
        profile.put("characteristic.managerIdentifierList2", strE2);
        LogUtil.d("smartlife_IntellLife", "removeServiceCharacterValue characteristics ", profile.toString());
        c(str, "managerNode", enm.e(profile));
    }

    public void d(Map<String, enf> map, List<String> list) {
        a(map, new HashMap(10), list);
    }

    private void b(Map<String, DeviceProfile> map, Map<String, enf> map2, String str) {
        Iterator<Map.Entry<String, DeviceProfile>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (!"local".equals(c(key))) {
                LogUtil.j("smartlife_IntellLife", "checkCloudDevices device is not local device");
            } else if (map2.get(key) == null) {
                c(key, "local", str);
            }
        }
    }

    private void e(Map<String, enf> map, Map<String, DeviceProfile> map2, String str) {
        for (Map.Entry<String, enf> entry : map.entrySet()) {
            String key = entry.getKey();
            enf value = entry.getValue();
            Map<String, Object> mapE = value.e();
            if (map2.get(key) != null) {
                a(entry, mapE, str);
            } else {
                a(value, mapE, str);
            }
        }
    }

    private void a(Map.Entry<String, enf> entry, Map<String, Object> map, String str) {
        Object obj;
        String key = entry.getKey();
        enf value = entry.getValue();
        DeviceProfile deviceProfileA = value.a();
        LogUtil.a("smartlife_IntellLife", "localDevice exist in cloud");
        if (!d(key, "managerNode")) {
            d(enm.c(deviceProfileA, "managerNode", enm.c("managerNode")), map, str);
        }
        if (map == null || map.get("type") == "cloud") {
            if (map == null) {
                obj = Constants.NULL;
            } else {
                obj = map.get("type");
            }
            LogUtil.j("smartlife_IntellLife", "checkLocalDevices: local device in cloud , but local deviceInfo type is ", obj);
            return;
        }
        if (deviceProfileA.getProfile().get("model") == null) {
            LogUtil.j("smartlife_IntellLife", "checkLocalDevices: not Matching device from modeList");
        }
        if (value.a().getProfile().get("udid") instanceof String) {
            a((String) value.a().getProfile().get("udid"), value.e(), str);
        }
    }

    private void a(enf enfVar, Map<String, Object> map, String str) {
        if (map.get("type") == "local") {
            LogUtil.d("smartlife_IntellLife", "localDevice not exist in cloud, add advice");
            d(enfVar, str);
        } else {
            LogUtil.j("smartlife_IntellLife", " local Device is not bluetooth device");
        }
    }

    private boolean d(String str, String str2) {
        LogUtil.a("smartlife_IntellLife", "checkDeviceServiceProfileIfExist ");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("smartlife_IntellLife", "checkDeviceServiceProfileIfExist illegal arguments!");
            return false;
        }
        List<ServiceProfile> servicesOfDevice = ProfileManager.INSTANCE.getServicesOfDevice(str, true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (njy.e(servicesOfDevice)) {
            LogUtil.j("smartlife_IntellLife", "checkDeviceServiceProfileIfExist profileList is empty");
            return false;
        }
        for (ServiceProfile serviceProfile : servicesOfDevice) {
            LogUtil.d("smartlife_IntellLife", "checkDeviceServiceProfileIfExist serviceProfile id", serviceProfile.getId());
            if (str2.equals(serviceProfile.getId())) {
                return true;
            }
        }
        return false;
    }

    private void a(String str, Map<String, Object> map, String str2) {
        LogUtil.a("smartlife_IntellLife", "putManageNodeCharacteristics. ");
        String strA = enm.a(enm.a());
        String strD = d(str, "managerNode", "characteristic.managerIdentifierList");
        String strD2 = d(str, "managerNode", "characteristic.managerIdentifierList2");
        if (AwarenessRequest.MessageType.DISCONNECT.equals(strD) || AwarenessRequest.MessageType.DISCONNECT.equals(strD2)) {
            LogUtil.e("smartlife_IntellLife", "putManageNodeCharacteristics profile disconnect!");
            return;
        }
        String strC = enm.c(strD, strA);
        String strC2 = enm.c(strD2, str2);
        if (strC == null) {
            LogUtil.j("smartlife_IntellLife", " putManageNodeCharacteristics serialNumberListNew is null");
            strC = "";
        }
        if (strC2 == null) {
            LogUtil.j("smartlife_IntellLife", " putManageNodeCharacteristics phoneMacAddressListNew is null");
        } else {
            if (strC.equalsIgnoreCase(strD) && strC2.equalsIgnoreCase(strD2)) {
                return;
            }
            LogUtil.a("smartlife_IntellLife", " update phoneSerialNumberListNew or phoneMacAddressListNew");
            c(str, "managerNode", enm.e(map, new String[]{strC, strC2}));
        }
    }

    private void d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("smartlife_IntellLife", "deleteDeviceById, deviceId is null");
            return;
        }
        List<DeviceProfile> devices = ProfileManager.INSTANCE.getDevices(true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (devices == null) {
            LogUtil.j("smartlife_IntellLife", "deleteDeviceById deviceProfiles is null");
            return;
        }
        Iterator<DeviceProfile> it = devices.iterator();
        while (it.hasNext()) {
            String id = it.next().getId();
            if (str.equalsIgnoreCase(id)) {
                e(id);
                LogUtil.a("smartlife_IntellLife", "deleteDeviceById deleteDevice : ", Boolean.valueOf(ProfileManager.INSTANCE.deleteDevice(id)));
                return;
            }
        }
    }

    private void e(String str) {
        List<ServiceProfile> servicesOfDevice = ProfileManager.INSTANCE.getServicesOfDevice(str, true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (servicesOfDevice == null || servicesOfDevice.isEmpty()) {
            LogUtil.j("smartlife_IntellLife", "deleteAllServices deleteDevice success:", Boolean.valueOf(ProfileManager.INSTANCE.deleteDevice(str)));
            return;
        }
        Iterator<ServiceProfile> it = servicesOfDevice.iterator();
        while (it.hasNext()) {
            String id = it.next().getId();
            LogUtil.d("smartlife_IntellLife", " deleteAllServices serviceId:", id);
            b(str, id);
            LogUtil.d("smartlife_IntellLife", "deleteAllServices deleteDevice success:", Boolean.valueOf(ProfileManager.INSTANCE.deleteServiceOfDevice(str, id)));
        }
    }

    private void b(String str, String str2) {
        ServiceCharacteristicProfile serviceCharacteristics = ProfileManager.INSTANCE.getServiceCharacteristics(str, str2, true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (serviceCharacteristics == null) {
            LogUtil.j("smartlife_IntellLife", "characteristicProfile is empty");
            return;
        }
        Map<String, Object> profile = serviceCharacteristics.getProfile();
        if (profile == null || profile.isEmpty()) {
            LogUtil.j("smartlife_IntellLife", "deleteAllCharacteristic profile map is empty");
            return;
        }
        Iterator<Map.Entry<String, Object>> it = profile.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            LogUtil.d("smartlife_IntellLife", " deleteAllCharacteristic character key:", key);
            LogUtil.d("smartlife_IntellLife", " deleteAllCharacteristic is success:", Boolean.valueOf(ProfileManager.INSTANCE.deleteServiceCharacteristic(str, str2, key)));
        }
    }

    private String c(String str) {
        return d(str, "managerNode", "type");
    }

    private String d(String str, String str2, String str3) {
        LogUtil.d("smartlife_IntellLife", "getServiceCharacteristics device id, ", str);
        if (njy.e(ProfileManager.INSTANCE.getServicesOfDevice(str, true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN)))) {
            LogUtil.j("smartlife_IntellLife", "getServiceCharacteristics has not service");
        }
        ServiceCharacteristicProfile serviceCharacteristics = ProfileManager.INSTANCE.getServiceCharacteristics(str, str2, true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (serviceCharacteristics == null) {
            LogUtil.j("smartlife_IntellLife", "serviceCharacteristicProfiles is null");
            return "";
        }
        String strValueOf = String.valueOf(serviceCharacteristics.getProfile().get(str3));
        LogUtil.d("smartlife_IntellLife", "getServiceCharacteristics serviceId ", str2, " key ", str3, " value ", strValueOf);
        return strValueOf;
    }
}
