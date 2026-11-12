package com.xiaomi.hm.health.training.media.strategy.trainImpl;

import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.training.media.strategy.IPlayActionVideoCircleProgressStrategy;
import com.xiaomi.hm.health.training.ui.fragment.TrainingPlayingFragment;
import com.xiaomi.hm.health.traininglib.webapi.ParseJsonUtil;

/* JADX INFO: loaded from: classes21.dex */
public class OldActionVideoCricleProgressStrategy implements IPlayActionVideoCircleProgressStrategy {
    @Override // com.xiaomi.hm.health.training.media.strategy.IPlayActionVideoCircleProgressStrategy
    public void notifyCircleProgress(TrainingPlayingFragment trainingPlayingFragment, ActionContent actionContent, int i) {
        trainingPlayingFragment.finishedIndex = i;
        synchronized (trainingPlayingFragment.trainingArcProgress.dataLock) {
            trainingPlayingFragment.trainingArcProgress.resetProgress();
            trainingPlayingFragment.trainingArcProgress.setTrainingTotaltime(Integer.parseInt(ParseJsonUtil.getStringByGender(actionContent.duration, ActionVideoPlayCommon.getTrainer())));
            if ("TIME".equals(ActionVideoPlayCommon.getActionType(actionContent))) {
                ActionVideoPlayCommon.notifyArcProgressOther(trainingPlayingFragment, 1000L, 1, 0);
            } else {
                ActionVideoPlayCommon.notifyArcProgressOther(trainingPlayingFragment, actionContent.actionVideo.singleActionTime.longValue(), 2, actionContent.repeatNumber.intValue());
            }
        }
    }
}
