package com.xiaomi.fit.fitness.device;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyCalorieReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.CalorieRecord;
import com.xiaomi.fit.fitness.export.data.aggregation.record.MHStrengthRecord;
import com.xiaomi.fit.fitness.export.data.aggregation.record.StepRecord;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b&\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u001d\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0012j\b\u0012\u0004\u0012\u00020\u0005`\u0011H\u0002¢\u0006\u0002\u0010\u0013J\u001d\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0012j\b\u0012\u0004\u0012\u00020\u0005`\u0011H\u0004¢\u0006\u0002\u0010\u0013Ji\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0012j\b\u0012\u0004\u0012\u00020\u0005`\u00110\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001a2\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0012j\b\u0012\u0004\u0012\u00020\u0005`\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\u001cJ&\u0010\u001d\u001a\u00020\u001e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0001H\u0002J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u000fH\u0002J<\u0010#\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0012j\b\u0012\u0004\u0012\u00020\u0005`\u00110\u00162\u0006\u0010$\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0004J<\u0010%\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0012j\b\u0012\u0004\u0012\u00020\u0005`\u00110\u00162\u0006\u0010$\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0004J<\u0010&\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0012j\b\u0012\u0004\u0012\u00020\u0005`\u00110\u00162\u0006\u0010$\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0004R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006("}, d2 = {"Lcom/xiaomi/fit/fitness/device/BaseVitaliyData;", "", "<init>", "()V", "halfAnHourSecond", "", "getHalfAnHourSecond", "()I", "anHourSecond", "getAnHourSecond", "sendToWear", "", "dailyGoalReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "todayZeroTimeSecond", "", "initVitaliyDetailData48", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "initVitaliyDetailData24", "getDataListWithHalfHour", "Lkotlin/Pair;", "type", "", "appDataList", "", "deviceDataList", "(Ljava/lang/String;Ljava/util/List;Ljava/util/ArrayList;JI)Lkotlin/Pair;", "isQualified", "", "index", "data", "checkTime", "startTime", "buildStepDataDetail", "report", "buildCalDataDetail", "buildStrengthDataDetail", "Companion", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseVitaliyData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseVitaliyData.kt\ncom/xiaomi/fit/fitness/device/BaseVitaliyData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,204:1\n785#2:205\n796#2:206\n1872#2,2:207\n797#2,2:209\n1874#2:211\n799#2:212\n1557#2:213\n1628#2,3:214\n1053#2:217\n1053#2:218\n1053#2:219\n*S KotlinDebug\n*F\n+ 1 BaseVitaliyData.kt\ncom/xiaomi/fit/fitness/device/BaseVitaliyData\n*L\n50#1:205\n50#1:206\n50#1:207,2\n50#1:209,2\n50#1:211\n50#1:212\n52#1:213\n52#1:214,3\n151#1:217\n169#1:218\n192#1:219\n*E\n"})
public abstract class BaseVitaliyData {

    @NotNull
    public static final String TAG = "BaseVitaliyData";
    private final int halfAnHourSecond = 1800;
    private final int anHourSecond = 3600;

    private final boolean checkTime(long startTime) {
        try {
            long j = 1800;
            if (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - TimeDateUtil.getCurrentHourTime() < j) {
                if (startTime == TimeDateUtil.getCurrentHourTime()) {
                    return false;
                }
            } else if (startTime == TimeDateUtil.getCurrentHourTime() + j) {
                return false;
            }
            return true;
        } catch (Exception e) {
            Logger.e(TAG, "e:" + e);
            return false;
        }
    }

