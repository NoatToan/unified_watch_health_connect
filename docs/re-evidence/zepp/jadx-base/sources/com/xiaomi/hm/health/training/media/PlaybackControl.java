package com.xiaomi.hm.health.training.media;

import android.content.Context;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.TrainingDetail;
import com.xiaomi.hm.health.training.media.audio.model.AudioRes;
import com.xiaomi.hm.health.training.media.audio.model.IAudioPlayerObserver;
import com.xiaomi.hm.health.training.media.audio.player.TrainingAudioPlayer;
import com.xiaomi.hm.health.training.media.strategy.IPlayControlStrategy;
import com.xiaomi.hm.health.training.media.strategy.playImpl.FixPlayControlStrategy;
import com.xiaomi.hm.health.training.media.strategy.playImpl.OldPlayControlStrategy;
import com.xiaomi.hm.health.training.ui.fragment.TrainingPlayingFragment;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes21.dex */
public class PlaybackControl {
    private TrainingPlayingFragment a;
    private Context b;
    private SimpleExoPlayer c;
    public int currentIndex;
    private volatile TrainingAudioPlayer e;
    private TrainingDetail f;
    private List<ActionContent> g;
    private IPlayControlStrategy i;
    private TrainerInfo h = TrainerInfo.get();
    private AtomicBoolean j = new AtomicBoolean(false);
    private a d = new a();

    public final class a implements IAudioPlayerObserver {
        private a() {
        }

        @Override // com.xiaomi.hm.health.training.media.audio.model.IAudioPlayerObserver
        public void onEnd() {
            PlaybackControl.this.a.startCountDown();
        }
    }

    public PlaybackControl(int i, SimpleExoPlayer simpleExoPlayer, TrainingDetail trainingDetail, TrainingPlayingFragment trainingPlayingFragment) {
        this.a = trainingPlayingFragment;
        this.currentIndex = i;
        this.c = simpleExoPlayer;
        this.f = trainingDetail;
        this.g = trainingDetail.content;
        this.b = trainingPlayingFragment.getContext();
        this.e = new TrainingAudioPlayer(this.b);
        this.e.addObserver(this.d);
        if (trainingPlayingFragment.getActionVideoOptions().isResultActionNumber()) {
            this.i = new FixPlayControlStrategy(trainingPlayingFragment, this);
        } else {
            this.i = new OldPlayControlStrategy(trainingPlayingFragment, this);
        }
    }

    private void b(ArrayList<AudioRes> arrayList, Context context) {
        this.e.clear();
        this.e = null;
        this.e = new TrainingAudioPlayer(context);
        this.e.addObserver(this.d);
        this.e.playAudioRes(arrayList, this.j.get());
    }

    public void createActionBroadcast() {
        b(this.a.getActionVideoOptions().getActionBroadCastFactory().create(this.g, this.currentIndex), this.b);
    }

    public void endActionPlayer() {
        if (this.e != null) {
            this.e.clear();
        }
    }

    public TrainerInfo getTrainer() {
        return this.h;
    }

    public SimpleExoPlayer getVideoPlayer() {
        return this.c;
    }

    public void pause() {
        this.j.set(true);
        if (this.e == null || !this.e.isPlaying()) {
            return;
        }
        this.e.pause();
    }

    public void playbackLoopVideo(ActionContent actionContent, int i) {
        this.i.playbackLoopVideo(actionContent, i);
    }

    public void resume() {
        this.j.set(false);
        if (this.e == null || !this.e.isPlaying()) {
            return;
        }
        this.e.resume();
    }

    public void startNext() {
        this.i.startNext(this.g, this.currentIndex);
    }

    public void startPlayback() {
        int i = this.currentIndex;
        if (i < 0 || i > this.g.size() - 1) {
            return;
        }
        startNext();
    }

    public void startPrev() {
        int i = this.currentIndex - 2;
        this.currentIndex = i;
        if (i < 0 || i > this.g.size() - 1) {
            this.currentIndex = 0;
        } else {
            startNext();
        }
    }

    public void stopPlayback() {
        this.a.stopVideo();
    }
}
