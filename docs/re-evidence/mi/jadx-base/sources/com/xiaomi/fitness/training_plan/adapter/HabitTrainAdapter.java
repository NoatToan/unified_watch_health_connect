package com.xiaomi.fitness.training_plan.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.training_plan.util.CalendarUtils;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import com.xiaomi.fitness.training_plan_export.utils.UIDataUtils;
import defpackage.chi;
import defpackage.csi;
import defpackage.cyi;
import defpackage.ioi;
import defpackage.jvi;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u001c\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0010H\u0017J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0002J\u0014\u0010\u0019\u001a\u00020\u00132\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/training_plan/adapter/HabitTrainAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/training_plan/adapter/HabitTrainAdapter$Holder;", "data", "", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "<init>", "(Ljava/util/List;)V", "trainData", "", "getTrainData", "()Ljava/util/List;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "getDayOfWeekString", "", "dayOfWeek", "setData", "Holder", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitTrainAdapter extends RecyclerView.Adapter<Holder> {

    @NotNull
    private final List<HabitDayPlan> trainData;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u001f\u0010\u000b\u001a\n \u0003*\u0004\u0018\u00010\n0\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u000f\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007R\u001f\u0010\u0011\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/training_plan/adapter/HabitTrainAdapter$Holder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "week", "Landroid/widget/TextView;", "getWeek", "()Landroid/widget/TextView;", "day", "getDay", "Landroid/widget/ImageView;", "itemIndicator", "Landroid/widget/ImageView;", "getItemIndicator", "()Landroid/widget/ImageView;", "itemName", "getItemName", "itemRest", "getItemRest", "Landroid/view/View;", "view", "<init>", "(Lcom/xiaomi/fitness/training_plan/adapter/HabitTrainAdapter;Landroid/view/View;)V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class Holder extends RecyclerView.d0 {
        private final TextView day;
        private final ImageView itemIndicator;
        private final TextView itemName;
        private final TextView itemRest;
        final /* synthetic */ HabitTrainAdapter this$0;
        private final TextView week;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Holder(@NotNull HabitTrainAdapter habitTrainAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = habitTrainAdapter;
            this.week = (TextView) view.findViewById(csi.l5);
            this.day = (TextView) view.findViewById(csi.W);
            this.itemIndicator = (ImageView) view.findViewById(csi.u4);
            this.itemName = (TextView) view.findViewById(csi.v4);
            this.itemRest = (TextView) view.findViewById(csi.B2);
        }

        public final TextView getDay() {
            return this.day;
        }

        public final ImageView getItemIndicator() {
            return this.itemIndicator;
        }

        public final TextView getItemName() {
            return this.itemName;
        }

        public final TextView getItemRest() {
            return this.itemRest;
        }

        public final TextView getWeek() {
            return this.week;
        }
    }

    public HabitTrainAdapter(@NotNull List<HabitDayPlan> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ArrayList arrayList = new ArrayList();
        this.trainData = arrayList;
        arrayList.clear();
        arrayList.addAll(data);
    }

    private final String getDayOfWeekString(int dayOfWeek) {
        return (1 > dayOfWeek || dayOfWeek >= 8) ? "" : ResourceExtKt.getStringArray(ApplicationExtKt.getApplication(), chi.f5349a)[dayOfWeek - 1];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.trainData.size();
    }

    @NotNull
    public final List<HabitDayPlan> getTrainData() {
        return this.trainData;
    }

    public final void setData(@NotNull List<HabitDayPlan> trainData) {
        Intrinsics.checkNotNullParameter(trainData, "trainData");
        this.trainData.clear();
        this.trainData.addAll(trainData);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"SetTextI18n"})
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HabitDayPlan habitDayPlan = this.trainData.get(position);
        if (habitDayPlan.isRestDay()) {
            TextView itemName = holder.getItemName();
            Intrinsics.checkNotNullExpressionValue(itemName, "<get-itemName>(...)");
            ViewExtKt.setVisible(itemName, false);
            TextView itemRest = holder.getItemRest();
            Intrinsics.checkNotNullExpressionValue(itemRest, "<get-itemRest>(...)");
            ViewExtKt.setVisible(itemRest, true);
            holder.getItemIndicator().setImageResource(ioi.course_left_rest_indicator);
        } else {
            TextView itemName2 = holder.getItemName();
            Intrinsics.checkNotNullExpressionValue(itemName2, "<get-itemName>(...)");
            ViewExtKt.setVisible(itemName2, true);
            TextView itemRest2 = holder.getItemRest();
            Intrinsics.checkNotNullExpressionValue(itemRest2, "<get-itemRest>(...)");
            ViewExtKt.setVisible(itemRest2, false);
            holder.getItemName().setText(ApplicationExtKt.getApplication().getResources().getQuantityString(cyi.f14869r, (int) habitDayPlan.getDistance(), UIDataUtils.INSTANCE.calcFloatNumber(habitDayPlan.getDistance())));
            holder.getItemIndicator().setImageResource(ioi.course_left_running_indicator);
        }
        holder.getWeek().setText(getDayOfWeekString(habitDayPlan.getDayOfWeek()));
        holder.getDay().setText(String.valueOf(CalendarUtils.INSTANCE.calcDayOfMonth(new Date(habitDayPlan.getDate() * ((long) 1000)))));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jvi.S, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new Holder(this, viewInflate);
    }
}
