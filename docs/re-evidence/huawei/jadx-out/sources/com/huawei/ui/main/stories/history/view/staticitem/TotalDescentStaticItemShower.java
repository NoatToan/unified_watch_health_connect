package com.huawei.ui.main.stories.history.view.staticitem;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.view.BaseStasticItemShower;
import com.huawei.ui.main.stories.history.view.StasticViewType;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes43.dex */
@StasticViewType(getDataType = "TOTAL_DESCENT")
public class TotalDescentStaticItemShower extends BaseStasticItemShower {
    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower
    public double standardize() {
        if (isDataMapEmpty(this.mItemDataMap)) {
            return 0.0d;
        }
        if (!this.mItemDataMap.containsKey("TOTAL_DESCENT")) {
            LogUtil.j("Track_BaseStasticItemShower", "mItemDataMap is not containsKey TOTAL_DESCENT");
            return 0.0d;
        }
        return this.mItemDataMap.get("TOTAL_DESCENT").doubleValue();
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower
    public String processDataToString(double d) {
        if (Math.abs(d - 0.0d) < 9.999999974752427E-7d) {
            return "0.0";
        }
        if (UnitUtil.f()) {
            return UnitUtil.e(UnitUtil.e(d / 10.0d, 1), 1, 1);
        }
        return UnitUtil.e(d / 10.0d, 1, 1);
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower, com.huawei.ui.main.stories.history.view.InterfaceItemDataShower
    public String getUnit() {
        if (UnitUtil.f()) {
            return BaseApplication.getContext().getResources().getString(R.string.IDS_ft);
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit);
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower, com.huawei.ui.main.stories.history.view.InterfaceItemDataShower
    public String getMainStaticName() {
        return BaseApplication.getContext().getResources().getString(R.string.IDS_track_total_descent);
    }
}
