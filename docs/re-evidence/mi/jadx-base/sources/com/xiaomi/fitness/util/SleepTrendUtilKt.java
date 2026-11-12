package com.xiaomi.fitness.util;

import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.chart.entrys.MaxMinEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.health.sleep.utils.SleepExtKt;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import com.xiaomi.fitness.repo.RepositoryManager;
import defpackage.vfe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\r\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u001d\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a3\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001a\u001a3\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u001b\u0010\u001a\u001a%\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0015\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#\u001a#\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0013¢\u0006\u0004\b&\u0010'\u001a\u001f\u0010*\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u0013H\u0002¢\u0006\u0004\b*\u0010+\"\u0014\u0010,\u001a\u00020!8\u0006X\u0086T¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "allDaySleepReport", "", "getAvgSleepEfficiency", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)F", "Lvfe;", "attrs", "", "isWeek", "", "Lcom/xiaomi/fitness/chart/entrys/MaxMinEntry;", "getSleepWmEfficiencyEntries", "(Lvfe;ZLcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)Ljava/util/List;", "checkIfLongSleepExist", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)Z", "Lcom/xiaomi/fitness/util/SleepTrendStaticsModel;", "getPeriodSleepBedTimeStaticsModel", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)Lcom/xiaomi/fitness/util/SleepTrendStaticsModel;", "getPeriodSleepWakeUpTimeStaticsModel", "", RealNameWebViewActivity.NUMBER, "ceil", "findNearestWholeHourInSec", "(IZ)I", "sleepTrendStaticsModel", "getSleepTrendBedTimeEntries", "(Lvfe;ZLcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;Lcom/xiaomi/fitness/util/SleepTrendStaticsModel;)Ljava/util/List;", "getSleepTrendWakeupTimeEntries", "diffAvg", "isBedTime", "getSleepRegularity", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;IZ)Z", "seconds", "", "secondsTo24HourTimeWithNegativeConverted", "(I)Ljava/lang/String;", "minInSec", "maxInSec", "getCustomLabelInSecList", "(II)Ljava/util/List;", "minInHour", "maxInHour", "getStepSize", "(II)F", "TAG", "Ljava/lang/String;", "health_chinaProductRelease"}, k = 2, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepTrendUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepTrendUtil.kt\ncom/xiaomi/fitness/util/SleepTrendUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,505:1\n1863#2,2:506\n1863#2,2:508\n1863#2,2:510\n1863#2,2:512\n1863#2,2:514\n1863#2,2:516\n1863#2,2:518\n1863#2,2:520\n*S KotlinDebug\n*F\n+ 1 SleepTrendUtil.kt\ncom/xiaomi/fitness/util/SleepTrendUtilKt\n*L\n32#1:506,2\n84#1:508,2\n133#1:510,2\n149#1:512,2\n195#1:514,2\n282#1:516,2\n357#1:518,2\n415#1:520,2\n*E\n"})
public final class SleepTrendUtilKt {

    @NotNull
    public static final String TAG = "SleepTrendExt";