    private final Pair<Integer, ArrayList<Integer>> getDataListWithHalfHour(String type, List<? extends Object> appDataList, ArrayList<Integer> deviceDataList, long todayZeroTimeSecond, int halfAnHourSecond) {
        Object obj;
        FitnessLogUtils.i(TAG, "Vitaliy Data,before handle, type :" + type + " , list:" + appDataList);
        int minutes = 0;
        if (appDataList == null) {
            return new Pair<>(0, deviceDataList);
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj2 : appDataList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            if (isQualified(appDataList, i, obj2)) {
                arrayList.add(obj2);
            }
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (Object obj3 : arrayList) {
            if (obj3 instanceof CalorieRecord) {
                CalorieRecord calorieRecord = (CalorieRecord) obj3;
                minutes += calorieRecord.getCalories();
                int time = (int) ((calorieRecord.getTime() - todayZeroTimeSecond) / ((long) halfAnHourSecond));
                Logger.i(TAG, "CalorieRecord , index : " + time);
                if (time >= 0 && time < deviceDataList.size()) {
                    deviceDataList.set(time, Integer.valueOf(calorieRecord.getCalories()));
                }
                obj = Unit.INSTANCE;
            } else if (obj3 instanceof StepRecord) {
                StepRecord stepRecord = (StepRecord) obj3;
                minutes += stepRecord.getSteps();
                int time2 = (int) ((stepRecord.getTime() - todayZeroTimeSecond) / ((long) halfAnHourSecond));
                Logger.i(TAG, "StepRecord , index : " + time2);
                if (time2 >= 0 && time2 < deviceDataList.size()) {
                    deviceDataList.set(time2, Integer.valueOf(stepRecord.getSteps()));
                }
                obj = Unit.INSTANCE;
            } else if (obj3 instanceof MHStrengthRecord) {
                MHStrengthRecord mHStrengthRecord = (MHStrengthRecord) obj3;
                minutes += mHStrengthRecord.getMinutes();
                int time3 = (int) ((mHStrengthRecord.getTime() - todayZeroTimeSecond) / ((long) halfAnHourSecond));
                Logger.i(TAG, "MHStrengthRecord , index : " + time3);
                if (time3 >= 0 && time3 < deviceDataList.size()) {
                    deviceDataList.set(time3, Integer.valueOf(mHStrengthRecord.getMinutes()));
                }
                obj = Unit.INSTANCE;
            } else {
                obj = deviceDataList;
            }
            arrayList2.add(obj);
        }
        FitnessLogUtils.i(TAG, "Vitaliy Data ,after handle,type:" + type + ", list:" + deviceDataList + " , total:" + minutes);
        return new Pair<>(Integer.valueOf(minutes), deviceDataList);
    }

    private final ArrayList<Integer> initVitaliyDetailData48() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 48; i++) {
            arrayList.add(0);
        }
        return arrayList;
    }

    private final boolean isQualified(List<? extends Object> appDataList, int index, Object data) {
        if (data instanceof CalorieRecord) {
            CalorieRecord calorieRecord = (CalorieRecord) data;
            if (calorieRecord.getCalories() != 0 && checkTime(calorieRecord.getTime())) {
                return true;
            }
        } else if (data instanceof StepRecord) {
            StepRecord stepRecord = (StepRecord) data;
            if (stepRecord.getSteps() != 0 && checkTime(stepRecord.getTime())) {
                return true;
            }
        } else if (data instanceof MHStrengthRecord) {
            MHStrengthRecord mHStrengthRecord = (MHStrengthRecord) data;
            if (mHStrengthRecord.getMinutes() != 0 && checkTime(mHStrengthRecord.getTime())) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final Pair<Integer, ArrayList<Integer>> buildCalDataDetail(@NotNull DailyGoalReport report, long todayZeroTimeSecond, int halfAnHourSecond) {
        List<CalorieRecord> calRecords;
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList<Integer> arrayListInitVitaliyDetailData48 = initVitaliyDetailData48();
        DailyCalorieReport calReport = report.getCalReport();
        return getDataListWithHalfHour(StepsInfo.KEY_CALORIES, (calReport == null || (calRecords = calReport.getCalRecords()) == null) ? null : CollectionsKt___CollectionsKt.sortedWith(calRecords, new Comparator() { // from class: com.xiaomi.fit.fitness.device.BaseVitaliyData$buildCalDataDetail$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((CalorieRecord) t).getTime()), Long.valueOf(((CalorieRecord) t2).getTime()));
            }
        }), arrayListInitVitaliyDetailData48, todayZeroTimeSecond, halfAnHourSecond);
    }

    @NotNull
    public final Pair<Integer, ArrayList<Integer>> buildStepDataDetail(@NotNull DailyGoalReport report, long todayZeroTimeSecond, int halfAnHourSecond) {
        List<StepRecord> stepRecords;
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList<Integer> arrayListInitVitaliyDetailData48 = initVitaliyDetailData48();
        DailyStepReport stepReport = report.getStepReport();
        return getDataListWithHalfHour("step", (stepReport == null || (stepRecords = stepReport.getStepRecords()) == null) ? null : CollectionsKt___CollectionsKt.sortedWith(stepRecords, new Comparator() { // from class: com.xiaomi.fit.fitness.device.BaseVitaliyData$buildStepDataDetail$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((StepRecord) t).getTime()), Long.valueOf(((StepRecord) t2).getTime()));
            }
        }), arrayListInitVitaliyDetailData48, todayZeroTimeSecond, halfAnHourSecond);
    }

    @NotNull
    public final Pair<Integer, ArrayList<Integer>> buildStrengthDataDetail(@NotNull DailyGoalReport report, long todayZeroTimeSecond, int halfAnHourSecond) {
        List<MHStrengthRecord> recordList;
        Intrinsics.checkNotNullParameter(report, "report");
        ArrayList<Integer> arrayListInitVitaliyDetailData48 = initVitaliyDetailData48();
        DailyMHStrengthReport mhStrengthReport = report.getMhStrengthReport();
        return getDataListWithHalfHour("strength", (mhStrengthReport == null || (recordList = mhStrengthReport.getRecordList()) == null) ? null : CollectionsKt___CollectionsKt.sortedWith(recordList, new Comparator() { // from class: com.xiaomi.fit.fitness.device.BaseVitaliyData$buildStrengthDataDetail$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((MHStrengthRecord) t).getTime()), Long.valueOf(((MHStrengthRecord) t2).getTime()));
            }
        }), arrayListInitVitaliyDetailData48, todayZeroTimeSecond, halfAnHourSecond);
    }

    public final int getAnHourSecond() {
        return this.anHourSecond;
    }

    public final int getHalfAnHourSecond() {
        return this.halfAnHourSecond;
    }

    @NotNull
    public final ArrayList<Integer> initVitaliyDetailData24() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 24; i++) {
            arrayList.add(0);
        }
        return arrayList;
    }

    public abstract void sendToWear(@NotNull DailyGoalReport dailyGoalReport, long todayZeroTimeSecond);
}
