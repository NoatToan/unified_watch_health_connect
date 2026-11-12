package com.huawei.openalliance.ad.views;

import android.content.Context;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dr;

/* JADX INFO: loaded from: classes12.dex */
public class ExtandAppDownloadButtonStyle extends AppDownloadButtonStyle {
    public ExtandAppDownloadButtonStyle(Context context) {
        super(context);
        boolean zN = as.n(context);
        this.normalStyle.setBackground(context.getResources().getDrawable(zN ? R.drawable.hiad_extand_landing_app_down_btn_normal_elderly : R.drawable.hiad_extand_landing_app_down_btn_normal));
        this.normalStyle.setTextColor(context.getResources().getColor(R.color.hiad_down_btn_white));
        this.processingStyle.setBackground(dr.b(context, zN ? R.drawable.hiad_extand_app_down_btn_processing_elderly : R.drawable.hiad_extand_app_down_btn_processing));
        this.processingStyle.setTextColor(context.getResources().getColor(R.color.hiad_emui_black));
        this.installingStyle.setBackground(context.getResources().getDrawable(zN ? R.drawable.hiad_extand_app_down_btn_installing_elderly : R.drawable.hiad_extand_app_down_btn_installing));
        this.installingStyle.setTextColor(context.getResources().getColor(R.color.hiad_app_down_installing_text));
        this.f20742a.setBackground(context.getResources().getDrawable(zN ? R.drawable.hiad_linked_app_down_btn_installing_elderly : R.drawable.hiad_linked_app_down_btn_installing));
        this.f20742a.setTextColor(context.getResources().getColor(R.color.hiad_emui_white));
    }
}
