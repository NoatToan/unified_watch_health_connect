package com.xiaomi.hm.health.training.ui.helper;

import com.xiaomi.hm.health.databases.model.trainning.TrainingDetail;
import com.xiaomi.hm.health.databases.model.trainning.TrainingItem;

/* JADX INFO: loaded from: classes21.dex */
public class DataConverter {
    public static TrainingItem toTrainingItem(TrainingDetail trainingDetail, boolean z) {
        TrainingItem trainingItem = new TrainingItem();
        trainingItem.isParticipate = Boolean.valueOf(z);
        trainingItem.trainingId = trainingDetail.trainingId;
        trainingItem.name = trainingDetail.name;
        trainingItem.participantNumber = trainingDetail.participantNumber;
        trainingItem.instrument = trainingDetail.instrument;
        trainingItem.location = trainingDetail.location;
        trainingItem.time = trainingDetail.time;
        trainingItem.difficultyDegree = trainingDetail.difficultyDegree;
        trainingItem.listPageIllustrated = trainingDetail.listPageIllustrated;
        trainingItem.updateTime = trainingDetail.updateTime;
        trainingItem.trainingType = trainingDetail.trainingType;
        return trainingItem;
    }
}
