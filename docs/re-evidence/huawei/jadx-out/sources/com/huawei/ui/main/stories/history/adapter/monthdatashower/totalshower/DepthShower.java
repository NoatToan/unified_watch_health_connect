package com.huawei.ui.main.stories.history.adapter.monthdatashower.totalshower;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthStatisticViewType;
import defpackage.vpr;
import health.compact.a.UnitUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes43.dex */
@MonthStatisticViewType(type = "DEPTH")
public class DepthShower extends vpr {
    private static final int DMTOM = 10;

    @Override // defpackage.vpr, com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower
    public String getUnit() {
        if (this.mContext == null) {
            LogUtil.e(vpr.TAG, "DepthShower mContext is null");
            return "";
        }
        return this.mContext.getResources().getString(UnitUtil.f() ? R.string.IDS_motiontrack_history_max_deep_inch_unit : R.string.IDS_motiontrack_history_max_deep_unit);
    }

    @Override // defpackage.vpr, com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower
    public String getMainMonthData() {
        ArrayList<String> trackRequestDataBase = this.mHwSportTypeInfo.getHistoryList().getTrackRequestDataBase(this.mHwSportTypeInfo.getSportTypeId());
        if (trackRequestDataBase == null || trackRequestDataBase.size() < 1 || this.mMonthData == null || !this.mMonthData.containsKey(trackRequestDataBase.get(0))) {
            return "---";
        }
        this.mMainData = this.mMonthData.get(trackRequestDataBase.get(0));
        if (this.mMainData == null) {
            return "---";
        }
        return processDataToString(standardization(this.mMainData.doubleValue()));
    }

    @Override // defpackage.vpr
    public String processDataToString(double d) {
        LogUtil.a(vpr.TAG, "processDataToString", Double.valueOf(d));
        return UnitUtil.e(UnitUtil.f() ? UnitUtil.c(d / 10.0d, 1) : d / 10.0d, 1, 1);
    }
}
