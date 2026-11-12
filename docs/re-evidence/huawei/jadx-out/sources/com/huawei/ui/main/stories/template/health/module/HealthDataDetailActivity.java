package com.huawei.ui.main.stories.template.health.module;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.util.Consumer;
import androidx.fragment.app.FragmentTransaction;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.commonui.transition.ActivityTransitionAnimator;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.utils.BloodSugarBootPagerHelper;
import com.huawei.ui.main.stories.template.ComponentParam;
import com.huawei.ui.main.stories.template.ResourceParseHelper;
import com.huawei.ui.main.stories.template.health.HealthMvpActivity;
import com.huawei.ui.main.stories.template.health.contract.DataDetailActivityContract;
import com.huawei.ui.main.stories.template.health.module.hasdata.HealthHasDataFragment;
import com.huawei.ui.main.stories.template.health.module.nodevice.HealthNoDeviceFragment;
import com.huawei.ui.main.stories.template.health.module.nodevice.bean.NoDataPageInfoBean;
import defpackage.fua;
import defpackage.iov;
import defpackage.qrs;
import defpackage.uxd;
import defpackage.wpd;
import defpackage.wpk;
import defpackage.wps;
import defpackage.wpw;
import defpackage.wqn;
import defpackage.wqp;
import defpackage.wqq;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class HealthDataDetailActivity extends HealthMvpActivity<DataDetailActivityContract.DetailActivityPresenter> implements DataDetailActivityContract.DetailActivityView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f29007b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f29008a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Activity f29009c;
    private CustomTitleBar d;
    private HealthHasDataFragment e;
    private FrameLayout f;
    private LinearLayout g;
    private HealthNoDeviceFragment h;
    private HealthToolBar i;
    private FrameLayout j;
    private long k;
    private e l = new e(this);
    private ResourceParseHelper m;
    private int n;
    private String o;
    private wps q;

    @Override // com.huawei.ui.main.stories.template.BaseView
    public Context getViewContext() {
        return this;
    }

    public static void a(Context context, String str, int i) {
        d(context, str, i, 0L);
    }

    public static void d(Context context, String str, int i, long j) {
        e(context, str, i, j, null);
    }

    public static void e(Context context, String str, int i, long j, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) HealthDataDetailActivity.class);
        intent.putExtra("extra_service_id", str);
        intent.putExtra("extra_time_stamp", j);
        intent.putExtra("extra_page_type", i);
        if (bundle != null) {
            intent.putExtra("extra_bundle", bundle);
        }
        iov.d(context, intent);
        Activity activity = BaseApplication.getActivity();
        if (activity == null) {
            LogUtil.j("HealthDataDetailActivity", "launch context is null. return");
        } else {
            activity.overridePendingTransition(0, R.anim.activity_no_animation_short);
        }
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpActivity
    public void create() {
        ActivityTransitionAnimator activityTransitionAnimatorA = ActivityTransitionAnimator.c().a((Activity) this);
        boolean zA = activityTransitionAnimatorA.a();
        if (zA) {
            activityTransitionAnimatorA.f();
        }
        setContentView(getLayoutId());
        if (zA) {
            activityTransitionAnimatorA.d(true).d(new BaseActivity.e(this)).e();
        }
        initViews();
        initData();
    }

    private void a(final boolean z) {
        if (this.mPresenter instanceof uxd) {
            if (Utils.o() || ((uxd) this.mPresenter).e((IBaseResponseCallback) null, 0L) > 0 || !fua.m()) {
                if (z) {
                    b(true);
                    return;
                }
                return;
            }
            BloodSugarBootPagerHelper bloodSugarBootPagerHelper = new BloodSugarBootPagerHelper(getViewContext());
            bloodSugarBootPagerHelper.a(new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.template.health.module.HealthDataDetailActivity.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i == 0 && z) {
                        HealthDataDetailActivity.this.b(false);
                    }
                }
            });
            bloodSugarBootPagerHelper.showBootPage(this.f29008a);
            LinearLayout linearLayout = this.f29008a;
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        int i = z ? 600 : 200;
        HealthToolBar healthToolBar = this.i;
        if (healthToolBar != null) {
            healthToolBar.postDelayed(this.l, i);
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class e implements Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<HealthDataDetailActivity> f29013c;

        e(HealthDataDetailActivity healthDataDetailActivity) {
            this.f29013c = new WeakReference<>(healthDataDetailActivity);
        }

        @Override // java.lang.Runnable
        public void run() {
            HealthDataDetailActivity healthDataDetailActivity = this.f29013c.get();
            if (healthDataDetailActivity != null && !healthDataDetailActivity.isDestroyed() && !healthDataDetailActivity.isFinishing()) {
                if (healthDataDetailActivity.mPresenter instanceof uxd) {
                    ((uxd) healthDataDetailActivity.mPresenter).e();
                    return;
                }
                return;
            }
            ReleaseLogUtil.e("HealthDataDetailActivity", "activity is null");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        d(intent);
        Bundle bundleExtra = intent.getBundleExtra("extra_bundle");
        if (bundleExtra == null || !"jump_from_notify".equals(bundleExtra.getString("jump_from_tag", ""))) {
            return;
        }
        finish();
        iov.d(this, intent);
    }

    private void d(Intent intent) {
        Intent intent2 = getIntent();
        if (intent == null || intent2 == null || intent2.getIntExtra("extra_page_type", -1) == intent.getIntExtra("extra_page_type", -1)) {
            return;
        }
        int intExtra = intent.getIntExtra("extra_page_type", 0);
        if (8 == intExtra || 24 == intExtra) {
            setIntent(intent);
            this.mPresenter = null;
            this.e = null;
            setContentView(getLayoutId());
            initViews();
            initData();
        }
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpActivity
    public int getLayoutId() {
        return R.layout.activity_health_data_detail;
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpActivity
    public void initViews() {
        this.d = (CustomTitleBar) findViewById(R.id.health_detail_title_bar);
        this.i = (HealthToolBar) findViewById(R.id.health_detail_tool_bar);
        this.j = (FrameLayout) findViewById(R.id.health_detail_has_data_container);
        this.f = (FrameLayout) findViewById(R.id.health_detail_no_data_container);
        this.g = (LinearLayout) findViewById(R.id.health_detail_loading);
        this.f29008a = (LinearLayout) findViewById(R.id.extra_guide_layout_container);
        setMinibarBottomMargin(getResources().getDimensionPixelSize(R.dimen.hwappbarpattern_height));
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpActivity
    public void initData() {
        Intent intent = getIntent();
        if (intent != null) {
            this.o = intent.getStringExtra("extra_service_id");
            this.n = intent.getIntExtra("extra_page_type", 1);
            this.k = intent.getLongExtra("extra_time_stamp", 0L);
            b();
        }
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpActivity
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public DataDetailActivityContract.DetailActivityPresenter onCreatePresenter() {
        String strC = this.q.c();
        LogUtil.d("HealthDataDetailActivity", "onCreatePresenter:" + strC);
        return (DataDetailActivityContract.DetailActivityPresenter) wqn.e(strC, this);
    }

    public void b() {
        this.f29009c = this;
        this.m = new ResourceParseHelper();
        if (Utils.o() && "BodyTemperatureCardConstructor".equals(this.o) && TextUtils.isEmpty(wpk.e(this.o))) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: wqb
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.i();
                }
            });
        } else if ("BloodSugarCardConstructor".equals(this.o)) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: wqb
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.i();
                }
            });
        } else {
            wpd.c().d(this.o, new Consumer() { // from class: com.huawei.ui.main.stories.template.health.module.HealthDataDetailActivity$$ExternalSyntheticLambda2
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    this.f29010a.a((wps) obj);
                }
            });
            j();
        }
    }

    /* synthetic */ void a(wps wpsVar) {
        if (wpsVar != null) {
            LogUtil.a("HealthDataDetailActivity", "has down config");
            this.q = wpsVar;
            b(wpsVar);
        } else {
            LogUtil.a("HealthDataDetailActivity", "readLocalConfig");
            i();
            j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        int i;
        if ("BloodSugarCardConstructor".equals(this.o)) {
            i = R.raw.bloodsugar;
        } else if ("BodyTemperatureCardConstructor".equals(this.o)) {
            i = R.raw.bodytemperature;
        } else {
            LogUtil.j("HealthDataDetailActivity", "inputStream is null");
            i = -1;
        }
        if (i == -1) {
            return;
        }
        wpd.c().a(i, new Consumer() { // from class: com.huawei.ui.main.stories.template.health.module.HealthDataDetailActivity$$ExternalSyntheticLambda3
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.d.e((wps) obj);
            }
        });
    }

    /* synthetic */ void e(wps wpsVar) {
        Activity activity;
        if (wpsVar == null || (activity = this.f29009c) == null || activity.isFinishing() || this.f29009c.isDestroyed()) {
            return;
        }
        this.q = wpsVar;
        b(wpsVar);
    }

    private void j() {
        AtomicBoolean atomicBoolean = f29007b;
        if (atomicBoolean.get() || !this.m.b(this.o)) {
            return;
        }
        atomicBoolean.set(true);
        this.m.e(this.o, new a());
    }

    private void b(final wps wpsVar) {
        if (wpsVar != null && wpsVar.c() != null) {
            g();
            createPresenter(this.q.c(), this);
            runOnUiThread(new Runnable() { // from class: wpy
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d(wpsVar);
                }
            });
            return;
        }
        LogUtil.e("HealthDataDetailActivity", "healthDetailTemplateConfig = null");
    }

    public /* synthetic */ void d(wps wpsVar) {
        if (getPresenter() != null && wpsVar.d() != null) {
            getPresenter().initPage(wpsVar.d().b(), this.k, this.o);
        } else {
            LogUtil.e("HealthDataDetailActivity", "getPresenter = null or config.getInfo() = null");
        }
    }

    private void g() {
        Bundle bundleExtra;
        if (!"health_common_activity_presenter".equals(this.q.c()) || (bundleExtra = getIntent().getBundleExtra("extra_bundle")) == null) {
            return;
        }
        ComponentParam componentParam = new ComponentParam(null);
        componentParam.setmName("jump_from_tag");
        componentParam.setmValue(bundleExtra.getString("jump_from_tag", ""));
        this.q.a().getDayFragmentConfig().getLayoutConfig().getChartView().getParams().add(componentParam);
    }

    @Override // com.huawei.ui.main.stories.template.health.contract.DataDetailActivityContract.DetailActivityView
    public void showDataView(long j) {
        int iB;
        this.g.setVisibility(8);
        HealthHasDataFragment healthHasDataFragment = this.e;
        if (healthHasDataFragment == null) {
            wpw operationData = this.q.a().getOperationData();
            if (operationData != null) {
                iB = operationData.b();
            } else {
                iB = this.q.e().b();
            }
            this.n = iB;
            this.k = j;
            HealthHasDataFragment healthHasDataFragment2 = new HealthHasDataFragment();
            this.e = healthHasDataFragment2;
            healthHasDataFragment2.a(this.q.a(), this.n, this.k);
            wqp.b(getSupportFragmentManager(), this.e, R.id.health_detail_has_data_container);
        } else {
            healthHasDataFragment.c(j);
        }
        this.f.setVisibility(8);
        this.j.setVisibility(0);
        this.d.setTitleBarBackgroundColor(getResources().getColor(R.color.no_fragment_titlebgcolor, null));
        a(true);
        HealthNoDeviceFragment healthNoDeviceFragment = this.h;
        if (healthNoDeviceFragment == null || !healthNoDeviceFragment.isAdded()) {
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.remove(this.h);
        fragmentTransactionBeginTransaction.commitNowAllowingStateLoss();
        this.h = null;
    }

    @Override // com.huawei.ui.main.stories.template.health.contract.DataDetailActivityContract.DetailActivityView
    public void showNoDataView(boolean z) {
        int iB;
        NoDataPageInfoBean noDataPageInfoBean;
        int iB2;
        this.g.setVisibility(8);
        if (z) {
            if (this.f.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) this.f.getLayoutParams()).addRule(3, R.id.health_detail_title_bar);
            }
            wpw operationData = this.q.a().getOperationData();
            if (operationData != null) {
                iB2 = operationData.b();
            } else {
                iB2 = this.q.e().b();
            }
            this.n = iB2;
            noDataPageInfoBean = new NoDataPageInfoBean(this.o, iB2, this.q.d().e(), this.q.d().a());
            noDataPageInfoBean.setHasDevice();
        } else {
            wpw operationData2 = this.q.b().getOperationData();
            if (operationData2 != null) {
                iB = operationData2.b();
            } else {
                iB = this.q.e().b();
            }
            this.n = iB;
            noDataPageInfoBean = new NoDataPageInfoBean(this.o, iB, this.q.d().d(), this.q.d().c());
        }
        LogUtil.a("HealthDataDetailActivity", "no data config ", noDataPageInfoBean.toString());
        this.h = HealthNoDeviceFragment.a(this.q.b(), noDataPageInfoBean);
        wqp.b(getSupportFragmentManager(), this.h, R.id.health_detail_no_data_container);
        this.j.setVisibility(8);
        this.f.setVisibility(0);
        this.d.setTitleBarBackgroundColor(getResources().getColor(R.color.no_fragment_title_bgcolor_alpha));
        a(false);
    }

    @Override // com.huawei.ui.main.stories.template.health.contract.DataDetailActivityContract.DetailActivityView
    public CustomTitleBar getCustomTitleBar() {
        return this.d;
    }

    @Override // com.huawei.ui.main.stories.template.health.contract.DataDetailActivityContract.DetailActivityView
    public HealthToolBar getHealthToolBar() {
        return this.i;
    }

    @Override // com.huawei.ui.main.stories.template.health.contract.DataDetailActivityContract.DetailActivityView
    public void setTitle(String str) {
        this.d.setTitleText(str);
    }

    @Override // com.huawei.ui.main.stories.template.health.HealthMvpActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        wpd.c().d();
        HealthToolBar healthToolBar = this.i;
        if (healthToolBar != null) {
            healthToolBar.removeCallbacks(this.l);
            this.i = null;
        }
        if (this.f29009c != null) {
            this.f29009c = null;
        }
        if (this.m != null) {
            this.m = null;
        }
        if (this.e != null) {
            this.e = null;
        }
        if (this.h != null) {
            this.h = null;
        }
        wqq.b();
        super.onDestroy();
    }

    public long e() {
        return this.k;
    }

    /* JADX INFO: loaded from: classes19.dex */
    static class a implements ResourceParseHelper.JsonResult {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<HealthDataDetailActivity> f29012b;

        private a(HealthDataDetailActivity healthDataDetailActivity) {
            this.f29012b = new WeakReference<>(healthDataDetailActivity);
        }

        @Override // com.huawei.ui.main.stories.template.ResourceParseHelper.JsonResult
        public void onResult(wps wpsVar) {
            LogUtil.a("HealthDataDetailActivity", "requestConfig onResult");
            WeakReference<HealthDataDetailActivity> weakReference = this.f29012b;
            if (weakReference == null) {
                LogUtil.e("HealthDataDetailActivity", "mWeakReference == null");
                return;
            }
            if (weakReference.get() == null) {
                LogUtil.e("HealthDataDetailActivity", "activity == null");
            }
            HealthDataDetailActivity.f29007b.set(false);
        }

        @Override // com.huawei.ui.main.stories.template.ResourceParseHelper.JsonResult
        public void onFail() {
            LogUtil.a("HealthDataDetailActivity", "requestConfig onFail");
            WeakReference<HealthDataDetailActivity> weakReference = this.f29012b;
            if (weakReference == null) {
                LogUtil.e("HealthDataDetailActivity", "mWeakReference == null");
                return;
            }
            if (weakReference.get() == null) {
                LogUtil.e("HealthDataDetailActivity", "activity == null");
            }
            HealthDataDetailActivity.f29007b.set(false);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        if (ActivityTransitionAnimator.c().a()) {
            HandlerExecutor.b(new Runnable() { // from class: wpx
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.a();
                }
            });
        } else {
            super.finish();
        }
    }

    public /* synthetic */ void a() {
        ActivityTransitionAnimator.c().a(qrs.ad(this)).c(qrs.q(this)).b();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
