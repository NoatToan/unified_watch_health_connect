package com.garmin.android.music;

import android.content.Context;
import android.media.AudioManager;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\u000e\u001a\u00020\nH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/music/MusicCommandRunner;", "Ljava/lang/Runnable;", "appContext", "Landroid/content/Context;", "command", "Lcom/garmin/android/music/MusicControlCommand;", "activeMediaController", "Landroid/media/session/MediaController;", "(Landroid/content/Context;Lcom/garmin/android/music/MusicControlCommand;Landroid/media/session/MediaController;)V", "adjustVolume", "", "volumeUp", "", "executeCommand", "run", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class MusicCommandRunner implements Runnable {
    private final MediaController activeMediaController;
    private final Context appContext;
    private final MusicControlCommand command;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MusicControlCommand.values().length];
            try {
                iArr[MusicControlCommand.VOLUME_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicControlCommand.VOLUME_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MusicControlCommand.TOGGLE_PLAY_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MusicControlCommand.SKIP_TO_NEXT_ITEM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MusicControlCommand.SKIP_TO_PREVIOUS_ITEM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MusicControlCommand.PLAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MusicControlCommand.PAUSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MusicControlCommand.SKIP_FORWARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MusicControlCommand.SKIP_BACKWARDS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MusicCommandRunner(Context context, MusicControlCommand musicControlCommand, MediaController mediaController) {
        context.getClass();
        musicControlCommand.getClass();
        this.appContext = context;
        this.command = musicControlCommand;
        this.activeMediaController = mediaController;
    }

    private final void adjustVolume(boolean volumeUp) {
        int volumeFactor;
        MediaController.PlaybackInfo playbackInfo;
        int volumeFactor2;
        MediaController mediaController = this.activeMediaController;
        if (mediaController != null && (playbackInfo = mediaController.getPlaybackInfo()) != null) {
            int currentVolume = playbackInfo.getCurrentVolume();
            int maxVolume = playbackInfo.getMaxVolume();
            if (volumeUp) {
                if (currentVolume >= maxVolume) {
                    MusicCommandRunnerKt.getLogger().warn(this.command + " (MediaController) -> already maxed out at '" + maxVolume + "'");
                    return;
                }
                volumeFactor2 = MusicCommandRunnerKt.getVolumeFactor(maxVolume) + currentVolume;
            } else {
                if (currentVolume <= 0) {
                    MusicCommandRunnerKt.getLogger().warn(this.command + " (MediaController) -> already at lowest level '" + currentVolume + "'");
                    return;
                }
                volumeFactor2 = currentVolume - MusicCommandRunnerKt.getVolumeFactor(maxVolume);
            }
            this.activeMediaController.setVolumeTo(volumeFactor2, 0);
            MusicCommandRunnerKt.getLogger().debug("{} (MediaController) -> from '{}' to '{}' (max '{}')", this.command, Integer.valueOf(currentVolume), Integer.valueOf(volumeFactor2), Integer.valueOf(maxVolume));
            return;
        }
        AudioManager audioManager = MusicCommandRunnerKt.audioManager(this.appContext);
        if (audioManager == null) {
            MusicCommandRunnerKt.getLogger().warn(this.command + " -> no active media controller nor audio manager");
            return;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (volumeUp) {
            if (streamVolume >= streamMaxVolume) {
                MusicCommandRunnerKt.getLogger().warn(this.command + " (AudioManager) -> already maxed out at '" + streamMaxVolume + "'");
                return;
            }
            volumeFactor = MusicCommandRunnerKt.getVolumeFactor(streamMaxVolume) + streamVolume;
        } else {
            if (streamVolume <= 0) {
                MusicCommandRunnerKt.getLogger().warn(this.command + " (AudioManager) -> already at lowest level '" + streamVolume + "'");
                return;
            }
            volumeFactor = streamVolume - MusicCommandRunnerKt.getVolumeFactor(streamMaxVolume);
        }
        audioManager.setStreamVolume(3, volumeFactor, 0);
        MusicCommandRunnerKt.getLogger().debug("{} (AudioManager) -> from '{}' to '{}' (max '{}')", this.command, Integer.valueOf(streamVolume), Integer.valueOf(volumeFactor), Integer.valueOf(streamMaxVolume));
    }

    private final void executeCommand(MusicControlCommand command) {
        if (this.activeMediaController == null) {
            MusicCommandRunnerKt.sendMediaBroadcast(this.appContext, command);
        }
        boolean zShouldUseLegacyCommandHandling = MusicConfig.getInstance().shouldUseLegacyCommandHandling(this.activeMediaController.getPackageName());
        boolean zForbidUseTransportControl = MusicConfig.getInstance().forbidUseTransportControl(this.activeMediaController.getPackageName());
        if (zShouldUseLegacyCommandHandling || zForbidUseTransportControl) {
            Context context = this.appContext;
            if (zShouldUseLegacyCommandHandling) {
                MusicCommandRunnerKt.sendMediaKeyEvent(context, command);
                return;
            } else {
                MusicCommandRunnerKt.sendMediaBroadcast(context, command);
                return;
            }
        }
        MusicCommandRunnerKt.getLogger().debug("{} (transport controls)", command);
        switch (WhenMappings.$EnumSwitchMapping$0[command.ordinal()]) {
            case 1:
                h.z("Should call adjustVolume()");
                break;
            case 2:
                h.z("Should call adjustVolume()");
                break;
            case 3:
                PlaybackState playbackState = this.activeMediaController.getPlaybackState();
                if (playbackState != null) {
                    int state = playbackState.getState();
                    MediaController mediaController = this.activeMediaController;
                    if (3 != state) {
                        mediaController.getTransportControls().play();
                    } else {
                        mediaController.getTransportControls().pause();
                    }
                }
                break;
            case 4:
                this.activeMediaController.getTransportControls().skipToNext();
                break;
            case 5:
                this.activeMediaController.getTransportControls().skipToPrevious();
                break;
            case 6:
                this.activeMediaController.getTransportControls().play();
                break;
            case 7:
                this.activeMediaController.getTransportControls().pause();
                break;
            case 8:
                this.activeMediaController.getTransportControls().fastForward();
                break;
            case 9:
                this.activeMediaController.getTransportControls().rewind();
                break;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        MediaController mediaController = this.activeMediaController;
        if (mediaController != null) {
            PlaybackState playbackState = mediaController.getPlaybackState();
            if (playbackState != null) {
                MusicCommandRunnerKt.getLogger().debug("app '{}', current playback state '{}={}', running '{}'...", this.activeMediaController.getPackageName(), Integer.valueOf(playbackState.getState()), MusicCommandRunnerKt.PLAYBACK_STATE_NAMES.get(playbackState.getState(), PrivacyUpdateRequestError.UNKNOWN), this.command);
            } else {
                MusicCommandRunnerKt.getLogger().debug("app '{}', no current playback state, running '{}'...", this.activeMediaController.getPackageName(), this.command);
            }
        } else {
            MusicCommandRunnerKt.getLogger().warn("no active controller, running '" + this.command + "'...");
        }
        int i14 = WhenMappings.$EnumSwitchMapping$0[this.command.ordinal()];
        if (i14 == 1) {
            adjustVolume(true);
        } else if (i14 != 2) {
            executeCommand(this.command);
        } else {
            adjustVolume(false);
        }
    }
}
