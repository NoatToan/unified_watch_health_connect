package com.huawei.haf.mediaprocess;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.SystemClock;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import health.compact.a.LogUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class AudioPlayer implements AudioManager.OnAudioFocusChangeListener {
    private MediaPlayer.OnCompletionListener aa;
    private CountDownTimer ab;
    private Timer ac;
    private int ad;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AudioAttributes f5981c;
    private volatile LinkedList<Integer> f;
    private AudioManager g;
    private long h;
    private AudioPlayCallback i;
    private List<Uri> j;
    private AudioFocusRequest k;
    private long l;
    private int m;
    private boolean n;
    private MediaPlayer o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private MediaPlayer x;
    private long y;
    private long z;
    private static final Object e = new Object();
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f5979a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f5980b = false;
    private volatile boolean w = false;

    public AudioPlayer() {
        Object systemService = BaseApplication.b().getSystemService("audio");
        this.g = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        this.j = new ArrayList();
        this.q = false;
        this.m = -1;
        this.n = false;
        this.p = false;
        this.i = null;
        this.ad = 1;
        this.v = false;
        this.u = false;
        this.f = new LinkedList<>();
        this.aa = new MediaPlayer.OnCompletionListener() { // from class: com.huawei.haf.mediaprocess.AudioPlayer$$ExternalSyntheticLambda0
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                this.f5982a.e(mediaPlayer);
            }
        };
    }

    /* synthetic */ void e(MediaPlayer mediaPlayer) {
        LogUtil.b("AudioPlayer", "onCompletion is called mCountDownTimerUnFinishedMills=", Long.valueOf(this.l), " isCurrentPlayer=", Boolean.valueOf(this.f5979a));
        this.t = true;
        if (this.n) {
            LogUtil.e("AudioPlayer", "audio focus loss");
            e(1004, "audio focus loss");
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        if (i == -3) {
            d(0.5f, 0.5f);
            LogUtil.c("AudioPlayer", "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK");
            return;
        }
        if (i == -2) {
            e();
            this.r = true;
            e(1006, "AUDIOFOCUS_LOSS");
            LogUtil.c("AudioPlayer", "AUDIOFOCUS_LOSS_TRANSIENT");
            return;
        }
        if (i == -1) {
            this.n = true;
            e();
            f();
            e(1004, "AUDIOFOCUS_LOSS");
            LogUtil.c("AudioPlayer", "AUDIOFOCUS_LOSS");
            return;
        }
        if (i != 1) {
            return;
        }
        if (this.r) {
            j();
        }
        d(1.0f, 1.0f);
        this.r = false;
        this.n = false;
        LogUtil.c("AudioPlayer", "AUDIOFOCUS_GAIN");
    }

    private void a(int i, int i2) {
        CountDownTimer countDownTimer = this.ab;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (i <= 0 || i2 <= 0) {
            LogUtil.d("AudioPlayer", "setDownTimerByTime totalTime or time is null");
        } else {
            this.ab = new CountDownTimer(i, i2) { // from class: com.huawei.haf.mediaprocess.AudioPlayer.1
                @Override // com.huawei.haf.mediaprocess.CountDownTimer
                public void onTick(long j) {
                    int iD;
                    if (!AudioPlayer.this.w) {
                        AudioPlayer.this.o();
                        AudioPlayer.this.l = j;
                        if (!AudioPlayer.this.t) {
                            AudioPlayer audioPlayer = AudioPlayer.this;
                            iD = audioPlayer.d(audioPlayer.f5979a ? AudioPlayer.this.o : AudioPlayer.this.x);
                        } else {
                            LogUtil.b("AudioPlayer", "player is call completion millisUntilFinished=", Long.valueOf(j));
                            iD = 0;
                        }
                        if (iD > 0 && j > 0) {
                            long j2 = iD;
                            long jAbs = Math.abs(j2 - j);
                            if (jAbs >= 500) {
                                LogUtil.b("AudioPlayer", "setDownTimerByTime millisUntilFinished=", Long.valueOf(j), " duration=", Integer.valueOf(iD), " differMills=", Long.valueOf(jAbs));
                                AudioPlayer.this.ab.setMillisInFuture(j2, iD > 3000 ? 1000 : 10);
                            }
                        }
                        if (iD > 3000) {
                            return;
                        }
                        AudioPlayer.this.d(iD);
                        return;
                    }
                    LogUtil.d("AudioPlayer", "setDownTimerByTime player release is call");
                }

                @Override // com.huawei.haf.mediaprocess.CountDownTimer
                public void onFinish() {
                    LogUtil.b("AudioPlayer", "setDownTimerByTime countDownTimer onFinish mIsPlayerRelease=", Boolean.valueOf(AudioPlayer.this.w), " mCountDownTimerUnFinishedMills=", Long.valueOf(AudioPlayer.this.l));
                    if (!AudioPlayer.this.i()) {
                        if (!AudioPlayer.this.u) {
                            AudioPlayer.this.e(21, "all audio play finish");
                            AudioPlayer.this.h();
                            return;
                        } else {
                            LogUtil.b("AudioPlayer", "back to first song");
                            AudioPlayer.this.g();
                            AudioPlayer.this.e(10, "play next audio");
                            return;
                        }
                    }
                    LogUtil.d("AudioPlayer", "onFinish abnormal end");
                    AudioPlayer.this.e(10, "play next audio");
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        LogUtil.b("AudioPlayer", "dealAbnormalEnd mCurrentIndex=", Integer.valueOf(this.m));
        int i = this.m;
        if (i < 0) {
            LogUtil.d("AudioPlayer", "dealAbnormalEnd illegal index");
            return false;
        }
        if (this.q) {
            LogUtil.b("AudioPlayer", "resume play from abnormal end in loop mode");
            c(this.m);
            return true;
        }
        if (!this.v) {
            if (i >= this.j.size() - 1) {
                return false;
            }
            LogUtil.b("AudioPlayer", "resume play from abnormal end mIsRepeat=", Boolean.valueOf(this.u));
            c(this.m + 1);
            return true;
        }
        LogUtil.b("AudioPlayer", "resume play from abnormal end in random mode");
        c(e(true));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (!this.w) {
            if (!this.f5980b) {
                CountDownTimer countDownTimer = this.ab;
                if (countDownTimer == null) {
                    LogUtil.e("AudioPlayer", "mTimerPlay is null");
                    return;
                }
                if (countDownTimer.getCurrentTickInterval() != 10) {
                    LogUtil.b("AudioPlayer", "changeTimerInterval mCountDownTimerUnFinishedMills=", Long.valueOf(this.l), " currentPlayer remainDuration=", Integer.valueOf(i));
                    this.ab.setMillisInFuture(i, 10L);
                }
                if (!this.q) {
                    if (!this.v && this.m + 1 >= this.j.size()) {
                        return;
                    } else {
                        m();
                    }
                }
                this.f5980b = true;
            }
            if (i > 1000) {
                return;
            }
            if (this.f5979a) {
                a(this.o, this.x, i);
                return;
            } else {
                a(this.x, this.o, i);
                return;
            }
        }
        LogUtil.d("AudioPlayer", "changeTimerInterval release is call");
    }

    private void a(MediaPlayer mediaPlayer, MediaPlayer mediaPlayer2, int i) {
        if (this.w || mediaPlayer == null || mediaPlayer2 == null) {
            LogUtil.d("AudioPlayer", "changeToNextPlayer release is call or currentPlayer|otherPlayer is null");
            return;
        }
        if (!a(mediaPlayer2)) {
            mediaPlayer2.setVolume(0.25f, 0.25f);
            mediaPlayer2.start();
            LogUtil.b("AudioPlayer", "changeToNextPlayer start otherPlayer remainDuration=", Integer.valueOf(i), " mCountDownTimerUnFinishedMills=", Long.valueOf(this.l));
        }
        if (i <= 1000 && i >= 500) {
            float f = 1.0f - (i / 1000.0f);
            float f2 = 1.0f - f;
            try {
                mediaPlayer.setVolume(f2, f2);
                float f3 = f + 0.25f;
                mediaPlayer2.setVolume(f3, f3);
            } catch (IllegalStateException e2) {
                LogUtil.d("AudioPlayer", "changeToNextPlayer setVolume IllegalStateException=", ExceptionUtils.c(e2));
            }
        }
        if (i <= 500) {
            LogUtil.b("AudioPlayer", "changeToNextPlayer end currentPlayer remainDuration=", Integer.valueOf(i), " mCountDownTimerUnFinishedMills=", Long.valueOf(this.l));
            if (a(mediaPlayer)) {
                try {
                    mediaPlayer.seekTo(0);
                    mediaPlayer.pause();
                } catch (IllegalStateException e3) {
                    LogUtil.d("AudioPlayer", "changeToNextPlayer end IllegalStateException=", ExceptionUtils.c(e3));
                }
            }
            try {
                mediaPlayer2.setVolume(1.0f, 1.0f);
            } catch (IllegalStateException e4) {
                LogUtil.d("AudioPlayer", "otherPlayer setVolume IllegalStateException=", ExceptionUtils.c(e4));
            }
            this.f5979a = !this.f5979a;
            int iD = d(mediaPlayer2);
            LogUtil.b("AudioPlayer", "changeToNextPlayer setMillisInFuture duration=", Integer.valueOf(iD), " isCurrentPlayer=", Boolean.valueOf(this.f5979a));
            this.ab.setMillisInFuture(iD, 1000L);
            this.t = false;
            this.f5980b = false;
            this.s = false;
            if (!this.q) {
                if (this.v) {
                    int iE = e(true);
                    this.m = iE;
                    LogUtil.b("AudioPlayer", "random mode next index:", Integer.valueOf(iE));
                } else if (this.m + 1 < this.j.size()) {
                    this.m++;
                }
                LogUtil.b("AudioPlayer", "changeToNextPlayer mCurrentIndex=", Integer.valueOf(this.m));
            }
            e(10, "play next audio");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(MediaPlayer mediaPlayer) {
        int duration = 0;
        try {
            if (mediaPlayer == null) {
                LogUtil.d("AudioPlayer", "getRemainDuration player is null", " isCurrentPlayer=", Boolean.valueOf(this.f5979a));
            } else {
                duration = mediaPlayer.getDuration() - mediaPlayer.getCurrentPosition();
            }
        } catch (IllegalStateException e2) {
            LogUtil.d("AudioPlayer", "getRemainDuration isCurrentPlayer=", Boolean.valueOf(this.f5979a), " IllegalStateException: ", ExceptionUtils.c(e2));
        }
        if (duration < 0) {
            LogUtil.d("AudioPlayer", "getRemainDuration remainDuration=", Integer.valueOf(duration), " isCurrentPlayer=", Boolean.valueOf(this.f5979a), " mCountDownTimerUnFinishedMills=", Long.valueOf(this.l));
        }
        return duration;
    }

    public AudioPlayer a(Uri uri) {
        this.j.add(uri);
        t();
        return this;
    }

    public AudioPlayer a(List<Uri> list) {
        List<Uri> list2 = this.j;
        this.j = new ArrayList(list);
        if (d() && this.m < list2.size()) {
            Uri uri = list2.get(this.m);
            int i = this.m;
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                if (uri.equals(this.j.get(i2))) {
                    i = i2;
                    break;
                }
            }
            this.m = i;
        }
        t();
        LogUtil.b("AudioPlayer", "audio list size=", Integer.valueOf(this.j.size()));
        return this;
    }

    private void t() {
        synchronized (this) {
            this.f = new LinkedList<>();
            for (int i = 0; i < this.j.size(); i++) {
                this.f.add(Integer.valueOf(i));
            }
            if (this.v) {
                Collections.shuffle(this.f);
                LogUtil.b("AudioPlayer", "queue after shuffle:", this.f.toString());
            }
        }
    }

    public AudioPlayer e(long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        this.y = millis;
        LogUtil.b("AudioPlayer", "keep is call mKeepMills=", Long.valueOf(millis));
        this.p = true;
        if (d()) {
            l();
        }
        return this;
    }

    public boolean d() {
        boolean zA = a(this.f5979a ? this.o : this.x);
        LogUtil.b("AudioPlayer", "isCurrentPlayer=", Boolean.valueOf(this.f5979a), " isPlaying=", Boolean.valueOf(zA));
        return zA;
    }

    private boolean a(MediaPlayer mediaPlayer) {
        try {
            if (mediaPlayer == null) {
                LogUtil.e("AudioPlayer", "isPlaying player is null,isCurrentPlayer=", Boolean.valueOf(this.f5979a));
                return false;
            }
            return mediaPlayer.isPlaying();
        } catch (IllegalStateException e2) {
            LogUtil.d("AudioPlayer", "isPlaying isCurrentPlayer=", Boolean.valueOf(this.f5979a), " IllegalStateException=", ExceptionUtils.c(e2));
            return false;
        }
    }

    public boolean c() {
        LogUtil.b("AudioPlayer", "cancelKeep is call");
        if (!this.p) {
            LogUtil.d("AudioPlayer", "not keep mode");
            return false;
        }
        if (this.ac == null) {
            return true;
        }
        LogUtil.b("AudioPlayer", "cancelKeep timer is cancel");
        this.ac.cancel();
        this.ac = null;
        return true;
    }

    public AudioPlayer b(AudioPlayCallback audioPlayCallback) {
        this.i = audioPlayCallback;
        return this;
    }

    public AudioPlayer d(float f, float f2) {
        if (!this.f5979a) {
            if (this.x != null && b() != -1) {
                this.x.setVolume(f, f2);
            }
            return this;
        }
        if (this.o != null && b() != -1) {
            this.o.setVolume(f, f2);
            return this;
        }
        LogUtil.e("AudioPlayer", "mPlayer released, setVolume fail");
        return this;
    }

    public AudioPlayer e(int i) {
        this.ad = i;
        return this;
    }

    public AudioPlayer d(boolean z) {
        LogUtil.b("AudioPlayer", "isLoop=", Boolean.valueOf(z));
        if (!this.q && z) {
            this.q = true;
            m();
            return this;
        }
        this.q = z;
        return this;
    }

    public void e() {
        if (!this.f5979a) {
            c(this.x);
        } else {
            c(this.o);
        }
        CountDownTimer countDownTimer = this.ab;
        if (countDownTimer != null) {
            countDownTimer.pause();
        }
    }

    private void c(MediaPlayer mediaPlayer) {
        if (a(mediaPlayer)) {
            LogUtil.b("AudioPlayer", "pause is called");
            try {
                mediaPlayer.pause();
                k();
                e(2, "mediaPlayer paused");
                return;
            } catch (IllegalStateException e2) {
                LogUtil.d("AudioPlayer", "pausePlay IllegalStateException=", ExceptionUtils.c(e2));
                return;
            }
        }
        LogUtil.e("AudioPlayer", "mPlayer in wrong state");
        e(1002, "mPlayer in wrong state");
    }

    public void j() {
        LogUtil.b("AudioPlayer", "resume is called");
        try {
            if (!this.f5979a) {
                b(this.x);
            } else {
                b(this.o);
            }
        } catch (IllegalStateException unused) {
            LogUtil.d("AudioPlayer", "call start at wrong state");
            e(1002, "call start at wrong state");
        }
    }

    private void b(MediaPlayer mediaPlayer) {
        if (a(mediaPlayer) || mediaPlayer == null) {
            return;
        }
        if (!n()) {
            LogUtil.e("AudioPlayer", "request focus fail");
            this.n = true;
            return;
        }
        mediaPlayer.start();
        this.t = false;
        e(3, "resume play");
        int iD = d(mediaPlayer);
        int i = iD > 3000 ? 1000 : 10;
        CountDownTimer countDownTimer = this.ab;
        if (countDownTimer == null) {
            a(iD, i);
        } else {
            countDownTimer.setMillisInFuture(iD, i);
        }
        this.n = false;
        l();
    }

    public int b() {
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        try {
            boolean z = this.f5979a;
            if (z && (mediaPlayer2 = this.o) != null) {
                return mediaPlayer2.getCurrentPosition();
            }
            if (z || (mediaPlayer = this.x) == null) {
                return -1;
            }
            return mediaPlayer.getCurrentPosition();
        } catch (IllegalStateException e2) {
            LogUtil.d("AudioPlayer", "getCurrentPosition IllegalStateException: ", ExceptionUtils.c(e2));
            return -1;
        }
    }

    public int a() {
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        try {
            boolean z = this.f5979a;
            if (z && (mediaPlayer2 = this.o) != null) {
                return mediaPlayer2.getDuration();
            }
            if (z || (mediaPlayer = this.x) == null) {
                return -1;
            }
            return mediaPlayer.getDuration();
        } catch (IllegalStateException e2) {
            LogUtil.d("AudioPlayer", "getAudioDuration IllegalStateException: ", ExceptionUtils.c(e2));
            return -1;
        }
    }

    public void h() {
        LogUtil.b("AudioPlayer", "release is call");
        this.w = true;
        if (this.o != null) {
            synchronized (e) {
                MediaPlayer mediaPlayer = this.o;
                if (mediaPlayer != null) {
                    mediaPlayer.release();
                    this.o = null;
                    e(22, "mCurrentPlayer release");
                } else {
                    e(22, "mPlayer release before");
                }
            }
        }
        if (this.x != null) {
            synchronized (d) {
                MediaPlayer mediaPlayer2 = this.x;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.release();
                    this.x = null;
                }
            }
        }
        f();
        Timer timer = this.ac;
        if (timer != null) {
            timer.cancel();
            this.ac = null;
        }
        CountDownTimer countDownTimer = this.ab;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.ab = null;
        }
    }

    public boolean g() {
        return c(0);
    }

    public boolean c(int i) {
        e();
        if (i >= 0 && i < this.j.size()) {
            if (!n()) {
                e(1003, "requestAudioFocus() fail");
                this.n = true;
                return false;
            }
            this.n = false;
            this.w = false;
            this.m = i;
            LogUtil.b("AudioPlayer", "play mCurrentIndex=", Integer.valueOf(i));
            Uri uriB = b(this.m);
            if (uriB == null) {
                LogUtil.d("AudioPlayer", "play audio uri is null");
                return false;
            }
            try {
                synchronized (e) {
                    MediaPlayer mediaPlayer = this.o;
                    if (mediaPlayer != null) {
                        mediaPlayer.release();
                    }
                    MediaPlayer mediaPlayer2 = this.x;
                    if (mediaPlayer2 != null) {
                        mediaPlayer2.reset();
                    }
                    MediaPlayer mediaPlayer3 = new MediaPlayer();
                    this.o = mediaPlayer3;
                    mediaPlayer3.setAudioAttributes(new AudioAttributes.Builder().setUsage(this.ad).setContentType(2).build());
                    this.o.setDataSource(BaseApplication.b(), uriB);
                    this.o.prepare();
                    this.o.setOnCompletionListener(this.aa);
                    this.o.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.huawei.haf.mediaprocess.AudioPlayer.2
                        @Override // android.media.MediaPlayer.OnErrorListener
                        public boolean onError(MediaPlayer mediaPlayer4, int i2, int i3) {
                            LogUtil.d("AudioPlayer", " error on ErrorListener, what:", Integer.valueOf(i2), " extra:", Integer.valueOf(i3));
                            AudioPlayer.this.e(1002, " error on ErrorListener, what:" + i2 + " extra:" + i3);
                            return false;
                        }
                    });
                    this.o.start();
                    this.f5979a = true;
                    this.s = false;
                    this.t = false;
                    e(3, "playing");
                    int iD = d(this.o);
                    LogUtil.b("AudioPlayer", "play start mCurrentPlayer duration=", Integer.valueOf(iD));
                    a(iD, 1000);
                }
                LogUtil.b("AudioPlayer", "start play ", "mIsKeepMode:", Boolean.valueOf(this.p));
                if (this.q) {
                    m();
                }
                l();
                return true;
            } catch (IOException e2) {
                LogUtil.d("AudioPlayer", "mPlayer play fail:", ExceptionUtils.c(e2));
                e(1002, "mPlayer play fail");
                return false;
            } catch (IllegalStateException e3) {
                LogUtil.d("AudioPlayer", "mPlayer at illegal state", ExceptionUtils.c(e3));
                e(1002, "mPlayer at illegal state");
                return false;
            } catch (RuntimeException e4) {
                LogUtil.d("AudioPlayer", "mPlayer at runtimeException:", ExceptionUtils.c(e4));
                e(1002, "mPlayer at runtimeException");
                return false;
            }
        }
        LogUtil.d("AudioPlayer", "error play index:", Integer.valueOf(i));
        e(1001, "out of index");
        return false;
    }

    private void m() {
        int iE = this.m + 1;
        if (this.v) {
            iE = e(false);
        }
        if (this.q) {
            iE = this.m;
        }
        if (iE >= this.j.size()) {
            return;
        }
        LogUtil.b("AudioPlayer", "initNextPlayer nextIndex=", Integer.valueOf(iE), " isCurrentPlayer=", Boolean.valueOf(this.f5979a), " mIsRandom=", Boolean.valueOf(this.v), " mIsLoop=", Boolean.valueOf(this.q));
        try {
            if (this.f5979a) {
                i(iE);
            } else {
                a(iE);
            }
        } catch (IOException e2) {
            LogUtil.d("AudioPlayer", "mNextPlayer prepare fail:", ExceptionUtils.c(e2));
            e(1001, "mNextPlayer prepare  fail");
        }
    }

    private void i(int i) throws IOException {
        LogUtil.b("AudioPlayer", "setNextPlayer is call");
        synchronized (d) {
            MediaPlayer mediaPlayer = this.x;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                this.x = null;
            }
            Uri uriB = b(i);
            if (uriB == null) {
                LogUtil.d("AudioPlayer", "setNextPlayer audio uri is null");
                this.x = null;
                return;
            }
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            this.x = mediaPlayer2;
            mediaPlayer2.setAudioAttributes(new AudioAttributes.Builder().setUsage(this.ad).setContentType(2).build());
            this.x.setDataSource(BaseApplication.b(), uriB);
            this.x.prepare();
            this.x.setOnCompletionListener(this.aa);
            this.x.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.huawei.haf.mediaprocess.AudioPlayer.3
                @Override // android.media.MediaPlayer.OnErrorListener
                public boolean onError(MediaPlayer mediaPlayer3, int i2, int i3) {
                    LogUtil.d("AudioPlayer", " mNextPlayer error on ErrorListener, what:", Integer.valueOf(i2), " extra:", Integer.valueOf(i3));
                    AudioPlayer.this.e(1002, " mNextPlayer error on ErrorListener, what:" + i2 + " extra:" + i3);
                    return false;
                }
            });
        }
    }

    private Uri b(int i) {
        Uri uri = (i < 0 || i >= this.j.size()) ? null : this.j.get(i);
        if (uri == null) {
            e(1001, "fatal error: audio uri is null");
        }
        return uri;
    }

    private void a(int i) throws IOException {
        LogUtil.b("AudioPlayer", "setCurrentPlayer is call");
        synchronized (e) {
            MediaPlayer mediaPlayer = this.o;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                this.o = null;
            }
            Uri uriB = b(i);
            if (uriB == null) {
                LogUtil.d("AudioPlayer", "setCurrentPlayer audio uri is null");
                this.o = null;
                return;
            }
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            this.o = mediaPlayer2;
            mediaPlayer2.setAudioAttributes(new AudioAttributes.Builder().setUsage(this.ad).setContentType(2).build());
            this.o.setDataSource(BaseApplication.b(), uriB);
            this.o.prepare();
            this.o.setOnCompletionListener(this.aa);
            this.o.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.huawei.haf.mediaprocess.AudioPlayer.4
                @Override // android.media.MediaPlayer.OnErrorListener
                public boolean onError(MediaPlayer mediaPlayer3, int i2, int i3) {
                    LogUtil.d("AudioPlayer", " mCurrentPlayer error on ErrorListener, what:", Integer.valueOf(i2), " extra:", Integer.valueOf(i3));
                    AudioPlayer.this.e(1002, " mCurrentPlayer error on ErrorListener, what:" + i2 + " extra:" + i3);
                    return false;
                }
            });
        }
    }

    private void l() {
        if (this.p) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.z = jElapsedRealtime;
            LogUtil.b("AudioPlayer", "handleKeepModePlay timer start mills=", Long.valueOf(jElapsedRealtime));
            r();
        }
    }

    private void k() {
        if (this.ac == null || !this.p || this.z <= 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LogUtil.b("AudioPlayer", "handleKeepModePause pause mills=", Long.valueOf(jElapsedRealtime));
        long j = this.z;
        if (jElapsedRealtime > j) {
            long j2 = this.y;
            long j3 = j2 - (jElapsedRealtime - j);
            if (j3 > 0) {
                j2 = j3;
            }
            this.y = j2;
        }
        LogUtil.b("AudioPlayer", "handleKeepModePause mKeepMills after pause: ", Long.valueOf(this.y));
    }

    private void r() {
        if (this.p) {
            LogUtil.b("AudioPlayer", "startTimer mKeepMills: ", Long.valueOf(this.y));
            if (this.y <= 0) {
                LogUtil.e("AudioPlayer", "startTimer fatal:: mKeepMills <= 0");
                return;
            }
            Timer timer = this.ac;
            if (timer != null) {
                timer.cancel();
                this.ac = null;
            }
            Timer timer2 = new Timer("AudioPlayer");
            this.ac = timer2;
            timer2.schedule(new TimerTask() { // from class: com.huawei.haf.mediaprocess.AudioPlayer.5
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    LogUtil.b("AudioPlayer", "startTimer keep duration finish");
                    AudioPlayer.this.e(21, "keep duration finish");
                    AudioPlayer.this.h();
                }
            }, this.y);
            return;
        }
        LogUtil.b("AudioPlayer", "startTimer not keep mode");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, String str) {
        LogUtil.b("AudioPlayer", "state:", Integer.valueOf(i), " message:", str, " index:", Integer.valueOf(this.m));
        AudioPlayCallback audioPlayCallback = this.i;
        if (audioPlayCallback != null) {
            audioPlayCallback.mediaPlayCallBack(i, this.m, str);
        } else {
            LogUtil.e("AudioPlayer", "callback is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        CountDownTimer countDownTimer = this.ab;
        if (this.i != null && countDownTimer != null) {
            if (!this.s) {
                if (d(this.f5979a ? this.o : this.x) <= 500) {
                    this.i.onProgressChanged(a(), a());
                    LogUtil.b("AudioPlayer", "do audio finish progress callback");
                    this.s = true;
                    return;
                }
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long currentTickInterval = countDownTimer.getCurrentTickInterval();
            if (currentTickInterval == 1000) {
                this.i.onProgressChanged(b(), a());
                this.h = 0L;
                return;
            }
            if (currentTickInterval == 10) {
                long j = this.h;
                if (j == 0) {
                    this.h = jElapsedRealtime;
                    return;
                } else {
                    if (j <= 0 || jElapsedRealtime - j < 1000) {
                        return;
                    }
                    LogUtil.b("AudioPlayer", "doProgressCallback in the last less than three seconds");
                    this.i.onProgressChanged(b(), a());
                    this.h = jElapsedRealtime;
                    return;
                }
            }
            LogUtil.b("AudioPlayer", "doProgressCallback not play state");
            return;
        }
        LogUtil.d("AudioPlayer", "doProgressCallback callback is null");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    private boolean n() {
        boolean z;
        if (this.g != null) {
            if (this.k == null && this.f5981c == null) {
                this.f5981c = new AudioAttributes.Builder().setUsage(this.ad).setContentType(2).build();
            }
            AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(1).setAudioAttributes(this.f5981c).setWillPauseWhenDucked(true).setOnAudioFocusChangeListener(this).build();
            this.k = audioFocusRequestBuild;
            z = this.g.requestAudioFocus(audioFocusRequestBuild) == 1;
        }
        LogUtil.b("AudioPlayer", "requestAudioFocus isFocus=", Boolean.valueOf(z));
        return z;
    }

    private void f() {
        AudioManager audioManager;
        AudioFocusRequest audioFocusRequest = this.k;
        if (audioFocusRequest != null && (audioManager = this.g) != null) {
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
        } else {
            LogUtil.b("AudioPlayer", "abandonAudioFocus has released before");
        }
    }

    private int e(boolean z) {
        synchronized (this) {
            if (this.f.isEmpty()) {
                t();
            }
            Integer first = this.f.getFirst();
            if (first == null) {
                LogUtil.d("AudioPlayer", "all songs have been played, go back to the first");
                return 0;
            }
            LogUtil.b("AudioPlayer", "random index", first, " isNeedUpdate=", Boolean.valueOf(z));
            if (z) {
                q();
            }
            return first.intValue();
        }
    }

    private void q() {
        synchronized (this) {
            LogUtil.b("AudioPlayer", " updateNextRandomIndex");
            if (!this.f.isEmpty()) {
                this.f.pop();
            } else {
                t();
            }
        }
    }
}
