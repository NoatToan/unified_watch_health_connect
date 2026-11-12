package com.huawei.ui.main.stories.fitness.activity.heartrate;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.huawei.android.airsharing.api.IEventListener;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.configuredpage.api.ConfiguredPageDataCallback;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.preload.H5PreloadCountStrategy;
import com.huawei.health.h5pro.service.H5ProServiceManager;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.health.marketing.utils.EcgDataInquirer;
import com.huawei.health.marketing.utils.EcgFilterManager;
import com.huawei.health.section.section.MeasureCardView;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.h5pro.preload.H5ProPkgPreloadSyncTask;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthDataMarkDateTrigger;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.common.ClassType;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.DateType;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder;
import com.huawei.ui.commonui.scrollview.HealthScrollView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.transition.ActivityTransitionAnimator;
import com.huawei.ui.commonui.utils.ScrollUtil;
import com.huawei.ui.commonui.viewpager.HealthNativeViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.heartrate.HeartRateDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateBarChartHolder;
import com.huawei.ui.main.stories.fitness.activity.heartrate.chart.HeartRateLineChartHolder;
import com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedButtonList;
import com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedViewList;
import com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView;
import com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverView;
import com.huawei.ui.main.stories.fitness.views.base.chart.icommon.IFocusObserverItem;
import com.huawei.ui.main.stories.fitness.views.heartrate.card.CardContainerView;
import com.huawei.ui.main.stories.fitness.views.heartrate.card.DayCardContainerView;
import com.huawei.ui.main.stories.fitness.views.heartrate.card.ReminderCardView;
import com.huawei.ui.main.stories.fitness.views.heartrate.card.RestCardView;
import com.huawei.ui.main.stories.fitness.views.heartrate.card.SportCardView;
import com.huawei.ui.main.stories.fitness.views.heartrate.classified.HeartRateDayView;
import com.huawei.ui.main.stories.fitness.views.heartrate.classified.HeartRateMonthView;
import com.huawei.ui.main.stories.fitness.views.heartrate.classified.HeartRateWeekView;
import com.huawei.ui.main.stories.fitness.views.heartrate.classified.HeartRateYearView;
import com.huawei.ui.main.stories.privacy.template.model.bean.PageModelArgs;
import com.huawei.ui.main.stories.privacy.template.view.showdata.PrivacyDataModelActivity;
import com.huawei.ui.main.stories.settings.js.CustomDataService;
import com.huawei.ui.main.stories.template.PopMenuManager;
import com.huawei.ui.main.stories.template.data.IPopMenuItemClick;
import com.huawei.ui.main.stories.template.health.common.CommonHealthNoDeviceFragment;
import com.huawei.ui.main.stories.utils.FitnessUtils;
import com.huawei.ui.main.stories.utils.LastTimeHealthDataReader;
import defpackage.ddv;
import defpackage.ecu;
import defpackage.eej;
import defpackage.fej;
import defpackage.iov;
import defpackage.lmf;
import defpackage.lvb;
import defpackage.mgg;
import defpackage.njy;
import defpackage.qnh;
import defpackage.qre;
import defpackage.qrs;
import defpackage.trd;
import defpackage.ueg;
import defpackage.ukb;
import defpackage.vdo;
import defpackage.wpo;
import defpackage.wqp;
import defpackage.wup;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class HeartRateDetailActivity extends BaseActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f26885c = new Object();
    private List<Integer> ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthCalendar f26887b;
    private HeartRateBarChartHolder d;
    private ClassifiedViewList f;
    private ObserveredClassifiedView h;
    private LinearLayout i;
    private LinearLayout n;
    private e o;
    private Handler s;
    private LastTimeHealthDataReader<HeartRateDetailActivity> t;
    private MeasureCardView u;
    private ViewStub v;
    private HeartRateLineChartHolder x;
    private CustomTitleBar y;
    private final Context j = BaseApplication.getContext();
    private final List<CardContainerView> e = new ArrayList(4);
    private final List<ReminderCardView> ac = new ArrayList(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ReminderCardView> f26886a = new ArrayList(4);
    private int g = 0;
    private long r = 0;
    private boolean p = false;
    private boolean k = false;
    private final List<Integer> w = Arrays.asList(5, 6);
    private Observer l = new Observer() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.HeartRateDetailActivity.1
        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            if (objArr == null || objArr.length <= 0) {
                LogUtil.e("HealthHeartRate_HeartRateDetailActivity", "ecg data observer notify do nothing! args is empty");
                return;
            }
            Object obj = objArr[0];
            if (!(obj instanceof Integer)) {
                LogUtil.e("HealthHeartRate_HeartRateDetailActivity", "ecg data observer notify do nothing! args is illegal args = ", obj);
            } else {
                final int iIntValue = ((Integer) obj).intValue();
                HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.HeartRateDetailActivity.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (HeartRateDetailActivity.this.k) {
                            EcgFilterManager.b().e(HeartRateDetailActivity.this.u, iIntValue, true);
                            EcgFilterManager.b().a(HeartRateDetailActivity.this.u, iIntValue);
                        }
                    }
                });
            }
        }
    };
    private final int[] m = {47055, 47005};
    private boolean q = true;

    public static /* synthetic */ boolean b(DataInfos dataInfos) {
        return true;
    }

    public static /* synthetic */ boolean e(DataInfos dataInfos) {
        return true;
    }

    public static void a(Context context, long j) {
        FitnessUtils.b(context, HeartRateDetailActivity.class, j);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        Iterator<CardContainerView> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        LinearLayout linearLayout = this.i;
        if (linearLayout != null) {
            trd.b(9, linearLayout);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityTransitionAnimator activityTransitionAnimatorA = ActivityTransitionAnimator.c().a((Activity) this);
        boolean zA = activityTransitionAnimatorA.a();
        if (zA) {
            activityTransitionAnimatorA.f();
        }
        ObserverManagerUtil.d(this.l, EcgDataInquirer.ECG_DATA_OBSERVER);
        setContentView(R.layout.activity_heart_rate_detail);
        if (zA) {
            activityTransitionAnimatorA.d(true).d(new BaseActivity.e(this)).e();
        } else {
            clearBackgroundDrawable();
        }
        cancelAdaptRingRegion();
        ueg.a(true);
        this.d = new HeartRateBarChartHolder(getApplicationContext());
        this.x = new HeartRateLineChartHolder(getApplicationContext());
        this.y = (CustomTitleBar) findViewById(R.id.fitness_detail_titlebar);
        this.s = new c(this);
        this.v = (ViewStub) findViewById(R.id.measure_card_view_stub);
        d();
        Intent intent = getIntent();
        if (intent != null) {
            long longExtra = intent.getLongExtra("key_bundle_health_last_data_time", 0L);
            this.r = longExtra;
            LogUtil.a("HealthHeartRate_HeartRateDetailActivity", "mLastTimestamp=", Long.valueOf(longExtra));
        }
        if (this.r > 0) {
            j();
        } else {
            l();
        }
        SharedPreferenceManager.e(this.j, String.valueOf(10006), "heart_rate_lastTimes", Long.toString(this.r), new StorageParams());
        m();
        HiHealthNativeApi.a(this.j).subscribeHiHealthData(this.w, new a(this));
        fej.d((DownloadCallback<File>) null);
    }

    private void d() {
        MeasureCardView measureCardView = (MeasureCardView) this.v.inflate().findViewById(R.id.measure_card_view);
        this.u = measureCardView;
        qrs.f(measureCardView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            LogUtil.a("HealthHeartRate_HeartRateDetailActivity", "marketingApi is null");
            return;
        }
        MarketingOption.Builder builder = new MarketingOption.Builder();
        builder.setContext(this);
        builder.setPageId(i);
        if (i == 9) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.heart_rate_marketing);
            if (linearLayout == null) {
                return;
            }
            BaseActivity.cancelLayoutById(linearLayout);
            HashMap map = new HashMap();
            map.put(4005, linearLayout);
            builder.setLayoutMap(map);
        }
        marketingApi.requestMarketingResource(builder.build());
    }

    private void m() {
        this.o = new e(this);
        BroadcastManagerUtil.c(this, this.o, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
    }

    private void n() {
        try {
            LogUtil.a("HealthHeartRate_HeartRateDetailActivity", "Enter unregisterBindDeviceBroadcast()!");
            unregisterReceiver(this.o);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("HealthHeartRate_HeartRateDetailActivity", "unregisterBindDeviceBroadcast failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.k = true;
        HealthNativeViewPager healthNativeViewPager = (HealthNativeViewPager) findViewById(R.id.heart_rate_chart_container);
        ClassifiedButtonList classifiedButtonList = (ClassifiedButtonList) findViewById(R.id.classified_button_list);
        this.n = (LinearLayout) findViewById(R.id.heart_rate_extension);
        this.f = new ClassifiedViewList(this, classifiedButtonList, healthNativeViewPager);
        this.y.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_more_normal_black), qre.f(R.string.accessibility_more_item));
        this.y.setRightButtonClickable(true);
        this.y.setRightButtonVisibility(0);
        final PopMenuManager popMenuManager = new PopMenuManager() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.HeartRateDetailActivity.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.ui.main.stories.template.PopMenuManager
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public CustomTitleBar getTitleBar() {
                return HeartRateDetailActivity.this.y;
            }

            @Override // com.huawei.ui.main.stories.template.IMenuItemManager
            public List<wpo> getMenuItemList() {
                return HeartRateDetailActivity.this.h();
            }
        };
        this.y.setRightButtonOnClickListener(new View.OnClickListener() { // from class: ude
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                popMenuManager.showPopMenu();
            }
        });
        String string = getString(R.string.IDS_main_watch_heart_rate_unit_string);
        this.x.spetifiyDataTypeUnit(new IChartLayerHolder.DataTypeFilter() { // from class: udq
            @Override // com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder.DataTypeFilter
            public final boolean isAccept(DataInfos dataInfos) {
                return HeartRateDetailActivity.b(dataInfos);
            }
        }, string);
        this.d.spetifiyDataTypeUnit(new IChartLayerHolder.DataTypeFilter() { // from class: udm
            @Override // com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder.DataTypeFilter
            public final boolean isAccept(DataInfos dataInfos) {
                return HeartRateDetailActivity.e(dataInfos);
            }
        }, string);
        this.s.post(new Runnable() { // from class: udn
            @Override // java.lang.Runnable
            public final void run() {
                this.e.b();
            }
        });
        if (!CommonUtil.ca()) {
            this.s.postDelayed(new Runnable() { // from class: udo
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.a();
                }
            }, 100L);
        }
        if (LoginInit.getInstance(BaseApplication.getContext()).isKidAccount()) {
            this.s.post(new Runnable() { // from class: udp
                @Override // java.lang.Runnable
                public final void run() {
                    EcgFilterManager.b().f();
                }
            });
        }
    }

    public /* synthetic */ void a() {
        k();
        e(9);
        HealthScrollView healthScrollView = (HealthScrollView) findViewById(R.id.heart_rate_scroll_view);
        if (healthScrollView == null) {
            LogUtil.j("HealthHeartRate_HeartRateDetailActivity", "heart rate scroll view is null");
        } else {
            healthScrollView.setScrollOnlyVertical(true);
            ScrollUtil.a(healthScrollView, getWindow().getDecorView(), IEventListener.EVENT_ID_DEVICE_UPDATE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<wpo> h() {
        wpo wpoVar = new wpo(getResources().getString(R.string.IDS_hwh_motiontrack_sport_heart_rate_setting_tl), new IPopMenuItemClick() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.HeartRateDetailActivity.3
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public void onItemClick() {
                HeartRateDetailActivity.this.f();
            }
        });
        wpo wpoVar2 = new wpo(getResources().getString(R.string.IDS_settings_continue_HeartRate_switch), new IPopMenuItemClick() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.HeartRateDetailActivity.2
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public void onItemClick() {
                HeartRateDetailActivity.this.g();
            }
        });
        wpo wpoVar3 = new wpo(getResources().getString(R.string.IDS_privacy_all_data), new IPopMenuItemClick() { // from class: com.huawei.ui.main.stories.fitness.activity.heartrate.HeartRateDetailActivity.4
            @Override // com.huawei.ui.main.stories.template.data.IPopMenuItemClick
            public void onItemClick() {
                HeartRateDetailActivity.this.i();
            }
        });
        ArrayList<wpo> arrayList = new ArrayList<>();
        arrayList.add(wpoVar);
        if (!EnvironmentInfo.m()) {
            arrayList.add(wpoVar2);
        }
        arrayList.add(wpoVar3);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.p = true;
        PageModelArgs pageModelArgs = new PageModelArgs(102, "PrivacyDataConstructor", 3, 1);
        pageModelArgs.setClassType(0);
        PrivacyDataModelActivity.b(this, pageModelArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LoginInit.getInstance(this.j).browsingToLogin(new IBaseResponseCallback() { // from class: udk
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    LogUtil.j("HealthHeartRate_HeartRateDetailActivity", "browsingToLogin errorCode is not success", Integer.valueOf(i));
                }
            }, null);
            return;
        }
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        H5ProServiceManager.getInstance().registerService(CustomDataService.class);
        ddv.b().loadH5ProApp(this.j, "com.huawei.health.h5.setting", builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (njy.e(ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "HealthHeartRate_HeartRateDetailActivity"))) {
            wup.b(this, R.string.IDS_device_wifi_go_connect, R.string.IDS_core_sleep_not_connect);
            return;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HealthHeartRate_HeartRateDetailActivity");
        if (njy.e(deviceList)) {
            wup.b(this, R.string.IDS_device_wifi_go_connect, R.string.IDS_hw_show_main_device_not_connect);
            return;
        }
        DeviceInfo deviceInfo = deviceList.get(0);
        DeviceCapability deviceCapabilityA = eej.a(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityA != null && deviceCapabilityA.isSupportContinueHeartRate()) {
            b("com.huawei.ui.device.activity.heartrate.ContinueHeartRateSettingActivity", deviceInfo);
        } else if (deviceCapabilityA != null && deviceCapabilityA.isSupportHeartRateEnable() && !deviceCapabilityA.isSupportContinueHeartRate()) {
            b("com.huawei.ui.device.activity.heartrate.HeartRateSettingsActivity", deviceInfo);
        } else {
            wup.b(this, R.string.IDS_device_wifi_go_connect, R.string.IDS_hw_show_main_device_not_connect);
        }
    }

    private void b(String str, DeviceInfo deviceInfo) {
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getContext(), str);
        intent.putExtra("device_id", deviceIdentify);
        intent.addFlags(268435456);
        iov.d(this.j, intent);
    }

    private void k() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.configure_service);
        this.i = linearLayout;
        if (linearLayout != null) {
            trd.a(9, linearLayout, (ConfiguredPageDataCallback) null);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        n();
        if (njy.b(this.ad)) {
            HiHealthNativeApi.a(this.j).unSubscribeHiHealthData(this.ad, new HiUnSubscribeListener() { // from class: udi
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    LogUtil.a("HealthHeartRate_HeartRateDetailActivity", "onDestroy unSubscribeHiHealthData isSuccess=", Boolean.valueOf(z));
                }
            });
        }
        List<CardContainerView> list = this.e;
        if (list != null) {
            list.clear();
        }
        List<ReminderCardView> list2 = this.ac;
        if (list2 != null) {
            list2.clear();
        }
        Handler handler = this.s;
        if (handler != null) {
            handler.removeCallbacks(null);
        }
        ObserverManagerUtil.c(this.l);
    }

    private void o() {
        this.f.setOnClassifiedViewChangeListener(new ClassifiedViewList.OnClassifiedViewChangeListener() { // from class: udf
            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedViewList.OnClassifiedViewChangeListener
            public final void onClassifiedViewSelected(View view, int i) {
                this.f49962b.c(view, i);
            }
        });
    }

    public /* synthetic */ void c(View view, int i) {
        if (view instanceof ObserveredClassifiedView) {
            this.h = (ObserveredClassifiedView) view;
        }
        this.n.removeAllViews();
        IFocusObserverItem iFocusObserverItemD = this.f.d();
        if (iFocusObserverItemD == null) {
            LogUtil.j("HealthHeartRate_HeartRateDetailActivity", "onClassifiedViewSelected focusObserverItem is null");
            return;
        }
        View viewOnCreateDetailView = iFocusObserverItemD.onCreateDetailView();
        if (viewOnCreateDetailView == null) {
            return;
        }
        ViewParent parent = viewOnCreateDetailView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(viewOnCreateDetailView);
            LogUtil.j("HealthHeartRate_HeartRateDetailActivity", "addListenerForDayObserverView(): parent is not instance of ViewGroup");
        }
        this.n.addView(viewOnCreateDetailView, -1, -2);
    }

    public void b() {
        this.e.clear();
        this.f26887b = vdo.c(this.f26887b, qnh.b(this.r));
        final ArrayList arrayList = new ArrayList(4);
        c(arrayList);
        e(arrayList);
        b(arrayList);
        a(arrayList);
        this.f.b(arrayList, new ClassifiedViewList.IChartLayerHolderAdapter() { // from class: udh
            @Override // com.huawei.ui.main.stories.fitness.views.base.chart.ClassifiedViewList.IChartLayerHolderAdapter
            public final IChartLayerHolder acquireAdapter(ClassifiedViewList.ClassifiedView classifiedView) {
                return this.f49963a.c(arrayList, classifiedView);
            }
        });
        if (this.r > 0) {
            Iterator<ClassifiedViewList.ClassifiedView> it = arrayList.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        }
        o();
        ukb.a(new d(this));
    }

    public /* synthetic */ IChartLayerHolder c(List list, ClassifiedViewList.ClassifiedView classifiedView) {
        if (!list.contains(classifiedView)) {
            return null;
        }
        if (list.indexOf(classifiedView) >= 1) {
            return this.d;
        }
        return this.x;
    }

    private void b(ClassifiedViewList.ClassifiedView classifiedView) {
        if (classifiedView instanceof HeartRateDayView) {
            ((HeartRateDayView) classifiedView).setJumpTableChartLastTimeId(qnh.b(this.r));
            return;
        }
        if (classifiedView instanceof HeartRateWeekView) {
            ((HeartRateWeekView) classifiedView).setJumpTableChartLastTimeId(qnh.o(this.r));
            return;
        }
        if (classifiedView instanceof HeartRateMonthView) {
            ((HeartRateMonthView) classifiedView).setJumpTableChartLastTimeId(qnh.i(this.r));
        } else if (classifiedView instanceof HeartRateYearView) {
            ((HeartRateYearView) classifiedView).setJumpTableChartLastTimeId(qnh.t(this.r));
        } else {
            LogUtil.j("HealthHeartRate_HeartRateDetailActivity", "Unknown ClassifiedView");
        }
    }

    static class c extends BaseHandler<HeartRateDetailActivity> {
        c(HeartRateDetailActivity heartRateDetailActivity) {
            super(heartRateDetailActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(HeartRateDetailActivity heartRateDetailActivity, Message message) {
            int i = message.what;
            if (i == 1) {
                HeartRateDetailActivity.e((List<ReminderCardView>) heartRateDetailActivity.ac, false);
                HeartRateDetailActivity.e((List<ReminderCardView>) heartRateDetailActivity.f26886a, false);
            } else if (i == 2) {
                HeartRateDetailActivity.e((List<ReminderCardView>) heartRateDetailActivity.ac, true);
                HeartRateDetailActivity.e((List<ReminderCardView>) heartRateDetailActivity.f26886a, true);
            } else {
                LogUtil.j("HealthHeartRate_HeartRateDetailActivity", "message is error");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(List<ReminderCardView> list, boolean z) {
        for (ReminderCardView reminderCardView : list) {
            if (reminderCardView != null && z) {
                reminderCardView.d();
            } else if (reminderCardView != null && !z) {
                reminderCardView.a();
            } else {
                LogUtil.j("HealthHeartRate_HeartRateDetailActivity", "view == null");
            }
        }
    }

    private void b(int i, CardContainerView cardContainerView) {
        synchronized (f26885c) {
            if (i == this.g) {
                return;
            }
            this.g = i;
            for (CardContainerView cardContainerView2 : this.e) {
                if (cardContainerView2 != null && cardContainerView2 != cardContainerView) {
                    cardContainerView2.setCurrentItem(i);
                }
            }
        }
    }

    private ScrollChartObserverView a(ObserveredClassifiedView observeredClassifiedView) {
        DayCardContainerView dayCardContainerView = new DayCardContainerView(this, observeredClassifiedView);
        this.e.add(dayCardContainerView);
        b(dayCardContainerView);
        RestCardView restCardView = new RestCardView(this, observeredClassifiedView, getString(R.string.IDS_hw_health_show_healthdata_resting_heart_bmp));
        restCardView.d(this.x.a());
        ReminderCardView reminderCardView = new ReminderCardView(this, observeredClassifiedView, false);
        reminderCardView.a(this.x.d());
        reminderCardView.c(this.x.b());
        reminderCardView.d(this.x);
        this.ac.add(reminderCardView);
        ReminderCardView reminderCardView2 = new ReminderCardView(this, observeredClassifiedView, true);
        reminderCardView2.a(this.x.c());
        reminderCardView2.c(this.x.e());
        reminderCardView2.d(this.x);
        this.f26886a.add(reminderCardView2);
        ScrollChartObserverView sportCardView = new SportCardView(this, observeredClassifiedView);
        List<ScrollChartObserverView> arrayList = new ArrayList<>(16);
        arrayList.add(sportCardView);
        arrayList.add(restCardView);
        arrayList.add(reminderCardView);
        arrayList.add(reminderCardView2);
        dayCardContainerView.b(arrayList, c(observeredClassifiedView.getStepDataType()));
        return dayCardContainerView;
    }

    private List<HwHealthChartHolder.c> c(DataInfos dataInfos) {
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(c(dataInfos, HwHealthChartHolder.LAYER_ID_NORMAL_HR));
        arrayList.add(c(dataInfos, HwHealthChartHolder.LAYER_ID_REST_HR));
        arrayList.add(c(dataInfos, HwHealthChartHolder.LAYER_ID_WARNING_HR));
        arrayList.add(c(dataInfos, HwHealthChartHolder.LAYER_ID_BRADYCARDIA));
        return arrayList;
    }

    private HwHealthChartHolder.c c(DataInfos dataInfos, String str) {
        HwHealthChartHolder.c cVar = new HwHealthChartHolder.c();
        cVar.a(dataInfos);
        cVar.e(str);
        return cVar;
    }

    private void b(final DayCardContainerView dayCardContainerView) {
        dayCardContainerView.a(new CardContainerView.OnSelectListener() { // from class: udl
            @Override // com.huawei.ui.main.stories.fitness.views.heartrate.card.CardContainerView.OnSelectListener
            public final void onSelect(View view, int i) {
                this.f49966a.a(dayCardContainerView, view, i);
            }
        });
    }

    public /* synthetic */ void a(DayCardContainerView dayCardContainerView, View view, int i) {
        b(i, dayCardContainerView);
        this.n.removeAllViews();
        IFocusObserverItem iFocusObserverItemD = this.f.d();
        if (iFocusObserverItemD == null) {
            LogUtil.j("HealthHeartRate_HeartRateDetailActivity", "onSelect focusObserverItem is null");
            return;
        }
        View viewOnCreateDetailView = iFocusObserverItemD.onCreateDetailView();
        if (viewOnCreateDetailView == null) {
            return;
        }
        ViewParent parent = viewOnCreateDetailView.getParent();
        if (parent != null) {
            if (!(parent instanceof ViewGroup)) {
                LogUtil.j("HealthHeartRate_HeartRateDetailActivity", "addListenerForDayObserverView(): parent is not instance of ViewGroup");
            } else {
                ((ViewGroup) parent).removeView(viewOnCreateDetailView);
            }
        }
        this.n.addView(viewOnCreateDetailView, -1, -2);
    }

    private CardContainerView e(ObserveredClassifiedView observeredClassifiedView) {
        CardContainerView cardContainerView = new CardContainerView(this, observeredClassifiedView);
        this.e.add(cardContainerView);
        SportCardView sportCardView = new SportCardView(this, observeredClassifiedView);
        sportCardView.b(this.d.b());
        sportCardView.d(this.d.c());
        RestCardView restCardView = new RestCardView(this, observeredClassifiedView, getString(R.string.IDS_hw_health_show_healthdata_avg_rest_heartrate));
        restCardView.d(this.d.e());
        ReminderCardView reminderCardView = new ReminderCardView(this, observeredClassifiedView, false);
        reminderCardView.a(this.d.g());
        reminderCardView.c(this.d.h());
        reminderCardView.d(this.d);
        this.ac.add(reminderCardView);
        ReminderCardView reminderCardView2 = new ReminderCardView(this, observeredClassifiedView, true);
        reminderCardView2.a(this.d.a());
        reminderCardView2.c(this.d.d());
        reminderCardView2.d(this.d);
        this.f26886a.add(reminderCardView2);
        e(cardContainerView);
        List<ScrollChartObserverView> arrayList = new ArrayList<>(16);
        arrayList.add(sportCardView);
        arrayList.add(restCardView);
        arrayList.add(reminderCardView);
        arrayList.add(reminderCardView2);
        cardContainerView.b(arrayList, c(observeredClassifiedView.getStepDataType()));
        return cardContainerView;
    }

    private void e(final CardContainerView cardContainerView) {
        cardContainerView.a(new CardContainerView.OnSelectListener() { // from class: udd
            @Override // com.huawei.ui.main.stories.fitness.views.heartrate.card.CardContainerView.OnSelectListener
            public final void onSelect(View view, int i) {
                this.f49961c.b(cardContainerView, view, i);
            }
        });
    }

    public /* synthetic */ void b(CardContainerView cardContainerView, View view, int i) {
        b(i, cardContainerView);
        this.n.removeAllViews();
        IFocusObserverItem iFocusObserverItemD = this.f.d();
        if (iFocusObserverItemD == null) {
            LogUtil.j("HealthHeartRate_HeartRateDetailActivity", "enableClassifiedViewObserver onSelect focusObserverItem is null");
            return;
        }
        View viewOnCreateDetailView = iFocusObserverItemD.onCreateDetailView();
        if (viewOnCreateDetailView == null) {
            return;
        }
        ViewParent parent = viewOnCreateDetailView.getParent();
        if (!(parent instanceof ViewGroup)) {
            LogUtil.j("HealthHeartRate_HeartRateDetailActivity", "addListenerForObserverView(): parent is not instance of ViewGroup");
        } else {
            ((ViewGroup) parent).removeView(viewOnCreateDetailView);
        }
        this.n.addView(viewOnCreateDetailView, -1, -2);
    }

    private void c(List<ClassifiedViewList.ClassifiedView> list) {
        final HeartRateDayView heartRateDayView = new HeartRateDayView(this);
        heartRateDayView.setHorizontalJumpListener(new View.OnClickListener() { // from class: udj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49965c.c(heartRateDayView, view);
            }
        });
        heartRateDayView.setStepDatatype(DataInfos.query(ClassType.TYPE_HEART_RATE, DateType.DATE_DAY));
        heartRateDayView.setHighlightedEntryParser(this.x);
        heartRateDayView.selectDataLayerId(HwHealthChartHolder.LAYER_ID_NORMAL_HR);
        heartRateDayView.initCalendarView(this, this.f26887b, new HealthDataMarkDateTrigger(46019, this.m), true);
        this.h = heartRateDayView;
        heartRateDayView.enableObserverView(a(heartRateDayView));
        list.add(heartRateDayView);
    }

    public /* synthetic */ void c(HeartRateDayView heartRateDayView, View view) {
        HwHealthBaseScrollBarLineChart chart = heartRateDayView.getChart();
        if (this.j == null || chart == null) {
            LogUtil.j("HealthHeartRate_HeartRateDetailActivity", "horizontal jump failed, the context or chart is null");
            return;
        }
        long jQueryMarkerViewTimeRangeMin = chart.queryMarkerViewTimeRangeMin();
        if (((int) chart.acquireShowRangeMaximum()) == TimeUnit.MILLISECONDS.toMinutes(jQueryMarkerViewTimeRangeMin)) {
            jQueryMarkerViewTimeRangeMin -= TimeUnit.MINUTES.toMillis(2L);
        }
        HashMap map = new HashMap(1);
        map.put("click", 1);
        lmf.d().c(this.j, AnalyticsValue.HEALTH_HEART_RATE_DAY_HORIZONTAL_2090011.value(), map, 0);
        Intent intent = new Intent(this.j, (Class<?>) HorizontalHeartRateDayActivity.class);
        intent.putExtra(ObserveredClassifiedView.JUMP_TIME_ID, qnh.k(jQueryMarkerViewTimeRangeMin));
        intent.putExtra(ObserveredClassifiedView.JUMP_DATA_LAYER_ID, heartRateDayView.acquireDataLayerIndex());
        intent.putExtra(ObserveredClassifiedView.JUMP_DATA_TYPE, heartRateDayView.getStepDataType());
        startActivity(intent);
        LogUtil.a("HealthHeartRate_HeartRateDetailActivity", "horizontal jump onclick");
    }

    private void e(List<ClassifiedViewList.ClassifiedView> list) {
        HeartRateWeekView heartRateWeekView = new HeartRateWeekView(this);
        heartRateWeekView.selectDataLayerId(HwHealthChartHolder.LAYER_ID_NORMAL_HR);
        heartRateWeekView.setStepDatatype(DataInfos.query(ClassType.TYPE_HEART_RATE, DateType.DATE_WEEK));
        heartRateWeekView.setHighlightedEntryParser(this.d);
        heartRateWeekView.initCalendarView(this, this.f26887b, new HealthDataMarkDateTrigger(46019, this.m), false);
        heartRateWeekView.enableObserverView(e(heartRateWeekView));
        list.add(heartRateWeekView);
    }

    private void b(List<ClassifiedViewList.ClassifiedView> list) {
        HeartRateMonthView heartRateMonthView = new HeartRateMonthView(this);
        heartRateMonthView.selectDataLayerId(HwHealthChartHolder.LAYER_ID_NORMAL_HR);
        heartRateMonthView.setStepDatatype(DataInfos.query(ClassType.TYPE_HEART_RATE, DateType.DATE_MONTH));
        heartRateMonthView.setHighlightedEntryParser(this.d);
        heartRateMonthView.initCalendarView(this, this.f26887b, new HealthDataMarkDateTrigger(46019, this.m), false);
        heartRateMonthView.enableObserverView(e(heartRateMonthView));
        list.add(heartRateMonthView);
    }

    private void a(List<ClassifiedViewList.ClassifiedView> list) {
        HeartRateYearView heartRateYearView = new HeartRateYearView(this);
        heartRateYearView.selectDataLayerId(HwHealthChartHolder.LAYER_ID_NORMAL_HR);
        heartRateYearView.setStepDatatype(DataInfos.query(ClassType.TYPE_HEART_RATE, DateType.DATE_YEAR));
        heartRateYearView.setHighlightedEntryParser(this.d);
        heartRateYearView.initCalendarView(this, this.f26887b, new HealthDataMarkDateTrigger(46019, this.m), false);
        heartRateYearView.enableObserverView(e(heartRateYearView));
        list.add(heartRateYearView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        this.p = false;
        if (this.t == null) {
            this.t = new LastTimeHealthDataReader<>(this, new b(this));
        }
        this.t.b(LastTimeHealthDataReader.CardData.HEALTH_RATE);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.q) {
            H5ProPkgPreloadSyncTask.startTask(this.j, "com.huawei.health.h5.ecg", new H5PreloadCountStrategy(1));
        }
        EcgFilterManager.b().l();
        this.q = false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        ObserveredClassifiedView observeredClassifiedView;
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 || intent == null) {
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("selectedDate");
        if (!(serializableExtra instanceof HealthCalendar) || (observeredClassifiedView = this.h) == null) {
            return;
        }
        HealthCalendar healthCalendar = (HealthCalendar) serializableExtra;
        this.f26887b = healthCalendar;
        observeredClassifiedView.processCalendarSelect(healthCalendar);
    }

    public static class d implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<HeartRateDetailActivity> f26894a;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        d(HeartRateDetailActivity heartRateDetailActivity) {
            this.f26894a = new WeakReference<>(heartRateDetailActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            final HeartRateDetailActivity heartRateDetailActivity = this.f26894a.get();
            if (heartRateDetailActivity == null) {
                LogUtil.j("HealthHeartRate_HeartRateDetailActivity", "activity or intent is null.");
                return;
            }
            if (obj instanceof SparseArray) {
                SparseArray sparseArray = (SparseArray) obj;
                Object obj2 = sparseArray.get(2101);
                Object obj3 = sparseArray.get(2102);
                final boolean z = false;
                final boolean z2 = (obj2 instanceof List) && njy.b((List) obj2);
                if ((obj3 instanceof List) && njy.b((List) obj3)) {
                    z = true;
                }
                heartRateDetailActivity.s.post(new Runnable() { // from class: udv
                    @Override // java.lang.Runnable
                    public final void run() {
                        HeartRateDetailActivity.d.d(heartRateDetailActivity, z2, z);
                    }
                });
            }
        }

        public static /* synthetic */ void d(HeartRateDetailActivity heartRateDetailActivity, boolean z, boolean z2) {
            Iterator it = heartRateDetailActivity.ac.iterator();
            while (it.hasNext()) {
                ((ReminderCardView) it.next()).setHashHistoryData(z);
            }
            Iterator it2 = heartRateDetailActivity.f26886a.iterator();
            while (it2.hasNext()) {
                ((ReminderCardView) it2.next()).setHashHistoryData(z2);
            }
        }
    }

    static class e extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<HeartRateDetailActivity> f26895b;

        e(HeartRateDetailActivity heartRateDetailActivity) {
            this.f26895b = new WeakReference<>(heartRateDetailActivity);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            DeviceInfo deviceInfo;
            HeartRateDetailActivity heartRateDetailActivity = this.f26895b.get();
            if (heartRateDetailActivity == null || intent == null) {
                LogUtil.j("HealthHeartRate_HeartRateDetailActivity", "activity or intent is null.");
                return;
            }
            String action = intent.getAction();
            LogUtil.a("HealthHeartRate_HeartRateDetailActivity", "mDeviceStatusReceiver onReceive action :", action);
            if (!"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(action)) {
                LogUtil.j("HealthHeartRate_HeartRateDetailActivity", "this action do nothing");
                return;
            }
            Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
            if (parcelableExtra instanceof DeviceInfo) {
                deviceInfo = (DeviceInfo) parcelableExtra;
                if (!c(deviceInfo)) {
                    LogUtil.j("HealthHeartRate_HeartRateDetailActivity", "This device does not have the correspond capability.");
                    return;
                }
            } else {
                deviceInfo = null;
            }
            if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
                heartRateDetailActivity.s.sendEmptyMessage(1);
            } else if (deviceInfo.getDeviceConnectState() == 2) {
                heartRateDetailActivity.s.sendEmptyMessage(2);
            } else {
                LogUtil.j("HealthHeartRate_HeartRateDetailActivity", "mDeviceStatusReceiver do nothing");
            }
        }

        private boolean c(DeviceInfo deviceInfo) {
            if (deviceInfo == null) {
                return false;
            }
            Map<String, DeviceCapability> mapD = lvb.e().d(1, deviceInfo.getDeviceIdentify(), "HealthHeartRate_HeartRateDetailActivity");
            if (mapD == null || mapD.isEmpty()) {
                LogUtil.j("HealthHeartRate_HeartRateDetailActivity", "enter mDeviceStatusReceiver, deviceCapabilityHashMaps is null or empty");
                return false;
            }
            DeviceCapability deviceCapability = mapD.get(deviceInfo.getDeviceIdentify());
            if (deviceCapability != null && deviceCapability.isSupportHeartRate()) {
                return true;
            }
            LogUtil.j("HealthHeartRate_HeartRateDetailActivity", "device not support heart rate.");
            return false;
        }
    }

    public static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<HeartRateDetailActivity> f26893a;

        b(HeartRateDetailActivity heartRateDetailActivity) {
            this.f26893a = new WeakReference<>(heartRateDetailActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            HeartRateDetailActivity heartRateDetailActivity = this.f26893a.get();
            if (heartRateDetailActivity == null) {
                LogUtil.j("HealthHeartRate_HeartRateDetailActivity", "heartRateDetailActivity is null");
                return;
            }
            if (obj instanceof HiHealthData) {
                heartRateDetailActivity.r = ((HiHealthData) obj).getStartTime();
                LogUtil.a("HealthHeartRate_HeartRateDetailActivity", "read last data: ", Long.valueOf(heartRateDetailActivity.r));
                heartRateDetailActivity.j();
                return;
            }
            LogUtil.j("HealthHeartRate_HeartRateDetailActivity", "read last data time from database,mLastTimestamp=0");
            if (mgg.c("HealthHeartRate_HeartRateDetailActivity") != null || Utils.o()) {
                heartRateDetailActivity.j();
                return;
            }
            heartRateDetailActivity.k = false;
            final FrameLayout frameLayout = (FrameLayout) heartRateDetailActivity.findViewById(R.id.heart_rate_addfragment);
            frameLayout.post(new Runnable() { // from class: uds
                @Override // java.lang.Runnable
                public final void run() {
                    frameLayout.setVisibility(0);
                }
            });
            wqp.b(heartRateDetailActivity.getSupportFragmentManager(), CommonHealthNoDeviceFragment.e("HeartRateConstructor", 9), R.id.heart_rate_addfragment);
            heartRateDetailActivity.y.setVisibility(8);
            heartRateDetailActivity.e(360);
            EcgFilterManager.b().e(heartRateDetailActivity.u, 1, false);
        }
    }

    static class a implements HiSubscribeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<HeartRateDetailActivity> f26892c;

        a(HeartRateDetailActivity heartRateDetailActivity) {
            this.f26892c = new WeakReference<>(heartRateDetailActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            HeartRateDetailActivity heartRateDetailActivity = this.f26892c.get();
            if (heartRateDetailActivity != null) {
                heartRateDetailActivity.ad = list;
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            HeartRateDetailActivity heartRateDetailActivity = this.f26892c.get();
            if (heartRateDetailActivity != null && !heartRateDetailActivity.isFinishing()) {
                if (heartRateDetailActivity.p) {
                    heartRateDetailActivity.l();
                    return;
                }
                return;
            }
            LogUtil.j("HealthHeartRate_HeartRateDetailActivity", "HeartRateSubscribeListener onChange activity don't exist");
        }
    }

    @Override // android.app.Activity
    public void finish() {
        if (ActivityTransitionAnimator.c().a()) {
            HandlerExecutor.b(new Runnable() { // from class: udg
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c();
                }
            });
        } else {
            super.finish();
        }
    }

    public /* synthetic */ void c() {
        ActivityTransitionAnimator.c().a(qrs.ad(this)).c(qrs.q(this)).b();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
