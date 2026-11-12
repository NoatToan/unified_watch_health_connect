package com.xiaomi.fit.fitness.persist.utils;

import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportSummary;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.di.FitnessDataSingleModuleKt;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.SportReportKey;
import com.xiaomi.fit.fitness.persist.db.FitnessDatabase;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportEntity;
import com.xiaomi.fit.fitness.persist.db.internal.SportSummaryDaoKt;
import com.xiaomi.fit.fitness.persist.db.internal.SportSummaryEntity;
import com.xiaomi.fit.fitness.persist.db.utils.SportReportDaoUtils;
import com.xiaomi.fit.fitness.persist.server.data.SportSummaryRes;
import com.xiaomi.fitness.repo.summary.SummaryPrefer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u001a\u0018\u0010\u0002\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0001\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0002\u001a\u0010\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004*\u00020\u000b\u001a\n\u0010\f\u001a\u00020\u0003*\u00020\r\u001a \u0010\u000e\u001a\u00020\r*\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u001a\u0018\u0010\u0010\u001a\u00020\u0011*\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u001a\u0014\u0010\u0014\u001a\u00020\u0003*\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0003\u001a\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004*\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0005\u001a\f\u0010\u0018\u001a\u00020\u0011*\u00020\u0003H\u0002\u001a\u0016\u0010\u0019\u001a\u00020\u001a*\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\bH\u0002\u001a\f\u0010\u001c\u001a\u00020\u001d*\u0004\u0018\u00010\b\u001a\f\u0010\u001e\u001a\u00020\u001d*\u0004\u0018\u00010\b\u001a\u0016\u0010\u001f\u001a\u00020\u001a*\u0004\u0018\u00010\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u001a\u0016\u0010 \u001a\u00020\u001a*\u0004\u0018\u00010\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u001a\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\"\u001a\u00020\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"TAG_L", "", "toSummaryTotalEntity", "Lcom/xiaomi/fit/fitness/persist/db/internal/SportSummaryEntity;", "", "Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportEntity;", "category", "newLocalMaxData", "Lcom/xiaomi/fit/data/common/data/sport/SportSummary$MaxData;", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "toSummaryList", "Lcom/xiaomi/fit/fitness/persist/server/data/SportSummaryRes;", "toSummaryEntity", "Lcom/xiaomi/fit/data/common/data/sport/SportSummary;", "addReports", "reportEntities", "findMaxData", "", "maxType", "", "add", "other", "minus", "reportEntity", "resetMaxData", "match", "", "info", "intValue", "", "floatValue", "biggerIntThan", "biggerFloatThan", "getPreferCategory", "online", "fitness-data-core_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportSummaryUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportSummaryUtil.kt\ncom/xiaomi/fit/fitness/persist/utils/SportSummaryUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,264:1\n1863#2,2:265\n1557#2:268\n1628#2,3:269\n1863#2,2:272\n1#3:267\n*S KotlinDebug\n*F\n+ 1 SportSummaryUtil.kt\ncom/xiaomi/fit/fitness/persist/utils/SportSummaryUtilKt\n*L\n49#1:265,2\n89#1:268\n89#1:269,3\n115#1:272,2\n*E\n"})
public final class SportSummaryUtilKt {

    @NotNull
    private static final String TAG_L = "SRecordUtil";

