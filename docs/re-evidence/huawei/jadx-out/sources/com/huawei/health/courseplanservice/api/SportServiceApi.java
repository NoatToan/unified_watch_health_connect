package com.huawei.health.courseplanservice.api;

import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.pluginfitnessadvice.FitWorkout;
import defpackage.pec;

/* JADX INFO: loaded from: classes7.dex */
public interface SportServiceApi {
    boolean addUpdateFeedback(String str, pec pecVar);

    void getFilterTab(String str, UiCallback<Boolean> uiCallback);

    FitWorkout getWorkout(String str);

    void setLastUseOrWatchCourse(String str, long j, FitWorkout fitWorkout);

    void startDeviceRecordSyncService(OnStateListener onStateListener);

    void syncData();

    void updateAll();
}
