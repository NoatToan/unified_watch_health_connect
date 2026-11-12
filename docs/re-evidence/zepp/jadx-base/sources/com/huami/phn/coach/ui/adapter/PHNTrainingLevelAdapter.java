package com.huami.phn.coach.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.phn.coach.R;
import com.huami.phn.coach.usecase.PlanDetail;
import com.huami.phn.util.StringKt;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/huami/phn/coach/ui/adapter/PHNTrainingLevelAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/phn/coach/ui/adapter/PHNTrainingLevelAdapter$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "Lcom/huami/phn/coach/usecase/PlanDetail;", "planDetail", "initDailyPlan", "Landroid/content/Context;", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "b", "Lcom/huami/phn/coach/usecase/PlanDetail;", "mPlanDetail", "<init>", "(Landroid/content/Context;)V", "ViewHolder", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class PHNTrainingLevelAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private PlanDetail mPlanDetail;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\bR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006!"}, d2 = {"Lcom/huami/phn/coach/ui/adapter/PHNTrainingLevelAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getTvExerciseLevelTitle", "()Landroid/widget/TextView;", "setTvExerciseLevelTitle", "(Landroid/widget/TextView;)V", "tvExerciseLevelTitle", "b", "getTvAverageHeartRate", "setTvAverageHeartRate", "tvAverageHeartRate", "c", "getTvExerciseTime", "setTvExerciseTime", "tvExerciseTime", GoogleApiAvailabilityLight.a, "getTvExerciseTimeUnit", "setTvExerciseTimeUnit", "tvExerciseTimeUnit", "Landroid/view/View;", "e", "Landroid/view/View;", "getVLineLevel", "()Landroid/view/View;", "setVLineLevel", "(Landroid/view/View;)V", "vLineLevel", "itemView", "<init>", "(Lcom/huami/phn/coach/ui/adapter/PHNTrainingLevelAdapter;Landroid/view/View;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private TextView tvExerciseLevelTitle;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private TextView tvAverageHeartRate;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private TextView tvExerciseTime;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private TextView tvExerciseTimeUnit;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        private View vLineLevel;

        public ViewHolder(View view) {
            super(view);
            this.tvExerciseLevelTitle = (TextView) view.findViewById(R.id.tv_item_exercise_level_title);
            this.tvAverageHeartRate = (TextView) view.findViewById(R.id.tv_item_average_heart_rate_data);
            this.tvExerciseTime = (TextView) view.findViewById(R.id.tv_item_exercise_time_data);
            this.tvExerciseTimeUnit = (TextView) view.findViewById(R.id.tv_item_exercise_time_unit);
            this.vLineLevel = view.findViewById(R.id.v_line_level);
        }

        @NotNull
        public final TextView getTvAverageHeartRate() {
            return this.tvAverageHeartRate;
        }

        @NotNull
        public final TextView getTvExerciseLevelTitle() {
            return this.tvExerciseLevelTitle;
        }

        @NotNull
        public final TextView getTvExerciseTime() {
            return this.tvExerciseTime;
        }

        @NotNull
        public final TextView getTvExerciseTimeUnit() {
            return this.tvExerciseTimeUnit;
        }

        @NotNull
        public final View getVLineLevel() {
            return this.vLineLevel;
        }

        public final void setTvAverageHeartRate(@NotNull TextView textView) {
            this.tvAverageHeartRate = textView;
        }

        public final void setTvExerciseLevelTitle(@NotNull TextView textView) {
            this.tvExerciseLevelTitle = textView;
        }

        public final void setTvExerciseTime(@NotNull TextView textView) {
            this.tvExerciseTime = textView;
        }

        public final void setTvExerciseTimeUnit(@NotNull TextView textView) {
            this.tvExerciseTimeUnit = textView;
        }

        public final void setVLineLevel(@NotNull View view) {
            this.vLineLevel = view;
        }
    }

    public PHNTrainingLevelAdapter(@NotNull Context context) {
        this.context = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return 3;
    }

    public final void initDailyPlan(@NotNull PlanDetail planDetail) {
        this.mPlanDetail = planDetail;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        PlanDetail.DailyPlan plan;
        PlanDetail.TaringPlan low;
        PlanDetail.DailyPlan plan2;
        PlanDetail.TaringPlan low2;
        PlanDetail.DailyPlan plan3;
        PlanDetail.TaringPlan middle;
        PlanDetail.DailyPlan plan4;
        PlanDetail.TaringPlan middle2;
        PlanDetail.DailyPlan plan5;
        PlanDetail.TaringPlan high;
        PlanDetail.DailyPlan plan6;
        PlanDetail.TaringPlan high2;
        String strI18n = null;
        if (position == 0) {
            holder.getTvExerciseLevelTitle().setText(this.context.getString(R.string.phn_tasks_low_intensity_exercise));
            TextView tvAverageHeartRate = holder.getTvAverageHeartRate();
            PlanDetail planDetail = this.mPlanDetail;
            if (planDetail != null && (plan2 = planDetail.getPlan()) != null && (low2 = plan2.getLow()) != null) {
                strI18n = StringKt.i18n(Integer.valueOf(low2.getHr()).intValue());
            }
            tvAverageHeartRate.setText(strI18n);
            PlanDetail planDetail2 = this.mPlanDetail;
            if (planDetail2 == null || (plan = planDetail2.getPlan()) == null || (low = plan.getLow()) == null) {
                return;
            }
            int iIntValue = Integer.valueOf(low.getDuration()).intValue();
            holder.getTvExerciseTime().setText(StringKt.i18n(iIntValue));
            holder.getTvExerciseTimeUnit().setText(this.context.getResources().getQuantityString(R.plurals.phn_exercise_time_unit, iIntValue));
            return;
        }
        if (position == 1) {
            holder.getTvExerciseLevelTitle().setText(this.context.getString(R.string.phn_tasks_medium_intensity_exercise));
            TextView tvAverageHeartRate2 = holder.getTvAverageHeartRate();
            PlanDetail planDetail3 = this.mPlanDetail;
            if (planDetail3 != null && (plan4 = planDetail3.getPlan()) != null && (middle2 = plan4.getMiddle()) != null) {
                strI18n = StringKt.i18n(Integer.valueOf(middle2.getHr()).intValue());
            }
            tvAverageHeartRate2.setText(strI18n);
            PlanDetail planDetail4 = this.mPlanDetail;
            if (planDetail4 == null || (plan3 = planDetail4.getPlan()) == null || (middle = plan3.getMiddle()) == null) {
                return;
            }
            int iIntValue2 = Integer.valueOf(middle.getDuration()).intValue();
            holder.getTvExerciseTime().setText(StringKt.i18n(iIntValue2));
            holder.getTvExerciseTimeUnit().setText(this.context.getResources().getQuantityString(R.plurals.phn_exercise_time_unit, iIntValue2));
            return;
        }
        if (position != 2) {
            return;
        }
        holder.getTvExerciseLevelTitle().setText(this.context.getString(R.string.phn_tasks_high_intensity_exercise));
        TextView tvAverageHeartRate3 = holder.getTvAverageHeartRate();
        PlanDetail planDetail5 = this.mPlanDetail;
        if (planDetail5 != null && (plan6 = planDetail5.getPlan()) != null && (high2 = plan6.getHigh()) != null) {
            strI18n = StringKt.i18n(Integer.valueOf(high2.getHr()).intValue());
        }
        tvAverageHeartRate3.setText(strI18n);
        PlanDetail planDetail6 = this.mPlanDetail;
        if (planDetail6 != null && (plan5 = planDetail6.getPlan()) != null && (high = plan5.getHigh()) != null) {
            int iIntValue3 = Integer.valueOf(high.getDuration()).intValue();
            holder.getTvExerciseTime().setText(StringKt.i18n(iIntValue3));
            holder.getTvExerciseTimeUnit().setText(this.context.getResources().getQuantityString(R.plurals.phn_exercise_time_unit, iIntValue3));
        }
        holder.getVLineLevel().setVisibility(8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.phn_item_today_plan_exercise_level, parent, false));
    }
}
