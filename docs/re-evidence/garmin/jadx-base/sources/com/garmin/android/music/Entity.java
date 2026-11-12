package com.garmin.android.music;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes11.dex */
public class Entity {
    public static final int ENTITY_ID_PLAYER = 0;
    public static final int ENTITY_ID_QUEUE = 1;
    public static final int ENTITY_ID_TRACK = 2;
    public static final int ENTITY_UPDATE_FLAG_TRUNCATED = 1;
    public static final int PLAYBACK_STATE_FAST_FORWARDING = 3;
    public static final int PLAYBACK_STATE_PAUSED = 0;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_REWINDING = 2;
    public static final int PLAYER_ATTRIBUTE_ID_NAME = 0;
    public static final int PLAYER_ATTRIBUTE_ID_PLAYBACK_INFO = 1;
    public static final int PLAYER_ATTRIBUTE_ID_VOLUME = 2;
    public static final int QUEUE_ATTRIBUTE_ID_COUNT = 1;
    public static final int QUEUE_ATTRIBUTE_ID_INDEX = 0;
    public static final int QUEUE_ATTRIBUTE_ID_REPEAT_MODE = 3;
    public static final int QUEUE_ATTRIBUTE_ID_SHUFFLE_MODE = 2;
    public static final int REPEAT_MODE_ALL = 2;
    public static final int REPEAT_MODE_OFF = 0;
    public static final int REPEAT_MODE_ONE = 1;
    public static final int SHUFFLE_MODE_ALL = 2;
    public static final int SHUFFLE_MODE_OFF = 0;
    public static final int SHUFFLE_MODE_ONE = 1;
    public static final int TRACK_ATTRIBUTE_ID_ALBUM = 1;
    public static final int TRACK_ATTRIBUTE_ID_ALBUM_ART = 4;
    public static final int TRACK_ATTRIBUTE_ID_ARTIST = 0;
    public static final int TRACK_ATTRIBUTE_ID_DURATION = 3;
    public static final int TRACK_ATTRIBUTE_ID_TITLE = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface EntityId {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface EntityUpdateFlags {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackState {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayerAttributeId {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface QueueAttributeId {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ShuffleMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TrackAttributeId {
    }

    private Entity() {
    }
}
