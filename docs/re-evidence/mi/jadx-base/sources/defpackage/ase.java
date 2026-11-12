package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes6.dex */
public class ase extends oya<ase> {
    public static float G = 10.0f;
    public long B = 500;
    public float C;
    public float D;
    public float E;
    public Handler F;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ase.this.a();
        }
    }

    public ase(Context context) {
        L(true);
        this.C = G * context.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.oya
    public void C(MotionEvent motionEvent) {
        if (p() == 0) {
            c();
            this.D = motionEvent.getRawX();
            this.E = motionEvent.getRawY();
            Handler handler = new Handler();
            this.F = handler;
            handler.postDelayed(new a(), this.B);
        }
        if (motionEvent.getActionMasked() == 1) {
            Handler handler2 = this.F;
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
                this.F = null;
            }
            if (p() == 4) {
                g();
                return;
            } else {
                h();
                return;
            }
        }
        float rawX = motionEvent.getRawX() - this.D;
        float rawY = motionEvent.getRawY() - this.E;
        if ((rawX * rawX) + (rawY * rawY) > this.C) {
            if (p() == 4) {
                d();
            } else {
                h();
            }
        }
    }

    @Override // defpackage.oya
    public void E(int i, int i2) {
        Handler handler = this.F;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.F = null;
        }
    }

    public ase U(float f) {
        this.C = f * f;
        return this;
    }

    public void V(long j) {
        this.B = j;
    }
}
