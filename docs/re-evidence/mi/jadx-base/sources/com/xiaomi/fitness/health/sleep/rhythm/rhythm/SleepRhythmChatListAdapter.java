package com.xiaomi.fitness.health.sleep.rhythm.rhythm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.eri;
import defpackage.jui;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003\u001a\u001b\u001cB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J$\u0010\u0014\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000bJ\n\u0010\u0019\u001a\u00020\u0017*\u00020\u0017R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter$SleepRhythmChatItemViewHolder;", "chartValue", "", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter$SleepRhythmChartValue;", "<init>", "(Ljava/util/List;)V", "getChartValue", "()Ljava/util/List;", "getItemCount", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "position", "updateDataList", "sleepRhythmReports", "startTime", "", "cycleDay", "toMillis", "SleepRhythmChartItem", "SleepRhythmChartValue", "SleepRhythmChatItemViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepRhythmChatListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRhythmChatListAdapter.kt\ncom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n774#2:84\n865#2,2:85\n*S KotlinDebug\n*F\n+ 1 SleepRhythmChatListAdapter.kt\ncom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter\n*L\n73#1:84\n73#1:85,2\n*E\n"})
public final class SleepRhythmChatListAdapter extends RecyclerView.Adapter<SleepRhythmChatItemViewHolder> {

    @NotNull
    private final List<SleepRhythmChartValue> chartValue;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter$SleepRhythmChartItem;", "", "time", "", "value", "", "<init>", "(JF)V", "getTime", "()J", "getValue", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SleepRhythmChartItem {
        private final long time;
        private final float value;

        public SleepRhythmChartItem(long j, float f) {
            this.time = j;
            this.value = f;
        }

        public static /* synthetic */ SleepRhythmChartItem copy$default(SleepRhythmChartItem sleepRhythmChartItem, long j, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                j = sleepRhythmChartItem.time;
            }
            if ((i & 2) != 0) {
                f = sleepRhythmChartItem.value;
            }
            return sleepRhythmChartItem.copy(j, f);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getTime() {
            return this.time;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getValue() {
            return this.value;
        }

        @NotNull
        public final SleepRhythmChartItem copy(long time, float value) {
            return new SleepRhythmChartItem(time, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SleepRhythmChartItem)) {
                return false;
            }
            SleepRhythmChartItem sleepRhythmChartItem = (SleepRhythmChartItem) other;
            return this.time == sleepRhythmChartItem.time && Float.compare(this.value, sleepRhythmChartItem.value) == 0;
        }

        public final long getTime() {
            return this.time;
        }

        public final float getValue() {
            return this.value;
        }

        public int hashCode() {
            return (Long.hashCode(this.time) * 31) + Float.hashCode(this.value);
        }

