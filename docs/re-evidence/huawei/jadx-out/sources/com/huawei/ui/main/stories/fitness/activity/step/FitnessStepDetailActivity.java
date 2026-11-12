package com.huawei.ui.main.stories.fitness.activity.step;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.media3.extractor.ts.PsExtractor;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.knit.section.view.CustomH5ProWebview;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.HuaweiLoginManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.pluginachievement.manager.service.AchieveMedalDialogScenario;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.ClassType;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.DateType;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart;
import com.huawei.ui.commonui.linechart.common.MotionType;
import com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.scrollview.HealthNestedScrollView;
import com.huawei.ui.commonui.utils.ScrollUtil;
import com.huawei.ui.commonui.view.KakaClaimAnimation;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.step.FitnessStepDetailActivity;
import com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity;
import com.huawei.ui.main.stories.fitness.interactors.FitnessStepDetailInteractor;
import com.huawei.ui.main.stories.fitness.views.base.chart.DaySingleViewDataObserverView;
import com.huawei.ui.main.stories.fitness.views.base.chart.ICustomMotionTypeCalculator;
import com.huawei.ui.main.stories.fitness.views.base.chart.ObserveredClassifiedView;
import com.huawei.ui.main.stories.fitness.views.base.chart.ProportionView;
import com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverTotalDataView;
import com.huawei.ui.main.stories.fitness.views.base.chart.ScrollChartObserverView;
import com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener;
import com.huawei.ui.main.stories.fitness.views.base.chart.utils.UserEvent;
import com.huawei.ui.main.stories.fitness.views.fitnessdata.StepSourceAdapter;
import com.huawei.utils.FoundationCommonUtil;
import defpackage.ddq;
import defpackage.ddv;
import defpackage.fga;
import defpackage.ipb;
import defpackage.ive;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.lsl;
import defpackage.lsy;
import defpackage.njy;
import defpackage.osd;
import defpackage.otv;
import defpackage.qdm;
import defpackage.qgm;
import defpackage.qqn;
import defpackage.qre;
import defpackage.qrs;
import defpackage.uhs;
import defpackage.uhu;
import defpackage.uhv;
import defpackage.uif;
import defpackage.uih;
import defpackage.uim;
import defpackage.ujq;
import defpackage.uka;
import defpackage.ump;
import defpackage.wkb;
import defpackage.wss;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class FitnessStepDetailActivity extends BaseStepDetailActivity implements StepSourceAdapter.OnStepSourceItemClickListener, View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27035a;
    private HealthRecycleView aa;
    private LinearLayout ab;
    private BroadcastReceiver ac;
    private int ad;
    private ProportionView.ProportionItem ae;
    private int af;
    private final int[] ag;
    private Handler ah;
    private final i ai;
    private wss an;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f27036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f27037c;
    private double d;
    private ProportionView.ProportionItem e;
    private HealthOpenSDK f;
    private Date g;
    private uhu h;
    private int i;
    private CustomH5ProWebview j;
    private RelativeLayout k;
    private boolean l;
    private boolean m;
    private KakaClaimAnimation n;
    private FitnessStepDetailInteractor o;
    private Handler p;
    private List<ProportionView.ProportionItem> q;
    private ProportionView.ProportionItem r;
    private ProportionView s;
    private IBaseResponseCallback t;
    private List<uih> u;
    private DaySingleViewDataObserverView v;
    private StepSourceAdapter w;
    private IBaseResponseCallback x;
    private long y;
    private BaseStepDetailActivity.TextShowFormatter z;

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public boolean isStepDetail() {
        return true;
    }

    public FitnessStepDetailActivity() {
        this.ag = new int[]{R.string.IDS_privacy_all_data, Utils.o() ? R.string.IDS_fitness_step_description : R.string.IDS_knowledge};
        this.f27035a = BaseApplication.b();
        this.ai = new i(this);
        this.i = 0;
        this.af = 3;
        this.p = new f();
        this.o = new FitnessStepDetailInteractor(this);
        this.s = null;
        this.q = new ArrayList();
        this.r = null;
        this.ae = null;
        this.e = null;
        this.d = 0.0d;
        this.m = false;
        this.g = new Date();
        this.h = new uhu(this);
        this.ah = new Handler(Looper.getMainLooper()) { // from class: com.huawei.ui.main.stories.fitness.activity.step.FitnessStepDetailActivity.3
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message == null) {
                    return;
                }
                super.handleMessage(message);
                if (message.what == 100 && FitnessStepDetailActivity.this.af == 3) {
                    if (FitnessStepDetailActivity.this.f27036b == null) {
                        FitnessStepDetailActivity.this.f27036b = new Date(System.currentTimeMillis());
                    }
                    FitnessStepDetailActivity.this.a();
                    uhs.c((float) FitnessStepDetailActivity.this.d, FitnessStepDetailActivity.this.f27036b.getTime());
                }
            }
        };
        this.z = new BaseStepDetailActivity.TextShowFormatter() { // from class: com.huawei.ui.main.stories.fitness.activity.step.FitnessStepDetailActivity.5
            @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity.TextShowFormatter
            public String convertFloat2TextShow(float f2) {
                return UnitUtil.e(f2, 1, 0);
            }
        };
        this.f27037c = null;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d();
        this.mScrollView = (HealthNestedScrollView) findViewById(R.id.fitness_scroll_view);
        if (qdm.q()) {
            j();
        }
        h();
        g();
        ScrollUtil.a(this.mScrollView, getWindow().getDecorView(), 3021);
        lrd.c(this.ai);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.m = false;
        q();
    }

    private void j() {
        i();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        c(jCurrentTimeMillis);
        HandlerCenter.a().d(new Runnable() { // from class: uhk
            @Override // java.lang.Runnable
            public final void run() {
                FitnessStepDetailActivity.a(jCurrentTimeMillis);
            }
        }, 500L);
    }

    public static /* synthetic */ void a(long j2) {
        ReleaseLogUtil.d("SCUI_FitnessStepDetailActivity", "initSummary synCloud syncTime ", Long.valueOf(j2));
        ArrayList arrayList = new ArrayList();
        arrayList.add(2);
        arrayList.add(40002);
        qdm.c(arrayList, j2);
    }

    private void i() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.j = (CustomH5ProWebview) findViewById(R.id.health_summary_web_view);
        ddv.b().loadEmbeddedH5(this.j, "com.huawei.health.h5.health-trend", new H5ProLaunchOption.Builder().addPath("#/highLightCardView?domain=step"));
        final int iB = qre.b(R.dimen.health_common_128dp);
        boolean zE = ScrollUtil.e(this.mScrollView, this.j, iB);
        ReleaseLogUtil.d("SCUI_FitnessStepDetailActivity", "initSummaryView loadEmbeddedH5 time ", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), " isSummaryVisible ", Boolean.valueOf(zE));
        if (zE) {
            k();
        } else {
            this.mScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: com.huawei.ui.main.stories.fitness.activity.step.FitnessStepDetailActivity$$ExternalSyntheticLambda6
                @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
                public final void onScrollChange(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
                    this.f27039c.c(iB, nestedScrollView, i2, i3, i4, i5);
                }
            });
        }
    }

    /* synthetic */ void c(int i2, NestedScrollView nestedScrollView, int i3, int i4, int i5, int i6) {
        if (this.l || !ScrollUtil.e(this.mScrollView, this.j, i2)) {
            return;
        }
        k();
    }

    private void k() {
        this.l = true;
        qdm.d("Walk_0001", false);
    }

    private void c(final long j2) {
        this.ac = new BroadcastReceiver() { // from class: com.huawei.ui.main.stories.fitness.activity.step.FitnessStepDetailActivity.4
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null) {
                    ReleaseLogUtil.e("SCUI_FitnessStepDetailActivity", "mSyncStatusReceiver receiver intent is null.");
                    return;
                }
                if (!"com.huawei.hihealth.action_sync_data_result".equals(intent.getAction())) {
                    ReleaseLogUtil.e("SCUI_FitnessStepDetailActivity", "mSyncStatusReceiver receiver intent.action is error.");
                    return;
                }
                long longExtra = intent.getLongExtra("sync_data_result_id", 0L);
                if (intent.getBooleanExtra("sync_data_result_success", true) && longExtra == j2) {
                    qdm.d("SCUI_FitnessStepDetailActivity", FitnessStepDetailActivity.this.j);
                }
            }
        };
        BroadcastManagerUtil.d(BaseApplication.b(), this.ac, new IntentFilter("com.huawei.hihealth.action_sync_data_result"));
        ReleaseLogUtil.d("SCUI_FitnessStepDetailActivity", "registerSyncResultBroadcast");
    }

    private void h() {
        this.mMarketingLayout = (LinearLayout) findViewById(R.id.base_step_marketing);
        cancelLayoutById(this.mMarketingLayout);
        if (this.mMarketingApi != null) {
            this.mMarketingApi.requestMarketingResource(new MarketingOption.Builder().setContext(this).setPageId(10).setLayoutMap(p()).build());
        }
    }

    private void g() {
        setViewSafeRegion(false, this.mMarketingLayout);
        setViewSafeRegion(false, this.j);
    }

    private Map<Integer, LinearLayout> p() {
        HashMap map = new HashMap();
        map.put(4017, this.mMarketingLayout);
        return map;
    }

    private void d() {
        this.o.b(this, isStepDetail());
        initStatus();
        if (this.f == null) {
            this.f = fga.d(this).e();
        }
        HandlerExecutor.c(new Runnable() { // from class: uhr
            @Override // java.lang.Runnable
            public final void run() {
                this.e.o();
            }
        }, 500L);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        RelativeLayout relativeLayout = this.k;
        if (relativeLayout instanceof DayStepProgressBarScrollView) {
            ((DayStepProgressBarScrollView) relativeLayout).e();
        }
        uhu uhuVar = this.h;
        if (uhuVar != null) {
            uhuVar.d(configuration);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        LogUtil.a("SCUI_FitnessStepDetailActivity", "initViewTahiti");
        d();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ReleaseLogUtil.d("SCUI_FitnessStepDetailActivity", "onDestroy");
        lrd.b(this.ai);
        this.o.d();
        BroadcastManagerUtil.d(BaseApplication.b(), this.ac);
        CustomH5ProWebview customH5ProWebview = this.j;
        if (customH5ProWebview != null) {
            customH5ProWebview.c();
        }
        Handler handler = this.p;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.ah;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        HashMap map = new HashMap();
        map.put("click", 1);
        lmf.d().c(this, AnalyticsValue.HEALTH_DETAIL_DAY_SHARE_21300005.value(), map, 0);
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public View getExtensionView() {
        if (!Utils.o()) {
            return LayoutInflater.from(this).inflate(R.layout.step_detail_extension, (ViewGroup) null);
        }
        ProportionView proportionView = this.s;
        if (proportionView != null) {
            return proportionView;
        }
        this.s = new ProportionView(this);
        this.r = new ProportionView.e(this, Color.argb(255, 145, PsExtractor.PRIVATE_STREAM_1, 255));
        this.ae = new ProportionView.b(this, Color.argb(255, 95, 155, 255));
        this.e = new ProportionView.d(this, Color.argb(255, 53, 126, 255));
        this.q.add(this.r);
        this.q.add(this.ae);
        this.q.add(this.e);
        this.s.e(this.q);
        this.s.setSubHeaderText(qre.a(R.string.IDS_fitness_subheader_title, qre.f(R.string.IDS_settings_steps)));
        return this.s;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initChartListener() {
        d((View.OnClickListener) this);
        b((View.OnClickListener) this);
        if (!Utils.o()) {
            this.mClassifiedViewList.e(new IOnDataShowListener() { // from class: com.huawei.ui.main.stories.fitness.activity.step.FitnessStepDetailActivity.1
                @Override // com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener
                public void onUserEvent(UserEvent userEvent) {
                }

                @Override // com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener
                public void onDataShowChanged(DataInfos dataInfos, int i2, int i3, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
                    FitnessStepDetailActivity.this.c(dataInfos, i2, i3, hwHealthBaseBarLineChart);
                    FitnessStepDetailActivity.this.e(dataInfos, i2);
                }
            });
        } else {
            this.mClassifiedViewList.e(new IOnDataShowListener() { // from class: com.huawei.ui.main.stories.fitness.activity.step.FitnessStepDetailActivity.10
                @Override // com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener
                public void onUserEvent(UserEvent userEvent) {
                }

                @Override // com.huawei.ui.main.stories.fitness.views.base.chart.utils.IOnDataShowListener
                public void onDataShowChanged(DataInfos dataInfos, int i2, int i3, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
                    FitnessStepDetailActivity.this.c(dataInfos, i2, i3, hwHealthBaseBarLineChart);
                    if (hwHealthBaseBarLineChart instanceof HwHealthBaseScrollBarLineChart) {
                        FitnessStepDetailActivity.this.c((HwHealthBaseScrollBarLineChart) hwHealthBaseBarLineChart, dataInfos);
                    }
                    FitnessStepDetailActivity.this.e(dataInfos, i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(HwHealthBaseScrollBarLineChart hwHealthBaseScrollBarLineChart, DataInfos dataInfos) {
        ICustomMotionTypeCalculator iCustomMotionTypeCalculatorD = this.mChartLayerHolder.d();
        this.ae.setDataValue((iCustomMotionTypeCalculatorD.calculate(hwHealthBaseScrollBarLineChart, dataInfos, MotionType.SUM) - iCustomMotionTypeCalculatorD.calculate(hwHealthBaseScrollBarLineChart, dataInfos, MotionType.RUN)) - iCustomMotionTypeCalculatorD.calculate(hwHealthBaseScrollBarLineChart, dataInfos, MotionType.CLIMB));
        this.r.setDataValue(iCustomMotionTypeCalculatorD.calculate(hwHealthBaseScrollBarLineChart, dataInfos, MotionType.RUN));
        this.e.setDataValue(iCustomMotionTypeCalculatorD.calculate(hwHealthBaseScrollBarLineChart, dataInfos, MotionType.CLIMB));
        this.s.e(this.q);
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initStartArguement(Intent intent) {
        if (intent != null && intent.hasExtra("today_current_steps_total")) {
            this.mCurrentDayValueMinimum = intent.getIntExtra("today_current_steps_total", (int) this.mCurrentDayValueMinimum);
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initActivityData() {
        m();
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initChartLayerHolderData(IChartLayerHolder iChartLayerHolder) {
        iChartLayerHolder.spetifiyDataTypeUnit(new IChartLayerHolder.DataTypeFilter() { // from class: com.huawei.ui.main.stories.fitness.activity.step.FitnessStepDetailActivity.9
            @Override // com.huawei.ui.commonui.linechart.icommon.IChartLayerHolder.DataTypeFilter
            public boolean isAccept(DataInfos dataInfos) {
                if (dataInfos != null) {
                    return dataInfos.isStepData();
                }
                return false;
            }
        }, getString(R.string.IDS_settings_steps_unit));
    }

    private void e() {
        HealthOpenSDK healthOpenSDK = this.f;
        if (healthOpenSDK != null) {
            healthOpenSDK.c(new j(this));
            return;
        }
        LogUtil.j("SCUI_FitnessStepDetailActivity", "mHealthOpenSdk ==null ,get data failed!");
        this.ah.sendMessage(this.ah.obtainMessage(100));
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class i implements AccessibilityManager.TouchExplorationStateChangeListener {
        private final WeakReference<FitnessStepDetailActivity> e;

        i(FitnessStepDetailActivity fitnessStepDetailActivity) {
            this.e = new WeakReference<>(fitnessStepDetailActivity);
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z) {
            FitnessStepDetailActivity fitnessStepDetailActivity = this.e.get();
            if (fitnessStepDetailActivity != null && !fitnessStepDetailActivity.isFinishing() && !fitnessStepDetailActivity.isDestroyed()) {
                int i = fitnessStepDetailActivity.ad;
                LogUtil.a("SCUI_FitnessStepDetailActivity", "TouchExplorationStateChangeListener onTouchExplorationStateChanged enabled ", Boolean.valueOf(z), " mTargetLayoutVisibility ", Integer.valueOf(i), " mStepSingleViewDataObserverView ", fitnessStepDetailActivity.v);
                if (fitnessStepDetailActivity.v == null) {
                    return;
                }
                fitnessStepDetailActivity.v.setEditTargetAccessibilityVisibility(fitnessStepDetailActivity.ad);
                return;
            }
            ReleaseLogUtil.e("SCUI_FitnessStepDetailActivity", "TouchExplorationStateChangeListener onTouchExplorationStateChanged activity ", fitnessStepDetailActivity);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class j implements IExecuteResult {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<FitnessStepDetailActivity> f27051b;

        protected j(FitnessStepDetailActivity fitnessStepDetailActivity) {
            this.f27051b = null;
            this.f27051b = new WeakReference<>(fitnessStepDetailActivity);
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onSuccess(Object obj) {
            FitnessStepDetailActivity fitnessStepDetailActivity = this.f27051b.get();
            if (fitnessStepDetailActivity == null) {
                LogUtil.j("SCUI_FitnessStepDetailActivity", "onSuccess shareActivity == null");
                return;
            }
            LogUtil.a("SCUI_FitnessStepDetailActivity", "get today steps success");
            if (obj == null) {
                LogUtil.j("SCUI_FitnessStepDetailActivity", "get today steps success but boj==null");
                fitnessStepDetailActivity.ah.sendMessage(fitnessStepDetailActivity.ah.obtainMessage(100));
            } else if (obj instanceof Bundle) {
                fitnessStepDetailActivity.d = ((Bundle) obj).getInt("step");
                LogUtil.a("SCUI_FitnessStepDetailActivity", "mAverSteps", Double.valueOf(fitnessStepDetailActivity.d));
                fitnessStepDetailActivity.ah.sendMessage(fitnessStepDetailActivity.ah.obtainMessage(100));
            }
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onFailed(Object obj) {
            FitnessStepDetailActivity fitnessStepDetailActivity = this.f27051b.get();
            if (fitnessStepDetailActivity != null) {
                fitnessStepDetailActivity.ah.sendMessage(fitnessStepDetailActivity.ah.obtainMessage(100));
            } else {
                LogUtil.j("SCUI_FitnessStepDetailActivity", "onFailed shareActivity == null");
            }
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onServiceException(Object obj) {
            FitnessStepDetailActivity fitnessStepDetailActivity = this.f27051b.get();
            if (fitnessStepDetailActivity != null) {
                fitnessStepDetailActivity.ah.sendMessage(fitnessStepDetailActivity.ah.obtainMessage(100));
            } else {
                LogUtil.j("SCUI_FitnessStepDetailActivity", "onServiceException shareActivity == null");
            }
        }
    }

    private void e(Context context, Date date) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        int iA = DateFormatUtil.a(date.getTime());
        hiAggregateOption.setTimeInterval(String.valueOf(iA), String.valueOf(iA), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        hiAggregateOption.setType(new int[]{40002});
        hiAggregateOption.setConstantsKey(new String[]{ParsedFieldTag.STEP_SUM});
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(3);
        HiHealthNativeApi.a(context).aggregateHiHealthData(hiAggregateOption, new e(this));
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class e implements HiAggregateListener {
        WeakReference<FitnessStepDetailActivity> e;

        protected e(FitnessStepDetailActivity fitnessStepDetailActivity) {
            this.e = new WeakReference<>(fitnessStepDetailActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            FitnessStepDetailActivity fitnessStepDetailActivity = this.e.get();
            if (fitnessStepDetailActivity == null) {
                LogUtil.j("SCUI_FitnessStepDetailActivity", "shareActivity == null");
                return;
            }
            if (list != null && !list.isEmpty()) {
                FitnessStepDetailActivity.a(list, fitnessStepDetailActivity);
                return;
            }
            LogUtil.j("SCUI_FitnessStepDetailActivity", "getDailySportDataWithDataBase ReadStaticDealCallback onResult data is null");
            fitnessStepDetailActivity.ah.sendMessage(fitnessStepDetailActivity.ah.obtainMessage(100));
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            FitnessStepDetailActivity fitnessStepDetailActivity = this.e.get();
            if (fitnessStepDetailActivity == null) {
                LogUtil.j("SCUI_FitnessStepDetailActivity", "shareActivity == null");
                return;
            }
            LogUtil.a("SCUI_FitnessStepDetailActivity", "onResultIntent ", Integer.valueOf(i), list, Integer.valueOf(i2), Integer.valueOf(i3));
            fitnessStepDetailActivity.ah.sendMessage(fitnessStepDetailActivity.ah.obtainMessage(100));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(List<HiHealthData> list, FitnessStepDetailActivity fitnessStepDetailActivity) {
        double d2 = list.get(0).getInt(ParsedFieldTag.STEP_SUM);
        fitnessStepDetailActivity.d = d2;
        LogUtil.a("SCUI_FitnessStepDetailActivity", "getDailySportDataWithDataBase mAverSteps", Double.valueOf(d2));
        fitnessStepDetailActivity.ah.sendMessage(fitnessStepDetailActivity.ah.obtainMessage(100));
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public int configSubTabStyle() {
        return R.layout.knit_sub_tab_widget_sport_step;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void initTitleBar() {
        this.mTitleBar.setTitleText(getString(R.string.IDS_settings_steps));
        this.mTitleBar.setRightSoftkeyBackground(qre.c(LanguageUtil.ba(this.f27035a) ? R.drawable.ic_health_nav_share_black_rt : R.drawable.ic_health_nav_share_black), qre.f(R.string.accessibility_share));
        this.mTitleBar.setRightSoftkeyVisibility(0);
        this.mTitleBar.setRightSoftkeyOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.step.FitnessStepDetailActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.c(500)) {
                    return;
                }
                FitnessStepDetailActivity.this.l();
            }
        });
        ArrayList<String> arrayList = new ArrayList<>(this.ag.length);
        for (int i2 : this.ag) {
            arrayList.add(getString(i2));
        }
        setTitleBarRightButton(this, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        LogUtil.a("SCUI_FitnessStepDetailActivity", "mCurrentDay=", Long.valueOf(this.f27036b.getTime()), " System.currentTimeMillis()=", Long.valueOf(System.currentTimeMillis()));
        this.d = 0.0d;
        if (lsl.aa(this.f27036b.getTime())) {
            e();
        } else {
            e(getApplicationContext(), this.f27036b);
        }
    }

    public static Date d(long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), 0, 0, 0);
        return calendar.getTime();
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public BaseStepDetailActivity.TextShowFormatter getTextShowFormatter() {
        return this.z;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ObserveredClassifiedView onCreateDayClassifiedView(BaseStepDetailActivity.TextShowFormatter textShowFormatter) {
        ObserveredClassifiedView observeredClassifiedViewOnCreateDayClassifiedView = super.onCreateDayClassifiedView(textShowFormatter);
        enableStepClassifiedViewObserver(observeredClassifiedViewOnCreateDayClassifiedView);
        observeredClassifiedViewOnCreateDayClassifiedView.setObserverContainerBackgroundColor(ContextCompat.getColor(this.f27035a, R.color.common_transparent));
        ScrollChartObserverView scrollChartObserverViewAcquireScrollChartObserverView = observeredClassifiedViewOnCreateDayClassifiedView.acquireScrollChartObserverView();
        if (scrollChartObserverViewAcquireScrollChartObserverView instanceof DaySingleViewDataObserverView) {
            DaySingleViewDataObserverView daySingleViewDataObserverView = (DaySingleViewDataObserverView) scrollChartObserverViewAcquireScrollChartObserverView;
            this.v = daySingleViewDataObserverView;
            this.mScrollChartObserverView = daySingleViewDataObserverView.c();
            this.k = this.v.d();
            this.ab = this.v.getSourceLayout();
            this.aa = this.v.e();
            f();
            if (this.mScrollChartObserverView instanceof ScrollChartObserverTotalDataView) {
                ((ScrollChartObserverTotalDataView) this.mScrollChartObserverView).b(new ScrollChartObserverTotalDataView.c(this.mCurrentDayValueMinimum, 40002, DataInfos.query(getClassType(), DateType.DATE_DAY)));
                n();
                return observeredClassifiedViewOnCreateDayClassifiedView;
            }
        }
        return observeredClassifiedViewOnCreateDayClassifiedView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        DaySingleViewDataObserverView daySingleViewDataObserverView = this.v;
        if (daySingleViewDataObserverView == null) {
            ReleaseLogUtil.e("SCUI_FitnessStepDetailActivity", "jumpToDeviceManagementPage mStepSingleViewDataObserverView is null");
            return;
        }
        HealthTextView sourceManagement = daySingleViewDataObserverView.getSourceManagement();
        if (sourceManagement == null) {
            ReleaseLogUtil.e("SCUI_FitnessStepDetailActivity", "jumpToDeviceManagementPage textView is null");
            return;
        }
        if (!HuaweiLoginManager.checkIsInstallHuaweiAccount(this.f27035a)) {
            ReleaseLogUtil.d("SCUI_FitnessStepDetailActivity", "jumpToDeviceManagementPage not install hmscore");
            sourceManagement.setVisibility(8);
        } else {
            final Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("hwid://com.huawei.hwid/DeviceManager"));
            intent.setPackage(HMSPackageManager.getInstance(this.f27035a).getHMSPackageName());
            sourceManagement.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.main.stories.fitness.activity.step.FitnessStepDetailActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    try {
                        FitnessStepDetailActivity.this.startActivityForResult(intent, 0);
                    } catch (Exception e2) {
                        LogUtil.e("SCUI_FitnessStepDetailActivity", "exception getClassName: ", e2.getClass().getSimpleName());
                    }
                }
            });
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 2000 && i3 == -1) {
            int intExtra = intent.getIntExtra("StepGoal", 0);
            LogUtil.a("SCUI_FitnessStepDetailActivity", "Target Activity Result StepGoal=", Integer.valueOf(intExtra));
            RelativeLayout relativeLayout = this.k;
            if (relativeLayout instanceof DayStepProgressBarScrollView) {
                ((DayStepProgressBarScrollView) relativeLayout).e(intExtra);
            }
            b(intExtra);
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ObserveredClassifiedView onCreateWeekClassifiedView(BaseStepDetailActivity.TextShowFormatter textShowFormatter) {
        ObserveredClassifiedView observeredClassifiedViewOnCreateWeekClassifiedView = super.onCreateWeekClassifiedView(textShowFormatter);
        enableWeekMonthStepClassifiedViewObserver(observeredClassifiedViewOnCreateWeekClassifiedView, new BaseStepDetailActivity.b(getString(R.string.IDS_fitness_total_step_data_title), getString(R.string.IDS_settings_steps_unit), getString(R.string.IDS_fitness_average_step_data_title), getString(R.string.IDS_settings_steps_unit)));
        return observeredClassifiedViewOnCreateWeekClassifiedView;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ObserveredClassifiedView onCreateMonthClassifiedView(BaseStepDetailActivity.TextShowFormatter textShowFormatter) {
        ObserveredClassifiedView observeredClassifiedViewOnCreateMonthClassifiedView = super.onCreateMonthClassifiedView(textShowFormatter);
        enableWeekMonthStepClassifiedViewObserver(observeredClassifiedViewOnCreateMonthClassifiedView, new BaseStepDetailActivity.b(getString(R.string.IDS_fitness_total_step_data_title), getString(R.string.IDS_settings_steps_unit), getString(R.string.IDS_fitness_average_step_data_title), getString(R.string.IDS_settings_steps_unit)));
        return observeredClassifiedViewOnCreateMonthClassifiedView;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ObserveredClassifiedView onCreateYearClassifiedView(BaseStepDetailActivity.TextShowFormatter textShowFormatter) {
        ObserveredClassifiedView observeredClassifiedViewOnCreateYearClassifiedView = super.onCreateYearClassifiedView(textShowFormatter);
        enableStepClassifiedViewObserver(observeredClassifiedViewOnCreateYearClassifiedView, new HwHealthBaseScrollBarLineChart.DataRatioProvider() { // from class: com.huawei.ui.main.stories.fitness.activity.step.FitnessStepDetailActivity.7
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthBaseScrollBarLineChart.DataRatioProvider
            public float computeRatio(int i2) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(((long) i2) * 60000);
                calendar.set(5, 1);
                calendar.roll(5, -1);
                return calendar.get(5);
            }
        }, new BaseStepDetailActivity.b(getString(R.string.IDS_fitness_total_step_data_title), getString(R.string.IDS_settings_steps_unit), getString(R.string.IDS_fitness_average_step_data_title), getString(R.string.IDS_settings_steps_unit)));
        return observeredClassifiedViewOnCreateYearClassifiedView;
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public ClassType getClassType() {
        return ClassType.TYPE_STEP;
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class f extends Handler {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<FitnessStepDetailActivity> f27050c;

        private f(FitnessStepDetailActivity fitnessStepDetailActivity) {
            this.f27050c = new WeakReference<>(fitnessStepDetailActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            super.handleMessage(message);
            FitnessStepDetailActivity fitnessStepDetailActivity = this.f27050c.get();
            if (fitnessStepDetailActivity == null) {
                return;
            }
            switch (message.what) {
                case 103:
                    fitnessStepDetailActivity.a(8);
                    break;
                case 104:
                    fitnessStepDetailActivity.d(message.obj);
                    break;
                case 105:
                    fitnessStepDetailActivity.a(message.obj);
                    break;
                case 106:
                    fitnessStepDetailActivity.c(message.obj);
                    break;
                default:
                    LogUtil.j("SCUI_FitnessStepDetailActivity", "RequestHandler handleMessage default");
                    break;
            }
        }
    }

    private void m() {
        long jR = lsl.r(System.currentTimeMillis());
        this.y = jR;
        this.f27036b = d(jR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DataInfos dataInfos, int i2, int i3, HwHealthBaseBarLineChart hwHealthBaseBarLineChart) {
        int i4;
        long j2 = ((long) i2) * 60000;
        if (!dataInfos.isDayData() && (hwHealthBaseBarLineChart instanceof HwHealthBaseScrollBarLineChart)) {
            hwHealthBaseBarLineChart.enableManualReferenceLine(this.i, qqn.d(R.color.sport_step_target));
            ((HwHealthBaseScrollBarLineChart) hwHealthBaseBarLineChart).reCalculateDynamicBoardForManualRefLine();
        }
        if (dataInfos.isMonthData()) {
            this.mTitleBar.setRightSoftkeyVisibility(8);
            d(8);
            i4 = 5;
        } else if (dataInfos.isYearData()) {
            this.mTitleBar.setRightSoftkeyVisibility(8);
            d(8);
            i4 = 6;
        } else if (dataInfos.isWeekData()) {
            this.mTitleBar.setRightSoftkeyVisibility(8);
            d(8);
            i4 = 4;
        } else {
            this.mTitleBar.setRightSoftkeyVisibility(0);
            this.f27036b = d(j2);
            d(0);
            if (lsl.aa(j2)) {
                this.v.setTipVisibility(0);
                RelativeLayout relativeLayout = this.k;
                if (relativeLayout instanceof DayStepProgressBarScrollView) {
                    ((DayStepProgressBarScrollView) relativeLayout).setKakaListLayoutVisibility(0);
                }
            } else {
                this.v.setTipVisibility(8);
                RelativeLayout relativeLayout2 = this.k;
                if (relativeLayout2 instanceof DayStepProgressBarScrollView) {
                    ((DayStepProgressBarScrollView) relativeLayout2).setKakaListLayoutVisibility(8);
                }
            }
            i4 = 3;
        }
        this.y = j2;
        this.af = i4;
    }

    private void d(int i2) {
        DaySingleViewDataObserverView daySingleViewDataObserverView = this.v;
        if (daySingleViewDataObserverView == null) {
            LogUtil.j("SCUI_FitnessStepDetailActivity", "setVisibilityForTargetLayout mStepSingleViewDataObserverView is null visibility ", Integer.valueOf(i2));
            return;
        }
        this.ad = i2;
        daySingleViewDataObserverView.setTargetLayoutVisibility(i2);
        this.v.setEditTargetAccessibilityVisibility(i2);
    }

    private void n() {
        LogUtil.a("SCUI_FitnessStepDetailActivity", "onCustomChartStyle enter ");
        qgm.c("900200006", new h());
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class h implements IBaseResponseCallback {
        private WeakReference<FitnessStepDetailActivity> e;

        private h(FitnessStepDetailActivity fitnessStepDetailActivity) {
            this.e = new WeakReference<>(fitnessStepDetailActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("SCUI_FitnessStepDetailActivity", "SportAchievementGoalDataCallback ", obj == null ? null : obj.toString());
            FitnessStepDetailActivity fitnessStepDetailActivity = this.e.get();
            if (fitnessStepDetailActivity == null) {
                ReleaseLogUtil.e("SCUI_FitnessStepDetailActivity", " SportAchievementGoalDataCallback stepDetailActivity == null ");
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.obj = obj;
            messageObtain.what = 106;
            fitnessStepDetailActivity.p.sendMessageDelayed(messageObtain, 1000L);
        }
    }

    public void b(int i2, String str, int i3) {
        if (this.m) {
            LogUtil.j("SCUI_FitnessStepDetailActivity", "kaka button click too fast");
            return;
        }
        Task<osd> taskClaimKakaTasksByScenario = ddq.d().claimKakaTasksByScenario(this.f27035a, i3, str);
        if (taskClaimKakaTasksByScenario == null) {
            ReleaseLogUtil.e("SCUI_FitnessStepDetailActivity", "updataKaka updateTaskKaka is null");
        } else {
            this.m = true;
            taskClaimKakaTasksByScenario.addOnSuccessListener(new b(i2)).addOnFailureListener(new OnFailureListener() { // from class: com.huawei.ui.main.stories.fitness.activity.step.FitnessStepDetailActivity.2
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    FitnessStepDetailActivity.this.m = false;
                    LogUtil.j("SCUI_FitnessStepDetailActivity", "updateTaskKaka == null");
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i2) {
        if (this.n == null) {
            c();
        }
        KakaClaimAnimation kakaClaimAnimation = this.n;
        if (kakaClaimAnimation != null) {
            kakaClaimAnimation.setVisibility(0);
            this.n.e(i2);
            RelativeLayout relativeLayout = this.k;
            if (relativeLayout instanceof DayStepProgressBarScrollView) {
                ((DayStepProgressBarScrollView) relativeLayout).b();
                return;
            }
            return;
        }
        LogUtil.j("SCUI_FitnessStepDetailActivity", "processKakaSuccess failed with null mKakaClick.");
    }

    private void c() {
        ViewStub viewStub = (ViewStub) findViewById(R.id.step_kaka_convert_anim);
        if (viewStub == null) {
            LogUtil.a("SCUI_FitnessStepDetailActivity", "initConvertAnimLayout ViewStub is loaded fail.");
            return;
        }
        View viewInflate = viewStub.inflate();
        if (viewInflate instanceof KakaClaimAnimation) {
            this.n = (KakaClaimAnimation) viewInflate;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class b implements OnSuccessListener<osd> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f27048c;
        private WeakReference<FitnessStepDetailActivity> d;

        private b(FitnessStepDetailActivity fitnessStepDetailActivity, int i) {
            this.d = new WeakReference<>(fitnessStepDetailActivity);
            this.f27048c = i;
        }

        @Override // com.huawei.hmf.tasks.OnSuccessListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(osd osdVar) {
            FitnessStepDetailActivity fitnessStepDetailActivity = this.d.get();
            if (fitnessStepDetailActivity != null) {
                fitnessStepDetailActivity.m = false;
                if (osdVar == null) {
                    ReleaseLogUtil.e("SCUI_FitnessStepDetailActivity", "kakaUpdateReturnBody == null");
                    return;
                }
                String strE = osdVar.e();
                ReleaseLogUtil.d("SCUI_FitnessStepDetailActivity", "showKakaAnimation resultCode ", strE);
                if ("0".equals(strE)) {
                    fitnessStepDetailActivity.c(this.f27048c);
                    return;
                } else {
                    LogUtil.j("SCUI_FitnessStepDetailActivity", "kaka Exchange failed.");
                    return;
                }
            }
            LogUtil.j("SCUI_FitnessStepDetailActivity", "fitnessStepDetailActivity is null");
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public String getCurrentDayValueMinimum() {
        return this.mScrollChartObserverView.getContentTextView().getText().toString();
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public String getCurrentDayValueUnit() {
        return getString(R.string.IDS_settings_steps_unit);
    }

    public void c(String str) {
        DaySingleViewDataObserverView daySingleViewDataObserverView = this.v;
        if (daySingleViewDataObserverView != null) {
            daySingleViewDataObserverView.setTipText(str);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.r()) {
            LogUtil.a("SCUI_FitnessStepDetailActivity", "click too fast");
            return;
        }
        if (view.getId() == R.id.bind_wechat) {
            wss wssVar = this.an;
            if (wssVar != null) {
                wssVar.a(this);
                return;
            }
            return;
        }
        if (view.getId() == R.id.close_bind_wechat) {
            uhv.d();
            f(8);
        }
    }

    private void q() {
        boolean zO = Utils.o();
        boolean zIsKidAccount = LoginInit.getInstance(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).isKidAccount();
        boolean zE = uhv.e();
        if (zO || zIsKidAccount || zE) {
            LogUtil.j("SCUI_FitnessStepDetailActivity", "updateWeChatBindStatus gp: ", false, ", isOversea: ", Boolean.valueOf(zO), ", isKidAccount: ", Boolean.valueOf(zIsKidAccount), ", isWeChatShouldHide: ", Boolean.valueOf(zE));
            f(8);
        } else {
            lsy.a(new Runnable() { // from class: uhw
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50107c.b();
                }
            });
        }
    }

    public /* synthetic */ void b() {
        if (this.an == null) {
            this.an = wss.d(this);
        }
        final boolean z = !"false".equals(this.an.c(this.f27035a));
        runOnUiThread(new Runnable() { // from class: uhn
            @Override // java.lang.Runnable
            public final void run() {
                this.f50098c.b(z);
            }
        });
    }

    public /* synthetic */ void b(boolean z) {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        f(z ? 8 : 0);
    }

    private void d(View.OnClickListener onClickListener) {
        DaySingleViewDataObserverView daySingleViewDataObserverView = this.v;
        if (daySingleViewDataObserverView != null) {
            daySingleViewDataObserverView.setOnClickGoBindWeChatListener(onClickListener);
        }
    }

    private void b(View.OnClickListener onClickListener) {
        DaySingleViewDataObserverView daySingleViewDataObserverView = this.v;
        if (daySingleViewDataObserverView != null) {
            daySingleViewDataObserverView.setOnCloseWeChatLayoutListener(onClickListener);
        }
    }

    private void f(int i2) {
        DaySingleViewDataObserverView daySingleViewDataObserverView = this.v;
        if (daySingleViewDataObserverView != null) {
            daySingleViewDataObserverView.setWeChatLayoutVisibility(i2);
        }
    }

    public void c(int i2, int i3) {
        DaySingleViewDataObserverView daySingleViewDataObserverView = this.v;
        if (daySingleViewDataObserverView == null) {
            LogUtil.j("SCUI_FitnessStepDetailActivity", "updateTargetProgress mStepSingleViewDataObserverView is null value ", Integer.valueOf(i2), " target ", Integer.valueOf(i3));
            return;
        }
        updateTargetProgress(daySingleViewDataObserverView.getTargetTextView(), i2, i3, R.plurals.IDS_single_circle_walk_target_desc);
        if (this.f27037c == null) {
            this.f27037c = Boolean.valueOf(otv.b(AchieveMedalDialogScenario.STEPS));
            LogUtil.a("SCUI_FitnessStepDetailActivity", "updateTargetProgress: isShowStepsMedalDialog -> " + this.f27037c);
        }
        if (this.h == null || this.f27037c.booleanValue()) {
            return;
        }
        LogUtil.a("SCUI_FitnessStepDetailActivity", "updateTargetProgress mStartTime", Long.valueOf(this.y));
        this.h.b(this.y);
        this.h.e(i3, i2);
    }

    private void f() {
        this.aa.setLayoutManager(new HealthLinearLayoutManager(this.f27035a));
        this.u = new ArrayList(10);
        StepSourceAdapter stepSourceAdapter = new StepSourceAdapter(this.f27035a, this.u);
        this.w = stepSourceAdapter;
        stepSourceAdapter.d(this);
        this.aa.setAdapter(this.w);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.fitnessdata.StepSourceAdapter.OnStepSourceItemClickListener
    public void onItemClick(int i2) {
        if (njy.e(this.u, i2)) {
            LogUtil.j("SCUI_FitnessStepDetailActivity", "onItemClick position is out of mStepSourceItemList.");
            return;
        }
        String strB = this.u.get(i2).b();
        boolean zE = this.u.get(i2).e();
        LogUtil.a("SCUI_FitnessStepDetailActivity", "onItemClick position is ", Integer.valueOf(i2), " steps ", strB, " hasPointStep ", Boolean.valueOf(zE));
        if (TextUtils.isEmpty(strB) || !zE) {
            LogUtil.j("SCUI_FitnessStepDetailActivity", "onItemClick current device is not point steps data");
            return;
        }
        Intent intent = new Intent(this.f27035a, (Class<?>) DayStepSourceListActivity.class);
        intent.putExtra("device_id", this.u.get(i2).d());
        intent.putExtra("point_step_time", this.g.getTime());
        startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DataInfos dataInfos, int i2) {
        if (!dataInfos.isDayData()) {
            a(8);
            LogUtil.j("SCUI_FitnessStepDetailActivity", "getCurrentDayStepSource current page is not day view");
            return;
        }
        long jR = lsl.r(((long) i2) * 60000);
        Date date = new Date(jR);
        if (!lsl.c(this.g.getTime(), date.getTime()) || lsl.aa(this.g.getTime())) {
            this.g = date;
            LogUtil.a("SCUI_FitnessStepDetailActivity", "getCurrentDayStepSource mDayViewCurrentDay is ", DateFormatUtil.e(date.getTime(), DateFormatUtil.DateFormatType.DEFAULT_DATE_FORMAT));
            uim.c().e(jR, new c());
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class c implements CommonUiBaseResponse {
        private WeakReference<FitnessStepDetailActivity> e;

        private c(FitnessStepDetailActivity fitnessStepDetailActivity) {
            this.e = new WeakReference<>(fitnessStepDetailActivity);
        }

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            FitnessStepDetailActivity fitnessStepDetailActivity = this.e.get();
            if (fitnessStepDetailActivity == null) {
                LogUtil.j("SCUI_FitnessStepDetailActivity", "fitnessStepDetailActivity is null");
                return;
            }
            if (obj == null) {
                LogUtil.j("SCUI_FitnessStepDetailActivity", "getFitnessStepDataOrigin objData is null");
                fitnessStepDetailActivity.p.sendEmptyMessage(103);
            } else {
                Message messageObtain = Message.obtain();
                messageObtain.what = 104;
                messageObtain.obj = obj;
                fitnessStepDetailActivity.p.sendMessage(messageObtain);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Object obj) {
        if (!njy.b(obj, uif.class)) {
            LogUtil.j("SCUI_FitnessStepDetailActivity", "showStepSourceList obj not instanceof List");
            a(8);
            return;
        }
        List<uif> list = (List) obj;
        if (list.size() == 0) {
            LogUtil.j("SCUI_FitnessStepDetailActivity", "showStepSourceList stepSourceList content is empty");
            a(8);
            return;
        }
        a(0);
        this.u.clear();
        ArrayList arrayList = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList(10);
        ArrayList arrayList3 = new ArrayList();
        for (uif uifVar : list) {
            uih uihVar = new uih();
            uihVar.e(uifVar.b());
            uihVar.c(ump.d(uifVar.a(), uifVar.c()));
            uihVar.c(TextUtils.isEmpty(uifVar.d()) ? uifVar.c() : uifVar.d());
            uihVar.d(a(uifVar.b()));
            uihVar.d("");
            if (uifVar.a() == 32) {
                arrayList.add(uihVar);
            } else {
                arrayList2.add(uihVar);
            }
            arrayList3.add(uifVar.b());
        }
        this.u.addAll(arrayList);
        this.u.addAll(arrayList2);
        this.w.notifyDataSetChanged();
        LogUtil.a("SCUI_FitnessStepDetailActivity", "showStepSourceList mDayViewCurrentDay is ", this.g);
        HashMap map = new HashMap(16);
        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
            map.put(Integer.valueOf(i2), (String) arrayList3.get(i2));
        }
        a((Map<Integer, String>) map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2) {
        this.ab.setVisibility(i2);
        this.aa.setVisibility(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Object obj) {
        int iIntValue;
        if (!(obj instanceof Integer)) {
            LogUtil.j("SCUI_FitnessStepDetailActivity", "setRefreshGaolText is not instanceof HashMap");
            iIntValue = 10000;
        } else {
            iIntValue = ((Integer) obj).intValue();
        }
        b(iIntValue);
    }

    private void b(int i2) {
        DaySingleViewDataObserverView daySingleViewDataObserverView = this.v;
        if (daySingleViewDataObserverView == null) {
            LogUtil.j("SCUI_FitnessStepDetailActivity", "refreshGoalLayout mStepSingleViewDataObserverView is null");
        } else {
            daySingleViewDataObserverView.setEditTargetOnClickListener(new View.OnClickListener() { // from class: uhp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.c(view);
                }
            });
            this.i = i2;
        }
    }

    public /* synthetic */ void c(View view) {
        HashMap map = new HashMap(1);
        map.put("click", 1);
        AppRouter.c("/HWUserProfileMgr/MyTargetActivity").a("from", 5).b(this, 2000);
        lmf.d().c(this.f27035a, AnalyticsValue.HEALTH_MINE_TARGET_2040004.value(), map, 0);
        ujq.e(5, 1);
    }

    public void e(int i2) {
        if (this.mCurrentDayValueMinimum > i2) {
            this.v.setTipButton(qre.f(R.string.IDS_fitness_share_now), new View.OnClickListener() { // from class: uhq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.d(view);
                }
            });
            return;
        }
        this.v.setTipButton(qre.f(R.string.IDS_fitness_walk), new View.OnClickListener() { // from class: uho
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.a(view);
            }
        });
        if (this.i != i2) {
            ujq.c(0, 1, 0, null);
        }
    }

    public /* synthetic */ void d(View view) {
        l();
    }

    public /* synthetic */ void a(View view) {
        ujq.c(1, 1, 0, null);
        int iE = ive.c().e(0, 257, -1, -1.0f, (ISportDataCallback) null, this.f27035a);
        HashMap map = new HashMap(1);
        map.put("click", 1);
        lmf.d().c(this.f27035a, AnalyticsValue.HEALTH_TAKE_WALK_NOW_2040230.value(), map, 0);
        if (iE == 0) {
            finish();
        }
    }

    private void a(Map<Integer, String> map) {
        LogUtil.a("SCUI_FitnessStepDetailActivity", "getDayTotalStepDataById deviceIdMap size is ", Integer.valueOf(map.size()));
        a aVar = new a(map);
        this.t = aVar;
        this.o.e(2, map, this.g, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Map<String, Integer> map, Map<Integer, String> map2) {
        d dVar = new d(map, map2);
        this.x = dVar;
        this.o.e(901, map2, this.g, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<HiHealthData> list, Map<Integer, String> map) {
        HashMap map2 = new HashMap(16);
        HashMap map3 = new HashMap(16);
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            d(map, map2, it.next(), map3);
        }
        LogUtil.a("SCUI_FitnessStepDetailActivity", "handlePointStepData needQueryDeviceStepMap ", map3.toString());
        if (map3.isEmpty()) {
            e(map2);
        } else {
            e(map2, map3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<HiHealthData> list, Map<Integer, String> map, Map<String, Integer> map2) {
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            a(map, map2, it.next());
        }
        LogUtil.a("SCUI_FitnessStepDetailActivity", "handleSingleDeviceStepData stepsMap ", map2.toString());
        e(map2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Map<String, Integer> map) {
        if (map.isEmpty()) {
            LogUtil.j("SCUI_FitnessStepDetailActivity", "refreshStepSourceList stepsMap.isEmpty ");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.obj = map;
        messageObtain.what = 105;
        this.p.sendMessage(messageObtain);
    }

    private void d(Map<Integer, String> map, Map<String, Integer> map2, HiHealthData hiHealthData, Map<Integer, String> map3) {
        int i2 = 0;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int iJ = CommonUtil.j(hiHealthData.getString("dayStepSum_" + entry.getKey()));
            if (iJ > 0) {
                map2.put(entry.getValue(), Integer.valueOf(iJ));
            } else {
                map3.put(Integer.valueOf(i2), entry.getValue());
                i2++;
            }
        }
        for (uih uihVar : this.u) {
            Integer num = map2.get(uihVar.d());
            uihVar.a(num != null && num.intValue() > 0);
        }
    }

    private void a(Map<Integer, String> map, Map<String, Integer> map2, HiHealthData hiHealthData) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int iJ = CommonUtil.j(hiHealthData.getString("dayStepSum_" + entry.getKey()));
            if (iJ > 0) {
                map2.put(entry.getValue(), Integer.valueOf(iJ));
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj) {
        if (!(obj instanceof Map)) {
            LogUtil.j("SCUI_FitnessStepDetailActivity", "notifyDataSetChangedSourceList obj is not instanceof Map");
            return;
        }
        Map map = (Map) obj;
        for (uih uihVar : this.u) {
            Integer num = (Integer) map.get(uihVar.d());
            if (num == null || num.intValue() <= 0) {
                uihVar.d("");
            } else {
                uihVar.d(qre.e(R.plurals.IDS_hwh_me_other_target_steps, num.intValue(), UnitUtil.e(num.intValue(), 1, 0)));
            }
        }
        this.w.notifyDataSetChanged();
    }

    private boolean a(String str) {
        String androidId = FoundationCommonUtil.getAndroidId(this.f27035a);
        if (TextUtils.isEmpty(androidId)) {
            LogUtil.j("SCUI_FitnessStepDetailActivity", "showStepSourceList isLocalDevice phoneId is error");
            return false;
        }
        return androidId.equals(str);
    }

    @Override // com.huawei.ui.main.stories.fitness.base.BaseStepDetailActivity
    public void handleTitleBarRightButtonOnClick(int i2) {
        LogUtil.a("SCUI_FitnessStepDetailActivity", "PopViewList setOnClick position is ", Integer.valueOf(i2));
        if (i2 == 0) {
            wkb.b(100, this);
        } else if (i2 == 1) {
            ipb.e("1");
            uka.e(this, "/hwtips/topic/health_help_all/%s/SF-10190178_f6174.html?channel=04");
        } else {
            LogUtil.j("SCUI_FitnessStepDetailActivity", "PopViewList setOnClick position is else");
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<String, Integer> f27049c;
        private final WeakReference<FitnessStepDetailActivity> d;
        private final Map<Integer, String> e;

        private d(FitnessStepDetailActivity fitnessStepDetailActivity, Map<String, Integer> map, Map<Integer, String> map2) {
            this.d = new WeakReference<>(fitnessStepDetailActivity);
            this.f27049c = map;
            this.e = map2;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            FitnessStepDetailActivity fitnessStepDetailActivity = this.d.get();
            if (fitnessStepDetailActivity == null) {
                ReleaseLogUtil.e("SCUI_FitnessStepDetailActivity", "activity is null in InnerSingleDeviceStepCallback");
                return;
            }
            if (!(obj instanceof List)) {
                fitnessStepDetailActivity.e(this.f27049c);
                LogUtil.j("SCUI_FitnessStepDetailActivity", "getSingleDeviceStepDataById objData is not instanceof List");
                return;
            }
            List list = (List) obj;
            if (list.size() == 0) {
                fitnessStepDetailActivity.e(this.f27049c);
                LogUtil.j("SCUI_FitnessStepDetailActivity", "getSingleDeviceStepDataById dataList is empty");
            } else {
                fitnessStepDetailActivity.e(list, this.e, this.f27049c);
            }
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class a implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<Integer, String> f27047c;
        private final WeakReference<FitnessStepDetailActivity> d;

        private a(FitnessStepDetailActivity fitnessStepDetailActivity, Map<Integer, String> map) {
            this.d = new WeakReference<>(fitnessStepDetailActivity);
            this.f27047c = map;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            FitnessStepDetailActivity fitnessStepDetailActivity = this.d.get();
            if (fitnessStepDetailActivity == null) {
                ReleaseLogUtil.e("SCUI_FitnessStepDetailActivity", "activity is null in InnerSingleDeviceStepCallback");
                return;
            }
            if (!(obj instanceof List)) {
                LogUtil.j("SCUI_FitnessStepDetailActivity", "getDayTotalStepDataById objData is not instanceof List");
                fitnessStepDetailActivity.e(new HashMap(16), this.f27047c);
                return;
            }
            List list = (List) obj;
            if (list.size() != 0) {
                fitnessStepDetailActivity.d((List<HiHealthData>) list, this.f27047c);
            } else {
                LogUtil.j("SCUI_FitnessStepDetailActivity", "getDayTotalStepDataById dataList is empty");
                fitnessStepDetailActivity.e(new HashMap(16), this.f27047c);
            }
        }
    }
}
