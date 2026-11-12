package defpackage;

import com.huawei.health.device.api.HwWspMeasureControllerApi;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.hmf.annotation.ApiDefine;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = HwWspMeasureControllerApi.class)
public class fna implements HwWspMeasureControllerApi {
    @Override // com.huawei.health.device.api.HwWspMeasureControllerApi
    public void unRegisterCallback(IHealthDeviceCallback iHealthDeviceCallback) {
        doq.e().c(iHealthDeviceCallback);
    }

    @Override // com.huawei.health.device.api.HwWspMeasureControllerApi
    public int getState() {
        return doq.e().l();
    }
}
