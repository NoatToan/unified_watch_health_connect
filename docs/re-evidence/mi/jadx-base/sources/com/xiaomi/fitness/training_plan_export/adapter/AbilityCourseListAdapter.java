package com.xiaomi.fitness.training_plan_export.adapter;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.training_plan_export.model.AbilityDayPlanCourse;
import com.xiaomi.fitness.training_plan_export.widget.TrainingCalendarItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001 B9\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u001c\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001aH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0015¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/adapter/AbilityCourseListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/training_plan_export/adapter/AbilityCourseListAdapter$AbilityCourseViewHolder;", "ctx", "Landroidx/fragment/app/FragmentActivity;", "planId", "", "courseList", "", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityDayPlanCourse;", "isRestDay", "", "isTabEntrance", "<init>", "(Landroidx/fragment/app/FragmentActivity;JLjava/util/List;ZZ)V", "getCtx", "()Landroidx/fragment/app/FragmentActivity;", "getPlanId", "()J", "getCourseList", "()Ljava/util/List;", "()Z", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "AbilityCourseViewHolder", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AbilityCourseListAdapter extends RecyclerView.Adapter<AbilityCourseViewHolder> {

    @NotNull
    private final List<AbilityDayPlanCourse> courseList;

    @NotNull
    private final FragmentActivity ctx;
    private final boolean isRestDay;
    private final boolean isTabEntrance;
    private final long planId;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/adapter/AbilityCourseListAdapter$AbilityCourseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/training_plan_export/widget/TrainingCalendarItem;", "view", "Lcom/xiaomi/fitness/training_plan_export/widget/TrainingCalendarItem;", "getView", "()Lcom/xiaomi/fitness/training_plan_export/widget/TrainingCalendarItem;", "<init>", "(Lcom/xiaomi/fitness/training_plan_export/adapter/AbilityCourseListAdapter;Lcom/xiaomi/fitness/training_plan_export/widget/TrainingCalendarItem;)V", "training-plan-export_release"}, k = 1, mv = {2, 0, 0})
    public final class AbilityCourseViewHolder extends RecyclerView.d0 {
        final /* synthetic */ AbilityCourseListAdapter this$0;

        @NotNull
        private final TrainingCalendarItem view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbilityCourseViewHolder(@NotNull AbilityCourseListAdapter abilityCourseListAdapter, TrainingCalendarItem view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = abilityCourseListAdapter;
            this.view = view;
        }

        @NotNull
        public final TrainingCalendarItem getView() {
            return this.view;
        }
    }

    public /* synthetic */ AbilityCourseListAdapter(FragmentActivity fragmentActivity, long j, List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity, j, list, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    @NotNull
    public final List<AbilityDayPlanCourse> getCourseList() {
        return this.courseList;
    }

    @NotNull
    public final FragmentActivity getCtx() {
        return this.ctx;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        if (this.isRestDay) {
            return 1;
        }
        return this.courseList.size();
    }

    public final long getPlanId() {
        return this.planId;
    }

    /* JADX INFO: renamed from: isRestDay, reason: from getter */
    public final boolean getIsRestDay() {
        return this.isRestDay;
    }

    /* JADX INFO: renamed from: isTabEntrance, reason: from getter */
    public final boolean getIsTabEntrance() {
        return this.isTabEntrance;
    }

    public AbilityCourseListAdapter(@NotNull FragmentActivity ctx, long j, @NotNull List<AbilityDayPlanCourse> courseList, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(courseList, "courseList");
        this.ctx = ctx;
        this.planId = j;
        this.courseList = courseList;
        this.isRestDay = z;
        this.isTabEntrance = z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull AbilityCourseViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (this.isRestDay) {
            holder.getView().showAbilityPlanCourse(null, true);
        } else {
            holder.getView().showAbilityPlanCourse(this.courseList.get(position), false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public AbilityCourseViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new AbilityCourseViewHolder(this, new TrainingCalendarItem(this.ctx, 2, this.planId, false, this.isTabEntrance, null, 40, null));
    }
}
