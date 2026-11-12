package com.xiaomi.fit.fitness.export.data.item;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\u0010\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b*\u00020\t¨\u0006\n"}, d2 = {"toHrItem", "Lcom/xiaomi/fit/fitness/export/data/item/HrItem;", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalItem;", "toSpo2Item", "Lcom/xiaomi/fit/fitness/export/data/item/Spo2Item;", "toStressItem", "Lcom/xiaomi/fit/fitness/export/data/item/StressItem;", "toHrItemList", "", "Lcom/xiaomi/fit/fitness/export/data/item/AbnormalRecordItem;", "fitness-data-export_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DailyDataItemExtKt {
    @NotNull
    public static final HrItem toHrItem(@NotNull AbnormalItem abnormalItem) {
        Intrinsics.checkNotNullParameter(abnormalItem, "<this>");
        return new HrItem(abnormalItem.getTime(), abnormalItem.getValue());
    }

    @NotNull
    public static final List<HrItem> toHrItemList(@NotNull SegmentItem segmentItem) {
        Intrinsics.checkNotNullParameter(segmentItem, "<this>");
        ArrayList arrayList = new ArrayList();
        List<AbnormalItem> items = segmentItem.getItems();
        if (items != null) {
            for (AbnormalItem abnormalItem : items) {
                if (abnormalItem.getValue() > 0) {
                    arrayList.add(toHrItem(abnormalItem));
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public static final Spo2Item toSpo2Item(@NotNull AbnormalItem abnormalItem) {
        Intrinsics.checkNotNullParameter(abnormalItem, "<this>");
        return new Spo2Item(abnormalItem.getTime(), abnormalItem.getValue());
    }

    @NotNull
    public static final StressItem toStressItem(@NotNull AbnormalItem abnormalItem) {
        Intrinsics.checkNotNullParameter(abnormalItem, "<this>");
        return new StressItem(abnormalItem.getTime(), abnormalItem.getValue());
    }
}
