package com.huawei.health.knit.section.view;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener;
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.bubblelayout.HealthBubbleLayout;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.commonui.recycleview.HealthLinearLayoutManager;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.ruler.circlescaleruler.HealthCircleScaleRuler;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import defpackage.ezn;
import defpackage.fcn;
import defpackage.fya;
import defpackage.gzx;
import defpackage.idy;
import defpackage.ift;
import defpackage.njy;
import defpackage.peh;
import defpackage.qox;
import defpackage.qqw;
import defpackage.qre;
import defpackage.qrs;
import defpackage.vfy;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class MemberPlanSection extends BaseSection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthBubbleLayout f7613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f7614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthTextView f7615c;
    private ImageView d;
    private HealthTextView e;
    private HealthImageView f;
    private HealthTextView g;
    private HealthImageView h;
    private HealthTextView i;
    private Context j;
    private HealthButton k;
    private boolean l;
    private HealthProgressBar m;
    private HealthCardView n;
    private LinearLayout o;
    private boolean p;
    private HealthButton q;
    private HealthTextView r;
    private Map<String, Object> s;
    private HealthTextView t;
    private ImageView u;
    private View v;
    private ImageView w;
    private HealthCardView x;
    private HealthCircleScaleRuler y;
    private e z;

    public MemberPlanSection(Context context) {
        super(context);
        this.s = new HashMap();
        this.j = context;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public View onCreateView(Context context) {
        LogUtil.a("Suggestion_MemberPlanSection", "MemberPlanSection onCreateView.");
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.member_plan_layout, (ViewGroup) this, false);
        this.v = viewInflate;
        ViewTreeVisibilityListener.c(viewInflate, new ViewTreeVisibilityListener(viewInflate, this));
        c(this.v);
        this.v.setOnTouchListener(new View.OnTouchListener() { // from class: ful
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f34586a.b(view, motionEvent);
            }
        });
        return this.v;
    }

    public /* synthetic */ boolean b(View view, MotionEvent motionEvent) {
        LogUtil.a("Suggestion_MemberPlanSection", "onCreateView onTouch tempView ", view, " motionEvent ", motionEvent, " performClick ", Boolean.valueOf(view != null ? view.performClick() : false));
        HealthBubbleLayout healthBubbleLayout = this.f7613a;
        if (healthBubbleLayout != null && healthBubbleLayout.getVisibility() == 0) {
            this.f7613a.setVisibility(8);
        }
        return false;
    }

    @Override // com.huawei.health.knit.section.view.BaseSection, com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.ViewTreeListenee
    public void checkVisibilityAndSetBiEvent() {
        if (ViewTreeVisibilityListener.c(this)) {
            if (this.l) {
                return;
            }
            this.l = c();
            return;
        }
        this.l = false;
    }

    private boolean c() {
        LogUtil.a("Suggestion_MemberPlanSection", "doMemberBi into page.", Boolean.valueOf(this.p), Boolean.valueOf(this.l), Integer.valueOf(this.s.size()));
        if (!this.p) {
            return false;
        }
        idy.b(qqw.c(this.s, "planStatus", 0), qqw.d((Map) this.s, "planName", ""), 0, qqw.c(this.s, "finishRate", 0));
        return true;
    }

    private void c(View view) {
        this.x = (HealthCardView) view.findViewById(R.id.recommend_plan_member_card);
        this.n = (HealthCardView) view.findViewById(R.id.doing_plan_member_card);
        this.d = (ImageView) view.findViewById(R.id.close_button);
        if (qrs.x(this.j)) {
            this.d.setBackgroundResource(R.drawable.ic_close_hh);
        }
        this.w = (ImageView) view.findViewById(R.id.recommend_plan_image);
        this.k = (HealthButton) view.findViewById(R.id.create_plan_button);
        this.t = (HealthTextView) view.findViewById(R.id.plan_name);
        this.q = (HealthButton) view.findViewById(R.id.plan_report_button);
        this.u = (ImageView) view.findViewById(R.id.report_dot);
        this.e = (HealthTextView) view.findViewById(R.id.plan_completed_days_and_rate);
        this.m = (HealthProgressBar) view.findViewById(R.id.current_plan_progress_item_horizontal);
        this.y = (HealthCircleScaleRuler) view.findViewById(R.id.sug_layout_plan_week_detail_health_circle_scale_ruler);
        this.o = (LinearLayout) view.findViewById(R.id.sug_layout_plan_week_detail_layout);
        this.h = (HealthImageView) view.findViewById(R.id.sug_layout_plan_week_detail_total_consumption_icon);
        this.g = (HealthTextView) view.findViewById(R.id.sug_layout_plan_week_detail_total_consumption_title);
        this.f = (HealthImageView) view.findViewById(R.id.sug_layout_plan_week_detail_total_consumption_icon_tip);
        this.i = (HealthTextView) view.findViewById(R.id.sug_layout_plan_week_detail_total_consumption_value);
        this.f7613a = (HealthBubbleLayout) view.findViewById(R.id.sug_layout_plan_week_detail_total_consumption_bubble);
        this.f7614b = (HealthTextView) view.findViewById(R.id.sug_layout_plan_week_detail_total_consumption_bubble_sport);
        this.f7615c = (HealthTextView) view.findViewById(R.id.sug_layout_plan_week_detail_total_consumption_bubble_resting);
        this.r = (HealthTextView) view.findViewById(R.id.sug_layout_plan_week_detail_total_intake_value);
        ((HealthSubHeader) view.findViewById(R.id.plan_subheader)).setSubHeaderBackgroundColor(ContextCompat.getColor(this.j, R.color.common_transparent));
        HealthRecycleView healthRecycleView = (HealthRecycleView) view.findViewById(R.id.today_suggestion_list);
        healthRecycleView.setLayoutManager(new HealthLinearLayoutManager(this.j, 1, false));
        e eVar = new e(this.j);
        this.z = eVar;
        healthRecycleView.setAdapter(eVar);
        healthRecycleView.setNestedScrollingEnabled(false);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        healthRecycleView.setItemAnimator(defaultItemAnimator);
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    public String getLogTag() {
        return "Suggestion_MemberPlanSection";
    }

    @Override // com.huawei.health.knit.section.view.BaseSection
    protected void bindParamsToView(HashMap<String, Object> map) {
        if (qqw.a(map, "DOING_PLAN_FLAG", false)) {
            LogUtil.a("Suggestion_MemberPlanSection", "bindParamsToView.", map.toString());
            this.x.setVisibility(8);
            this.n.setVisibility(0);
            this.t.setText(qqw.d((Map) map, "PLAN_NAME", ""));
            setPlanReportButtion(map);
            if (qqw.c(map, "INT_PLAN_TYPE", IntPlan.PlanType.NA_PLAN.getType()) == IntPlan.PlanType.AI_FITNESS_PLAN.getType()) {
                setAiFitnessPlanLayout(map);
            } else {
                setCommonPlanLayout(map);
            }
            this.z.d(c(map));
            return;
        }
        String strE = SharedPreferenceManager.e(this.j, Integer.toString(10000), "KEY_CLOSED_PLAN_CARD");
        LogUtil.a("Suggestion_MemberPlanSection", "no doing plan.", strE);
        if (Boolean.parseBoolean(strE)) {
            this.x.setVisibility(8);
            this.s.put("planStatus", 2);
            b(2, "", 0);
        } else {
            this.x.setVisibility(0);
            b(0, "", 0);
        }
        if (qrs.af(this.j)) {
            this.w.setBackgroundResource(R.drawable.pic_activity_plan_daxidi);
        }
        this.n.setVisibility(8);
        b();
        setRecommendCardClickListener(map);
    }

    private void b(int i, String str, int i2) {
        this.s.put("planStatus", Integer.valueOf(i));
        this.s.put("planName", str);
        this.s.put("finishRate", Integer.valueOf(i2));
        this.p = true;
    }

    private void setPlanReportButtion(HashMap<String, Object> map) {
        String strD = qqw.d((Map) map, "REPORT_PLAN_TEXT", "");
        if (TextUtils.isEmpty(strD)) {
            this.q.setVisibility(8);
        } else {
            this.q.setVisibility(0);
            this.q.setText(strD);
            View.OnClickListener onClickListenerC = c(map, "GO_TO_REPORT_CLICK");
            if (onClickListenerC != null) {
                this.q.setOnClickListener(onClickListenerC);
            } else {
                LogUtil.e("Suggestion_MemberPlanSection", "reportClick null.");
            }
        }
        if (qqw.a(map, "IS_SHOW_RED_DOT", false)) {
            this.u.setVisibility(0);
        } else {
            this.u.setVisibility(8);
        }
    }

    private void setAiFitnessPlanLayout(HashMap<String, Object> map) {
        this.e.setVisibility(8);
        this.m.setVisibility(8);
        qox qoxVar = new qox(false);
        ezn.d(qoxVar, false);
        this.y.setVisibility(0);
        View.OnClickListener onClickListenerC = c(map, "GO_TO_DIETARY_INSTRUCT");
        if (onClickListenerC != null) {
            this.y.setIconOnClickListener(onClickListenerC);
        }
        vfy vfyVar = (vfy) qqw.a(map, "DIET_CALORIE_OVERVIEW", (Class<Object>) vfy.class, (Object) null);
        if (vfyVar == null) {
            ReleaseLogUtil.d("Suggestion_MemberPlanSection", "setAiFitnessPlanLayout overview is null currentParams ", map);
            return;
        }
        ezn.d(qoxVar, vfyVar, false);
        this.y.setCircleScaleRulerData(qoxVar);
        ezn.d(this.y, vfyVar, false);
        this.o.setVisibility(0);
        ezn.e(this.i, vfyVar, false);
        ezn.c(this.r, vfyVar, false);
        c(this.h, vfyVar);
        c(this.g, vfyVar);
        c(this.f, vfyVar);
        c(this.i, vfyVar);
        c(this.f7613a, vfyVar);
    }

    private void c(View view, final vfy vfyVar) {
        view.setOnClickListener(new View.OnClickListener() { // from class: fuk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f34584a.c(vfyVar, view2);
            }
        });
    }

    public /* synthetic */ void c(vfy vfyVar, View view) {
        ezn.a(this.f7613a, this.g.getMeasuredWidth(), this.f7614b, this.f7615c, vfyVar);
    }

    private void b() {
        int iC = ift.c();
        LogUtil.a("Suggestion_MemberPlanSection", "today of week:", Integer.valueOf(iC));
        FrameLayout frameLayout = (FrameLayout) this.v.findViewById(R.id.week_monday_layout);
        HealthTextView healthTextView = (HealthTextView) this.v.findViewById(R.id.week_monday);
        FrameLayout frameLayout2 = (FrameLayout) this.v.findViewById(R.id.week_tuesday_layout);
        HealthTextView healthTextView2 = (HealthTextView) this.v.findViewById(R.id.week_tuesday);
        FrameLayout frameLayout3 = (FrameLayout) this.v.findViewById(R.id.week_wed_layout);
        HealthTextView healthTextView3 = (HealthTextView) this.v.findViewById(R.id.week_wed);
        FrameLayout frameLayout4 = (FrameLayout) this.v.findViewById(R.id.week_thur_layout);
        HealthTextView healthTextView4 = (HealthTextView) this.v.findViewById(R.id.week_thur);
        FrameLayout frameLayout5 = (FrameLayout) this.v.findViewById(R.id.week_fri_layout);
        HealthTextView healthTextView5 = (HealthTextView) this.v.findViewById(R.id.week_friday);
        FrameLayout frameLayout6 = (FrameLayout) this.v.findViewById(R.id.week_sat_layout);
        HealthTextView healthTextView6 = (HealthTextView) this.v.findViewById(R.id.week_sat);
        FrameLayout[] frameLayoutArr = {frameLayout, frameLayout2, frameLayout3, frameLayout4, frameLayout5, frameLayout6, (FrameLayout) this.v.findViewById(R.id.week_sun_layout)};
        HealthTextView[] healthTextViewArr = {healthTextView, healthTextView2, healthTextView3, healthTextView4, healthTextView5, healthTextView6, (HealthTextView) this.v.findViewById(R.id.week_sun)};
        if (iC > 0 && iC <= 7) {
            int i = iC - 1;
            FrameLayout frameLayout7 = frameLayoutArr[i];
            if (frameLayout7 != null) {
                frameLayout7.setBackground(qre.c(R.drawable.circle_primary_shape));
            }
            HealthTextView healthTextView7 = healthTextViewArr[i];
            if (healthTextView7 != null) {
                healthTextView7.setTextColor(qre.e(R.color.textColorPrimaryInverse));
            }
        }
        int i2 = 0;
        if (!LanguageUtil.f(this.j)) {
            while (i2 < 7) {
                healthTextViewArr[i2].setTextSize(1, 10.0f);
                i2++;
            }
        } else if (qrs.y()) {
            while (i2 < 7) {
                healthTextViewArr[i2].setTextSize(1, 12.0f);
                i2++;
            }
        }
    }

    private void setRecommendCardClickListener(HashMap<String, Object> map) {
        ImageView imageView = this.d;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.knit.section.view.MemberPlanSection.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    fcn.k();
                    MemberPlanSection.this.x.setVisibility(8);
                    SharedPreferenceManager.e(MemberPlanSection.this.j, Integer.toString(10000), "KEY_CLOSED_PLAN_CARD", "true", null);
                }
            });
        }
        if (this.k != null) {
            View.OnClickListener onClickListenerC = c(map, "CREATE_AI_FITNESS_CLICK");
            if (onClickListenerC != null) {
                this.k.setOnClickListener(onClickListenerC);
            } else {
                LogUtil.e("Suggestion_MemberPlanSection", "create plan click null.");
            }
        }
    }

    private void setCommonPlanLayout(HashMap<String, Object> map) {
        this.y.setVisibility(8);
        this.o.setVisibility(8);
        this.e.setVisibility(0);
        this.m.setVisibility(0);
        View.OnClickListener onClickListenerC = c(map, "GO_TO_SPORT_CLICK");
        if (onClickListenerC != null) {
            this.m.setOnClickListener(onClickListenerC);
        }
        float fE = qqw.e((Map) map, "FINISH_RATE", 0.0f);
        String strC = gzx.c(this.j, R.string.IDS_plan_finish_percent, UnitUtil.e(fE, 2, 1));
        if (LanguageUtil.e(this.j)) {
            strC = strC.replace("%", " %");
        }
        d(qqw.e((Map) map, "BEGIN_DATE", 0L), qqw.c(map, "TOTAL_DAY", 0), strC);
        if (fE > 0.0f && fE <= 6.0f) {
            this.m.setProgress(6);
        } else {
            this.m.setProgress(Math.round(fE));
        }
    }

    private void d(long j, int i, String str) {
        String strB;
        long j2 = j * 1000;
        int iA = (int) (((ift.a(System.currentTimeMillis()) / 86400000) - (j2 / 86400000)) + 1);
        if (iA > i) {
            iA = i;
        }
        if (iA <= 0) {
            strB = BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_plan_start_date, DateUtils.formatDateTime(BaseApplication.getContext(), j2, 24));
        } else {
            strB = gzx.b(this.j, iA, i, 0);
        }
        this.e.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_run_plan_calendar_title, strB, str));
    }

    private List<a> c(HashMap<String, Object> map) {
        boolean z;
        String strD = qqw.d((Map) map, "GO_TO_SPORT_TIP", "");
        boolean zA = qqw.a(map, "IS_VIP_EXPIRED", false);
        int iC = qqw.c(map, "INT_PLAN_TYPE", IntPlan.PlanType.NA_PLAN.getType());
        String strD2 = qqw.d((Map) map, "PLAN_NAME", "");
        float fE = qqw.e((Map) map, "FINISH_RATE", 0.0f);
        if (zA && iC == IntPlan.PlanType.AI_FITNESS_PLAN.getType()) {
            b(3, strD2, (int) fE);
            z = true;
        } else {
            b(1, strD2, (int) fE);
            z = false;
        }
        a aVar = new a(R.drawable.ic_workout, this.j.getString(R.string.IDS_health_model_card_dialog_go_exercise), strD.equals(this.j.getString(R.string.IDS_sport_task_finished)), strD, z, c(map, "GO_TO_SPORT_CLICK"), true);
        a aVar2 = new a(R.drawable.ic_set_diet_record, this.j.getString(R.string.IDS_record_diet), false, qqw.d((Map) map, "DIET_TIP", ""), false, c(map, "DIET_CLICK"), true);
        String strD3 = qqw.d((Map) map, "RECIPE_TIP", "");
        View.OnClickListener onClickListenerC = c(map, "RECIPE_CLICK");
        a aVarA = a(map);
        a aVar3 = new a(R.drawable.ic_look_menu, this.j.getString(R.string.IDS_look_recipe), false, strD3, zA, onClickListenerC, aVarA != null);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(aVar);
        arrayList.add(aVar2);
        arrayList.add(aVar3);
        if (aVarA != null) {
            arrayList.add(aVarA);
        }
        return arrayList;
    }

    private a a(HashMap<String, Object> map) {
        String string;
        int iC = qqw.c(map, "FASTING_LITE_TYPE", 0);
        long jE = qqw.e((Map) map, "FASTING_LITE_VALUE", 0L);
        if (iC == 0) {
            return null;
        }
        View.OnClickListener onClickListenerC = c(map, "FASTING_LITE_CLICK");
        if (jE == 0) {
            string = BaseApplication.getContext().getString(iC);
        } else {
            string = BaseApplication.getContext().getString(iC, UnitUtil.e((int) (jE / 1000)));
        }
        a aVar = new a(R.drawable.ic_lightfasting, this.j.getString(R.string.IDS_wl_food_entrance_light_f), false, string, false, onClickListenerC, false);
        aVar.j = iC;
        aVar.f7617a = jE;
        return aVar;
    }

    private View.OnClickListener c(HashMap<String, Object> map, String str) {
        Object objB = qqw.b(map, str, null);
        if (objB instanceof View.OnClickListener) {
            return (View.OnClickListener) objB;
        }
        return null;
    }

    static class d extends CountDownTimer {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7624c;
        private WeakReference<HealthTextView> d;

        d(HealthTextView healthTextView, int i, long j, long j2) {
            super(j, j2);
            LogUtil.a("Suggestion_MemberPlanSection", "FastingCountDownTimer create.", Long.valueOf(j));
            this.d = new WeakReference<>(healthTextView);
            this.f7624c = i;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            HealthTextView healthTextView = this.d.get();
            if (healthTextView == null) {
                LogUtil.j("Suggestion_MemberPlanSection", "healthTextView == null");
            } else {
                healthTextView.setText(BaseApplication.getContext().getString(this.f7624c, UnitUtil.e((int) (j / 1000))));
            }
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            LogUtil.a("Suggestion_MemberPlanSection", "finish.");
        }
    }

    static class e extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<a> f7625b = new ArrayList();
        private Context e;

        e(Context context) {
            this.e = context;
        }

        void d(List<a> list) {
            DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new c(this.f7625b, list));
            this.f7625b = list;
            diffResultCalculateDiff.dispatchUpdatesTo(this);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b onCreateViewHolder(ViewGroup viewGroup, int i) {
            LogUtil.a("Suggestion_MemberPlanSection", "onCreateViewHolder.", Integer.valueOf(i));
            return new b(LayoutInflater.from(this.e).inflate(R.layout.today_suggestion_item_layout, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(b bVar, int i) {
            if (njy.e(this.f7625b, i)) {
                LogUtil.e("Suggestion_MemberPlanSection", "onBindViewHolder error,", Integer.valueOf(i));
                return;
            }
            LogUtil.a("Suggestion_MemberPlanSection", "onBindViewHolder.", Integer.valueOf(i), bVar.g.getText());
            bVar.a(this.f7625b.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f7625b.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(b bVar) {
            super.onViewRecycled(bVar);
            LogUtil.a("Suggestion_MemberPlanSection", "onViewRecycled.", bVar.g.getText(), " ", Boolean.valueOf(bVar.e == null));
            bVar.b();
        }
    }

    static class c extends DiffUtil.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<a> f7623b;
        private List<a> e;

        c(List<a> list, List<a> list2) {
            this.e = list;
            this.f7623b = list2;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getOldListSize() {
            List<a> list = this.e;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getNewListSize() {
            List<a> list = this.f7623b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int i, int i2) {
            String str;
            return (njy.e(this.e, i) || njy.e(this.f7623b, i) || (str = this.e.get(i).g) == null || !str.equals(this.f7623b.get(i2).g)) ? false : true;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int i, int i2) {
            if (njy.e(this.e, i) || njy.e(this.f7623b, i)) {
                return false;
            }
            a aVar = this.e.get(i);
            a aVar2 = this.f7623b.get(i2);
            if (aVar == null || aVar2 == null) {
                return false;
            }
            return peh.c(aVar).equals(peh.c(aVar2));
        }
    }

    static class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ImageView f7620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ConstraintLayout f7621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private HealthDivider f7622c;
        private ImageView d;
        private CountDownTimer e;
        private HealthTextView f;
        private HealthTextView g;
        private ImageView i;
        private ImageView j;

        b(View view) {
            super(view);
            this.f7621b = (ConstraintLayout) view.findViewById(R.id.suggestion_item);
            this.d = (ImageView) view.findViewById(R.id.suggestion_icon);
            this.g = (HealthTextView) view.findViewById(R.id.suggestion_text);
            this.f7620a = (ImageView) view.findViewById(R.id.finish_icon);
            this.f = (HealthTextView) view.findViewById(R.id.suggestion_value);
            this.j = (ImageView) view.findViewById(R.id.right_icon);
            this.i = (ImageView) view.findViewById(R.id.locked_icon);
            this.f7622c = (HealthDivider) view.findViewById(R.id.suggestion_item_divider);
        }

        void a(a aVar) {
            this.d.setImageResource(aVar.f7619c);
            this.g.setText(aVar.g);
            if (aVar.f == null) {
                this.f7621b.setVisibility(8);
            } else {
                this.f.setText(aVar.f);
            }
            if (aVar.e) {
                this.f7620a.setVisibility(0);
            } else {
                this.f7620a.setVisibility(8);
            }
            e(aVar.d);
            if (aVar.i != null) {
                this.f7621b.setOnClickListener(aVar.i);
            }
            if (aVar.f7618b) {
                this.f7622c.setVisibility(0);
            } else {
                this.f7622c.setVisibility(8);
            }
            if (aVar.j != 0) {
                if (aVar.f7617a != 0) {
                    d(aVar.j, aVar.f7617a);
                } else {
                    this.f.setText(BaseApplication.getContext().getString(aVar.j));
                }
            }
        }

        private void e(boolean z) {
            if (z) {
                this.i.setVisibility(0);
                this.j.setVisibility(8);
            } else {
                this.j.setImageDrawable(fya.c());
                this.i.setVisibility(8);
                this.j.setVisibility(0);
            }
        }

        private void d(int i, long j) {
            CountDownTimer countDownTimer = this.e;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.e = null;
            }
            this.e = new d(this.f, i, j, 1000L).start();
        }

        public void b() {
            CountDownTimer countDownTimer = this.e;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.e = null;
            }
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f7617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f7618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f7619c;
        private boolean d;
        private boolean e;
        private String f;
        private String g;
        private View.OnClickListener i;
        private int j;

        a(int i, String str, boolean z, String str2, boolean z2, View.OnClickListener onClickListener, boolean z3) {
            this.f7619c = i;
            this.g = str;
            this.e = z;
            this.f = str2;
            this.d = z2;
            this.i = onClickListener;
            this.f7618b = z3;
        }
    }
}
