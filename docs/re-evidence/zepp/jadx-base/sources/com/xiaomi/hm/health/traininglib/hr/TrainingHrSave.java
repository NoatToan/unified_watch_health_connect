package com.xiaomi.hm.health.traininglib.hr;

import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.trainning.TrainingHeartRate;

/* JADX INFO: loaded from: classes22.dex */
public class TrainingHrSave {
    public static void a(TrainingActiveHr trainingActiveHr) {
        TrainingHeartRate trainingHeartRate = new TrainingHeartRate();
        trainingHeartRate.setTrainingId(trainingActiveHr.getTrainingId());
        trainingHeartRate.setTrainingPlanId(trainingActiveHr.getTrainingPlanId());
        trainingHeartRate.setTrainingStartTime(trainingActiveHr.getTrainingStartTime());
        trainingHeartRate.setRecordTime(Long.valueOf(trainingActiveHr.getHrRecordTimeStamp()));
        trainingHeartRate.setIndex(Long.valueOf(trainingActiveHr.getIndex()));
        trainingHeartRate.setHeartRate(Integer.valueOf(trainingActiveHr.getHr()));
        HMDaoManager.getInstance().getTrainingHeartRateDao().insertOrReplace(trainingHeartRate);
    }
}
