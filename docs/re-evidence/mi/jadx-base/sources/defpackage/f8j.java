package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;

/* JADX INFO: loaded from: classes6.dex */
public class f8j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReactContext f17530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qya f17531b;
    public final oya c;
    public final ViewGroup d;
    public boolean e = false;
    public boolean f = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f8j.this.j();
        }
    }

    public class b extends oya {
        @Override // defpackage.oya
        public void B() {
            f8j.this.e = true;
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setAction(3);
            if (f8j.this.d instanceof ReactRootView) {
                ((ReactRootView) f8j.this.d).c(motionEventObtain);
            } else {
                com.facebook.react.views.modal.a.a(f8j.this.d, motionEventObtain);
            }
        }

        @Override // defpackage.oya
        public void C(MotionEvent motionEvent) {
            if (p() == 0) {
                c();
                f8j.this.e = false;
            }
            if (motionEvent.getActionMasked() == 1) {
                g();
            }
        }

        public b() {
        }
    }

    public f8j(ReactContext reactContext, ViewGroup viewGroup) {
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        if (id < 1) {
            throw new IllegalStateException("Expect view tag to be set for " + viewGroup);
        }
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) reactContext.getNativeModule(RNGestureHandlerModule.class);
        e8j registry = rNGestureHandlerModule.getRegistry();
        ViewGroup viewGroupE = e(viewGroup);
        this.d = viewGroupE;
        StringBuilder sb = new StringBuilder();
        sb.append("[GESTURE HANDLER] Initialize gesture handler for root view ");
        sb.append(viewGroupE);
        this.f17530a = reactContext;
        qya qyaVar = new qya(viewGroup, registry, new b9j());
        this.f17531b = qyaVar;
        qyaVar.w(0.1f);
        b bVar = new b();
        this.c = bVar;
        bVar.M(-id);
        registry.h(bVar);
        registry.b(bVar.q(), id);
        rNGestureHandlerModule.registerRootHelper(this);
    }

    public static ViewGroup e(ViewGroup viewGroup) {
        UiThreadUtil.assertOnUiThread();
        ViewParent parent = viewGroup;
        while (parent != null && !(parent instanceof ReactRootView) && !com.facebook.react.views.modal.a.b(parent)) {
            parent = parent.getParent();
        }
        if (parent != null) {
            return (ViewGroup) parent;
        }
        throw new IllegalStateException("View " + viewGroup + " has not been mounted under ReactRootView");
    }

    public boolean d(MotionEvent motionEvent) {
        this.f = true;
        this.f17531b.s(motionEvent);
        this.f = false;
        return this.e;
    }

    public ViewGroup f() {
        return this.d;
    }

    public void g(int i, boolean z) {
        if (z) {
            UiThreadUtil.runOnUiThread(new a());
        }
    }

    public void h(boolean z) {
        if (this.f17531b == null || this.f) {
            return;
        }
        j();
    }

    public void i() {
        StringBuilder sb = new StringBuilder();
        sb.append("[GESTURE HANDLER] Tearing down gesture handler registered for root view ");
        sb.append(this.d);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) this.f17530a.getNativeModule(RNGestureHandlerModule.class);
        rNGestureHandlerModule.getRegistry().e(this.c.q());
        rNGestureHandlerModule.unregisterRootHelper(this);
    }

    public final void j() {
        oya oyaVar = this.c;
        if (oyaVar == null || oyaVar.p() != 2) {
            return;
        }
        this.c.a();
        this.c.g();
    }
}
