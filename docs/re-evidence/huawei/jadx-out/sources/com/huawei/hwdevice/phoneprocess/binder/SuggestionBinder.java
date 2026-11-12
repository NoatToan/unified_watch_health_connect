package com.huawei.hwdevice.phoneprocess.binder;

import com.huawei.haf.application.BaseApplication;
import com.huawei.health.fitnessadvice.api.FitnessAdviceApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.SuggestionAidl;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.FitnessWorkoutRecordTempFileUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes38.dex */
public class SuggestionBinder extends SuggestionAidl.Stub {
    @Override // com.huawei.health.suggestion.SuggestionAidl
    public boolean postFitnessRecord(String str) {
        WorkoutRecord workoutRecord = FitnessWorkoutRecordTempFileUtil.readWorkoutRecord(BaseApplication.b(), str);
        FitnessAdviceApi fitnessAdviceApi = (FitnessAdviceApi) Services.d("PluginFitnessAdvice", FitnessAdviceApi.class);
        if (fitnessAdviceApi != null) {
            return fitnessAdviceApi.uploadFitnessRecordData(workoutRecord);
        }
        return false;
    }
}
