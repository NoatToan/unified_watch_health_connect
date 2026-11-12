package defpackage;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.magnet.RealTimeDynamicChartView;
import com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes12.dex */
public class nzv extends BaseRealTimeDynamicChartViewModel {
    public nzv(RealTimeDynamicChartView realTimeDynamicChartView) {
        super(realTimeDynamicChartView);
    }

    @Override // com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel
    public void pushNewData(float f) {
        String strE;
        float fE = UnitUtil.f() ? (float) UnitUtil.e(f, 3) : f;
        if (f > 0.0f) {
            strE = nzc.b(fE, 1, 1);
        } else {
            strE = izn.e(BaseApplication.getContext());
        }
        this.mRealTimeDynamicChartView.setValue(strE);
        super.pushNewData(f);
    }

    @Override // com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel
    public void updateConfiguration(Context context) {
        if (this.mRealTimeDynamicChartView == null) {
            LogUtil.e("SpeedViewModel", "updateConfiguration() ", "mRealTimeDynamicChartView is null");
            return;
        }
        super.updateConfiguration(context);
        if (UnitUtil.f()) {
            setChartViewTitle(context.getString(R.string.IDS_motiontrack_show_detail_average_speed_imp), context.getString(R.string.IDS_motiontrack_show_sport_tip_icon_text_pace));
        } else {
            setChartViewTitle(context.getString(R.string.IDS_motiontrack_show_detail_average_speed), context.getString(R.string.IDS_motiontrack_show_sport_tip_icon_text_pace));
        }
    }

    @Override // com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel
    public void setDefaultOrdinateY() {
        if (this.mRealTimeDynamicChartView != null) {
            this.mRealTimeDynamicChartView.setOrdinateY(0, 12);
        }
    }
}
