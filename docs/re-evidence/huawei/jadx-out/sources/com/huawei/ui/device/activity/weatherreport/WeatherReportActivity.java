package com.huawei.ui.device.activity.weatherreport;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.device.R;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import defpackage.eej;
import defpackage.lsg;
import defpackage.mhs;
import defpackage.mim;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.qsp;
import health.compact.a.CommonUtil;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes16.dex */
public class WeatherReportActivity extends BaseActivity {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f24865b = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DeviceSettingsInteractors f24866a;
    private Context d;
    private Context e;
    private HealthRadioButton f;
    private mhs i;
    private boolean j;
    private HealthRadioButton k;
    private LinearLayout l;
    private HealthSwitchButton m;
    private RelativeLayout n;
    private HealthTextView o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DeviceCapability f24867c = null;
    private Handler h = new d(this);
    private CompoundButton.OnCheckedChangeListener g = new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.weatherreport.WeatherReportActivity.5
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean zAb = CommonUtil.ab(WeatherReportActivity.this.e);
            LogUtil.a("WeatherReportActivity", "isChecked = " + z);
            if (!zAb) {
                qpx.b(WeatherReportActivity.this.e, R.string.IDS_confirm_network_whether_connected);
                WeatherReportActivity.this.m.setChecked(!z);
                return;
            }
            WeatherReportActivity.this.j = z;
            if (z) {
                WeatherReportActivity.this.d();
            }
            WeatherReportActivity.this.m.setEnabled(false);
            LogUtil.a("WeatherReportActivity", "isChecked = " + z);
            WeatherReportActivity.this.g();
            if (z) {
                WeatherReportActivity.this.n.setEnabled(true);
                WeatherReportActivity.this.n.setAlpha(1.0f);
                WeatherReportActivity.this.f.setClickable(true);
                WeatherReportActivity.this.k.setClickable(true);
            } else {
                WeatherReportActivity.this.n.setEnabled(false);
                WeatherReportActivity.this.n.setAlpha(0.3f);
                WeatherReportActivity.this.f.setClickable(false);
                WeatherReportActivity.this.k.setClickable(false);
            }
            WeatherReportActivity.this.f24866a.e(z);
            WeatherReportActivity.this.h.sendEmptyMessageDelayed(0, 300L);
            WeatherReportActivity.this.j();
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        setContentView(R.layout.activity_settings_weatherreport);
        this.e = this;
        this.d = BaseApplication.getContext();
        this.i = mhs.a();
        Intent intent = getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("key_cache_capability")) != null) {
            this.f24867c = (DeviceCapability) bundleExtra.getParcelable("key_bundle_cache_capability");
        }
        b();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        a();
        HealthTextView healthTextView = this.o;
        if (healthTextView != null) {
            healthTextView.setPadding((int) getResources().getDimension(R.dimen.maxPaddingStart), 0, (int) getResources().getDimension(R.dimen.maxPaddingEnd), 0);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.d("WeatherReportActivity", "onDestroy()");
        setResult(0, null);
        CommonUtil.d(this.e);
    }

    private void b() {
        this.f24866a = DeviceSettingsInteractors.e(this);
        ReleaseLogUtil.d("R_WeatherReportActivity", "initData getSwitchSetting.WEATHER_SWITCH_STATUS");
        String strD = mim.d("weather_switch_status");
        if (TextUtils.isEmpty(strD)) {
            this.i.getSwitchSetting("weather_switch_status", new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.weatherreport.WeatherReportActivity.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    ReleaseLogUtil.d("R_WeatherReportActivity", "getSwitchSetting.WEATHER_SWITCH_STATUS onResponse errorCode = ", Integer.valueOf(i));
                    if (i != 0 || !(obj instanceof String)) {
                        WeatherReportActivity.this.b((String) null);
                        return;
                    }
                    String str = (String) obj;
                    mim.a("weather_switch_status", str);
                    WeatherReportActivity.this.b(str);
                }
            });
        } else {
            b(strD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        boolean z = !"false".equals(str);
        LogUtil.a("WeatherReportActivity", "WEATHER_SWITCH_STATUS isEnable = ", Boolean.valueOf(z));
        this.j = z;
        runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.weatherreport.WeatherReportActivity.4
            @Override // java.lang.Runnable
            public void run() {
                WeatherReportActivity.this.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        boolean z;
        Object systemService = getSystemService("location");
        if (!(systemService instanceof LocationManager)) {
            LogUtil.j("WeatherReportActivity", "checkLocationServiceStatus systemService not instanceof LocationManager");
            return;
        }
        LocationManager locationManager = (LocationManager) systemService;
        if (eej.c() == null || !eej.c().isWeatherPush()) {
            z = false;
        } else {
            LogUtil.a("WeatherReportActivity", "isWeather_push capability is:true");
            z = true;
        }
        if (locationManager.isProviderEnabled(GeocodeSearch.GPS) || locationManager.isProviderEnabled("network") || !z) {
            return;
        }
        LogUtil.a("WeatherReportActivity", "checkedChangeSwitch, before runOnUiThread.");
        runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.weatherreport.WeatherReportActivity.3
            @Override // java.lang.Runnable
            public void run() {
                WeatherReportActivity.this.b(R.string.IDS_homewear_turn_on_location_services_tip, 102);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.a("WeatherReportActivity", "Enter onActivityResult requestcode:" + i + ";resultcode:" + i2);
        super.onActivityResult(i, i2, intent);
        if (i == 102) {
            LogUtil.a("WeatherReportActivity", "Enter checkGpsPermission 2");
            c();
        } else {
            LogUtil.a("WeatherReportActivity", "Enter onActivityResult default");
        }
    }

    private void c() {
        Context context = this.d;
        String[] strArr = f24865b;
        if (lsg.d(context, strArr)) {
            return;
        }
        b(strArr);
    }

    private void b(String[] strArr) {
        boolean zD = lsg.d(this.d, strArr);
        LogUtil.a("WeatherReportActivity", "requestPermissions() isPermissionNeeded =" + zD);
        if (!zD) {
            lsg.a(this, strArr, new PermissionsResultAction() { // from class: com.huawei.ui.device.activity.weatherreport.WeatherReportActivity.9
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("WeatherReportActivity", "requestPermissions() permission onGranted()");
                }

                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str) {
                    LogUtil.e("WeatherReportActivity", "requestPermissions() permission onDenied()");
                }
            });
        } else {
            LogUtil.a("WeatherReportActivity", "requestPermissions() permission if (!hasPermissionNeeded) ELSE");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, final int i2) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.e).a(this.e.getString(i)).c(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.weatherreport.WeatherReportActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("WeatherReportActivity", "showGPSSettingDialog, onclick.");
                Intent intent = new Intent();
                intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
                try {
                    WeatherReportActivity.this.a(intent, i2);
                } catch (ActivityNotFoundException unused) {
                    intent.setAction("android.settings.SETTINGS");
                    try {
                        WeatherReportActivity.this.a(intent, i2);
                    } catch (ActivityNotFoundException unused2) {
                        LogUtil.e("WeatherReportActivity", "startActivity Exception!");
                    }
                }
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.weatherreport.WeatherReportActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("WeatherReportActivity", "showGpsDialog onclick NegativeButton");
            }
        }).c();
        noTitleCustomAlertDialogC.setCanceledOnTouchOutside(false);
        noTitleCustomAlertDialogC.setCancelable(false);
        if (noTitleCustomAlertDialogC.isShowing() || isFinishing()) {
            return;
        }
        noTitleCustomAlertDialogC.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Intent intent, int i) throws ActivityNotFoundException {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = getPackageManager();
        if (packageManager == null || (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536)) == null) {
            return;
        }
        intent.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
        startActivityForResult(intent, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        HealthTextView healthTextView = (HealthTextView) qsp.a(this, R.id.tv_unit);
        RelativeLayout relativeLayout = (RelativeLayout) qsp.a(this, R.id.rl_unit);
        this.n = relativeLayout;
        if (relativeLayout == null) {
            LogUtil.j("WeatherReportActivity", "initView mRlUnit is null");
            return;
        }
        this.o = (HealthTextView) qsp.a(this, R.id.weather_report_content);
        RelativeLayout relativeLayout2 = (RelativeLayout) qsp.a(this, R.id.weather_report_switch_item);
        HealthDivider healthDivider = (HealthDivider) qsp.a(this, R.id.item_line);
        this.m = (HealthSwitchButton) qsp.a(this, R.id.weather_report_switch_button);
        setViewSafeRegion(true, healthDivider);
        setViewSafeRegion(true, relativeLayout2);
        setViewSafeRegion(true, this.o);
        setViewSafeRegion(true, this.n);
        this.f = (HealthRadioButton) qsp.a(this, R.id.rb_celsius);
        this.k = (HealthRadioButton) qsp.a(this, R.id.rb_fahrenheit);
        LinearLayout linearLayout = (LinearLayout) qsp.a(this, R.id.weather_report_img_layout);
        this.l = linearLayout;
        qrs.b(linearLayout, 2);
        DeviceCapability deviceCapability = this.f24867c;
        if (deviceCapability != null && deviceCapability.isSupportUnitWeather()) {
            this.n.setVisibility(0);
            healthTextView.setVisibility(0);
            if (this.j) {
                this.n.setEnabled(true);
                this.f.setClickable(true);
                this.k.setClickable(true);
                this.n.setAlpha(1.0f);
            } else {
                this.n.setEnabled(false);
                this.f.setClickable(false);
                this.k.setClickable(false);
                this.n.setAlpha(0.3f);
            }
        } else {
            this.n.setVisibility(8);
            healthTextView.setVisibility(8);
        }
        e();
        i();
        if (this.o == null) {
            LogUtil.e("WeatherReportActivity", "ERROR widget get!");
            return;
        }
        this.m.setChecked(this.j);
        this.m.setOnCheckedChangeListener(this.g);
        g();
        j();
        BaseActivity.cancelLayoutById(this.o);
        HealthTextView healthTextView2 = (HealthTextView) qsp.a(this, R.id.tv_celsius);
        if (healthTextView2 != null) {
            String string = healthTextView2.getText().toString();
            if (!TextUtils.isEmpty(string)) {
                String[] strArrSplit = string.split(" ");
                if (strArrSplit.length > 0) {
                    healthTextView2.setContentDescription(strArrSplit[0]);
                }
            }
        }
        HealthTextView healthTextView3 = (HealthTextView) qsp.a(this, R.id.tv_fahrenheit);
        if (healthTextView3 != null) {
            String string2 = healthTextView3.getText().toString();
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            String[] strArrSplit2 = string2.split(" ");
            if (strArrSplit2.length > 0) {
                healthTextView3.setContentDescription(strArrSplit2[0]);
            }
        }
    }

    private void e() {
        ReleaseLogUtil.d("R_WeatherReportActivity", "initData getSwitchSetting.WEATHER_SWITCH_UNIT_STATUS");
        this.i.getSwitchSetting("weather_switch_unit_status", new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.weatherreport.WeatherReportActivity.10
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("R_WeatherReportActivity", "getSwitchSetting.WEATHER_SWITCH_UNIT_STATUS onResponse errorCode = ", Integer.valueOf(i));
                final boolean zEquals = true;
                if (i == 0 && (obj instanceof String)) {
                    zEquals = true ^ "false".equals((String) obj);
                } else if (UnitUtil.b()) {
                    zEquals = false;
                }
                LogUtil.a("WeatherReportActivity", "WEATHER_SWITCH_UNIT_STATUS isEnable = ", Boolean.valueOf(zEquals));
                WeatherReportActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.weatherreport.WeatherReportActivity.10.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (zEquals) {
                            WeatherReportActivity.this.f.setChecked(true);
                            WeatherReportActivity.this.k.setChecked(false);
                        } else {
                            WeatherReportActivity.this.f.setChecked(false);
                            WeatherReportActivity.this.k.setChecked(true);
                        }
                    }
                });
            }
        });
    }

    private void i() {
        HealthRadioButton healthRadioButton = this.f;
        if (healthRadioButton == null || this.k == null) {
            LogUtil.e("WeatherReportActivity", "initViewOnCheckedChangeListener: mRbCelsius or mRbFahrenheit is null");
        } else {
            healthRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.weatherreport.WeatherReportActivity.7
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    if (!WeatherReportActivity.this.j) {
                        LogUtil.a("WeatherReportActivity", "mIsWeatherReportFlag is " + WeatherReportActivity.this.j);
                    } else if (z) {
                        LogUtil.a("WeatherReportActivity", "mRbCelsius is checked!");
                        WeatherReportActivity.this.k.setChecked(false);
                        WeatherReportActivity.this.f24866a.a(true);
                        WeatherReportActivity.this.j();
                    }
                }
            });
            this.k.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.weatherreport.WeatherReportActivity.2
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    if (!WeatherReportActivity.this.j) {
                        LogUtil.a("WeatherReportActivity", "mIsWeatherReportFlag is " + WeatherReportActivity.this.j);
                    } else if (z) {
                        LogUtil.a("WeatherReportActivity", "mRbFahrenheit is checked!");
                        WeatherReportActivity.this.f.setChecked(false);
                        WeatherReportActivity.this.f24866a.a(false);
                        WeatherReportActivity.this.j();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.j) {
            int i = R.string.IDS_weather_push_opened_tip_health;
            if (qrs.ah(BaseApplication.getContext())) {
                i = R.string.IDS_pad_weather_opened_tip;
            }
            this.o.setText(i);
            return;
        }
        int i2 = R.string.IDS_weather_push_closed_tip_health;
        if (qrs.ah(BaseApplication.getContext())) {
            i2 = R.string.IDS_pad_weather_closed_tip;
        }
        this.o.setText(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(16);
        linkedHashMap.put("state", this.j ? String.valueOf(1) : String.valueOf(0));
        DeviceCapability deviceCapability = this.f24867c;
        if (deviceCapability != null && deviceCapability.isSupportUnitWeather()) {
            linkedHashMap.put("unit", this.f.isChecked() ? String.valueOf(1) : String.valueOf(2));
        }
        OpAnalyticsUtil.getInstance().setEvent2nd(AnalyticsValue.SETTING_WEATHER_PUSH_1090032.value(), linkedHashMap);
    }

    class d extends Handler {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<WeatherReportActivity> f24877c;

        d(WeatherReportActivity weatherReportActivity) {
            this.f24877c = new WeakReference<>(weatherReportActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (this.f24877c.get() == null) {
                return;
            }
            removeMessages(0);
            WeatherReportActivity.this.m.setEnabled(true);
            LogUtil.a("WeatherReportActivity", "mHandler mIsWeatherReportFlag = " + WeatherReportActivity.this.j);
            WeatherReportActivity.this.m.setChecked(WeatherReportActivity.this.j);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
