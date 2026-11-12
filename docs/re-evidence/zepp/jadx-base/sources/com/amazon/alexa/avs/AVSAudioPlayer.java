package com.amazon.alexa.avs;

import com.amazon.alexa.avs.message.request.context.PlaybackStatePayload;
import com.amazon.alexa.avs.message.request.context.SpeechStatePayload;
import com.amazon.alexa.avs.message.request.context.VolumeStatePayload;

/* JADX INFO: loaded from: classes2.dex */
public class AVSAudioPlayer {
    private static final long VLCJ_VOLUME_SCALAR = 2;
    private volatile AlertState alertState = AlertState.FINISHED;
    private volatile SpeechState speechState = SpeechState.FINISHED;
    private int currentVolume = 100;

    public enum AlertState {
        PLAYING,
        INTERRUPTED,
        FINISHED
    }

    public enum AudioPlayerState {
        IDLE,
        PLAYING,
        PAUSED,
        FINISHED,
        STOPPED,
        BUFFER_UNDERRUN
    }

    public enum SpeechState {
        PLAYING,
        FINISHED
    }

    private synchronized long getPlayerPosition() {
        return 0L;
    }

    public long getCurrentOffsetInMilliseconds() {
        return 0L;
    }

    public PlaybackStatePayload getPlaybackState() {
        return new PlaybackStatePayload(null, getCurrentOffsetInMilliseconds(), AudioPlayerState.IDLE.toString());
    }

    public SpeechStatePayload getSpeechState() {
        return new SpeechStatePayload(null, getPlayerPosition(), this.speechState.name());
    }

    public long getVolume() {
        return ((long) this.currentVolume) / 2;
    }

    public VolumeStatePayload getVolumeState() {
        return new VolumeStatePayload(getVolume(), isMuted());
    }

    public boolean isMuted() {
        return false;
    }
}
