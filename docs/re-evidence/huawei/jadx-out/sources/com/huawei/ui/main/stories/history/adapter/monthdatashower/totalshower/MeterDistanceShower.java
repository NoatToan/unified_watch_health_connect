package com.huawei.ui.main.stories.history.adapter.monthdatashower.totalshower;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthStatisticViewType;
import defpackage.vpr;
import defpackage.vrg;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes43.dex */
@MonthStatisticViewType(type = "METER_DISTANCE")
public class MeterDistanceShower extends vpr {
    private static final String TAG = "Track_MeterDistanceShower";

    @Override // defpackage.vpr
    public double standardization(double d) {
        LogUtil.a(TAG, "processDataToString Meter standardization");
        return d;
    }

    @Override // defpackage.vpr
    public String processDataToString(double d) {
        LogUtil.a(TAG, "processDataToString MeterDistanceShower standardization");
        if (UnitUtil.f()) {
            double dE = UnitUtil.e(d, 2);
            if (dE < 0.005d) {
                return "--";
            }
            return UnitUtil.e(dE, 1, 0);
        }
        return UnitUtil.e(d, 1, 0);
    }

    @Override // defpackage.vpr, com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower
    public String getUnit() {
        if (this.mHwSportTypeInfo == null) {
            LogUtil.e(TAG, "mHwSportTypeInfo is null");
            return "";
        }
        if (vrg.b(this.mHwSportTypeInfo.getSportTypeId(), this.mContext) == null) {
            LogUtil.e(TAG, "MeterDistanceShower TrackSportHistoryUtils.getSportTypeString(mHwSportTypeInfo.getSportTypeId(), mContext) == null");
            return "";
        }
        if (UnitUtil.f()) {
            return this.mContext.getResources().getString(R.string.IDS_motiontrack_history_all_unit, vrg.b(this.mHwSportTypeInfo.getSportTypeId(), this.mContext), this.mContext.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_unit_yd, 100));
        }
        return this.mContext.getResources().getString(R.string.IDS_motiontrack_history_all_unit, vrg.b(this.mHwSportTypeInfo.getSportTypeId(), this.mContext), this.mContext.getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit));
    }
}
