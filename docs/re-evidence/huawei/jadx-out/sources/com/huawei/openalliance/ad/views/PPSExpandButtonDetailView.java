package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.dq;

/* JADX INFO: loaded from: classes12.dex */
public class PPSExpandButtonDetailView extends PPSAppDetailView {
    private RelativeLayout e;
    private int f;

    @Override // com.huawei.openalliance.ad.views.PPSAppDetailView
    protected int getDetailStyle() {
        return 2;
    }

    public void setExtraViewVisibility(int i) {
        if (i == 0) {
            return;
        }
        if (this.d != null) {
            this.d.setVisibility(i);
        }
        this.e = (RelativeLayout) findViewById(R.id.app_download_btn_rl);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, R.id.app_description);
        if (i != 0 || as.n(getContext())) {
            layoutParams.setMargins(0, getResources().getDimensionPixelSize(R.dimen.hiad_16_dp), 0, getResources().getDimensionPixelSize(R.dimen.hiad_16_dp));
        } else {
            layoutParams.addRule(8);
            layoutParams.addRule(14);
            layoutParams.bottomMargin = getResources().getDimensionPixelSize(R.dimen.hiad_16_dp);
        }
        this.e.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            hw.b("ExBtnDetailView", "onConfigurationChanged newConfig.screenWidthDp= %s, this.screenWidthDp= %s", Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(this.f));
            if (configuration.screenWidthDp == this.f || this.f20810b == null) {
                return;
            }
            this.f = configuration.screenWidthDp;
            f();
        } catch (Throwable th) {
            hw.d("ExBtnDetailView", "onConfigurationChanged. exception: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.views.PPSAppDetailView
    protected void b(Context context) {
        this.f20810b = (AppDownloadButton) findViewById(R.id.app_download_btn);
        Resources resources = context.getResources();
        this.f20810b.setFixedWidth(true);
        this.f20810b.setTextColor(resources.getColor(R.color.hiad_emui_8_btn_color));
    }

    @Override // com.huawei.openalliance.ad.views.PPSAppDetailView
    public void a(int i) {
        hw.b("ExBtnDetailView", "updateDetailViewType: %s", Integer.valueOf(i));
        if (2 == i) {
            this.d.setVisibility(8);
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.app_download_btn_rl);
            this.e = relativeLayout;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            if (layoutParams == null) {
                hw.c("ExBtnDetailView", "param is null");
                return;
            }
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.hiad_landing_bottom_btn_margin_bottom);
            layoutParams.topMargin = dimensionPixelSize;
            layoutParams.bottomMargin = dimensionPixelSize;
            hw.a("ExBtnDetailView", "bottomMargin: %s", Integer.valueOf(layoutParams.bottomMargin));
            this.e.setLayoutParams(layoutParams);
        }
    }

    @Override // com.huawei.openalliance.ad.views.PPSAppDetailView
    protected int a(Context context) {
        if (as.n(context)) {
            return this.f20811c == 1 ? R.layout.hiad_landing_elderly_friendly_detail_half : R.layout.hiad_landing_elderly_friendly_detail;
        }
        return this.f20811c == 1 ? R.layout.hiad_landing_expand_button_detail_half : R.layout.hiad_landing_expand_button_detail;
    }

    private void f() {
        e();
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSExpandButtonDetailView.1
            @Override // java.lang.Runnable
            public void run() {
                PPSExpandButtonDetailView.this.e();
            }
        }, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            ViewGroup.LayoutParams layoutParams = this.f20810b.getLayoutParams();
            layoutParams.width = -1;
            this.f20810b.setLayoutParamsSkipSizeReset(layoutParams);
            hw.b("ExBtnDetailView", "resetButtonWidth");
        } catch (Exception e) {
            hw.d("ExBtnDetailView", "resetButtonWidth. exception: %s", e.getClass().getSimpleName());
        }
    }

    public PPSExpandButtonDetailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public PPSExpandButtonDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PPSExpandButtonDetailView(Context context) {
        super(context);
    }
}
