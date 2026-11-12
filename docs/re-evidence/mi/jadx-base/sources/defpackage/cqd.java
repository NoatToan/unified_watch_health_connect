package defpackage;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.events.TouchEventType;

/* JADX INFO: loaded from: classes4.dex */
public class cqd {
    public final ViewGroup e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14615a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f14616b = new float[2];
    public boolean c = false;
    public long d = Long.MIN_VALUE;
    public final wjp f = new wjp();

    public cqd(ViewGroup viewGroup) {
        this.e = viewGroup;
    }

    public final void a(MotionEvent motionEvent, pd8 pd8Var) {
        if (this.f14615a == -1) {
            cm8.C("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
            return;
        }
        sk1.b(!this.c, "Expected to not have already sent a cancel for this gesture");
        pd8 pd8Var2 = (pd8) sk1.c(pd8Var);
        int i = this.f14615a;
        TouchEventType touchEventType = TouchEventType.CANCEL;
        long j = this.d;
        float[] fArr = this.f14616b;
        pd8Var2.dispatchEvent(vjp.e(i, touchEventType, motionEvent, j, fArr[0], fArr[1], this.f));
    }

    public final int b(MotionEvent motionEvent) {
        return yjp.b(motionEvent.getX(), motionEvent.getY(), this.e, this.f14616b, null);
    }

    public void c(MotionEvent motionEvent, pd8 pd8Var) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (this.f14615a != -1) {
                cm8.i("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture");
            }
            this.c = false;
            this.d = motionEvent.getEventTime();
            int iB = b(motionEvent);
            this.f14615a = iB;
            TouchEventType touchEventType = TouchEventType.START;
            long j = this.d;
            float[] fArr = this.f14616b;
            pd8Var.dispatchEvent(vjp.e(iB, touchEventType, motionEvent, j, fArr[0], fArr[1], this.f));
            return;
        }
        if (this.c) {
            return;
        }
        int i = this.f14615a;
        if (i == -1) {
            cm8.i("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
            return;
        }
        if (action == 1) {
            b(motionEvent);
            int i2 = this.f14615a;
            TouchEventType touchEventType2 = TouchEventType.END;
            long j2 = this.d;
            float[] fArr2 = this.f14616b;
            pd8Var.dispatchEvent(vjp.e(i2, touchEventType2, motionEvent, j2, fArr2[0], fArr2[1], this.f));
            this.f14615a = -1;
            this.d = Long.MIN_VALUE;
            return;
        }
        if (action == 2) {
            b(motionEvent);
            int i3 = this.f14615a;
            TouchEventType touchEventType3 = TouchEventType.MOVE;
            long j3 = this.d;
            float[] fArr3 = this.f14616b;
            pd8Var.dispatchEvent(vjp.e(i3, touchEventType3, motionEvent, j3, fArr3[0], fArr3[1], this.f));
            return;
        }
        if (action == 5) {
            TouchEventType touchEventType4 = TouchEventType.START;
            long j4 = this.d;
            float[] fArr4 = this.f14616b;
            pd8Var.dispatchEvent(vjp.e(i, touchEventType4, motionEvent, j4, fArr4[0], fArr4[1], this.f));
            return;
        }
        if (action == 6) {
            TouchEventType touchEventType5 = TouchEventType.END;
            long j5 = this.d;
            float[] fArr5 = this.f14616b;
            pd8Var.dispatchEvent(vjp.e(i, touchEventType5, motionEvent, j5, fArr5[0], fArr5[1], this.f));
            return;
        }
        if (action == 3) {
            if (this.f.c(motionEvent.getDownTime())) {
                a(motionEvent, pd8Var);
            } else {
                cm8.i("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
            }
            this.f14615a = -1;
            this.d = Long.MIN_VALUE;
            return;
        }
        cm8.C("ReactNative", "Warning : touch event was ignored. Action=" + action + " Target=" + this.f14615a);
    }

    public void d(MotionEvent motionEvent, pd8 pd8Var) {
        if (this.c) {
            return;
        }
        a(motionEvent, pd8Var);
        this.c = true;
        this.f14615a = -1;
    }
}
