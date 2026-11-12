package com.xiaomi.fitness.route.track.utils;

import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fitness.chart.entrys.SportRecordEntry;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007J&\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/route/track/utils/SportRecordDataUtil;", "", "<init>", "()V", "createEntryListInner", "Lcom/xiaomi/fitness/route/track/utils/SportRecordListModel;", "sportItemValueList", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "setEntriesMinMaxFlag", "", "entries", "Lcom/xiaomi/fitness/chart/entrys/SportRecordEntry;", "minValueIndex", "", "maxValueIndex", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportRecordDataUtil {

    @NotNull
    public static final SportRecordDataUtil INSTANCE = new SportRecordDataUtil();

    private SportRecordDataUtil() {
    }

    @JvmStatic
    @NotNull
    public static final SportRecordListModel createEntryListInner(@Nullable List<SportRecordItem> sportItemValueList) {
        List<SportRecordItem> list = sportItemValueList;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        if (list == null || sportItemValueList.isEmpty()) {
            return new SportRecordListModel(arrayList, 0, 0);
        }
        int size = sportItemValueList.size();
        float fMin = 2.14748365E9f;
        float fMax = -2.14748365E9f;
        int i2 = 0;
        int i3 = 0;
        while (i < size) {
            SportRecordItem sportRecordItem = list.get(i);
            long endTime = sportRecordItem.getEndTime();
            Number value = sportRecordItem.getValue();
            int index = sportRecordItem.getIndex();
            float fFloatValue = value.floatValue();
            fMin = Math.min(fMin, fFloatValue);
            if (fMin == fFloatValue) {
                i2 = i;
            }
            fMax = Math.max(fMax, fFloatValue);
            if (fMax == fFloatValue) {
                i3 = i;
            }
            SportRecordEntry sportRecordEntry = new SportRecordEntry(index, fFloatValue, endTime, 3);
            sportRecordEntry.localDate = TimeDateUtil.timestampToLocalDate(endTime);
            arrayList.add(sportRecordEntry);
            i++;
            list = sportItemValueList;
        }
        INSTANCE.setEntriesMinMaxFlag(arrayList, i2, i3);
        return new SportRecordListModel(arrayList, i2, i3);
    }

    private final void setEntriesMinMaxFlag(List<? extends SportRecordEntry> entries, int minValueIndex, int maxValueIndex) {
        if (minValueIndex < entries.size() && minValueIndex >= 0) {
            entries.get(minValueIndex).isMinMax = -1;
            int i = minValueIndex - 1;
            if (i >= 0) {
                entries.get(i).isMinMax = -2;
            }
            int i2 = minValueIndex + 1;
            if (i2 < entries.size()) {
                entries.get(i2).isMinMax = -2;
            }
            int i3 = minValueIndex - 2;
            if (i3 >= 0) {
                entries.get(i3).isMinMax = -2;
            }
            int i4 = minValueIndex + 2;
            if (i4 < entries.size()) {
                entries.get(i4).isMinMax = -2;
            }
        }
        if (maxValueIndex >= entries.size() || maxValueIndex < 0) {
            return;
        }
        entries.get(maxValueIndex).isMinMax = 1;
        int i5 = maxValueIndex - 1;
        if (i5 >= 0) {
            entries.get(i5).isMinMax = 2;
        }
        int i6 = maxValueIndex + 1;
        if (i6 < entries.size()) {
            entries.get(i6).isMinMax = 2;
        }
        int i7 = maxValueIndex - 2;
        if (i7 >= 0) {
            entries.get(i7).isMinMax = 2;
        }
        int i8 = maxValueIndex + 2;
        if (i8 < entries.size()) {
            entries.get(i8).isMinMax = 2;
        }
    }
}
