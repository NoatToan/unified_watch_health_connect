package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes.dex */
public class yv6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zv6 f40605b;
    public final b c;
    public final a d;
    public VelocityTracker e;
    public float f;
    public int g;
    public int h;
    public int i;
    public final int[] j;

    @VisibleForTesting
    public interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i);
    }

    @VisibleForTesting
    public interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i);
    }

    public yv6(Context context, zv6 zv6Var) {
        this(context, zv6Var, new b() { // from class: wv6
            @Override // yv6.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i) {
                yv6.c(context2, iArr, motionEvent, i);
            }
        }, new a() { // from class: xv6
            @Override // yv6.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
                return yv6.f(velocityTracker, motionEvent, i);
            }
        });
    }

    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = msq.g(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
        iArr[1] = msq.f(context, viewConfiguration, motionEvent.getDeviceId(), i, motionEvent.getSource());
    }

    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        loq.a(velocityTracker, motionEvent);
        loq.b(velocityTracker, 1000);
        return loq.d(velocityTracker, i);
    }

    public final boolean d(MotionEvent motionEvent, int i) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.h == source && this.i == deviceId && this.g == i) {
            return false;
        }
        this.c.a(this.f40604a, this.j, motionEvent, i);
        this.h = source;
        this.i = deviceId;
        this.g = i;
        return true;
    }

    public final float e(MotionEvent motionEvent, int i) {
        if (this.e == null) {
            this.e = VelocityTracker.obtain();
        }
        return this.d.a(this.e, motionEvent, i);
    }

    public void g(MotionEvent motionEvent, int i) {
        boolean zD = d(motionEvent, i);
        if (this.j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i) * this.f40605b.a();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f) && fSignum != 0.0f)) {
            this.f40605b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.j;
        if (fAbs < iArr[0]) {
            return;
        }
        int i2 = iArr[1];
        float fMax = Math.max(-i2, Math.min(fE, i2));
        this.f = this.f40605b.b(fMax) ? fMax : 0.0f;
    }

    @VisibleForTesting
    public yv6(Context context, zv6 zv6Var, b bVar, a aVar) {
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = new int[]{Integer.MAX_VALUE, 0};
        this.f40604a = context;
        this.f40605b = zv6Var;
        this.c = bVar;
        this.d = aVar;
    }
}
