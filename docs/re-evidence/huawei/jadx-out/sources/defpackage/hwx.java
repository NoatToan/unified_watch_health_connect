package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntAction;
import com.huawei.basefitnessadvice.model.intplan.IntDayPlan;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.IntWeekPlan;
import com.huawei.basefitnessadvice.model.intplan.RecordData;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.plan.viewholder.AiPlanWeekDetailViewHolder;
import com.huawei.health.suggestion.util.FitnessItemDecoration;
import com.huawei.health.weight.WeightApi;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginfitnessadvice.Workout;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.main.stories.health.weight.callback.WeightCallback;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes9.dex */
public class hwx {
    private static volatile int d;
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f37261a;
    private final ViewGroup aa;
    private j ab;
    private IntPlan ac;
    private ViewGroup ad;
    private List<f> ae;
    private List<RecordData> af;
    private LinearLayout ag;
    private final List<RecordData> ah;
    private final Resources ai;
    private LinearLayout aj;
    private int ak;
    private AiPlanWeekDetailViewHolder al;
    private d am;
    private int an;
    private TextView ap;
    private ImageView as;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f37262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f37263c;
    private double f;
    private int g;
    private double h;
    private ArrayList<String> i;
    private final Context j;
    private final List<IntAction> k;
    private Map<String, FitWorkout> l = new ConcurrentHashMap();
    private List<IntAction> m;
    private int n;
    private ImageView o;
    private Handler p;
    private List<a> q;
    private int r;
    private HealthRecycleView s;
    private e t;
    private HealthTextView u;
    private final List<IntAction> v;
    private List<IntAction> w;
    private e x;
    private List<a> y;
    private HealthRecycleView z;

    static class f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f37286b;

        f(RecordData recordData) {
            this.f37286b = recordData.getRecordId();
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        IntAction.ActionType f37275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f37276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f37277c;
        RecordData d;
        String e;

        a(IntAction intAction, RecordData recordData, int i) {
            this.f37277c = intAction.getPunchFlag();
            this.e = intAction.getActionId();
            this.f37275a = intAction.getActionType();
            this.d = recordData;
            this.f37276b = i;
        }
    }

    class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f37278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        FrameLayout f37279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f37280c;
        View d;
        HealthTextView e;
        LinearLayout f;
        HealthCardView h;
        ImageView i;

