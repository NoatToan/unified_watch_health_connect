package com.xiaomi.fitness.util;

import android.content.Context;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStressReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.chart.entrys.StressEntry;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.stress.StressDayWeekMonthItemFragment;
import com.xiaomi.fitness.repo.RepositoryManager;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.util.StressDataUtil;
import defpackage.c0j;
import defpackage.hrl;
import defpackage.iji;
import defpackage.ou6;
import defpackage.q2h;
import defpackage.qpo;
import defpackage.r02;
import defpackage.sko;
import defpackage.uz6;
import defpackage.x44;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u00022\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010'J#\u0010+\u001a\b\u0012\u0004\u0012\u00020)0(2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002¢\u0006\u0004\b+\u0010,J%\u0010.\u001a\u00020\u00022\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u000e2\u0006\u0010-\u001a\u00020\u0002H\u0002¢\u0006\u0004\b.\u0010/J#\u00101\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u00100\u001a\u00020\u0002¢\u0006\u0004\b1\u00102J#\u00106\u001a\b\u0012\u0004\u0012\u0002050\u000e2\u0006\u00104\u001a\u0002032\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b8\u0010\nJ'\u0010<\u001a\u00020\u0002\"\n\b\u0000\u0010:*\u0004\u0018\u0001092\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b<\u0010\u0011J'\u0010=\u001a\u00020\u0002\"\n\b\u0000\u0010:*\u0004\u0018\u0001092\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b=\u0010\u0011J%\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u000e2\u0006\u00104\u001a\u0002032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b?\u00107J9\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e2\b\u0010@\u001a\u0004\u0018\u00010\u00122\u0006\u0010A\u001a\u00020\u00142\u0006\u0010B\u001a\u00020\u00022\b\u0010D\u001a\u0004\u0018\u00010CH\u0007¢\u0006\u0004\bE\u0010FJ;\u0010H\u001a\b\u0012\u0004\u0012\u00020)0\u000e2\b\u0010@\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010B\u001a\u00020\u00022\b\u0010G\u001a\u0004\u0018\u00010CH\u0007¢\u0006\u0004\bH\u0010FJ\u0017\u0010J\u001a\u00020\u00042\b\u0010I\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bJ\u0010KR\u0011\u0010N\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006Q"}, d2 = {"Lcom/xiaomi/fitness/util/StressDataUtil;", "", "", "pressType", "", "getStressTypeName", "(I)Ljava/lang/String;", "stressValue", "getStressTypeNameAsValue", "getStressTypeDefault", "(I)I", "", "getStressTypeIfAbnormal", "(I)Z", "", Constants.KEY_RECHARGE_VALUES, "coverValuesToStressRange", "(Ljava/util/List;)I", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;", "report", "Lr02;", "attrs", "Lcom/xiaomi/fitness/chart/entrys/SegmentBarEntry;", "fillDaySegmentBarEntry", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;Lr02;)Ljava/util/List;", "isWeek", "fillWeekMonthSegmentBarEntry", "(Lr02;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;Z)Ljava/util/List;", "", "valueArray", "removeZeroValue", "([I)Ljava/util/List;", "Lsko;", "createStressScaleList", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;)Ljava/util/List;", "value", "sumValue", "", "percentage", "(II)F", "", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "data", "replaceZerosWithArithmeticSequence", "(Ljava/util/List;)Ljava/util/List;", StatConstants.PARAM_START, "findNextNonZeroIndex", "(Ljava/util/List;I)I", "displayNumber", "createDayEntriesHome", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;I)Ljava/util/List;", "Landroid/content/Context;", "context", "Luz6;", "createDistributeModelList", "(Landroid/content/Context;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;)Ljava/util/List;", "getStressStageIndexByValue", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "T", "barEntries", "getValidEntry", "getValidEntryReverse", "Lqpo;", "createSummaryViewModelList", "stressReport", "mBarChartAttrs", "fragmentPosition", "Lorg/joda/time/LocalDate;", "localDate", "getBarChartEntries", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStressReport;Lr02;ILorg/joda/time/LocalDate;)Ljava/util/List;", "localDates", "getFaceBarChartEntries", "index", "getStressAdviceByStressStageIndex", "(Ljava/lang/Integer;)Ljava/lang/String;", "getDeviceType", "()I", "deviceType", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nStressDataUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StressDataUtil.kt\ncom/xiaomi/fitness/util/StressDataUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,627:1\n1863#2,2:628\n1485#2:630\n1510#2,3:631\n1513#2,3:641\n1246#2,4:646\n2669#2,7:657\n381#3,7:634\n462#3:644\n412#3:645\n535#3:650\n520#3,6:651\n*S KotlinDebug\n*F\n+ 1 StressDataUtil.kt\ncom/xiaomi/fitness/util/StressDataUtil\n*L\n398#1:628,2\n404#1:630\n404#1:631,3\n404#1:641,3\n404#1:646,4\n415#1:657,7\n404#1:634,7\n404#1:644\n404#1:645\n409#1:650\n409#1:651,6\n*E\n"})
public final class StressDataUtil {