        @NotNull
        public String toString() {
            return "SleepRhythmChartItem(time=" + this.time + ", value=" + this.value + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003JS\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter$SleepRhythmChartValue;", "", "time", "", "lightValue", "", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter$SleepRhythmChartItem;", "bodyValue", "bedValue", "sleepValue", "<init>", "(JLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getTime", "()J", "getLightValue", "()Ljava/util/List;", "setLightValue", "(Ljava/util/List;)V", "getBodyValue", "setBodyValue", "getBedValue", "setBedValue", "getSleepValue", "setSleepValue", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SleepRhythmChartValue {

        @NotNull
        private List<SleepRhythmChartItem> bedValue;

        @NotNull
        private List<SleepRhythmChartItem> bodyValue;

        @NotNull
        private List<SleepRhythmChartItem> lightValue;

        @NotNull
        private List<SleepRhythmChartItem> sleepValue;
        private final long time;

        public SleepRhythmChartValue(long j, @NotNull List<SleepRhythmChartItem> lightValue, @NotNull List<SleepRhythmChartItem> bodyValue, @NotNull List<SleepRhythmChartItem> bedValue, @NotNull List<SleepRhythmChartItem> sleepValue) {
            Intrinsics.checkNotNullParameter(lightValue, "lightValue");
            Intrinsics.checkNotNullParameter(bodyValue, "bodyValue");
            Intrinsics.checkNotNullParameter(bedValue, "bedValue");
            Intrinsics.checkNotNullParameter(sleepValue, "sleepValue");
            this.time = j;
            this.lightValue = lightValue;
            this.bodyValue = bodyValue;
            this.bedValue = bedValue;
            this.sleepValue = sleepValue;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SleepRhythmChartValue copy$default(SleepRhythmChartValue sleepRhythmChartValue, long j, List list, List list2, List list3, List list4, int i, Object obj) {
            if ((i & 1) != 0) {
                j = sleepRhythmChartValue.time;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                list = sleepRhythmChartValue.lightValue;
            }
            List list5 = list;
            if ((i & 4) != 0) {
                list2 = sleepRhythmChartValue.bodyValue;
            }
            List list6 = list2;
            if ((i & 8) != 0) {
                list3 = sleepRhythmChartValue.bedValue;
            }
            List list7 = list3;
            if ((i & 16) != 0) {
                list4 = sleepRhythmChartValue.sleepValue;
            }
            return sleepRhythmChartValue.copy(j2, list5, list6, list7, list4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getTime() {
            return this.time;
        }

        @NotNull
        public final List<SleepRhythmChartItem> component2() {
            return this.lightValue;
        }

        @NotNull
        public final List<SleepRhythmChartItem> component3() {
            return this.bodyValue;
        }

        @NotNull
        public final List<SleepRhythmChartItem> component4() {
            return this.bedValue;
        }

        @NotNull
        public final List<SleepRhythmChartItem> component5() {
            return this.sleepValue;
        }

        @NotNull
        public final SleepRhythmChartValue copy(long time, @NotNull List<SleepRhythmChartItem> lightValue, @NotNull List<SleepRhythmChartItem> bodyValue, @NotNull List<SleepRhythmChartItem> bedValue, @NotNull List<SleepRhythmChartItem> sleepValue) {
            Intrinsics.checkNotNullParameter(lightValue, "lightValue");
            Intrinsics.checkNotNullParameter(bodyValue, "bodyValue");
            Intrinsics.checkNotNullParameter(bedValue, "bedValue");
            Intrinsics.checkNotNullParameter(sleepValue, "sleepValue");
            return new SleepRhythmChartValue(time, lightValue, bodyValue, bedValue, sleepValue);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SleepRhythmChartValue)) {
                return false;
            }
            SleepRhythmChartValue sleepRhythmChartValue = (SleepRhythmChartValue) other;
            return this.time == sleepRhythmChartValue.time && Intrinsics.areEqual(this.lightValue, sleepRhythmChartValue.lightValue) && Intrinsics.areEqual(this.bodyValue, sleepRhythmChartValue.bodyValue) && Intrinsics.areEqual(this.bedValue, sleepRhythmChartValue.bedValue) && Intrinsics.areEqual(this.sleepValue, sleepRhythmChartValue.sleepValue);
        }

        @NotNull
        public final List<SleepRhythmChartItem> getBedValue() {
            return this.bedValue;
        }

        @NotNull
        public final List<SleepRhythmChartItem> getBodyValue() {
            return this.bodyValue;
        }

        @NotNull
        public final List<SleepRhythmChartItem> getLightValue() {
            return this.lightValue;
        }

        @NotNull
        public final List<SleepRhythmChartItem> getSleepValue() {
            return this.sleepValue;
        }

        public final long getTime() {
            return this.time;
        }

        public int hashCode() {
            return (((((((Long.hashCode(this.time) * 31) + this.lightValue.hashCode()) * 31) + this.bodyValue.hashCode()) * 31) + this.bedValue.hashCode()) * 31) + this.sleepValue.hashCode();
        }

        public final void setBedValue(@NotNull List<SleepRhythmChartItem> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.bedValue = list;
        }

        public final void setBodyValue(@NotNull List<SleepRhythmChartItem> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.bodyValue = list;
        }

        public final void setLightValue(@NotNull List<SleepRhythmChartItem> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.lightValue = list;
        }

        public final void setSleepValue(@NotNull List<SleepRhythmChartItem> list) {
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            this.sleepValue = list;
        }

        @NotNull
        public String toString() {
            return "SleepRhythmChartValue(time=" + this.time + ", lightValue=" + this.lightValue + ", bodyValue=" + this.bodyValue + ", bedValue=" + this.bedValue + ", sleepValue=" + this.sleepValue + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter$SleepRhythmChatItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter$SleepRhythmChartValue;", "item", "", "bindData", "(Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter$SleepRhythmChartValue;)V", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListView;", "chartView", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class SleepRhythmChatItemViewHolder extends RecyclerView.d0 {

        @Nullable
        private SleepRhythmChatListView chartView;
        final /* synthetic */ SleepRhythmChatListAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SleepRhythmChatItemViewHolder(@NotNull SleepRhythmChatListAdapter sleepRhythmChatListAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = sleepRhythmChatListAdapter;
            this.chartView = (SleepRhythmChatListView) itemView.findViewById(eri.F1);
        }

        public final void bindData(@NotNull SleepRhythmChartValue item) {
            Intrinsics.checkNotNullParameter(item, "item");
            ((TextView) this.itemView.findViewById(eri.Yi)).setText(TimeUtils.formatDate(StringUtils.EXPECT_DATE_FORMAT, Long.valueOf(item.getTime() * ((long) 1000))));
            ((TextView) this.itemView.findViewById(eri.start_time_tv)).setText("00:00");
            ((TextView) this.itemView.findViewById(eri.start_mid_time_tv)).setText("12:00");
            ((TextView) this.itemView.findViewById(eri.Kb)).setText("00:00");
            ((TextView) this.itemView.findViewById(eri.L4)).setText("12:00");
            ((TextView) this.itemView.findViewById(eri.M4)).setText("00:00");
            SleepRhythmChatListView sleepRhythmChatListView = this.chartView;
            Intrinsics.checkNotNull(sleepRhythmChatListView);
            sleepRhythmChatListView.update(item);
        }
    }

    public SleepRhythmChatListAdapter(@NotNull List<SleepRhythmChartValue> chartValue) {
        Intrinsics.checkNotNullParameter(chartValue, "chartValue");
        this.chartValue = chartValue;
    }

    @NotNull
    public final List<SleepRhythmChartValue> getChartValue() {
        return this.chartValue;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.chartValue.size();
    }

    public final long toMillis(long j) {
        long j2 = 60;
        return (j / j2) * j2;
    }

    public final void updateDataList(@NotNull List<SleepRhythmChartValue> sleepRhythmReports, long startTime, int cycleDay) {
        Intrinsics.checkNotNullParameter(sleepRhythmReports, "sleepRhythmReports");
        ArrayList arrayList = new ArrayList();
        for (Object obj : sleepRhythmReports) {
            SleepRhythmChartValue sleepRhythmChartValue = (SleepRhythmChartValue) obj;
            if (sleepRhythmChartValue.getTime() != (((long) (cycleDay + 1)) * 86400) + startTime && sleepRhythmChartValue.getTime() != (((long) cycleDay) * 86400) + startTime) {
                arrayList.add(obj);
            }
        }
        this.chartValue.clear();
        this.chartValue.addAll(arrayList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SleepRhythmChatItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindData(this.chartValue.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SleepRhythmChatItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.s5, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new SleepRhythmChatItemViewHolder(this, viewInflate);
    }
}