    @NotNull
    public static final SportSummaryEntity add(@Nullable SportSummaryEntity sportSummaryEntity, @NotNull SportSummaryEntity other) {
        SportSummary.SummaryData summaryData;
        Intrinsics.checkNotNullParameter(other, "other");
        if (sportSummaryEntity == null) {
            return other;
        }
        if (!Intrinsics.areEqual(sportSummaryEntity.getCategory(), other.getCategory()) || (summaryData = other.getSummary().info) == null) {
            return sportSummaryEntity;
        }
        SportSummary.SummaryData summaryData2 = sportSummaryEntity.getSummary().info;
        if (summaryData2 == null) {
            return other;
        }
        summaryData2.total_calorie += summaryData.total_calorie;
        summaryData2.total_count += summaryData.total_count;
        summaryData2.total_distance += summaryData.total_distance;
        summaryData2.total_duration += summaryData.total_duration;
        summaryData2.total_accessory_count += summaryData.total_accessory_count;
        if (!Intrinsics.areEqual(sportSummaryEntity.getCategory(), "sport_stats_all")) {
            if (biggerIntThan(summaryData2.max_avg_pace, summaryData.max_avg_pace)) {
                summaryData2.max_avg_pace = summaryData.max_avg_pace;
            }
            if (biggerFloatThan(summaryData.max_avg_speed, summaryData2.max_avg_pace)) {
                summaryData2.max_avg_speed = summaryData.max_avg_speed;
            }
            if (biggerIntThan(summaryData.max_calorie, summaryData2.max_calorie)) {
                summaryData2.max_calorie = summaryData.max_calorie;
            }
            if (biggerIntThan(summaryData.max_distance, summaryData2.max_distance)) {
                summaryData2.max_distance = summaryData.max_distance;
            }
            if (biggerIntThan(summaryData.max_duration, summaryData2.max_duration)) {
                summaryData2.max_duration = summaryData.max_duration;
            }
            if (biggerIntThan(summaryData.max_accessory_count, summaryData2.max_accessory_count)) {
                summaryData2.max_accessory_count = summaryData.max_accessory_count;
            }
        }
        return sportSummaryEntity;
    }

