package com.xiaomi.fitness.health.sleep.rhythm.rhythm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.chart.barchart.SpeedRatioLayoutManager;
import com.xiaomi.fitness.chart.entrys.SleepItemEntry;
import com.xiaomi.fitness.chart.view.SleepChartRecyclerView;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.sleep.valueformater.DaySleepHighLightFormatter;
import defpackage.eri;
import defpackage.ez5;
import defpackage.gjm;
import defpackage.ili;
import defpackage.jui;
import defpackage.oim;
import defpackage.oyi;
import defpackage.qim;
import defpackage.tim;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001c\u001dB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\fH\u0016J.\u0010\u0015\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u001bR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmSleepItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmSleepItemAdapter$SleepRhythmSleepItemViewHolder;", "dataList", "", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmSleepItemAdapter$SleepSegmentReportItem;", "<init>", "(Ljava/util/List;)V", "getDataList", "()Ljava/util/List;", "setDataList", "getItemCount", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "position", "updateDataList", "updateList", "startTime", "", "cycleDay", "showOut", "", "SleepSegmentReportItem", "SleepRhythmSleepItemViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepRhythmSleepItemAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRhythmSleepItemAdapter.kt\ncom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmSleepItemAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n774#2:124\n865#2,2:125\n*S KotlinDebug\n*F\n+ 1 SleepRhythmSleepItemAdapter.kt\ncom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmSleepItemAdapter\n*L\n116#1:124\n116#1:125,2\n*E\n"})
public final class SleepRhythmSleepItemAdapter extends RecyclerView.Adapter<SleepRhythmSleepItemViewHolder> {

    @NotNull
    private List<SleepSegmentReportItem> dataList;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmSleepItemAdapter$SleepRhythmSleepItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmSleepItemAdapter$SleepSegmentReportItem;", "item", "", "bindData", "(Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmSleepItemAdapter$SleepSegmentReportItem;)V", "Lcom/xiaomi/fitness/chart/view/SleepChartRecyclerView;", "mChartRecyclerView", "Lcom/xiaomi/fitness/chart/view/SleepChartRecyclerView;", "Loim;", "mSleepChartAdapter", "Loim;", "", "Lcom/xiaomi/fitness/chart/entrys/SleepItemEntry;", "mChartEntries", "Ljava/util/List;", "Ltim;", "sleepChartItemDecoration", "Ltim;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmSleepItemAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class SleepRhythmSleepItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private List<SleepItemEntry> mChartEntries;

        @Nullable
        private SleepChartRecyclerView mChartRecyclerView;

        @Nullable
        private oim mSleepChartAdapter;

        @Nullable
        private tim sleepChartItemDecoration;
        final /* synthetic */ SleepRhythmSleepItemAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SleepRhythmSleepItemViewHolder(@NotNull SleepRhythmSleepItemAdapter sleepRhythmSleepItemAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sleepRhythmSleepItemAdapter;
            this.mChartEntries = new LinkedList();
            this.mChartRecyclerView = (SleepChartRecyclerView) itemView.findViewById(eri.y1);
            this.mSleepChartAdapter = new oim(itemView.getContext(), this.mChartEntries, this.mChartRecyclerView);
            SleepChartRecyclerView sleepChartRecyclerView = this.mChartRecyclerView;
            Intrinsics.checkNotNull(sleepChartRecyclerView);
            T mAttrs = sleepChartRecyclerView.mAttrs;
            Intrinsics.checkNotNullExpressionValue(mAttrs, "mAttrs");
            qim qimVar = (qim) mAttrs;
            SpeedRatioLayoutManager speedRatioLayoutManager = new SpeedRatioLayoutManager(itemView.getContext(), qimVar);
            tim timVar = new tim(qimVar);
            this.sleepChartItemDecoration = timVar;
            Intrinsics.checkNotNull(timVar);
            timVar.setHighLightValueFormatter(new DaySleepHighLightFormatter(0));
            SleepChartRecyclerView sleepChartRecyclerView2 = this.mChartRecyclerView;
            Intrinsics.checkNotNull(sleepChartRecyclerView2);
            sleepChartRecyclerView2.setLayoutManager(speedRatioLayoutManager);
            SleepChartRecyclerView sleepChartRecyclerView3 = this.mChartRecyclerView;
            Intrinsics.checkNotNull(sleepChartRecyclerView3);
            tim timVar2 = this.sleepChartItemDecoration;
            Intrinsics.checkNotNull(timVar2);
            sleepChartRecyclerView3.addItemDecoration(timVar2);
            SleepChartRecyclerView sleepChartRecyclerView4 = this.mChartRecyclerView;
            Intrinsics.checkNotNull(sleepChartRecyclerView4);
            sleepChartRecyclerView4.setAdapter(this.mSleepChartAdapter);
        }

