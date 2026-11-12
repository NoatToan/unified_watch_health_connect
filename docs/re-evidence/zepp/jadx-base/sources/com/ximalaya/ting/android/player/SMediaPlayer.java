package com.ximalaya.ting.android.player;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huami.passport.Configs;
import com.ximalaya.ting.android.player.model.HttpConfig;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class SMediaPlayer implements XMediaplayerImpl, Handler.Callback {
    private static final int MSG_COMPLETE = 9;
    private static final int MSG_INCREMENTAL_PREPARE = 2;
    private static final int MSG_PAUSE = 3;
    private static final int MSG_PREPARE = 1;
    private static final int MSG_RELEASE = 5;
    private static final int MSG_RESET = 7;
    private static final int MSG_SEEK_TO = 6;
    private static final int MSG_SET_DATA_SOURCE = 8;
    private static final int MSG_START = 0;
    private static final int MSG_STOP = 4;
    private int lastPostion;
    private Handler mEventHandler;
    private final Handler mHandler;
    private final HandlerThread mInternalPlaybackThread;
    public MediaPlayer mMediaPlayer;
    private XMediaPlayer.OnPositionChangeListener mOnPositionChangeListener;
    private int mPlayState;
    private String mPlayUrl;
    private boolean isSeeking = false;
    private boolean isBuffering = false;
    private boolean isPrepareing = false;
    private int mCurrentPosition = 0;
    private int mDuration = 0;
    private long time = System.currentTimeMillis();
    private boolean isRelase = false;
    private XMediaplayerJNI.AudioType mAudioType = XMediaplayerJNI.AudioType.NORMAL_FILE;
    private boolean hasSetDataSource = false;
    private Runnable runnable = new Runnable() { // from class: com.ximalaya.ting.android.player.SMediaPlayer.7
        @Override // java.lang.Runnable
        public void run() {
            int currentPosition;
            if (SMediaPlayer.this.mOnPositionChangeListener == null) {
                return;
            }
            SMediaPlayer.this.mEventHandler.removeCallbacks(SMediaPlayer.this.runnable);
            if (SMediaPlayer.this.mPlayState == 4 && !SMediaPlayer.this.isBuffering && !SMediaPlayer.this.isSeeking && SMediaPlayer.this.lastPostion != (currentPosition = SMediaPlayer.this.getCurrentPosition())) {
                SMediaPlayer.this.lastPostion = currentPosition;
                SMediaPlayer.this.mOnPositionChangeListener.onPositionChange(SMediaPlayer.this, currentPosition);
            }
            SMediaPlayer.this.mEventHandler.postDelayed(SMediaPlayer.this.runnable, 1000L);
        }
    };

    public SMediaPlayer() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.mMediaPlayer = mediaPlayer;
        mediaPlayer.setAudioStreamType(3);
        this.mEventHandler = new Handler(Looper.myLooper());
        this.mPlayState = 1;
        PriorityHandlerThread priorityHandlerThread = new PriorityHandlerThread(getClass().getSimpleName() + ":Handler", -16);
        this.mInternalPlaybackThread = priorityHandlerThread;
        priorityHandlerThread.start();
        this.mHandler = new Handler(priorityHandlerThread.getLooper(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void printTime(String str) {
        Logger.log(XMediaplayerJNI.Tag, str + " nowtime:" + System.currentTimeMillis() + "long:" + (System.currentTimeMillis() - this.time));
        this.time = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetState() {
        this.isSeeking = false;
        this.isBuffering = false;
        this.isPrepareing = false;
        this.mDuration = 0;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public XMediaplayerJNI.AudioType getAudioType() {
        return this.mAudioType;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public int getCurrentPosition() {
        if (!this.isSeeking && !this.isBuffering && !this.isPrepareing && !this.isRelase) {
            this.mCurrentPosition = this.mMediaPlayer.getCurrentPosition();
        }
        return this.mCurrentPosition;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public int getDuration() {
        int i = this.mDuration;
        if (i != 0) {
            return i;
        }
        if (!this.isSeeking && !this.isBuffering && !this.isPrepareing && !this.isRelase) {
            this.mDuration = this.mMediaPlayer.getDuration();
        }
        return this.mDuration;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public int getPlayState() {
        return this.mPlayState;
    }

    public String getPlayUrl() {
        return this.mPlayUrl;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        try {
            switch (message.what) {
                case 0:
                    this.mPlayState = 4;
                    printTime("MSG_START start");
                    this.mMediaPlayer.start();
                    printTime("MSG_START end");
                    return true;
                case 1:
                    this.mPlayState = 2;
                    printTime("MSG_PREPARE start");
                    this.mMediaPlayer.prepareAsync();
                    printTime("MSG_PREPARE end");
                    return true;
                case 2:
                default:
                    return false;
                case 3:
                    this.mPlayState = 5;
                    this.mMediaPlayer.pause();
                    return true;
                case 4:
                    this.mPlayState = 6;
                    this.mMediaPlayer.stop();
                    return true;
                case 5:
                    this.mPlayState = 9;
                    printTime("MSG_RELEASE start");
                    this.mMediaPlayer.release();
                    printTime("MSG_RELEASE end");
                    return true;
                case 6:
                    this.mMediaPlayer.seekTo(((Integer) message.obj).intValue());
                    return true;
                case 7:
                    this.mPlayState = 0;
                    printTime("MSG_RESET start");
                    try {
                        this.mMediaPlayer.reset();
                        break;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    resetState();
                    printTime("MSG_RESET end");
                    return true;
                case 8:
                    printTime("MSG_SET_DATA_SOURCE start");
                    Object obj = message.obj;
                    if (obj != null) {
                        try {
                            try {
                                this.mMediaPlayer.setDataSource(obj.toString());
                            } catch (IllegalStateException e2) {
                                e2.printStackTrace();
                            } catch (SecurityException e3) {
                                e3.printStackTrace();
                            }
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        } catch (IllegalArgumentException e5) {
                            e5.printStackTrace();
                        }
                        break;
                    }
                    printTime("MSG_SET_DATA_SOURCE end");
                    return true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public boolean isPlaying() {
        if (this.isSeeking || this.isBuffering || this.isPrepareing || this.isRelase) {
            return false;
        }
        return this.mMediaPlayer.isPlaying();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public boolean isUseSystemPlayer() {
        return true;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void pause() {
        this.mHandler.obtainMessage(3).sendToTarget();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void prepareAsync() {
        this.isPrepareing = true;
        printTime("prepareAsync");
        this.mHandler.obtainMessage(1).sendToTarget();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void release() {
        printTime("release");
        resetState();
        this.isRelase = true;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.obtainMessage(5).sendToTarget();
        }
        this.mOnPositionChangeListener = null;
        if (this.mInternalPlaybackThread.getLooper() != null) {
            this.mInternalPlaybackThread.getLooper().quit();
            this.mInternalPlaybackThread.interrupt();
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void removeProxy() {
        StaticConfig.setHttpConfig(null);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void reset() {
        this.mDuration = 0;
        if (this.hasSetDataSource) {
            printTime(Configs.Params.RESET);
            this.mHandler.obtainMessage(7).sendToTarget();
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void seekTo(int i) {
        this.isSeeking = true;
        this.mHandler.obtainMessage(6, Integer.valueOf(i)).sendToTarget();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setAudioStreamType(int i) {
        this.mMediaPlayer.setAudioStreamType(i);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setDataSource(String str) {
        printTime("setDataSource");
        this.mDuration = 0;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.contains("m3u8")) {
            this.mAudioType = XMediaplayerJNI.AudioType.M3U8_FILE;
        } else {
            this.mAudioType = XMediaplayerJNI.AudioType.NORMAL_FILE;
        }
        this.hasSetDataSource = true;
        this.mHandler.obtainMessage(8, str).sendToTarget();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setDownloadBufferSize(long j) {
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setHeadsOfReq(Map<String, String> map) {
        StaticConfig.setHeads(map);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnBufferingUpdateListener(final XMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        this.mMediaPlayer.setOnBufferingUpdateListener(new MediaPlayer.OnBufferingUpdateListener() { // from class: com.ximalaya.ting.android.player.SMediaPlayer.1
            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
                XMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener2 = onBufferingUpdateListener;
                if (onBufferingUpdateListener2 != null) {
                    onBufferingUpdateListener2.onBufferingUpdate(SMediaPlayer.this, i);
                }
            }
        });
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnCompletionListener(final XMediaPlayer.OnCompletionListener onCompletionListener) {
        this.mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.ximalaya.ting.android.player.SMediaPlayer.2
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                SMediaPlayer.this.mPlayState = 11;
                XMediaPlayer.OnCompletionListener onCompletionListener2 = onCompletionListener;
                if (onCompletionListener2 != null) {
                    onCompletionListener2.onCompletion(SMediaPlayer.this);
                }
            }
        });
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnErrorListener(final XMediaPlayer.OnErrorListener onErrorListener) {
        this.mMediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.ximalaya.ting.android.player.SMediaPlayer.3
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                SMediaPlayer.this.resetState();
                XMediaPlayer.OnErrorListener onErrorListener2 = onErrorListener;
                if (onErrorListener2 == null) {
                    return false;
                }
                boolean zOnError = onErrorListener2.onError(SMediaPlayer.this, i, i2);
                if (!zOnError) {
                    SMediaPlayer.this.mPlayState = 8;
                }
                return zOnError;
            }
        });
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnInfoListener(final XMediaPlayer.OnInfoListener onInfoListener) {
        Logger.log(XMediaplayerJNI.Tag, "SMediaPlayer setOnInfoListener");
        this.mMediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.ximalaya.ting.android.player.SMediaPlayer.4
            @Override // android.media.MediaPlayer.OnInfoListener
            public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                Logger.log(XMediaplayerJNI.Tag, "SMediaPlayer OnInfoListener:" + i + "extra:" + i2);
                if (i == 701) {
                    SMediaPlayer.this.isBuffering = true;
                } else if (i == 702) {
                    SMediaPlayer.this.isBuffering = false;
                }
                XMediaPlayer.OnInfoListener onInfoListener2 = onInfoListener;
                if (onInfoListener2 != null) {
                    return onInfoListener2.onInfo(SMediaPlayer.this, 10, i);
                }
                return false;
            }
        });
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnPlayDataOutputListener(XMediaPlayer.OnPlayDataOutputListener onPlayDataOutputListener) {
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnPositionChangeListener(XMediaPlayer.OnPositionChangeListener onPositionChangeListener) {
        this.mOnPositionChangeListener = onPositionChangeListener;
        if (onPositionChangeListener != null) {
            this.mEventHandler.removeCallbacks(this.runnable);
            this.mEventHandler.postDelayed(this.runnable, 1000L);
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnPreparedListener(final XMediaPlayer.OnPreparedListener onPreparedListener) {
        this.mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.ximalaya.ting.android.player.SMediaPlayer.5
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                SMediaPlayer.this.printTime("onPrepared");
                SMediaPlayer.this.mPlayState = 3;
                SMediaPlayer.this.isPrepareing = false;
                SMediaPlayer sMediaPlayer = SMediaPlayer.this;
                sMediaPlayer.mDuration = sMediaPlayer.mMediaPlayer.getDuration();
                SMediaPlayer sMediaPlayer2 = SMediaPlayer.this;
                sMediaPlayer2.mCurrentPosition = sMediaPlayer2.mMediaPlayer.getCurrentPosition();
                XMediaPlayer.OnPreparedListener onPreparedListener2 = onPreparedListener;
                if (onPreparedListener2 != null) {
                    onPreparedListener2.onPrepared(SMediaPlayer.this);
                }
            }
        });
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnSeekCompleteListener(final XMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.mMediaPlayer.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: com.ximalaya.ting.android.player.SMediaPlayer.6
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public void onSeekComplete(MediaPlayer mediaPlayer) {
                SMediaPlayer.this.isSeeking = false;
                XMediaPlayer.OnSeekCompleteListener onSeekCompleteListener2 = onSeekCompleteListener;
                if (onSeekCompleteListener2 != null) {
                    onSeekCompleteListener2.onSeekComplete(SMediaPlayer.this);
                }
            }
        });
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setPreBufferUrl(String str) {
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setProxy(HttpConfig httpConfig) {
        StaticConfig.setHttpConfig(httpConfig);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setSoundTouchAllParams(float f, float f2, float f3) {
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setTempo(float f) {
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setVolume(float f, float f2) {
        this.mMediaPlayer.setVolume(f, f2);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setWakeMode(Context context, int i) {
        this.mMediaPlayer.setWakeMode(context, i);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void start() {
        printTime("start");
        int i = this.mPlayState;
        if (i == 5 || i == 3) {
            this.mHandler.obtainMessage(0).sendToTarget();
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void stop() {
        this.mHandler.obtainMessage(4).sendToTarget();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setDataSource(FileDescriptor fileDescriptor, String str) {
        this.hasSetDataSource = true;
        try {
            this.mMediaPlayer.setDataSource(fileDescriptor);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        } catch (IllegalStateException e3) {
            e3.printStackTrace();
        }
    }
}
