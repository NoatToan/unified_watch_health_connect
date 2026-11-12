package com.xiaomi.fitness.training_plan.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.training_plan.adapter.HabitMedalAdapter;
import com.xiaomi.fitness.training_plan.util.TrainingDataUtils;
import com.xiaomi.fitness.training_plan_export.model.HabitPlanSummary;
import defpackage.csi;
import defpackage.cyi;
import defpackage.eki;
import defpackage.jvi;
import defpackage.k1j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0019\u001a\u00020\u001aH\u0014J\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/HabitHomeDetailCard;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "trainDays", "Lcom/xiaomi/fitness/training_plan/widget/SummaryDataItemLayout;", "trainDuration", "trainDistance", "trainCal", "allRecordTV", "Landroid/widget/TextView;", "getAllRecordTV", "()Landroid/widget/TextView;", "setAllRecordTV", "(Landroid/widget/TextView;)V", "medalRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "medalProgressInfoLayout", "Lcom/xiaomi/fitness/training_plan/widget/HabitHomeMedalProgressInfoLayout;", "medalAdapter", "Lcom/xiaomi/fitness/training_plan/adapter/HabitMedalAdapter;", "onFinishInflate", "", "renderMedal", "time", "", "renderSummary", "summary", "Lcom/xiaomi/fitness/training_plan_export/model/HabitPlanSummary;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitHomeDetailCard extends ConstraintLayout {
    public TextView allRecordTV;

    @Nullable
    private HabitMedalAdapter medalAdapter;
    private HabitHomeMedalProgressInfoLayout medalProgressInfoLayout;
    private RecyclerView medalRecyclerView;
    private SummaryDataItemLayout trainCal;
    private SummaryDataItemLayout trainDays;
    private SummaryDataItemLayout trainDistance;
    private SummaryDataItemLayout trainDuration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabitHomeDetailCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(jvi.J, this);
    }

    @NotNull
    public final TextView getAllRecordTV() {
        TextView textView = this.allRecordTV;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("allRecordTV");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.trainDays = (SummaryDataItemLayout) findViewById(csi.k4);
        this.trainDuration = (SummaryDataItemLayout) findViewById(csi.A4);
        this.trainDistance = (SummaryDataItemLayout) findViewById(csi.z4);
        this.trainCal = (SummaryDataItemLayout) findViewById(csi.y4);
        this.medalRecyclerView = (RecyclerView) findViewById(csi.p0);
        setAllRecordTV((TextView) findViewById(csi.v0));
        this.medalProgressInfoLayout = (HabitHomeMedalProgressInfoLayout) findViewById(csi.q0);
    }

    public final void renderMedal(int time) {
        HabitHomeMedalProgressInfoLayout habitHomeMedalProgressInfoLayout = this.medalProgressInfoLayout;
        if (habitHomeMedalProgressInfoLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("medalProgressInfoLayout");
            habitHomeMedalProgressInfoLayout = null;
        }
        habitHomeMedalProgressInfoLayout.setTrainingTime(time);
    }

    public final void renderSummary(@NotNull HabitPlanSummary summary) {
        Intrinsics.checkNotNullParameter(summary, "summary");
        SummaryDataItemLayout summaryDataItemLayout = this.trainDays;
        SummaryDataItemLayout summaryDataItemLayout2 = null;
        if (summaryDataItemLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trainDays");
            summaryDataItemLayout = null;
        }
        String string = ResourceExtKt.getString(k1j.e1);
        String strValueOf = String.valueOf(summary.getFinishedTrainingTimes());
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        summaryDataItemLayout.update(string, strValueOf, ResourceExtKt.getQuantityString(context, cyi.p, summary.getFinishedTrainingTimes(), Integer.valueOf(summary.getFinishedTrainingTimes())));
        SummaryDataItemLayout summaryDataItemLayout3 = this.trainDays;
        if (summaryDataItemLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trainDays");
            summaryDataItemLayout3 = null;
        }
        summaryDataItemLayout3.setValueMarginTop(14);
        SummaryDataItemLayout summaryDataItemLayout4 = this.trainDays;
        if (summaryDataItemLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trainDays");
            summaryDataItemLayout4 = null;
        }
        summaryDataItemLayout4.setLabelTextSize(14);
        SummaryDataItemLayout summaryDataItemLayout5 = this.trainDays;
        if (summaryDataItemLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trainDays");
            summaryDataItemLayout5 = null;
        }
        summaryDataItemLayout5.setUnitTextColor(eki.d);
        TrainingDataUtils trainingDataUtils = TrainingDataUtils.INSTANCE;
        Pair<String, String> pairHandleTotalDuration = trainingDataUtils.handleTotalDuration(summary.getTotalDuration());
        SummaryDataItemLayout summaryDataItemLayout6 = this.trainDuration;
        if (summaryDataItemLayout6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trainDuration");
            summaryDataItemLayout6 = null;
        }
        summaryDataItemLayout6.update(ResourceExtKt.getString(k1j.g1), pairHandleTotalDuration.getFirst(), pairHandleTotalDuration.getSecond());
        Pair<String, String> pairHandleTotalDistance = trainingDataUtils.handleTotalDistance(summary.getTotalDistance());
        SummaryDataItemLayout summaryDataItemLayout7 = this.trainDistance;
        if (summaryDataItemLayout7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trainDistance");
            summaryDataItemLayout7 = null;
        }
        summaryDataItemLayout7.update(ResourceExtKt.getString(k1j.f1), pairHandleTotalDistance.getFirst(), pairHandleTotalDistance.getSecond());
        SummaryDataItemLayout summaryDataItemLayout8 = this.trainCal;
        if (summaryDataItemLayout8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trainCal");
        } else {
            summaryDataItemLayout2 = summaryDataItemLayout8;
        }
        String string2 = ResourceExtKt.getString(k1j.d1);
        String strValueOf2 = String.valueOf((int) summary.getTotalCalorie());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        summaryDataItemLayout2.update(string2, strValueOf2, ResourceExtKt.getQuantityString(context2, cyi.j, (int) summary.getTotalCalorie(), Float.valueOf(summary.getTotalCalorie())));
    }

    public final void setAllRecordTV(@NotNull TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.allRecordTV = textView;
    }
}