    @NotNull
    public static final SportSummary addReports(@NotNull SportSummary sportSummary, @NotNull String category, @NotNull List<SportReportEntity> reportEntities) {
        Integer gymTrainingTotalTimes;
        Integer calories;
        Float avgSpeed;
        Integer avgPace;
        Integer gymTrainingTotalTimes2;
        Integer calories2;
        Float avgSpeed2;
        Integer avgPace2;
        Intrinsics.checkNotNullParameter(sportSummary, "<this>");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(reportEntities, "reportEntities");
        List<SportBasicReport> listConvertEntityToReport = SportReportDaoUtils.INSTANCE.convertEntityToReport(reportEntities);
        if (sportSummary.info == null) {
            sportSummary.info = new SportSummary.SummaryData();
        }
        boolean zAreEqual = Intrinsics.areEqual(category, "sport_stats_all");
        SportBasicReport sportBasicReport = null;
        SportBasicReport sportBasicReport2 = null;
        SportBasicReport sportBasicReport3 = null;
        SportBasicReport sportBasicReport4 = null;
        SportBasicReport sportBasicReport5 = null;
        SportBasicReport sportBasicReport6 = null;
        for (SportBasicReport sportBasicReport7 : listConvertEntityToReport) {
            sportSummary.info.total_duration += (long) sportBasicReport7.getDuration();
            SportSummary.SummaryData summaryData = sportSummary.info;
            summaryData.total_count++;
            summaryData.total_distance += sportBasicReport7.getDistance();
            SportSummary.SummaryData summaryData2 = sportSummary.info;
            int i = summaryData2.total_calorie;
            Integer calories3 = sportBasicReport7.getCalories();
            summaryData2.total_calorie = i + (calories3 != null ? calories3.intValue() : 0);
            SportSummary.SummaryData summaryData3 = sportSummary.info;
            int i2 = summaryData3.total_accessory_count;
            Integer gymTrainingTotalTimes3 = sportBasicReport7.getGymTrainingTotalTimes();
            summaryData3.total_accessory_count = i2 + (gymTrainingTotalTimes3 != null ? gymTrainingTotalTimes3.intValue() : 0);
            if (!zAreEqual) {
                Integer avgPace3 = sportBasicReport7.getAvgPace();
                int iIntValue = Integer.MAX_VALUE;
                int iIntValue2 = avgPace3 != null ? avgPace3.intValue() : Integer.MAX_VALUE;
                if (sportBasicReport != null && (avgPace2 = sportBasicReport.getAvgPace()) != null) {
                    iIntValue = avgPace2.intValue();
                }
                if (iIntValue2 < iIntValue) {
                    sportBasicReport = sportBasicReport7;
                }
                Float avgSpeed3 = sportBasicReport7.getAvgSpeed();
                if ((avgSpeed3 != null ? avgSpeed3.floatValue() : 0.0f) > ((sportBasicReport2 == null || (avgSpeed2 = sportBasicReport2.getAvgSpeed()) == null) ? 0.0f : avgSpeed2.floatValue())) {
                    sportBasicReport2 = sportBasicReport7;
                }
                Integer calories4 = sportBasicReport7.getCalories();
                if ((calories4 != null ? calories4.intValue() : 0) > ((sportBasicReport3 == null || (calories2 = sportBasicReport3.getCalories()) == null) ? 0 : calories2.intValue())) {
                    sportBasicReport3 = sportBasicReport7;
                }
                if (sportBasicReport7.getDistance() > (sportBasicReport5 != null ? sportBasicReport5.getDistance() : 0)) {
                    sportBasicReport5 = sportBasicReport7;
                }
                if (sportBasicReport7.getDuration() > (sportBasicReport4 != null ? sportBasicReport4.getDuration() : 0)) {
                    sportBasicReport4 = sportBasicReport7;
                }
                Integer gymTrainingTotalTimes4 = sportBasicReport7.getGymTrainingTotalTimes();
                if ((gymTrainingTotalTimes4 != null ? gymTrainingTotalTimes4.intValue() : 0) > ((sportBasicReport6 == null || (gymTrainingTotalTimes2 = sportBasicReport6.getGymTrainingTotalTimes()) == null) ? 0 : gymTrainingTotalTimes2.intValue())) {
                    sportBasicReport6 = sportBasicReport7;
                }
            }
        }
        if (!zAreEqual) {
            SportSummary.SummaryData summaryData4 = sportSummary.info;
            summaryData4.max_avg_pace = ((sportBasicReport == null || (avgPace = sportBasicReport.getAvgPace()) == null) ? 0 : avgPace.intValue()) < intValue(summaryData4.max_avg_pace) ? sportBasicReport != null ? newLocalMaxData(sportBasicReport) : null : summaryData4.max_avg_pace;
            summaryData4.max_avg_speed = ((sportBasicReport2 == null || (avgSpeed = sportBasicReport2.getAvgSpeed()) == null) ? 0.0f : avgSpeed.floatValue()) > floatValue(summaryData4.max_avg_speed) ? sportBasicReport2 != null ? newLocalMaxData(sportBasicReport2) : null : summaryData4.max_avg_speed;
            summaryData4.max_calorie = ((sportBasicReport2 == null || (calories = sportBasicReport2.getCalories()) == null) ? 0 : calories.intValue()) > intValue(summaryData4.max_calorie) ? sportBasicReport3 != null ? newLocalMaxData(sportBasicReport3) : null : summaryData4.max_calorie;
            summaryData4.max_distance = (sportBasicReport2 != null ? sportBasicReport2.getDistance() : 0) > intValue(summaryData4.max_distance) ? sportBasicReport2 != null ? newLocalMaxData(sportBasicReport2) : null : summaryData4.max_distance;
            summaryData4.max_duration = (sportBasicReport4 != null ? sportBasicReport4.getDuration() : 0) > intValue(summaryData4.max_duration) ? sportBasicReport4 != null ? newLocalMaxData(sportBasicReport4) : null : summaryData4.max_duration;
            summaryData4.max_accessory_count = ((sportBasicReport6 == null || (gymTrainingTotalTimes = sportBasicReport6.getGymTrainingTotalTimes()) == null) ? 0 : gymTrainingTotalTimes.intValue()) > intValue(summaryData4.max_accessory_count) ? sportBasicReport6 != null ? newLocalMaxData(sportBasicReport6) : null : summaryData4.max_accessory_count;
        }
        return sportSummary;
    }

    public static final boolean biggerFloatThan(@Nullable SportSummary.MaxData maxData, @Nullable SportSummary.MaxData maxData2) {
        return floatValue(maxData) > floatValue(maxData2);
    }

    public static final boolean biggerIntThan(@Nullable SportSummary.MaxData maxData, @Nullable SportSummary.MaxData maxData2) {
        return intValue(maxData) > intValue(maxData2);
    }

