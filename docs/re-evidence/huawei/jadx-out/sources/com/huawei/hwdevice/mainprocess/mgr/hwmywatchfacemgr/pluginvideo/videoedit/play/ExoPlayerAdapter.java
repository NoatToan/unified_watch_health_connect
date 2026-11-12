package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.play;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.SimpleExoPlayer;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.VideoPlayer;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class ExoPlayerAdapter implements VideoRendererEventListener, VideoPlayer {
    private static final long MAX_PROTECTION_TIME = 300;
    private static final String TAG = "ExoPlayerAdapter";
    private final Context mContext;
    private Handler mHandler;
    private float mPlaySpeed;
    private Surface mSurface;
    private int mSurfaceIndex;
    private float mVolume;
    private SimpleExoPlayer player;
    private int mSeekTime = 0;
    private boolean mIsSeeking = false;

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.VideoPlayer
    public void reset() {
    }

    public ExoPlayerAdapter(Context context, Handler handler, int i) {
        this.mSurfaceIndex = 0;
        this.mContext = context.getApplicationContext();
        this.mHandler = handler;
        this.mSurfaceIndex = i;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.VideoPlayer
    public void pause() {
        this.player.setPlayWhenReady(false);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.VideoPlayer
    public void resume() {
        this.player.setPlayWhenReady(true);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.VideoPlayer
    public void start() {
        this.player.setPlayWhenReady(true);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.VideoPlayer
    public void stop() {
        SimpleExoPlayer simpleExoPlayer = this.player;
        if (simpleExoPlayer == null) {
            LogUtil.b(TAG, " stop player is dead");
        } else {
            simpleExoPlayer.stop();
        }
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.VideoPlayer
    public VideoPlayer setSeekTime(int i) {
        this.mSeekTime = i;
        LogUtil.d(TAG, "setSeekTime is ", Integer.valueOf(i), "mSurfaceIndex is ", Integer.valueOf(this.mSurfaceIndex));
        return this;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.VideoPlayer
    public VideoPlayer setPlaySpeed(float f) {
        this.mPlaySpeed = f;
        return this;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.VideoPlayer
    public VideoPlayer setVolume(float f) {
        this.mVolume = f;
        SimpleExoPlayer simpleExoPlayer = this.player;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setVolume(f);
        }
        return this;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.VideoPlayer
    public void seekTo(int i) {
        SimpleExoPlayer simpleExoPlayer = this.player;
        if (simpleExoPlayer == null) {
            LogUtil.d(TAG, "FATAL seekTo player is dead");
            return;
        }
        simpleExoPlayer.setPlayWhenReady(false);
        LogUtil.b(TAG, "mSurfaceIndex is ", Integer.valueOf(this.mSurfaceIndex), " mSeekTime is ", Integer.valueOf(i), " mIsSeeking is", Boolean.valueOf(this.mIsSeeking));
        this.player.seekTo(i);
        this.mSeekTime = i;
        this.mIsSeeking = true;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.VideoPlayer
    public VideoPlayer setSurface(Surface surface) {
        this.mSurface = surface;
        return this;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.VideoPlayer
    public int getCurrentPosition() {
        return (int) this.player.getCurrentPosition();
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.VideoPlayer
    public VideoPlayer setDataPath(String str) {
        Uri uri = Uri.parse(Uri.encode(str));
        SimpleExoPlayer simpleExoPlayerBuild = new SimpleExoPlayer.Builder(this.mContext).build();
        this.player = simpleExoPlayerBuild;
        simpleExoPlayerBuild.setMediaItem(MediaItem.fromUri(uri));
        this.player.setVideoSurface(this.mSurface);
        this.player.prepare();
        float f = this.mPlaySpeed;
        this.player.setPlaybackParameters(new PlaybackParameters(f, f));
        this.player.setVolume(this.mVolume);
        this.player.seekTo(this.mSeekTime);
        this.mIsSeeking = false;
        addPlayListener();
        this.player.setPlayWhenReady(false);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekCompleted() {
        LogUtil.b(TAG, "seek complete");
        if (this.mHandler != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 0;
            messageObtain.arg1 = this.mSurfaceIndex;
            messageObtain.arg2 = this.mSeekTime;
            LogUtil.b(TAG, "surface index is ", Integer.valueOf(this.mSurfaceIndex), " mSeekTime ", Integer.valueOf(this.mSeekTime));
            this.mHandler.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekProcessed() {
        LogUtil.b(TAG, "seekProcessed is ", Boolean.valueOf(this.mIsSeeking));
        try {
            Thread.sleep(300L);
        } catch (InterruptedException unused) {
            LogUtil.b(TAG, "InterruptedException");
        }
        seekCompleted();
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.VideoPlayer
    public void clean() {
        SimpleExoPlayer simpleExoPlayer = this.player;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.stop();
            this.player.release();
            this.player = null;
            this.mHandler = null;
        }
    }

    private void addPlayListener() {
        this.player.addListener(new Player.Listener() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.play.ExoPlayerAdapter.1
            @Override // androidx.media3.common.Player.Listener
            public void onRenderedFirstFrame() {
                LogUtil.b(ExoPlayerAdapter.TAG, "setDataPath -- onRenderedFirstFrame start");
                ExoPlayerAdapter.this.seekCompleted();
            }

            @Override // androidx.media3.common.Player.Listener
            public void onRepeatModeChanged(int i) {
                LogUtil.b(ExoPlayerAdapter.TAG, "addPlayListener -- onRepeatModeChanged");
                super.onRepeatModeChanged(i);
            }

            @Override // androidx.media3.common.Player.Listener
            public void onShuffleModeEnabledChanged(boolean z) {
                LogUtil.b(ExoPlayerAdapter.TAG, "addPlayListener -- onShuffleModeEnabledChanged");
                super.onShuffleModeEnabledChanged(z);
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
                LogUtil.b(ExoPlayerAdapter.TAG, "onPlayerErrorChanged -- onPlaybackParametersChanged");
                super.onPlaybackParametersChanged(playbackParameters);
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
                ExoPlayerAdapter.this.seekProcessed();
                super.onPositionDiscontinuity(positionInfo, positionInfo2, i);
            }
        });
    }
}
