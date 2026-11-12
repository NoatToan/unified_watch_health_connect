package com.xiaomi.fit.fitness.parser.utils;

import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.fitness.parser.data.ParsedDailyRecord;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.utils.DailyRecordCsvUtils;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u001e\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\b\u0010\u000f\u001a\u00020\u0005H\u0002J\u0014\u0010\u0010\u001a\u00020\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/utils/DailyRecordCsvUtils;", "", "<init>", "()V", "TAG", "", "SPLIT", "writeFile", "", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "recordList", "", "Lcom/xiaomi/fit/fitness/parser/data/ParsedDailyRecord;", "writeLocationListCSV2", "getColumnTitleName", "getEachColumnStr", "dailyRecord", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDailyRecordCsvUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DailyRecordCsvUtils.kt\ncom/xiaomi/fit/fitness/parser/utils/DailyRecordCsvUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1863#2,2:64\n*S KotlinDebug\n*F\n+ 1 DailyRecordCsvUtils.kt\ncom/xiaomi/fit/fitness/parser/utils/DailyRecordCsvUtils\n*L\n26#1:64,2\n*E\n"})
public final class DailyRecordCsvUtils {

    @NotNull
    public static final DailyRecordCsvUtils INSTANCE = new DailyRecordCsvUtils();

    @NotNull
    private static final String TAG = "DailyRecordCsvUtils";

    @NotNull
    private static final String SPLIT = DebugFileCsvUtils.INSTANCE.getSPLIT();

    private DailyRecordCsvUtils() {
    }

    private final String getColumnTitleName() {
        return getEachColumnStr(null);
    }

