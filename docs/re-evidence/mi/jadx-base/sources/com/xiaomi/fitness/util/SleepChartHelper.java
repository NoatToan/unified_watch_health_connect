package com.xiaomi.fitness.util;

import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import defpackage.r02;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006JG\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/util/SleepChartHelper;", "", "", "", Constants.KEY_RECHARGE_VALUES, "getMaxValue", "(Ljava/util/List;)Ljava/lang/Integer;", "Lorg/joda/time/LocalDate;", "endLocalDate", "startLocalDate", "", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordInt;", "recordMap", "Lr02;", "attrs", "", "isWeek", "Lcom/xiaomi/fitness/chart/entrys/SegmentBarEntry;", "createEntriesFromRecordMap", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/Map;Lr02;Z)Ljava/util/List;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepChartHelper {

    @NotNull
    public static final SleepChartHelper INSTANCE = new SleepChartHelper();

    private SleepChartHelper() {
    }

    private final Integer getMaxValue(List<Integer> values) {
        if (ArrayUtils.isEmpty(values)) {
            return 0;
        }
        Collections.sort(values);
        return values.get(values.size() - 1);
    }

    @NotNull
    public final List<SegmentBarEntry> createEntriesFromRecordMap(@NotNull LocalDate endLocalDate, @NotNull LocalDate startLocalDate, @NotNull Map<Long, TimesDataRecordInt> recordMap, @NotNull r02 attrs, boolean isWeek) {
        Intrinsics.checkNotNullParameter(endLocalDate, "endLocalDate");
        Intrinsics.checkNotNullParameter(startLocalDate, "startLocalDate");
        Intrinsics.checkNotNullParameter(recordMap, "recordMap");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        ArrayList arrayList = new ArrayList();
        while (!endLocalDate.isBefore(startLocalDate)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(endLocalDate);
            TimesDataRecordInt timesDataRecordInt = recordMap.get(Long.valueOf(jChangZeroOfTheDay));
            List<Integer> integerList = timesDataRecordInt != null ? ArrayUtils.toIntegerList(timesDataRecordInt.getValueArray()) : new ArrayList<>();
            SegmentBarEntry.Companion companion = SegmentBarEntry.INSTANCE;
            int i = attrs.T0;
            SegmentBarEntry segmentBarEntry = new SegmentBarEntry(companion.getRectModels(10, integerList, i, i), 10);
            int monthBarEntryType2 = isWeek ? 4 : RecyclerBarEntry.INSTANCE.getMonthBarEntryType2(attrs, endLocalDate);
            segmentBarEntry.timestamp = jChangZeroOfTheDay;
            segmentBarEntry.localDate = endLocalDate;
            segmentBarEntry.type = monthBarEntryType2;
            Integer maxValue = getMaxValue(integerList);
            Intrinsics.checkNotNull(maxValue);
            segmentBarEntry.setY(maxValue.intValue());
            arrayList.add(segmentBarEntry);
            endLocalDate = endLocalDate.minusDays(1);
        }
        return arrayList;
    }
}
