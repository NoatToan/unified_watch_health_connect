package com.huawei.openalliance.ad.views;

import android.content.Context;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.utils.as;

/* JADX INFO: loaded from: classes12.dex */
public class ac extends AppDownloadButtonStyle {
    public ac(Context context) {
        super(context);
        this.normalStyle.setBackground(context.getResources().getDrawable(as.n(context) ? R.drawable.hiad_extand_landing_app_down_btn_pre_scan_elderly : R.drawable.hiad_extand_landing_app_down_btn_pre_scan));
        this.normalStyle.setTextColor(context.getResources().getColor(R.color.hiad_emui_accent));
    }
}
