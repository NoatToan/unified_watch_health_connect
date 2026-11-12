package com.xiaomi.fitness.training_plan.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import com.xiaomi.fitness.training_plan_export.widget.TrainingCalendarItem;
import defpackage.csi;
import defpackage.jvi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u001a\u0010\b\u001a\u00020\u0001X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/HabitHomeTrainTodayCard;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cardRoot", "getCardRoot", "()Landroid/widget/LinearLayout;", "setCardRoot", "(Landroid/widget/LinearLayout;)V", "todayTrainingView", "Lcom/xiaomi/fitness/training_plan_export/widget/TrainingCalendarItem;", "onFinishInflate", "", "render", "plan", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitHomeTrainTodayCard extends LinearLayout {
    public LinearLayout cardRoot;

    @Nullable
    private TrainingCalendarItem todayTrainingView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabitHomeTrainTodayCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(jvi.L, this);
    }

    @NotNull
    public final LinearLayout getCardRoot() {
        LinearLayout linearLayout = this.cardRoot;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cardRoot");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setCardRoot((LinearLayout) findViewById(csi.q));
    }

    @SuppressLint({"SetTextI18n"})
    public final void render(@NotNull HabitDayPlan plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        if (this.todayTrainingView != null) {
            getCardRoot().removeView(this.todayTrainingView);
        }
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        TrainingCalendarItem trainingCalendarItem = new TrainingCalendarItem((FragmentActivity) context, 1, 0L, false, false, null, 60, null);
        trainingCalendarItem.showHabitDayPlan(plan);
        this.todayTrainingView = trainingCalendarItem;
        getCardRoot().addView(this.todayTrainingView);
    }

    public final void setCardRoot(@NotNull LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.cardRoot = linearLayout;
    }
}
