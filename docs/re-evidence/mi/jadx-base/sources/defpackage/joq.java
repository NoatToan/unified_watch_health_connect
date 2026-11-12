package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;

/* JADX INFO: loaded from: classes4.dex */
public class joq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public VelocityTracker f22983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f22984b;
    public float c;

    public void a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.f22983a == null) {
            this.f22983a = VelocityTracker.obtain();
        }
        this.f22983a.addMovement(motionEvent);
        if (action == 1 || action == 3) {
            this.f22983a.computeCurrentVelocity(1);
            this.f22984b = this.f22983a.getXVelocity();
            this.c = this.f22983a.getYVelocity();
            VelocityTracker velocityTracker = this.f22983a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f22983a = null;
            }
        }
    }

    public float b() {
        return this.f22984b;
    }

    public float c() {
        return this.c;
    }
}
