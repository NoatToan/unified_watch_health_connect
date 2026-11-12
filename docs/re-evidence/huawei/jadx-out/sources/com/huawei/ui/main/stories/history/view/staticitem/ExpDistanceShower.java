package com.huawei.ui.main.stories.history.view.staticitem;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.view.BaseStasticItemShower;
import com.huawei.ui.main.stories.history.view.StasticViewType;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes43.dex */
@StasticViewType(getDataType = "TOTAL_EXP_DISTANCE")
public class ExpDistanceShower extends BaseStasticItemShower {
    private static final String TAG = "Track_ExpDistanceShower";

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

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower
    public double standardize() {
        if (isDataMapEmpty(this.mItemDataMap)) {
            return 0.0d;
        }
        if (!this.mItemDataMap.containsKey("TOTAL_EXP_DISTANCE")) {
            LogUtil.e(TAG, "mItemDataMap is not containsKey TOTAL_DISTANCE");
            return 0.0d;
        }
        double dDoubleValue = this.mItemDataMap.get("TOTAL_EXP_DISTANCE").doubleValue() / 1000.0d;
        return UnitUtil.f() ? UnitUtil.e(dDoubleValue, 3) : dDoubleValue;
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower, com.huawei.ui.main.stories.history.view.InterfaceItemDataShower
    public String getMainStaticName() {
        return BaseApplication.getContext().getResources().getString(R.string.Ids_hw_sport_total_waypoint_mileage);
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower
    public String processDataToString(double d) {
        if (d == 0.0d) {
            return "--";
        }
        return UnitUtil.e(d, 1, 2);
    }
}
