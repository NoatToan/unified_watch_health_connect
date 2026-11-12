package com.huawei.openalliance.ad;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.media3.common.C;
import com.huawei.openalliance.ad.activity.PPSActivity;
import com.huawei.openalliance.ad.linked.view.LinkedNativeViewControlPanel;
import com.huawei.openalliance.ad.linked.view.LinkedWifiAlertPlayButton;
import com.huawei.openalliance.ad.media.MediaPlayerAgent;
import com.huawei.openalliance.ad.media.MediaState;
import com.huawei.openalliance.ad.media.listener.MediaBufferListener;
import com.huawei.openalliance.ad.media.listener.MediaErrorListener;
import com.huawei.openalliance.ad.media.listener.MediaStateListener;
import com.huawei.openalliance.ad.views.BaseVideoView;
import com.huawei.openalliance.ad.views.NetworkChangeListener;
import com.huawei.openalliance.ad.views.VideoView;
import com.huawei.operation.utils.Constants;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class hk implements MediaBufferListener, MediaErrorListener, MediaStateListener, BaseVideoView.SurfaceListener, NetworkChangeListener {
    private int B;
    private View.OnClickListener H;
    private a I;
    private PPSActivity.b N;
    private hd P;
    private boolean T;
    private VideoView d;
    private SeekBar e;
    private LinkedNativeViewControlPanel f;
    private ImageView g;
    private ImageView h;
    private ImageView i;
    private ImageView j;
    private TextView k;
    private TextView l;
    private Context m;
    private int n;
    private View o;
    private ImageView p;
    private View q;
    private LinkedWifiAlertPlayButton r;
    private hf s;
    private boolean t;
    private int v;
    private boolean w;
    private int x;
    private int z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18881a = "hPlT" + hashCode();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f18882b = "hBPlT" + hashCode();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f18883c = "aPT" + hashCode();
    private boolean u = true;
    private boolean y = true;
    private int A = 0;
    private int C = 0;
    private String D = "n";
    private boolean E = false;
    private boolean F = false;
    private final Runnable G = new Runnable() { // from class: com.huawei.openalliance.ad.hk.1
        @Override // java.lang.Runnable
        public void run() {
            if (hk.this.d == null || !hk.this.t) {
                return;
            }
            hk hkVar = hk.this;
            hkVar.g(hkVar.s.a(2, hk.this.y));
        }
    };
    private hj J = new hj();
    private final Runnable K = new Runnable() { // from class: com.huawei.openalliance.ad.hk.4
        @Override // java.lang.Runnable
        public void run() {
            hk.this.u();
        }
    };
    private final Runnable L = new Runnable() { // from class: com.huawei.openalliance.ad.hk.5
        @Override // java.lang.Runnable
        public void run() {
            hk.this.l();
        }
    };
    private final View.OnClickListener M = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.hk.6
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            hk.this.k(!view.isSelected());
        }
    };
    private boolean O = false;
    private final View.OnClickListener Q = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.hk.7
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            hk hkVar = hk.this;
            hkVar.O = !hkVar.O;
            if (hk.this.N != null) {
                hk.this.N.a(hk.this.O);
            }
        }
    };
    private final View.OnClickListener R = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.hk.8
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (hk.this.J != null && hk.this.J.e()) {
                hk.this.J.d();
            }
            hk.this.c();
            hk.this.m();
            hk.this.v();
            int i = hk.this.n;
            if (i == 0) {
                hk.this.I.b();
            } else if (i != 1) {
                hk.this.I.d();
            } else {
                hk.this.I.c();
            }
            hk.this.D();
        }
    };
    private SeekBar.OnSeekBarChangeListener S = new SeekBar.OnSeekBarChangeListener() { // from class: com.huawei.openalliance.ad.hk.3
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            hk.this.T = false;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            hk.this.T = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                hw.a("LinkedVideoControlBridge", "onProgressChanged %d", Integer.valueOf(i));
                hk.this.d.seekTo(i);
            }
        }
    };

    public interface a {
        void a();

        void a(boolean z);

        void b();

        void c();

        void d();
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
    public void onBufferUpdate(int i) {
    }

    public void x() {
        t();
        m();
    }

    public void w() {
        hw.a("LinkedVideoControlBridge", "hideAllControlPanelDirectly");
        u();
        com.huawei.openalliance.ad.utils.dq.a(this.f18882b);
        l();
    }

    public void v() {
        com.huawei.openalliance.ad.utils.dq.a(this.f18882b);
        com.huawei.openalliance.ad.utils.dq.a(this.L, this.f18882b, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    public void u() {
        hw.a("LinkedVideoControlBridge", "hidePlayButton");
        a(this.g);
    }

    public void t() {
        hw.a("LinkedVideoControlBridge", "showPlayButton");
        View view = this.q;
        if (view != null && view.getVisibility() == 0) {
            u();
            return;
        }
        View view2 = this.o;
        if (view2 != null && view2.getVisibility() == 0) {
            u();
        } else if (this.J.e()) {
            u();
        } else {
            b(this.g);
        }
    }

    public void s() {
        a(this.h);
    }

    public void r() {
        b(this.h);
    }

    public void q() {
        b(this.j);
    }

    public void p() {
        a(this.j);
    }

    @Override // com.huawei.openalliance.ad.views.BaseVideoView.SurfaceListener
    public void onSurfaceDestroyed() {
        z();
        l(false);
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
    public void onProgress(int i, int i2) {
        SeekBar seekBar;
        if (!this.T && (seekBar = this.e) != null && i2 > 0) {
            seekBar.setProgress(i);
            a(this.k, i2);
        }
        if (i2 > 0) {
            this.x = i;
            this.C += 200;
            a(i2, this.D, false);
        }
    }

    @Override // com.huawei.openalliance.ad.views.NetworkChangeListener
    public void onNetworkDisconnected() {
        hj hjVar;
        hf hfVar;
        if (this.d == null || this.E || (hjVar = this.J) == null || hjVar.e() || (hfVar = this.s) == null) {
            return;
        }
        g(hfVar.a());
    }

    @Override // com.huawei.openalliance.ad.views.NetworkChangeListener
    public void onNetworkConnectedOrChanged(boolean z) {
        hj hjVar;
        if (this.s == null || this.d == null || this.E || (hjVar = this.J) == null || hjVar.e()) {
            return;
        }
        g(this.s.a(z, this.y));
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
    public void onMediaStop(MediaPlayerAgent mediaPlayerAgent, int i) {
        hw.a("LinkedVideoControlBridge", "onMediaStop playtime is %d", Integer.valueOf(i));
        a(i, false, false);
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
    public void onMediaStart(MediaPlayerAgent mediaPlayerAgent, int i) {
        if (this.g != null && this.f != null && LinkedNativeViewControlPanel.b() != 0) {
            this.g.setImageResource(LinkedNativeViewControlPanel.b());
        }
        this.E = false;
        u();
        f();
        e(1);
        if (this.u) {
            u();
        } else {
            G();
        }
        l(true);
        m();
        v();
        a(i, this.D, true);
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
    public void onMediaPause(MediaPlayerAgent mediaPlayerAgent, int i) {
        a(i, true, false);
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
    public void onMediaCompletion(MediaPlayerAgent mediaPlayerAgent, int i) {
        hw.a("LinkedVideoControlBridge", "onMediaCompletion");
        this.E = true;
        a(i, false, true);
        if (this.J.b() && this.J.c()) {
            b();
            this.J.a();
            e(2);
            m();
        } else {
            c();
            e(2);
        }
        a(i, this.D, true);
        this.x = 0;
        i(false);
        hf hfVar = this.s;
        if (hfVar != null) {
            hfVar.b();
        }
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaErrorListener
    public void onError(MediaPlayerAgent mediaPlayerAgent, int i, int i2, int i3) {
        a(i, false, false);
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
    public void onBufferingStart() {
        View view = this.o;
        if (view == null || view.getVisibility() == 0) {
            return;
        }
        this.o.setVisibility(0);
        u();
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
    public void onBufferingEnd() {
        View view = this.o;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        this.o.setVisibility(8);
    }

    public void o() {
        b(this.e);
        b(this.k);
        b(this.l);
    }

    public void n() {
        hw.a("LinkedVideoControlBridge", "showProgressControlPanel: ");
        a(this.e);
        a(this.k);
        a(this.l);
    }

    public void m() {
        View view = this.q;
        if (view != null && view.getVisibility() == 0) {
            l();
            return;
        }
        if (this.n != 2) {
            o();
        }
        q();
        r();
    }

    public void l() {
        n();
        p();
        s();
        u();
    }

    public void k() {
        this.w = false;
        VideoView videoView = this.d;
        if (videoView != null) {
            videoView.resumeView();
        }
    }

    public void j() {
        this.w = true;
        VideoView videoView = this.d;
        if (videoView != null) {
            videoView.pauseView();
        }
    }

    public void i(boolean z) {
        SeekBar seekBar = this.e;
        if (seekBar != null) {
            if (z && seekBar.getVisibility() != 0) {
                o();
            } else {
                if (z || this.e.getVisibility() == 8) {
                    return;
                }
                n();
            }
        }
    }

    public void i() {
        VideoView videoView = this.d;
        if (videoView != null) {
            videoView.pause();
        }
    }

    public void h(boolean z) {
        this.y = z;
    }

    public void h() {
        if (this.J.e()) {
            this.J.a();
            return;
        }
        if (this.n == 1) {
            e(0);
        }
        this.f.setNonWifiAlertMsg(R.string.hiad_network_disconnect_to_try);
        this.r.setText(R.string.hiad_click_to_try_again);
        w();
        b(this.q);
    }

    public void g(boolean z) {
        if (z) {
            a((String) null);
            a(0);
            c(0);
            a((Bitmap) null);
        }
        z();
        t();
    }

    public void g() {
        a(this.q);
    }

    public void f(boolean z) {
        if (hw.a()) {
            hw.a("LinkedVideoControlBridge", "setPlayBtn: %s", Boolean.valueOf(z));
        }
        if (this.g == null) {
            return;
        }
        hw.a("LinkedVideoControlBridge", "isDetailViewVisible %s", Boolean.valueOf(this.J.e()));
        if (this.J.e()) {
            u();
        } else {
            this.g.setEnabled(z);
        }
    }

    public void f() {
        VideoView videoView;
        com.huawei.openalliance.ad.utils.dw.a(this.p, 8, 300, 300);
        if (this.p == null || (videoView = this.d) == null) {
            return;
        }
        videoView.setAlpha(1.0f);
    }

    public void e(boolean z) {
        hw.b("LinkedVideoControlBridge", "setMuteBtn: " + z);
        ImageView imageViewF = this.f.f();
        if (imageViewF != null) {
            imageViewF.setImageResource(com.huawei.openalliance.ad.utils.dk.a(true, z));
            imageViewF.setSelected(!z);
            com.huawei.openalliance.ad.utils.dk.a(imageViewF);
        }
    }

    public void e(int i) {
        hw.a("LinkedVideoControlBridge", "updateButtonState: %d", Integer.valueOf(i));
        this.n = i;
        ImageView imageView = this.j;
        if (imageView == null) {
            return;
        }
        if (i == 0) {
            imageView.setImageResource(LinkedNativeViewControlPanel.a());
            com.huawei.openalliance.ad.utils.dk.a(this.j);
        } else if (i == 1) {
            imageView.setImageResource(LinkedNativeViewControlPanel.b());
        } else {
            if (i != 2) {
                return;
            }
            imageView.setImageResource(LinkedNativeViewControlPanel.c());
            com.huawei.openalliance.ad.utils.dk.a(this.j);
        }
    }

    public void e() {
        VideoView videoView = this.d;
        if (videoView != null) {
            videoView.stop();
        }
        g();
        t();
        z();
    }

    public void d(boolean z) {
        String str;
        hw.b("LinkedVideoControlBridge", "toggleMute: " + z);
        if (this.d == null || this.f == null) {
            return;
        }
        e(z);
        if (z) {
            this.d.mute();
            str = "n";
        } else {
            this.d.unmute();
            str = "y";
        }
        this.D = str;
    }

    public void d(int i) {
        this.B = i;
    }

    public void d() {
        com.huawei.openalliance.ad.utils.dq.a(this.f18883c);
    }

    public void c(boolean z) {
        hw.a("LinkedVideoControlBridge", "setCanAutoPlay %s", Boolean.valueOf(z));
        this.t = z;
    }

    public void c(int i) {
        this.z = i;
        VideoView videoView = this.d;
        if (videoView != null) {
            videoView.setDefaultDuration(i);
            a(this.l, i);
        }
    }

    public void c() {
        View view = this.q;
        if (view == null || view.getVisibility() != 0) {
            t();
        }
        u();
        if (this.e != null) {
            i(true);
        }
    }

    public void b(boolean z) {
        if (this.d != null) {
            j(z);
            if (this.n == 2 || this.x == 0) {
                this.v = 0;
                this.x = 0;
                SeekBar seekBar = this.e;
                if (seekBar != null) {
                    seekBar.setProgress(0);
                    this.d.seekTo(this.x);
                }
            }
            this.J.d();
            this.d.setPreferStartPlayTime(this.v);
            this.d.play(z);
        }
    }

    public void b(View view) {
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public void b(int i) {
        this.A = i;
    }

    public void b() {
        l(false);
        u();
    }

    public void a(boolean z) {
        this.F = z;
    }

    public void a(String str) {
        VideoView videoView;
        if (this.f == null || (videoView = this.d) == null) {
            return;
        }
        videoView.setVideoFileUrl(str);
    }

    public void a(a aVar) {
        this.I = aVar;
    }

    public void a(hj hjVar) {
        this.J = hjVar;
    }

    public void a(hf hfVar) {
        this.s = hfVar;
    }

    public void a(hd hdVar) {
        this.P = hdVar;
    }

    public void a(PPSActivity.b bVar) {
        this.N = bVar;
    }

    public void a(TextView textView, int i) {
        if (textView == null) {
            return;
        }
        int i2 = i / 1000;
        textView.setText(String.format(Locale.ENGLISH, "%02d:%02d", Integer.valueOf((i2 % 3600) / 60), Integer.valueOf(i2 % 60)));
    }

    public void a(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void a(View.OnClickListener onClickListener) {
        this.H = onClickListener;
    }

    public void a(Drawable drawable) {
        ImageView imageView = this.p;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public void a(Bitmap bitmap) {
        ImageView imageView = this.p;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void a(long j) {
        VideoView videoView;
        hw.b("LinkedVideoControlBridge", "autoPlay - delayMs: %d", Long.valueOf(j));
        com.huawei.openalliance.ad.utils.dq.a(this.f18883c);
        hw.a("LinkedVideoControlBridge", "canAutoPlay: %s, videoView: %s", Boolean.valueOf(this.t), this.d == null ? Constants.NULL : "not null");
        if (!this.t || (videoView = this.d) == null) {
            return;
        }
        if (!videoView.isPlaying()) {
            hw.a("LinkedVideoControlBridge", "autoPlay - start delay runnable");
            com.huawei.openalliance.ad.utils.dq.a(this.G, this.f18883c, j);
            return;
        }
        hw.a("LinkedVideoControlBridge", "autoPlay - video is playing");
        hf hfVar = this.s;
        if (hfVar != null) {
            g(hfVar.a(2, this.y));
        }
    }

    public void a(int i) {
        hw.a("LinkedVideoControlBridge", "setPreferStartPlayTime %d", Integer.valueOf(i));
        this.v = i;
        f(i);
        VideoView videoView = this.d;
        if (videoView != null) {
            videoView.setPreferStartPlayTime(i);
        }
    }

    public void a() {
        hw.a("LinkedVideoControlBridge", "setForImageOnly");
        a((VideoView) null);
        i(false);
        u();
        l(false);
    }

    private void z() {
        if (this.p == null) {
            return;
        }
        hw.a("LinkedVideoControlBridge", "showPreviewView");
        Animation animation = this.p.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        com.huawei.openalliance.ad.utils.dw.a((View) this.p, true);
        VideoView videoView = this.d;
        if (videoView != null) {
            videoView.setAlpha(0.0f);
        }
    }

    private void y() {
        if (this.f == null) {
            return;
        }
        w();
        this.o = this.f.l();
        View viewN = this.f.n();
        this.q = viewN;
        if (viewN != null) {
            viewN.setClickable(true);
        }
        ImageView imageViewM = this.f.m();
        this.p = imageViewM;
        if (imageViewM != null) {
            imageViewM.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.hk.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    hk.this.E();
                }
            });
        }
        VideoView videoView = this.d;
        if (videoView != null) {
            videoView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.hk.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    hk.this.F();
                }
            });
        }
        e(this.f);
        c(this.f);
        C();
        d(this.f);
        B();
        A();
        b(this.f);
        g();
        l(false);
        t();
    }

    private void m(boolean z) {
        VideoView videoView = this.d;
        if (videoView == null) {
            return;
        }
        MediaState currentState = videoView.getCurrentState();
        hw.a("LinkedVideoControlBridge", "currentState %s", currentState.toString());
        if (currentState.isState(MediaState.State.PLAYING)) {
            this.d.pause();
        } else if (currentState.isState(MediaState.State.PREPARING)) {
            this.d.stop();
            z();
        }
        g();
    }

    private void l(boolean z) {
        this.u = !z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(boolean z) {
        String str;
        hw.b("LinkedVideoControlBridge", "switchSound: " + z);
        VideoView videoView = this.d;
        if (videoView == null || this.P == null) {
            return;
        }
        if (z) {
            videoView.unmute();
            str = "y";
        } else {
            videoView.mute();
            str = "n";
        }
        this.D = str;
        this.P.a(!z);
        b(this.D);
        com.huawei.openalliance.ad.utils.dq.a(this.f18881a);
        if (this.d.isPlaying()) {
            G();
        }
    }

    private void j(boolean z) {
        a aVar = this.I;
        if (aVar != null) {
            aVar.a(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i) {
        hw.b("LinkedVideoControlBridge", "strategyMode is %d", Integer.valueOf(i));
        if (i == 1) {
            I();
            return;
        }
        if (i == 101) {
            a(false, true);
            return;
        }
        if (i == 102) {
            a(true, false);
        } else if (i == 201) {
            m(true);
        } else {
            if (i != 202) {
                return;
            }
            m(false);
        }
    }

    private void f(int i) {
        int i2 = this.z;
        if (i2 != 0) {
            int i3 = (i * 100) / i2;
            this.x = i3;
            hw.a("LinkedVideoControlBridge", " currentProgress is %d", Integer.valueOf(i3));
        } else {
            int i4 = this.A;
            if (i4 != 0) {
                hw.a("LinkedVideoControlBridge", "calculateCurrentProgress defaultVideoDuration %d", Integer.valueOf(i4));
                int i5 = (i * 100) / this.A;
                this.x = i5;
                hw.a("LinkedVideoControlBridge", " currentProgress is %d", Integer.valueOf(i5));
            }
        }
        if (this.x >= 100) {
            hw.b("LinkedVideoControlBridge", "progress bigger than 100, play from start.");
            this.x = 0;
        }
    }

    private void e(LinkedNativeViewControlPanel linkedNativeViewControlPanel) {
        ImageView imageViewE = linkedNativeViewControlPanel.e();
        this.g = imageViewE;
        if (imageViewE != null) {
            imageViewE.setClickable(true);
            this.g.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.hk.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    hw.a("LinkedVideoControlBridge", "onClick, currentState %s", hk.this.d.getCurrentState().toString());
                    if (hk.this.I != null) {
                        if (hk.this.d.isPlaying()) {
                            hk.this.I.c();
                        } else {
                            hk.this.I.b();
                        }
                    }
                    hk.this.D();
                }
            });
            if (LinkedNativeViewControlPanel.a() > 0) {
                this.g.setImageResource(LinkedNativeViewControlPanel.a());
                com.huawei.openalliance.ad.utils.dk.a(this.g);
            }
            t();
        }
    }

    private void d(LinkedNativeViewControlPanel linkedNativeViewControlPanel) {
        SeekBar seekBarH = linkedNativeViewControlPanel.h();
        this.e = seekBarH;
        if (seekBarH != null) {
            o();
            this.e.setOnSeekBarChangeListener(this.S);
        }
        this.k = linkedNativeViewControlPanel.j();
        this.l = linkedNativeViewControlPanel.k();
    }

    private void c(LinkedNativeViewControlPanel linkedNativeViewControlPanel) {
        ImageView imageViewF = linkedNativeViewControlPanel.f();
        this.h = imageViewF;
        if (imageViewF != null) {
            r();
            this.h.setOnClickListener(this.M);
        }
    }

    private void b(String str) {
        hh.a(str);
    }

    private void b(LinkedNativeViewControlPanel linkedNativeViewControlPanel) {
        LinkedWifiAlertPlayButton linkedWifiAlertPlayButtonO = linkedNativeViewControlPanel.o();
        this.r = linkedWifiAlertPlayButtonO;
        if (linkedWifiAlertPlayButtonO != null) {
            linkedWifiAlertPlayButtonO.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.hk.11
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    CharSequence text = hk.this.r.getText();
                    String string = hk.this.m != null ? hk.this.m.getResources().getString(R.string.hiad_continue_to_play) : null;
                    if (string != null && string.equals(text)) {
                        hk.this.y = false;
                        if (hk.this.I != null) {
                            hk.this.I.a();
                        }
                    }
                    if (hk.this.s != null) {
                        hk hkVar = hk.this;
                        hkVar.g(hkVar.s.a(1, hk.this.y));
                    }
                }
            });
        }
    }

    private void a(boolean z, boolean z2) {
        VideoView videoView = this.d;
        if (videoView == null || videoView.isPlaying()) {
            return;
        }
        g();
        MediaState currentState = this.d.getCurrentState();
        hw.a("LinkedVideoControlBridge", "currentState %s", currentState.toString());
        if (z2 || !currentState.isState(MediaState.State.PLAYBACK_COMPLETED)) {
            if (!currentState.a()) {
                z();
            }
            if (!z) {
                com.huawei.openalliance.ad.utils.dq.a(this.f18883c);
            }
            hw.a("LinkedVideoControlBridge", "playVideo, viewPaused is %s", Boolean.valueOf(this.w));
            if ((this.t || z2) && !this.w) {
                b(z);
                e(1);
            } else if (this.d.isPlaying()) {
                return;
            } else {
                t();
            }
            m();
            v();
        }
    }

    private void a(VideoView videoView) {
        this.d = videoView;
    }

    private void a(LinkedNativeViewControlPanel linkedNativeViewControlPanel) {
        this.f = linkedNativeViewControlPanel;
        y();
    }

    private void a(int i, boolean z, boolean z2) {
        if (z2 || this.J.e()) {
            e(2);
        } else {
            e(0);
        }
        f(i);
        d();
        if (z2) {
            i = 0;
        }
        this.v = i;
        com.huawei.openalliance.ad.utils.dq.a(this.f18881a);
        if (this.g != null && LinkedNativeViewControlPanel.a() != 0) {
            this.g.setImageResource(LinkedNativeViewControlPanel.a());
            com.huawei.openalliance.ad.utils.dk.a(this.g);
        }
        if (!z) {
            z();
            l(false);
        }
        if (!z2) {
            t();
        }
        m();
    }

    private void a(int i, String str, boolean z) {
        int i2 = this.C;
        if (i2 >= 1000 || i2 == 0 || z) {
            hw.b("LinkedVideoControlBridge", "set progress from linked view, progress: %s, soundSwitch: %s ", Integer.valueOf(i), str);
            hg hgVar = new hg();
            hgVar.b(true);
            hgVar.a(i);
            hgVar.a(str);
            hh.a(hgVar);
            this.C = 0;
            if (this.F) {
                a(i, str);
            }
        }
    }

    private void a(int i, String str) {
        hw.b("LinkedVideoControlBridge", "sendLinkedAdChangeBroadcast");
        Intent intent = new Intent("com.huawei.hms.pps.action.LANDING_AD_STATUS_CHANGED");
        intent.putExtra("linked_ad_play_progress", i);
        intent.putExtra("linked_ad_sound_switch", str);
        intent.setPackage(this.m.getPackageName());
        this.m.sendBroadcast(intent);
    }

    private void I() {
        H();
    }

    private void H() {
        VideoView videoView = this.d;
        if (videoView == null) {
            return;
        }
        if (videoView.getCurrentState().a()) {
            this.d.pause();
        }
        g();
        h();
    }

    private void G() {
        com.huawei.openalliance.ad.utils.dq.a(this.f18881a);
        com.huawei.openalliance.ad.utils.dq.a(this.K, this.f18881a, 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        VideoView videoView = this.d;
        if (videoView != null) {
            this.H.onClick(videoView);
            x();
            v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        View.OnClickListener onClickListener = this.H;
        if (onClickListener != null) {
            onClickListener.onClick(this.p);
        }
        x();
        v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        if (this.d == null) {
            return;
        }
        i(true);
        com.huawei.openalliance.ad.utils.dq.a(this.f18883c);
        if (!this.d.isPlaying()) {
            a(false, true);
            return;
        }
        com.huawei.openalliance.ad.utils.dq.a(this.f18881a);
        this.d.pause();
        e(0);
    }

    private void C() {
        LinkedNativeViewControlPanel linkedNativeViewControlPanel = this.f;
        if (linkedNativeViewControlPanel == null) {
            return;
        }
        ImageView imageViewG = linkedNativeViewControlPanel.g();
        this.i = imageViewG;
        if (imageViewG != null) {
            imageViewG.setOnClickListener(this.Q);
        }
    }

    private void B() {
        ImageView imageViewI = this.f.i();
        this.j = imageViewI;
        if (imageViewI != null) {
            imageViewI.setOnClickListener(this.R);
        }
    }

    private void A() {
        VideoView videoView = this.d;
        if (videoView != null) {
            videoView.addMediaStateListener(this);
            this.d.addMediaBufferListener(this);
            this.d.addMediaErrorListener(this);
            this.d.addNetworkChangeListener(this);
            this.d.setSurfaceListener(this);
        }
    }

    public hk(Context context, VideoView videoView, LinkedNativeViewControlPanel linkedNativeViewControlPanel) {
        this.m = context;
        a(videoView);
        a(linkedNativeViewControlPanel);
    }
}
