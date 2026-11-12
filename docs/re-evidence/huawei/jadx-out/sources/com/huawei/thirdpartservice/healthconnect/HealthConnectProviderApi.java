package com.huawei.thirdpartservice.healthconnect;

import com.huawei.hihealth.HiHealthData;

/* JADX INFO: loaded from: classes15.dex */
public interface HealthConnectProviderApi {
    void initHealthConnect();

    boolean isAgreeHealthConnect();

    boolean isHasCaloriesPermission();

    boolean isHasSleepPermission();

    boolean isHasSportPermission();

    boolean isHasStepPermission();

    boolean isSupportHealthConnect();

    void writeSleepData();

    void writeSportData(HiHealthData hiHealthData);
}
