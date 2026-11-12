package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes6.dex */
public class yhg extends oya<yhg> {
    public boolean B;
    public boolean C;

    public yhg() {
        L(true);
    }

    public static boolean W(View view, MotionEvent motionEvent) {
        return (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
    }

    @Override // defpackage.oya
    public void B() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setAction(3);
        r().onTouchEvent(motionEventObtain);
    }

    @Override // defpackage.oya
    public void C(MotionEvent motionEvent) {
        View viewR = r();
        int iP = p();
        if (motionEvent.getActionMasked() == 1) {
            viewR.onTouchEvent(motionEvent);
            if ((iP == 0 || iP == 2) && viewR.isPressed()) {
                a();
            }
            g();
            return;
        }
        if (iP != 0 && iP != 2) {
            if (iP == 4) {
                viewR.onTouchEvent(motionEvent);
            }
        } else if (this.B) {
            W(viewR, motionEvent);
            viewR.onTouchEvent(motionEvent);
            a();
        } else if (W(viewR, motionEvent)) {
            viewR.onTouchEvent(motionEvent);
            a();
        } else if (iP != 2) {
            c();
        }
    }

    @Override // defpackage.oya
    public boolean N(oya oyaVar) {
        return !this.C;
    }

    @Override // defpackage.oya
    public boolean O(oya oyaVar) {
        if (oyaVar instanceof yhg) {
            yhg yhgVar = (yhg) oyaVar;
            if (yhgVar.p() == 4 && yhgVar.C) {
                return false;
            }
        }
        boolean z = !this.C;
        int iP = p();
        return !(iP == 4 && oyaVar.p() == 4 && z) && iP == 4 && z;
    }

    @Override // defpackage.oya
    public boolean P(oya oyaVar) {
        return super.P(oyaVar);
    }

    public yhg U(boolean z) {
        this.C = z;
        return this;
    }

    public yhg V(boolean z) {
        this.B = z;
        return this;
    }
}