    public static final void findMaxData(@NotNull SportSummaryEntity sportSummaryEntity, @NotNull List<Integer> maxType) {
        Integer gymTrainingTotalTimes;
        Intrinsics.checkNotNullParameter(sportSummaryEntity, "<this>");
        Intrinsics.checkNotNullParameter(maxType, "maxType");
        if (sportSummaryEntity.getSummary().info == null) {
            return;
        }
        List<SportBasicReport> listConvertEntityToReport = SportReportDaoUtils.INSTANCE.convertEntityToReport(FitnessDatabase.INSTANCE.getInstance().sportReportDao().getByCategory(sportSummaryEntity.getCategory(), 0L, Long.MAX_VALUE));
        if (listConvertEntityToReport.isEmpty()) {
            resetMaxData(sportSummaryEntity);
            return;
        }
        Object objFirst = CollectionsKt___CollectionsKt.first((List<? extends Object>) listConvertEntityToReport);
        Object obj = objFirst;
        Object obj2 = obj;
        Object obj3 = obj2;
        Object obj4 = obj3;
        Object obj5 = obj4;
        for (SportBasicReport sportBasicReport : listConvertEntityToReport) {
            Integer avgPace = sportBasicReport.getAvgPace();
            int iIntValue = avgPace != null ? avgPace.intValue() : Integer.MAX_VALUE;
            Integer avgPace2 = ((SportBasicReport) objFirst).getAvgPace();
            if (iIntValue < (avgPace2 != null ? avgPace2.intValue() : Integer.MAX_VALUE)) {
                objFirst = sportBasicReport;
            }
            Float avgSpeed = sportBasicReport.getAvgSpeed();
            float fFloatValue = avgSpeed != null ? avgSpeed.floatValue() : 0.0f;
            Float avgSpeed2 = ((SportBasicReport) obj).getAvgSpeed();
            if (fFloatValue > (avgSpeed2 != null ? avgSpeed2.floatValue() : 0.0f)) {
                obj = sportBasicReport;
            }
            Integer calories = sportBasicReport.getCalories();
            int iIntValue2 = 0;
            int iIntValue3 = calories != null ? calories.intValue() : 0;
            Integer calories2 = ((SportBasicReport) obj2).getCalories();
            if (iIntValue3 > (calories2 != null ? calories2.intValue() : 0)) {
                obj2 = sportBasicReport;
            }
            Integer distance = sportBasicReport.getDistance();
            int iIntValue4 = distance != null ? distance.intValue() : 0;
            Integer distance2 = ((SportBasicReport) obj4).getDistance();
            if (iIntValue4 > (distance2 != null ? distance2.intValue() : 0)) {
                obj4 = sportBasicReport;
            }
            if (sportBasicReport.getDuration() > ((SportBasicReport) obj3).getDuration()) {
                obj3 = sportBasicReport;
            }
            Integer gymTrainingTotalTimes2 = sportBasicReport.getGymTrainingTotalTimes();
            int iIntValue5 = gymTrainingTotalTimes2 != null ? gymTrainingTotalTimes2.intValue() : 0;
            SportBasicReport sportBasicReport2 = (SportBasicReport) obj5;
            if (sportBasicReport2 != null && (gymTrainingTotalTimes = sportBasicReport2.getGymTrainingTotalTimes()) != null) {
                iIntValue2 = gymTrainingTotalTimes.intValue();
            }
            if (iIntValue5 > iIntValue2) {
                obj5 = sportBasicReport;
            }
        }
        SportSummary.SummaryData summaryData = sportSummaryEntity.getSummary().info;
        if (summaryData != null) {
            if (maxType.contains(Integer.valueOf(SportSummary.MaxData.TYPE_PACE))) {
                summaryData.max_avg_pace = newLocalMaxData((SportBasicReport) objFirst);
            }
            if (maxType.contains(Integer.valueOf(SportSummary.MaxData.TYPE_SPEED))) {
                summaryData.max_avg_speed = newLocalMaxData((SportBasicReport) obj);
            }
            if (maxType.contains(Integer.valueOf(SportSummary.MaxData.TYPE_CALORIE))) {
                summaryData.max_calorie = newLocalMaxData((SportBasicReport) obj2);
            }
            if (maxType.contains(Integer.valueOf(SportSummary.MaxData.TYPE_DURATION))) {
                summaryData.max_duration = newLocalMaxData((SportBasicReport) obj3);
            }
            if (maxType.contains(Integer.valueOf(SportSummary.MaxData.TYPE_DISTANCE))) {
                summaryData.max_distance = newLocalMaxData((SportBasicReport) obj4);
            }
            if (maxType.contains(Integer.valueOf(SportSummary.MaxData.TYPE_ACTION_COUNT))) {
                summaryData.max_accessory_count = newLocalMaxData((SportBasicReport) obj5);
            }
        }
    }

