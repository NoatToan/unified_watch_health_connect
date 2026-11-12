package com.xiaomi.hm.health.training.ui.activity.trainplay;

import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public interface ITrainPlayView {
    void dismissPause(TrainingPlayActivity trainingPlayActivity);

    void dismissRest(TrainingPlayActivity trainingPlayActivity);

    void onResume(TrainingPlayActivity trainingPlayActivity);

    void onStop(TrainingPlayActivity trainingPlayActivity);

    void showPause(TrainingPlayActivity trainingPlayActivity, ArrayList<ActionContent> arrayList, long j, int i);

    void showRest(TrainingPlayActivity trainingPlayActivity, ArrayList<ActionContent> arrayList, long j, int i);
}
