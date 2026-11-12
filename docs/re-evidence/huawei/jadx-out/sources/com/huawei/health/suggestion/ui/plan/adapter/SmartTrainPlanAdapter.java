package com.huawei.health.suggestion.ui.plan.adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.plan.aicoach.ControlTypeEnum;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.plan.model.trainingplan.SmartPlanTypeEnum;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder;
import com.huawei.health.suggestion.ui.plan.adapter.SmartTrainPlanAdapter;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.utils.RiskBiAnalytics;
import defpackage.btq;
import defpackage.btw;
import defpackage.bue;
import defpackage.ddv;
import defpackage.gfl;
import defpackage.gfo;
import defpackage.gfs;
import defpackage.gfv;
import defpackage.gnf;
import defpackage.gng;
import defpackage.gnj;
import defpackage.gnm;
import defpackage.gzx;
import defpackage.hqp;
import defpackage.ibk;
import defpackage.ied;
import defpackage.ioy;
import defpackage.lsl;
import defpackage.lsx;
import defpackage.pcd;
import defpackage.pce;
import defpackage.pea;
import defpackage.qey;
import defpackage.qfg;
import defpackage.qfk;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrh;
import defpackage.qri;
import defpackage.qrr;
import health.compact.a.CommonUtils;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class SmartTrainPlanAdapter extends RecyclerView.Adapter<AbsFitnessViewHolder<Object>> {
    private static String h;
    private final Context f;
    private final LayoutInflater i;
    private List<ibk> j = new ArrayList();
    private static final Map<Integer, String> d = new HashMap<Integer, String>() { // from class: com.huawei.health.suggestion.ui.plan.adapter.SmartTrainPlanAdapter.3
        {
            put(6, qre.a(R.string.IDS_train_plan_course_level1, UnitUtil.e(1.0d, 1, 0)));
            put(0, qre.a(R.string.IDS_train_plan_course_level2, UnitUtil.e(2.0d, 1, 0)));
            put(1, qre.a(R.string.IDS_train_plan_course_level3, UnitUtil.e(3.0d, 1, 0)));
            put(2, qre.a(R.string.IDS_train_plan_course_level4, UnitUtil.e(4.0d, 1, 0)));
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, Integer> f9646c = new HashMap<Integer, Integer>() { // from class: com.huawei.health.suggestion.ui.plan.adapter.SmartTrainPlanAdapter.1
        {
            put(6, Integer.valueOf(qre.e(R.color.train_plan_course_bg_level1)));
            put(0, Integer.valueOf(qre.e(R.color.train_plan_course_bg_level2)));
            put(1, Integer.valueOf(qre.e(R.color.train_plan_course_bg_level3)));
            put(2, Integer.valueOf(qre.e(R.color.train_plan_course_bg_level4)));
        }
    };
    private static final Map<Integer, Integer> g = new HashMap<Integer, Integer>() { // from class: com.huawei.health.suggestion.ui.plan.adapter.SmartTrainPlanAdapter.2
        {
            put(6, Integer.valueOf(qre.e(R.color.train_plan_course_line_bg_level1)));
            put(0, Integer.valueOf(qre.e(R.color.train_plan_course_line_bg_level2)));
            put(1, Integer.valueOf(qre.e(R.color.train_plan_course_line_bg_level3)));
            put(2, Integer.valueOf(qre.e(R.color.train_plan_course_line_bg_level4)));
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f9645b = {qre.e(R.color.train_weight_plan_button_vip_bg1), qre.e(R.color.train_weight_plan_button_vip_bg2), qre.e(R.color.train_weight_plan_button_vip_bg3), qre.e(R.color.train_weight_plan_button_vip_bg4), qre.e(R.color.train_weight_plan_button_vip_bg5), qre.e(R.color.train_weight_plan_button_vip_bg6)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f9644a = {qre.e(R.color.train_weight_plan_button_vip_color1), qre.e(R.color.train_weight_plan_button_vip_color2), qre.e(R.color.train_weight_plan_button_vip_color3), qre.e(R.color.train_weight_plan_button_vip_color4), qre.e(R.color.train_weight_plan_button_vip_color5), qre.e(R.color.train_weight_plan_button_vip_color6)};
    private static final float[] e = {0.0f, 0.16f, 0.33f, 0.5f, 0.67f, 0.83f};

    public SmartTrainPlanAdapter(Context context) {
        this.f = context;
        this.i = LayoutInflater.from(context);
    }

    public void d(List<ibk> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.j = list;
        notifyDataSetChanged();
    }

    public void b(Boolean bool, Float f, String str) {
        if (CollectionUtils.a(this.j)) {
            LogUtil.j("Suggestion_SmartTrainPlanAdapter", "setWeightPlanVipInfo mDataArray empty");
            return;
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            ibk ibkVar = this.j.get(i2);
            if (ibkVar.b() == 6 && (ibkVar.c() instanceof hqp)) {
                hqp hqpVar = (hqp) ibkVar.c();
                if (bool != null) {
                    hqpVar.c(bool.booleanValue());
                }
                if (f != null) {
                    hqpVar.b(f.floatValue());
                }
                if (!TextUtils.isEmpty(str) && hqpVar.g() != null) {
                    hqpVar.g().c(str);
                }
                notifyItemChanged(i2);
                LogUtil.a("Suggestion_SmartTrainPlanAdapter", "setWeightPlanInfo:", bool, " currentWeight:", f, " name:", str);
                return;
            }
        }
    }

    public void d(String str) {
        if (CollectionUtils.a(this.j)) {
            LogUtil.j("Suggestion_SmartTrainPlanAdapter", "setMatchDayText mDataArray empty");
            return;
        }
        for (int i2 = 0; i2 < this.j.size(); i2++) {
            ibk ibkVar = this.j.get(i2);
            if (ibkVar.b() == 2 && (ibkVar.c() instanceof hqp)) {
                hqp hqpVar = (hqp) ibkVar.c();
                if (hqpVar.a()) {
                    hqpVar.c(str);
                    notifyItemChanged(i2);
                    LogUtil.a("Suggestion_SmartTrainPlanAdapter", "setMatchDayText");
                    return;
                }
            }
        }
    }

    public void c(List<ibk> list) {
        List<ibk> arrayList = this.j;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.j = arrayList;
        arrayList.removeIf(new Predicate() { // from class: hqc
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return SmartTrainPlanAdapter.d((ibk) obj);
            }
        });
        List<ibk> list2 = this.j;
        if (list == null) {
            list = new ArrayList<>();
        }
        list2.addAll(list);
        notifyDataSetChanged();
    }

    public static /* synthetic */ boolean d(ibk ibkVar) {
        return 4 == ibkVar.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbsFitnessViewHolder<Object> onCreateViewHolder(ViewGroup viewGroup, int i2) {
        switch (i2) {
            case 0:
                return new d(this.i.inflate(R.layout.sug_smart_train_plan_item_view, viewGroup, false));
            case 1:
                return new e(this.i.inflate(R.layout.sug_smart_train_plan_card_item_view, viewGroup, false));
            case 2:
                return new a(this.i.inflate(R.layout.sug_smart_train_plan_top_item_view, viewGroup, false));
            case 3:
                return new b(this.i.inflate(R.layout.sug_smart_train_plan_bottom_item_view, viewGroup, false));
            case 4:
                return new j(new FrameLayout(this.f));
            case 5:
                return new c(this.i.inflate(R.layout.sug_smart_train_plan_courses_today_item_view, viewGroup, false));
            case 6:
                return new h(this.i.inflate(R.layout.sug_smart_weight_plan_card_item_view, viewGroup, false));
            default:
                return new i(this.i.inflate(R.layout.sug_smart_train_plan_item_view, viewGroup, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(AbsFitnessViewHolder<Object> absFitnessViewHolder, int i2) {
        absFitnessViewHolder.d(this.j.get(i2).c());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.j.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
        return this.j.get(i2).b();
    }

    static class i extends AbsFitnessViewHolder<Object> {
        @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
        /* JADX INFO: renamed from: init */
        public void d(Object obj) {
        }

        public i(View view) {
            super(view);
        }
    }

    static class j extends AbsFitnessViewHolder<Object> {
        public j(View view) {
            super(view);
        }

        @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
        /* JADX INFO: renamed from: init */
        public void d(Object obj) {
            if ((obj instanceof View) && (this.itemView instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) this.itemView;
                viewGroup.removeAllViews();
                viewGroup.addView((View) obj);
            }
        }
    }

    public static class h extends AbsFitnessViewHolder<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f9658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HealthTextView f9659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HealthTextView f9660c;
        private final LinearLayout d;
        private final LinearLayout e;
        private final HealthTextView f;
        private final HealthTextView g;
        private final HealthProgressBar h;
        private final HealthTextView i;
        private final HealthTextView j;
        private final HealthTextView l;
        private final HealthTextView m;
        private final HealthTextView n;
        private final HealthTextView o;

        public h(View view) {
            super(view);
            this.i = (HealthTextView) view.findViewById(R.id.weight_plan_card_name);
            this.g = (HealthTextView) view.findViewById(R.id.weight_plan_card_week);
            this.h = (HealthProgressBar) view.findViewById(R.id.weight_plan_card_progress_bar);
            this.f = (HealthTextView) view.findViewById(R.id.weight_plan_card_progress);
            this.f9659b = (HealthTextView) view.findViewById(R.id.weight_plan_card_current_time);
            this.j = (HealthTextView) view.findViewById(R.id.weight_plan_card_goal_time);
            this.m = (HealthTextView) view.findViewById(R.id.weight_plan_card_current);
            this.n = (HealthTextView) view.findViewById(R.id.weight_plan_card_goal);
            this.l = (HealthTextView) view.findViewById(R.id.weight_plan_card_reduce);
            this.o = (HealthTextView) view.findViewById(R.id.weight_plan_card_reduced_text);
            this.e = (LinearLayout) view.findViewById(R.id.weight_plan_lock_layout);
            this.d = (LinearLayout) view.findViewById(R.id.weight_plan_lock_button_layout);
            this.f9660c = (HealthTextView) view.findViewById(R.id.weight_plan_lock_button);
            this.f9658a = view.findViewById(R.id.weight_plan_lock_mask_view);
            HealthImageView healthImageView = (HealthImageView) view.findViewById(R.id.weight_plan_card_arrow1);
            HealthImageView healthImageView2 = (HealthImageView) view.findViewById(R.id.weight_plan_card_arrow2);
            Drawable drawableC = qqz.c(view.getContext(), R.drawable.sug_smart_weight_plan_arrow);
            healthImageView.setImageDrawable(drawableC);
            healthImageView2.setImageDrawable(drawableC);
        }

        @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
        /* JADX INFO: renamed from: init */
        public void d(Object obj) {
            String str;
            double dA;
            if (obj instanceof hqp) {
                hqp hqpVar = (hqp) obj;
                qey qeyVarG = hqpVar.g();
                if (qeyVarG == null) {
                    LogUtil.j("Suggestion_SmartTrainPlanAdapter", "SmartWeightPlanCardViewHolder planDetailBean is null");
                    return;
                }
                gnj gnjVar = (gnj) HiJsonUtil.d(qeyVarG.a(), gnj.class);
                this.i.setText(qeyVarG.g());
                long jD = DateFormatUtil.d(qeyVarG.i());
                long jD2 = DateFormatUtil.d(qeyVarG.b());
                lsl.z(jD2);
                boolean zAb = lsl.ab(jD);
                int iE = lsl.e(jD, jD2);
                int iE2 = lsl.e(jD, System.currentTimeMillis());
                int iA = lsl.a(jD, jD2);
                int iAbs = Math.abs(lsl.a(jD, System.currentTimeMillis()));
                if (!CollectionUtils.a(qeyVarG.j()) && qeyVarG.j().get(0) != null) {
                    String strE = qeyVarG.j().get(0).e();
                    dA = CommonUtils.a(strE);
                    str = strE;
                } else {
                    str = "";
                    dA = 0.0d;
                }
                if (zAb) {
                    this.g.setText(qre.e(R.plurals.IDS_competition_start_content, iE, Integer.valueOf(iE)));
                } else {
                    e(iAbs, iA, iE2, iE, str);
                }
                c(hqpVar.i());
                double dA2 = (gnjVar == null || gnjVar.c() == null) ? 0.0d : gnjVar.c().a();
                c(e(dA2), e(hqpVar.c()), e(dA));
                b(dA2, hqpVar.c(), dA);
                e(hqpVar.i());
                if (this.i.getParent() instanceof View) {
                    ((View) this.i.getParent()).setPadding(0, 0, 0, hqpVar.i() ? qre.b(R.dimen.health_common_28dp) : 0);
                }
            }
        }

        private void e(int i, int i2, int i3, int i4, String str) {
            int i5;
            if (i2 > 30) {
                i2 = i4;
                i5 = R.plurals.IDS_smart_weight_plan_week_content;
                i = i3;
            } else {
                i5 = R.plurals.IDS_smart_weight_plan_day_content;
            }
            String strE = UnitUtil.e(i, 1, 0);
            String strE2 = qre.e(i5, i, strE, UnitUtil.e(i2, 1, 0));
            double dE = e(CommonUtils.a(str));
            String strC = UnitUtil.c(dE, 1, 1, 2, null);
            SpannableString spannableString = new SpannableString(qre.a(R.string.IDS_smart_weight_plan_week_text, strE2, qre.e(c(), UnitUtil.b(dE, Locale.getDefault()), strC)));
            qri.a(spannableString, strE, new StyleSpan(1));
            qri.b(spannableString, strE, R.color.sleep_entry_card_text_color_90alpha);
            qri.a(spannableString, strC, new StyleSpan(1));
            qri.b(spannableString, strC, R.color.sleep_entry_card_text_color_90alpha);
            this.g.setText(spannableString);
        }

        private void b(double d, double d2, double d3) {
            double dB = btw.b(d, d2, d3);
            this.h.setProgress((int) Math.round(dB));
            this.f.setText(qre.a(R.string.IDS_competition_progress, UnitUtil.c(dB, 2, 0, 1, null)));
        }

        private void c(boolean z) {
            if (z) {
                this.itemView.setOnClickListener(new View.OnClickListener() { // from class: hqn
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f37057c.e(view);
                    }
                });
            }
        }

        public /* synthetic */ void e(View view) {
            bue.c(this.itemView.getContext());
            ddv.b().loadH5ProApp(this.itemView.getContext(), "com.huawei.health.h5.ai-weight", new H5ProLaunchOption.Builder().addPath("#/main_page_new"));
        }

        private void c(double d, double d2, double d3) {
            int i;
            int iCompare = Double.compare(d, d2);
            if (iCompare == 0) {
                this.l.setText(qre.f(R.string.IDS_smart_weight_plan_reduce_text));
                this.o.setBackgroundResource(R.drawable.sug_weight_plan_equal_bg);
                this.o.setTextColor(qre.e(R.color.sleep_entry_card_text_color_90alpha));
                i = R.color.font_secondary;
            } else if (iCompare < 0) {
                this.l.setText(qre.f(R.string.IDS_smart_weight_plan_increase_text));
                this.o.setBackgroundResource(R.drawable.sug_weight_plan_increase_bg);
                this.o.setTextColor(qre.e(R.color.train_plan_course_line_bg_level4));
                i = R.color.train_plan_course_line_bg_level4;
            } else {
                this.l.setText(qre.f(R.string.IDS_smart_weight_plan_reduce_text));
                this.o.setBackgroundResource(R.drawable.sug_weight_plan_reduce_bg);
                this.o.setTextColor(qre.e(R.color.white));
                i = R.color.white;
            }
            this.m.setText(qre.f(R.string.IDS_smart_weight_plan_start_weight));
            this.f9659b.setText(e(d, 0));
            if (iCompare == 0) {
                this.n.setText(qre.f(R.string.IDS_smart_weight_plan_target_weight));
                this.j.setText(e(d3, 0));
            } else {
                this.n.setText(qre.f(R.string.IDS_smart_weight_plan_current_weight));
                this.j.setText(e(d2, 0));
            }
            this.o.setText(e(Math.abs(d2 - d), i));
        }

        private double e(double d) {
            return UnitUtil.b(d, 2);
        }

        private int c() {
            int iE = UnitUtil.e();
            if (iE == 1) {
                return R.plurals.IDS_health_catty;
            }
            if (iE == 3) {
                return R.plurals.IDS_lb_string;
            }
            return R.plurals.IDS_kg_string;
        }

        private SpannableString e(double d, int i) {
            if (i == 0) {
                i = R.color.legal_un_clickable_color;
            }
            String strC = UnitUtil.c(d, 1, 1, 2, null);
            SpannableString spannableString = new SpannableString(qre.e(c(), UnitUtil.b(d, Locale.getDefault()), strC));
            qri.d(spannableString, strC.length(), spannableString.length(), new StyleSpan(0));
            qri.d(spannableString, strC.length(), spannableString.length(), new AbsoluteSizeSpan(qre.b(R.dimen.health_common_10sp)));
            qri.d(spannableString, strC.length(), spannableString.length(), new ForegroundColorSpan(qre.e(i)));
            return spannableString;
        }

        private void e(boolean z) {
            if (z) {
                this.f9658a.setVisibility(8);
                this.e.setVisibility(8);
                return;
            }
            this.f9658a.setVisibility(0);
            this.e.setVisibility(0);
            this.d.setBackground(SmartTrainPlanAdapter.e(this.itemView.getContext(), SmartTrainPlanAdapter.f9645b, R.dimen.health_common_20dp));
            SmartTrainPlanAdapter.d(this.f9660c);
            this.d.setOnClickListener(new View.OnClickListener() { // from class: hql
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SmartTrainPlanAdapter.h.d(view);
                }
            });
        }

        public static /* synthetic */ void d(View view) {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, new Uri.Builder().scheme("huaweischeme").authority("healthapp").path("column").appendQueryParameter("module", "vipTypeSelect").build());
            intent.setFlags(268435456);
            intent.setPackage(BaseApplication.getContext().getPackageName());
            lsx.c(intent, BaseApplication.getContext());
        }
    }

    public static class c extends AbsFitnessViewHolder<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HealthImageView f9649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HealthImageView f9650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HealthImageView f9651c;
        private final ConstraintLayout d;
        private final HealthTextView e;
        private final HealthTextView g;
        private final View h;
        private final PlanApi i;

        public c(View view) {
            super(view);
            this.d = (ConstraintLayout) view.findViewById(R.id.plan_course_content);
            this.f9650b = (HealthImageView) view.findViewById(R.id.plan_course_image);
            this.g = (HealthTextView) view.findViewById(R.id.plan_course_name);
            this.e = (HealthTextView) view.findViewById(R.id.plan_course_desc);
            this.h = view.findViewById(R.id.plan_course_line);
            this.f9649a = (HealthImageView) view.findViewById(R.id.plan_course_arrow);
            this.f9651c = (HealthImageView) view.findViewById(R.id.plan_course_clock);
            this.i = (PlanApi) Services.d("CoursePlanService", PlanApi.class);
        }

        @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
        /* JADX INFO: renamed from: init */
        public void d(Object obj) {
            if (!(obj instanceof qfk)) {
                LogUtil.j("Suggestion_SmartTrainPlanAdapter", "data instanceof ScheduleDetail false");
                return;
            }
            qfk qfkVar = (qfk) obj;
            qfg qfgVar = CollectionUtils.a(qfkVar.n()) ? null : qfkVar.n().get(0);
            if (qfgVar == null) {
                LogUtil.j("Suggestion_SmartTrainPlanAdapter", "scheduleObjectiveInfoBean is null");
                return;
            }
            pce pceVar = (pce) HiJsonUtil.d(qfgVar.d(), pce.class);
            pce.d dVarD = pceVar != null ? pceVar.d() : null;
            if (dVarD == null) {
                LogUtil.j("Suggestion_SmartTrainPlanAdapter", "resource is null");
                return;
            }
            pceVar.d(DateFormatUtil.d(qfkVar.s()));
            pceVar.e(dVarD.g());
            b(qfkVar, pceVar, dVarD);
            this.g.setText(dVarD.j());
            this.f9650b.setImageResource(Objects.equals(qfgVar.a(), "aerobicCourse") ? R.drawable.sug_train_plan_course_running : R.drawable.sug_train_plan_course_strength);
            boolean z = ied.e() == 0;
            int iC = (!z || dVarD.b() == 0) ? dVarD.c() : dVarD.b();
            long jI = (!z || dVarD.f() == 0) ? dVarD.i() : dVarD.f();
            long jE = (!z || dVarD.d() == 0) ? dVarD.e() : dVarD.d();
            Integer num = (Integer) SmartTrainPlanAdapter.f9646c.get(Integer.valueOf(iC));
            Integer num2 = (Integer) SmartTrainPlanAdapter.g.get(Integer.valueOf(iC));
            this.d.setBackgroundColor(num != null ? num.intValue() : 0);
            this.h.setBackgroundColor(num2 != null ? num2.intValue() : 0);
            c(iC, jI, jE);
            PlanApi planApi = this.i;
            if (planApi != null && planApi.getCompletionStatus(qfkVar.y()) == 1) {
                this.f9651c.setVisibility(0);
                this.f9649a.setVisibility(8);
            } else {
                this.f9651c.setVisibility(8);
                this.f9649a.setVisibility(0);
            }
        }

        private void c(int i, long j, long j2) {
            String str = (String) SmartTrainPlanAdapter.d.getOrDefault(Integer.valueOf(i), "");
            int iRound = Math.round(j / 60.0f);
            int iRound2 = Math.round((j2 * ioy.b()) / 1000.0f);
            this.e.setText(qre.a(R.string.IDS_competition_three_status_text, str, gzx.d(R.plurals.IDS_plugin_fitnessadvice_min, iRound, UnitUtil.e(iRound, 1, 0)), gzx.d(R.plurals.sug_chart_kcals, iRound2, UnitUtil.e(iRound2, 1, 0))));
        }

        private void b(qfk qfkVar, final pce pceVar, final pce.d dVar) {
            if (qfkVar == null || pceVar == null || dVar == null) {
                LogUtil.j("Suggestion_SmartTrainPlanAdapter", "taskScheduleBean or courseBean or resource is null");
            } else {
                this.itemView.setOnClickListener(new View.OnClickListener() { // from class: hqm
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SmartTrainPlanAdapter.c.b(dVar, pceVar, view);
                    }
                });
            }
        }

        public static /* synthetic */ void b(pce.d dVar, pce pceVar, View view) {
            if (Objects.equals(dVar.h(), "0")) {
                pcd pcdVar = new pcd(dVar.g());
                pcdVar.a("10");
                pcdVar.f(SmartTrainPlanAdapter.h);
                pcdVar.e(pceVar.b());
                pea.a(BaseApplication.getContext(), pcdVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("entrance", "entrance_custom_course");
            bundle.putString(pea.f45230a, HiJsonUtil.d(pceVar));
            bundle.putString("promoteTag", SmartTrainPlanAdapter.h);
            AppRouter.c("/PluginFitnessAdvice/TrainDetail").d(bundle).i();
        }
    }

    static class a extends AbsFitnessViewHolder<Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HealthTextView f9648c;

        public a(View view) {
            super(view);
            this.f9648c = (HealthTextView) view.findViewById(R.id.train_plan_top_text);
        }

        @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
        /* JADX INFO: renamed from: init */
        public void d(Object obj) {
            String str;
            int iB;
            int iE;
            ViewGroup.LayoutParams layoutParams = this.f9648c.getLayoutParams();
            if (obj instanceof String) {
                layoutParams.width = -1;
                str = (String) obj;
                iB = qre.b(R.dimen.health_common_4dp);
                iE = 0;
            } else if (!(obj instanceof hqp)) {
                str = "";
                iB = 0;
                iE = 0;
            } else {
                hqp hqpVar = (hqp) obj;
                String strJ = hqpVar.j();
                iE = hqpVar.e();
                layoutParams.width = hqpVar.d() ? -1 : -2;
                str = strJ;
                iB = 0;
            }
            this.f9648c.setPadding(qre.b(R.dimen.health_common_16dp), qre.b(R.dimen.health_common_12dp), qre.b(R.dimen.health_common_16dp), iB);
            this.f9648c.setLayoutParams(layoutParams);
            this.f9648c.setText(str);
            this.f9648c.setCompoundDrawablesWithIntrinsicBounds(iE, 0, 0, 0);
        }
    }

    public static class e extends AbsFitnessViewHolder<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HealthButton f9655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HealthButton f9656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final LinearLayout f9657c;
        private final View d;
        private final LinearLayout e;
        private final HealthTextView f;
        private final HealthTextView g;
        private final HealthTextView h;
        private final HealthTextView i;
        private final HealthTextView j;
        private final HealthTextView k;
        private final HealthTextView l;
        private final HealthTextView m;
        private final HealthTextView n;
        private final HealthProgressBar o;
        private final HealthImageView r;

        public static /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        }

        public e(View view) {
            super(view);
            this.j = (HealthTextView) view.findViewById(R.id.train_plan_card_name);
            this.n = (HealthTextView) view.findViewById(R.id.train_plan_card_week);
            this.o = (HealthProgressBar) view.findViewById(R.id.train_plan_card_progress_bar);
            this.i = (HealthTextView) view.findViewById(R.id.train_plan_card_progress);
            this.g = (HealthTextView) view.findViewById(R.id.train_plan_card_current_time);
            this.h = (HealthTextView) view.findViewById(R.id.train_plan_card_goal_time);
            this.k = (HealthTextView) view.findViewById(R.id.running_plan_card_current);
            this.m = (HealthTextView) view.findViewById(R.id.running_plan_card_goal);
            this.l = (HealthTextView) view.findViewById(R.id.train_plan_card_performance);
            this.f9657c = (LinearLayout) view.findViewById(R.id.train_plan_card_middle);
            this.d = view.findViewById(R.id.train_plan_card_bottom);
            this.e = (LinearLayout) view.findViewById(R.id.lock_layout);
            this.f9656b = (HealthButton) view.findViewById(R.id.button_one);
            this.f9655a = (HealthButton) view.findViewById(R.id.button_two);
            this.r = (HealthImageView) view.findViewById(R.id.train_plan_card_cancel);
            this.f = (HealthTextView) view.findViewById(R.id.lock_text);
            ((HealthImageView) view.findViewById(R.id.running_plan_card_arrow)).setImageDrawable(qqz.c(view.getContext(), R.drawable.sug_running_plan_card_arrow));
        }

        @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
        /* JADX INFO: renamed from: init */
        public void d(Object obj) {
            LogUtil.a("Suggestion_SmartTrainPlanAdapter", "smartTrainPlanCardView init");
            if (!(obj instanceof hqp)) {
                LogUtil.j("Suggestion_SmartTrainPlanAdapter", "smartTrainPlanCardView instanceof SmartTrainPlanItemBean false");
                return;
            }
            hqp hqpVar = (hqp) obj;
            qey qeyVarG = hqpVar.g();
            if (qeyVarG == null) {
                LogUtil.j("Suggestion_SmartTrainPlanAdapter", "SmartTrainPlanCardViewHolder planDetailBean is null");
            } else {
                b(qeyVarG, hqpVar);
            }
        }

        private void b(qey qeyVar, hqp hqpVar) {
            gnm gnmVar = (gnm) HiJsonUtil.d(qeyVar.a(), gnm.class);
            String unused = SmartTrainPlanAdapter.h = qeyVar.g();
            this.j.setText(SmartTrainPlanAdapter.h);
            long jD = DateFormatUtil.d(qeyVar.i());
            long jD2 = DateFormatUtil.d(qeyVar.b());
            boolean z = lsl.z(jD2);
            boolean zAb = lsl.ab(jD);
            int iE = lsl.e(jD, jD2);
            int iE2 = lsl.e(jD, System.currentTimeMillis());
            if (zAb) {
                this.n.setText(qre.e(R.plurals.IDS_competition_start_content, iE, Integer.valueOf(iE)));
            } else if (z) {
                this.n.setText(qre.f(gnmVar == null || gnmVar.d() ? R.string.IDS_competition_main_finish_content : R.string.IDS_competition_finish_content));
            } else {
                this.n.setText(e(iE2, iE));
            }
            float fB = b(gnmVar == null ? null : gnmVar.b());
            this.o.setProgress(Math.round(fB));
            this.i.setText(qre.a(R.string.IDS_competition_progress, UnitUtil.c(fB, 2, 0, 1, null)));
            e(qeyVar);
            if (z) {
                this.d.setVisibility(8);
            } else {
                this.d.setVisibility(0);
            }
            e(qeyVar, hqpVar.b());
            if (gnmVar != null && gnmVar.c() >= 11) {
                c(gnmVar);
            } else {
                e(qeyVar, gnmVar, z);
            }
            LogUtil.a("Suggestion_SmartTrainPlanAdapter", "smartTrainPlanCardView init end");
        }

        private float b(gng gngVar) {
            if (gngVar == null || gngVar.a() == 0) {
                return 0.0f;
            }
            return (gngVar.d() * 100.0f) / gngVar.a();
        }

        private void e(final qey qeyVar) {
            if (qeyVar.o() == 1) {
                return;
            }
            this.itemView.setOnClickListener(new View.OnClickListener() { // from class: hqa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f37043a.d(qeyVar, view);
                }
            });
        }

        public /* synthetic */ void d(qey qeyVar, View view) {
            bue.c(this.itemView.getContext());
            JumpUtil.a(this.itemView.getContext(), String.format("#/train_plan_detail?planId=%s", qeyVar.h()), "plan_page", "com.huawei.health.h5.intelligent-training-plan");
        }

        private SpannableString e(int i, int i2) {
            SpannableString spannableString = new SpannableString(qre.e(R.plurals.IDS_competition_week_content, i, Integer.valueOf(i), Integer.valueOf(i2)));
            String strE = UnitUtil.e(i, 1, 0);
            qri.a(spannableString, strE, new StyleSpan(1));
            qri.b(spannableString, strE, R.color.sleep_entry_card_text_color_90alpha);
            return spannableString;
        }

        private void e(final qey qeyVar, LinkedHashMap<Integer, gfl> linkedHashMap) {
            this.e.setVisibility(8);
            this.r.setVisibility(8);
            if (linkedHashMap == null) {
                LogUtil.j("Suggestion_SmartTrainPlanAdapter", "handleMaskCardVisibility aiCoachData is empty");
            } else {
                this.r.setOnClickListener(new View.OnClickListener() { // from class: hqh
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f37051a.e(qeyVar, view);
                    }
                });
                d(linkedHashMap);
            }
        }

        public /* synthetic */ void e(qey qeyVar, View view) {
            d(qeyVar);
        }

        private void d(LinkedHashMap<Integer, gfl> linkedHashMap) {
            if (linkedHashMap.isEmpty()) {
                LogUtil.j("Suggestion_SmartTrainPlanAdapter", "handleAiCoachDataToView aiCoachData is empty");
                return;
            }
            List<gfo> listB = btw.b(linkedHashMap);
            if (listB == null) {
                RiskBiAnalytics.a(SmartPlanTypeEnum.SMART_TRAINING_PLAN.getValue(), RiskBiAnalytics.SmartPlanRiskType.RISK_TYPE_AI_COACH_EMPTY, "", "controlDatas is null");
                LogUtil.j("Suggestion_SmartTrainPlanAdapter", "handleAiCoachDataToView controlDatas is null");
                return;
            }
            for (gfo gfoVar : listB) {
                String strA = gfoVar.a();
                String strC = gfoVar.c();
                if (TextUtils.isEmpty(strC)) {
                    LogUtil.j("Suggestion_SmartTrainPlanAdapter", "handleAiCoachDataToView content is empty");
                } else if (ControlTypeEnum.INPUT_GUIDE_TEXT_CONTROL.getControlType().equals(strA)) {
                    b(strC);
                } else if (ControlTypeEnum.CONTROL_RESULT.getControlType().equals(strA)) {
                    c(strC);
                } else {
                    LogUtil.a("Suggestion_SmartTrainPlanAdapter", "controlType is ", strA);
                }
            }
        }

        private void c(String str) {
            try {
                int iOptInt = new JSONObject(str).optInt("resultCode", -1);
                if (iOptInt != 27001) {
                    LogUtil.j("Suggestion_SmartTrainPlanAdapter", "aiCoach handle result Code is", Integer.valueOf(iOptInt));
                    return;
                }
                this.e.setVisibility(0);
                this.r.setVisibility(0);
                this.d.setVisibility(8);
            } catch (JSONException e) {
                ReleaseLogUtil.a("Suggestion_SmartTrainPlanAdapter", "coach get result exception", e);
            }
        }

        private void b(String str) {
            gfv gfvVar = (gfv) HiJsonUtil.d(str, gfv.class);
            if (gfvVar == null) {
                LogUtil.j("Suggestion_SmartTrainPlanAdapter", "inputGuideTextControl is null");
                return;
            }
            String strE = gfvVar.e();
            if (TextUtils.isEmpty(strE)) {
                LogUtil.j("Suggestion_SmartTrainPlanAdapter", "guideText is empty");
                return;
            }
            this.f.setText(strE);
            List<gfs> listA = gfvVar.a();
            if (CollectionUtils.a(listA)) {
                LogUtil.j("Suggestion_SmartTrainPlanAdapter", "buttons is empty");
            } else {
                this.f.setVisibility(0);
                b(listA);
            }
        }

        private void b(List<gfs> list) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f9656b);
            arrayList.add(this.f9655a);
            for (int i = 0; i < list.size(); i++) {
                if (i >= arrayList.size()) {
                    LogUtil.j("Suggestion_SmartTrainPlanAdapter", "aiCoach button over 2 size is ", Integer.valueOf(list.size()));
                    return;
                }
                gfs gfsVar = list.get(i);
                if (gfsVar == null) {
                    LogUtil.j("Suggestion_SmartTrainPlanAdapter", "aiButton is null");
                } else {
                    String strB = gfsVar.b();
                    int iD = gfsVar.d();
                    final String strE = gfsVar.e();
                    if (TextUtils.isEmpty(strB) || TextUtils.isEmpty(strE) || iD != 2) {
                        LogUtil.j("Suggestion_SmartTrainPlanAdapter", "aiButton has params error : name is ", strB, "deepLink is null", Boolean.valueOf(TextUtils.isEmpty(strE)), "action is ", Integer.valueOf(iD));
                    } else {
                        HealthButton healthButton = (HealthButton) arrayList.get(i);
                        healthButton.setText(strB);
                        healthButton.setBackground(SmartTrainPlanAdapter.e(this.itemView.getContext(), SmartTrainPlanAdapter.f9645b, R.dimen.health_common_20dp));
                        SmartTrainPlanAdapter.d(healthButton);
                        healthButton.setOnClickListener(new View.OnClickListener() { // from class: hqi
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                SmartTrainPlanAdapter.e.b(strE, view);
                            }
                        });
                        healthButton.setVisibility(0);
                    }
                }
            }
        }

        public static /* synthetic */ void b(String str, View view) {
            LogUtil.a("Suggestion_SmartTrainPlanAdapter", "handleClickEvent deepLink run");
            Uri uri = Uri.parse(str);
            Uri.Builder builderBuildUpon = uri.buildUpon();
            String queryParameter = uri.getQueryParameter("trigResName");
            String queryParameter2 = uri.getQueryParameter("trigResType");
            if (TextUtils.isEmpty(queryParameter)) {
                builderBuildUpon.appendQueryParameter("trigResName", "智能训练计划");
            }
            if (TextUtils.isEmpty(queryParameter2)) {
                builderBuildUpon.appendQueryParameter("trigResType", "5");
            }
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, builderBuildUpon.build());
            intent.setFlags(268435456);
            intent.setPackage(BaseApplication.getContext().getPackageName());
            lsx.c(intent, BaseApplication.getContext());
        }

        private void d(final qey qeyVar) {
            SpannableString spannableString;
            StringBuilder sb = new StringBuilder();
            sb.append(qre.f(R.string.IDS_competition_smart_card_cancel));
            if (!qrh.c()) {
                sb.append(System.lineSeparator());
                String strF = qre.f(R.string.IDS_stop_plan_and_auth_tips);
                sb.append(strF);
                spannableString = new SpannableString(sb.toString());
                qri.b(spannableString, strF, R.color.font_secondary);
                qri.c(spannableString, strF, qre.b(com.huawei.health.servicesui.R.dimen.health_common_14dp));
            } else {
                spannableString = new SpannableString(sb.toString());
            }
            String upperCase = qre.f(R.string.IDS_hw_show_agree).toUpperCase();
            CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this.itemView.getContext()).b(qre.f(R.string.IDS_hw_health_show_common_dialog_title)).e(17).e(spannableString).a(17).e(upperCase, new DialogInterface.OnClickListener() { // from class: hqf
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f37048a.c(qeyVar, dialogInterface, i);
                }
            }).d(qre.f(R.string.IDS_device_release_user_profile_log_collect_cancel).toUpperCase(), new DialogInterface.OnClickListener() { // from class: hqj
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    SmartTrainPlanAdapter.e.a(dialogInterface, i);
                }
            }).b();
            customAlertDialogB.setWindowGravityParams(17);
            customAlertDialogB.c(qrr.d(), 1);
            customAlertDialogB.a(qrr.c());
            customAlertDialogB.setCancelable(false);
            customAlertDialogB.show();
        }

        public /* synthetic */ void c(qey qeyVar, DialogInterface dialogInterface, int i) {
            a(qeyVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(final qey qeyVar) {
            if (HandlerExecutor.d()) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: hqd
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f37046b.a(qeyVar);
                    }
                });
            } else {
                ((PlanApi) Services.b("CoursePlanService", PlanApi.class)).stopSmartTrainPlan(qeyVar.h(), new UiCallback<String>() { // from class: com.huawei.health.suggestion.ui.plan.adapter.SmartTrainPlanAdapter.e.3
                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    public void onFailure(int i, String str) {
                        ReleaseLogUtil.d("Suggestion_SmartTrainPlanAdapter", "stopSmartTrainPlan onFailure:", Integer.valueOf(i), " errorInfo:", str);
                    }

                    @Override // com.huawei.basefitnessadvice.callback.UiCallback
                    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                    public void onSuccess(String str) {
                        LogUtil.a("Suggestion_SmartTrainPlanAdapter", "stopSmartTrainPlan onSuccess:", str);
                        qrh.a();
                        btq.e().e("PLAN_UPDATE");
                    }
                });
            }
        }

        private void c(gnm gnmVar) {
            if (gnmVar == null || gnmVar.b() == null) {
                LogUtil.j("Suggestion_SmartTrainPlanAdapter", "setDurationAndDistance metaData or planProgressInfo is null");
                return;
            }
            String strE = DateFormatUtil.e(TimeUnit.SECONDS.toMillis(Math.round(gnmVar.b().c())), lsl.d(), DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE_SEC);
            this.k.setText(qre.f(R.string.IDS_train_plan_total_distance));
            this.m.setText(qre.f(R.string.IDS_train_plan_total_duration));
            this.g.setText(UnitUtil.e(gnmVar.b().b(), 1, 2));
            this.h.setText(strE);
            this.f9657c.setVisibility(8);
        }

        private void e(qey qeyVar, gnm gnmVar, boolean z) {
            int iJ = CollectionUtils.a(qeyVar.j()) ? 0 : CommonUtils.j(qeyVar.j().get(0).e());
            int iE = gnmVar != null ? gnmVar.e() : 0;
            String strE = DateFormatUtil.e(TimeUnit.SECONDS.toMillis(iE), lsl.d(), DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE_SEC);
            String strE2 = DateFormatUtil.e(TimeUnit.SECONDS.toMillis(iJ), lsl.d(), DateFormatUtil.DateFormatType.DATE_FORMAT_HOUR_MINUTE_SEC);
            Typeface typefaceD = qrr.d();
            this.g.setTypeface(typefaceD, 1);
            this.h.setTypeface(typefaceD, 1);
            float fAbs = iJ != 0 ? (Math.abs(iE - iJ) * 100.0f) / iJ : 0.0f;
            if (z) {
                this.k.setText(qre.f(R.string.IDS_competition_start_score));
                this.m.setText(qre.f(R.string.IDS_competition_end_score));
                this.g.setText(strE2);
                this.h.setText(strE);
                this.l.setVisibility(0);
                this.l.setText(qre.a(iE <= iJ ? R.string.IDS_competition_increase : R.string.IDS_competition_decrease, UnitUtil.e(fAbs, 2, 1)));
                return;
            }
            this.k.setText(qre.f(R.string.IDS_competition_current_text));
            this.m.setText(qre.f(R.string.IDS_competition_goal_text));
            this.g.setText(strE);
            this.h.setText(strE2);
            this.l.setVisibility(8);
        }
    }

    static class b extends AbsFitnessViewHolder<Object> {
        @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
        /* JADX INFO: renamed from: init */
        public void d(Object obj) {
        }

        public b(View view) {
            super(view);
        }
    }

    public static class d extends AbsFitnessViewHolder<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HealthTextView f9652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HealthTextView f9653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final HealthImageView f9654c;
        private final HealthTextView d;
        private final HealthTextView e;

        public d(View view) {
            super(view);
            this.e = (HealthTextView) view.findViewById(R.id.train_plan_item_day_number);
            this.d = (HealthTextView) view.findViewById(R.id.train_plan_item_day_label);
            this.f9654c = (HealthImageView) view.findViewById(R.id.train_plan_item_day_image);
            this.f9652a = (HealthTextView) view.findViewById(R.id.train_plan_item_title);
            this.f9653b = (HealthTextView) view.findViewById(R.id.train_plan_item_date);
        }

        @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
        /* JADX INFO: renamed from: init */
        public void d(Object obj) {
            int iE;
            int iE2;
            int iE3;
            SpannableString spannableString;
            if (obj instanceof gnf.e) {
                final gnf.e eVar = (gnf.e) obj;
                boolean z = lsl.z(eVar.d());
                String strA = DateFormatUtil.a(eVar.d(), DateFormatUtil.DateFormatType.DATE_FORMAT_YYYYMMDD);
                int iA = lsl.a(System.currentTimeMillis(), eVar.d()) - 1;
                this.e.setText(String.valueOf(iA));
                HealthTextView healthTextView = this.d;
                if (iA > 14) {
                    iE = qre.e(R.color.sleep_entry_card_text_color_90alpha);
                } else {
                    iE = qre.e(R.color.colorAccent);
                }
                healthTextView.setTextColor(iE);
                HealthTextView healthTextView2 = this.e;
                if (iA > 14) {
                    iE2 = qre.e(R.color.legal_un_clickable_color);
                } else {
                    iE2 = qre.e(R.color.colorAccent);
                }
                healthTextView2.setTextColor(iE2);
                this.d.setVisibility(z ? 8 : 0);
                this.e.setVisibility(z ? 8 : 0);
                this.f9654c.setVisibility(z ? 0 : 8);
                this.f9652a.setText(eVar.b());
                HealthTextView healthTextView3 = this.f9652a;
                if (z) {
                    iE3 = qre.e(R.color.legal_un_clickable_color);
                } else {
                    iE3 = qre.e(R.color.sleep_entry_card_text_color_90alpha);
                }
                healthTextView3.setTextColor(iE3);
                String strF = qre.f(R.string.IDS_competition_finish_text);
                String strF2 = qre.f(R.string.IDS_competition_main_text);
                if (z && eVar.f() == 1) {
                    spannableString = new SpannableString(qre.a(R.string.IDS_competition_three_status_text, strF, strF2, strA));
                } else if (z) {
                    spannableString = new SpannableString(qre.a(R.string.IDS_competition_two_status_text, strF, strA));
                } else if (eVar.f() == 1) {
                    spannableString = new SpannableString(qre.a(R.string.IDS_competition_two_status_text, strF2, strA));
                    qri.b(spannableString, strF2, R.color.colorAccent);
                } else {
                    spannableString = new SpannableString(strA);
                }
                qri.e(spannableString, strF2, R.string.textFontFamilyMedium);
                this.f9653b.setText(spannableString);
                this.itemView.setOnClickListener(new View.OnClickListener() { // from class: hqg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f37049b.a(eVar, view);
                    }
                });
            }
        }

        public /* synthetic */ void a(gnf.e eVar, View view) {
            String strA = eVar.a();
            JumpUtil.a(this.itemView.getContext(), String.format(strA != null && strA.startsWith("customRun") ? "#/custom_competition_view?id=%s" : "#/competition_view?id=%s", eVar.e()), "run_page_enabled", "com.huawei.health.h5.intelligent-training-plan");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GradientDrawable e(Context context, int[] iArr, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(qre.b(i2));
        gradientDrawable.setOrientation(LanguageUtil.ba(context) ? GradientDrawable.Orientation.RIGHT_LEFT : GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setColors(iArr);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(final TextView textView) {
        if (textView == null) {
            LogUtil.j("Suggestion_SmartTrainPlanAdapter", "setButtonTextGradient textView is null");
        } else {
            textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.health.suggestion.ui.plan.adapter.SmartTrainPlanAdapter.4
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    textView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, textView.getWidth(), textView.getHeight(), SmartTrainPlanAdapter.f9644a, SmartTrainPlanAdapter.e, Shader.TileMode.REPEAT));
                    textView.invalidate();
                    textView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
        }
    }
}
