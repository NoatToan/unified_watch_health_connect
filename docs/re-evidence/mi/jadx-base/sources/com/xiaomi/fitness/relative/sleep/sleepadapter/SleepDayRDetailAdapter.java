package com.xiaomi.fitness.relative.sleep.sleepadapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import defpackage.cxm;
import defpackage.h0n;
import defpackage.jui;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010\tJ\u0017\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\n8\u0006X\u0086D¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u0017R$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0007R\u001f\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/xiaomi/fitness/relative/sleep/sleepadapter/SleepDayRDetailAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "mAllDaySleepReport", "", "updateAllDaySleepReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)V", "fillDataList", "()V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "getItemCount", "()I", "TYPE_MANUAL", "I", "TYPE_LONG_DURATION", "getTYPE_LONG_DURATION", "TYPE_SHORT_DURATION", "getTYPE_SHORT_DURATION", "TYPE_TRACE_DURATION", "getTYPE_TRACE_DURATION", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "getMAllDaySleepReport", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "setMAllDaySleepReport", "", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "mDataList", "Ljava/util/List;", "getMDataList", "()Ljava/util/List;", "<init>", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepDayRDetailAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepDayRDetailAdapter.kt\ncom/xiaomi/fitness/relative/sleep/sleepadapter/SleepDayRDetailAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1#2:92\n*E\n"})
public class SleepDayRDetailAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @Nullable
    private AllDaySleepReport mAllDaySleepReport;
    private final int TYPE_MANUAL = 1;
    private final int TYPE_LONG_DURATION = 2;
    private final int TYPE_SHORT_DURATION = 3;
    private final int TYPE_TRACE_DURATION = 4;

    @NotNull
    private final List<SleepSegmentReport> mDataList = new ArrayList();

    public final void fillDataList() {
        this.mDataList.clear();
        AllDaySleepReport allDaySleepReport = this.mAllDaySleepReport;
        if (allDaySleepReport != null) {
            Intrinsics.checkNotNull(allDaySleepReport);
            List<SleepSegmentReport> sleepSegments = allDaySleepReport.getSleepSegments();
            if (!ArrayUtils.isEmpty(sleepSegments)) {
                Objects.requireNonNull(sleepSegments);
                this.mDataList.addAll(sleepSegments);
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        if (ArrayUtils.isEmpty(this.mDataList)) {
            return 0;
        }
        return this.mDataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        SleepSegmentReport sleepSegmentReport = this.mDataList.get(position);
        Intrinsics.checkNotNull(sleepSegmentReport);
        String sid = sleepSegmentReport.getSid();
        if (sid != null && sid.length() > 0 && Intrinsics.areEqual("xiaomiwear_app_manually", sid)) {
            return this.TYPE_MANUAL;
        }
        Integer sleepTraceDuration = sleepSegmentReport.getSleepTraceDuration();
        if (sleepSegmentReport.getStageCount() >= 2) {
            return this.TYPE_LONG_DURATION;
        }
        return (sleepTraceDuration == null || sleepTraceDuration.intValue() <= 0) ? this.TYPE_SHORT_DURATION : this.TYPE_TRACE_DURATION;
    }

    @Nullable
    public final AllDaySleepReport getMAllDaySleepReport() {
        return this.mAllDaySleepReport;
    }

    @NotNull
    public final List<SleepSegmentReport> getMDataList() {
        return this.mDataList;
    }

    public final int getTYPE_LONG_DURATION() {
        return this.TYPE_LONG_DURATION;
    }

    public final int getTYPE_SHORT_DURATION() {
        return this.TYPE_SHORT_DURATION;
    }

    public final int getTYPE_TRACE_DURATION() {
        return this.TYPE_TRACE_DURATION;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SleepSegmentReport sleepSegmentReport = this.mDataList.get(position);
        if (holder instanceof cxm) {
            holder.itemView.requestLayout();
            Intrinsics.checkNotNull(sleepSegmentReport);
            ((cxm) holder).b(sleepSegmentReport);
        } else if (holder instanceof h0n) {
            ((h0n) holder).a(sleepSegmentReport, getItemViewType(position));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == this.TYPE_LONG_DURATION) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.q6, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new cxm(viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(jui.s6, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        return new h0n(viewInflate2);
    }

    public final void setMAllDaySleepReport(@Nullable AllDaySleepReport allDaySleepReport) {
        this.mAllDaySleepReport = allDaySleepReport;
    }

    public final void updateAllDaySleepReport(@Nullable AllDaySleepReport mAllDaySleepReport) {
        this.mAllDaySleepReport = mAllDaySleepReport;
        fillDataList();
        notifyDataSetChanged();
    }
}
