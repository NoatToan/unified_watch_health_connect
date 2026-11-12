package com.huawei.basichealthmodel.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import com.huawei.ui.commonui.R;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes23.dex */
public class SleepTaskShareView extends BasicHealthModelShareView {
    public SleepTaskShareView(Context context) {
        super(context);
    }

    public SleepTaskShareView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SleepTaskShareView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setTaskBenefit(int i) {
        if (i == 6) {
            this.e.setVisibility(0);
            this.e.setText(R.string.IDS_getup_regularly_no_data_content);
        } else if (i == 100) {
            String strE = UnitUtil.e(30, 1, 0);
            this.e.setVisibility(0);
            this.e.setText(this.f5363c.getString(R.string.IDS_restrict_naps_no_data, strE, strE));
        } else if (i == 101) {
            this.e.setVisibility(0);
            this.e.setText(this.f5363c.getString(R.string.IDS_regular_work_and_rest_no_data));
        } else {
            this.e.setVisibility(8);
        }
    }

    public void setTaskText(int i, int i2) {
        int i3;
        String string;
        this.i.setVisibility(8);
        if (i == 6) {
            i3 = R.string.IDS_get_up_accumulation;
            string = this.f5363c.getString(com.huawei.basichealthmodel.R.string.IDS_health_model_wake_up);
        } else if (i == 100) {
            i3 = R.string.IDS_limited_nap_accumulation;
            string = this.f5363c.getString(R.string.IDS_restrict_naps);
        } else if (i == 101) {
            i3 = R.string.IDS_regular_work_and_rest_accumulation;
            string = this.f5363c.getString(R.string.IDS_regular_work_and_rest);
        } else {
            string = "";
            i3 = 0;
        }
        this.f5362b.setText(e(this.f5363c.getString(i3, this.f5363c.getQuantityString(R.plurals.IDS_user_profile_achieve_num_day, i2, Integer.valueOf(i2))), string, UnitUtil.e(i2, 1, 0)));
    }
}
