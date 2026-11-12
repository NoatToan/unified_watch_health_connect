package com.xiaomi.fitness.health.hrm.recycler;

import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import com.xiaomi.fitness.data.model.WrapperHrmExtremeRecord;
import com.xiaomi.fitness.util.AllRecordsPageUtilKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/health/hrm/recycler/HrmExpandableExtremeRecordsAdapter;", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseMonthExpandableAdapter;", "Lcom/xiaomi/fitness/data/model/WrapperHrmExtremeRecord;", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "<init>", "()V", "onBindCommonDataViewHolder", "", "viewHolder", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter$CommonDataViewHolder;", "data", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "convertDailyRecordItemToWrapper", "item", "monthTimeMillis", "", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HrmExpandableExtremeRecordsAdapter extends BaseMonthExpandableAdapter<WrapperHrmExtremeRecord, SegmentItem> {

    @NotNull
    public static final String TAG = "HrmExpandableExtremeHighRecordsAdapter";

    @Override // com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter
    public void onBindCommonDataViewHolder(@NotNull BaseExpandableAdapter.CommonDataViewHolder viewHolder, @NotNull ExpandableBaseDataItem data) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof WrapperHrmExtremeRecord) {
            WrapperHrmExtremeRecord wrapperHrmExtremeRecord = (WrapperHrmExtremeRecord) data;
            SegmentItem abnormalRecordItem = wrapperHrmExtremeRecord.getAbnormalRecordItem();
            BaseExpandableAdapter.CommonDataViewHolder.updateView$default(viewHolder, AllRecordsPageUtilKt.getAbnormalHrmItemsRangeStr(wrapperHrmExtremeRecord.getAbnormalRecordItem()), null, AllRecordsPageUtilKt.convertDataItemToTimeWindowStr(abnormalRecordItem.getStartTime(), abnormalRecordItem.getEndTime()), null, true, false, true, true, false, 266, null);
        }
    }

    @Override // com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter
    @NotNull
    public WrapperHrmExtremeRecord convertDailyRecordItemToWrapper(@NotNull SegmentItem item, long monthTimeMillis) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new WrapperHrmExtremeRecord(item.getTimestamp() * ((long) 1000), monthTimeMillis, item);
    }
}
