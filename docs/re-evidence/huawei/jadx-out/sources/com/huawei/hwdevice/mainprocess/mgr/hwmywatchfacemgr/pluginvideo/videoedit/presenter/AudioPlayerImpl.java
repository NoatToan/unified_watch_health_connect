package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter;

import android.media.MediaPlayer;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.AudioPlayer;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.utils.TemplateUtil;
import health.compact.a.LogUtil;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class AudioPlayerImpl implements AudioPlayer {
    private static final String TAG = "AudioPlayerImpl";
    private String activePath;
    private MediaPlayer mMediaPlayer = new MediaPlayer();

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.AudioPlayer
    public void pause() {
        this.mMediaPlayer.pause();
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.AudioPlayer
    public void resume() {
        this.mMediaPlayer.start();
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.AudioPlayer
    public void stop() {
        this.mMediaPlayer.reset();
        this.activePath = null;
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.AudioPlayer
    public void setVolume(int i) {
        float fTransformVolume = TemplateUtil.transformVolume(i);
        this.mMediaPlayer.setVolume(fTransformVolume, fTransformVolume);
    }

    @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.listener.AudioPlayer
    public void setDataPath(String str, int i, int i2) {
        if (str.equals(this.activePath)) {
            this.mMediaPlayer.seekTo(i);
            return;
        }
        this.mMediaPlayer.reset();
        try {
            this.activePath = str;
            this.mMediaPlayer.setDataSource(str);
            this.mMediaPlayer.prepare();
            this.mMediaPlayer.seekTo(i);
            float fTransformVolume = TemplateUtil.transformVolume(i2);
            this.mMediaPlayer.setVolume(fTransformVolume, fTransformVolume);
        } catch (IOException unused) {
            LogUtil.d(TAG, "setDataPath IOException");
        }
    }
}
