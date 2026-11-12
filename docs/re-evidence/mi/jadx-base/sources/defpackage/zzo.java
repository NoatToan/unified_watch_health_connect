package defpackage;

import android.os.Handler;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes6.dex */
public class zzo extends oya<zzo> {
    public static float S = Float.MIN_VALUE;
    public float B;
    public float C;
    public float D;
    public long E;
    public long F;
    public int G;
    public int H;
    public int I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public Handler P;
    public int Q;
    public final Runnable R;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zzo.this.h();
        }
    }

    public zzo() {
        float f = S;
        this.B = f;
        this.C = f;
        this.D = f;
        this.E = 500L;
        this.F = 500L;
        this.G = 1;
        this.H = 1;
        this.I = 1;
        this.R = new a();
        L(true);
    }

    private boolean c0() {
        float f = (this.N - this.J) + this.L;
        if (this.B != S && Math.abs(f) > this.B) {
            return true;
        }
        float f2 = (this.O - this.K) + this.M;
        if (this.C != S && Math.abs(f2) > this.C) {
            return true;
        }
        float f3 = (f2 * f2) + (f * f);
        float f4 = this.D;
        return f4 != S && f3 > f4;
    }

    @Override // defpackage.oya
    public void B() {
        Handler handler = this.P;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // defpackage.oya
    public void C(MotionEvent motionEvent) {
        int iP = p();
        int actionMasked = motionEvent.getActionMasked();
        if (iP == 0) {
            this.L = 0.0f;
            this.M = 0.0f;
            this.J = motionEvent.getRawX();
            this.K = motionEvent.getRawY();
        }
        if (actionMasked == 6 || actionMasked == 5) {
            this.L += this.N - this.J;
            this.M += this.O - this.K;
            this.N = sya.a(motionEvent, true);
            float fB = sya.b(motionEvent, true);
            this.O = fB;
            this.J = this.N;
            this.K = fB;
        } else {
            this.N = sya.a(motionEvent, true);
            this.O = sya.b(motionEvent, true);
        }
        if (this.I < motionEvent.getPointerCount()) {
            this.I = motionEvent.getPointerCount();
        }
        if (c0()) {
            h();
            return;
        }
        if (iP == 0) {
            if (actionMasked == 0) {
                c();
            }
            d0();
        } else if (iP == 2) {
            if (actionMasked == 1) {
                U();
            } else if (actionMasked == 0) {
                d0();
            }
        }
    }

    @Override // defpackage.oya
    public void D() {
        this.Q = 0;
        this.I = 0;
        Handler handler = this.P;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void U() {
        Handler handler = this.P;
        if (handler == null) {
            this.P = new Handler();
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        int i = this.Q + 1;
        this.Q = i;
        if (i != this.G || this.I < this.H) {
            this.P.postDelayed(this.R, this.F);
        } else {
            a();
            g();
        }
    }

    public zzo V(long j) {
        this.F = j;
        return this;
    }

    public zzo W(float f) {
        this.D = f * f;
        return this;
    }

    public zzo X(long j) {
        this.E = j;
        return this;
    }

    public zzo Y(float f) {
        this.B = f;
        return this;
    }

    public zzo Z(float f) {
        this.C = f;
        return this;
    }

    public zzo a0(int i) {
        this.H = i;
        return this;
    }

    public zzo b0(int i) {
        this.G = i;
        return this;
    }

    public final void d0() {
        Handler handler = this.P;
        if (handler == null) {
            this.P = new Handler();
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        this.P.postDelayed(this.R, this.E);
    }
}
