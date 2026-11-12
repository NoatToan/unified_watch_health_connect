package com.xiaomi.hm.health.training.media.strategy.trainImpl;

import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideo;
import com.xiaomi.hm.health.training.media.PlaybackControl;
import com.xiaomi.hm.health.training.media.strategy.IPlayActionVideoBottomProgressStrategy;
import com.xiaomi.hm.health.training.ui.fragment.TrainingPlayingFragment;
import com.xiaomi.hm.health.training.ui.widget.TrainingActionBarProgressView;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class NewPlayActionVideoBottomProgress extends IPlayActionVideoBottomProgressStrategy {
    @Override // com.xiaomi.hm.health.training.media.strategy.IPlayActionVideoBottomProgressStrategy
    public void initBottomProgress(TrainingPlayingFragment trainingPlayingFragment) {
        TrainerInfo trainer = ActionVideoPlayCommon.getTrainer();
        for (ActionContent actionContent : trainingPlayingFragment.trainingDetail.content) {
            trainingPlayingFragment.actionAlltime += getDurationTime(actionContent);
            List<ActionVideo> list = actionContent.videos;
            if (list != null && list.size() > 0) {
                actionContent.actionVideo = list.get(0);
                if (list.size() == 2 && actionContent.actionVideo.gender.intValue() != trainer.gender) {
                    actionContent.actionVideo = list.get(1);
                }
            }
            actionContent.actionVideo.setType(actionContent.getType());
        }
        trainingPlayingFragment.trainingBarProgress.setTrainingTotalTime(trainingPlayingFragment.actionAlltime);
        initSplitLines(trainingPlayingFragment);
    }

    @Override // com.xiaomi.hm.health.training.media.strategy.IPlayActionVideoBottomProgressStrategy
    public void notifyBottomProgress(TrainingPlayingFragment trainingPlayingFragment, ActionContent actionContent, int i) {
        double durationTime = 0.0d;
        for (int i2 = 0; i2 < i; i2++) {
            durationTime += getDurationTime(trainingPlayingFragment.trainingDetail.content.get(i2));
        }
        synchronized (trainingPlayingFragment.trainingBarProgress.dataLock) {
            trainingPlayingFragment.trainingBarProgress.setCurrentTrainingTime(durationTime);
            trainingPlayingFragment.trainingBarProgress.resetPeriodTime();
            long singleActionTime = ActionVideoPlayCommon.getSingleActionTime(actionContent);
            trainingPlayingFragment.trainingBarProgress.setPeriodTotalTime("TIME".equals(ActionVideoPlayCommon.getActionType(actionContent)) ? getDurationTime(actionContent) : ((long) actionContent.getRepeatNumber().intValue()) * singleActionTime);
            if ("TIME".equals(ActionVideoPlayCommon.getActionType(actionContent))) {
                trainingPlayingFragment.trainingBarProgress.setUnitUpdateTime(1000L);
            } else {
                trainingPlayingFragment.trainingBarProgress.setUnitUpdateTime(singleActionTime);
            }
        }
    }

    @Override // com.xiaomi.hm.health.training.media.strategy.IPlayActionVideoBottomProgressStrategy
    public void onEventMainThread(ActionContent actionContent, PlaybackControl playbackControl, TrainingActionBarProgressView trainingActionBarProgressView) {
        onPlayActionVideoStart(actionContent, playbackControl, trainingActionBarProgressView);
    }
}
