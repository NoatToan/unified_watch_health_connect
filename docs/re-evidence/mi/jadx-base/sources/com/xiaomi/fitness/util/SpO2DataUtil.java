package com.xiaomi.fitness.util;

import android.content.Context;
import com.xiaomi.fit.fitness.export.data.aggregation.DailySpo2Report;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.SegmentItem;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.chart.entrys.SegmentBarEntry;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.repo.RepositoryManager;
import defpackage.c0j;
import defpackage.iji;
import defpackage.qpo;
import defpackage.qxi;
import defpackage.r02;
import defpackage.x44;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/util/SpO2DataUtil;", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;", "report", "", "displayNumber", "", "Lcom/xiaomi/fitness/chart/entrys/SegmentBarEntry;", "createDayEntriesHome", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;I)Ljava/util/List;", "Lr02;", "attrs", "fillDaySegmentBarEntries", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;Lr02;)Ljava/util/List;", "", "isWeek", "fillWeekMonthSegmentBarEntries", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;Lr02;Z)Ljava/util/List;", "", "data", "convertToIntegerListAndFilterZero", "([I)Ljava/util/List;", "Landroid/content/Context;", "context", "Lqpo;", "createSummaryViewModel", "(Landroid/content/Context;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailySpo2Report;)Ljava/util/List;", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSpO2DataUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpO2DataUtil.kt\ncom/xiaomi/fitness/util/SpO2DataUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,245:1\n1863#2,2:246\n*S KotlinDebug\n*F\n+ 1 SpO2DataUtil.kt\ncom/xiaomi/fitness/util/SpO2DataUtil\n*L\n142#1:246,2\n*E\n"})
public final class SpO2DataUtil {

    @NotNull
    public static final SpO2DataUtil INSTANCE = new SpO2DataUtil();

    @NotNull
    private static final String TAG = "SpO2DataUtil";

    private SpO2DataUtil() {
    }

