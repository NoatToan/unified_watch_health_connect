package com.huawei.health.suggestion.ui.fitness.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.BaseActivity;
import com.huawei.health.suggestion.ui.fitness.helper.actionstrategy.BaseActionDetailPlayerStrategy;
import com.huawei.health.suggestion.ui.view.ActionDetailContentView;
import com.huawei.health.suggestion.ui.view.ActionDetailView;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.pluginfitnessadvice.AtomicAction;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import defpackage.hir;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class FitnessActionDetailActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private hir f9065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicAction f9066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ActionDetailView f9067c;
    private BaseActionDetailPlayerStrategy d;
    private String e;
    private String h;
    private String i;
    private HealthButton j;
    private View m;
    private CustomTitleBar o;
    private boolean g = false;
    private boolean n = false;
    private int k = 0;
    private Map<String, Object> f = new HashMap(4);

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initData() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("action_id");
            String stringExtra2 = intent.getStringExtra("action_version");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.e = stringExtra;
            }
            if (!TextUtils.isEmpty(stringExtra2)) {
                this.h = stringExtra2;
            }
            this.i = intent.getStringExtra("courseAttr");
            String stringExtra3 = intent.getStringExtra(WebViewHelp.BI_KEY_PULL_FROM);
            String stringExtra4 = intent.getStringExtra("resourceId");
            String stringExtra5 = intent.getStringExtra("resourceName");
            String stringExtra6 = intent.getStringExtra("pullOrder");
            LogUtil.a("FitnessActionDetailActivity", "pullFrom:", stringExtra3, "resourceId:", stringExtra4, "resourceName:", stringExtra5, " mActionId:", this.e, "pullOrder:", stringExtra6, "mCourseAttr:", this.i);
            this.f.put(WebViewHelp.BI_KEY_PULL_FROM, stringExtra3);
            this.f.put("resourceId", stringExtra4);
            this.f.put("resourceName", stringExtra5);
            this.f.put("pullOrder", stringExtra6);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ActionDetailView actionDetailView = this.f9067c;
        if (actionDetailView != null) {
            actionDetailView.d();
            getWindow().clearFlags(128);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ActionDetailView actionDetailView = this.f9067c;
        if (actionDetailView != null) {
            actionDetailView.b();
            getWindow().addFlags(128);
        }
        if (!CommonUtil.ab(BaseApplication.getContext())) {
            this.n = false;
            this.m.setVisibility(0);
            this.j.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessActionDetailActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    CommonUtil.t(FitnessActionDetailActivity.this);
                }
            });
            return;
        }
        this.m.setVisibility(8);
        if (!this.n) {
            c();
        } else if (g()) {
            c();
        }
    }

    private boolean g() {
        if (LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            return false;
        }
        AtomicAction atomicAction = this.f9066b;
        if (atomicAction != null && this.f9065a != null) {
            return hir.e(atomicAction.getExtendPropertyInt("aiFlag"), this.f9066b.getExtendPropertyInt("aiMeasurement")) && this.f9065a.d();
        }
        LogUtil.j("FitnessActionDetailActivity", "isReLoadData mActionInfo mActionModeBottomViewHelper == null ");
        return false;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ActionDetailView actionDetailView = this.f9067c;
        if (actionDetailView != null) {
            actionDetailView.e();
            this.f9067c = null;
        }
    }

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initLayout() {
        setContentView(R.layout.sug_activity_action_detail);
    }

    @Override // com.huawei.health.suggestion.ui.BaseActivity
    public void initViewController() {
        View viewFindViewById = findViewById(R.id.sug_action_no_data_set_network);
        this.m = viewFindViewById;
        viewFindViewById.setVisibility(8);
        this.j = (HealthButton) findViewById(R.id.btn_no_net_work);
        this.f9067c = (ActionDetailView) findViewById(R.id.sug_action_detail_view);
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.sug_action_title_bar);
        this.o = customTitleBar;
        customTitleBar.setTitleBarBackgroundColor(getResources().getColor(com.huawei.health.servicesui.R.color.transparent));
        this.o.setLeftButtonVisibility(0);
        this.o.setLeftButtonDrawable(ContextCompat.getDrawable(this, com.huawei.ui.commonui.R.drawable.ic_health_navbar_close_black), qre.f(com.huawei.ui.commonui.R.string.accessibility_close));
        this.o.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: hfk
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f36704b.d();
            }
        });
        b();
        a();
    }

    public /* synthetic */ void d() {
        this.k = this.o.getHeight();
        j();
    }

    private void a() {
        hir hirVar = new hir(this, this.e, this.f);
        this.f9065a = hirVar;
        hirVar.a(findViewById(R.id.sug_action_model_select));
        ActionDetailContentView.d(findViewById(R.id.sug_action_model_select));
    }

    private void j() {
        if (this.f9067c.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f9067c.getLayoutParams();
            if (qrs.af(BaseApplication.getContext())) {
                layoutParams.topMargin = this.k / 2;
            } else {
                layoutParams.topMargin = 0;
            }
            this.f9067c.setLayoutParams(layoutParams);
        }
    }

    private void c() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessActionDetailActivity.1
            @Override // java.lang.Runnable
            public void run() {
                CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
                if (courseApi != null) {
                    courseApi.getCourseActionInfo(FitnessActionDetailActivity.this.e, FitnessActionDetailActivity.this.h, new UiCallback<AtomicAction>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessActionDetailActivity.1.1
                        @Override // com.huawei.basefitnessadvice.callback.UiCallback
                        public void onFailure(int i, String str) {
                            LogUtil.j("FitnessActionDetailActivity", "getCourseActionInfo failure");
                            FitnessActionDetailActivity.this.n = false;
                            FitnessActionDetailActivity.this.e();
                        }

                        @Override // com.huawei.basefitnessadvice.callback.UiCallback
                        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                        public void onSuccess(AtomicAction atomicAction) {
                            FitnessActionDetailActivity.this.n = true;
                            FitnessActionDetailActivity.this.a(atomicAction);
                        }
                    });
                } else {
                    LogUtil.j("FitnessActionDetailActivity", "getNetWorkData : courseApi is null.");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AtomicAction atomicAction) {
        if (atomicAction == null) {
            LogUtil.j("FitnessActionDetailActivity", "initViewData actionInfo can not null");
        } else {
            this.f9066b = atomicAction;
            a(true);
        }
    }

    private void b() {
        this.f9067c.getDownloadView().setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessActionDetailActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (CommonUtil.ab(BaseApplication.getContext()) && !TextUtils.isEmpty(FitnessActionDetailActivity.this.e) && !TextUtils.isEmpty(FitnessActionDetailActivity.this.h)) {
                    FitnessActionDetailActivity.this.g = true;
                    CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
                    if (courseApi != null) {
                        courseApi.getCourseActionInfo(FitnessActionDetailActivity.this.e, FitnessActionDetailActivity.this.h, new UiCallback<AtomicAction>() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessActionDetailActivity.5.4
                            @Override // com.huawei.basefitnessadvice.callback.UiCallback
                            public void onFailure(int i, String str) {
                                LogUtil.j("FitnessActionDetailActivity", "getCourseActionInfo Get Action Detail Info Fauile");
                                FitnessActionDetailActivity.this.e();
                            }

                            @Override // com.huawei.basefitnessadvice.callback.UiCallback
                            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                            public void onSuccess(AtomicAction atomicAction) {
                                FitnessActionDetailActivity.this.a(atomicAction);
                            }
                        });
                        return;
                    } else {
                        LogUtil.j("FitnessActionDetailActivity", "initListener, onClikc: courseApi is null.");
                        return;
                    }
                }
                LogUtil.j("FitnessActionDetailActivity", "OnClick No network or Param can not null");
            }
        });
        this.f9067c.getCloseView().setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessActionDetailActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FitnessActionDetailActivity.this.finish();
            }
        });
        this.o.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessActionDetailActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                FitnessActionDetailActivity.this.finish();
            }
        });
    }

    private void a(final boolean z) {
        runOnUiThread(new Runnable() { // from class: com.huawei.health.suggestion.ui.fitness.activity.FitnessActionDetailActivity.10
            @Override // java.lang.Runnable
            public void run() {
                if (FitnessActionDetailActivity.this.f9067c != null) {
                    FitnessActionDetailActivity.this.f9067c.setVisibility(0);
                    if (z) {
                        if (FitnessActionDetailActivity.this.f9066b != null) {
                            FitnessActionDetailActivity.this.f9066b.putExtendProperty("courseAttr", FitnessActionDetailActivity.this.i);
                        }
                        if (FitnessActionDetailActivity.this.d == null) {
                            FitnessActionDetailActivity.this.f9067c.a(FitnessActionDetailActivity.this.f9066b, 0, null);
                            FitnessActionDetailActivity fitnessActionDetailActivity = FitnessActionDetailActivity.this;
                            fitnessActionDetailActivity.d = fitnessActionDetailActivity.f9067c.getVideoPlayerStrategy();
                        }
                        FitnessActionDetailActivity.this.f9065a.a(FitnessActionDetailActivity.this.f9066b);
                        FitnessActionDetailActivity.this.d.setIsDisplayedNoWifi(FitnessActionDetailActivity.this.g);
                        FitnessActionDetailActivity.this.d.initMediaPlayer();
                        return;
                    }
                    FitnessActionDetailActivity.this.f9067c.refreshHeaderView(8);
                }
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        j();
        this.f9067c.a();
        ActionDetailContentView.d(findViewById(R.id.sug_action_model_select));
    }
}
