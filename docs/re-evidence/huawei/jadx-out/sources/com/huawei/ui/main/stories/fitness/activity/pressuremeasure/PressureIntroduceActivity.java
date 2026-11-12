package com.huawei.ui.main.stories.fitness.activity.pressuremeasure;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes19.dex */
public class PressureIntroduceActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f26993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f26994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f26995c;
    private HealthTextView d;
    private HealthTextView e;
    private HealthTextView f;
    private HealthTextView g;
    private String h;
    private HealthTextView i;
    private HealthTextView j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pressure_introduce);
        cancelAdaptRingRegion();
        setViewSafeRegion(false, findViewById(R.id.pressure_introduce_ll));
        this.f26993a = this;
        a();
        d();
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.pressure_introduce_content_one_one);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.pressure_introduce_content_one_two);
        HealthTextView healthTextView3 = (HealthTextView) findViewById(R.id.pressure_introduce_content_second_one);
        HealthTextView healthTextView4 = (HealthTextView) findViewById(R.id.pressure_introduce_content_second_two);
        HealthTextView healthTextView5 = (HealthTextView) findViewById(R.id.pressure_introduce_content_second_three);
        healthTextView.setText(this.f26993a.getString(R.string.IDS_hw_pressure_advice_advice_summarize_introduce_frist_detail));
        healthTextView2.setText(this.f26993a.getString(R.string.IDS_hw_pressure_advice_advice_summarize_introduce_frist_content_one));
        healthTextView3.setText(this.f26993a.getString(R.string.IDS_hw_pressure_advice_advice_summarize_introduce_second_detail));
        healthTextView4.setText(this.f26993a.getString(R.string.IDS_hw_pressure_advice_advice_summarize_introduce_second_content_one));
        healthTextView5.setText(this.f26993a.getString(R.string.IDS_hw_pressure_advice_advice_summarize_introduce_second_content_two));
        c();
        b();
    }

    private void a() {
        this.j = (HealthTextView) findViewById(R.id.pressure_introduce_title_one);
        this.i = (HealthTextView) findViewById(R.id.pressure_introduce_title_second);
        this.g = (HealthTextView) findViewById(R.id.pressure_introduce_title_third);
        this.f = (HealthTextView) findViewById(R.id.pressure_introduce_title_fourth);
        this.f26994b = (HealthTextView) findViewById(R.id.pressure_advice_summarize_introduce_fourth_content1);
        this.d = (HealthTextView) findViewById(R.id.pressure_advice_summarize_introduce_fourth_content2);
        this.f26995c = (HealthTextView) findViewById(R.id.pressure_advice_summarize_introduce_fourth_content3);
        this.e = (HealthTextView) findViewById(R.id.pressure_advice_summarize_introduce_fourth_content4);
    }

    private void d() {
        this.k = UnitUtil.e(1.0d, 1, 0);
        this.o = UnitUtil.e(2.0d, 1, 0);
        this.m = UnitUtil.e(3.0d, 1, 0);
        this.h = UnitUtil.e(4.0d, 1, 0);
        this.w = UnitUtil.e(2011.0d, 1, 0);
        this.u = UnitUtil.e(2015.0d, 1, 0);
        this.x = UnitUtil.e(1983.0d, 1, 0);
        this.r = UnitUtil.e(71.0d, 1, 0);
        this.t = UnitUtil.e(385.0d, 1, 0);
        this.s = UnitUtil.e(396.0d, 1, 0);
        this.y = UnitUtil.e(97.0d, 1, 0);
        this.v = UnitUtil.e(80.0d, 1, 0);
        this.n = UnitUtil.e(108.0d, 1, 0);
        this.q = UnitUtil.e(370.0d, 1, 0);
        this.p = UnitUtil.e(377.0d, 1, 0);
        this.l = UnitUtil.e(36.0d, 1, 0);
    }

    private void c() {
        this.j.setText(String.format(this.f26993a.getString(R.string.IDS_hw_pressure_advice_advice_summarize_introduce_frist_title), 1));
        this.i.setText(String.format(this.f26993a.getString(R.string.IDS_hw_pressure_advice_advice_summarize_introduce_second_title), 2));
        this.g.setText(String.format(this.f26993a.getString(R.string.IDS_hw_pressure_advice_advice_summarize_introduce_third_title), 3));
        this.f.setText(String.format(this.f26993a.getString(R.string.IDS_hw_pressure_advice_advice_summarize_introduce_fourth_title), 4));
    }

    private void b() {
        this.f26994b.setText(this.f26993a.getString(R.string.IDS_hw_pressure_advice_advice_summarize_introduce_fourth_content1, this.k, this.w, this.y, this.n));
        this.d.setText(this.f26993a.getString(R.string.IDS_hw_pressure_advice_advice_summarize_introduce_fourth_content2, this.o, this.x, this.t, this.s));
        this.f26995c.setText(this.f26993a.getString(R.string.IDS_hw_pressure_advice_advice_summarize_introduce_fourth_content3, this.m, this.w, this.l, this.r, this.v));
        this.e.setText(this.f26993a.getString(R.string.IDS_hw_pressure_advice_advice_summarize_introduce_fourth_content4, this.h, this.u, this.q, this.p));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
