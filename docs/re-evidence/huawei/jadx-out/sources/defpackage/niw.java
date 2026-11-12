package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.huawei.hwfabengine.FloatingActionButtonAnimationListener;

/* JADX INFO: loaded from: classes38.dex */
class niw {

    class d extends Animatable2.AnimationCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Animatable2 f43067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FloatingActionButtonAnimationListener f43068c;
        final /* synthetic */ FloatingActionButtonAnimationListener e;

        d(FloatingActionButtonAnimationListener floatingActionButtonAnimationListener, FloatingActionButtonAnimationListener floatingActionButtonAnimationListener2, Animatable2 animatable2) {
            this.f43068c = floatingActionButtonAnimationListener;
            this.e = floatingActionButtonAnimationListener2;
            this.f43067b = animatable2;
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            super.onAnimationEnd(drawable);
            this.f43068c.onAnimationEnd();
            niw.e(this.e);
            this.f43067b.unregisterAnimationCallback(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void c(Drawable drawable, FloatingActionButtonAnimationListener floatingActionButtonAnimationListener, FloatingActionButtonAnimationListener floatingActionButtonAnimationListener2) {
        try {
            if (drawable instanceof Animatable2) {
                Log.i("FloatingActionButtonAnimationUtils", "It starts to do animation.");
                Animatable2 animatable2 = (Animatable2) drawable;
                animatable2.start();
                d(animatable2, floatingActionButtonAnimationListener, floatingActionButtonAnimationListener2);
            }
        } catch (NoClassDefFoundError unused) {
            Log.e("FloatingActionButtonAnimationUtils", "It can not find the class Animatable2.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(FloatingActionButtonAnimationListener floatingActionButtonAnimationListener) {
        if (floatingActionButtonAnimationListener != null) {
            floatingActionButtonAnimationListener.onAnimationEnd();
        }
    }

    private static void d(Animatable2 animatable2, FloatingActionButtonAnimationListener floatingActionButtonAnimationListener, FloatingActionButtonAnimationListener floatingActionButtonAnimationListener2) {
        if (floatingActionButtonAnimationListener == null) {
            return;
        }
        try {
            animatable2.registerAnimationCallback(new d(floatingActionButtonAnimationListener, floatingActionButtonAnimationListener2, animatable2));
        } catch (NoClassDefFoundError unused) {
            Log.e("FloatingActionButtonAnimationUtils", "It can not find the class Animatable2.");
        }
    }
}
