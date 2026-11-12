package com.huawei.ui.main.stories.history.adapter.monthdatashower.totalshower;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthStatisticViewType;
import defpackage.vpr;
import health.compact.a.UnitUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes43.dex */
@MonthStatisticViewType(type = "WATER_DURATION")
public class WaterDuration extends vpr {
    @Override // defpackage.vpr
    public double standardization(double d) {
        return d;
    }

    @Override // defpackage.vpr, com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower
    public String getUnit() {
        if (this.mContext == null) {
            LogUtil.j(vpr.TAG, "WaterDuration mContext is null");
            return "";
        }
        return this.mContext.getResources().getString(R.string.IDS_motiontrack_history_sum_time_unit);
    }

    @Override // defpackage.vpr, com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower
    public String getMainMonthData() {
        ArrayList<String> trackRequestDataBase = this.mHwSportTypeInfo.getHistoryList().getTrackRequestDataBase(this.mHwSportTypeInfo.getSportTypeId());
        if (trackRequestDataBase == null || trackRequestDataBase.size() < 2 || this.mMonthData == null || !this.mMonthData.containsKey(trackRequestDataBase.get(1))) {
            return "---";
        }
        this.mMainData = this.mMonthData.get(trackRequestDataBase.get(1));
        if (this.mMainData == null) {
            return "---";
        }
        return processDataToString(standardization(this.mMainData.doubleValue()));
    }

    @Override // defpackage.vpr
    public String processDataToString(double d) {
        LogUtil.a(vpr.TAG, "processDataToString", Double.valueOf(d));
        return UnitUtil.e(d / 60.0d, 1, 2);
    }
}
