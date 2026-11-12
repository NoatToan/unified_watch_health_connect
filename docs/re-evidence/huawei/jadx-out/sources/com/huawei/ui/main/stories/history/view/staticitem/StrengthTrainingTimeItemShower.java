package com.huawei.ui.main.stories.history.view.staticitem;

import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.history.view.BaseStasticItemShower;
import com.huawei.ui.main.stories.history.view.StasticViewType;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes43.dex */
@StasticViewType(getDataType = "STRENGTH_TRAINING_TIME")
public class StrengthTrainingTimeItemShower extends BaseStasticItemShower {
    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower, com.huawei.ui.main.stories.history.view.InterfaceItemDataShower
    public String getUnit() {
        return BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_detail_fm_heart_min);
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower, com.huawei.ui.main.stories.history.view.InterfaceItemDataShower
    public String getMainStaticName() {
        return BaseApplication.getContext().getResources().getString(R.string.IDS_rowing_machine_strength_training_time);
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower
    public double standardize() {
        if (isDataMapEmpty(this.mItemDataMap)) {
            return 0.0d;
        }
        if (!this.mItemDataMap.containsKey("STRENGTH_TRAINING_TIME")) {
            LogUtil.e("Track_BaseStasticItemShower", "mItemDataMap is not containsKey STRENGTH_TRAINING_TIME");
            return 0.0d;
        }
        Double d = this.mItemDataMap.get("STRENGTH_TRAINING_TIME");
        double dDoubleValue = d.doubleValue();
        LogUtil.a("Track_BaseStasticItemShower", "strengthTrainingTime = ", d);
        return dDoubleValue;
    }

    @Override // com.huawei.ui.main.stories.history.view.BaseStasticItemShower
    public String processDataToString(double d) {
        if (d == 0.0d) {
            return "--";
        }
        return UnitUtil.e(d, 1, 2);
    }
}