        public final void bindData(@NotNull SleepSegmentReportItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            SleepChartRecyclerView sleepChartRecyclerView = this.mChartRecyclerView;
            Intrinsics.checkNotNull(sleepChartRecyclerView);
            ViewGroup.LayoutParams layoutParams = sleepChartRecyclerView.getLayoutParams();
            Intrinsics.checkNotNullExpressionValue(layoutParams, "getLayoutParams(...)");
            int iA = ez5.a(16);
            int dimensionPixelSize = ApplicationExtKt.getApplication().getResources().getDimensionPixelSize(ili.h);
            int stageCount = item.getReport().getStageCount();
            if (stageCount > 0) {
                tim timVar = this.sleepChartItemDecoration;
                Intrinsics.checkNotNull(timVar);
                timVar.c(Float.valueOf(((4 - stageCount) * dimensionPixelSize) / stageCount));
            }
            layoutParams.height = (dimensionPixelSize * 4) + iA;
            SleepChartRecyclerView sleepChartRecyclerView2 = this.mChartRecyclerView;
            Intrinsics.checkNotNull(sleepChartRecyclerView2);
            sleepChartRecyclerView2.setLayoutParams(layoutParams);
            tim timVar2 = this.sleepChartItemDecoration;
            Intrinsics.checkNotNull(timVar2);
            timVar2.updateStageSize(stageCount);
            this.mChartEntries.clear();
            List<SleepItemEntry> list = this.mChartEntries;
            List<SleepItemEntry> listB = gjm.b(item.getReport(), Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(listB, "createDaySleepChartEntry(...)");
            list.addAll(listB);
            oim oimVar = this.mSleepChartAdapter;
            Intrinsics.checkNotNull(oimVar);
            oimVar.setEntries(this.mChartEntries);
            ((TextView) this.itemView.findViewById(eri.Eg)).setText(TimeUtils.formatDate(StringUtils.EXPECT_DATE_FORMAT, Long.valueOf(item.getTime() * ((long) 1000))));
            String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(oyi.j, item.getReport().getSleepDuration() / 60, Integer.valueOf(item.getReport().getSleepDuration() / 60));
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            String quantityString2 = ApplicationExtKt.getApplication().getResources().getQuantityString(oyi.q, item.getReport().getSleepDuration() % 60, Integer.valueOf(item.getReport().getSleepDuration() % 60));
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            ((TextView) this.itemView.findViewById(eri.Mf)).setText(quantityString + quantityString2);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmSleepItemAdapter$SleepSegmentReportItem;", "", "time", "", "report", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "<init>", "(JLcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;)V", "getTime", "()J", "getReport", "()Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SleepSegmentReportItem {

        @NotNull
        private final SleepSegmentReport report;
        private final long time;

        public SleepSegmentReportItem(long j, @NotNull SleepSegmentReport report) {
            Intrinsics.checkNotNullParameter(report, "report");
            this.time = j;
            this.report = report;
        }

        public static /* synthetic */ SleepSegmentReportItem copy$default(SleepSegmentReportItem sleepSegmentReportItem, long j, SleepSegmentReport sleepSegmentReport, int i, Object obj) {
            if ((i & 1) != 0) {
                j = sleepSegmentReportItem.time;
            }
            if ((i & 2) != 0) {
                sleepSegmentReport = sleepSegmentReportItem.report;
            }
            return sleepSegmentReportItem.copy(j, sleepSegmentReport);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getTime() {
            return this.time;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final SleepSegmentReport getReport() {
            return this.report;
        }

        @NotNull
        public final SleepSegmentReportItem copy(long time, @NotNull SleepSegmentReport report) {
            Intrinsics.checkNotNullParameter(report, "report");
            return new SleepSegmentReportItem(time, report);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SleepSegmentReportItem)) {
                return false;
            }
            SleepSegmentReportItem sleepSegmentReportItem = (SleepSegmentReportItem) other;
            return this.time == sleepSegmentReportItem.time && Intrinsics.areEqual(this.report, sleepSegmentReportItem.report);
        }

        @NotNull
        public final SleepSegmentReport getReport() {
            return this.report;
        }

        public final long getTime() {
            return this.time;
        }

        public int hashCode() {
            return (Long.hashCode(this.time) * 31) + this.report.hashCode();
        }

        @NotNull
        public String toString() {
            return "SleepSegmentReportItem(time=" + this.time + ", report=" + this.report + ")";
        }
    }

    public SleepRhythmSleepItemAdapter(@NotNull List<SleepSegmentReportItem> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList = dataList;
    }

    public static /* synthetic */ void updateDataList$default(SleepRhythmSleepItemAdapter sleepRhythmSleepItemAdapter, List list, long j, int i, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        sleepRhythmSleepItemAdapter.updateDataList(list, j, i, z);
    }

    @NotNull
    public final List<SleepSegmentReportItem> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.dataList.size();
    }

    public final void setDataList(@NotNull List<SleepSegmentReportItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    public final void updateDataList(@NotNull List<SleepSegmentReportItem> updateList, long startTime, int cycleDay, boolean showOut) {
        Intrinsics.checkNotNullParameter(updateList, "updateList");
        ArrayList arrayList = new ArrayList();
        for (Object obj : updateList) {
            SleepSegmentReportItem sleepSegmentReportItem = (SleepSegmentReportItem) obj;
            if (sleepSegmentReportItem.getTime() != (((long) (cycleDay + 1)) * 86400) + startTime && sleepSegmentReportItem.getTime() != (((long) cycleDay) * 86400) + startTime) {
                arrayList.add(obj);
            }
        }
        this.dataList.clear();
        if (!showOut || arrayList.size() <= 3) {
            this.dataList.addAll(arrayList);
        } else {
            this.dataList.addAll(arrayList.subList(0, 4));
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SleepRhythmSleepItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.dataList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SleepRhythmSleepItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.v5, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new SleepRhythmSleepItemViewHolder(this, viewInflate);
    }
}
