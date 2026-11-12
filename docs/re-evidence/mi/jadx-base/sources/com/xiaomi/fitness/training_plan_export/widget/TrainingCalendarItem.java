package com.xiaomi.fitness.training_plan_export.widget;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.manager.TrainingManagerExtKt;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlanCourse;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanCourseContent;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourse;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanVideoCourse;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import com.xiaomi.fitness.training_plan_export.model.PlanModelsKt;
import com.xiaomi.fitness.training_plan_export.model.SportKey;
import com.xiaomi.fitness.training_plan_export.utils.TrainingEventUtils;
import com.xiaomi.fitness.training_plan_export.utils.UIDataUtils;
import com.xiaomi.fitness.training_plan_export.widget.TrainingCalendarItem;
import defpackage.dyi;
import defpackage.fki;
import defpackage.joi;
import defpackage.m1j;
import defpackage.r93;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/BA\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010#\u001a\u00020\b\u0012\b\b\u0002\u0010&\u001a\u00020\b\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u001f\u0010\n\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010#\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010&\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010%R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*¨\u00060"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/widget/TrainingCalendarItem;", "Landroid/widget/FrameLayout;", "", "initView", "()V", "showRestDay", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlanCourse;", "abilityDayPlanCourse", "", "isRestDay", "showAbilityPlanCourse", "(Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlanCourse;Z)V", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "habitDayPlan", "showHabitDayPlan", "(Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;)V", "", "dayOfWeek", "", "distance", "(IFZ)V", "Landroidx/fragment/app/FragmentActivity;", "ctx", "Landroidx/fragment/app/FragmentActivity;", "getCtx", "()Landroidx/fragment/app/FragmentActivity;", "planType", "I", "getPlanType", "()I", "", "planId", "J", "getPlanId", "()J", "isFromCourseList", "Z", "()Z", "tabEntrance", "getTabEntrance", "Lr93;", "binding", "Lr93;", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroidx/fragment/app/FragmentActivity;IJZZLandroid/util/AttributeSet;)V", "Companion", "training-plan-export_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ViewConstructor"})
public final class TrainingCalendarItem extends FrameLayout {

    @NotNull
    private static final String TAG = "TrainCalendarItem";
    private r93 binding;

    @NotNull
    private final FragmentActivity ctx;
    private final boolean isFromCourseList;
    private final long planId;
    private final int planType;
    private final boolean tabEntrance;

