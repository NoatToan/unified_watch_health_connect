package com.huawei.ui.main.stories.fitness.activity.pressuremeasure;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.health.configuredpage.api.ConfiguredPageDataCallback;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.preload.H5PreloadCountStrategy;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.h5pro.preload.H5ProPkgPreloadSyncTask;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.pressure.activity.PressureMeasureActivity;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.activity.PressureCalibrateActivity;
import com.huawei.ui.main.stories.template.health.common.CommonHealthNoDeviceFragment;
import defpackage.idy;
import defpackage.iov;
import defpackage.lsy;
import defpackage.lvb;
import defpackage.mgg;
import defpackage.mhs;
import defpackage.qjy;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.trd;
import defpackage.une;
import defpackage.unf;
import defpackage.vdo;
import defpackage.wqp;
import defpackage.wux;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
public class NoDataActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomTitleBar f26989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f26990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f26991c;
    private View d;
    private Context e;
    private HealthButton g;
    private boolean h;
    private View l;
    private LinearLayout m;
    private String n;
    private LinearLayout o;
    private HealthCardView p;
    private long q;
    private ImageView r;
    private HealthTextView s;
    private RelativeLayout t;
    private unf u;
    private HealthCardView v;
    private HealthToolBar w;
    private ImageView x;
    private String k = "";
    private boolean i = false;
    private a j = new a(this);
    private boolean f = true;

    private void c() {
        LoginInit.getInstance(this).browsingToLogin(new IBaseResponseCallback() { // from class: ugf
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f50053b.a(i, obj);
            }
        }, AnalyticsValue.HEALTH_PRESSUER_NODATA_MEASUREMENT_CLICK_2160008.value());
    }

    public /* synthetic */ void a(int i, Object obj) {
        if (i == 0) {
            n();
        } else {
            LogUtil.j("NoDataActivity", "browsingToLogin errorCode is not success", Integer.valueOf(i));
        }
    }

    static class a extends Handler {
        WeakReference<NoDataActivity> e;

        a(NoDataActivity noDataActivity) {
            this.e = new WeakReference<>(noDataActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            NoDataActivity noDataActivity = this.e.get();
            if (noDataActivity == null) {
                LogUtil.e("NoDataActivity", "MyHandler handleMessage fragment null");
                return;
            }
            int i = message.what;
            if (i == 1000) {
                noDataActivity.o();
            } else {
                if (i != 1001) {
                    return;
                }
                noDataActivity.f();
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("NoDataActivity", "onCreate mIsAlreadySetInternet = " + this.i);
        this.e = this;
        setContentView(R.layout.stress_activity_no_datas);
        ((WindowManager) this.e.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay().getMetrics(new DisplayMetrics());
        h();
        g();
        if (mgg.c("NoDataActivity") == null && !Utils.o()) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.container);
            wqp.b(getSupportFragmentManager(), CommonHealthNoDeviceFragment.e("StressCardConstructor", 3), R.id.container);
            linearLayout.setVisibility(0);
            this.f26990b.setVisibility(8);
            this.f26989a.setVisibility(8);
            this.h = true;
        } else {
            this.h = false;
            this.p.setOnClickListener(this);
        }
        cancelAdaptRingRegion();
        this.q = System.currentTimeMillis();
        this.w.d(this.f26991c);
        this.w.setOnSingleTapListener(new HealthToolBar.OnSingleTapListener() { // from class: ugc
            @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
            public final void onSingleTap(int i) {
                this.f50051b.e(i);
            }
        });
        this.w.setIcon(1, R.drawable.stress_pressure_detection);
        this.w.setIconTitle(1, getString(R.string.IDS_hw_pressure_measuremeant));
        this.w.setIcon(2, R.drawable.ic_pressure_measure);
        this.w.setIconTitle(2, this.e.getResources().getString(R.string.IDS_hw_pressure_adjust));
        this.w.setIconVisible(3, 8);
        this.w.a((Activity) this.e);
        a();
        e();
    }

    public /* synthetic */ void e(int i) {
        if (i == 1) {
            c();
        } else {
            if (i != 2) {
                return;
            }
            d();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    private void e() {
        lsy.a(new Runnable() { // from class: ugg
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b();
            }
        });
    }

    public /* synthetic */ void b() {
        String url = GRSManager.c(this.e).getUrl("messageCenterUrl");
        this.n = url;
        LogUtil.d("NoDataActivity", "initHostFromGrs mMessageCenterHost = ", url);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LogUtil.a("NoDataActivity", "onConfigurationChanged()");
        LinearLayout linearLayout = this.m;
        if (linearLayout != null) {
            trd.b(3, linearLayout);
        }
    }

    private void g() {
        if (qrs.af(this.e)) {
            this.r.setBackground(this.e.getResources().getDrawable(R.mipmap.pic_stress_nodata));
            this.x.setBackground(this.e.getResources().getDrawable(R.mipmap.pic_stress_nodata));
        } else {
            this.r.setBackground(this.e.getResources().getDrawable(R.mipmap.health_stress_nodata_img_new));
            this.x.setBackground(this.e.getResources().getDrawable(R.mipmap.health_stress_nodata_img_new));
        }
    }

    private void h() {
        this.d = qsp.a(this, R.id.blank_view);
        this.t = (RelativeLayout) qsp.a(this, R.id.common_auto_test_toast_layout);
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.fitness_detail_titlebar);
        this.f26989a = customTitleBar;
        customTitleBar.setTitleText(getResources().getString(R.string.IDS_settings_one_level_menu_settings_item_text_id14));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.first_no_data_layout);
        this.f26990b = linearLayout;
        setViewSafeRegion(false, linearLayout);
        this.p = (HealthCardView) findViewById(R.id.pressure_guide);
        this.r = (ImageView) findViewById(R.id.pressure_guide_img);
        this.v = (HealthCardView) findViewById(R.id.pressure_guide_another);
        this.x = (ImageView) findViewById(R.id.pressure_guide_another_img);
        this.v.setOnClickListener(this);
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.pressure_data_analyse_detail);
        this.s = healthTextView;
        healthTextView.setAutoTextInfo(9, 1, 1);
        this.w = (HealthToolBar) findViewById(R.id.buttomview);
        this.f26991c = View.inflate(this.e, R.layout.hw_toolbar_bottomview, null);
        this.l = findViewById(R.id.pressure_no_data_set_network);
        this.g = (HealthButton) findViewById(R.id.btn_no_net_work);
        this.m = (LinearLayout) findViewById(R.id.message_service);
        this.o = (LinearLayout) findViewById(R.id.pressure_no_data_marketing_layout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        une.a(this.e, new IBaseResponseCallback() { // from class: ugd
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.c(i, obj);
            }
        });
    }

    public /* synthetic */ void c(int i, Object obj) {
        if (i == 0) {
            LogUtil.a("NoDataActivity", "user click adjust button");
            HashMap map = new HashMap(1);
            map.put("click", 1);
            map.put("havedevice", 1);
            idy.b(AnalyticsValue.HEALTH_PRESSUER_NODATAPAGE_ADJUST_CLICK_2160006.value(), map);
            iov.d(this.e, new Intent(this.e, (Class<?>) PressureCalibrateActivity.class));
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        LogUtil.a("NoDataActivity", "mPressureAutoTestLayout.getVisibility() ", Integer.valueOf(this.t.getVisibility()));
        if (this.t.getVisibility() == 8) {
            this.d.setVisibility(0);
        } else if (this.t.getVisibility() == 0) {
            this.d.setVisibility(8);
        } else {
            LogUtil.a("NoDataActivity", "mPressureAutoTestLayout Visibility = ", Integer.valueOf(this.t.getVisibility()));
        }
        qjy.d(this.e, new IBaseResponseCallback() { // from class: ufz
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f50043b.b(i, obj);
            }
        }, this.t, this.e.getResources().getString(R.string.IDS_hw_open_auto_pressure_detector_content, wux.e()), new String[]{"pressure_auto_detector_agree_no_again_tip", "pressure_auto_detector_dialog_time", "pressure_auto_detector_count", "pressure_auto_detetor_is_show"});
    }

    public /* synthetic */ void b(int i, Object obj) {
        LogUtil.a("NoDataActivity", "errorCode = ", Integer.valueOf(i));
        if (i == -1) {
            this.d.setVisibility(8);
            return;
        }
        if (i != 0) {
            if (i == 100000) {
                this.d.setVisibility(0);
                return;
            } else {
                LogUtil.a("NoDataActivity", "errCode is other and = ", Integer.valueOf(i));
                return;
            }
        }
        this.d.setVisibility(0);
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.ui.device.activity.pressautomonitor.PressAutoMonitorActivity");
        intent.putExtra("pressure_is_have_datas", false);
        intent.putExtra("from_card", true);
        iov.d(this.e, intent);
        finish();
    }

    private void a() {
        this.g.setOnClickListener(this);
        this.m.setVisibility(0);
        if (!CommonUtil.ca() && (!Utils.o() || vdo.c("NoDataActivity", this.e))) {
            trd.a(3, this.m, (ConfiguredPageDataCallback) null);
        }
        this.e = this;
        this.u = new unf(this.e, false);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LinearLayout linearLayout;
        super.onResume();
        LogUtil.a("NoDataActivity", "mIsAlreadySetInternet = ", Boolean.valueOf(this.i));
        if (!CommonUtil.ab(this.e)) {
            this.i = true;
            this.f26990b.setVisibility(8);
            this.l.setVisibility(0);
        } else {
            this.f26990b.setVisibility(this.h ? 8 : 0);
            this.l.setVisibility(8);
            if (this.i && i() && (linearLayout = this.m) != null) {
                trd.a(3, linearLayout, (ConfiguredPageDataCallback) null);
            }
            this.i = false;
            String strE = SharedPreferenceManager.e(this.e, Integer.toString(10006), "pressure_no_data_is_first_inter");
            this.k = strE;
            if (!"true".equals(strE) || Utils.o()) {
                this.v.setVisibility(8);
                this.p.setVisibility(0);
            } else {
                this.v.setVisibility(0);
                this.p.setVisibility(8);
            }
            if (Utils.o()) {
                this.p.setOnClickListener(null);
            }
            this.d.setVisibility(0);
            DeviceInfo deviceInfoC = mgg.c("NoDataActivity");
            boolean isLogined = LoginInit.getInstance(this).getIsLogined();
            LogUtil.a("NoDataActivity", "onResume ", "isLogin = ", Boolean.valueOf(isLogined));
            if (isLogined && deviceInfoC != null) {
                LogUtil.a("NoDataActivity", "currentDeviceInfo", deviceInfoC.toString());
                if (deviceInfoC.getDeviceConnectState() == 2) {
                    a(deviceInfoC);
                }
            }
        }
        boolean z = this.f;
        if (z) {
            LogUtil.a("NoDataActivity", "onResume mIsFirstVisible = ", Boolean.valueOf(z));
            j();
            l();
        }
        this.f = false;
    }

    private boolean i() {
        if (CommonUtil.ca() || CommonUtil.bd()) {
            return false;
        }
        return !Utils.o() || vdo.c("NoDataActivity", this.e);
    }

    private void j() {
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            HashMap map = new HashMap();
            map.put(4030, this.o);
            marketingApi.requestMarketingResource(new MarketingOption.Builder().setContext(this).setPageId(330).setLayoutMap(map).build());
        }
    }

    private void a(DeviceInfo deviceInfo) {
        LogUtil.a("NoDataActivity", "isSupportPressAutoMonitor = ", Boolean.valueOf(c(deviceInfo)));
        if (c(deviceInfo)) {
            mhs.a().getSwitchSetting("press_auto_monitor_switch_status", new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.fitness.activity.pressuremeasure.NoDataActivity.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("NoDataActivity", "processIfDeviceSupportPressureAutoMonitor errorCode = ", Integer.valueOf(i));
                    if (i == -1) {
                        NoDataActivity.this.j.sendEmptyMessage(1000);
                        return;
                    }
                    if (i == 0 && (obj instanceof String)) {
                        if ("false".equals((String) obj)) {
                            NoDataActivity.this.j.sendEmptyMessage(1000);
                            return;
                        }
                        return;
                    }
                    LogUtil.a("NoDataActivity", "processIfDeviceSupportPressureAutoMonitor errorCode is other.");
                }
            });
        }
    }

    private boolean c(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return false;
        }
        Map<String, DeviceCapability> mapD = lvb.e().d(1, deviceInfo.getDeviceIdentify(), "NoDataActivity");
        if (mapD == null || mapD.isEmpty()) {
            LogUtil.j("NoDataActivity", "inquireDeviceMsdpCapability, deviceCapabilityHashMaps is empty");
            return false;
        }
        DeviceCapability deviceCapability = mapD.get(deviceInfo.getDeviceIdentify());
        return deviceCapability != null && deviceCapability.isSupportPressAutoMonitor();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.d("NoDataActivity", "NoDataActivity onDestroy");
        this.i = false;
        long jCurrentTimeMillis = this.q > 0 ? System.currentTimeMillis() - this.q : 0L;
        this.j.removeCallbacksAndMessages(null);
        HashMap map = new HashMap(1);
        map.put("keeptime", Long.valueOf(jCurrentTimeMillis));
        idy.b(AnalyticsValue.HEALTH_PRESSUER_KEEPTIME_2160002.value(), map);
        SharedPreferenceManager.e(this.e, Integer.toString(10006), "pressure_no_data_is_first_inter", "true", new StorageParams());
    }

    private void d() {
        LoginInit.getInstance(this).browsingToLogin(new IBaseResponseCallback() { // from class: uge
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f50052c.e(i, obj);
            }
        }, AnalyticsValue.HEALTH_PRESSUER_NODATAPAGE_ADJUST_CLICK_2160006.value());
    }

    public /* synthetic */ void e(int i, Object obj) {
        if (i == 0) {
            k();
        } else {
            LogUtil.j("NoDataActivity", "browsingToLogin errorCode is not success", Integer.valueOf(i));
        }
    }

    private void k() {
        LogUtil.d("NoDataActivity", "you click adjust button");
        DeviceInfo deviceInfoC = mgg.c("NoDataActivity");
        int i = (deviceInfoC == null || deviceInfoC.getDeviceConnectState() != 2) ? 0 : 1;
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("havedevice", Integer.valueOf(i));
        idy.b(AnalyticsValue.HEALTH_PRESSUER_NODATAPAGE_ADJUST_CLICK_2160006.value(), map);
        LogUtil.a("NoDataActivity", "dialog for click pressure adjust button ");
        if (this.u.c()) {
            this.u.e();
        } else if (this.u.b()) {
            this.u.d();
        } else {
            une.c(this.e, new IBaseResponseCallback() { // from class: ugi
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.f50054a.d(i2, obj);
                }
            });
        }
    }

    public /* synthetic */ void d(int i, Object obj) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("havedevice", 1);
        idy.b(AnalyticsValue.HEALTH_PRESSUER_NODATAPAGE_ADJUST_CLICK_2160006.value(), map);
        Intent intent = new Intent(this.e, (Class<?>) PressureCalibrateActivity.class);
        intent.putExtra("pressure_is_have_datas", false);
        iov.d(this.e, intent);
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_no_net_work) {
            CommonUtil.t(this.e);
        } else if (id == R.id.pressure_guide_another) {
            m();
        } else {
            LogUtil.j("NoDataActivity", "unhandled click event! ");
        }
    }

    private void m() {
        HashMap map = new HashMap(1);
        map.put("click", "1");
        idy.b(AnalyticsValue.HEALTH_PRESSURE_DATA_ANALYSE_CLICK_2160016.value(), map);
        if (TextUtils.isEmpty(this.n)) {
            LogUtil.e("NoDataActivity", "processSecondNoDataLayoutClickEvent mMessageCenterHost is empty");
            return;
        }
        Intent intent = new Intent(this.e, (Class<?>) WebViewActivity.class);
        intent.putExtra("url", this.n + "/messageH5/sleephtml/salesPromotion.html");
        iov.d(this.e, intent);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    private void n() {
        int i;
        LogUtil.d("NoDataActivity", "you click detector button");
        HashMap map = new HashMap(16);
        DeviceInfo deviceInfoC = mgg.c("NoDataActivity");
        if (deviceInfoC != null) {
            LogUtil.d("NoDataActivity", "currentDeviceInfo", deviceInfoC.toString());
            if (deviceInfoC.getDeviceConnectState() == 2) {
                i = 1;
            } else {
                i = 0;
            }
        } else {
            i = 0;
        }
        map.put("click", 1);
        map.put("havedevice", Integer.valueOf(i));
        idy.b(AnalyticsValue.HEALTH_PRESSUER_NODATA_MEASUREMENT_CLICK_2160008.value(), map);
        une.b(this.e, new IBaseResponseCallback() { // from class: uga
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.f50047c.f(i2, obj);
            }
        });
    }

    public /* synthetic */ void f(int i, Object obj) {
        if (i != 0) {
            if (i != 100001) {
                LogUtil.a("NoDataActivity", " pressureMeasurementButtonDialog onResponse err");
                return;
            } else {
                this.j.sendEmptyMessage(1001);
                return;
            }
        }
        Intent intent = new Intent(this.e, (Class<?>) PressureMeasureActivity.class);
        intent.putExtra("pressure_is_have_datas", false);
        iov.d(this.e, intent);
        finish();
        LogUtil.a("NoDataActivity", " startActivity PressureMeasureActivity ");
    }

    private void l() {
        H5ProPkgPreloadSyncTask.startTask(this.e, "com.huawei.health.h5.breath-training", new H5PreloadCountStrategy(1));
    }
}
