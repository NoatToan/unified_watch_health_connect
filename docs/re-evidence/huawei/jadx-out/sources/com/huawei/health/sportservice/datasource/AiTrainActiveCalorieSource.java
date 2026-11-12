package com.huawei.health.sportservice.datasource;

import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.AIActionBundle;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 3, name = ComponentName.ACTIVE_CALORIE_ALGORITHM_SOURCE_SOURCE)
public class AiTrainActiveCalorieSource extends AiTrainCalorieSource {
    private static final float SECOND_TO_HOUR = 3600.0f;
    private static final float SIT_METS = 1.3f;
    private static final String TAG = "SportService_AiTrainActiveCalorieSource";

    @Override // com.huawei.health.sportservice.datasource.AiTrainCalorieSource
    protected float calcCalorieByTimeType(AIActionBundle aIActionBundle, int i) {
        float fCalcCalorieByTimeType = super.calcCalorieByTimeType(aIActionBundle, i);
        float f = this.mUserWeight * 1.3f * (i / SECOND_TO_HOUR);
        LogUtil.a(TAG, "totalCal: ", Float.valueOf(fCalcCalorieByTimeType), "restCal: ", Float.valueOf(f));
        return Math.max(fCalcCalorieByTimeType - f, 0.0f) * 1000.0f;
    }

    @Override // com.huawei.health.sportservice.datasource.AiTrainCalorieSource
    protected float calcCalorieByCountType(AIActionBundle aIActionBundle, int i) {
        float fCalcCalorieByCountType = super.calcCalorieByCountType(aIActionBundle, i);
        float duration = this.mUserWeight * 1.3f * ((i * (aIActionBundle.getDuration() / 1000.0f)) / SECOND_TO_HOUR);
        LogUtil.a(TAG, "totalCal: ", Float.valueOf(fCalcCalorieByCountType), "restCal: ", Float.valueOf(duration));
        return Math.max(fCalcCalorieByCountType - duration, 0.0f) * 1000.0f;
    }

    @Override // com.huawei.health.sportservice.datasource.AiTrainCalorieSource, com.huawei.health.sportservice.datasource.BaseSource
    protected String getLogTag() {
        return TAG;
    }

    @Override // com.huawei.health.sportservice.datasource.AiTrainCalorieSource, com.huawei.health.sportservice.datasource.BaseSource
    protected void updateSourceData() {
        BaseSportManager.getInstance().updateSourceData(TAG, "ACTIVE_CALORIES_DATA", Integer.valueOf(Math.round(this.mCaloriesValue)));
    }
}
