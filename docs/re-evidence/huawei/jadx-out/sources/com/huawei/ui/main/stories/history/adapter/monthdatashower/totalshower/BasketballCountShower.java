package com.huawei.ui.main.stories.history.adapter.monthdatashower.totalshower;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthStatisticViewType;
import defpackage.vpr;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes43.dex */
@MonthStatisticViewType(type = "BASKETBALL_COUNT")
public class BasketballCountShower extends vpr {
    private static final String TAG = "Track_BasketballCountShower";

    @Override // defpackage.vpr
    public double standardization(double d) {
        LogUtil.a(TAG, "processDataToString BasketballCountShower");
        return d;
    }

    @Override // defpackage.vpr
    public String processDataToString(double d) {
        LogUtil.a(TAG, "processDataToString BasketballCountShower");
        return UnitUtil.e(d, 1, 0);
    }

    @Override // defpackage.vpr, com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower
    public String getUnit() {
        if (this.mContext == null) {
            LogUtil.e(TAG, "BasketballCountShower  mContext is null");
            return "";
        }
        return this.mContext.getResources().getString(R.string.IDS_aw_version2_basketball_with_unit);
    }
}
