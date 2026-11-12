package com.huawei.health.suggestion.ui.fitness.helper;

import android.content.Context;
import android.media.MediaPlayer;
import androidx.media3.common.Player;
import androidx.media3.common.VideoSize;
import androidx.media3.exoplayer.ExoPlayer;
import com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy;
import com.huawei.hwcommonmodel.application.BaseApplication;

/* JADX INFO: loaded from: classes9.dex */
public class PlayerHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PlayerStrategy f9342b;

    public interface OnPreparedListener {
        void onBufferingEnd();

        void onBufferingStart();

        void onPrepared();

        void onSeekComplete();

        void onVideoError();
    }

    public PlayerHelper(Context context) {
        this.f9342b = e.b(2);
    }

    public PlayerHelper(int i) {
        this.f9342b = e.b(i);
    }

    public PlayerHelper() {
        this.f9342b = e.b(2);
    }

    public PlayerStrategy p() {
        return this.f9342b;
    }

    public void b(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        this.f9342b.setOnVideoSizeChangedListener(onVideoSizeChangedListener);
    }

    public void b(Player.Listener listener) {
        this.f9342b.setOnVideoSizeChangedListener(listener);
    }

    public void b(MediaPlayer mediaPlayer, int i, int i2) {
        this.f9342b.onVideoSizeChanged(mediaPlayer, i, i2);
    }

    public void a(VideoSize videoSize) {
        this.f9342b.onVideoSizeChanged(videoSize);
    }

    public MediaPlayer s() {
        return p().getPlayer();
    }

    public ExoPlayer q() {
        return p().getExoPlayer();
    }

    public static class e {
        public static PlayerStrategy b(int i) {
            if (i == 1) {
                return new ExoStrategy();
            }
            if (i == 2) {
                return new MediaStrategy();
            }
            if (i == 3) {
                return new ExoStrategy(BaseApplication.getContext());
            }
            throw new IllegalArgumentException("Illegal player type: " + i);
        }
    }
}
