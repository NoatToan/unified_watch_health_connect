package com.huawei.ui.main.stories.health.temperature.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.model.weight.card.CardConstants;
import defpackage.qrs;
import defpackage.vbr;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes19.dex */
public class TemperatureIntroduceActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f28091a;
    private String aa;
    private String ab;
    private View ac;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f28092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f28093c;
    private String d;
    private Context e;
    private HealthTextView f;
    private HealthTextView g;
    private HealthTextView h;
    private HealthTextView i;
    private ImageView j;
    private HealthTextView k;
    private HealthTextView l;
    private HealthTextView m;
    private HealthTextView n;
    private HealthTextView o;
    private boolean p;
    private HealthTextView q;
    private boolean r;
    private String s;
    private String t;
    private String u;
    private String v;
    private HealthTextView w;
    private String x;
    private String y;
    private String z;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_temperature_introduce);
        cancelAdaptRingRegion();
        setViewSafeRegion(false, findViewById(R.id.temperature_introduce_ll));
        this.e = this;
        this.r = Utils.o();
        this.p = UnitUtil.a();
        a();
        d();
        c();
        if (this.r) {
            f();
        } else {
            g();
        }
    }

    private void a() {
        this.g = (HealthTextView) findViewById(R.id.temperature_introduce_content_one);
        this.k = (HealthTextView) findViewById(R.id.temperature_introduce_content_two);
        this.i = (HealthTextView) findViewById(R.id.temperature_introduce_content_three_one);
        this.m = (HealthTextView) findViewById(R.id.temperature_introduce_content_three_two);
        this.n = (HealthTextView) findViewById(R.id.temperature_introduce_content_three_three);
        this.o = (HealthTextView) findViewById(R.id.temperature_introduce_content_three_four);
        this.f = (HealthTextView) findViewById(R.id.temperature_introduce_content_three_five);
        this.l = (HealthTextView) findViewById(R.id.temperature_introduce_content_three_six);
        this.h = (HealthTextView) findViewById(R.id.temperature_introduce_content_three_seven);
        if (LanguageUtil.bj(this.e)) {
            CardConstants.c(this.g);
            CardConstants.c(this.k);
            CardConstants.c(this.i);
            CardConstants.c(this.m);
            CardConstants.c(this.n);
            CardConstants.c(this.o);
            CardConstants.c(this.f);
            CardConstants.c(this.l);
            CardConstants.c(this.h);
        }
        this.j = (ImageView) findViewById(R.id.iv_four);
        if (qrs.y()) {
            findViewById(R.id.temperature_explain_icon).setVisibility(8);
            View viewInflate = ((ViewStub) findViewById(R.id.temperature_explain_icon_large_view_sub)).inflate();
            this.ac = viewInflate.findViewById(R.id.temperature_explain_icon_large);
            this.q = (HealthTextView) viewInflate.findViewById(R.id.temperature_less_than);
            this.w = (HealthTextView) viewInflate.findViewById(R.id.temperature_normal_range);
            this.f28092b = (HealthTextView) viewInflate.findViewById(R.id.temperature_more_than);
            return;
        }
        this.ac = findViewById(R.id.temperature_explain_icon);
        this.q = (HealthTextView) findViewById(R.id.temperature_less_than);
        this.w = (HealthTextView) findViewById(R.id.temperature_normal_range);
        this.f28092b = (HealthTextView) findViewById(R.id.temperature_more_than);
    }

    private void f() {
        this.g.setVisibility(8);
        this.f.setVisibility(8);
        this.j.setVisibility(8);
        this.ac.setVisibility(8);
        this.k.setText(this.e.getString(R.string.IDS_hw_temperature_note_detail_02, this.z, this.aa));
        this.i.setText(this.e.getString(R.string.IDS_hw_temperature_note_detail_05));
        this.m.setText(this.e.getString(R.string.IDS_hw_temperature_note_detail_10, UnitUtil.e(10.0d, 1, 0)));
        this.n.setText(this.e.getString(R.string.IDS_hw_temperature_note_detail_08));
        this.o.setText(this.e.getString(R.string.IDS_hw_temperature_note_detail_04));
        this.l.setText(this.e.getString(R.string.IDS_hw_temperature_note_detail_07));
    }

    private void g() {
        String string = this.e.getString(R.string.IDS_hw_temperature_note_detail_11, this.v, this.x, this.t, this.ab);
        this.g.setText(string);
        String string2 = this.e.getString(R.string.IDS_hw_temperature_note_detail_02, this.z, this.aa);
        this.k.setText(string2);
        this.i.setText(this.e.getString(R.string.IDS_hw_temperature_note_detail_05));
        this.m.setText(this.e.getString(R.string.IDS_hw_temperature_note_detail_09, UnitUtil.e(10.0d, 1, 0), this.u));
        this.n.setText(this.e.getString(R.string.IDS_hw_temperature_note_detail_08));
        this.o.setText(this.e.getString(R.string.IDS_hw_temperature_note_detail_04));
        this.f.setText(this.e.getString(R.string.IDS_hw_temperature_note_detail_03, this.f28093c, this.f28091a));
        this.l.setText(this.e.getString(R.string.IDS_hw_temperature_note_detail_07));
        this.h.setText(this.e.getString(R.string.IDS_hw_temperature_note_detail_06, UnitUtil.e(30.0d, 1, 0)));
        this.q.setText(this.s);
        this.w.setText(this.y);
        this.f28092b.setText(this.d);
        if (LanguageUtil.x(this.e)) {
            a(string, this.g);
            a(string2, this.k);
            a(this.s, this.q);
            a(this.y, this.w);
            a(this.d, this.f28092b);
        }
        if (LanguageUtil.ac(this.e)) {
            HealthTextView healthTextView = this.q;
            healthTextView.setTextSize(0, healthTextView.getTextSize() * 0.7f);
            HealthTextView healthTextView2 = this.w;
            healthTextView2.setTextSize(0, healthTextView2.getTextSize() * 0.7f);
            HealthTextView healthTextView3 = this.f28092b;
            healthTextView3.setTextSize(0, healthTextView3.getTextSize() * 0.7f);
        }
    }

    private void d() {
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.temperature_introduce_title_one);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.temperature_introduce_title_two);
        HealthTextView healthTextView3 = (HealthTextView) findViewById(R.id.temperature_introduce_title_three);
        if (this.r) {
            healthTextView.setVisibility(8);
            healthTextView2.setText(getString(R.string.IDS_health_skin_temperature));
            healthTextView3.setText(getString(R.string.IDS_hw_temperature_note_third_title));
        } else {
            healthTextView.setText(getString(R.string.IDS_settings_health_temperature));
            healthTextView2.setText(getString(R.string.IDS_health_skin_temperature));
            healthTextView3.setText(getString(R.string.IDS_hw_temperature_note_third_title));
        }
    }

    private void c() {
        if (this.p) {
            e();
        } else {
            b();
        }
    }

    private void e() {
        String strE = UnitUtil.e(37.20000076293945d, 1, 1);
        String strE2 = UnitUtil.e(38.0d, 1, 1);
        this.s = getString(R.string.IDS_temperature_less_than, new Object[]{strE});
        this.t = getString(R.string.IDS_temperature_more_than, new Object[]{strE});
        this.y = getString(R.string.IDS_temperature_normal_range, new Object[]{strE, strE2});
        this.d = getString(R.string.IDS_temperature_more_than, new Object[]{strE2});
        this.v = getString(R.string.IDS_temp_desc_celsius_unit, new Object[]{UnitUtil.e(36.0d, 1, 1)});
        this.x = getString(R.string.IDS_temp_desc_celsius_unit, new Object[]{UnitUtil.e(37.0d, 1, 1)});
        this.f28091a = getString(R.string.IDS_temp_desc_celsius_unit, new Object[]{UnitUtil.e(35.0d, 1, 1)});
        this.ab = getString(R.string.IDS_temperature_more_than, new Object[]{strE2});
        this.z = getString(R.string.IDS_temp_desc_celsius_unit, new Object[]{UnitUtil.e(32.0d, 1, 1)});
        this.aa = getString(R.string.IDS_temp_desc_celsius_unit, new Object[]{UnitUtil.e(34.0d, 1, 1)});
        this.u = getString(R.string.IDS_temp_desc_celsius_unit, new Object[]{UnitUtil.e(25.0d, 1, 1)});
        this.f28093c = getString(R.string.IDS_temp_desc_celsius_unit, new Object[]{UnitUtil.e(15.0d, 1, 1)});
    }

    private void b() {
        String strE = UnitUtil.e(vbr.b(37.2f), 1, 1);
        String strE2 = UnitUtil.e(vbr.b(38.0f), 1, 1);
        this.s = getString(R.string.IDS_temperature_fahrenheit_less, new Object[]{strE});
        this.t = getString(R.string.IDS_temperature_fahrenheit_more, new Object[]{strE});
        this.y = getString(R.string.IDS_temperature_fahrenheit_normal, new Object[]{strE, strE2});
        this.d = getString(R.string.IDS_temperature_fahrenheit_more, new Object[]{strE2});
        this.v = getString(R.string.IDS_temp_desc_fahrenheit_unit, new Object[]{UnitUtil.e(vbr.b(36.0f), 1, 1)});
        this.x = getString(R.string.IDS_temp_desc_fahrenheit_unit, new Object[]{UnitUtil.e(vbr.b(37.0f), 1, 1)});
        this.f28091a = getString(R.string.IDS_temp_desc_fahrenheit_unit, new Object[]{UnitUtil.e(vbr.b(35.0f), 1, 1)});
        this.ab = getString(R.string.IDS_temperature_fahrenheit_more, new Object[]{strE2});
        this.z = getString(R.string.IDS_temp_desc_fahrenheit_unit, new Object[]{UnitUtil.e(vbr.b(32.0f), 1, 1)});
        this.aa = getString(R.string.IDS_temp_desc_fahrenheit_unit, new Object[]{UnitUtil.e(vbr.b(34.0f), 1, 1)});
        this.u = getString(R.string.IDS_temp_desc_fahrenheit_unit, new Object[]{UnitUtil.e(vbr.b(25.0f), 1, 1)});
        this.f28093c = getString(R.string.IDS_temp_desc_fahrenheit_unit, new Object[]{UnitUtil.e(vbr.b(15.0f), 1, 1)});
    }

    private void a(String str, HealthTextView healthTextView) {
        if (str != null) {
            healthTextView.setText(str.replace("٫", "."));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
