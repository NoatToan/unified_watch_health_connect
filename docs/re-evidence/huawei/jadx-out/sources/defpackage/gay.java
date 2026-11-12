package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.marketing.views.audition.AuditionPlayerListener;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class gay {
    private static volatile gay d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AudioAttributes f34841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AuditionPlayerListener f34843c;
    private AudioManager e;
    private AudioFocusRequest g;
    private boolean i;
    private int j;
    private List<String> m;
    private MediaPlayer o;
    private final AudioManager.OnAudioFocusChangeListener h = new c();
    private Context f = BaseApplication.b();

    private gay() {
        i();
    }

    public static gay a() {
        if (d == null) {
            synchronized (gay.class) {
                if (d == null) {
                    d = new gay();
                }
            }
        }
        return d;
    }

    public void b(AuditionPlayerListener auditionPlayerListener) {
        this.f34843c = auditionPlayerListener;
    }

    public int b() {
        MediaPlayer mediaPlayer = this.o;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getCurrentPosition();
    }

    public void d(int i) {
        if (this.o == null) {
            return;
        }
        LogUtil.a("SleepAuditionHelper", "seekTo progress == ", Integer.valueOf(i));
        this.o.seekTo(i);
    }

    public boolean e() {
        MediaPlayer mediaPlayer = this.o;
        if (mediaPlayer == null) {
            return false;
        }
        return mediaPlayer.isPlaying();
    }

    public void c(String str, List<String> list) {
        this.f34842b = str;
        this.m = list;
        LogUtil.a("SleepAuditionHelper", "resetPlayUrlListAndId mAuditionId == ", str);
        e(0);
        k();
    }

    public String c() {
        return this.f34842b;
    }

    public void h() {
        LogUtil.a("SleepAuditionHelper", "stopAudio()");
        MediaPlayer mediaPlayer = this.o;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.o.pause();
            this.o.stop();
        }
        g();
        this.f34842b = "";
    }

    public void d() {
        if (this.o.isPlaying()) {
            this.o.pause();
            AuditionPlayerListener auditionPlayerListener = this.f34843c;
            if (auditionPlayerListener != null) {
                auditionPlayerListener.onPlayerPause();
                return;
            }
            return;
        }
        this.o.start();
        k();
        AuditionPlayerListener auditionPlayerListener2 = this.f34843c;
        if (auditionPlayerListener2 != null) {
            auditionPlayerListener2.onPlayerStart();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.o.isPlaying()) {
            this.o.pause();
            AuditionPlayerListener auditionPlayerListener = this.f34843c;
            if (auditionPlayerListener != null) {
                auditionPlayerListener.onPlayerPause();
            }
        }
    }

    private void e(int i) {
        if (i < 0) {
            this.j = this.m.size() - 1;
        } else if (i > this.m.size() - 1) {
            this.f34842b = "";
            return;
        }
        if (this.o == null) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.o = mediaPlayer;
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: gax
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    this.f34840c.c(mediaPlayer2);
                }
            });
            this.o.setAudioStreamType(3);
        }
        if (this.o.isPlaying()) {
            this.o.pause();
            this.o.stop();
        }
        try {
            this.o.reset();
            this.o.setDataSource(this.m.get(this.j));
            this.o.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: gaw
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    this.e.b(mediaPlayer2);
                }
            });
            this.o.prepare();
        } catch (IOException | IllegalStateException e) {
            LogUtil.e("SleepAuditionHelper", "changeMusic err = ", ExceptionUtils.c(e));
            qpx.e(this.f, "play error");
        }
    }

    /* synthetic */ void c(MediaPlayer mediaPlayer) {
        LogUtil.a("SleepAuditionHelper", "onCompletion");
        if (this.j >= this.m.size() - 1) {
            this.f34842b = "";
            AuditionPlayerListener auditionPlayerListener = this.f34843c;
            if (auditionPlayerListener != null) {
                auditionPlayerListener.onCompletion(mediaPlayer);
            } else {
                ObserverManagerUtil.e("MARKETING_AUDITION_BTN_REFRESH", Integer.valueOf(R.drawable.ic_player_playback));
                ObserverManagerUtil.a("MARKETING_AUDITION_BTN_REFRESH");
                LogUtil.a("SleepAuditionHelper", "all completed, unregisterObserver");
            }
            LogUtil.a("SleepAuditionHelper", "all completed");
            return;
        }
        int i = this.j + 1;
        this.j = i;
        e(i);
    }

    /* synthetic */ void b(MediaPlayer mediaPlayer) {
        AuditionPlayerListener auditionPlayerListener = this.f34843c;
        if (auditionPlayerListener != null) {
            auditionPlayerListener.onPrepared(mediaPlayer);
        }
        this.o.start();
    }

    private void i() {
        Object systemService = this.f.getSystemService("audio");
        if (!(systemService instanceof AudioManager)) {
            LogUtil.a("SleepAuditionHelper", "playSound object invalid type");
        } else {
            this.e = (AudioManager) systemService;
        }
    }

    private boolean k() {
        if (this.i) {
            return true;
        }
        if (this.e == null) {
            LogUtil.e("SleepAuditionHelper", "AudioManager is null, request system service failed...");
            return false;
        }
        if (this.g == null && this.f34841a == null) {
            this.f34841a = j();
            this.g = new AudioFocusRequest.Builder(1).setAudioAttributes(this.f34841a).setWillPauseWhenDucked(true).setOnAudioFocusChangeListener(this.h).build();
        }
        int iRequestAudioFocus = this.e.requestAudioFocus(this.g);
        boolean z = iRequestAudioFocus == 1;
        if (z) {
            LogUtil.a("SleepAuditionHelper", "request audio focus success");
            return z;
        }
        ReleaseLogUtil.d("SleepAuditionHelper", "request audio focus failed, result: " + iRequestAudioFocus);
        return z;
    }

    private AudioAttributes j() {
        return new AudioAttributes.Builder().setUsage(1).setContentType(2).build();
    }

    private void g() {
        LogUtil.a("SleepAuditionHelper", "abandonAudioFocus");
        AudioFocusRequest audioFocusRequest = this.g;
        if (audioFocusRequest != null) {
            this.e.abandonAudioFocusRequest(audioFocusRequest);
        } else {
            LogUtil.a("SleepAuditionHelper", "abandonAudioFocus has released before");
        }
    }

    class c implements AudioManager.OnAudioFocusChangeListener {
        private c() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            ReleaseLogUtil.c("SleepAuditionHelper", "audio focus changed, status: " + i);
            if (i == -2) {
                gay.this.i = false;
                gay.this.f();
            } else if (i != -1) {
                if (i != 1) {
                    return;
                }
                gay.this.i = true;
            } else {
                gay.this.i = false;
                if (gay.this.o.isPlaying()) {
                    ObserverManagerUtil.e("MARKETING_AUDITION_BTN_REFRESH", Integer.valueOf(R.drawable.ic_player_playback));
                    gay.this.d();
                }
            }
        }
    }
}
