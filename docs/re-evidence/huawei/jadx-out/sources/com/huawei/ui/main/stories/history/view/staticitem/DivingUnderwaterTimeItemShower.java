package com.huawei.ui.main.stories.history.view.staticitem;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.view.BaseStasticItemShower;
import com.huawei.ui.main.stories.history.view.StasticViewType;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes43.dex */
@StasticViewType(getDataType = "TOTAL_DIVING_UNDERWATER_TIME")
public class DivingUnderwaterTimeItemShower extends BaseStasticItemShower {
    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower
    public double standardize() {
        if (isDataMapEmpty(this.mItemDataMap)) {
            return 0.0d;
        }
        if (!this.mItemDataMap.containsKey("TOTAL_DIVING_UNDERWATER_TIME")) {
            LogUtil.j("Track_BaseStasticItemShower", "mItemDataMap is not containsKey TOTAL_DIVING_UNDERWATER_TIME");
            return 0.0d;
        }
        return this.mItemDataMap.get("TOTAL_DIVING_UNDERWATER_TIME").doubleValue();
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower
    public String processDataToString(double d) {
        if (d == 0.0d) {
            return "--";
        }
        return UnitUtil.e(d, 1, 0);
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower, com.huawei.ui.main.stories.history.view.InterfaceItemDataShower
    public String getUnit() {
        return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_diving_times, (int) standardize(), "");
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower, com.huawei.ui.main.stories.history.view.InterfaceItemDataShower
    public String getMainStaticName() {
        return BaseApplication.getContext().getResources().getString(R.string.IDS_diving_underwater_time);
    }
}
