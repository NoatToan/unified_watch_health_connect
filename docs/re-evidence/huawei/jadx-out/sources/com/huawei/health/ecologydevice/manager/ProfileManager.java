package com.huawei.health.ecologydevice.manager;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.client.profile.ProfileClient;
import com.huawei.profile.profile.DeviceProfile;
import com.huawei.profile.profile.ServiceCharacteristicProfile;
import com.huawei.profile.profile.ServiceProfile;
import com.huawei.profile.utils.BaseUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public enum ProfileManager {
    INSTANCE;

    private static final String TAG = "Ecology_ProfileManager";
    private static final String TAG_RELEASE = "DEVMGR_Ecology_ProfileManager";
    private final ProfileClient mClientAgent = new ProfileClient(BaseApplication.getContext());

    ProfileManager() {
    }

    public boolean putDevice(DeviceProfile deviceProfile) {
        boolean zPutDevice;
        synchronized (this) {
            LogUtil.a(TAG, "putDevice: ", deviceProfile);
            zPutDevice = this.mClientAgent.putDevice(deviceProfile);
            ReleaseLogUtil.d(TAG_RELEASE, "putDevice: isSuccess= ", Boolean.valueOf(zPutDevice));
        }
        return zPutDevice;
    }

    public boolean putServiceOfDevice(String str, ServiceProfile serviceProfile) {
        boolean zPutServiceOfDevice;
        synchronized (this) {
            LogUtil.a(TAG, "putServiceOfDevice: deviceId = ", BaseUtil.anonymousContent(str));
            zPutServiceOfDevice = this.mClientAgent.putServiceOfDevice(str, serviceProfile);
            ReleaseLogUtil.d(TAG_RELEASE, "putServiceOfDevice: isSuccess = ", Boolean.valueOf(zPutServiceOfDevice));
        }
        return zPutServiceOfDevice;
    }

    public boolean putServiceCharacteristic(String str, String str2, ServiceCharacteristicProfile serviceCharacteristicProfile) {
        boolean zPutServiceCharacteristic;
        synchronized (this) {
            LogUtil.a(TAG, "putServiceCharacteristic: deviceId = ", BaseUtil.anonymousContent(str), ", serviceId = ", str2);
            zPutServiceCharacteristic = this.mClientAgent.putServiceCharacteristic(str, str2, serviceCharacteristicProfile);
            ReleaseLogUtil.d(TAG_RELEASE, "putServiceCharacteristic: isSuccess ", Boolean.valueOf(zPutServiceCharacteristic));
        }
        return zPutServiceCharacteristic;
    }

    public boolean deleteDevice(String str) {
        boolean zDeleteDevice;
        synchronized (this) {
            LogUtil.a(TAG, "deleteDevice: deviceId = ", BaseUtil.anonymousContent(str));
            zDeleteDevice = this.mClientAgent.deleteDevice(str);
            ReleaseLogUtil.d(TAG_RELEASE, "deleteDevice: isSuccess = ", Boolean.valueOf(zDeleteDevice));
        }
        return zDeleteDevice;
    }

    public boolean deleteServiceOfDevice(String str, String str2) {
        boolean zDeleteServiceOfDevice;
        synchronized (this) {
            LogUtil.a(TAG, "deleteServiceOfDevice: deviceId = ", BaseUtil.anonymousContent(str), ", serviceId = ", str2);
            zDeleteServiceOfDevice = this.mClientAgent.deleteServiceOfDevice(str, str2);
            ReleaseLogUtil.d(TAG_RELEASE, "deleteServiceOfDevice: isSuccess ", Boolean.valueOf(zDeleteServiceOfDevice));
        }
        return zDeleteServiceOfDevice;
    }

    public boolean deleteServiceCharacteristic(String str, String str2, String str3) {
        boolean zDeleteServiceCharacteristic;
        synchronized (this) {
            LogUtil.a(TAG, "deleteServiceCharacteristic: deviceId = ", BaseUtil.anonymousContent(str), ", serviceId = ", str2, ", characteristicId = ", str3);
            zDeleteServiceCharacteristic = this.mClientAgent.deleteServiceCharacteristic(str, str2, str3);
            ReleaseLogUtil.d(TAG_RELEASE, "deleteServiceCharacteristic: isSuccess ", Boolean.valueOf(zDeleteServiceCharacteristic));
        }
        return zDeleteServiceCharacteristic;
    }

    public ServiceCharacteristicProfile getServiceCharacteristics(String str, String str2, boolean z, List<String> list) {
        ServiceCharacteristicProfile serviceCharacteristics;
        synchronized (this) {
            LogUtil.a(TAG, "getServiceCharacteristics: deviceId = ", BaseUtil.anonymousContent(str), ", serviceId = ", str2, ", isSync = ", Boolean.valueOf(z));
            serviceCharacteristics = this.mClientAgent.getServiceCharacteristics(str, str2, z, list);
        }
        return serviceCharacteristics;
    }

    public List<ServiceProfile> getServicesOfDevice(String str, boolean z, List<String> list) {
        List<ServiceProfile> servicesOfDevice;
        synchronized (this) {
            LogUtil.a(TAG, "getServicesOfDevice: deviceId = ", BaseUtil.anonymousContent(str), ", isSync = ", Boolean.valueOf(z));
            servicesOfDevice = this.mClientAgent.getServicesOfDevice(str, z, list);
        }
        return servicesOfDevice;
    }

    public List<DeviceProfile> getDevices(boolean z, List<String> list) {
        List<DeviceProfile> devices;
        synchronized (this) {
            LogUtil.a(TAG, "getDevices: isSync = ", Boolean.valueOf(z));
            devices = this.mClientAgent.getDevices(z, list);
        }
        return devices;
    }
}
