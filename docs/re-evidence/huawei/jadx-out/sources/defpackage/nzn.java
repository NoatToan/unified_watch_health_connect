package defpackage;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.magnet.RealTimeDynamicChartView;
import com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel;

/* JADX INFO: loaded from: classes12.dex */
public class nzn extends BaseRealTimeDynamicChartViewModel {
    public nzn(RealTimeDynamicChartView realTimeDynamicChartView) {
        super(realTimeDynamicChartView);
    }

    @Override // com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel
    public void pushNewData(float f) {
        if (f > 30.0f) {
            f = 30.0f;
        }
        if (this.mRealTimeDynamicChartView == null) {
            LogUtil.e("GroundShockPeakViewModel", "pushNewData() ", "mRealTimeDynamicChartView is null");
            return;
        }
        this.mRealTimeDynamicChartView.setValue(nzc.b(f, 1, 1));
        super.pushNewData(f);
        if (nzc.b("ground shock peak", (int) f, this.mCurrentSpeed) == 2) {
            this.mRealTimeDynamicChartView.e();
        } else {
            this.mRealTimeDynamicChartView.d();
        }
    }

    @Override // com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel
    public void updateConfiguration(Context context) {
        if (this.mRealTimeDynamicChartView == null) {
            LogUtil.e("GroundShockPeakViewModel", "updateConfiguration() ", "mRealTimeDynamicChartView is null");
            return;
        }
        super.updateConfiguration(context);
        this.mRealTimeDynamicChartView.setValue(nzc.b(0.0d, 1, 1));
        setChartViewTitle(context.getString(R.string.IDS_bolt_shock_peak_unit), context.getString(R.string.IDS_bolt_shock_peak));
    }

    @Override // com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel
    public void setDefaultOrdinateY() {
        if (this.mRealTimeDynamicChartView != null) {
            this.mRealTimeDynamicChartView.setOrdinateY(0, 30);
        }
    }
}
