package com.ximalaya.ting.android.opensdk.player.service;

import android.content.Context;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.fitness.FitnessStatusCodes;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack;
import com.ximalaya.ting.android.opensdk.httputil.Config;
import com.ximalaya.ting.android.opensdk.httputil.util.freeflow.FreeFlowServiceUtil;
import com.ximalaya.ting.android.opensdk.model.PlayableModel;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.model.track.TrackBaseInfo;
import com.ximalaya.ting.android.opensdk.util.Logger;
import com.ximalaya.ting.android.opensdk.util.NetworkType;
import com.ximalaya.ting.android.player.XMediaPlayer;
import com.ximalaya.ting.android.player.XMediaplayerImpl;
import com.ximalaya.ting.android.player.XMediaplayerJNI;
import java.util.HashMap;

/* JADX INFO: loaded from: classes22.dex */
public class XmPlayerControl {
    private static final String TAG = "XmPlayerControl";
    public static long mLastPostion;
    public static long mPlayedDuration;
    private Context mAppCtx;
    private Config mConfig;
    private int mCurrOffset;
    private int mDuration;
    private String mLastUrl;
    private XMediaplayerImpl mMediaPlayer;
    private int mOffset;
    private XMediaPlayer.OnBufferingUpdateListener mOnBufferingUpdateListener;
    private XMediaPlayer.OnCompletionListener mOnCompletionListener;
    private XMediaPlayer.OnErrorListener mOnErrorListener;
    private XMediaPlayer.OnInfoListener mOnInfoListener;
    private XMediaPlayer.OnPlayDataOutputListener mOnPlayDataOutputListener;
    private XMediaPlayer.OnPositionChangeListener mOnPositionChangeListener;
    private XMediaPlayer.OnPreparedListener mOnPreparedListener;
    private XMediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
    private IPlaySeekListener mPlaySeekListener;
    private IXmPlayerStatusListener mPlayerStatusListener;
    private int mSeekToPosition;
    private volatile int mState;
    private long preTrackId;
    private boolean mShoudPlay = true;
    private boolean mBuffering = false;
    private boolean isDLNAState = false;
    private boolean isAudioTrackChangeState = false;
    private boolean isSeek = false;
    private PlayableModel mRealPlayableModel = null;
    private int seekToValue = 0;
    private boolean ignoreCheckIsAudition = false;
    private CountDownTimer countDownTimer = new CountDownTimer(5000, 50) { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerControl.1
        @Override // android.os.CountDownTimer
        public void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            if (XmPlayerControl.this.mOnPositionChangeListener == null || XmPlayerControl.this.mMediaPlayer == null) {
                return;
            }
            XmPlayerControl.this.mOnPositionChangeListener.onPositionChange(null, XmPlayerControl.this.mMediaPlayer.getCurrentPosition());
        }
    };
    private Handler mSeekToUseVolumeHandler = new Handler(Looper.getMainLooper());
    private Runnable mSeekToUseVolumeRunnable = new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerControl.2
        @Override // java.lang.Runnable
        public void run() {
            XmPlayerControl xmPlayerControl = XmPlayerControl.this;
            xmPlayerControl.seekToUseVolumeReal(xmPlayerControl.mSeekToPosition);
        }
    };
    private int onCompletionRetryCount = 0;
    private Handler safeFailHandler = new Handler();
    private Runnable safeFailRunnable = new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerControl.10
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (XmPlayerControl.this.mMediaPlayer != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("safeFailRunnable  === isPlaying=");
                    sb.append(!XmPlayerControl.this.mMediaPlayer.isPlaying());
                    sb.append("      state=");
                    sb.append(XmPlayerControl.this.mState);
                    sb.append("   shoudplay=");
                    sb.append(XmPlayerControl.this.mShoudPlay);
                    Logger.logToSd(sb.toString());
                }
                if (XmPlayerControl.this.mMediaPlayer == null || XmPlayerControl.this.mMediaPlayer.isPlaying()) {
                    return;
                }
                if ((XmPlayerControl.this.mState == 9 || XmPlayerControl.this.mState == 3) && XmPlayerControl.this.mShoudPlay) {
                    String str = XmPlayerControl.this.mLastUrl;
                    XmPlayerControl.this.mLastUrl = null;
                    XmPlayerControl xmPlayerControl = XmPlayerControl.this;
                    xmPlayerControl.initAndPlay(str, xmPlayerControl.mCurrOffset);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };
    private Handler checkBufferTimeLength = new Handler();
    private Runnable checkBufferTimeRunnable = new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerControl.11
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (XmPlayerControl.this.mMediaPlayer != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("checkBufferTime  === isPlaying=");
                    sb.append(!XmPlayerControl.this.mMediaPlayer.isPlaying());
                    sb.append("      state=");
                    sb.append(XmPlayerControl.this.mState);
                    sb.append("   shoudplay=");
                    sb.append(XmPlayerControl.this.mShoudPlay);
                    Logger.logToSd(sb.toString());
                }
                if (XmPlayerControl.this.mMediaPlayer == null || XmPlayerControl.this.mMediaPlayer.isPlaying() || XmPlayerControl.this.mState != 9 || !XmPlayerControl.this.mShoudPlay) {
                    return;
                }
                String str = XmPlayerControl.this.mLastUrl;
                XmPlayerControl.this.mLastUrl = null;
                XmPlayerControl xmPlayerControl = XmPlayerControl.this;
                xmPlayerControl.initAndPlay(str, xmPlayerControl.mCurrOffset);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    };
    private volatile boolean mHasPreBufferRequestBack = true;
    private float mTempo = 1.0f;
    private float mPitch = 0.0f;
    private float mRate = 1.0f;

    public interface IPlaySeekListener {
        void onSeekComplete(int i);
    }

    public XmPlayerControl(Context context) {
        this.mAppCtx = context.getApplicationContext();
    }

    public static /* synthetic */ int access$508(XmPlayerControl xmPlayerControl) {
        int i = xmPlayerControl.onCompletionRetryCount;
        xmPlayerControl.onCompletionRetryCount = i + 1;
        return i;
    }

    private void cancleSafeFailCheck() {
        this.safeFailHandler.removeCallbacks(this.safeFailRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkBufferTime() {
        if (XmPlayerService.isHtcu20) {
            this.checkBufferTimeLength.removeCallbacks(this.checkBufferTimeRunnable);
            XMediaplayerImpl xMediaplayerImpl = this.mMediaPlayer;
            if (xMediaplayerImpl == null || xMediaplayerImpl.isPlaying() || this.mState != 9 || !this.mShoudPlay) {
                return;
            }
            this.checkBufferTimeLength.postDelayed(this.checkBufferTimeRunnable, 5000L);
        }
    }

    private void initMediaPlayerListener() {
        if (this.mOnCompletionListener == null) {
            this.mOnCompletionListener = new XMediaPlayer.OnCompletionListener() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerControl.3
                @Override // com.ximalaya.ting.android.player.XMediaPlayer.OnCompletionListener
                public void onCompletion(XMediaplayerImpl xMediaplayerImpl) {
                    boolean z = (XmPlayerService.getPlayerSrvice().getCurrPlayModel() instanceof Track) && ((Track) XmPlayerService.getPlayerSrvice().getCurrPlayModel()).isAudition() && Math.abs(XmPlayerService.getPlayerSrvice().getPlayCurrPosition() - (((Track) XmPlayerService.getPlayerSrvice().getCurrPlayModel()).getSampleDuration() * 1000)) < 3000;
                    boolean z2 = XmPlayerControl.this.ignoreCheckIsAudition;
                    XmPlayerControl.this.ignoreCheckIsAudition = false;
                    if (XmPlayerService.getPlayerSrvice() != null && XmPlayerService.isHtcu20 && XmPlayerControl.this.onCompletionRetryCount < 3 && !z && !z2) {
                        XmPlayerControl.access$508(XmPlayerControl.this);
                        if (XmPlayerControl.this.mMediaPlayer != null) {
                            Logger.logToSd("XmPlayerControl.onCompletion   position=" + XmPlayerControl.this.mMediaPlayer.getCurrentPosition() + "  duration=" + XmPlayerControl.this.mMediaPlayer.getDuration());
                        }
                        if (XmPlayerControl.this.mMediaPlayer != null && XmPlayerControl.this.mMediaPlayer.getCurrentPosition() < XmPlayerControl.this.mMediaPlayer.getDuration() + FitnessStatusCodes.SUCCESS_NO_DATA_SOURCES) {
                            String str = XmPlayerControl.this.mLastUrl;
                            XmPlayerControl.this.mLastUrl = null;
                            XmPlayerControl xmPlayerControl = XmPlayerControl.this;
                            xmPlayerControl.initAndPlay(str, xmPlayerControl.mMediaPlayer.getCurrentPosition() - 1000);
                            return;
                        }
                    }
                    XmPlayerControl.this.onCompletionRetryCount = 0;
                    Logger.logToSd("XmPlayerControl onCompletion:" + System.currentTimeMillis() + "  " + Log.getStackTraceString(new Throwable()));
                    if (XmPlayerControl.this.mRealPlayableModel != null) {
                        Track track = (Track) XmPlayerControl.this.mRealPlayableModel;
                        Logger.logToSd("XmPlayerControl onCompletion track:" + track.toString());
                        if (track.isAudition()) {
                            XmPlayerControl.this.mState = 0;
                            XmPlayerControl.this.isAudioTrackChangeState = true;
                        } else {
                            XmPlayerControl.this.mState = 6;
                        }
                    } else {
                        XmPlayerControl.this.mState = 6;
                    }
                    if (XmPlayerControl.this.mPlayerStatusListener != null) {
                        XmPlayerControl.this.mPlayerStatusListener.onSoundPlayComplete();
                    }
                }
            };
        }
        if (this.mOnPreparedListener == null) {
            this.mOnPreparedListener = new XMediaPlayer.OnPreparedListener() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerControl.4
                @Override // com.ximalaya.ting.android.player.XMediaPlayer.OnPreparedListener
                public void onPrepared(XMediaplayerImpl xMediaplayerImpl) {
                    Logger.logToSd("XmPlayerControl onPrepared:" + System.currentTimeMillis());
                    if (XmPlayerControl.this.mRealPlayableModel != null) {
                        Logger.logToSd("XmPlayerControl onPrepared track:" + ((Track) XmPlayerControl.this.mRealPlayableModel).toString());
                    }
                    XmPlayerControl.this.mState = 2;
                    XmPlayerControl.this.mDuration = xMediaplayerImpl.getDuration();
                    if (XmPlayerControl.this.mPlayerStatusListener != null) {
                        XmPlayerControl.this.mPlayerStatusListener.onSoundPrepared();
                    }
                    if (XmPlayerControl.this.mShoudPlay) {
                        XmPlayerControl.this.play();
                    } else {
                        XmPlayerControl.this.mShoudPlay = true;
                    }
                    XmPlayerControl.this.setNextTrackPreBufferUrl();
                }
            };
        }
        if (this.mOnSeekCompleteListener == null) {
            this.mOnSeekCompleteListener = new XMediaPlayer.OnSeekCompleteListener() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerControl.5
                @Override // com.ximalaya.ting.android.player.XMediaPlayer.OnSeekCompleteListener
                public void onSeekComplete(XMediaplayerImpl xMediaplayerImpl) {
                    Logger.logToSd("XmPlayerControl.onSeekComplete   mState = " + XmPlayerControl.this.mState + "   " + XmPlayerControl.this.isSeek);
                    if (XmPlayerControl.this.mState != 5) {
                        XmPlayerControl.this.mState = 3;
                    }
                    if (XmPlayerControl.this.isSeek) {
                        XmPlayerControl.mLastPostion = XmPlayerControl.this.mSeekToPosition;
                        if (XmPlayerControl.this.mPlaySeekListener != null) {
                            XmPlayerControl.this.mPlaySeekListener.onSeekComplete(XmPlayerControl.this.mSeekToPosition);
                        }
                        XmPlayerControl.this.isSeek = false;
                    }
                }
            };
        }
        if (this.mOnErrorListener == null) {
            this.mOnErrorListener = new XMediaPlayer.OnErrorListener() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerControl.6
                @Override // com.ximalaya.ting.android.player.XMediaPlayer.OnErrorListener
                public boolean onError(XMediaplayerImpl xMediaplayerImpl, int i, int i2) {
                    Logger.logToSd("XmPlayerControl onError what:" + i + " extra:" + i2 + " isConnectNet=" + NetworkType.isConnectTONetWork(XmPlayerService.getPlayerSrvice()) + " time:" + System.currentTimeMillis() + "   这里面返回的错误code没有参考价值,如果配置正确但是却播放不了,最大的可能就是网络导致的,请注意log中的\"PlayError\"字段返回值");
                    if (XmPlayerControl.this.mRealPlayableModel != null) {
                        Logger.logToSd("XmPlayerControl onError track:" + ((Track) XmPlayerControl.this.mRealPlayableModel).toString());
                    }
                    XmPlayerControl.this.mState = 7;
                    if (XmPlayerControl.this.mPlayerStatusListener == null) {
                        return true;
                    }
                    XmPlayerControl.this.mPlayerStatusListener.onError(new XmPlayerException(i, i2));
                    return true;
                }
            };
        }
        if (this.mOnInfoListener == null) {
            this.mOnInfoListener = new XMediaPlayer.OnInfoListener() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerControl.7
                /* JADX WARN: Code duplicated, block: B:11:0x0029  */
                /* JADX WARN: Code duplicated, block: B:13:0x0031  */
                /* JADX WARN: Code duplicated, block: B:14:0x003b  */
                @Override // com.ximalaya.ting.android.player.XMediaPlayer.OnInfoListener
                public boolean onInfo(XMediaplayerImpl xMediaplayerImpl, int i, int i2) {
                    boolean z = false;
                    if (i != 701) {
                        if (i == 702) {
                            XmPlayerControl.this.mBuffering = false;
                            XmPlayerControl.this.removeBufferTime();
                        }
                        if (XmPlayerControl.this.mPlayerStatusListener != null) {
                            if (XmPlayerControl.this.mBuffering) {
                                XmPlayerControl.this.mPlayerStatusListener.onBufferingStart();
                            } else {
                                XmPlayerControl.this.mPlayerStatusListener.onBufferingStop();
                            }
                        }
                        return z;
                    }
                    XmPlayerControl.this.mBuffering = true;
                    XmPlayerControl.this.checkBufferTime();
                    z = true;
                    if (XmPlayerControl.this.mPlayerStatusListener != null) {
                        if (XmPlayerControl.this.mBuffering) {
                            XmPlayerControl.this.mPlayerStatusListener.onBufferingStart();
                        } else {
                            XmPlayerControl.this.mPlayerStatusListener.onBufferingStop();
                        }
                    }
                    return z;
                }
            };
        }
        if (this.mOnBufferingUpdateListener == null) {
            this.mOnBufferingUpdateListener = new XMediaPlayer.OnBufferingUpdateListener() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerControl.8
                @Override // com.ximalaya.ting.android.player.XMediaPlayer.OnBufferingUpdateListener
                public void onBufferingUpdate(XMediaplayerImpl xMediaplayerImpl, int i) {
                    if (XmPlayerControl.this.mPlayerStatusListener != null) {
                        XmPlayerControl.this.mPlayerStatusListener.onBufferProgress(i);
                    }
                }
            };
        }
        if (this.mOnPositionChangeListener == null) {
            this.mOnPositionChangeListener = new XMediaPlayer.OnPositionChangeListener() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerControl.9
                @Override // com.ximalaya.ting.android.player.XMediaPlayer.OnPositionChangeListener
                public void onPositionChange(XMediaplayerImpl xMediaplayerImpl, int i) {
                    if (XmPlayerControl.this.seekToValue != 0) {
                        Logger.logToSd("XmPlayerControl onPositionChange  seekToValue=" + XmPlayerControl.this.seekToValue + "   position=" + i);
                        if (i > XmPlayerControl.this.seekToValue + 1000) {
                            XmPlayerControl.this.countDownTimer.cancel();
                            XmPlayerControl.this.seekToValue = 0;
                            XmPlayerControl.this.mMediaPlayer.setVolume(1.0f, 1.0f);
                        } else {
                            float fAbs = 1.0f - ((Math.abs((XmPlayerControl.this.seekToValue + 1000) - i) * 1.0f) / 1000.0f);
                            if (fAbs > 0.5f) {
                                float f = (fAbs * 2.0f) - 1.0f;
                                XmPlayerControl.this.mMediaPlayer.setVolume(f, f);
                            }
                        }
                    }
                    if (xMediaplayerImpl == null) {
                        return;
                    }
                    if (xMediaplayerImpl.getAudioType().equals(XMediaplayerJNI.AudioType.HLS_FILE)) {
                        long jCurrentTimeMillis = System.currentTimeMillis() - XmPlayerControl.mLastPostion;
                        if (jCurrentTimeMillis > 0) {
                            XmPlayerControl.mPlayedDuration += jCurrentTimeMillis;
                            XmPlayerControl.mLastPostion = System.currentTimeMillis();
                        }
                        XmPlayerControl.this.mPlayerStatusListener.onPlayProgress(0, 0);
                        return;
                    }
                    int duration = xMediaplayerImpl.getDuration();
                    if (duration <= 0 || XmPlayerControl.this.mPlayerStatusListener == null) {
                        return;
                    }
                    long j = XmPlayerControl.mLastPostion;
                    int i2 = i - ((int) j);
                    if (i2 > 0 && i2 <= 2000) {
                        XmPlayerControl.mPlayedDuration = (XmPlayerControl.mPlayedDuration + ((long) i)) - ((long) ((int) j));
                    }
                    XmPlayerControl.mLastPostion = i;
                    XmPlayerControl.this.mPlayerStatusListener.onPlayProgress(i, duration);
                    XmPlayerControl.this.safeFailCheckStart();
                    XmPlayerControl.this.mCurrOffset = i;
                }
            };
        }
    }

    private void initPlayerDataSource() {
        XMediaplayerImpl xMediaplayerImpl = this.mMediaPlayer;
        if (xMediaplayerImpl == null) {
            this.mMediaPlayer = setupPlayer();
        } else {
            xMediaplayerImpl.reset();
            if (!XmMediaPlayerFactory.getPlayerMode()) {
                registListener();
            }
        }
        this.mMediaPlayer.setDataSource(this.mLastUrl);
        this.mState = 1;
        this.mMediaPlayer.prepareAsync();
        this.mState = 9;
        IXmPlayerStatusListener iXmPlayerStatusListener = this.mPlayerStatusListener;
        if (iXmPlayerStatusListener != null) {
            iXmPlayerStatusListener.onBufferingStart();
        }
        this.mDuration = 0;
        if (XmPlayerService.getPlayerSrvice() == null || XmPlayerService.getPlayerSrvice().mListControl == null) {
            return;
        }
        this.mRealPlayableModel = XmPlayerService.getPlayerSrvice().mListControl.getCurrentPlayableModel();
    }

    private void registListener() {
        XMediaplayerImpl xMediaplayerImpl = this.mMediaPlayer;
        if (xMediaplayerImpl == null) {
            return;
        }
        xMediaplayerImpl.setOnBufferingUpdateListener(this.mOnBufferingUpdateListener);
        this.mMediaPlayer.setOnCompletionListener(this.mOnCompletionListener);
        this.mMediaPlayer.setOnPreparedListener(this.mOnPreparedListener);
        this.mMediaPlayer.setOnSeekCompleteListener(this.mOnSeekCompleteListener);
        this.mMediaPlayer.setOnErrorListener(this.mOnErrorListener);
        this.mMediaPlayer.setOnInfoListener(this.mOnInfoListener);
        this.mMediaPlayer.setOnPositionChangeListener(this.mOnPositionChangeListener);
        this.mMediaPlayer.setOnPlayDataOutputListener(this.mOnPlayDataOutputListener);
    }

    /* JADX WARN: Undo finally extract visitor
    java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "this.second" is null
    	at jadx.core.utils.Pair.hashCode(Pair.java:35)
    	at java.base/java.util.HashMap.hash(HashMap.java:338)
    	at java.base/java.util.HashMap.getNode(HashMap.java:576)
    	at java.base/java.util.HashMap.containsKey(HashMap.java:602)
    	at jadx.core.dex.visitors.finaly.traverser.state.TraverserGlobalCommonState.hasBlocksBeenCached(TraverserGlobalCommonState.java:35)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.MergePathActivePathTraverserHandler.handle(MergePathActivePathTraverserHandler.java:174)
    	at jadx.core.dex.visitors.finaly.traverser.handlers.AbstractActivePathTraverserHandler.process(AbstractActivePathTraverserHandler.java:19)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.processHandlerImplementations(TraverserController.java:43)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.advance(TraverserController.java:156)
    	at jadx.core.dex.visitors.finaly.traverser.TraverserController.process(TraverserController.java:79)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.findCommonInsns(MarkFinallyVisitor.java:404)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.extractFinally(MarkFinallyVisitor.java:284)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.processTryBlock(MarkFinallyVisitor.java:202)
    	at jadx.core.dex.visitors.finaly.MarkFinallyVisitor.visit(MarkFinallyVisitor.java:135)
     */
    private void releaseLastPlayer() {
        if (this.mMediaPlayer == null) {
            return;
        }
        try {
            try {
                unregistListener();
                this.mMediaPlayer.stop();
                try {
                    this.mMediaPlayer.release();
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                }
            } catch (IllegalStateException e2) {
                e2.printStackTrace();
                try {
                    this.mMediaPlayer.release();
                } catch (Exception e3) {
                    e = e3;
                    e.printStackTrace();
                }
            }
            this.mMediaPlayer = null;
        } catch (Throwable th) {
            try {
                this.mMediaPlayer.release();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            this.mMediaPlayer = null;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBufferTime() {
        if (XmPlayerService.isHtcu20) {
            this.checkBufferTimeLength.removeCallbacks(this.checkBufferTimeRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void safeFailCheckStart() {
        if (XmPlayerService.isHtcu20) {
            this.safeFailHandler.removeCallbacks(this.safeFailRunnable);
            this.safeFailHandler.postDelayed(this.safeFailRunnable, 5000L);
        }
    }

    private void seekToUseVolume(int i) {
        this.mSeekToPosition = i;
        this.mSeekToUseVolumeHandler.removeCallbacks(this.mSeekToUseVolumeRunnable);
        this.mSeekToUseVolumeHandler.postDelayed(this.mSeekToUseVolumeRunnable, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekToUseVolumeReal(int i) {
        if (this.mMediaPlayer != null) {
            PlayableModel playableModel = this.mRealPlayableModel;
            if (playableModel != null && !"track".equals(playableModel.getKind()) && !PlayableModel.KIND_PAID_TRACK.equals(this.mRealPlayableModel.getKind())) {
                this.mMediaPlayer.seekTo(i);
                return;
            }
            Logger.logToSd("XmPlayerControl.seekToUseVolumeReal  " + i);
            if (i == 0) {
                this.countDownTimer.cancel();
                this.mMediaPlayer.setVolume(1.0f, 1.0f);
                this.mMediaPlayer.seekTo(i);
            } else {
                this.mMediaPlayer.setVolume(0.0f, 0.0f);
                this.seekToValue = i;
                this.mMediaPlayer.seekTo(i);
                this.countDownTimer.cancel();
                this.countDownTimer.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNextTrackPreBufferUrl() {
        final Track nextPlayTrack;
        if (XmPlayerService.getPlayerSrvice() == null || XmPlayerService.getPlayerSrvice().mListControl == null || (nextPlayTrack = XmPlayerService.getPlayerSrvice().mListControl.getNextPlayTrack()) == null) {
            return;
        }
        this.preTrackId = nextPlayTrack.getDataId();
        if (TextUtils.isEmpty(XmPlayerService.getPlayerSrvice().getDownloadUrl(nextPlayTrack))) {
            if (nextPlayTrack.isPaid()) {
                if (this.mHasPreBufferRequestBack) {
                    this.mHasPreBufferRequestBack = false;
                    CommonRequest.updateTrackForPlay(new HashMap(), new IDataCallBack<String>() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerControl.12
                        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                        public void onError(int i, String str) {
                            XmPlayerControl.this.mHasPreBufferRequestBack = true;
                        }

                        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                        public void onSuccess(String str) {
                            XmPlayerControl.this.mHasPreBufferRequestBack = true;
                            Logger.logToSd("setPreBufferUrl  1 == " + str);
                            XmPlayerControl.this.mMediaPlayer.setPreBufferUrl(str);
                        }
                    }, nextPlayTrack);
                    return;
                }
                return;
            }
            String trackUrl = XmPlayerService.getPlayerSrvice().getTrackUrl(nextPlayTrack);
            if (!TextUtils.isEmpty(trackUrl)) {
                Logger.logToSd("setPreBufferUrl  3 == " + trackUrl);
                this.mMediaPlayer.setPreBufferUrl(trackUrl);
                return;
            }
            if ((nextPlayTrack.getType() == 4 && nextPlayTrack.isVideo()) || nextPlayTrack.getType() == 2147483547) {
                return;
            }
            HashMap map = new HashMap();
            final long dataId = nextPlayTrack.getDataId();
            map.put("track_id", dataId + "");
            CommonRequest.getTrackInfo(map, new IDataCallBack<TrackBaseInfo>() { // from class: com.ximalaya.ting.android.opensdk.player.service.XmPlayerControl.13
                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onError(int i, String str) {
                }

                @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
                public void onSuccess(@Nullable TrackBaseInfo trackBaseInfo) {
                    if (trackBaseInfo == null || dataId != XmPlayerControl.this.preTrackId || XmPlayerService.getPlayerSrvice() == null) {
                        return;
                    }
                    String trackUrlByBaseInfo = XmPlayerService.getPlayerSrvice().getTrackUrlByBaseInfo(trackBaseInfo);
                    TrackBaseInfo.updateTrackBaseInfoToTrack(trackBaseInfo, nextPlayTrack);
                    Logger.logToSd("setPreBufferUrl  2 == " + trackUrlByBaseInfo);
                    if (TextUtils.isEmpty(trackUrlByBaseInfo)) {
                        return;
                    }
                    XmPlayerControl.this.mMediaPlayer.setPreBufferUrl(trackUrlByBaseInfo);
                }
            });
        }
    }

    private XMediaplayerImpl setupPlayer() {
        this.mMediaPlayer = XmMediaPlayerFactory.getMediaPlayer(this.mAppCtx);
        initMediaPlayerListener();
        registListener();
        this.mMediaPlayer.setProxy(FreeFlowServiceUtil.toHttpConfig(this.mConfig));
        this.mMediaPlayer.setSoundTouchAllParams(this.mTempo, this.mPitch, this.mRate);
        return this.mMediaPlayer;
    }

    private void unregistListener() {
        XMediaplayerImpl xMediaplayerImpl = this.mMediaPlayer;
        if (xMediaplayerImpl == null) {
            return;
        }
        xMediaplayerImpl.setOnBufferingUpdateListener(null);
        this.mMediaPlayer.setOnCompletionListener(null);
        this.mMediaPlayer.setOnPreparedListener(null);
        this.mMediaPlayer.setOnSeekCompleteListener(null);
        this.mMediaPlayer.setOnErrorListener(null);
        this.mMediaPlayer.setOnInfoListener(null);
        this.mMediaPlayer.setOnPositionChangeListener(null);
        this.mMediaPlayer.setOnPlayDataOutputListener(null);
    }

    public String getCurPlayUrl() {
        return this.mLastUrl;
    }

    public int getCurrentPos() {
        int i = this.mState;
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return this.mMediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    public int getDuration() {
        return this.mDuration;
    }

    public int getPlayerState() {
        return this.mState;
    }

    public PlayableModel getRealPlayableModelInPlayer() {
        return this.mRealPlayableModel;
    }

    public float getTempo() {
        return this.mTempo;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0093  */
    public boolean init(String str, int i) {
        Logger.logToSd("PlayerControl init 17:" + System.currentTimeMillis() + "   " + str);
        this.isAudioTrackChangeState = false;
        if (TextUtils.isEmpty(str) || "null".equals(str)) {
            this.mLastUrl = null;
            XMediaplayerImpl xMediaplayerImpl = this.mMediaPlayer;
            if (xMediaplayerImpl != null) {
                xMediaplayerImpl.reset();
                this.mState = 0;
                this.mDuration = 0;
            }
            if (XmPlayerService.getPlayerSrvice() != null && XmPlayerService.getPlayerSrvice().mListControl != null) {
                this.mRealPlayableModel = XmPlayerService.getPlayerSrvice().mListControl.getCurrentPlayableModel();
            }
            PlayableModel playableModel = this.mRealPlayableModel;
            if (playableModel instanceof Track) {
                Track track = (Track) playableModel;
                if (this.mPlayerStatusListener != null && track.canPlayTrack() && track.getType() != 4) {
                    this.mPlayerStatusListener.onError(new XmPlayerException(612, 0));
                }
            }
            return false;
        }
        Logger.logToSd("PlayerControl init 18:" + System.currentTimeMillis());
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.seekToValue = 0;
        XMediaplayerImpl xMediaplayerImpl2 = this.mMediaPlayer;
        if (xMediaplayerImpl2 != null) {
            xMediaplayerImpl2.setVolume(1.0f, 1.0f);
        }
        this.mOffset = i;
        this.mCurrOffset = i;
        if (TextUtils.isEmpty(this.mLastUrl) || !str.equals(this.mLastUrl)) {
            this.mLastUrl = str;
            initPlayerDataSource();
        } else {
            int i2 = this.mState;
            if (i2 == 0) {
                initPlayerDataSource();
            } else if (i2 == 1) {
                this.mMediaPlayer.prepareAsync();
                this.mState = 9;
            } else if (i2 == 4) {
                initPlayerDataSource();
            } else if (i2 == 5) {
                play();
            } else if (i2 == 7 || i2 == 8) {
                initPlayerDataSource();
            }
        }
        return true;
    }

    public boolean initAndNotAutoPlay(String str, int i) {
        this.mShoudPlay = false;
        return init(str, i);
    }

    public boolean initAndPlay(String str, int i) {
        this.mShoudPlay = true;
        return init(str, i);
    }

    public boolean isBuffering() {
        return this.mBuffering;
    }

    public boolean isDLNAState() {
        return this.isDLNAState;
    }

    public synchronized boolean isOnlineSource() {
        String str;
        str = this.mLastUrl;
        return !TextUtils.isEmpty(str) && str.startsWith("http");
    }

    public boolean isPlaying() {
        XMediaplayerImpl xMediaplayerImpl = this.mMediaPlayer;
        if (xMediaplayerImpl == null) {
            return false;
        }
        return xMediaplayerImpl.isPlaying();
    }

    public boolean isPlayingRadio() {
        XMediaplayerImpl xMediaplayerImpl = this.mMediaPlayer;
        return xMediaplayerImpl != null && XMediaplayerJNI.AudioType.HLS_FILE.equals(xMediaplayerImpl.getAudioType());
    }

    public boolean isShoudPlay() {
        return this.mShoudPlay;
    }

    public boolean pause() {
        return pause(true);
    }

    public boolean play() {
        return play(false);
    }

    public void release() {
        this.mState = 8;
        releaseLastPlayer();
        this.mTempo = 1.0f;
        this.mPitch = 0.0f;
        this.mRate = 1.0f;
    }

    public void resetMediaPlayer() {
        XMediaplayerImpl xMediaplayerImpl = this.mMediaPlayer;
        if (xMediaplayerImpl != null) {
            xMediaplayerImpl.reset();
            this.mState = 0;
            this.mLastUrl = null;
        }
    }

    public boolean seekTo(int i) {
        PlayableModel playableModel = this.mRealPlayableModel;
        if (playableModel == null) {
            return false;
        }
        Track track = (Track) playableModel;
        Logger.logToSd("XmPlayerControl  seekTo  " + i + "   " + track.getDuration());
        if (track.isAudition() && i >= track.getSampleDuration() * 1000) {
            pause();
            this.mOnPositionChangeListener.onPositionChange(this.mMediaPlayer, track.getSampleDuration() * 1000);
            this.ignoreCheckIsAudition = true;
            this.mOnCompletionListener.onCompletion(this.mMediaPlayer);
            return false;
        }
        this.mSeekToPosition = i;
        this.isSeek = true;
        int i2 = this.mState;
        if (i2 != 0) {
            if (i2 != 9) {
                if (i2 == 2 || i2 == 3 || i2 == 5) {
                    if (this.mState != 5) {
                        this.mState = 9;
                    }
                    seekToUseVolume(i);
                    return true;
                }
                if (i2 != 6) {
                    return false;
                }
                this.mMediaPlayer.start();
                this.mMediaPlayer.pause();
                play();
                this.mState = 9;
                seekToUseVolume(i);
                return true;
            }
        } else if (this.isAudioTrackChangeState) {
            this.isAudioTrackChangeState = false;
            int playState = this.mMediaPlayer.getPlayState();
            if (playState == 3 || playState == 7 || playState == 4 || playState == 5 || playState == 11) {
                this.mState = 6;
                play();
                this.mState = 9;
                this.mMediaPlayer.seekTo(i);
            }
            return true;
        }
        this.mOffset = i;
        this.mCurrOffset = i;
        return true;
    }

    public void setDLNAState(boolean z) {
        this.isDLNAState = z;
    }

    public void setOnPlayDataOutputListener(XMediaPlayer.OnPlayDataOutputListener onPlayDataOutputListener) {
        XMediaplayerImpl xMediaplayerImpl = this.mMediaPlayer;
        if (xMediaplayerImpl != null) {
            xMediaplayerImpl.setOnPlayDataOutputListener(onPlayDataOutputListener);
        }
        this.mOnPlayDataOutputListener = onPlayDataOutputListener;
    }

    public void setPlaySeekListener(IPlaySeekListener iPlaySeekListener) {
        this.mPlaySeekListener = iPlaySeekListener;
    }

    public void setPlayerStatusListener(IXmPlayerStatusListener iXmPlayerStatusListener) {
        this.mPlayerStatusListener = iXmPlayerStatusListener;
    }

    public void setProxy(Config config) {
        Logger.d(TAG, "setProxy " + config);
        this.mConfig = config;
        XMediaplayerImpl xMediaplayerImpl = this.mMediaPlayer;
        if (xMediaplayerImpl != null) {
            xMediaplayerImpl.setProxy(FreeFlowServiceUtil.toHttpConfig(config));
        }
    }

    public void setShouldPlay(boolean z) {
        this.mShoudPlay = z;
    }

    public void setSoundTouchAllParams(float f, float f2, float f3) {
        this.mTempo = f;
        this.mPitch = f2;
        this.mRate = f3;
        if (this.mMediaPlayer != null) {
            Logger.log("setSoundTouchAllParams2 tempo:" + f + " pitch:" + f2 + " rate:" + f3);
            this.mMediaPlayer.setSoundTouchAllParams(f, f2, f3);
        }
    }

    public void setVolume(float f, float f2) {
        XMediaplayerImpl xMediaplayerImpl = this.mMediaPlayer;
        if (xMediaplayerImpl == null) {
            return;
        }
        xMediaplayerImpl.setVolume(f, f2);
    }

    public boolean stop() {
        int i = this.mState;
        if (i == 1) {
            return true;
        }
        if (i != 2 && i != 3 && i != 5 && i != 6) {
            return i == 9;
        }
        this.mMediaPlayer.stop();
        this.mState = 4;
        IXmPlayerStatusListener iXmPlayerStatusListener = this.mPlayerStatusListener;
        if (iXmPlayerStatusListener == null) {
            return true;
        }
        iXmPlayerStatusListener.onPlayStop();
        return true;
    }

    public void updateCurPlayUrl(String str) {
        this.mLastUrl = str;
    }

    public boolean pause(boolean z) {
        Logger.log("XmPlayerControl  pause  shallNotifyListener=" + z + "    mState=" + this.mState);
        boolean z2 = false;
        if (this.mState != 3) {
            setShouldPlay(false);
        } else {
            this.mMediaPlayer.pause();
            this.mState = 5;
            z2 = true;
            IXmPlayerStatusListener iXmPlayerStatusListener = this.mPlayerStatusListener;
            if (iXmPlayerStatusListener != null) {
                if (z) {
                    iXmPlayerStatusListener.onPlayPause();
                }
                if (!this.mMediaPlayer.isPlaying()) {
                    this.mPlayerStatusListener.onBufferingStop();
                }
            }
        }
        return z2;
    }

    public boolean play(boolean z) {
        setShouldPlay(true);
        XmPlayerService playerSrvice = XmPlayerService.getPlayerSrvice();
        if (playerSrvice == null || this.mMediaPlayer == null) {
            return false;
        }
        if (z) {
            playerSrvice.setLossAudioFocus(false);
        }
        int i = this.mState;
        if (i == 9) {
            return true;
        }
        switch (i) {
            case 1:
                this.mMediaPlayer.prepareAsync();
                this.mState = 9;
                return true;
            case 2:
            case 5:
            case 6:
                if (playerSrvice.isLossAudioFocus()) {
                    playerSrvice.setLossAudioFocus(false);
                    return true;
                }
                playerSrvice.requestAudioFocusControl();
                int i2 = this.mOffset;
                if (i2 > 0) {
                    seekToUseVolume(i2);
                    Logger.logToSd("XmPlayerControl.onPositionChange  2 " + System.currentTimeMillis());
                    this.mOffset = 0;
                }
                if (!this.isDLNAState) {
                    this.mMediaPlayer.start();
                }
                this.mState = 3;
                IXmPlayerStatusListener iXmPlayerStatusListener = this.mPlayerStatusListener;
                if (iXmPlayerStatusListener == null) {
                    return true;
                }
                iXmPlayerStatusListener.onPlayStart();
                return true;
            case 3:
                return true;
            case 4:
                this.mMediaPlayer.prepareAsync();
                this.mState = 9;
                IXmPlayerStatusListener iXmPlayerStatusListener2 = this.mPlayerStatusListener;
                if (iXmPlayerStatusListener2 == null) {
                    return true;
                }
                iXmPlayerStatusListener2.onPlayStart();
                return true;
            default:
                return false;
        }
    }
}
