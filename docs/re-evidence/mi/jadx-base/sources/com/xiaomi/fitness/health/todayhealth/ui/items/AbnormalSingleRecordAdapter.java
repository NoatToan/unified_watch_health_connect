package com.xiaomi.fitness.health.todayhealth.ui.items;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.item.StressItem;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.todayhealth.ui.items.AbnormalSingleRecordAdapter;
import defpackage.c0j;
import defpackage.eri;
import defpackage.jui;
import defpackage.pni;
import defpackage.qxi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004$%&'B\u001d\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\"\u0010#J\u000f\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalSingleRecordAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "buildDataModelList", "()V", "", "", "data", "", "addHeaderAndGetResultResult", "(Ljava/util/List;)Ljava/util/List;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "position", "getItemViewType", "(I)I", "getItemCount", "()I", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "abnormalType", "I", "", "mExpandStatus", "Z", "castedWholeDataList", "Ljava/util/List;", "uiModelList", "<init>", "(ILjava/util/List;)V", "Companion", "HeaderModel", "HeaderViewHolder", "RecordItemViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAbnormalSingleRecordAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbnormalSingleRecordAdapter.kt\ncom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalSingleRecordAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,273:1\n1368#2:274\n1454#2,5:275\n1368#2:280\n1454#2,5:281\n*S KotlinDebug\n*F\n+ 1 AbnormalSingleRecordAdapter.kt\ncom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalSingleRecordAdapter\n*L\n56#1:274\n56#1:275,5\n62#1:280\n62#1:281,5\n*E\n"})
public final class AbnormalSingleRecordAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    public static final String TAG = "AbnormalSingleRecordAdapter";
    public static final int VIEW_TYPE_DATA_ITEM = 1;
    public static final int VIEW_TYPE_HEADER = 0;
    private final int abnormalType;

    @NotNull
    private final List<Object> castedWholeDataList;
    private boolean mExpandStatus;

    @NotNull
    private final List<Object> uiModelList;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalSingleRecordAdapter$HeaderModel;", "", "<init>", "(Lcom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalSingleRecordAdapter;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class HeaderModel {
        public HeaderModel() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalSingleRecordAdapter$HeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "bindData", "()V", "Landroid/widget/TextView;", "startTv", "Landroid/widget/TextView;", "endTv", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalSingleRecordAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class HeaderViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView endTv;

        @NotNull
        private final TextView startTv;
        final /* synthetic */ AbnormalSingleRecordAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeaderViewHolder(@NotNull AbnormalSingleRecordAdapter abnormalSingleRecordAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = abnormalSingleRecordAdapter;
            View viewFindViewById = itemView.findViewById(eri.start_tv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.startTv = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(eri.N4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.endTv = (TextView) viewFindViewById2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindData$lambda$0(AbnormalSingleRecordAdapter this$0, Drawable drawable, Drawable drawable2, HeaderViewHolder this$1, TextView it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(it, "it");
            this$0.mExpandStatus = !this$0.mExpandStatus;
            if (!this$0.mExpandStatus) {
                drawable = drawable2;
            }
            this$1.endTv.setCompoundDrawables(null, null, drawable, null);
            this$0.buildDataModelList();
            return Unit.INSTANCE;
        }

        public final void bindData() {
            int i;
            switch (this.this$0.abnormalType) {
                case 0:
                    i = c0j.c9;
                    break;
                case 1:
                    i = c0j.a9;
                    break;
                case 2:
                    i = c0j.b9;
                    break;
                case 3:
                    i = c0j.Vk;
                    break;
                case 4:
                    i = c0j.Al;
                    break;
                case 5:
                    i = c0j.Cl;
                    break;
                case 6:
                    i = c0j.Hl;
                    break;
                case 7:
                    i = c0j.Wg;
                    break;
                case 8:
                    i = c0j.Vg;
                    break;
                case 9:
                    i = c0j.Vk;
                    break;
                case 10:
                    i = c0j.a9;
                    break;
                case 11:
                    i = c0j.Vk;
                    break;
                default:
                    i = c0j.t;
                    break;
            }
            this.startTv.setText(i);
            int size = this.this$0.castedWholeDataList.size() - 1;
            ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qxi.common_unit_time, size, Integer.valueOf(size));
            this.endTv.setText(size + ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qxi.common_unit_time, size, Integer.valueOf(size)));
            final Drawable resourceDrawable = ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), pni.v3);
            final Drawable resourceDrawable2 = ResourceExtKt.getResourceDrawable(ApplicationExtKt.getApplication(), pni.w3);
            if (resourceDrawable != null) {
                resourceDrawable.setBounds(0, 0, ExtUtilsKt.getDp(20), ExtUtilsKt.getDp(20));
            }
            if (resourceDrawable2 != null) {
                resourceDrawable2.setBounds(0, 0, ExtUtilsKt.getDp(20), ExtUtilsKt.getDp(20));
            }
            this.endTv.setCompoundDrawables(null, null, resourceDrawable, null);
            TextView textView = this.endTv;
            final AbnormalSingleRecordAdapter abnormalSingleRecordAdapter = this.this$0;
            ViewExtKt.clickWithTrigger$default(textView, 0L, new Function1() { // from class: vu
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AbnormalSingleRecordAdapter.HeaderViewHolder.bindData$lambda$0(abnormalSingleRecordAdapter, resourceDrawable, resourceDrawable2, this, (TextView) obj);
                }
            }, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalSingleRecordAdapter$RecordItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "position", "", "bindData", "(I)V", "Landroid/widget/TextView;", "startTv", "Landroid/widget/TextView;", "endTv", "Landroid/view/View;", "itemView", "<init>", "(Lcom/xiaomi/fitness/health/todayhealth/ui/items/AbnormalSingleRecordAdapter;Landroid/view/View;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class RecordItemViewHolder extends RecyclerView.d0 {

        @NotNull
        private final TextView endTv;

        @NotNull
        private final TextView startTv;
        final /* synthetic */ AbnormalSingleRecordAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecordItemViewHolder(@NotNull AbnormalSingleRecordAdapter abnormalSingleRecordAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = abnormalSingleRecordAdapter;
            View viewFindViewById = itemView.findViewById(eri.start_tv);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.startTv = (TextView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(eri.N4);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.endTv = (TextView) viewFindViewById2;
        }

        public final void bindData(int position) {
            Object obj = this.this$0.castedWholeDataList.get(position);
            switch (this.this$0.abnormalType) {
                case 0:
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem");
                    AbnormalFibItem abnormalFibItem = (AbnormalFibItem) obj;
                    String dateHHmm24Format = TimeDateUtil.getDateHHmm24Format(abnormalFibItem.getStartTime());
                    int duration = abnormalFibItem.getDuration();
                    String str = dateHHmm24Format + "-" + TimeDateUtil.getDateHHmm24Format(abnormalFibItem.getEndTime());
                    String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.R1, duration, Integer.valueOf(duration));
                    Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                    this.startTv.setText(quantityString);
                    this.endTv.setText(str);
                    break;
                case 1:
                case 2:
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.AbnormalItem");
                    AbnormalItem abnormalItem = (AbnormalItem) obj;
                    int value = abnormalItem.getValue();
                    String quantityString2 = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.common_unit_heart_rate_desc, value, Integer.valueOf(value));
                    Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
                    String dateHHmm24Format2 = TimeDateUtil.getDateHHmm24Format(abnormalItem.getTime());
                    this.startTv.setText(quantityString2);
                    this.endTv.setText(dateHHmm24Format2);
                    break;
                case 3:
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.AbnormalItem");
                    AbnormalItem abnormalItem2 = (AbnormalItem) obj;
                    int value2 = abnormalItem2.getValue();
                    String dateHHmm24Format3 = TimeDateUtil.getDateHHmm24Format(abnormalItem2.getTime());
                    this.startTv.setText(ResourceExtKt.getString(c0j.common_percent_join_str, Integer.valueOf(value2)));
                    this.endTv.setText(dateHHmm24Format3);
                    break;
                case 4:
                case 5:
                case 6:
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.StressItem");
                    StressItem stressItem = (StressItem) obj;
                    this.startTv.setText(String.valueOf(stressItem.getStress()));
                    this.endTv.setText(TimeDateUtil.getDateHHmm24Format(stressItem.getTime()));
                    break;
                case 7:
                case 8:
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport");
                    SleepSegmentReport sleepSegmentReport = (SleepSegmentReport) obj;
                    this.startTv.setText(String.valueOf(sleepSegmentReport.getSleepDuration()));
                    this.endTv.setText(TimeDateUtil.getDateHHmm24Format(sleepSegmentReport.getBedTime()) + "-" + TimeDateUtil.getDateHHmm24Format(sleepSegmentReport.getWakeupTime()));
                    break;
                case 9:
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport");
                    SleepSegmentReport sleepSegmentReport2 = (SleepSegmentReport) obj;
                    this.startTv.setText(String.valueOf(sleepSegmentReport2.getAvgHr()));
                    this.endTv.setText(TimeDateUtil.getDateHHmm24Format(sleepSegmentReport2.getBedTime()) + "-" + TimeDateUtil.getDateHHmm24Format(sleepSegmentReport2.getWakeupTime()));
                    break;
                case 11:
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport");
                    SleepSegmentReport sleepSegmentReport3 = (SleepSegmentReport) obj;
                    this.startTv.setText(String.valueOf(sleepSegmentReport3.getAvgSpo2()));
                    this.endTv.setText(TimeDateUtil.getDateHHmm24Format(sleepSegmentReport3.getBedTime()) + "-" + TimeDateUtil.getDateHHmm24Format(sleepSegmentReport3.getWakeupTime()));
                    break;
            }
        }
    }

    public AbnormalSingleRecordAdapter(int i, @NotNull List<? extends Object> data) {
        List<Object> listAddHeaderAndGetResultResult;
        Intrinsics.checkNotNullParameter(data, "data");
        this.abnormalType = i;
        this.mExpandStatus = true;
        switch (i) {
            case 0:
                listAddHeaderAndGetResultResult = addHeaderAndGetResultResult(data);
                break;
            case 1:
            case 2:
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = data.iterator();
                while (it.hasNext()) {
                    List<AbnormalItem> items = ((SegmentItem) it.next()).getItems();
                    if (items == null) {
                        items = CollectionsKt__CollectionsKt.emptyList();
                    }
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList, items);
                }
                listAddHeaderAndGetResultResult = addHeaderAndGetResultResult(arrayList);
                break;
            case 3:
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it2 = data.iterator();
                while (it2.hasNext()) {
                    List<AbnormalItem> items2 = ((SegmentItem) it2.next()).getItems();
                    if (items2 == null) {
                        items2 = CollectionsKt__CollectionsKt.emptyList();
                    }
                    CollectionsKt__MutableCollectionsKt.addAll(arrayList2, items2);
                }
                listAddHeaderAndGetResultResult = addHeaderAndGetResultResult(arrayList2);
                break;
            case 4:
            case 5:
            case 6:
                listAddHeaderAndGetResultResult = addHeaderAndGetResultResult(data);
                break;
            case 7:
            case 8:
            case 9:
            case 11:
                listAddHeaderAndGetResultResult = addHeaderAndGetResultResult(data);
                break;
            case 10:
            default:
                listAddHeaderAndGetResultResult = new ArrayList<>();
                break;
        }
        this.castedWholeDataList = listAddHeaderAndGetResultResult;
        this.uiModelList = new ArrayList();
        buildDataModelList();
    }

    private final List<Object> addHeaderAndGetResultResult(List<? extends Object> data) {
        ArrayList arrayList = new ArrayList();
        if (data.size() > 1) {
            arrayList.add(0, new HeaderModel());
        }
        arrayList.addAll(data);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NotifyDataSetChanged"})
    public final void buildDataModelList() {
        if (this.mExpandStatus) {
            this.uiModelList.clear();
            this.uiModelList.addAll(this.castedWholeDataList);
        } else {
            Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) this.castedWholeDataList);
            this.uiModelList.clear();
            if (objFirstOrNull != null) {
                this.uiModelList.add(objFirstOrNull);
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        if (this.mExpandStatus) {
            return this.uiModelList.size();
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return !(this.uiModelList.get(position) instanceof HeaderModel) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof RecordItemViewHolder) {
            ((RecordItemViewHolder) holder).bindData(position);
        } else if (holder instanceof HeaderViewHolder) {
            ((HeaderViewHolder) holder).bindData();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 1) {
            View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jui.I5, parent, false);
            Intrinsics.checkNotNull(viewInflate);
            return new RecordItemViewHolder(this, viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(parent.getContext()).inflate(jui.M5, parent, false);
        Intrinsics.checkNotNull(viewInflate2);
        return new HeaderViewHolder(this, viewInflate2);
    }
}
