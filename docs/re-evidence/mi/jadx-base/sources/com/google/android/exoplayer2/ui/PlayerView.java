package com.google.android.exoplayer2.ui;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.d;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.common.collect.ImmutableList;
import defpackage.aop;
import defpackage.ap0;
import defpackage.epi;
import defpackage.g2j;
import defpackage.h55;
import defpackage.hd8;
import defpackage.hqi;
import defpackage.jj4;
import defpackage.jwi;
import defpackage.mki;
import defpackage.ni4;
import defpackage.o0i;
import defpackage.rk1;
import defpackage.wlq;
import defpackage.z3j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class PlayerView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f8344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AspectRatioFrameLayout f8345b;
    public final View c;
    public final View d;
    public final boolean e;
    public final ImageView f;
    public final SubtitleView g;
    public final View h;
    public final TextView i;
    public final PlayerControlView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final FrameLayout f8346k;
    public final FrameLayout l;
    public q m;
    public boolean n;
    public PlayerControlView.d o;
    public boolean p;
    public Drawable q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8347r;
    public boolean s;
    public CharSequence t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public boolean z;

    public final class a implements q.e, View.OnLayoutChangeListener, View.OnClickListener, PlayerControlView.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v.b f8348a = new v.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f8349b;

        public a() {
        }

        @Override // com.google.android.exoplayer2.ui.PlayerControlView.d
        public void a(int i) {
            PlayerView.this.K();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerView.this.I();
        }

        @Override // com.google.android.exoplayer2.q.e
        public void onCues(List<h55> list) {
            if (PlayerView.this.g != null) {
                PlayerView.this.g.onCues(list);
            }
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            PlayerView.r((TextureView) view, PlayerView.this.y);
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onPlayWhenReadyChanged(boolean z, int i) {
            PlayerView.this.J();
            PlayerView.this.L();
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onPlaybackStateChanged(int i) {
            PlayerView.this.J();
            PlayerView.this.M();
            PlayerView.this.L();
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onPositionDiscontinuity(q.f fVar, q.f fVar2, int i) {
            if (PlayerView.this.z() && PlayerView.this.w) {
                PlayerView.this.x();
            }
        }

        @Override // defpackage.erq
        public void onRenderedFirstFrame() {
            if (PlayerView.this.c != null) {
                PlayerView.this.c.setVisibility(4);
            }
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onTracksChanged(TrackGroupArray trackGroupArray, aop aopVar) {
            q qVar = (q) rk1.e(PlayerView.this.m);
            v vVarC = qVar.C();
            if (vVarC.q()) {
                this.f8349b = null;
            } else if (qVar.m().d()) {
                Object obj = this.f8349b;
                if (obj != null) {
                    int iB = vVarC.b(obj);
                    if (iB != -1) {
                        if (qVar.y() == vVarC.f(iB, this.f8348a).c) {
                            return;
                        }
                    }
                    this.f8349b = null;
                }
            } else {
                this.f8349b = vVarC.g(qVar.r(), this.f8348a, true).f8447b;
            }
            PlayerView.this.N(false);
        }

        @Override // defpackage.erq
        public void onVideoSizeChanged(int i, int i2, int i3, float f) {
            float f2 = (i2 == 0 || i == 0) ? 1.0f : (i * f) / i2;
            if (PlayerView.this.d instanceof TextureView) {
                if (i3 == 90 || i3 == 270) {
                    f2 = 1.0f / f2;
                }
                if (PlayerView.this.y != 0) {
                    PlayerView.this.d.removeOnLayoutChangeListener(this);
                }
                PlayerView.this.y = i3;
                if (PlayerView.this.y != 0) {
                    PlayerView.this.d.addOnLayoutChangeListener(this);
                }
                PlayerView.r((TextureView) PlayerView.this.d, PlayerView.this.y);
            }
            PlayerView playerView = PlayerView.this;
            AspectRatioFrameLayout aspectRatioFrameLayout = playerView.f8345b;
            if (PlayerView.this.e) {
                f2 = 0.0f;
            }
            playerView.B(aspectRatioFrameLayout, f2);
        }
    }

    public PlayerView(Context context) {
        this(context, null);
    }

    public static void E(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public static void r(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i != 0) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(i, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    public static void t(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(epi.f));
        imageView.setBackgroundColor(resources.getColor(mki.f26959a));
    }

    @RequiresApi(23)
    public static void u(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(epi.f, null));
        imageView.setBackgroundColor(resources.getColor(mki.f26959a, null));
    }

    public final void A(boolean z) {
        if (!(z() && this.w) && P()) {
            boolean z2 = this.j.J() && this.j.getShowTimeoutMs() <= 0;
            boolean zF = F();
            if (z || z2 || zF) {
                H(zF);
            }
        }
    }

    public void B(AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    public final boolean C(Metadata metadata) {
        byte[] bArr;
        int i;
        boolean zD = false;
        int i2 = -1;
        for (int i3 = 0; i3 < metadata.e(); i3++) {
            Metadata.Entry entryD = metadata.d(i3);
            if (entryD instanceof ApicFrame) {
                ApicFrame apicFrame = (ApicFrame) entryD;
                bArr = apicFrame.e;
                i = apicFrame.d;
            } else {
                if (entryD instanceof PictureFrame) {
                    PictureFrame pictureFrame = (PictureFrame) entryD;
                    bArr = pictureFrame.h;
                    i = pictureFrame.f7991a;
                } else {
                    continue;
                }
            }
            if (i2 == -1 || i == 3) {
                zD = D(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                if (i == 3) {
                    break;
                }
                i2 = i;
            }
        }
        return zD;
    }

    public final boolean D(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                B(this.f8345b, intrinsicWidth / intrinsicHeight);
                this.f.setImageDrawable(drawable);
                this.f.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean F() {
        q qVar = this.m;
        if (qVar == null) {
            return true;
        }
        int playbackState = qVar.getPlaybackState();
        return this.v && (playbackState == 1 || playbackState == 4 || !this.m.n());
    }

    public void G() {
        H(F());
    }

    public final void H(boolean z) {
        if (P()) {
            this.j.setShowTimeoutMs(z ? 0 : this.u);
            this.j.P();
        }
    }

    public final boolean I() {
        if (!P() || this.m == null) {
            return false;
        }
        if (!this.j.J()) {
            A(true);
        } else if (this.x) {
            this.j.G();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    public final void J() {
        boolean z;
        if (this.h != null) {
            q qVar = this.m;
            if (qVar == null || qVar.getPlaybackState() != 2) {
                z = false;
            } else {
                int i = this.f8347r;
                z = true;
                if (i != 2 && (i != 1 || !this.m.n())) {
                    z = false;
                }
            }
            this.h.setVisibility(z ? 0 : 8);
        }
    }

    public final void K() {
        PlayerControlView playerControlView = this.j;
        if (playerControlView == null || !this.n) {
            setContentDescription(null);
        } else if (playerControlView.getVisibility() == 0) {
            setContentDescription(this.x ? getResources().getString(g2j.e) : null);
        } else {
            setContentDescription(getResources().getString(g2j.l));
        }
    }

    public final void L() {
        if (z() && this.w) {
            x();
        } else {
            A(false);
        }
    }

    public final void M() {
        TextView textView = this.i;
        if (textView != null) {
            CharSequence charSequence = this.t;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.i.setVisibility(0);
            } else {
                q qVar = this.m;
                if (qVar != null) {
                    qVar.j();
                }
                this.i.setVisibility(8);
            }
        }
    }

    public final void N(boolean z) {
        q qVar = this.m;
        if (qVar == null || qVar.m().d()) {
            if (this.s) {
                return;
            }
            w();
            s();
            return;
        }
        if (z && !this.s) {
            s();
        }
        if (d.a(qVar.F(), 2)) {
            w();
            return;
        }
        s();
        if (O()) {
            Iterator<Metadata> it = qVar.w().iterator();
            while (it.hasNext()) {
                if (C(it.next())) {
                    return;
                }
            }
            if (D(this.q)) {
                return;
            }
        }
        w();
    }

    public final boolean O() {
        if (!this.p) {
            return false;
        }
        rk1.i(this.f);
        return true;
    }

    public final boolean P() {
        if (!this.n) {
            return false;
        }
        rk1.i(this.j);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        q qVar = this.m;
        if (qVar != null && qVar.a()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zY = y(keyEvent.getKeyCode());
        if (zY && P() && !this.j.J()) {
            A(true);
            return true;
        }
        if (v(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            A(true);
            return true;
        }
        if (zY && P()) {
            A(true);
        }
        return false;
    }

    public List<ap0> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.l;
        if (frameLayout != null) {
            arrayList.add(new ap0(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        PlayerControlView playerControlView = this.j;
        if (playerControlView != null) {
            arrayList.add(new ap0(playerControlView, 0));
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) rk1.j(this.f8346k, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.v;
    }

    public boolean getControllerHideOnTouch() {
        return this.x;
    }

    public int getControllerShowTimeoutMs() {
        return this.u;
    }

    public Drawable getDefaultArtwork() {
        return this.q;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.l;
    }

    public q getPlayer() {
        return this.m;
    }

    public int getResizeMode() {
        rk1.i(this.f8345b);
        return this.f8345b.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.g;
    }

    public boolean getUseArtwork() {
        return this.p;
    }

    public boolean getUseController() {
        return this.n;
    }

    public View getVideoSurfaceView() {
        return this.d;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!P() || this.m == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.z = true;
            return true;
        }
        if (action != 1 || !this.z) {
            return false;
        }
        this.z = false;
        performClick();
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!P() || this.m == null) {
            return false;
        }
        A(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return I();
    }

    public final void s() {
        View view = this.c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        rk1.i(this.f8345b);
        this.f8345b.setAspectRatioListener(bVar);
    }

    public void setControlDispatcher(jj4 jj4Var) {
        rk1.i(this.j);
        this.j.setControlDispatcher(jj4Var);
    }

    public void setControllerAutoShow(boolean z) {
        this.v = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.w = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        rk1.i(this.j);
        this.x = z;
        K();
    }

    public void setControllerShowTimeoutMs(int i) {
        rk1.i(this.j);
        this.u = i;
        if (this.j.J()) {
            G();
        }
    }

    public void setControllerVisibilityListener(PlayerControlView.d dVar) {
        rk1.i(this.j);
        PlayerControlView.d dVar2 = this.o;
        if (dVar2 == dVar) {
            return;
        }
        if (dVar2 != null) {
            this.j.K(dVar2);
        }
        this.o = dVar;
        if (dVar != null) {
            this.j.z(dVar);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        rk1.g(this.i != null);
        this.t = charSequence;
        M();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.q != drawable) {
            this.q = drawable;
            N(false);
        }
    }

    public void setErrorMessageProvider(hd8<? super ExoPlaybackException> hd8Var) {
        if (hd8Var != null) {
            M();
        }
    }

    @Deprecated
    public void setFastForwardIncrementMs(int i) {
        rk1.i(this.j);
        this.j.setFastForwardIncrementMs(i);
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.s != z) {
            this.s = z;
            N(false);
        }
    }

    @Deprecated
    public void setPlaybackPreparer(o0i o0iVar) {
        rk1.i(this.j);
        this.j.setPlaybackPreparer(o0iVar);
    }

    public void setPlayer(q qVar) {
        rk1.g(Looper.myLooper() == Looper.getMainLooper());
        rk1.a(qVar == null || qVar.D() == Looper.getMainLooper());
        q qVar2 = this.m;
        if (qVar2 == qVar) {
            return;
        }
        if (qVar2 != null) {
            qVar2.f(this.f8344a);
            if (qVar2.l(21)) {
                View view = this.d;
                if (view instanceof TextureView) {
                    qVar2.s((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    qVar2.O((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.g;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.m = qVar;
        if (P()) {
            this.j.setPlayer(qVar);
        }
        J();
        M();
        N(true);
        if (qVar == null) {
            x();
            return;
        }
        if (qVar.l(21)) {
            View view2 = this.d;
            if (view2 instanceof TextureView) {
                qVar.E((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                qVar.h((SurfaceView) view2);
            }
        }
        if (this.g != null && qVar.l(22)) {
            this.g.setCues(qVar.A());
        }
        qVar.K(this.f8344a);
        A(false);
    }

    public void setRepeatToggleModes(int i) {
        rk1.i(this.j);
        this.j.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        rk1.i(this.f8345b);
        this.f8345b.setResizeMode(i);
    }

    @Deprecated
    public void setRewindIncrementMs(int i) {
        rk1.i(this.j);
        this.j.setRewindIncrementMs(i);
    }

    public void setShowBuffering(int i) {
        if (this.f8347r != i) {
            this.f8347r = i;
            J();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        rk1.i(this.j);
        this.j.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        rk1.i(this.j);
        this.j.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        rk1.i(this.j);
        this.j.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        rk1.i(this.j);
        this.j.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        rk1.i(this.j);
        this.j.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        rk1.i(this.j);
        this.j.setShowShuffleButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        rk1.g((z && this.f == null) ? false : true);
        if (this.p != z) {
            this.p = z;
            N(false);
        }
    }

    public void setUseController(boolean z) {
        rk1.g((z && this.j == null) ? false : true);
        if (this.n == z) {
            return;
        }
        this.n = z;
        if (P()) {
            this.j.setPlayer(this.m);
        } else {
            PlayerControlView playerControlView = this.j;
            if (playerControlView != null) {
                playerControlView.G();
                this.j.setPlayer(null);
            }
        }
        K();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public boolean v(KeyEvent keyEvent) {
        return P() && this.j.B(keyEvent);
    }

    public final void w() {
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f.setVisibility(4);
        }
    }

    public void x() {
        PlayerControlView playerControlView = this.j;
        if (playerControlView != null) {
            playerControlView.G();
        }
    }

    @SuppressLint({"InlinedApi"})
    public final boolean y(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    public final boolean z() {
        q qVar = this.m;
        return qVar != null && qVar.a() && this.m.n();
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int integer;
        int i4;
        boolean z5;
        int i5;
        int i6;
        boolean z6;
        boolean z7;
        int i7;
        boolean z8;
        super(context, attributeSet, i);
        a aVar = new a();
        this.f8344a = aVar;
        if (isInEditMode()) {
            this.f8345b = null;
            this.c = null;
            this.d = null;
            this.e = false;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.f8346k = null;
            this.l = null;
            ImageView imageView = new ImageView(context);
            if (wlq.f38110a >= 23) {
                u(getResources(), imageView);
            } else {
                t(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i8 = jwi.c;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, z3j.I, 0, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(z3j.S);
                int color = typedArrayObtainStyledAttributes.getColor(z3j.S, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(z3j.O, i8);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(z3j.U, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(z3j.K, 0);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(z3j.V, true);
                int i9 = typedArrayObtainStyledAttributes.getInt(z3j.T, 1);
                int i10 = typedArrayObtainStyledAttributes.getInt(z3j.P, 0);
                int i11 = typedArrayObtainStyledAttributes.getInt(z3j.R, 5000);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(z3j.M, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(z3j.J, true);
                integer = typedArrayObtainStyledAttributes.getInteger(z3j.Q, 0);
                this.s = typedArrayObtainStyledAttributes.getBoolean(z3j.N, this.s);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(z3j.L, true);
                typedArrayObtainStyledAttributes.recycle();
                i2 = i9;
                i4 = i10;
                i6 = resourceId2;
                i5 = color;
                z6 = z13;
                i8 = resourceId;
                z4 = z10;
                z3 = z9;
                z5 = zHasValue;
                z2 = z11;
                z = z12;
                i3 = i11;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 1;
            z = true;
            z2 = true;
            z3 = true;
            z4 = true;
            i3 = 5000;
            integer = 0;
            i4 = 0;
            z5 = false;
            i5 = 0;
            i6 = 0;
            z6 = true;
        }
        LayoutInflater.from(context).inflate(i8, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(hqi.i);
        this.f8345b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            E(aspectRatioFrameLayout, i4);
        }
        View viewFindViewById = findViewById(hqi.O);
        this.c = viewFindViewById;
        if (viewFindViewById != null && z5) {
            viewFindViewById.setBackgroundColor(i5);
        }
        if (aspectRatioFrameLayout != null && i2 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i2 == 2) {
                this.d = new TextureView(context);
            } else {
                if (i2 == 3) {
                    this.d = new SphericalGLSurfaceView(context);
                    z8 = true;
                } else if (i2 != 4) {
                    this.d = new SurfaceView(context);
                } else {
                    this.d = new VideoDecoderGLSurfaceView(context);
                }
                this.d.setLayoutParams(layoutParams);
                this.d.setOnClickListener(aVar);
                this.d.setClickable(false);
                aspectRatioFrameLayout.addView(this.d, 0);
                z7 = z8;
            }
            z8 = false;
            this.d.setLayoutParams(layoutParams);
            this.d.setOnClickListener(aVar);
            this.d.setClickable(false);
            aspectRatioFrameLayout.addView(this.d, 0);
            z7 = z8;
        } else {
            this.d = null;
            z7 = false;
        }
        this.e = z7;
        this.f8346k = (FrameLayout) findViewById(hqi.f20342a);
        this.l = (FrameLayout) findViewById(hqi.A);
        ImageView imageView2 = (ImageView) findViewById(hqi.f20343b);
        this.f = imageView2;
        this.p = z3 && imageView2 != null;
        if (i6 != 0) {
            this.q = ni4.e(getContext(), i6);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(hqi.R);
        this.g = subtitleView;
        if (subtitleView != null) {
            subtitleView.d();
            subtitleView.e();
        }
        View viewFindViewById2 = findViewById(hqi.f);
        this.h = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f8347r = integer;
        TextView textView = (TextView) findViewById(hqi.n);
        this.i = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(hqi.j);
        View viewFindViewById3 = findViewById(hqi.f20344k);
        if (playerControlView != null) {
            this.j = playerControlView;
            i7 = 0;
        } else if (viewFindViewById3 != null) {
            i7 = 0;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.j = playerControlView2;
            playerControlView2.setId(hqi.j);
            playerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(playerControlView2, iIndexOfChild);
        } else {
            i7 = 0;
            this.j = null;
        }
        PlayerControlView playerControlView3 = this.j;
        this.u = playerControlView3 != null ? i3 : i7;
        this.x = z2;
        this.v = z;
        this.w = z6;
        this.n = (!z4 || playerControlView3 == null) ? i7 : 1;
        x();
        K();
        PlayerControlView playerControlView4 = this.j;
        if (playerControlView4 != null) {
            playerControlView4.z(aVar);
        }
    }
}
