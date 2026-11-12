package com.huawei.ui.main.stories.history.view.staticitem;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.view.BaseStasticItemShower;
import com.huawei.ui.main.stories.history.view.StasticViewType;
import defpackage.der;
import defpackage.nub;

/* JADX INFO: loaded from: classes43.dex */
@StasticViewType(getDataType = "TOTAL_TIME")
public class TimeStaticItemShower extends BaseStasticItemShower {
    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower, com.huawei.ui.main.stories.history.view.InterfaceItemDataShower
    public String getUnit() {
        if (isDataMapEmpty(this.mItemDataMap)) {
            return "--";
        }
        return der.c(this.mItemDataMap.get("TOTAL_TIME").doubleValue());
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower, com.huawei.ui.main.stories.history.view.InterfaceItemDataShower
    public String getMainStaticName() {
        if (nub.c(this.mSportType)) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_total_ski_time);
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_total_duration);
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower
    public double standardize() {
        if (isDataMapEmpty(this.mItemDataMap)) {
            return 0.0d;
        }
        if (!this.mItemDataMap.containsKey("TOTAL_TIME")) {
            LogUtil.e("Track_BaseStasticItemShower", "mItemDataMap is not containsKey TOTAL_TIME");
            return 0.0d;
        }
        return this.mItemDataMap.get("TOTAL_TIME").doubleValue() / 1000.0d;
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower
    public String processDataToString(double d) {
        if (d == 0.0d) {
            return "--";
        }
        return der.a(d);
    }
}
