package com.huawei.health.device.api;

import android.content.Intent;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.device.callback.NewVersionCallback;
import com.huawei.health.device.callback.QueryLatestVersionCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import defpackage.dse;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface BacklogManagerApi {
    public static final int DEVICE_TODOCENTER_REQUEST_CODE = 608;

    void checkNewVersion(DeviceInfo deviceInfo, NewVersionCallback newVersionCallback);

    void deleteBackLogCache(String str);

    void doEventClickAction(String str, String str2, BackLogCallback<Integer> backLogCallback);

    void onActivityResult(int i, int i2, Intent intent);

    void queryBacklogList(BackLogCallback<List<dse>> backLogCallback);

    void queryLatestVersion(String str, QueryLatestVersionCallback queryLatestVersionCallback);

    void updateRemindStatus(String str, BackLogCallback<Boolean> backLogCallback);

    void updateVisitedStatus(String str, boolean z, BackLogCallback<Boolean> backLogCallback);
}
