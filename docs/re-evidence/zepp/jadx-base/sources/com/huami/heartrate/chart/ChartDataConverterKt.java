package com.huami.heartrate.chart;

import com.huami.bigdata.statistics.heartrate.HeartRateDateData;
import com.huami.heartrate.dto.BarDto;
import com.huami.heartrate.koin.KoinExtKt;
import com.huami.heartrate.utils.HeartRateTimeUtils;
import com.huami.heartrate.utils.HeartRateTimeUtilsKt;
import com.huami.heartrate.vo.BarChartVo;
import com.huami.hmdateformat.date.HMDataFormatKt;
import com.huami.hmdateformat.date.HMPattern;
import com.huami.sleep.statistic.sleepanalysis.ui.SleepAnalysisFragment;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.g;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a(\u0010\r\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b\u001a\f\u0010\u000f\u001a\u00020\u000e*\u00020\u000bH\u0002\u001a\f\u0010\u0010\u001a\u00020\u000e*\u00020\u000bH\u0002\u001a\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000*\b\u0012\u0004\u0012\u00020\u00110\u00002\u0006\u0010\n\u001a\u00020\u0006¨\u0006\u0013"}, d2 = {"", "Lcom/huami/heartrate/dto/BarDto;", "Lcom/huami/heartrate/vo/BarChartVo;", "toWeekBarChartDataList", "toMonthBarChartDataList", "toYearBarChartDataList", "", "index", "", "heartRatePair", SleepAnalysisFragment.TIME_MODE, "", "timestamp", "toBarChartVo", "", "b", "a", "Lcom/huami/bigdata/statistics/heartrate/HeartRateDateData;", "toBarDtoList", "heartrate_release"}, k = 2, mv = {1, 5, 1})
public final class ChartDataConverterKt {
    private static final String a(long j) {
        return HMDataFormatKt.getFormatTime$default(j, HMPattern.YEAR_ABBR_MONTH, (Locale) null, 2, (Object) null);
    }

    private static final String b(long j) {
        return HMDataFormatKt.getFormatTime$default(j, HeartRateTimeUtilsKt.isInSameYear(j, System.currentTimeMillis()) ? HMPattern.ABBR_MONTH_DAY : HMPattern.YEAR_ABBR_MONTH_DAY, (Locale) null, 2, (Object) null);
    }

    @NotNull
    public static final BarChartVo toBarChartVo(int i, @Nullable int[] iArr, int i2, long j) {
        String strB;
        switch (i2) {
            case 17:
                strB = b(j);
                break;
            case 18:
                strB = b(j);
                break;
            case 19:
                strB = a(j);
                break;
            default:
                strB = "";
                break;
        }
        return new BarChartVo(i, iArr, strB);
    }

    @NotNull
    public static final List<BarDto> toBarDtoList(@NotNull List<HeartRateDateData> list, int i) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (HeartRateDateData heartRateDateData : list) {
            arrayList.add(new BarDto(heartRateDateData.getValues(), i == 19 ? HeartRateTimeUtils.INSTANCE.yMToTimestamp(heartRateDateData.getDate()) : HeartRateTimeUtils.INSTANCE.yMDToTimestamp(heartRateDateData.getDate())));
        }
        return arrayList;
    }

    @NotNull
    public static final List<BarChartVo> toMonthBarChartDataList(@NotNull List<BarDto> list) {
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (BarDto barDto : list) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(barDto.getTimeStamp());
            arrayList2.add(Boolean.valueOf(arrayList.add(toBarChartVo(calendar.get(5), barDto.getHeartRange(), 18, barDto.getTimeStamp()))));
        }
        if (KoinExtKt.isHollywood()) {
            return arrayList;
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(((BarDto) CollectionsKt.first((List) list)).getTimeStamp());
        calendar2.set(5, calendar2.getActualMinimum(5));
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTimeInMillis(((BarDto) CollectionsKt.first((List) list)).getTimeStamp());
        calendar3.set(5, calendar3.getActualMaximum(5));
        int i = calendar3.get(5);
        long timeInMillis = calendar2.getTimeInMillis();
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Integer.valueOf(((BarChartVo) it2.next()).getIndex()));
        }
        HashSet hashSet = CollectionsKt___CollectionsKt.toHashSet(arrayList3);
        if (1 <= i) {
            int i2 = 1;
            while (true) {
                int i3 = i2 + 1;
                if (!hashSet.contains(Integer.valueOf(i2))) {
                    Calendar calendar4 = Calendar.getInstance();
                    calendar4.setTimeInMillis(timeInMillis);
                    calendar4.add(6, i2 - 1);
                    Unit unit = Unit.INSTANCE;
                    arrayList.add(toBarChartVo(i2, null, 18, calendar4.getTimeInMillis()));
                }
                if (i2 == i) {
                    break;
                }
                i2 = i3;
            }
        }
        if (arrayList.size() > 1) {
            g.sortWith(arrayList, new Comparator() { // from class: com.huami.heartrate.chart.ChartDataConverterKt$toMonthBarChartDataList$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((BarChartVo) t).getIndex()), Integer.valueOf(((BarChartVo) t2).getIndex()));
                }
            });
        }
        return arrayList;
    }

    @NotNull
    public static final List<BarChartVo> toWeekBarChartDataList(@NotNull List<BarDto> list) {
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (true) {
            int i = 7;
            if (!it2.hasNext()) {
                break;
            }
            BarDto barDto = (BarDto) it2.next();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(barDto.getTimeStamp());
            int i2 = calendar.get(7) - 1;
            if (i2 != 0) {
                i = i2;
            }
            arrayList2.add(Boolean.valueOf(arrayList.add(toBarChartVo(i, barDto.getHeartRange(), 17, barDto.getTimeStamp()))));
        }
        if (KoinExtKt.isHollywood()) {
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Integer.valueOf(((BarChartVo) it3.next()).getIndex()));
        }
        HashSet hashSet = CollectionsKt___CollectionsKt.toHashSet(arrayList3);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(((BarDto) CollectionsKt.first((List) list)).getTimeStamp());
        calendar2.set(7, 1);
        long timeInMillis = calendar2.getTimeInMillis();
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            if (!hashSet.contains(Integer.valueOf(i3))) {
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTimeInMillis(timeInMillis);
                calendar3.add(6, i3);
                Unit unit = Unit.INSTANCE;
                arrayList.add(toBarChartVo(i3, null, 17, calendar3.getTimeInMillis()));
            }
            if (i4 > 7) {
                break;
            }
            i3 = i4;
        }
        if (arrayList.size() > 1) {
            g.sortWith(arrayList, new Comparator() { // from class: com.huami.heartrate.chart.ChartDataConverterKt$toWeekBarChartDataList$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((BarChartVo) t).getIndex()), Integer.valueOf(((BarChartVo) t2).getIndex()));
                }
            });
        }
        return arrayList;
    }

    @NotNull
    public static final List<BarChartVo> toYearBarChartDataList(@NotNull List<BarDto> list) {
        ArrayList arrayList = new ArrayList();
        if (list.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (BarDto barDto : list) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(barDto.getTimeStamp());
            arrayList2.add(Boolean.valueOf(arrayList.add(toBarChartVo(calendar.get(2) + 1, barDto.getHeartRange(), 19, barDto.getTimeStamp()))));
        }
        if (KoinExtKt.isHollywood()) {
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Integer.valueOf(((BarChartVo) it2.next()).getIndex()));
        }
        HashSet hashSet = CollectionsKt___CollectionsKt.toHashSet(arrayList3);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(((BarDto) CollectionsKt.first((List) list)).getTimeStamp());
        calendar2.set(2, 0);
        long timeInMillis = calendar2.getTimeInMillis();
        int i = 1;
        while (true) {
            int i2 = i + 1;
            if (!hashSet.contains(Integer.valueOf(i))) {
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTimeInMillis(timeInMillis);
                calendar3.add(2, i - 1);
                Unit unit = Unit.INSTANCE;
                arrayList.add(toBarChartVo(i, null, 19, calendar3.getTimeInMillis()));
            }
            if (i2 > 12) {
                break;
            }
            i = i2;
        }
        if (arrayList.size() > 1) {
            g.sortWith(arrayList, new Comparator() { // from class: com.huami.heartrate.chart.ChartDataConverterKt$toYearBarChartDataList$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((BarChartVo) t).getIndex()), Integer.valueOf(((BarChartVo) t2).getIndex()));
                }
            });
        }
        return arrayList;
    }
}
