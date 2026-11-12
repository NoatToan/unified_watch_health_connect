package com.xiaomi.hm.health.traininglib.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public class FinishDownload implements Serializable {
    public com.xiaomi.hm.health.databases.model.trainning.TrainingItem trainingItem;

    public FinishDownload(com.xiaomi.hm.health.databases.model.trainning.TrainingItem trainingItem) {
        this.trainingItem = trainingItem;
    }
}
