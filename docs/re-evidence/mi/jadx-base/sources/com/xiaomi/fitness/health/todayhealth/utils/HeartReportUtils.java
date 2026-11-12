package com.xiaomi.fitness.health.todayhealth.utils;

import android.content.Context;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fit.fitness.export.data.item.PpgMedicalItemReport;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseLineChartData;
import com.xiaomi.fitness.chart.entrys.FingerBSList;
import com.xiaomi.fitness.chart.entrys.MultiBarEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.health.todayhealth.model.DailyHrHealthReport;
import com.xiaomi.fitness.health.todayhealth.model.HeartHealthStatItem;
import com.xiaomi.fitness.health.todayhealth.model.HeartHealthValueItem;
import com.xiaomi.fitness.health.todayhealth.ui.items.HeartHealthLineChartItemDecoration;
import defpackage.c0j;
import defpackage.ea3;
import defpackage.iji;
import defpackage.r02;
import defpackage.vfe;
import defpackage.x44;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b0\u00101J+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J9\u0010)\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0016\u001a\u00020\u00152\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\b0&¢\u0006\u0004\b)\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00190+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\"8\u0006X\u0086T¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/utils/HeartReportUtils;", "", "Lr02;", "attrs", "Lcom/xiaomi/fitness/health/todayhealth/model/DailyHrHealthReport;", "report", "", "isWeek", "", "Lcom/xiaomi/fitness/chart/entrys/MultiBarEntry;", "buildWeekMonthHeartEntryList", "(Lr02;Lcom/xiaomi/fitness/health/todayhealth/model/DailyHrHealthReport;Z)Ljava/util/List;", "Landroid/content/Context;", "context", "Lvfe;", "lineChartAttrs", "", "highLightType", "Lcom/xiaomi/fitness/chart/entrys/BloodGlucoseEntry;", "createDayEntries", "(Landroid/content/Context;Lvfe;Lcom/xiaomi/fitness/health/todayhealth/model/DailyHrHealthReport;I)Ljava/util/List;", "", "timestamp", "toNearestMinuteTimestamp", "(J)J", "", "settingLowValue", "settingHighValue", "Lcom/xiaomi/fitness/health/todayhealth/ui/items/HeartHealthLineChartItemDecoration;", "mItemDecoration", "", "initLineColor", "(FFLcom/xiaomi/fitness/health/todayhealth/ui/items/HeartHealthLineChartItemDecoration;)V", "heartRateStatus", "", "getHeartRateStatusString", "(I)Ljava/lang/String;", "sid", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "itemMap", "splitHrDailyReport", "(Ljava/lang/String;JLjava/util/Map;)Lcom/xiaomi/fitness/health/todayhealth/model/DailyHrHealthReport;", "", "settValueList", "Ljava/util/List;", "TAG", "Ljava/lang/String;", "<init>", "()V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nHeartReportUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeartReportUtils.kt\ncom/xiaomi/fitness/health/todayhealth/utils/HeartReportUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,380:1\n1498#2:381\n1528#2,3:382\n1531#2,3:392\n1202#2,2:395\n1230#2,4:397\n808#2,11:403\n808#2,11:414\n1863#2,2:425\n1863#2,2:427\n1010#2,2:429\n1971#2,14:431\n381#3,7:385\n216#4,2:401\n*S KotlinDebug\n*F\n+ 1 HeartReportUtils.kt\ncom/xiaomi/fitness/health/todayhealth/utils/HeartReportUtils\n*L\n145#1:381\n145#1:382,3\n145#1:392,3\n148#1:395,2\n148#1:397,4\n301#1:403,11\n304#1:414,11\n322#1:425,2\n340#1:427,2\n359#1:429,2\n360#1:431,14\n145#1:385,7\n153#1:401,2\n*E\n"})
public final class HeartReportUtils {

    @NotNull
    public static final String TAG = "DayHeartReportUtils";

    @NotNull
    public static final HeartReportUtils INSTANCE = new HeartReportUtils();

    @NotNull
    private static final List<Float> settValueList = new ArrayList();

    private HeartReportUtils() {
    }

