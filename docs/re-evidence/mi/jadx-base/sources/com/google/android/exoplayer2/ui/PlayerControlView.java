package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.f;
import com.google.android.exoplayer2.q;
import com.google.android.exoplayer2.v;
import defpackage.epi;
import defpackage.g2j;
import defpackage.g83;
import defpackage.hqi;
import defpackage.jj4;
import defpackage.jti;
import defpackage.jwi;
import defpackage.o0i;
import defpackage.pi8;
import defpackage.rk1;
import defpackage.wkk;
import defpackage.wlq;
import defpackage.z3j;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class PlayerControlView extends FrameLayout {
    public final Drawable A;
    public final Drawable B;
    public final float C;
    public final float D;
    public final String E;
    public final String F;
    public q G;
    public jj4 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public long U;
    public long[] V;
    public boolean[] W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f8339a;
    public long[] a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<d> f8340b;
    public boolean[] b0;
    public final View c;
    public long c0;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;
    public final ImageView i;
    public final ImageView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f8341k;
    public final TextView l;
    public final TextView m;
    public final com.google.android.exoplayer2.ui.b n;
    public final StringBuilder o;
    public final Formatter p;
    public final v.b q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v.c f8342r;
    public final Runnable s;
    public final Runnable t;
    public final Drawable u;
    public final Drawable v;
    public final Drawable w;
    public final String x;
    public final String y;
    public final String z;

    public final class b implements q.c, com.google.android.exoplayer2.ui.b.a, View.OnClickListener {
        public b() {
        }

        @Override // com.google.android.exoplayer2.ui.b.a
        public void a(com.google.android.exoplayer2.ui.b bVar, long j, boolean z) {
            PlayerControlView.this.L = false;
            if (z || PlayerControlView.this.G == null) {
                return;
            }
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.N(playerControlView.G, j);
        }

        @Override // com.google.android.exoplayer2.ui.b.a
        public void b(com.google.android.exoplayer2.ui.b bVar, long j) {
            if (PlayerControlView.this.m != null) {
                PlayerControlView.this.m.setText(wlq.c0(PlayerControlView.this.o, PlayerControlView.this.p, j));
            }
        }

        @Override // com.google.android.exoplayer2.ui.b.a
        public void c(com.google.android.exoplayer2.ui.b bVar, long j) {
            PlayerControlView.this.L = true;
            if (PlayerControlView.this.m != null) {
                PlayerControlView.this.m.setText(wlq.c0(PlayerControlView.this.o, PlayerControlView.this.p, j));
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q qVar = PlayerControlView.this.G;
            if (qVar == null) {
                return;
            }
            if (PlayerControlView.this.d == view) {
                PlayerControlView.this.H.i(qVar);
                return;
            }
            if (PlayerControlView.this.c == view) {
                PlayerControlView.this.H.g(qVar);
                return;
            }
            if (PlayerControlView.this.g == view) {
                if (qVar.getPlaybackState() != 4) {
                    PlayerControlView.this.H.d(qVar);
                    return;
                }
                return;
            }
            if (PlayerControlView.this.h == view) {
                PlayerControlView.this.H.k(qVar);
                return;
            }
            if (PlayerControlView.this.e == view) {
                PlayerControlView.this.D(qVar);
                return;
            }
            if (PlayerControlView.this.f == view) {
                PlayerControlView.this.C(qVar);
            } else if (PlayerControlView.this.i == view) {
                PlayerControlView.this.H.c(qVar, wkk.a(qVar.getRepeatMode(), PlayerControlView.this.O));
            } else if (PlayerControlView.this.j == view) {
                PlayerControlView.this.H.b(qVar, !qVar.P());
            }
        }

        @Override // com.google.android.exoplayer2.q.c
        public void onEvents(q qVar, q.d dVar) {
            if (dVar.b(5, 6)) {
                PlayerControlView.this.T();
            }
            if (dVar.b(5, 6, 8)) {
                PlayerControlView.this.U();
            }
            if (dVar.a(9)) {
                PlayerControlView.this.V();
            }
            if (dVar.a(10)) {
                PlayerControlView.this.W();
            }
            if (dVar.b(9, 10, 12, 0)) {
                PlayerControlView.this.S();
            }
            if (dVar.b(12, 0)) {
                PlayerControlView.this.X();
            }
        }
    }

    public interface c {
    }

    public interface d {
        void a(int i);
    }

    static {
        pi8.a("goog.exo.ui");
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    public static boolean A(v vVar, v.c cVar) {
        if (vVar.p() > 100) {
            return false;
        }
        int iP = vVar.p();
        for (int i = 0; i < iP; i++) {
            if (vVar.n(i, cVar).n == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    public static int F(TypedArray typedArray, int i) {
        return typedArray.getInt(z3j.z, i);
    }

    @SuppressLint({"InlinedApi"})
    public static boolean I(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    public boolean B(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        q qVar = this.G;
        if (qVar == null || !I(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (qVar.getPlaybackState() == 4) {
                return true;
            }
            this.H.d(qVar);
            return true;
        }
        if (keyCode == 89) {
            this.H.k(qVar);
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            E(qVar);
            return true;
        }
        if (keyCode == 87) {
            this.H.i(qVar);
            return true;
        }
        if (keyCode == 88) {
            this.H.g(qVar);
            return true;
        }
        if (keyCode == 126) {
            D(qVar);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        C(qVar);
        return true;
    }

    public final void C(q qVar) {
        this.H.j(qVar, false);
    }

    public final void D(q qVar) {
        int playbackState = qVar.getPlaybackState();
        if (playbackState == 1) {
            this.H.f(qVar);
        } else if (playbackState == 4) {
            M(qVar, qVar.y(), -9223372036854775807L);
        }
        this.H.j(qVar, true);
    }

    public final void E(q qVar) {
        int playbackState = qVar.getPlaybackState();
        if (playbackState == 1 || playbackState == 4 || !qVar.n()) {
            D(qVar);
        } else {
            C(qVar);
        }
    }

    public void G() {
        if (J()) {
            setVisibility(8);
            Iterator<d> it = this.f8340b.iterator();
            while (it.hasNext()) {
                it.next().a(getVisibility());
            }
            removeCallbacks(this.s);
            removeCallbacks(this.t);
            this.U = -9223372036854775807L;
        }
    }

    public final void H() {
        removeCallbacks(this.t);
        if (this.M <= 0) {
            this.U = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i = this.M;
        this.U = jUptimeMillis + ((long) i);
        if (this.I) {
            postDelayed(this.t, i);
        }
    }

    public boolean J() {
        return getVisibility() == 0;
    }

    public void K(d dVar) {
        this.f8340b.remove(dVar);
    }

    public final void L() {
        View view;
        View view2;
        boolean zO = O();
        if (!zO && (view2 = this.e) != null) {
            view2.requestFocus();
        } else {
            if (!zO || (view = this.f) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    public final boolean M(q qVar, int i, long j) {
        return this.H.a(qVar, i, j);
    }

    public final void N(q qVar, long j) {
        int iY;
        v vVarC = qVar.C();
        if (this.K && !vVarC.q()) {
            int iP = vVarC.p();
            iY = 0;
            while (true) {
                long jD = vVarC.n(iY, this.f8342r).d();
                if (j < jD) {
                    break;
                }
                if (iY == iP - 1) {
                    j = jD;
                    break;
                } else {
                    j -= jD;
                    iY++;
                }
            }
        } else {
            iY = qVar.y();
        }
        if (M(qVar, iY, j)) {
            return;
        }
        U();
    }

    public final boolean O() {
        q qVar = this.G;
        return (qVar == null || qVar.getPlaybackState() == 4 || this.G.getPlaybackState() == 1 || !this.G.n()) ? false : true;
    }

    public void P() {
        if (!J()) {
            setVisibility(0);
            Iterator<d> it = this.f8340b.iterator();
            while (it.hasNext()) {
                it.next().a(getVisibility());
            }
            Q();
            L();
        }
        H();
    }

    public final void Q() {
        T();
        S();
        V();
        W();
        X();
    }

    public final void R(boolean z, boolean z2, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.C : this.D);
        view.setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    public final void S() {
        boolean z;
        boolean zL;
        boolean z2;
        boolean z3;
        if (J() && this.I) {
            q qVar = this.G;
            boolean z4 = false;
            if (qVar != null) {
                v vVarC = qVar.C();
                if (vVarC.q() || qVar.a()) {
                    z = false;
                    zL = false;
                    z2 = false;
                    z3 = false;
                } else {
                    zL = qVar.l(4);
                    vVarC.n(qVar.y(), this.f8342r);
                    boolean z5 = zL || !this.f8342r.f() || qVar.l(6);
                    z2 = zL && this.H.e();
                    z3 = zL && this.H.l();
                    z = (this.f8342r.f() && this.f8342r.i) || qVar.l(5);
                    z4 = z5;
                }
            } else {
                z = false;
                zL = false;
                z2 = false;
                z3 = false;
            }
            R(this.R, z4, this.c);
            R(this.P, z2, this.h);
            R(this.Q, z3, this.g);
            R(this.S, z, this.d);
            com.google.android.exoplayer2.ui.b bVar = this.n;
            if (bVar != null) {
                bVar.setEnabled(zL);
            }
        }
    }

    public final void T() {
        boolean z;
        if (J() && this.I) {
            boolean zO = O();
            View view = this.e;
            if (view != null) {
                z = zO && view.isFocused();
                this.e.setVisibility(zO ? 8 : 0);
            } else {
                z = false;
            }
            View view2 = this.f;
            if (view2 != null) {
                z |= !zO && view2.isFocused();
                this.f.setVisibility(zO ? 0 : 8);
            }
            if (z) {
                L();
            }
        }
    }

    public final void U() {
        long J;
        long jV;
        if (J() && this.I) {
            q qVar = this.G;
            if (qVar != null) {
                J = this.c0 + qVar.J();
                jV = this.c0 + qVar.v();
            } else {
                J = 0;
                jV = 0;
            }
            TextView textView = this.m;
            if (textView != null && !this.L) {
                textView.setText(wlq.c0(this.o, this.p, J));
            }
            com.google.android.exoplayer2.ui.b bVar = this.n;
            if (bVar != null) {
                bVar.setPosition(J);
                this.n.setBufferedPosition(jV);
            }
            removeCallbacks(this.s);
            int playbackState = qVar == null ? 1 : qVar.getPlaybackState();
            if (qVar == null || !qVar.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.s, 1000L);
                return;
            }
            com.google.android.exoplayer2.ui.b bVar2 = this.n;
            long jMin = Math.min(bVar2 != null ? bVar2.getPreferredUpdateDelay() : 1000L, 1000 - (J % 1000));
            float f = qVar.c().f27406a;
            postDelayed(this.s, wlq.s(f > 0.0f ? (long) (jMin / f) : 1000L, this.N, 1000L));
        }
    }

    public final void V() {
        ImageView imageView;
        if (J() && this.I && (imageView = this.i) != null) {
            if (this.O == 0) {
                R(false, false, imageView);
                return;
            }
            q qVar = this.G;
            if (qVar == null) {
                R(true, false, imageView);
                this.i.setImageDrawable(this.u);
                this.i.setContentDescription(this.x);
                return;
            }
            R(true, true, imageView);
            int repeatMode = qVar.getRepeatMode();
            if (repeatMode == 0) {
                this.i.setImageDrawable(this.u);
                this.i.setContentDescription(this.x);
            } else if (repeatMode == 1) {
                this.i.setImageDrawable(this.v);
                this.i.setContentDescription(this.y);
            } else if (repeatMode == 2) {
                this.i.setImageDrawable(this.w);
                this.i.setContentDescription(this.z);
            }
            this.i.setVisibility(0);
        }
    }

    public final void W() {
        ImageView imageView;
        if (J() && this.I && (imageView = this.j) != null) {
            q qVar = this.G;
            if (!this.T) {
                R(false, false, imageView);
                return;
            }
            if (qVar == null) {
                R(true, false, imageView);
                this.j.setImageDrawable(this.B);
                this.j.setContentDescription(this.F);
            } else {
                R(true, true, imageView);
                this.j.setImageDrawable(qVar.P() ? this.A : this.B);
                this.j.setContentDescription(qVar.P() ? this.E : this.F);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf A[SYNTHETIC] */
    public final void X() {
        int i;
        v.c cVar;
        long jL;
        long[] jArr;
        int length;
        q qVar = this.G;
        if (qVar == null) {
            return;
        }
        boolean z = true;
        this.K = this.J && A(qVar.C(), this.f8342r);
        long j = 0;
        this.c0 = 0L;
        v vVarC = qVar.C();
        if (vVarC.q()) {
            i = 0;
        } else {
            int iY = qVar.y();
            boolean z2 = this.K;
            int i2 = z2 ? 0 : iY;
            int iP = z2 ? vVarC.p() - 1 : iY;
            long j2 = 0;
            i = 0;
            while (i2 <= iP) {
                if (i2 == iY) {
                    this.c0 = g83.d(j2);
                }
                vVarC.n(i2, this.f8342r);
                v.c cVar2 = this.f8342r;
                if (cVar2.n == -9223372036854775807L) {
                    rk1.g(this.K ^ z);
                    break;
                }
                int i3 = cVar2.o;
                while (true) {
                    cVar = this.f8342r;
                    if (i3 <= cVar.p) {
                        vVarC.f(i3, this.q);
                        int iC = this.q.c();
                        for (int i4 = 0; i4 < iC; i4++) {
                            long jF = this.q.f(i4);
                            if (jF == Long.MIN_VALUE) {
                                long j3 = this.q.d;
                                if (j3 != -9223372036854775807L) {
                                    jF = j3;
                                    jL = jF + this.q.l();
                                    if (jL >= 0) {
                                        jArr = this.V;
                                        if (i == jArr.length) {
                                            if (jArr.length == 0) {
                                                length = 1;
                                            } else {
                                                length = jArr.length * 2;
                                            }
                                            this.V = Arrays.copyOf(jArr, length);
                                            this.W = Arrays.copyOf(this.W, length);
                                        }
                                        this.V[i] = g83.d(j2 + jL);
                                        this.W[i] = this.q.m(i4);
                                        i++;
                                    }
                                }
                            } else {
                                jL = jF + this.q.l();
                                if (jL >= 0) {
                                    jArr = this.V;
                                    if (i == jArr.length) {
                                        if (jArr.length == 0) {
                                            length = 1;
                                        } else {
                                            length = jArr.length * 2;
                                        }
                                        this.V = Arrays.copyOf(jArr, length);
                                        this.W = Arrays.copyOf(this.W, length);
                                    }
                                    this.V[i] = g83.d(j2 + jL);
                                    this.W[i] = this.q.m(i4);
                                    i++;
                                }
                            }
                        }
                        i3++;
                    }
                }
                j2 += cVar.n;
                i2++;
                z = true;
            }
            j = j2;
        }
        long jD = g83.d(j);
        TextView textView = this.l;
        if (textView != null) {
            textView.setText(wlq.c0(this.o, this.p, jD));
        }
        com.google.android.exoplayer2.ui.b bVar = this.n;
        if (bVar != null) {
            bVar.setDuration(jD);
            int length2 = this.a0.length;
            int i5 = i + length2;
            long[] jArr2 = this.V;
            if (i5 > jArr2.length) {
                this.V = Arrays.copyOf(jArr2, i5);
                this.W = Arrays.copyOf(this.W, i5);
            }
            System.arraycopy(this.a0, 0, this.V, i, length2);
            System.arraycopy(this.b0, 0, this.W, i, length2);
            this.n.a(this.V, this.W, i5);
        }
        U();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return B(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.t);
        } else if (motionEvent.getAction() == 1) {
            H();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public q getPlayer() {
        return this.G;
    }

    public int getRepeatToggleModes() {
        return this.O;
    }

    public boolean getShowShuffleButton() {
        return this.T;
    }

    public int getShowTimeoutMs() {
        return this.M;
    }

    public boolean getShowVrButton() {
        View view = this.f8341k;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        long j = this.U;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                G();
            } else {
                postDelayed(this.t, jUptimeMillis);
            }
        } else if (J()) {
            H();
        }
        Q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
        removeCallbacks(this.s);
        removeCallbacks(this.t);
    }

    public void setControlDispatcher(jj4 jj4Var) {
        if (this.H != jj4Var) {
            this.H = jj4Var;
            S();
        }
    }

    @Deprecated
    public void setFastForwardIncrementMs(int i) {
        jj4 jj4Var = this.H;
        if (jj4Var instanceof f) {
            ((f) jj4Var).p(i);
            S();
        }
    }

    @Deprecated
    public void setPlaybackPreparer(o0i o0iVar) {
    }

    public void setPlayer(q qVar) {
        rk1.g(Looper.myLooper() == Looper.getMainLooper());
        rk1.a(qVar == null || qVar.D() == Looper.getMainLooper());
        q qVar2 = this.G;
        if (qVar2 == qVar) {
            return;
        }
        if (qVar2 != null) {
            qVar2.i(this.f8339a);
        }
        this.G = qVar;
        if (qVar != null) {
            qVar.t(this.f8339a);
        }
        Q();
    }

    public void setProgressUpdateListener(c cVar) {
    }

    public void setRepeatToggleModes(int i) {
        this.O = i;
        q qVar = this.G;
        if (qVar != null) {
            int repeatMode = qVar.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.H.c(this.G, 0);
            } else if (i == 1 && repeatMode == 2) {
                this.H.c(this.G, 1);
            } else if (i == 2 && repeatMode == 1) {
                this.H.c(this.G, 2);
            }
        }
        V();
    }

    @Deprecated
    public void setRewindIncrementMs(int i) {
        jj4 jj4Var = this.H;
        if (jj4Var instanceof f) {
            ((f) jj4Var).q(i);
            S();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        this.Q = z;
        S();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.J = z;
        X();
    }

    public void setShowNextButton(boolean z) {
        this.S = z;
        S();
    }

    public void setShowPreviousButton(boolean z) {
        this.R = z;
        S();
    }

    public void setShowRewindButton(boolean z) {
        this.P = z;
        S();
    }

    public void setShowShuffleButton(boolean z) {
        this.T = z;
        W();
    }

    public void setShowTimeoutMs(int i) {
        this.M = i;
        if (J()) {
            H();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.f8341k;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.N = wlq.r(i, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f8341k;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            R(getShowVrButton(), onClickListener != null, this.f8341k);
        }
    }

    public void z(d dVar) {
        rk1.e(dVar);
        this.f8340b.add(dVar);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int resourceId = jwi.f23205b;
        int i2 = 5000;
        this.M = 5000;
        this.O = 0;
        this.N = 200;
        this.U = -9223372036854775807L;
        this.P = true;
        this.Q = true;
        this.R = true;
        this.S = true;
        this.T = false;
        int i3 = 15000;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, z3j.w, 0, 0);
            try {
                i2 = typedArrayObtainStyledAttributes.getInt(z3j.A, 5000);
                i3 = typedArrayObtainStyledAttributes.getInt(z3j.y, 15000);
                this.M = typedArrayObtainStyledAttributes.getInt(z3j.G, this.M);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(z3j.x, resourceId);
                this.O = F(typedArrayObtainStyledAttributes, this.O);
                this.P = typedArrayObtainStyledAttributes.getBoolean(z3j.E, this.P);
                this.Q = typedArrayObtainStyledAttributes.getBoolean(z3j.B, this.Q);
                this.R = typedArrayObtainStyledAttributes.getBoolean(z3j.D, this.R);
                this.S = typedArrayObtainStyledAttributes.getBoolean(z3j.C, this.S);
                this.T = typedArrayObtainStyledAttributes.getBoolean(z3j.F, this.T);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(z3j.H, this.N));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f8340b = new CopyOnWriteArrayList<>();
        this.q = new v.b();
        this.f8342r = new v.c();
        StringBuilder sb = new StringBuilder();
        this.o = sb;
        this.p = new Formatter(sb, Locale.getDefault());
        this.V = new long[0];
        this.W = new boolean[0];
        this.a0 = new long[0];
        this.b0 = new boolean[0];
        b bVar = new b();
        this.f8339a = bVar;
        this.H = new f(i3, i2);
        this.s = new Runnable() { // from class: s0i
            @Override // java.lang.Runnable
            public final void run() {
                this.f33133a.U();
            }
        };
        this.t = new Runnable() { // from class: t0i
            @Override // java.lang.Runnable
            public final void run() {
                this.f34172a.G();
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        com.google.android.exoplayer2.ui.b bVar2 = (com.google.android.exoplayer2.ui.b) findViewById(hqi.H);
        View viewFindViewById = findViewById(hqi.I);
        if (bVar2 != null) {
            this.n = bVar2;
        } else if (viewFindViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(hqi.H);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.n = defaultTimeBar;
        } else {
            this.n = null;
        }
        this.l = (TextView) findViewById(hqi.m);
        this.m = (TextView) findViewById(hqi.F);
        com.google.android.exoplayer2.ui.b bVar3 = this.n;
        if (bVar3 != null) {
            bVar3.addListener(bVar);
        }
        View viewFindViewById2 = findViewById(hqi.C);
        this.e = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(bVar);
        }
        View viewFindViewById3 = findViewById(hqi.B);
        this.f = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(bVar);
        }
        View viewFindViewById4 = findViewById(hqi.G);
        this.c = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(bVar);
        }
        View viewFindViewById5 = findViewById(hqi.x);
        this.d = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(bVar);
        }
        View viewFindViewById6 = findViewById(hqi.K);
        this.h = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(bVar);
        }
        View viewFindViewById7 = findViewById(hqi.q);
        this.g = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(bVar);
        }
        ImageView imageView = (ImageView) findViewById(hqi.J);
        this.i = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(bVar);
        }
        ImageView imageView2 = (ImageView) findViewById(hqi.N);
        this.j = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(bVar);
        }
        View viewFindViewById8 = findViewById(hqi.U);
        this.f8341k = viewFindViewById8;
        setShowVrButton(false);
        R(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.C = resources.getInteger(jti.f23123b) / 100.0f;
        this.D = resources.getInteger(jti.f23122a) / 100.0f;
        this.u = resources.getDrawable(epi.f16937b);
        this.v = resources.getDrawable(epi.c);
        this.w = resources.getDrawable(epi.f16936a);
        this.A = resources.getDrawable(epi.e);
        this.B = resources.getDrawable(epi.d);
        this.x = resources.getString(g2j.j);
        this.y = resources.getString(g2j.f18505k);
        this.z = resources.getString(g2j.i);
        this.E = resources.getString(g2j.n);
        this.F = resources.getString(g2j.m);
    }
}