    public /* synthetic */ TrainingCalendarItem(FragmentActivity fragmentActivity, int i, long j, boolean z, boolean z2, AttributeSet attributeSet, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity, i, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? null : attributeSet);
    }

    private final void initView() {
        r93 r93VarA0 = r93.A0(LayoutInflater.from(this.ctx));
        this.binding = r93VarA0;
        if (r93VarA0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            r93VarA0 = null;
        }
        addView(r93VarA0.getRoot(), new FrameLayout.LayoutParams(-1, ExtUtilsKt.getDp(70)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAbilityPlanCourse$lambda$0(TrainingCalendarItem this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (RegionPreference.INSTANCE.getSyncWeb()) {
            TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).gotoAbilityDetailActivity(this$0.ctx, this$0.planId);
        } else {
            ITrainingManager.DefaultImpls.showCloudSyncDialog$default(TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE), this$0.ctx, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAbilityPlanCourse$lambda$1(AbilityDayPlanCourse abilityDayPlanCourse, TrainingCalendarItem this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TrainingEventUtils.INSTANCE.trackSportReport(2);
        Logger.d(TAG, "view ability sport report:" + abilityDayPlanCourse.getSportKey());
        SportKey sportKey = abilityDayPlanCourse.getSportKey();
        if (sportKey == null || !PlanModelsKt.isValid(sportKey)) {
            Logger.e(TAG, "running course finished, but server does not provider valid sportkey!!");
            return;
        }
        ITrainingManager trainingManagerExtKt = TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE);
        FragmentActivity fragmentActivity = this$0.ctx;
        Intrinsics.checkNotNull(fragmentActivity, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseActivity");
        trainingManagerExtKt.gotoSportReport((BaseActivity) fragmentActivity, 2, abilityDayPlanCourse.getPlanId(), sportKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAbilityPlanCourse$lambda$3(TrainingCalendarItem this$0, AbilityDayPlanCourse abilityDayPlanCourse, View view) {
        AbilityPlanCourseContent courseContent;
        AbilityPlanCourseContent courseContent2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TrainingEventUtils.INSTANCE.trackRunningCourseDetail(this$0.tabEntrance ? 1 : 2);
        AbilityPlanVideoCourse videoCourse = null;
        AbilityPlanRunningCourse runningCourse = (abilityDayPlanCourse == null || (courseContent2 = abilityDayPlanCourse.getCourseContent()) == null) ? null : courseContent2.getRunningCourse();
        if (abilityDayPlanCourse != null && (courseContent = abilityDayPlanCourse.getCourseContent()) != null) {
            videoCourse = courseContent.getVideoCourse();
        }
        AbilityPlanVideoCourse abilityPlanVideoCourse = videoCourse;
        if (runningCourse != null) {
            Logger.d(TAG, "launch running course detail:" + abilityDayPlanCourse.getPlanId() + "-" + abilityDayPlanCourse.getCourseId());
            TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).launchAbilityRunningCourseDetailActivity(this$0.ctx, abilityDayPlanCourse.getPlanId(), abilityDayPlanCourse.getCourseId(), abilityDayPlanCourse.getDate());
            return;
        }
        if (abilityPlanVideoCourse == null) {
            Logger.w(TAG, "can not start course info activity with empty running or video course!!");
            return;
        }
        Logger.d(TAG, "launch video course detail:" + abilityDayPlanCourse.getPlanId() + "-" + abilityDayPlanCourse.getCourseId());
        ITrainingManager trainingManagerExtKt = TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE);
        FragmentActivity fragmentActivity = this$0.ctx;
        abilityPlanVideoCourse.setPlanId(abilityDayPlanCourse.getPlanId());
        abilityPlanVideoCourse.setCourseStatus(abilityDayPlanCourse.getStatus());
        Unit unit = Unit.INSTANCE;
        ITrainingManager.DefaultImpls.launchVideoCourseInfoActivity$default(trainingManagerExtKt, fragmentActivity, abilityPlanVideoCourse, 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showHabitDayPlan$lambda$4(TrainingCalendarItem this$0, HabitDayPlan habitDayPlan, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(habitDayPlan, "$habitDayPlan");
        if (RegionPreference.INSTANCE.getSyncWeb()) {
            TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE).gotoHabitHomeActivity(this$0.ctx, habitDayPlan.getPlanId());
        } else {
            ITrainingManager.DefaultImpls.showCloudSyncDialog$default(TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE), this$0.ctx, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showHabitDayPlan$lambda$5(HabitDayPlan habitDayPlan, TrainingCalendarItem this$0, View view) {
        Intrinsics.checkNotNullParameter(habitDayPlan, "$habitDayPlan");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TrainingEventUtils.INSTANCE.trackSportReport(1);
        Logger.d(TAG, "view habit sport report:" + habitDayPlan.getSportKey());
        SportKey sportKey = habitDayPlan.getSportKey();
        if (sportKey == null || !PlanModelsKt.isValid(sportKey)) {
            Logger.i(TAG, "habit dayplan finished, but server does not provider valid sportkey!!");
            return;
        }
        ITrainingManager trainingManagerExtKt = TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE);
        FragmentActivity fragmentActivity = this$0.ctx;
        Intrinsics.checkNotNull(fragmentActivity, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseActivity");
        trainingManagerExtKt.gotoSportReport((BaseActivity) fragmentActivity, 1, habitDayPlan.getPlanId(), sportKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showHabitDayPlan$lambda$6(TrainingCalendarItem this$0, HabitDayPlan habitDayPlan, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(habitDayPlan, "$habitDayPlan");
        TrainingEventUtils.INSTANCE.trackToSport(this$0.tabEntrance ? 1 : 2);
        ITrainingManager.DefaultImpls.showHabitPlanSportDialog$default(TrainingManagerExtKt.getInstance(ITrainingManager.INSTANCE), this$0.ctx, habitDayPlan, false, 4, null);
    }

    private final void showRestDay() {
        r93 r93Var = this.binding;
        r93 r93Var2 = null;
        if (r93Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            r93Var = null;
        }
        r93Var.G.setImageResource(joi.course_left_rest_indicator);
        r93 r93Var3 = this.binding;
        if (r93Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            r93Var3 = null;
        }
        TextView courseAction = r93Var3.B;
        Intrinsics.checkNotNullExpressionValue(courseAction, "courseAction");
        ViewExtKt.gone(courseAction);
        r93 r93Var4 = this.binding;
        if (r93Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            r93Var4 = null;
        }
        RelativeLayout courseInfoRoot = r93Var4.C;
        Intrinsics.checkNotNullExpressionValue(courseInfoRoot, "courseInfoRoot");
        ViewExtKt.gone(courseInfoRoot);
        r93 r93Var5 = this.binding;
        if (r93Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            r93Var2 = r93Var5;
        }
        TextView restTip = r93Var2.K;
        Intrinsics.checkNotNullExpressionValue(restTip, "restTip");
        ViewExtKt.visible(restTip);
    }

    @NotNull
    public final FragmentActivity getCtx() {
        return this.ctx;
    }

    public final long getPlanId() {
        return this.planId;
    }

    public final int getPlanType() {
        return this.planType;
    }

    public final boolean getTabEntrance() {
        return this.tabEntrance;
    }

    /* JADX INFO: renamed from: isFromCourseList, reason: from getter */
    public final boolean getIsFromCourseList() {
        return this.isFromCourseList;
    }

    public final void showAbilityPlanCourse(@Nullable final AbilityDayPlanCourse abilityDayPlanCourse, boolean isRestDay) {
        AbilityPlanCourseContent courseContent;
        r93 r93Var = null;
        if (!this.isFromCourseList && this.tabEntrance) {
            r93 r93Var2 = this.binding;
            if (r93Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                r93Var2 = null;
            }
            r93Var2.getRoot().setOnClickListener(new View.OnClickListener() { // from class: atp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TrainingCalendarItem.showAbilityPlanCourse$lambda$0(this.f3443a, view);
                }
            });
        }
        if (isRestDay) {
            showRestDay();
            return;
        }
        r93 r93Var3 = this.binding;
        if (r93Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            r93Var3 = null;
        }
        r93Var3.F.setText(abilityDayPlanCourse != null ? abilityDayPlanCourse.getName() : null);
        r93 r93Var4 = this.binding;
        if (r93Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            r93Var4 = null;
        }
        r93Var4.H.setText((abilityDayPlanCourse == null || abilityDayPlanCourse.getType() != 6) ? this.ctx.getString(m1j.j) : this.ctx.getString(m1j.i));
        r93 r93Var5 = this.binding;
        if (r93Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            r93Var5 = null;
        }
        TextView textView = r93Var5.J;
        Resources resources = this.ctx.getResources();
        int i = dyi.f16065a;
        int duration = abilityDayPlanCourse != null ? abilityDayPlanCourse.getDuration() : 0;
        Object[] objArr = new Object[1];
        objArr[0] = abilityDayPlanCourse != null ? Integer.valueOf(abilityDayPlanCourse.getDuration()) : null;
        textView.setText(resources.getQuantityString(i, duration, objArr));
        r93 r93Var6 = this.binding;
        if (r93Var6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            r93Var6 = null;
        }
        r93Var6.G.setImageResource(((abilityDayPlanCourse == null || (courseContent = abilityDayPlanCourse.getCourseContent()) == null) ? null : courseContent.getRunningCourse()) != null ? joi.course_left_running_indicator : joi.course_left_strength_indicator);
        if (this.isFromCourseList) {
            r93 r93Var7 = this.binding;
            if (r93Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                r93Var7 = null;
            }
            TextView courseAction = r93Var7.B;
            Intrinsics.checkNotNullExpressionValue(courseAction, "courseAction");
            ViewExtKt.gone(courseAction);
            r93 r93Var8 = this.binding;
            if (r93Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                r93Var = r93Var8;
            }
            TextView courseStatus = r93Var.D;
            Intrinsics.checkNotNullExpressionValue(courseStatus, "courseStatus");
            ViewExtKt.gone(courseStatus);
            return;
        }
        if (abilityDayPlanCourse == null || !PlanModelsKt.isFinished(abilityDayPlanCourse)) {
            r93 r93Var9 = this.binding;
            if (r93Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                r93Var9 = null;
            }
            r93Var9.B.setText(this.ctx.getString(m1j.u));
            r93 r93Var10 = this.binding;
            if (r93Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                r93Var10 = null;
            }
            TextView courseStatus2 = r93Var10.D;
            Intrinsics.checkNotNullExpressionValue(courseStatus2, "courseStatus");
            ViewExtKt.gone(courseStatus2);
            r93 r93Var11 = this.binding;
            if (r93Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                r93Var = r93Var11;
            }
            r93Var.B.setOnClickListener(new View.OnClickListener() { // from class: ctp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TrainingCalendarItem.showAbilityPlanCourse$lambda$3(this.f14710a, abilityDayPlanCourse, view);
                }
            });
            return;
        }
        r93 r93Var12 = this.binding;
        if (r93Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            r93Var12 = null;
        }
        r93Var12.B.setText(this.ctx.getString(m1j.v));
        r93 r93Var13 = this.binding;
        if (r93Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            r93Var13 = null;
        }
        TextView courseStatus3 = r93Var13.D;
        Intrinsics.checkNotNullExpressionValue(courseStatus3, "courseStatus");
        ViewExtKt.visible(courseStatus3);
        r93 r93Var14 = this.binding;
        if (r93Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            r93Var = r93Var14;
        }
        r93Var.B.setOnClickListener(new View.OnClickListener() { // from class: btp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingCalendarItem.showAbilityPlanCourse$lambda$1(abilityDayPlanCourse, this, view);
            }
        });
    }

    public final void showHabitDayPlan(@NotNull final HabitDayPlan habitDayPlan) {
        Intrinsics.checkNotNullParameter(habitDayPlan, "habitDayPlan");
        r93 r93Var = null;
        if (!this.isFromCourseList && this.tabEntrance) {
            r93 r93Var2 = this.binding;
            if (r93Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                r93Var2 = null;
            }
            r93Var2.getRoot().setOnClickListener(new View.OnClickListener() { // from class: xsp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TrainingCalendarItem.showHabitDayPlan$lambda$4(this.f39428a, habitDayPlan, view);
                }
            });
        }
        if (habitDayPlan.isRestDay()) {
            showRestDay();
            return;
        }
        r93 r93Var3 = this.binding;
        if (r93Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            r93Var3 = null;
        }
        LinearLayout abilityDurationLayout = r93Var3.A;
        Intrinsics.checkNotNullExpressionValue(abilityDurationLayout, "abilityDurationLayout");
        ViewExtKt.gone(abilityDurationLayout);
        r93 r93Var4 = this.binding;
        if (r93Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            r93Var4 = null;
        }
        r93Var4.F.setText(ApplicationExtKt.getApplication().getResources().getQuantityString(dyi.f16066b, (int) habitDayPlan.getDistance(), UIDataUtils.INSTANCE.calcFloatNumber(habitDayPlan.getDistance())));
        if (this.isFromCourseList) {
            r93 r93Var5 = this.binding;
            if (r93Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                r93Var5 = null;
            }
            TextView courseStatus = r93Var5.D;
            Intrinsics.checkNotNullExpressionValue(courseStatus, "courseStatus");
            ViewExtKt.gone(courseStatus);
            r93 r93Var6 = this.binding;
            if (r93Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                r93Var = r93Var6;
            }
            TextView courseAction = r93Var.B;
            Intrinsics.checkNotNullExpressionValue(courseAction, "courseAction");
            ViewExtKt.gone(courseAction);
            return;
        }
        if (PlanModelsKt.isFinished(habitDayPlan)) {
            r93 r93Var7 = this.binding;
            if (r93Var7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                r93Var7 = null;
            }
            TextView courseStatus2 = r93Var7.D;
            Intrinsics.checkNotNullExpressionValue(courseStatus2, "courseStatus");
            ViewExtKt.visible(courseStatus2);
            r93 r93Var8 = this.binding;
            if (r93Var8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                r93Var8 = null;
            }
            r93Var8.B.setText(this.ctx.getString(m1j.v));
            r93 r93Var9 = this.binding;
            if (r93Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                r93Var = r93Var9;
            }
            r93Var.B.setOnClickListener(new View.OnClickListener() { // from class: ysp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TrainingCalendarItem.showHabitDayPlan$lambda$5(habitDayPlan, this, view);
                }
            });
            return;
        }
        r93 r93Var10 = this.binding;
        if (r93Var10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            r93Var10 = null;
        }
        TextView courseStatus3 = r93Var10.D;
        Intrinsics.checkNotNullExpressionValue(courseStatus3, "courseStatus");
        ViewExtKt.gone(courseStatus3);
        r93 r93Var11 = this.binding;
        if (r93Var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            r93Var11 = null;
        }
        r93Var11.B.setBackground(this.ctx.getDrawable(joi.j));
        r93 r93Var12 = this.binding;
        if (r93Var12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            r93Var12 = null;
        }
        r93Var12.B.setText(this.ctx.getString(m1j.t));
        r93 r93Var13 = this.binding;
        if (r93Var13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            r93Var13 = null;
        }
        r93Var13.B.setTextColor(this.ctx.getColor(fki.d));
        r93 r93Var14 = this.binding;
        if (r93Var14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            r93Var = r93Var14;
        }
        r93Var.B.setOnClickListener(new View.OnClickListener() { // from class: zsp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingCalendarItem.showHabitDayPlan$lambda$6(this.f41638a, habitDayPlan, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainingCalendarItem(@NotNull FragmentActivity ctx, int i, long j, boolean z, boolean z2, @Nullable AttributeSet attributeSet) {
        super(ctx, attributeSet);
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        this.planType = i;
        this.planId = j;
        this.isFromCourseList = z;
        this.tabEntrance = z2;
        initView();
    }

    public final void showHabitDayPlan(int dayOfWeek, float distance, boolean isRestDay) {
        if (isRestDay) {
            showRestDay();
            return;
        }
        r93 r93Var = this.binding;
        r93 r93Var2 = null;
        if (r93Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            r93Var = null;
        }
        LinearLayout abilityDurationLayout = r93Var.A;
        Intrinsics.checkNotNullExpressionValue(abilityDurationLayout, "abilityDurationLayout");
        ViewExtKt.gone(abilityDurationLayout);
        r93 r93Var3 = this.binding;
        if (r93Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            r93Var3 = null;
        }
        r93Var3.F.setText(ApplicationExtKt.getApplication().getResources().getQuantityString(dyi.f16066b, (int) distance, UIDataUtils.INSTANCE.calcFloatNumber(distance)));
        r93 r93Var4 = this.binding;
        if (r93Var4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            r93Var4 = null;
        }
        TextView courseStatus = r93Var4.D;
        Intrinsics.checkNotNullExpressionValue(courseStatus, "courseStatus");
        ViewExtKt.gone(courseStatus);
        r93 r93Var5 = this.binding;
        if (r93Var5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            r93Var2 = r93Var5;
        }
        TextView courseAction = r93Var2.B;
        Intrinsics.checkNotNullExpressionValue(courseAction, "courseAction");
        ViewExtKt.gone(courseAction);
    }
}
