package com.huami.sky.lib.api;

import com.huami.sky.lib.entity.DeviceDataEntity;
import com.huami.sky.lib.entity.HeartRate;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H&J\b\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\u0005H&J\b\u0010\r\u001a\u00020\u0005H&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\tH&¨\u0006\u0011"}, d2 = {"Lcom/huami/sky/lib/api/DeviceDataApi;", "", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/sky/lib/entity/DeviceDataEntity;", "registerDeviceData", "", "isSupportRrInterval", "Lcom/huami/sky/lib/entity/HeartRate;", "registerHeartRate", "", "sleepStateNotify", "isSupportAlarmClock", "isSupportSleepNotify", "isSupportSkyFeature", "", "findAllActiveDeviceId", "getDeviceSource", "sky-lib_release"}, k = 1, mv = {1, 5, 1})
public interface DeviceDataApi {
    @NotNull
    String findAllActiveDeviceId();

    int getDeviceSource();

    boolean isSupportAlarmClock();

    boolean isSupportRrInterval();

    boolean isSupportSkyFeature();

    boolean isSupportSleepNotify();

    @NotNull
    Flow<DeviceDataEntity> registerDeviceData();

    @NotNull
    Flow<HeartRate> registerHeartRate();

    @NotNull
    Flow<Integer> sleepStateNotify();
}
