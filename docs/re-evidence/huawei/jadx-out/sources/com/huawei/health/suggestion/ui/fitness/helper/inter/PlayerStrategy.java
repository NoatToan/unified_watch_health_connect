package com.huawei.health.suggestion.ui.fitness.helper.inter;

import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import androidx.media3.common.Player;
import androidx.media3.common.VideoSize;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface PlayerStrategy {
    void changeAudioGender();

    String getCurrentName();

    int getCurrentPosition();

    int getDarkAreaHeight();

    int getDarkAreaWidth();

    int getDuration();

    ExoPlayer getExoPlayer();

    List<String> getNumberPaths(int i);

    MediaPlayer getPlayer();

    int getSourceNum();

    int getVideoHeight();

    int getVideoWidth();

    boolean isPlaying();

    PlayerStrategy next();

    void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2);

    void onVideoSizeChanged(VideoSize videoSize);

    PlayerStrategy pause();

    PlayerStrategy play();

    PlayerStrategy pre();

    PlayerStrategy prepare();

    void refreshAssetSources(String... strArr);

    PlayerStrategy release();

    PlayerStrategy repeat();

    void reset();

    void saveCurrent(int i);

    void saveFitnessType(String str);

    void seekTo(int i);

    PlayerStrategy setAssetSources(String... strArr);

    PlayerStrategy setAudioAssetSources(List<String> list);

    void setCurrent(int i);

    void setDisplay(SurfaceHolder surfaceHolder);

    void setGender(int i);

    void setLooper(boolean z);

    PlayerStrategy setLooping(boolean z);

    PlayerStrategy setMediaSources(Uri... uriArr);

    PlayerStrategy setMediaUrl(String str);

    void setOnVideoSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener);

    void setOnVideoSizeChangedListener(Player.Listener listener);

    void setPlayerSpeed(float f);

    PlayerStrategy setRawSources(Integer... numArr);

    PlayerStrategy setSdSources(List<String> list);

    PlayerStrategy setSdSources(String... strArr);

    void setSdSourcesBackground(String str);

    PlayerStrategy setSurface(Surface surface);

    PlayerStrategy setSurfaceDisplay(SurfaceView surfaceView);

    void setSurfaceParentGlobalLayoutListener(ViewGroup viewGroup);

    void setVideoScalingMode();

    void setVolume(float f);

    PlayerStrategy start();

    PlayerStrategy stop();

    PlayerStrategy videoContinue();
}
