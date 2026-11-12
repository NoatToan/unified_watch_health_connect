package com.huami.sky.ui.play.control;

import android.media.AudioManager;
import com.huami.watch.companion.mediac.Command;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\u0004H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\nH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u000eH&J\b\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0013\u001a\u00020\u0011H&J\b\u0010\u0014\u001a\u00020\u0011H&J\b\u0010\u0016\u001a\u00020\u0015H&J\b\u0010\u0017\u001a\u00020\u0015H&J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H&J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH&J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH&¨\u0006 "}, d2 = {"Lcom/huami/sky/ui/play/control/IPlayback;", "", "", "musicUrl", "", "play", "restart", "pause", Command.STOP, "release", "", "volume", "setVolume", "getVolume", "", "getDuration", "getCurrentPosition", "", "getDurations", "getCurrentPositions", "getLeftTime", "", "playerRestartEnable", "isPlayerPlaying", "Lcom/huami/sky/ui/play/control/IPlayback$ICallback;", "callback", "setCallback", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "onFocusChangeListener", "requestAudioFocus", "abandonAudioFocus", "ICallback", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public interface IPlayback {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/sky/ui/play/control/IPlayback$ICallback;", "", "", "onPlayStart", "onPlayEnd", "onPlayError", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
    public interface ICallback {
        void onPlayEnd();

        void onPlayError();

        void onPlayStart();
    }

    void abandonAudioFocus(@NotNull AudioManager.OnAudioFocusChangeListener onFocusChangeListener);

    long getCurrentPosition();

    int getCurrentPositions();

    long getDuration();

    int getDurations();

    int getLeftTime();

    float getVolume();

    boolean isPlayerPlaying();

    void pause();

    void play(@NotNull String musicUrl);

    boolean playerRestartEnable();

    void release();

    void requestAudioFocus(@NotNull AudioManager.OnAudioFocusChangeListener onFocusChangeListener);

    void restart();

    void setCallback(@NotNull ICallback callback);

    void setVolume(float volume);

    void stop();
}
