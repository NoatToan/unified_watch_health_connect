package com.xiaomi.hm.health.training.media.strategy;

import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.training.ui.fragment.TrainingPlayingFragment;

/* JADX INFO: loaded from: classes21.dex */
public interface IPlayActionVideoCircleProgressStrategy {
    void notifyCircleProgress(TrainingPlayingFragment trainingPlayingFragment, ActionContent actionContent, int i);
}
