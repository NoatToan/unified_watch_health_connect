package com.huawei.health.device.manager;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.profile.client.profile.ProfileClient;
import com.huawei.profile.profile.DeviceProfile;
import com.huawei.profile.profile.ServiceCharacteristicProfile;
import com.huawei.profile.profile.ServiceProfile;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public enum ProfileManager {
    INSTANCE;

    private static final String TAG = "ProfileManager";
    private ProfileClient mClientAgent = new ProfileClient(BaseApplication.getContext());

    ProfileManager() {
    }

    public boolean putDevice(DeviceProfile deviceProfile) {
        boolean zPutDevice;
        synchronized (this) {
            zPutDevice = this.mClientAgent.putDevice(deviceProfile);
            LogUtil.a(TAG, "putDevice isSuccess ", Boolean.valueOf(zPutDevice));
        }
        return zPutDevice;
    }

    public boolean putServiceOfDevice(String str, ServiceProfile serviceProfile) {
        boolean zPutServiceOfDevice;
        synchronized (this) {
            zPutServiceOfDevice = this.mClientAgent.putServiceOfDevice(str, serviceProfile);
            LogUtil.a(TAG, "putServiceOfDevice isSuccess ", Boolean.valueOf(zPutServiceOfDevice));
        }
        return zPutServiceOfDevice;
    }

    public boolean putServiceCharacteristic(String str, String str2, ServiceCharacteristicProfile serviceCharacteristicProfile) {
        boolean zPutServiceCharacteristic;
        synchronized (this) {
            zPutServiceCharacteristic = this.mClientAgent.putServiceCharacteristic(str, str2, serviceCharacteristicProfile);
            LogUtil.a(TAG, "putServiceCharacteristic isSuccess ", Boolean.valueOf(zPutServiceCharacteristic));
        }
        return zPutServiceCharacteristic;
    }

    public boolean deleteDevice(String str) {
        boolean zDeleteDevice;
        synchronized (this) {
            zDeleteDevice = this.mClientAgent.deleteDevice(str);
            LogUtil.a(TAG, "deleteDevice complete currentCount isSuccess ", Boolean.valueOf(zDeleteDevice));
        }
        return zDeleteDevice;
    }

    public boolean deleteServiceOfDevice(String str, String str2) {
        boolean zDeleteServiceOfDevice;
        synchronized (this) {
            zDeleteServiceOfDevice = this.mClientAgent.deleteServiceOfDevice(str, str2);
            LogUtil.a(TAG, "deleteServiceOfDevice isSuccess ", Boolean.valueOf(zDeleteServiceOfDevice));
        }
        return zDeleteServiceOfDevice;
    }

    public boolean deleteServiceCharacteristic(String str, String str2, String str3) {
        boolean zDeleteServiceCharacteristic;
        synchronized (this) {
            zDeleteServiceCharacteristic = this.mClientAgent.deleteServiceCharacteristic(str, str2, str3);
            LogUtil.a(TAG, "deleteServiceCharacteristic isSuccess ", Boolean.valueOf(zDeleteServiceCharacteristic));
        }
        return zDeleteServiceCharacteristic;
    }

    public ServiceCharacteristicProfile getServiceCharacteristics(String str, String str2, boolean z, List<String> list) {
        ServiceCharacteristicProfile serviceCharacteristics;
        synchronized (this) {
            serviceCharacteristics = this.mClientAgent.getServiceCharacteristics(str, str2, z, list);
            LogUtil.a(TAG, "getServiceCharacteristics isSuccess ", Boolean.valueOf(serviceCharacteristics != null));
        }
        return serviceCharacteristics;
    }

    public List<ServiceProfile> getServicesOfDevice(String str, boolean z, List<String> list) {
        List<ServiceProfile> servicesOfDevice;
        synchronized (this) {
            servicesOfDevice = this.mClientAgent.getServicesOfDevice(str, z, list);
            LogUtil.a(TAG, "getServicesOfDevice isSuccess ", Boolean.valueOf(servicesOfDevice != null));
        }
        return servicesOfDevice;
    }

    public List<DeviceProfile> getDevices(boolean z, List<String> list) {
        List<DeviceProfile> devices;
        synchronized (this) {
            devices = this.mClientAgent.getDevices(z, list);
            LogUtil.a(TAG, "getDevices isSuccess ", Boolean.valueOf(devices != null));
        }
        return devices;
    }
}
