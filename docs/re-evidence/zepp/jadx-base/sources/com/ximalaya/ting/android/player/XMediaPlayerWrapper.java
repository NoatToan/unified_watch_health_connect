package com.ximalaya.ting.android.player;

import android.content.Context;
import android.text.TextUtils;
import com.ximalaya.ting.android.player.model.HttpConfig;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class XMediaPlayerWrapper implements XMediaplayerImpl {
    private boolean isRelease;
    private boolean isUseSystemPlayer;
    private Context mConext;
    private XMediaPlayer.OnBufferingUpdateListener mOnBufferingUpdateListener;
    private XMediaPlayer.OnCompletionListener mOnCompletionListener;
    private XMediaPlayer.OnErrorListener mOnErrorListener;
    private XMediaPlayer.OnInfoListener mOnInfoListener;
    private XMediaPlayer.OnPositionChangeListener mOnPositionChangeListener;
    private XMediaPlayer.OnPreparedListener mOnPreparedListener;
    private XMediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
    private String mPlayUrl;
    public XMediaplayerImpl mXMediaplayerImpl;

    public XMediaPlayerWrapper(Context context, boolean z) {
        this.isUseSystemPlayer = false;
        if (context == null) {
            throw new RuntimeException("context cannot be null!!!!!!");
        }
        Context applicationContext = context.getApplicationContext();
        this.mConext = applicationContext;
        XMediaPlayerConstants.resetCacheDir(applicationContext);
        this.isRelease = z;
        init(this.mConext, z);
    }

    private void init(Context context, boolean z) {
        XMediaPlayerConstants.resetCacheDir(context);
        this.isUseSystemPlayer = false;
        String cpuInfo = PlayerUtil.getCpuInfo();
        String property = System.getProperty("os.arch");
        if (TextUtils.isEmpty(cpuInfo) || TextUtils.isEmpty(property)) {
            Logger.log(XMediaplayerJNI.Tag, "cpuinfo null:" + cpuInfo + "cpuArch:" + property);
        } else {
            if (cpuInfo.contains("Marvell") && property.contains("armv5tel")) {
                this.isUseSystemPlayer = true;
            }
            Logger.log(XMediaplayerJNI.Tag, "cpuinfo:" + cpuInfo + "cpuArch:" + property);
        }
        this.mXMediaplayerImpl = newXMediaplayer(context, z);
    }

    private XMediaplayerImpl newXMediaplayer(Context context, boolean z) {
        if (this.isUseSystemPlayer) {
            this.mXMediaplayerImpl = new SMediaPlayer();
        } else {
            Logger.log("jniHandler newXMediaplayer XMediaPlayer");
            this.mXMediaplayerImpl = new XMediaPlayer(context, z);
        }
        return this.mXMediaplayerImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reUseSMediaplayer(Context context, boolean z) throws Throwable {
        this.isUseSystemPlayer = true;
        FileInputStream fileInputStream = null;
        this.mXMediaplayerImpl.setOnBufferingUpdateListener(null);
        this.mXMediaplayerImpl.setOnCompletionListener(null);
        this.mXMediaplayerImpl.setOnErrorListener(null);
        this.mXMediaplayerImpl.setOnInfoListener(null);
        this.mXMediaplayerImpl.setOnPreparedListener(null);
        this.mXMediaplayerImpl.setOnSeekCompleteListener(null);
        this.mXMediaplayerImpl.setOnPositionChangeListener(null);
        XMediaplayerImpl xMediaplayerImplNewXMediaplayer = newXMediaplayer(context, z);
        this.mXMediaplayerImpl = xMediaplayerImplNewXMediaplayer;
        xMediaplayerImplNewXMediaplayer.setOnBufferingUpdateListener(this.mOnBufferingUpdateListener);
        this.mXMediaplayerImpl.setOnCompletionListener(this.mOnCompletionListener);
        this.mXMediaplayerImpl.setOnErrorListener(this.mOnErrorListener);
        this.mXMediaplayerImpl.setOnInfoListener(this.mOnInfoListener);
        this.mXMediaplayerImpl.setOnPreparedListener(this.mOnPreparedListener);
        this.mXMediaplayerImpl.setOnSeekCompleteListener(this.mOnSeekCompleteListener);
        this.mXMediaplayerImpl.setOnPositionChangeListener(this.mOnPositionChangeListener);
        if (TextUtils.isEmpty(this.mPlayUrl)) {
            return;
        }
        try {
            if (this.mPlayUrl.startsWith("http")) {
                this.mXMediaplayerImpl.setDataSource(this.mPlayUrl);
            } else {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(this.mPlayUrl);
                    try {
                        this.mXMediaplayerImpl.setDataSource(fileInputStream2.getFD(), this.mPlayUrl);
                        fileInputStream2.close();
                    } catch (Exception unused) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        this.mXMediaplayerImpl.prepareAsync();
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception unused3) {
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (IOException unused4) {
        }
        this.mXMediaplayerImpl.prepareAsync();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public XMediaplayerJNI.AudioType getAudioType() {
        return this.mXMediaplayerImpl.getAudioType();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public int getCurrentPosition() {
        return this.mXMediaplayerImpl.getCurrentPosition();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public int getDuration() {
        return this.mXMediaplayerImpl.getDuration();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public int getPlayState() {
        return this.mXMediaplayerImpl.getPlayState();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public boolean isPlaying() {
        return this.mXMediaplayerImpl.isPlaying();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public boolean isUseSystemPlayer() {
        return this.isUseSystemPlayer;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void pause() {
        this.mXMediaplayerImpl.pause();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void prepareAsync() {
        this.mXMediaplayerImpl.prepareAsync();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void release() {
        this.mXMediaplayerImpl.release();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void removeProxy() {
        StaticConfig.setHttpConfig(null);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void reset() {
        this.mXMediaplayerImpl.reset();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void seekTo(int i) {
        this.mXMediaplayerImpl.seekTo(i);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setAudioStreamType(int i) {
        this.mXMediaplayerImpl.setAudioStreamType(i);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setDataSource(FileDescriptor fileDescriptor, String str) {
        this.mPlayUrl = str;
        this.mXMediaplayerImpl.setDataSource(fileDescriptor, str);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setDownloadBufferSize(long j) {
        this.mXMediaplayerImpl.setDownloadBufferSize(j);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setHeadsOfReq(Map<String, String> map) {
        StaticConfig.setHeads(map);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnBufferingUpdateListener(XMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        this.mOnBufferingUpdateListener = onBufferingUpdateListener;
        this.mXMediaplayerImpl.setOnBufferingUpdateListener(onBufferingUpdateListener);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnCompletionListener(XMediaPlayer.OnCompletionListener onCompletionListener) {
        this.mOnCompletionListener = onCompletionListener;
        this.mXMediaplayerImpl.setOnCompletionListener(onCompletionListener);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnErrorListener(XMediaPlayer.OnErrorListener onErrorListener) {
        this.mOnErrorListener = onErrorListener;
        this.mXMediaplayerImpl.setOnErrorListener(new XMediaPlayer.OnErrorListener() { // from class: com.ximalaya.ting.android.player.XMediaPlayerWrapper.1
            @Override // com.ximalaya.ting.android.player.XMediaPlayer.OnErrorListener
            public boolean onError(XMediaplayerImpl xMediaplayerImpl, int i, int i2) throws Throwable {
                if (i2 == -1011) {
                    XMediaPlayerWrapper xMediaPlayerWrapper = XMediaPlayerWrapper.this;
                    xMediaPlayerWrapper.reUseSMediaplayer(xMediaPlayerWrapper.mConext, XMediaPlayerWrapper.this.isRelease);
                    return true;
                }
                if (XMediaPlayerWrapper.this.mOnErrorListener != null) {
                    return XMediaPlayerWrapper.this.mOnErrorListener.onError(XMediaPlayerWrapper.this.mXMediaplayerImpl, i, i2);
                }
                return false;
            }
        });
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnInfoListener(XMediaPlayer.OnInfoListener onInfoListener) {
        this.mOnInfoListener = onInfoListener;
        this.mXMediaplayerImpl.setOnInfoListener(onInfoListener);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnPlayDataOutputListener(XMediaPlayer.OnPlayDataOutputListener onPlayDataOutputListener) {
        XMediaplayerImpl xMediaplayerImpl = this.mXMediaplayerImpl;
        if (xMediaplayerImpl != null) {
            xMediaplayerImpl.setOnPlayDataOutputListener(onPlayDataOutputListener);
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnPositionChangeListener(XMediaPlayer.OnPositionChangeListener onPositionChangeListener) {
        this.mOnPositionChangeListener = onPositionChangeListener;
        this.mXMediaplayerImpl.setOnPositionChangeListener(onPositionChangeListener);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnPreparedListener(XMediaPlayer.OnPreparedListener onPreparedListener) {
        this.mOnPreparedListener = onPreparedListener;
        this.mXMediaplayerImpl.setOnPreparedListener(onPreparedListener);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnSeekCompleteListener(XMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.mOnSeekCompleteListener = onSeekCompleteListener;
        this.mXMediaplayerImpl.setOnSeekCompleteListener(onSeekCompleteListener);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setPreBufferUrl(String str) {
        XMediaplayerImpl xMediaplayerImpl = this.mXMediaplayerImpl;
        if (xMediaplayerImpl != null) {
            xMediaplayerImpl.setPreBufferUrl(str);
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setProxy(HttpConfig httpConfig) {
        StaticConfig.setHttpConfig(httpConfig);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setSoundTouchAllParams(float f, float f2, float f3) {
        XMediaplayerImpl xMediaplayerImpl = this.mXMediaplayerImpl;
        if (xMediaplayerImpl != null) {
            xMediaplayerImpl.setSoundTouchAllParams(f, f2, f3);
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setTempo(float f) {
        XMediaplayerImpl xMediaplayerImpl = this.mXMediaplayerImpl;
        if (xMediaplayerImpl != null) {
            xMediaplayerImpl.setTempo(f);
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setVolume(float f, float f2) {
        this.mXMediaplayerImpl.setVolume(f, f2);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setWakeMode(Context context, int i) {
        this.mXMediaplayerImpl.setWakeMode(context, i);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void start() {
        this.mXMediaplayerImpl.start();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void stop() {
        this.mXMediaplayerImpl.stop();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setDataSource(String str) {
        this.mPlayUrl = str;
        this.mXMediaplayerImpl.setDataSource(str);
    }

    public XMediaPlayerWrapper(Context context, boolean z, boolean z2) {
        this.isUseSystemPlayer = false;
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            this.mConext = applicationContext;
            XMediaPlayerConstants.resetCacheDir(applicationContext);
            if (z2) {
                this.isUseSystemPlayer = true;
                this.mXMediaplayerImpl = newXMediaplayer(this.mConext, z);
                return;
            } else {
                init(this.mConext, z);
                return;
            }
        }
        throw new RuntimeException("context cannot be null!!!!!!");
    }
}
