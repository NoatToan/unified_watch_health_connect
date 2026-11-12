package defpackage;

import android.content.ContentValues;
import android.text.TextUtils;
import com.huawei.health.device.manager.ProfileManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hiai.awareness.client.AwarenessRequest;
import com.huawei.hms.network.embedded.w9;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdataaccessmodel.utils.StorageDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.profile.client.profile.ProfileClient;
import com.huawei.profile.profile.DeviceProfile;
import com.huawei.profile.profile.ServiceCharacteristicProfile;
import com.huawei.profile.profile.ServiceProfile;
import health.compact.a.KeyValDbManager;
import health.compact.a.StorageResult;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class eag {
    public boolean c(DeviceInfo deviceInfo) {
        LogUtil.a("Weight_IntellLife", "add device to profile start");
        if (!a(eak.e(deviceInfo))) {
            ReleaseLogUtil.e("R_Weight_IntellLife", "fail to put device Profile");
            return false;
        }
        b(deviceInfo);
        if (!d(deviceInfo)) {
            ReleaseLogUtil.e("R_Weight_IntellLife", "fail to put device Profile");
            return false;
        }
        boolean zE = e(deviceInfo);
        if (zE) {
            StorageDataCallback storageDataCallback = new StorageDataCallback() { // from class: eag.2
                @Override // com.huawei.hwdataaccessmodel.utils.StorageDataCallback
                public void onProcessed(StorageResult storageResult) {
                    LogUtil.a("Weight_IntellLife", "set device name to cp, reseult = ", storageResult == null ? Constants.NULL : storageResult.c());
                }
            };
            String strE = nio.e(deviceInfo.getDeviceIdentify());
            LogUtil.a("Weight_IntellLife", "add device success, save device name to cp unique id ", strE);
            ReleaseLogUtil.d("R_Weight_IntellLife", "deviceName ", deviceInfo.getDeviceName());
            KeyValDbManager.d(BaseApplication.getContext()).c(strE, deviceInfo.getDeviceName(), storageDataCallback);
        }
        return zE;
    }

    private void b(DeviceInfo deviceInfo) {
        String strD = enm.d(deviceInfo.getUuid());
        LogUtil.a("Weight_IntellLife", "enter get wiseDeviceId, result = ", dyg.b(strD));
        ContentValues contentValues = new ContentValues();
        contentValues.put("mDeviceId", strD);
        if (dmk.d().d("device", contentValues, "uniqueId= ?", new String[]{deviceInfo.getDeviceIdentify()}) == -1) {
            LogUtil.j("Weight_IntellLife", "fail to udpate wisedeviceid");
        }
    }

    public void c(String str, String str2) {
        LogUtil.a("Weight_IntellLife", "removeDeviceToProfile start deviceId , type ", str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("Weight_IntellLife", "removeDeviceToProfile illegal argments");
            return;
        }
        String strD = d(str);
        if (!str2.equals(strD)) {
            LogUtil.j("Weight_IntellLife", "removeDeviceToProfile current device Type is not target type, current type", strD);
            return;
        }
        b(str);
        String strA = a(str, "managerNode", "characteristic.managerIdentifierList2");
        if (!eak.a(strA) || AwarenessRequest.MessageType.DISCONNECT.equals(strA)) {
            return;
        }
        c(str);
    }

    private boolean a(DeviceProfile deviceProfile) {
        if (deviceProfile == null) {
            LogUtil.j("Weight_IntellLife", "putDeviceProfile profile is null");
            return false;
        }
        boolean zPutDevice = ProfileManager.INSTANCE.putDevice(deviceProfile);
        LogUtil.a("Weight_IntellLife", "putDeviceProfile is success: ", Boolean.valueOf(zPutDevice));
        return zPutDevice;
    }

    private boolean a(ServiceProfile serviceProfile) {
        if (!eak.e(serviceProfile)) {
            return false;
        }
        boolean zPutServiceOfDevice = ProfileManager.INSTANCE.putServiceOfDevice(serviceProfile.getDeviceId(), serviceProfile);
        LogUtil.a("Weight_IntellLife", "putServiceProfile ", "serviceId ", serviceProfile.getId(), "is success ", Boolean.valueOf(zPutServiceOfDevice));
        return zPutServiceOfDevice;
    }

    private boolean d(String str, String str2, ServiceCharacteristicProfile serviceCharacteristicProfile) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("Weight_IntellLife", "putServiceCharacteristic deviceId or serviceId is null");
            return false;
        }
        boolean zPutServiceCharacteristic = ProfileManager.INSTANCE.putServiceCharacteristic(str, str2, serviceCharacteristicProfile);
        LogUtil.a("Weight_IntellLife", "putServiceCharacteristic put deviceId = ", dyg.d(str), " serviceId = ", str2, " is success ", Boolean.valueOf(zPutServiceCharacteristic));
        return zPutServiceCharacteristic;
    }

    private boolean d(DeviceInfo deviceInfo) {
        if (a(eak.b(deviceInfo, w9.h, eak.d(w9.h)))) {
            return d(deviceInfo.getUuid(), w9.h, eak.b(eak.e(deviceInfo, w9.h)));
        }
        LogUtil.j("Weight_IntellLife", "putConnectionService fail");
        return false;
    }

    private boolean e(DeviceInfo deviceInfo) {
        LogUtil.a("Weight_IntellLife", "putManagerNodeProfile start");
        if (a(eak.b(deviceInfo, "managerNode", eak.d("managerNode")))) {
            return a(deviceInfo);
        }
        LogUtil.j("Weight_IntellLife", "put manageNode service fail");
        return false;
    }

    private boolean a(DeviceInfo deviceInfo) {
        String strB = eak.b(eak.b());
        String strE = eak.e();
        String strA = a(deviceInfo.getUuid(), "managerNode", "characteristic.managerIdentifierList");
        String strA2 = a(deviceInfo.getUuid(), "managerNode", "characteristic.managerIdentifierList2");
        if (AwarenessRequest.MessageType.DISCONNECT.equals(strA) || AwarenessRequest.MessageType.DISCONNECT.equals(strA2)) {
            LogUtil.e("Weight_IntellLife", "putManageNodeCharactistics profile disconnect!");
            return false;
        }
        String strC = eak.c(strA, strB);
        String strC2 = eak.c(strA2, strE);
        if (strA.equalsIgnoreCase(strC) && strA2.equalsIgnoreCase(strC2)) {
            LogUtil.j("Weight_IntellLife", "not need to update manageNode");
        }
        boolean zD = d(deviceInfo.getUuid(), "managerNode", eak.a(deviceInfo, new String[]{strC, strC2}));
        if (strC != null && strC2 != null) {
            LogUtil.a("Weight_IntellLife", "putManagerNodeProfile phoneSerialNumberList'size ", Integer.valueOf(strA.length()), " new size ", Integer.valueOf(strC.length()), " phoneAddress's size ", Integer.valueOf(strA2.length()), " new size ", Integer.valueOf(strC2.length()));
        }
        return zD;
    }

    public void b(String str) {
        LogUtil.a("Weight_IntellLife", "removeDeviceToProfile start deviceId");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Weight_IntellLife", "removeDeviceToProfile deviceId is null");
            return;
        }
        ServiceCharacteristicProfile serviceCharacteristics = ProfileManager.INSTANCE.getServiceCharacteristics(str, "managerNode", true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (serviceCharacteristics == null) {
            LogUtil.j("Weight_IntellLife", "removeServiceCharacterValue characteristicProfiles is null");
            return;
        }
        String strB = eak.b(eak.b());
        String strA = a(str, "managerNode", "characteristic.managerIdentifierList");
        if (AwarenessRequest.MessageType.DISCONNECT.equals(strA)) {
            LogUtil.e("Weight_IntellLife", "removeServiceCharacterValue phoneSerialNumberList profile disconnect!");
            return;
        }
        String strD = eak.d(strA, strB);
        String strE = eak.e();
        String strA2 = a(str, "managerNode", "characteristic.managerIdentifierList2");
        if (AwarenessRequest.MessageType.DISCONNECT.equals(strA2)) {
            LogUtil.e("Weight_IntellLife", "removeServiceCharacterValue phoneMacAddressList profile disconnect!");
            return;
        }
        String strD2 = eak.d(strA2, strE);
        if (strA.equalsIgnoreCase(strD) && strA2.equalsIgnoreCase(strD2)) {
            LogUtil.j("Weight_IntellLife", "removeServiceCharacterValue do nothing");
            return;
        }
        Map<String, Object> profile = serviceCharacteristics.getProfile();
        profile.put("characteristic.managerIdentifierList", strD);
        profile.put("characteristic.managerIdentifierList2", strD2);
        LogUtil.d("Weight_IntellLife", "removeServiceCharacterValue characteristics ", profile.toString());
        d(str, "managerNode", eak.b(profile));
    }

    private void c(String str) {
        LogUtil.a("Weight_IntellLife", "deleteDeviceById start");
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Weight_IntellLife", "deleteDeviceById deviceId is null");
            return;
        }
        List<DeviceProfile> devices = ProfileManager.INSTANCE.getDevices(true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (devices == null) {
            LogUtil.j("Weight_IntellLife", "deleteDeviceById deviceProfiles is null");
            return;
        }
        Iterator<DeviceProfile> it = devices.iterator();
        while (it.hasNext()) {
            String id = it.next().getId();
            if (str.equalsIgnoreCase(id)) {
                e(id);
                LogUtil.a("Weight_IntellLife", "deleteDeviceById deleteDevice : ", Boolean.valueOf(ProfileManager.INSTANCE.deleteDevice(id)));
                return;
            }
        }
    }

    private void e(String str) {
        List<ServiceProfile> servicesOfDevice = ProfileManager.INSTANCE.getServicesOfDevice(str, true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (servicesOfDevice == null || servicesOfDevice.isEmpty()) {
            LogUtil.j("Weight_IntellLife", "deleteAllServices deleteDevice success:", Boolean.valueOf(ProfileManager.INSTANCE.deleteDevice(str)));
            return;
        }
        Iterator<ServiceProfile> it = servicesOfDevice.iterator();
        while (it.hasNext()) {
            String id = it.next().getId();
            LogUtil.d("Weight_IntellLife", " deleteAllServices serviceId:", id);
            b(str, id);
            LogUtil.d("Weight_IntellLife", "deleteAllServices deleteDevice success:", Boolean.valueOf(ProfileManager.INSTANCE.deleteServiceOfDevice(str, id)));
        }
    }

    private void b(String str, String str2) {
        ServiceCharacteristicProfile serviceCharacteristics = ProfileManager.INSTANCE.getServiceCharacteristics(str, str2, true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (serviceCharacteristics == null) {
            LogUtil.j("Weight_IntellLife", "characteristicProfile is empty");
            return;
        }
        Map<String, Object> profile = serviceCharacteristics.getProfile();
        if (profile == null || profile.isEmpty()) {
            LogUtil.j("Weight_IntellLife", "deleteAllCharacter profile map is empty");
            return;
        }
        Iterator<Map.Entry<String, Object>> it = profile.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            LogUtil.d("Weight_IntellLife", " deleteAllCharacter character key:", key);
            LogUtil.d("Weight_IntellLife", " deleteAllCharacter is success:", Boolean.valueOf(ProfileManager.INSTANCE.deleteServiceCharacteristic(str, str2, key)));
        }
    }

    private String d(String str) {
        return a(str, "managerNode", "type");
    }

    private String a(String str, String str2, String str3) {
        LogUtil.d("Weight_IntellLife", "getServiceCharacteristics device id ,", str);
        if (njy.e(ProfileManager.INSTANCE.getServicesOfDevice(str, true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN)))) {
            LogUtil.j("Weight_IntellLife", "getServiceCharacteristics has not service");
        }
        ServiceCharacteristicProfile serviceCharacteristics = ProfileManager.INSTANCE.getServiceCharacteristics(str, str2, true, Arrays.asList(ProfileClient.CLOUD_LOCAL_DOMAIN));
        if (serviceCharacteristics == null) {
            LogUtil.j("Weight_IntellLife", "serviceCharacteristicProfiles is null");
            return "";
        }
        String strValueOf = String.valueOf(serviceCharacteristics.getProfile().get(str3));
        LogUtil.d("Weight_IntellLife", "getServiceCharacteristics serviceId ", str2, " key ", str3, " value ", strValueOf);
        return strValueOf;
    }
}
