package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.template.BaseActivity;
import defpackage.qsp;
import defpackage.wka;

/* JADX INFO: loaded from: classes43.dex */
public class RunningDataSpecificationActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f27602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f27603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f27604c;
    private LinearLayout d;
    private LinearLayout e;
    private LinearLayout g;
    private LinearLayout i;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cancelAdaptRingRegion();
        setContentView(R.layout.activity_running_specification_layout);
        c();
        e();
    }

    private void c() {
        b();
        this.g = (LinearLayout) findViewById(R.id.running_speci_sss);
        this.i = (LinearLayout) findViewById(R.id.running_speci_ss);
        this.f27603b = (LinearLayout) findViewById(R.id.running_speci_s);
        this.e = (LinearLayout) findViewById(R.id.running_speci_a);
        this.f27604c = (LinearLayout) findViewById(R.id.running_speci_b);
        this.f27602a = (LinearLayout) findViewById(R.id.running_speci_c);
        this.d = (LinearLayout) findViewById(R.id.running_speci_d);
    }

    private void e() {
        a();
        d();
    }

    private void b() {
        CustomTitleBar customTitleBar = (CustomTitleBar) qsp.a(this, R.id.running_detail_titlebar);
        customTitleBar.setTitleText(getString(R.string.IDS_fitness_core_sleep_explain_title));
        customTitleBar.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.RunningDataSpecificationActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RunningDataSpecificationActivity.this.finish();
            }
        });
    }

    private void a() {
        Drawable drawable = getResources().getDrawable(R.drawable.running_index_level_sss);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        HealthTextView healthTextViewC = wka.c(this.g, R.id.item_running_speci_left, this);
        healthTextViewC.setCompoundDrawablesRelative(drawable, null, null, null);
        healthTextViewC.setCompoundDrawablePadding(30);
        healthTextViewC.setText(R.string.IDS_data_running_index_level_sss);
        wka.c(this.g, R.id.item_running_speci_center, this).setText(wka.c(2, 65.0f, 0.0f, true));
        wka.c(this.g, R.id.item_running_speci_right, this).setText(wka.c(2, 58.0f, 0.0f, true));
        Drawable drawable2 = getResources().getDrawable(R.drawable.running_index_level_ss);
        drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        HealthTextView healthTextViewC2 = wka.c(this.i, R.id.item_running_speci_left, this);
        healthTextViewC2.setCompoundDrawablesRelative(drawable2, null, null, null);
        healthTextViewC2.setCompoundDrawablePadding(30);
        healthTextViewC2.setText(R.string.IDS_data_running_index_level_ss);
        wka.c(this.i, R.id.item_running_speci_center, this).setText(wka.c(0, 60.0f, 65.0f, true));
        wka.c(this.i, R.id.item_running_speci_right, this).setText(wka.c(0, 53.0f, 58.0f, true));
        Drawable drawable3 = getResources().getDrawable(R.drawable.running_index_level_s);
        drawable3.setBounds(0, 0, drawable3.getMinimumWidth(), drawable3.getMinimumHeight());
        HealthTextView healthTextViewC3 = wka.c(this.f27603b, R.id.item_running_speci_left, this);
        healthTextViewC3.setCompoundDrawablesRelative(drawable3, null, null, null);
        healthTextViewC3.setCompoundDrawablePadding(30);
        healthTextViewC3.setText(R.string.IDS_data_running_index_level_s);
        wka.c(this.f27603b, R.id.item_running_speci_center, this).setText(wka.c(0, 50.0f, 60.0f, true));
        wka.c(this.f27603b, R.id.item_running_speci_right, this).setText(wka.c(0, 45.0f, 53.0f, true));
    }

    private void d() {
        Drawable drawable = getResources().getDrawable(R.drawable.running_index_level_a);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        HealthTextView healthTextViewC = wka.c(this.e, R.id.item_running_speci_left, this);
        healthTextViewC.setCompoundDrawablesRelative(drawable, null, null, null);
        healthTextViewC.setCompoundDrawablePadding(30);
        healthTextViewC.setText(R.string.IDS_data_running_index_level_a);
        wka.c(this.e, R.id.item_running_speci_center, this).setText(wka.c(0, 40.0f, 50.0f, true));
        wka.c(this.e, R.id.item_running_speci_right, this).setText(wka.c(0, 36.0f, 45.0f, true));
        Drawable drawable2 = getResources().getDrawable(R.drawable.running_index_level_b);
        drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        HealthTextView healthTextViewC2 = wka.c(this.f27604c, R.id.item_running_speci_left, this);
        healthTextViewC2.setCompoundDrawablesRelative(drawable2, null, null, null);
        healthTextViewC2.setCompoundDrawablePadding(30);
        healthTextViewC2.setText(R.string.IDS_data_running_index_level_b);
        wka.c(this.f27604c, R.id.item_running_speci_center, this).setText(wka.c(0, 30.0f, 40.0f, true));
        wka.c(this.f27604c, R.id.item_running_speci_right, this).setText(wka.c(0, 27.0f, 36.0f, true));
        Drawable drawable3 = getResources().getDrawable(R.drawable.running_index_level_c);
        drawable3.setBounds(0, 0, drawable3.getMinimumWidth(), drawable3.getMinimumHeight());
        HealthTextView healthTextViewC3 = wka.c(this.f27602a, R.id.item_running_speci_left, this);
        healthTextViewC3.setCompoundDrawablesRelative(drawable3, null, null, null);
        healthTextViewC3.setCompoundDrawablePadding(30);
        healthTextViewC3.setText(R.string.IDS_data_running_index_level_c);
        wka.c(this.f27602a, R.id.item_running_speci_center, this).setText(wka.c(0, 25.0f, 30.0f, true));
        wka.c(this.f27602a, R.id.item_running_speci_right, this).setText(wka.c(0, 22.0f, 27.0f, true));
        Drawable drawable4 = getResources().getDrawable(R.drawable.running_index_level_d);
        drawable4.setBounds(0, 0, drawable4.getMinimumWidth(), drawable4.getMinimumHeight());
        HealthTextView healthTextViewC4 = wka.c(this.d, R.id.item_running_speci_left, this);
        healthTextViewC4.setCompoundDrawablesRelative(drawable4, null, null, null);
        healthTextViewC4.setCompoundDrawablePadding(30);
        healthTextViewC4.setText(R.string.IDS_data_running_index_level_d);
        wka.c(this.d, R.id.item_running_speci_center, this).setText(wka.c(1, 0.0f, 25.0f, true));
        wka.c(this.d, R.id.item_running_speci_right, this).setText(wka.c(1, 0.0f, 22.0f, true));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
