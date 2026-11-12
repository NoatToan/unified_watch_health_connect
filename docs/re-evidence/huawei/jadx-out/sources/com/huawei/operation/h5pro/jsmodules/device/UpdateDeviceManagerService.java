package com.huawei.operation.h5pro.jsmodules.device;

import com.huawei.health.device.api.BacklogManagerApi;
import com.huawei.health.device.callback.QueryLatestVersionCallback;
import com.huawei.health.h5pro.service.anotation.H5ProCallback;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.dsi;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@H5ProService(name = UpdateDeviceManagerService.TAG, users = {"9ea3f06fe2dea3e2c7c21ea1ba1e07c370a786c68417a4a96cb986576883e10f"})
public class UpdateDeviceManagerService {
    private static final String TAG = "UpdateDeviceManager";
    private static final String TAG_RELEASE = "DEVMGR_UpdateDeviceManager";

    @H5ProCallback
    interface IH5ProCallback<T> {
        void onFailure(int i, String str);

        void onSuccess(T t);
    }

    @H5ProMethod(name = "queryLatestVersion")
    public static void queryLatestVersion(String str, final IH5ProCallback<dsi> iH5ProCallback) {
        LogUtil.a(TAG, "queryLatestVersion queryLatestVersion：", CommonUtil.n(str));
        ((BacklogManagerApi) Services.b("HomeHealth", BacklogManagerApi.class)).queryLatestVersion(str, new QueryLatestVersionCallback() { // from class: com.huawei.operation.h5pro.jsmodules.device.UpdateDeviceManagerService.1
            @Override // com.huawei.health.device.callback.QueryLatestVersionCallback
            public void onSuccess(dsi dsiVar) {
                LogUtil.a(UpdateDeviceManagerService.TAG, "queryLatestVersion onSuccess:", Boolean.valueOf(Objects.isNull(dsiVar)));
                iH5ProCallback.onSuccess(dsiVar);
            }

            @Override // com.huawei.health.device.callback.QueryLatestVersionCallback
            public void onFail(String str2) {
                LogUtil.a(UpdateDeviceManagerService.TAG, "queryLatestVersion onFail:", str2);
                iH5ProCallback.onFailure(-1, str2);
            }
        });
    }
}
