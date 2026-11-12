package com.xiaomi.hm.health.traininglib.event;

import com.xiaomi.hm.health.databases.model.trainning.TrainingRecord;

/* JADX INFO: loaded from: classes22.dex */
public class EventFinishCurrentTraining {
    public TrainingRecord trainingRecord;

    public EventFinishCurrentTraining(TrainingRecord trainingRecord) {
        this.trainingRecord = trainingRecord;
    }
}
