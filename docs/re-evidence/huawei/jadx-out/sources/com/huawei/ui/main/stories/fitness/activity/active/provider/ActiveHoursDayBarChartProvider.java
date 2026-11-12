package com.huawei.ui.main.stories.fitness.activity.active.provider;

import com.huawei.ui.commonui.linechart.common.DataInfos;
import defpackage.qnh;

/* JADX INFO: loaded from: classes43.dex */
public class ActiveHoursDayBarChartProvider extends ActiveHoursBaseBarChartProvider {
    @Override // com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveHoursBaseBarChartProvider
    protected DataInfos getDataInfo() {
        return DataInfos.ActiveHoursDayDetail;
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.active.provider.ActiveHoursBaseBarChartProvider
    protected int getStartTimestamp(long j) {
        if (j > 0) {
            return qnh.h(qnh.b(j));
        }
        return 0;
    }
}
