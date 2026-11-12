package defpackage;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.magnet.RealTimeDynamicChartView;
import com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel;

/* JADX INFO: loaded from: classes12.dex */
public class nzq extends BaseRealTimeDynamicChartViewModel {
    private final String d;

    public nzq(RealTimeDynamicChartView realTimeDynamicChartView, String str) {
        super(realTimeDynamicChartView);
        this.d = str;
    }

    @Override // com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel
    public void pushNewData(float f) {
        String strE;
        if (f > 0.0f) {
            strE = nzc.b(f, 1, 0);
        } else {
            strE = izn.e(BaseApplication.getContext());
        }
        this.mRealTimeDynamicChartView.setValue(strE);
        super.pushNewData(f);
    }

    @Override // com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel
    public void updateConfiguration(Context context) {
        String string;
        if (this.mRealTimeDynamicChartView == null) {
            LogUtil.e("PaddleFrequencyViewModle", "updateConfiguration() ", "mRealTimeDynamicChartView is null");
            return;
        }
        super.updateConfiguration(context);
        String string2 = context.getString(R.string.IDS_indoor_equip_paddle_unit_times_minute);
        if (this.d.equals("291")) {
            string = context.getString(R.string.IDS_rowing_machine_action_frequency);
        } else {
            string = context.getString(R.string.IDS_indoor_equip_paddle_frequency);
        }
        setChartViewTitle(string2, string);
    }

    @Override // com.huawei.indoorequip.viewmodel.BaseRealTimeDynamicChartViewModel
    public void setDefaultOrdinateY() {
        if (this.mRealTimeDynamicChartView != null) {
            this.mRealTimeDynamicChartView.setOrdinateY(0, 60);
        }
    }
}
