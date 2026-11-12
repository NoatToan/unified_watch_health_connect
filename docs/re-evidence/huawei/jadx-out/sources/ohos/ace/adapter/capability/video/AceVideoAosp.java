package ohos.ace.adapter.capability.video;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import android.view.Window;
import com.huawei.operation.beans.TitleBean;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import ohos.ace.adapter.ALog;
import ohos.ace.adapter.AceSurfaceHolder;
import ohos.ace.adapter.AceTextureHolder;
import ohos.ace.adapter.IAceOnResourceEvent;

/* JADX INFO: loaded from: classes46.dex */
public class AceVideoAosp extends AceVideoBase implements MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnBufferingUpdateListener {
    private static final AudioAttributes ATTR_VIDEO = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
    private static final String FAIL = "fail";
    private static final String FILE_SCHEME = "file://";
    private static final String HAP_SCHEME = "/";
    private static final int INSTANCE_ARRAY_ID = 3;
    private static final int INSTANCE_ARRAY_MODULE = 1;
    private static final int INSTANCE_ARRAY_NUM_MAX = 3;
    private static final String INSTANCE_SEPARATOR = ":";
    private static final String KEY_ISTEXTURE = "isTexture";
    private static final String KEY_SOURCE = "src";
    private static final String KEY_VALUE = "value";
    private static final String LOG_TAG = "AceVideoAosp";
    private static final int SECOND_TO_MSEC = 1000;
    private static final String SUCCESS = "success";
    private Handler asyncHandler;
    private final Context context;
    private HandlerThread handlerThread;
    private int instanceId;
    private final String instanceName;
    private boolean isInternalFirstFrameSeeking;
    private boolean isManualStartFromStopped;
    private boolean isMediaPrepared;
    private boolean isNeedResume;
    private boolean isPaused;
    private boolean isPendingRenderFirstFrameUpdate;
    private boolean isResumePlaying;
    private boolean isSetSurfaced;
    private boolean isShowFirstFrame;
    private boolean isSpeedChanged;
    private boolean isStoped;
    private boolean isTexture;
    private boolean isTrueBack;
    private final Handler mainHandler;
    private volatile MediaPlayer mediaPlayer;
    private Lock mediaPlayerLock;
    private String moduleName;
    private int position;
    private boolean shouldDelaySurfaceAttachForReset;
    private boolean shouldDelaySurfaceAttachForSourceSwitch;
    private boolean shouldNotifyCurrentTimeOnPrepared;
    private String source;
    private boolean stageMode;
    private PlayState state;
    private long surfaceId;
    private final Window window;

    public enum PlayState {
        IDLE,
        PREPARED,
        STARTED,
        PAUSED,
        STOPPED,
        PLAYBACK_COMPLETE
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }

    public AceVideoAosp(long j, String str, Context context, IAceOnResourceEvent iAceOnResourceEvent) {
        super(j, iAceOnResourceEvent);
        this.mediaPlayerLock = new ReentrantLock();
        this.moduleName = "";
        this.instanceId = -1;
        this.stageMode = true;
        this.isSpeedChanged = false;
        this.isSetSurfaced = false;
        this.surfaceId = 0L;
        this.position = 0;
        this.isResumePlaying = false;
        this.isNeedResume = false;
        this.isPaused = false;
        this.state = PlayState.IDLE;
        this.isTrueBack = false;
        this.isTexture = false;
        this.isStoped = false;
        this.isShowFirstFrame = false;
        this.isInternalFirstFrameSeeking = false;
        this.isMediaPrepared = false;
        this.isPendingRenderFirstFrameUpdate = false;
        this.shouldDelaySurfaceAttachForReset = false;
        this.shouldDelaySurfaceAttachForSourceSwitch = false;
        this.isManualStartFromStopped = false;
        this.shouldNotifyCurrentTimeOnPrepared = false;
        this.instanceName = str;
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length >= 3) {
            this.moduleName = strArrSplit[1];
            this.instanceId = Integer.parseInt(strArrSplit[3]);
        } else {
            ALog.w(LOG_TAG, "nameArray is out of max length.");
        }
        this.mediaPlayer = new MediaPlayer();
        this.context = context;
        this.window = getWindow();
        this.mainHandler = new Handler(Looper.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("video-" + j);
        this.handlerThread = handlerThread;
        handlerThread.start();
        Looper looper = this.handlerThread.getLooper();
        if (looper != null) {
            this.asyncHandler = new Handler(looper);
        } else {
            this.asyncHandler = new Handler();
        }
        try {
            this.mediaPlayer.setAudioAttributes(ATTR_VIDEO);
        } catch (IllegalArgumentException unused) {
            ALog.e(LOG_TAG, "setAudioAttributes failed.");
        } catch (IllegalStateException unused2) {
            ALog.e(LOG_TAG, "setAudioAttributes failed.");
        }
    }

