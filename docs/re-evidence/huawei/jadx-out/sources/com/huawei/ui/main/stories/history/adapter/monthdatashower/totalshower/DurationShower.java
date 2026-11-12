package com.huawei.ui.main.stories.history.adapter.monthdatashower.totalshower;

import com.huawei.android.airsharing.api.PlayInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthStatisticViewType;
import defpackage.der;
import defpackage.njy;
import defpackage.vpr;
import defpackage.vrg;
import health.compact.a.UnitUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes43.dex */
@MonthStatisticViewType(type = PlayInfo.KEY_DURATION)
public class DurationShower extends vpr {
    @Override // defpackage.vpr
    public double standardization(double d) {
        return d / 1000.0d;
    }

    @Override // defpackage.vpr, com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower
    public String getMainMonthData() {
        String str;
        ArrayList<String> allRequestString = this.mHwSportTypeInfo.getHistoryList().getAllRequestString(this.mHwSportTypeInfo.getSportTypeId());
        if (njy.e(allRequestString)) {
            return "--";
        }
        if (this.mHwSportTypeInfo.getSportTypeId() != 262) {
            str = allRequestString.get(0);
        } else {
            if (njy.e(allRequestString, 3)) {
                return "--";
            }
            str = allRequestString.get(3);
        }
        if (this.mMonthData != null && this.mMonthData.containsKey(str)) {
            this.mMainData = this.mMonthData.get(str);
            return this.mMainData == null ? "--" : processDataToString(standardization(this.mMainData.doubleValue()));
        }
        return UnitUtil.e(0.0d, 1, 0);
    }

    @Override // defpackage.vpr
    public String processDataToString(double d) {
        return der.a(d);
    }

    @Override // defpackage.vpr, com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower
    public String getUnit() {
        String string;
        if (this.mHwSportTypeInfo == null) {
            LogUtil.e(vpr.TAG, "DurationShower mHwSportTypeInfo is null");
            return "";
        }
        if (vrg.b(this.mHwSportTypeInfo.getSportTypeId(), this.mContext) == null) {
            LogUtil.e(vpr.TAG, "DurationShower getSportTypeString(mHwSportTypeInfo.getSportTypeId(), mContext) == null");
            return "";
        }
        if (this.mMainData.doubleValue() < 60000.0d) {
            string = this.mContext.getResources().getString(R.string.IDS_second);
        } else if (this.mMainData.doubleValue() < 3600000.0d) {
            string = this.mContext.getResources().getString(R.string.IDS_messagecenter_time_minute_value);
        } else {
            string = this.mContext.getResources().getString(R.string.IDS_hw_show_main_home_page_hours);
        }
        return this.mContext.getResources().getString(R.string.IDS_motiontrack_history_all_unit, vrg.b(this.mHwSportTypeInfo.getSportTypeId(), this.mContext), string);
    }
}
