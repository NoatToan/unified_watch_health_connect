package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.hmf.annotation.ApiDefine;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = HonourDeviceConstantsApi.class)
public class fmz implements HonourDeviceConstantsApi {
    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public boolean getUserSureDownload() {
        LogUtil.a("HonourDeviceConstantsImpl", "getUserSureDownload");
        return dxm.i();
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public boolean isHonourDevice(String str) {
        LogUtil.a("HonourDeviceConstantsImpl", "isHonourDevice");
        return dxm.aa(str);
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public boolean isShowWiFiDevice(String str) {
        LogUtil.a("HonourDeviceConstantsImpl", "isShowWiFiDevice");
        return dxm.ak(str);
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public boolean isHuaweiWspScaleProduct(String str) {
        LogUtil.a("HonourDeviceConstantsImpl", "isHuaweiWspScaleProduct");
        return dxm.ag(str);
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public boolean isTlvScaleProduct(String str, String str2) {
        LogUtil.a("HonourDeviceConstantsImpl", "isTlvScaleProduct");
        return dxm.a(str, str2);
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public boolean isDualModeProduct(String str) {
        return dxm.y(str);
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public boolean isSupportWifiDevice() {
        return dxm.j();
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public boolean isCorrectProductId(String str) {
        return dxm.s(str);
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public boolean isHuaweiOrHonourDevice(String str) {
        LogUtil.a("HonourDeviceConstantsImpl", "isHuaweiOrHonourDevice");
        return dxm.ad(str);
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public boolean isHuaweiOrHonourScaleProdId(String str) {
        LogUtil.a("HonourDeviceConstantsImpl", "isHuaweiOrHonourScaleProdId");
        return dxm.af(str);
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public boolean isHuaweiWspDataType(int i) {
        LogUtil.a("HonourDeviceConstantsImpl", "isHuaweiWspDataType");
        return dxm.e(i);
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public boolean isNoneHonourAm16BondedDevice() {
        LogUtil.a("HonourDeviceConstantsImpl", "isNoneHonourAm16BondedDevice");
        return dxm.f();
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public String getDeviceSerialNumberByUniqueId(String str) {
        LogUtil.a("HonourDeviceConstantsImpl", "getDeviceSerialNumberByUniqueId");
        return dxm.l(str);
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public Bundle getAm16Bundle() {
        LogUtil.a("HonourDeviceConstantsImpl", "getAm16Bundle");
        return dxm.a();
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public void setDevicesUseTime(String str) {
        dxm.au(str);
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public boolean isNoneHuaWeiWeightBondedDevice(String str) {
        return dxm.ae(str);
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public boolean isHonourNewDevice(String str) {
        return dxm.ac(str);
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public String judgeProductIdByDeviceName(String str) {
        LogUtil.a("HonourDeviceConstantsImpl", "judgeProductIdByDeviceName");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = str.contains("CH100") ? "33123f39-7fc1-420b-9882-a4b0d6c61100" : null;
        if (str.contains("CH18")) {
            str2 = "34fa0346-d46c-439d-9cb0-2f696618846b";
        }
        if (str.contains("CH100S")) {
            str2 = "ccd1f0f8-8c57-4bd7-a884-0ef38482f15f";
        }
        return str.contains("AH100") ? "7a1063dd-0e0f-4a72-9939-461476ff0259" : str2;
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public void setUserSureDownload() {
        dxm.l();
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public String getDeviceIdentify(String str) {
        return dxm.h(str);
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public String getDeviceHelpH5Url(String str) {
        return dxm.d(str);
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public boolean isHonourWeightDevice(String str) {
        return dxm.ab(str);
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public String getDeviceNameByProductId(String str) {
        return dxm.o(str);
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public boolean getAm16PermissionTip() {
        return dxm.e();
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public void setAm16PermissionTip() {
        dxm.o();
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public boolean isWiFiDevice(String str) {
        return dxm.at(str);
    }

    @Override // com.huawei.health.device.api.HonourDeviceConstantsApi
    public String getDeviceModel(String str) {
        return dxm.i(str);
    }
}