    @Override // ohos.ace.adapter.capability.video.AceVideoBase
    public void release() {
        ALog.i(LOG_TAG, "media player will release.");
        this.isPaused = true;
        runAsync(new Runnable() { // from class: ohos.ace.adapter.capability.video.AceVideoAosp$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2000lambda$release$0$ohosaceadaptercapabilityvideoAceVideoAosp();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015 A[PHI: r1
      0x0015: PHI (r1v6 android.os.HandlerThread) = (r1v3 android.os.HandlerThread), (r1v8 android.os.HandlerThread) binds: [B:16:0x0034, B:8:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: lambda$release$0$ohos-ace-adapter-capability-video-AceVideoAosp, reason: not valid java name */
    /* synthetic */ void m2000lambda$release$0$ohosaceadaptercapabilityvideoAceVideoAosp() {
        HandlerThread handlerThread;
        this.mediaPlayerLock.lock();
        try {
            if (this.mediaPlayer == null) {
                ALog.w(LOG_TAG, "media player is null.");
                handlerThread = this.handlerThread;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                    this.handlerThread = null;
                }
            } else {
                try {
                    this.mediaPlayer.stop();
                    this.mediaPlayer.release();
                    this.mediaPlayer = null;
                } catch (IllegalStateException unused) {
                    ALog.e(LOG_TAG, "mediaPlayer release failed, IllegalStateException.");
                }
                handlerThread = this.handlerThread;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                    this.handlerThread = null;
                }
            }
            this.mediaPlayerLock.unlock();
        } catch (Throwable th) {
            HandlerThread handlerThread2 = this.handlerThread;
            if (handlerThread2 != null) {
                handlerThread2.quitSafely();
                this.handlerThread = null;
            }
            this.mediaPlayerLock.unlock();
            throw th;
        }
    }

    private String getUrl(String str) {
        return str.indexOf("file://") == 0 ? str.substring(7) : str;
    }

    private boolean setDataSource(String str) {
        ALog.i(LOG_TAG, "setDataSource param:" + str);
        if (str == null || str.isEmpty()) {
            ALog.e(LOG_TAG, "param is null");
            return false;
        }
        this.source = str;
        if (this.mediaPlayer == null) {
            ALog.w(LOG_TAG, "media player is null.");
            return false;
        }
        try {
            if (str.startsWith("file://")) {
                this.mediaPlayer.setDataSource(str.substring(7));
                return true;
            }
            if (str.startsWith("/")) {
                return setDataSourceWithFd(str);
            }
            this.mediaPlayer.setDataSource(str);
            return true;
        } catch (IOException unused) {
            ALog.e(LOG_TAG, "setDataSource failed, IOException");
            return false;
        }
    }

    @Override // ohos.ace.adapter.capability.video.AceVideoBase
    public String initMediaPlayer(Map<String, String> map) {
        ALog.i(LOG_TAG, "initMediaPlayer param:" + map);
        this.mediaPlayerLock.lock();
        try {
            if (map == null) {
                ALog.e(LOG_TAG, "initMediaPlayer failed, param is null");
            } else {
                super.initMediaPlayer(map);
                if (this.mediaPlayer == null) {
                    ALog.w(LOG_TAG, "media player is null.");
                } else if (map.containsKey(KEY_SOURCE) && setDataSource(map.get(KEY_SOURCE))) {
                    this.mediaPlayer.setOnPreparedListener(this);
                    this.mediaPlayer.setOnErrorListener(this);
                    this.mediaPlayer.setOnSeekCompleteListener(this);
                    this.mediaPlayer.setOnCompletionListener(this);
                    this.mediaPlayer.setOnBufferingUpdateListener(this);
                    this.isMediaPrepared = false;
                    this.mediaPlayer.prepareAsync();
                    this.state = PlayState.PREPARED;
                    this.mediaPlayerLock.unlock();
                    return "success";
                }
            }
        } catch (IllegalStateException unused) {
            ALog.e(LOG_TAG, "initMediaPlayer failed, IllegalStateException.");
            reset();
        } finally {
            this.mediaPlayerLock.unlock();
        }
        return "fail";
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        boolean z;
        final MediaPlayer mediaPlayer2;
        ALog.i(LOG_TAG, "onPrepared");
        this.mediaPlayerLock.lock();
        try {
            if (handleStoppedOnPrepared()) {
                this.mediaPlayerLock.unlock();
                return;
            }
            if (isMediaPlayerInvalid(mediaPlayer)) {
                this.mediaPlayerLock.unlock();
                return;
            }
            boolean z2 = true;
            this.isMediaPrepared = true;
            attachSurfaceIfNeededForSeek();
            try {
                boolean z3 = this.mediaPlayer.isPlaying() && !this.isPaused;
                z = this.isManualStartFromStopped;
                if (z || z3) {
                    try {
                        this.isManualStartFromStopped = false;
                    } catch (IllegalStateException unused) {
                        ALog.e(LOG_TAG, "onPrepared check isPlaying failed, IllegalStateException.");
                    }
                } else {
                    z2 = false;
                }
            } catch (IllegalStateException unused2) {
                z2 = false;
                z = false;
            }
            if (shouldAutoPlayOnPrepared(z)) {
                startPlaybackAndNotify();
            }
            resetFromParams(this.mediaPlayer);
            try {
                if (handleResumeOnPreparedInternal()) {
                    this.mediaPlayerLock.unlock();
                    return;
                }
                handlePauseWhenNotAutoPlay(z2);
            } catch (IllegalStateException unused3) {
                ALog.e(LOG_TAG, "run onPrepared, IllegalStateException.");
            }
            final boolean z4 = this.shouldNotifyCurrentTimeOnPrepared;
            if (this.shouldDelaySurfaceAttachForReset && this.isShowFirstFrame && !this.isSetSurfaced) {
                mediaPlayer2 = this.mediaPlayer;
                this.shouldDelaySurfaceAttachForReset = false;
            } else {
                mediaPlayer2 = null;
            }
            this.shouldNotifyCurrentTimeOnPrepared = false;
            this.mediaPlayerLock.unlock();
            runOnUIThread(new Runnable() { // from class: ohos.ace.adapter.capability.video.AceVideoAosp$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1999xc5b04db0(mediaPlayer2, z4);
                }
            });
        } catch (Throwable th) {
            this.mediaPlayerLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: lambda$onPrepared$1$ohos-ace-adapter-capability-video-AceVideoAosp, reason: not valid java name */
    /* synthetic */ void m1999xc5b04db0(MediaPlayer mediaPlayer, boolean z) {
        if (mediaPlayer != null) {
            restoreSurfaceAfterResetIfNeeded(mediaPlayer);
        }
        if (z) {
            fireGetCurrenttime(0);
        }
        m2003x75818e90();
        updateFirstFrameVisibility();
    }

    private void resetFromParams(MediaPlayer mediaPlayer) {
        if (mediaPlayer != null) {
            try {
                if (isMute()) {
                    mediaPlayer.setVolume(0.0f, 0.0f);
                }
            } catch (IllegalArgumentException unused) {
                ALog.e(LOG_TAG, "resetFromParams, IllegalArgumentException.");
                return;
            } catch (IllegalStateException unused2) {
                ALog.e(LOG_TAG, "resetFromParams, IllegalStateException.");
                return;
            }
        }
        if (mediaPlayer != null && isLooping()) {
            mediaPlayer.setLooping(true);
        }
        if (this.isNeedResume && this.position > 0) {
            this.mediaPlayer.seekTo(this.position);
        }
        if (this.isSpeedChanged || this.isNeedResume) {
            setSpeedWithCheckVersion(Float.valueOf(getSpeed()));
            this.isSpeedChanged = false;
        }
    }

    private boolean handleStoppedOnPrepared() {
        if (!this.isStoped || this.state != PlayState.STOPPED) {
            return false;
        }
        this.mediaPlayer.stop();
        ALog.e(LOG_TAG, "media player is STOPPED.");
        return true;
    }

    private boolean isMediaPlayerInvalid(MediaPlayer mediaPlayer) {
        if (mediaPlayer != null && this.mediaPlayer != null) {
            return false;
        }
        ALog.e(LOG_TAG, "onPrepared failed, MediaPlayer is null");
        return true;
    }

    private boolean shouldAutoPlayOnPrepared(boolean z) {
        return (this.isNeedResume || !isAutoPlay() || z) ? false : true;
    }

    private void startPlaybackAndNotify() {
        this.mediaPlayer.start();
        this.state = PlayState.STARTED;
        setKeepScreenOn(true);
        runOnUIThread(new Runnable() { // from class: ohos.ace.adapter.capability.video.AceVideoAosp$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m2001xcc052548();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$startPlaybackAndNotify$2$ohos-ace-adapter-capability-video-AceVideoAosp, reason: not valid java name */
    /* synthetic */ void m2001xcc052548() {
        firePlayStatusChange(true);
    }

    private boolean handleResumeOnPreparedInternal() {
        if (!this.isNeedResume) {
            return false;
        }
        if (this.isResumePlaying) {
            if (!this.mediaPlayer.isPlaying()) {
                this.mediaPlayer.start();
            }
            this.state = PlayState.STARTED;
            setKeepScreenOn(true);
            runOnUIThread(new Runnable() { // from class: ohos.ace.adapter.capability.video.AceVideoAosp$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1994xdb3957fc();
                }
            });
            this.isResumePlaying = false;
        } else if (this.isStoped) {
            if (this.mediaPlayer.isPlaying()) {
                this.mediaPlayer.stop();
            }
            this.state = PlayState.STOPPED;
        } else {
            if (this.mediaPlayer.isPlaying()) {
                this.mediaPlayer.pause();
            }
            this.state = PlayState.PAUSED;
        }
        this.isNeedResume = false;
        return true;
    }

    /* JADX INFO: renamed from: lambda$handleResumeOnPreparedInternal$3$ohos-ace-adapter-capability-video-AceVideoAosp, reason: not valid java name */
    /* synthetic */ void m1994xdb3957fc() {
        firePlayStatusChange(true);
    }

    private void handlePauseWhenNotAutoPlay(boolean z) {
        if (isAutoPlay() || !this.mediaPlayer.isPlaying() || z) {
            return;
        }
        this.mediaPlayer.pause();
        this.state = PlayState.PAUSED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: handlePreparedOnUiThread, reason: merged with bridge method [inline-methods] */
    public void m2003x75818e90() {
        this.mediaPlayerLock.lock();
        try {
            if (this.mediaPlayer != null) {
                try {
                    firePrepared(this.mediaPlayer.getVideoWidth(), this.mediaPlayer.getVideoHeight(), this.mediaPlayer.getDuration(), this.mediaPlayer.isPlaying(), false);
                } catch (IllegalStateException unused) {
                    ALog.e(LOG_TAG, "run firePrepared, IllegalStateException.");
                }
            }
        } finally {
            this.mediaPlayerLock.unlock();
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        ALog.i(LOG_TAG, "onError");
        runOnUIThread(new Runnable() { // from class: ohos.ace.adapter.capability.video.AceVideoAosp.1
            @Override // java.lang.Runnable
            public void run() {
                AceVideoAosp.this.fireError();
            }
        });
        setKeepScreenOn(false);
        runAsync(new Runnable() { // from class: ohos.ace.adapter.capability.video.AceVideoAosp$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1998lambda$onError$4$ohosaceadaptercapabilityvideoAceVideoAosp();
            }
        });
        return false;
    }

    /* JADX INFO: renamed from: lambda$onError$4$ohos-ace-adapter-capability-video-AceVideoAosp, reason: not valid java name */
    /* synthetic */ void m1998lambda$onError$4$ohosaceadaptercapabilityvideoAceVideoAosp() {
        this.mediaPlayerLock.lock();
        this.isNeedResume = true;
        this.isMediaPrepared = false;
        try {
            reset();
            if (!resume()) {
                ALog.w(LOG_TAG, "media player resume failed.");
                reset();
            }
        } finally {
            this.mediaPlayerLock.unlock();
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        runOnUIThread(new Runnable() { // from class: ohos.ace.adapter.capability.video.AceVideoAosp.2
            @Override // java.lang.Runnable
            public void run() {
                AceVideoAosp.this.fireCompletion();
            }
        });
        this.state = PlayState.PLAYBACK_COMPLETE;
        setKeepScreenOn(false);
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mediaPlayer) {
        this.mediaPlayerLock.lock();
        try {
            boolean z = false;
            if (this.isInternalFirstFrameSeeking) {
                this.isInternalFirstFrameSeeking = false;
                z = true;
            }
            this.mediaPlayerLock.unlock();
            if (z) {
                return;
            }
            runOnUIThread(new Runnable() { // from class: ohos.ace.adapter.capability.video.AceVideoAosp.3
                @Override // java.lang.Runnable
                public void run() {
                    AceVideoAosp.this.mediaPlayerLock.lock();
                    try {
                        if (AceVideoAosp.this.mediaPlayer != null) {
                            try {
                                int currentPosition = AceVideoAosp.this.mediaPlayer.getCurrentPosition() / 1000;
                                AceVideoAosp.this.fireGetCurrenttime(currentPosition);
                                AceVideoAosp.this.fireSeekComplete(currentPosition);
                            } catch (IllegalStateException unused) {
                                ALog.e(AceVideoAosp.LOG_TAG, "run failed, IllegalStateException.");
                            }
                        }
                        AceVideoAosp.this.mediaPlayerLock.unlock();
                    } catch (Throwable th) {
                        AceVideoAosp.this.mediaPlayerLock.unlock();
                        throw th;
                    }
                }
            });
        } catch (Throwable th) {
            this.mediaPlayerLock.unlock();
            throw th;
        }
    }

    @Override // ohos.ace.adapter.capability.video.AceVideoBase
    public String start(Map<String, String> map) {
        Surface surface;
        ALog.i(LOG_TAG, "start param:" + map);
        this.mediaPlayerLock.lock();
        try {
            if (this.mediaPlayer == null) {
                ALog.w(LOG_TAG, "media player is null.");
            } else {
                if (this.isPendingRenderFirstFrameUpdate) {
                    this.isPendingRenderFirstFrameUpdate = false;
                }
                if (!this.isSetSurfaced && (surface = getSurface()) != null && this.mediaPlayer != null) {
                    this.mediaPlayer.setSurface(surface);
                    this.isSetSurfaced = true;
                    this.shouldDelaySurfaceAttachForReset = false;
                    this.shouldDelaySurfaceAttachForSourceSwitch = false;
                }
                if (this.state != PlayState.STOPPED || preparePlayerFromStopped(true, "start")) {
                    if (this.isSpeedChanged) {
                        setSpeedWithCheckVersion(Float.valueOf(getSpeed()));
                        this.isSpeedChanged = false;
                    }
                    if (this.mediaPlayer != null) {
                        this.isPaused = false;
                        this.mediaPlayer.start();
                        this.isStoped = false;
                    }
                    this.mediaPlayerLock.unlock();
                    this.state = PlayState.STARTED;
                    setKeepScreenOn(true);
                    return "success";
                }
            }
            this.mediaPlayerLock.unlock();
            return "fail";
        } catch (Throwable th) {
            this.mediaPlayerLock.unlock();
            throw th;
        }
    }

    @Override // ohos.ace.adapter.capability.video.AceVideoBase
    public String pause(Map<String, String> map) {
        ALog.i(LOG_TAG, "pause param:" + map);
        this.mediaPlayerLock.lock();
        try {
            if (this.state == PlayState.STOPPED || this.state == PlayState.PREPARED) {
                ALog.w(LOG_TAG, "media player is not STARTED.");
            } else {
                if (this.mediaPlayer == null) {
                    ALog.w(LOG_TAG, "media player is null.");
                } else {
                    this.state = PlayState.PAUSED;
                    this.isPaused = true;
                    setKeepScreenOn(false);
                    try {
                        this.mediaPlayer.pause();
                    } catch (IllegalStateException unused) {
                        ALog.e(LOG_TAG, "pause failed, IllegalStateException.");
                    }
                }
                this.mediaPlayerLock.unlock();
                return "fail";
            }
            this.mediaPlayerLock.unlock();
            return "success";
        } catch (Throwable th) {
            this.mediaPlayerLock.unlock();
            throw th;
        }
    }

    @Override // ohos.ace.adapter.capability.video.AceVideoBase
    /* JADX INFO: renamed from: stop */
    public String m2006lambda$null$0$ohosaceadaptercapabilityvideoAceVideoBase(Map<String, String> map) {
        ALog.i(LOG_TAG, "stop param:" + map);
        this.mediaPlayerLock.lock();
        try {
            this.isPaused = true;
            if (this.mediaPlayer == null) {
                ALog.w(LOG_TAG, "media player is null.");
            } else {
                try {
                    this.mediaPlayer.stop();
                    this.mediaPlayer.reset();
                    this.mediaPlayer.release();
                    this.mediaPlayer = new MediaPlayer();
                    this.isSetSurfaced = false;
                    Surface surface = getSurface();
                    if (surface != null) {
                        ALog.i(LOG_TAG, "MediaPlayer SetSurface");
                        this.mediaPlayer.setSurface(surface);
                        this.isSetSurfaced = true;
                    }
                    this.mediaPlayer.setAudioAttributes(ATTR_VIDEO);
                    if (!setDataSource(this.source)) {
                        ALog.e(LOG_TAG, "setDataSource failed.");
                    } else {
                        this.mediaPlayer.setOnPreparedListener(this);
                        this.mediaPlayer.setOnErrorListener(this);
                        this.mediaPlayer.setOnSeekCompleteListener(this);
                        this.mediaPlayer.setOnCompletionListener(this);
                        this.mediaPlayer.setOnBufferingUpdateListener(this);
                        this.isMediaPrepared = false;
                        this.mediaPlayerLock.unlock();
                        this.state = PlayState.STOPPED;
                        this.isStoped = true;
                        this.isManualStartFromStopped = false;
                        setKeepScreenOn(false);
                        runOnUIThread(new Runnable() { // from class: ohos.ace.adapter.capability.video.AceVideoAosp$$ExternalSyntheticLambda6
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f$0.m2002lambda$stop$5$ohosaceadaptercapabilityvideoAceVideoAosp();
                            }
                        });
                        return "success";
                    }
                } catch (IllegalStateException unused) {
                    ALog.e(LOG_TAG, "stop failed, IllegalStateException.");
                }
            }
            this.mediaPlayerLock.unlock();
            this.state = PlayState.STOPPED;
            this.isStoped = true;
            this.isManualStartFromStopped = false;
            setKeepScreenOn(false);
            return "fail";
        } catch (Throwable th) {
            this.mediaPlayerLock.unlock();
            this.state = PlayState.STOPPED;
            this.isStoped = true;
            this.isManualStartFromStopped = false;
            setKeepScreenOn(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: lambda$stop$5$ohos-ace-adapter-capability-video-AceVideoAosp, reason: not valid java name */
    /* synthetic */ void m2002lambda$stop$5$ohosaceadaptercapabilityvideoAceVideoAosp() {
        fireStop();
    }

    @Override // ohos.ace.adapter.capability.video.AceVideoBase
    public String seekTo(Map<String, String> map) {
        this.mediaPlayerLock.lock();
        try {
            if (map == null) {
                ALog.e(LOG_TAG, "seekTo failed: params is null");
            } else if (!map.containsKey("value")) {
                ALog.e(LOG_TAG, "seekTo failed: value is illegal");
            } else if (this.mediaPlayer == null) {
                ALog.w(LOG_TAG, "media player is null.");
            } else {
                if (this.state == PlayState.STOPPED) {
                    ALog.i(LOG_TAG, "seekTo ignored because player is STOPPED.");
                } else {
                    int i = Integer.parseInt(map.get("value"));
                    attachSurfaceIfNeededForSeek();
                    if (map.containsKey("seekMode")) {
                        this.mediaPlayer.seekTo(i, Integer.parseInt(map.get("seekMode")));
                    } else {
                        this.mediaPlayer.seekTo(i);
                    }
                }
                this.mediaPlayerLock.unlock();
                return "success";
            }
        } catch (NumberFormatException unused) {
            ALog.e(LOG_TAG, "NumberFormatException, seek failed. value = " + map.get("value"));
        } finally {
            this.mediaPlayerLock.unlock();
        }
        return "fail";
    }

    @Override // ohos.ace.adapter.capability.video.AceVideoBase
    public String setVolume(Map<String, String> map) {
        this.mediaPlayerLock.lock();
        try {
            if (map == null) {
                ALog.e(LOG_TAG, "setVolume failed: params is null");
            } else if (!map.containsKey("value")) {
                ALog.e(LOG_TAG, "setVolume failed: value is illegal");
            } else if (this.mediaPlayer == null) {
                ALog.w(LOG_TAG, "media player is null.");
            } else {
                float f = Float.parseFloat(map.get("value"));
                if (Math.abs(f) < 1.0E-5d) {
                    this.mediaPlayer.setVolume(0.0f, 0.0f);
                    setIsMute(true);
                } else {
                    this.mediaPlayer.setVolume(f, f);
                    setIsMute(false);
                }
                ALog.i(LOG_TAG, "setVolume ." + f);
                this.mediaPlayerLock.unlock();
                return "success";
            }
        } catch (NumberFormatException unused) {
            ALog.e(LOG_TAG, "NumberFormatException, setVolume failed. value = " + map.get("value"));
        } finally {
            this.mediaPlayerLock.unlock();
        }
        return "fail";
    }

    @Override // ohos.ace.adapter.capability.video.AceVideoBase
    public String getPosition(Map<String, String> map) {
        this.mediaPlayerLock.lock();
        try {
            if (this.mediaPlayer == null) {
                ALog.w(LOG_TAG, "media player is null.");
            } else {
                try {
                    if (this.isNeedResume) {
                        ALog.i(LOG_TAG, "getPosition return:  currentpos=" + (this.position / 1000));
                        String str = "currentpos=" + (this.position / 1000);
                        this.mediaPlayerLock.unlock();
                        return str;
                    }
                    this.position = this.mediaPlayer.getCurrentPosition();
                    this.mediaPlayerLock.unlock();
                    if (!this.isSetSurfaced && this.surfaceId > 0) {
                        attachSurfaceIfNeededForSeek();
                    }
                    if (this.isShowFirstFrame || this.isPendingRenderFirstFrameUpdate) {
                        updateFirstFrameVisibility();
                    }
                    runOnUIThread(new Runnable() { // from class: ohos.ace.adapter.capability.video.AceVideoAosp.4
                        @Override // java.lang.Runnable
                        public void run() {
                            AceVideoAosp aceVideoAosp = AceVideoAosp.this;
                            aceVideoAosp.fireGetCurrenttime(aceVideoAosp.position / 1000);
                        }
                    });
                    return "currentpos=" + (this.position / 1000);
                } catch (IllegalStateException unused) {
                    ALog.e(LOG_TAG, "getCurrentPosition failed, IllegalStateException.");
                }
            }
            this.mediaPlayerLock.unlock();
            return "fail";
        } catch (Throwable th) {
            this.mediaPlayerLock.unlock();
            throw th;
        }
    }

    @Override // ohos.ace.adapter.capability.video.AceVideoBase
    public String enableLooping(Map<String, String> map) {
        this.mediaPlayerLock.lock();
        if (map != null) {
            try {
                if (this.mediaPlayer == null) {
                    ALog.w(LOG_TAG, "media player is null.");
                } else {
                    try {
                        if (map.containsKey("loop")) {
                            if (Integer.parseInt(map.get("loop")) == 1) {
                                this.mediaPlayer.setLooping(true);
                                setLooping(true);
                            } else {
                                this.mediaPlayer.setLooping(false);
                                setLooping(false);
                            }
                        }
                        this.mediaPlayerLock.unlock();
                        return "success";
                    } catch (NumberFormatException unused) {
                        ALog.e(LOG_TAG, "NumberFormatException");
                    } catch (IllegalArgumentException unused2) {
                        ALog.e(LOG_TAG, "IllegalArgumentException");
                    } catch (IllegalStateException unused3) {
                        ALog.e(LOG_TAG, "IllegalStateException");
                    }
                }
            } catch (Throwable th) {
                this.mediaPlayerLock.unlock();
                throw th;
            }
        }
        this.mediaPlayerLock.unlock();
        return "fail";
    }

    @Override // ohos.ace.adapter.capability.video.AceVideoBase
    public String setSpeed(Map<String, String> map) {
        this.mediaPlayerLock.lock();
        try {
            if (map == null) {
                ALog.e(LOG_TAG, "setSpeed failed: params is null");
            } else if (!map.containsKey("value")) {
                ALog.e(LOG_TAG, "setSpeed failed: value is illegal");
            } else {
                setSpeed(Float.parseFloat(map.get("value")));
                this.isSpeedChanged = true;
                if (this.state == PlayState.STARTED) {
                    setSpeedWithCheckVersion(Float.valueOf(getSpeed()));
                } else if (this.state != PlayState.PAUSED) {
                    ALog.w(LOG_TAG, "If the speed is greater than 0, the video will start playing.");
                } else if (this.mediaPlayer != null && this.mediaPlayer.isPlaying()) {
                    this.mediaPlayer.pause();
                }
                this.mediaPlayerLock.unlock();
                return "success";
            }
        } catch (NumberFormatException unused) {
            ALog.e(LOG_TAG, "NumberFormatException, setSpeed failed. value = " + map.get("value"));
        } finally {
            this.mediaPlayerLock.unlock();
        }
        return "fail";
    }

    @Override // ohos.ace.adapter.capability.video.AceVideoBase
    public String setDirection(Map<String, String> map) {
        return "success";
    }

    @Override // ohos.ace.adapter.capability.video.AceVideoBase
    public String setLandscape(Map<String, String> map) {
        return "success";
    }

    @Override // ohos.ace.adapter.capability.video.AceVideoBase
    public String setSurface(Map<String, String> map) {
        this.mediaPlayerLock.lock();
        try {
            if (map == null) {
                ALog.e(LOG_TAG, "setSurface failed: params is null");
            } else if (!map.containsKey("value")) {
                ALog.e(LOG_TAG, "setSurface failed: value is illegal");
            } else {
                try {
                    try {
                        this.surfaceId = Integer.parseInt(map.get("value"));
                        if (Integer.parseInt(map.get(KEY_ISTEXTURE)) == 1) {
                            this.isTexture = true;
                        }
                        ALog.i(LOG_TAG, "setSurface id:" + this.surfaceId);
                        if (this.shouldDelaySurfaceAttachForReset || this.shouldDelaySurfaceAttachForSourceSwitch || this.isPendingRenderFirstFrameUpdate) {
                            this.isSetSurfaced = false;
                        } else {
                            Surface surface = getSurface();
                            if (surface != null && this.mediaPlayer != null) {
                                this.mediaPlayer.setSurface(surface);
                                this.isSetSurfaced = true;
                                this.mediaPlayerLock.unlock();
                                updateFirstFrameVisibility();
                                return "success";
                            }
                            this.isSetSurfaced = false;
                            ALog.w(LOG_TAG, "setSurface deferred: surface or mediaPlayer not ready yet.");
                        }
                        this.mediaPlayerLock.unlock();
                        return "success";
                    } catch (NumberFormatException unused) {
                        ALog.e(LOG_TAG, "NumberFormatException, setSurface failed. value = " + map.get("value"));
                    }
                } catch (IllegalArgumentException unused2) {
                    ALog.e(LOG_TAG, "IllegalArgumentException, setSurface failed. value = " + map.get("value"));
                } catch (IllegalStateException unused3) {
                    ALog.e(LOG_TAG, "IllegalStateException, setSurface failed. value = " + map.get("value"));
                }
            }
            this.mediaPlayerLock.unlock();
            return "fail";
        } catch (Throwable th) {
            this.mediaPlayerLock.unlock();
            throw th;
        }
    }

    @Override // ohos.ace.adapter.capability.video.AceVideoBase
    /* JADX INFO: renamed from: updateResource */
    public String m2007lambda$null$2$ohosaceadaptercapabilityvideoAceVideoBase(Map<String, String> map) {
        String strUpdateResourceInternal;
        ALog.i(LOG_TAG, "updateResource param:" + map);
        this.mediaPlayerLock.lock();
        if (map != null) {
            try {
                if (this.mediaPlayer == null) {
                    ALog.e(LOG_TAG, "updateResource failed, param is null");
                    strUpdateResourceInternal = "fail";
                } else {
                    strUpdateResourceInternal = updateResourceInternal(map);
                }
            } finally {
                this.mediaPlayerLock.unlock();
            }
        } else {
            ALog.e(LOG_TAG, "updateResource failed, param is null");
            strUpdateResourceInternal = "fail";
        }
        return strUpdateResourceInternal;
    }

    @Override // ohos.ace.adapter.capability.video.AceVideoBase
    public String setRenderFirstFrame(Map<String, String> map) {
        String str;
        if (map == null || (str = map.get("showFirstFrame")) == null) {
            return "fail";
        }
        try {
            this.isShowFirstFrame = Integer.parseInt(str) != 0;
            return handleSetRenderFirstFrame();
        } catch (NumberFormatException unused) {
            ALog.e(LOG_TAG, "setRenderFirstFrame failed: invalid showFirstFrame value.");
            return "fail";
        }
    }

    private void updateFirstFrameVisibility() {
        MediaPlayer mediaPlayer;
        if (!this.isPendingRenderFirstFrameUpdate && this.isShowFirstFrame && this.isMediaPrepared) {
            if (!this.isSetSurfaced) {
                attachSurfaceIfNeededForSeek();
                if (!this.isSetSurfaced) {
                    return;
                }
            }
            this.mediaPlayerLock.lock();
            try {
                try {
                    if (this.mediaPlayer == null || this.mediaPlayer.isPlaying()) {
                        mediaPlayer = null;
                    } else if (this.mediaPlayer.getCurrentPosition() <= 0) {
                        this.isInternalFirstFrameSeeking = true;
                        mediaPlayer = this.mediaPlayer;
                    } else {
                        this.mediaPlayerLock.unlock();
                        return;
                    }
                } catch (IllegalStateException unused) {
                    this.isInternalFirstFrameSeeking = false;
                    ALog.e(LOG_TAG, "updateFirstFrameVisibility seekTo failed, IllegalStateException.");
                }
                this.mediaPlayerLock.unlock();
                if (mediaPlayer == null) {
                    return;
                }
                try {
                    mediaPlayer.seekTo(0);
                } catch (IllegalStateException unused2) {
                    this.mediaPlayerLock.lock();
                    try {
                        if (this.mediaPlayer == mediaPlayer) {
                            this.isInternalFirstFrameSeeking = false;
                        }
                        this.mediaPlayerLock.unlock();
                        ALog.e(LOG_TAG, "updateFirstFrameVisibility seekTo failed, IllegalStateException.");
                    } catch (Throwable th) {
                        this.mediaPlayerLock.unlock();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                this.mediaPlayerLock.unlock();
                throw th2;
            }
        }
    }

    @Override // ohos.ace.adapter.capability.video.AceVideoBase
    public void onActivityResume() {
        runAsync(new Runnable() { // from class: ohos.ace.adapter.capability.video.AceVideoAosp$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1997xdbea2feb();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onActivityResume$7$ohos-ace-adapter-capability-video-AceVideoAosp, reason: not valid java name */
    /* synthetic */ void m1997xdbea2feb() {
        if (this.isResumePlaying) {
            start(null);
            this.isResumePlaying = false;
            runOnUIThread(new Runnable() { // from class: ohos.ace.adapter.capability.video.AceVideoAosp$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1995lambda$null$6$ohosaceadaptercapabilityvideoAceVideoAosp();
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$null$6$ohos-ace-adapter-capability-video-AceVideoAosp, reason: not valid java name */
    /* synthetic */ void m1995lambda$null$6$ohosaceadaptercapabilityvideoAceVideoAosp() {
        firePlayStatusChange(true);
    }

    @Override // ohos.ace.adapter.capability.video.AceVideoBase
    public void onActivityPause() {
        runAsync(new Runnable() { // from class: ohos.ace.adapter.capability.video.AceVideoAosp$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1996x6e78b797();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onActivityPause$8$ohos-ace-adapter-capability-video-AceVideoAosp, reason: not valid java name */
    /* synthetic */ void m1996x6e78b797() {
        this.isResumePlaying = (this.mediaPlayer == null || !this.mediaPlayer.isPlaying() || this.isPaused) ? false : true;
        pause(null);
        runAsync(new Runnable() { // from class: ohos.ace.adapter.capability.video.AceVideoAosp.5
            @Override // java.lang.Runnable
            public void run() {
                AceVideoAosp.this.runOnUIThread(new Runnable() { // from class: ohos.ace.adapter.capability.video.AceVideoAosp.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AceVideoAosp.this.firePlayStatusChange(false);
                    }
                });
            }
        });
    }

    private void setKeepScreenOn(boolean z) {
        if (z) {
            runOnUIThread(new Runnable() { // from class: ohos.ace.adapter.capability.video.AceVideoAosp.6
                @Override // java.lang.Runnable
                public void run() {
                    if (AceVideoAosp.this.window != null) {
                        AceVideoAosp.this.window.addFlags(128);
                    }
                }
            });
        } else {
            runOnUIThread(new Runnable() { // from class: ohos.ace.adapter.capability.video.AceVideoAosp.7
                @Override // java.lang.Runnable
                public void run() {
                    if (AceVideoAosp.this.window != null) {
                        AceVideoAosp.this.window.clearFlags(128);
                    }
                }
            });
        }
    }

    private void setSpeedWithCheckVersion(Float f) {
        try {
            if (this.mediaPlayer == null) {
                ALog.w(LOG_TAG, "media player is null.");
            } else {
                this.mediaPlayer.setPlaybackParams(this.mediaPlayer.getPlaybackParams().setSpeed(f.floatValue()));
            }
        } catch (IllegalArgumentException unused) {
            ALog.e(LOG_TAG, "setSpeedWithCheckVersion failed.");
        } catch (IllegalStateException unused2) {
            ALog.e(LOG_TAG, "setSpeedWithCheckVersion failed.");
        }
    }

    private Window getWindow() {
        Context context = this.context;
        if (!(context instanceof Activity)) {
            ALog.e(LOG_TAG, "Cannot get activity.");
            return null;
        }
        return ((Activity) context).getWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnUIThread(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.mainHandler.post(runnable);
        }
    }

    private void reset() {
        this.state = PlayState.IDLE;
        this.isSetSurfaced = false;
        this.isSpeedChanged = true;
        this.isMediaPrepared = false;
        this.isPendingRenderFirstFrameUpdate = false;
        this.isInternalFirstFrameSeeking = false;
        this.shouldDelaySurfaceAttachForReset = false;
        this.shouldDelaySurfaceAttachForSourceSwitch = false;
        this.isManualStartFromStopped = false;
        if (this.mediaPlayer == null) {
            ALog.w(LOG_TAG, "media player is null.");
            return;
        }
        try {
            this.position = this.mediaPlayer.getCurrentPosition();
            this.mediaPlayer.reset();
            this.mediaPlayer.release();
            this.mediaPlayer = null;
        } catch (IllegalStateException unused) {
            ALog.e(LOG_TAG, "mediaPlayer.release, IllegalStateException.");
            this.mediaPlayer = null;
        }
    }

    private boolean resume() {
        ALog.i(LOG_TAG, "MediaPlayer resuming.");
        if (this.mediaPlayer != null && !this.isNeedResume) {
            ALog.i(LOG_TAG, "MediaPlayer no need to resume.");
            return true;
        }
        this.isTrueBack = false;
        this.mediaPlayer = new MediaPlayer();
        this.isSetSurfaced = false;
        Surface surface = getSurface();
        if (surface != null) {
            ALog.i(LOG_TAG, "MediaPlayer SetSurface");
            this.mediaPlayer.setSurface(surface);
            this.isSetSurfaced = true;
        }
        try {
            this.mediaPlayer.setAudioAttributes(ATTR_VIDEO);
            if (!setDataSource(this.source)) {
                ALog.e(LOG_TAG, "setDataSource failed.");
                return false;
            }
            this.mediaPlayer.setOnPreparedListener(this);
            this.mediaPlayer.setOnErrorListener(this);
            this.mediaPlayer.setOnSeekCompleteListener(this);
            this.mediaPlayer.setOnCompletionListener(this);
            this.mediaPlayer.setOnBufferingUpdateListener(this);
            this.isMediaPrepared = false;
            this.mediaPlayer.prepareAsync();
            this.state = PlayState.PREPARED;
            ALog.i(LOG_TAG, "MediaPlayer resumed.");
            return true;
        } catch (IllegalArgumentException unused) {
            ALog.e(LOG_TAG, "resume failed, IllegalArgumentException.");
            return false;
        } catch (IllegalStateException unused2) {
            ALog.e(LOG_TAG, "resume failed, IllegalStateException.");
            return false;
        }
    }

    private boolean setDataSourceWithFd(String str) {
        AssetManager assets = this.context.getAssets();
        if (assets == null) {
            ALog.e(LOG_TAG, "setDataSource null assetManager");
            return false;
        }
        try {
            if (this.stageMode) {
                try {
                    String str2 = "arkui-x" + File.separator + this.moduleName + File.separator + "ets" + str;
                    ALog.i(LOG_TAG, "setDataSourc hapPath:" + str2);
                    AssetFileDescriptor assetFileDescriptorOpenFd = assets.openFd(str2);
                    this.mediaPlayer.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                } catch (IOException unused) {
                    ALog.e(LOG_TAG, "not found asset in instance path, now begin to search asset in share path");
                    return false;
                }
            } else {
                try {
                    AssetFileDescriptor assetFileDescriptorOpenFd2 = assets.openFd("js" + File.separator + this.moduleName + File.separator + str.substring(1));
                    this.mediaPlayer.setDataSource(assetFileDescriptorOpenFd2.getFileDescriptor(), assetFileDescriptorOpenFd2.getStartOffset(), assetFileDescriptorOpenFd2.getLength());
                } catch (IOException unused2) {
                    ALog.e(LOG_TAG, "not found asset in instance path, now begin to search asset in share path");
                    assets.openFd("js" + File.separator + TitleBean.RIGHT_BTN_TYPE_SHARE + File.separator + str.substring(1));
                    return false;
                }
            }
            return true;
        } catch (IOException unused3) {
            ALog.e(LOG_TAG, "setDataSource failed, IOException");
            return false;
        }
    }

    private boolean preparePlayerFromStopped(boolean z, String str) {
        try {
            this.isManualStartFromStopped = z;
            this.isStoped = false;
            if (this.mediaPlayer != null) {
                this.mediaPlayer.prepare();
                this.isMediaPrepared = true;
                this.state = PlayState.PREPARED;
            }
            return true;
        } catch (IOException unused) {
            this.isManualStartFromStopped = false;
            this.isStoped = true;
            this.state = PlayState.STOPPED;
            ALog.e(LOG_TAG, str + " failed, IOException");
            return false;
        } catch (IllegalStateException unused2) {
            this.isManualStartFromStopped = false;
            this.isStoped = true;
            this.state = PlayState.STOPPED;
            ALog.e(LOG_TAG, str + " failed, IllegalStateException.");
            return false;
        }
    }

    private String updateResourceInternal(Map<String, String> map) {
        try {
            boolean zIsResetRequest = isResetRequest(map);
            prepareUpdateFlags(zIsResetRequest);
            detachSurfaceBeforeUpdate(zIsResetRequest);
            if (!resetAndPreparePlayer(map)) {
                resetUpdateFlags();
                return "fail";
            }
            runOnUIThread(new Runnable() { // from class: ohos.ace.adapter.capability.video.AceVideoAosp$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m2003x75818e90();
                }
            });
            if (zIsResetRequest) {
                return keepFrameAfterReset();
            }
            return handleSourceSwitchAfterPrepare();
        } catch (IOException unused) {
            resetUpdateFlags();
            ALog.e(LOG_TAG, "updateResource failed, IOException");
            return "fail";
        } catch (IllegalStateException unused2) {
            resetUpdateFlags();
            ALog.e(LOG_TAG, "updateResource failed, IllegalStateException.");
            return "fail";
        }
    }

    private void resetUpdateFlags() {
        this.isPendingRenderFirstFrameUpdate = false;
        this.shouldDelaySurfaceAttachForReset = false;
        this.shouldDelaySurfaceAttachForSourceSwitch = false;
        this.shouldNotifyCurrentTimeOnPrepared = false;
    }

    private boolean isResetRequest(Map<String, String> map) {
        if (!map.containsKey("reset")) {
            return false;
        }
        try {
            return Integer.parseInt(map.get("reset")) != 0;
        } catch (NumberFormatException unused) {
            ALog.e(LOG_TAG, "isResetRequest failed: invalid reset value.");
            return false;
        }
    }

    private void prepareUpdateFlags(boolean z) {
        this.isPendingRenderFirstFrameUpdate = !z;
        this.shouldDelaySurfaceAttachForReset = z;
        this.shouldDelaySurfaceAttachForSourceSwitch = (z || this.isShowFirstFrame) ? false : true;
        this.shouldNotifyCurrentTimeOnPrepared = z;
    }

    private void detachSurfaceBeforeUpdate(boolean z) {
        if (this.isSetSurfaced) {
            try {
                this.mediaPlayer.setSurface(null);
                this.isSetSurfaced = false;
            } catch (IllegalArgumentException unused) {
                ALog.e(LOG_TAG, z ? "updateResource detach current surface before reset failed, IllegalArgumentException." : "updateResource detach current surface before source switch failed, IllegalArgumentException.");
            }
        }
    }

    private boolean resetAndPreparePlayer(Map<String, String> map) throws IOException {
        this.mediaPlayer.reset();
        this.state = PlayState.IDLE;
        this.position = 0;
        this.isSetSurfaced = false;
        if (!map.containsKey(KEY_SOURCE) || !setDataSource(map.get(KEY_SOURCE))) {
            return false;
        }
        this.mediaPlayer.prepare();
        this.isMediaPrepared = true;
        this.state = PlayState.PREPARED;
        return true;
    }

    private String keepFrameAfterReset() {
        setKeepScreenOn(false);
        return "success";
    }

    private void restoreSurfaceAfterResetIfNeeded(MediaPlayer mediaPlayer) {
        if (mediaPlayer == null || this.mediaPlayer != mediaPlayer || this.isSetSurfaced) {
            return;
        }
        try {
            bindSurfaceForPlayer(mediaPlayer);
        } catch (IllegalArgumentException unused) {
            ALog.e(LOG_TAG, "reset restore surface failed, IllegalArgumentException.");
        } catch (IllegalStateException unused2) {
            ALog.e(LOG_TAG, "reset restore surface failed, IllegalStateException.");
        }
    }

    private String handleSourceSwitchAfterPrepare() {
        if (this.isShowFirstFrame) {
            return renderFirstFrameAfterSourceSwitch();
        }
        this.shouldDelaySurfaceAttachForSourceSwitch = false;
        this.isPendingRenderFirstFrameUpdate = false;
        bindSurfaceForCurrentPlayer();
        setKeepScreenOn(false);
        return "success";
    }

    private String renderFirstFrameAfterSourceSwitch() {
        this.shouldDelaySurfaceAttachForSourceSwitch = false;
        bindSurfaceForCurrentPlayer();
        if (!this.isSetSurfaced) {
            return "success";
        }
        this.isPendingRenderFirstFrameUpdate = false;
        this.mediaPlayer.start();
        this.state = PlayState.STARTED;
        this.mediaPlayer.pause();
        this.state = PlayState.PAUSED;
        setKeepScreenOn(false);
        return "success";
    }

    private String handleSetRenderFirstFrame() {
        if (this.shouldDelaySurfaceAttachForReset) {
            return "success";
        }
        boolean z = this.shouldDelaySurfaceAttachForSourceSwitch;
        if (z && !this.isShowFirstFrame) {
            return "success";
        }
        if (z) {
            this.shouldDelaySurfaceAttachForSourceSwitch = false;
        }
        boolean z2 = this.isPendingRenderFirstFrameUpdate;
        this.isPendingRenderFirstFrameUpdate = false;
        maybeRestoreSurfaceForFirstFrame(z2);
        updateFirstFrameVisibility();
        return "success";
    }

    private void maybeRestoreSurfaceForFirstFrame(boolean z) {
        if (!this.isShowFirstFrame || this.isSetSurfaced) {
            return;
        }
        this.mediaPlayerLock.lock();
        try {
            try {
                try {
                    if (this.mediaPlayer != null) {
                        bindSurfaceForCurrentPlayer();
                        refreshSourceUpdateFirstFrame(z);
                    }
                } catch (IllegalStateException unused) {
                    ALog.e(LOG_TAG, "setRenderFirstFrame refresh first frame failed, IllegalStateException.");
                }
            } catch (IllegalArgumentException unused2) {
                ALog.e(LOG_TAG, "setRenderFirstFrame restore surface failed, IllegalArgumentException.");
            }
        } finally {
            this.mediaPlayerLock.unlock();
        }
    }

    private void refreshSourceUpdateFirstFrame(boolean z) {
        if (z && this.isShowFirstFrame && this.isMediaPrepared && this.isSetSurfaced) {
            this.mediaPlayer.start();
            this.state = PlayState.STARTED;
            this.mediaPlayer.pause();
            this.state = PlayState.PAUSED;
            setKeepScreenOn(false);
        }
    }

    private void bindSurfaceForCurrentPlayer() {
        Surface surface = getSurface();
        if (surface == null || this.mediaPlayer == null) {
            return;
        }
        this.mediaPlayer.setSurface(surface);
        this.isSetSurfaced = true;
    }

    private void bindSurfaceForPlayer(MediaPlayer mediaPlayer) {
        Surface surface = getSurface();
        if (surface == null || mediaPlayer == null) {
            return;
        }
        mediaPlayer.setSurface(surface);
        if (this.mediaPlayer == mediaPlayer) {
            this.isSetSurfaced = true;
        }
    }

    private void attachSurfaceIfNeededForSeek() {
        Surface surface;
        if (this.isSetSurfaced || (surface = getSurface()) == null || this.mediaPlayer == null) {
            return;
        }
        this.mediaPlayer.setSurface(surface);
        this.isSetSurfaced = true;
        this.shouldDelaySurfaceAttachForReset = false;
        this.shouldDelaySurfaceAttachForSourceSwitch = false;
    }

    @Override // ohos.ace.adapter.capability.video.AceVideoBase
    public String runAsync(Runnable runnable) {
        this.asyncHandler.post(runnable);
        return "success";
    }

    private Surface getSurface() {
        Surface surface;
        if (this.isTexture) {
            surface = AceTextureHolder.getSurface(this.surfaceId);
        } else {
            surface = AceSurfaceHolder.getSurface(this.instanceId, this.surfaceId);
        }
        if (surface == null || surface.isValid()) {
            return surface;
        }
        ALog.w(LOG_TAG, "getSurface returns an invalid(released) surface, ignore.");
        return null;
    }
}
