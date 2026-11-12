package com.huawei.ui.main.stories.history.adapter.monthdatashower.totalshower;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthStatisticViewType;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes43.dex */
@MonthStatisticViewType(type = "FIRST_DISTANCE")
public class FirstDistanceShower extends DistanceShower {
    private static final String TAG = "Track_FirstDistanceShower";

    @Override // com.huawei.ui.main.stories.history.adapter.monthdatashower.totalshower.DistanceShower, defpackage.vpr, com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower
    public String getUnit() {
        if (this.mContext == null) {
            LogUtil.e(TAG, "FirstDistanceShower  mContext is null");
            return "";
        }
        if (UnitUtil.f()) {
            return this.mContext.getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_mi);
        }
        return this.mContext.getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_km);
    }
}
