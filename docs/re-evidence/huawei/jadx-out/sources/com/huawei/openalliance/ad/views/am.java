package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.Toast;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.media.MediaPlayerAgent;
import com.huawei.openalliance.ad.media.MediaState;
import com.huawei.openalliance.ad.media.listener.MediaBufferListener;
import com.huawei.openalliance.ad.media.listener.MediaErrorListener;
import com.huawei.openalliance.ad.media.listener.MediaStateListener;
import com.huawei.openalliance.ad.utils.cb;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.dw;

/* JADX INFO: loaded from: classes12.dex */
public class am implements MediaBufferListener, MediaErrorListener, MediaStateListener, BaseVideoView.SurfaceListener, NetworkChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private VideoView f21146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.huawei.openalliance.ad.views.interfaces.v f21147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f21148c;
    private ImageView d;
    private View e;
    private ImageView f;
    private View g;
    private View h;
    private View i;
    private boolean l;
    private int m;
    private boolean n;
    private View.OnClickListener o;
    private a p;
    private int q;
    private VideoInfo s;
    private String t;
    private int j = 10;
    private final String k = "autoPlayTask" + hashCode();
    private boolean r = false;
    private boolean u = true;
    private boolean v = false;
    private Runnable w = new Runnable() { // from class: com.huawei.openalliance.ad.views.am.1
        @Override // java.lang.Runnable
        public void run() {
            if (am.this.f21146a == null || !am.this.l) {
                return;
            }
            am.this.b(true);
        }
    };
    private View.OnClickListener x = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.am.5
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            am.this.v = true;
            am.this.i(!view.isSelected());
        }
    };

    public interface a {
        void a();

        void a(boolean z);

        void a(boolean z, int i);

        void b(boolean z);

        void b(boolean z, int i);

        boolean b();
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
    public void onBufferUpdate(int i) {
    }

    @Override // com.huawei.openalliance.ad.views.BaseVideoView.SurfaceListener
    public void onSurfaceDestroyed() {
        k();
        j(false);
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
    public void onProgress(int i, int i2) {
        VideoInfo videoInfo;
        if (i2 <= 0 || (videoInfo = this.s) == null) {
            return;
        }
        videoInfo.e(i2);
    }

    @Override // com.huawei.openalliance.ad.views.NetworkChangeListener
    public void onNetworkDisconnected() {
        y();
    }

    @Override // com.huawei.openalliance.ad.views.NetworkChangeListener
    public void onNetworkConnectedOrChanged(boolean z) {
        hw.a("VideoControlBridge", "onNetworkConnectedOrChanged, isWifi= %s", Boolean.valueOf(z));
        k(z);
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
    public void onMediaStop(MediaPlayerAgent mediaPlayerAgent, int i) {
        a(i, false, false);
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
    public void onMediaStart(MediaPlayerAgent mediaPlayerAgent, int i) {
        l(false);
        l();
        a(false, false);
        j(true);
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
    public void onMediaPause(MediaPlayerAgent mediaPlayerAgent, int i) {
        a(i, true, false);
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaStateListener
    public void onMediaCompletion(MediaPlayerAgent mediaPlayerAgent, int i) {
        a(i, false, true);
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaErrorListener
    public void onError(MediaPlayerAgent mediaPlayerAgent, int i, int i2, int i3) {
        a(i, false, false);
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
    public void onBufferingStart() {
        View view = this.e;
        if (view == null || view.getVisibility() == 0) {
            return;
        }
        this.e.setVisibility(0);
        ImageView imageView = this.f21148c;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    @Override // com.huawei.openalliance.ad.media.listener.MediaBufferListener
    public void onBufferingEnd() {
        View view = this.e;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        this.e.setVisibility(8);
    }

    public boolean h() {
        return this.v;
    }

    public void g(boolean z) {
        if (z) {
            a((String) null);
            a(0);
            b(0);
            a((Drawable) null);
        }
        k();
        d();
    }

    public void g() {
        VideoView videoView = this.f21146a;
        if (videoView != null) {
            videoView.pause();
        }
    }

    public void f(boolean z) {
        if (hw.a()) {
            hw.a("VideoControlBridge", "setPlayButtonEnabled: %s", Boolean.valueOf(z));
        }
        ImageView imageView = this.f21148c;
        if (imageView != null) {
            imageView.setEnabled(z);
        }
    }

    public void f() {
        this.n = false;
        VideoView videoView = this.f21146a;
        if (videoView != null) {
            videoView.resumeView();
        }
    }

    public void e(boolean z) {
        hw.b("VideoControlBridge", "setMuteButtonState mute: " + z);
        ImageView imageViewC = this.f21147b.c();
        if (imageViewC != null) {
            imageViewC.setSelected(!z);
        }
    }

    public void e() {
        this.n = true;
        VideoView videoView = this.f21146a;
        if (videoView != null) {
            videoView.pauseView();
        }
    }

    public void d(boolean z) {
        hw.b("VideoControlBridge", "toggleVideoMute mute: " + z);
        if (this.f21146a == null || this.f21147b == null) {
            return;
        }
        e(z);
        if (z) {
            this.f21146a.mute();
        } else {
            this.f21146a.unmute();
        }
    }

    public void d() {
        a(true, false);
    }

    public void c(boolean z) {
        this.l = z;
    }

    public void c(int i) {
        this.q = i;
    }

    public void c() {
        hw.b("VideoControlBridge", "autoPlayByNetworkState");
        VideoView videoView = this.f21146a;
        if (videoView == null) {
            return;
        }
        Context context = videoView.getContext();
        if (!cb.e(context)) {
            this.f21146a.pause();
            return;
        }
        if (this.r || this.q == 1 || cb.c(context)) {
            b(true);
            return;
        }
        hw.b("VideoControlBridge", "autoPlayByNetworkState - in non wifi, show alert view");
        this.f21146a.pause();
        n();
        u();
    }

    public void b(boolean z) {
        if (this.f21146a != null) {
            h(z);
            this.f21146a.setPreferStartPlayTime(this.m);
            this.f21146a.play(z);
        }
    }

    public void b(int i) {
        VideoView videoView = this.f21146a;
        if (videoView != null) {
            videoView.setDefaultDuration(i);
        }
    }

    public void b() {
        VideoView videoView = this.f21146a;
        if (videoView != null) {
            videoView.stop();
        }
        m();
        j(false);
        d();
        k();
    }

    public void a(boolean z) {
        hw.b("VideoControlBridge", "setAutoPlayOnFirstShow: %s", Boolean.valueOf(z));
        this.u = z;
    }

    public void a(String str) {
        VideoView videoView;
        if (this.f21147b == null || (videoView = this.f21146a) == null) {
            return;
        }
        this.t = str;
        videoView.setVideoFileUrl(str);
    }

    public void a(a aVar) {
        this.p = aVar;
    }

    public void a(VideoInfo videoInfo) {
        this.s = videoInfo;
    }

    public void a(View.OnClickListener onClickListener) {
        this.o = onClickListener;
    }

    public void a(Drawable drawable) {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public void a(long j) {
        hw.b("VideoControlBridge", "autoPlay - canAutoPlay: %s, autoPlayOnFirstShow: %s, delayMs: %d", Boolean.valueOf(this.l), Boolean.valueOf(this.u), Long.valueOf(j));
        dq.a(this.k);
        if (this.l && this.u) {
            if (this.f21146a.isPlaying()) {
                hw.a("VideoControlBridge", "autoPlay - video is playing");
                b(true);
                return;
            }
            hw.a("VideoControlBridge", "autoPlay - start delay runnable");
            if (!TextUtils.isEmpty(this.t) && !this.t.startsWith(Constants.LOCAL_HOST)) {
                this.f21146a.prefetch();
            }
            dq.a(this.w, this.k, j);
        }
    }

    public void a(int i) {
        this.m = i;
        if (this.f21146a != null) {
            hw.a("VideoControlBridge", "setPreferStartPlayTime %d", Integer.valueOf(i));
            this.f21146a.setPreferStartPlayTime(i);
        }
    }

    public void a() {
        dq.a(this.k);
    }

    private void y() {
        VideoView videoView = this.f21146a;
        if (videoView != null) {
            if (videoView.getCurrentState().isState(MediaState.State.PREPARING) || this.f21146a.isPlaying()) {
                this.f21146a.pause();
            }
        }
    }

    private boolean x() {
        return (this.f21146a.getCurrentState().isState(MediaState.State.PREPARING) || this.f21146a.isPlaying()) && !this.r;
    }

    private void w() {
        if (this.f21146a == null || !x() || this.q == 1) {
            return;
        }
        this.f21146a.stop();
    }

    private void v() {
        if (this.f21146a == null) {
            return;
        }
        m();
        if (!this.f21146a.getCurrentState().a()) {
            k();
        }
        a aVar = this.p;
        if (aVar != null) {
            this.l = aVar.b();
        }
        if (this.l && !this.n) {
            b(true);
        } else {
            if (this.f21146a.isPlaying()) {
                return;
            }
            d();
        }
    }

    private void u() {
        a(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        View.OnClickListener onClickListener;
        if (this.f21146a == null || (onClickListener = this.o) == null) {
            return;
        }
        onClickListener.onClick((NativeVideoControlPanel) this.f21147b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        View.OnClickListener onClickListener;
        VideoView videoView = this.f21146a;
        if (videoView == null || (onClickListener = this.o) == null) {
            return;
        }
        onClickListener.onClick(videoView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (this.f21146a == null) {
            return;
        }
        dq.a(this.k);
        if (this.f21146a.isPlaying()) {
            this.f21146a.pause();
            l(true);
            return;
        }
        if (!cb.e(this.f21146a.getContext())) {
            Toast.makeText(this.f21146a.getContext(), R.string.hiad_network_no_available, 0).show();
            return;
        }
        l(false);
        if (this.r || this.q == 1 || cb.c(this.f21146a.getContext())) {
            b(false);
            return;
        }
        hw.b("VideoControlBridge", "in non wifi, show alert view");
        this.f21146a.pause();
        n();
        u();
    }

    private void q() {
        com.huawei.openalliance.ad.views.interfaces.v vVar = this.f21147b;
        if (vVar instanceof NativeVideoControlPanel) {
            ((NativeVideoControlPanel) vVar).setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.am.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    am.this.t();
                }
            });
        }
    }

    private void p() {
        VideoView videoView = this.f21146a;
        if (videoView != null) {
            videoView.addMediaStateListener(this);
            this.f21146a.addMediaBufferListener(this);
            this.f21146a.addMediaErrorListener(this);
            this.f21146a.addNetworkChangeListener(this);
            this.f21146a.setSurfaceListener(this);
            this.f21146a.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.am.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    am.this.s();
                }
            });
        }
    }

    private void o() {
        p();
        d(this.f21147b);
        b(this.f21147b);
        if (this.j == 10) {
            q();
        }
    }

    private void n(boolean z) {
        VideoView videoView;
        a aVar = this.p;
        if (aVar == null || (videoView = this.f21146a) == null) {
            return;
        }
        aVar.b(z, videoView.getCurrentState().getStateCode());
    }

    private void n() {
        View view = this.h;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void m(boolean z) {
        VideoView videoView;
        a aVar = this.p;
        if (aVar == null || (videoView = this.f21146a) == null) {
            return;
        }
        aVar.a(z, videoView.getCurrentState().getStateCode());
    }

    private void m() {
        View view = this.h;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void l(boolean z) {
        a aVar = this.p;
        if (aVar != null) {
            aVar.a(z);
        }
    }

    private void l() {
        VideoView videoView;
        if (hw.a()) {
            hw.a("VideoControlBridge", "hidePreviewView");
        }
        dw.a(this.f, 8, 300, 300);
        if (this.f == null || (videoView = this.f21146a) == null) {
            return;
        }
        videoView.setAlpha(1.0f);
    }

    private void k(boolean z) {
        if (this.f21146a == null) {
            return;
        }
        if (z || this.q == 1 || this.r) {
            v();
        } else {
            w();
        }
    }

    private void k() {
        if (this.f == null) {
            return;
        }
        if (hw.a()) {
            hw.a("VideoControlBridge", "showPreviewView");
        }
        Animation animation = this.f.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        dk.a((View) this.f, true);
        VideoView videoView = this.f21146a;
        if (videoView != null) {
            videoView.setAlpha(0.0f);
        }
    }

    private void j(boolean z) {
        com.huawei.openalliance.ad.views.interfaces.v vVar = this.f21147b;
        if (vVar != null) {
            vVar.a(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        dq.a(this.k);
        m();
        if (this.j == 10) {
            t();
        }
        VideoView videoView = this.f21146a;
        if (videoView != null && !videoView.getCurrentState().a()) {
            k();
        }
        b(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z) {
        hw.b("VideoControlBridge", "switchSound enableSound: " + z);
        VideoView videoView = this.f21146a;
        if (videoView == null) {
            return;
        }
        if (z) {
            videoView.unmute();
        } else {
            videoView.mute();
        }
    }

    private void i() {
        com.huawei.openalliance.ad.views.interfaces.v vVar = this.f21147b;
        if (vVar == null) {
            return;
        }
        this.e = vVar.d();
        this.g = this.f21147b.h();
        View viewF = this.f21147b.f();
        this.h = viewF;
        if (viewF != null) {
            viewF.setClickable(true);
        }
        this.f = this.f21147b.e();
        c(this.f21147b);
        o();
        m();
        j(false);
        d();
    }

    private void h(boolean z) {
        a aVar = this.p;
        if (aVar != null) {
            aVar.b(z);
        }
    }

    private void d(com.huawei.openalliance.ad.views.interfaces.v vVar) {
        ImageView imageViewA = vVar.a();
        this.f21148c = imageViewA;
        if (imageViewA != null) {
            imageViewA.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.am.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (am.this.p != null) {
                        am.this.p.a();
                    }
                    if (am.this.j != 10) {
                        am.this.r();
                    } else {
                        hw.a("VideoControlBridge", "linkedVideoMode is %d", Integer.valueOf(am.this.j));
                        am.this.t();
                    }
                }
            });
            if (vVar.b() > 0) {
                this.f21148c.setImageResource(vVar.b());
                dk.a(this.f21148c);
            }
        }
    }

    private void c(com.huawei.openalliance.ad.views.interfaces.v vVar) {
        ImageView imageViewC = vVar.c();
        this.d = imageViewC;
        if (imageViewC != null) {
            imageViewC.setOnClickListener(this.x);
        }
    }

    private void b(com.huawei.openalliance.ad.views.interfaces.v vVar) {
        View viewG = vVar.g();
        this.i = viewG;
        if (viewG != null) {
            viewG.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.am.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    am.this.j();
                }
            });
        }
    }

    private void a(boolean z, boolean z2) {
        boolean zA;
        View view = this.g;
        if (z2) {
            zA = dk.a(view, z ? 0 : 8);
        } else {
            zA = dk.a(view, z);
        }
        if (zA) {
            if (z) {
                m(z2);
            } else {
                n(z2);
            }
        }
    }

    private void a(com.huawei.openalliance.ad.views.interfaces.v vVar) {
        this.f21147b = vVar;
        i();
    }

    private void a(VideoView videoView) {
        this.f21146a = videoView;
    }

    private void a(int i, boolean z, boolean z2) {
        com.huawei.openalliance.ad.views.interfaces.v vVar;
        a();
        if (z2) {
            i = 0;
        }
        this.m = i;
        if (this.f21148c != null && (vVar = this.f21147b) != null && vVar.b() != 0) {
            this.f21148c.setImageResource(this.f21147b.b());
            dk.a(this.f21148c);
        }
        if (!z) {
            k();
        }
        j(false);
        View view = this.h;
        if (view == null || view.getVisibility() != 0) {
            a(true, true);
        }
        ImageView imageView = this.f21148c;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    public am(VideoView videoView, com.huawei.openalliance.ad.views.interfaces.v vVar) {
        a(videoView);
        a(vVar);
    }
}
