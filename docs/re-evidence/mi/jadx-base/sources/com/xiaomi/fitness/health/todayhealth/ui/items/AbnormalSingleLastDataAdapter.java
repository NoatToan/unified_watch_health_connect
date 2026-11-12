package com.xiaomi.fitness.health.todayhealth.ui.items;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalItem;
import com.xiaomi.fit.fitness.export.data.item.AmbulatoryBloodPressureReport;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.todayhealth.TodayHealthExtKt;
import com.xiaomi.fitness.health.todayhealth.model.HeartHealthValueItem;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.qxi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\b\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003!\"#B\u0015\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalSingleLastDataAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "buildDataModelList", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "position", "getItemViewType", "(I)I", "getItemCount", "()I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "", "mExpandStatus", "Z", "", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalSingleLastDataAdapter$LastDataModel;", "castedWholeDataList", "Ljava/util/List;", "", "", "uiModelList", "itemList", "<init>", "(Ljava/util/List;)V", "Companion", "LastDataModel", "RecordItemViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AbnormalSingleLastDataAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    public static final String TAG = "AbnormalSingleRecordAdapter";
    public static final int VIEW_TYPE_DATA_ITEM = 1;
    public static final int VIEW_TYPE_HEADER = 0;

    @NotNull
    private final List<LastDataModel> castedWholeDataList;
    private boolean mExpandStatus;

    @NotNull
    private final List<Object> uiModelList;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalSingleLastDataAdapter$LastDataModel;", "", "abnormalType", "", "data", "<init>", "(ILjava/lang/Object;)V", "getAbnormalType", "()I", "getData", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LastDataModel {
        private final int abnormalType;

        @Nullable
        private final Object data;

        public LastDataModel(int i, @Nullable Object obj) {
            this.abnormalType = i;
            this.data = obj;
        }

        public static /* synthetic */ LastDataModel copy$default(LastDataModel lastDataModel, int i, Object obj, int i2, Object obj2) {
            if ((i2 & 1) != 0) {
                i = lastDataModel.abnormalType;
            }
            if ((i2 & 2) != 0) {
                obj = lastDataModel.data;
            }
            return lastDataModel.copy(i, obj);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getAbnormalType() {
            return this.abnormalType;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Object getData() {
            return this.data;
        }

        @NotNull
        public final LastDataModel copy(int abnormalType, @Nullable Object data) {
            return new LastDataModel(abnormalType, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LastDataModel)) {
                return false;
            }
            LastDataModel lastDataModel = (LastDataModel) other;
            return this.abnormalType == lastDataModel.abnormalType && Intrinsics.areEqual(this.data, lastDataModel.data);
        }

        public final int getAbnormalType() {
            return this.abnormalType;
        }

        @Nullable
        public final Object getData() {
            return this.data;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.abnormalType) * 31;
            Object obj = this.data;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        @NotNull
        public String toString() {
            return "LastDataModel(abnormalType=" + this.abnormalType + ", data=" + this.data + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalSingleLastDataAdapter$RecordItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "", "bindData", "(I)V", "Landroid/widget/TextView;", "startTv", "Landroid/widget/TextView;", "endTv", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalSingleLastDataAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nAbnormalSingleLastDataAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbnormalSingleLastDataAdapter.kt\ncom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalSingleLastDataAdapter$RecordItemViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n1863#2,2:287\n1863#2,2:289\n*S KotlinDebug\n*F\n+ 1 AbnormalSingleLastDataAdapter.kt\ncom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalSingleLastDataAdapter$RecordItemViewHolder\n*L\n101#1:287,2\n145#1:289,2\n*E\n"})
    public final class RecordItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView endTv;

        @NotNull
        private final TextView startTv;
        final /* synthetic */ AbnormalSingleLastDataAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecordItemViewHolder(@NotNull AbnormalSingleLastDataAdapter abnormalSingleLastDataAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = abnormalSingleLastDataAdapter;
            View viewFindViewById = itemView.findViewById(eri.start_tv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.startTv = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(eri.N4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.endTv = (TextView) viewFindViewById2;
        }

        public final void bindData(int position) {
            Application application;
            int i;
            int iIntValue;
            LastDataModel lastDataModel = (LastDataModel) this.this$0.castedWholeDataList.get(position);
            Object data = lastDataModel.getData();
            int abnormalType = lastDataModel.getAbnormalType();
            if (data == null) {
            }
            switch (abnormalType) {
                case 0:
                    AbnormalFibItem abnormalFibItem = (AbnormalFibItem) data;
                    String dateHHmm24Format = TimeDateUtil.getDateHHmm24Format(abnormalFibItem.getStartTime());
                    abnormalFibItem.getDuration();
                    String str = dateHHmm24Format + "-" + TimeDateUtil.getDateHHmm24Format(abnormalFibItem.getEndTime());
                    this.startTv.setText(ResourceExtKt.getString(c0j.c9));
                    this.endTv.setText(str);
                    break;
                case 1:
                case 2:
                    SegmentItem segmentItem = (SegmentItem) data;
                    ArrayList arrayList = new ArrayList();
                    List<AbnormalItem> items = segmentItem.getItems();
                    Intrinsics.checkNotNull(items);
                    for (AbnormalItem abnormalItem : items) {
                        if (abnormalItem.getValue() > 0) {
                            arrayList.add(Integer.valueOf(abnormalItem.getValue()));
                        }
                    }
                    if (!ArrayUtils.isEmpty(arrayList)) {
                        int maxValueInArray = ArrayUtils.getMaxValueInArray(arrayList);
                        int minValueInArray = ArrayUtils.getMinValueInArray(arrayList);
                        String quantityString = maxValueInArray == minValueInArray ? abnormalType == 1 ? ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.l1, minValueInArray, Integer.valueOf(minValueInArray)) : ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.n1, minValueInArray, Integer.valueOf(minValueInArray)) : abnormalType == 1 ? ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.m1, minValueInArray, Integer.valueOf(minValueInArray), Integer.valueOf(maxValueInArray)) : ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.o1, minValueInArray, Integer.valueOf(minValueInArray), Integer.valueOf(maxValueInArray));
                        Intrinsics.checkNotNull(quantityString);
                        this.startTv.setText(quantityString);
                    }
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str2 = String.format(Locale.US, "%s-%s", Arrays.copyOf(new Object[]{TimeDateUtil.getDateStr(segmentItem.getStartTime(), TimeUtils.FORMAT_H_M), TimeDateUtil.getDateStr(segmentItem.getEndTime(), TimeUtils.FORMAT_H_M)}, 2));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                    this.endTv.setText(str2);
                    break;
                case 3:
                    SegmentItem segmentItem2 = (SegmentItem) data;
                    ArrayList arrayList2 = new ArrayList();
                    List<AbnormalItem> items2 = segmentItem2.getItems();
                    Intrinsics.checkNotNull(items2);
                    for (AbnormalItem abnormalItem2 : items2) {
                        if (abnormalItem2.getValue() > 0) {
                            arrayList2.add(Integer.valueOf(abnormalItem2.getValue()));
                        }
                    }
                    if (!ArrayUtils.isEmpty(arrayList2)) {
                        int maxValueInArray2 = ArrayUtils.getMaxValueInArray(arrayList2);
                        int minValueInArray2 = ArrayUtils.getMinValueInArray(arrayList2);
                        String quantityString2 = maxValueInArray2 == minValueInArray2 ? ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.p1, minValueInArray2, Integer.valueOf(minValueInArray2)) : ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.q1, minValueInArray2, Integer.valueOf(minValueInArray2), Integer.valueOf(maxValueInArray2));
                        Intrinsics.checkNotNull(quantityString2);
                        this.startTv.setText(quantityString2);
                    }
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    String str3 = String.format(Locale.US, "%s-%s", Arrays.copyOf(new Object[]{TimeDateUtil.getDateStr(segmentItem2.getStartTime(), TimeUtils.FORMAT_H_M), TimeDateUtil.getDateStr(segmentItem2.getEndTime(), TimeUtils.FORMAT_H_M)}, 2));
                    Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                    this.endTv.setText(str3);
                    break;
                case 4:
                case 5:
                case 6:
                    StressItem stressItem = (StressItem) data;
                    this.startTv.setText(ResourceExtKt.getString(c0j.Tn, TodayHealthExtKt.getAbnormalTitleByAbnormalType(abnormalType), String.valueOf(stressItem.getStress())));
                    this.endTv.setText(TimeDateUtil.getDateHHmm24Format(stressItem.getTime()));
                    break;
                case 7:
                case 8:
                    SleepSegmentReport sleepSegmentReport = (SleepSegmentReport) data;
                    int sleepDuration = sleepSegmentReport.getSleepDuration();
                    float f = ((int) (sleepDuration / 6)) / 10.0f;
                    TextView textView = this.startTv;
                    if (sleepDuration < 360) {
                        application = ApplicationExtKt.getApplication();
                        i = qxi.u1;
                    } else {
                        application = ApplicationExtKt.getApplication();
                        i = qxi.t1;
                    }
                    textView.setText(ResourceExtKt.getQuantityString(application, i, (int) f, Float.valueOf(f)));
                    this.endTv.setText(TimeDateUtil.getDateHHmm24Format(sleepSegmentReport.getBedTime()) + "-" + TimeDateUtil.getDateHHmm24Format(sleepSegmentReport.getWakeupTime()));
                    break;
                case 9:
                case 10:
                    SleepSegmentReport sleepSegmentReport2 = (SleepSegmentReport) data;
                    Integer avgHr = sleepSegmentReport2.getAvgHr();
                    iIntValue = avgHr != null ? avgHr.intValue() : 0;
                    String quantityString3 = abnormalType == 10 ? ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.l1, iIntValue, Integer.valueOf(iIntValue)) : ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.n1, iIntValue, Integer.valueOf(iIntValue));
                    Intrinsics.checkNotNull(quantityString3);
                    this.startTv.setText(quantityString3);
                    this.endTv.setText(TimeDateUtil.getDateHHmm24Format(sleepSegmentReport2.getBedTime()) + "-" + TimeDateUtil.getDateHHmm24Format(sleepSegmentReport2.getWakeupTime()));
                    break;
                case 11:
                    SleepSegmentReport sleepSegmentReport3 = (SleepSegmentReport) data;
                    Integer avgSpo2 = sleepSegmentReport3.getAvgSpo2();
                    iIntValue = avgSpo2 != null ? avgSpo2.intValue() : 0;
                    this.startTv.setText(ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.p1, iIntValue, Integer.valueOf(iIntValue)));
                    this.endTv.setText(TimeDateUtil.getDateHHmm24Format(sleepSegmentReport3.getBedTime()) + "-" + TimeDateUtil.getDateHHmm24Format(sleepSegmentReport3.getWakeupTime()));
                    break;
                case 12:
                    HeartHealthValueItem heartHealthValueItem = (HeartHealthValueItem) data;
                    String dateHHmm24Format2 = TimeDateUtil.getDateHHmm24Format(heartHealthValueItem.getTime());
                    String heartStatusString$default = HeartHealthValueItem.getHeartStatusString$default(heartHealthValueItem, 0, 1, null);
                    Resources resources = ApplicationExtKt.getApplication().getResources();
                    int i2 = qxi.W;
                    Integer avgHr2 = heartHealthValueItem.getAvgHr();
                    String quantityString4 = resources.getQuantityString(i2, avgHr2 != null ? avgHr2.intValue() : 0, heartStatusString$default, heartHealthValueItem.getAvgHr());
                    Intrinsics.checkNotNullExpressionValue(quantityString4, "getQuantityString(...)");
                    this.startTv.setText(quantityString4);
                    this.endTv.setText(dateHHmm24Format2);
                    break;
                case 13:
                    AmbulatoryBloodPressureReport ambulatoryBloodPressureReport = (AmbulatoryBloodPressureReport) data;
                    Long bPRhythmEndTime = ambulatoryBloodPressureReport.getBPRhythmEndTime();
                    String dateHHmm24Format3 = TimeDateUtil.getDateHHmm24Format(bPRhythmEndTime != null ? bPRhythmEndTime.longValue() : ambulatoryBloodPressureReport.getTime());
                    Integer bpRhythmStatus = ambulatoryBloodPressureReport.getBpRhythmStatus();
                    this.startTv.setText((bpRhythmStatus != null && bpRhythmStatus.intValue() == 2) ? ResourceExtKt.getString(c0j.Ra) : ResourceExtKt.getString(c0j.Ra));
                    this.endTv.setText(dateHHmm24Format3);
                    break;
            }
        }
    }

    public AbnormalSingleLastDataAdapter(@NotNull List<LastDataModel> itemList) {
        Intrinsics.checkNotNullParameter(itemList, "itemList");
        this.mExpandStatus = true;
        this.castedWholeDataList = itemList;
        this.uiModelList = new ArrayList();
        buildDataModelList();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private final void buildDataModelList() {
        if (this.mExpandStatus) {
            this.uiModelList.clear();
            this.uiModelList.addAll(this.castedWholeDataList);
        } else {
            LastDataModel lastDataModel = (LastDataModel) CollectionsKt___CollectionsKt.firstOrNull((List) this.castedWholeDataList);
            this.uiModelList.clear();
            if (lastDataModel != null) {
                this.uiModelList.add(lastDataModel);
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.uiModelList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position;
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
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.I5, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new RecordItemViewHolder(this, viewInflate);
    }
}
