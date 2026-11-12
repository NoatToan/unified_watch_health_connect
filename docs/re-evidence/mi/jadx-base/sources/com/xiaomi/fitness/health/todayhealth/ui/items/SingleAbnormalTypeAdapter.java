package com.xiaomi.fitness.health.todayhealth.ui.items;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.AmbulatoryBloodPressureReport;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.health.todayhealth.TodayHealthExtKt;
import com.xiaomi.fitness.health.todayhealth.model.HeartHealthValueItem;
import defpackage.eri;
import defpackage.jui;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&'B!\u0012\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u001b¢\u0006\u0004\b$\u0010%J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR&\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001f0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001d¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/SingleAbnormalTypeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "abnormalType", "", "", "data", "", "getDataByType", "(ILjava/util/List;)V", "", "time", "type", "addDataToFiveDataList", "(JILjava/lang/Object;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "", "singleTypeMap", "Ljava/util/Map;", "", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalSingleLastDataAdapter$LastDataModel;", "mDataList", "Ljava/util/List;", "", "sortDataTimeMap", "<init>", "(Ljava/util/Map;)V", "Companion", "RecordItemViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSingleAbnormalTypeAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleAbnormalTypeAdapter.kt\ncom/xiaomi/fitness/health/todayhealth/ui/items/SingleAbnormalTypeAdapter\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,212:1\n216#2,2:213\n216#2,2:215\n1863#3,2:217\n1863#3,2:219\n1863#3,2:221\n1863#3,2:223\n1863#3,2:225\n1863#3,2:227\n1863#3,2:229\n1863#3,2:231\n1863#3,2:233\n*S KotlinDebug\n*F\n+ 1 SingleAbnormalTypeAdapter.kt\ncom/xiaomi/fitness/health/todayhealth/ui/items/SingleAbnormalTypeAdapter\n*L\n49#1:213,2\n54#1:215,2\n68#1:217,2\n78#1:219,2\n88#1:221,2\n98#1:223,2\n109#1:225,2\n119#1:227,2\n131#1:229,2\n143#1:231,2\n153#1:233,2\n*E\n"})
public final class SingleAbnormalTypeAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    public static final String TAG = "SingleAbnormalTypeAdapter";

    @NotNull
    private final List<AbnormalSingleLastDataAdapter.LastDataModel> mDataList;

    @NotNull
    private final Map<Integer, List<Object>> singleTypeMap;

    @NotNull
    private final Map<Long, AbnormalSingleLastDataAdapter.LastDataModel> sortDataTimeMap;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/SingleAbnormalTypeAdapter$RecordItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "", "bindData", "(I)V", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/widget/TextView;", "instructionTv", "Landroid/widget/TextView;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/todayhealth/ui/items/SingleAbnormalTypeAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class RecordItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView instructionTv;

        @NotNull
        private final RecyclerView recycler;
        final /* synthetic */ SingleAbnormalTypeAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecordItemViewHolder(@NotNull SingleAbnormalTypeAdapter singleAbnormalTypeAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = singleAbnormalTypeAdapter;
            View viewFindViewById = itemView.findViewById(eri.pd);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.recycler = (RecyclerView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(eri.b8);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.instructionTv = (TextView) viewFindViewById2;
        }

        public final void bindData(int position) {
            this.instructionTv.setText(TodayHealthExtKt.getAbnormalInstructionByAbnormalType(this.this$0.mDataList));
            this.recycler.setAdapter(new AbnormalSingleLastDataAdapter(this.this$0.mDataList));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SingleAbnormalTypeAdapter(@NotNull Map<Integer, ? extends List<? extends Object>> singleTypeMap) {
        Intrinsics.checkNotNullParameter(singleTypeMap, "singleTypeMap");
        this.singleTypeMap = singleTypeMap;
        this.mDataList = new ArrayList();
        this.sortDataTimeMap = new LinkedHashMap();
        for (Map.Entry entry : singleTypeMap.entrySet()) {
            getDataByType(((Number) entry.getKey()).intValue(), (List) entry.getValue());
        }
        Iterator it = MapsKt__MapsJVMKt.toSortedMap(this.sortDataTimeMap, new Comparator() { // from class: com.xiaomi.fitness.health.todayhealth.ui.items.SingleAbnormalTypeAdapter$special$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((Number) t2).longValue()), Long.valueOf(((Number) t).longValue()));
            }
        }).entrySet().iterator();
        while (it.hasNext()) {
            AbnormalSingleLastDataAdapter.LastDataModel lastDataModel = (AbnormalSingleLastDataAdapter.LastDataModel) ((Map.Entry) it.next()).getValue();
            List<AbnormalSingleLastDataAdapter.LastDataModel> list = this.mDataList;
            Intrinsics.checkNotNull(lastDataModel);
            list.add(lastDataModel);
        }
        Logger.i(TAG, "SingleAbnormalTypeAdapter mDataList size=" + this.mDataList.size() + "  " + this.sortDataTimeMap);
    }

    private final void addDataToFiveDataList(long time, int type, Object data) {
        if (this.sortDataTimeMap.size() < 5) {
            this.sortDataTimeMap.put(Long.valueOf(time), new AbnormalSingleLastDataAdapter.LastDataModel(type, data));
            return;
        }
        long jLongValue = ((Number) CollectionsKt___CollectionsKt.m1334minOrThrow((Iterable) this.sortDataTimeMap.keySet())).longValue();
        if (time > jLongValue) {
            this.sortDataTimeMap.remove(Long.valueOf(jLongValue));
            this.sortDataTimeMap.put(Long.valueOf(time), new AbnormalSingleLastDataAdapter.LastDataModel(type, data));
        } else if (time == jLongValue) {
            if (type == 2 || type == 1 || type == 0) {
                AbnormalSingleLastDataAdapter.LastDataModel lastDataModel = this.sortDataTimeMap.get(Long.valueOf(jLongValue));
                Integer numValueOf = lastDataModel != null ? Integer.valueOf(lastDataModel.getAbnormalType()) : null;
                if (numValueOf == null || type >= numValueOf.intValue()) {
                    return;
                }
                this.sortDataTimeMap.remove(Long.valueOf(jLongValue));
                this.sortDataTimeMap.put(Long.valueOf(time), new AbnormalSingleLastDataAdapter.LastDataModel(type, data));
            }
        }
    }

    private final void getDataByType(int abnormalType, List<? extends Object> data) {
        switch (abnormalType) {
            case 0:
                if (!data.isEmpty()) {
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem>");
                    Iterator<T> it = data.iterator();
                    while (it.hasNext()) {
                        AbnormalFibItem abnormalFibItem = (AbnormalFibItem) it.next();
                        addDataToFiveDataList(abnormalFibItem.getEndTime(), abnormalType, abnormalFibItem);
                    }
                    break;
                }
                break;
            case 1:
            case 2:
                if (!data.isEmpty()) {
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.AbnormalRecordItem>");
                    Iterator<T> it2 = data.iterator();
                    while (it2.hasNext()) {
                        SegmentItem segmentItem = (SegmentItem) it2.next();
                        addDataToFiveDataList(segmentItem.getEndTime(), abnormalType, segmentItem);
                    }
                    break;
                }
                break;
            case 3:
                if (!data.isEmpty()) {
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.AbnormalRecordItem>");
                    Iterator<T> it3 = data.iterator();
                    while (it3.hasNext()) {
                        SegmentItem segmentItem2 = (SegmentItem) it3.next();
                        addDataToFiveDataList(segmentItem2.getEndTime(), abnormalType, segmentItem2);
                    }
                    break;
                }
                break;
            case 4:
            case 5:
            case 6:
                if (!data.isEmpty()) {
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.StressItem>");
                    Iterator<T> it4 = data.iterator();
                    while (it4.hasNext()) {
                        StressItem stressItem = (StressItem) it4.next();
                        addDataToFiveDataList(stressItem.getTime(), abnormalType, stressItem);
                    }
                    break;
                }
                break;
            case 7:
            case 8:
                if (!data.isEmpty()) {
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport>");
                    Iterator<T> it5 = data.iterator();
                    while (it5.hasNext()) {
                        SleepSegmentReport sleepSegmentReport = (SleepSegmentReport) it5.next();
                        addDataToFiveDataList(sleepSegmentReport.getWakeupTime(), abnormalType, sleepSegmentReport);
                    }
                    break;
                }
                break;
            case 9:
            case 10:
                if (!data.isEmpty()) {
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport>");
                    Iterator<T> it6 = data.iterator();
                    while (it6.hasNext()) {
                        SleepSegmentReport sleepSegmentReport2 = (SleepSegmentReport) it6.next();
                        List<TimesDataRecordInt> hrRecords = sleepSegmentReport2.getHrRecords();
                        if (hrRecords != null && !hrRecords.isEmpty()) {
                            addDataToFiveDataList(sleepSegmentReport2.getWakeupTime(), abnormalType, sleepSegmentReport2);
                        }
                    }
                    break;
                }
                break;
            case 11:
                if (!data.isEmpty()) {
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport>");
                    Iterator<T> it7 = data.iterator();
                    while (it7.hasNext()) {
                        SleepSegmentReport sleepSegmentReport3 = (SleepSegmentReport) it7.next();
                        List<TimesDataRecordInt> spo2Records = sleepSegmentReport3.getSpo2Records();
                        if (spo2Records != null && !spo2Records.isEmpty()) {
                            addDataToFiveDataList(sleepSegmentReport3.getWakeupTime(), abnormalType, sleepSegmentReport3);
                        }
                    }
                    break;
                }
                break;
            case 12:
                if (!data.isEmpty()) {
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fitness.health.todayhealth.model.HeartHealthValueItem>");
                    Iterator<T> it8 = data.iterator();
                    while (it8.hasNext()) {
                        HeartHealthValueItem heartHealthValueItem = (HeartHealthValueItem) it8.next();
                        addDataToFiveDataList(heartHealthValueItem.getTime(), abnormalType, heartHealthValueItem);
                    }
                    break;
                }
                break;
            case 13:
                if (!data.isEmpty()) {
                    Intrinsics.checkNotNull(data, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.export.data.item.AmbulatoryBloodPressureReport>");
                    Iterator<T> it9 = data.iterator();
                    while (it9.hasNext()) {
                        AmbulatoryBloodPressureReport ambulatoryBloodPressureReport = (AmbulatoryBloodPressureReport) it9.next();
                        addDataToFiveDataList(ambulatoryBloodPressureReport.getTime(), abnormalType, ambulatoryBloodPressureReport);
                    }
                    break;
                }
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return !this.mDataList.isEmpty() ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof RecordItemViewHolder) {
            ((RecordItemViewHolder) holder).bindData(position);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.N5, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new RecordItemViewHolder(this, viewInflate);
    }
}
