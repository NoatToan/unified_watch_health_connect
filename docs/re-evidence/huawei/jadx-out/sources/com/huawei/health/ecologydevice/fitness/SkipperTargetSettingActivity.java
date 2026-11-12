package com.huawei.health.ecologydevice.fitness;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.google.gson.reflect.TypeToken;
import com.huawei.ecologydevice.R;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.PluginDeviceAdapter;
import com.huawei.health.device.api.PluginDeviceApi;
import com.huawei.health.ecologydevice.callback.PickerChooseCallback;
import com.huawei.health.ecologydevice.manager.EcologyDevicePickerManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginbase.PluginBaseAdapter;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnlayout.HealthColumnRelativeLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.buh;
import defpackage.eif;
import defpackage.emh;
import defpackage.era;
import defpackage.erh;
import defpackage.erj;
import defpackage.ive;
import defpackage.izn;
import defpackage.lmf;
import defpackage.ofe;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class SkipperTargetSettingActivity extends BaseActivity implements View.OnClickListener, PickerChooseCallback<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f6505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f6506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f6507c;
    private EcologyDevicePickerManager d;
    private int e;
    private HealthTextView f;
    private ImageView i;
    private HealthColumnRelativeLayout j;
    private CustomTitleBar k;
    private EcologyDevicePickerManager l;
    private HealthButton m;
    private HealthTextView o;
    private int n = 0;
    private int g = 2;
    private int h = 100;
    private int p = 60;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6507c = this;
        setContentView(R.layout.skipper_target_setting_layout);
        Intent intent = getIntent();
        PluginDeviceApi pluginDeviceApi = (PluginDeviceApi) Services.b("PluginDevice", PluginDeviceApi.class);
        if (pluginDeviceApi != null) {
            LogUtil.a("indoor_SkipperTargetSettingActivity", "checkAutoTrackStatus");
            pluginDeviceApi.checkAutoTrackStatus();
            PluginBaseAdapter adapter = pluginDeviceApi.getAdapter();
            if (adapter == null || !(adapter instanceof PluginDeviceAdapter)) {
                pluginDeviceApi.init(BaseApplication.getContext());
                pluginDeviceApi.setAdapter(eif.a());
            }
        }
        if (intent != null) {
            this.e = intent.getIntExtra("currentSkipperTarget", 6);
        }
        LogUtil.d("indoor_SkipperTargetSettingActivity", "CURRENT MODLE ", Integer.valueOf(this.e));
        a();
        e();
    }

    private void e() {
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.i.setImageResource(R.drawable.common_ui_arrow_left);
        } else {
            this.i.setImageResource(R.drawable.common_ui_arrow_right);
        }
        int i = this.e;
        if (i == 0) {
            int iC = SharedPreferenceManager.c("first_rope_target", "rope_skipping_picker_time", 0);
            if (iC == 0) {
                iC = 60;
            }
            this.p = iC;
            b();
            this.f6506b.setTextColor(this.f6507c.getResources().getColor(R.color.textColorPrimary));
            this.j.setVisibility(0);
            this.f6505a.setBackground(this.f6507c.getResources().getDrawable(R.drawable.skipping_time));
            this.f6506b.setText(this.f6507c.getString(R.string.IDS_indoor_skipper_time_desc));
            this.k.setTitleText(this.f6507c.getString(R.string.IDS_indoor_skipper_by_time_target));
            this.f.setText(R.string.IDS_indoor_skipper_time_target);
            return;
        }
        if (i != 5) {
            if (i != 6) {
                return;
            }
            this.f6506b.setTextColor(this.f6507c.getResources().getColor(R.color.textColorPrimary));
            this.j.setVisibility(8);
            this.f6505a.setBackground(this.f6507c.getResources().getDrawable(R.drawable.skipping_free));
            this.f6506b.setText(this.f6507c.getString(R.string.IDS_indoor_skipper_free_desc));
            this.k.setTitleText(this.f6507c.getString(R.string.IDS_indoor_skipper_free_target));
            return;
        }
        c();
        this.f6506b.setTextColor(this.f6507c.getResources().getColor(R.color.textColorPrimary));
        this.j.setVisibility(0);
        this.f6505a.setBackground(this.f6507c.getResources().getDrawable(R.drawable.skipping_number));
        this.f6506b.setText(this.f6507c.getString(R.string.IDS_indoor_skipper_number_desc));
        this.k.setTitleText(this.f6507c.getString(R.string.IDS_indoor_skipper_by_number_target));
        HealthTextView healthTextView = this.o;
        Resources resources = this.f6507c.getResources();
        int i2 = R.plurals.IDS_indoor_skipper_number_value;
        int i3 = this.h;
        healthTextView.setText(resources.getQuantityString(i2, i3, Integer.valueOf(i3)));
        this.f.setText(R.string.IDS_indoor_skipper_number_target);
    }

    private void c() {
        String strB = SharedPreferenceManager.b("first_rope_target", "rope_skipping_picker_number", "");
        if (TextUtils.isEmpty(strB)) {
            return;
        }
        Map<String, Integer> map = (Map) izn.d(strB, new TypeToken<Map<String, Integer>>() { // from class: com.huawei.health.ecologydevice.fitness.SkipperTargetSettingActivity.1
        });
        this.h = a(map, "target_cache_value");
        this.g = a(map, "target_cache_select_index");
    }

    private int a(Map<String, Integer> map, String str) {
        if (map == null) {
            LogUtil.j("indoor_SkipperTargetSettingActivity", "getCacheValue() targetMap is null");
            return 0;
        }
        Integer num = map.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private void a() {
        this.k = (CustomTitleBar) findViewById(R.id.titlebar_skipper_target_setting);
        this.f6505a = (ImageView) findViewById(R.id.device_show_image);
        this.f6506b = (HealthTextView) findViewById(R.id.skipper_device_describe);
        this.f = (HealthTextView) findViewById(R.id.skipper_target_setting);
        this.j = (HealthColumnRelativeLayout) findViewById(R.id.skipper_target_setting_layout);
        this.i = (ImageView) findViewById(R.id.skipper_target_arrow);
        this.o = (HealthTextView) findViewById(R.id.skipper_target_value);
        this.j.setOnClickListener(this);
        HealthButton healthButton = (HealthButton) findViewById(R.id.start_skipping);
        this.m = healthButton;
        healthButton.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.e("indoor_SkipperTargetSettingActivity", "view is null");
            return;
        }
        if (view.getId() == R.id.skipper_target_setting_layout) {
            LogUtil.d("indoor_SkipperTargetSettingActivity", "Show dialog");
            i();
            return;
        }
        if (view.getId() == R.id.start_skipping) {
            LogUtil.a("indoor_SkipperTargetSettingActivity", "click start skipping");
            int i = this.e;
            if (i == 5) {
                this.n = this.h;
            } else if (i == 0) {
                this.n = this.p;
            } else if (i == 6) {
                this.n = 0;
            }
            LogUtil.a("indoor_SkipperTargetSettingActivity", "Current sport :", 283, "current target :", Integer.valueOf(i), "current  value:", Integer.valueOf(this.n));
            if ("true".equals(buh.e("ROPE_DISPLAY_PROCESS"))) {
                j();
            } else {
                erj.b(this.f6507c, this.e, this.n, null, emh.b().i());
                finish();
            }
            g();
        }
    }

    private void i() {
        if (this.e == 5) {
            if (this.d == null) {
                this.d = new EcologyDevicePickerManager.Builder(this).a(50.0d).e(10000.0d).b(this.g == 0 ? this.h : 0.0d).a(getString(R.string.IDS_indoor_skipper_number_target)).e(this).e();
            }
            this.d.e(d(), 5, R.plurals.IDS_indoor_skipper_number_unit_value, this.g);
        } else {
            if (this.l == null) {
                this.l = new EcologyDevicePickerManager.Builder(this).a(getString(R.string.IDS_indoor_skipper_time_target)).e(3599).a(60).d(this.p).e(this).e();
            }
            this.l.c();
        }
    }

    @Override // com.huawei.health.ecologydevice.callback.PickerChooseCallback
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onValueSelected(Integer num, int i) {
        if (this.e == 5) {
            HashMap map = new HashMap();
            map.put("target_cache_value", num);
            map.put("target_cache_select_index", Integer.valueOf(i));
            SharedPreferenceManager.c("first_rope_target", "rope_skipping_picker_number", ofe.c((Object) map));
            this.h = num.intValue();
            HealthTextView healthTextView = this.o;
            Resources resources = this.f6507c.getResources();
            int i2 = R.plurals.IDS_indoor_skipper_number_value;
            int i3 = this.h;
            healthTextView.setText(resources.getQuantityString(i2, i3, Integer.valueOf(i3)));
            return;
        }
        SharedPreferenceManager.d("first_rope_target", "rope_skipping_picker_time", num.intValue());
        this.p = num.intValue();
        b();
    }

    private void b() {
        int i = this.p;
        int i2 = i % 60;
        int i3 = i / 60;
        if (i2 == 0) {
            this.o.setText(this.f6507c.getString(R.string.IDS_indoor_skipper_minute_or_second, this.f6507c.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_time_minute_value, i3, Integer.valueOf(i3))));
        } else {
            this.o.setText(this.f6507c.getString(R.string.IDS_indoor_skipper_minute_and_second, this.f6507c.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_time_minute_value, i3, Integer.valueOf(i3)), this.f6507c.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_time_second_value, i2, Integer.valueOf(i2))));
        }
    }

    private int[] d() {
        int[] iArr = new int[23];
        int i = 0;
        while (i < 20) {
            int i2 = i + 1;
            iArr[i] = i2 * 50;
            i = i2;
        }
        iArr[20] = 2000;
        iArr[21] = 3000;
        iArr[22] = 5000;
        return iArr;
    }

    private void j() {
        ive.c().e(0, 283, this.e, this.n, (ISportDataCallback) null, this.f6507c.getApplicationContext());
        finish();
    }

    private void g() {
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("currentSkipperTargetType", Integer.valueOf(this.e));
        map.put("currentSkipperTarget", Integer.valueOf(this.n));
        map.put("prodId", era.b(emh.b().i()));
        map.put("macAddress", erh.d(emh.b().d()));
        lmf.d().c(this, AnalyticsValue.HEALTH_SKIPPING_2170016.value(), map, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
