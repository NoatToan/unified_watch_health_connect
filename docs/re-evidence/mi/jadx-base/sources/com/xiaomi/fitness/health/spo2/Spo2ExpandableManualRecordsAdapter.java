package com.xiaomi.fitness.health.spo2;

import com.xiaomi.fit.fitness.export.data.item.Spo2Item;
import com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter;
import com.xiaomi.fitness.common.recycer.expandable.ExpandableBaseDataItem;
import com.xiaomi.fitness.data.model.WrapperSpo2ManualRecord;
import com.xiaomi.fitness.util.AllRecordsPageUtilKt;
import defpackage.xr5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/health/spo2/Spo2ExpandableManualRecordsAdapter;", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseMonthExpandableAdapter;", "Lcom/xiaomi/fitness/data/model/WrapperSpo2ManualRecord;", "Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;", "<init>", "()V", "onBindCommonDataViewHolder", "", "viewHolder", "Lcom/xiaomi/fitness/common/recycer/expandable/BaseExpandableAdapter$CommonDataViewHolder;", "data", "Lcom/xiaomi/fitness/common/recycer/expandable/ExpandableBaseDataItem;", "convertDailyRecordItemToWrapper", "item", "monthTimeMillis", "", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Spo2ExpandableManualRecordsAdapter extends BaseMonthExpandableAdapter<WrapperSpo2ManualRecord, Spo2Item> {

    @NotNull
    public static final String TAG = "Spo2ExpandableManualRecordsAdapter";

    @Override // com.xiaomi.fitness.common.recycer.expandable.BaseExpandableAdapter
    public void onBindCommonDataViewHolder(@NotNull BaseExpandableAdapter.CommonDataViewHolder viewHolder, @NotNull ExpandableBaseDataItem data) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data instanceof WrapperSpo2ManualRecord) {
            Spo2Item spo2Item = ((WrapperSpo2ManualRecord) data).getSpo2Item();
            String strH = xr5.h(spo2Item.getSpo2());
            String strConvertDataItemToMMDDHHMMString = AllRecordsPageUtilKt.convertDataItemToMMDDHHMMString(spo2Item.getTime());
            Intrinsics.checkNotNull(strH);
            BaseExpandableAdapter.CommonDataViewHolder.updateView$default(viewHolder, strH, null, strConvertDataItemToMMDDHHMMString, null, true, false, true, true, false, 266, null);
        }
    }

    @Override // com.xiaomi.fitness.common.recycer.expandable.BaseMonthExpandableAdapter
    @NotNull
    public WrapperSpo2ManualRecord convertDailyRecordItemToWrapper(@NotNull Spo2Item item, long monthTimeMillis) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new WrapperSpo2ManualRecord(item.getTimestamp() * ((long) 1000), monthTimeMillis, item);
    }
}
