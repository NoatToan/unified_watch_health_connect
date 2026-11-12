package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.wifi.control.claim.ClaimWeightDataManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import defpackage.qqs;
import defpackage.qre;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes3.dex */
public class ClaimMeasureNoDataActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomTitleBar f27450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f27451b;
    private Context e;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_claim_measure_nodata_layout);
        LogUtil.a("PluginDevice_ClaimMeasureNoDataActivity", "onCreate...");
        this.e = BaseApplication.getContext();
        c();
    }

    private void c() {
        Drawable drawable;
        this.f27450a = (CustomTitleBar) findViewById(R.id.custom_title_bar_weight_measure);
        this.f27451b = (ImageView) findViewById(R.id.weight_measure_nodata_icon);
        if (LanguageUtil.ba(this.e)) {
            drawable = this.e.getResources().getDrawable(R.drawable.health_navbar_rtl_back_selector);
        } else {
            drawable = this.e.getResources().getDrawable(R.drawable.health_navbar_back_selector);
        }
        this.f27450a.setLeftButtonDrawable(drawable, qre.f(R.string.accessibility_go_back));
        this.f27450a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.ClaimMeasureNoDataActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClaimMeasureNoDataActivity.this.finish();
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        a();
    }

    private void a() {
        if (qqs.e(this.e)) {
            this.f27451b.setImageDrawable(getResources().getDrawable(R.drawable.ic_health_empty_weight_dark));
        } else {
            this.f27451b.setImageDrawable(getResources().getDrawable(R.drawable.ic_health_empty_weight));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ClaimWeightDataManager.INSTANCE.startSync();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
