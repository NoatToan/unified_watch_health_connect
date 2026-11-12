package com.xiaomi.fitness.sample;

import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import defpackage.vxc;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sample/SamplingSumStrategy;", "Lvxc;", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "valueList", "", "segStartIndex", "segEndIndex", "", "getValue", "(Ljava/util/List;II)F", "<init>", "()V", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SamplingSumStrategy implements vxc {
    @Override // defpackage.vxc
    public float getValue(@NotNull List<SportRecordItem> valueList, int segStartIndex, int segEndIndex) {
        Intrinsics.checkNotNullParameter(valueList, "valueList");
        List<SportRecordItem> listSubList = valueList.subList(segStartIndex, segEndIndex);
        int size = listSubList.size();
        float fFloatValue = 0.0f;
        for (int i = 0; i < size; i++) {
            SportRecordItem sportRecordItem = listSubList.get(i);
            if (sportRecordItem != null) {
                fFloatValue += sportRecordItem.getValue().floatValue();
            }
        }
        return fFloatValue;
    }
}
