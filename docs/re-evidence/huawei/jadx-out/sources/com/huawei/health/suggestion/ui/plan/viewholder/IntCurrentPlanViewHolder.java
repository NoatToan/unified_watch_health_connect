package com.huawei.health.suggestion.ui.plan.viewholder;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.basefitnessadvice.model.intplan.IntPlan;
import com.huawei.basefitnessadvice.model.intplan.StatInfo;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder;
import com.huawei.health.suggestion.ui.plan.viewholder.IntCurrentPlanViewHolder;
import com.huawei.health.suggestion.util.JumpUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import defpackage.btw;
import defpackage.gzw;
import defpackage.gzx;
import defpackage.idy;
import defpackage.iep;
import defpackage.iun;
import defpackage.lmf;
import defpackage.ped;
import defpackage.qqz;
import defpackage.qre;
import defpackage.qrh;
import defpackage.qrr;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
public class IntCurrentPlanViewHolder extends AbsFitnessViewHolder<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f9756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f9757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f9758c;
    private Context d;
    private IntPlan e;
    private HealthButton f;
    private HealthTextView g;
    private HealthProgressBar h;
    private ImageView i;
    private HealthTextView j;
    private RelativeLayout k;
    private RelativeLayout l;
    private LinearLayout m;
    private UiCallback n;
    private LinearLayout o;

    public static /* synthetic */ void b(DialogInterface dialogInterface, int i) {
    }

    public IntCurrentPlanViewHolder(final View view, int i) {
        GradientDrawable.Orientation orientation;
        super(view);
        this.n = new UiCallback() { // from class: com.huawei.health.suggestion.ui.plan.viewholder.IntCurrentPlanViewHolder.3
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i2, String str) {
                LogUtil.e("Suggestion_IntCurrentPlanViewHolder", "finish plan errorCode:", Integer.valueOf(i2), " errorInfo:", str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onSuccess(Object obj) {
                if (IntCurrentPlanViewHolder.this.itemView.getParent() instanceof RecyclerView) {
                    ((RecyclerView) IntCurrentPlanViewHolder.this.itemView.getParent()).setVisibility(8);
                }
            }
        };
        this.d = view.getContext();
        this.g = (HealthTextView) view.findViewById(R.id.plan_name);
        this.f = (HealthButton) view.findViewById(R.id.plan_report_button);
        this.f9757b = (HealthTextView) view.findViewById(R.id.plan_completed_days_and_rate);
        this.h = (HealthProgressBar) view.findViewById(R.id.sug_current_plan_progress_item_horizontal);
        this.j = (HealthTextView) view.findViewById(R.id.plan_goal_content);
        this.f9756a = (RelativeLayout) view.findViewById(R.id.goal_line);
        this.i = (ImageView) view.findViewById(R.id.report_dot);
        this.o = (LinearLayout) view.findViewById(R.id.statistic_data_layout);
        this.f9758c = (RelativeLayout) view.findViewById(R.id.statistic_first_data);
        this.l = (RelativeLayout) view.findViewById(R.id.statistic_second_data);
        this.k = (RelativeLayout) view.findViewById(R.id.statistic_third_data);
        this.m = (LinearLayout) view.findViewById(R.id.sug_smart_train_plan_create);
        HealthImageView healthImageView = (HealthImageView) view.findViewById(R.id.iv_to_create);
        ((HealthTextView) view.findViewById(R.id.to_create_msg)).setTypeface(qrr.c());
        healthImageView.setImageDrawable(qqz.c(this.d, R.drawable.member_tab_pic_arrow_right));
        int[] iArr = {452962681, 452949798, 452944717, 452945012, 449018623, 441819620};
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(qre.b(R.dimen.health_common_16dp));
        if (LanguageUtil.ba(this.d)) {
            orientation = GradientDrawable.Orientation.RIGHT_LEFT;
        } else {
            orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        }
        gradientDrawable.setOrientation(orientation);
        gradientDrawable.setColors(iArr);
        this.m.setBackground(gradientDrawable);
        this.m.setOnClickListener(new View.OnClickListener() { // from class: hyf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.b(view2);
            }
        });
        if (i != 0) {
            view.setOnClickListener(new View.OnClickListener() { // from class: hyg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.e.a(view, view2);
                }
            });
        }
    }

    public /* synthetic */ void b(View view) {
        e();
    }

    public /* synthetic */ void a(View view, View view2) {
        HashMap map = new HashMap();
        map.put("click", "1");
        idy.b(AnalyticsValue.HEALTH_WEIGHT_MY_TRAINING_PROGRAM_PIC_2030055.value(), map);
        btw.e(this.e, "", 1, 1, 1);
        JumpUtil.a(view.getContext());
    }

    private void e() {
        String upperCase = qre.f(R.string.IDS_plugin_fitnessadvice_ok).toUpperCase();
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this.d).b(qre.f(R.string.IDS_competition_detail_create_dialog_title)).e(17).e(qre.f(R.string.IDS_competition_detail_create_dialog_content)).e(upperCase, new DialogInterface.OnClickListener() { // from class: hyc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f37325a.c(dialogInterface, i);
            }
        }).d(qre.f(R.string.IDS_device_release_user_profile_log_collect_cancel).toUpperCase(), new DialogInterface.OnClickListener() { // from class: hye
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                IntCurrentPlanViewHolder.b(dialogInterface, i);
            }
        }).b();
        customAlertDialogB.setWindowGravityParams(17);
        customAlertDialogB.c(qrr.d(), 1);
        customAlertDialogB.a(qrr.c());
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    public /* synthetic */ void c(DialogInterface dialogInterface, int i) {
        c();
    }

    private void c() {
        if (!qrh.c()) {
            iep.b(this.e, false, this.n);
            JumpUtil.a(this.d, "#/train_plan_create_guide", "plan_page", "com.huawei.health.h5.intelligent-training-plan");
            iep.b(this.e, 3);
            return;
        }
        qrh.e(this.d, new DialogInterface.OnClickListener() { // from class: hyb
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f37324a.a(dialogInterface, i);
            }
        });
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        if (-1 == i) {
            iep.b(this.e, false, this.n);
            JumpUtil.a(this.d, "#/train_plan_create_guide", "plan_page", "com.huawei.health.h5.intelligent-training-plan");
            iep.b(this.e, 3);
        }
    }

    public void a() {
        IntPlan intPlan = this.e;
        if (intPlan == null) {
            LogUtil.j("Suggestion_IntCurrentPlanViewHolder", "refreshRunPlanStatisticData mCurrentPlan is null");
            return;
        }
        a(intPlan);
        b(this.e);
        d(this.e);
    }

    private void a(IntPlan intPlan) {
        RelativeLayout relativeLayout = this.f9758c;
        if (relativeLayout == null) {
            LogUtil.j("Suggestion_IntCurrentPlanViewHolder", "mFirstStatisticLayout null.");
            return;
        }
        HealthTextView healthTextView = (HealthTextView) relativeLayout.findViewById(R.id.statistic_data_name);
        HealthTextView healthTextView2 = (HealthTextView) this.f9758c.findViewById(R.id.statistic_data_unit);
        HealthTextView healthTextView3 = (HealthTextView) this.f9758c.findViewById(R.id.statistic_data_value);
        if (btw.r(intPlan)) {
            healthTextView.setText(this.d.getString(R.string.IDS_fitness_total_run_distance));
            a(intPlan, healthTextView2, healthTextView3);
        } else {
            if (btw.j(intPlan)) {
                healthTextView.setText(this.d.getString(R.string.sug_total_days));
                StatInfo stat = intPlan.getStat(StatInfo.STAT_TYPE_PUNCH_DAY);
                int iIntValue = (stat == null || !(stat.getValue() instanceof Integer)) ? 0 : ((Integer) stat.getValue()).intValue();
                healthTextView2.setText(this.d.getResources().getQuantityString(R.plurals.IDS_user_profile_achieve_day, iIntValue));
                healthTextView3.setText(UnitUtil.e(iIntValue, 1, 0));
                return;
            }
            this.o.setVisibility(8);
        }
    }

    private void a(IntPlan intPlan, HealthTextView healthTextView, HealthTextView healthTextView2) {
        StatInfo stat = intPlan.getStat("distance");
        if (stat != null) {
            LogUtil.a("Suggestion_IntCurrentPlanViewHolder", "ai run plan distance:", stat.getValue());
            double dFloatValue = ((double) ((Float) stat.getValue()).floatValue()) / 1000.0d;
            healthTextView.setText(this.d.getString(R.string.IDS_band_data_sport_distance_unit));
            if (UnitUtil.f()) {
                healthTextView.setText(this.d.getString(R.string.IDS_band_data_sport_distance_unit_en));
                dFloatValue = UnitUtil.e(dFloatValue, 3);
            }
            healthTextView2.setText(UnitUtil.e(dFloatValue, 1, 2));
            return;
        }
        LogUtil.e("Suggestion_IntCurrentPlanViewHolder", "can not get run distance.");
        healthTextView.setText(gzx.d(gzw.a(), 0, ""));
        healthTextView2.setText(UnitUtil.e(0.0d, 1, 0));
    }

    private void b(IntPlan intPlan) {
        RelativeLayout relativeLayout = this.l;
        if (relativeLayout == null) {
            LogUtil.j("Suggestion_IntCurrentPlanViewHolder", "mSecondStatisticLayout null.");
            return;
        }
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(R.id.static_content_layout);
        if (linearLayout != null && (linearLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.addRule(14);
            linearLayout.setLayoutParams(layoutParams);
        }
        HealthTextView healthTextView = (HealthTextView) this.l.findViewById(R.id.statistic_data_name);
        HealthTextView healthTextView2 = (HealthTextView) this.l.findViewById(R.id.statistic_data_unit);
        HealthTextView healthTextView3 = (HealthTextView) this.l.findViewById(R.id.statistic_data_value);
        if (intPlan.getPlanType().getType() == IntPlan.PlanType.AI_RUN_PLAN.getType() || intPlan.getPlanType().getType() == IntPlan.PlanType.FIT_PLAN.getType()) {
            healthTextView.setText(this.d.getString(R.string.sug_total_duration));
            healthTextView2.setText(this.d.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_start_track_sport_min, 1));
            StatInfo stat = intPlan.getStat("duration");
            if (stat != null && (stat.getValue() instanceof Float)) {
                LogUtil.a("Suggestion_IntCurrentPlanViewHolder", "plan duration:", stat.getValue());
                healthTextView3.setText(ped.i(((Float) stat.getValue()).floatValue()));
                return;
            } else {
                LogUtil.e("Suggestion_IntCurrentPlanViewHolder", "can not get duration.");
                healthTextView3.setText(UnitUtil.e(0.0d, 1, 0));
                return;
            }
        }
        this.o.setVisibility(8);
    }

    private void d(IntPlan intPlan) {
        RelativeLayout relativeLayout = this.k;
        if (relativeLayout == null) {
            LogUtil.j("Suggestion_IntCurrentPlanViewHolder", "mThirdStatisticLayout null.");
            return;
        }
        LinearLayout linearLayout = (LinearLayout) relativeLayout.findViewById(R.id.static_content_layout);
        if (linearLayout != null && (linearLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams.addRule(21);
            linearLayout.setLayoutParams(layoutParams);
        }
        HealthTextView healthTextView = (HealthTextView) this.k.findViewById(R.id.statistic_data_name);
        HealthTextView healthTextView2 = (HealthTextView) this.k.findViewById(R.id.statistic_data_unit);
        HealthTextView healthTextView3 = (HealthTextView) this.k.findViewById(R.id.statistic_data_value);
        if (intPlan.getPlanType().getType() == IntPlan.PlanType.AI_RUN_PLAN.getType() || intPlan.getPlanType().getType() == IntPlan.PlanType.FIT_PLAN.getType()) {
            healthTextView.setText(this.d.getString(R.string.IDS_fitness_plan_total_calories));
            healthTextView2.setText(this.d.getString(R.string.sug_finess_kcal1));
            StatInfo stat = intPlan.getStat("calorie");
            if (stat != null && (stat.getValue() instanceof Float)) {
                LogUtil.a("Suggestion_IntCurrentPlanViewHolder", "plan calories:", stat.getValue());
                healthTextView3.setText(UnitUtil.e(ped.b(((Float) stat.getValue()).floatValue()), 1, 0));
                return;
            } else {
                LogUtil.e("Suggestion_IntCurrentPlanViewHolder", "can not get calories.");
                healthTextView3.setText(UnitUtil.e(0.0d, 1, 0));
                return;
            }
        }
        this.o.setVisibility(8);
    }

    @Override // com.huawei.health.suggestion.ui.fitness.viewholder.AbsFitnessViewHolder
    public void init(Object obj) {
        LogUtil.a("Suggestion_IntCurrentPlanViewHolder", "init IntCurrentPlanViewHolder.");
        if (obj instanceof IntPlan) {
            IntPlan intPlan = (IntPlan) obj;
            this.e = intPlan;
            h();
            a(this.e);
            b(this.e);
            d(this.e);
            if (IntPlan.PlanType.AI_RUN_PLAN != this.e.getPlanType()) {
                this.m.setVisibility(8);
            } else {
                this.m.setVisibility(btw.o() ? 0 : 8);
            }
            iep.a(intPlan, this.f, this.i);
        }
    }

    private void h() {
        float fFloatValue = ((Float) this.e.getStat("progress").getValue()).floatValue();
        String strC = gzx.c(this.d, R.string.IDS_plan_finish_percent, UnitUtil.e(fFloatValue, 2, 1));
        if (LanguageUtil.e(this.d)) {
            strC = strC.replace("%", " %");
        }
        this.g.setText(this.e.getMetaInfo().getName());
        c(strC);
        if (fFloatValue > 0.0f && fFloatValue <= 6.0f) {
            this.h.setProgress(6);
        } else {
            this.h.setProgress(Math.round(fFloatValue));
        }
        if (this.e.getPlanType() == IntPlan.PlanType.AI_FITNESS_PLAN) {
            this.f9756a.setVisibility(0);
            j();
        }
    }

    private void j() {
        if (this.e.getGoal("weight") == null) {
            LogUtil.j("Suggestion_IntCurrentPlanViewHolder", "StatInfo.STAT_TYPE_WEIGHT null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: hyd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37326c.b();
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.suggestion.ui.plan.viewholder.IntCurrentPlanViewHolder$4, reason: invalid class name */
    public class AnonymousClass4 extends UiCallback<Float> {
        AnonymousClass4() {
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        public void onFailure(int i, String str) {
            LogUtil.j("Suggestion_IntCurrentPlanViewHolder", "getGoalData errorInfo:", str);
        }

        @Override // com.huawei.basefitnessadvice.callback.UiCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(final Float f) {
            HandlerExecutor.b(new Runnable() { // from class: hyh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f37328b.e(f);
                }
            });
        }

        public /* synthetic */ void e(Float f) {
            IntCurrentPlanViewHolder.this.c(f.floatValue());
        }
    }

    public /* synthetic */ void b() {
        iun.e(new AnonymousClass4());
    }

    private void c(String str) {
        this.f9757b.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_plan_day_rate, iep.a(System.currentTimeMillis(), this.e), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void c(float f) {
        float fFloatValue = ((Float) this.e.getGoal("weight").getGoalDst()).floatValue();
        Drawable drawable = ContextCompat.getDrawable(this.d, R.drawable.ic_gray_right_arrow);
        if (LanguageUtil.ba(this.d)) {
            drawable = ContextCompat.getDrawable(this.d, R.drawable.common_ui_arrow_left);
        }
        if (f > fFloatValue) {
            String strB = iep.b(f, fFloatValue);
            String string = this.d.getResources().getString(R.string.IDS_goal_not_reach, strB);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) string).append((CharSequence) " ");
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(BaseApplication.getContext().getColor(com.huawei.health.servicesui.R.color.colorAccent));
            int length = this.d.getResources().getString(R.string.IDS_goal_not_reach, "").length();
            spannableStringBuilder.setSpan(foregroundColorSpan, length, strB.length() + length, 33);
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                spannableStringBuilder.setSpan(new e(drawable), strB.length() + length, length + strB.length() + 1, 1);
            }
            this.j.setText(spannableStringBuilder);
        } else {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            String strC = gzx.c(this.d, R.string.IDS_goal_reached, new Object[0]);
            spannableStringBuilder2.append((CharSequence) strC);
            spannableStringBuilder2.append((CharSequence) " ");
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(BaseApplication.getContext().getColor(com.huawei.health.servicesui.R.color.colorAccent)), 0, strC.length(), 33);
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                spannableStringBuilder2.setSpan(new e(drawable), strC.length(), strC.length() + 1, 1);
            }
            this.j.setText(spannableStringBuilder2);
        }
        this.j.setVisibility(0);
        f();
    }

    private void f() {
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.plan.viewholder.IntCurrentPlanViewHolder.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HashMap map = new HashMap(1);
                map.put("click", 1);
                lmf.d().c(BaseApplication.getContext(), AnalyticsValue.INT_PLAN_1120033.value(), map, 0);
                JumpUtil.e(IntCurrentPlanViewHolder.this.d, "8");
            }
        });
    }

    public View d() {
        return this.i;
    }

    static class e extends ImageSpan {
        public e(Drawable drawable) {
            super(drawable);
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                int i6 = (((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2;
                int i7 = drawable.getBounds().bottom / 2;
                canvas.save();
                canvas.translate(f, i6 - i7);
                drawable.draw(canvas);
                canvas.restore();
            }
        }
    }
}
