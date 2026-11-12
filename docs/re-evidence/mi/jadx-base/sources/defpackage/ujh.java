package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes6.dex */
public class ujh extends oya<ujh> {
    public static float Z = Float.MAX_VALUE;
    public static float a0 = Float.MIN_VALUE;
    public static int b0 = 1;
    public static int c0 = 10;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public int N;
    public int O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public VelocityTracker X;
    public boolean Y;

    public ujh(Context context) {
        float f = a0;
        this.B = f;
        float f2 = Z;
        this.C = f2;
        this.D = f;
        this.E = f;
        this.F = f2;
        this.G = f2;
        this.H = f;
        this.I = f;
        this.J = f2;
        this.K = f2;
        this.L = f2;
        this.M = f2;
        this.N = b0;
        this.O = c0;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.B = scaledTouchSlop * scaledTouchSlop;
    }

    public static void U(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }

    @Override // defpackage.oya
    public void C(MotionEvent motionEvent) {
        int iP = p();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 6 || actionMasked == 5) {
            this.R += this.T - this.P;
            this.S += this.U - this.Q;
            this.T = sya.a(motionEvent, this.Y);
            float fB = sya.b(motionEvent, this.Y);
            this.U = fB;
            this.P = this.T;
            this.Q = fB;
        } else {
            this.T = sya.a(motionEvent, this.Y);
            this.U = sya.b(motionEvent, this.Y);
        }
        if (iP != 0 || motionEvent.getPointerCount() < this.N) {
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                U(velocityTracker, motionEvent);
                this.X.computeCurrentVelocity(1000);
                this.V = this.X.getXVelocity();
                this.W = this.X.getYVelocity();
            }
        } else {
            this.P = this.T;
            this.Q = this.U;
            this.R = 0.0f;
            this.S = 0.0f;
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.X = velocityTrackerObtain;
            U(velocityTrackerObtain, motionEvent);
            c();
        }
        if (actionMasked == 1) {
            if (iP == 4 || iP == 2) {
                g();
                return;
            } else {
                h();
                return;
            }
        }
        if (actionMasked == 5 && motionEvent.getPointerCount() > this.O) {
            if (iP == 4) {
                d();
                return;
            } else {
                h();
                return;
            }
        }
        if (actionMasked == 6 && iP == 4 && motionEvent.getPointerCount() < this.N) {
            h();
            return;
        }
        if (iP == 2) {
            if (p0()) {
                h();
            } else if (o0()) {
                this.P = this.T;
                this.Q = this.U;
                a();
            }
        }
    }

    @Override // defpackage.oya
    public void D() {
        VelocityTracker velocityTracker = this.X;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.X = null;
        }
    }

    public float V() {
        return (this.T - this.P) + this.R;
    }

    public float W() {
        return (this.U - this.Q) + this.S;
    }

    public float X() {
        return this.V;
    }

    public float Y() {
        return this.W;
    }

    public ujh Z(float f) {
        this.D = f;
        return this;
    }

    public ujh a0(float f) {
        this.C = f;
        return this;
    }

    public ujh b0(float f) {
        this.H = f;
        return this;
    }

    public ujh c0(float f) {
        this.G = f;
        return this;
    }

    public ujh d0(boolean z) {
        this.Y = z;
        return this;
    }

    public ujh e0(float f) {
        this.F = f;
        return this;
    }

    public ujh f0(float f) {
        this.E = f;
        return this;
    }

    public ujh g0(float f) {
        this.J = f;
        return this;
    }

    public ujh h0(float f) {
        this.I = f;
        return this;
    }

    public ujh i0(int i) {
        this.O = i;
        return this;
    }

    public ujh j0(float f) {
        this.B = f * f;
        return this;
    }

    public ujh k0(int i) {
        this.N = i;
        return this;
    }

    public ujh l0(float f) {
        this.M = f * f;
        return this;
    }

    public ujh m0(float f) {
        this.K = f;
        return this;
    }

    public ujh n0(float f) {
        this.L = f;
        return this;
    }

    public final boolean o0() {
        float f = (this.T - this.P) + this.R;
        float f2 = this.C;
        float f3 = Z;
        if (f2 != f3 && f < f2) {
            return true;
        }
        float f4 = this.D;
        float f5 = a0;
        if (f4 != f5 && f > f4) {
            return true;
        }
        float f6 = (this.U - this.Q) + this.S;
        float f7 = this.G;
        if (f7 != f3 && f6 < f7) {
            return true;
        }
        float f8 = this.H;
        if (f8 != f5 && f6 > f8) {
            return true;
        }
        float f9 = (f * f) + (f6 * f6);
        float f10 = this.B;
        if (f10 != f3 && f9 >= f10) {
            return true;
        }
        float f11 = this.V;
        float f12 = this.K;
        if (f12 != f3 && ((f12 < 0.0f && f11 <= f12) || (f12 >= 0.0f && f11 >= f12))) {
            return true;
        }
        float f13 = this.W;
        float f14 = this.L;
        if (f14 != f3 && ((f14 < 0.0f && f11 <= f14) || (f14 >= 0.0f && f11 >= f14))) {
            return true;
        }
        float f15 = (f11 * f11) + (f13 * f13);
        float f16 = this.M;
        return f16 != f3 && f15 >= f16;
    }

    public final boolean p0() {
        float f = (this.T - this.P) + this.R;
        float f2 = this.E;
        float f3 = a0;
        if (f2 != f3 && f < f2) {
            return true;
        }
        float f4 = this.F;
        float f5 = Z;
        if (f4 != f5 && f > f4) {
            return true;
        }
        float f6 = (this.U - this.Q) + this.S;
        float f7 = this.I;
        if (f7 != f3 && f6 < f7) {
            return true;
        }
        float f8 = this.J;
        return f8 != f5 && f6 > f8;
    }
}
