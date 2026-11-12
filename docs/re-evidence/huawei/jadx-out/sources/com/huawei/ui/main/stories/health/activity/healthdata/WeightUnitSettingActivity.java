package com.huawei.ui.main.stories.health.activity.healthdata;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.main.R;
import defpackage.ipi;
import defpackage.lmf;
import defpackage.nkb;
import defpackage.qqj;
import defpackage.qre;
import defpackage.qrr;
import defpackage.vei;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class WeightUnitSettingActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f27675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f27676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27677c;
    private HealthRadioButton d;
    private HealthTextView e;
    private HealthRadioButton f;
    private HealthTextView g;
    private HealthRadioButton h;
    private LinearLayout i;
    private LinearLayout j;
    private int l;
    private CustomTitleBar m;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        clearBackgroundDrawable();
        setContentView(R.layout.activity_weight_unit_setting);
        LogUtil.a("PluginDevice_WeightUnitSettingActivity", "onCreate...");
        this.f27675a = BaseApplication.getContext();
        e();
    }

    private void e() {
        Drawable drawable;
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.weight_unit_setting_title_bar);
        this.m = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(getColor(R.color.colorSubBackground));
        if (LanguageUtil.ba(this.f27675a)) {
            drawable = this.f27675a.getResources().getDrawable(R.drawable.health_navbar_rtl_back_selector);
        } else {
            drawable = this.f27675a.getResources().getDrawable(R.drawable.health_navbar_back_selector);
        }
        this.m.setLeftButtonDrawable(drawable, qre.f(R.string.accessibility_go_back));
        this.m.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: usb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(view);
            }
        });
        this.f27676b = (LinearLayout) findViewById(R.id.weight_catty_settings_unit_layout);
        this.d = (HealthRadioButton) findViewById(R.id.weight_catty_unit_radio_button);
        this.i = (LinearLayout) findViewById(R.id.weight_kg_settings_unit_layout);
        this.h = (HealthRadioButton) findViewById(R.id.weight_kg_unit_radio_button);
        this.j = (LinearLayout) findViewById(R.id.weight_lbs_settings_unit_layout);
        this.g = (HealthTextView) findViewById(R.id.weight_lbs_unit_name_text);
        this.f = (HealthRadioButton) findViewById(R.id.weight_lbs_unit_radio_button);
        this.e = (HealthTextView) findViewById(R.id.weight_unit_setting_hint);
        if (LanguageUtil.f(this.f27675a) && !Utils.o()) {
            this.f27676b.setVisibility(0);
        }
        this.g.setText(getString(R.string.IDS_weight_unit_lbs, new Object[]{""}));
        this.d.setClickable(false);
        this.h.setClickable(false);
        this.f.setClickable(false);
        this.f27677c = UnitUtil.e();
        this.l = UnitUtil.e();
        c(this.f27677c);
        this.f27676b.setOnClickListener(new View.OnClickListener() { // from class: urx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.c(view);
            }
        });
        this.i.setOnClickListener(new View.OnClickListener() { // from class: use
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(view);
            }
        });
        this.j.setOnClickListener(new View.OnClickListener() { // from class: usc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50504c.e(view);
            }
        });
        this.e.setTypeface(qrr.c());
    }

    public /* synthetic */ void b(View view) {
        if (this.f27677c != UnitUtil.e()) {
            setResult(500);
        }
        if (this.l != UnitUtil.e()) {
            vei.d((Activity) this, true);
        }
        LogUtil.a("PluginDevice_WeightUnitSettingActivity", "initView mUnit ", Integer.valueOf(this.l), " mCutUnit ", Integer.valueOf(this.f27677c));
        finish();
    }

    public /* synthetic */ void c(View view) {
        b(1);
    }

    public /* synthetic */ void d(View view) {
        b(2);
    }

    public /* synthetic */ void e(View view) {
        b(3);
    }

    private void b(int i) {
        c(i);
        e(i);
        ObserverManagerUtil.e("WEIGHT_DATA_CHANGE_UNIT_H5", new Object[0]);
    }

    private void c(int i) {
        this.d.setChecked(false);
        this.h.setChecked(false);
        this.f.setChecked(false);
        if (i == 1 && LanguageUtil.f(this.f27675a) && !Utils.o()) {
            this.d.setChecked(true);
        } else if (i == 3) {
            this.f.setChecked(true);
        } else {
            this.h.setChecked(true);
        }
    }

    private void e(int i) {
        UnitUtil.a(i);
        this.f27677c = i;
        if (SystemInfo.j()) {
            LogUtil.a("PluginDevice_WeightUnitSettingActivity", "isNewHonor");
            ipi.d(this);
        }
        LogUtil.a("PluginDevice_WeightUnitSettingActivity", "saveWeightUnit : writeUnitToDb");
        nkb.d().e("custom.weight_unit", String.valueOf(i));
        qqj.a(this, -1);
    }

    private void d(int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        if (i == 1) {
            map.put("type", "catty");
        }
        if (i == 2) {
            map.put("type", "kilogram");
        }
        if (i == 3) {
            map.put("type", "pounds");
        }
        lmf.d().c(this.f27675a, AnalyticsValue.WEIGHT_PAGE_UNIT_SETTING_2160119.value(), map, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.l != UnitUtil.e()) {
            vei.d((Activity) this, true);
        }
        LogUtil.a("PluginDevice_WeightUnitSettingActivity", "onBackPressed mUnit ", Integer.valueOf(this.l), " mCutUnit ", Integer.valueOf(this.f27677c));
        super.onBackPressed();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        d(this.f27677c);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
