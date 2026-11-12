package com.huawei.ui.main.stories.history.adapter.monthdatashower.totalshower;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthStatisticViewType;
import defpackage.vpr;

/* JADX INFO: loaded from: classes43.dex */
@MonthStatisticViewType(type = "FIRST_DURATION")
public class FirstDurationShower extends DurationShower {
    @Override // com.huawei.ui.main.stories.history.adapter.monthdatashower.totalshower.DurationShower, defpackage.vpr, com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower
    public String getUnit() {
        if (this.mContext == null) {
            LogUtil.e(vpr.TAG, "FirstDurationShower  mContext is null");
            return "";
        }
        return this.mContext.getResources().getString(R.string.IDS_motiontrack_history_sum_catetory_time_unit_min);
    }
}
