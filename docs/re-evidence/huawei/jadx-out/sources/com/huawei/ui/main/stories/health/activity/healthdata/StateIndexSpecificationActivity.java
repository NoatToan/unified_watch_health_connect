package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.template.BaseActivity;
import defpackage.qsp;
import defpackage.wka;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes43.dex */
public class StateIndexSpecificationActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f27614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RelativeLayout f27615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f27616c;
    private RelativeLayout d;
    private CustomTitleBar e;
    private RelativeLayout j;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_state_specification_layout);
        a();
        d();
    }

    private void a() {
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.state_speci_detail_titlebar);
        this.e = customTitleBar;
        customTitleBar.setTitleText(getString(R.string.IDS_fitness_core_sleep_explain_title));
        this.e.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.StateIndexSpecificationActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                StateIndexSpecificationActivity.this.finish();
            }
        });
    }

    private void d() {
        this.f27616c = (RelativeLayout) findViewById(R.id.item_state_level_very_well);
        this.j = (RelativeLayout) findViewById(R.id.item_state_level_well);
        this.f27614a = (RelativeLayout) findViewById(R.id.item_state_level_normal);
        this.f27615b = (RelativeLayout) findViewById(R.id.item_state_level_pool);
        this.d = (RelativeLayout) findViewById(R.id.item_state_level_very_pool);
        b();
        Drawable drawable = getResources().getDrawable(R.drawable.running_index_level_ss);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        HealthTextView healthTextViewC = wka.c(this.f27615b, R.id.item_state_speci_left, this);
        healthTextViewC.setCompoundDrawablesRelative(drawable, null, null, null);
        healthTextViewC.setCompoundDrawablePadding(30);
        healthTextViewC.setText(getString(R.string.IDS_data_index_pool));
        wka.c(this.f27615b, R.id.item_state_speci_bottom, this).setText(getString(R.string.IDS_data_index_pool_explain));
        HealthTextView healthTextViewC2 = wka.c(this.f27615b, R.id.item_state_speci_right, this);
        String strC = wka.c(0, -16.0f, -6.0f, false);
        if (LanguageUtil.c(BaseApplication.getContext())) {
            healthTextViewC2.setText(strC + Constants.LINK);
        } else {
            healthTextViewC2.setText(strC);
        }
        Drawable drawable2 = getResources().getDrawable(R.drawable.running_index_level_sss);
        drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        HealthTextView healthTextViewC3 = wka.c(this.d, R.id.item_state_speci_left, this);
        healthTextViewC3.setCompoundDrawablesRelative(drawable2, null, null, null);
        healthTextViewC3.setCompoundDrawablePadding(30);
        healthTextViewC3.setText(getString(R.string.IDS_data_index_very_pool));
        wka.c(this.d, R.id.item_state_speci_bottom, this).setText(getString(R.string.IDS_data_index_very_pool_explain));
        wka.c(this.d, R.id.item_state_speci_right, this).setText(wka.c(1, 0.0f, -16.0f, false));
    }

    private void b() {
        Drawable drawable = getResources().getDrawable(R.drawable.running_index_level_d);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        HealthTextView healthTextViewC = wka.c(this.f27616c, R.id.item_state_speci_left, this);
        healthTextViewC.setCompoundDrawablesRelative(drawable, null, null, null);
        healthTextViewC.setCompoundDrawablePadding(30);
        healthTextViewC.setText(getString(R.string.IDS_data_index_very_well));
        wka.c(this.f27616c, R.id.item_state_speci_bottom, this).setText(getString(R.string.IDS_data_index_very_well_explain));
        wka.c(this.f27616c, R.id.item_state_speci_right, this).setText(wka.c(2, 3.0f, 0.0f, false));
        Drawable drawable2 = getResources().getDrawable(R.drawable.running_index_level_b);
        drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        HealthTextView healthTextViewC2 = wka.c(this.j, R.id.item_state_speci_left, this);
        healthTextViewC2.setCompoundDrawablesRelative(drawable2, null, null, null);
        healthTextViewC2.setCompoundDrawablePadding(30);
        healthTextViewC2.setText(getString(R.string.IDS_data_index_well));
        wka.c(this.j, R.id.item_state_speci_bottom, this).setText(getString(R.string.IDS_data_day_tab_tip));
        wka.c(this.j, R.id.item_state_speci_right, this).setText(wka.c(0, 0.5f, 3.0f, false));
        Drawable drawable3 = getResources().getDrawable(R.drawable.running_index_level_a);
        drawable3.setBounds(0, 0, drawable3.getMinimumWidth(), drawable3.getMinimumHeight());
        HealthTextView healthTextViewC3 = wka.c(this.f27614a, R.id.item_state_speci_left, this);
        healthTextViewC3.setCompoundDrawablesRelative(drawable3, null, null, null);
        healthTextViewC3.setCompoundDrawablePadding(30);
        healthTextViewC3.setText(getString(R.string.IDS_data_index_normal));
        wka.c(this.f27614a, R.id.item_state_speci_bottom, this).setText(getString(R.string.IDS_data_index_normal_explain));
        HealthTextView healthTextViewC4 = wka.c(this.f27614a, R.id.item_state_speci_right, this);
        String strC = wka.c(0, -6.0f, 0.5f, false);
        if (LanguageUtil.c(BaseApplication.getContext())) {
            healthTextViewC4.setText(strC + Constants.LINK);
            return;
        }
        healthTextViewC4.setText(strC);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
