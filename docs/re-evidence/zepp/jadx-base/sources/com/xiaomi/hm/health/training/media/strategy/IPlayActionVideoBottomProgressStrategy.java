package com.xiaomi.hm.health.training.media.strategy;

import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.training.media.PlaybackControl;
import com.xiaomi.hm.health.training.media.strategy.trainImpl.ActionVideoPlayCommon;
import com.xiaomi.hm.health.training.ui.fragment.TrainingPlayingFragment;
import com.xiaomi.hm.health.training.ui.widget.TrainingActionBarProgressView;
import com.xiaomi.hm.health.traininglib.webapi.ParseJsonUtil;

/* JADX INFO: loaded from: classes21.dex */
public abstract class IPlayActionVideoBottomProgressStrategy {
    public long getDurationTime(ActionContent actionContent) {
        return Integer.parseInt(ParseJsonUtil.getStringByGender(actionContent.duration, ActionVideoPlayCommon.getTrainer()));
    }

    public abstract void initBottomProgress(TrainingPlayingFragment trainingPlayingFragment);

    public void initSplitLines(TrainingPlayingFragment trainingPlayingFragment) {
        double[] dArr = new double[trainingPlayingFragment.trainingDetail.content.size() - 1];
        double d = 0.0d;
        for (int i = 0; i < trainingPlayingFragment.trainingDetail.content.size() - 1; i++) {
            d += (double) Integer.parseInt(ParseJsonUtil.getStringByGender(trainingPlayingFragment.trainingDetail.content.get(i).duration, ActionVideoPlayCommon.getTrainer()));
            dArr[i] = d / trainingPlayingFragment.actionAlltime;
        }
        trainingPlayingFragment.trainingBarProgress.setSplitLines(dArr);
    }

    public abstract void notifyBottomProgress(TrainingPlayingFragment trainingPlayingFragment, ActionContent actionContent, int i);

    public abstract void onEventMainThread(ActionContent actionContent, PlaybackControl playbackControl, TrainingActionBarProgressView trainingActionBarProgressView);

    public void onPlayActionVideoStart(ActionContent actionContent, PlaybackControl playbackControl, TrainingActionBarProgressView trainingActionBarProgressView) {
        playbackControl.playbackLoopVideo(actionContent, ((int) Math.ceil(Double.parseDouble(ParseJsonUtil.getStringByGender(actionContent.duration, playbackControl.getTrainer())) / actionContent.actionVideo.singleActionTime.longValue())) + 1);
        trainingActionBarProgressView.startPeriodRefresh();
    }
}
