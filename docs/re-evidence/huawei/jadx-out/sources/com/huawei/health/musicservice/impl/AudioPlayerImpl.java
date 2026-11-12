package com.huawei.health.musicservice.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.musicservice.api.IAudioPlayer;
import com.huawei.health.musicservice.utils.HealthCountDownTimer;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.operation.utils.Constants;
import defpackage.dxw;
import defpackage.gdy;
import defpackage.ger;
import defpackage.get;
import defpackage.gfj;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes29.dex */
@ApiDefine(uri = IAudioPlayer.class)
public class AudioPlayerImpl implements IAudioPlayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IAudioPlayer.AudioPlayerCallBack f8514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AudioManager f8515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    AtomicInteger f8516c;
    private AudioAttributes d;
    private final Context e;
    private MediaPlayer f;
    private volatile boolean g;
    private final AudioManager.OnAudioFocusChangeListener h;
    private a i;
    private AudioFocusRequest j;
    private long k;
    private volatile boolean l;
    private volatile boolean m;
    private Runnable n;
    private boolean o;
    private ScheduledFuture p;
    private gdy q;
    private MediaPlayer r;
    private get s;
    private Handler t;
    private int u;
    private volatile int v;
    private e w;
    private final ger x;
    private float y;

    enum PlayState {
        IDLE(-1),
        PREPARING(1),
        PLAYING(2),
        PAUSED(3),
        STOPPED(4),
        RELEASED(5);

        private final int stateValue;

        PlayState(int i) {
            this.stateValue = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        return this.f8516c.get() == PlayState.PREPARING.stateValue || this.f8516c.get() == PlayState.PLAYING.stateValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        return this.f8516c.get() == PlayState.PAUSED.stateValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        return this.f8516c.get() == PlayState.STOPPED.stateValue;
    }

    private boolean f() {
        return this.f8516c.get() == PlayState.RELEASED.stateValue;
    }

    enum PrepareState {
        UNLOAD(0),
        LOADING(1),
        LOADED(2);

        private final int state;

        PrepareState(int i) {
            this.state = i;
        }

        public int getState() {
            return this.state;
        }
    }

    private void n() {
        this.e.unregisterReceiver(this.w);
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void setPlayMode(IAudioPlayer.PlayMode playMode) {
        LogUtil.b("R_AudioPlayer", "setPlayMode: " + playMode.toString());
        this.x.e(playMode);
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void setUsage(int i) {
        LogUtil.b("R_AudioPlayer", "setUsage: " + i);
        this.u = i;
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void setCallback(IAudioPlayer.AudioPlayerCallBack audioPlayerCallBack) {
        this.f8514a = audioPlayerCallBack;
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void cancelAutoStop() {
        ReleaseLogUtil.c("R_AudioPlayer", "cancelAutoStop");
        g();
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void resetPlayList(List<gdy> list) {
        if (!CollectionUtils.a(this.x.d())) {
            try {
                this.f.reset();
            } catch (IllegalStateException e2) {
                LogUtil.b("R_AudioPlayer", "resetPlayList reset() failed:", e2);
            }
            this.f8516c.set(PlayState.IDLE.stateValue);
            this.i.cancel();
            b(IAudioPlayer.PlayStatus.STOPPED, this.x.c());
            this.x.e();
            this.q = null;
        }
        this.x.e(list);
        LogUtil.b("R_AudioPlayer", "resetPlayList play list set, size: " + list.size());
        d(list);
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void setPlayList(List<gdy> list) {
        this.x.e();
        this.x.e(list);
        ger gerVar = this.x;
        gerVar.b(gerVar.c());
        LogUtil.b("R_AudioPlayer", "play list set, size: " + list.size());
        d(list);
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void setPlaySpeed(float f) {
        this.y = f;
        LogUtil.b("R_AudioPlayer", "set play speed is ", Float.valueOf(f));
        if (j()) {
            b(this.f, f);
            LogUtil.b("R_AudioPlayer", "play speed is ", Float.valueOf(f), ", play status is ", Integer.valueOf(this.f8516c.get()));
        }
    }

    private void b(MediaPlayer mediaPlayer, float f) {
        LogUtil.b("R_AudioPlayer", "set play speed .....");
        try {
            mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(f));
        } catch (Exception e2) {
            ReleaseLogUtil.b("R_AudioPlayer", "设置播放倍数失败，异常：", ExceptionUtils.c(e2));
        }
    }

    private void d(List<gdy> list) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            String strO = list.get(i).o();
            if (TextUtils.isEmpty(strO)) {
                LogUtil.d("R_AudioPlayer", "audioItem title is empty, mediaId:", list.get(i).h());
            } else {
                sb.append(strO.substring(0, Math.min(strO.length() - 1, 10)));
                sb.append("|");
            }
        }
        sb.append("]");
        LogUtil.b("R_AudioPlayer", "AudioItemList:", sb.toString());
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void addPlayList(List<gdy> list) {
        this.x.e(list);
        ger gerVar = this.x;
        gerVar.b(gerVar.c());
        LogUtil.b("R_AudioPlayer", "play list add, size: " + list.size());
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void removeItem(gdy gdyVar) {
        synchronized (this) {
            try {
                if (gdyVar == null) {
                    LogUtil.e("R_AudioPlayer", "removeItem failed, input audioItem is null");
                    return;
                }
                if (gdyVar.equals(this.x.c())) {
                    if (this.x.e(gdyVar)) {
                        LogUtil.b("R_AudioPlayer", "remove current item... list is empty, stop player...");
                        stop();
                    } else if (j()) {
                        LogUtil.b("R_AudioPlayer", "remove current playing item... play next one: " + this.x.c());
                        this.i.cancel();
                        a(this.x.c());
                    } else {
                        LogUtil.b("R_AudioPlayer", "remove current paused item, prepare next item: " + this.x.c());
                        e(this.f, this.x.c());
                        this.f8516c.set(PlayState.PAUSED.stateValue);
                        b(this.r);
                        this.i.cancel();
                        b(IAudioPlayer.PlayStatus.PAUSED, this.x.c());
                        a();
                    }
                } else {
                    this.x.e(gdyVar);
                    LogUtil.b("R_AudioPlayer", "remove un-current item: " + gdyVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(MediaPlayer mediaPlayer) {
        try {
            mediaPlayer.reset();
        } catch (IllegalStateException e2) {
            LogUtil.d("R_AudioPlayer", "resetPlayer failed, e: ", ExceptionUtils.c(e2));
        }
    }

    private void e(MediaPlayer mediaPlayer, gdy gdyVar) {
        try {
            Uri uri = Uri.parse(gdyVar.i());
            mediaPlayer.reset();
            mediaPlayer.setOnErrorListener(null);
            mediaPlayer.setOnPreparedListener(null);
            mediaPlayer.setDataSource(this.e, uri);
            mediaPlayer.prepareAsync();
            LogUtil.d("R_AudioPlayer", "prepare player success");
        } catch (IOException | IllegalStateException e2) {
            LogUtil.d("R_AudioPlayer", "prepare player failed, e: " + ExceptionUtils.c(e2));
        }
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void play() {
        if (f()) {
            LogUtil.e("R_AudioPlayer", "audio player already released, do nothing in play()");
            return;
        }
        if (c()) {
            o();
            return;
        }
        if (h()) {
            a(this.x.c());
            return;
        }
        if (j()) {
            LogUtil.e("R_AudioPlayer", "current player is running, do nothing in play()");
            return;
        }
        if (this.f.isPlaying()) {
            LogUtil.e("R_AudioPlayer", "current player is playing, do nothing in play()");
            return;
        }
        gdy gdyVarC = this.x.c(false);
        if (gdyVarC == null) {
            LogUtil.e("R_AudioPlayer", "play from start failed, no track");
            b(IAudioPlayer.PlayStatus.FAILED, (gdy) null);
        } else {
            LogUtil.b("R_AudioPlayer", "starts to play: ", gdyVarC.o());
            a(gdyVarC);
        }
    }

    private void o() {
        if (f()) {
            LogUtil.e("R_AudioPlayer", "audio player already released, do nothing in resume");
            return;
        }
        if (h()) {
            LogUtil.e("R_AudioPlayer", "audio player already stopped, do nothing in resume");
            return;
        }
        if (!k()) {
            LogUtil.e("R_AudioPlayer", "resume failed, request focus fail");
            b(IAudioPlayer.PlayStatus.FAILED, this.x.c());
            return;
        }
        try {
            b(this.f, this.y);
            this.f.start();
            if (this.f.isPlaying()) {
                this.s.b(this.o);
                LogUtil.b("R_AudioPlayer", "resume success currentPlayer isReplay is ", Boolean.valueOf(this.o));
                this.f8516c.set(PlayState.PLAYING.stateValue);
                this.i.resetAndTick(this.f.getDuration() - this.f.getCurrentPosition(), 1000L);
                b(IAudioPlayer.PlayStatus.PLAYING, this.x.c());
                if (this.o) {
                    this.o = false;
                    LogUtil.b("R_AudioPlayer", "resume success currentPlayer isReplay = false");
                    return;
                }
                return;
            }
            LogUtil.b("R_AudioPlayer", "resume failed");
            this.f8516c.set(PlayState.STOPPED.stateValue);
            play();
        } catch (IllegalStateException e2) {
            LogUtil.d("R_AudioPlayer", "resume failed, IllegalStateException:", ExceptionUtils.c(e2));
            b(IAudioPlayer.PlayStatus.FAILED, this.x.c());
        }
    }

    private void a(gdy gdyVar) {
        b(gdyVar, false);
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void play(int i) {
        gdy gdyVarC = this.x.c(i);
        if (gdyVarC == null) {
            LogUtil.b("R_AudioPlayer", "play by index failed, no AudioItem for index: ", Integer.valueOf(i));
            return;
        }
        LogUtil.b("R_AudioPlayer", "play by index: ", Integer.valueOf(i), ", title: ", gdyVarC.o());
        b(gdyVarC, true);
    }

    private void b(gdy gdyVar, boolean z) {
        if (gdyVar == null) {
            LogUtil.c("R_AudioPlayer", "play with AudioItem failed, audioItem is null");
            b(IAudioPlayer.PlayStatus.FAILED, (gdy) null);
            return;
        }
        if (gdyVar.i() == null || gdyVar.i().isEmpty()) {
            LogUtil.c("R_AudioPlayer", "play with AudioItem failed, audioItem.getMediaUrl() is null");
            b(IAudioPlayer.PlayStatus.FAILED, (gdy) null);
            return;
        }
        if (f()) {
            LogUtil.e("R_AudioPlayer", "audio player already released, do nothing in innerPlay");
            b(IAudioPlayer.PlayStatus.FAILED, gdyVar);
        } else {
            if (!k()) {
                LogUtil.e("R_AudioPlayer", "inner play failed, request audio focus return false...");
                b(IAudioPlayer.PlayStatus.FAILED, gdyVar);
                return;
            }
            this.i.cancel();
            if (z) {
                b(IAudioPlayer.PlayStatus.SKIP_TO_INDEX, gdyVar);
            }
            b(IAudioPlayer.PlayStatus.BUFFERING, gdyVar);
            d(gdyVar);
        }
    }

    private void d(final gdy gdyVar) {
        try {
            this.x.b(gdyVar);
            this.f.reset();
            this.r.reset();
            this.f8516c.set(PlayState.PREPARING.stateValue);
            this.f.setDataSource(this.e, Uri.parse(gdyVar.i()));
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: geo
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    this.f34988b.a(jElapsedRealtime, gdyVar, mediaPlayer);
                }
            });
            this.f.prepareAsync();
        } catch (Exception e2) {
            b(IAudioPlayer.PlayStatus.FAILED, gdyVar);
            LogUtil.d("R_AudioPlayer", "inner play failed, exception: ", ExceptionUtils.c(e2));
        }
    }

    public /* synthetic */ void a(long j, gdy gdyVar, MediaPlayer mediaPlayer) {
        if (c() || h()) {
            LogUtil.e("R_AudioPlayer", "someone called pause or stop too fast, while player is not started yet...");
            return;
        }
        b(mediaPlayer, this.y);
        mediaPlayer.start();
        if (mediaPlayer.isPlaying()) {
            LogUtil.c("R_AudioPlayer", "inner play success, buffering cost:", Long.valueOf(SystemClock.elapsedRealtime() - j), ", timer ticking, total duration: " + this.f.getDuration());
            b(IAudioPlayer.PlayStatus.PLAYING, gdyVar);
            this.i.resetAndTick((long) this.f.getDuration(), 1000L);
            return;
        }
        b(IAudioPlayer.PlayStatus.FAILED, gdyVar);
        LogUtil.e("R_AudioPlayer", "inner play failed, starting player failed...");
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void pause() {
        a(true);
    }

    private void a(boolean z) {
        if (f()) {
            LogUtil.e("R_AudioPlayer", "audio player already released, do nothing in pause");
            return;
        }
        if (h()) {
            LogUtil.e("R_AudioPlayer", "audio player already stopped, do nothing in pause");
            return;
        }
        if (!j()) {
            LogUtil.b("R_AudioPlayer", "audio player is not running, do nothing in pause");
            return;
        }
        LogUtil.b("R_AudioPlayer", "player pausing...");
        this.f8516c.set(PlayState.PAUSED.stateValue);
        this.i.cancel();
        try {
            this.f.pause();
        } catch (IllegalStateException unused) {
            LogUtil.d("R_AudioPlayer", "pause failed, IllegalStateException");
        }
        this.r.reset();
        b(IAudioPlayer.PlayStatus.PAUSED, this.x.c());
        if (z) {
            a();
        }
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void playNext() {
        if (f()) {
            LogUtil.e("R_AudioPlayer", "audio player already released, do nothing in play next");
            return;
        }
        this.i.cancel();
        this.f.reset();
        this.r.reset();
        gdy gdyVarC = this.x.c();
        if (gdyVarC != null) {
            gdyVarC.a(0L);
        }
        gdy gdyVarC2 = this.x.c(false);
        if (gdyVarC2 == null) {
            LogUtil.b("R_AudioPlayer", "play next failed, no track, this should NOT happen, check if you have called addTrack()");
            b(IAudioPlayer.PlayStatus.FAILED, (gdy) null);
        } else {
            LogUtil.b("R_AudioPlayer", "play next: ", gdyVarC2.o(), ", current: ", gfj.e(this.x.c()));
            b(IAudioPlayer.PlayStatus.SKIP_TO_NEXT, gdyVarC2);
            a(gdyVarC2);
        }
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void playPrevious() {
        if (f()) {
            LogUtil.e("R_AudioPlayer", "audio player already released, do nothing in play previous");
            return;
        }
        this.i.cancel();
        this.f.reset();
        this.r.reset();
        gdy gdyVarC = this.x.c();
        if (gdyVarC != null) {
            gdyVarC.a(0L);
        }
        gdy gdyVarB = this.x.b();
        if (gdyVarB == null) {
            LogUtil.e("R_AudioPlayer", "play previous failed, no track, this should NOT happen, check if you have called addTrack()");
            b(IAudioPlayer.PlayStatus.FAILED, (gdy) null);
        } else {
            LogUtil.b("R_AudioPlayer", "play previous: ", gdyVarB.o(), ", current: ", gfj.e(this.x.c()));
            b(IAudioPlayer.PlayStatus.SKIP_TO_PREV, gdyVarB);
            a(gdyVarB);
        }
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void seekTo(int i) {
        if (f()) {
            LogUtil.e("R_AudioPlayer", "audio player already released, do nothing in seekTo");
            return;
        }
        if (i < 0) {
            LogUtil.d("R_AudioPlayer", "seek failed, target position: " + i);
            return;
        }
        int duration = this.f.getDuration();
        int i2 = duration - i;
        if (i2 < 1000) {
            LogUtil.b("R_AudioPlayer", "seek to very end, play next... total: " + duration + ", seek target: " + i);
            try {
                playNext();
                return;
            } catch (IllegalStateException e2) {
                LogUtil.d("R_AudioPlayer", "playNext() Exception msg:" + e2.getMessage());
                return;
            }
        }
        if (j()) {
            this.i.cancel();
        }
        LogUtil.b("R_AudioPlayer", "seek, from: " + this.f.getCurrentPosition() + ", to: " + i + ". total:" + duration);
        this.f.seekTo(i);
        gdy gdyVarC = this.x.c();
        if (gdyVarC == null) {
            LogUtil.e("R_AudioPlayer", "currentItem is null");
            return;
        }
        if (j()) {
            gdyVarC.a(i);
            b(IAudioPlayer.PlayStatus.PLAYING, gdyVarC);
            if (i2 > 10000) {
                this.i.resetAndTick(i2, 1000L);
                return;
            } else {
                this.i.resetAndTick(i2, 100L);
                return;
            }
        }
        gdyVarC.a(i);
        b(IAudioPlayer.PlayStatus.PAUSED, gdyVarC);
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void setVolume(float f) {
        if (f < 0.0f || f > 1.0f) {
            LogUtil.e("R_AudioPlayer", "wrong volume: " + f);
        } else {
            try {
                this.f.setVolume(f, f);
                this.r.setVolume(f, f);
            } catch (IllegalStateException unused) {
                ReleaseLogUtil.d("R_AudioPlayer", "wrong state:", Integer.valueOf(this.f8516c.get()));
            }
        }
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void autoStop(long j) {
        if (f()) {
            LogUtil.e("R_AudioPlayer", "audio player already released, do nothing in autoStop");
            return;
        }
        if (j <= 0) {
            LogUtil.e("R_AudioPlayer", "audio player stopTime is invalid");
            return;
        }
        ScheduledFuture scheduledFuture = this.p;
        if (scheduledFuture != null) {
            ReleaseLogUtil.c("R_AudioPlayer", "autoStop isCancelOk:", Boolean.valueOf(scheduledFuture.cancel(true)));
        }
        this.p = dxw.e(this.n, j);
        LogUtil.b("R_AudioPlayer", "auto stop launched, will stop in(ms): " + j);
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void stop() {
        if (f()) {
            LogUtil.e("R_AudioPlayer", "audio player already released, do nothing in stop");
            return;
        }
        this.i.cancel();
        this.f8516c.set(PlayState.STOPPED.stateValue);
        gdy gdyVarC = this.x.c();
        if (gdyVarC != null) {
            gdyVarC.a(0L);
        }
        try {
            LogUtil.b("R_AudioPlayer", "stopping player...");
            this.f.stop();
            this.r.reset();
        } catch (IllegalStateException unused) {
            LogUtil.d("R_AudioPlayer", "IllegalStateException occurred when stopping!");
        }
        b(IAudioPlayer.PlayStatus.STOPPED, this.x.c());
        a();
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void release() {
        this.f8516c.set(PlayState.RELEASED.stateValue);
        this.f.release();
        this.r.release();
        a();
        n();
        b(IAudioPlayer.PlayStatus.RELEASED, (gdy) null);
        this.i.release();
        g();
        LogUtil.b("R_AudioPlayer", "audio player released, can NOT be used again");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        int iMax = Math.max(this.f.getCurrentPosition(), 0);
        int duration = this.f.getDuration();
        LogUtil.c("R_AudioPlayer", "play progress change to: " + iMax);
        if (this.x.c() == null) {
            LogUtil.e("R_AudioPlayer", "current item is null when do progress callback, this should not happen...");
            return;
        }
        long j = iMax;
        if (j == this.x.c().f()) {
            LogUtil.e("R_AudioPlayer", "player is buffering, last position:" + this.x.c().f());
            b(IAudioPlayer.PlayStatus.BUFFERING, this.x.c());
            return;
        }
        this.x.c().a(j);
        IAudioPlayer.AudioPlayerCallBack audioPlayerCallBack = this.f8514a;
        if (audioPlayerCallBack == null || duration < 0) {
            LogUtil.e("R_AudioPlayer", "audioPlayCallback is null or duration is invalid, no need to callback, duration:", Integer.valueOf(duration));
            return;
        }
        if (duration - iMax <= 500) {
            audioPlayerCallBack.onProgressChanged(this.x.c(), duration);
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.k >= 950) {
            this.k = jElapsedRealtime;
            this.f8514a.onProgressChanged(this.x.c(), j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(IAudioPlayer.PlayStatus playStatus, gdy gdyVar) {
        StringBuilder sb = new StringBuilder("play state change to: ");
        sb.append(playStatus.toString());
        sb.append(", audioItem: ");
        sb.append(gdyVar == null ? Constants.NULL : gdyVar.o());
        LogUtil.c("R_AudioPlayer", sb.toString());
        IAudioPlayer.AudioPlayerCallBack audioPlayerCallBack = this.f8514a;
        if (audioPlayerCallBack == null) {
            LogUtil.e("R_AudioPlayer", "audioPlayCallback is null, no need to callback, please check.");
        } else {
            audioPlayerCallBack.e(playStatus, gdyVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (f()) {
            LogUtil.b("R_AudioPlayer", "audioPlayer released, no need to prepare next player");
            return;
        }
        gdy gdyVarC = this.x.c(true);
        this.q = gdyVarC;
        if (gdyVarC == null) {
            LogUtil.b("R_AudioPlayer", "no track waiting to be played, no need to prepare next player");
            return;
        }
        LogUtil.b("R_AudioPlayer", "preparing next player...");
        final long jCurrentTimeMillis = System.currentTimeMillis();
        this.r.reset();
        this.v = PrepareState.UNLOAD.getState();
        this.r.setAudioAttributes(b());
        try {
            this.r.setDataSource(this.e, Uri.parse(this.q.i()));
            this.r.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: gep
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    this.e.d(jCurrentTimeMillis, mediaPlayer);
                }
            });
            this.v = PrepareState.LOADING.getState();
            this.r.prepareAsync();
        } catch (IOException | IllegalStateException e2) {
            LogUtil.d("R_AudioPlayer", "prepareNextPlayer failed, e: " + ExceptionUtils.c(e2));
        }
    }

    public /* synthetic */ void d(long j, MediaPlayer mediaPlayer) {
        this.v = PrepareState.LOADED.getState();
        LogUtil.b("R_AudioPlayer", "nextPlayer prepare success, time consume: " + (System.currentTimeMillis() - j));
        if (this.l) {
            e();
        }
        this.l = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.e("R_AudioPlayer", "enter handoverRetry");
        if (!j()) {
            LogUtil.e("R_AudioPlayer", "not running, don't need to handover");
            return;
        }
        MediaPlayer mediaPlayer = this.f;
        this.f = this.r;
        this.r = mediaPlayer;
        this.v = PrepareState.UNLOAD.getState();
        this.f.start();
        if (this.f.isPlaying()) {
            LogUtil.b("R_AudioPlayer", "handoverRetry play success, total duration: " + this.f.getDuration());
            b(IAudioPlayer.PlayStatus.PLAYING, this.q);
            this.i.resetAndTick((long) this.f.getDuration(), 1000L);
            return;
        }
        b(IAudioPlayer.PlayStatus.FAILED, this.q);
        LogUtil.e("R_AudioPlayer", "handoverRetry play failed, starting player failed...");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (f()) {
            LogUtil.e("R_AudioPlayer", "handoverPlayer failed, audioPlayer released, no need to handover");
            return;
        }
        if (this.q == null) {
            i();
            if (this.q == null) {
                LogUtil.c("R_AudioPlayer", "handoverPlayer failed, nextAudioItem is null, no need to handover");
                return;
            }
        }
        if (this.f == null || this.r == null) {
            LogUtil.d("R_AudioPlayer", "handoverPlayer failed, currentPlayer|otherPlayer is null");
            return;
        }
        if (this.v == PrepareState.UNLOAD.getState()) {
            LogUtil.b("R_AudioPlayer", "handoverPlayer failed, nextPlayer is not prepared, try in next heartbeat");
            return;
        }
        if (!this.r.isPlaying()) {
            LogUtil.b("R_AudioPlayer", "start nextPlayer");
            this.r.setVolume(0.25f, 0.25f);
            this.r.start();
            return;
        }
        if (i > 500) {
            LogUtil.b("R_AudioPlayer", "increase next player volume...");
            float f = 1.0f - (i / 1000.0f);
            float f2 = 1.0f - f;
            this.f.setVolume(f2, f2);
            float f3 = f + 0.25f;
            this.r.setVolume(f3, f3);
            return;
        }
        LogUtil.b("R_AudioPlayer", "stopping current player...");
        this.f.stop();
        this.r.setVolume(1.0f, 1.0f);
        b(IAudioPlayer.PlayStatus.SKIP_TO_NEXT, this.x.c());
        MediaPlayer mediaPlayer = this.f;
        this.f = this.r;
        this.r = mediaPlayer;
        this.v = PrepareState.UNLOAD.getState();
        this.i.resetAndTick(this.f.getDuration(), 1000L);
        this.x.b(this.q);
        b(IAudioPlayer.PlayStatus.PLAYING, this.x.c());
        b(this.f, this.y);
        this.m = true;
        LogUtil.b("R_AudioPlayer", "player handover finished...");
    }

    private boolean k() {
        if (this.g) {
            return true;
        }
        if (this.f8515b == null) {
            LogUtil.d("R_AudioPlayer", "AudioManager is null, request system service failed...");
            return false;
        }
        if (this.j == null && this.d == null) {
            this.d = b();
            this.j = new AudioFocusRequest.Builder(1).setAudioAttributes(this.d).setWillPauseWhenDucked(true).setOnAudioFocusChangeListener(this.h).build();
        }
        int iRequestAudioFocus = this.f8515b.requestAudioFocus(this.j);
        boolean z = iRequestAudioFocus == 1;
        if (z) {
            LogUtil.c("R_AudioPlayer", "request audio focus success");
            return z;
        }
        LogUtil.e("R_AudioPlayer", "request audio focus failed, result: " + iRequestAudioFocus);
        return z;
    }

    private void a() {
        LogUtil.b("R_AudioPlayer", "abandon audio focus");
        AudioFocusRequest audioFocusRequest = this.j;
        if (audioFocusRequest != null) {
            this.f8515b.abandonAudioFocusRequest(audioFocusRequest);
            if (this.g) {
                this.g = false;
                return;
            }
            return;
        }
        LogUtil.b("R_AudioPlayer", "abandonAudioFocus has released before");
    }

    private AudioAttributes b() {
        return new AudioAttributes.Builder().setUsage(this.u).setContentType(2).build();
    }

    private void g() {
        ScheduledFuture scheduledFuture = this.p;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        dxw.a(this.n);
        Handler handler = this.t;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.t = null;
        }
    }

    class a extends HealthCountDownTimer {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AudioPlayerImpl f8517c;
        private int d;
        private int e;

        @Override // com.huawei.health.musicservice.utils.HealthCountDownTimer
        public void onTick(long j) {
            int i;
            if (!this.f8517c.c() && !this.f8517c.h()) {
                try {
                    this.f8517c.d();
                    int duration = this.f8517c.f.getDuration() - this.f8517c.f.getCurrentPosition();
                    if (duration <= 0 || duration >= 10000) {
                        i = 1000;
                    } else {
                        if (getCurrentTickInterval() != 50) {
                            this.f8517c.i();
                        }
                        i = 50;
                    }
                    if (duration > 0 && duration < 1000) {
                        this.f8517c.a(duration);
                    }
                    if (duration > 0 && duration < 1000 && a(duration)) {
                        this.f8517c.a(0);
                    }
                    if (this.f8517c.m) {
                        this.f8517c.m = false;
                        return;
                    } else {
                        resetAndTick(duration, i);
                        return;
                    }
                } catch (IllegalStateException e) {
                    LogUtil.d("R_AudioPlayer", "exception during onTick, e: " + e);
                    return;
                }
            }
            LogUtil.b("R_AudioPlayer", "player paused or stopped, stop callback progress");
        }

        @Override // com.huawei.health.musicservice.utils.HealthCountDownTimer
        public void onFinish() {
            try {
                this.f8517c.f.stop();
                this.f8517c.i.cancel();
                gdy gdyVarC = this.f8517c.x.c();
                if (gdyVarC != null) {
                    gdyVarC.a(0L);
                }
                if (this.f8517c.q != null && this.f8517c.v != PrepareState.UNLOAD.getState()) {
                    LogUtil.b("R_AudioPlayer", "current item play finished, but nextAudioItem is not null, next player is ready:", Integer.valueOf(this.f8517c.v));
                    this.f8517c.x.b(this.f8517c.q);
                    if (this.f8517c.v != PrepareState.LOADED.getState()) {
                        this.f8517c.l = true;
                        this.f8517c.b(IAudioPlayer.PlayStatus.BUFFERING, this.f8517c.q);
                        return;
                    } else {
                        LogUtil.b("R_AudioPlayer", "nextPlayer is ready, but heartbeat is jammed, too late to start..");
                        this.f8517c.e();
                        return;
                    }
                }
                LogUtil.b("R_AudioPlayer", "current item play finished, no next item, calling stop...");
                this.f8517c.r.reset();
                this.f8517c.f8516c.set(PlayState.STOPPED.stateValue);
                this.f8517c.b(IAudioPlayer.PlayStatus.STOPPED, this.f8517c.x.c());
            } catch (IllegalStateException e) {
                LogUtil.d("R_AudioPlayer", "onFinish IllegalStateException:", ExceptionUtils.c(e));
                this.f8517c.b(IAudioPlayer.PlayStatus.FAILED, this.f8517c.q);
            }
        }

        private boolean a(int i) {
            if (i == this.d) {
                int i2 = this.e + 1;
                this.e = i2;
                if (i2 >= 5) {
                    this.d = 0;
                    this.e = 0;
                    return true;
                }
            } else {
                this.d = i;
                this.e = 0;
            }
            return false;
        }
    }

    class e extends BroadcastReceiver {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AudioPlayerImpl f8518c;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("notification_removed")) {
                LogUtil.b("R_AudioPlayer", "notification removed, will stop player...");
                this.f8518c.stop();
            } else {
                if (intent.getAction().equals("notification_play_or_pause_btn_clicked")) {
                    if (this.f8518c.j()) {
                        LogUtil.b("R_AudioPlayer", "notification button clicked, pausing...");
                        this.f8518c.pause();
                        return;
                    } else {
                        LogUtil.b("R_AudioPlayer", "notification button clicked, resumimg...");
                        this.f8518c.play();
                        return;
                    }
                }
                LogUtil.d("R_AudioPlayer", "unknown event, this should NOT happen...");
            }
        }
    }
}
