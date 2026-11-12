package com.huawei.openalliance.ad.views;

import android.content.Context;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.utils.dr;

/* JADX INFO: loaded from: classes41.dex */
public class LandingAppDownloadButtonStyle extends AppDownloadButtonStyle {
    public LandingAppDownloadButtonStyle(Context context) {
        super(context);
        this.normalStyle.setBackground(context.getResources().getDrawable(R.drawable.hiad_landing_app_down_btn_normal));
        this.normalStyle.setTextColor(context.getResources().getColor(R.color.hiad_emui_white));
        this.processingStyle.setBackground(dr.b(context, R.drawable.hiad_app_down_btn_processing));
        this.processingStyle.setTextColor(context.getResources().getColor(R.color.hiad_app_down_processing_landing_page_text));
    }
}
