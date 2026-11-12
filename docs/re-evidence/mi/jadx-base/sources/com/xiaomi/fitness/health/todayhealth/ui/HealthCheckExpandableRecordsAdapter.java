package com.xiaomi.fitness.health.todayhealth.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.HealthCheckDayReport;
import com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableItem;
import com.xiaomi.fitness.common.recycer.expandable.HeaderItem;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.data.model.WrapperHealthCheckRecord;
import com.xiaomi.fitness.health.todayhealth.ui.HealthCheckExpandableRecordsAdapter;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.sob;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001%B\u0007¢\u0006\u0004\b#\u0010$J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/HealthCheckExpandableRecordsAdapter;", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseMonthExpandableAdapter;", "Lcom/xiaomi/fitness/data/model/WrapperHealthCheckRecord;", "Lcom/xiaomi/fit/fitness/export/data/item/HealthCheckDayReport;", "Lcom/xiaomi/fitness/health/todayhealth/ui/HealthCheckHistoryRecordViewHolder;", "viewHolder", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "data", "", "onBindHealthCheckHistoryRecordViewHolder", "(Lcom/xiaomi/fitness/health/todayhealth/ui/HealthCheckHistoryRecordViewHolder;Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;)V", "item", "", "monthTimeMillis", "convertDailyRecordItemToWrapper", "(Lcom/xiaomi/fit/fitness/export/data/item/HealthCheckDayReport;J)Lcom/xiaomi/fitness/data/model/WrapperHealthCheckRecord;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter$CommonDataViewHolder;", "onBindCommonDataViewHolder", "(Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter$CommonDataViewHolder;Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;)V", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateDataViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "", "stringIds", "Ljava/util/List;", "getStringIds", "()Ljava/util/List;", "<init>", "()V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class HealthCheckExpandableRecordsAdapter extends BaseMonthExpandableAdapter<WrapperHealthCheckRecord, HealthCheckDayReport> {

    @NotNull
    public static final String TAG = "HrmExpandableManualRecordsAdapter";

    @NotNull
    private final List<Integer> stringIds = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(c0j.Q4), Integer.valueOf(c0j.R4), Integer.valueOf(c0j.P4), Integer.valueOf(c0j.O4), Integer.valueOf(c0j.N4), Integer.valueOf(c0j.Z4), Integer.valueOf(c0j.Y4), Integer.valueOf(c0j.K4), Integer.valueOf(c0j.J4), Integer.valueOf(c0j.L4)});

    private final void onBindHealthCheckHistoryRecordViewHolder(HealthCheckHistoryRecordViewHolder viewHolder, ExpandableBaseDataItem data) {
        if (data instanceof WrapperHealthCheckRecord) {
            viewHolder.updateView(TimeUtils.formatDate(ExtUtilKt.getString(c0j.h), Long.valueOf(((WrapperHealthCheckRecord) data).getHealthCheckDayReport().getTimestamp() * ((long) 1000))), "某某某", 10, this.stringIds, "xiaomi watch 2");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(HealthCheckExpandableRecordsAdapter this$0, int i, ExpandableItem expandableItem, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(expandableItem, "$expandableItem");
        if (this$0.getOnItemClickListener() != null) {
            BaseExpandableAdapter.OnItemClickListener onItemClickListener = this$0.getOnItemClickListener();
            Intrinsics.checkNotNull(onItemClickListener);
            HeaderItem headItem = expandableItem.getHeadItem();
            Intrinsics.checkNotNull(headItem);
            onItemClickListener.onClickHeader(i, headItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(HealthCheckExpandableRecordsAdapter this$0, ExpandableItem expandableItem, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(expandableItem, "$expandableItem");
        if (this$0.getOnItemClickListener() != null) {
            BaseExpandableAdapter.OnItemClickListener onItemClickListener = this$0.getOnItemClickListener();
            Intrinsics.checkNotNull(onItemClickListener);
            ExpandableBaseDataItem itemDetail = expandableItem.getItemDetail();
            Intrinsics.checkNotNull(itemDetail);
            onItemClickListener.onClickData(itemDetail);
        }
    }

    @NotNull
    public final List<Integer> getStringIds() {
        return this.stringIds;
    }

    @Override // com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter
    public void onBindCommonDataViewHolder(@NotNull BaseExpandableAdapter.CommonDataViewHolder viewHolder, @NotNull ExpandableBaseDataItem data) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(data, "data");
    }

    @Override // com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final ExpandableItem expandableItem = (ExpandableItem) getDataList().get(position);
        if (holder instanceof BaseExpandableAdapter.CommonExpandableHeaderViewHolder) {
            HeaderItem headItem = expandableItem.getHeadItem();
            Intrinsics.checkNotNull(headItem);
            ((BaseExpandableAdapter.CommonExpandableHeaderViewHolder) holder).bindData(headItem);
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: qob
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HealthCheckExpandableRecordsAdapter.onBindViewHolder$lambda$0(this.f31695a, position, expandableItem, view);
                }
            });
            return;
        }
        if (holder instanceof HealthCheckHistoryRecordViewHolder) {
            ExpandableBaseDataItem itemDetail = expandableItem.getItemDetail();
            Intrinsics.checkNotNull(itemDetail);
            onBindHealthCheckHistoryRecordViewHolder((HealthCheckHistoryRecordViewHolder) holder, itemDetail);
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: rob
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HealthCheckExpandableRecordsAdapter.onBindViewHolder$lambda$1(this.f32745a, expandableItem, view);
                }
            });
        }
    }

    @Override // com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter
    @NotNull
    public RecyclerView.d0 onCreateDataViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        sob sobVarA0 = sob.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(sobVarA0, "inflate(...)");
        return new HealthCheckHistoryRecordViewHolder(sobVarA0);
    }

    @Override // com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter
    @NotNull
    public WrapperHealthCheckRecord convertDailyRecordItemToWrapper(@NotNull HealthCheckDayReport item, long monthTimeMillis) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new WrapperHealthCheckRecord(item.getTimestamp() * ((long) 1000), monthTimeMillis, item);
    }
}