        public b(View view, ViewGroup viewGroup) {
            int iIntValue;
            super(view);
            this.f37279b = (FrameLayout) view.findViewById(R.id.plan_course_item);
            this.i = (ImageView) view.findViewById(R.id.plan_course_item_background);
            this.f37280c = (HealthTextView) view.findViewById(R.id.course_name);
            this.e = (HealthTextView) view.findViewById(R.id.course_duration);
            this.d = view.findViewById(R.id.course_item_interval);
            this.f37278a = (ImageView) view.findViewById(R.id.plan_trained_state);
            this.f = (LinearLayout) view.findViewById(R.id.plan_trained_layout);
            this.h = (HealthCardView) view.findViewById(R.id.view_record);
            RecyclerView recyclerView = viewGroup instanceof RecyclerView ? (RecyclerView) viewGroup : null;
            RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            int spanCount = gridLayoutManager != null ? gridLayoutManager.getSpanCount() : 0;
            LogUtil.a("IntPlanDayCourseView", "courseViewHolder spanCount:", Integer.valueOf(spanCount));
            Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
            if (qrs.af(hwx.this.j) || spanCount == 2) {
                LogUtil.a("IntPlanDayCourseView", "courseViewHolder widescreen is true");
                iIntValue = ((((hwx.this.ai.getDisplayMetrics().widthPixels - ((Integer) safeRegionWidth.first).intValue()) - ((Integer) safeRegionWidth.second).intValue()) - (((int) hwx.this.ai.getDimension(R.dimen.defaultPaddingStart)) * 3)) - (((int) hwx.this.ai.getDimension(R.dimen.defaultPaddingEnd)) * 2)) / 2;
            } else {
                LogUtil.a("IntPlanDayCourseView", "courseViewHolder widescreen is false");
                iIntValue = ((((hwx.this.ai.getDisplayMetrics().widthPixels - ((Integer) safeRegionWidth.first).intValue()) - ((Integer) safeRegionWidth.second).intValue()) - ((int) hwx.this.ai.getDimension(R.dimen.emui_card_device_2dp))) - (((int) hwx.this.ai.getDimension(R.dimen.defaultPaddingStart)) * 2)) - (((int) hwx.this.ai.getDimension(R.dimen.defaultPaddingEnd)) * 2);
            }
            int i = (int) ((iIntValue * 9.0f) / 21.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iIntValue, i);
            this.i.setLayoutParams(layoutParams);
            this.f37279b.setLayoutParams(new RelativeLayout.LayoutParams(iIntValue, i));
            this.f.setLayoutParams(layoutParams);
            if (qrs.ac()) {
                qrs.a(this.f37280c);
                qrs.a(this.e);
            }
        }
    }

    class e extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Context f37283a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f37285c;
        List<IntAction> e;

        public e(Context context, List<IntAction> list, boolean z) {
            this.f37283a = context;
            this.e = list;
            this.f37285c = z;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return hwx.this.new b(LayoutInflater.from(this.f37283a).inflate(R.layout.sug_layout_intplan_course_card_view, viewGroup, false), viewGroup);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(b bVar, int i) {
            String strAcquireName;
            long jAcquireDuration;
            String strAcquirePicture;
            if (this.e.get(i) != null) {
                if (i == 0) {
                    if (hwx.this.ac.getPlanType() != IntPlan.PlanType.AI_FITNESS_PLAN) {
                        bVar.d.setVisibility(8);
                    } else {
                        bVar.d.setVisibility(0);
                    }
                }
                String actionId = this.e.get(i).getActionId();
                FitWorkout fitWorkout = (FitWorkout) hwx.this.l.get(actionId);
                pds actionInfo = this.e.get(i).getActionInfo();
                if (actionInfo != null) {
                    ReleaseLogUtil.d("IntPlanDayCourseView", "onBindViewHolder : add course card view ", actionId, " punchFlag:", Integer.valueOf(this.e.get(i).getPunchFlag()));
                    strAcquireName = actionInfo.b();
                    jAcquireDuration = actionInfo.e();
                    strAcquirePicture = actionInfo.c();
                } else if (fitWorkout != null) {
                    ReleaseLogUtil.d("IntPlanDayCourseView", "onBindViewHolder : add fit workout card view ", actionId, " punchFlag:", Integer.valueOf(this.e.get(i).getPunchFlag()));
                    strAcquireName = fitWorkout.acquireName();
                    jAcquireDuration = fitWorkout.acquireDuration();
                    strAcquirePicture = fitWorkout.acquirePicture();
                } else {
                    LogUtil.e("IntPlanDayCourseView", "onBindViewHolder : missing course info");
                    strAcquireName = "";
                    jAcquireDuration = 0;
                    strAcquirePicture = null;
                }
                bVar.f37280c.setText(strAcquireName);
                if (jAcquireDuration >= 60) {
                    bVar.e.setVisibility(0);
                    bVar.e.setText(gzx.d(R.plurals.IDS_plugin_fitnessadvice_min, (int) (jAcquireDuration / 60), ifp.d(jAcquireDuration)));
                } else {
                    bVar.e.setVisibility(8);
                }
                bVar.f37278a.setImageResource(R.drawable.ic_plan_curriculum_untrained);
                bVar.f37279b.setAlpha(1.0f);
                if (hwx.this.ak != 3) {
                    if (hwx.this.ak == 0) {
                        hwx.this.e(bVar.f37279b, actionId, i, fitWorkout);
                    } else {
                        hwx.this.e(bVar.f37279b, actionId, i, fitWorkout);
                        hwx.this.e(bVar.f37279b, this.f37285c, this.e.get(i));
                    }
                    bVar.h.setVisibility(8);
                    if (this.e.get(i).getPunchFlag() == 1) {
                        bVar.f37278a.setImageResource(R.drawable.ic_plan_curriculum_completed);
                        if (hwx.this.ac.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN || (hwx.this.ac.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN && this.f37285c)) {
                            hwx.this.c(bVar.h, this.e.get(i), this.f37283a);
                        }
                    }
                } else {
                    bVar.f37278a.setImageResource(R.drawable.ic_plan_lock);
                    bVar.h.setVisibility(8);
                    hwx.this.e(bVar.f37279b, actionId, i, fitWorkout);
                }
                int dimension = (int) hwx.this.ai.getDimension(R.dimen.defaultCornerRadiusM);
                if (strAcquirePicture == null) {
                    qqf.a(bVar.i, R.drawable.plan_course_background_error, dimension, 1, 0);
                } else {
                    qqf.b(bVar.i, strAcquirePicture, dimension, 1, R.drawable.plan_course_background_error);
                }
                if (bVar.h.getVisibility() == 0 && qrs.y()) {
                    bVar.f37280c.setMaxLines(1);
                } else {
                    bVar.f37280c.setMaxLines(2);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.e.size();
        }
    }

    class g extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ImageView f37287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        HealthTextView f37288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f37289c;
        LinearLayout d;
        HealthTextView e;
        ImageView i;
        HealthTextView j;

        public g(View view) {
            super(view);
            this.d = (LinearLayout) view.findViewById(R.id.run_record_layout);
            this.i = (ImageView) view.findViewById(R.id.run_type_icon);
            this.j = (HealthTextView) view.findViewById(R.id.run_type);
            this.f37289c = (HealthTextView) view.findViewById(R.id.run_distance);
            this.e = (HealthTextView) view.findViewById(R.id.run_time);
            ImageView imageView = (ImageView) view.findViewById(R.id.sug_out_record_arrow);
            this.f37287a = imageView;
            imageView.setImageResource(LanguageUtil.ba(hwx.this.j) ? R.drawable.common_ui_arrow_left : R.drawable.common_ui_arrow_right);
            this.f37288b = (HealthTextView) view.findViewById(R.id.run_distance_unit);
        }
    }

    class j extends RecyclerView.Adapter<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Context f37290a;
        List<RecordData> e;

        public j(Context context, List<RecordData> list) {
            this.f37290a = context;
            this.e = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g onCreateViewHolder(ViewGroup viewGroup, int i) {
            return hwx.this.new g(LayoutInflater.from(this.f37290a).inflate(R.layout.sug_layout_out_plan_run_card_view, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(g gVar, int i) {
            RecordData recordData;
            if (!njy.b(this.e) || i >= this.e.size() || (recordData = this.e.get(i)) == null) {
                return;
            }
            gVar.i.setVisibility(0);
            gVar.f37289c.setText("");
            try {
                gVar.f37289c.setText(hwx.this.c(Integer.parseInt(recordData.getExtraInfo())));
            } catch (NumberFormatException unused) {
                LogUtil.e("IntPlanDayCourseView", "onBindViewHolder NumberFormatException");
            }
            if (recordData.getSportType() == 264) {
                gVar.j.setText(R.string.IDS_start_track_sport_type_indoor_run);
                hwx.this.c(R.drawable.ic_runplan_indoor, gVar.i);
                gVar.f37289c.setTextColor(hwx.this.ai.getColor(com.huawei.ui.commonui.R.color.sug_ai_run_plan_indoor_text_color));
            } else if (recordData.getSportType() == 258) {
                gVar.j.setText(R.string.IDS_start_track_sport_type_outdoor_run);
                hwx.this.c(R.drawable.ic_run, gVar.i);
                gVar.f37289c.setTextColor(hwx.this.ai.getColor(com.huawei.ui.commonui.R.color.colorAccent));
            } else {
                gVar.j.setText(R.string.IDS_motiontrack_cross_country_race);
                hwx.this.c(R.drawable.ic_runplan_cross, gVar.i);
                gVar.f37289c.setTextColor(hwx.this.ai.getColor(com.huawei.ui.commonui.R.color.sug_ai_run_plan_cross_text_color));
            }
            gVar.f37288b.setText(UnitUtil.f() ? R.string.IDS_band_data_sport_distance_unit_en : R.string.IDS_band_data_sport_distance_unit);
            gVar.e.setText(UnitUtil.e((int) recordData.getDuration()));
            hwx.this.e(gVar.d, recordData, this.f37290a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.e.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(double d2) {
        double d3 = d2 / 1000.0d;
        return UnitUtil.f() ? UnitUtil.e(UnitUtil.e(d3, 3), 1, 2) : UnitUtil.e(d3, 1, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, ImageView imageView) {
        if (LanguageUtil.ba(this.j)) {
            imageView.setImageDrawable(qqz.e(this.j, i));
        } else {
            imageView.setImageResource(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        HashMap map = new HashMap(1);
        map.put("click", 1);
        lmf.d().c(this.j, AnalyticsValue.INT_PLAN_1120037.value(), map, 0);
    }

    public Context h() {
        return this.j;
    }

    public hwx(Context context, ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.v = new ArrayList();
        this.ah = new ArrayList();
        this.ai = BaseApplication.b().getResources();
        this.m = new ArrayList();
        this.w = new ArrayList();
        this.af = new ArrayList();
        this.r = 0;
        this.p = new Handler(Looper.getMainLooper());
        this.am = new d(0);
        this.f37262b = new c(this);
        this.h = 65.0d;
        this.f = 20.0d;
        this.g = 0;
        this.q = new ArrayList();
        this.y = new ArrayList();
        this.ae = new ArrayList();
        this.i = new ArrayList<>();
        this.j = context;
        this.aa = viewGroup;
        if (viewGroup != null) {
            this.aj = (LinearLayout) viewGroup.findViewById(R.id.start_day_view);
            this.ag = (LinearLayout) viewGroup.findViewById(R.id.rest_day_view);
            this.s = (HealthRecycleView) viewGroup.findViewById(R.id.plan_sport_recyclerView);
            e eVar = new e(context, arrayList, true);
            this.t = eVar;
            HealthRecycleView healthRecycleView = this.s;
            if (healthRecycleView != null) {
                healthRecycleView.setAdapter(eVar);
            }
            ien.b(context, this.s);
            this.z = (HealthRecycleView) viewGroup.findViewById(R.id.out_plan_sport_recyclerView);
            this.z.addItemDecoration(new FitnessItemDecoration(context, 0, ien.a(context)));
            ien.a(context, this.z, ien.d(context, true, 1), true, 0);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.out_plan_moudle);
            this.ad = viewGroup2;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            this.o = (ImageView) viewGroup.findViewById(R.id.explain_out_plan);
            HealthTextView healthTextView = (HealthTextView) viewGroup.findViewById(R.id.out_plan_training_helps_punch);
            this.u = healthTextView;
            if (healthTextView != null) {
                healthTextView.setVisibility(8);
            }
            ImageView imageView = this.o;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: hwx.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        hwx.this.v();
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        if (this.j == null) {
            LogUtil.j("IntPlanDayCourseView", "showExplainDialog mContext == null");
            return;
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.j).b(R.string.IDS_sug_out_plan_explain).a(R.string.IDS_FitnessAdvice_detail_explain).a(R.string.sug_dialog_yes, new View.OnClickListener() { // from class: hwx.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).b();
        if (customTextAlertDialogB.isShowing()) {
            return;
        }
        customTextAlertDialogB.show();
    }

    public void c(final int i, final int i2, AiPlanWeekDetailViewHolder aiPlanWeekDetailViewHolder, int i3) {
        this.al = aiPlanWeekDetailViewHolder;
        this.r = i3;
        this.an = i;
        this.n = i2;
        final ArrayList arrayList = new ArrayList();
        if (this.ac != null) {
            z();
            arrayList.addAll(hvv.a(this.ac, this.an, this.n));
            btw.a(this.ac, this.an, this.n, new IBaseResponseCallback() { // from class: hwv
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i4, Object obj) {
                    this.d.e(arrayList, i, i2, i4, obj);
                }
            });
        }
    }

    /* synthetic */ void e(List list, int i, int i2, int i3, Object obj) {
        List<RecordData> list2 = (List) obj;
        final boolean zE = e(this.q, (List<IntAction>) list, list2);
        this.m = list;
        this.q.clear();
        for (IntAction intAction : this.m) {
            this.q.add(new a(intAction, hvv.d(list2, intAction.getActionId()), this.ak));
        }
        final boolean zA = btw.a(this.ac, i, i2);
        LogUtil.a("IntPlanDayCourseView", "setCourseData week:", Integer.valueOf(i), " day:", Integer.valueOf(i2), " mInPlanCourseList = ", Integer.valueOf(this.m.size()), "mOutPlanCourseList = ", Integer.valueOf(this.w.size()), " changed:", Boolean.valueOf(zE), "isLastDay:", Boolean.valueOf(zA));
        HandlerExecutor.b(new Runnable() { // from class: hwx.4
            @Override // java.lang.Runnable
            public void run() {
                if (hwx.this.c(zA)) {
                    hwx.this.w();
                } else if (njy.e(hwx.this.m)) {
                    hwx.this.y();
                    hwx.this.t();
                    hwx.this.k();
                } else if (zE) {
                    hwx.this.y();
                    hwx.this.o();
                } else {
                    LogUtil.d("IntPlanDayCourseView", "update nothing");
                }
                hwx.this.l();
            }
        });
    }

    private void z() {
        if (IntPlan.PlanType.AI_FITNESS_PLAN.equals(this.ac.getPlanType())) {
            d(s().size());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        y();
        t();
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(boolean z) {
        if (njy.b(this.m) && this.m.size() == 1 && "Race".equals(this.m.get(0).getActionId())) {
            return true;
        }
        if (this.ac != null) {
            return IntPlan.PlanType.AI_RUN_PLAN.equals(this.ac.getPlanType()) && z && njy.e(this.m);
        }
        LogUtil.j("IntPlanDayCourseView", "isShowCompletionView mPlan == null");
        return false;
    }

    private boolean d(IntDayPlan intDayPlan) {
        for (int i = 0; i < intDayPlan.getInPlanActionCnt(); i++) {
            IntAction inPlanAction = intDayPlan.getInPlanAction(i);
            if (inPlanAction != null && inPlanAction.getPunchFlag() == 0) {
                return false;
            }
        }
        return true;
    }

    private void r() {
        IntWeekPlan weekInfoByOrder;
        IntDayPlan dayByOrder;
        if (this.w.size() != 0) {
            this.ad.setVisibility(0);
            IntPlan intPlan = this.ac;
            if (intPlan == null || (weekInfoByOrder = intPlan.getWeekInfoByOrder(this.an)) == null || (dayByOrder = weekInfoByOrder.getDayByOrder(this.n)) == null) {
                return;
            }
            if (dayByOrder.getPunchFlag() == 1 && !d(dayByOrder)) {
                this.u.setVisibility(0);
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(ift.b(this.ac.getPlanTimeInfo().getBeginDate() * 1000, this.an, this.n));
                int i = calendar.get(2);
                int i2 = calendar.get(5);
                this.u.setText(this.ai.getString(R.string.IDS_plugin_help_train_punch, String.valueOf(i + 1) + "/" + String.valueOf(i2)));
                return;
            }
        } else {
            this.ad.setVisibility(8);
        }
        this.u.setVisibility(8);
    }

    private void q() {
        IntDayPlan dayByOrder;
        if (this.af.size() != 0) {
            this.ad.setVisibility(0);
            IntWeekPlan weekInfoByOrder = this.ac.getWeekInfoByOrder(this.an);
            if (weekInfoByOrder == null || (dayByOrder = weekInfoByOrder.getDayByOrder(this.n)) == null) {
                return;
            }
            if (dayByOrder.getPunchFlag() == 1 && !d(dayByOrder)) {
                this.u.setVisibility(0);
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(ift.b(this.ac.getPlanTimeInfo().getBeginDate() * 1000, this.an, this.n));
                this.u.setText(this.ai.getString(R.string.IDS_plugin_help_run_punch, new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "M/d")).format(calendar.getTime())));
                return;
            }
        } else {
            this.ad.setVisibility(8);
        }
        this.u.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        IntPlan intPlan = this.ac;
        if (intPlan == null) {
            u();
            return;
        }
        if (intPlan.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN) {
            final List<IntAction> listS = s();
            this.i.clear();
            Iterator<IntAction> it = listS.iterator();
            while (it.hasNext()) {
                this.i.add(it.next().getActionId());
            }
            btw.a(this.ac, this.an, this.n, new IBaseResponseCallback() { // from class: hxc
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.e.e(listS, i, obj);
                }
            });
            return;
        }
        if (this.ac.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN) {
            btw.a(this.ac, this.an, this.n, new IBaseResponseCallback() { // from class: hwy
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f37291a.e(i, obj);
                }
            });
        } else {
            LogUtil.a("IntPlanDayCourseView", "checkCreateOutPlanRecordView doing nothing for fit plan");
        }
    }

    /* synthetic */ void e(List list, int i, Object obj) {
        List<RecordData> list2 = (List) obj;
        boolean zE = e(this.y, (List<IntAction>) list, list2);
        this.y.clear();
        for (IntAction intAction : this.w) {
            this.y.add(new a(intAction, hvv.d(list2, intAction.getActionId()), this.ak));
        }
        LogUtil.a("IntPlanDayCourseView", "checkCreateOutPlanRecordView ai fit plan mOutPlanCourseList = ", Integer.valueOf(this.w.size()), " changed:", Boolean.valueOf(zE));
        if (zE) {
            HandlerExecutor.b(new Runnable() { // from class: hwz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37292b.g();
                }
            });
        }
    }

    /* synthetic */ void g() {
        r();
        this.v.clear();
        this.v.addAll(this.w);
        this.x.notifyDataSetChanged();
        p();
    }

    /* synthetic */ void e(int i, Object obj) {
        ArrayList arrayList = new ArrayList();
        List list = (List) obj;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((RecordData) list.get(i2)).getIsInPlan() == 0) {
                arrayList.add((RecordData) list.get(i2));
            }
        }
        final boolean zD = d(this.ae, arrayList);
        this.af = arrayList;
        this.ae.clear();
        Iterator<RecordData> it = this.af.iterator();
        while (it.hasNext()) {
            this.ae.add(new f(it.next()));
        }
        LogUtil.a("IntPlanDayCourseView", "checkCreateOutPlanRecordView ai run plan mRecordList = ", Integer.valueOf(this.af.size()), " changed:", Boolean.valueOf(zD));
        HandlerExecutor.b(new Runnable() { // from class: hwt
            @Override // java.lang.Runnable
            public final void run() {
                this.d.d(zD);
            }
        });
    }

    /* synthetic */ void d(boolean z) {
        if (z) {
            q();
            this.ah.clear();
            this.ah.addAll(this.af);
            this.ab.notifyDataSetChanged();
            p();
        }
    }

    private List<IntAction> s() {
        ArrayList arrayList = new ArrayList(hvv.e(this.ac, this.an, this.n));
        this.w = arrayList;
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        final int i;
        synchronized (e) {
            d++;
            i = d;
        }
        if (this.ac.getPlanType() == IntPlan.PlanType.FIT_PLAN) {
            ArrayList arrayList = new ArrayList();
            for (IntAction intAction : this.m) {
                if (!this.l.containsKey(intAction.getActionId())) {
                    arrayList.add(new gzl.a(intAction.getActionId()).b(this.ac.getPlanId()).c());
                }
            }
            LogUtil.a("IntPlanDayCourseView", "createCourseView requestList size:", Integer.valueOf(arrayList.size()));
            CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
            if (arrayList.size() > 0 && courseApi != null) {
                courseApi.getCourseByIds(arrayList, false, new UiCallback<List<FitWorkout>>() { // from class: hwx.1
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i2, String str) {
                        LogUtil.e("IntPlanDayCourseView", "createCourseView getCourseByIds error:", str);
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(List<FitWorkout> list) {
                        if (list == null) {
                            return;
                        }
                        LogUtil.a("IntPlanDayCourseView", "createCourseView getCourseByIds success:", Integer.valueOf(list.size()));
                        for (FitWorkout fitWorkout : list) {
                            LogUtil.a("IntPlanDayCourseView", "createCourseView fitWorkout : ", fitWorkout.acquireId());
                            hwx.this.l.put(fitWorkout.acquireId(), fitWorkout);
                        }
                        synchronized (hwx.e) {
                            if (i == hwx.d) {
                                hwx.this.x();
                            }
                        }
                    }
                });
                return;
            }
        }
        x();
    }

    private boolean e(List<a> list, List<IntAction> list2, List<RecordData> list3) {
        if (list.size() != list2.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            a aVar = list.get(i);
            IntAction intAction = list2.get(i);
            if (aVar.e != null) {
                if (aVar.e.equals(intAction.getActionId()) && aVar.f37277c == intAction.getPunchFlag() && aVar.f37275a == intAction.getActionType() && aVar.f37276b == this.ak) {
                    RecordData recordDataD = hvv.d(list3, intAction.getActionId());
                    if (aVar.d == null) {
                        if (recordDataD != null) {
                            return true;
                        }
                    } else if (recordDataD == null || aVar.d.getRecordId() == null || !aVar.d.getRecordId().equals(recordDataD.getRecordId())) {
                    }
                }
                return true;
            }
            if (intAction.getActionId() != null) {
                return true;
            }
        }
        return false;
    }

    private boolean d(List<f> list, List<RecordData> list2) {
        if (list.size() != list2.size()) {
            return true;
        }
        for (int i = 0; i < list.size(); i++) {
            f fVar = list.get(i);
            RecordData recordData = list2.get(i);
            if (fVar.f37286b != null && !fVar.f37286b.equals(recordData.getRecordId())) {
                return true;
            }
        }
        return true;
    }

    public void i() {
        long jG;
        IntPlan intPlan = this.ac;
        if (intPlan != null) {
            if (IntPlan.PlanType.AI_FITNESS_PLAN.equals(intPlan.getPlanType())) {
                int iF = btw.f(this.ac);
                jG = DateFormatUtil.d(iF);
                ReleaseLogUtil.d("IntPlanDayCourseView", "showStartDay startDate ", Integer.valueOf(iF));
            } else {
                jG = btw.g(this.ac);
            }
            ReleaseLogUtil.d("IntPlanDayCourseView", "showStartDay startTime ", Long.valueOf(jG));
            String dateTime = DateUtils.formatDateTime(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), jG, 24);
            if (LanguageUtil.bt(this.j)) {
                Date date = new Date(jG);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                int i = calendar.get(2);
                int i2 = calendar.get(5);
                NumberFormat numberFormat = NumberFormat.getInstance();
                numberFormat.setGroupingUsed(false);
                numberFormat.setMinimumIntegerDigits(2);
                dateTime = numberFormat.format(i2) + Constants.LINK + numberFormat.format(i + 1);
            }
            if (LanguageUtil.bt(this.j) || LanguageUtil.bi(this.j) || LanguageUtil.ao(this.j)) {
                b(qre.a(R.string.IDS_fitness_plan_start_date, dateTime));
                return;
            }
            b(qre.a(R.string.IDS_fitness_plan_start_date, dateTime + " "));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (this.al != null) {
            this.p.post(new Runnable() { // from class: hwx.5
                @Override // java.lang.Runnable
                public void run() {
                    hwx.this.aa.measure(View.MeasureSpec.makeMeasureSpec(hwx.this.al.itemView.getMeasuredWidth(), Integer.MIN_VALUE), 0);
                    hwx.this.al.b(0, hwx.this.aa.getMeasuredHeight());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final View view, final IntAction intAction, final Context context) {
        btw.a(this.ac, this.an, this.n, new IBaseResponseCallback() { // from class: hwu
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f37254b.c(intAction, view, context, i, obj);
            }
        });
    }

    /* synthetic */ void c(final IntAction intAction, final View view, final Context context, int i, Object obj) {
        final RecordData recordDataD = hvv.d((List<RecordData>) obj, intAction.getActionId());
        if (recordDataD == null || TextUtils.isEmpty(recordDataD.getRecordId()) || TextUtils.isEmpty(recordDataD.getWorkoutId())) {
            return;
        }
        LogUtil.j("IntPlanDayCourseView", "show record click workoutId:", intAction.getActionId());
        HandlerExecutor.b(new Runnable() { // from class: hww
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(view, intAction, recordDataD, context);
            }
        });
    }

    /* synthetic */ void a(View view, final IntAction intAction, final RecordData recordData, final Context context) {
        view.setVisibility(0);
        view.setOnClickListener(new View.OnClickListener() { // from class: hxa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f37296b.c(intAction, recordData, context, view2);
            }
        });
    }

    /* synthetic */ void c(IntAction intAction, RecordData recordData, Context context, View view) {
        if (intAction.getActionType() == IntAction.ActionType.RUN) {
            e(recordData);
        } else {
            e(recordData, context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(View view, final RecordData recordData, Context context) {
        view.setVisibility(0);
        view.setOnClickListener(new View.OnClickListener() { // from class: hxb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.d(recordData, view2);
            }
        });
    }

    /* synthetic */ void d(RecordData recordData, View view) {
        e(recordData);
    }

    private void e(RecordData recordData) {
        String recordId = recordData.getRecordId();
        if (recordId == null) {
            LogUtil.j("IntPlanDayCourseView", "button_show trajectoryId == null ");
        } else {
            hcu.b().c(recordId);
        }
    }

    private void e(RecordData recordData, Context context) {
        String workoutId = recordData.getWorkoutId();
        List<WorkoutRecord> arrayList = new ArrayList<>();
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("IntPlanDayCourseView", "recordView courseApi is null");
        } else {
            arrayList = courseApi.getWorkoutRecords(this.ac.getPlanId(), new UiCallback<List<WorkoutRecord>>() { // from class: hwx.9
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("IntPlanDayCourseView", "recordView getWorkoutRecords error");
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public void onSuccess(List<WorkoutRecord> list) {
                    LogUtil.a("IntPlanDayCourseView", "recordView getWorkoutRecords success:", Integer.valueOf(list.size()));
                }
            });
        }
        for (WorkoutRecord workoutRecord : arrayList) {
            if (workoutId.equals(workoutRecord.acquireWorkoutId()) && (workoutRecord.acquireExerciseTime() / 1000) * 1000 == (recordData.getEndTime() / 1000) * 1000) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("workout_record", workoutRecord);
                AppRouter.c("/PluginFitnessAdvice/FitnessResultActivity").d(bundle).b(context);
                return;
            }
        }
        AppRouter.c("/PluginFitnessAdvice/FitnessResultActivity").d(new Bundle()).b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(FrameLayout frameLayout, final String str, final int i, final FitWorkout fitWorkout) {
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: hwx.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qrs.r()) {
                    return;
                }
                HashMap map = new HashMap(1);
                map.put("click", 1);
                lmf.d().c(hwx.this.j, AnalyticsValue.INT_PLAN_1120029.value(), map, 0);
                FitWorkout fitWorkout2 = fitWorkout;
                if (fitWorkout2 != null) {
                    if (fitWorkout2.isRunModelCourse()) {
                        hwx.this.d(fitWorkout, i + 1);
                        return;
                    } else {
                        hwx.this.a(fitWorkout, i + 1);
                        return;
                    }
                }
                CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
                if (courseApi == null) {
                    LogUtil.j("IntPlanDayCourseView", "requestCourseList : courseApi is null.");
                } else {
                    courseApi.getCourseById(new gzl.a(str).a(false).c(), new UiCallback<Workout>() { // from class: hwx.7.1
                        @Override // com.huawei.basefitnessadvice.callback.UiCallback
                        public void onFailure(int i2, String str2) {
                            LogUtil.j("IntPlanDayCourseView", "getCourseById fail,", str2, " workoutId:", str);
                        }

                        @Override // com.huawei.basefitnessadvice.callback.UiCallback
                        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                        public void onSuccess(Workout workout) {
                            LogUtil.d("IntPlanDayCourseView", "getCourseById onSuccess id:", str);
                            FitWorkout fitWorkoutD = pea.d(workout);
                            if (fitWorkoutD.isRunModelCourse()) {
                                hwx.this.d(fitWorkoutD, i + 1);
                            } else {
                                hwx.this.a(fitWorkoutD, i + 1);
                            }
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: renamed from: hwx$10, reason: invalid class name */
    class AnonymousClass10 implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ IntAction f37265a;
        final /* synthetic */ boolean e;

        static /* synthetic */ void c(View view) {
        }

        AnonymousClass10(boolean z, IntAction intAction) {
            this.e = z;
            this.f37265a = intAction;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (this.e) {
                return true;
            }
            NoTitleCustomAlertDialog.Builder builderB = new NoTitleCustomAlertDialog.Builder(hwx.this.j).b(R.string.IDS_plan_delete_course_tip);
            int i = R.string.IDS_plugin_fitnessadvice_ok;
            final IntAction intAction = this.f37265a;
            builderB.c(i, new View.OnClickListener() { // from class: hxd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f37300b.e(intAction, view2);
                }
            }).a(R.string.IDS_plugin_fitnessadvice_cancal, new View.OnClickListener() { // from class: hxg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    hwx.AnonymousClass10.c(view2);
                }
            }).c().show();
            return true;
        }

        /* synthetic */ void e(IntAction intAction, View view) {
            peb pebVar = new peb();
            pebVar.b(hwx.this.ac.getPlanId());
            pebVar.d(hwx.this.n);
            pebVar.c(hwx.this.an);
            pebVar.e(1);
            ArrayList arrayList = new ArrayList();
            pdm pdmVar = new pdm();
            pdmVar.d(intAction.getActionId());
            pdmVar.b(IntAction.ActionType.WORKOUT.getType());
            arrayList.add(pdmVar);
            pebVar.c(arrayList);
            ((PlanApi) Services.d("CoursePlanService", PlanApi.class)).updateAction(pebVar, new UiCallback<String>() { // from class: hwx.10.4
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.j("IntPlanDayCourseView", "updateAction fail");
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public void onSuccess(String str) {
                    LogUtil.d("IntPlanDayCourseView", "updateAction success");
                    hwx.this.p();
                    hwx.this.n();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(FrameLayout frameLayout, boolean z, IntAction intAction) {
        frameLayout.setOnLongClickListener(new AnonymousClass10(z, intAction));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        LogUtil.a("IntPlanDayCourseView", "requestCourseList notifyDataSetChanged:", Integer.valueOf(this.m.size()));
        this.k.clear();
        this.k.addAll(this.m);
        this.t.notifyDataSetChanged();
        p();
    }

    public void a(IntPlan intPlan) {
        IntPlan intPlan2 = this.ac;
        if ((intPlan2 == null || intPlan2.getPlanType() != intPlan.getPlanType()) && intPlan != null) {
            if (intPlan.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN) {
                this.z.setVisibility(0);
                this.v.clear();
                e eVar = new e(this.j, this.v, false);
                this.x = eVar;
                this.z.setAdapter(eVar);
            } else if (intPlan.getPlanType() == IntPlan.PlanType.AI_RUN_PLAN) {
                this.z.setVisibility(0);
                this.ab = new j(this.j, this.ah);
                this.ah.clear();
                this.z.setAdapter(this.ab);
            } else {
                this.z.setVisibility(8);
                this.u.setVisibility(8);
            }
        }
        this.ac = intPlan;
    }

    public void e(int i) {
        this.ak = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(FitWorkout fitWorkout, int i) {
        long beginDate = this.ac.getPlanTimeInfo().getBeginDate() * 1000;
        long jB = ift.b(beginDate, this.an, this.n);
        ReleaseLogUtil.d("IntPlanDayCourseView", "startRunCourse time:", Long.valueOf(jB), " week:", Integer.valueOf(this.an), " day:", Integer.valueOf(this.n));
        int i2 = this.ak;
        if (i2 == 0) {
            jB = a(i);
        } else if (i2 == 3 && b(beginDate)) {
            jB = -1;
        }
        ibn.d(this.j, fitWorkout, this.ac, jB, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(FitWorkout fitWorkout, int i) {
        long beginDate = this.ac.getPlanTimeInfo().getBeginDate() * 1000;
        long jB = ift.b(beginDate, this.an, this.n);
        ReleaseLogUtil.d("IntPlanDayCourseView", "startFitnessCourse time:", Long.valueOf(jB), " week:", Integer.valueOf(this.an), "  day:", Integer.valueOf(this.n));
        int i2 = this.ak;
        if (i2 == 0) {
            jB = a(i);
        } else if (i2 == 3 && b(beginDate)) {
            jB = -1;
        }
        ibn.a(this.j, fitWorkout, this.ac, i, jB);
    }

    private long a(int i) {
        int i2 = i - 1;
        IntDayPlan dayInfo = this.ac.getDayInfo(this.an, this.n);
        if (dayInfo == null || i2 < 0) {
            return 0L;
        }
        IntAction inPlanAction = dayInfo.getInPlanAction(i2);
        return (inPlanAction == null || inPlanAction.getPunchFlag() != 1) ? -2L : -3L;
    }

    private boolean b(long j2) {
        return ift.c(j2, System.currentTimeMillis()) + 1 == this.an;
    }

    private void b(String str) {
        Context context;
        f();
        if (this.aj == null || (context = this.j) == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sug_layout_intplan_course_card_view, (ViewGroup) this.aj, true);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.plan_trained_state);
        this.as = imageView;
        imageView.setVisibility(0);
        this.as.setImageResource(R.drawable.ic_vip_lock);
        ((ImageView) viewInflate.findViewById(R.id.plan_course_item_background)).setBackgroundResource(R.drawable.ic_pic_course_fitness_background);
        viewInflate.findViewById(R.id.course_information_layout).setVisibility(8);
        viewInflate.findViewById(R.id.rest_day_information_layout).setVisibility(0);
        TextView textView = (TextView) viewInflate.findViewById(R.id.weight_left);
        this.ap = textView;
        textView.setText(str);
        a(viewInflate);
        p();
    }

    private void m() {
        Context context;
        if (this.ag == null || (context = this.j) == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sug_layout_intplan_course_card_view, (ViewGroup) this.ag, true);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.plan_trained_state);
        this.as = imageView;
        imageView.setVisibility(8);
        ((ImageView) viewInflate.findViewById(R.id.plan_course_item_background)).setBackgroundResource(R.drawable.ic_pic_course_fitness_background);
        viewInflate.findViewById(R.id.course_information_layout).setVisibility(8);
        viewInflate.findViewById(R.id.rest_day_information_layout).setVisibility(0);
        TextView textView = (TextView) viewInflate.findViewById(R.id.weight_left);
        this.ap = textView;
        textView.setText(R.string.IDS_completion_day);
        a(viewInflate);
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        Context context;
        if (this.ag == null || (context = this.j) == null) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sug_layout_intplan_course_card_view, (ViewGroup) this.ag, true);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.plan_trained_state);
        this.as = imageView;
        imageView.setVisibility(8);
        ((ImageView) viewInflate.findViewById(R.id.plan_course_item_background)).setBackgroundResource(R.drawable.ic_pic_course_fitness_background);
        viewInflate.findViewById(R.id.course_information_layout).setVisibility(8);
        viewInflate.findViewById(R.id.rest_day_information_layout).setVisibility(0);
        TextView textView = (TextView) viewInflate.findViewById(R.id.weight_left);
        this.ap = textView;
        textView.setText(R.string.IDS_suggest_you_rest_today);
        IntPlan intPlan = this.ac;
        if (intPlan == null) {
            return;
        }
        if (intPlan.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN) {
            this.as.setVisibility(0);
            this.f37261a = (HealthButton) viewInflate.findViewById(R.id.record_button);
            this.f37263c = ift.b(this.ac.getPlanTimeInfo().getBeginDate() * 1000, this.an, this.n);
            this.am.e(0);
            HiAggregateOption hiAggregateOption = new HiAggregateOption();
            hiAggregateOption.setTimeRange(ift.a(this.f37263c), ift.d(this.f37263c));
            hiAggregateOption.setAggregateType(4);
            hiAggregateOption.setGroupUnitType(0);
            hiAggregateOption.setCount(1);
            WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
            if (weightApi != null) {
                weightApi.getWeightData(hiAggregateOption, this.am);
            } else {
                LogUtil.j("IntPlanDayCourseView", "weightApi is null.");
            }
        }
        a(viewInflate);
        p();
    }

    private void a(View view) {
        int iIntValue;
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        int iIntValue2 = (((this.ai.getDisplayMetrics().widthPixels - ((Integer) safeRegionWidth.first).intValue()) - ((Integer) safeRegionWidth.second).intValue()) - (((int) this.ai.getDimension(R.dimen.defaultPaddingStart)) * 2)) - (((int) this.ai.getDimension(R.dimen.defaultPaddingEnd)) * 2);
        if (qrs.af(this.j)) {
            iIntValue = (int) (((((((this.ai.getDisplayMetrics().widthPixels - ((Integer) safeRegionWidth.first).intValue()) - ((Integer) safeRegionWidth.second).intValue()) - (((int) this.ai.getDimension(R.dimen.defaultPaddingStart)) * 3)) - (((int) this.ai.getDimension(R.dimen.defaultPaddingEnd)) * 2)) / 2) * 9.0f) / 21.0f);
            iIntValue2 = (int) ((((double) iIntValue) * 21.0d) / 9.0d);
        } else {
            iIntValue = (int) ((iIntValue2 * 9.0f) / 21.0f);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iIntValue2, iIntValue);
        ((ImageView) view.findViewById(R.id.plan_course_item_background)).setLayoutParams(layoutParams);
        view.findViewById(R.id.plan_trained_layout).setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iIntValue2, iIntValue);
        if (this.ac.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN && hvv.c(this.ac, this.an, this.n)) {
            layoutParams2.topMargin = qrs.d(this.j, 12.0f);
        }
        ((FrameLayout) view.findViewById(R.id.plan_course_item)).setLayoutParams(layoutParams2);
    }

    static class d implements WeightCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f37281a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<hwx> f37282c;

        public void e(int i) {
            this.f37281a = i;
        }

        private d(hwx hwxVar, int i) {
            this.f37282c = new WeakReference<>(hwxVar);
            this.f37281a = i;
        }

        @Override // com.huawei.ui.main.stories.health.weight.callback.WeightCallback
        public void getWeight(ArrayList<vfv> arrayList) {
            WeakReference<hwx> weakReference = this.f37282c;
            if (weakReference == null) {
                Log.w("IntPlanDayCourseView", "LocalReceiver onReceive mWeakReference is null");
                return;
            }
            hwx hwxVar = weakReference.get();
            if (hwxVar == null) {
                Log.w("IntPlanDayCourseView", "weightBeforeInteractor is not null");
                return;
            }
            if (hwxVar.h() != null) {
                if (hwxVar.am != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = this.f37281a;
                    messageObtain.obj = arrayList;
                    hwxVar.f37262b.sendMessage(messageObtain);
                    return;
                }
                return;
            }
            Log.w("IntPlanDayCourseView", "weightBeforeInteractor mContext is not exist");
        }
    }

    public static class c extends BaseHandler<hwx> {
        c(hwx hwxVar) {
            super(hwxVar);
        }

        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(hwx hwxVar, Message message) {
            if (message == null || hwxVar == null) {
                Log.w("IntPlanDayCourseView", "handleMessageWhenReferenceNotNull obj = null or msg = null !");
                return;
            }
            int i = message.what;
            if (i == 0) {
                hwxVar.e((ArrayList<vfv>) message.obj);
            } else if (i == 1) {
                hwxVar.d((ArrayList<vfv>) message.obj);
            } else {
                Log.i("IntPlanDayCourseView", "handleMessageWhenReferenceNotNull default branch !");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(ArrayList<vfv> arrayList) {
        boolean z = this.an == btw.h(this.ac) && this.n == ift.b(Calendar.getInstance().get(7));
        LogUtil.d("IntPlanDayCourseView", "isToday", Boolean.valueOf(z), Integer.valueOf(arrayList.size()));
        if (njy.b(arrayList)) {
            this.ap.setText(R.string.IDS_your_weight);
            this.ap.setVisibility(0);
            double d2 = arrayList.get(0).d();
            if (UnitUtil.f()) {
                d2 = UnitUtil.h(d2);
            }
            DecimalFormat decimalFormat = new DecimalFormat("#.0");
            Context context = com.huawei.hwcommonmodel.application.BaseApplication.getContext();
            if (UnitUtil.f()) {
                this.ap.setText(context.getString(R.string.IDS_your_weight, context.getResources().getQuantityString(R.plurals.IDS_lb_string, (int) d2, decimalFormat.format(d2))));
            } else {
                this.ap.setText(context.getString(R.string.IDS_your_weight, context.getResources().getQuantityString(R.plurals.IDS_kg_string, (int) d2, decimalFormat.format(d2))));
            }
            this.as.setImageResource(R.drawable.ic_plan_curriculum_completed_black);
            return;
        }
        if (arrayList.size() == 0 && z) {
            this.f37261a.setVisibility(0);
            this.ap.setText(R.string.IDS_suggest_you_rest_today);
            this.ap.setVisibility(0);
            this.as.setImageResource(R.drawable.ic_plan_curriculum_untrained_black);
            HiAggregateOption hiAggregateOption = new HiAggregateOption();
            hiAggregateOption.setTimeRange(0L, ift.d(this.f37263c));
            hiAggregateOption.setAggregateType(4);
            hiAggregateOption.setGroupUnitType(0);
            hiAggregateOption.setCount(1);
            this.am.e(1);
            WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
            if (weightApi != null) {
                weightApi.getWeightData(hiAggregateOption, this.am);
                return;
            } else {
                LogUtil.j("IntPlanDayCourseView", "weightApi is null.");
                return;
            }
        }
        this.ap.setText(R.string.IDS_suggest_you_rest_today);
        this.ap.setVisibility(0);
        this.as.setImageResource(R.drawable.ic_plan_curriculum_untrained_black);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ArrayList<vfv> arrayList) {
        vfv vfvVar;
        if (njy.b(arrayList) && (vfvVar = arrayList.get(0)) != null) {
            this.h = vfvVar.d();
            this.f = vfvVar.c();
        }
        this.f37261a.setOnClickListener(new AnonymousClass6());
    }

    /* JADX INFO: renamed from: hwx$6, reason: invalid class name */
    class AnonymousClass6 implements View.OnClickListener {
        AnonymousClass6() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            iep.a(hwx.this.j, hwx.this.h, hwx.this.f);
            hwx.this.p.postDelayed(new Runnable() { // from class: hxe
                @Override // java.lang.Runnable
                public final void run() {
                    btq.e().e("PLAN_UPDATE");
                }
            }, 1000L);
        }
    }

    public int c() {
        return this.g;
    }

    public void d(int i) {
        this.g = i;
    }

    public ArrayList<String> d() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        LinearLayout linearLayout = this.aj;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        LinearLayout linearLayout2 = this.ag;
        if (linearLayout2 != null) {
            linearLayout2.removeAllViews();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        this.k.clear();
        this.m.clear();
        this.q.clear();
        e eVar = this.t;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    private void u() {
        this.ad.setVisibility(8);
        this.u.setVisibility(8);
        this.v.clear();
        this.ah.clear();
        this.w.clear();
        this.y.clear();
        e eVar = this.x;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    public void f() {
        y();
        t();
        u();
    }

    public void a() {
        int punchFlag;
        int punchFlag2;
        ArrayList arrayList = new ArrayList();
        List<IntAction> list = this.m;
        if (list != null) {
            punchFlag = 0;
            for (IntAction intAction : list) {
                arrayList.add(intAction);
                punchFlag += intAction.getPunchFlag();
            }
        } else {
            punchFlag = 0;
        }
        List<IntAction> list2 = this.w;
        if (list2 != null) {
            for (IntAction intAction2 : list2) {
                List<IntAction> list3 = this.m;
                if (list3 == null) {
                    arrayList.add(intAction2);
                    punchFlag2 = intAction2.getPunchFlag();
                } else if (!list3.contains(intAction2)) {
                    arrayList.add(intAction2);
                    punchFlag2 = intAction2.getPunchFlag();
                }
                punchFlag += punchFlag2;
            }
        }
        HashMap map = new HashMap(3);
        map.put("addedNum", Integer.valueOf(this.g));
        map.put("goalNum", Integer.valueOf(arrayList.size()));
        map.put("finishNum", Integer.valueOf(punchFlag));
        lmf.d().c(this.j, AnalyticsValue.INT_PLAN_1120038.value(), map, 0);
    }

    public boolean j() {
        return this.m.size() == 0;
    }
}
