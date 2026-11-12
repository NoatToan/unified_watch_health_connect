package com.huawei.ui.main.stories.history.view.staticitem;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.view.BaseStasticItemShower;
import com.huawei.ui.main.stories.history.view.StasticViewType;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes43.dex */
@StasticViewType(getDataType = "TOTAL_SKIP_ROPE_NUMBERS")
public class SkipRopeNumberItemShower extends BaseStasticItemShower {
    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower
    public double standardize() {
        if (isDataMapEmpty(this.mItemDataMap)) {
            return 0.0d;
        }
        if (!this.mItemDataMap.containsKey("TOTAL_SKIP_ROPE_NUMBERS")) {
            LogUtil.e("Track_BaseStasticItemShower", "mItemDataMap is not containsKey TOTAL_SKIP_ROPE_NUMBERS");
            return 0.0d;
        }
        return this.mItemDataMap.get("TOTAL_SKIP_ROPE_NUMBERS").doubleValue();
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower
    public String processDataToString(double d) {
        LogUtil.d("Track_BaseStasticItemShower", "total rope number =", Double.valueOf(d));
        if (d == 0.0d) {
            return "--";
        }
        return UnitUtil.e(d, 1, 0);
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower, com.huawei.ui.main.stories.history.view.InterfaceItemDataShower
    public String getMainStaticName() {
        return BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_motiontrack_sport_data_total_rope_number);
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower, com.huawei.ui.main.stories.history.view.InterfaceItemDataShower
    public String getUnit() {
        if (isDataMapEmpty(this.mItemDataMap) || !this.mItemDataMap.containsKey("TOTAL_SKIP_ROPE_NUMBERS")) {
            return "--";
        }
        return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, (int) this.mItemDataMap.get("TOTAL_SKIP_ROPE_NUMBERS").doubleValue(), "");
    }
}
