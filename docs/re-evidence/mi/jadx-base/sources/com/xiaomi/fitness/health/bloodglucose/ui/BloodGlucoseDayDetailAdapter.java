package com.xiaomi.fitness.health.bloodglucose.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.aggregation.BloodSugarGMIAndAGPResult;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyBloodSugarReport;
import defpackage.jui;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/ui/BloodGlucoseDayDetailAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;", "report", "setDataReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;)V", "Lcom/xiaomi/fit/fitness/export/data/aggregation/BloodSugarGMIAndAGPResult;", "setGMIAndAGP", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/BloodSugarGMIAndAGPResult;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "mDataReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;", "mGMIAndAGPData", "Lcom/xiaomi/fit/fitness/export/data/aggregation/BloodSugarGMIAndAGPResult;", "<init>", "(Landroid/content/Context;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BloodGlucoseDayDetailAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    private final Context context;

    @Nullable
    private DailyBloodSugarReport mDataReport;

    @Nullable
    private BloodSugarGMIAndAGPResult mGMIAndAGPData;

    public BloodGlucoseDayDetailAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return (this.mDataReport == null && this.mGMIAndAGPData == null) ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        DailyBloodSugarReport dailyBloodSugarReport = this.mDataReport;
        if (dailyBloodSugarReport == null && this.mGMIAndAGPData == null) {
            return;
        }
        BloodSugarGMIAndAGPResult bloodSugarGMIAndAGPResult = this.mGMIAndAGPData;
        if (holder instanceof BloodGlucoseDayDetailViewHolder) {
            holder.itemView.requestLayout();
            if (dailyBloodSugarReport != null) {
                ((BloodGlucoseDayDetailViewHolder) holder).bindData(this.context, dailyBloodSugarReport);
            }
            if (bloodSugarGMIAndAGPResult != null) {
                ((BloodGlucoseDayDetailViewHolder) holder).bindGMIAndAGP(this.context, bloodSugarGMIAndAGPResult);
            }
            ((BloodGlucoseDayDetailViewHolder) holder).bindGMIAndAGP(this.context, bloodSugarGMIAndAGPResult);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.D5, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new BloodGlucoseDayDetailViewHolder(viewInflate);
    }

    public final void setDataReport(@NotNull DailyBloodSugarReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        this.mDataReport = report;
    }

    public final void setGMIAndAGP(@NotNull BloodSugarGMIAndAGPResult report) {
        Intrinsics.checkNotNullParameter(report, "report");
        this.mGMIAndAGPData = report;
    }
}
