package com.huawei.ui.main.stories.history.view.staticitem;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.view.BaseStasticItemShower;
import com.huawei.ui.main.stories.history.view.StasticViewType;
import defpackage.izn;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes43.dex */
@StasticViewType(getDataType = "AVERAGE_PACE")
public class AveragePaceStaticItemShower extends BaseStasticItemShower {
    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower
    public double standardize() {
        double d;
        if (isDataMapEmpty(this.mItemDataMap)) {
            return 0.0d;
        }
        if (!this.mItemDataMap.containsKey("TOTAL_TIME") || !this.mItemDataMap.containsKey("TOTAL_DISTANCE")) {
            LogUtil.e("Track_BaseStasticItemShower", "mItemDataMap is not containsKey TOTAL_TIME or TOTAL_DISTANCE");
            return 0.0d;
        }
        double dDoubleValue = this.mItemDataMap.get("TOTAL_DISTANCE").doubleValue() / 1000.0d;
        double dDoubleValue2 = this.mItemDataMap.get("TOTAL_TIME").doubleValue() / 1000.0d;
        double dDoubleValue3 = this.mItemDataMap.get("TOTAL_DISTANCE").doubleValue();
        LogUtil.d("Track_BaseStasticItemShower", "AveragePaceStaticItemShower  distance =", Double.valueOf(dDoubleValue));
        if (UnitUtil.f()) {
            if (this.mSportType == 262) {
                if (dDoubleValue3 <= 0.0d) {
                    LogUtil.e("Track_BaseStasticItemShower", "distance value is  invalied");
                    return 0.0d;
                }
                dDoubleValue3 *= 1.0936000347137451d;
                d = (dDoubleValue2 / dDoubleValue3) * 100.0d;
            } else {
                if (dDoubleValue2 <= 0.0d || dDoubleValue <= 0.0d) {
                    LogUtil.e("Track_BaseStasticItemShower", " distance value is  invalied");
                    return 0.0d;
                }
                dDoubleValue *= 0.6213712d;
                d = dDoubleValue2 / dDoubleValue;
            }
        } else if (this.mSportType == 262) {
            if (dDoubleValue3 <= 0.0d) {
                LogUtil.e("Track_BaseStasticItemShower", "buildTotalAveragePaceItem  distance value is  invalied");
                return 0.0d;
            }
            d = (dDoubleValue2 / dDoubleValue3) * 100.0d;
        } else {
            if (dDoubleValue2 <= 0.0d || dDoubleValue <= 0.0d) {
                LogUtil.e("Track_BaseStasticItemShower", "buildTotalAveragePaceItem  distance value is  invalied");
                return 0.0d;
            }
            d = dDoubleValue2 / dDoubleValue;
        }
        return (float) d;
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower
    public String processDataToString(double d) {
        if (d == 0.0d) {
            return "--";
        }
        return izn.a((float) d);
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower, com.huawei.ui.main.stories.history.view.InterfaceItemDataShower
    public String getMainStaticName() {
        return BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_detail_avragepace);
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower, com.huawei.ui.main.stories.history.view.InterfaceItemDataShower
    public String getUnit() {
        if (UnitUtil.f()) {
            if (this.mSportType == 262) {
                return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit_mi, 100, 100);
            }
            return "/" + BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_sport_unit_mi);
        }
        if (this.mSportType == 262) {
            return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 100, 100);
        }
        return "/" + BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_sport_unit_km);
    }
}
