package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.device.api.DeviceLegalInfoApi;
import com.huawei.health.device.callback.DeviceLegalInfoCallback;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = DeviceLegalInfoApi.class)
@Singleton
public class rit implements DeviceLegalInfoApi {
    @Override // com.huawei.health.device.api.DeviceLegalInfoApi
    public void querySupportLegalInfo(String str, DeviceLegalInfoCallback deviceLegalInfoCallback) {
        DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(BaseApplication.b()).e(str);
        if (deviceCapabilityE == null) {
            LogUtil.j("DeviceGeneralSettingApi", "querySupportLegalInfo deviceCapability is null");
            deviceLegalInfoCallback.onResult(false);
        } else {
            deviceLegalInfoCallback.onResult(b(deviceCapabilityE));
        }
    }

    private boolean b(DeviceCapability deviceCapability) {
        return (deviceCapability.isSupportLegalOpenSource() || deviceCapability.isSupportLegalUserAgreement() || deviceCapability.isSupportLegalPrivacy() || deviceCapability.isSupportLegalServiceStatement()) || (deviceCapability.isSupportLegalSourceStatement() || deviceCapability.isSupportLegalSystemWebView() || deviceCapability.isSupportHarmonyAgreement());
    }
}
