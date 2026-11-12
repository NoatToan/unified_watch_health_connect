package com.huawei.ui.main.stories.history.view.staticitem;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.view.BaseStasticItemShower;
import com.huawei.ui.main.stories.history.view.StasticViewType;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes43.dex */
@StasticViewType(getDataType = "TOTAL_SPORT_TIMES")
public class SportTimesStaticItemShower extends BaseStasticItemShower {
    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower, com.huawei.ui.main.stories.history.view.InterfaceItemDataShower
    public String getUnit() {
        if (getSportType() == 271) {
            return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_aw_version2_basketball_time_unit2, (int) standardize(), "");
        }
        return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_details_sleep_latency_times, (int) standardize(), "");
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower, com.huawei.ui.main.stories.history.view.InterfaceItemDataShower
    public String getMainStaticName() {
        if (this.mSportType == 10001) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_motiontrack_sport_fitness_times);
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_times);
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower
    public double standardize() {
        if (isDataMapEmpty(this.mItemDataMap)) {
            return 0.0d;
        }
        if (!this.mItemDataMap.containsKey("TOTAL_SPORT_TIMES") || !this.mItemDataMap.containsKey("TOTAL_ABNORMAL_SPORT_TIMES")) {
            LogUtil.e("Track_BaseStasticItemShower", "mItemDataMap is not containsKey TOTAL_SPORT_TIMES or TOTAL_ABNORMAL_SPORT_TIMES");
            return 0.0d;
        }
        Double d = this.mItemDataMap.get("TOTAL_SPORT_TIMES");
        double dDoubleValue = d.doubleValue();
        Double d2 = this.mItemDataMap.get("TOTAL_ABNORMAL_SPORT_TIMES");
        double dDoubleValue2 = d2.doubleValue();
        LogUtil.a("Track_BaseStasticItemShower", "times = ", d, "  abnormalTime =", d2);
        return dDoubleValue - dDoubleValue2;
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower
    public String processDataToString(double d) {
        if (d == 0.0d) {
            return "--";
        }
        return UnitUtil.e(d, 1, 0);
    }
}
