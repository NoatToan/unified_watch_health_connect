package com.huawei.operation.h5pro.jsmodules.device;

import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.device.api.BacklogManagerApi;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.dse;
import health.compact.a.Services;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@H5ProService(name = "BacklogManager", users = {"9ea3f06fe2dea3e2c7c21ea1ba1e07c370a786c68417a4a96cb986576883e10f"})
public class BacklogManagerService {
    private static final String TAG = "BacklogManagerService";

    @H5ProMethod(name = "queryBacklogList")
    public static void queryBacklogList(final BackLogCbk<dse[]> backLogCbk) {
        LogUtil.a(TAG, "queryBacklogList");
        ((BacklogManagerApi) Services.b("ToDoCenter", BacklogManagerApi.class)).queryBacklogList(new BackLogCallback<List<dse>>() { // from class: com.huawei.operation.h5pro.jsmodules.device.BacklogManagerService.1
            @Override // com.huawei.health.device.callback.BackLogCallback
            public void onSuccess(List<dse> list) {
                if (CollectionUtils.a(list)) {
                    backLogCbk.onSuccess(new dse[0]);
                } else {
                    LogUtil.a(BacklogManagerService.TAG, "queryBacklogList result:", Integer.valueOf(list.size()));
                    backLogCbk.onSuccess((dse[]) list.toArray(new dse[0]));
                }
            }

            @Override // com.huawei.health.device.callback.BackLogCallback
            public void onFailure(int i, String str) {
                backLogCbk.onFailure(i, str);
            }
        });
    }

    @H5ProMethod(name = "updateBacklogViewedInfo")
    public static void updateBacklogViewedInfo(String str, boolean z, final BackLogCbk<Boolean> backLogCbk) {
        LogUtil.a(TAG, "tag:", str, " ,isViewed:", Boolean.valueOf(z));
        ((BacklogManagerApi) Services.b("ToDoCenter", BacklogManagerApi.class)).updateVisitedStatus(str, z, new BackLogCallback<Boolean>() { // from class: com.huawei.operation.h5pro.jsmodules.device.BacklogManagerService.2
            @Override // com.huawei.health.device.callback.BackLogCallback
            public void onSuccess(Boolean bool) {
                backLogCbk.onSuccess(bool);
            }

            @Override // com.huawei.health.device.callback.BackLogCallback
            public void onFailure(int i, String str2) {
                backLogCbk.onFailure(i, str2);
            }
        });
    }

    @H5ProMethod(name = "deleteBacklogViewedInfo")
    public static void deleteBacklogViewedInfo(String str, final BackLogCbk<Boolean> backLogCbk) {
        LogUtil.a(TAG, "deleteBacklogViewedInfo tag:", str);
        ((BacklogManagerApi) Services.b("ToDoCenter", BacklogManagerApi.class)).updateRemindStatus(str, new BackLogCallback<Boolean>() { // from class: com.huawei.operation.h5pro.jsmodules.device.BacklogManagerService.3
            @Override // com.huawei.health.device.callback.BackLogCallback
            public void onSuccess(Boolean bool) {
                backLogCbk.onSuccess(bool);
            }

            @Override // com.huawei.health.device.callback.BackLogCallback
            public void onFailure(int i, String str2) {
                backLogCbk.onFailure(i, str2);
            }
        });
    }
}
