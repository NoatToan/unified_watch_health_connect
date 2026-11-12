package com.xiaomi.fitness.health.sleep.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.health.sleep.ui.adapter.SleepDayDetailAdapter;
import com.xiaomi.fitness.health.sleep.utils.SleepExtKt;
import defpackage.axb;
import defpackage.eri;
import defpackage.jui;
import defpackage.ypm;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0011\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000256B\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b3\u00104J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b*\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010+\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00067"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepDayDetailAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "fillDataList", "()V", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "target", "", "isSameValidSleepSegmentReport", "(Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;)Z", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "report", "updateAllDaySleepReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepDayDetailAdapter$OnItemClickListener;", "onItemClickListener", "setOnItemClickListener", "(Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepDayDetailAdapter$OnItemClickListener;)V", "getItemCount", "()I", "Landroidx/lifecycle/LifecycleCoroutineScope;", "lifecycleCoroutineScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "daySleepReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "", "dataList", "Ljava/util/List;", "sleepOnItemClick", "Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepDayDetailAdapter$OnItemClickListener;", "showNoDataAudio", "Z", "getShowNoDataAudio", "()Z", "setShowNoDataAudio", "(Z)V", "prevReport", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "<init>", "(Landroidx/lifecycle/LifecycleCoroutineScope;)V", "Companion", "OnItemClickListener", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepDayDetailAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int TYPE_LONG_DURATION = 1;
    public static final int TYPE_SHORT_DURATION = 2;

    @NotNull
    private final List<SleepSegmentReport> dataList;

    @Nullable
    private AllDaySleepReport daySleepReport;

    @NotNull
    private final LifecycleCoroutineScope lifecycleCoroutineScope;

    @Nullable
    private SleepSegmentReport prevReport;
    private boolean showNoDataAudio;

    @Nullable
    private OnItemClickListener sleepOnItemClick;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepDayDetailAdapter$OnItemClickListener;", "", "onClick", "", "segmentReport", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "position", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onClick(@NotNull SleepSegmentReport segmentReport, int position);
    }

    public SleepDayDetailAdapter(@NotNull LifecycleCoroutineScope lifecycleCoroutineScope) {
        Intrinsics.checkNotNullParameter(lifecycleCoroutineScope, "lifecycleCoroutineScope");
        this.lifecycleCoroutineScope = lifecycleCoroutineScope;
        this.dataList = new ArrayList();
    }

    private final void fillDataList() {
        this.dataList.clear();
        AllDaySleepReport allDaySleepReport = this.daySleepReport;
        if (allDaySleepReport != null) {
            Intrinsics.checkNotNull(allDaySleepReport);
            List<SleepSegmentReport> sleepSegments = allDaySleepReport.getSleepSegments();
            if (sleepSegments != null) {
                List<SleepSegmentReport> listFilterAndSortSleepLong = SleepExtKt.filterAndSortSleepLong(sleepSegments);
                List<SleepSegmentReport> listFilterAndSortSleepShort = SleepExtKt.filterAndSortSleepShort(sleepSegments);
                this.dataList.addAll(listFilterAndSortSleepLong);
                this.dataList.addAll(listFilterAndSortSleepShort);
            }
        }
        notifyDataSetChanged();
    }

    private final boolean isSameValidSleepSegmentReport(SleepSegmentReport sleepSegmentReport, SleepSegmentReport sleepSegmentReport2) {
        if (sleepSegmentReport2 == null) {
            return false;
        }
        return Intrinsics.areEqual(sleepSegmentReport, sleepSegmentReport2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(SleepDayDetailAdapter this$0, SleepSegmentReport sleepSegmentReport, int i, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnItemClickListener onItemClickListener = this$0.sleepOnItemClick;
        Intrinsics.checkNotNull(onItemClickListener);
        Intrinsics.checkNotNull(sleepSegmentReport);
        onItemClickListener.onClick(sleepSegmentReport, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        if (ArrayUtils.isEmpty(this.dataList)) {
            return 0;
        }
        return this.dataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        SleepSegmentReport sleepSegmentReport = this.dataList.get(position);
        Intrinsics.checkNotNull(sleepSegmentReport);
        return sleepSegmentReport.getSleepDuration() >= 180 ? 1 : 2;
    }

    public final boolean getShowNoDataAudio() {
        return this.showNoDataAudio;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final SleepSegmentReport sleepSegmentReport = this.dataList.get(position);
        if (holder instanceof ypm) {
            holder.itemView.requestLayout();
            holder.itemView.findViewById(eri.U9).findViewById(eri.Q8).setOnClickListener(new View.OnClickListener() { // from class: njm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepDayDetailAdapter.onBindViewHolder$lambda$1(this.f27988a, sleepSegmentReport, position, view);
                }
            });
            SleepSegmentReport sleepSegmentReport2 = this.prevReport;
            if (sleepSegmentReport2 != null) {
                Intrinsics.checkNotNull(sleepSegmentReport2);
                if (isSameValidSleepSegmentReport(sleepSegmentReport2, sleepSegmentReport)) {
                    return;
                }
            }
            Intrinsics.checkNotNull(sleepSegmentReport);
            ((ypm) holder).b(sleepSegmentReport, position, this.daySleepReport, this.showNoDataAudio);
            this.prevReport = sleepSegmentReport;
            return;
        }
        if (holder instanceof SleepShortSegmentViewHolder) {
            int i = position - 1;
            Integer numValueOf = null;
            Integer numValueOf2 = (i < 0 || i >= this.dataList.size()) ? null : Integer.valueOf(getItemViewType(i));
            int size = this.dataList.size();
            int i2 = position + 1;
            if (i2 >= 0 && i2 < size) {
                numValueOf = Integer.valueOf(getItemViewType(i2));
            }
            Intrinsics.checkNotNull(sleepSegmentReport);
            ((SleepShortSegmentViewHolder) holder).bindData(sleepSegmentReport, numValueOf2, numValueOf);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            return new ypm(LayoutInflater.from(parent.getContext()).inflate(jui.p6, parent, false), this.lifecycleCoroutineScope);
        }
        axb axbVarA0 = axb.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(axbVarA0, "inflate(...)");
        return new SleepShortSegmentViewHolder(axbVarA0);
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener onItemClickListener) {
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        this.sleepOnItemClick = onItemClickListener;
    }

    public final void setShowNoDataAudio(boolean z) {
        this.showNoDataAudio = z;
    }

    public final void updateAllDaySleepReport(@Nullable AllDaySleepReport report) {
        this.daySleepReport = report;
        fillDataList();
    }
}
