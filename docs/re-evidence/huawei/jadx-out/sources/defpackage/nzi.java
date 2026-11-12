package defpackage;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.magnet.RealTimeDynamicChartView;
import com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel;

/* JADX INFO: loaded from: classes12.dex */
public class nzi extends BaseRealTimeDynamicChartViewModel {
    public nzi(RealTimeDynamicChartView realTimeDynamicChartView) {
        super(realTimeDynamicChartView);
    }

    @Override // com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel
    public void pushNewData(int i) {
        if (i > 30) {
            i = 30;
        }
        if (this.mRealTimeDynamicChartView == null) {
            LogUtil.e("Track_GroundImpactViewModel", "pushNewData() ", "mRealTimeDynamicChartView is null");
            return;
        }
        double d = i;
        this.mRealTimeDynamicChartView.setValue(nzc.b(d, 1, 0));
        LogUtil.a("Track_GroundImpactViewModel", "pushNewData", nzc.b(d, 1, 0));
        super.pushNewData(i);
        if (nzc.b("ground impact", i, this.mCurrentSpeed) == 2) {
            this.mRealTimeDynamicChartView.e();
        } else {
            this.mRealTimeDynamicChartView.d();
        }
    }

    @Override // com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel
    public void updateConfiguration(Context context) {
        if (this.mRealTimeDynamicChartView == null) {
            LogUtil.e("Track_GroundImpactViewModel", "updateConfiguration() ", "mRealTimeDynamicChartView is null");
        } else {
            super.updateConfiguration(context);
            setChartViewTitle(context.getString(R.string.IDS_gravity_unit), context.getString(R.string.ie_ground_impact));
        }
    }

    @Override // com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel
    public void setDefaultOrdinateY() {
        if (this.mRealTimeDynamicChartView != null) {
            this.mRealTimeDynamicChartView.setOrdinateY(0, 30);
        }
    }
}
