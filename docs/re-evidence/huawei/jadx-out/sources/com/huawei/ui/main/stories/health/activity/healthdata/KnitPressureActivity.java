package com.huawei.ui.main.stories.health.activity.healthdata;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.preload.H5PreloadCountStrategy;
import com.huawei.health.knit.model.KnitSubPageConfig;
import com.huawei.health.knit.section.listener.BasePageResTrigger;
import com.huawei.health.knit.section.listener.IPageResTrigger;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.knit.ui.KnitHealthDetailActivity;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.preload.H5ProPkgPreloadSyncTask;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.pressuremeasure.PressureIntroduceActivity;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDataModelActivity;
import com.huawei.ui.main.stories.template.PopMenuManager;
import com.huawei.ui.main.stories.template.data.IPopMenuItemClick;
import com.huawei.ui.main.stories.utils.FitnessUtils;
import com.huawei.ui.main.stories.utils.LastTimeHealthDataReader;
import defpackage.btx;
import defpackage.cqd;
import defpackage.ecu;
import defpackage.eej;
import defpackage.ets;
import defpackage.idy;
import defpackage.lmf;
import defpackage.mgg;
import defpackage.njy;
import defpackage.peh;
import defpackage.qqj;
import defpackage.qre;
import defpackage.wpo;
import defpackage.wuo;
import defpackage.wup;
import health.compact.a.EnvironmentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class KnitPressureActivity extends KnitHealthDetailActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f27561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bundle f27562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f27563c;
    private boolean e;
    private LastTimeHealthDataReader<KnitPressureActivity> g;
    private String d = null;
    private boolean h = true;

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configExtraView(LinearLayout linearLayout) {
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configToolBar(HealthToolBar healthToolBar) {
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public int getPageType() {
        return 3;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            b();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        LogUtil.a("KnitPressureActivity", "onStart");
        getViewPager().setOffscreenPageLimit(4);
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f27563c = this;
        j();
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.g == null) {
            this.g = new LastTimeHealthDataReader<>(this, new b(this, this.f27562b));
        }
        this.g.b(LastTimeHealthDataReader.CardData.PRESSURE);
        boolean z = this.h;
        if (!z || this.e) {
            return;
        }
        LogUtil.a("KnitPressureActivity", "onResume mIsFirstOnResume = ", Boolean.valueOf(z));
        g();
        this.h = false;
    }

    private void g() {
        H5ProPkgPreloadSyncTask.startTask(BaseApplication.getContext(), "com.huawei.health.h5.breath-training", new H5PreloadCountStrategy(1));
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public Fragment onCreateEmptyFragment(KnitSubPageConfig knitSubPageConfig) {
        hideNonEmptyFragment();
        if (knitSubPageConfig == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        int resPosId = knitSubPageConfig.getResPosId();
        String strC = peh.c(knitSubPageConfig);
        IPageResTrigger extra = getResTrigger(getPageType(), resPosId, false).setExtra(bundle);
        if (extra instanceof BasePageResTrigger) {
            return KnitFragment.newInstance(strC, (BasePageResTrigger) extra);
        }
        return null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public String getLogTag() {
        return "KnitPressureActivity";
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public int configSubTabStyle() {
        return R.layout.knit_sub_tab_widget_pressure;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void configTitleBar(final CustomTitleBar customTitleBar) {
        customTitleBar.setTitleText(getString(R.string.IDS_settings_one_level_menu_settings_item_text_id14));
        customTitleBar.setRightButtonDrawable(qre.c(R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
        customTitleBar.setRightButtonClickable(true);
        customTitleBar.setRightButtonVisibility(0);
        final PopMenuManager popMenuManager = new PopMenuManager() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.KnitPressureActivity.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.ui.main.stories.template.PopMenuManager
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomTitleBar getTitleBar() {
                return customTitleBar;
            }

            @Override // com.huawei.ui.main.stories.template.IMenuItemManager
            public List<wpo> getMenuItemList() {
                return KnitPressureActivity.this.d();
            }
        };
        customTitleBar.setRightButtonOnClickListener(new View.OnClickListener() { // from class: uqm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                popMenuManager.showPopMenu();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<wpo> d() {
        wpo wpoVar = new wpo(getResources().getString(R.string.IDS_press_auto_monitor), new IPopMenuItemClick() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.KnitPressureActivity.4
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public void onItemClick() {
                KnitPressureActivity.this.i();
            }
        });
        wpo wpoVar2 = new wpo(getResources().getString(R.string.IDS_privacy_all_data), new IPopMenuItemClick() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.KnitPressureActivity.3
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public void onItemClick() {
                KnitPressureActivity.this.h();
            }
        });
        wpo wpoVar3 = new wpo(getResources().getString(R.string.IDS_hw_pressure_explain), new IPopMenuItemClick() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.KnitPressureActivity.5
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public void onItemClick() {
                KnitPressureActivity.this.f();
            }
        });
        ArrayList<wpo> arrayList = new ArrayList<>();
        if (!EnvironmentInfo.m() && !c()) {
            arrayList.add(wpoVar);
        }
        arrayList.add(wpoVar2);
        arrayList.add(wpoVar3);
        return arrayList;
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public DataInfos getSubPageDataInfos(int i) {
        if (i == 0) {
            return DataInfos.PressureDayDetail;
        }
        if (i == 1) {
            return DataInfos.PressureWeekDetail;
        }
        if (i == 2) {
            return DataInfos.PressureMonthDetail;
        }
        if (i == 3) {
            return DataInfos.PressureYearDetail;
        }
        return DataInfos.NoDataPlaceHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        PageModelArgs pageModelArgs = new PageModelArgs(104, "PrivacyDataConstructor", 3, 1);
        pageModelArgs.setClassType(0);
        PrivacyDataModelActivity.b(this.f27563c, pageModelArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        idy.b(AnalyticsValue.HEALTH_PRESSUER_HELP_CLICK_2160003.value(), map);
        try {
            this.f27563c.startActivity(new Intent(this.f27563c, (Class<?>) PressureIntroduceActivity.class));
        } catch (ActivityNotFoundException e) {
            LogUtil.e("KnitPressureActivity", "ActivityNotFoundException", e.getMessage());
        }
    }

    private boolean c() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "KnitPressureActivity");
        if (!njy.e(deviceList)) {
            return (!cqd.c(deviceList.get(0), 206) || Process.is64Bit() || ets.e()) ? false : true;
        }
        wup.b(this.f27563c, R.string.IDS_device_wifi_go_connect, R.string.IDS_core_sleep_not_connect);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (njy.e(ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "KnitPressureActivity"))) {
            wup.b(this, R.string.IDS_device_wifi_go_connect, R.string.IDS_core_sleep_not_connect);
            return;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "KnitPressureActivity");
        if (njy.e(deviceList)) {
            wup.b(this.f27563c, R.string.IDS_device_wifi_go_connect, R.string.IDS_hw_show_main_device_not_connect);
            return;
        }
        DeviceInfo deviceInfo = deviceList.get(0);
        DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityA == null || !deviceCapabilityA.isSupportPressAutoMonitor()) {
            wup.b(this.f27563c, R.string.IDS_device_wifi_go_connect, R.string.IDS_hw_show_main_device_not_connect);
            return;
        }
        String multiLinkBleMac = deviceInfo.getMultiLinkBleMac();
        Intent intent = new Intent();
        intent.setClassName(this.f27563c, "com.huawei.ui.device.activity.pressautomonitor.PressAutoMonitorActivity");
        intent.setFlags(268435456);
        if (!TextUtils.isEmpty(multiLinkBleMac)) {
            intent.putExtra("device_id", multiLinkBleMac);
        }
        intent.setFlags(67108864);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("KnitPressureActivity", "ActivityNotFoundException", e.getMessage());
        }
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public boolean getExtra(Bundle bundle) {
        Intent intent = getIntent();
        this.f27562b = bundle;
        if (intent == null) {
            return true;
        }
        long longExtra = intent.getLongExtra("key_bundle_health_last_data_time", 0L);
        this.f27561a = longExtra;
        bundle.putLong("key_bundle_health_last_data_time", longExtra);
        long j = this.f27561a;
        if (j <= 0) {
            return false;
        }
        bundle.putLong("key_bundle_health_last_data_time", j);
        return true;
    }

    private void j() {
        Intent intent = getIntent();
        if (intent != null) {
            if (intent.getStringExtra("healthdata") != null) {
                this.d = intent.getStringExtra("healthdata");
            }
            boolean booleanExtra = intent.getBooleanExtra("refreshCard", false);
            LogUtil.a("KnitPressureActivity", "mIsRefreshCard = ", Boolean.valueOf(booleanExtra));
            if (booleanExtra) {
                qqj.a(this.f27563c, 6);
            }
            e();
            a(intent);
        }
    }

    private void a(final Intent intent) {
        HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.KnitPressureActivity.1
            @Override // java.lang.Runnable
            public void run() {
                ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.KnitPressureActivity.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        int iA = KnitPressureActivity.this.a();
                        HashMap map = new HashMap();
                        map.put("click", 1);
                        map.put("isHaveData", Integer.valueOf(intent.getIntExtra("isHaveData", KnitPressureActivity.this.e ? 1 : 0)));
                        map.put("havedevice", Integer.valueOf(iA));
                        map.put("type", Integer.valueOf(intent.getIntExtra("type", -1)));
                        LogUtil.a("KnitPressureActivity", "biEvent map ", map);
                        lmf.d().c(btx.c(), AnalyticsValue.HEALTH_PRESSUER_CARD_CLICK_2160001.value(), map, 0);
                    }
                });
            }
        }, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Intent intent = getIntent();
        long j = this.f27561a;
        boolean booleanExtra = j > 0;
        if (intent != null) {
            booleanExtra = intent.getBooleanExtra("pressure_is_have_datas", j > 0);
        }
        LogUtil.a("KnitPressureActivity", "checkHasPressureData, mHasPressureData: ", Boolean.valueOf(this.e), ", hasData: ", Boolean.valueOf(booleanExtra));
        if (!booleanExtra || this.e) {
            return;
        }
        m();
    }

    private void b() {
        if ("MyHealthData".equals(this.d)) {
            LogUtil.a("KnitPressureActivity", "onBackPressed jumpToDeviceActivity is Success");
            Intent intent = new Intent();
            intent.setPackage(BaseApplication.getAppPackage());
            intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.health.device.ui.DeviceMainActivity");
            intent.putExtra("kind", "HDK_UNKNOWN");
            intent.putExtra("view", "ListDevice");
            startActivity(intent);
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a() {
        DeviceInfo deviceInfoC = mgg.c("KnitPressureActivity");
        return (deviceInfoC == null || deviceInfoC.getDeviceConnectState() != 2) ? 0 : 1;
    }

    public static void a(Context context, long j) {
        FitnessUtils.b(context, KnitPressureActivity.class, j);
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("KnitPressureActivity", "destroy");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.e = false;
        showEmptyFragment();
        hideNonEmptyFragment();
        refreshTitleBar(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.e = true;
        hideEmptyFragment();
        showNonEmptyFragment();
        refreshTitleBar(true);
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity
    public void refreshNoDataTitleBar(CustomTitleBar customTitleBar) {
        super.refreshNoDataTitleBar(customTitleBar);
        if (isDeviceConnected()) {
            customTitleBar.setTitleBarBackgroundColor(getColor(R.color.no_fragment_titlebgcolor));
            customTitleBar.setLeftButtonTextColor(ContextCompat.getDrawable(this, wuo.e()), getColor(R.color.textColorPrimary), qre.f(R.string.accessibility_go_back));
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<KnitPressureActivity> f27569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bundle f27570c;

        private b(KnitPressureActivity knitPressureActivity, Bundle bundle) {
            this.f27569b = new WeakReference<>(knitPressureActivity);
            this.f27570c = bundle;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(final int i, final Object obj) {
            if (!HandlerExecutor.c()) {
                HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.main.stories.health.activity.healthdata.KnitPressureActivity.b.2
                    @Override // java.lang.Runnable
                    public void run() {
                        b.this.a(i, obj);
                    }
                });
                return;
            }
            KnitPressureActivity knitPressureActivity = this.f27569b.get();
            if (knitPressureActivity == null) {
                return;
            }
            if (obj instanceof HiHealthData) {
                knitPressureActivity.f27561a = ((HiHealthData) obj).getEndTime();
                if (knitPressureActivity.f27561a == 0) {
                    KnitPressureActivity.this.k();
                } else {
                    KnitPressureActivity.this.m();
                }
                LogUtil.a("KnitPressureActivity", "read last data time from database,mLastTimestamp=", Long.valueOf(knitPressureActivity.f27561a));
            } else {
                KnitPressureActivity.this.k();
                knitPressureActivity.f27561a = 0L;
                LogUtil.j("KnitPressureActivity", "read last data time from database,mLastTimestamp=0");
            }
            Bundle bundle = this.f27570c;
            if (bundle != null) {
                if (bundle.getLong("key_bundle_health_last_data_time") == 0 && knitPressureActivity.f27561a != 0) {
                    LogUtil.a("KnitPressureActivity", "lastTimestamp is not 0, onBundleArrived");
                    this.f27570c.putLong("key_bundle_health_last_data_time", knitPressureActivity.f27561a);
                    KnitPressureActivity.this.onBundleArrived(this.f27570c);
                } else {
                    knitPressureActivity.configHealthDetailActivity();
                }
                this.f27570c.putLong("key_bundle_health_last_data_time", knitPressureActivity.f27561a);
            }
            KnitPressureActivity.this.e();
        }
    }

    @Override // com.huawei.health.knit.ui.KnitHealthDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
