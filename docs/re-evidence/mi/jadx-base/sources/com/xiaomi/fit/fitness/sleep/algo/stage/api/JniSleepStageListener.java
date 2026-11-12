package com.xiaomi.fit.fitness.sleep.algo.stage.api;

import com.xiaomi.fit.fitness.sleep.algo.stage.data.SleepRateArray;
import com.xiaomi.fit.fitness.sleep.algo.stage.data.SleepStageSummary;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface JniSleepStageListener {
    void callBackSleepBreathArrayFromJNI(int i, SleepRateArray sleepRateArray);

    void callBackSleepStageArrayFromJNI(int i, List<SleepStageSummary> list);

    void callBackStateFromJNI(int i);

    void callbackFeaturesFromJNI(float[][] fArr);
}
