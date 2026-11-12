package com.huawei.health.suggestion.ui.plan.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.gson.Gson;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.RecordData;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.service.H5ProServiceManager;
import com.huawei.health.marketing.views.IViewVisibilityChange;
import com.huawei.health.plan.model.intplan.ReplacePlanBean;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.activity.SportAllCourseActivity;
import com.huawei.health.suggestion.ui.plan.adapter.AiDietRecordAdapter;
import com.huawei.health.suggestion.ui.plan.adapter.CourseAdapter;
import com.huawei.health.suggestion.ui.plan.adapter.CourseRecordAdapter;
import com.huawei.health.suggestion.ui.plan.adapter.RecommendFoodPagerAdapter;
import com.huawei.health.suggestion.ui.plan.fragment.AiFatReductionPlanFragment;
import com.huawei.health.suggestion.ui.plan.util.RecommendFoodTransformer;
import com.huawei.health.suggestion.ui.plan.util.WeekPlanAdjustHelper;
import com.huawei.health.suggestion.ui.plan.viewholder.AiPlanWeekDetailViewHolder;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.health.weight.WeightApi;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.data.type.HiSubscribeType;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.ui.commonui.adapter.BaseRecyclerAdapter;
import com.huawei.ui.commonui.adapter.RecyclerHolder;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.calendarview.HealthCalendarView;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.utils.ScrollUtil;
import com.huawei.ui.commonui.viewpager.HealthNativeViewPager;
import com.huawei.ui.commonui.viewpager.pagetransformer.OverlayLayerPageTransformer;
import com.huawei.ui.main.stories.health.weight.callback.WeightCallback;
import defpackage.btw;
import defpackage.ddv;
import defpackage.ddx;
import defpackage.dex;
import defpackage.dnj;
import defpackage.ezh;
import defpackage.gzl;
import defpackage.hcu;
import defpackage.hdc;
import defpackage.hjg;
import defpackage.hqr;
import defpackage.huw;
import defpackage.hvl;
import defpackage.hvq;
import defpackage.hvu;
import defpackage.hvv;
import defpackage.hwg;
import defpackage.ibn;
import defpackage.idy;
import defpackage.iei;
import defpackage.iep;
import defpackage.ift;
import defpackage.iuo;
import defpackage.lmf;
import defpackage.lsl;
import defpackage.njy;
import defpackage.nkf;
import defpackage.peh;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsr;
import defpackage.vfv;
import defpackage.vgo;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public class AiFatReductionPlanFragment extends BaseFragment implements CourseAdapter.OnItemClickListener, ViewPager.OnPageChangeListener, IViewVisibilityChange {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthImageView f9661a;
    private int aa;
    private View ac;
    private HealthButton ad;
    private HealthTextView ae;
    private HealthNativeViewPager af;
    private HealthTextView ag;
    private RecommendFoodPagerAdapter ah;
    private AiDietRecordAdapter ai;
    private HealthCalendarView aj;
    private hqr am;
    private WeakReference<AiPlanWeekDetailViewHolder> an;
    private IntAction ao;
    private HealthTextView ap;
    private IntPlan aq;
    private HealthProgressBar as;
    private boolean at;
    private boolean au;
    private boolean ax;
    private boolean ay;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f9662b;
    private boolean ba;
    private boolean bb;
    private boolean bc;
    private SparseLongArray bd;
    private int bf;
    private String bg;
    private Guideline bi;
    private HealthTextView bj;
    private HealthTextView bk;
    private String bl;
    private HealthTextView bm;
    private HealthRecycleView bn;
    private HealthImageView bq;
    private HealthTextView br;
    private HealthTextView bs;
    private HealthTextView bt;
    private HealthTextView bu;
    private HealthImageView bv;
    private NoTitleCustomAlertDialog bw;
    private int bx;
    private int by;
    private HealthTextView bz;
    private float cb;
    private WeekPlanAdjustHelper cc;
    private int cd;
    private int d;
    private CustomAlertDialog e;
    private CourseAdapter f;
    private CourseRecordAdapter g;
    private CourseAdapter i;
    private int j;
    private HealthTextView k;
    private LinearLayout l;
    private HealthTextView m;
    private HealthImageView n;
    private HealthButton o;
    private HealthTextView q;
    private LinearLayout s;
    private ConstraintLayout t;
    private HealthTextView v;
    private HealthButton w;
    private LinearLayout x;
    private HealthTextView y;
    private LinearLayout z;
    private final Resources bp = BaseApplication.b().getResources();
    private final a al = new a(this);
    private final Map<String, FitWorkout> ak = new ConcurrentHashMap();
    private final List<RecordData> bo = new CopyOnWriteArrayList();
    private final SparseBooleanArray aw = new SparseBooleanArray();
    private final Context h = BaseApplication.b();
    private final AtomicBoolean av = new AtomicBoolean(true);
    private List<Integer> ca = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f9663c = new CopyOnWriteArrayList();
    private List<IntAction> r = new CopyOnWriteArrayList();
    private List<IntAction> p = new CopyOnWriteArrayList();
    private double bh = 65.0d;
    private double az = 20.0d;
    private int u = -1;
    private int ar = 0;
    private int ab = -1;
    private final Observer be = new Observer() { // from class: hrj
        @Override // com.huawei.haf.design.pattern.Observer
        public final void notify(String str, Object[] objArr) {
            this.f37083c.b(str, objArr);
        }
    };

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    public /* synthetic */ void b(String str, Object[] objArr) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "EXIT_APP":
                b2 = 0;
                break;
            case "PLAN_ON_RESUME":
                b2 = 1;
                break;
            case "SPORT_ENTRANCE_IS_VISIBLE_TO_USER":
                b2 = 2;
                break;
            case "WATCH_PLAN_REPORT_DIALOG":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            f();
            return;
        }
        if (b2 == 1) {
            r();
            return;
        }
        if (b2 != 2) {
            if (b2 == 3) {
                HealthImageView healthImageView = this.bq;
                if (healthImageView != null) {
                    healthImageView.setVisibility(8);
                    return;
                }
                return;
            }
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "mObserver label ", str, " objects ", objArr);
            return;
        }
        if (objArr != null && objArr.length > 0) {
            Object obj = objArr[0];
            if (obj instanceof Boolean) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                this.ba = zBooleanValue;
                if (zBooleanValue) {
                    u();
                    q();
                    b();
                    ab();
                    r();
                    d(this.u);
                    return;
                }
                t();
                return;
            }
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "mObserver object ", obj);
            return;
        }
        ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "mObserver objects ", objArr);
    }

    public AiFatReductionPlanFragment() {
    }

    public AiFatReductionPlanFragment(hqr hqrVar) {
        this.am = hqrVar;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.b("Suggestion_AiFatReductionPlanFragment", "onCreate");
        this.ba = Boolean.parseBoolean(SharedPreferenceManager.e(this.h, Integer.toString(20002), "EXIT_APP_AT_SPORT_TAB"));
        hqr hqrVar = this.am;
        if (hqrVar != null) {
            this.bb = hqrVar.d();
            this.am.b(this);
        }
        ObserverManagerUtil.d(this.be, "EXIT_APP");
        ObserverManagerUtil.d(this.be, "PLAN_ON_RESUME");
        ObserverManagerUtil.d(this.be, "SPORT_ENTRANCE_IS_VISIBLE_TO_USER");
        ObserverManagerUtil.d(this.be, "WATCH_PLAN_REPORT_DIALOG");
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(100);
        arrayList.add(103);
        arrayList.add(23);
        HiHealthNativeApi.a(BaseApplication.b()).subscribeHiHealthData(arrayList, new c(this));
        this.cb = hjg.a();
        this.by = hjg.e();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.sug_layout_ai_fat_reduction_plan, viewGroup, false);
        LogUtil.b("Suggestion_AiFatReductionPlanFragment", "onCreateView");
        h(viewInflate);
        k(viewInflate);
        c(Collections.EMPTY_LIST);
        m(viewInflate);
        this.bk = (HealthTextView) viewInflate.findViewById(R.id.plan_tip);
        s();
        return viewInflate;
    }

    private void e(View view, int i, BaseRecyclerAdapter baseRecyclerAdapter) {
        HealthRecycleView healthRecycleView = (HealthRecycleView) view.findViewById(i);
        healthRecycleView.setLayoutManager(new HealthLinearLayoutManager(this.h));
        healthRecycleView.setIsConsumption(true);
        healthRecycleView.setIsScroll(false);
        healthRecycleView.setAdapter(baseRecyclerAdapter);
    }

    private void h(View view) {
        this.t = (ConstraintLayout) view.findViewById(R.id.course_layout);
        CourseAdapter courseAdapter = new CourseAdapter(true);
        this.i = courseAdapter;
        courseAdapter.a(this);
        e(view, R.id.course_recycler_in_plan, this.i);
        this.x = (LinearLayout) view.findViewById(R.id.course_status_layout);
        this.bv = (HealthImageView) view.findViewById(R.id.course_card_status_image);
        this.bs = (HealthTextView) view.findViewById(R.id.course_card_status_text);
        this.v = (HealthTextView) view.findViewById(R.id.course_recycler_out_plan_title);
        CourseAdapter courseAdapter2 = new CourseAdapter(false);
        this.f = courseAdapter2;
        courseAdapter2.a(this);
        e(view, R.id.course_recycler_out_plan, this.f);
        this.g = new CourseRecordAdapter();
        e(view, R.id.course_recycler_out_plan_record, this.g);
        this.s = (LinearLayout) view.findViewById(R.id.course_fold_layout);
        this.q = (HealthTextView) view.findViewById(R.id.course_fold_text);
        this.n = (HealthImageView) view.findViewById(R.id.course_fold_image);
        this.l = (LinearLayout) view.findViewById(R.id.course_event_layout);
        this.k = (HealthTextView) view.findViewById(R.id.course_event_text);
        this.o = (HealthButton) view.findViewById(R.id.course_event_button);
        this.y = (HealthTextView) view.findViewById(R.id.course_tip);
        this.m = (HealthTextView) view.findViewById(R.id.course_add_button);
    }

    private void k(View view) {
        this.ae = (HealthTextView) view.findViewById(R.id.diet_recipe_recommendations_title);
        this.ac = view.findViewById(R.id.diet_customized_recipe_layout);
        this.w = (HealthButton) view.findViewById(R.id.diet_customized_recipe_button);
        HealthNativeViewPager healthNativeViewPager = (HealthNativeViewPager) view.findViewById(R.id.diet_recipe_recommendations_pager);
        this.af = healthNativeViewPager;
        healthNativeViewPager.setPageTransformer(true, new RecommendFoodTransformer(new OverlayLayerPageTransformer.d(3).b(0.85f).c(85).e(150).a(150), 3));
        this.af.setOffscreenPageLimit(3);
        this.af.addOnPageChangeListener(this);
        this.ah = new RecommendFoodPagerAdapter();
        this.z = (LinearLayout) view.findViewById(R.id.diet_analysis);
        this.ad = (HealthButton) view.findViewById(R.id.diet_analysis_button);
        this.ai = new AiDietRecordAdapter();
        HealthRecycleView healthRecycleView = (HealthRecycleView) view.findViewById(R.id.diet_record_recycler);
        this.bn = healthRecycleView;
        healthRecycleView.setLayoutManager(new HealthLinearLayoutManager(this.h));
        this.bn.setIsConsumption(true);
        this.bn.setIsScroll(false);
        this.bn.setAdapter(this.ai);
    }

    private void m(View view) {
        i(view);
    }

    private void ac() {
        c(iuo.j());
        nkf.a().a(new ResponseCallback() { // from class: hqq
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.e.a(i, (Float) obj);
            }
        });
    }

    public /* synthetic */ void a(int i, Float f) {
        LogUtil.b("Suggestion_AiFatReductionPlanFragment", "setupTargetWeight errorCode ", Integer.valueOf(i), " floatData ", f);
        c(f == null ? 0.0f : f.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void c(final float f) {
        String strE;
        if (!HandlerExecutor.d()) {
            HandlerExecutor.b(new Runnable() { // from class: hrb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37078b.c(f);
                }
            });
            return;
        }
        boolean zF = UnitUtil.f();
        if (f <= 0.0f) {
            strE = "--";
        } else if (zF) {
            strE = UnitUtil.e(UnitUtil.h(f), 1, 1);
        } else {
            strE = UnitUtil.e(f, 1, 1);
        }
        this.bu.setText(strE);
        this.bz.setText(qre.f(zF ? R.string.IDS_lbs : R.string.IDS_weight_array_unit));
    }

    private void ad() {
        e(iuo.h());
        ThreadPoolManager.c().execute(new Runnable() { // from class: hqs
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c();
            }
        });
    }

    public /* synthetic */ void c() {
        e(g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void e(final float f) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.b(new Runnable() { // from class: hrm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37085c.e(f);
                }
            });
            return;
        }
        if (f <= 0.0f) {
            this.br.setText(R.string.sug_string_default);
            ReleaseLogUtil.b("Suggestion_AiFatReductionPlanFragment", "cannot get start weight");
        } else if (UnitUtil.f()) {
            this.bt.setText(R.string.IDS_lbs);
            this.br.setText(UnitUtil.e(UnitUtil.h(f), 1, 1));
        } else {
            this.bt.setText(R.string.IDS_weight_array_unit);
            this.br.setText(UnitUtil.e(f, 1, 1));
        }
    }

    private void i(View view) {
        BitmapDrawable bitmapDrawableE;
        this.ag = (HealthTextView) view.findViewById(R.id.fat_rate_value);
        this.bu = (HealthTextView) view.findViewById(R.id.target_weight_value);
        this.bz = (HealthTextView) view.findViewById(R.id.target_weight_unit);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.target_weight_layout);
        this.br = (HealthTextView) view.findViewById(R.id.start_weight_value);
        this.bt = (HealthTextView) view.findViewById(R.id.start_weight_unit);
        this.as = (HealthProgressBar) view.findViewById(R.id.sug_current_plan_progress_item_horizontal);
        this.ap = (HealthTextView) view.findViewById(R.id.int_plan_progress_text);
        this.bi = (Guideline) view.findViewById(R.id.progress_guide_line);
        this.bj = (HealthTextView) view.findViewById(R.id.plan_completed_days_and_rate);
        HealthImageView healthImageView = (HealthImageView) view.findViewById(R.id.ai_fitness_plan_edit_btn);
        this.f9661a = healthImageView;
        healthImageView.setOnClickListener(new View.OnClickListener() { // from class: hrn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f37086b.d(view2);
            }
        });
        if (LanguageUtil.ba(this.h) && (bitmapDrawableE = qqz.e(this.h, qre.c(R.drawable.edit_ai_fitness_plan_icon))) != null) {
            this.f9661a.setImageDrawable(bitmapDrawableE);
        }
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: hrs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.e(view2);
            }
        });
        this.bm = (HealthTextView) view.findViewById(R.id.plan_report_btn);
        this.bq = (HealthImageView) view.findViewById(R.id.report_dot);
    }

    public /* synthetic */ void d(View view) {
        z();
    }

    public /* synthetic */ void e(View view) {
        HashMap map = new HashMap(1);
        map.put("click", 1);
        lmf.d().c(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), AnalyticsValue.INT_PLAN_1120033.value(), map, 0);
        JumpUtil.e(this.f9662b, "8");
    }

    private float g() {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.b()).getUserPreference("custom.start_weight_base");
        float f = userPreference == null ? 0.0f : CommonUtil.f(userPreference.getValue());
        iuo.d(f);
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        HiAggregateOption hiAggregateOptionJ = j();
        if (hiAggregateOptionJ == null) {
            ReleaseLogUtil.b("R_Suggestion_AiFatReductionPlanFragment", "aggregateOption is null");
        } else {
            j(iuo.b());
            HiHealthManager.d(getContext()).aggregateHiHealthData(hiAggregateOptionJ, new d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(final float f) {
        HandlerExecutor.b(new Runnable() { // from class: hrv
            @Override // java.lang.Runnable
            public final void run() {
                this.f37093b.d(f);
            }
        });
    }

    public /* synthetic */ void d(float f) {
        if (f > 0.0f) {
            this.ag.setText(a(f));
        } else {
            this.ag.setText(R.string.sug_string_default);
        }
    }

    static class d implements HiAggregateListener {
        private final WeakReference<AiFatReductionPlanFragment> e;

        private d(AiFatReductionPlanFragment aiFatReductionPlanFragment) {
            this.e = new WeakReference<>(aiFatReductionPlanFragment);
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResult(List<HiHealthData> list, int i, int i2) {
            float f;
            if (!njy.b(list)) {
                f = 0.0f;
                break;
            }
            Iterator<HiHealthData> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    f = 0.0f;
                    break;
                }
                f = (float) it.next().getDouble(BleConstants.BODY_FAT_RATE);
                if (ezh.g(f)) {
                    iuo.c(f);
                    break;
                }
            }
            AiFatReductionPlanFragment aiFatReductionPlanFragment = this.e.get();
            if (aiFatReductionPlanFragment != null) {
                aiFatReductionPlanFragment.j(f);
            } else {
                LogUtil.e("Suggestion_AiFatReductionPlanFragment", "aiFatReductionPlanFragment is null");
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiAggregateListener
        public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            LogUtil.e("Suggestion_AiFatReductionPlanFragment", "errorCode intentType", Integer.valueOf(i2));
        }
    }

    private SpannableString a(double d2) {
        String strE = UnitUtil.e(d2, 1, 1);
        SpannableString spannableString = new SpannableString(UnitUtil.e(d2, 2, 1));
        if (strE.length() <= spannableString.length()) {
            spannableString.setSpan(new TextAppearanceSpan(this.h, R.style.weight_body_index_value_text_style), 0, strE.length(), 33);
            spannableString.setSpan(new TextAppearanceSpan(this.h, R.style.weight_body_index_unit_text_style), strE.length(), spannableString.length(), 33);
        }
        return spannableString;
    }

    private static String a(dnj dnjVar) {
        if (dnjVar == null) {
            return "NULL";
        }
        String strI = dnjVar.i();
        String strI2 = MultiUsersManager.INSTANCE.getMainUser().i();
        return (TextUtils.isEmpty(strI) || TextUtils.isEmpty(strI2) || TextUtils.equals(strI, strI2)) ? "NULL" : strI;
    }

    private HiAggregateOption j() {
        IntPlan intPlan = this.aq;
        if (intPlan == null || intPlan.getPlanTimeInfo() == null) {
            ReleaseLogUtil.b("R_Suggestion_AiFatReductionPlanFragment", "int plan or time info is null, return");
            return null;
        }
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(DateFormatUtil.d(btw.f(this.aq)), System.currentTimeMillis());
        hiAggregateOption.setType(new int[]{10006});
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setConstantsKey(new String[]{BleConstants.BODY_FAT_RATE});
        hiAggregateOption.setFilter(a(MultiUsersManager.INSTANCE.getMainUser()));
        hiAggregateOption.setConstantsKey(new String[]{BleConstants.WEIGHT_KEY});
        LogUtil.b("Suggestion_AiFatReductionPlanFragment", "aggregateOption = ", hiAggregateOption.toString());
        return hiAggregateOption;
    }

    private void x() {
        IntPlan intPlan = this.aq;
        if (intPlan == null) {
            LogUtil.e("Suggestion_AiFatReductionPlanFragment", "int plan is null");
            return;
        }
        iep.a(intPlan, this.bm, this.bq);
        ac();
        ad();
        y();
        aa();
        w();
        this.f9661a.setVisibility(this.bc ? 0 : 8);
    }

    private void aa() {
        IntPlan intPlan = this.aq;
        if (intPlan == null || intPlan.getStat("progress") == null) {
            ReleaseLogUtil.d("Suggestion_AiFatReductionPlanFragment", "setupProgressBar mIntPlan == null || mIntPlan.getStat(StatInfo.STAT_TYPE_PROGRESS) == null");
            return;
        }
        float fFloatValue = ((Float) this.aq.getStat("progress").getValue()).floatValue();
        if (fFloatValue > 0.0f && fFloatValue <= 6.0f) {
            this.as.setProgress(6);
            this.ap.setVisibility(8);
            return;
        }
        this.as.setProgress(Math.round(fFloatValue));
        this.ap.setVisibility(0);
        this.ap.setText(UnitUtil.e(fFloatValue, 2, 0));
        if (qrs.y() || qrs.a(3.1f)) {
            LogUtil.b("Suggestion_AiFatReductionPlanFragment", "adjust font size");
            this.ap.setTextSize(1, 12.0f);
        }
        ViewGroup.LayoutParams layoutParams = this.bi.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).guidePercent = fFloatValue / 100.0f;
            this.bi.setLayoutParams(layoutParams);
        }
    }

    private void y() {
        long jCurrentTimeMillis;
        HealthCalendarView healthCalendarView = this.aj;
        if (healthCalendarView != null && healthCalendarView.getSelectedCalendar() != null) {
            jCurrentTimeMillis = this.aj.getSelectedCalendar().transformCalendar().getTimeInMillis();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.bj.setText(iep.a(jCurrentTimeMillis, this.aq));
    }

    private void c(List<List<hdc>> list) {
        int i;
        ReleaseLogUtil.c("R_Suggestion_AiFatReductionPlanFragment", "initCustomizedRecipe list ", list, " mCustomizedRecipeButton ", this.w, " mCustomizedRecipeLayout ", this.ac, " mDietTitle ", this.ae);
        HealthButton healthButton = this.w;
        if (healthButton != null) {
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: hsc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f37102b.f(view);
                }
            });
        }
        boolean zB = njy.b(list);
        View view = this.ac;
        if (view != null) {
            view.setVisibility(zB ? 8 : 0);
        }
        HealthTextView healthTextView = this.ae;
        if (healthTextView != null) {
            if (zB) {
                i = R.string.IDS_recipe_recommend;
            } else {
                i = R.string.IDS_customized_recipe;
            }
            healthTextView.setText(qre.f(i));
        }
    }

    public /* synthetic */ void f(View view) {
        ReleaseLogUtil.c("R_Suggestion_AiFatReductionPlanFragment", "initCustomizedRecipe onClick");
        ddv.b().loadH5ProApp(this.f9662b, qsr.c().i() ? "com.huawei.health.h5.intelligent-recipe-customization" : "com.huawei.health.h5.custom-recipe", new H5ProLaunchOption.Builder());
    }

    public void e(List<List<hdc>> list, vgo vgoVar, long j) {
        ReleaseLogUtil.c("R_Suggestion_AiFatReductionPlanFragment", "setDietData list ", list);
        c(list);
        if (njy.e(list)) {
            return;
        }
        b(list, vgoVar, j);
        a(vgoVar, j);
        d(list, vgoVar, j);
        u();
    }

    private void b(List<List<hdc>> list, vgo vgoVar, long j) {
        HealthNativeViewPager healthNativeViewPager = this.af;
        if (healthNativeViewPager == null || this.ah == null) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "initDietPager mDietViewPager ", healthNativeViewPager, " mDietPagerAdapter ", this.ah);
            return;
        }
        if (!btw.c()) {
            HealthTextView healthTextView = this.ae;
            if (healthTextView != null) {
                healthTextView.setText(qre.f(R.string.IDS_health_model_diet));
                return;
            }
            return;
        }
        RecommendFoodPagerAdapter recommendFoodPagerAdapter = this.ah;
        IntPlan intPlan = this.aq;
        WeakReference<AiPlanWeekDetailViewHolder> weakReference = this.an;
        recommendFoodPagerAdapter.e(list, vgoVar, intPlan, weakReference == null ? null : weakReference.get(), j);
        this.af.setAdapter(this.ah);
        if (njy.b(list)) {
            this.ar = (this.ah.getCount() / list.size()) + hvq.c(list, vgoVar, j);
            HealthNativeViewPager healthNativeViewPager2 = this.af;
            if (healthNativeViewPager2 != null) {
                healthNativeViewPager2.setVisibility(0);
            }
        }
        LogUtil.b("Suggestion_AiFatReductionPlanFragment", "initDietPager:", Integer.valueOf(this.ar), " mCurrentPosition：", Integer.valueOf(this.u));
        int i = this.u;
        if (i >= 0 && i < this.ah.getCount()) {
            this.af.setCurrentItem(this.u);
        } else {
            this.af.setCurrentItem(this.ar);
        }
    }

    private void a(vgo vgoVar, final long j) {
        if (this.z == null) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "initDietAnalysis mDietAnalysis is null");
            return;
        }
        if (!hvq.d(vgoVar, j) || !btw.b()) {
            this.z.setVisibility(8);
            return;
        }
        this.z.setVisibility(0);
        HealthButton healthButton = this.ad;
        if (healthButton == null) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "initDietAnalysis mDietAnalysisButton is null");
        } else {
            healthButton.setOnClickListener(new View.OnClickListener() { // from class: hrq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f37089b.a(j, view);
                }
            });
        }
    }

    public /* synthetic */ void a(long j, View view) {
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi == null) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "initDietAnalysis api is null");
            return;
        }
        H5ProServiceManager.getInstance().registerService(weightApi.getDietDiaryRepositoryApi());
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addGlobalBiParam(WebViewHelp.BI_KEY_PULL_FROM, "weightControlPlan").addPath("#/DietAnalysis?date=" + (lsl.r(j) / 1000) + "&from=3");
        ddv.b().loadH5ProApp(this.f9662b, ddx.e, builder);
    }

    private void d(List<List<hdc>> list, vgo vgoVar, final long j) {
        AiDietRecordAdapter aiDietRecordAdapter = this.ai;
        if (aiDietRecordAdapter == null) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "initDietRecord mDietRecordAdapter is null");
        } else {
            aiDietRecordAdapter.e(list, vgoVar, j);
            this.ai.d(new AiDietRecordAdapter.OnItemClickListener() { // from class: hro
                @Override // com.huawei.health.suggestion.ui.plan.adapter.AiDietRecordAdapter.OnItemClickListener
                public final void onItemClick(int i) {
                    AiFatReductionPlanFragment.b(j, i);
                }
            });
        }
    }

    public static /* synthetic */ void b(long j, int i) {
        JumpUtil.e(lsl.r(j), i, 0);
        HandlerExecutor.c(new Runnable() { // from class: hqt
            @Override // java.lang.Runnable
            public final void run() {
                btq.e().e("PLAN_UPDATE");
            }
        }, 2000L);
    }

    private void t() {
        this.al.removeMessages(30);
        if (this.af != null && this.ar > 0 && l()) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "resetRecommendFood mInitPosition ", Integer.valueOf(this.ar), " mCurrentPosition ", Integer.valueOf(this.u));
            this.af.setCurrentItem(this.ar);
        }
        this.av.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        this.al.removeMessages(30);
        if (i <= -1) {
            return;
        }
        this.u = i;
        this.al.sendEmptyMessageDelayed(30, this.at ? 10000L : 4000L);
        this.at = false;
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        this.al.removeMessages(30);
        if (this.af != null && this.ba && this.bb && this.ay && !l()) {
            this.af.setCurrentItem(this.u + 1);
        }
    }

    private boolean l(View view) {
        HealthTextView healthTextView = this.ae;
        boolean zB = (healthTextView == null || healthTextView.getVisibility() != 0) ? false : ScrollUtil.b(view, this.ae);
        if (!zB) {
            return false;
        }
        HealthNativeViewPager healthNativeViewPager = this.af;
        if (healthNativeViewPager != null && healthNativeViewPager.getVisibility() == 0) {
            zB = ScrollUtil.b(view, this.af);
        }
        if (!zB) {
            return false;
        }
        LinearLayout linearLayout = this.z;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            return ScrollUtil.b(view, this.z);
        }
        HealthRecycleView healthRecycleView = this.bn;
        if (healthRecycleView == null || healthRecycleView.getVisibility() != 0) {
            return false;
        }
        return ScrollUtil.b(view, this.bn);
    }

    private boolean l() {
        RecommendFoodPagerAdapter recommendFoodPagerAdapter = this.ah;
        if (recommendFoodPagerAdapter == null || this.u < recommendFoodPagerAdapter.getCount() - 1) {
            return false;
        }
        int i = this.u;
        ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "isLastPosition mCurrentPosition ", Integer.valueOf(i), " mDietPagerAdapter ", this.ah);
        return true;
    }

    public void b(Context context, IntPlan intPlan, AiPlanWeekDetailViewHolder aiPlanWeekDetailViewHolder, List<Integer> list, HealthRecycleView healthRecycleView) {
        this.f9662b = context;
        this.aq = intPlan;
        this.f9663c = list;
        WeakReference<AiPlanWeekDetailViewHolder> weakReference = new WeakReference<>(aiPlanWeekDetailViewHolder);
        this.an = weakReference;
        AiPlanWeekDetailViewHolder aiPlanWeekDetailViewHolder2 = weakReference.get();
        if (aiPlanWeekDetailViewHolder2 != null) {
            this.aj = aiPlanWeekDetailViewHolder2.d();
        }
        if (getView() != null) {
            s();
        }
        if (healthRecycleView == null) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "setData recyclerView is null");
        } else {
            healthRecycleView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: hrc
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    this.f37079a.e(view, i, i2, i3, i4);
                }
            });
            healthRecycleView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.health.suggestion.ui.plan.fragment.AiFatReductionPlanFragment.5
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    super.onScrollStateChanged(recyclerView, i);
                    if (i == 0 && AiFatReductionPlanFragment.this.ay) {
                        AiFatReductionPlanFragment aiFatReductionPlanFragment = AiFatReductionPlanFragment.this;
                        aiFatReductionPlanFragment.d(aiFatReductionPlanFragment.u);
                    }
                }
            });
        }
    }

    public /* synthetic */ void e(View view, int i, int i2, int i3, int i4) {
        this.ay = l(view);
    }

    public void a() {
        this.an = null;
    }

    private void s() {
        WeakReference<AiPlanWeekDetailViewHolder> weakReference = this.an;
        AiPlanWeekDetailViewHolder aiPlanWeekDetailViewHolder = weakReference == null ? null : weakReference.get();
        if (aiPlanWeekDetailViewHolder == null || this.aq == null || njy.e(this.f9663c, 3)) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "setCourseData holder ", aiPlanWeekDetailViewHolder, " mIntPlan ", this.aq, " mCalenderList ", this.f9663c);
            return;
        }
        this.bx = DateFormatUtil.a(System.currentTimeMillis());
        this.cd = this.f9663c.get(1).intValue();
        int iIntValue = this.f9663c.get(3).intValue();
        this.aa = iIntValue;
        long jE = hvl.e(this.aq, this.cd, iIntValue);
        int iA = DateFormatUtil.a(jE);
        this.bc = iA == this.bx;
        this.ax = hvu.a(jE);
        if (!hvv.c(this.aq, this.cd, this.aa)) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "setCourseData mIntPlan ", this.aq, " mWeekNumber ", Integer.valueOf(this.cd), " mDayNumber ", Integer.valueOf(this.aa));
            return;
        }
        if (this.aw.indexOfKey(iA) < 0) {
            this.aw.append(iA, true);
        }
        this.ab = btw.c(this.aq.getDayInfo(this.cd, this.aa));
        int iH = h();
        m();
        b(iH);
        o();
        n();
        k();
        x();
        e(iH);
        q();
        hvv.e(this.aq, (ResponseCallback<Boolean>) new ResponseCallback() { // from class: hrr
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f37090c.a(i, (Boolean) obj);
            }
        });
    }

    public /* synthetic */ void a(int i, Boolean bool) {
        if (i != 0 || bool == null) {
            return;
        }
        this.au = bool.booleanValue();
        ab();
    }

    private void u() {
        LogUtil.c("Suggestion_AiFatReductionPlanFragment", "setEnterDietEvent mIsToday ", Boolean.valueOf(this.bc), " mIsVisibleSportEntrance:", Boolean.valueOf(this.ba), " mIsVisibleToUser:", Boolean.valueOf(this.bb), " mIsSupportLoopRecommendFood:", Boolean.valueOf(this.ay), " mIsEnterDietEvent:", Boolean.valueOf(this.av.get()));
        if (this.bc && this.ba && this.bb && this.ay && this.av.get()) {
            iei.c();
            this.av.set(false);
        }
    }

    private void q() {
        LogUtil.c("Suggestion_AiFatReductionPlanFragment", "setCourseEvent mIsToday ", Boolean.valueOf(this.bc), " mIsVisibleSportEntrance:", Boolean.valueOf(this.ba), " mIsVisibleToUser:", Boolean.valueOf(this.bb));
        if (this.bc && this.ba && this.bb) {
            iei.e(this.r, this.p, this.bo, this.ak);
        }
    }

    private void z() {
        CustomAlertDialog customAlertDialogD = hwg.d(this.f9662b, this.aq, new ResponseCallback() { // from class: hqv
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f37066c.b(i, obj);
            }
        });
        this.e = customAlertDialogD;
        if (customAlertDialogD == null || customAlertDialogD.isShowing()) {
            return;
        }
        this.e.show();
        iei.d(1, 0, 0);
    }

    public /* synthetic */ void b(int i, Object obj) {
        if (i == 0) {
            j(i);
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    b(obj);
                } else if (i == 4) {
                    if (this.cc == null) {
                        this.cc = new WeekPlanAdjustHelper(this.f9662b);
                    }
                    this.cc.a(this.aq);
                } else {
                    ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "showAdjustDialog clickType ", Integer.valueOf(i), " object ", obj);
                }
            } else if (obj == null) {
                qpx.e(this.h, R.string.IDS_leave_error_tip);
            } else if (hvu.l(this.aq)) {
                qpx.e(this.h, R.string.IDS_plan_adjust_clock_in_tip);
            } else if (hvu.f(this.aq)) {
                qpx.e(this.h, R.string.IDS_plan_course_training_tip);
            } else {
                b(0, 0);
            }
        } else if (obj == null) {
            qpx.e(this.h, R.string.IDS_plan_adjust_rest_tip);
            iei.d(1, 3, 0);
        } else if (hvu.l(this.aq)) {
            qpx.e(this.h, R.string.IDS_plan_adjust_clock_in_tip);
        } else if (hvu.f(this.aq)) {
            qpx.e(this.h, R.string.IDS_plan_course_training_tip);
        } else {
            iei.d(1, 1, 0);
            j(i);
        }
        CustomAlertDialog customAlertDialog = this.e;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
        }
    }

    private void j(int i) {
        if (!CommonUtil.ab(this.h)) {
            qpx.e(this.h, R.string.IDS_submit_error_message_1);
            return;
        }
        if (i == 0) {
            hvv.b(this.aq, DateFormatUtil.a(System.currentTimeMillis()), 0, new b(this, "TYPE_UPDATE_PLAN_CALENDAR_TRAIN"));
        } else if (i == 1) {
            hvv.b(this.aq, DateFormatUtil.a(System.currentTimeMillis()), 1, new b(this, "TYPE_UPDATE_PLAN_CALENDAR_REST"));
        } else {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "updatePlanCalendar clickType ", Integer.valueOf(i));
        }
    }

    private void b(int i, int i2) {
        final boolean z = i != 0;
        iei.d(z ? 2 : 1, 4, 0);
        hwg.b(this.f9662b, this.aq, i, i2, (ResponseCallback<Integer>) new ResponseCallback() { // from class: hrh
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i3, Object obj) {
                this.f37081a.a(z, i3, (Integer) obj);
            }
        });
    }

    public /* synthetic */ void a(boolean z, int i, Integer num) {
        if (!CommonUtil.ab(this.h)) {
            qpx.e(this.h, R.string.IDS_submit_error_message_1);
            return;
        }
        IntPlan intPlan = this.aq;
        if (intPlan != null && hvu.l(intPlan)) {
            qpx.e(this.h, R.string.IDS_plan_adjust_clock_in_tip);
            return;
        }
        IntPlan intPlan2 = this.aq;
        if (intPlan2 != null && hvu.f(intPlan2)) {
            qpx.e(this.h, R.string.IDS_plan_course_training_tip);
        } else {
            this.bf = num.intValue();
            hvv.a(this.aq, DateFormatUtil.a(System.currentTimeMillis()), this.bf, new b(this, z ? "TYPE_LEAVE_MENSTRUAL" : "TYPE_LEAVE"));
        }
    }

    private void b(Object obj) {
        iei.d(1, 6, 0);
        hwg.e(this.f9662b, obj, (ResponseCallback<Object>) new ResponseCallback() { // from class: hqx
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj2) {
                this.f37068b.e(i, obj2);
            }
        });
    }

    public /* synthetic */ void e(int i, Object obj) {
        if (!CommonUtil.ab(this.h)) {
            qpx.e(this.h, R.string.IDS_submit_error_message_1);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (obj instanceof Calendar) {
            this.j = lsl.a(jCurrentTimeMillis, ((Calendar) obj).getTimeInMillis());
        }
        hvv.c(this.aq, DateFormatUtil.a(jCurrentTimeMillis), (ResponseCallback<Object>) new b(this, "TYPE_CANCEL_LEAVE"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int h() {
        if (this.bc) {
            return 1;
        }
        return DateFormatUtil.a(hvl.e(this.aq, this.cd, this.aa)) < this.bx ? 0 : 3;
    }

    private void c(final int i, final CourseAdapter courseAdapter, final List<IntAction> list, final String str) {
        List<FitWorkout> arrayList = new ArrayList<>();
        if (this.bc) {
            if (dex.b(str + "time").equals(String.valueOf(this.bx))) {
                arrayList = peh.c(dex.b(str), FitWorkout[].class);
                if (njy.b(arrayList)) {
                    d(arrayList, courseAdapter, list, i);
                }
            }
        }
        final List<FitWorkout> list2 = arrayList;
        if (njy.e(list)) {
            courseAdapter.c(this.ak, list, this.ax, i, this.cb);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (IntAction intAction : list) {
            if (intAction != null) {
                String actionId = intAction.getActionId();
                if (!TextUtils.isEmpty(actionId)) {
                    arrayList2.add(new gzl.a(actionId).b(this.aq.getPlanId()).c());
                }
            }
        }
        if (njy.e(arrayList2)) {
            courseAdapter.c(this.ak, list, this.ax, i, this.cb);
            return;
        }
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "initCourse api is null");
            courseAdapter.c(this.ak, list, this.ax, i, this.cb);
        } else {
            courseApi.getCourseByIds(arrayList2, false, new UiCallback<List<FitWorkout>>() { // from class: com.huawei.health.suggestion.ui.plan.fragment.AiFatReductionPlanFragment.1
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i2, String str2) {
                    ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "initCourse errorCode ", Integer.valueOf(i2), " errorInfo ", str2);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<FitWorkout> list3) {
                    LogUtil.b("Suggestion_AiFatReductionPlanFragment", "onSuccess");
                    if (AiFatReductionPlanFragment.this.bc) {
                        if (njy.c(list2, list3, true)) {
                            LogUtil.e("Suggestion_AiFatReductionPlanFragment", "same data");
                            return;
                        }
                        String strC = peh.c(list3);
                        LogUtil.b("Suggestion_AiFatReductionPlanFragment", "set cache ", strC, " cache time is ", Integer.valueOf(AiFatReductionPlanFragment.this.bx));
                        dex.a(str + "time", String.valueOf(AiFatReductionPlanFragment.this.bx));
                        dex.a(str, strC);
                    }
                    if (!njy.e(list3)) {
                        AiFatReductionPlanFragment.this.d(list3, courseAdapter, list, i);
                    } else {
                        ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "initCourse list ", list3);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void d(final List<FitWorkout> list, final CourseAdapter courseAdapter, final List<IntAction> list2, final int i) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.b(new Runnable() { // from class: hra
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37076c.d(list, courseAdapter, list2, i);
                }
            });
            return;
        }
        LogUtil.b("Suggestion_AiFatReductionPlanFragment", "setWorkouts");
        for (FitWorkout fitWorkout : list) {
            if (fitWorkout != null) {
                this.ak.put(fitWorkout.acquireId(), fitWorkout);
            }
        }
        courseAdapter.c(this.ak, list2, this.ax, i, this.cb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (this.aq == null) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "initCourse mIntPlan is null");
            return;
        }
        LogUtil.b("Suggestion_AiFatReductionPlanFragment", "initCourse");
        List<IntAction> listA = hvv.a(this.aq, this.cd, this.aa);
        this.r = listA;
        c(i, this.i, listA, "inPlanCourse");
        List<IntAction> listE = hvv.e(this.aq, this.cd, this.aa);
        this.p = listE;
        c(i, this.f, listE, "outPlanCourse");
    }

    private void m() {
        int i = this.ab;
        if (i == 0) {
            this.x.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.x.setVisibility(0);
            this.bv.setImageResource(R.drawable.ic_plan_course_status_rest);
            this.bs.setText(R.string.IDS_course_status_rest);
        } else {
            if (i == 2) {
                this.x.setVisibility(0);
                this.bv.setImageResource(R.drawable.icon_status_leave_gray);
                this.bs.setText(R.string.IDS_course_status_leave);
                return;
            }
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "initCourseStatus mDayStatus ", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.aq == null) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "initCourseOutPlanRecordList mIntPlan is null");
        } else {
            this.d = njy.e(this.p) ? 0 : this.p.size();
            btw.a(this.aq, this.cd, this.aa, new IBaseResponseCallback() { // from class: hrf
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.e.a(i, obj);
                }
            });
        }
    }

    public /* synthetic */ void a(int i, Object obj) {
        List<String> listE = hvv.e(this.r);
        List<String> listE2 = hvv.e(this.p);
        this.bo.clear();
        ArrayList arrayList = new ArrayList();
        for (RecordData recordData : (List) obj) {
            if (recordData != null && recordData.getSportType() > 0 && recordData.getIsInPlan() != 1) {
                String workoutId = recordData.getWorkoutId();
                if (!listE.contains(workoutId) && !listE2.contains(workoutId)) {
                    this.bo.add(recordData);
                    arrayList.add(recordData);
                }
            }
        }
        LogUtil.b("Suggestion_AiFatReductionPlanFragment", "initCourseOutPlanRecordList recordDataList ", HiJsonUtil.d(arrayList), " courseIdInPlanList ", listE, " courseIdOutPlanList ", listE2);
        d((List<RecordData>) arrayList);
    }

    private void d(final List<RecordData> list) {
        HandlerExecutor.b(new Runnable() { // from class: hrt
            @Override // java.lang.Runnable
            public final void run() {
                this.f37092c.b(list);
            }
        });
    }

    public /* synthetic */ void b(final List list) {
        int size = njy.b(list) ? list.size() : 0;
        this.v.setVisibility((this.d > 0 || size > 0) ? 0 : 8);
        if (this.d + size > 3) {
            this.s.setVisibility(0);
            this.s.setOnClickListener(new View.OnClickListener() { // from class: hqw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f37067b.c(list, view);
                }
            });
            a((List<RecordData>) list);
        } else {
            this.f.e(size > 0);
            this.s.setVisibility(8);
            e((List<RecordData>) list);
        }
    }

    public /* synthetic */ void c(List list, View view) {
        int iA = DateFormatUtil.a(hvl.e(this.aq, this.cd, this.aa));
        SparseBooleanArray sparseBooleanArray = this.aw;
        sparseBooleanArray.append(iA, !sparseBooleanArray.get(iA));
        a((List<RecordData>) list);
    }

    private void e(List<RecordData> list) {
        this.g.a(list);
        this.g.setOnItemClickListener(new BaseRecyclerAdapter.OnItemClickListener() { // from class: hrd
            @Override // com.huawei.ui.commonui.adapter.BaseRecyclerAdapter.OnItemClickListener
            public final void onItemClicked(RecyclerHolder recyclerHolder, int i, Object obj) {
                this.f37080a.e(recyclerHolder, i, obj);
            }
        });
    }

    public /* synthetic */ void e(RecyclerHolder recyclerHolder, int i, Object obj) {
        if (!(obj instanceof RecordData)) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "initCourseOutPlanRecord object ", obj);
            return;
        }
        RecordData recordData = (RecordData) obj;
        if (recordData.getSportType() == 10001) {
            CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
            if (courseApi == null) {
                ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "initCourseOutPlanRecord api is null");
                AppRouter.c("/PluginFitnessAdvice/FitnessResultActivity").d(new Bundle()).b(this.f9662b);
                return;
            }
            WorkoutRecord workoutRecordAcquireWorkoutRecordByExerciseTime = courseApi.acquireWorkoutRecordByExerciseTime(LoginInit.getInstance(this.h).getAccountInfo(1011), recordData.getEndTime(), recordData.getWorkoutId());
            Bundle bundle = new Bundle();
            if (workoutRecordAcquireWorkoutRecordByExerciseTime != null) {
                bundle.putParcelable("workout_record", workoutRecordAcquireWorkoutRecordByExerciseTime);
            }
            ReleaseLogUtil.c("R_Suggestion_AiFatReductionPlanFragment", "initCourseOutPlanRecord workoutRecord ", workoutRecordAcquireWorkoutRecordByExerciseTime);
            AppRouter.c("/PluginFitnessAdvice/FitnessResultActivity").d(bundle).b(this.f9662b);
            return;
        }
        c(recordData);
    }

    private void a(List<RecordData> list) {
        Drawable drawable;
        boolean z = this.aw.get(DateFormatUtil.a(hvl.e(this.aq, this.cd, this.aa)));
        this.f.e(!z || this.d < 3);
        if (this.s.getVisibility() != 0) {
            return;
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            if (njy.b(list)) {
                int size = list.size() - 1;
                int i = this.d;
                for (int i2 = 0; i2 < 3 - i; i2++) {
                    if (i2 > size) {
                        ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "initCourseFold recordDataList index ", Integer.valueOf(i2), " lastIndex ", Integer.valueOf(size));
                        break;
                    }
                    arrayList.add(list.get(i2));
                }
            }
            e(arrayList);
            drawable = ContextCompat.getDrawable(this.h, R.drawable.fold_arrow_down);
            this.q.setText(R.string.IDS_hw_common_ui_xlistview_footer_hint_normal);
        } else {
            e(list);
            drawable = ContextCompat.getDrawable(this.h, R.drawable.fold_arrow_up);
            this.q.setText(R.string.IDS_device_health_retract);
        }
        if (drawable != null) {
            drawable = qqf.c(drawable, ContextCompat.getColor(this.h, R.color.common_black_20alpha));
        }
        this.n.setImageDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        int i = this.ab;
        if (i == 0) {
            i();
        } else if (i == 1 || i == 2) {
            a(20);
        } else {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "initCourseEvent mDayStatus ", Integer.valueOf(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (!this.bc || this.by != 1 || this.ab != 0) {
            this.l.setVisibility(8);
        } else {
            hvv.a(new b(this, "TYPE_MENSTRUAL"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Object obj) {
        if (!this.bc || !(obj instanceof SparseLongArray)) {
            this.l.setVisibility(8);
            return;
        }
        IntPlan intPlan = this.aq;
        if (intPlan != null && (hvu.l(intPlan) || hvu.f(this.aq))) {
            this.l.setVisibility(8);
            LogUtil.e("Suggestion_AiFatReductionPlanFragment", "refreshCourseEventMenstrual hasPunchedToday or hasPlanCourseRecordToday");
            return;
        }
        SparseLongArray sparseLongArray = (SparseLongArray) obj;
        this.bd = sparseLongArray;
        final int iB = hvv.b(sparseLongArray);
        final int iC = hvv.c(this.bd);
        ReleaseLogUtil.c("R_Suggestion_AiFatReductionPlanFragment", "refreshCourseEventMenstrual status ", Integer.valueOf(iB), " lastDate ", Integer.valueOf(iC), " mDayStatus ", Integer.valueOf(this.ab), " mUserGender ", Integer.valueOf(this.by), " mIsToday ", Boolean.valueOf(this.bc));
        if (iB == 0) {
            this.l.setVisibility(8);
        } else if (iB == 1) {
            this.l.setVisibility(0);
            this.k.setText(R.string.IDS_tip_menstrual);
        } else if (iB != 2) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "refreshCourseEventMenstrual mMenstrualArray ", this.bd);
        } else {
            this.l.setVisibility(0);
            this.k.setText(R.string.IDS_tip_menstrual_predict);
        }
        if (this.l.getVisibility() != 0) {
            return;
        }
        b();
        this.o.setVisibility(0);
        this.o.setText(R.string.IDS_ai_course_leave);
        this.o.setOnClickListener(new View.OnClickListener() { // from class: hqy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.a(iB, iC, view);
            }
        });
        if (this.m.getVisibility() == 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.t.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = this.bp.getDimensionPixelSize(R.dimen.cardMarginMiddle);
            this.t.setLayoutParams(layoutParams2);
        }
    }

    public /* synthetic */ void a(int i, int i2, View view) {
        b(i, i2);
    }

    private void b() {
        if (this.ba && this.bb && this.by == 1 && this.ab == 0 && !huw.e().c()) {
            NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.bw;
            if (noTitleCustomAlertDialog == null || !noTitleCustomAlertDialog.isShowing()) {
                IntPlan intPlan = this.aq;
                if (intPlan != null && hvu.l(intPlan)) {
                    LogUtil.e("Suggestion_AiFatReductionPlanFragment", "autoShowLeaveDialog hasPunchedToday");
                    return;
                }
                IntPlan intPlan2 = this.aq;
                if (intPlan2 != null && hvu.f(intPlan2)) {
                    LogUtil.e("Suggestion_AiFatReductionPlanFragment", "autoShowLeaveDialog hasPlanCourseRecordToday");
                    return;
                }
                int iB = hvv.b(this.bd);
                if (iB == 1 || iB == 2) {
                    int iC = hvv.c(this.bd);
                    if (hvv.c(iB, this.bd)) {
                        b(iB, iC);
                        hvv.c(DateFormatUtil.a(System.currentTimeMillis()));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        if (this.ba && this.bb && this.au && !huw.e().c()) {
            if (!HandlerExecutor.d()) {
                HandlerExecutor.b(new Runnable() { // from class: hre
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.ab();
                    }
                });
                return;
            }
            NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.f9662b);
            builder.b(R.string.sug_finish_plan_tip).c(R.string.sug_continue_plan_device, new View.OnClickListener() { // from class: hrg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ReleaseLogUtil.c("R_Suggestion_AiFatReductionPlanFragment", "showStopPlanDialog setPositiveButton view ", view);
                }
            }).e(R.string.sug_finish_plan, R.color.textColorSecondary, new View.OnClickListener() { // from class: hri
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f37082b.j(view);
                }
            });
            if (this.bw == null) {
                this.bw = builder.c();
            }
            NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.bw;
            if (noTitleCustomAlertDialog == null) {
                ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "showStopPlanDialog mStopPlanDialog is null");
            } else {
                if (noTitleCustomAlertDialog.isShowing()) {
                    return;
                }
                this.bw.show();
                hvv.c(this.aq);
                this.au = false;
            }
        }
    }

    public /* synthetic */ void j(View view) {
        IntPlan intPlan = this.aq;
        if (intPlan == null) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "showStopPlanDialog mIntPlan is null");
        } else {
            iep.b(intPlan, false, new UiCallback() { // from class: com.huawei.health.suggestion.ui.plan.fragment.AiFatReductionPlanFragment.4
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "showStopPlanDialog onFailure errorCode ", Integer.valueOf(i), " errorInfo ", str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onSuccess(Object obj) {
                    LogUtil.b("R_Suggestion_AiFatReductionPlanFragment", "showStopPlanDialog onSuccess object ", obj);
                }
            });
        }
    }

    private void r() {
        ReleaseLogUtil.c("R_Suggestion_AiFatReductionPlanFragment", "refreshPlan mIsVisibleSportEntrance ", Boolean.valueOf(this.ba), " mIsVisibleToUser ", Boolean.valueOf(this.bb));
        if (this.ba && this.bb) {
            WeakReference<AiPlanWeekDetailViewHolder> weakReference = this.an;
            if (weakReference == null) {
                ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "refreshPlan mHolderWeakReference is null");
                return;
            }
            AiPlanWeekDetailViewHolder aiPlanWeekDetailViewHolder = weakReference.get();
            if (aiPlanWeekDetailViewHolder == null) {
                ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "refreshPlan holder is null");
            } else if (hvv.a()) {
                aiPlanWeekDetailViewHolder.b(true, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        WeakReference<AiPlanWeekDetailViewHolder> weakReference = this.an;
        if (weakReference == null) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "refreshCustomizedRecipe mHolderWeakReference is null");
            return;
        }
        AiPlanWeekDetailViewHolder aiPlanWeekDetailViewHolder = weakReference.get();
        if (aiPlanWeekDetailViewHolder == null) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "refreshCustomizedRecipe holder is null");
        } else {
            ReleaseLogUtil.c("R_Suggestion_AiFatReductionPlanFragment", "refreshCustomizedRecipe initIntFitnessPlanView");
            aiPlanWeekDetailViewHolder.b(true, true);
        }
    }

    private void a(int i) {
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi == null) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "getWeightData api is null type ", Integer.valueOf(i));
            return;
        }
        long jE = hvl.e(this.aq, this.cd, this.aa);
        long jR = i != 20 ? 0L : lsl.r(jE);
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(jR, lsl.c(jE));
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setCount(1);
        weightApi.getWeightData(hiAggregateOption, new e(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj) {
        this.l.setVisibility(0);
        this.k.setText(this.ab == 2 ? R.string.IDS_tip_leave : R.string.IDS_tip_rest);
        if (!njy.b(obj, vfv.class)) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "refreshCourseEventWeight object ", obj);
            return;
        }
        this.o.setVisibility(8);
        ArrayList arrayList = (ArrayList) obj;
        if (njy.b(arrayList)) {
            vfv vfvVar = (vfv) arrayList.get(0);
            if (vfvVar == null) {
                ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "refreshCourseEventWeight bean is null");
                this.l.setVisibility(8);
                return;
            }
            int i = R.plurals.IDS_kg_string;
            double d2 = vfvVar.d();
            if (UnitUtil.f()) {
                i = R.plurals.IDS_lb_string;
                d2 = UnitUtil.h(d2);
            }
            this.k.setText(qre.a(R.string.IDS_your_weight, qre.e(i, UnitUtil.e(d2), UnitUtil.e(d2, 1, vfvVar.e()))));
            return;
        }
        if (this.bc) {
            a(21);
            this.o.setVisibility(0);
            this.o.setText(R.string.IDS_ai_course_record);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Object obj) {
        vfv vfvVar;
        if (njy.b(obj, vfv.class)) {
            ArrayList arrayList = (ArrayList) obj;
            if (njy.b(arrayList) && (vfvVar = (vfv) arrayList.get(0)) != null) {
                this.bh = vfvVar.d();
                this.az = vfvVar.c();
            }
        }
        this.o.setOnClickListener(new View.OnClickListener() { // from class: hru
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.g(view);
            }
        });
    }

    public /* synthetic */ void g(View view) {
        iep.a(this.f9662b, this.bh, this.az);
        this.al.postDelayed(new Runnable() { // from class: hrl
            @Override // java.lang.Runnable
            public final void run() {
                btq.e().e("PLAN_UPDATE");
            }
        }, 1000L);
    }

    private void k() {
        this.y.setVisibility(8);
        IntDayPlan dayInfo = this.aq.getDayInfo(this.cd, this.aa);
        if (dayInfo == null) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "initCourseTip intDayPlan is null");
        } else {
            if (dayInfo.getPunchFlag() != 1 || hvv.c(dayInfo)) {
                return;
            }
            this.y.setVisibility(0);
            this.y.setText(this.bp.getString(R.string.IDS_plugin_help_train_punch, DateFormatUtil.a(hvl.e(this.aq, this.cd, this.aa), DateFormatUtil.DateFormatType.DATE_FORMAT_MD)));
        }
    }

    public /* synthetic */ void b(View view) {
        c(11);
    }

    private void e(int i) {
        int i2;
        int i3 = 8;
        if (i == 0) {
            this.m.setVisibility(8);
            this.bk.setVisibility(8);
        } else if (i == 1 || i == 3) {
            HealthTextView healthTextView = this.m;
            if (this.ax && this.d < 3) {
                i3 = 0;
            }
            healthTextView.setVisibility(i3);
            this.m.setOnClickListener(new View.OnClickListener() { // from class: hrp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f37088a.b(view);
                }
            });
            this.bk.setVisibility(0);
            this.bk.setText(this.ax ? R.string.IDS_plugin_follow_plan : R.string.IDS_plugin_adjust_schedule);
        } else {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "addCourseOutPlan default status ", Integer.valueOf(i));
        }
        ViewGroup.LayoutParams layoutParams = this.t.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            Resources resources = this.bp;
            if (this.ab == 0 || this.m.getVisibility() == 0) {
                i2 = R.dimen.health_common_4dp;
            } else {
                i2 = R.dimen.cardMarginMiddle;
            }
            layoutParams2.bottomMargin = resources.getDimensionPixelSize(i2);
            this.t.setLayoutParams(layoutParams2);
        }
    }

    private void c(RecordData recordData) {
        String recordId = recordData.getRecordId();
        if (TextUtils.isEmpty(recordId)) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "jumpTrackDetail recordId ", recordId);
        } else {
            hcu.b().c(recordId);
        }
    }

    private void c(int i) {
        Intent intent = new Intent(this.h, (Class<?>) SportAllCourseActivity.class);
        if (i == 11) {
            intent.putExtra("KEY_SUG_COURSE_ADD_STATUS", true);
            iei.e(1, this.r);
        } else if (i == 20) {
            intent.putExtra("KEY_SUG_COURSE_REPLACE_STATUS", true);
            IntAction intAction = this.ao;
            if (intAction != null) {
                String actionId = intAction.getActionId();
                intent.putExtra("KEY_SUG_COURSE_REPLACE_ID", actionId);
                FitWorkout fitWorkout = this.ak.get(actionId);
                if (fitWorkout != null) {
                    this.bl = fitWorkout.acquireName();
                }
            }
            iei.e(2, this.r);
        } else {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "jumpAllCourse requestCode ", Integer.valueOf(i));
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (njy.b(this.p)) {
            for (IntAction intAction2 : this.p) {
                if (intAction2 != null) {
                    arrayList.add(intAction2.getActionId());
                }
            }
        }
        intent.putStringArrayListExtra("KEY_SUG_COURSE_ADD_IDS", arrayList);
        intent.putExtra("SKIP_ALL_COURSE_KEY", "FITNESS_COURSE");
        startActivityForResult(intent, i);
        iei.e(idy.b("FITNESS_COURSE"), 8);
    }

    private void c(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        if (this.aq == null || this.ao == null || njy.e(arrayList)) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "replaceCourse mIntPlan ", this.aq, " mIntAction ", this.ao, " courseIdList ", arrayList);
        } else {
            if (!CommonUtil.ab(this.h)) {
                qpx.e(this.h, R.string.IDS_submit_error_message_1);
                return;
            }
            if (njy.b(arrayList2)) {
                this.bg = arrayList2.get(0);
            }
            hvv.c(new ReplacePlanBean.Builder().planId(this.aq.getPlanId()).planType(1).weekNo(this.cd).dayNo(this.aa).propensityWorkoutId(arrayList.get(0)).replacedWorkoutId(this.ao.getActionId()).build(), new b(this, "TYPE_REPLACE"));
        }
    }

    private void b(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        if (njy.e(arrayList)) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "addCourse courseIdList ", arrayList);
            return;
        }
        if (this.d + arrayList.size() > 3) {
            qpx.e(this.h, R.string.IDS_plan_add_course_tip);
            return;
        }
        if (this.f9663c.size() <= 3) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "addCourse mCalenderList ", this.f9663c);
            return;
        }
        int size = arrayList.size();
        ArrayList arrayList3 = new ArrayList();
        final HashMap map = new HashMap();
        for (int i = 0; i < size; i++) {
            arrayList3.add(hvv.b(arrayList.get(i)));
            String str = "";
            String str2 = njy.c(arrayList2, i) ? arrayList2.get(i) : "";
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            }
            map.put(arrayList.get(i), str);
        }
        hvv.d(hvv.b(arrayList3, this.aq.getPlanId(), 0, this.cd, this.aa), (ResponseCallback<Object>) new ResponseCallback() { // from class: hrk
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                this.f37084c.b(map, i2, obj);
            }
        });
        hvv.c();
    }

    public /* synthetic */ void b(Map map, int i, Object obj) {
        if (i != 0) {
            return;
        }
        dex.a("outPlanCourse", "");
        dex.a("outPlanCoursetime", "");
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null) {
                HashMap map2 = new HashMap(3);
                map2.put("click", 1);
                map2.put("courseId", entry.getKey());
                map2.put("courseName", entry.getValue());
                lmf.d().c(this.h, AnalyticsValue.INT_PLAN_1120036.value(), map2, 0);
            }
        }
    }

    @Override // com.huawei.health.suggestion.ui.plan.adapter.CourseAdapter.OnItemClickListener
    public void onCourseClick(boolean z, int i, int i2, IntAction intAction) {
        if (intAction == null) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "onCourseClick intAction is null");
            return;
        }
        HashMap map = new HashMap(1);
        map.put("click", 1);
        lmf.d().c(this.h, AnalyticsValue.INT_PLAN_1120029.value(), map, 0);
        FitWorkout fitWorkout = this.ak.get(intAction.getActionId());
        if (fitWorkout == null) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "onCourseClick fitWorkout is null");
            return;
        }
        if (this.aq.getPlanTimeInfo() == null) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "onCourseClick planTimeInfo is null");
            return;
        }
        long jG = btw.g(this.aq);
        long jB = ift.b(jG, this.cd, this.aa);
        if (i == 0) {
            if (this.aq.getDayInfo(this.cd, this.aa) == null || i2 < 0) {
                jB = 0;
            } else {
                jB = intAction.getPunchFlag() == 1 ? -3L : -2L;
            }
        }
        long j = jB;
        if (fitWorkout.isRunModelCourse()) {
            ibn.d(this.f9662b, fitWorkout, this.aq, j, i2 + 1);
        } else {
            ibn.a(this.f9662b, fitWorkout, this.aq, i2 + 1, j);
        }
        ReleaseLogUtil.c("R_Suggestion_AiFatReductionPlanFragment", "onCourseClick isInPlan ", Boolean.valueOf(z), " status ", Integer.valueOf(i), " position ", Integer.valueOf(i2), " intAction ", intAction, " courseBeginTime ", Long.valueOf(j), " planBeginTime ", Long.valueOf(jG));
    }

    @Override // com.huawei.health.suggestion.ui.plan.adapter.CourseAdapter.OnItemClickListener
    public void onCourseRecordClick(boolean z, int i, int i2, final IntAction intAction) {
        ReleaseLogUtil.c("R_Suggestion_AiFatReductionPlanFragment", "onCourseRecordClick isInPlan ", Boolean.valueOf(z), " status ", Integer.valueOf(i), " position ", Integer.valueOf(i2), " intAction ", intAction);
        if (intAction == null) {
            return;
        }
        btw.a(this.aq, this.cd, this.aa, new IBaseResponseCallback() { // from class: hqz
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i3, Object obj) {
                this.f37072c.a(intAction, i3, obj);
            }
        });
    }

    public /* synthetic */ void a(IntAction intAction, int i, Object obj) {
        if (!njy.b(obj, RecordData.class)) {
            LogUtil.e("Suggestion_AiFatReductionPlanFragment", "getRecordDataList onResult obj is not instanceof List<RecordData>");
            return;
        }
        RecordData recordDataD = hvv.d((List<RecordData>) obj, intAction.getActionId());
        if (recordDataD == null) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "onCourseRecordClick recordData is null");
            return;
        }
        if (intAction.getActionType() == IntAction.ActionType.RUN) {
            c(recordDataD);
            return;
        }
        String workoutId = recordDataD.getWorkoutId();
        if (TextUtils.isEmpty(workoutId)) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "onCourseRecordClick workoutId ", workoutId);
            return;
        }
        List<WorkoutRecord> listE = hvv.e(this.aq.getPlanId());
        if (njy.e(listE)) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "onCourseRecordClick list ", listE);
            AppRouter.c("/PluginFitnessAdvice/FitnessResultActivity").d(new Bundle()).b(this.f9662b);
            return;
        }
        WorkoutRecord workoutRecordB = hvv.b(listE, recordDataD);
        Bundle bundle = new Bundle();
        if (workoutRecordB != null) {
            if (workoutRecordB.getRecordModeType() == 1) {
                LogUtil.b("Suggestion_AiFatReductionPlanFragment", "onCourseRecordClick H5 AI_FITNESS_COURSE");
                H5ProLaunchOption.Builder builderAddPath = new H5ProLaunchOption.Builder().addCustomizeArg("workoutRecord", new Gson().toJson(workoutRecordB)).addPath("#/resultRecord?pullFrom=1");
                builderAddPath.addCustomizeJsModule(NotificationCompat.CATEGORY_SOCIAL, ddv.b().getCommonJsModule(NotificationCompat.CATEGORY_SOCIAL)).enableImageCache();
                ddv.b().loadH5ProApp(this.f9662b, "com.huawei.health.h5.ai-fitness-course", builderAddPath);
                return;
            }
            bundle.putParcelable("workout_record", workoutRecordB);
        }
        ReleaseLogUtil.c("R_Suggestion_AiFatReductionPlanFragment", "onCourseRecordClick workoutRecord ", workoutRecordB);
        AppRouter.c("/PluginFitnessAdvice/FitnessResultActivity").d(bundle).b(this.f9662b);
    }

    @Override // com.huawei.health.suggestion.ui.plan.adapter.CourseAdapter.OnItemClickListener
    public void onCourseStatusClick(boolean z, int i, int i2, IntAction intAction) {
        ReleaseLogUtil.c("R_Suggestion_AiFatReductionPlanFragment", "onCourseStatusClick isInPlan ", Boolean.valueOf(z), " status ", Integer.valueOf(i), " position ", Integer.valueOf(i2), " intAction ", intAction);
        this.ao = intAction;
        c(20);
    }

    @Override // com.huawei.health.suggestion.ui.plan.adapter.CourseAdapter.OnItemClickListener
    public void onLongClick(int i, int i2, final IntAction intAction) {
        ReleaseLogUtil.c("R_Suggestion_AiFatReductionPlanFragment", "onLongClick status ", Integer.valueOf(i), " position ", Integer.valueOf(i2), " intAction ", intAction);
        if (intAction == null || intAction.getPunchFlag() == 1) {
            return;
        }
        new NoTitleCustomAlertDialog.Builder(this.f9662b).b(R.string.IDS_plan_delete_course_tip).c(R.string.IDS_plugin_fitnessadvice_ok, new View.OnClickListener() { // from class: hrx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f37095b.a(intAction, view);
            }
        }).a(R.string.IDS_plugin_fitnessadvice_cancal, new View.OnClickListener() { // from class: hrw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReleaseLogUtil.c("R_Suggestion_AiFatReductionPlanFragment", "onLongClick setNegativeButton view ", view);
            }
        }).c().show();
    }

    public /* synthetic */ void a(IntAction intAction, View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(hvv.b(intAction.getActionId()));
        hvv.d(hvv.b(arrayList, this.aq.getPlanId(), 1, this.cd, this.aa), new b(this, "TYPE_DELETE"));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1 || intent == null) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "onActivityResult intent ", intent, " resultCode ", Integer.valueOf(i2), " requestCode ", Integer.valueOf(i));
            return;
        }
        ArrayList<String> stringArrayListExtra = intent.hasExtra("KEY_SUG_COURSE_IDS_RESULT") ? intent.getStringArrayListExtra("KEY_SUG_COURSE_IDS_RESULT") : null;
        ArrayList<String> stringArrayListExtra2 = intent.hasExtra("KEY_SUG_COURSE_NAMES_RESULT") ? intent.getStringArrayListExtra("KEY_SUG_COURSE_NAMES_RESULT") : null;
        if (i == 11) {
            b(stringArrayListExtra, stringArrayListExtra2);
        } else if (i != 20) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "onActivityResult default requestCode ", Integer.valueOf(i));
        } else {
            c(stringArrayListExtra, stringArrayListExtra2);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!Boolean.parseBoolean(SharedPreferenceManager.e(this.h, Integer.toString(20002), "EXIT_APP_AT_SPORT_TAB"))) {
            t();
            return;
        }
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "onResume activity is null");
            return;
        }
        String simpleName = activityJ.getClass().getSimpleName();
        if (!"MainActivity".equals(simpleName)) {
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "onResume simpleName ", simpleName);
            t();
        } else {
            d(this.u);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        t();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        f();
        ObserverManagerUtil.c(this.be);
    }

    private void f() {
        boolean z = this.ba;
        boolean z2 = this.bb;
        boolean z3 = this.ay;
        int i = this.u;
        ReleaseLogUtil.c("R_Suggestion_AiFatReductionPlanFragment", "finish mIsVisibleSportEntrance ", Boolean.valueOf(z), " mIsVisibleToUser ", Boolean.valueOf(z2), " mIsSupportLoopRecommendFood ", Boolean.valueOf(z3), " mCurrentPosition ", Integer.valueOf(i), " mTypeList ", this.ca);
        HiHealthNativeApi.a(BaseApplication.b()).unSubscribeHiHealthData(this.ca, new HiUnSubscribeListener() { // from class: hqu
            @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
            public final void onResult(boolean z4) {
                ReleaseLogUtil.c("R_Suggestion_AiFatReductionPlanFragment", "finish isSuccess ", Boolean.valueOf(z4));
            }
        });
        this.al.removeCallbacksAndMessages(null);
    }

    @Override // com.huawei.health.marketing.views.IViewVisibilityChange
    public void onVisibilityChange(boolean z) {
        this.bb = z;
        ReleaseLogUtil.c("R_Suggestion_AiFatReductionPlanFragment", "setUserVisibleHint mIsVisibleSportEntrance ", Boolean.valueOf(this.ba), " mIsVisibleToUser ", Boolean.valueOf(z), " mIsSupportLoopRecommendFood ", Boolean.valueOf(this.ay), " mCurrentPosition ", Integer.valueOf(this.u));
        if (this.bb) {
            u();
            q();
            b();
            ab();
            r();
            d(this.u);
            return;
        }
        t();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        d(i);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        if (this.at) {
            return;
        }
        this.at = i == 1;
    }

    static class b implements ResponseCallback<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9669a;
        private final WeakReference<AiFatReductionPlanFragment> d;

        b(AiFatReductionPlanFragment aiFatReductionPlanFragment, String str) {
            this.d = new WeakReference<>(aiFatReductionPlanFragment);
            this.f9669a = str;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:41:0x009c  */
        @Override // com.huawei.hwbasemgr.ResponseCallback
        public void onResponse(int i, Object obj) {
            AiFatReductionPlanFragment aiFatReductionPlanFragment = this.d.get();
            if (aiFatReductionPlanFragment == null) {
                ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "AiPlanCallback onResponse fragment is null status ", Integer.valueOf(i), " object ", obj);
            }
            ReleaseLogUtil.c("R_Suggestion_AiFatReductionPlanFragment", "AiPlanCallback mType ", this.f9669a, " status ", Integer.valueOf(i), " object ", obj);
            String str = this.f9669a;
            str.hashCode();
            switch (str) {
                case "TYPE_MENSTRUAL":
                    aiFatReductionPlanFragment.al.removeMessages(12);
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 12;
                    messageObtain.obj = obj;
                    aiFatReductionPlanFragment.al.sendMessage(messageObtain);
                    break;
                case "TYPE_REPLACE":
                    if (i == 0) {
                        iei.c(true, aiFatReductionPlanFragment.bl, aiFatReductionPlanFragment.bg);
                        HandlerExecutor.b(new Runnable() { // from class: hsa
                            @Override // java.lang.Runnable
                            public final void run() {
                                hvv.c();
                            }
                        });
                        break;
                    } else {
                        qpx.e(aiFatReductionPlanFragment.h, i == 15030326 ? R.string.IDS_course_replace_fail_repeat : R.string.IDS_ai_course_replace_fail);
                        iei.c(false, aiFatReductionPlanFragment.bl, aiFatReductionPlanFragment.bg);
                        break;
                    }
                    break;
                case "TYPE_CANCEL_LEAVE":
                    if (i != 0) {
                        qpx.e(aiFatReductionPlanFragment.h, R.string.IDS_plan_adjust_fail);
                    }
                    iei.d(1, 7, aiFatReductionPlanFragment.j);
                    break;
                case "TYPE_LEAVE":
                    if (i != 0) {
                        qpx.e(aiFatReductionPlanFragment.h, R.string.IDS_plan_adjust_fail);
                    }
                    iei.d(1, 5, aiFatReductionPlanFragment.bf);
                    break;
                case "TYPE_LEAVE_MENSTRUAL":
                    if (i != 0) {
                        qpx.e(aiFatReductionPlanFragment.h, R.string.IDS_plan_adjust_fail);
                    }
                    iei.d(2, 5, aiFatReductionPlanFragment.bf);
                    break;
                case "TYPE_DELETE":
                    if (i == 0) {
                        HashMap map = new HashMap(1);
                        map.put("click", 1);
                        lmf.d().c(aiFatReductionPlanFragment.h, AnalyticsValue.INT_PLAN_1120037.value(), map, 0);
                        break;
                    }
                    break;
                case "TYPE_UPDATE_PLAN_CALENDAR_REST":
                    if (i != 0) {
                        qpx.e(aiFatReductionPlanFragment.h, R.string.IDS_plan_adjust_fail);
                    }
                    iei.d(1, 2, 0);
                    break;
                case "TYPE_UPDATE_PLAN_CALENDAR_TRAIN":
                    if (i != 0) {
                        qpx.e(aiFatReductionPlanFragment.h, R.string.IDS_plan_adjust_fail);
                        break;
                    }
                    break;
                default:
                    ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "AiPlanCallback mType ", this.f9669a, " status ", Integer.valueOf(i), " object ", obj);
                    break;
            }
        }
    }

    static class c implements HiSubscribeListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<AiFatReductionPlanFragment> f9670c;

        c(AiFatReductionPlanFragment aiFatReductionPlanFragment) {
            this.f9670c = new WeakReference<>(aiFatReductionPlanFragment);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            AiFatReductionPlanFragment aiFatReductionPlanFragment = this.f9670c.get();
            if (aiFatReductionPlanFragment != null && !njy.e(list)) {
                aiFatReductionPlanFragment.ca = list;
            } else {
                ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "InnerHiSubscribeListener onResult fragment ", aiFatReductionPlanFragment, " successList ", list, " failList ", list2);
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            AiFatReductionPlanFragment aiFatReductionPlanFragment = this.f9670c.get();
            if (aiFatReductionPlanFragment == null) {
                ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "InnerHiSubscribeListener onChange fragment is null");
                return;
            }
            if ("setUserData".equals(str) || ArkUIXConstants.INSERT.equals(str) || ArkUIXConstants.DELETE.equals(str)) {
                if (i == 100) {
                    aiFatReductionPlanFragment.al.removeMessages(10);
                    aiFatReductionPlanFragment.al.sendEmptyMessageDelayed(10, 1000L);
                    return;
                }
                if (i == 23) {
                    aiFatReductionPlanFragment.al.removeMessages(13);
                    aiFatReductionPlanFragment.al.sendEmptyMessageDelayed(13, 1000L);
                } else if (i == HiSubscribeType.f12259a) {
                    aiFatReductionPlanFragment.al.sendEmptyMessage(11);
                } else if (i == 103) {
                    aiFatReductionPlanFragment.al.sendEmptyMessage(14);
                } else {
                    ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "InnerHiSubscribeListener onChange type ", Integer.valueOf(i));
                }
            }
        }
    }

    static class e implements WeightCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f9671b;
        private final WeakReference<AiFatReductionPlanFragment> e;

        e(AiFatReductionPlanFragment aiFatReductionPlanFragment, int i) {
            this.e = new WeakReference<>(aiFatReductionPlanFragment);
            this.f9671b = i;
        }

        @Override // com.huawei.ui.main.stories.health.weight.callback.WeightCallback
        public void getWeight(ArrayList<vfv> arrayList) {
            AiFatReductionPlanFragment aiFatReductionPlanFragment = this.e.get();
            if (aiFatReductionPlanFragment != null) {
                aiFatReductionPlanFragment.al.removeMessages(this.f9671b);
                Message messageObtain = Message.obtain();
                messageObtain.what = this.f9671b;
                messageObtain.obj = arrayList;
                aiFatReductionPlanFragment.al.sendMessage(messageObtain);
                return;
            }
            ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "AiPlanWeightCallback getWeight fragment is null");
        }
    }

    static class a extends BaseHandler<AiFatReductionPlanFragment> {
        a(AiFatReductionPlanFragment aiFatReductionPlanFragment) {
            super(aiFatReductionPlanFragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(AiFatReductionPlanFragment aiFatReductionPlanFragment, Message message) {
            if (aiFatReductionPlanFragment.getView() == null) {
                ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "AiPlanHandler handleMessageWhenReferenceNotNull object ", aiFatReductionPlanFragment, " message ", message);
            }
            int i = message.what;
            if (i == 20) {
                aiFatReductionPlanFragment.a(message.obj);
                return;
            }
            if (i == 21) {
                aiFatReductionPlanFragment.c(message.obj);
                return;
            }
            if (i == 30) {
                aiFatReductionPlanFragment.v();
                return;
            }
            switch (i) {
                case 10:
                    float fA = hjg.a();
                    if (Float.compare(aiFatReductionPlanFragment.cb, fA) != 0) {
                        aiFatReductionPlanFragment.cb = fA;
                        aiFatReductionPlanFragment.b(aiFatReductionPlanFragment.h());
                        aiFatReductionPlanFragment.o();
                    }
                    int iE = hjg.e();
                    if (aiFatReductionPlanFragment.by != iE) {
                        aiFatReductionPlanFragment.by = iE;
                        aiFatReductionPlanFragment.n();
                    }
                    break;
                case 11:
                    aiFatReductionPlanFragment.w();
                    break;
                case 12:
                    aiFatReductionPlanFragment.d(message.obj);
                    break;
                case 13:
                    aiFatReductionPlanFragment.i();
                    break;
                case 14:
                    aiFatReductionPlanFragment.p();
                    break;
                default:
                    ReleaseLogUtil.d("R_Suggestion_AiFatReductionPlanFragment", "AiPlanHandler handleMessageWhenReferenceNotNull message ", message);
                    break;
            }
        }
    }
}
