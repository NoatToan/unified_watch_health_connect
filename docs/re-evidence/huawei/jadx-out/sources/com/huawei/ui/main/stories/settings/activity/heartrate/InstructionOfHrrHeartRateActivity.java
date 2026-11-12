package com.huawei.ui.main.stories.settings.activity.heartrate;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.qsp;
import health.compact.a.UnitUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class InstructionOfHrrHeartRateActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f28819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f28820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f28821c;
    private HealthTextView d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthTextView h;
    private HealthTextView i;
    private HealthTextView j;
    private HealthTextView k;
    private HealthTextView l;
    private HealthTextView m;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.a("InstructionOfHrrHeartRateActivity", "onCreate");
        super.onCreate(bundle);
        setContentView(R.layout.activity_instruction_hrr_heart_rate);
        this.f28821c = getApplicationContext();
        d();
        b();
    }

    private void d() {
        this.m = (HealthTextView) qsp.a(this, R.id.des_title0);
        this.g = (HealthTextView) qsp.a(this, R.id.des_title1);
        this.f = (HealthTextView) qsp.a(this, R.id.des_title2);
        this.l = (HealthTextView) qsp.a(this, R.id.des_title3);
        this.k = (HealthTextView) qsp.a(this, R.id.des_title4);
        this.h = (HealthTextView) qsp.a(this, R.id.des_title5);
        this.i = (HealthTextView) qsp.a(this, R.id.des_context0);
        this.d = (HealthTextView) qsp.a(this, R.id.des_context1);
        this.f28819a = (HealthTextView) qsp.a(this, R.id.des_context2);
        this.j = (HealthTextView) qsp.a(this, R.id.des_context3);
        this.e = (HealthTextView) qsp.a(this, R.id.des_context4);
        this.f28820b = (HealthTextView) qsp.a(this, R.id.des_context5);
    }

    private void b() {
        this.d.setText(String.format(Locale.ENGLISH, this.f28821c.getResources().getString(R.string.IDS_rate_zone_hrr_des_context5), UnitUtil.e(59.0d, 2, 0), "～ " + UnitUtil.e(74.0d, 2, 0)));
        this.f28819a.setText(String.format(Locale.ENGLISH, this.f28821c.getResources().getString(R.string.IDS_rate_zone_hrr_des_context4), UnitUtil.e(74.0d, 2, 0), "～ " + UnitUtil.e(84.0d, 2, 0)));
        this.j.setText(String.format(Locale.ENGLISH, this.f28821c.getResources().getString(R.string.IDS_rate_zone_hrr_des_context3), UnitUtil.e(84.0d, 2, 0), "～ " + UnitUtil.e(88.0d, 2, 0)));
        this.e.setText(String.format(Locale.ENGLISH, this.f28821c.getResources().getString(R.string.IDS_rate_zone_hrr_des_context2), UnitUtil.e(88.0d, 2, 0), "～ " + UnitUtil.e(95.0d, 2, 0)));
        this.f28820b.setText(String.format(Locale.ENGLISH, this.f28821c.getResources().getString(R.string.IDS_rate_zone_hrr_des_context1), UnitUtil.e(95.0d, 2, 0), "～ " + UnitUtil.e(100.0d, 2, 0)));
        this.m.setText(R.string.IDS_main_watch_detail_max_heart_rate_unsport_interval);
        this.g.setText(this.f28821c.getResources().getString(R.string.IDS_main_watch_detail_max_heart_rate_sport_title, 1));
        this.f.setText(this.f28821c.getResources().getString(R.string.IDS_main_watch_detail_max_heart_rate_sport_title, 2));
        this.l.setText(this.f28821c.getResources().getString(R.string.IDS_main_watch_detail_max_heart_rate_sport_title, 3));
        this.k.setText(this.f28821c.getResources().getString(R.string.IDS_main_watch_detail_max_heart_rate_sport_title, 4));
        this.h.setText(this.f28821c.getResources().getString(R.string.IDS_main_watch_detail_max_heart_rate_sport_title, 5));
        this.i.setText(String.format(Locale.ENGLISH, this.f28821c.getResources().getString(R.string.IDS_main_watch_detail_max_heart_rate_unsport_context), UnitUtil.e(59.0d, 2, 0)));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
