package defpackage;

import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.DeviceInformation;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiRegisterClientListener;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class esf {
    public HiDeviceInfo a(d dVar) {
        return dVar.c();
    }

    public void c(HiDeviceInfo hiDeviceInfo, HiRegisterClientListener hiRegisterClientListener) {
        HiHealthManager.d(BaseApplication.getContext()).registerDataClient(hiDeviceInfo, d(), hiRegisterClientListener);
    }

    public List<Integer> d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        return arrayList;
    }

    public static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HiDeviceInfo f33405c;
        private String e;

        public d(String str, String str2) {
            this.e = str2;
            String strB = era.b(str);
            ProductMapInfo productMapInfoD = ProductMap.d(strB);
            HiDeviceInfo hiDeviceInfo = new HiDeviceInfo(productMapInfoD != null ? productMapInfoD.c() : 1);
            this.f33405c = hiDeviceInfo;
            hiDeviceInfo.setProdId(strB);
            this.f33405c.setDeviceUniqueCode(this.e);
        }

        public d e(DeviceInformation deviceInformation) {
            this.f33405c.setDeviceSN(deviceInformation.getSerialNumber());
            this.f33405c.setDeviceName(deviceInformation.getBleDeviceName());
            this.f33405c.setFirmwareVersion(deviceInformation.getFirmwareVersion());
            this.f33405c.setSoftwareVersion(deviceInformation.getSoftwareVersion());
            this.f33405c.setHardwareVersion(deviceInformation.getHardwareVersion());
            this.f33405c.setModel(deviceInformation.getModelString());
            this.f33405c.setManufacturer(deviceInformation.getManufacturerString());
            return this;
        }

        public d a(com.huawei.health.ecologydevice.fitness.datastruct.DeviceInformation deviceInformation) {
            String deviceName;
            this.f33405c.setDeviceSN(deviceInformation.getSerialNumber());
            MeasurableDevice bondedDeviceByUniqueId = dmg.a().getBondedDeviceByUniqueId(this.e, false);
            if (bondedDeviceByUniqueId == null) {
                deviceName = "";
            } else {
                deviceName = bondedDeviceByUniqueId.getDeviceName();
            }
            this.f33405c.setDeviceName(deviceName);
            this.f33405c.setSoftwareVersion(deviceInformation.getSoftwareVersion());
            this.f33405c.setHardwareVersion(deviceInformation.getHardwareVersion());
            this.f33405c.setModel(deviceInformation.getModelString());
            this.f33405c.setManufacturer(deviceInformation.getManufacturerString());
            return this;
        }

        public HiDeviceInfo c() {
            return this.f33405c;
        }
    }
}
