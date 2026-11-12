package com.xiaomi.hm.health.training.media.strategy;

import android.content.Context;
import com.google.android.exoplayer2.source.LoopingMediaSource;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideo;
import com.xiaomi.hm.health.training.media.PlaybackControl;
import com.xiaomi.hm.health.training.media.factory.LoopingMediaSourceFactory;
import com.xiaomi.hm.health.training.ui.fragment.TrainingPlayingFragment;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import com.xiaomi.hm.health.traininglib.util.MediaFileUtils;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public abstract class IPlayControlStrategy {
    public TrainingPlayingFragment fragment;
    public PlaybackControl playbackControl;

    public IPlayControlStrategy(TrainingPlayingFragment trainingPlayingFragment, PlaybackControl playbackControl) {
        this.fragment = trainingPlayingFragment;
        this.playbackControl = playbackControl;
    }

    public Context a() {
        return this.fragment.getActivity();
    }

    public TrainerInfo getTrainer() {
        return this.playbackControl.getTrainer();
    }

    public void playbackLoopVideo(ActionContent actionContent, int i) {
        LoopingMediaSource loopingMediaSourceCreate;
        ActionVideo actionVideo = actionContent.actionVideo;
        if (MediaFileUtils.getMedialFromCacheByUri(actionVideo.url, actionVideo.size.longValue()) == null || (loopingMediaSourceCreate = LoopingMediaSourceFactory.create(a(), actionContent, i)) == null) {
            return;
        }
        this.playbackControl.getVideoPlayer().prepare(loopingMediaSourceCreate);
        this.fragment.playVideo();
    }

    public abstract void startNext(List<ActionContent> list, int i);
}