    @NotNull
    public final List<Integer> convertToIntegerListAndFilterZero(@Nullable int[] data) {
        ArrayList arrayList = new ArrayList();
        if (data == null) {
            return arrayList;
        }
        for (int i : data) {
            if (i > 0) {
                ListExtKt.add(arrayList, Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<SegmentBarEntry> createDayEntriesHome(@NotNull DailySpo2Report report, int displayNumber) {
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        HashMap map = new HashMap();
        int i = 0;
        while (i < displayNumber) {
            long j = TimeDateUtil.TIME_HOUR + jChangZeroOfTheDay;
            map.put(Long.valueOf(jChangZeroOfTheDay), new ArrayList());
            i++;
            jChangZeroOfTheDay = j;
        }
        for (TimesDataRecordInt timesDataRecordInt : report.getSpo2Records()) {
            long time = timesDataRecordInt.getTime();
            int[] valueArray = timesDataRecordInt.getValueArray();
            List list = (List) map.get(Long.valueOf(time));
            if (list != null) {
                list.addAll(convertToIntegerListAndFilterZero(valueArray));
            }
        }
        int iA = x44.a(iji.c3);
        long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        for (int i2 = 0; i2 < displayNumber; i2++) {
            List<Integer> list2 = (List) map.get(Long.valueOf(jChangZeroOfTheDay2));
            if (list2 != null) {
                SegmentBarEntry segmentBarEntry = new SegmentBarEntry(SegmentBarEntry.INSTANCE.getRectModels(1, list2, iA, iA), 1);
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
    public final List<qpo> createSummaryViewModel(@NotNull Context context, @NotNull DailySpo2Report report) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(report, "report");
        LinkedList linkedList = new LinkedList();
        if (report.getTime() == 0) {
            return linkedList;
        }
        int maxSpo2 = report.getMaxSpo2();
        if (maxSpo2 > 0) {
            int i = c0j.Yk;
            String tag = report.getTag();
            int iHashCode = tag.hashCode();
            if (iHashCode != -1068487181) {
                if (iHashCode != 3076183) {
                    if (iHashCode == 113008383 && tag.equals("weeks")) {
                        i = c0j.el;
                    }
                } else if (tag.equals("days")) {
                    i = c0j.Yk;
                }
            } else if (tag.equals("months")) {
                i = c0j.bl;
            }
            linkedList.add(new qpo(context.getString(i), String.valueOf(maxSpo2), "%"));
        }
        int minSpo2 = report.getMinSpo2();
        if (minSpo2 > 0) {
            int i2 = c0j.Zk;
            String tag2 = report.getTag();
            int iHashCode2 = tag2.hashCode();
            if (iHashCode2 != -1068487181) {
                if (iHashCode2 != 3076183) {
                    if (iHashCode2 == 113008383 && tag2.equals("weeks")) {
                        i2 = c0j.fl;
                    }
                } else if (tag2.equals("days")) {
                    i2 = c0j.Zk;
                }
            } else if (tag2.equals("months")) {
                i2 = c0j.cl;
            }
            linkedList.add(new qpo(context.getString(i2), String.valueOf(minSpo2), "%"));
        }
        int avgSpo2 = report.getAvgSpo2();
        if (avgSpo2 > 0) {
            int i3 = c0j.Xk;
            String tag3 = report.getTag();
            int iHashCode3 = tag3.hashCode();
            if (iHashCode3 != -1068487181) {
                if (iHashCode3 != 3076183) {
                    if (iHashCode3 == 113008383 && tag3.equals("weeks")) {
                        i3 = c0j.dl;
                    }
                } else if (tag3.equals("days")) {
                    i3 = c0j.Xk;
                }
            } else if (tag3.equals("months")) {
                i3 = c0j.al;
            }
            linkedList.add(new qpo(context.getString(i3), String.valueOf(avgSpo2), "%"));
        }
        List<SegmentItem> abnormalSpo2Records = report.getAbnormalSpo2Records();
        int size = abnormalSpo2Records != null ? abnormalSpo2Records.size() : 0;
        if (size > 0) {
            linkedList.add(new qpo(context.getString(c0j.Uk), String.valueOf(size), context.getResources().getQuantityString(qxi.common_unit_time, size)));
        }
        return linkedList;
    }

    @NotNull
    public final List<SegmentBarEntry> fillDaySegmentBarEntries(@NotNull DailySpo2Report report, @NotNull r02 attrs) {
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        int i = 1;
        LocalDate localDatePlusDays = localDateTimestampToLocalDate.plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        int i2 = attrs.c;
        long jChangZeroOfTheDay2 = TimeDateUtil.changZeroOfTheDay(localDateTimestampToLocalDate);
        HashMap map = new HashMap();
        int i3 = 0;
        while (i3 < i2) {
            long j = RepositoryManager.GAP_X_MINUTE + jChangZeroOfTheDay2;
            map.put(Long.valueOf(jChangZeroOfTheDay2), new ArrayList());
            i3++;
            jChangZeroOfTheDay2 = j;
        }
        for (TimesDataRecordInt timesDataRecordInt : report.getSpo2Records()) {
            long time = timesDataRecordInt.getTime();
            int[] valueArray = timesDataRecordInt.getValueArray();
            List list = (List) map.get(Long.valueOf(time));
            if (list != null) {
                list.addAll(convertToIntegerListAndFilterZero(valueArray));
            }
        }
        int iA = x44.a(iji.k3);
        int i4 = 0;
        long j2 = jChangZeroOfTheDay;
        while (i4 < i2) {
            long j3 = j2 - RepositoryManager.GAP_X_MINUTE;
            List<Integer> list2 = (List) map.get(Long.valueOf(j3));
            if (list2 != null) {
                SegmentBarEntry segmentBarEntry = new SegmentBarEntry(SegmentBarEntry.INSTANCE.getRectModels(i, list2, iA, iA), i);
                int dayBarEntryType = RecyclerBarEntry.INSTANCE.getDayBarEntryType(attrs, j3, j2);
                segmentBarEntry.timestamp = j3;
                segmentBarEntry.localDate = localDateTimestampToLocalDate;
                segmentBarEntry.type = dayBarEntryType;
                segmentBarEntry.setY(segmentBarEntry.getMaxValue());
                arrayList.add(segmentBarEntry);
                j2 = j3;
            }
            i4++;
            i = 1;
        }
        return arrayList;
    }

    @NotNull
    public final List<SegmentBarEntry> fillWeekMonthSegmentBarEntries(@NotNull DailySpo2Report report, @NotNull r02 attrs, boolean isWeek) {
        LocalDate firstDayOfMonth;
        LocalDate localDatePlusMonths;
        Intrinsics.checkNotNullParameter(report, "report");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(report.getTime());
        if (isWeek) {
            firstDayOfMonth = TimeDateUtil.getWeekMonday(localDateTimestampToLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusWeeks(1);
        } else {
            firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(localDateTimestampToLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusMonths(1);
        }
        HashMap map = new HashMap();
        Iterator<T> it = report.getSpo2Records().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TimesDataRecordInt timesDataRecordInt = (TimesDataRecordInt) it.next();
            int[] valueArray = timesDataRecordInt.getValueArray();
            if (valueArray != null) {
                if (!(valueArray.length == 0)) {
                    map.put(Long.valueOf(timesDataRecordInt.getTime()), valueArray);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        int iA = x44.a(iji.k3);
        for (LocalDate localDateMinusDays = localDatePlusMonths.minusDays(1); !localDateMinusDays.isBefore(firstDayOfMonth); localDateMinusDays = localDateMinusDays.minusDays(1)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusDays);
            int[] iArr = (int[]) map.get(Long.valueOf(jChangZeroOfTheDay));
            if (iArr == null) {
                iArr = new int[0];
            }
            SegmentBarEntry segmentBarEntry = new SegmentBarEntry(SegmentBarEntry.INSTANCE.getRectModels(1, convertToIntegerListAndFilterZero(iArr), iA, iA), 1);
            RecyclerBarEntry.Companion companion = RecyclerBarEntry.INSTANCE;
            int weekBarEntryType = isWeek ? companion.getWeekBarEntryType(localDateMinusDays) : companion.getMonthBarEntryType2(attrs, localDateMinusDays);
            segmentBarEntry.timestamp = jChangZeroOfTheDay;
            segmentBarEntry.localDate = localDateMinusDays;
            segmentBarEntry.type = weekBarEntryType;
            segmentBarEntry.setY(segmentBarEntry.getMaxValue());
            arrayList.add(segmentBarEntry);
        }
        return arrayList;
    }
}
