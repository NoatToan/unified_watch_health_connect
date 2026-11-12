package com.xiaomi.fitness.training_plan_export.adapter;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import com.xiaomi.fitness.training_plan_export.widget.TrainingCalendarItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u001c\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0012H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/adapter/HabitDayPlanListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/training_plan_export/adapter/HabitDayPlanListAdapter$HabitDayPlanViewHolder;", "ctx", "Landroidx/fragment/app/FragmentActivity;", "habitDayPlans", "", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "<init>", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;)V", "getCtx", "()Landroidx/fragment/app/FragmentActivity;", "getHabitDayPlans", "()Ljava/util/List;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "HabitDayPlanViewHolder", "training-plan-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitDayPlanListAdapter extends RecyclerView.Adapter<HabitDayPlanViewHolder> {

    @NotNull
    private final FragmentActivity ctx;

    @NotNull
    private final List<HabitDayPlan> habitDayPlans;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/training_plan_export/adapter/HabitDayPlanListAdapter$HabitDayPlanViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/training_plan_export/widget/TrainingCalendarItem;", "view", "Lcom/xiaomi/fitness/training_plan_export/widget/TrainingCalendarItem;", "getView", "()Lcom/xiaomi/fitness/training_plan_export/widget/TrainingCalendarItem;", "<init>", "(Lcom/xiaomi/fitness/training_plan_export/adapter/HabitDayPlanListAdapter;Lcom/xiaomi/fitness/training_plan_export/widget/TrainingCalendarItem;)V", "training-plan-export_release"}, k = 1, mv = {2, 0, 0})
    public final class HabitDayPlanViewHolder extends RecyclerView.d0 {
        final /* synthetic */ HabitDayPlanListAdapter this$0;

        @NotNull
        private final TrainingCalendarItem view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HabitDayPlanViewHolder(@NotNull HabitDayPlanListAdapter habitDayPlanListAdapter, TrainingCalendarItem view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = habitDayPlanListAdapter;
            this.view = view;
        }

        @NotNull
        public final TrainingCalendarItem getView() {
            return this.view;
        }
    }

    public HabitDayPlanListAdapter(@NotNull FragmentActivity ctx, @NotNull List<HabitDayPlan> habitDayPlans) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(habitDayPlans, "habitDayPlans");
        this.ctx = ctx;
        this.habitDayPlans = habitDayPlans;
    }

    @NotNull
    public final FragmentActivity getCtx() {
        return this.ctx;
    }

    @NotNull
    public final List<HabitDayPlan> getHabitDayPlans() {
        return this.habitDayPlans;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.habitDayPlans.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull HabitDayPlanViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.getView().showHabitDayPlan(this.habitDayPlans.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public HabitDayPlanViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new HabitDayPlanViewHolder(this, new TrainingCalendarItem(this.ctx, 1, 0L, false, true, null, 44, null));
    }
}
