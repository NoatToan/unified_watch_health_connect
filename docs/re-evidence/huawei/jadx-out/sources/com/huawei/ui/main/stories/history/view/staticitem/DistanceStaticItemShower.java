package com.huawei.ui.main.stories.history.view.staticitem;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.view.BaseStasticItemShower;
import com.huawei.ui.main.stories.history.view.StasticViewType;
import defpackage.nub;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes19.dex */
@StasticViewType(getDataType = "TOTAL_DISTANCE")
public class DistanceStaticItemShower extends BaseStasticItemShower {
    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower, com.huawei.ui.main.stories.history.view.InterfaceItemDataShower
    public String getUnit() {
        if (isDataMapEmpty(this.mItemDataMap)) {
            return "--";
        }
        if (UnitUtil.f()) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_band_data_sport_distance_unit_en);
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_sport_unit_km);
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower, com.huawei.ui.main.stories.history.view.InterfaceItemDataShower
    public String getMainStaticName() {
        if (nub.c(this.mSportType)) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_total_ski_distance);
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_total_distance);
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower
    public double standardize() {
        if (isDataMapEmpty(this.mItemDataMap)) {
            return 0.0d;
        }
        if (!this.mItemDataMap.containsKey("TOTAL_DISTANCE")) {
            LogUtil.e("Track_BaseStasticItemShower", "mItemDataMap is not containsKey TOTAL_DISTANCE");
            return 0.0d;
        }
        double dDoubleValue = this.mItemDataMap.get("TOTAL_DISTANCE").doubleValue() / 1000.0d;
        return UnitUtil.f() ? UnitUtil.e(dDoubleValue, 3) : dDoubleValue;
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower
    public String processDataToString(double d) {
        if (d == 0.0d) {
            return "--";
        }
        return UnitUtil.e(d, 1, 2);
    }
}
