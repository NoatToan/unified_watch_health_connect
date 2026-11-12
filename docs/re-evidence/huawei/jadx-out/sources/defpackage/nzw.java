package defpackage;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.magnet.RealTimeDynamicChartView;
import com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel;

/* JADX INFO: loaded from: classes12.dex */
public class nzw extends BaseRealTimeDynamicChartViewModel {
    public nzw(RealTimeDynamicChartView realTimeDynamicChartView) {
        super(realTimeDynamicChartView);
    }

    @Override // com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel
    public void pushNewData(int i) {
        if (this.mRealTimeDynamicChartView == null) {
            LogUtil.e("StepFrequencyViewModel", "pushNewData() ", "mRealTimeDynamicChartView is null");
            return;
        }
        int i2 = i <= 270 ? i : 270;
        if (i2 <= 0) {
            this.mRealTimeDynamicChartView.setValue(BaseApplication.getContext().getString(R.string.ie_motiontrack_detail_pace_default));
        } else {
            this.mRealTimeDynamicChartView.setValue(nzc.b(i2, 1, 0));
        }
        super.pushNewData(i);
        if (nzc.b("step frequency", i2, this.mCurrentSpeed) == 1) {
            this.mRealTimeDynamicChartView.b();
        } else {
            this.mRealTimeDynamicChartView.d();
        }
    }

    @Override // com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel
    public void updateConfiguration(Context context) {
        if (this.mRealTimeDynamicChartView == null) {
            LogUtil.e("StepFrequencyViewModel", "updateConfiguration() ", "mRealTimeDynamicChartView is null");
        } else {
            super.updateConfiguration(context);
            this.mRealTimeDynamicChartView.setTitle(R.string.IDS_fitness_equipment_cadence);
        }
    }

    @Override // com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel
    public void setDefaultOrdinateY() {
        if (this.mRealTimeDynamicChartView != null) {
            this.mRealTimeDynamicChartView.setOrdinateY(0, 270);
        }
    }
}
