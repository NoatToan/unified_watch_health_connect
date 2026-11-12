package com.huawei.ui.main.stories.settings.activity.heartrate;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import defpackage.qsp;
import health.compact.a.UnitUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class InstructionOfMaxHeartRateActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f28822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f28823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f28824c;
    private Context d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private RelativeLayout h;
    private HealthTextView i;
    private CustomTitleBar j;
    private HealthTextView k;
    private HealthTextView l;
    private HealthTextView m;
    private HealthTextView n;
    private HealthTextView o;
    private HealthTextView t;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a("InstructionOfMaxHeartRateActivity", "onCreate");
        super.onCreate(bundle);
        setContentView(R.layout.activity_instruction_max_heart_rate);
        this.d = getApplicationContext();
        b();
        Intent intent = getIntent();
        if (intent != null && intent.getBooleanExtra("isPaceRange", false)) {
            d();
        } else {
            c();
        }
    }

    private void b() {
        this.j = (CustomTitleBar) findViewById(R.id.max_heart_rate_title_layout);
        this.i = (HealthTextView) qsp.a(this, R.id.rate_zone_calculation_des);
        this.h = (RelativeLayout) findViewById(R.id.rate_zone_non_sport);
        this.o = (HealthTextView) qsp.a(this, R.id.des_title0);
        this.t = (HealthTextView) qsp.a(this, R.id.des_title1);
        this.m = (HealthTextView) qsp.a(this, R.id.des_title2);
        this.e = (HealthTextView) qsp.a(this, R.id.des_title3);
        this.f28822a = (HealthTextView) qsp.a(this, R.id.des_title4);
        this.f = (HealthTextView) qsp.a(this, R.id.des_title5);
        this.l = (HealthTextView) qsp.a(this, R.id.des_context0);
        this.k = (HealthTextView) qsp.a(this, R.id.des_context1);
        this.n = (HealthTextView) qsp.a(this, R.id.des_context2);
        this.f28823b = (HealthTextView) qsp.a(this, R.id.des_context3);
        this.f28824c = (HealthTextView) qsp.a(this, R.id.des_context4);
        this.g = (HealthTextView) qsp.a(this, R.id.des_context5);
    }

    private void c() {
        this.j.setTitleText(getString(R.string.IDS_main_max_heart_rate_percentage));
        this.i.setVisibility(8);
        String str = String.format(Locale.ENGLISH, this.d.getResources().getString(R.string.IDS_rate_zone_des_context5), UnitUtil.e(50.0d, 2, 0), "～ " + UnitUtil.e(60.0d, 2, 0));
        String str2 = String.format(Locale.ENGLISH, this.d.getResources().getString(R.string.IDS_rate_zone_des_context4), UnitUtil.e(60.0d, 2, 0), "～ " + UnitUtil.e(70.0d, 2, 0));
        this.k.setText(str);
        this.n.setText(str2);
        this.f28823b.setText(String.format(Locale.ENGLISH, this.d.getResources().getString(R.string.IDS_rate_zone_des_context3), UnitUtil.e(70.0d, 2, 0), "～ " + UnitUtil.e(80.0d, 2, 0)));
        this.f28824c.setText(String.format(Locale.ENGLISH, this.d.getResources().getString(R.string.IDS_rate_zone_des_context2), UnitUtil.e(80.0d, 2, 0), "～ " + UnitUtil.e(90.0d, 2, 0)));
        this.g.setText(String.format(Locale.ENGLISH, this.d.getResources().getString(R.string.IDS_rate_zone_des_context1), UnitUtil.e(90.0d, 2, 0), "～ " + UnitUtil.e(100.0d, 2, 0)));
        this.o.setText(R.string.IDS_main_watch_detail_max_heart_rate_unsport_interval);
        this.t.setText(this.d.getResources().getString(R.string.IDS_main_watch_detail_max_heart_rate_sport_title, 1));
        this.m.setText(this.d.getResources().getString(R.string.IDS_main_watch_detail_max_heart_rate_sport_title, 2));
        this.e.setText(this.d.getResources().getString(R.string.IDS_main_watch_detail_max_heart_rate_sport_title, 3));
        this.f28822a.setText(this.d.getResources().getString(R.string.IDS_main_watch_detail_max_heart_rate_sport_title, 4));
        this.f.setText(this.d.getResources().getString(R.string.IDS_main_watch_detail_max_heart_rate_sport_title, 5));
        this.l.setText(String.format(Locale.ENGLISH, this.d.getResources().getString(R.string.IDS_main_watch_detail_max_heart_rate_unsport_context), UnitUtil.e(50.0d, 2, 0)));
    }

    private void d() {
        this.j.setTitleText(getString(R.string.IDS_hwh_motiontrack_running_pace_range));
        this.h.setVisibility(8);
        this.l.setVisibility(8);
        this.i.setText(getString(R.string.IDS_pace_explain_title));
        this.t.setText(c(1));
        this.k.setText(getString(R.string.IDS_pace_explain_ragne_one));
        this.m.setText(c(2));
        this.n.setText(getString(R.string.IDS_pace_explain_ragne_two));
        this.e.setText(c(3));
        this.f28823b.setText(getString(R.string.IDS_pace_explain_ragne_three, new Object[]{5, 1}));
        this.f28822a.setText(c(4));
        this.f28824c.setText(getString(R.string.IDS_pace_explain_ragne_four));
        this.f.setText(c(5));
        this.g.setText(getString(R.string.IDS_pace_explain_ragne_five, new Object[]{1, 1}));
    }

    private String c(int i) {
        return getResources().getString(R.string.IDS_pace_range_label_number, Integer.valueOf(i));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