    private final String getEachColumnStr(ParsedDailyRecord dailyRecord) {
        Object steps;
        Object calories;
        Object totalCal;
        Object activityType;
        Object activityHILevel;
        Object sportType;
        Object distance;
        Object isAbnormalHr;
        Object hr;
        Object hrPreAbnormal;
        Object energy;
        Object energyState;
        Object energyStateValue;
        Object spo2;
        Object stress;
        Object lightValue;
        boolean z = dailyRecord == null;
        StringBuilder sb = new StringBuilder();
        sb.append(dailyRecord != null ? Long.valueOf(dailyRecord.getTime()) : "time");
        String str = SPLIT;
        sb.append(str);
        Object bodyMomentum = null;
        if (z) {
            steps = "steps";
        } else {
            steps = dailyRecord != null ? dailyRecord.getSteps() : null;
        }
        sb.append(steps);
        sb.append(str);
        if (z) {
            calories = "calories";
        } else {
            calories = dailyRecord != null ? dailyRecord.getCalories() : null;
        }
        sb.append(calories);
        sb.append(str);
        if (z) {
            totalCal = "totalCal";
        } else {
            totalCal = dailyRecord != null ? dailyRecord.getTotalCal() : null;
        }
        sb.append(totalCal);
        sb.append(str);
        if (z) {
            activityType = "activityType";
        } else {
            activityType = dailyRecord != null ? dailyRecord.getActivityType() : null;
        }
        sb.append(activityType);
        sb.append(str);
        if (z) {
            activityHILevel = "activityHILevel";
        } else {
            activityHILevel = dailyRecord != null ? dailyRecord.getActivityHILevel() : null;
        }
        sb.append(activityHILevel);
        sb.append(str);
        if (z) {
            sportType = DailyRecordKey.sportType;
        } else {
            sportType = dailyRecord != null ? dailyRecord.getSportType() : null;
        }
        sb.append(sportType);
        sb.append(str);
        if (z) {
            distance = "distance";
        } else {
            distance = dailyRecord != null ? dailyRecord.getDistance() : null;
        }
        sb.append(distance);
        sb.append(str);
        if (z) {
            isAbnormalHr = "isAbnormalHr";
        } else {
            isAbnormalHr = dailyRecord != null ? dailyRecord.getIsAbnormalHr() : null;
        }
        sb.append(isAbnormalHr);
        sb.append(str);
        if (z) {
            hr = "hr";
        } else {
            hr = dailyRecord != null ? dailyRecord.getHr() : null;
        }
        sb.append(hr);
        sb.append(str);
        if (z) {
            hrPreAbnormal = "hrPreAbnormal";
        } else {
            hrPreAbnormal = dailyRecord != null ? dailyRecord.getHrPreAbnormal() : null;
        }
        sb.append(hrPreAbnormal);
        sb.append(str);
        if (z) {
            energy = "energy";
        } else {
            energy = dailyRecord != null ? dailyRecord.getEnergy() : null;
        }
        sb.append(energy);
        sb.append(str);
        if (z) {
            energyState = "energyState";
        } else {
            energyState = dailyRecord != null ? dailyRecord.getEnergyState() : null;
        }
        sb.append(energyState);
        sb.append(str);
        if (z) {
            energyStateValue = "energyStateValue";
        } else {
            energyStateValue = dailyRecord != null ? dailyRecord.getEnergyStateValue() : null;
        }
        sb.append(energyStateValue);
        sb.append(str);
        if (z) {
            spo2 = "spo2";
        } else {
            spo2 = dailyRecord != null ? dailyRecord.getSpo2() : null;
        }
        sb.append(spo2);
        sb.append(str);
        if (z) {
            stress = "stress";
        } else {
            stress = dailyRecord != null ? dailyRecord.getStress() : null;
        }
        sb.append(stress);
        sb.append(str);
        if (z) {
            lightValue = "lightValue";
        } else {
            lightValue = dailyRecord != null ? dailyRecord.getLightValue() : null;
        }
        sb.append(lightValue);
        sb.append(str);
        if (z) {
            bodyMomentum = "bodyMomentum";
        } else if (dailyRecord != null) {
            bodyMomentum = dailyRecord.getBodyMomentum();
        }
        sb.append(bodyMomentum);
        sb.append(str);
        sb.append("\n");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String getEachColumnStr$default(DailyRecordCsvUtils dailyRecordCsvUtils, ParsedDailyRecord parsedDailyRecord, int i, Object obj) {
        if ((i & 1) != 0) {
            parsedDailyRecord = null;
        }
        return dailyRecordCsvUtils.getEachColumnStr(parsedDailyRecord);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeFile$lambda$0(FitnessDataId dataId, List recordList) {
        Intrinsics.checkNotNullParameter(dataId, "$dataId");
        Intrinsics.checkNotNullParameter(recordList, "$recordList");
        INSTANCE.writeLocationListCSV2(dataId, recordList);
    }

    private final void writeLocationListCSV2(FitnessDataId dataId, List<ParsedDailyRecord> recordList) {
        DebugFileCsvUtils debugFileCsvUtils = DebugFileCsvUtils.INSTANCE;
        File theCsvStorageFile$default = DebugFileCsvUtils.getTheCsvStorageFile$default(debugFileCsvUtils, dataId, 0, 2, null);
        if (debugFileCsvUtils.writeCSV(theCsvStorageFile$default, getColumnTitleName(), false)) {
            Iterator<T> it = recordList.iterator();
            while (it.hasNext()) {
                DebugFileCsvUtils.INSTANCE.writeCSV(theCsvStorageFile$default, INSTANCE.getEachColumnStr((ParsedDailyRecord) it.next()), true);
            }
        }
    }

    public final void writeFile(@NotNull final FitnessDataId dataId, @NotNull final List<ParsedDailyRecord> recordList) {
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        Intrinsics.checkNotNullParameter(recordList, "recordList");
        if (recordList.isEmpty()) {
            return;
        }
        ExecutorHelper.INSTANCE.getIoThreadPool().execute(new Runnable() { // from class: uj5
            @Override // java.lang.Runnable
            public final void run() {
                DailyRecordCsvUtils.writeFile$lambda$0(dataId, recordList);
            }
        });
    }
}
