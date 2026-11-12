package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.work.PeriodicWorkRequest;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.functionsetcard.dailymoment.DailyMomentCardAdapter;
import com.huawei.health.functionsetcard.dailymoment.operation.IGetTitleCallback;
import com.huawei.health.marketing.datatype.ControlItem;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.health.messagecenter.model.CommonUtil;
import com.huawei.health.servicesui.R;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.ui.commonui.progressindicator.HealthProgressIndicator;
import health.compact.a.GRSManager;
import health.compact.a.ReleaseLogUtil;
import java.io.IOException;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ewo {
    private ValueAnimator aa;
    private Timer ac;
    private HealthProgressIndicator ad;
    private AudioManager f;
    private String g;
    private AudioAttributes h;
    private AudioManager.OnAudioFocusChangeListener i;
    private ControlItem k;
    private SingleDailyMomentContent l;
    private long m;
    private Context n;
    private DailyMomentCardAdapter o;
    private long p;
    private int q;
    private boolean s;
    private long t;
    private ImageView u;
    private MediaPlayer w;
    private boolean x;
    private long y;
    private final Object e = new Object();
    private boolean j = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f33561b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f33560a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f33562c = false;
    private volatile boolean d = false;
    private boolean v = false;
    private Handler r = new Handler(Looper.getMainLooper()) { // from class: ewo.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            ewo.this.i();
        }
    };

    private int d(int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        return (int) ((i / i2) * 100.0f);
    }

    static /* synthetic */ void d(int i, Object obj) {
    }

    public ewo(View view, SingleDailyMomentContent singleDailyMomentContent, int i, DailyMomentCardAdapter dailyMomentCardAdapter) {
        this.n = view.getContext();
        this.l = singleDailyMomentContent;
        if (singleDailyMomentContent != null) {
            this.k = singleDailyMomentContent.getControlItem();
        }
        this.g = singleDailyMomentContent.getCoverLinkValue();
        this.q = i;
        this.u = (ImageView) view.findViewById(R.id.daily_moment_media_button);
        this.w = new MediaPlayer();
        Object systemService = this.n.getSystemService("audio");
        if (systemService instanceof AudioManager) {
            this.f = (AudioManager) systemService;
        }
        this.o = dailyMomentCardAdapter;
        this.ad = (HealthProgressIndicator) view.findViewById(R.id.daily_moment_media_indicator);
        this.s = false;
        a();
        b(singleDailyMomentContent);
        b(view);
    }

    public boolean e() {
        if (this.w == null) {
            return false;
        }
        LogUtil.a("DailyMomentMediaPlayer", "isAudioPlaying: " + this.d);
        return this.d;
    }

    private void n() {
        SingleDailyMomentContent singleDailyMomentContent = this.l;
        if (singleDailyMomentContent == null) {
            LogUtil.a("DailyMomentMediaPlayer", "getMusicTitle failed");
            return;
        }
        if (singleDailyMomentContent.getThemeType() == 1) {
            ewy.b bVarE = ewy.e(this.n, this.l, new IGetTitleCallback() { // from class: ewo.3
                @Override // com.huawei.health.functionsetcard.dailymoment.operation.IGetTitleCallback
                public void onFailure(int i, String str) {
                    LogUtil.a("DailyMomentMediaPlayer", "get title failed, errorCode: " + i);
                }

                @Override // com.huawei.health.functionsetcard.dailymoment.operation.IGetTitleCallback
                public void onSuccess(Object obj) {
                    if (!(obj instanceof ewy.b)) {
                        LogUtil.j("DailyMomentMediaPlayer", "getResourceDetail result is error");
                        return;
                    }
                    ewy.b bVar = (ewy.b) obj;
                    LogUtil.a("DailyMomentMediaPlayer", "getMusicTitle success, title: " + bVar.c());
                    if (TextUtils.isEmpty(bVar.c())) {
                        return;
                    }
                    eww.e(bVar.c());
                }
            });
            if (bVarE == null || TextUtils.isEmpty(bVarE.c())) {
                return;
            }
            eww.e(bVarE.c());
            return;
        }
        if (this.l.getThemeType() == 2) {
            eww.e(this.l.getCustomTheme());
        } else {
            LogUtil.j("DailyMomentMediaPlayer", "theme type is invalid");
        }
    }

    private void c(String str) {
        ewy.b bVarC = ewy.c(this.l.getCoverLinkType(), this.l.getCoverLinkValue());
        if (bVarC != null) {
            LogUtil.a("DailyMomentMediaPlayer", "pageDetail.getUrl(): " + bVarC.a());
            d(bVarC.a());
            return;
        }
        final String str2 = LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode() ? "/messageCenter/getSleepAudioById" : "/messageCenter/user/getSleepAudioById";
        final HashMap<String, String> mapE = ewv.e(this.n);
        mapE.put(CommonUtil.PAGE_TYPE, String.valueOf(1));
        mapE.put("Id", str);
        final HashMap<String, String> mapB = ewv.b(this.n);
        GRSManager.c(this.n).d("messageCenterUrl", new GrsQueryCallback() { // from class: ewo.2
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str3) {
                LogUtil.a("DailyMomentMediaPlayer", "message center key: " + str3);
                ltg.c(str3 + str2, mapE, mapB, new HttpResCallback() { // from class: ewo.2.4
                    @Override // com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback
                    public void onFinished(int i, String str4) {
                        if (i != 200) {
                            ewo.this.m();
                            return;
                        }
                        LogUtil.a("DailyMomentMediaPlayer", "audio info: " + str4);
                        try {
                            String string = new JSONObject(str4).getJSONObject("sleepAudio").getString("audioUrl");
                            LogUtil.a("DailyMomentMediaPlayer", "audioUrl: " + string);
                            ewo.this.d(string);
                        } catch (JSONException unused) {
                            ewo.this.m();
                            LogUtil.a("DailyMomentMediaPlayer", "audio info has json exception");
                        }
                    }
                });
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i) {
                LogUtil.a("DailyMomentMediaPlayer", "get message center url failed");
                ewo.this.m();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        MediaPlayer mediaPlayer = this.w;
        if (mediaPlayer == null || this.ad == null) {
            return;
        }
        long currentPosition = this.m + ((long) mediaPlayer.getCurrentPosition());
        if (currentPosition >= this.p && !this.v) {
            this.v = true;
            a(1.0f, 0.0f);
        }
        if (currentPosition >= this.p + 30000) {
            LogUtil.a("DailyMomentMediaPlayer", "cycle play complete");
            this.w.seekTo(0);
            this.ad.setProgress(0);
            d();
            return;
        }
        LogUtil.a("DailyMomentMediaPlayer", "currentPosition: " + this.w.getCurrentPosition() + "progress: " + this.ad.getProgress() + " , TotalPlayDuration: " + currentPosition);
        this.ad.setProgress(d(this.w.getCurrentPosition(), this.w.getDuration()));
    }

    private void a(final float f, float f2) {
        LogUtil.a("DailyMomentMediaPlayer", "beginFadeOut");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.aa = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.t);
        this.aa.setInterpolator(new LinearInterpolator());
        this.aa.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ewo.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float)) {
                    LogUtil.a("DailyMomentMediaPlayer", "getAnimatedValue failed");
                    return;
                }
                float fFloatValue = ((Float) animatedValue).floatValue();
                try {
                    if (ewo.this.w != null) {
                        ewo.this.w.setVolume(fFloatValue, fFloatValue);
                    }
                } catch (IllegalStateException unused) {
                    LogUtil.e("DailyMomentMediaPlayer", "set player volume exception");
                    ewo.this.aa.cancel();
                }
            }
        });
        this.aa.addListener(new Animator.AnimatorListener() { // from class: ewo.10
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                LogUtil.a("DailyMomentMediaPlayer", "onAnimationStart");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (ewo.this.w != null) {
                    LogUtil.a("DailyMomentMediaPlayer", "onAnimationEnd");
                    MediaPlayer mediaPlayer = ewo.this.w;
                    float f3 = f;
                    mediaPlayer.setVolume(f3, f3);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                if (ewo.this.w != null) {
                    LogUtil.a("DailyMomentMediaPlayer", "onAnimationCancel");
                    MediaPlayer mediaPlayer = ewo.this.w;
                    float f3 = f;
                    mediaPlayer.setVolume(f3, f3);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                LogUtil.a("DailyMomentMediaPlayer", "onAnimationRepeat");
            }
        });
        this.aa.start();
    }

    private void d(boolean z) {
        if (this.u == null) {
            return;
        }
        if (z) {
            this.d = true;
        } else {
            this.d = false;
        }
        exe.e(this.k, this.u, z);
    }

    private void b(SingleDailyMomentContent singleDailyMomentContent) {
        if (this.u == null) {
            return;
        }
        d(false);
        this.u.setOnClickListener(new View.OnClickListener() { // from class: ewt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(view);
            }
        });
    }

    /* synthetic */ void c(View view) {
        LogUtil.a("DailyMomentMediaPlayer", "mMediaButton is clicked");
        k();
    }

    private void b(View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: ews
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f33587c.d(view2);
            }
        });
    }

    /* synthetic */ void d(View view) {
        k();
    }

    private void k() {
        MediaPlayer mediaPlayer;
        boolean z = this.s;
        if (z || (mediaPlayer = this.w) == null) {
            ReleaseLogUtil.c("R_DailyMomentMediaPlayer", "mHasError:", Boolean.valueOf(z), " mMediaPlayer is null:", Boolean.valueOf(this.w == null));
            return;
        }
        if (mediaPlayer.isPlaying()) {
            this.f.abandonAudioFocus(this.i);
            this.o.a();
            j();
            return;
        }
        if (!LoginInit.getInstance(this.n).getIsLogined()) {
            LoginInit.getInstance(this.n).browsingToLogin(new IBaseResponseCallback() { // from class: ewu
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    ewo.d(i, obj);
                }
            }, "");
            return;
        }
        if (this.f33560a) {
            LogUtil.a("DailyMomentMediaPlayer", "audio is already prepared");
            this.o.e();
            i();
            s();
            return;
        }
        if (this.f33562c) {
            return;
        }
        this.f33562c = true;
        this.o.e();
        try {
            c(this.g);
        } catch (IllegalStateException unused) {
            LogUtil.a("DailyMomentMediaPlayer", "mediaplayer prepareAsync failed!");
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (this.w == null) {
            return;
        }
        b(str);
        this.w.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: ewo.9
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                mediaPlayer.release();
                ewo.this.m();
                return true;
            }
        });
        this.w.setAudioAttributes(this.h);
        this.w.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: ewo.8
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                LogUtil.a("DailyMomentMediaPlayer", "prepared");
                ewo.this.f33560a = true;
                if (ewo.this.o != null) {
                    ewo.this.o.e(ewo.this.q, ewo.this);
                }
                if (ewo.this.f33562c) {
                    ewo.this.s();
                }
            }
        });
        this.w.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: ewo.7
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                LogUtil.a("DailyMomentMediaPlayer", "complete");
                ewo.this.w.seekTo(0);
                ewo.this.i();
                ewo.this.m = SystemClock.elapsedRealtime() - ewo.this.y;
                if (!ewo.this.x || ewo.this.m >= PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS) {
                    ewo.this.d();
                    return;
                }
                LogUtil.a("DailyMomentMediaPlayer", "replay music, total play duration: " + ewo.this.m + " ms");
                ewo.this.w.start();
            }
        });
        this.w.prepareAsync();
    }

    private void b(String str) {
        try {
            this.w.setDataSource(str);
        } catch (IOException unused) {
            LogUtil.a("DailyMomentMediaPlayer", "initPlayer IOException");
            m();
        } catch (IllegalStateException unused2) {
            LogUtil.a("DailyMomentMediaPlayer", "initPlayer IllegalStateException");
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.aa.cancel();
        this.aa.removeAllUpdateListeners();
        this.aa.removeAllListeners();
        g();
        this.o.a();
        HashMap map = new HashMap(16);
        map.put("status", 2);
        map.put(KakaConstants.SLEEP_MUSIC_DURATION, Long.valueOf(SystemClock.elapsedRealtime() - this.y));
        ewz.e(this.n, AnalyticsValue.DAILY_MOMENT_11100308.value(), this.l, map);
    }

    private void a() {
        this.h = new AudioAttributes.Builder().setUsage(1).setContentType(2).build();
        this.i = new AudioManager.OnAudioFocusChangeListener() { // from class: ewo.6
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public void onAudioFocusChange(int i) {
                if (i == -3 || i == -2) {
                    synchronized (ewo.this.e) {
                        ewo.this.j = true;
                        ewo.this.f33561b = false;
                        ewo.this.j();
                    }
                    return;
                }
                if (i == -1) {
                    synchronized (ewo.this.e) {
                        ewo.this.j = false;
                        ewo.this.f33561b = false;
                        ewo.this.o.a();
                        ewo.this.j();
                    }
                    return;
                }
                if (i != 1) {
                    return;
                }
                if (ewo.this.j || ewo.this.f33561b) {
                    synchronized (ewo.this.e) {
                        ewo.this.j = false;
                        ewo.this.f33561b = false;
                        ewo.this.l();
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        AudioManager audioManager = this.f;
        if (audioManager == null) {
            return;
        }
        int iRequestAudioFocus = audioManager.requestAudioFocus(this.i, 3, 1);
        synchronized (this.e) {
            try {
                if (iRequestAudioFocus == 0) {
                    this.o.a();
                    LogUtil.d("DailyMomentMediaPlayer", "audiofocus request failed");
                } else if (iRequestAudioFocus == 1) {
                    l();
                } else if (iRequestAudioFocus == 2) {
                    this.o.a();
                    this.f33561b = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void o() {
        LogUtil.a("DailyMomentMediaPlayer", "startRefreshingProcess");
        Timer timer = new Timer("DailyMomentMediaPlayer");
        this.ac = timer;
        timer.schedule(new TimerTask() { // from class: ewo.4
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                ewo.this.r.sendMessage(messageObtain);
            }
        }, 0L, Math.max(1000, this.w.getDuration() / 100));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.s = true;
        if (this.o != null) {
            HandlerExecutor.b(new Runnable() { // from class: ewr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33586c.c();
                }
            });
        }
    }

    /* synthetic */ void c() {
        this.o.a();
    }

    private void t() {
        LogUtil.a("DailyMomentMediaPlayer", "stopRefreshingProgress");
        Timer timer = this.ac;
        if (timer != null) {
            timer.cancel();
            this.ac.purge();
            this.ac = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        MediaPlayer mediaPlayer = this.w;
        if (mediaPlayer == null || mediaPlayer.isPlaying()) {
            return;
        }
        LogUtil.a("DailyMomentMediaPlayer", "start play");
        f();
        o();
        this.w.start();
        d(true);
        n();
        this.y = SystemClock.elapsedRealtime();
        h();
        HashMap map = new HashMap(16);
        map.put("status", 0);
        ewz.e(this.n, AnalyticsValue.DAILY_MOMENT_11100308.value(), this.l, map);
    }

    private void h() {
        MediaPlayer mediaPlayer = this.w;
        if (mediaPlayer != null) {
            int duration = mediaPlayer.getDuration();
            if (duration == -1) {
                LogUtil.a("DailyMomentMediaPlayer", "get duration failed!");
                return;
            }
            this.m = 0L;
            long j = duration;
            boolean z = j - 300000 < 0;
            this.x = z;
            this.t = 30000L;
            if (z) {
                this.p = 870000L;
            } else {
                this.p = j - 30000;
            }
            LogUtil.a("DailyMomentMediaPlayer", "duration: " + duration + ", mFadeOutBeginTime: " + this.p + ", mIsCyclePlay: " + this.x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        MediaPlayer mediaPlayer = this.w;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return;
        }
        t();
        this.w.pause();
        d(false);
        eww.d();
        HashMap map = new HashMap(16);
        map.put("status", 1);
        map.put(KakaConstants.SLEEP_MUSIC_DURATION, Long.valueOf(SystemClock.elapsedRealtime() - this.y));
        ewz.e(this.n, AnalyticsValue.DAILY_MOMENT_11100308.value(), this.l, map);
    }

    public void b() {
        ValueAnimator valueAnimator = this.aa;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.aa.removeAllUpdateListeners();
            this.aa.removeAllListeners();
            this.aa = null;
        }
        if (this.w == null) {
            return;
        }
        try {
            g();
            this.w.release();
            this.w = null;
        } catch (IllegalStateException unused) {
            LogUtil.e("DailyMomentMediaPlayer", "media player is not prepared or has been released");
        }
    }

    private void g() {
        t();
        d(false);
        eww.d();
        MediaPlayer mediaPlayer = this.w;
        if (mediaPlayer == null) {
            return;
        }
        try {
            if (mediaPlayer.isPlaying()) {
                this.f.abandonAudioFocus(this.i);
                this.w.pause();
            }
        } catch (IllegalStateException unused) {
            LogUtil.e("DailyMomentMediaPlayer", "media player is not prepared or has been released");
        }
    }

    private void f() {
        LogUtil.a("DailyMomentMediaPlayer", "resetVolume");
        MediaPlayer mediaPlayer = this.w;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(1.0f, 1.0f);
            this.v = false;
        }
    }
}
