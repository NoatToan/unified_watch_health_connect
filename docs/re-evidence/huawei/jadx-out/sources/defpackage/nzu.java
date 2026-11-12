package defpackage;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.magnet.RealTimeDynamicChartView;
import com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes12.dex */
public class nzu extends BaseRealTimeDynamicChartViewModel {
    public nzu(RealTimeDynamicChartView realTimeDynamicChartView) {
        super(realTimeDynamicChartView);
    }

    @Override // com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel
    public void pushNewData(int i) {
        String strE;
        float f = i;
        float fC = UnitUtil.f() ? (int) UnitUtil.c(f / 5.0f, 2) : f;
        if (i > 0) {
            strE = izn.a(fC);
        } else {
            strE = izn.e(BaseApplication.getContext());
        }
        this.mRealTimeDynamicChartView.setValue(strE);
        super.pushNewData(i > 0 ? 5000.0f / f : 0.0f);
    }

    @Override // com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel
    public void updateConfiguration(Context context) {
        if (this.mRealTimeDynamicChartView == null) {
            LogUtil.e("PaceViewModel", "updateConfiguration() ", "mRealTimeDynamicChartView is null");
            return;
        }
        super.updateConfiguration(context);
        this.mRealTimeDynamicChartView.setTitle(R.string.IDS_motiontrack_show_map_sport_peisu_1);
        LogUtil.a("PaceViewModel", "Pace setUnit ");
        if (UnitUtil.f()) {
            LogUtil.a("PaceViewModel", "Pace is :100yards");
            setChartViewTitle(String.format(context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit_mi, 100, 100), new Object[0]), context.getString(R.string.IDS_motiontrack_show_map_sport_peisu_1));
        } else {
            setChartViewTitle(String.format(context.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_pace_unit, 500, 500), new Object[0]), context.getString(R.string.IDS_motiontrack_show_map_sport_peisu_1));
        }
    }

    @Override // com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel
    public void setDefaultOrdinateY() {
        if (this.mRealTimeDynamicChartView != null) {
            this.mRealTimeDynamicChartView.setOrdinateY(0, 50);
        }
    }
}