    @NotNull
    public static final StressDataUtil INSTANCE = new StressDataUtil();

    private StressDataUtil() {
    }

    private final int coverValuesToStressRange(List<Integer> values) {
        List<Integer> list = values;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = removeZeroValue(CollectionsKt___CollectionsKt.toIntArray(list)).iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(StressEntry.INSTANCE.getStressType(((Number) it.next()).intValue(), INSTANCE.getDeviceType())));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : arrayList) {
                Integer numValueOf = Integer.valueOf(((Number) obj).intValue());
                Object arrayList2 = linkedHashMap.get(numValueOf);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(numValueOf, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry.getKey(), Integer.valueOf(((List) entry.getValue()).size()));
            }
            Integer num = (Integer) CollectionsKt___CollectionsKt.maxOrNull((Iterable) linkedHashMap2.values());
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                int iIntValue = ((Number) entry2.getValue()).intValue();
                if (num != null && iIntValue == num.intValue()) {
                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                }
            }
            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) linkedHashMap3.keySet());
            if (num != null) {
                if (mutableList.size() <= 1) {
                    return ((Number) mutableList.get(0)).intValue();
                }
                Iterator<T> it2 = values.iterator();
                if (!it2.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next = it2.next();
                while (it2.hasNext()) {
                    next = Integer.valueOf(((Number) next).intValue() + ((Number) it2.next()).intValue());
                }
                return StressEntry.INSTANCE.getStressType(((Number) next).intValue() / values.size(), getDeviceType());
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int createDistributeModelList$lambda$0(Map.Entry entry, Map.Entry entry2) {
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        Intrinsics.checkNotNullParameter(entry2, "<destruct>");
        return Float.compare(((Number) entry2.getValue()).floatValue(), ((Number) entry.getValue()).floatValue());
    }

    private final List<sko> createStressScaleList(DailyStressReport report) {
        ArrayList arrayList = new ArrayList();
        if (report.getDurationRelaxStress() != 0) {
            arrayList.add(new sko(3, report.getDurationRelaxStress()));
        }
        if (report.getDurationLightStress() != 0) {
            arrayList.add(new sko(2, report.getDurationLightStress()));
        }
        if (report.getDurationMediumStress() != 0) {
            arrayList.add(new sko(1, report.getDurationMediumStress()));
        }
        if (report.getDurationHeavyStress() != 0) {
            arrayList.add(new sko(0, report.getDurationHeavyStress()));
        }
        return arrayList;
    }

    private final List<SegmentBarEntry> fillDaySegmentBarEntry(DailyStressReport report, r02 attrs) {
        long j;
        long j2;
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        LocalDate localDatePlusDays = localDateTimestampToLocalDate.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        int i = attrs.c;
        long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        HashMap map = new HashMap();
        int i2 = 0;
        while (true) {
            j = RepositoryManager.GAP_X_MINUTE;
            if (i2 >= i) {
                break;
            }
            long j3 = jChangZeroOfTheDay2 + RepositoryManager.GAP_X_MINUTE;
            map.put(Long.valueOf(jChangZeroOfTheDay2), new ArrayList());
            i2++;
            jChangZeroOfTheDay2 = j3;
        }
        for (TimesDataRecordInt timesDataRecordInt : report.getStressRecords()) {
            long time = timesDataRecordInt.getTime();
            int[] valueArray = timesDataRecordInt.getValueArray();
            List list = (List) map.get(Long.valueOf(time));
            if (list != null) {
                list.addAll(removeZeroValue(valueArray));
            }
        }
        int iA = x44.a(iji.n3);
        long j4 = jChangZeroOfTheDay;
        int i3 = 0;
        while (i3 < i) {
            long j5 = j4 - j;
            List list2 = (List) map.get(Long.valueOf(j5));
            if (list2 == null) {
                j2 = j4;
            } else {
                SegmentBarEntry segmentBarEntry = new SegmentBarEntry((List<hrl>) CollectionsKt___CollectionsKt.toMutableList((Collection) SegmentBarEntry.INSTANCE.getRectModels(5, CollectionsKt___CollectionsKt.toList(list2), iA, iA)), 5);
                int dayBarEntryType = RecyclerBarEntry.INSTANCE.getDayBarEntryType(attrs, j5, j4);
                j2 = j5;
                segmentBarEntry.timestamp = j2;
                segmentBarEntry.localDate = localDateTimestampToLocalDate;
                segmentBarEntry.type = dayBarEntryType;
                segmentBarEntry.setMaxValue(ArrayUtils.getMaxValueInArray(list2));
                segmentBarEntry.setMinValue(ArrayUtils.getMinValueInArray(list2));
                segmentBarEntry.setY(segmentBarEntry.getMaxValue());
                Logger.d("StressDataUtil", "getBarChartEntries timestamp = " + segmentBarEntry.timestamp + " getMaxValue = " + segmentBarEntry.getMaxValue() + " getMinValue =  " + segmentBarEntry.getMinValue() + " getY =  " + segmentBarEntry.getY());
                arrayList.add(segmentBarEntry);
            }
            i3++;
            localDateTimestampToLocalDate = localDateTimestampToLocalDate;
            iA = iA;
            j = RepositoryManager.GAP_X_MINUTE;
            j4 = j2;
        }
        return arrayList;
    }

    private final List<SegmentBarEntry> fillWeekMonthSegmentBarEntry(r02 attrs, DailyStressReport report, boolean isWeek) {
        LocalDate firstDayOfMonth;
        LocalDate localDatePlusMonths;
        int monthBarEntryType2;
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        if (isWeek) {
            firstDayOfMonth = TimeDateUtil.getWeekMonday(localDateTimestampToLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusWeeks(1);
        } else {
            firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(localDateTimestampToLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusMonths(1);
        }
        HashMap map = new HashMap();
        for (TimesDataRecordInt timesDataRecordInt : report.getStressRecords()) {
            map.put(Long.valueOf(timesDataRecordInt.getTime()), ArrayUtils.toIntegerList(timesDataRecordInt.getValueArray()));
        }
        ArrayList arrayList = new ArrayList();
        int iA = x44.a(iji.n3);
        int i = 0;
        for (LocalDate localDateMinusDays = localDatePlusMonths.minusDays(1); !localDateMinusDays.isBefore(firstDayOfMonth); localDateMinusDays = localDateMinusDays.minusDays(1)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusDays);
            List<Integer> listEmptyList = (List) map.get(Long.valueOf(jChangZeroOfTheDay));
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            SegmentBarEntry segmentBarEntry = new SegmentBarEntry((List<hrl>) CollectionsKt___CollectionsKt.toMutableList((Collection) SegmentBarEntry.INSTANCE.getRectModels(5, listEmptyList, iA, iA)), 5);
            RecyclerBarEntry.Companion companion = RecyclerBarEntry.INSTANCE;
            if (isWeek) {
                monthBarEntryType2 = companion.getWeekBarEntryType(localDateMinusDays);
            } else {
                Intrinsics.checkNotNull(attrs);
                monthBarEntryType2 = companion.getMonthBarEntryType2(attrs, localDateMinusDays);
            }
            segmentBarEntry.timestamp = jChangZeroOfTheDay;
            segmentBarEntry.localDate = localDateMinusDays;
            segmentBarEntry.type = monthBarEntryType2;
            segmentBarEntry.setX(i);
            segmentBarEntry.setY(segmentBarEntry.getMaxValue());
            arrayList.add(segmentBarEntry);
            i++;
        }
        return arrayList;
    }

    private final int findNextNonZeroIndex(List<? extends MaxMinEntry> data, int start) {
        int size = data.size();
        while (start < size) {
            if (data.get(start).getY() != 0.0f) {
                return start;
            }
            start++;
        }
        return -1;
    }

    @JvmStatic
    public static final int getStressTypeDefault(int stressValue) {
        return StressEntry.INSTANCE.getStressType(stressValue, INSTANCE.getDeviceType());
    }

    @JvmStatic
    public static final boolean getStressTypeIfAbnormal(int stressValue) {
        int stressType = StressEntry.INSTANCE.getStressType(stressValue, INSTANCE.getDeviceType());
        return stressType == 0 || stressType == 1;
    }

    private final String getStressTypeName(int pressType) {
        String string;
        Context baseContext = AppUtil.getApp().getBaseContext();
        if (getDeviceType() == 1) {
            if (pressType == 0) {
                string = baseContext.getString(c0j.Il);
            } else if (pressType == 1) {
                string = baseContext.getString(c0j.Dl);
            } else if (pressType != 2) {
                string = pressType != 3 ? baseContext.getString(c0j.Fl) : baseContext.getString(c0j.Fl);
            } else {
                string = baseContext.getString(c0j.Bl);
            }
            Intrinsics.checkNotNull(string);
        } else {
            if (pressType == 0) {
                string = baseContext.getString(c0j.Hl);
            } else if (pressType == 1) {
                string = baseContext.getString(c0j.Cl);
            } else if (pressType != 2) {
                string = pressType != 3 ? baseContext.getString(c0j.El) : baseContext.getString(c0j.El);
            } else {
                string = baseContext.getString(c0j.Al);
            }
            Intrinsics.checkNotNull(string);
        }
        return string;
    }

    @JvmStatic
    @NotNull
    public static final String getStressTypeNameAsValue(int stressValue) {
        StressEntry.Companion companion = StressEntry.INSTANCE;
        StressDataUtil stressDataUtil = INSTANCE;
        return stressDataUtil.getStressTypeName(companion.getStressType(stressValue, stressDataUtil.getDeviceType()));
    }

    private final float percentage(int value, int sumValue) {
        if (sumValue == 0) {
            return 0.0f;
        }
        return q2h.a(Float.valueOf((value * 100) / sumValue), 1);
    }

    private final List<Integer> removeZeroValue(int[] valueArray) {
        ArrayList arrayList = new ArrayList();
        if (valueArray != null) {
            for (int i : valueArray) {
                if (1 <= i && i < 101) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
        }
        return arrayList;
    }

    private final List<MaxMinEntry> replaceZerosWithArithmeticSequence(List<MaxMinEntry> data) {
        int iFindNextNonZeroIndex;
        int size = data.size();
        float y = 0.0f;
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            if (data.get(i2).getY() != 0.0f) {
                if (i != -1 && (iFindNextNonZeroIndex = findNextNonZeroIndex(data, i2)) != -1) {
                    float y2 = (data.get(iFindNextNonZeroIndex).getY() - y) / (iFindNextNonZeroIndex - i);
                    for (int i3 = i + 1; i3 < iFindNextNonZeroIndex; i3++) {
                        data.get(i3).setY((Math.abs(i3 - i) * y2) + y);
                        data.get(i3).setNeedShowIcon(false);
                    }
                }
                y = data.get(i2).getY();
                i = i2;
            }
        }
        return data;
    }

    @NotNull
    public final List<SegmentBarEntry> createDayEntriesHome(@NotNull DailyStressReport report, int displayNumber) {
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        LocalDate localDatePlusDays = localDateTimestampToLocalDate.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        HashMap map = new HashMap();
        int i = 0;
        while (i < displayNumber) {
            long j = TimeDateUtil.TIME_HOUR + jChangZeroOfTheDay;
            map.put(Long.valueOf(jChangZeroOfTheDay), new ArrayList());
            i++;
            jChangZeroOfTheDay = j;
        }
        for (TimesDataRecordInt timesDataRecordInt : report.getStressRecords()) {
            long time = timesDataRecordInt.getTime();
            int[] valueArray = timesDataRecordInt.getValueArray();
            List list = (List) map.get(Long.valueOf(time));
            if (list != null) {
                list.addAll(ArrayUtils.toIntegerList(valueArray));
            }
        }
        int iA = x44.a(iji.n3);
        long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        for (int i2 = 0; i2 < displayNumber; i2++) {
            List<Integer> list2 = (List) map.get(Long.valueOf(jChangZeroOfTheDay2));
            if (list2 != null) {
                SegmentBarEntry segmentBarEntry = new SegmentBarEntry(SegmentBarEntry.INSTANCE.getRectModels(5, list2, iA, iA), 5);
                segmentBarEntry.timestamp = jChangZeroOfTheDay2;
                segmentBarEntry.localDate = localDateTimestampToLocalDate;
                segmentBarEntry.type = 3;
                segmentBarEntry.setX(i2);
                segmentBarEntry.setY(segmentBarEntry.getMaxValue());
                arrayList.add(segmentBarEntry);
                jChangZeroOfTheDay2 += TimeDateUtil.TIME_HOUR;
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<uz6> createDistributeModelList(@NotNull Context context, @NotNull DailyStressReport report) {
        String string;
        Context context2 = context;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(report, "report");
        LinkedList linkedList = new LinkedList();
        List<sko> listCreateStressScaleList = createStressScaleList(report);
        int i = report.totalStressDuration();
        if (i == 0) {
            return linkedList;
        }
        int size = listCreateStressScaleList.size();
        float[] fArr = new float[size];
        int[] iArr = new int[size];
        float[] fArr2 = new float[size];
        HashMap map = new HashMap();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            float fPercentage = percentage(listCreateStressScaleList.get(i4).f33743b, i);
            fArr[i4] = fPercentage;
            float f = 100;
            int i5 = (int) ((fPercentage * f) / f);
            iArr[i4] = i5;
            i3 += i5;
            fArr2[i4] = q2h.a(Float.valueOf(fPercentage - i5), 1);
            map.put(Integer.valueOf(i4), Float.valueOf(fArr2[i4]));
        }
        int i6 = 100 - i3;
        if (i6 > 0 && i6 <= size) {
            Comparator comparator = new Comparator() { // from class: ujo
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return StressDataUtil.createDistributeModelList$lambda$0((Map.Entry) obj, (Map.Entry) obj2);
                }
            };
            ArrayList arrayList = new ArrayList(map.entrySet());
            Collections.sort(arrayList, comparator);
            Iterator it = arrayList.subList(0, i6).iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) ((Map.Entry) it.next()).getKey()).intValue();
                iArr[iIntValue] = iArr[iIntValue] + 1;
            }
        }
        while (i2 < size) {
            sko skoVar = listCreateStressScaleList.get(i2);
            int iC = skoVar.c();
            int iA = x44.a(skoVar.b());
            String string2 = context2.getString(skoVar.d());
            if (AppUtil.isRTLDirection()) {
                string = iArr[i2] + "%";
            } else {
                string = context2.getString(c0j.common_percent_join_str, Integer.valueOf(iArr[i2]));
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            linkedList.add(new uz6(iC, iA, string2 + " " + string, 4, iArr[i2], true, TimeUnit.MINUTES.toMillis(skoVar.f33743b)));
            i2++;
            context2 = context;
        }
        return linkedList;
    }

    @NotNull
    public final List<qpo> createSummaryViewModelList(@NotNull Context context, @Nullable DailyStressReport report) {
        Intrinsics.checkNotNullParameter(context, "context");
        LinkedList linkedList = new LinkedList();
        if (report == null) {
            return linkedList;
        }
        int avgStress = report.getAvgStress();
        int maxStress = report.getMaxStress();
        int minStress = report.getMinStress();
        if (maxStress > 0) {
            linkedList.add(new qpo(context.getString(c0j.Kl), String.valueOf(maxStress), ""));
        }
        if (minStress > 0) {
            linkedList.add(new qpo(context.getString(c0j.Ll), String.valueOf(minStress), ""));
        }
        if (avgStress > 0) {
            linkedList.add(new qpo(context.getString(c0j.Jl), String.valueOf(avgStress), ""));
        }
        return linkedList;
    }

    @NotNull
    public final List<SegmentBarEntry> getBarChartEntries(@Nullable DailyStressReport stressReport, @NotNull r02 mBarChartAttrs, int fragmentPosition, @Nullable LocalDate localDate) {
        Intrinsics.checkNotNullParameter(mBarChartAttrs, "mBarChartAttrs");
        if (stressReport == null) {
            Intrinsics.checkNotNull(localDate);
            stressReport = new DailyStressReport(TimeDateUtil.changZeroOfTheDay(localDate), BarChartRecyclerHelper.INSTANCE.getViewTag(fragmentPosition), "");
        }
        if (fragmentPosition == 0) {
            return fillDaySegmentBarEntry(stressReport, mBarChartAttrs);
        }
        return fillWeekMonthSegmentBarEntry(mBarChartAttrs, stressReport, fragmentPosition == 1);
    }

    public final int getDeviceType() {
        return ou6.a() ? 1 : 0;
    }

    @NotNull
    public final List<MaxMinEntry> getFaceBarChartEntries(@Nullable DailyStressReport stressReport, @Nullable r02 attrs, int fragmentPosition, @Nullable LocalDate localDates) {
        DailyStressReport dailyStressReport;
        int i;
        if (stressReport == null) {
            Intrinsics.checkNotNull(localDates);
            dailyStressReport = new DailyStressReport(TimeDateUtil.changZeroOfTheDay(localDates), BarChartRecyclerHelper.INSTANCE.getViewTag(fragmentPosition), "");
        } else {
            dailyStressReport = stressReport;
        }
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(dailyStressReport.getTime());
        LocalDate localDatePlusDays = localDateTimestampToLocalDate.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        HashMap map = new HashMap();
        int i2 = 0;
        while (i2 < 48) {
            long j = jChangZeroOfTheDay2 + RepositoryManager.GAP_X_MINUTE;
            map.put(Long.valueOf(jChangZeroOfTheDay2), new ArrayList());
            i2++;
            jChangZeroOfTheDay2 = j;
        }
        for (TimesDataRecordInt timesDataRecordInt : dailyStressReport.getStressRecords()) {
            long time = timesDataRecordInt.getTime();
            int[] valueArray = timesDataRecordInt.getValueArray();
            List list = (List) map.get(Long.valueOf(time));
            if (list != null) {
                list.addAll(removeZeroValue(valueArray));
            }
        }
        Logger.i(StressDayWeekMonthItemFragment.TAG, " stress countMap " + map);
        List<MaxMinEntry> arrayList = new ArrayList<>();
        int i3 = 0;
        while (i3 < 24) {
            long j2 = jChangZeroOfTheDay - TimeDateUtil.TIME_HOUR;
            long j3 = jChangZeroOfTheDay - RepositoryManager.GAP_X_MINUTE;
            ArrayList arrayList2 = new ArrayList();
            Collection collection = (Collection) map.get(Long.valueOf(j2));
            if (collection != null && !collection.isEmpty()) {
                Object obj = map.get(Long.valueOf(j2));
                Intrinsics.checkNotNull(obj);
                arrayList2.addAll(CollectionsKt___CollectionsKt.toMutableList((Collection) obj));
            }
            Collection collection2 = (Collection) map.get(Long.valueOf(j3));
            if (collection2 != null && !collection2.isEmpty()) {
                Object obj2 = map.get(Long.valueOf(j3));
                Intrinsics.checkNotNull(obj2);
                arrayList2.addAll(CollectionsKt___CollectionsKt.toMutableList((Collection) obj2));
            }
            int iCoverValuesToStressRange = coverValuesToStressRange(arrayList2);
            if (iCoverValuesToStressRange == 0) {
                i = 5;
            } else if (iCoverValuesToStressRange == 1) {
                i = 15;
            } else if (iCoverValuesToStressRange != 2) {
                i = iCoverValuesToStressRange != 3 ? 0 : 35;
            } else {
                i = 25;
            }
            arrayList.add(new MaxMinEntry(i3, i, j2, i3 % 2 != 0 ? 2 : 5));
            i3++;
            jChangZeroOfTheDay = j2;
        }
        Logger.i(StressDayWeekMonthItemFragment.TAG, " stress entries size " + arrayList);
        return replaceZerosWithArithmeticSequence(arrayList);
    }

    @NotNull
    public final String getStressAdviceByStressStageIndex(@Nullable Integer index) {
        int i;
        if (index != null && index.intValue() == 0) {
            i = c0j.Hn;
        } else if (index != null && index.intValue() == 1) {
            i = c0j.Fn;
        } else if (index != null && index.intValue() == 2) {
            i = c0j.Gn;
        } else {
            i = (index != null && index.intValue() == 3) ? c0j.In : c0j.En;
        }
        return ExtUtilKt.getString(i);
    }

    public final int getStressStageIndexByValue(int stressValue) {
        if (getDeviceType() == 1) {
            if (stressValue <= 79) {
                if (stressValue <= 59) {
                    if (stressValue <= 39) {
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }
        if (stressValue <= 80) {
            if (stressValue <= 50) {
                if (stressValue <= 25) {
                    return 3;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public final <T extends RecyclerBarEntry> int getValidEntry(@NotNull List<? extends T> barEntries) {
        T t;
        Intrinsics.checkNotNullParameter(barEntries, "barEntries");
        int size = barEntries.size();
        do {
            size--;
            if (-1 >= size) {
                return 0;
            }
            t = barEntries.get(size);
            Intrinsics.checkNotNull(t);
        } while (t.getY() <= 0.0f);
        return (int) t.getY();
    }

    public final <T extends RecyclerBarEntry> int getValidEntryReverse(@NotNull List<? extends T> barEntries) {
        Intrinsics.checkNotNullParameter(barEntries, "barEntries");
        int size = barEntries.size();
        for (int i = 0; i < size; i++) {
            T t = barEntries.get(i);
            Intrinsics.checkNotNull(t);
            if (t.getY() > 0.0f) {
                return (int) t.getY();
            }
        }
        return 0;
    }
}
