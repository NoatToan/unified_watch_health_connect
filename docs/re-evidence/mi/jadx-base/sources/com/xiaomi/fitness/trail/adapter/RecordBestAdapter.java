package com.xiaomi.fitness.trail.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.data.common.data.sport.SportSummary;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.trail.adapter.RecordBestAdapter;
import com.xiaomi.fitness.trail.data.RecordUtilKt;
import com.xiaomi.fitness.trail.data.ValueType;
import defpackage.hoi;
import defpackage.j1j;
import defpackage.lpp;
import defpackage.pz6;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\u0016\u0010\u001a\u001a\u00020\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001cH\u0007J\u000e\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001eR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/trail/adapter/RecordBestAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/trail/adapter/Holder;", "context", "Landroid/content/Context;", "onItemClick", "Lkotlin/Function1;", "Lcom/xiaomi/fit/data/common/data/sport/SportSummary$MaxData;", "", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "list", "", "inflater", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "Landroid/view/LayoutInflater;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "setData", "maxList", "", "category", "", "setCategory", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecordBestAdapter extends RecyclerView.Adapter<Holder> {

    @NotNull
    private String category;
    private final LayoutInflater inflater;

    @NotNull
    private final List<SportSummary.MaxData> list;

    @NotNull
    private final Function1<SportSummary.MaxData, Unit> onItemClick;

    /* JADX WARN: Multi-variable type inference failed */
    public RecordBestAdapter(@NotNull Context context, @NotNull Function1<? super SportSummary.MaxData, Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.onItemClick = onItemClick;
        this.list = new ArrayList();
        this.inflater = LayoutInflater.from(context);
        this.category = "sport_stats_all";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$1$lambda$0(RecordBestAdapter this$0, Holder this_apply, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Function1<SportSummary.MaxData, Unit> function1 = this$0.onItemClick;
        Object tag = this_apply.itemView.getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fit.data.common.data.sport.SportSummary.MaxData");
        function1.invoke2((SportSummary.MaxData) tag);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.list.size();
    }

    public final void setCategory(@NotNull String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.category = category;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setData(@NotNull List<? extends SportSummary.MaxData> maxList) {
        Intrinsics.checkNotNullParameter(maxList, "maxList");
        this.list.clear();
        this.list.addAll(maxList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull Holder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SportSummary.MaxData maxData = this.list.get(position);
        holder.itemView.setTag(maxData);
        holder.getBinding().B.setText(TimeDateUtil.getDateYYYYMMddLocalFormat(maxData.key.time * 1000));
        long j = maxData.value.intValue;
        int i = maxData.dataType;
        if (i == SportSummary.MaxData.TYPE_DURATION) {
            holder.getBinding().G.setText(j1j.R0);
            holder.getBinding().D.setImageResource(hoi.x1);
            holder.getBinding().E.setText(RecordUtilKt.formatDuration(j));
            return;
        }
        if (i == SportSummary.MaxData.TYPE_DISTANCE) {
            holder.getBinding().G.setText(j1j.Q0);
            holder.getBinding().D.setImageResource(hoi.v1);
            if (Intrinsics.areEqual(this.category, "swimming")) {
                TextView infoView = holder.getBinding().E;
                Intrinsics.checkNotNullExpressionValue(infoView, "infoView");
                RecordUtilKt.setDataFormat$default(infoView, String.valueOf(j), ResourceExtKt.getString(j1j.o1), 0, 8, null);
                return;
            }
            TextView infoView2 = holder.getBinding().E;
            Intrinsics.checkNotNullExpressionValue(infoView2, "infoView");
            int i2 = (int) j;
            String strE = pz6.e(i2);
            Intrinsics.checkNotNullExpressionValue(strE, "getDistanceStrWithoutUnit(...)");
            String strG = pz6.g(i2);
            Intrinsics.checkNotNullExpressionValue(strG, "getDistanceUnit(...)");
            RecordUtilKt.setDataFormat$default(infoView2, strE, strG, 0, 8, null);
            return;
        }
        if (i == SportSummary.MaxData.TYPE_CALORIE) {
            holder.getBinding().G.setText(j1j.o0);
            holder.getBinding().D.setImageResource(hoi.t1);
            TextView infoView3 = holder.getBinding().E;
            Intrinsics.checkNotNullExpressionValue(infoView3, "infoView");
            RecordUtilKt.setDataStr$default(infoView3, ValueType.CALORIE.INSTANCE, String.valueOf(j), 12, 0, 16, null);
            return;
        }
        if (i == SportSummary.MaxData.TYPE_PACE) {
            holder.getBinding().G.setText(j1j.M1);
            holder.getBinding().D.setImageResource(hoi.w1);
            holder.getBinding().E.setText(TimeDateUtil.getSportPaceStrWithSecDef((int) j));
        } else {
            if (i == SportSummary.MaxData.TYPE_SPEED) {
                holder.getBinding().G.setText(j1j.z2);
                holder.getBinding().D.setImageResource(hoi.w1);
                TextView infoView4 = holder.getBinding().E;
                Intrinsics.checkNotNullExpressionValue(infoView4, "infoView");
                RecordUtilKt.setDataStr$default(infoView4, Intrinsics.areEqual(this.category, "swimming") ? ValueType.SpeedSecHM.INSTANCE : ValueType.SpeedKMHour.INSTANCE, RecordUtilKt.formatSpeed(maxData.value.floatValue), 12, 0, 16, null);
                return;
            }
            if (i == SportSummary.MaxData.TYPE_ACTION_COUNT) {
                holder.getBinding().G.setText(j1j.w0);
                holder.getBinding().D.setImageResource(hoi.u1);
                TextView infoView5 = holder.getBinding().E;
                Intrinsics.checkNotNullExpressionValue(infoView5, "infoView");
                RecordUtilKt.setDataStr(infoView5, ValueType.Count.INSTANCE, String.valueOf(maxData.value.intValue), 12, (int) maxData.value.intValue);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public Holder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        lpp lppVarC0 = lpp.C0(this.inflater, parent, false);
        Intrinsics.checkNotNullExpressionValue(lppVarC0, "inflate(...)");
        final Holder holder = new Holder(lppVarC0);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: pjj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecordBestAdapter.onCreateViewHolder$lambda$1$lambda$0(this.f30467a, holder, view);
            }
        });
        return holder;
    }
}
