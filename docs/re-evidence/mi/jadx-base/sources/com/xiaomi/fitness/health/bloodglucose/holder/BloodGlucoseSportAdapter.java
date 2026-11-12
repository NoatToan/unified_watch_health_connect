package com.xiaomi.fitness.health.bloodglucose.holder;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.fitness.export.data.aggregation.SportBloodSugarData;
import com.xiaomi.fitness.health.bloodglucose.holder.BloodGlucoseSportAdapter;
import com.xiaomi.fitness.trail.export.SportRecordApi;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import defpackage.jui;
import defpackage.lp5;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseSportAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseSportHolder;", "holder", "Lcom/xiaomi/fit/fitness/export/data/aggregation/SportBloodSugarData;", "report", "", "setOnViewHolderClickListener", "(Lcom/xiaomi/fitness/health/bloodglucose/holder/BloodGlucoseSportHolder;Lcom/xiaomi/fit/fitness/export/data/aggregation/SportBloodSugarData;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "", "list", "setDataList", "(Ljava/util/List;)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "mDataList", "Ljava/util/List;", "<init>", "(Landroid/content/Context;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BloodGlucoseSportAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    private final Context context;

    @NotNull
    private List<SportBloodSugarData> mDataList;

    public BloodGlucoseSportAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.mDataList = new ArrayList();
    }

    private final void setOnViewHolderClickListener(final BloodGlucoseSportHolder holder, final SportBloodSugarData report) {
        holder.getTitleImageView().setOnClickListener(new View.OnClickListener() { // from class: zx2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BloodGlucoseSportAdapter.setOnViewHolderClickListener$lambda$0(report, holder, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnViewHolderClickListener$lambda$0(SportBloodSugarData report, BloodGlucoseSportHolder holder, View view) {
        Intrinsics.checkNotNullParameter(report, "$report");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        SportBasicReport sportReport = report.getSportReport();
        Bundle bundle = new Bundle();
        int iA = lp5.a(sportReport);
        bundle.putLong("time_stamp", sportReport.getTimeStamp());
        bundle.putSerializable("sport_report", sportReport);
        bundle.putInt("sport_type", iA);
        SportRecordApi sportRecordApi = SportRecordApiKt.getSportRecordApi();
        Context context = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SportRecordApi.DefaultImpls.goSportDetail$default(sportRecordApi, context, bundle, sportReport, false, 8, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.mDataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SportBloodSugarData sportBloodSugarData = this.mDataList.get(position);
        if (holder instanceof BloodGlucoseSportHolder) {
            holder.itemView.requestLayout();
            BloodGlucoseSportHolder bloodGlucoseSportHolder = (BloodGlucoseSportHolder) holder;
            bloodGlucoseSportHolder.bindData(this.context, sportBloodSugarData);
            setOnViewHolderClickListener(bloodGlucoseSportHolder, sportBloodSugarData);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.L2, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new BloodGlucoseSportHolder(viewInflate);
    }

    public final void setDataList(@NotNull List<SportBloodSugarData> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.mDataList = list;
    }
}