    public static final boolean checkIfLongSleepExist(@NotNull AllDaySleepReport allDaySleepReport) {
        Intrinsics.checkNotNullParameter(allDaySleepReport, "allDaySleepReport");
        List<AllDaySleepReport> dayReportList = allDaySleepReport.getDayReportList();
        if (dayReportList == null) {
            return false;
        }
        Iterator<T> it = dayReportList.iterator();
        while (it.hasNext()) {
            List<SleepSegmentReport> sleepSegments = ((AllDaySleepReport) it.next()).getSleepSegments();
            List<SleepSegmentReport> listFilterAndSortSleepNew = sleepSegments != null ? SleepExtKt.filterAndSortSleepNew(sleepSegments) : null;
            if (listFilterAndSortSleepNew != null && !listFilterAndSortSleepNew.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static final int findNearestWholeHourInSec(int i, boolean z) {
        if (i % 3600 == 0) {
            return i;
        }
        return ((int) (z ? Math.ceil(((double) i) / ((double) 3600)) : Math.floor(((double) i) / ((double) 3600)))) * 3600;
    }

    public static final float getAvgSleepEfficiency(@NotNull AllDaySleepReport allDaySleepReport) {
        int i;
        Intrinsics.checkNotNullParameter(allDaySleepReport, "allDaySleepReport");
        List<AllDaySleepReport> dayReportList = allDaySleepReport.getDayReportList();
        int i2 = 0;
        Logger.d(TAG, "getAvgSleepEfficiency daySleepReportList size=" + (dayReportList != null ? dayReportList.size() : 0));
        if (dayReportList != null) {
            int iIntValue = 0;
            i = 0;
            for (AllDaySleepReport allDaySleepReport2 : dayReportList) {
                long timeStamp = allDaySleepReport2.getTimeStamp();
                long j = 1000;
                Logger.d("getAvgSleepEfficiency", "dayZero timestamp=" + timeStamp + " date=" + TimeDateUtil.getDateyyyyMMddHHmmFormat(timeStamp * j));
                List<SleepSegmentReport> sleepSegments = allDaySleepReport2.getSleepSegments();
                List<SleepSegmentReport> list = sleepSegments;
                if (list != null && !list.isEmpty()) {
                    List<SleepSegmentReport> listFilterAndSortSleepNew = SleepExtKt.filterAndSortSleepNew(sleepSegments);
                    if (!listFilterAndSortSleepNew.isEmpty()) {
                        SleepSegmentReport sleepSegmentReport = (SleepSegmentReport) CollectionsKt___CollectionsKt.first((List) listFilterAndSortSleepNew);
                        Logger.d("getAvgSleepEfficiency", "latestSegment=" + sleepSegmentReport.getBedTime() + " date=" + TimeDateUtil.getDateyyyyMMddHHmmFormat(sleepSegmentReport.getBedTime() * j));
                        Integer sleepEfficiency = sleepSegmentReport.getSleepEfficiency();
                        if (sleepEfficiency != null && sleepEfficiency.intValue() > 0) {
                            Integer sleepEfficiency2 = sleepSegmentReport.getSleepEfficiency();
                            iIntValue += sleepEfficiency2 != null ? sleepEfficiency2.intValue() : 0;
                            i++;
                        }
                    }
                }
            }
            i2 = iIntValue;
        } else {
            i = 0;
        }
        Logger.d(TAG, "getAvgSleepEfficiency sum=" + i2 + " count=" + i);
        if (i == 0) {
            return 0.0f;
        }
        return i2 / i;
    }

    @NotNull
    public static final List<Float> getCustomLabelInSecList(int i, int i2) {
        float f;
        ArrayList arrayList = new ArrayList();
        int i3 = i2 / 3600;
        int i4 = i / 3600;
        float stepSize = getStepSize(i4, i3) * 3600;
        Logger.d("getCustomLabelInSecList minInHour=" + i4 + " maxInHour=" + i3 + " stepSizeInSec=" + stepSize, new Object[0]);
        float f2 = (float) i;
        while (true) {
            f = i2;
            if (f2 > f) {
                break;
            }
            arrayList.add(Float.valueOf(f2));
            f2 += stepSize;
        }
        if (!arrayList.contains(Float.valueOf(f))) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    @NotNull
    public static final SleepTrendStaticsModel getPeriodSleepBedTimeStaticsModel(@NotNull AllDaySleepReport allDaySleepReport) {
        Intrinsics.checkNotNullParameter(allDaySleepReport, "allDaySleepReport");
        List<AllDaySleepReport> dayReportList = allDaySleepReport.getDayReportList();
        long j = 86400;
        long j2 = -86400;
        long j3 = 0;
        if (dayReportList != null) {
            for (AllDaySleepReport allDaySleepReport2 : dayReportList) {
                long timeStamp = allDaySleepReport2.getTimeStamp();
                long j4 = 1000;
                Logger.d("getPeriodSleepBedTimeRange", "dayZero timestamp=" + timeStamp + " date=" + TimeDateUtil.getDateyyyyMMddHHmmFormat(timeStamp * j4));
                List<SleepSegmentReport> sleepSegments = allDaySleepReport2.getSleepSegments();
                List<SleepSegmentReport> list = sleepSegments;
                if (list != null && !list.isEmpty()) {
                    List<SleepSegmentReport> listFilterAndSortSleepNew = SleepExtKt.filterAndSortSleepNew(sleepSegments);
                    if (!listFilterAndSortSleepNew.isEmpty()) {
                        SleepSegmentReport sleepSegmentReport = (SleepSegmentReport) CollectionsKt___CollectionsKt.first((List) listFilterAndSortSleepNew);
                        long j5 = j3;
                        Logger.d("getPeriodSleepBedTimeRange", "latestSegment=" + sleepSegmentReport.getBedTime() + " date=" + TimeDateUtil.getDateyyyyMMddHHmmFormat(sleepSegmentReport.getBedTime() * j4));
                        long bedTime = sleepSegmentReport.getBedTime() - timeStamp;
                        long jCoerceAtMost = RangesKt___RangesKt.coerceAtMost(j, bedTime);
                        long jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(j2, bedTime);
                        j3 = j5 + bedTime;
                        j2 = jCoerceAtLeast;
                        j = jCoerceAtMost;
                    }
                }
                j3 = j3;
            }
        }
        long size = j3 / ((long) (dayReportList != null ? dayReportList.size() : 1));
        Logger.d("getPeriodSleepBedTimeRange diffAvg=" + size + " size=" + (dayReportList != null ? dayReportList.size() : 0), new Object[0]);
        Logger.d("getPeriodSleepBedTimeRange diffMin=" + j + " diffMax=" + j2, new Object[0]);
        int i = (int) j2;
        int iFindNearestWholeHourInSec = findNearestWholeHourInSec(i, true);
        int i2 = (int) j;
        int iFindNearestWholeHourInSec2 = findNearestWholeHourInSec(i2, false);
        Logger.d("getPeriodSleepBedTimeRange maxInWholeHour=" + iFindNearestWholeHourInSec + " minInWholeHour=" + iFindNearestWholeHourInSec2, new Object[0]);
        SleepTrendStaticsModel sleepTrendStaticsModel = new SleepTrendStaticsModel(iFindNearestWholeHourInSec2, iFindNearestWholeHourInSec, (int) size, i2, i);
        StringBuilder sb = new StringBuilder();
        sb.append("getPeriodSleepBedTimeRange result=");
        sb.append(sleepTrendStaticsModel);
        Logger.d(sb.toString(), new Object[0]);
        return sleepTrendStaticsModel;
    }

    @NotNull
    public static final SleepTrendStaticsModel getPeriodSleepWakeUpTimeStaticsModel(@NotNull AllDaySleepReport allDaySleepReport) {
        Intrinsics.checkNotNullParameter(allDaySleepReport, "allDaySleepReport");
        List<AllDaySleepReport> dayReportList = allDaySleepReport.getDayReportList();
        long j = 86400;
        long j2 = -86400;
        long j3 = 0;
        if (dayReportList != null) {
            for (AllDaySleepReport allDaySleepReport2 : dayReportList) {
                long timeStamp = allDaySleepReport2.getTimeStamp();
                long j4 = 1000;
                Logger.d("getPeriodSleepWakeUpTimeStaticsModel", "dayZero timestamp=" + timeStamp + " date=" + TimeDateUtil.getDateyyyyMMddHHmmFormat(timeStamp * j4));
                List<SleepSegmentReport> sleepSegments = allDaySleepReport2.getSleepSegments();
                List<SleepSegmentReport> list = sleepSegments;
                if (list != null && !list.isEmpty()) {
                    List<SleepSegmentReport> listFilterAndSortSleepNew = SleepExtKt.filterAndSortSleepNew(sleepSegments);
                    if (!listFilterAndSortSleepNew.isEmpty()) {
                        SleepSegmentReport sleepSegmentReport = (SleepSegmentReport) CollectionsKt___CollectionsKt.first((List) listFilterAndSortSleepNew);
                        long j5 = j3;
                        Logger.d("getPeriodSleepWakeUpTimeStaticsModel", "latestSegment=" + sleepSegmentReport.getBedTime() + " date=" + TimeDateUtil.getDateyyyyMMddHHmmFormat(sleepSegmentReport.getWakeupTime() * j4));
                        long wakeupTime = sleepSegmentReport.getWakeupTime() - timeStamp;
                        long jCoerceAtMost = RangesKt___RangesKt.coerceAtMost(j, wakeupTime);
                        long jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(j2, wakeupTime);
                        j3 = j5 + wakeupTime;
                        j2 = jCoerceAtLeast;
                        j = jCoerceAtMost;
                    }
                }
                j3 = j3;
            }
        }
        long size = j3 / ((long) (dayReportList != null ? dayReportList.size() : 1));
        Logger.d("getPeriodSleepWakeUpTimeStaticsModel diffAvg=" + size + " size=" + (dayReportList != null ? dayReportList.size() : 0), new Object[0]);
        Logger.d("getPeriodSleepWakeUpTimeStaticsModel diffMin=" + j + " diffMax=" + j2, new Object[0]);
        int i = (int) j2;
        int iFindNearestWholeHourInSec = findNearestWholeHourInSec(i, true);
        int i2 = (int) j;
        int iFindNearestWholeHourInSec2 = findNearestWholeHourInSec(i2, false);
        Logger.d("getPeriodSleepWakeUpTimeStaticsModel maxInWholeHour=" + iFindNearestWholeHourInSec + " minInWholeHour=" + iFindNearestWholeHourInSec2, new Object[0]);
        SleepTrendStaticsModel sleepTrendStaticsModel = new SleepTrendStaticsModel(iFindNearestWholeHourInSec2, iFindNearestWholeHourInSec, (int) size, i2, i);
        StringBuilder sb = new StringBuilder();
        sb.append("getPeriodSleepWakeUpTimeStaticsModel result=");
        sb.append(sleepTrendStaticsModel);
        Logger.d(sb.toString(), new Object[0]);
        return sleepTrendStaticsModel;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0062  */
    public static final boolean getSleepRegularity(@NotNull AllDaySleepReport allDaySleepReport, int i, boolean z) {
        String str;
        long jAbs;
        int i2;
        String str2;
        Intrinsics.checkNotNullParameter(allDaySleepReport, "allDaySleepReport");
        List<AllDaySleepReport> dayReportList = allDaySleepReport.getDayReportList();
        String str3 = " diffAvg=";
        if (dayReportList != null) {
            jAbs = 0;
            i2 = 0;
            for (Iterator it = dayReportList.iterator(); it.hasNext(); it = it) {
                AllDaySleepReport allDaySleepReport2 = (AllDaySleepReport) it.next();
                long timeStamp = allDaySleepReport2.getTimeStamp();
                long j = 1000;
                Logger.d(TAG, "getSleepRegularity dayZero timestamp=" + timeStamp + " date=" + TimeDateUtil.getDateyyyyMMddHHmmFormat(timeStamp * j));
                List<SleepSegmentReport> sleepSegments = allDaySleepReport2.getSleepSegments();
                List<SleepSegmentReport> list = sleepSegments;
                if (list == null || list.isEmpty()) {
                    str2 = str3;
                } else {
                    List<SleepSegmentReport> listFilterAndSortSleepNew = SleepExtKt.filterAndSortSleepNew(sleepSegments);
                    if (!listFilterAndSortSleepNew.isEmpty()) {
                        SleepSegmentReport sleepSegmentReport = (SleepSegmentReport) CollectionsKt___CollectionsKt.first((List) listFilterAndSortSleepNew);
                        str2 = str3;
                        Logger.d(TAG, "getSleepRegularity latestSegment=" + sleepSegmentReport.getBedTime() + " date=" + TimeDateUtil.getDateyyyyMMddHHmmFormat(sleepSegmentReport.getBedTime() * j));
                        i2++;
                        jAbs += z ? Math.abs((sleepSegmentReport.getBedTime() - timeStamp) - ((long) i)) : Math.abs((sleepSegmentReport.getWakeupTime() - timeStamp) - ((long) i));
                        Logger.d(TAG, "getSleepRegularity ts=" + (sleepSegmentReport.getWakeupTime() - timeStamp) + str2 + i + " longSleepCount=" + i2 + " absDiffSum=" + jAbs);
                    } else {
                        str2 = str3;
                    }
                }
                str3 = str2;
            }
            str = str3;
        } else {
            str = " diffAvg=";
            jAbs = 0;
            i2 = 0;
        }
        long j2 = i2 == 0 ? 0L : jAbs / ((long) i2);
        Logger.d(TAG, "getSleepRegularity absDiffAvgInSec=" + j2 + str + i + " isBedTime=" + z);
        return ((double) j2) <= 5400.0d;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0134  */
    @NotNull
    public static final List<MaxMinEntry> getSleepTrendBedTimeEntries(@NotNull vfe vfeVar, boolean z, @NotNull AllDaySleepReport allDaySleepReport, @NotNull SleepTrendStaticsModel sleepTrendStaticsModel) {
        LocalDate firstDayOfMonth;
        LocalDate localDatePlusMonths;
        vfe attrs = vfeVar;
        boolean z2 = z;
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(allDaySleepReport, "allDaySleepReport");
        Intrinsics.checkNotNullParameter(sleepTrendStaticsModel, "sleepTrendStaticsModel");
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(allDaySleepReport.getTimeStamp());
        boolean z3 = true;
        if (z2) {
            firstDayOfMonth = TimeDateUtil.getWeekMonday(localDateTimestampToLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusWeeks(1);
        } else {
            firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(localDateTimestampToLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusMonths(1);
        }
        LocalDate localDateMinusDays = localDatePlusMonths.minusDays(1);
        Logger.i("getSleepTrendBedTimeEntries", "getSleepTrendBedTimeEntries startLocalDate=" + firstDayOfMonth + " endLocalDate=" + localDateMinusDays);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List<AllDaySleepReport> dayReportList = allDaySleepReport.getDayReportList();
        Logger.i("getSleepTrendBedTimeEntries", "getSleepTrendBedTimeEntries isWeek=" + z2 + " daySleepReportList: size=" + (dayReportList != null ? Integer.valueOf(dayReportList.size()) : null));
        if (dayReportList != null) {
            Iterator it = dayReportList.iterator();
            while (it.hasNext()) {
                AllDaySleepReport allDaySleepReport2 = (AllDaySleepReport) it.next();
                long timeStamp = allDaySleepReport2.getTimeStamp();
                Logger.d("getSleepTrendBedTimeEntries", "getSleepTrendBedTimeEntries timestamp=" + timeStamp);
                List<SleepSegmentReport> sleepSegments = allDaySleepReport2.getSleepSegments();
                List<SleepSegmentReport> list = sleepSegments;
                if (list != null && !list.isEmpty()) {
                    List<SleepSegmentReport> listFilterAndSortSleepNew = SleepExtKt.filterAndSortSleepNew(sleepSegments);
                    if (listFilterAndSortSleepNew.isEmpty() ^ z3) {
                        SleepSegmentReport sleepSegmentReport = (SleepSegmentReport) CollectionsKt___CollectionsKt.first((List) listFilterAndSortSleepNew);
                        linkedHashMap.put(Long.valueOf(allDaySleepReport2.getTimeStamp()), Long.valueOf(sleepSegmentReport.getBedTime() - timeStamp));
                        linkedHashMap2.put(Long.valueOf(allDaySleepReport2.getTimeStamp()), Long.valueOf(timeStamp));
                        Logger.d("getSleepTrendBedTimeEntries", "getSleepTrendBedTimeEntries bedTime=" + sleepSegmentReport.getBedTime() + " timestamp=" + timeStamp + " diff=" + (sleepSegmentReport.getBedTime() - timeStamp));
                    }
                }
                it = it;
                z3 = true;
            }
        }
        int i = 0;
        while (!localDateMinusDays.isBefore(firstDayOfMonth)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusDays);
            Long l = (Long) linkedHashMap.get(Long.valueOf(jChangZeroOfTheDay));
            Long l2 = (Long) linkedHashMap2.get(Long.valueOf(jChangZeroOfTheDay));
            Logger.d("getSleepTrendBedTimeEntries", "getSleepTrendBedTimeEntries endLocalDate=" + localDateMinusDays + " value=" + l + " index=" + i);
            int monthBarEntryType2 = z2 ? 2 : RecyclerBarEntry.INSTANCE.getMonthBarEntryType2(attrs, localDateMinusDays);
            int minInWholeHour = sleepTrendStaticsModel.getMinInWholeHour();
            MaxMinEntry maxMinEntry = new MaxMinEntry(i, l != null ? l.longValue() : minInWholeHour, jChangZeroOfTheDay, monthBarEntryType2);
            maxMinEntry.localDate = localDateMinusDays;
            if (l2 != null) {
                maxMinEntry.timestamp = l2.longValue();
            }
            maxMinEntry.setEntryMinY(minInWholeHour);
            arrayList.add(maxMinEntry);
            localDateMinusDays = localDateMinusDays.minusDays(1);
            i++;
            attrs = vfeVar;
            z2 = z;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x016e  */
    @NotNull
    public static final List<MaxMinEntry> getSleepTrendWakeupTimeEntries(@NotNull vfe vfeVar, boolean z, @NotNull AllDaySleepReport allDaySleepReport, @NotNull SleepTrendStaticsModel sleepTrendStaticsModel) {
        LocalDate firstDayOfMonth;
        LocalDate localDatePlusMonths;
        vfe attrs = vfeVar;
        boolean z2 = z;
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(allDaySleepReport, "allDaySleepReport");
        Intrinsics.checkNotNullParameter(sleepTrendStaticsModel, "sleepTrendStaticsModel");
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(allDaySleepReport.getTimeStamp());
        String str = "getSleepTrendWakeupTimeEntries localDate=" + localDateTimestampToLocalDate + " allDaySleepReport.getTimeStamp()=" + allDaySleepReport.getTimeStamp() + " time=" + allDaySleepReport.getTime();
        String str2 = TAG;
        Logger.d(TAG, str);
        if (z2) {
            firstDayOfMonth = TimeDateUtil.getWeekMonday(localDateTimestampToLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusWeeks(1);
        } else {
            firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(localDateTimestampToLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusMonths(1);
        }
        LocalDate localDateMinusDays = localDatePlusMonths.minusDays(1);
        Logger.i("getSleepTrendWakeupTimeEntries startLocalDate=" + firstDayOfMonth + " endLocalDate=" + localDateMinusDays, new Object[0]);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        List<AllDaySleepReport> dayReportList = allDaySleepReport.getDayReportList();
        Logger.i("getSleepTrendWakeupTimeEntries isWeek=" + z2 + " daySleepReportList: size=" + (dayReportList != null ? Integer.valueOf(dayReportList.size()) : null), new Object[0]);
        if (dayReportList != null) {
            Iterator it = dayReportList.iterator();
            while (it.hasNext()) {
                AllDaySleepReport allDaySleepReport2 = (AllDaySleepReport) it.next();
                long timeStamp = allDaySleepReport2.getTimeStamp();
                Logger.i("getSleepTrendWakeupTimeEntries", "timestamp=" + timeStamp);
                List<SleepSegmentReport> sleepSegments = allDaySleepReport2.getSleepSegments();
                List<SleepSegmentReport> list = sleepSegments;
                if (list != null && !list.isEmpty()) {
                    List<SleepSegmentReport> listFilterAndSortSleepNew = SleepExtKt.filterAndSortSleepNew(sleepSegments);
                    if (!listFilterAndSortSleepNew.isEmpty()) {
                        SleepSegmentReport sleepSegmentReport = (SleepSegmentReport) CollectionsKt___CollectionsKt.first((List) listFilterAndSortSleepNew);
                        linkedHashMap.put(Long.valueOf(allDaySleepReport2.getTimeStamp()), Long.valueOf(sleepSegmentReport.getWakeupTime() - timeStamp));
                        linkedHashMap2.put(Long.valueOf(allDaySleepReport2.getTimeStamp()), Long.valueOf(timeStamp));
                        Logger.i("getSleepTrendWakeupTimeEntries", "wakeupTime=" + sleepSegmentReport.getWakeupTime() + " timestamp=" + timeStamp + " diff=" + (sleepSegmentReport.getWakeupTime() - timeStamp));
                    }
                }
                it = it;
                str2 = str2;
                localDateMinusDays = localDateMinusDays;
            }
        }
        String str3 = str2;
        LocalDate localDateMinusDays2 = localDateMinusDays;
        int i = 0;
        while (!localDateMinusDays2.isBefore(firstDayOfMonth)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusDays2);
            Long l = (Long) linkedHashMap.get(Long.valueOf(jChangZeroOfTheDay));
            Long l2 = (Long) linkedHashMap2.get(Long.valueOf(jChangZeroOfTheDay));
            Logger.i("getSleepTrendWakeupTimeEntries", "endLocalDate=" + localDateMinusDays2 + " value=" + l);
            int monthBarEntryType2 = z2 ? 2 : RecyclerBarEntry.INSTANCE.getMonthBarEntryType2(attrs, localDateMinusDays2);
            int minInWholeHour = sleepTrendStaticsModel.getMinInWholeHour();
            MaxMinEntry maxMinEntry = new MaxMinEntry(i, l != null ? l.longValue() : minInWholeHour, jChangZeroOfTheDay, monthBarEntryType2);
            maxMinEntry.setEntryMinY(minInWholeHour);
            maxMinEntry.localDate = localDateMinusDays2;
            if (l2 != null) {
                maxMinEntry.timestamp = l2.longValue();
            }
            Logger.d(str3, "getSleepTrendWakeupTimeEntries barEntry=" + maxMinEntry + " localDate=" + localDateMinusDays2 + " localDateTimestamp=" + TimeDateUtil.localDateToTimestamp(localDateMinusDays2));
            arrayList.add(maxMinEntry);
            localDateMinusDays2 = localDateMinusDays2.minusDays(1);
            i++;
            attrs = vfeVar;
            z2 = z;
        }
        return arrayList;
    }

    @NotNull
    public static final List<MaxMinEntry> getSleepWmEfficiencyEntries(@NotNull vfe attrs, boolean z, @NotNull AllDaySleepReport allDaySleepReport) {
        LocalDate firstDayOfMonth;
        LocalDate localDatePlusMonths;
        Integer sleepEfficiency;
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullParameter(allDaySleepReport, "allDaySleepReport");
        ArrayList arrayList = new ArrayList();
        LocalDate localDateTimestampToLocalDate = TimeDateUtil.timestampToLocalDate(allDaySleepReport.getTimeStamp());
        if (z) {
            firstDayOfMonth = TimeDateUtil.getWeekMonday(localDateTimestampToLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusWeeks(1);
        } else {
            firstDayOfMonth = TimeDateUtil.getFirstDayOfMonth(localDateTimestampToLocalDate);
            localDatePlusMonths = firstDayOfMonth.plusMonths(1);
        }
        LocalDate localDateMinusDays = localDatePlusMonths.minusDays(1);
        int i = 0;
        Logger.i("getSleepWmEfficiencyEntries startLocalDate=" + firstDayOfMonth + " endLocalDate=" + localDateMinusDays, new Object[0]);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<AllDaySleepReport> dayReportList = allDaySleepReport.getDayReportList();
        Logger.i("isWeek=" + z + " daySleepReportList: size=" + (dayReportList != null ? Integer.valueOf(dayReportList.size()) : null), new Object[0]);
        if (dayReportList != null) {
            for (AllDaySleepReport allDaySleepReport2 : dayReportList) {
                List<SleepSegmentReport> sleepSegments = allDaySleepReport2.getSleepSegments();
                List<SleepSegmentReport> list = sleepSegments;
                if (list != null && !list.isEmpty()) {
                    List<SleepSegmentReport> listFilterAndSortSleepNew = SleepExtKt.filterAndSortSleepNew(sleepSegments);
                    if ((!listFilterAndSortSleepNew.isEmpty()) && (sleepEfficiency = ((SleepSegmentReport) CollectionsKt___CollectionsKt.first((List) listFilterAndSortSleepNew)).getSleepEfficiency()) != null && sleepEfficiency.intValue() != 0) {
                        Logger.i("getSleepWmEfficiencyEntries", "latestSegment: sleepEfficiency=" + sleepEfficiency);
                        Logger.i("getSleepWmEfficiencyEntries", "latestSegment: timestamp=" + allDaySleepReport2.getTimeStamp());
                        linkedHashMap.put(Long.valueOf(allDaySleepReport2.getTimeStamp()), sleepEfficiency);
                    }
                }
            }
        }
        boolean z2 = false;
        int i2 = 0;
        while (!localDateMinusDays.isBefore(firstDayOfMonth)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusDays);
            Integer num = (Integer) linkedHashMap.get(Long.valueOf(jChangZeroOfTheDay));
            int iIntValue = num != null ? num.intValue() : i;
            Logger.i("getSleepWmEfficiencyEntries endLocalDate=" + localDateMinusDays + " value=" + iIntValue, new Object[i]);
            MaxMinEntry maxMinEntry = new MaxMinEntry(i2, iIntValue, jChangZeroOfTheDay, z ? 2 : RecyclerBarEntry.INSTANCE.getMonthBarEntryType2(attrs, localDateMinusDays));
            if (iIntValue != 0) {
                z2 = true;
            }
            maxMinEntry.localDate = localDateMinusDays;
            arrayList.add(maxMinEntry);
            localDateMinusDays = localDateMinusDays.minusDays(1);
            i2++;
            i = 0;
        }
        return !z2 ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
    }

    private static final float getStepSize(int i, int i2) {
        int i3 = i2 - i;
        if (i3 < 3) {
            return 0.5f;
        }
        if (i3 < 14) {
            return 1.0f;
        }
        return i3 < 21 ? 2.0f : 3.0f;
    }

    @NotNull
    public static final String secondsTo24HourTimeWithNegativeConverted(int i) {
        if (i <= 0) {
            i += RepositoryManager.GAP_A_DAY;
        }
        int i2 = i / 3600;
        String strPadStart = StringsKt__StringsKt.padStart(String.valueOf((i % 3600) / 60), 2, '0');
        return StringsKt__StringsKt.padStart(String.valueOf(i2), 2, '0') + ":" + strPadStart;
    }
}
