package com.huawei.ui.main.stories.fitness.activity.bloodoxygen.provider;

import com.huawei.ui.commonui.linechart.common.DataInfos;
import defpackage.qnh;

/* JADX INFO: loaded from: classes43.dex */
public class BloodOxygenWeekChartProvider extends BloodOxygenBaseChartProvider {
    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.provider.BloodOxygenBaseChartProvider
    protected int getStartTimestamp(long j) {
        if (j > 0) {
            return qnh.h(qnh.o(j));
        }
        return 0;
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.provider.BloodOxygenBaseChartProvider
    protected DataInfos getDataInfo() {
        return DataInfos.BloodOxygenWeekDetail;
    }
}
