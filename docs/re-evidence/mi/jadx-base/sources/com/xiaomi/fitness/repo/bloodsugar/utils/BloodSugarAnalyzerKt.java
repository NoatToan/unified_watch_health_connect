package com.xiaomi.fitness.repo.bloodsugar.utils;

import com.xiaomi.fit.fitness.export.data.aggregation.AGPItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0000\u001a\u0018\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¨\u0006\u0005"}, d2 = {"computeTheAGPOfOneTime", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AGPItem;", "dataList", "", "", "fitness-data-core_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BloodSugarAnalyzerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final AGPItem computeTheAGPOfOneTime(List<Float> list) {
        if (list.isEmpty()) {
            return null;
        }
        CollectionsKt__MutableCollectionsJVMKt.sort(list);
        AGPItem aGPItem = new AGPItem(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31, null);
        int size = list.size();
        int i = size / 2;
        int i2 = size % 2;
        aGPItem.setFiftyValue(i2 + ((((i2 ^ 2) & ((-i2) | i2)) >> 31) & 2) == 0 ? (list.get(i).floatValue() + list.get(i - 1).floatValue()) / 2 : list.get(i).floatValue());
        int i3 = size / 4;
        int i4 = size % 4;
        if (i4 + ((((i4 ^ 4) & ((-i4) | i4)) >> 31) & 4) == 0) {
            aGPItem.setTwentyFiveValue(list.get(i3).floatValue());
            aGPItem.setSeventyFiveValue(list.get((size - 1) - i3).floatValue());
        } else {
            aGPItem.setTwentyFiveValue(i3 == 0 ? list.get(0).floatValue() : (list.get(i3).floatValue() + list.get(i3 - 1).floatValue()) / 2);
            int i5 = size - 1;
            aGPItem.setSeventyFiveValue(i3 == i5 ? list.get(0).floatValue() : (list.get(i5 - i3).floatValue() + list.get((size - i3) - 2).floatValue()) / 2);
        }
        int i6 = size / 10;
        int i7 = size % 10;
        if (i7 + ((((i7 ^ 10) & ((-i7) | i7)) >> 31) & 10) == 0) {
            aGPItem.setTenValue(list.get(i6).floatValue());
            aGPItem.setNinetyValue(list.get((size - 1) - i6).floatValue());
        } else {
            aGPItem.setTenValue(i6 == 0 ? list.get(0).floatValue() : (list.get(i6).floatValue() + list.get(i6 - 1).floatValue()) / 2);
            int i8 = size - 1;
            aGPItem.setNinetyValue(i6 == i8 ? list.get(0).floatValue() : (list.get(i8 - i6).floatValue() + list.get((size - i6) - 2).floatValue()) / 2);
        }
        return aGPItem;
    }
}
