package com.brentvatne.exoplayer;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.t;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.google.android.exoplayer2.v;
import defpackage.aop;
import defpackage.h55;
import defpackage.j8p;
import defpackage.n0i;
import defpackage.ni4;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(16)
public final class ExoPlayerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f6927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f6928b;
    public final SubtitleView c;
    public final AspectRatioFrameLayout d;
    public final b e;
    public t f;
    public Context g;
    public ViewGroup.LayoutParams h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Runnable f6929k;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExoPlayerView exoPlayerView = ExoPlayerView.this;
            exoPlayerView.measure(View.MeasureSpec.makeMeasureSpec(exoPlayerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ExoPlayerView.this.getHeight(), 1073741824));
            ExoPlayerView exoPlayerView2 = ExoPlayerView.this;
            exoPlayerView2.layout(exoPlayerView2.getLeft(), ExoPlayerView.this.getTop(), ExoPlayerView.this.getRight(), ExoPlayerView.this.getBottom());
        }
    }

    public final class b implements j8p, q.e {
        @Override // defpackage.j8p, com.google.android.exoplayer2.q.e
        public void onCues(List<h55> list) {
            ExoPlayerView.this.c.onCues(list);
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onPlaybackParametersChanged(n0i n0iVar) {
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onPlayerStateChanged(boolean z, int i) {
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onPositionDiscontinuity(int i) {
        }

        @Override // defpackage.erq
        public void onRenderedFirstFrame() {
            ExoPlayerView.this.f6928b.setVisibility(4);
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
            ExoPlayerView.this.g();
        }

        @Override // defpackage.erq
        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
            boolean z = ExoPlayerView.this.d.getAspectRatio() == 0.0f;
            ExoPlayerView.this.d.setAspectRatio(i2 == 0 ? 1.0f : (i * f) / i2);
            if (z) {
                ExoPlayerView exoPlayerView = ExoPlayerView.this;
                exoPlayerView.post(exoPlayerView.f6929k);
            }
        }

        public b() {
        }
    }

    public ExoPlayerView(Context context) {
        this(context, null);
    }

    public final void f() {
        View view = this.f6927a;
        if (view instanceof TextureView) {
            this.f.E((TextureView) view);
        } else if (view instanceof SurfaceView) {
            this.f.h((SurfaceView) view);
        }
    }

    public final void g() {
        t tVar = this.f;
        if (tVar == null) {
            return;
        }
        aop aopVarF = tVar.F();
        for (int i = 0; i < aopVarF.f3306a; i++) {
            if (this.f.M0(i) == 2 && aopVarF.a(i) != null) {
                return;
            }
        }
        this.f6928b.setVisibility(0);
    }

    public View getVideoSurfaceView() {
        return this.f6927a;
    }

    public final void h() {
        this.f6928b.setVisibility(this.j ? 4 : 0);
    }

    public final void i() {
        View textureView = this.i ? new TextureView(this.g) : new SurfaceView(this.g);
        textureView.setLayoutParams(this.h);
        this.f6927a = textureView;
        if (this.d.getChildAt(0) != null) {
            this.d.removeViewAt(0);
        }
        this.d.addView(this.f6927a, 0, this.h);
        if (this.f != null) {
            f();
        }
    }

    public void setHideShutterView(boolean z) {
        this.j = z;
        h();
    }

    public void setPlayer(t tVar) {
        t tVar2 = this.f;
        if (tVar2 == tVar) {
            return;
        }
        if (tVar2 != null) {
            tVar2.X0(this.e);
            this.f.Y0(this.e);
            this.f.f(this.e);
            this.f.g1(null);
        }
        this.f = tVar;
        this.f6928b.setVisibility(0);
        if (tVar != null) {
            f();
            tVar.F0(this.e);
            tVar.K(this.e);
            tVar.E0(this.e);
        }
    }

    public void setResizeMode(int i) {
        if (this.d.getResizeMode() != i) {
            this.d.setResizeMode(i);
            post(this.f6929k);
        }
    }

    public void setUseTextureView(boolean z) {
        if (z != this.i) {
            this.i = z;
            i();
        }
    }

    public ExoPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExoPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = true;
        this.j = false;
        this.f6929k = new a();
        this.g = context;
        this.h = new ViewGroup.LayoutParams(-1, -1);
        this.e = new b();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        AspectRatioFrameLayout aspectRatioFrameLayout = new AspectRatioFrameLayout(context);
        this.d = aspectRatioFrameLayout;
        aspectRatioFrameLayout.setLayoutParams(layoutParams);
        View view = new View(getContext());
        this.f6928b = view;
        view.setLayoutParams(this.h);
        view.setBackgroundColor(ni4.c(context, R.color.black));
        SubtitleView subtitleView = new SubtitleView(context);
        this.c = subtitleView;
        subtitleView.setLayoutParams(this.h);
        subtitleView.d();
        subtitleView.e();
        i();
        aspectRatioFrameLayout.addView(view, 1, this.h);
        aspectRatioFrameLayout.addView(subtitleView, 2, this.h);
        addViewInLayout(aspectRatioFrameLayout, 0, layoutParams);
    }
}
