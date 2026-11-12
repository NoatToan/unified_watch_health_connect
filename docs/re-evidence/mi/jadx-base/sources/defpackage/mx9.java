package defpackage;

import android.os.Handler;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes6.dex */
public class mx9 extends oya<mx9> {
    public float F;
    public float G;
    public Handler H;
    public int I;
    public long B = 800;
    public long C = 160;
    public int D = 1;
    public int E = 1;
    public final Runnable J = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            mx9.this.h();
        }
    }

    @Override // defpackage.oya
    public void B() {
        Handler handler = this.H;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // defpackage.oya
    public void C(MotionEvent motionEvent) {
        int iP = p();
        if (iP == 0) {
            X(motionEvent);
        }
        if (iP == 2) {
            Y(motionEvent);
            if (motionEvent.getPointerCount() > this.I) {
                this.I = motionEvent.getPointerCount();
            }
            if (motionEvent.getActionMasked() == 1) {
                U(motionEvent);
            }
        }
    }

    @Override // defpackage.oya
    public void D() {
        Handler handler = this.H;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void U(MotionEvent motionEvent) {
        if (Y(motionEvent)) {
            return;
        }
        h();
    }

    public void V(int i) {
        this.D = i;
    }

    public void W(int i) {
        this.E = i;
    }

    public final void X(MotionEvent motionEvent) {
        this.F = motionEvent.getRawX();
        this.G = motionEvent.getRawY();
        c();
        this.I = 1;
        Handler handler = this.H;
        if (handler == null) {
            this.H = new Handler();
        } else {
            handler.removeCallbacksAndMessages(null);
        }
        this.H.postDelayed(this.J, this.B);
    }

    public final boolean Y(MotionEvent motionEvent) {
        if (this.I != this.E) {
            return false;
        }
        if (((this.D & 1) == 0 || motionEvent.getRawX() - this.F <= this.C) && (((this.D & 2) == 0 || this.F - motionEvent.getRawX() <= this.C) && (((this.D & 4) == 0 || this.G - motionEvent.getRawY() <= this.C) && ((this.D & 8) == 0 || motionEvent.getRawY() - this.G <= this.C)))) {
            return false;
        }
        this.H.removeCallbacksAndMessages(null);
        a();
        g();
        return true;
    }
}
