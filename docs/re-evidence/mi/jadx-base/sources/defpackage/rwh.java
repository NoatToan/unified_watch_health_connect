package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes6.dex */
public class rwh extends oya<rwh> {
    public ScaleGestureDetector B;
    public double C;
    public double D;
    public float E;
    public float F;
    public ScaleGestureDetector.OnScaleGestureListener G = new a();

    public class a implements ScaleGestureDetector.OnScaleGestureListener {
        public a() {
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            double d = rwh.this.C;
            rwh.this.C *= (double) scaleGestureDetector.getScaleFactor();
            long timeDelta = scaleGestureDetector.getTimeDelta();
            if (timeDelta > 0) {
                rwh rwhVar = rwh.this;
                rwhVar.D = (rwhVar.C - d) / timeDelta;
            }
            if (Math.abs(rwh.this.E - scaleGestureDetector.getCurrentSpan()) < rwh.this.F || rwh.this.p() != 2) {
                return true;
            }
            rwh.this.a();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            rwh.this.E = scaleGestureDetector.getCurrentSpan();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public rwh() {
        L(false);
    }

    @Override // defpackage.oya
    public void C(MotionEvent motionEvent) {
        if (p() == 0) {
            Context context = r().getContext();
            this.D = 0.0d;
            this.C = 1.0d;
            this.B = new ScaleGestureDetector(context, this.G);
            this.F = ViewConfiguration.get(context).getScaledTouchSlop();
            c();
        }
        ScaleGestureDetector scaleGestureDetector = this.B;
        if (scaleGestureDetector != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        if (motionEvent.getActionMasked() == 6) {
            pointerCount--;
        }
        if (p() == 4 && pointerCount < 2) {
            g();
        } else if (motionEvent.getActionMasked() == 1) {
            h();
        }
    }

    @Override // defpackage.oya
    public void D() {
        this.B = null;
        this.D = 0.0d;
        this.C = 1.0d;
    }

    public float a0() {
        ScaleGestureDetector scaleGestureDetector = this.B;
        if (scaleGestureDetector == null) {
            return Float.NaN;
        }
        return scaleGestureDetector.getFocusX();
    }

    public float b0() {
        ScaleGestureDetector scaleGestureDetector = this.B;
        if (scaleGestureDetector == null) {
            return Float.NaN;
        }
        return scaleGestureDetector.getFocusY();
    }

    public double c0() {
        return this.C;
    }

    public double d0() {
        return this.D;
    }
}
