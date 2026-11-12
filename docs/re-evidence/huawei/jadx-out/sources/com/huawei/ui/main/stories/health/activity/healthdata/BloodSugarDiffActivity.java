package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import defpackage.qnf;
import defpackage.qrs;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes19.dex */
public class BloodSugarDiffActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTitleBar f27421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f27422c;
    private Intent e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthTextView h;
    private HealthTextView i;
    private HealthTextView j;
    private HealthTextView k;
    private HealthTextView l;
    private HealthTextView m;
    private HealthTextView n;
    private HealthTextView o;
    private HealthTextView p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DecimalFormat f27420a = new DecimalFormat("0.0");
    private int d = 0;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (qrs.v()) {
            setContentView(R.layout.health_data_bloodsugar_diff_large);
        } else {
            setContentView(R.layout.health_data_bloodsugar_diff);
        }
        d();
        a();
    }

    private void a() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.blood_sugar_diff_title);
        this.f27421b = customTitleBar;
        customTitleBar.setRightButtonVisibility(8);
        this.p = (HealthTextView) findViewById(R.id.blood_sugar_diff_time);
        this.n = (HealthTextView) findViewById(R.id.blood_sugar_diff_number);
        this.k = (HealthTextView) findViewById(R.id.blood_sugar_diff_status);
        this.l = (HealthTextView) findViewById(R.id.diff_before_title);
        this.f = (HealthTextView) findViewById(R.id.diff_before_status);
        this.g = (HealthTextView) findViewById(R.id.diff_before_message);
        this.o = (HealthTextView) findViewById(R.id.diff_before_time);
        this.h = (HealthTextView) findViewById(R.id.diff_after_title);
        this.j = (HealthTextView) findViewById(R.id.diff_after_status);
        this.f27422c = (HealthTextView) findViewById(R.id.diff_after_message);
        this.i = (HealthTextView) findViewById(R.id.diff_after_time);
        this.m = (HealthTextView) findViewById(R.id.diff_explan);
        e();
    }

    private void d() {
        this.e = getIntent();
    }

    private void e() {
        Intent intent = this.e;
        if (intent == null) {
            LogUtil.j("BloodSugarDiffActivity", "initData intent can not null");
            return;
        }
        b(this.f27421b, intent.getStringExtra("bloodSugar_diff_title"));
        b(this.p, this.e.getStringExtra("bloodSugar_diff_time"));
        b(this.n, a(this.e.getFloatExtra("bloodSugar_diff_number", this.d)));
        d(this.e.getIntExtra("bloodSugar_diff_status", this.d), this.k);
        b(this.l, String.valueOf(this.e.getFloatExtra("bloodSugar_diff_befor_title", this.d)) + getString(R.string.IDS_hw_health_show_healthdata_bloodsugar_mmol));
        d(this.e.getIntExtra("bloodSugar_diff_befor_status", this.d), this.f);
        b(this.g, this.e.getStringExtra("bloodSugar_diff_befor_message"));
        b(this.o, this.e.getStringExtra("bloodSUgar_diff_befor_time"));
        b(this.h, String.valueOf(this.e.getFloatExtra("bloodSugar_diff_after_title", this.d)) + getString(R.string.IDS_hw_health_show_healthdata_bloodsugar_mmol));
        d(this.e.getIntExtra("bloodSugar_diff_after_status", this.d), this.j);
        b(this.f27422c, this.e.getStringExtra("bloodSugar_diff_after_message"));
        b(this.i, this.e.getStringExtra("bloodSugar_diff_after_time"));
        this.m.setText(qnf.e(this, R.string.IDS_hw_show_healthdata_bloodsugar_meal_difference_explanation));
    }

    private void d(int i, HealthTextView healthTextView) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 1001:
                        healthTextView.setText(getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_too_low));
                        healthTextView.setTextColor(getResources().getColor(R.color.color_blood_low));
                        break;
                    case 1002:
                        healthTextView.setText(getResources().getString(R.string.IDS_hw_health_show_healthdata_status_low));
                        healthTextView.setTextColor(getResources().getColor(R.color.color_blood_low));
                        break;
                    case 1003:
                        break;
                    case 1004:
                        break;
                    case 1005:
                        healthTextView.setText(getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_high));
                        healthTextView.setTextColor(getResources().getColor(R.color.color_blood_high));
                        break;
                    case 1006:
                        healthTextView.setText(getResources().getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_too_high));
                        healthTextView.setTextColor(getResources().getColor(R.color.color_blood_high));
                        break;
                    default:
                        LogUtil.a("BloodSugarDiffActivity", "no support blood type");
                        break;
                }
                return;
            }
            healthTextView.setText(getResources().getString(R.string.IDS_hw_health_show_healthdata_status_high));
            healthTextView.setTextColor(getResources().getColor(R.color.color_blood_high));
            return;
        }
        healthTextView.setText(getResources().getString(R.string.IDS_hw_health_show_healthdata_status_normal));
        healthTextView.setTextColor(getResources().getColor(R.color.color_blood_normal_new));
    }

    private void b(View view, String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            LogUtil.j("BloodSugarDiffActivity", "setViewData healthHwTextView or textMsg can not null");
            return;
        }
        if (view instanceof HealthTextView) {
            ((HealthTextView) view).setText(str);
        } else if (!(view instanceof CustomTitleBar)) {
            LogUtil.j("BloodSugarDiffActivity", "view else case");
        } else {
            ((CustomTitleBar) view).setTitleText(str);
        }
    }

    private String a(float f) {
        String str;
        synchronized (this.f27420a) {
            str = this.f27420a.format(f);
        }
        return str;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
