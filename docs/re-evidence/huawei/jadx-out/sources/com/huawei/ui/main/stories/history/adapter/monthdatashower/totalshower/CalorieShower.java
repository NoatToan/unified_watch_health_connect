package com.huawei.ui.main.stories.history.adapter.monthdatashower.totalshower;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthStatisticViewType;
import defpackage.vpr;
import health.compact.a.UnitUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes43.dex */
@MonthStatisticViewType(type = "CALORIE")
public class CalorieShower extends vpr {
    private static final int CALORIE_INDEX = 1;
    private static final String TAG = "Track_CalorieShower";

    @Override // defpackage.vpr
    public double standardization(double d) {
        return d / 1000.0d;
    }

    @Override // defpackage.vpr, com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower
    public String getMainMonthData() {
        ArrayList<String> trackRequestDataBase = this.mHwSportTypeInfo.getHistoryList().getTrackRequestDataBase(this.mHwSportTypeInfo.getSportTypeId());
        if (trackRequestDataBase == null || trackRequestDataBase.size() < 2 || trackRequestDataBase.get(1) == null) {
            return "--";
        }
        if (this.mMonthData != null && this.mMonthData.containsKey(trackRequestDataBase.get(1))) {
            this.mMainData = this.mMonthData.get(trackRequestDataBase.get(1));
            if (this.mMainData == null) {
                return "--";
            }
            return processDataToString(standardization(this.mMainData.doubleValue()));
        }
        return UnitUtil.e(0.0d, 1, 0);
    }

    @Override // defpackage.vpr
    public String processDataToString(double d) {
        LogUtil.a(TAG, "processDataToString father");
        return UnitUtil.e(d, 1, 0);
    }

    @Override // defpackage.vpr, com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower
    public String getUnit() {
        if (this.mContext == null) {
            LogUtil.e(TAG, "CalorieShower  mContext is null");
            return "";
        }
        return this.mContext.getResources().getString(R.string.IDS_track_total_calorie_kcal);
    }
}
