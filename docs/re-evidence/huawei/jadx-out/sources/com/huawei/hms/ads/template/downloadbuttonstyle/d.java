package com.huawei.hms.ads.template.downloadbuttonstyle;

import android.content.Context;
import android.content.res.Resources;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import com.huawei.openalliance.ad.views.ExtandAppDownloadButtonStyleHm;

/* JADX INFO: loaded from: classes10.dex */
public class d extends com.huawei.hms.ads.template.downloadbuttonstyle.a {
    @Override // com.huawei.hms.ads.template.downloadbuttonstyle.a
    protected void b(Context context) {
        AppDownloadButton appDownloadButton = this.f12838c.get();
        if (appDownloadButton == null) {
            hw.b("IconDwnButtonStyle", "btn is null");
            return;
        }
        appDownloadButton.setMinWidth((int) context.getResources().getDimension(R.dimen.hiad_56_dp));
        appDownloadButton.setMaxWidth((int) context.getResources().getDimension(R.dimen.hiad_56_dp));
        appDownloadButton.setFixedWidth(false);
        int dimension = (int) context.getResources().getDimension(R.dimen.hiad_8_dp);
        appDownloadButton.setPadding(dimension, dimension, dimension, dimension);
        appDownloadButton.setFontFamily(Constants.FONT);
        appDownloadButton.setTextSize((int) context.getResources().getDimension(R.dimen.hiad_12_dp));
        appDownloadButton.updateLayoutHeight();
        appDownloadButton.refreshStatusAsync(null);
        appDownloadButton.setVisibility(0);
    }

    static class a extends ExtandAppDownloadButtonStyleHm {
        public a(Context context) {
            super(context);
            Resources resources = context.getResources();
            this.normalStyle.setBackground(resources.getDrawable(R.drawable.hiad_app_down_btn_normal_night));
            this.normalStyle.setTextColor(context.getResources().getColor(R.color.hiad_down_normal_text_night));
            this.processingStyle.setBackground(resources.getDrawable(R.drawable.hiad_app_down_btn_processing_night));
            this.processingStyle.setTextColor(resources.getColor(R.color.hiad_app_down_processing_text_night));
            this.installingStyle.setBackground(resources.getDrawable(R.drawable.hiad_app_down_btn_installing_night));
            this.installingStyle.setTextColor(resources.getColor(R.color.hiad_app_down_installing_text));
            this.cancelBtnDrawable = resources.getDrawable(R.drawable.hiad_app_down_cancel_btn_dark);
        }
    }

    static class b extends ExtandAppDownloadButtonStyleHm {
        public b(Context context) {
            super(context);
            Resources resources = context.getResources();
            this.normalStyle.setBackground(resources.getDrawable(R.drawable.hiad_app_down_btn_normal));
            this.normalStyle.setTextColor(context.getResources().getColor(R.color.hiad_down_normal_text));
            this.processingStyle.setBackground(resources.getDrawable(R.drawable.hiad_app_down_btn_processing));
            this.processingStyle.setTextColor(resources.getColor(R.color.hiad_app_down_processing_text));
            this.installingStyle.setBackground(resources.getDrawable(R.drawable.hiad_app_down_btn_installing));
            this.installingStyle.setTextColor(resources.getColor(R.color.hiad_app_down_installing_text));
        }
    }

    @Override // com.huawei.hms.ads.template.downloadbuttonstyle.a
    public void a() {
        AppDownloadButton appDownloadButton = this.f12838c.get();
        if (appDownloadButton == null) {
            hw.b("IconDwnButtonStyle", "btn is null");
        } else if (1 == this.f12837b) {
            appDownloadButton.setAppDownloadButtonStyle(new a(this.f12836a));
        } else {
            appDownloadButton.setAppDownloadButtonStyle(new b(this.f12836a));
        }
    }

    public d(Context context, AppDownloadButton appDownloadButton) {
        super(context, appDownloadButton);
    }
}
