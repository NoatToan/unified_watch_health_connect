package defpackage;

import com.huawei.health.device.api.MeasureKitManagerApi;
import com.huawei.hihealth.device.open.MeasureKit;
import com.huawei.hmf.annotation.ApiDefine;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = MeasureKitManagerApi.class)
public class fnc implements MeasureKitManagerApi {
    @Override // com.huawei.health.device.api.MeasureKitManagerApi
    public void registerExternalKit(String str, String str2) {
        LogUtil.a("MeasureKitManagerImpl", "registerExternalKit");
        dnf.e().b(str, str2);
    }

    @Override // com.huawei.health.device.api.MeasureKitManagerApi
    public MeasureKit getHealthDeviceKitUniversal(String str) {
        LogUtil.a("MeasureKitManagerImpl", "getHealthDeviceKitUniversal");
        return dnf.e().b(str);
    }

    @Override // com.huawei.health.device.api.MeasureKitManagerApi
    public com.huawei.health.device.open.MeasureKit getHealthDeviceKit(String str) {
        return dnf.e().a(str);
    }
}
