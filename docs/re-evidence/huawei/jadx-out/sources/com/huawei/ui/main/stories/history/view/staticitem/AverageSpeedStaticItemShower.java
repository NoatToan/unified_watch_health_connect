package com.huawei.ui.main.stories.history.view.staticitem;

import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.history.view.BaseStasticItemShower;
import com.huawei.ui.main.stories.history.view.StasticViewType;
import defpackage.jpq;
import defpackage.nub;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes43.dex */
@StasticViewType(getDataType = "AVERAGE_SPEED")
public class AverageSpeedStaticItemShower extends BaseStasticItemShower {
    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower
    public double standardize() {
        if (isDataMapEmpty(this.mItemDataMap)) {
            return 0.0d;
        }
        if (!this.mItemDataMap.containsKey("TOTAL_TIME") || !this.mItemDataMap.containsKey("TOTAL_DISTANCE")) {
            LogUtil.e("Track_BaseStasticItemShower", "mItemDataMap is not containsKey TOTAL_TIME or TOTAL_DISTANCE");
            return 0.0d;
        }
        double dDoubleValue = this.mItemDataMap.get("TOTAL_DISTANCE").doubleValue() / 1000.0d;
        if (dDoubleValue <= 0.0d) {
            return 0.0d;
        }
        double dDoubleValue2 = this.mItemDataMap.get("TOTAL_TIME").doubleValue() / 1000.0d;
        if (dDoubleValue2 <= 0.0d) {
            LogUtil.e("Track_BaseStasticItemShower", "totalTime is invalid");
            return 0.0d;
        }
        if (UnitUtil.f()) {
            dDoubleValue *= 0.6213712d;
        }
        return (float) (dDoubleValue2 / dDoubleValue);
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower
    public String processDataToString(double d) {
        if (d == 0.0d) {
            return "--";
        }
        return jpq.h((float) d);
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower, com.huawei.ui.main.stories.history.view.InterfaceItemDataShower
    public String getUnit() {
        if (UnitUtil.f()) {
            return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_plugin_motion_track_distance_record_unit_mihour, 0, "");
        }
        return BaseApplication.getContext().getResources().getString(com.huawei.ui.main.R.string.IDS_plugin_fitnessadvice_km_per_hour, "");
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower, com.huawei.ui.main.stories.history.view.InterfaceItemDataShower
    public String getMainStaticName() {
        if (nub.c(this.mSportType)) {
            return BaseApplication.getContext().getResources().getString(com.huawei.ui.main.R.string.IDS_hwh_motiontrack_sport_data_average_ski_speed);
        }
        return BaseApplication.getContext().getResources().getString(com.huawei.ui.main.R.string.IDS_motiontrack_show_detail_averagespeed);
    }
}
