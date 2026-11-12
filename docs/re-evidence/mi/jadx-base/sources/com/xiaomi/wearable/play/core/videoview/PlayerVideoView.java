package com.xiaomi.wearable.play.core.videoview;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.g;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.t;
import com.google.android.exoplayer2.v;
import com.xiaomi.wearable.play.PlayerAspectRatioFrameLayout;
import com.xiaomi.wearable.play.core.CustomTextureView;
import defpackage.aop;
import defpackage.cil;
import defpackage.dwc;
import defpackage.e1i;
import defpackage.erq;
import defpackage.i1i;
import defpackage.msi;
import defpackage.n0i;
import defpackage.tvi;
import defpackage.vlf;
import defpackage.x0i;
import defpackage.xjp;

/* JADX INFO: loaded from: classes2.dex */
public class PlayerVideoView extends FrameLayout implements dwc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f14434b;
    public e1i c;
    public String d;
    public long e;
    public CustomTextureView f;
    public Surface g;
    public boolean h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14435k;
    public boolean l;
    public boolean m;
    public PlayerAspectRatioFrameLayout n;
    public boolean o;
    public TextureView.SurfaceTextureListener p;
    public erq q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14436r;
    public q.c s;

    public class a implements TextureView.SurfaceTextureListener {
        public a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            String unused = PlayerVideoView.this.f14433a;
            StringBuilder sb = new StringBuilder();
            sb.append("onSurfaceTextureAvailable  width==  ");
            sb.append(i);
            sb.append(" height== ");
            PlayerVideoView playerVideoView = PlayerVideoView.this;
            playerVideoView.h = true;
            playerVideoView.setKeepScreenOn(true);
            PlayerVideoView.this.g = new Surface(surfaceTexture);
            PlayerVideoView.this.x();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            try {
                PlayerVideoView.this.setKeepScreenOn(false);
                if (PlayerVideoView.this.g != null) {
                    PlayerVideoView.this.g.release();
                    PlayerVideoView.this.g = null;
                }
                if (PlayerVideoView.this.f14434b == null) {
                    return true;
                }
                PlayerVideoView.this.i = false;
                PlayerVideoView.this.f14434b.Y0(PlayerVideoView.this.q);
                PlayerVideoView.this.f14434b.i(PlayerVideoView.this.s);
                PlayerVideoView.this.f14434b.s(PlayerVideoView.this.f);
                PlayerVideoView.this.z();
                PlayerVideoView.this.j = false;
                PlayerVideoView.this.f14435k = false;
                return true;
            } catch (Throwable unused) {
                return true;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public class b implements erq {
        public b() {
        }

        @Override // defpackage.erq
        public void onRenderedFirstFrame() {
        }

        @Override // defpackage.erq
        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
            x0i.g().onVideoSizeChanged(i, i2, i3, f);
            if (PlayerVideoView.this.n != null) {
                float f2 = i2 == 0 ? 1.0f : (i * f) / i2;
                String unused = PlayerVideoView.this.f14433a;
                StringBuilder sb = new StringBuilder();
                sb.append("onVideoSizeChanged: ");
                sb.append(f2);
                sb.append(" pixelWidthHeightRatio=");
                sb.append(f);
                sb.append(" width= ");
                sb.append(i);
                sb.append(" height= ");
                sb.append(i2);
                PlayerVideoView.this.n.setAspectRatio(f2);
            }
        }
    }

    public class c implements q.c {
        public c() {
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onPlaybackParametersChanged(n0i n0iVar) {
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onPlayerError(ExoPlaybackException exoPlaybackException) {
            x0i.g().onError();
            PlayerVideoView.this.i = false;
            PlayerVideoView.this.f14435k = true;
            if (PlayerVideoView.this.c != null) {
                PlayerVideoView playerVideoView = PlayerVideoView.this;
                playerVideoView.m = playerVideoView.c.u();
                PlayerVideoView playerVideoView2 = PlayerVideoView.this;
                playerVideoView2.e = playerVideoView2.c.q();
            }
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onPlayerStateChanged(boolean z, int i) {
            PlayerVideoView.this.v(z, i);
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onPositionDiscontinuity(int i) {
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onRepeatModeChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onSeekProcessed() {
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onTimelineChanged(v vVar, Object obj, int i) {
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onTracksChanged(TrackGroupArray trackGroupArray, aop aopVar) {
        }
    }

    public PlayerVideoView(Context context) {
        super(context);
        this.f14433a = PlayerVideoView.class.getSimpleName();
        this.c = new e1i(this);
        this.f = null;
        this.h = false;
        this.i = false;
        this.j = false;
        this.f14435k = false;
        this.l = false;
        this.m = false;
        this.p = new a();
        this.q = new b();
        this.f14436r = -1;
        this.s = new c();
        q();
    }

    @Override // defpackage.dwc
    public void a() {
        e1i e1iVar = this.c;
        if (e1iVar != null) {
            e1iVar.y();
        }
    }

    public int getBufferPercentage() {
        e1i e1iVar = this.c;
        if (e1iVar == null) {
            return 0;
        }
        e1iVar.p();
        return 0;
    }

    public long getCurrentPosition() {
        e1i e1iVar = this.c;
        if (e1iVar != null) {
            return e1iVar.q();
        }
        return 0L;
    }

    public long getDuration() {
        e1i e1iVar = this.c;
        if (e1iVar != null) {
            return e1iVar.r();
        }
        return 0L;
    }

    public int getPlayerState() {
        e1i e1iVar = this.c;
        if (e1iVar != null) {
            return e1iVar.s();
        }
        return 1;
    }

    public int getVideoHeight() {
        return 0;
    }

    public int getVideoWidth() {
        return 0;
    }

    @Override // defpackage.dwc
    public boolean isPlaying() {
        e1i e1iVar = this.c;
        if (e1iVar != null) {
            return e1iVar.t();
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        xjp.b().a(motionEvent);
        return true;
    }

    public final void p() {
        if (this.i) {
            return;
        }
        k kVarA = vlf.a(this.d, getContext());
        if (this.o) {
            this.f14434b.R0(new g(kVarA));
        } else {
            this.f14434b.R0(kVarA);
        }
        this.i = true;
    }

    public final void q() {
        r();
    }

    public final void r() {
        LayoutInflater.from(getContext()).inflate(tvi.f, (ViewGroup) this, true);
        CustomTextureView customTextureView = (CustomTextureView) findViewById(msi.n);
        this.f = customTextureView;
        customTextureView.setSurfaceTextureListener(this.p);
        PlayerAspectRatioFrameLayout playerAspectRatioFrameLayout = (PlayerAspectRatioFrameLayout) findViewById(msi.o);
        this.n = playerAspectRatioFrameLayout;
        playerAspectRatioFrameLayout.setResizeMode(0);
        this.c.o();
    }

    public final void s() {
        if (this.f14434b == null) {
            t tVarX = new t.b(getContext()).x();
            this.f14434b = tVarX;
            tVarX.t(this.s);
            this.f14434b.F0(this.q);
            this.c.E(this.f14434b);
        }
    }

    @Override // defpackage.dwc
    public void seekTo(int i) {
        e1i e1iVar = this.c;
        if (e1iVar != null) {
            e1iVar.B(i);
        }
    }

    public void t() {
        e1i e1iVar = this.c;
        if (e1iVar != null) {
            e1iVar.m();
        }
    }

    public void u() {
        e1i e1iVar = this.c;
        if (e1iVar != null) {
            e1iVar.n();
        }
    }

    public void v(boolean z, int i) {
        String str = "playWhenReady=" + z + ", playbackState= ";
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("idle");
        } else if (i == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("buffering");
            x0i.g().d();
        } else if (i == 3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("ready");
            if (this.h) {
                this.h = false;
                if (this.l) {
                    x0i.g().onStart();
                    this.l = false;
                }
            }
        } else if (i != 4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append("unknown");
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append("ended");
            x0i.g().c(getDuration(), getDuration(), 100, getBufferPercentage());
            x0i.g().onComplete();
        }
        x0i.g().e(z, i);
    }

    public void w() {
        this.l = true;
        this.m = true;
        if (this.g != null) {
            x();
        } else {
            i1i.b(this.f, true);
        }
    }

    public final void x() {
        if (TextUtils.isEmpty(this.d)) {
            x0i.g().onError();
            return;
        }
        if (this.f14434b == null) {
            s();
        }
        this.f14435k = false;
        this.f14434b.g1(this.g);
        this.f14434b.z(this.m);
        e1i e1iVar = this.c;
        if (e1iVar != null) {
            e1iVar.v(this.m);
        }
        p();
        if (this.j) {
            this.j = false;
            v(true, this.f14434b.getPlaybackState());
        }
        y();
        StringBuilder sb = new StringBuilder();
        sb.append("playVideo: ");
        sb.append(this.e);
    }

    public final void y() {
        t tVar;
        long j = this.e;
        if (j <= 0 || (tVar = this.f14434b) == null) {
            return;
        }
        tVar.seekTo(j);
    }

    public final void z() {
        if (this.f14434b == null) {
            return;
        }
        e1i e1iVar = this.c;
        if (e1iVar != null) {
            this.m = e1iVar.u();
            this.e = this.c.q();
        }
        if (cil.d().h()) {
            this.f14434b.z(false);
            cil.d().a(this.f14434b);
        } else {
            this.f14434b.release();
        }
        this.f14434b = null;
    }
}
