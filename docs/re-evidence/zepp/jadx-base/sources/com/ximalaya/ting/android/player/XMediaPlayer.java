package com.ximalaya.ting.android.player;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import com.ximalaya.ting.android.player.model.HttpConfig;
import java.io.FileDescriptor;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class XMediaPlayer extends XMediaplayerJNI implements Handler.Callback {
    private static final int MEDIA_BUFFERING_UPDATE = 3;
    private static final int MEDIA_ERROR = 100;
    public static final int MEDIA_ERROR_ARCH_UNSUPPORTED = -1011;
    public static final int MEDIA_ERROR_IO = -1004;
    public static final int MEDIA_ERROR_MALFORMED = -1007;
    public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 200;
    public static final int MEDIA_ERROR_SERVER_DIED = 100;
    public static final int MEDIA_ERROR_TIMED_OUT = -110;
    public static final int MEDIA_ERROR_UNKNOWN = 1;
    public static final int MEDIA_ERROR_UNSUPPORTED = -1010;
    private static final int MEDIA_INFO = 200;
    public static final int MEDIA_INFO_BUFFERING_END = 702;
    public static final int MEDIA_INFO_BUFFERING_START = 701;
    public static final int MEDIA_INFO_DOWNLOAD_RATE_CHANGED = 901;
    public static final int MEDIA_INFO_NOT_SEEKABLE = 801;
    public static final int MEDIA_INFO_VIDEO_TRACK_LAGGING = 700;
    private static final int MEDIA_NOP = 0;
    private static final int MEDIA_PAUSED = 7;
    private static final int MEDIA_PLAYBACK_COMPLETE = 2;
    private static final int MEDIA_PREPARED = 1;
    private static final int MEDIA_SEEK_COMPLETE = 4;
    private static final int MEDIA_SET_VIDEO_SIZE = 5;
    private static final int MEDIA_SKIPPED = 9;
    private static final int MEDIA_STARTED = 6;
    private static final int MEDIA_STOPPED = 8;
    private static final int MEDIA_SUBTITLE_DATA = 201;
    private static final int MEDIA_TIMED_CHANGE = 202;
    private static final int MEDIA_TIMED_TEXT = 99;
    private static final int MSG_COMPLETE = 9;
    private static final int MSG_INCREMENTAL_PREPARE = 2;
    private static final int MSG_INIT = 10;
    private static final int MSG_PAUSE = 3;
    private static final int MSG_PREPARE = 1;
    private static final int MSG_RELEASE = 5;
    private static final int MSG_RESET = 7;
    private static final int MSG_SEEK_TO = 6;
    private static final int MSG_SET_DATA_SOURCE = 8;
    private static final int MSG_SET_PRE_BUFFER_URL = 11;
    private static final int MSG_START = 0;
    private static final int MSG_STOP = 4;
    private long lastBufferingTime;
    private Context mContext;
    private EventHandler mEventHandler;
    private Handler mHandler;
    private HandlerThread mInternalPlaybackThread;
    private OnBufferingUpdateListener mOnBufferingUpdateListener;
    private OnCompletionListener mOnCompletionListener;
    private OnErrorListener mOnErrorListener;
    private OnInfoListener mOnInfoListener;
    private OnPreparedListener mOnPreparedListener;
    private OnSeekCompleteListener mOnSeekCompleteListener;
    private OnPositionChangeListener mOnTimedChangeListener;
    private volatile int mPlayState;
    private boolean mStayAwake;
    private PowerManager.WakeLock mWakeLock;

    public class EventHandler extends Handler {
        private XMediaPlayer mMediaPlayer;

        public EventHandler(XMediaPlayer xMediaPlayer, Looper looper) {
            super(looper);
            this.mMediaPlayer = xMediaPlayer;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (XMediaPlayer.this.mPlayState == 12 && message.what != 100) {
                Logger.log(XMediaplayerJNI.Tag, "handleMessage11 mPlayState NOT_ARCH_SUPPORT");
            }
            Logger.log(XMediaplayerJNI.Tag, "handleMessage11 mPlayState:" + XMediaPlayer.this.mPlayState + " msg.what:" + message.what);
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    if (XMediaPlayer.this.mOnPreparedListener != null) {
                        XMediaPlayer.this.mOnPreparedListener.onPrepared(this.mMediaPlayer);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    if (XMediaPlayer.this.mOnCompletionListener != null) {
                        XMediaPlayer.this.mOnCompletionListener.onCompletion(this.mMediaPlayer);
                        return;
                    }
                    return;
                }
                if (i == 3) {
                    if (XMediaPlayer.this.mOnBufferingUpdateListener != null) {
                        XMediaPlayer.this.mOnBufferingUpdateListener.onBufferingUpdate(this.mMediaPlayer, message.arg1);
                        return;
                    }
                    return;
                }
                if (i == 4) {
                    if (XMediaPlayer.this.mOnSeekCompleteListener != null) {
                        XMediaPlayer.this.mOnSeekCompleteListener.onSeekComplete(this.mMediaPlayer);
                        return;
                    }
                    return;
                }
                if (i != 99) {
                    if (i == 100) {
                        Logger.log(XMediaplayerJNI.Tag, "Error (" + message.arg1 + "," + message.arg2 + ")");
                        boolean zOnError = XMediaPlayer.this.mOnErrorListener != null ? XMediaPlayer.this.mOnErrorListener.onError(this.mMediaPlayer, message.arg1, message.arg2) : false;
                        if (XMediaPlayer.this.mOnCompletionListener == null || zOnError) {
                            return;
                        }
                        XMediaPlayer.this.mOnCompletionListener.onCompletion(this.mMediaPlayer);
                        return;
                    }
                    switch (i) {
                        case 6:
                        case 7:
                        case 8:
                            break;
                        case 9:
                            break;
                        default:
                            switch (i) {
                                case 200:
                                    if (XMediaPlayer.this.mOnInfoListener != null) {
                                        XMediaPlayer.this.mOnInfoListener.onInfo(this.mMediaPlayer, message.arg1, message.arg2);
                                    }
                                    break;
                                case 201:
                                    break;
                                case 202:
                                    if (XMediaPlayer.this.mOnTimedChangeListener != null && !XMediaPlayer.this.isSeeking()) {
                                        OnPositionChangeListener onPositionChangeListener = XMediaPlayer.this.mOnTimedChangeListener;
                                        XMediaPlayer xMediaPlayer = this.mMediaPlayer;
                                        onPositionChangeListener.onPositionChange(xMediaPlayer, xMediaPlayer.getCurrentPosition());
                                        break;
                                    }
                                    break;
                                default:
                                    Logger.log(XMediaplayerJNI.Tag, "Unknown message type " + message.what);
                                    break;
                            }
                            break;
                    }
                }
            }
        }
    }

    public interface OnBufferingUpdateListener {
        void onBufferingUpdate(XMediaplayerImpl xMediaplayerImpl, int i);
    }

    public interface OnCompletionListener {
        void onCompletion(XMediaplayerImpl xMediaplayerImpl);
    }

    public interface OnErrorListener {
        boolean onError(XMediaplayerImpl xMediaplayerImpl, int i, int i2);
    }

    public interface OnInfoListener {
        boolean onInfo(XMediaplayerImpl xMediaplayerImpl, int i, int i2);
    }

    public interface OnPlayDataOutputListener {
        void onPlayDataOutput(byte[] bArr);
    }

    public interface OnPositionChangeListener {
        void onPositionChange(XMediaplayerImpl xMediaplayerImpl, int i);
    }

    public interface OnPreparedListener {
        void onPrepared(XMediaplayerImpl xMediaplayerImpl);
    }

    public interface OnSeekCompleteListener {
        void onSeekComplete(XMediaplayerImpl xMediaplayerImpl);
    }

    public XMediaPlayer(Context context, boolean z) {
        super(context, z);
        this.mWakeLock = null;
        this.lastBufferingTime = System.currentTimeMillis();
        this.mContext = context.getApplicationContext();
        init();
    }

    private void init() {
        this.mPlayState = 1;
        PriorityHandlerThread priorityHandlerThread = new PriorityHandlerThread(getClass().getSimpleName() + ":HandlerForPlayer", -19);
        this.mInternalPlaybackThread = priorityHandlerThread;
        priorityHandlerThread.start();
        Handler handler = new Handler(this.mInternalPlaybackThread.getLooper(), this);
        this.mHandler = handler;
        handler.obtainMessage(10).sendToTarget();
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            this.mEventHandler = new EventHandler(this, looperMyLooper);
        } else {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                this.mEventHandler = new EventHandler(this, mainLooper);
            } else {
                this.mEventHandler = null;
            }
        }
        Logger.log("Mediaplayer XMediaPlayer init()");
    }

    private void stayAwake(boolean z) {
        PowerManager.WakeLock wakeLock = this.mWakeLock;
        if (wakeLock != null) {
            if (z && !wakeLock.isHeld()) {
                this.mWakeLock.acquire();
            } else if (!z && this.mWakeLock.isHeld()) {
                this.mWakeLock.release();
            }
        }
        this.mStayAwake = z;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerJNI, com.ximalaya.ting.android.player.XMediaplayerImpl
    public int getCurrentPosition() {
        if (this.mPlayState == 12) {
            return 0;
        }
        return super.getCurrentPosition();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerJNI, com.ximalaya.ting.android.player.XMediaplayerImpl
    public int getDuration() {
        if (this.mPlayState == 12) {
            return 0;
        }
        return super.getDuration();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public int getPlayState() {
        return this.mPlayState;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        if (this.mPlayState == 12) {
            Logger.log(XMediaplayerJNI.Tag, "handleMessage00 mPlayState NOT_ARCH_SUPPORT");
            return true;
        }
        Logger.log(XMediaplayerJNI.Tag, "handleMessage00 mPlayState:" + this.mPlayState);
        try {
            switch (message.what) {
                case 0:
                    Logger.log(XMediaplayerJNI.Tag, "handleMessage00 STARTED start");
                    this.mPlayState = 4;
                    super.start();
                    Logger.log(XMediaplayerJNI.Tag, "handleMessage00 STARTED end");
                    return true;
                case 1:
                    Logger.log(XMediaplayerJNI.Tag, "handleMessage00 MSG_PREPARE start");
                    this.mPlayState = 2;
                    super.prepareAsync();
                    Logger.log(XMediaplayerJNI.Tag, "handleMessage00 MSG_PREPARE end");
                    return true;
                case 2:
                default:
                    return false;
                case 3:
                    if (this.mPlayState != 8) {
                        Logger.log(XMediaplayerJNI.Tag, "handleMessage00 MSG_PAUSE start");
                        this.mPlayState = 5;
                        super.pause();
                        Logger.log(XMediaplayerJNI.Tag, "handleMessage00 MSG_PAUSE end");
                    }
                    return true;
                case 4:
                    Logger.log(XMediaplayerJNI.Tag, "handleMessage00 MSG_STOP start");
                    this.mPlayState = 6;
                    super.stop();
                    Logger.log(XMediaplayerJNI.Tag, "handleMessage00 MSG_STOP end");
                    return true;
                case 5:
                    Logger.log(XMediaplayerJNI.Tag, "handleMessage00 MSG_RELEASE start");
                    this.mPlayState = 9;
                    super.release();
                    this.mInternalPlaybackThread.getLooper().quit();
                    this.mInternalPlaybackThread.interrupt();
                    Logger.log(XMediaplayerJNI.Tag, "handleMessage00 MSG_RELEASE end");
                    return true;
                case 6:
                    Logger.log(XMediaplayerJNI.Tag, "handleMessage00 MSG_SEEK_TO start");
                    super.seekTo(((Integer) message.obj).intValue());
                    Logger.log(XMediaplayerJNI.Tag, "handleMessage00 MSG_SEEK_TO end");
                    return true;
                case 7:
                    Logger.log(XMediaplayerJNI.Tag, "handleMessage00 MSG_RESET start");
                    this.mPlayState = 0;
                    super.reset();
                    Logger.log(XMediaplayerJNI.Tag, "handleMessage00 MSG_RESET end");
                    this.mPlayState = 0;
                    return true;
                case 8:
                    Object obj = message.obj;
                    if (obj != null) {
                        super.setDataSource(obj.toString());
                    }
                    return true;
                case 9:
                    Logger.log(XMediaplayerJNI.Tag, "handleMessage00 MSG_COMPLETE start");
                    this.mPlayState = 11;
                    super.onCompletionInner();
                    Logger.log(XMediaplayerJNI.Tag, "handleMessage00 MSG_COMPLETE end");
                    return true;
                case 10:
                    Logger.log(XMediaplayerJNI.Tag, "Mediaplayer handleMessage00 MSG_INIT start");
                    xmediaplayerInit();
                    Logger.log(XMediaplayerJNI.Tag, "Mediaplayer handleMessage00 MSG_INIT end");
                    return true;
                case 11:
                    Object obj2 = message.obj;
                    if (obj2 != null) {
                        super.setPreBufferUrl(obj2.toString());
                    }
                    return true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerJNI, com.ximalaya.ting.android.player.XMediaplayerImpl
    public boolean isPlaying() {
        return this.mPlayState != 12 && this.mPlayState != 3 && super.isPlaying() && this.mPlayState == 4;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public boolean isUseSystemPlayer() {
        return false;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerJNI
    public final void mOnTimedChangeListenerInner() {
        EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            eventHandler.removeMessages(202);
            this.mEventHandler.obtainMessage(202).sendToTarget();
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerJNI
    public final void onBufferingUpdateInner(int i) {
        if (this.mEventHandler == null || System.currentTimeMillis() - this.lastBufferingTime < 1000) {
            return;
        }
        this.lastBufferingTime = System.currentTimeMillis();
        this.mEventHandler.removeMessages(3);
        this.mEventHandler.obtainMessage(3, i, 0).sendToTarget();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerJNI
    public final void onCompletionInner() {
        stayAwake(false);
        this.mHandler.obtainMessage(9).sendToTarget();
        EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            eventHandler.obtainMessage(2).sendToTarget();
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerJNI
    public final void onErrorInner(int i, int i2) {
        if (i2 == -1011) {
            this.mPlayState = 12;
            Logger.log(XMediaplayerJNI.Tag, "onErrorInner mPlayState NOT_ARCH_SUPPORT");
        } else {
            Logger.log(XMediaplayerJNI.Tag, "onErrorInner errorCode:" + i + "extra:" + i2);
            this.mPlayState = 8;
        }
        super.onErrorInner(i, i2);
        stayAwake(false);
        EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            eventHandler.obtainMessage(100, i, i2).sendToTarget();
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerJNI
    public final void onInfoInner(int i) {
        if (this.mPlayState == 4 || this.mPlayState == 2) {
            if (i == 701) {
                this.isBuffing = true;
            } else if (i == 702) {
                this.isBuffing = false;
            }
            EventHandler eventHandler = this.mEventHandler;
            if (eventHandler != null) {
                eventHandler.obtainMessage(200, i, i).sendToTarget();
            }
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerJNI
    public final void onPreparedInner() {
        super.onPreparedInner();
        this.mPlayState = 3;
        EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            eventHandler.obtainMessage(1).sendToTarget();
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerJNI
    public final void onSeekCompletedInner() {
        Logger.log(XMediaplayerJNI.Tag, "onSeekCompletedInner");
        EventHandler eventHandler = this.mEventHandler;
        if (eventHandler != null) {
            eventHandler.obtainMessage(4).sendToTarget();
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerJNI, com.ximalaya.ting.android.player.XMediaplayerImpl
    public void pause() {
        stayAwake(false);
        this.mHandler.removeMessages(3);
        this.mHandler.removeMessages(0);
        this.mHandler.obtainMessage(3).sendToTarget();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerJNI, com.ximalaya.ting.android.player.XMediaplayerImpl
    public void prepareAsync() {
        this.mHandler.obtainMessage(1).sendToTarget();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerJNI, com.ximalaya.ting.android.player.XMediaplayerImpl
    public void release() {
        stayAwake(false);
        this.mHandler.removeCallbacksAndMessages(null);
        this.mEventHandler.removeCallbacksAndMessages(null);
        this.mOnPreparedListener = null;
        this.mOnBufferingUpdateListener = null;
        this.mOnCompletionListener = null;
        this.mOnSeekCompleteListener = null;
        this.mOnErrorListener = null;
        this.mOnInfoListener = null;
        this.mOnTimedChangeListener = null;
        this.mHandler.obtainMessage(5).sendToTarget();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void removeProxy() {
        StaticConfig.setHttpConfig(null);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerJNI, com.ximalaya.ting.android.player.XMediaplayerImpl
    public void reset() {
        stayAwake(false);
        Logger.log(XMediaplayerJNI.Tag, "handleMessage00 MSG_RESET start send");
        this.mHandler.removeCallbacksAndMessages(null);
        this.mEventHandler.removeCallbacksAndMessages(null);
        this.mHandler.obtainMessage(7).sendToTarget();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerJNI, com.ximalaya.ting.android.player.XMediaplayerImpl
    public void seekTo(int i) {
        this.mHandler.removeMessages(6);
        this.mHandler.obtainMessage(6, Integer.valueOf(i)).sendToTarget();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setAudioStreamType(int i) {
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerJNI, com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setDataSource(String str) {
        this.mHandler.obtainMessage(8, str).sendToTarget();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setDownloadBufferSize(long j) {
        if (j > 0) {
            XMediaPlayerConstants.DOWNLOAD_QUEUE_SIZE = (int) (j / 65536);
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setHeadsOfReq(Map<String, String> map) {
        StaticConfig.setHeads(map);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnBufferingUpdateListener(OnBufferingUpdateListener onBufferingUpdateListener) {
        this.mOnBufferingUpdateListener = onBufferingUpdateListener;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        this.mOnCompletionListener = onCompletionListener;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnErrorListener(OnErrorListener onErrorListener) {
        this.mOnErrorListener = onErrorListener;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnInfoListener(OnInfoListener onInfoListener) {
        this.mOnInfoListener = onInfoListener;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnPositionChangeListener(OnPositionChangeListener onPositionChangeListener) {
        this.mOnTimedChangeListener = onPositionChangeListener;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        this.mOnPreparedListener = onPreparedListener;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener) {
        this.mOnSeekCompleteListener = onSeekCompleteListener;
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerJNI, com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setPreBufferUrl(String str) {
        this.mHandler.obtainMessage(11, str).sendToTarget();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setProxy(HttpConfig httpConfig) {
        StaticConfig.setHttpConfig(httpConfig);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerJNI, com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setVolume(float f, float f2) {
        super.setVolume(f, f2);
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setWakeMode(Context context, int i) {
        boolean z;
        if (context == null) {
            return;
        }
        PowerManager.WakeLock wakeLock = this.mWakeLock;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                z = true;
                this.mWakeLock.release();
            } else {
                z = false;
            }
            this.mWakeLock = null;
        } else {
            z = false;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(i | 536870912, MediaPlayer.class.getName());
        this.mWakeLock = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
        if (z) {
            this.mWakeLock.acquire();
        }
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerJNI, com.ximalaya.ting.android.player.XMediaplayerImpl
    public void start() {
        stayAwake(true);
        this.mHandler.removeMessages(3);
        this.mHandler.removeMessages(0);
        this.mHandler.obtainMessage(0).sendToTarget();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerJNI, com.ximalaya.ting.android.player.XMediaplayerImpl
    public void stop() {
        stayAwake(false);
        this.mHandler.removeMessages(3);
        this.mHandler.removeMessages(0);
        this.mHandler.removeMessages(6);
        this.mHandler.obtainMessage(4).sendToTarget();
    }

    @Override // com.ximalaya.ting.android.player.XMediaplayerImpl
    public void setDataSource(FileDescriptor fileDescriptor, String str) {
        setDataSource(str);
    }
}
