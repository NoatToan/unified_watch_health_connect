package com.xiaomi.hm.health.training.media.strategy.trainImpl;

import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.training.media.strategy.IPlayActionVideoCircleProgressStrategy;
import com.xiaomi.hm.health.training.ui.fragment.TrainingPlayingFragment;

/* JADX INFO: loaded from: classes21.dex */
public class NewActionVideoCricleProgressStrategy implements IPlayActionVideoCircleProgressStrategy {
    @Override // com.xiaomi.hm.health.training.media.strategy.IPlayActionVideoCircleProgressStrategy
    public void notifyCircleProgress(TrainingPlayingFragment trainingPlayingFragment, ActionContent actionContent, int i) {
        long singleActionTime;
        long jIntValue;
        trainingPlayingFragment.finishedIndex = i;
        synchronized (trainingPlayingFragment.trainingArcProgress.dataLock) {
            trainingPlayingFragment.trainingArcProgress.resetProgress();
            if ("TIME".equals(ActionVideoPlayCommon.getActionType(actionContent))) {
                jIntValue = ActionVideoPlayCommon.getCricleProgressDurationTime(actionContent);
                singleActionTime = 1000;
            } else {
                singleActionTime = ActionVideoPlayCommon.getSingleActionTime(actionContent);
                jIntValue = ((long) actionContent.getRepeatNumber().intValue()) * singleActionTime;
            }
            trainingPlayingFragment.trainingArcProgress.setTrainingTotaltime(jIntValue);
            if ("TIME".equals(ActionVideoPlayCommon.getActionType(actionContent))) {
                ActionVideoPlayCommon.notifyArcProgressOther(trainingPlayingFragment, singleActionTime, 1, 0);
            } else {
                ActionVideoPlayCommon.notifyArcProgressOther(trainingPlayingFragment, singleActionTime, 2, actionContent.getRepeatNumber().intValue());
            }
        }
    }
}
