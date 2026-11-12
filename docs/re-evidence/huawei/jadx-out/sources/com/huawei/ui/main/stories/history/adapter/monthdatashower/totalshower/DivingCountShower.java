package com.huawei.ui.main.stories.history.adapter.monthdatashower.totalshower;

import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthStatisticViewType;

/* JADX INFO: loaded from: classes43.dex */
@MonthStatisticViewType(type = "DIVING_COUNT")
public class DivingCountShower extends TimesShower {
    @Override // com.huawei.ui.main.stories.history.adapter.monthdatashower.totalshower.TimesShower, defpackage.vpr, com.huawei.ui.main.stories.history.adapter.monthdatashower.MonthDataShower
    public String getUnit() {
        if (this.mContext == null) {
            return "";
        }
        return this.mContext.getResources().getString(R.string.IDS_diving_time);
    }
}
