package com.huawei.health.suggestion.ui.healthcourse.fragment;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.VideoSize;
import androidx.media3.ui.PlayerView;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.fitness.helper.PlayerHelper;
import com.huawei.health.suggestion.ui.fitness.helper.inter.PlayerStrategy;
import com.huawei.health.suggestion.ui.healthcourse.activity.ShortVideoActivity;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.course.BaseVideoInfo;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.imageview.HealthImageView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes31.dex */
public class BaseVideoFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthImageView f9562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AudioAttributes f9563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PlayerCallback f9564c;
    private AudioManager.OnAudioFocusChangeListener d;
    private AudioManager e;
    private boolean f;
    private AudioFocusRequest h;
    private boolean i;
    private LinearLayout k;
    private HealthProgressBar m;
    private HealthImageView n;
    private boolean o;
    private String p;
    private Runnable q;
    private SeekBar r;
    private PlayerStrategy s;
    private PlayerView t;
    private Handler j = new Handler(Looper.getMainLooper());
    private boolean g = true;
    private long l = 0;

    public interface PlayerCallback {
        void onVideoDurationChanged(long j);
    }

    public void d() {
    }

    public static BaseVideoFragment a(BaseVideoInfo baseVideoInfo) {
        BaseVideoFragment baseVideoFragment = new BaseVideoFragment();
        Bundle bundle = new Bundle();
        bundle.putString("videoUrl", baseVideoInfo.getUrl());
        baseVideoFragment.setArguments(bundle);
        return baseVideoFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            String string = getArguments().getString("videoUrl");
            this.p = string;
            LogUtil.a("Suggestion_BaseVideoFragment", "mVideoUrl is：", string);
        }
        Object systemService = BaseApplication.getContext().getSystemService("audio");
        this.e = systemService instanceof AudioManager ? (AudioManager) systemService : null;
        this.d = new e(this);
    }

    private void a(View view) {
        HealthProgressBar healthProgressBar = (HealthProgressBar) view.findViewById(R.id.loading_progress);
        this.m = healthProgressBar;
        healthProgressBar.setVisibility(0);
        this.r = (SeekBar) view.findViewById(R.id.seekBar);
        n();
        d(CommonUtil.ab(BaseApplication.getContext()));
    }

    private void n() {
        q();
        this.r.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.huawei.health.suggestion.ui.healthcourse.fragment.BaseVideoFragment.5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f9568a;

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                this.f9568a = i;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                BaseVideoFragment.this.t();
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (BaseVideoFragment.this.s != null) {
                    LogUtil.a("Suggestion_BaseVideoFragment", "onStopTrackingTouch, progress:", Integer.valueOf(this.f9568a));
                    BaseVideoFragment.this.j();
                    BaseVideoFragment.this.s.seekTo(this.f9568a);
                    BaseVideoFragment.this.m();
                }
                BaseVideoFragment.this.q();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        this.j.removeCallbacks(this.q);
        Runnable runnable = new Runnable() { // from class: com.huawei.health.suggestion.ui.healthcourse.fragment.BaseVideoFragment.1
            @Override // java.lang.Runnable
            public void run() {
                if (BaseVideoFragment.this.s != null && BaseVideoFragment.this.s.isPlaying()) {
                    long currentPosition = BaseVideoFragment.this.s.getCurrentPosition();
                    BaseVideoFragment.this.r.setProgress((int) currentPosition);
                    if (BaseVideoFragment.this.f9564c != null) {
                        BaseVideoFragment.this.f9564c.onVideoDurationChanged(currentPosition);
                    }
                }
                BaseVideoFragment.this.j.postDelayed(this, 100L);
            }
        };
        this.q = runnable;
        this.j.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        this.j.removeCallbacks(this.q);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LogUtil.a("Suggestion_BaseVideoFragment", "onViewCreated");
        PlayerView playerView = (PlayerView) view.findViewById(R.id.player_view);
        this.t = playerView;
        playerView.setResizeMode(2);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.layout_not_network);
        this.k = linearLayout;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.healthcourse.fragment.BaseVideoFragment.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                BaseVideoFragment.this.e();
            }
        });
        HealthImageView healthImageView = (HealthImageView) view.findViewById(R.id.back);
        this.f9562a = healthImageView;
        healthImageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.healthcourse.fragment.BaseVideoFragment.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                BaseVideoFragment.this.requireActivity().onBackPressed();
            }
        });
        this.n = (HealthImageView) view.findViewById(R.id.playOrPauseButton);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.suggestion.ui.healthcourse.fragment.BaseVideoFragment.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (BaseVideoFragment.this.s == null) {
                    return;
                }
                if (BaseVideoFragment.this.s.isPlaying()) {
                    BaseVideoFragment.this.h();
                    BaseVideoFragment.this.i = true;
                } else {
                    BaseVideoFragment.this.m();
                    BaseVideoFragment.this.i = false;
                }
            }
        });
        a(view);
        if (this.s == null) {
            i();
        }
        f();
    }

    private void f() {
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.f9562a.setRotation(180.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        k();
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        j();
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        PlayerStrategy playerStrategy = this.s;
        if (playerStrategy != null) {
            playerStrategy.play();
            this.n.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        PlayerStrategy playerStrategy = this.s;
        if (playerStrategy != null) {
            playerStrategy.pause();
            this.n.setVisibility(0);
        }
    }

    private void i() {
        LogUtil.a("Suggestion_BaseVideoFragment", "enter mPlayerStrategy initExoPlayer");
        if (TextUtils.isEmpty(this.p)) {
            ReleaseLogUtil.d("Suggestion_BaseVideoFragment", "VideoUrl is empty");
            return;
        }
        if (this.s == null) {
            this.s = new PlayerHelper(3).p();
        }
        this.t.setPlayer(this.s.getExoPlayer());
        this.s.setMediaUrl(this.p);
        this.s.prepare();
        this.s.getExoPlayer().addListener(new Player.Listener() { // from class: com.huawei.health.suggestion.ui.healthcourse.fragment.BaseVideoFragment.7
            @Override // androidx.media3.common.Player.Listener
            public void onPlaybackStateChanged(int i) {
                LogUtil.a("Suggestion_BaseVideoFragment", "onPlaybackStateChanged state:", Integer.valueOf(i));
                if (i == 3) {
                    if (BaseVideoFragment.this.s != null) {
                        BaseVideoFragment.this.r.setMax(BaseVideoFragment.this.s.getDuration());
                    }
                    BaseVideoFragment.this.m.setVisibility(8);
                    BaseVideoFragment.this.o = false;
                    BaseVideoFragment.this.d(true);
                    return;
                }
                if (i == 2) {
                    BaseVideoFragment.this.m.setVisibility(0);
                    BaseVideoFragment.this.d(CommonUtil.ab(BaseApplication.getContext()));
                } else if (i == 4) {
                    if (BaseVideoFragment.this.requireActivity() instanceof ShortVideoActivity) {
                        ((ShortVideoActivity) BaseVideoFragment.this.requireActivity()).a();
                    }
                    BaseVideoFragment.this.s.seekTo(0);
                } else if (i == 1) {
                    BaseVideoFragment baseVideoFragment = BaseVideoFragment.this;
                    baseVideoFragment.l = baseVideoFragment.s.getCurrentPosition();
                    BaseVideoFragment.this.d(CommonUtil.ab(BaseApplication.getContext()));
                }
            }

            @Override // androidx.media3.common.Player.Listener
            public void onVideoSizeChanged(VideoSize videoSize) {
                super.onVideoSizeChanged(videoSize);
            }

            @Override // androidx.media3.common.Player.Listener
            public void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
                super.onTrackSelectionParametersChanged(trackSelectionParameters);
                LogUtil.a("Suggestion_BaseVideoFragment", "onTrackSelectionParametersChanged: " + trackSelectionParameters);
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlayerError(PlaybackException playbackException) {
                ReleaseLogUtil.b("Suggestion_BaseVideoFragment", "onPlayerError: " + playbackException, "errorCodeName: " + playbackException.getErrorCodeName());
                BaseVideoFragment.this.g();
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlayerErrorChanged(PlaybackException playbackException) {
                super.onPlayerErrorChanged(playbackException);
                LogUtil.e("Suggestion_BaseVideoFragment", "onPlayerErrorChanged: " + playbackException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.o) {
            return;
        }
        this.o = true;
        boolean zAb = CommonUtil.ab(BaseApplication.getContext());
        if (!zAb) {
            d(zAb);
        } else {
            b();
        }
        this.l = this.s.getCurrentPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        LogUtil.a("Suggestion_BaseVideoFragment", "setNetworkType， isNetworkConnected： ", Boolean.valueOf(z));
        if (!z) {
            this.k.setVisibility(0);
            this.t.setVisibility(8);
            this.m.setVisibility(8);
        } else {
            this.k.setVisibility(8);
            this.t.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LogUtil.a("Suggestion_BaseVideoFragment", "onStart");
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LogUtil.a("Suggestion_BaseVideoFragment", BaseDialog.LIFE_CYCLE_ON_RESUME);
        e();
        if (this.g) {
            this.g = false;
            this.s.getExoPlayer().setPlayWhenReady(true);
            ThreadPoolManager.c().execute(new Runnable() { // from class: hon
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d();
                }
            });
        } else if (!this.i || !this.f) {
            o();
            this.i = false;
        }
        this.f = false;
        k();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        LogUtil.a("Suggestion_BaseVideoFragment", BaseDialog.LIFE_CYCLE_ON_PAUSE);
        PlayerStrategy playerStrategy = this.s;
        if (playerStrategy != null) {
            playerStrategy.pause();
        }
        j();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        PlayerStrategy playerStrategy = this.s;
        if (playerStrategy != null) {
            playerStrategy.pause();
        }
        LogUtil.a("Suggestion_BaseVideoFragment", "onStop");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        LogUtil.a("Suggestion_BaseVideoFragment", "onDestroyView");
        PlayerStrategy playerStrategy = this.s;
        if (playerStrategy != null) {
            playerStrategy.release();
            PlayerView playerView = this.t;
            if (playerView != null) {
                playerView.setPlayer(null);
                this.t = null;
            }
        }
        t();
        this.j.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        PlayerStrategy playerStrategy = this.s;
        if (playerStrategy != null) {
            playerStrategy.release();
            PlayerView playerView = this.t;
            if (playerView != null) {
                playerView.setPlayer(null);
                this.t = null;
            }
        }
        t();
        this.j.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    private boolean k() {
        boolean z;
        if (this.e != null) {
            if (this.h == null && this.f9563b == null) {
                this.f9563b = new AudioAttributes.Builder().setUsage(1).setContentType(2).build();
            }
            AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(1).setAudioAttributes(this.f9563b).setWillPauseWhenDucked(true).setOnAudioFocusChangeListener(this.d).build();
            this.h = audioFocusRequestBuild;
            z = this.e.requestAudioFocus(audioFocusRequestBuild) == 1;
        }
        LogUtil.a("Suggestion_BaseVideoFragment", "requestAudioFocus isFocus=", Boolean.valueOf(z));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        AudioManager audioManager;
        AudioFocusRequest audioFocusRequest = this.h;
        if (audioFocusRequest != null && (audioManager = this.e) != null) {
            audioManager.abandonAudioFocusRequest(audioFocusRequest);
        } else {
            LogUtil.a("Suggestion_BaseVideoFragment", "abandonAudioFocus has released before");
        }
    }

    public boolean c() {
        return this.s.isPlaying();
    }

    public void a() {
        this.f = true;
    }

    public void b() {
        if (this.s.getExoPlayer() == null || this.s.getExoPlayer().getPlaybackState() != 1) {
            return;
        }
        LogUtil.a("Suggestion_BaseVideoFragment", "retryPlay currentPosition:", Long.valueOf(this.s.getCurrentPosition()));
        this.s.prepare();
        this.s.getExoPlayer().setPlayWhenReady(true);
        this.s.seekTo((int) this.l);
    }

    public void e() {
        if (!this.o) {
            LogUtil.a("Suggestion_BaseVideoFragment", "mIsStuckOrError is false");
        } else if (!CommonUtil.ab(BaseApplication.getContext())) {
            ReleaseLogUtil.d("Suggestion_BaseVideoFragment", "isNetworkConnected is false");
        } else {
            b();
        }
    }

    public void b(PlayerCallback playerCallback) {
        this.f9564c = playerCallback;
    }

    static class e implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<BaseVideoFragment> f9570b;

        public e(BaseVideoFragment baseVideoFragment) {
            this.f9570b = new WeakReference<>(baseVideoFragment);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            ReleaseLogUtil.c("Suggestion_BaseVideoFragment", "audio focus changed, status: " + i);
            BaseVideoFragment baseVideoFragment = this.f9570b.get();
            if (baseVideoFragment == null || baseVideoFragment.isDetached()) {
                LogUtil.j("Suggestion_BaseVideoFragment", "fragment is not alive ");
                return;
            }
            if (i == -2) {
                baseVideoFragment.l();
                return;
            }
            if (i == -1) {
                baseVideoFragment.l();
                baseVideoFragment.j();
            } else {
                if (i != 1) {
                    return;
                }
                baseVideoFragment.o();
            }
        }
    }
}
