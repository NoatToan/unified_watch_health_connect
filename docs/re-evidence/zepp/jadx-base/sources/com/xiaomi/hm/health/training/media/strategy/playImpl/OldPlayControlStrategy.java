package com.xiaomi.hm.health.training.media.strategy.playImpl;

import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.training.media.PlaybackControl;
import com.xiaomi.hm.health.training.media.TrainingFinish;
import com.xiaomi.hm.health.training.media.strategy.IPlayControlStrategy;
import com.xiaomi.hm.health.training.media.strategy.trainImpl.ActionVideoPlayCommon;
import com.xiaomi.hm.health.training.ui.fragment.TrainingPlayingFragment;
import com.xiaomi.hm.health.traininglib.webapi.ParseJsonUtil;
import de.greenrobot.event.EventBus;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class OldPlayControlStrategy extends IPlayControlStrategy {
    public OldPlayControlStrategy(TrainingPlayingFragment trainingPlayingFragment, PlaybackControl playbackControl) {
        super(trainingPlayingFragment, playbackControl);
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
        this.fragment.setCurrentAction(ActionVideoPlayCommon.getActionName(actionContent), "TIME".equals(actionType) ? Integer.parseInt(ParseJsonUtil.getStringByGender(actionContent.duration, getTrainer())) / 1000 : (int) (((long) Integer.parseInt(ParseJsonUtil.getStringByGender(actionContent.duration, getTrainer()))) / actionContent.actionVideo.singleActionTime.longValue()), actionType);
        playbackLoopVideo(actionContent, 0);
        this.fragment.notifyCircleProgress(actionContent, i);
        this.fragment.notifyBottomProgress(actionContent, i);
        this.playbackControl.createActionBroadcast();
        this.playbackControl.currentIndex++;
    }
}