    public static final long floatValue(@Nullable SportSummary.MaxData maxData) {
        SportSummary.MaxValue maxValue;
        if (maxData == null || (maxValue = maxData.value) == null) {
            return 0L;
        }
        return maxValue.intValue;
    }

    @NotNull
    public static final List<String> getPreferCategory(boolean z) {
        Object objFromJson = FitnessDataSingleModuleKt.getGson().fromJson(z ? SummaryPrefer.INSTANCE.getSPORT_CATEGORY() : SummaryPrefer.INSTANCE.getSPORT_CATEGORY_OFFLINE(), (Class<Object>) String[].class);
        Intrinsics.checkNotNullExpressionValue(objFromJson, "fromJson(...)");
        return ArraysKt___ArraysKt.toList((Object[]) objFromJson);
    }

    public static final long intValue(@Nullable SportSummary.MaxData maxData) {
        SportSummary.MaxValue maxValue;
        if (maxData == null || (maxValue = maxData.value) == null) {
            return 0L;
        }
        return maxValue.intValue;
    }

    private static final boolean match(SportReportEntity sportReportEntity, SportSummary.MaxData maxData) {
        SportSummary.MaxKey maxKey;
        if (maxData == null) {
            return false;
        }
        String sid = sportReportEntity.getSid();
        SportSummary.MaxKey maxKey2 = maxData.key;
        return Intrinsics.areEqual(sid, maxKey2 != null ? maxKey2.sid : null) && (maxKey = maxData.key) != null && sportReportEntity.getTime() == maxKey.time;
    }

