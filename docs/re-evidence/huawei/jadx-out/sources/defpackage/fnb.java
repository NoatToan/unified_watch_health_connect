package defpackage;

import com.huawei.health.device.api.HwChMeasureControllerApi;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.hmf.annotation.ApiDefine;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = HwChMeasureControllerApi.class)
public class fnb implements HwChMeasureControllerApi {
    @Override // com.huawei.health.device.api.HwChMeasureControllerApi
    public void unRegisterCallback(IHealthDeviceCallback iHealthDeviceCallback) {
        dof.d().d(iHealthDeviceCallback);
    }
}
