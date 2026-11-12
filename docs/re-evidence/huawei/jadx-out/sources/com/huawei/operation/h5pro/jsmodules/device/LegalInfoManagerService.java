package com.huawei.operation.h5pro.jsmodules.device;

import com.huawei.health.device.api.DeviceLegalInfoApi;
import com.huawei.health.device.callback.DeviceLegalInfoCallback;
import com.huawei.health.h5pro.service.anotation.H5ProCallback;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes.dex */
@H5ProService(name = LegalInfoManagerService.TAG, users = {"9ea3f06fe2dea3e2c7c21ea1ba1e07c370a786c68417a4a96cb986576883e10f"})
public class LegalInfoManagerService {
    private static final String TAG = "LegalInfoManager";

    @H5ProCallback
    interface IH5ProCallback<T> {
        void onFailure(int i, String str);

        void onSuccess(T t);
    }

    @H5ProMethod(name = "querySupportLegalInfo")
    public static void querySupportLegalInfo(String str, final IH5ProCallback<Boolean> iH5ProCallback) {
        DeviceLegalInfoApi deviceLegalInfoApi = (DeviceLegalInfoApi) Services.d("ToDoCenter", DeviceLegalInfoApi.class);
        if (deviceLegalInfoApi == null) {
            iH5ProCallback.onSuccess(false);
        } else {
            deviceLegalInfoApi.querySupportLegalInfo(str, new DeviceLegalInfoCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.LegalInfoManagerService.1
                @Override // com.huawei.health.device.callback.DeviceLegalInfoCallback
                public void onResult(boolean z) {
                    LogUtil.a(LegalInfoManagerService.TAG, "setSyncWifiConfigStatus result:", Boolean.valueOf(z));
                    IH5ProCallback iH5ProCallback2 = iH5ProCallback;
                    if (iH5ProCallback2 != null) {
                        iH5ProCallback2.onSuccess(Boolean.valueOf(z));
                    }
                }
            });
        }
    }
}
