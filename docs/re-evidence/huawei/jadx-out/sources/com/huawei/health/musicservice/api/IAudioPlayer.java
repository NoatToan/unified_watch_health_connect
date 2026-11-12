package com.huawei.health.musicservice.api;

import defpackage.gdy;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface IAudioPlayer {

    public interface AudioPlayerCallBack {
        void onProgressChanged(gdy gdyVar, long j);

        void onStatusChanged(PlayStatus playStatus, gdy gdyVar);
    }

    /* JADX INFO: loaded from: classes29.dex */
    public interface ParameterKeys {
        public static final String AUDIO_ADD_PLAY_LIST = "audio_add_play_list";
        public static final String AUDIO_AUTO_STOP = "audio_auto_stop";
        public static final String AUDIO_CANCEL_AUTO_STOP = "audio_cancel_auto_stop";
        public static final String AUDIO_DELETE_ITEM = "audio_delete_item";
        public static final String AUDIO_MEDIA_BUTTON_RECEIVER = "audio_media_button_receiver";
        public static final String AUDIO_NOTIFICATION = "audio_notification";
        public static final String AUDIO_PLAY_MODE = "audio_play_mode";
        public static final String AUDIO_PLAY_SPEED = "audio_play_speed";
        public static final String AUDIO_RESET_PLAY_LIST = "audio_reset_play_list";
        public static final String AUDIO_SET_PLAY_LIST = "audio_set_play_list";
        public static final String AUDIO_SUPPORT_ACTIONS = "audio_support_actions";
        public static final String AUDIO_USAGE = "audio_usage";
    }

    public enum PlayMode {
        PLAY_ONCE,
        RANDOM_CIRCLE,
        SEQUENCE_CIRCLE,
        SEQUENCE_PLAY
    }

    public enum PlayStatus {
        PLAYING,
        PAUSED,
        STOPPED,
        RELEASED,
        FAILED,
        SKIP_TO_NEXT,
        SKIP_TO_PREV,
        SKIP_TO_INDEX,
        BUFFERING,
        FOCUS_LOSS
    }

    void addPlayList(List<gdy> list);

    void autoStop(long j);

    void cancelAutoStop();

    void pause();

    void play();

    void play(int i);

    void playNext();

    void playPrevious();

    void release();

    void removeItem(gdy gdyVar);

    void resetPlayList(List<gdy> list);

    void seekTo(int i);

    void setCallback(AudioPlayerCallBack audioPlayerCallBack);

    void setPlayList(List<gdy> list);

    void setPlayMode(PlayMode playMode);

    void setPlaySpeed(float f);

    void setUsage(int i);

    void setVolume(float f);

    void stop();
}
