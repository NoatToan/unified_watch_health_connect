package com.xiaomi.hm.health.traininglib.util;

import com.xiaomi.hm.health.databases.model.trainning.TrainingHeartRate;
import com.xiaomi.hm.health.databases.model.trainning.TrainingRecord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingRecordUtils {
    private static int a(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    private static long b(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static int parseAverageHeartRate(TrainingRecord trainingRecord) {
        Integer num = trainingRecord.averageHeartRate;
        if (num != null && num.intValue() > 0) {
            return trainingRecord.averageHeartRate.intValue();
        }
        List<TrainingHeartRate> heartRateListFromCsv = trainingRecord.heartRateList;
        if (heartRateListFromCsv == null || heartRateListFromCsv.isEmpty()) {
            heartRateListFromCsv = parseHeartRateListFromCsv(trainingRecord);
        }
        int iIntValue = 0;
        if (heartRateListFromCsv == null || heartRateListFromCsv.isEmpty()) {
            trainingRecord.averageHeartRate = 0;
        } else {
            Iterator<TrainingHeartRate> it2 = heartRateListFromCsv.iterator();
            while (it2.hasNext()) {
                iIntValue += it2.next().heartRate.intValue();
            }
            trainingRecord.averageHeartRate = Integer.valueOf(iIntValue / heartRateListFromCsv.size());
        }
        return trainingRecord.averageHeartRate.intValue();
    }

    public static List<TrainingHeartRate> parseHeartRateListFromCsv(TrainingRecord trainingRecord) {
        String str = trainingRecord.heartRate;
        if (str == null || str.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long jLongValue = trainingRecord.startTime.longValue() / 1000;
        String[] strArrSplit = trainingRecord.heartRate.split(";");
        int iIntValue = 0;
        for (int i = 0; i < strArrSplit.length; i++) {
            String[] strArrSplit2 = strArrSplit[i].split(",");
            long jB = b(strArrSplit2[0], 1L);
            int iA = a(strArrSplit2[1], 0);
            TrainingHeartRate trainingHeartRate = new TrainingHeartRate();
            trainingHeartRate.setRecordTime(Long.valueOf(jLongValue + jB));
            trainingHeartRate.setHeartRate(Integer.valueOf(iIntValue + iA));
            trainingHeartRate.setIndex(Long.valueOf(((long) i) + 1));
            trainingHeartRate.setTrainingId(trainingRecord.trainingId);
            trainingHeartRate.setTrainingStartTime(trainingRecord.startTime);
            arrayList.add(trainingHeartRate);
            jLongValue = trainingHeartRate.getRecordTime().longValue();
            iIntValue = trainingHeartRate.getHeartRate().intValue();
        }
        trainingRecord.heartRateList = arrayList;
        return arrayList;
    }
}
