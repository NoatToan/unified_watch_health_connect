package com.huawei.hms.ads.template.downloadbuttonstyle;

import android.content.Context;
import android.content.res.Resources;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import com.huawei.openalliance.ad.views.ExtandAppDownloadButtonStyleHm;

/* JADX INFO: loaded from: classes10.dex */
public class b extends com.huawei.hms.ads.template.downloadbuttonstyle.a {
    protected int d;
    protected int e;

    @Override // com.huawei.hms.ads.template.downloadbuttonstyle.a
    protected void b(Context context) {
        AppDownloadButton appDownloadButton = this.f12838c.get();
        if (appDownloadButton == null) {
            hw.b("DefaultDwnButtonStyle", "btn is null");
            return;
        }
        appDownloadButton.setMinWidth((int) context.getResources().getDimension(R.dimen.hiad_64_dp));
        appDownloadButton.setPadding(0, 0, 0, this.e);
        appDownloadButton.setMaxWidth((int) context.getResources().getDimension(R.dimen.hiad_144_dp));
        appDownloadButton.setFontFamily(Constants.FONT);
        appDownloadButton.setTextSize(this.d);
        appDownloadButton.setVisibility(0);
        appDownloadButton.updateLayoutHeight();
        appDownloadButton.refreshStatusAsync(null);
        appDownloadButton.setVisibility(0);
    }

    protected static class a extends ExtandAppDownloadButtonStyleHm {
        public a(Context context, int i) {
            super(context);
            Resources resources = context.getResources();
            this.normalStyle.setBackground(resources.getDrawable(R.drawable.hiad_native_tpt_list_page_btn_night));
            this.normalStyle.setTextSize(i);
            this.normalStyle.setTextColor(resources.getColor(R.color.hiad_down_btn_normal_night));
            this.processingStyle.setBackground(resources.getDrawable(R.drawable.hiad_native_tpt_list_page_btn_night));
            this.processingStyle.setTextSize(i);
            this.processingStyle.setTextColor(resources.getColor(R.color.hiad_down_btn_process_night));
            this.installingStyle.setBackground(resources.getDrawable(R.drawable.hiad_native_tpt_list_page_btn_night));
            this.installingStyle.setTextSize(i);
            this.installingStyle.setTextColor(resources.getColor(R.color.hiad_down_btn_installing_night));
            this.cancelBtnDrawable = resources.getDrawable(R.drawable.hiad_app_down_cancel_btn_dark);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.ads.template.downloadbuttonstyle.b$b, reason: collision with other inner class name */
    protected static class C0098b extends ExtandAppDownloadButtonStyleHm {
        public C0098b(Context context, int i) {
            super(context);
            Resources resources = context.getResources();
            this.normalStyle.setBackground(resources.getDrawable(R.drawable.hiad_native_tpt_list_page_btn));
            this.normalStyle.setTextSize(i);
            this.normalStyle.setTextColor(resources.getColor(R.color.hiad_down_btn_normal));
            this.processingStyle.setBackground(resources.getDrawable(R.drawable.hiad_native_tpt_list_page_btn));
            this.processingStyle.setTextSize(i);
            this.processingStyle.setTextColor(resources.getColor(R.color.hiad_down_btn_process));
            this.installingStyle.setBackground(resources.getDrawable(R.drawable.hiad_native_tpt_list_page_btn));
            this.installingStyle.setTextSize(i);
            this.installingStyle.setTextColor(resources.getColor(R.color.hiad_down_btn_installing));
        }
    }

    @Override // com.huawei.hms.ads.template.downloadbuttonstyle.a
    public void a() {
        AppDownloadButton appDownloadButton = this.f12838c.get();
        if (appDownloadButton == null) {
            hw.b("DefaultDwnButtonStyle", "btn is null");
        } else if (1 == this.f12837b) {
            appDownloadButton.setAppDownloadButtonStyle(new a(this.f12836a, this.d));
        } else {
            appDownloadButton.setAppDownloadButtonStyle(new C0098b(this.f12836a, this.d));
        }
    }

    public b(Context context, AppDownloadButton appDownloadButton) {
        super(context, appDownloadButton);
        this.d = (int) context.getResources().getDimension(R.dimen.hiad_12_dp);
        this.e = (int) context.getResources().getDimension(R.dimen.hiad_6_dp);
    }
}
