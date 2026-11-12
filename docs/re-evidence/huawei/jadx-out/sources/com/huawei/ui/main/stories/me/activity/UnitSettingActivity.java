package com.huawei.ui.main.stories.me.activity;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.main.R;
import defpackage.fks;
import defpackage.ipi;
import defpackage.lmf;
import defpackage.mbu;
import defpackage.nkb;
import defpackage.qqj;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class UnitSettingActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f28472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f28473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f28474c = new e(this);
    private HealthTextView d;
    private HealthRadioButton e;
    private HealthTextView g;
    private HealthRadioButton h;
    private LinearLayout i;
    private ImageView j;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_unit_setting);
        a();
    }

    private void a() {
        this.f28472a = (LinearLayout) findViewById(R.id.metric_imperial_unit_setting_layout);
        this.d = (HealthTextView) findViewById(R.id.metric_imperial_text);
        this.f28473b = (ImageView) findViewById(R.id.metric_imperial_arrow);
        this.f28472a.setOnClickListener(this);
        this.i = (LinearLayout) findViewById(R.id.temperature_unit_setting_layout);
        this.g = (HealthTextView) findViewById(R.id.temperature_unit_text);
        this.j = (ImageView) findViewById(R.id.temperature_unit_arrow);
        this.i.setOnClickListener(this);
        if (LanguageUtil.ba(this)) {
            Drawable drawable = getResources().getDrawable(R.drawable.common_ui_arrow_left);
            this.f28473b.setBackground(drawable);
            this.j.setBackground(drawable);
        } else {
            Drawable drawable2 = getResources().getDrawable(R.drawable.common_ui_arrow_right);
            this.f28473b.setBackground(drawable2);
            this.j.setBackground(drawable2);
        }
        d();
        c();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isDestroyed() || isFinishing()) {
            LogUtil.j("UnitSettingActivity", "onClick activity isDestroyed or isFinishing is null");
            return;
        }
        if (qrs.c(750)) {
            LogUtil.a("UnitSettingActivity", "onClick is too fast");
            return;
        }
        if (view == this.f28472a) {
            a(101);
        } else if (view == this.i) {
            a(102);
        } else {
            LogUtil.j("UnitSettingActivity", "onClick click to other view");
        }
    }

    private void a(int i) {
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService("layout_inflater");
        if (getSystemService("layout_inflater") instanceof LayoutInflater) {
            View viewInflate = layoutInflater.inflate(R.layout.hw_show_settings_unit_view, (ViewGroup) null);
            HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.metric_unit_name_text);
            HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.imperial_unit_name_text);
            if (i == 101) {
                healthTextView.setText(getString(R.string.IDS_system_set_metric));
                healthTextView2.setText(getString(R.string.IDS_system_set_imperial));
            } else {
                healthTextView.setText(getString(R.string.IDS_celsius_unit));
                healthTextView2.setText(getString(R.string.IDS_fahrenheit_unit));
            }
            a(i, viewInflate);
        }
    }

    private void a(final int i, View view) {
        String string;
        this.h = (HealthRadioButton) view.findViewById(R.id.metric_unit_radio_button);
        this.e = (HealthRadioButton) view.findViewById(R.id.imperial_unit_radio_button);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this);
        if (i == 101) {
            string = getString(R.string.IDS_system_set_unit);
        } else {
            string = getString(R.string.IDS_temperature_show_style);
        }
        builder.a(string).b(view, 0, 0).d(R.string.IDS_hw_show_cancel, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.UnitSettingActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                LogUtil.a("UnitSettingActivity", "createUnitDialog onClick positive view");
            }
        });
        final CustomViewDialog customViewDialogD = builder.d();
        this.h.setClickable(false);
        this.e.setClickable(false);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.settings_metric_unit_layout);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.settings_imperial_unit_layout);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.UnitSettingActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (i == 101) {
                    UnitSettingActivity.this.c(0, true, false);
                } else {
                    UnitSettingActivity.this.e(true, false);
                }
                customViewDialogD.dismiss();
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.me.activity.UnitSettingActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (i == 101) {
                    UnitSettingActivity.this.c(1, false, true);
                } else {
                    UnitSettingActivity.this.e(false, true);
                }
                customViewDialogD.dismiss();
            }
        });
        d(i);
        customViewDialogD.show();
    }

    private void d(int i) {
        if (i == 101) {
            boolean zF = UnitUtil.f();
            c(!zF, zF);
        } else {
            boolean zA = UnitUtil.a();
            c(zA, !zA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, boolean z, boolean z2) {
        c(z, z2);
        b(i);
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z, boolean z2) {
        c(z, z2);
        d(z);
        LogUtil.a("UnitSettingActivity", "clickCelsiusOrFahrenheit send command to device");
        mbu.e().d(z);
    }

    private void c(boolean z, boolean z2) {
        this.h.setChecked(z);
        this.e.setChecked(z2);
    }

    private void b(int i) {
        UnitUtil.b("UnitSettingActivity", i == 1);
        if (SystemInfo.j()) {
            LogUtil.a("UnitSettingActivity", "isNewHonor");
            ipi.d(this);
        }
        LogUtil.a("UnitSettingActivity", "saveMetricImperialUnit : writeUnitToDb");
        nkb.d().e("custom.metric_imperial_unit", String.valueOf(i));
        this.f28474c.sendEmptyMessage(101);
        qqj.a(this, -1);
        String strValue = AnalyticsValue.HEALTH_MINE_SETTING_UNIT_2040070.value();
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("type", Integer.valueOf(i));
        lmf.d().c(this, strValue, map, 0);
    }

    private void d(boolean z) {
        UnitUtil.d(z);
        LogUtil.a("UnitSettingActivity", "saveTemperatureUnit : isCelsius = ", Boolean.valueOf(z));
        nkb.d().e("custom.temperature_unit", String.valueOf(z));
        this.f28474c.sendEmptyMessage(102);
        qqj.a(this, -1);
        String strValue = AnalyticsValue.HEALTH_MINE_SETTING_UNIT_2041086.value();
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("type", Boolean.valueOf(z));
        lmf.d().c(this, strValue, map, 0);
    }

    private void e() {
        boolean zF = UnitUtil.f();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("unit", zF);
        } catch (JSONException unused) {
            LogUtil.e("UnitSettingActivity", "notifyWearDevice setMetricUnit json error");
        }
        LogUtil.a("UnitSettingActivity", "notifyWearDevice isFlag = ", Boolean.valueOf(zF));
        fks.d().f(jSONObject, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        LogUtil.a("UnitSettingActivity", "updateMetricImperialUnit isImperialUnit : ", Boolean.valueOf(UnitUtil.f()));
        this.d.setText(UnitUtil.f() ? R.string.IDS_system_set_imperial : R.string.IDS_system_set_metric);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("UnitSettingActivity", "updateTemperatureUnit isShowCelsiusUnit : ", Boolean.valueOf(UnitUtil.a()));
        this.g.setText(UnitUtil.a() ? R.string.IDS_celsius_unit : R.string.IDS_fahrenheit_unit);
    }

    static class e extends BaseHandler<UnitSettingActivity> {
        e(UnitSettingActivity unitSettingActivity) {
            super(unitSettingActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(UnitSettingActivity unitSettingActivity, Message message) {
            if (unitSettingActivity == null || message == null) {
                LogUtil.j("UnitSettingActivity", "handleMessageWhenReferenceNotNull activity is null or msg is null");
                return;
            }
            LogUtil.a("UnitSettingActivity", "handleMessageWhenReferenceNotNull msg.what = ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 101) {
                unitSettingActivity.d();
            } else if (i == 102) {
                unitSettingActivity.c();
            } else {
                LogUtil.j("UnitSettingActivity", "handleMessageWhenReferenceNotNull is default value");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
