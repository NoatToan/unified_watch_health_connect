package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioListener;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.device.DeviceListener;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.video.VideoListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.base.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface Player {
    public static final int COMMAND_ADJUST_DEVICE_VOLUME = 25;
    public static final int COMMAND_CHANGE_MEDIA_ITEMS = 19;
    public static final int COMMAND_GET_AUDIO_ATTRIBUTES = 20;
    public static final int COMMAND_GET_CURRENT_MEDIA_ITEM = 15;
    public static final int COMMAND_GET_DEVICE_VOLUME = 22;
    public static final int COMMAND_GET_MEDIA_ITEMS_METADATA = 17;
    public static final int COMMAND_GET_TEXT = 27;
    public static final int COMMAND_GET_TIMELINE = 16;
    public static final int COMMAND_GET_VOLUME = 21;
    public static final int COMMAND_INVALID = -1;
    public static final int COMMAND_PLAY_PAUSE = 1;
    public static final int COMMAND_PREPARE_STOP = 2;
    public static final int COMMAND_SEEK_BACK = 10;
    public static final int COMMAND_SEEK_FORWARD = 11;
    public static final int COMMAND_SEEK_IN_CURRENT_WINDOW = 4;
    public static final int COMMAND_SEEK_TO_DEFAULT_POSITION = 3;
    public static final int COMMAND_SEEK_TO_NEXT = 8;
    public static final int COMMAND_SEEK_TO_NEXT_WINDOW = 7;
    public static final int COMMAND_SEEK_TO_PREVIOUS = 6;
    public static final int COMMAND_SEEK_TO_PREVIOUS_WINDOW = 5;
    public static final int COMMAND_SEEK_TO_WINDOW = 9;
    public static final int COMMAND_SET_DEVICE_VOLUME = 24;
    public static final int COMMAND_SET_MEDIA_ITEMS_METADATA = 18;
    public static final int COMMAND_SET_REPEAT_MODE = 14;
    public static final int COMMAND_SET_SHUFFLE_MODE = 13;
    public static final int COMMAND_SET_SPEED_AND_PITCH = 12;
    public static final int COMMAND_SET_VIDEO_SURFACE = 26;
    public static final int COMMAND_SET_VOLUME = 23;
    public static final int DISCONTINUITY_REASON_AUTO_TRANSITION = 0;
    public static final int DISCONTINUITY_REASON_INTERNAL = 5;
    public static final int DISCONTINUITY_REASON_REMOVE = 4;
    public static final int DISCONTINUITY_REASON_SEEK = 1;
    public static final int DISCONTINUITY_REASON_SEEK_ADJUSTMENT = 2;
    public static final int DISCONTINUITY_REASON_SKIP = 3;
    public static final int EVENT_AVAILABLE_COMMANDS_CHANGED = 14;
    public static final int EVENT_IS_LOADING_CHANGED = 4;
    public static final int EVENT_IS_PLAYING_CHANGED = 8;
    public static final int EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED = 19;
    public static final int EVENT_MEDIA_ITEM_TRANSITION = 1;
    public static final int EVENT_MEDIA_METADATA_CHANGED = 15;
    public static final int EVENT_PLAYBACK_PARAMETERS_CHANGED = 13;
    public static final int EVENT_PLAYBACK_STATE_CHANGED = 5;
    public static final int EVENT_PLAYBACK_SUPPRESSION_REASON_CHANGED = 7;
    public static final int EVENT_PLAYER_ERROR = 11;
    public static final int EVENT_PLAYLIST_METADATA_CHANGED = 16;
    public static final int EVENT_PLAY_WHEN_READY_CHANGED = 6;
    public static final int EVENT_POSITION_DISCONTINUITY = 12;
    public static final int EVENT_REPEAT_MODE_CHANGED = 9;
    public static final int EVENT_SEEK_BACK_INCREMENT_CHANGED = 17;
    public static final int EVENT_SEEK_FORWARD_INCREMENT_CHANGED = 18;
    public static final int EVENT_SHUFFLE_MODE_ENABLED_CHANGED = 10;

    @Deprecated
    public static final int EVENT_STATIC_METADATA_CHANGED = 3;
    public static final int EVENT_TIMELINE_CHANGED = 0;
    public static final int EVENT_TRACKS_CHANGED = 2;
    public static final int MEDIA_ITEM_TRANSITION_REASON_AUTO = 1;
    public static final int MEDIA_ITEM_TRANSITION_REASON_PLAYLIST_CHANGED = 3;
    public static final int MEDIA_ITEM_TRANSITION_REASON_REPEAT = 0;
    public static final int MEDIA_ITEM_TRANSITION_REASON_SEEK = 2;
    public static final int PLAYBACK_SUPPRESSION_REASON_NONE = 0;
    public static final int PLAYBACK_SUPPRESSION_REASON_TRANSIENT_AUDIO_FOCUS_LOSS = 1;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_AUDIO_BECOMING_NOISY = 3;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_AUDIO_FOCUS_LOSS = 2;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_END_OF_MEDIA_ITEM = 5;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_REMOTE = 4;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_USER_REQUEST = 1;
    public static final int REPEAT_MODE_ALL = 2;
    public static final int REPEAT_MODE_OFF = 0;
    public static final int REPEAT_MODE_ONE = 1;
    public static final int STATE_BUFFERING = 2;
    public static final int STATE_ENDED = 4;
    public static final int STATE_IDLE = 1;
    public static final int STATE_READY = 3;
    public static final int TIMELINE_CHANGE_REASON_PLAYLIST_CHANGED = 0;
    public static final int TIMELINE_CHANGE_REASON_SOURCE_UPDATE = 1;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Command {
    }

    public static final class Commands implements Bundleable {
        private static final int b = 0;
        private final FlagSet a;
        public static final Commands EMPTY = new Builder().build();
        public static final Bundleable.Creator<Commands> CREATOR = new Bundleable.Creator() { // from class: g16
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return Player.Commands.c(bundle);
            }
        };

        public static final class Builder {
            private static final int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};
            private final FlagSet.Builder a;

            public Builder add(int command) {
                this.a.add(command);
                return this;
            }

            public Builder addAll(int... commands) {
                this.a.addAll(commands);
                return this;
            }

            public Builder addAllCommands() {
                this.a.addAll(b);
                return this;
            }

            public Builder addIf(int command, boolean condition) {
                this.a.addIf(command, condition);
                return this;
            }

            public Commands build() {
                return new Commands(this.a.build());
            }

            public Builder remove(int command) {
                this.a.remove(command);
                return this;
            }

            public Builder removeAll(int... commands) {
                this.a.removeAll(commands);
                return this;
            }

            public Builder removeIf(int command, boolean condition) {
                this.a.removeIf(command, condition);
                return this;
            }

            public Builder() {
                this.a = new FlagSet.Builder();
            }

            public Builder addAll(Commands commands) {
                this.a.addAll(commands.a);
                return this;
            }

            private Builder(Commands commands) {
                FlagSet.Builder builder = new FlagSet.Builder();
                this.a = builder;
                builder.addAll(commands.a);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Commands c(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(d(0));
            if (integerArrayList == null) {
                return EMPTY;
            }
            Builder builder = new Builder();
            for (int i = 0; i < integerArrayList.size(); i++) {
                builder.add(integerArrayList.get(i).intValue());
            }
            return builder.build();
        }

        private static String d(int field) {
            return Integer.toString(field, 36);
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public boolean contains(int command) {
            return this.a.contains(command);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Commands) {
                return this.a.equals(((Commands) obj).a);
            }
            return false;
        }

        public int get(int index) {
            return this.a.get(index);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public int size() {
            return this.a.size();
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < this.a.size(); i++) {
                arrayList.add(Integer.valueOf(this.a.get(i)));
            }
            bundle.putIntegerArrayList(d(0), arrayList);
            return bundle;
        }

        private Commands(FlagSet flags) {
            this.a = flags;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DiscontinuityReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Event {
    }

    @Deprecated
    public interface EventListener {
        void onAvailableCommandsChanged(Commands availableCommands);

        void onEvents(Player player, Events events);

        void onIsLoadingChanged(boolean isLoading);

        void onIsPlayingChanged(boolean isPlaying);

        @Deprecated
        void onLoadingChanged(boolean isLoading);

        void onMaxSeekToPreviousPositionChanged(int maxSeekToPreviousPositionMs);

        void onMediaItemTransition(@Nullable MediaItem mediaItem, int reason);

        void onMediaMetadataChanged(MediaMetadata mediaMetadata);

        void onPlayWhenReadyChanged(boolean playWhenReady, int reason);

        void onPlaybackParametersChanged(PlaybackParameters playbackParameters);

        void onPlaybackStateChanged(int playbackState);

        void onPlaybackSuppressionReasonChanged(int playbackSuppressionReason);

        void onPlayerError(PlaybackException error);

        void onPlayerErrorChanged(@Nullable PlaybackException error);

        @Deprecated
        void onPlayerStateChanged(boolean playWhenReady, int playbackState);

        void onPlaylistMetadataChanged(MediaMetadata mediaMetadata);

        @Deprecated
        void onPositionDiscontinuity(int reason);

        void onPositionDiscontinuity(PositionInfo oldPosition, PositionInfo newPosition, int reason);

        void onRepeatModeChanged(int repeatMode);

        void onSeekBackIncrementChanged(long seekBackIncrementMs);

        void onSeekForwardIncrementChanged(long seekForwardIncrementMs);

        @Deprecated
        void onSeekProcessed();

        void onShuffleModeEnabledChanged(boolean shuffleModeEnabled);

        @Deprecated
        void onStaticMetadataChanged(List<Metadata> metadataList);

        void onTimelineChanged(Timeline timeline, int reason);

        void onTracksChanged(TrackGroupArray trackGroups, TrackSelectionArray trackSelections);
    }

    public static final class Events {
        private final FlagSet a;

        public Events(FlagSet flags) {
            this.a = flags;
        }

        public boolean contains(int event) {
            return this.a.contains(event);
        }

        public boolean containsAny(int... events) {
            return this.a.containsAny(events);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Events) {
                return this.a.equals(((Events) obj).a);
            }
            return false;
        }

        public int get(int index) {
            return this.a.get(index);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public int size() {
            return this.a.size();
        }
    }

    public interface Listener extends VideoListener, AudioListener, TextOutput, MetadataOutput, DeviceListener, EventListener {
        void onAudioAttributesChanged(AudioAttributes audioAttributes);

        void onAudioSessionIdChanged(int audioSessionId);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onAvailableCommandsChanged(Commands availableCommands);

        void onCues(List<Cue> cues);

        void onDeviceInfoChanged(DeviceInfo deviceInfo);

        void onDeviceVolumeChanged(int volume, boolean muted);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onEvents(Player player, Events events);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onIsLoadingChanged(boolean isLoading);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onIsPlayingChanged(boolean isPlaying);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onMediaItemTransition(@Nullable MediaItem mediaItem, int reason);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onMediaMetadataChanged(MediaMetadata mediaMetadata);

        void onMetadata(Metadata metadata);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onPlayWhenReadyChanged(boolean playWhenReady, int reason);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onPlaybackParametersChanged(PlaybackParameters playbackParameters);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onPlaybackStateChanged(int playbackState);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onPlaybackSuppressionReasonChanged(int playbackSuppressionReason);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onPlayerError(PlaybackException error);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onPlayerErrorChanged(@Nullable PlaybackException error);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onPlaylistMetadataChanged(MediaMetadata mediaMetadata);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onPositionDiscontinuity(PositionInfo oldPosition, PositionInfo newPosition, int reason);

        @Override // com.google.android.exoplayer2.video.VideoListener
        void onRenderedFirstFrame();

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onRepeatModeChanged(int repeatMode);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onSeekBackIncrementChanged(long seekBackIncrementMs);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onSeekForwardIncrementChanged(long seekForwardIncrementMs);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onShuffleModeEnabledChanged(boolean shuffleModeEnabled);

        void onSkipSilenceEnabledChanged(boolean skipSilenceEnabled);

        @Override // com.google.android.exoplayer2.video.VideoListener
        void onSurfaceSizeChanged(int width, int height);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onTimelineChanged(Timeline timeline, int reason);

        @Override // com.google.android.exoplayer2.Player.EventListener
        void onTracksChanged(TrackGroupArray trackGroups, TrackSelectionArray trackSelections);

        @Override // com.google.android.exoplayer2.video.VideoListener
        void onVideoSizeChanged(VideoSize videoSize);

        void onVolumeChanged(float volume);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaItemTransitionReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayWhenReadyChangeReason {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackSuppressionReason {
    }

    public static final class PositionInfo implements Bundleable {
        public static final Bundleable.Creator<PositionInfo> CREATOR = new Bundleable.Creator() { // from class: h16
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return Player.PositionInfo.b(bundle);
            }
        };
        private static final int a = 0;
        private static final int b = 1;
        private static final int c = 2;
        private static final int d = 3;
        private static final int e = 4;
        private static final int f = 5;
        public final int adGroupIndex;
        public final int adIndexInAdGroup;
        public final long contentPositionMs;
        public final int periodIndex;

        @Nullable
        public final Object periodUid;
        public final long positionMs;
        public final int windowIndex;

        @Nullable
        public final Object windowUid;

        public PositionInfo(@Nullable Object windowUid, int windowIndex, @Nullable Object periodUid, int periodIndex, long positionMs, long contentPositionMs, int adGroupIndex, int adIndexInAdGroup) {
            this.windowUid = windowUid;
            this.windowIndex = windowIndex;
            this.periodUid = periodUid;
            this.periodIndex = periodIndex;
            this.positionMs = positionMs;
            this.contentPositionMs = contentPositionMs;
            this.adGroupIndex = adGroupIndex;
            this.adIndexInAdGroup = adIndexInAdGroup;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static PositionInfo b(Bundle bundle) {
            return new PositionInfo(null, bundle.getInt(c(0), -1), null, bundle.getInt(c(1), -1), bundle.getLong(c(2), C.TIME_UNSET), bundle.getLong(c(3), C.TIME_UNSET), bundle.getInt(c(4), -1), bundle.getInt(c(5), -1));
        }

        private static String c(int field) {
            return Integer.toString(field, 36);
        }

        public boolean equals(@Nullable Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || PositionInfo.class != o.getClass()) {
                return false;
            }
            PositionInfo positionInfo = (PositionInfo) o;
            return this.windowIndex == positionInfo.windowIndex && this.periodIndex == positionInfo.periodIndex && this.positionMs == positionInfo.positionMs && this.contentPositionMs == positionInfo.contentPositionMs && this.adGroupIndex == positionInfo.adGroupIndex && this.adIndexInAdGroup == positionInfo.adIndexInAdGroup && Objects.equal(this.windowUid, positionInfo.windowUid) && Objects.equal(this.periodUid, positionInfo.periodUid);
        }

        public int hashCode() {
            return Objects.hashCode(this.windowUid, Integer.valueOf(this.windowIndex), this.periodUid, Integer.valueOf(this.periodIndex), Integer.valueOf(this.windowIndex), Long.valueOf(this.positionMs), Long.valueOf(this.contentPositionMs), Integer.valueOf(this.adGroupIndex), Integer.valueOf(this.adIndexInAdGroup));
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(c(0), this.windowIndex);
            bundle.putInt(c(1), this.periodIndex);
            bundle.putLong(c(2), this.positionMs);
            bundle.putLong(c(3), this.contentPositionMs);
            bundle.putInt(c(4), this.adGroupIndex);
            bundle.putInt(c(5), this.adIndexInAdGroup);
            return bundle;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TimelineChangeReason {
    }

    @Deprecated
    void addListener(EventListener listener);

    void addListener(Listener listener);

    void addMediaItem(int index, MediaItem mediaItem);

    void addMediaItem(MediaItem mediaItem);

    void addMediaItems(int index, List<MediaItem> mediaItems);

    void addMediaItems(List<MediaItem> mediaItems);

    void clearMediaItems();

    void clearVideoSurface();

    void clearVideoSurface(@Nullable Surface surface);

    void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

    void clearVideoSurfaceView(@Nullable SurfaceView surfaceView);

    void clearVideoTextureView(@Nullable TextureView textureView);

    void decreaseDeviceVolume();

    Looper getApplicationLooper();

    AudioAttributes getAudioAttributes();

    Commands getAvailableCommands();

    int getBufferedPercentage();

    long getBufferedPosition();

    long getContentBufferedPosition();

    long getContentDuration();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    List<Cue> getCurrentCues();

    long getCurrentLiveOffset();

    @Nullable
    Object getCurrentManifest();

    @Nullable
    MediaItem getCurrentMediaItem();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    @Deprecated
    List<Metadata> getCurrentStaticMetadata();

    Timeline getCurrentTimeline();

    TrackGroupArray getCurrentTrackGroups();

    TrackSelectionArray getCurrentTrackSelections();

    int getCurrentWindowIndex();

    DeviceInfo getDeviceInfo();

    int getDeviceVolume();

    long getDuration();

    int getMaxSeekToPreviousPosition();

    MediaItem getMediaItemAt(int index);

    int getMediaItemCount();

    MediaMetadata getMediaMetadata();

    int getNextWindowIndex();

    boolean getPlayWhenReady();

    PlaybackParameters getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    @Nullable
    PlaybackException getPlayerError();

    MediaMetadata getPlaylistMetadata();

    int getPreviousWindowIndex();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    long getTotalBufferedDuration();

    VideoSize getVideoSize();

    float getVolume();

    @Deprecated
    boolean hasNext();

    boolean hasNextWindow();

    @Deprecated
    boolean hasPrevious();

    boolean hasPreviousWindow();

    void increaseDeviceVolume();

    boolean isCommandAvailable(int command);

    boolean isCurrentWindowDynamic();

    boolean isCurrentWindowLive();

    boolean isCurrentWindowSeekable();

    boolean isDeviceMuted();

    boolean isLoading();

    boolean isPlaying();

    boolean isPlayingAd();

    void moveMediaItem(int currentIndex, int newIndex);

    void moveMediaItems(int fromIndex, int toIndex, int newIndex);

    @Deprecated
    void next();

    void pause();

    void play();

    void prepare();

    @Deprecated
    void previous();

    void release();

    @Deprecated
    void removeListener(EventListener listener);

    void removeListener(Listener listener);

    void removeMediaItem(int index);

    void removeMediaItems(int fromIndex, int toIndex);

    void seekBack();

    void seekForward();

    void seekTo(int windowIndex, long positionMs);

    void seekTo(long positionMs);

    void seekToDefaultPosition();

    void seekToDefaultPosition(int windowIndex);

    void seekToNext();

    void seekToNextWindow();

    void seekToPrevious();

    void seekToPreviousWindow();

    void setDeviceMuted(boolean muted);

    void setDeviceVolume(int volume);

    void setMediaItem(MediaItem mediaItem);

    void setMediaItem(MediaItem mediaItem, long startPositionMs);

    void setMediaItem(MediaItem mediaItem, boolean resetPosition);

    void setMediaItems(List<MediaItem> mediaItems);

    void setMediaItems(List<MediaItem> mediaItems, int startWindowIndex, long startPositionMs);

    void setMediaItems(List<MediaItem> mediaItems, boolean resetPosition);

    void setPlayWhenReady(boolean playWhenReady);

    void setPlaybackParameters(PlaybackParameters playbackParameters);

    void setPlaybackSpeed(float speed);

    void setPlaylistMetadata(MediaMetadata mediaMetadata);

    void setRepeatMode(int repeatMode);

    void setShuffleModeEnabled(boolean shuffleModeEnabled);

    void setVideoSurface(@Nullable Surface surface);

    void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

    void setVideoSurfaceView(@Nullable SurfaceView surfaceView);

    void setVideoTextureView(@Nullable TextureView textureView);

    void setVolume(float audioVolume);

    void stop();

    @Deprecated
    void stop(boolean reset);
}
