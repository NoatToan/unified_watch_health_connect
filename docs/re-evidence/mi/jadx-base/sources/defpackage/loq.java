package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.annotation.RequiresApi;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class loq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<VelocityTracker, moq> f25285a = Collections.synchronizedMap(new WeakHashMap());

    @RequiresApi(34)
    public static class a {
        public static float a(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getAxisVelocity(i);
        }

        public static float b(VelocityTracker velocityTracker, int i, int i2) {
            return velocityTracker.getAxisVelocity(i, i2);
        }

        public static boolean c(VelocityTracker velocityTracker, int i) {
            return velocityTracker.isAxisSupported(i);
        }
    }

    public static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f25285a.containsKey(velocityTracker)) {
                f25285a.put(velocityTracker, new moq());
            }
            f25285a.get(velocityTracker).a(motionEvent);
        }
    }

    public static void b(VelocityTracker velocityTracker, int i) {
        c(velocityTracker, i, Float.MAX_VALUE);
    }

    public static void c(VelocityTracker velocityTracker, int i, float f) {
        velocityTracker.computeCurrentVelocity(i, f);
        moq moqVarE = e(velocityTracker);
        if (moqVarE != null) {
            moqVarE.c(i, f);
        }
    }

    public static float d(VelocityTracker velocityTracker, int i) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        moq moqVarE = e(velocityTracker);
        if (moqVarE != null) {
            return moqVarE.d(i);
        }
        return 0.0f;
    }

    public static moq e(VelocityTracker velocityTracker) {
        return f25285a.get(velocityTracker);
    }
}
