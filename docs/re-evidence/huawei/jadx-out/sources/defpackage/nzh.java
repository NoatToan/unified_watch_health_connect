package defpackage;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.magnet.RealTimeDynamicChartView;
import com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel;

/* JADX INFO: loaded from: classes12.dex */
public class nzh extends BaseRealTimeDynamicChartViewModel {
    public nzh(RealTimeDynamicChartView realTimeDynamicChartView) {
        super(realTimeDynamicChartView);
    }

    @Override // com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel
    public void pushNewData(int i) {
        int i2 = i <= 1200 ? i : 1200;
        if (this.mRealTimeDynamicChartView == null) {
            LogUtil.e("GroundContactTimeViewModel", "pushNewData() ", "mRealTimeDynamicChartView is null");
            return;
        }
        double d = i2;
        this.mRealTimeDynamicChartView.setValue(nzc.b(d, 1, 0));
        LogUtil.a("GroundContactTimeViewModel", "pushNewData", nzc.b(d, 1, 0));
        super.pushNewData(i);
        if (nzc.b("touch time", i2, this.mCurrentSpeed) == 2) {
            this.mRealTimeDynamicChartView.e();
        } else {
            this.mRealTimeDynamicChartView.d();
        }
    }

    @Override // com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel
    public void updateConfiguration(Context context) {
        if (this.mRealTimeDynamicChartView == null) {
            LogUtil.e("GroundContactTimeViewModel", "updateConfiguration() ", "mRealTimeDynamicChartView is null");
        } else {
            super.updateConfiguration(context);
            setChartViewTitle(context.getResources().getQuantityString(R.plurals.ie_unit_ms, 2, ""), context.getString(R.string.ie_touchdown_time));
        }
    }

    @Override // com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel
    public void setDefaultOrdinateY() {
        if (this.mRealTimeDynamicChartView != null) {
            this.mRealTimeDynamicChartView.setOrdinateY(0, 1200);
        }
    }
}