    @NotNull
    public static final List<Integer> minus(@NotNull SportSummaryEntity sportSummaryEntity, @NotNull SportReportEntity reportEntity) {
        SportSummary.SummaryData summaryData;
        Intrinsics.checkNotNullParameter(sportSummaryEntity, "<this>");
        Intrinsics.checkNotNullParameter(reportEntity, "reportEntity");
        SportBasicReport sportBasicReportConvertEntityToReport$default = SportReportDaoUtils.convertEntityToReport$default(SportReportDaoUtils.INSTANCE, reportEntity, null, 2, null);
        if (sportBasicReportConvertEntityToReport$default != null && (summaryData = sportSummaryEntity.getSummary().info) != null) {
            int i = summaryData.total_calorie;
            Integer calories = sportBasicReportConvertEntityToReport$default.getCalories();
            summaryData.total_calorie = i - (calories != null ? calories.intValue() : 0);
            summaryData.total_count--;
            int i2 = summaryData.total_distance;
            Integer distance = sportBasicReportConvertEntityToReport$default.getDistance();
            summaryData.total_distance = i2 - (distance != null ? distance.intValue() : 0);
            summaryData.total_duration -= (long) sportBasicReportConvertEntityToReport$default.getDuration();
            int i3 = summaryData.total_accessory_count;
            Integer gymTrainingTotalTimes = sportBasicReportConvertEntityToReport$default.getGymTrainingTotalTimes();
            summaryData.total_accessory_count = i3 - (gymTrainingTotalTimes != null ? gymTrainingTotalTimes.intValue() : 0);
            if (Intrinsics.areEqual(sportSummaryEntity.getCategory(), "sport_stats_all")) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (match(reportEntity, summaryData.max_avg_pace)) {
                arrayList.add(Integer.valueOf(SportSummary.MaxData.TYPE_PACE));
            }
            if (match(reportEntity, summaryData.max_avg_speed)) {
                arrayList.add(Integer.valueOf(SportSummary.MaxData.TYPE_SPEED));
            }
            if (match(reportEntity, summaryData.max_calorie)) {
                arrayList.add(Integer.valueOf(SportSummary.MaxData.TYPE_CALORIE));
            }
            if (match(reportEntity, summaryData.max_distance)) {
                arrayList.add(Integer.valueOf(SportSummary.MaxData.TYPE_DISTANCE));
            }
            if (match(reportEntity, summaryData.max_duration)) {
                arrayList.add(Integer.valueOf(SportSummary.MaxData.TYPE_DURATION));
            }
            if (match(reportEntity, summaryData.max_accessory_count)) {
                arrayList.add(Integer.valueOf(SportSummary.MaxData.TYPE_ACTION_COUNT));
            }
            return arrayList;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    private static final SportSummary.MaxData newLocalMaxData(SportBasicReport sportBasicReport) {
        SportSummary.MaxData maxData = new SportSummary.MaxData();
        maxData.offline = true;
        SportSummary.MaxKey maxKey = new SportSummary.MaxKey();
        SportReportKey sportReportKey = FitnessPersistKey.INSTANCE.getSportReportKey(sportBasicReport.getSportType());
        maxKey.key = sportReportKey != null ? sportReportKey.getKey() : null;
        maxKey.sid = sportBasicReport.getSid();
        maxKey.time = sportBasicReport.getStartTime();
        maxData.key = maxKey;
        return maxData;
    }

    private static final void resetMaxData(SportSummaryEntity sportSummaryEntity) {
        SportSummary.SummaryData summaryData = sportSummaryEntity.getSummary().info;
        if (summaryData != null) {
            summaryData.max_duration = null;
        }
        SportSummary.SummaryData summaryData2 = sportSummaryEntity.getSummary().info;
        if (summaryData2 != null) {
            summaryData2.max_avg_speed = null;
        }
        SportSummary.SummaryData summaryData3 = sportSummaryEntity.getSummary().info;
        if (summaryData3 != null) {
            summaryData3.max_avg_pace = null;
        }
        SportSummary.SummaryData summaryData4 = sportSummaryEntity.getSummary().info;
        if (summaryData4 != null) {
            summaryData4.max_calorie = null;
        }
        SportSummary.SummaryData summaryData5 = sportSummaryEntity.getSummary().info;
        if (summaryData5 != null) {
            summaryData5.max_distance = null;
        }
        SportSummary.SummaryData summaryData6 = sportSummaryEntity.getSummary().info;
        if (summaryData6 != null) {
            summaryData6.max_accessory_count = null;
        }
    }

    @NotNull
    public static final SportSummaryEntity toSummaryEntity(@NotNull SportSummary sportSummary) {
        String str;
        String str2;
        SportSummary.SummaryKey summaryKey;
        int currentTZOffsetInSec;
        String str3;
        Intrinsics.checkNotNullParameter(sportSummary, "<this>");
        SportSummary.SummaryKey summaryKey2 = sportSummary.key;
        String str4 = (summaryKey2 == null || (str3 = summaryKey2.granularity) == null) ? "" : str3;
        if (Intrinsics.areEqual(summaryKey2 != null ? summaryKey2.stats_type : null, "sport_stats_all")) {
            str = "sport_stats_all";
        } else {
            SportSummary.SummaryKey summaryKey3 = sportSummary.key;
            str = (summaryKey3 == null || (str2 = summaryKey3.category) == null) ? "" : str2;
        }
        boolean zAreEqual = Intrinsics.areEqual(str4, SportDataTypeKt.DIMEN_TOTAL);
        long j = 0;
        if (!zAreEqual && (summaryKey = sportSummary.key) != null) {
            j = summaryKey.time;
        }
        long j2 = j;
        if (zAreEqual) {
            currentTZOffsetInSec = 0;
        } else {
            SportSummary.SummaryKey summaryKey4 = sportSummary.key;
            currentTZOffsetInSec = summaryKey4 != null ? summaryKey4.zone_offset : FitnessDateUtils.getCurrentTZOffsetInSec();
        }
        return new SportSummaryEntity(str, str4, j2, currentTZOffsetInSec, sportSummary);
    }

    @NotNull
    public static final List<SportSummaryEntity> toSummaryList(@NotNull SportSummaryRes sportSummaryRes) {
        Intrinsics.checkNotNullParameter(sportSummaryRes, "<this>");
        ArrayList<SportSummary> arrayList = sportSummaryRes.summaries;
        if (arrayList == null || arrayList.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList<SportSummary> summaries = sportSummaryRes.summaries;
        Intrinsics.checkNotNullExpressionValue(summaries, "summaries");
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(summaries, 10));
        for (SportSummary sportSummary : summaries) {
            Intrinsics.checkNotNull(sportSummary);
            arrayList2.add(toSummaryEntity(sportSummary));
        }
        return arrayList2;
    }

    @NotNull
    public static final SportSummaryEntity toSummaryTotalEntity(@NotNull List<SportReportEntity> list, @NotNull String category) {
        SportSummary.MaxData maxDataNewLocalMaxData;
        SportSummary.MaxData maxDataNewLocalMaxData2;
        SportSummary.MaxData maxDataNewLocalMaxData3;
        SportSummary.MaxData maxDataNewLocalMaxData4;
        SportSummary.MaxData maxDataNewLocalMaxData5;
        SportSummary.MaxData maxData;
        SportSummary.MaxData maxDataNewLocalMaxData6;
        Integer gymTrainingTotalTimes;
        Integer calories;
        Float avgSpeed;
        Integer avgPace;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(category, "category");
        List<SportBasicReport> listConvertEntityToReport = SportReportDaoUtils.INSTANCE.convertEntityToReport(list);
        boolean zAreEqual = Intrinsics.areEqual(category, "sport_stats_all");
        SportSummary sportSummary = new SportSummary();
        SportSummary.SummaryKey summaryKey = new SportSummary.SummaryKey();
        summaryKey.stats_type = zAreEqual ? "sport_stats_all" : SportSummaryDaoKt.SPORT_CATEGORY_SPECIFY;
        summaryKey.category = category;
        summaryKey.granularity = SportDataTypeKt.DIMEN_TOTAL;
        sportSummary.key = summaryKey;
        sportSummary.info = new SportSummary.SummaryData();
        SportSummaryEntity sportSummaryEntity = new SportSummaryEntity(category, SportDataTypeKt.DIMEN_TOTAL, 0L, 0, sportSummary);
        SportSummary.SummaryData summaryData = sportSummary.info;
        SportBasicReport sportBasicReport = null;
        SportBasicReport sportBasicReport2 = null;
        SportBasicReport sportBasicReport3 = null;
        SportBasicReport sportBasicReport4 = null;
        SportBasicReport sportBasicReport5 = null;
        SportBasicReport sportBasicReport6 = null;
        for (SportBasicReport sportBasicReport7 : listConvertEntityToReport) {
            int i = summaryData.total_calorie;
            Integer calories2 = sportBasicReport7.getCalories();
            summaryData.total_calorie = i + (calories2 != null ? calories2.intValue() : 0);
            summaryData.total_count++;
            summaryData.total_distance += sportBasicReport7.getDistance();
            summaryData.total_duration += (long) sportBasicReport7.getDuration();
            int i2 = summaryData.total_accessory_count;
            Integer gymTrainingTotalTimes2 = sportBasicReport7.getGymTrainingTotalTimes();
            summaryData.total_accessory_count = i2 + (gymTrainingTotalTimes2 != null ? gymTrainingTotalTimes2.intValue() : 0);
            if (!zAreEqual) {
                Integer avgPace2 = sportBasicReport7.getAvgPace();
                int iIntValue = Integer.MAX_VALUE;
                int iIntValue2 = avgPace2 != null ? avgPace2.intValue() : Integer.MAX_VALUE;
                if (sportBasicReport != null && (avgPace = sportBasicReport.getAvgPace()) != null) {
                    iIntValue = avgPace.intValue();
                }
                if (iIntValue2 < iIntValue) {
                    sportBasicReport = sportBasicReport7;
                }
                Float avgSpeed2 = sportBasicReport7.getAvgSpeed();
                if ((avgSpeed2 != null ? avgSpeed2.floatValue() : 0.0f) > ((sportBasicReport2 == null || (avgSpeed = sportBasicReport2.getAvgSpeed()) == null) ? 0.0f : avgSpeed.floatValue())) {
                    sportBasicReport2 = sportBasicReport7;
                }
                Integer calories3 = sportBasicReport7.getCalories();
                if ((calories3 != null ? calories3.intValue() : 0) > ((sportBasicReport3 == null || (calories = sportBasicReport3.getCalories()) == null) ? 0 : calories.intValue())) {
                    sportBasicReport3 = sportBasicReport7;
                }
                if (sportBasicReport7.getDistance() > (sportBasicReport4 != null ? sportBasicReport4.getDistance() : 0)) {
                    sportBasicReport4 = sportBasicReport7;
                }
                if (sportBasicReport7.getDuration() > (sportBasicReport5 != null ? sportBasicReport5.getDuration() : 0)) {
                    sportBasicReport5 = sportBasicReport7;
                }
                Integer gymTrainingTotalTimes3 = sportBasicReport7.getGymTrainingTotalTimes();
                if ((gymTrainingTotalTimes3 != null ? gymTrainingTotalTimes3.intValue() : 0) > ((sportBasicReport6 == null || (gymTrainingTotalTimes = sportBasicReport6.getGymTrainingTotalTimes()) == null) ? 0 : gymTrainingTotalTimes.intValue())) {
                    sportBasicReport6 = sportBasicReport7;
                }
            }
        }
        if (!zAreEqual) {
            if (sportBasicReport == null || (maxDataNewLocalMaxData = newLocalMaxData(sportBasicReport)) == null) {
                maxDataNewLocalMaxData = null;
            } else {
                SportSummary.MaxValue maxValue = new SportSummary.MaxValue();
                Integer avgPace3 = sportBasicReport.getAvgPace();
                maxValue.intValue = avgPace3 != null ? avgPace3.intValue() : 0;
                maxDataNewLocalMaxData.value = maxValue;
            }
            summaryData.max_avg_pace = maxDataNewLocalMaxData;
            if (sportBasicReport2 == null || (maxDataNewLocalMaxData2 = newLocalMaxData(sportBasicReport2)) == null) {
                maxDataNewLocalMaxData2 = null;
            } else {
                SportSummary.MaxValue maxValue2 = new SportSummary.MaxValue();
                Float avgSpeed3 = sportBasicReport2.getAvgSpeed();
                maxValue2.floatValue = avgSpeed3 != null ? avgSpeed3.floatValue() : 0.0f;
                maxDataNewLocalMaxData2.value = maxValue2;
            }
            summaryData.max_avg_speed = maxDataNewLocalMaxData2;
            if (sportBasicReport3 == null || (maxDataNewLocalMaxData3 = newLocalMaxData(sportBasicReport3)) == null) {
                maxDataNewLocalMaxData3 = null;
            } else {
                SportSummary.MaxValue maxValue3 = new SportSummary.MaxValue();
                Integer calories4 = sportBasicReport3.getCalories();
                maxValue3.intValue = calories4 != null ? calories4.intValue() : 0;
                maxDataNewLocalMaxData3.value = maxValue3;
            }
            summaryData.max_calorie = maxDataNewLocalMaxData3;
            if (sportBasicReport4 == null || (maxDataNewLocalMaxData4 = newLocalMaxData(sportBasicReport4)) == null) {
                maxDataNewLocalMaxData4 = null;
            } else {
                SportSummary.MaxValue maxValue4 = new SportSummary.MaxValue();
                maxValue4.intValue = sportBasicReport4.getDistance();
                maxDataNewLocalMaxData4.value = maxValue4;
            }
            summaryData.max_distance = maxDataNewLocalMaxData4;
            if (sportBasicReport5 == null || (maxDataNewLocalMaxData5 = newLocalMaxData(sportBasicReport5)) == null) {
                maxDataNewLocalMaxData5 = null;
            } else {
                SportSummary.MaxValue maxValue5 = new SportSummary.MaxValue();
                maxValue5.intValue = sportBasicReport5.getDuration();
                maxDataNewLocalMaxData5.value = maxValue5;
            }
            summaryData.max_duration = maxDataNewLocalMaxData5;
            if (sportBasicReport6 == null || (maxDataNewLocalMaxData6 = newLocalMaxData(sportBasicReport6)) == null) {
                maxData = null;
            } else {
                SportSummary.MaxValue maxValue6 = new SportSummary.MaxValue();
                Integer gymTrainingTotalTimes4 = sportBasicReport6.getGymTrainingTotalTimes();
                maxValue6.intValue = gymTrainingTotalTimes4 != null ? gymTrainingTotalTimes4.intValue() : 0;
                maxDataNewLocalMaxData6.value = maxValue6;
                maxData = maxDataNewLocalMaxData6;
            }
            summaryData.max_accessory_count = maxData;
        }
        return sportSummaryEntity;
    }
}
