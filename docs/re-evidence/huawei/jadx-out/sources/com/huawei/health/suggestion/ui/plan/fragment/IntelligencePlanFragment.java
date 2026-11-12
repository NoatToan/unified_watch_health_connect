package com.huawei.health.suggestion.ui.plan.fragment;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.IntWeekPlan;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.ObserveLabels;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.knit.AdvancedSportFragment;
import com.huawei.health.marketing.utils.ColumnLayoutItemDecoration;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.BaseActivity;
import com.huawei.health.suggestion.ui.plan.adapter.IntPlanDetailAdapter;
import com.huawei.health.suggestion.ui.plan.fragment.IntelligencePlanFragment;
import com.huawei.health.suggestion.ui.plan.util.GridLayoutItemDecoration;
import com.huawei.health.suggestion.ui.plan.viewholder.OverseaAiDialogViewHolder;
import com.huawei.health.suggestion.ui.plan.viewmodel.IntPlanDetailDataViewModel;
import com.huawei.health.suggestion.ui.run.activity.PlanSettingsActivity;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.health.weight.WeightApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.trade.PayApi;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.swiperefreshlayout.HealthSwipeRefreshLayout;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout;
import defpackage.btq;
import defpackage.btw;
import defpackage.btx;
import defpackage.buh;
import defpackage.hbz;
import defpackage.hqr;
import defpackage.hub;
import defpackage.huq;
import defpackage.huw;
import defpackage.hux;
import defpackage.hvl;
import defpackage.hvp;
import defpackage.hvu;
import defpackage.hwb;
import defpackage.ibk;
import defpackage.idy;
import defpackage.ien;
import defpackage.iep;
import defpackage.ift;
import defpackage.ifz;
import defpackage.irz;
import defpackage.iuo;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.njy;
import defpackage.nlq;
import defpackage.nlr;
import defpackage.ped;
import defpackage.qey;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrh;
import defpackage.qrs;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public class IntelligencePlanFragment extends AdvancedSportFragment implements PopViewList.PopViewClickListener {
    private static boolean e = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Observer f9689a;
    private IntPlanDetailAdapter aa;
    private volatile qey ab;
    private IntPlanDetailDataViewModel ac;
    private OnFitnessStatusChangeCallback ae;
    private HealthRecycleView ag;
    private hub ai;
    private long al;
    private IntPlanDetailAdapter am;
    private huq an;
    private FrameLayout ao;
    private HealthRecycleView ap;
    private SmartTrainPlanFragment as;
    private d at;
    private HealthTextView aw;
    private LinearLayout ax;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f9691c;
    private volatile IntPlan f;
    private HealthSwipeRefreshLayout g;
    private IntPlan i;
    private UiCallback j;
    private View q;
    private RelativeLayout u;
    private RelativeLayout x;
    private HealthTextView y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f9690b = BaseApplication.b();
    private androidx.lifecycle.Observer<ibk> p = new androidx.lifecycle.Observer() { // from class: com.huawei.health.suggestion.ui.plan.fragment.IntelligencePlanFragment$$ExternalSyntheticLambda21
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: onChanged */
        public final void b(Object obj) {
            this.d.e((ibk) obj);
        }
    };
    private androidx.lifecycle.Observer<Boolean> af = new androidx.lifecycle.Observer() { // from class: com.huawei.health.suggestion.ui.plan.fragment.IntelligencePlanFragment$$ExternalSyntheticLambda22
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: onChanged */
        public final void b(Object obj) {
            this.f9692c.c(((Boolean) obj).booleanValue());
        }
    };
    private androidx.lifecycle.Observer<ibk> s = new androidx.lifecycle.Observer() { // from class: com.huawei.health.suggestion.ui.plan.fragment.IntelligencePlanFragment$$ExternalSyntheticLambda23
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: onChanged */
        public final void b(Object obj) {
            this.f9693a.d((ibk) obj);
        }
    };
    private OnFitnessStatusChangeCallback ad = new OnFitnessStatusChangeCallback() { // from class: hta
        @Override // com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback
        public final void onUpdate() {
            this.d.j();
        }
    };
    private OnFitnessStatusChangeCallback ak = new OnFitnessStatusChangeCallback() { // from class: hsy
        @Override // com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback
        public final void onUpdate() {
            this.e.i();
        }
    };
    private OnFitnessStatusChangeCallback aj = new OnFitnessStatusChangeCallback() { // from class: hsx
        @Override // com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback
        public final void onUpdate() {
            this.f37122c.f();
        }
    };
    private OnFitnessStatusChangeCallback v = new OnFitnessStatusChangeCallback() { // from class: htb
        @Override // com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback
        public final void onUpdate() {
            this.f37125c.l();
        }
    };
    private OnFitnessStatusChangeCallback z = new OnFitnessStatusChangeCallback() { // from class: htd
        @Override // com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback
        public final void onUpdate() {
            this.f37127c.m();
        }
    };
    private OnFitnessStatusChangeCallback ah = new OnFitnessStatusChangeCallback() { // from class: hsl
        @Override // com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback
        public final void onUpdate() {
            this.f37111a.k();
        }
    };
    private Handler r = new Handler(Looper.getMainLooper());
    private final Object av = new Object();
    private boolean k = false;
    private boolean t = false;
    private boolean o = true;
    private boolean l = false;
    private boolean ar = false;
    private boolean aq = false;
    private boolean d = false;
    private boolean n = false;
    private boolean m = false;
    private hqr h = new hqr();
    private final Observer w = new Observer() { // from class: hsu
        @Override // com.huawei.haf.design.pattern.Observer
        public final void notify(String str, Object[] objArr) {
            this.e.b(str, objArr);
        }
    };

    public static /* synthetic */ void b(View view) {
    }

    public static /* synthetic */ void d(View view) {
    }

    public /* synthetic */ void j() {
        c("plan create");
    }

    public /* synthetic */ void i() {
        c("plan update");
    }

    public /* synthetic */ void f() {
        c("plan switch");
    }

    public /* synthetic */ void l() {
        c("PLAN_ADJUST");
    }

    public /* synthetic */ void m() {
        i("PLAN_CLOCK");
    }

    public /* synthetic */ void b(final String str, Object[] objArr) {
        if ("WATCH_PLAN_REPORT_DIALOG".equals(str)) {
            IntPlanDetailAdapter intPlanDetailAdapter = this.aa;
            if (intPlanDetailAdapter == null) {
                LogUtil.j("Suggestion_IntelligencePlanFragment", "WATCH_PLAN_REPORT_DIALOG mPlanDetailAdapter == null");
                return;
            }
            View viewD = intPlanDetailAdapter.d();
            if (viewD == null) {
                LogUtil.j("Suggestion_IntelligencePlanFragment", " view == null");
                return;
            } else {
                viewD.setVisibility(8);
                return;
            }
        }
        if (ObserveLabels.STAY_FIT_PLAN_LOADING_FINISH.equals(str)) {
            ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "mObserver loading label ", str, " mLoadingView ", this.q);
            HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.suggestion.ui.plan.fragment.IntelligencePlanFragment.1
                @Override // java.lang.Runnable
                public void run() {
                    if (IntelligencePlanFragment.this.q == null || IntelligencePlanFragment.this.q.getVisibility() == 8) {
                        return;
                    }
                    ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "mObserver loading gone label ", str);
                    IntelligencePlanFragment.this.q.setVisibility(8);
                }
            });
            return;
        }
        if (ObserveLabels.UPDATE_STAY_FIT_PLAN.equals(str)) {
            aq();
            btq.e().e("PLAN_UPDATE");
            return;
        }
        if ("SPORT_ENTRANCE_IS_VISIBLE_TO_USER".equals(str)) {
            if (objArr == null || objArr.length == 0) {
                LogUtil.j("Suggestion_IntelligencePlanFragment", "mObserver objects ", objArr);
                return;
            }
            Object obj = objArr[0];
            if (!(obj instanceof Boolean)) {
                LogUtil.j("Suggestion_IntelligencePlanFragment", "mObserver object ", obj);
            } else if (((Boolean) obj).booleanValue()) {
                i("sportVisible");
            }
        }
    }

    public static BaseFragment e() {
        return new IntelligencePlanFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LogUtil.a("Suggestion_IntelligencePlanFragment", "onCreateView");
        View viewInflate = layoutInflater.inflate(R.layout.sug_fragment_intelligent_plan_detail, viewGroup, false);
        if (viewInflate instanceof ViewGroup) {
            this.f9691c = (ViewGroup) viewInflate;
        }
        BaseActivity.setViewSafeRegion(false, viewInflate);
        i(viewInflate);
        a(viewInflate);
        this.aa = new IntPlanDetailAdapter(getContext(), getChildFragmentManager(), this.ag, this.h);
        ColumnLayoutItemDecoration columnLayoutItemDecorationY = y();
        this.ag.addItemDecoration(columnLayoutItemDecorationY);
        this.ag.setLayoutManager(new HealthLinearLayoutManager(getContext()));
        this.ag.setAdapter(this.aa);
        this.ag.setNestedScrollingEnabled(false);
        this.ag.setItemAnimator(null);
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(R.id.plan_recommend_recycle_view);
        this.ap = healthRecycleView;
        healthRecycleView.addItemDecoration(columnLayoutItemDecorationY);
        this.am = new IntPlanDetailAdapter(getContext(), null, this.ap);
        if (!hvu.d()) {
            ar();
        } else {
            this.ap.setLayoutManager(new HealthLinearLayoutManager(getContext()));
        }
        this.ap.setAdapter(this.am);
        this.ao = (FrameLayout) viewInflate.findViewById(R.id.smart_train_plan_fragment);
        this.ax = (LinearLayout) viewInflate.findViewById(R.id.sync_cloud_data_layout);
        this.aw = (HealthTextView) viewInflate.findViewById(R.id.sync_progress_percent);
        this.ae = new OnFitnessStatusChangeCallback() { // from class: hth
            @Override // com.huawei.basefitnessadvice.callback.OnFitnessStatusChangeCallback
            public final void onUpdate() {
                this.e.n();
            }
        };
        ao();
        ag();
        if (LanguageUtil.ba(getContext())) {
            viewInflate.setRotationY(180.0f);
        }
        this.l = true;
        this.m = UnitUtil.f();
        this.al = System.currentTimeMillis();
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi != null) {
            LogUtil.a("Suggestion_IntelligencePlanFragment", "DietDiaryRepository syncDietData ");
            weightApi.syncDietData();
        }
        return viewInflate;
    }

    public /* synthetic */ void n() {
        c("plan finish");
        hub hubVar = this.ai;
        if (hubVar != null) {
            hubVar.d(getContext());
        } else {
            LogUtil.e("Suggestion_IntelligencePlanFragment", "mPlanDetailInteract is  null");
        }
    }

    private void ar() {
        if (!qrs.af(getContext())) {
            ien.b(getContext(), this.ap);
            return;
        }
        final int i = 2;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2, 1, false);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() { // from class: com.huawei.health.suggestion.ui.plan.fragment.IntelligencePlanFragment.3
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i2) {
                if (i2 == 0 && IntelligencePlanFragment.this.ap.getAdapter() != null && IntelligencePlanFragment.this.ap.getAdapter().getItemViewType(i2) == 5) {
                    return i;
                }
                return 1;
            }
        });
        ien.a(getContext(), this.ap, gridLayoutManager, true, qre.b(R.dimen.cardMarginMiddle));
        this.ap.addItemDecoration(new GridLayoutItemDecoration());
    }

    private void i(View view) {
        this.ag = (HealthRecycleView) view.findViewById(R.id.plan_detail_recycle_view);
        this.u = (RelativeLayout) view.findViewById(R.id.network_error_layout);
        this.y = (HealthTextView) view.findViewById(R.id.no_net_work_tips);
        this.q = view.findViewById(R.id.loading_progress);
        this.x = (RelativeLayout) view.findViewById(R.id.oversea_dialog);
        this.ao = (FrameLayout) view.findViewById(R.id.smart_train_plan_fragment);
        this.ax = (LinearLayout) view.findViewById(R.id.sync_cloud_data_layout);
        this.aw = (HealthTextView) view.findViewById(R.id.sync_progress_percent);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ObserverManagerUtil.d(this.w, "WATCH_PLAN_REPORT_DIALOG");
        ObserverManagerUtil.d(this.w, "SPORT_ENTRANCE_IS_VISIBLE_TO_USER");
        ObserverManagerUtil.d(this.w, ObserveLabels.UPDATE_STAY_FIT_PLAN);
        ObserverManagerUtil.d(this.w, ObserveLabels.STAY_FIT_PLAN_LOADING_FINISH);
    }

    private void q() {
        HandlerExecutor.b(new Runnable() { // from class: hte
            @Override // java.lang.Runnable
            public final void run() {
                this.f37128a.c();
            }
        });
    }

    public /* synthetic */ void c() {
        HealthRecycleView healthRecycleView = this.ap;
        if (healthRecycleView == null || !(healthRecycleView.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.ap.getLayoutParams();
        layoutParams.setMarginStart((int) getResources().getDimension(R.dimen.hw_show_size_0_dp));
        layoutParams.setMarginEnd((int) getResources().getDimension(R.dimen.hw_show_size_0_dp));
        this.ap.setLayoutParams(layoutParams);
    }

    private ColumnLayoutItemDecoration y() {
        return new ColumnLayoutItemDecoration(0, getResources().getDimensionPixelSize(R.dimen.cardMarginMiddle), 1, new int[]{0, getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.health_common_8dp), 0, 0});
    }

    private void ao() {
        this.j = new UiCallback() { // from class: com.huawei.health.suggestion.ui.plan.fragment.IntelligencePlanFragment.5
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.e("Suggestion_IntelligencePlanFragment", "finish plan fail, errorInfo:" + str);
                if (IntelligencePlanFragment.this.i != null) {
                    buh.d("ai_plan_finish", IntelligencePlanFragment.this.i.getPlanId());
                }
                IntelligencePlanFragment.this.q.setVisibility(8);
                FragmentActivity activity = IntelligencePlanFragment.this.getActivity();
                if (activity == null) {
                    LogUtil.j("Suggestion_IntelligencePlanFragment", "finish plan fail getActivity() == null");
                    return;
                }
                if (i == -404) {
                    IntelligencePlanFragment.this.d(activity, R.string.sug_haveno_network);
                } else if (i == -6) {
                    IntelligencePlanFragment.this.d(activity, R.string.IDS_hw_show_sync_cloud_history_data);
                } else {
                    if (i != 200025) {
                        return;
                    }
                    IntelligencePlanFragment.this.d(activity, R.string.IDS_stop_plan_fail_guide);
                }
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onSuccess(Object obj) {
                IntelligencePlanFragment.this.q.setVisibility(8);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, int i) {
        new NoTitleCustomAlertDialog.Builder(context).b(i).c(R.string.IDS_plugin_fitnessadvice_ok, new View.OnClickListener() { // from class: hsi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntelligencePlanFragment.b(view);
            }
        }).c().show();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        LogUtil.a("Suggestion_IntelligencePlanFragment", "onAttach");
        ak();
    }

    public void a(View view) {
        HealthSwipeRefreshLayout healthSwipeRefreshLayout = (HealthSwipeRefreshLayout) view.findViewById(R.id.swiperefreshlayout);
        this.g = healthSwipeRefreshLayout;
        healthSwipeRefreshLayout.setPadding(0, 0, 0, 0);
        ab();
    }

    private void ab() {
        this.g.setRefreshPushText(getContext().getResources().getString(R.string.IDS_app_update_updating));
        this.g.setCallback(new HwSwipeRefreshLayout.Callback() { // from class: com.huawei.health.suggestion.ui.plan.fragment.IntelligencePlanFragment.9
            @Override // com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout.Callback
            public boolean needToWait() {
                return true;
            }

            @Override // com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout.Callback
            public void onScrollUp() {
            }

            @Override // com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout.Callback
            public boolean isEnabled() {
                IntelligencePlanFragment intelligencePlanFragment = IntelligencePlanFragment.this;
                if (intelligencePlanFragment.c(intelligencePlanFragment.ab)) {
                    if (IntelligencePlanFragment.this.as != null && IntelligencePlanFragment.this.as.c()) {
                        return false;
                    }
                } else {
                    if (IntelligencePlanFragment.this.aq ? IntelligencePlanFragment.this.ag.canScrollVertically(-1) : IntelligencePlanFragment.this.ap.canScrollVertically(-1)) {
                        return false;
                    }
                }
                return !LoginInit.getInstance(IntelligencePlanFragment.this.f9690b).isBrowseMode();
            }

            @Override // com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout.Callback
            public void onRefreshStart() {
                LogUtil.a("Suggestion_IntelligencePlanFragment", "PullRefresh start");
                IntelligencePlanFragment.this.aq();
                boolean unused = IntelligencePlanFragment.e = true;
                IntelligencePlanFragment.this.d = false;
                IntelligencePlanFragment.this.c("pull refresh");
            }
        });
    }

    private void ag() {
        IntPlanDetailDataViewModel intPlanDetailDataViewModel = (IntPlanDetailDataViewModel) new ViewModelProvider(this).get(IntPlanDetailDataViewModel.class);
        this.ac = intPlanDetailDataViewModel;
        intPlanDetailDataViewModel.b(this.p);
        this.ac.d(this.af);
        this.ac.e(this.s);
        this.ai = new hub(this.ac, this);
        btq.e().c(this.ad, "PLAN_CREATE");
        btq.e().c(this.ak, "PLAN_UPDATE");
        btq.e().c(this.ae, "PLAN_DELETE");
        btq.e().c(this.aj, "PLAN_SWITCH");
        btq.e().c(this.v, "PLAN_ADJUST");
        btq.e().c(this.z, "PLAN_CLOCK");
        btq.e().c(this.ah, "PLAN_PRE_LOAD");
    }

    private void ad() {
        ArrayList<String> arrayList;
        if (btw.d(this.ab)) {
            arrayList = new ArrayList<>(Arrays.asList(btx.c().getString(R.string.sug_finish_plan), btx.c().getString(R.string.sug_push_course_to_watch)));
        } else if (btw.e(this.ab)) {
            arrayList = new ArrayList<>(Collections.singletonList(btx.c().getString(R.string.sug_finish_plan)));
        } else {
            arrayList = new ArrayList<>(Arrays.asList(btx.c().getString(R.string.sug_fitness_share), btx.c().getString(R.string.IDS_fitness_plan_see_detial_menu), btx.c().getString(R.string.IDS_fitness_plan_settings_menu), btx.c().getString(R.string.sug_finish_plan)));
        }
        IntPlan intPlan = this.i;
        if (intPlan != null && intPlan.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN && !EnvironmentInfo.m() && !c(this.ab)) {
            arrayList.add(Math.min(arrayList.size(), 3), btx.c().getString(R.string.sug_push_course_to_watch));
        }
        this.mPopViewController.a(this);
        this.mPopViewController.b(arrayList);
        this.mPopViewController.e(true);
        LogUtil.a("Suggestion_IntelligencePlanFragment", "initMenuPopView() mPopViewController.isEnable: ", Boolean.valueOf(this.mPopViewController.d()));
    }

    public void c(final String str) {
        LogUtil.a("Suggestion_IntelligencePlanFragment", "getCurrentPlanOnMain  reason = ", str);
        j(str);
        if (isResumed() || "plan switch".equals(str)) {
            synchronized (this.av) {
                if (!this.ar) {
                    this.ar = true;
                    HandlerExecutor.b(new Runnable() { // from class: htg
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.e.b(str);
                        }
                    });
                    this.l = false;
                } else {
                    LogUtil.a("Suggestion_IntelligencePlanFragment", "isRefreshing.");
                }
            }
        } else {
            LogUtil.a("Suggestion_IntelligencePlanFragment", "no resume.");
            this.l = true;
        }
        LogUtil.a("Suggestion_IntelligencePlanFragment", "getCurrentPlanOnMain  reason = ", str, " end.");
    }

    private void j(String str) {
        if ("pull refresh".equals(str) && Utils.o()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: hti
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.a();
                }
            });
        }
    }

    public /* synthetic */ void a() {
        if (iuo.d("RECOMMEND_DIET_TIME_MILLIS") && iuo.d("DIET_ANALYSIS_TIME_MILLIS")) {
            return;
        }
        ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "refresh diet setting");
        String accountInfo = LoginInit.getInstance(this.f9690b).getAccountInfo(1010);
        if (TextUtils.isEmpty(accountInfo)) {
            ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "code is empty");
        } else {
            nlq.b(new nlr(accountInfo), new ResponseCallback<Boolean>() { // from class: com.huawei.health.suggestion.ui.plan.fragment.IntelligencePlanFragment.7
                @Override // com.huawei.hwbasemgr.ResponseCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onResponse(int i, Boolean bool) {
                    ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "refresh diet setting success:", bool);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(String str) {
        synchronized (this.av) {
            this.ar = false;
        }
        ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "getCurrentPlan begin.", str);
        if (!c(this.ab) && !this.aq && this.q != null && !e && !qrh.f46695b) {
            this.q.setVisibility(0);
        }
        qrh.f46695b = false;
        if (LoginInit.getInstance(this.f9690b).isBrowseMode()) {
            LogUtil.a("Suggestion_IntelligencePlanFragment", "getCurrentPlan in browser mode, try show plan list.");
            this.i = null;
            aj();
            ap();
            this.ac.e();
            if (hvu.d()) {
                q();
            }
            this.ac.d(e);
            ac();
            return;
        }
        e(str);
    }

    private void e(final String str) {
        if (this.i == null && CommonUtil.ab(getContext())) {
            this.ac.d(e);
            this.aq = false;
        }
        final PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_IntelligencePlanFragment", "getCurrentIntPlan intPlanApi is null.");
            return;
        }
        this.f = null;
        this.ab = null;
        final AtomicInteger atomicInteger = new AtomicInteger(1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (btw.i()) {
            atomicInteger.getAndIncrement();
            ThreadPoolManager.c().execute(new Runnable() { // from class: hsv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37119b.d(planApi, atomicInteger, atomicBoolean, str);
                }
            });
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: hss
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c(planApi, atomicInteger, atomicBoolean, str);
            }
        });
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.plan.fragment.IntelligencePlanFragment$10, reason: invalid class name */
    public class AnonymousClass10 extends UiCallback<qey> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f9695b;
        final /* synthetic */ AtomicInteger d;
        final /* synthetic */ String e;

        AnonymousClass10(AtomicInteger atomicInteger, AtomicBoolean atomicBoolean, String str) {
            this.d = atomicInteger;
            this.f9695b = atomicBoolean;
            this.e = str;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(final int i, String str) {
            LogUtil.e("Suggestion_IntelligencePlanFragment", "getCurrentPlan errorCode:" + i + ",errorInfo:" + str);
            final AtomicInteger atomicInteger = this.d;
            final AtomicBoolean atomicBoolean = this.f9695b;
            final String str2 = this.e;
            HandlerExecutor.b(new Runnable() { // from class: htj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37131a.b(atomicInteger, atomicBoolean, str2, i);
                }
            });
        }

        public /* synthetic */ void b(AtomicInteger atomicInteger, AtomicBoolean atomicBoolean, String str, int i) {
            IntelligencePlanFragment.this.e(atomicInteger, atomicBoolean, str, i);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(qey qeyVar) {
            IntelligencePlanFragment.this.ab = qeyVar;
            final AtomicInteger atomicInteger = this.d;
            final AtomicBoolean atomicBoolean = this.f9695b;
            final String str = this.e;
            HandlerExecutor.b(new Runnable() { // from class: htm
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c(atomicInteger, atomicBoolean, str);
                }
            });
        }

        public /* synthetic */ void c(AtomicInteger atomicInteger, AtomicBoolean atomicBoolean, String str) {
            IntelligencePlanFragment.this.b(atomicInteger, atomicBoolean, str);
        }
    }

    public /* synthetic */ void d(PlanApi planApi, AtomicInteger atomicInteger, AtomicBoolean atomicBoolean, String str) {
        planApi.getCurrentPlan(new AnonymousClass10(atomicInteger, atomicBoolean, str));
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.plan.fragment.IntelligencePlanFragment$6, reason: invalid class name */
    public class AnonymousClass6 extends UiCallback<IntPlan> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9701a;
        final /* synthetic */ AtomicInteger d;
        final /* synthetic */ AtomicBoolean e;

        AnonymousClass6(AtomicInteger atomicInteger, AtomicBoolean atomicBoolean, String str) {
            this.d = atomicInteger;
            this.e = atomicBoolean;
            this.f9701a = str;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(final int i, String str) {
            LogUtil.e("Suggestion_IntelligencePlanFragment", "getCurrentIntPlan errorCode:", i + ",errorInfo:", str);
            final AtomicInteger atomicInteger = this.d;
            final AtomicBoolean atomicBoolean = this.e;
            final String str2 = this.f9701a;
            HandlerExecutor.b(new Runnable() { // from class: hto
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d(atomicInteger, atomicBoolean, str2, i);
                }
            });
        }

        public /* synthetic */ void d(AtomicInteger atomicInteger, AtomicBoolean atomicBoolean, String str, int i) {
            IntelligencePlanFragment.this.e(atomicInteger, atomicBoolean, str, i);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onSuccess(IntPlan intPlan) {
            IntelligencePlanFragment.this.f = intPlan;
            final AtomicInteger atomicInteger = this.d;
            final AtomicBoolean atomicBoolean = this.e;
            final String str = this.f9701a;
            HandlerExecutor.b(new Runnable() { // from class: htq
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b(atomicInteger, atomicBoolean, str);
                }
            });
        }

        public /* synthetic */ void b(AtomicInteger atomicInteger, AtomicBoolean atomicBoolean, String str) {
            IntelligencePlanFragment.this.b(atomicInteger, atomicBoolean, str);
        }
    }

    public /* synthetic */ void c(PlanApi planApi, AtomicInteger atomicInteger, AtomicBoolean atomicBoolean, String str) {
        planApi.e(new AnonymousClass6(atomicInteger, atomicBoolean, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(AtomicInteger atomicInteger, AtomicBoolean atomicBoolean, String str, int i) {
        if (atomicInteger.decrementAndGet() > 0) {
            LogUtil.j("Suggestion_IntelligencePlanFragment", "getPlanOnFailure atomicInteger not 0");
        } else if (atomicBoolean.get()) {
            a(str);
        } else {
            d(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AtomicInteger atomicInteger, AtomicBoolean atomicBoolean, String str) {
        atomicBoolean.set(true);
        if (atomicInteger.decrementAndGet() > 0) {
            LogUtil.j("Suggestion_IntelligencePlanFragment", "getPlanOnSuccess atomicInteger not 0");
        } else {
            a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aq() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi != null) {
            planApi.setNeedUpdateCurrentPlan();
        }
    }

    private void b(IntPlan intPlan) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (intPlan == null || planApi == null) {
            LogUtil.j("Suggestion_IntelligencePlanFragment", "donateFitnessFaCard, intPlan or intPlanApi is null");
            return;
        }
        int remindTime = planApi.getRemindTime();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, ped.d(remindTime));
        calendar.set(12, ped.c(remindTime));
        calendar.set(13, 0);
        calendar.set(14, 0);
        int iH = btw.h(intPlan);
        IntWeekPlan weekInfoByOrder = intPlan.getWeekInfoByOrder(iH);
        IntWeekPlan weekInfoByOrder2 = intPlan.getWeekInfoByOrder(iH + 1);
        if (weekInfoByOrder == null) {
            LogUtil.j("Suggestion_IntelligencePlanFragment", "donateFitnessFaCard, weekPlan is null");
            return;
        }
        int i = calendar.get(7);
        ArrayList arrayList = new ArrayList(7);
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = i + i2;
            calendar.set(7, i3);
            if (i3 > 7 && i3 % 7 == 2) {
                if (weekInfoByOrder2 == null) {
                    LogUtil.j("Suggestion_IntelligencePlanFragment", "donateFitnessFaCard, nextWeekPlan is null");
                    break;
                }
                weekInfoByOrder = weekInfoByOrder2;
            }
            IntDayPlan dayByOrder = weekInfoByOrder.getDayByOrder(ift.b(calendar.get(7)));
            if (dayByOrder == null) {
                LogUtil.j("Suggestion_IntelligencePlanFragment", "donateFitnessFaCard, dayPlan is null");
            } else if (dayByOrder.getInPlanActionCnt() <= 0) {
                LogUtil.j("Suggestion_IntelligencePlanFragment", "donateFitnessFaCard, planAction is null");
            } else {
                long timeInMillis = calendar.getTimeInMillis();
                if (System.currentTimeMillis() < timeInMillis) {
                    arrayList.addAll(hvp.b(timeInMillis));
                }
            }
        }
        if (njy.b(arrayList)) {
            hvp.d(1, arrayList);
        }
    }

    private void d(int i) {
        this.i = null;
        this.ap.setVisibility(8);
        b(this.ap);
        am();
        aj();
        this.aq = false;
        ap();
        if (i == -404) {
            this.y.setText(R.string.IDS_connect_error);
            s();
            aa();
        } else {
            this.y.setText(R.string.IDS_hw_health_music_load_fail_retry);
            s();
            aa();
        }
    }

    private void a(String str) {
        if (c(this.ab)) {
            d(this.ab);
            ad();
            ThreadPoolManager.c().execute(new Runnable() { // from class: hsr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37114c.d();
                }
            });
            s();
            this.ap.setVisibility(8);
            this.ag.setVisibility(8);
            this.u.setVisibility(8);
            this.x.setVisibility(8);
            return;
        }
        IntPlan intPlan = this.f;
        if (intPlan != null && IntPlan.PlanType.AI_FITNESS_PLAN.equals(intPlan.getPlanType()) && !btw.m(intPlan) && !hvu.r(this.i)) {
            PluginSuggestion.getInstance().startSendIntelligentPlan();
        }
        this.u.setVisibility(8);
        if (intPlan == null) {
            LogUtil.a("Suggestion_IntelligencePlanFragment", "getCurrentPlan no plan now");
            if (this.i != null) {
                this.i = null;
                this.ac.d(e);
            }
            ac();
        } else {
            LogUtil.a("Suggestion_IntelligencePlanFragment", "getCurrentPlan is ", intPlan.getPlanId());
            if (this.i != null && !TextUtils.isEmpty(intPlan.getPlanId()) && !intPlan.getPlanId().equals(this.i.getPlanId())) {
                this.ac.a();
            }
            this.i = intPlan;
            g(str);
            b(intPlan);
            d(this.i);
        }
        ap();
        s();
    }

    public /* synthetic */ void d() {
        a(this.ab);
    }

    private void a(qey qeyVar) {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_IntelligencePlanFragment", "checkSendSmartTrainPlan intPlanApi is null.");
            return;
        }
        if (btw.m(planApi.convertRunPlan(qeyVar))) {
            LogUtil.a("Suggestion_IntelligencePlanFragment", "checkSendSmartTrainPlan isHasDistributeCourse");
        } else if (btw.d(qeyVar) && ifz.h()) {
            LogUtil.a("Suggestion_IntelligencePlanFragment", "checkSendSmartTrainPlan isSupportSmartTrainPlan");
        } else {
            PluginSuggestion.getInstance().startSendIntelligentPlan();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(qey qeyVar) {
        return btw.d(qeyVar) || btw.e(qeyVar);
    }

    private void d(qey qeyVar) {
        SmartTrainPlanFragment smartTrainPlanFragment = this.as;
        if (smartTrainPlanFragment != null && smartTrainPlanFragment.isAdded()) {
            LogUtil.a("Suggestion_IntelligencePlanFragment", "addRunningPlanFragment fragment is add");
            this.as.a(qeyVar);
            return;
        }
        LogUtil.a("Suggestion_IntelligencePlanFragment", "addRunningPlanFragment");
        this.ao.setVisibility(0);
        SmartTrainPlanFragment smartTrainPlanFragmentB = SmartTrainPlanFragment.b();
        this.as = smartTrainPlanFragmentB;
        smartTrainPlanFragmentB.a(qeyVar);
        boolean zIsAdded = isAdded();
        boolean zIsRemoving = isRemoving();
        boolean zIsDetached = isDetached();
        ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "plan fragment isAdded:", Boolean.valueOf(zIsAdded), " isRemoving:", Boolean.valueOf(zIsRemoving), " isDetached:", Boolean.valueOf(zIsDetached));
        if (!zIsAdded || zIsRemoving || zIsDetached) {
            return;
        }
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.add(R.id.smart_train_plan_fragment, this.as);
        ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "addRunningPlanFragment index:", Integer.valueOf(fragmentTransactionBeginTransaction.commitAllowingStateLoss()));
    }

    private void ap() {
        LogUtil.a("Suggestion_IntelligencePlanFragment", "removeRunningPlanFragment");
        SmartTrainPlanFragment smartTrainPlanFragment = this.as;
        if (smartTrainPlanFragment != null && smartTrainPlanFragment.isAdded()) {
            FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
            fragmentTransactionBeginTransaction.remove(this.as);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        }
        this.as = null;
        this.ao.removeAllViews();
        this.ao.setVisibility(8);
    }

    private void s() {
        an();
        if (e) {
            this.g.a();
            e = false;
        }
    }

    private void aa() {
        this.u.setVisibility(0);
        this.u.setClickable(true);
        this.u.setOnClickListener(new View.OnClickListener() { // from class: htf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37129b.c(view);
            }
        });
    }

    public /* synthetic */ void c(View view) {
        if (qrs.r()) {
            return;
        }
        this.u.setVisibility(8);
        this.q.setVisibility(0);
        b("plan switch");
    }

    private void am() {
        if (this.aq) {
            return;
        }
        this.ac.b();
    }

    private void aj() {
        if (this.aq) {
            this.ac.d();
            this.ac.a();
            this.d = false;
        }
        this.mPopViewController.e(false);
        LogUtil.a("Suggestion_IntelligencePlanFragment", "removePlanDetail() mPopViewController.isEnable: ", Boolean.valueOf(this.mPopViewController.d()));
    }

    private void ac() {
        String strE = buh.e("ai_plan_sync_name");
        ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "getCurrentPlan no plan now prePlan:", strE);
        if (strE != null && !strE.equals("")) {
            LogUtil.a("Suggestion_IntelligencePlanFragment", "handleShowPlanList There are invalid calendar events: ", strE);
            h(strE);
        }
        aj();
        this.ap.setVisibility(0);
        c(this.ap);
        this.ag.setVisibility(8);
        b(this.ag);
        this.aq = false;
    }

    private void g(String str) {
        am();
        this.aq = true;
        String strE = buh.e("ai_plan_sync_name");
        String planId = this.i.getMetaInfo().getPlanId();
        String strE2 = buh.e("ai_plan_sync");
        if (strE2 != null && !planId.equals(strE2)) {
            LogUtil.a("Suggestion_IntelligencePlanFragment", "handleShowPlanDetail There are invalid calendar events.");
            h(strE);
        }
        if (IntPlan.PlanType.AI_RUN_PLAN.equals(this.i.getPlanType())) {
            huq huqVar = new huq(getContext(), this.i);
            this.an = huqVar;
            huqVar.d();
        }
        ad();
        o(str);
        this.ap.setVisibility(8);
        b(this.ap);
        this.ag.setVisibility(0);
        c(this.ag);
    }

    private void h(String str) {
        if (hvl.d(getContext())) {
            f(str);
        } else {
            ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "No calendar permission for deleting events");
        }
    }

    private void f(String str) {
        hvl.e(getContext(), str, (IntPlan.PlanType) null);
        buh.c("ai_plan_sync_name");
        buh.c("ai_plan_sync");
    }

    private void an() {
        HandlerExecutor.b(new Runnable() { // from class: hso
            @Override // java.lang.Runnable
            public final void run() {
                this.f37112c.g();
            }
        });
    }

    public /* synthetic */ void g() {
        if (btw.l(this.i)) {
            HandlerExecutor.c(new Runnable() { // from class: htk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37134c.h();
                }
            }, 5000L);
            return;
        }
        View view = this.q;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public /* synthetic */ void h() {
        View view = this.q;
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "loadingGone delay gone");
        this.q.setVisibility(8);
    }

    private void o(String str) {
        an();
        this.ac.a(this.i);
        if (!hvu.c()) {
            if (getContext() == null) {
                LogUtil.j("Suggestion_IntelligencePlanFragment", "showPlanDetail context == null");
                return;
            }
            if (this.d && !this.ai.b(getContext())) {
                this.ac.d();
            }
            if (!this.d) {
                this.d = true;
                this.ai.e(getContext(), this.i);
                this.al = System.currentTimeMillis();
                LogUtil.a("Suggestion_IntelligencePlanFragment", "showPlanDetail update plan");
            }
            String strE = buh.e("ai_plan_sync");
            boolean z = !TextUtils.isEmpty(strE) && strE.equals(this.i.getPlanId());
            LogUtil.a("Suggestion_IntelligencePlanFragment", "showPlanDetail isSyncCalendar ", Boolean.valueOf(z), " markedPlanId ", strE);
            if (hvl.d(getContext()) && z && ("PLAN_ADJUST".equals(str) || ("plan update".equals(str) && btw.l(this.i)))) {
                ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "IntelligencePlanFragment has CalendarPermission");
                this.ai.a(this.i);
                this.ai.e(getContext());
                this.ai.c(getContext());
            }
        }
        au();
    }

    private void au() {
        if (!getUserVisibleHint()) {
            ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "not in plan tab.");
            this.n = true;
            return;
        }
        Context context = getContext();
        if (context == null || this.i == null) {
            LogUtil.e("Suggestion_IntelligencePlanFragment", "do not show dialog.", Boolean.valueOf(context == null), Boolean.valueOf(hvu.c()), Boolean.valueOf(this.i == null));
            return;
        }
        ae();
        if (huw.e().a()) {
            return;
        }
        if (hvu.c()) {
            LogUtil.e("Suggestion_IntelligencePlanFragment", "isInSyncDataProgress.");
        } else {
            b(context);
        }
    }

    private void ae() {
        if (btw.h() && this.i.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN)) {
            if (huw.e().a() || !huw.e().c()) {
                LogUtil.j("Suggestion_IntelligencePlanFragment", "loadGuideView:", Boolean.valueOf(huw.e().a()), " ", Boolean.valueOf(huw.e().c()));
                return;
            }
            huw.e().b(getContext(), new IBaseResponseCallback() { // from class: hsz
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.e.c(i, obj);
                }
            });
        }
    }

    public /* synthetic */ void c(int i, Object obj) {
        Context context = getContext();
        if (context == null || this.i == null) {
            ReleaseLogUtil.e("Suggestion_IntelligencePlanFragment", "loadGuideView ontext == null || mCurrentIntPlan == null");
        } else {
            LogUtil.a("Suggestion_IntelligencePlanFragment", "after showGuideView.showRemindDialog");
            b(context);
        }
    }

    private boolean e(Context context) {
        if (!hvu.u(this.i)) {
            return false;
        }
        ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "planOverdue fnish plan");
        if (hvu.q(this.i)) {
            a(context, R.string.IDS_sug_plan_finish);
            return true;
        }
        a(context, R.string.IDS_sug_plan_overdue);
        return true;
    }

    private void b(Context context) {
        if (btw.l(this.i)) {
            LogUtil.a("Suggestion_IntelligencePlanFragment", "showRemindDialog is h5 Plan");
            return;
        }
        if (e(context)) {
            return;
        }
        if (hvu.r(this.i)) {
            ReleaseLogUtil.e("Suggestion_IntelligencePlanFragment", "plan vip expired");
            return;
        }
        if (hvu.i(this.i) >= 3 && (this.i.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN) || this.i.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN))) {
            ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "three week absent fnish plan");
            a(getContext(), R.string.IDS_fitness_plan_abnormal);
        } else if (ah()) {
            ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "all exercise clockin fnish plan");
            a(context, R.string.IDS_sug_plan_finish);
        } else {
            this.ai.a(this.i);
            this.ai.c(getContext(), this.i);
        }
        this.n = false;
    }

    private boolean ah() {
        if (hvu.k(this.i)) {
            return (this.i.getPlanType().equals(IntPlan.PlanType.AI_FITNESS_PLAN) && hvu.o(this.i)) || this.i.getPlanType().equals(IntPlan.PlanType.AI_RUN_PLAN);
        }
        return false;
    }

    private void a(Context context, int i) {
        if (buh.e("ai_plan_finish").equals(this.i.getPlanId())) {
            LogUtil.a("Suggestion_IntelligencePlanFragment", "just remind in first.");
            return;
        }
        iep.c(context, this.i, i, this.j);
        hwb.d(context.getString(i), this.i);
        buh.d("ai_plan_finish", this.i.getPlanId());
    }

    private void b(Context context, final IntPlan intPlan, final UiCallback uiCallback) {
        new NoTitleCustomAlertDialog.Builder(context).b(R.string.sug_request_finish_uncompleted_plan).c(R.string.IDS_plugin_fitnessadvice_ok, new View.OnClickListener() { // from class: hsj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37110c.e(intPlan, uiCallback, view);
            }
        }).a(R.string.IDS_plugin_fitnessadvice_cancal, new View.OnClickListener() { // from class: hsq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntelligencePlanFragment.d(view);
            }
        }).c().show();
    }

    public /* synthetic */ void e(IntPlan intPlan, UiCallback uiCallback, View view) {
        this.q.setVisibility(0);
        if (c(this.ab)) {
            o();
        } else {
            iep.b(intPlan, 1);
            iep.b(intPlan, true, uiCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: aw, reason: merged with bridge method [inline-methods] */
    public void o() {
        if (HandlerExecutor.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: htc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37126c.o();
                }
            });
            return;
        }
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_IntelligencePlanFragment", "stopSmartTrainPlan intPlanApi is null.");
        } else {
            planApi.stopSmartTrainPlan(this.ab.h(), new AnonymousClass8(planApi));
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.plan.fragment.IntelligencePlanFragment$8, reason: invalid class name */
    public class AnonymousClass8 extends UiCallback<String> {
        final /* synthetic */ PlanApi d;

        AnonymousClass8(PlanApi planApi) {
            this.d = planApi;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.a("Suggestion_IntelligencePlanFragment", "stopSmartTrainPlan onFailure:", Integer.valueOf(i), " errorInfo:", str);
            HandlerExecutor.b(new Runnable() { // from class: htp
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.c();
                }
            });
        }

        public /* synthetic */ void c() {
            IntelligencePlanFragment.this.q.setVisibility(8);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            LogUtil.a("Suggestion_IntelligencePlanFragment", "stopSmartTrainPlan onSuccess:", str);
            IntelligencePlanFragment intelligencePlanFragment = IntelligencePlanFragment.this;
            intelligencePlanFragment.c(this.d, intelligencePlanFragment.ab);
            HandlerExecutor.b(new Runnable() { // from class: htn
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b();
                }
            });
        }

        public /* synthetic */ void b() {
            IntelligencePlanFragment.this.q.setVisibility(8);
            IntelligencePlanFragment.this.c("plan update");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(PlanApi planApi, qey qeyVar) {
        int type;
        String strH = qeyVar.h();
        if (btw.d(qeyVar) && ifz.h()) {
            LogUtil.j("Suggestion_IntelligencePlanFragment", "start SmartTrainPlanSendService");
            ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "sendSmartTrainPlanSampleEvent result: " + PluginSuggestion.getInstance().sendSampleEvent(800200002L, "hw.unitedevice.trainplan", "hw.sport.trainplan.device", 1));
            return;
        }
        if (btw.d(qeyVar)) {
            type = IntPlan.PlanType.AI_RUN_PLAN.getType();
        } else if (btw.e(qeyVar)) {
            type = IntPlan.PlanType.AI_FITNESS_PLAN.getType();
        } else {
            LogUtil.j("Suggestion_IntelligencePlanFragment", "stopSmartPlanToDevice invalid plan");
            return;
        }
        planApi.setNeedFinishPlanType(type);
        planApi.setNeedSendFinishPlan(strH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(ibk ibkVar) {
        if (ibkVar == null) {
            LogUtil.j("Suggestion_IntelligencePlanFragment", "notifyUpdateItemData itemData is null");
            return;
        }
        int iB = ibkVar.b();
        if (iB == 7) {
            if (qrs.af(this.f9690b)) {
                this.am.d(ibkVar);
                return;
            }
            return;
        }
        Context context = getContext();
        LogUtil.a("Suggestion_IntelligencePlanFragment", "notifyUpdateItemData viewType ", Integer.valueOf(iB), " context ", context);
        if (iB == 6 && context != null) {
            if (c(this.ab)) {
                LogUtil.a("Suggestion_IntelligencePlanFragment", "notifyUpdateItemData showSmartTrainPlan");
                return;
            }
            OverseaAiDialogViewHolder overseaAiDialogViewHolder = new OverseaAiDialogViewHolder(LayoutInflater.from(context).inflate(R.layout.plan_oversea_dialog, (ViewGroup) null, false));
            overseaAiDialogViewHolder.d(ibkVar.c());
            this.x.addView(overseaAiDialogViewHolder.itemView);
            this.x.setVisibility(0);
            this.ap.smoothScrollToPosition(0);
            return;
        }
        if ((ibkVar.a() == 0 && iB == 5) || iB == 3 || iB == 9) {
            this.am.d(ibkVar);
            return;
        }
        IntPlanDetailAdapter intPlanDetailAdapter = this.aa;
        if (intPlanDetailAdapter != null) {
            intPlanDetailAdapter.d(ibkVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ibk ibkVar) {
        if (ibkVar == null) {
            LogUtil.j("Suggestion_IntelligencePlanFragment", "notifyDeleteItemData itemData is null");
            return;
        }
        if (ibkVar.b() == 6) {
            this.x.removeAllViews();
            this.x.setVisibility(8);
        } else {
            if ((ibkVar.a() == 0 && ibkVar.b() == 5) || ibkVar.b() == 3) {
                this.am.e(ibkVar);
                return;
            }
            IntPlanDetailAdapter intPlanDetailAdapter = this.aa;
            if (intPlanDetailAdapter != null) {
                intPlanDetailAdapter.e(ibkVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        if (LoginInit.getInstance(this.f9690b).isBrowseMode()) {
            s();
        }
        if (z) {
            s();
            if (LoginInit.getInstance(this.f9690b).isBrowseMode()) {
                this.u.setVisibility(0);
                this.u.setClickable(true);
                this.y.setText(R.string.IDS_hwh_login_hwid_account);
                this.u.setOnClickListener(new View.OnClickListener() { // from class: hsn
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.e.e(view);
                    }
                });
                return;
            }
            this.y.setText(R.string.IDS_hw_health_music_load_fail_retry);
            this.u.setVisibility(0);
        }
    }

    public /* synthetic */ void e(View view) {
        if (qrs.r()) {
            return;
        }
        LoginInit.getInstance(this.f9690b).browsingToLogin(new IBaseResponseCallback() { // from class: hst
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                LogUtil.a("Suggestion_IntelligencePlanFragment", "browsingToLogin result = ", Integer.valueOf(i));
            }
        }, "");
    }

    public void t() {
        LogUtil.a("Suggestion_IntelligencePlanFragment", "requestPermissionsForInsert");
        FragmentActivity activity = getActivity();
        PermissionUtil.d(activity, PermissionUtil.PermissionType.CALENDAR, new c(activity, this));
    }

    private boolean ai() {
        String strE = SharedPreferenceManager.e(getContext(), Integer.toString(20002), "map_tracking_sport_type");
        if (TextUtils.isEmpty(strE)) {
            return false;
        }
        int iJ = CommonUtil.j(strE);
        LogUtil.a("Suggestion_IntelligencePlanFragment", "sportType:", Integer.valueOf(iJ));
        return iJ == 2;
    }

    private void i(String str) {
        IntPlanDetailAdapter intPlanDetailAdapter = this.aa;
        if (intPlanDetailAdapter == null || !this.t) {
            LogUtil.j("Suggestion_IntelligencePlanFragment", "refreshH5AiPlan mPlanDetailAdapter ", intPlanDetailAdapter, " mIsVisibleToUser ", Boolean.valueOf(this.t));
            return;
        }
        ObserverManagerUtil.e("HEALTH_FLOAT_BAR_STATE_CHANGE", 8);
        if (!btw.l(this.i)) {
            LogUtil.a("Suggestion_IntelligencePlanFragment", "refreshH5AiPlan not h5 plan return");
        } else {
            this.aa.b(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: al, reason: merged with bridge method [inline-methods] */
    public void k() {
        IntPlanDetailAdapter intPlanDetailAdapter = this.aa;
        if (intPlanDetailAdapter == null || !this.t) {
            LogUtil.j("Suggestion_IntelligencePlanFragment", "planPreLoadRefresh mPlanDetailAdapter ", intPlanDetailAdapter, " mIsVisibleToUser ", Boolean.valueOf(this.t));
        } else {
            if (this.i == null || !IntPlan.PlanType.AI_RUN_PLAN.equals(this.i.getPlanType())) {
                return;
            }
            LogUtil.a("Suggestion_IntelligencePlanFragment", "planPreLoadRefresh");
            this.aa.c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.k = true;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.m != UnitUtil.f()) {
            LogUtil.a("Suggestion_IntelligencePlanFragment", "switch unit:", Boolean.valueOf(this.m), Boolean.valueOf(UnitUtil.f()));
            this.m = UnitUtil.f();
            this.l = true;
        }
        if (this.t || !this.o || ai()) {
            af();
        }
        LogUtil.a("Suggestion_IntelligencePlanFragment", "onResume getUserVisibleHint = ", Boolean.valueOf(this.t), " mFirstTimeVisible = ", Boolean.valueOf(this.o));
        ObserverManagerUtil.e("PLAN_ON_RESUME", new Object[0]);
        i(BaseDialog.LIFE_CYCLE_ON_RESUME);
        if (this.f9689a == null) {
            Observer observer = new Observer() { // from class: com.huawei.health.suggestion.ui.plan.fragment.IntelligencePlanFragment.11
                @Override // com.huawei.haf.design.pattern.Observer
                public void notify(String str, Object... objArr) {
                    if (ObserveLabels.CALENDAR_VIEW_INITIALIZED.equals(str)) {
                        ObserverManagerUtil.e(ObserveLabels.CALENDAR_ACCESSIBILITY_CONTENT, null, null, qre.f(R.string.accessibility_plan_day), null);
                    }
                }
            };
            this.f9689a = observer;
            ObserverManagerUtil.d(observer, ObserveLabels.CALENDAR_VIEW_INITIALIZED);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        LogUtil.a("Suggestion_IntelligencePlanFragment", "setUserVisibleHint = ", Boolean.valueOf(z), " mIsLayoutInit = ", Boolean.valueOf(this.k), " mFirstTimeVisible = ", Boolean.valueOf(this.o));
        super.setUserVisibleHint(z);
        this.t = z;
        if (this.k && z && this.o) {
            this.o = false;
            af();
        }
        hqr hqrVar = this.h;
        if (hqrVar != null) {
            hqrVar.e(z);
        }
        if (z && this.n) {
            au();
        }
        i("setUserVisibleHint");
        if (!z || this.h == null) {
            return;
        }
        c(this.i);
        idy.d(this.i, this.h.d());
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        ObserverManagerUtil.c(this.f9689a);
        LogUtil.a("Suggestion_IntelligencePlanFragment", "onPause getUserVisibleHint = ", Boolean.valueOf(getUserVisibleHint()));
    }

    private void af() {
        if (c(this.ab) || !this.aq || !lsl.g(System.currentTimeMillis(), this.al)) {
            LogUtil.a("Suggestion_IntelligencePlanFragment", "mPlanUpdateTime:", Long.valueOf(this.al), " mIsNeedUpdate:", Boolean.valueOf(this.l), " mCheckDetail:", Boolean.valueOf(this.d));
            this.l = true;
            this.d = false;
        }
        if (this.l) {
            if (!this.o) {
                aq();
            }
            c("loadData");
        }
        if (this.i != null) {
            r();
        }
        this.o = false;
    }

    private void r() {
        int i = (this.i.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN || this.i.getPlanType() == IntPlan.PlanType.FIT_PLAN) ? 2 : 4;
        if (this.i.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN) {
            i = 5;
        }
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            LogUtil.j("Suggestion_IntelligencePlanFragment", "payApi is null in resourceAuth.");
        } else {
            LogUtil.a("Suggestion_IntelligencePlanFragment", "resType:", Integer.valueOf(i), "PlanTempId:", this.i.getPlanTempId());
            payApi.resourceAuth(i, this.i.getPlanTempId(), new a());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        LogUtil.a("Suggestion_IntelligencePlanFragment", "onDestroyView.");
        IntPlanDetailDataViewModel intPlanDetailDataViewModel = this.ac;
        if (intPlanDetailDataViewModel != null) {
            intPlanDetailDataViewModel.c(this.p);
            this.ac.h(this.af);
            this.ac.a(this.s);
        }
        btq.e().d(this.ad, "PLAN_CREATE");
        btq.e().d(this.aj, "PLAN_SWITCH");
        btq.e().d(this.ak, "PLAN_UPDATE");
        btq.e().d(this.ae, "PLAN_DELETE");
        btq.e().d(this.v, "PLAN_ADJUST");
        btq.e().d(this.z, "PLAN_CLOCK");
        btq.e().d(this.ah, "PLAN_PRE_LOAD");
        ap();
        BroadcastManagerUtil.b(getContext(), this.at);
        this.aq = false;
        this.ar = false;
        this.l = false;
        this.o = true;
        ObserverManagerUtil.c(this.w);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
    public void setOnClick(int i) {
        LogUtil.a("Suggestion_IntelligencePlanFragment", "mPopViewController click ", Integer.valueOf(i));
        if (getContext() == null) {
            LogUtil.j("Suggestion_IntelligencePlanFragment", "Click PopView when context null", Integer.valueOf(i));
            return;
        }
        if (this.i == null && this.ab == null) {
            LogUtil.j("Suggestion_IntelligencePlanFragment", "Click PopView when plan null");
            return;
        }
        if (i == 0) {
            if (c(this.ab)) {
                b(getContext(), this.i, this.j);
                return;
            } else {
                as();
                return;
            }
        }
        if (i == 1) {
            if (c(this.ab)) {
                w();
                return;
            } else {
                v();
                return;
            }
        }
        if (i == 2) {
            if (hvu.r(this.i)) {
                JumpUtil.d(this.i);
                return;
            } else {
                startActivity(new Intent(getContext(), (Class<?>) PlanSettingsActivity.class));
                return;
            }
        }
        if (i != 3) {
            if (i == 4) {
                b(getContext(), this.i, this.j);
                return;
            } else {
                LogUtil.e("Suggestion_IntelligencePlanFragment", "Click plan pop view out of index ", Integer.valueOf(i));
                return;
            }
        }
        IntPlan intPlan = this.i;
        if (intPlan != null && intPlan.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN && !EnvironmentInfo.m()) {
            this.an.a();
        } else {
            b(getContext(), this.i, this.j);
        }
    }

    private void w() {
        if (btw.d(this.ab)) {
            u();
        } else if (btw.e(this.ab)) {
            x();
        } else {
            LogUtil.j("Suggestion_IntelligencePlanFragment", "handlePushSmartPlanToWatch invalid plan");
        }
    }

    private void u() {
        if (!btw.d(false)) {
            ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "functionAuth is false");
            qpx.e(this.f9690b, R.string.IDS_plan_sync_fail);
        } else if (!btw.b(this.ab.i(), lsl.a(this.ab.m()))) {
            ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "plan not start");
            qpx.e(this.f9690b, R.string.IDS_plan_not_enable_cur_week_sync_error);
        } else if (ifz.h()) {
            PluginSuggestion.getInstance().sendSampleEvent(800200002L, "hw.unitedevice.trainplan", "hw.sport.trainplan.device", 0);
        } else {
            p();
        }
    }

    private void x() {
        if (!irz.i()) {
            ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "handlePushSmartWeightPlanToWatch is not vip");
        } else {
            p();
        }
    }

    private void p() {
        PlanApi planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        if (planApi == null) {
            LogUtil.j("Suggestion_IntelligencePlanFragment", "convertIntPlanSendToDevice intPlanApi is null.");
            return;
        }
        IntPlan intPlanConvertRunPlan = planApi.convertRunPlan(this.ab);
        LogUtil.a("Suggestion_IntelligencePlanFragment", "convert intPlan is ", intPlanConvertRunPlan);
        huq huqVar = new huq(getContext(), intPlanConvertRunPlan);
        this.an = huqVar;
        huqVar.a();
    }

    private void v() {
        if (hvu.r(this.i)) {
            JumpUtil.d(this.i);
            return;
        }
        HashMap map = new HashMap(3);
        map.put("click", 1);
        map.put("type", Integer.valueOf(this.i.getPlanType().getType()));
        map.put("plan_name", this.i.getMetaInfo().getName());
        lmf.d().c(getContext(), AnalyticsValue.INT_PLAN_2030079.value(), map, 0);
        if (this.i.getIntroduction() != null && this.i.getPlanType().equals(IntPlan.PlanType.FIT_PLAN)) {
            JumpUtil.b(getContext(), "", IntPlan.PlanType.FIT_PLAN.getType());
        } else {
            JumpUtil.d(getContext());
        }
    }

    private void as() {
        if (this.q != null && getContext() != null) {
            this.q.setVisibility(0);
            this.q.setBackground(ContextCompat.getDrawable(getContext(), R.color.transparent));
        }
        hux huxVar = new hux(this.i, getContext());
        huxVar.b(new AnonymousClass2(huxVar));
        HashMap map = new HashMap(2);
        map.put("click", 1);
        map.put("plan_name", this.i.getMetaInfo().getName());
        lmf.d().c(getContext(), AnalyticsValue.INT_PLAN_2040213.value(), map, 0);
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.plan.fragment.IntelligencePlanFragment$2, reason: invalid class name */
    public class AnonymousClass2 extends UiCallback<HashMap<String, String>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ hux f9697c;

        AnonymousClass2(hux huxVar) {
            this.f9697c = huxVar;
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.e("Suggestion_IntelligencePlanFragment", "share plan fail.");
            IntelligencePlanFragment.this.z();
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final HashMap<String, String> map) {
            IntelligencePlanFragment.this.z();
            if (map != null && !map.isEmpty()) {
                Handler handler = IntelligencePlanFragment.this.r;
                final hux huxVar = this.f9697c;
                handler.post(new Runnable() { // from class: htl
                    @Override // java.lang.Runnable
                    public final void run() {
                        huxVar.a((HashMap<String, String>) map);
                    }
                });
                return;
            }
            LogUtil.e("Suggestion_IntelligencePlanFragment", "share plan data empty.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        HandlerExecutor.b(new Runnable() { // from class: hsp
            @Override // java.lang.Runnable
            public final void run() {
                this.f37113a.b();
            }
        });
    }

    public /* synthetic */ void b() {
        if (this.q == null || getContext() == null) {
            return;
        }
        this.q.setVisibility(8);
        this.q.setBackground(qre.c(R.color.colorSubBackground));
    }

    private void c(HealthRecycleView healthRecycleView) {
        if (healthRecycleView == null) {
            return;
        }
        healthRecycleView.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.health.suggestion.ui.plan.fragment.IntelligencePlanFragment.4
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                ObserverManagerUtil.e("PLAN_FRAGMENT_SCROLL", IntelligencePlanFragment.this.f9691c, IntelligencePlanFragment.this.g, recyclerView, Integer.valueOf(i2));
            }
        });
    }

    private void b(HealthRecycleView healthRecycleView) {
        if (healthRecycleView == null) {
            return;
        }
        healthRecycleView.setOnScrollChangeListener(null);
    }

    class d extends BroadcastReceiver {
        d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("Suggestion_IntelligencePlanFragment", "SyncCloudDataReceiver onReceive intent is null or context is null");
                return;
            }
            String stringExtra = intent.getStringExtra("sync_cloud_data_status");
            double doubleExtra = intent.getDoubleExtra("sync_cloud_data_process", 0.0d);
            LogUtil.a("Suggestion_IntelligencePlanFragment", "SyncCloudDataReceiver onReceive to enter, action = ", intent.getAction(), " status:", stringExtra, " process:", Double.valueOf(doubleExtra));
            if ("start_sync_cloud_data".equals(stringExtra) || "ongoing_sync_cloud_data".equals(stringExtra)) {
                if (IntelligencePlanFragment.this.ax != null) {
                    IntelligencePlanFragment.this.ax.setVisibility(0);
                }
                if (IntelligencePlanFragment.this.aw != null) {
                    IntelligencePlanFragment.this.aw.setText(UnitUtil.e(doubleExtra, 2, 0));
                }
                buh.d("sync_cloud_data_status", Long.toString(System.currentTimeMillis()));
                return;
            }
            if ("sync_cloud_data_finish".equals(stringExtra) || "sync_cloud_data_fail".equals(stringExtra) || "sync_cloud_data_setting_flag".equals(stringExtra)) {
                if (IntelligencePlanFragment.this.ax != null) {
                    IntelligencePlanFragment.this.ax.setVisibility(8);
                }
                buh.c("sync_cloud_data_status");
                IntelligencePlanFragment.this.aq();
                IntelligencePlanFragment.this.c("sync cloud finish");
                return;
            }
            LogUtil.a("Suggestion_IntelligencePlanFragment", "SyncCloudDataReceiver onReceive is other status:", stringExtra);
        }
    }

    private void ak() {
        buh.c("sync_cloud_data_status");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("sync_cloud_data_action");
        this.at = new d();
        BroadcastManagerUtil.e(getContext(), this.at, intentFilter);
    }

    private void d(IntPlan intPlan) {
        String strE = SharedPreferenceManager.e(getContext(), Integer.toString(20002), "map_tracking_sport_type");
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        if (CommonUtil.j(strE) == 2) {
            c(intPlan);
        }
        idy.d(this.i, this.h.d());
    }

    private void c(final IntPlan intPlan) {
        if (intPlan == null || intPlan.getMetaInfo() == null) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: hsw
            @Override // java.lang.Runnable
            public final void run() {
                IntelligencePlanFragment.e(intPlan);
            }
        });
    }

    public static /* synthetic */ void e(IntPlan intPlan) {
        btw.e(intPlan, "6", TextUtils.isEmpty(hbz.c().a()) ? 2 : 0, 1, 1);
        HashMap map = new HashMap(5);
        map.put("click", 1);
        map.put("type", 4);
        map.put("planName", intPlan.getMetaInfo().getName());
        if (btw.r(intPlan)) {
            map.put("planType", 0);
        } else {
            map.put("planType", 1);
        }
        map.put("enter", "4");
        idy.b(AnalyticsValue.HEALTH_HOME_TRAINING_PROGRAM_PIC_2010036.value(), map);
    }

    static class a implements IBaseResponseCallback {
        private WeakReference<IntelligencePlanFragment> d;

        private a(IntelligencePlanFragment intelligencePlanFragment) {
            this.d = new WeakReference<>(intelligencePlanFragment);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (i != 0) {
                LogUtil.j("Suggestion_IntelligencePlanFragment", "resourceAuth errorCode: ", Integer.valueOf(i), "objData: error ", obj);
                return;
            }
            if (!(obj instanceof Integer)) {
                LogUtil.j("Suggestion_IntelligencePlanFragment", "objData: error ", obj);
                return;
            }
            WeakReference<IntelligencePlanFragment> weakReference = this.d;
            if (weakReference == null) {
                LogUtil.e("Suggestion_IntelligencePlanFragment", "mWeakReference == null");
                return;
            }
            IntelligencePlanFragment intelligencePlanFragment = weakReference.get();
            if (intelligencePlanFragment == null) {
                LogUtil.e("Suggestion_IntelligencePlanFragment", "activity == null");
            }
            int iIntValue = ((Integer) obj).intValue();
            if (intelligencePlanFragment.i != null) {
                if (intelligencePlanFragment.i.getTransactionStatus() != iIntValue) {
                    intelligencePlanFragment.aq();
                    intelligencePlanFragment.c("getTransactionStatus() != authResult");
                    return;
                }
                return;
            }
            LogUtil.j("Suggestion_IntelligencePlanFragment", "resourceAuth mCurrentIntPlan is null");
        }
    }

    public static class c extends CustomPermissionAction {
        private final WeakReference<IntelligencePlanFragment> e;

        private c(Activity activity, IntelligencePlanFragment intelligencePlanFragment) {
            super(activity);
            this.e = new WeakReference<>(intelligencePlanFragment);
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            IntelligencePlanFragment intelligencePlanFragment = this.e.get();
            ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "InnerCustomPermissionAction onGranted fragment ", intelligencePlanFragment);
            if (intelligencePlanFragment == null) {
                return;
            }
            intelligencePlanFragment.ai.c(intelligencePlanFragment.getContext());
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            super.onDenied(str);
            ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "InnerCustomPermissionAction onDenied");
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            super.onForeverDenied(permissionType, new View.OnClickListener() { // from class: htu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ReleaseLogUtil.e("Suggestion_IntelligencePlanFragment", "InnerCustomPermissionAction onForeverDenied positiveListener");
                }
            }, new View.OnClickListener() { // from class: hts
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ReleaseLogUtil.e("Suggestion_IntelligencePlanFragment", "InnerCustomPermissionAction onForeverDenied negativeListener");
                }
            });
            ReleaseLogUtil.d("Suggestion_IntelligencePlanFragment", "InnerCustomPermissionAction onForeverDenied");
        }
    }
}
