package defpackage;

import android.view.View;
import com.huawei.health.device.api.DeviceInfoUtilsApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hmf.annotation.ApiDefine;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = DeviceInfoUtilsApi.class)
public class fmq implements DeviceInfoUtilsApi {
    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public boolean isSupportUdsByProductId() {
        LogUtil.a("DeviceInfoUtilsImpl", "isSupportUds");
        return dxx.d().f();
    }

    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public boolean isDeviceBand(int i) {
        LogUtil.a("DeviceInfoUtilsImpl", "isDeviceBand");
        return dxx.d().h(i);
    }

    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public DeviceInfo getConnectionDevice() {
        LogUtil.a("DeviceInfoUtilsImpl", "getConnectionDevice");
        return dxx.d().e();
    }

    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public boolean isWearInfoListSize() {
        LogUtil.a("DeviceInfoUtilsImpl", "getWearInfoListSize");
        return dxx.d().h() != null && dxx.d().h().size() > 0;
    }

    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public void setCharacteristicNotifyByUds(String str, String str2, String str3, boolean z) {
        LogUtil.a("DeviceInfoUtilsImpl", "setCharacteristicNotifyByUds");
        dxx.d().d(str, str2, str3, z);
    }

    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public <T> void putUdsClassMap(String str, T t) {
        LogUtil.a("DeviceInfoUtilsImpl", "putUdsClassMap");
        dxx.d().c(str, t);
    }

    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public void clearUdsClassMap() {
        LogUtil.a("DeviceInfoUtilsImpl", "clearUdsClassMap");
        dxx.d().a();
    }

    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public boolean isBindingHeartRateDeviceWear(List<String> list) {
        ArrayList<dxy> arrayListE = dxx.d().e(list);
        return (arrayListE == null || arrayListE.isEmpty()) ? false : true;
    }

    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public String getBondedDeviceAddress(String str, String str2) {
        return dxx.c(str, str2);
    }

    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public ArrayList<dxy> getWearInfo() {
        return dxx.d().h();
    }

    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public void resetUpdate() {
        dxx.d().j();
    }

    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public List<DeviceInfo> getWearDeviceList() {
        return dxx.d().g();
    }

    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public DeviceInfo getCurrentDevice() {
        return dxx.d().e();
    }

    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public void setBattery(int i) {
        dxx.d().f(i);
    }

    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public boolean isPluginDownloadByType(int i) {
        return dxx.d().g(i);
    }

    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public String getUUIDForPlugin(int i) {
        return dxx.d().d(i);
    }

    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public boolean idCurrentDeviceActive(String str) {
        return dxx.d().e(str);
    }

    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public List<DeviceInfo> getCurrentDeviceList() {
        return dxx.d().b();
    }

    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public boolean isWiFiDevice(String str) {
        return ect.c(str);
    }

    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public int getBtType(int i) {
        return dxx.d().a(i);
    }

    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public void sendDeraultSwitch() {
        dxx.d().i();
    }

    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public ArrayList<dxy> getWearInfoHeartRate(List<String> list) {
        return dxx.d().e(list);
    }

    @Override // com.huawei.health.device.api.DeviceInfoUtilsApi
    public View checkProductType(int i) {
        return dxx.d().e(i);
    }
}
