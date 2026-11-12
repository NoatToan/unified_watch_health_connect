package com.xiaomi.hm.health.training.media.strategy.playImpl;

import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideo;
import com.xiaomi.hm.health.training.media.PlaybackControl;
import com.xiaomi.hm.health.training.media.TrainingFinish;
import com.xiaomi.hm.health.training.media.strategy.IPlayControlStrategy;
import com.xiaomi.hm.health.training.media.strategy.trainImpl.ActionVideoPlayCommon;
import com.xiaomi.hm.health.training.ui.fragment.TrainingPlayingFragment;
import com.xiaomi.hm.health.traininglib.webapi.ParseJsonUtil;
import de.greenrobot.event.EventBus;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class FixPlayControlStrategy extends IPlayControlStrategy {
    public FixPlayControlStrategy(TrainingPlayingFragment trainingPlayingFragment, PlaybackControl playbackControl) {
        super(trainingPlayingFragment, playbackControl);
    }

    private int b(TrainingPlayingFragment trainingPlayingFragment, ActionContent actionContent) {
        if (actionContent.getRepeatNumber().intValue() > 0) {
            return actionContent.getRepeatNumber().intValue();
        }
        List<ActionVideo> list = actionContent.videos;
        return (int) ((list == null || list.size() <= 0 || actionContent.videos.get(0) == null || actionContent.videos.get(0).getTime().intValue() <= 1 || actionContent.videos.get(0).getActionNumber().intValue() <= 1) ? ((long) Integer.parseInt(ParseJsonUtil.getStringByGender(actionContent.duration, getTrainer()))) / actionContent.actionVideo.singleActionTime.longValue() : ActionVideoPlayCommon.getCricleProgressDurationTime(actionContent) / ActionVideoPlayCommon.getSingleActionTime(actionContent));
    }

    @Override // com.xiaomi.hm.health.training.media.strategy.IPlayControlStrategy
    public void startNext(List<ActionContent> list, int i) {
        if (i < 0 || i > list.size() - 1) {
            this.playbackControl.stopPlayback();
            EventBus.getDefault().post(new TrainingFinish());
            return;
        }
        this.fragment.notifyShowControlButton(i);
        ActionContent actionContent = list.get(i);
        String actionType = ActionVideoPlayCommon.getActionType(actionContent);
        this.fragment.setCurrentAction(ActionVideoPlayCommon.getActionName(actionContent), "TIME".equals(actionType) ? Integer.parseInt(ParseJsonUtil.getStringByGender(actionContent.duration, getTrainer())) / 1000 : b(this.fragment, actionContent), actionType);
        playbackLoopVideo(actionContent, 0);
        this.fragment.notifyCircleProgress(actionContent, i);
        this.fragment.notifyBottomProgress(actionContent, i);
        this.playbackControl.createActionBroadcast();
        this.playbackControl.currentIndex++;
    }
}
