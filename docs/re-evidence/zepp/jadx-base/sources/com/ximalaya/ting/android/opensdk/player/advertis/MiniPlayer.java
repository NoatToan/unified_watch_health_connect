package com.ximalaya.ting.android.opensdk.player.advertis;

import android.annotation.TargetApi;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import androidx.annotation.NonNull;
import com.ximalaya.ting.android.opensdk.model.advertis.Advertis;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerService;
import com.ximalaya.ting.android.opensdk.util.Logger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes22.dex */
public class MiniPlayer {
    public static final int STATE_COMPLETED = 5;
    public static final int STATE_ERR = -1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_PAUSED = 3;
    public static final int STATE_PREPARED = 1;
    public static final int STATE_PREPARING = 6;
    public static final int STATE_STARTED = 2;
    public static final int STATE_STOPPED = 4;
    private static final String TAG = "MiniPlayer";
    private static ExecutorService sExecutorService = Executors.newCachedThreadPool(new ThreadFactory() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.MiniPlayer.1
        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@NonNull Runnable runnable) {
            return new Thread(runnable, "release-player");
        }
    });
    private Advertis mAdvertis;
    private AudioManager mAudioManager;
    private MediaPlayer.OnCompletionListener mCompletionListener;
    private MediaPlayer mPlayer;
    private PlayerStatusListener mPlayerStatusListener;
    private boolean willStarted;
    private int mStreamType = 3;
    private float mLeftVol = 1.0f;
    private float mRightVol = 1.0f;
    private boolean mLoop = false;
    private int mStatus = -1;

    public interface PlayerStatusListener {
        void onComplete();

        boolean onError(Exception exc, int i, int i2);

        void onPause();

        void onStart();

        void onStop();
    }

    public MiniPlayer() {
        resetPlayer();
    }

    public Advertis getAdvertis() {
        return this.mAdvertis;
    }

    public synchronized int getCurrPos() {
        int i = this.mStatus;
        if (i != 0 && i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
            return 0;
        }
        return this.mPlayer.getCurrentPosition();
    }

    public synchronized int getDuration() {
        int i = this.mStatus;
        if (i != 1 && i != 2 && i != 3 && i != 4 && i != 5) {
            return 0;
        }
        return this.mPlayer.getDuration();
    }

    @TargetApi(9)
    public synchronized int getSessionId() {
        if (Build.VERSION.SDK_INT < 9) {
            return 0;
        }
        return this.mPlayer.getAudioSessionId();
    }

    public int getStatus() {
        return this.mStatus;
    }

    public synchronized void init(final String str, final Advertis advertis) throws Exception {
        resetPlayer();
        Logger.logToSd("MiniPlayer synchronized 19  path  " + str);
        sExecutorService.execute(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.MiniPlayer.6
            @Override // java.lang.Runnable
            public void run() {
                MiniPlayer.this.willStarted = true;
                try {
                    MiniPlayer.this.mPlayer.setDataSource(str);
                    MiniPlayer.this.mPlayer.prepareAsync();
                    Logger.logToSd("MiniPlayer synchronized 20");
                    MiniPlayer.this.mStatus = 6;
                    MiniPlayer.this.mAdvertis = advertis;
                    if (XmPlayerService.getPlayerSrvice() != null) {
                        try {
                            MiniPlayer.this.mAudioManager = (AudioManager) XmPlayerService.getPlayerSrvice().getSystemService("audio");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    MiniPlayer.this.mStatus = 5;
                    if (MiniPlayer.this.mCompletionListener != null) {
                        MiniPlayer.this.mCompletionListener.onCompletion(MiniPlayer.this.mPlayer);
                    }
                }
            }
        });
    }

    public boolean isPaused() {
        return this.mStatus == 3;
    }

    public boolean isPlaying() {
        return this.mStatus == 2;
    }

    public boolean isStop() {
        return this.mStatus == 4;
    }

    public synchronized void pausePlay() {
        Logger.logToSd("Ad pausePlay 0:" + System.currentTimeMillis());
        this.willStarted = false;
        Logger.log("MiniPlayer : willStarted 4 " + this.willStarted);
        try {
            if (this.mStatus == 2) {
                this.mPlayer.pause();
                this.mStatus = 3;
                PlayerStatusListener playerStatusListener = this.mPlayerStatusListener;
                if (playerStatusListener != null) {
                    playerStatusListener.onPause();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.mStatus = -1;
            PlayerStatusListener playerStatusListener2 = this.mPlayerStatusListener;
            if (playerStatusListener2 != null) {
                playerStatusListener2.onError(e, 0, 0);
            }
        }
    }

    public synchronized void release() {
        this.willStarted = false;
        Logger.log("MiniPlayer : willStarted 6 " + this.willStarted);
        Logger.logToSd("AD release 0:" + System.currentTimeMillis());
        try {
            MediaPlayer mediaPlayer = this.mPlayer;
            if (mediaPlayer != null) {
                if (this.mStatus == 2) {
                    mediaPlayer.stop();
                    PlayerStatusListener playerStatusListener = this.mPlayerStatusListener;
                    if (playerStatusListener != null) {
                        playerStatusListener.onStop();
                    }
                }
                this.mPlayer.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
            PlayerStatusListener playerStatusListener2 = this.mPlayerStatusListener;
            if (playerStatusListener2 != null) {
                playerStatusListener2.onError(e, 0, 0);
            }
        }
        this.mAdvertis = null;
        this.mPlayer = null;
    }

    public synchronized void resetPlayer() {
        try {
            MediaPlayer mediaPlayer = this.mPlayer;
            if (mediaPlayer != null) {
                if (this.mStatus == 2) {
                    mediaPlayer.stop();
                    this.mStatus = 4;
                    PlayerStatusListener playerStatusListener = this.mPlayerStatusListener;
                    if (playerStatusListener != null) {
                        playerStatusListener.onStop();
                    }
                }
                final MediaPlayer mediaPlayer2 = this.mPlayer;
                sExecutorService.execute(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.MiniPlayer.2
                    @Override // java.lang.Runnable
                    public void run() {
                        MediaPlayer mediaPlayer3 = mediaPlayer2;
                        if (mediaPlayer3 != null) {
                            mediaPlayer3.reset();
                        }
                    }
                });
                this.mPlayer = null;
            }
            MediaPlayer mediaPlayer3 = new MediaPlayer();
            this.mPlayer = mediaPlayer3;
            this.mStatus = 0;
            mediaPlayer3.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.MiniPlayer.3
                @Override // android.media.MediaPlayer.OnErrorListener
                public boolean onError(MediaPlayer mediaPlayer4, int i, int i2) {
                    MiniPlayer.this.mStatus = -1;
                    if (MiniPlayer.this.mPlayerStatusListener != null) {
                        MiniPlayer.this.mPlayerStatusListener.onError(null, i, i2);
                    }
                    if (MiniPlayer.this.mCompletionListener == null) {
                        return true;
                    }
                    MiniPlayer.this.mCompletionListener.onCompletion(mediaPlayer4);
                    return true;
                }
            });
            this.mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.MiniPlayer.4
                @Override // android.media.MediaPlayer.OnCompletionListener
                public void onCompletion(MediaPlayer mediaPlayer4) {
                    MiniPlayer.this.mStatus = 5;
                    if (MiniPlayer.this.mCompletionListener != null) {
                        MiniPlayer.this.mCompletionListener.onCompletion(mediaPlayer4);
                    }
                    if (MiniPlayer.this.mPlayerStatusListener != null) {
                        MiniPlayer.this.mPlayerStatusListener.onComplete();
                    }
                }
            });
            this.mPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.MiniPlayer.5
                @Override // android.media.MediaPlayer.OnPreparedListener
                public void onPrepared(MediaPlayer mediaPlayer4) {
                    MiniPlayer.this.mStatus = 1;
                    Logger.log("MiniPlayer : willStarted 7 " + MiniPlayer.this.willStarted);
                    if (MiniPlayer.this.willStarted) {
                        MiniPlayer.this.startPlay();
                    }
                }
            });
            this.mPlayer.setLooping(this.mLoop);
            this.mPlayer.setVolume(this.mLeftVol, this.mRightVol);
            this.mStatus = 0;
            this.willStarted = false;
            Logger.log("MiniPlayer : willStarted 1 " + this.willStarted);
        } catch (Exception e) {
            e.printStackTrace();
            this.mStatus = -1;
            PlayerStatusListener playerStatusListener2 = this.mPlayerStatusListener;
            if (playerStatusListener2 != null) {
                playerStatusListener2.onError(e, 0, 0);
            }
        }
    }

    public void setAdvertis(Advertis advertis) {
        this.mAdvertis = advertis;
    }

    public void setAudioStreamType(int i) {
        this.mStreamType = i;
    }

    public void setLooping(boolean z) {
        this.mLoop = z;
        if (this.mStatus != -1) {
            this.mPlayer.setLooping(z);
        }
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.mCompletionListener = onCompletionListener;
    }

    public void setPlayerStatueListener(PlayerStatusListener playerStatusListener) {
        this.mPlayerStatusListener = playerStatusListener;
    }

    public synchronized void setVolume(float f, float f2) {
        this.mLeftVol = f;
        this.mRightVol = f2;
        if (this.mStatus != -1) {
            this.mPlayer.setVolume(f, f2);
        }
    }

    public synchronized void startPlay() {
        try {
            Advertis advertis = this.mAdvertis;
            if (advertis == null || advertis.getVolume() == 0) {
                setVolume(1.0f, 1.0f);
            } else {
                float volume = this.mAdvertis.getVolume() / 100.0f;
                setVolume(volume, volume);
            }
            Logger.logToSd("playAd 1:" + System.currentTimeMillis());
            int i = this.mStatus;
            if (i == 1 || i == 3 || i == 5) {
                Logger.logToSd("playAd 2:" + System.currentTimeMillis());
                this.mPlayer.start();
                this.mStatus = 2;
                PlayerStatusListener playerStatusListener = this.mPlayerStatusListener;
                if (playerStatusListener != null) {
                    playerStatusListener.onStart();
                }
            } else if (i == 4) {
                Logger.logToSd("playAd 3:" + System.currentTimeMillis());
                this.willStarted = true;
                Logger.log("MiniPlayer : willStarted 2 " + this.willStarted);
                try {
                    this.mPlayer.prepareAsync();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                    this.mStatus = 5;
                    MediaPlayer.OnCompletionListener onCompletionListener = this.mCompletionListener;
                    if (onCompletionListener != null) {
                        onCompletionListener.onCompletion(this.mPlayer);
                    }
                }
            } else if (i == 6) {
                this.willStarted = true;
                Logger.log("MiniPlayer : willStarted 3 " + this.willStarted);
            }
        } catch (Exception e2) {
            Logger.logToSd("playAd 4:" + System.currentTimeMillis());
            e2.printStackTrace();
            this.mStatus = -1;
            PlayerStatusListener playerStatusListener2 = this.mPlayerStatusListener;
            if (playerStatusListener2 != null) {
                playerStatusListener2.onError(e2, 0, 0);
            }
        }
    }

    public synchronized void stopPlay() {
        Logger.logToSd("AD stopPlay 0:" + System.currentTimeMillis());
        this.willStarted = false;
        Logger.log("MiniPlayer : willStarted 5 " + this.willStarted);
        try {
            if (this.mStatus == 2) {
                this.mPlayer.stop();
                this.mStatus = 4;
                PlayerStatusListener playerStatusListener = this.mPlayerStatusListener;
                if (playerStatusListener != null) {
                    playerStatusListener.onStop();
                }
            } else {
                sExecutorService.execute(new Runnable() { // from class: com.ximalaya.ting.android.opensdk.player.advertis.MiniPlayer.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MiniPlayer.this.mPlayer != null) {
                            MiniPlayer.this.mPlayer.reset();
                        }
                    }
                });
                this.mStatus = 0;
                PlayerStatusListener playerStatusListener2 = this.mPlayerStatusListener;
                if (playerStatusListener2 != null) {
                    playerStatusListener2.onStop();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.mStatus = -1;
            PlayerStatusListener playerStatusListener3 = this.mPlayerStatusListener;
            if (playerStatusListener3 != null) {
                playerStatusListener3.onError(e, 0, 0);
            }
        }
        this.mAdvertis = null;
    }
}
