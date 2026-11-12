package com.xiaomi.fit.fitness.device.mi.parse.utils;

import com.xiaomi.fit.fitness.export.data.item.AbnormalFibItem;
import com.xiaomi.fit.fitness.export.data.item.AbnormalItem;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fit.fitness.parser.data.AbnormalRecord;
import com.xiaomi.fit.fitness.parser.data.RecordItem;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"convertToAbnormalItem", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "Lcom/xiaomi/fit/fitness/parser/data/AbnormalRecord;", "fitness-sync_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ParserExtKt {
    @Nullable
    public static final DailyRecordItem convertToAbnormalItem(@NotNull AbnormalRecord abnormalRecord) {
        Intrinsics.checkNotNullParameter(abnormalRecord, "<this>");
        int abnormalType = abnormalRecord.getAbnormalType();
        ArrayList arrayList = new ArrayList();
        for (RecordItem recordItem : abnormalRecord.getRecordList()) {
            arrayList.add(new AbnormalItem(recordItem.getTime(), recordItem.getValue()));
        }
        if (abnormalType == 1 || abnormalType == 2 || abnormalType == 3 || abnormalType == 4) {
            if (arrayList.isEmpty()) {
                return null;
            }
            return new SegmentItem(abnormalRecord.getStartTime(), abnormalRecord.getEndTime(), arrayList, abnormalRecord.getAbnormalSetValue());
        }
        if (abnormalType == 5) {
            return new AbnormalFibItem(abnormalRecord.getStartTime(), abnormalRecord.getEndTime());
        }
        throw new IllegalStateException("unknown abnormal type:" + abnormalType);
    }
}