    public static /* synthetic */ List createDayEntries$default(HeartReportUtils heartReportUtils, Context context, vfe vfeVar, DailyHrHealthReport dailyHrHealthReport, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 2;
        }
        return heartReportUtils.createDayEntries(context, vfeVar, dailyHrHealthReport, i);
    }

    @NotNull
    public final List<MultiBarEntry> buildWeekMonthHeartEntryList(@NotNull r02 attrs, @NotNull DailyHrHealthReport report, boolean isWeek) {
        LocalDate localDateWithDayOfMonth;
        LocalDate localDatePlusMonths;
        int normalCount;
        int i;
        int i2;
        r02 attrs2 = attrs;
        Intrinsics.checkNotNullParameter(attrs2, "attrs");
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList arrayList = new ArrayList();
        LocalDate localDateA = ea3.a(report.getTime());
        if (isWeek) {
            localDateWithDayOfMonth = TimeDateUtil.getWeekMonday(localDateA);
            localDatePlusMonths = localDateWithDayOfMonth.plusWeeks(1);
        } else {
            localDateWithDayOfMonth = localDateA.withDayOfMonth(1);
            localDatePlusMonths = localDateWithDayOfMonth.plusMonths(1);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<HeartHealthStatItem> heartHealthStatItemList = report.getHeartHealthStatItemList();
        if (heartHealthStatItemList != null) {
            for (HeartHealthStatItem heartHealthStatItem : heartHealthStatItemList) {
                linkedHashMap.put(Long.valueOf(heartHealthStatItem.getTime()), heartHealthStatItem);
            }
        }
        int color = ExtUtilsKt.getColor(iji.M2);
        int color2 = ExtUtilsKt.getColor(iji.N2);
        int color3 = ExtUtilsKt.getColor(iji.O2);
        LocalDate localDateMinusDays = localDatePlusMonths.minusDays(1);
        int i3 = 0;
        while (!localDateMinusDays.isBefore(localDateWithDayOfMonth)) {
            long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDateMinusDays);
            HeartHealthStatItem heartHealthStatItem2 = (HeartHealthStatItem) linkedHashMap.get(Long.valueOf(jChangZeroOfTheDay));
            if (heartHealthStatItem2 != null) {
                int abnormalCount = heartHealthStatItem2.getAbnormalCount();
                int otherCount = heartHealthStatItem2.getOtherCount();
                normalCount = heartHealthStatItem2.getNormalCount();
                i = abnormalCount;
                i2 = otherCount;
            } else {
                normalCount = 0;
                i = 0;
                i2 = 0;
            }
            RecyclerBarEntry.Companion companion = RecyclerBarEntry.INSTANCE;
            int weekBarEntryType = isWeek ? companion.getWeekBarEntryType(localDateMinusDays) : companion.getMonthBarEntryType2(attrs2, localDateMinusDays);
            int i4 = i + i2 + normalCount;
            MultiBarEntry multiBarEntry = new MultiBarEntry(i3, i4, jChangZeroOfTheDay, weekBarEntryType);
            multiBarEntry.localDate = localDateMinusDays;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new MultiBarEntry.a(color3, i4, true));
            arrayList2.add(new MultiBarEntry.a(color2, i2 + normalCount, i <= 0));
            arrayList2.add(new MultiBarEntry.a(color, normalCount, i <= 0 && i2 <= 0));
            multiBarEntry.c(arrayList2);
            arrayList.add(multiBarEntry);
            i3++;
            localDateMinusDays = localDateMinusDays.minusDays(1);
            attrs2 = attrs;
        }
        return arrayList;
    }

    @NotNull
    public final List<BloodGlucoseEntry> createDayEntries(@NotNull Context context, @NotNull vfe lineChartAttrs, @NotNull DailyHrHealthReport report, int highLightType) {
        Map mapEmptyMap;
        Map mapEmptyMap2;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        Map map;
        int i;
        String strValueOf;
        Integer statue;
        Integer statue2;
        Integer avgHr;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lineChartAttrs, "lineChartAttrs");
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList arrayList2 = new ArrayList();
        LocalDate localDatePlusDays = TimeDateUtil.timestampToLocalDate(report.getTime()).plusDays(1);
        Intrinsics.checkNotNullExpressionValue(localDatePlusDays, "plusDays(...)");
        long jChangZeroOfTheDay = TimeDateUtil.changZeroOfTheDay(localDatePlusDays);
        lineChartAttrs.c = 1;
        List<HeartHealthValueItem> hrStatusRecords = report.getHrStatusRecords();
        if (hrStatusRecords != null) {
            mapEmptyMap = new LinkedHashMap();
            for (HeartHealthValueItem heartHealthValueItem : hrStatusRecords) {
                Long lValueOf = Long.valueOf(INSTANCE.toNearestMinuteTimestamp(heartHealthValueItem.getTime()));
                Object arrayList3 = mapEmptyMap.get(lValueOf);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    mapEmptyMap.put(lValueOf, arrayList3);
                }
                ((List) arrayList3).add(heartHealthValueItem);
            }
        } else {
            mapEmptyMap = MapsKt__MapsKt.emptyMap();
        }
        if (hrStatusRecords != null) {
            List<HeartHealthValueItem> list = hrStatusRecords;
            mapEmptyMap2 = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10)), 16));
            for (Object obj : list) {
                mapEmptyMap2.put(Long.valueOf(((HeartHealthValueItem) obj).getTime()), obj);
            }
        } else {
            mapEmptyMap2 = MapsKt__MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : mapEmptyMap2.entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            HeartHealthValueItem heartHealthValueItem2 = (HeartHealthValueItem) entry.getValue();
            long nearestMinuteTimestamp = INSTANCE.toNearestMinuteTimestamp(jLongValue);
            heartHealthValueItem2.setTime(nearestMinuteTimestamp);
            linkedHashMap2.put(Long.valueOf(nearestMinuteTimestamp), heartHealthValueItem2);
        }
        BloodGlucoseEntry bloodGlucoseEntry = new BloodGlucoseEntry(0, -1.0f, jChangZeroOfTheDay, 2);
        bloodGlucoseEntry.itemType = "days";
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        while (i2 < 1440) {
            jChangZeroOfTheDay -= (long) 60;
            HeartHealthValueItem heartHealthValueItem3 = (HeartHealthValueItem) linkedHashMap2.get(Long.valueOf(jChangZeroOfTheDay));
            ListExtKt.add(bloodGlucoseEntry.getValues(), new BloodGlucoseLineChartData((heartHealthValueItem3 == null || (avgHr = heartHealthValueItem3.getAvgHr()) == null) ? -1 : avgHr.intValue(), 2, (heartHealthValueItem3 == null || (statue2 = heartHealthValueItem3.getStatue()) == null) ? 0 : statue2.intValue(), getHeartRateStatusString((heartHealthValueItem3 == null || (statue = heartHealthValueItem3.getStatue()) == null) ? 0 : statue.intValue()), heartHealthValueItem3 != null ? heartHealthValueItem3.getTime() : jChangZeroOfTheDay));
            FingerBSList fingerBSList = null;
            List<HeartHealthValueItem> list2 = mapEmptyMap != null ? (List) mapEmptyMap.get(Long.valueOf(jChangZeroOfTheDay)) : null;
            if (list2 != null) {
                i = i2;
                FingerBSList fingerBSList2 = null;
                long jCoerceAtLeast = jChangZeroOfTheDay;
                for (HeartHealthValueItem heartHealthValueItem4 : list2) {
                    linkedHashMap2 = linkedHashMap2;
                    arrayList2 = arrayList2;
                    jCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(heartHealthValueItem4.getTime(), jCoerceAtLeast);
                    WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
                    String sid = heartHealthValueItem4.getSid();
                    if (sid == null) {
                        sid = "";
                    }
                    DeviceInfo<? extends Device> deviceInfoInAll = deviceManagerExtKt.getDeviceInfoInAll(sid);
                    if (deviceInfoInAll == null || (strValueOf = deviceInfoInAll.getName()) == null) {
                        strValueOf = String.valueOf(heartHealthValueItem4.getSid());
                    }
                    long time = heartHealthValueItem4.getTime();
                    Integer avgHr2 = heartHealthValueItem4.getAvgHr();
                    Intrinsics.checkNotNull(avgHr2);
                    float fIntValue = avgHr2.intValue();
                    Intrinsics.checkNotNull(heartHealthValueItem3);
                    Integer statue3 = heartHealthValueItem3.getStatue();
                    Intrinsics.checkNotNull(statue3);
                    mapEmptyMap = mapEmptyMap;
                    FingerBSList fingerBSList3 = new FingerBSList(time, fIntValue, statue3.intValue(), "", ResourceExtKt.getString(c0j.eq, strValueOf));
                    if (list2.size() == 1) {
                        ListExtKt.add(bloodGlucoseEntry.getFingerBSList(), fingerBSList3);
                        i3++;
                    } else if (fingerBSList2 == null && fingerBSList == null) {
                        fingerBSList = fingerBSList3;
                        fingerBSList2 = fingerBSList;
                    }
                    Integer avgHr3 = heartHealthValueItem4.getAvgHr();
                    Intrinsics.checkNotNull(avgHr3);
                    if (avgHr3.intValue() > -1.0f) {
                        z = true;
                    }
                }
                linkedHashMap = linkedHashMap2;
                arrayList = arrayList2;
                map = mapEmptyMap;
                if (fingerBSList != null && fingerBSList2 != null) {
                    FingerBSList fingerBSList4 = new FingerBSList(jCoerceAtLeast, fingerBSList.getValue(), fingerBSList.getLevelType(), fingerBSList.getLevelStingRes(), fingerBSList.getMealTime());
                    ListExtKt.add(bloodGlucoseEntry.getFingerBSList(), new FingerBSList(jChangZeroOfTheDay, fingerBSList2.getValue(), fingerBSList2.getLevelType(), fingerBSList2.getLevelStingRes(), fingerBSList2.getMealTime()));
                    bloodGlucoseEntry.getFingerHighLightMap().put(Integer.valueOf(i3), fingerBSList4);
                    i3++;
                }
            } else {
                linkedHashMap = linkedHashMap2;
                arrayList = arrayList2;
                map = mapEmptyMap;
                i = i2;
            }
            i2 = i + 1;
            linkedHashMap2 = linkedHashMap;
            arrayList2 = arrayList;
            mapEmptyMap = map;
        }
        ArrayList arrayList4 = arrayList2;
        if (z) {
            bloodGlucoseEntry.setY(1.0f);
        }
        bloodGlucoseEntry.timestamp = jChangZeroOfTheDay;
        bloodGlucoseEntry.setHighLightType(highLightType);
        bloodGlucoseEntry.barEntryTimeType = 1;
        arrayList4.add(bloodGlucoseEntry);
        return arrayList4;
    }

    @NotNull
    public final String getHeartRateStatusString(int heartRateStatus) {
        if (heartRateStatus != 0 && heartRateStatus != 1) {
            if (heartRateStatus == 2) {
                return ResourceExtKt.getString(c0j.Aq);
            }
            if (heartRateStatus == 3) {
                return ResourceExtKt.getString(c0j.Bq);
            }
            if (heartRateStatus != 4) {
                return heartRateStatus != 5 ? ResourceExtKt.getString(c0j.d9) : ResourceExtKt.getString(c0j.Rl);
            }
            return ResourceExtKt.getString(c0j.Ql);
        }
        return ResourceExtKt.getString(c0j.d9);
    }

    public final void initLineColor(float settingLowValue, float settingHighValue, @NotNull HeartHealthLineChartItemDecoration mItemDecoration) {
        Intrinsics.checkNotNullParameter(mItemDecoration, "mItemDecoration");
        ArrayList arrayList = new ArrayList();
        ListExtKt.add(arrayList, Integer.valueOf(x44.a(iji.N2)));
        ListExtKt.add(arrayList, Integer.valueOf(x44.a(iji.M2)));
        ListExtKt.add(arrayList, Integer.valueOf(x44.a(iji.O2)));
        ListExtKt.add(arrayList, Integer.valueOf(x44.a(iji.M2)));
        ListExtKt.add(arrayList, Integer.valueOf(x44.a(iji.O2)));
        List<Float> list = settValueList;
        list.clear();
        list.add(Float.valueOf(3.0f));
        list.add(Float.valueOf(settingLowValue));
        list.add(Float.valueOf(settingHighValue));
        list.add(Float.valueOf(13.9f));
        mItemDecoration.setPointLineColor(arrayList, list);
    }

    @NotNull
    public final DailyHrHealthReport splitHrDailyReport(@Nullable String sid, long timestamp, @NotNull Map<String, ? extends List<? extends DailyRecordItem>> itemMap) {
        ArrayList<PpgMedicalItemReport> arrayList;
        ArrayList<EcgMedicalItemReport> arrayList2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Object obj;
        char c;
        Intrinsics.checkNotNullParameter(itemMap, "itemMap");
        DailyHrHealthReport dailyHrHealthReport = new DailyHrHealthReport(timestamp, "days");
        if (itemMap.isEmpty()) {
            return dailyHrHealthReport;
        }
        List<? extends DailyRecordItem> list = itemMap.get("ppg");
        if (list != null) {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof PpgMedicalItemReport) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        List<? extends DailyRecordItem> list2 = itemMap.get("ecg");
        if (list2 != null) {
            arrayList2 = new ArrayList();
            for (Object obj3 : list2) {
                if (obj3 instanceof EcgMedicalItemReport) {
                    arrayList2.add(obj3);
                }
            }
        } else {
            arrayList2 = null;
        }
        Integer numValueOf = arrayList != null ? Integer.valueOf(arrayList.size()) : null;
        Integer numValueOf2 = arrayList2 != null ? Integer.valueOf(arrayList2.size()) : null;
        Logger.i(TAG, "ppgList size " + numValueOf + " ecgList size " + numValueOf2 + "  itemMap size " + itemMap.size());
        ArrayList arrayList3 = new ArrayList();
        int i6 = 0;
        if (arrayList != null) {
            i = 0;
            i2 = 0;
            i3 = 0;
            for (PpgMedicalItemReport ppgMedicalItemReport : arrayList) {
                HeartHealthValueItem heartHealthValueItem = new HeartHealthValueItem(ppgMedicalItemReport.getMeasureTime(), ppgMedicalItemReport.getSid(), ppgMedicalItemReport.getAvgHr(), ppgMedicalItemReport.getAnalysisResult(), 1);
                heartHealthValueItem.setDbTime(ppgMedicalItemReport.getDbTime());
                arrayList3.add(heartHealthValueItem);
                Integer analysisResult = ppgMedicalItemReport.getAnalysisResult();
                if ((analysisResult != null && analysisResult.intValue() == 0) || (analysisResult != null && analysisResult.intValue() == 1)) {
                    i++;
                } else if (analysisResult != null && analysisResult.intValue() == 2) {
                    i3++;
                } else {
                    i2++;
                }
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (arrayList2 != null) {
            int i7 = 0;
            i5 = 0;
            for (EcgMedicalItemReport ecgMedicalItemReport : arrayList2) {
                HeartHealthValueItem heartHealthValueItem2 = new HeartHealthValueItem(ecgMedicalItemReport.getMeasureTime(), ecgMedicalItemReport.getSid(), ecgMedicalItemReport.getAvgHr(), ecgMedicalItemReport.getAnalysisResult(), 2);
                heartHealthValueItem2.setDbTime(ecgMedicalItemReport.getDbTime());
                arrayList3.add(heartHealthValueItem2);
                Integer analysisResult2 = ecgMedicalItemReport.getAnalysisResult();
                if ((analysisResult2 != null && analysisResult2.intValue() == 0) || (analysisResult2 != null && analysisResult2.intValue() == 1)) {
                    c = 2;
                    i6++;
                } else {
                    if (analysisResult2 == null) {
                        c = 2;
                    } else {
                        c = 2;
                        if (analysisResult2.intValue() == 2) {
                            i7++;
                        }
                    }
                    i5++;
                }
            }
            i4 = i6;
            i6 = i7;
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (arrayList3.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList3, new Comparator() { // from class: com.xiaomi.fitness.health.todayhealth.utils.HeartReportUtils$splitHrDailyReport$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((HeartHealthValueItem) t).getTime()), Long.valueOf(((HeartHealthValueItem) t2).getTime()));
                }
            });
        }
        Iterator it = arrayList3.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long time = ((HeartHealthValueItem) next).getTime();
                do {
                    Object next2 = it.next();
                    long time2 = ((HeartHealthValueItem) next2).getTime();
                    if (time < time2) {
                        next = next2;
                        time = time2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        dailyHrHealthReport.setLastHrRecord((HeartHealthValueItem) obj);
        dailyHrHealthReport.setSumOtherCount(i2 + i5);
        dailyHrHealthReport.setSumAbnormalCount(i3 + i6);
        dailyHrHealthReport.setSumNormalCount(i + i4);
        dailyHrHealthReport.setEcgOtherCount(i5);
        dailyHrHealthReport.setEcgAbnormalCount(i6);
        dailyHrHealthReport.setEcgNormalCount(i4);
        dailyHrHealthReport.setPpgOtherCount(i2);
        dailyHrHealthReport.setPpgAbnormalCount(i3);
        dailyHrHealthReport.setPpgNormalCount(i);
        dailyHrHealthReport.setHrStatusRecords(arrayList3);
        return dailyHrHealthReport;
    }

    public final long toNearestMinuteTimestamp(long timestamp) {
        long j = 60;
        return (timestamp / j) * j;
    }
}
