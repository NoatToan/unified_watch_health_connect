package com.xiaomi.fitness.training_plan.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.training_plan.adapter.AbilityPlanCourseListAdapter;
import com.xiaomi.fitness.training_plan.util.CalendarUtilsKt;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlan;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlanCourse;
import com.xiaomi.fitness.training_plan_export.widget.TrainingCalendarItem;
import defpackage.pf;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\rH\u0007J\u001c\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u001c\u0010\u0014\u001a\u00020\u000b2\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/training_plan/adapter/AbilityPlanCourseListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/training_plan/adapter/AbilityPlanCourseListAdapter$CourseViewHolder;", "ctx", "Landroidx/fragment/app/FragmentActivity;", "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "planCourseList", "", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlan;", "updatePlanCourses", "", "courseList", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "holder", "position", "CourseViewHolder", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAbilityPlanCourseListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbilityPlanCourseListAdapter.kt\ncom/xiaomi/fitness/training_plan/adapter/AbilityPlanCourseListAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,109:1\n1863#2,2:110\n*S KotlinDebug\n*F\n+ 1 AbilityPlanCourseListAdapter.kt\ncom/xiaomi/fitness/training_plan/adapter/AbilityPlanCourseListAdapter\n*L\n63#1:110,2\n*E\n"})
public final class AbilityPlanCourseListAdapter extends RecyclerView.Adapter<CourseViewHolder> {

    @NotNull
    private final FragmentActivity ctx;

    @NotNull
    private final List<AbilityDayPlan> planCourseList;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/training_plan/adapter/AbilityPlanCourseListAdapter$CourseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lpf;", "binding", "Lpf;", "getBinding", "()Lpf;", "<init>", "(Lcom/xiaomi/fitness/training_plan/adapter/AbilityPlanCourseListAdapter;Lpf;)V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class CourseViewHolder extends RecyclerView.d0 {

        @NotNull
        private final pf binding;
        final /* synthetic */ AbilityPlanCourseListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CourseViewHolder(@NotNull AbilityPlanCourseListAdapter abilityPlanCourseListAdapter, pf binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = abilityPlanCourseListAdapter;
            this.binding = binding;
        }

        @NotNull
        public final pf getBinding() {
            return this.binding;
        }
    }

    public AbilityPlanCourseListAdapter(@NotNull FragmentActivity ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        this.planCourseList = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$7$lambda$6(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.planCourseList.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void updatePlanCourses(@Nullable List<AbilityDayPlan> courseList) {
        if (courseList != null) {
            this.planCourseList.clear();
            this.planCourseList.addAll(courseList);
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull CourseViewHolder holder, int position) {
        boolean z;
        Intrinsics.checkNotNullParameter(holder, "holder");
        AbilityDayPlan abilityDayPlan = this.planCourseList.get(position);
        holder.getBinding().B.setText(CalendarUtilsKt.getDayOfMonth(abilityDayPlan.getDate()));
        holder.getBinding().C.setText(CalendarUtilsKt.getDayOfWeekStr(this.ctx, abilityDayPlan.getDayOfWeek()));
        holder.getBinding().A.removeAllViews();
        holder.getBinding().D.setVisibility(8);
        if (abilityDayPlan.isRestDay()) {
            TrainingCalendarItem trainingCalendarItem = new TrainingCalendarItem(this.ctx, 2, 0L, true, false, null, 52, null);
            trainingCalendarItem.showAbilityPlanCourse(null, true);
            holder.getBinding().A.addView(trainingCalendarItem, new LinearLayout.LayoutParams(-1, -2));
            return;
        }
        if (abilityDayPlan.getCourseList() != null) {
            List<AbilityDayPlanCourse> courseList = abilityDayPlan.getCourseList();
            Intrinsics.checkNotNull(courseList);
            if (courseList.size() > 1) {
                holder.getBinding().D.setVisibility(0);
            }
        }
        List<AbilityDayPlanCourse> courseList2 = abilityDayPlan.getCourseList();
        if (courseList2 != null) {
            int i = 0;
            for (AbilityDayPlanCourse abilityDayPlanCourse : courseList2) {
                TrainingCalendarItem trainingCalendarItem2 = new TrainingCalendarItem(this.ctx, 2, 0L, true, false, null, 52, null);
                trainingCalendarItem2.showAbilityPlanCourse(abilityDayPlanCourse, false);
                if (i == 0) {
                    LinearLayout linearLayout = holder.getBinding().A;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.bottomMargin = ExtUtilsKt.getDp(6);
                    Unit unit = Unit.INSTANCE;
                    linearLayout.addView(trainingCalendarItem2, layoutParams);
                    z = true;
                } else {
                    List<AbilityDayPlanCourse> courseList3 = abilityDayPlan.getCourseList();
                    Intrinsics.checkNotNull(courseList3);
                    z = true;
                    if (i == courseList3.size() - 1) {
                        LinearLayout linearLayout2 = holder.getBinding().A;
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams2.topMargin = ExtUtilsKt.getDp(6);
                        Unit unit2 = Unit.INSTANCE;
                        linearLayout2.addView(trainingCalendarItem2, layoutParams2);
                    } else {
                        LinearLayout linearLayout3 = holder.getBinding().A;
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams3.bottomMargin = ExtUtilsKt.getDp(6);
                        layoutParams3.topMargin = ExtUtilsKt.getDp(6);
                        Unit unit3 = Unit.INSTANCE;
                        linearLayout3.addView(trainingCalendarItem2, layoutParams3);
                    }
                }
                trainingCalendarItem2.setOnClickListener(new View.OnClickListener() { // from class: gi
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AbilityPlanCourseListAdapter.onBindViewHolder$lambda$7$lambda$6(view);
                    }
                });
                i++;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public CourseViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        pf pfVarA0 = pf.A0(LayoutInflater.from(this.ctx));
        Intrinsics.checkNotNullExpressionValue(pfVarA0, "inflate(...)");
        return new CourseViewHolder(this, pfVarA0);
    }
}
