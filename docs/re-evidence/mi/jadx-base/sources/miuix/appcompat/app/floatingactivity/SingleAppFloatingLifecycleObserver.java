package miuix.appcompat.app.floatingactivity;

import android.view.View;
import android.view.ViewGroup;
import defpackage.ty9;
import defpackage.vy9;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes3.dex */
public class SingleAppFloatingLifecycleObserver extends FloatingLifecycleObserver {

    public class a extends TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<AppCompatActivity> f26342a;

        public a(AppCompatActivity appCompatActivity) {
            this.f26342a = new WeakReference<>(appCompatActivity);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            FloatingActivitySwitcher floatingActivitySwitcherO;
            View viewP;
            super.onComplete(obj);
            AppCompatActivity appCompatActivity = this.f26342a.get();
            if (appCompatActivity == null || appCompatActivity.isDestroyed() || (floatingActivitySwitcherO = FloatingActivitySwitcher.o()) == null || (viewP = floatingActivitySwitcherO.p()) == null) {
                return;
            }
            ((ViewGroup) appCompatActivity.getFloatingBrightPanel().getParent()).getOverlay().remove(viewP);
        }
    }

    public SingleAppFloatingLifecycleObserver(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    public final void d(AppCompatActivity appCompatActivity) {
        FloatingActivitySwitcher floatingActivitySwitcherO = FloatingActivitySwitcher.o();
        if (ty9.h(appCompatActivity) < 0 || appCompatActivity.isInFloatingWindowMode() || floatingActivitySwitcherO == null) {
            return;
        }
        floatingActivitySwitcherO.A(appCompatActivity);
        ty9.i(appCompatActivity, false);
    }

    public final void e(final AppCompatActivity appCompatActivity) {
        FloatingActivitySwitcher floatingActivitySwitcherO;
        final View viewP;
        if (ty9.f() || (floatingActivitySwitcherO = FloatingActivitySwitcher.o()) == null || (viewP = floatingActivitySwitcherO.p()) == null) {
            return;
        }
        viewP.post(new Runnable() { // from class: aem
            @Override // java.lang.Runnable
            public final void run() {
                this.f930a.f(viewP, appCompatActivity);
            }
        });
    }

    public final /* synthetic */ void f(View view, AppCompatActivity appCompatActivity) {
        View childAt = ((ViewGroup) view).getChildAt(0);
        if (childAt != null) {
            AnimConfig animConfigM = vy9.m(0, null);
            animConfigM.addListeners(new a(appCompatActivity));
            vy9.e(childAt, animConfigM);
        }
    }

    public final void g(AppCompatActivity appCompatActivity) {
        ArrayList<AppCompatActivity> arrayListN;
        int iM;
        AppCompatActivity appCompatActivity2;
        FloatingActivitySwitcher floatingActivitySwitcherO = FloatingActivitySwitcher.o();
        if (floatingActivitySwitcherO == null || (arrayListN = floatingActivitySwitcherO.n(appCompatActivity.getTaskId())) == null || (iM = floatingActivitySwitcherO.m(appCompatActivity) + 1) >= arrayListN.size() || (appCompatActivity2 = arrayListN.get(iM)) == null || !appCompatActivity2.isFinishing()) {
            return;
        }
        e(appCompatActivity);
    }

    @Override // miuix.appcompat.app.floatingactivity.FloatingLifecycleObserver
    public void onCreate() {
        AppCompatActivity appCompatActivityL;
        FloatingActivitySwitcher floatingActivitySwitcherO = FloatingActivitySwitcher.o();
        if (floatingActivitySwitcherO == null || (appCompatActivityL = floatingActivitySwitcherO.l(a(), b())) == null) {
            return;
        }
        if (floatingActivitySwitcherO.r(appCompatActivityL) == null) {
            d(appCompatActivityL);
            return;
        }
        if (!appCompatActivityL.isInFloatingWindowMode()) {
            floatingActivitySwitcherO.A(appCompatActivityL);
            ty9.i(appCompatActivityL, false);
        } else {
            if (floatingActivitySwitcherO.y(appCompatActivityL)) {
                return;
            }
            floatingActivitySwitcherO.A(appCompatActivityL);
            ty9.j(appCompatActivityL);
        }
    }

    @Override // miuix.appcompat.app.floatingactivity.FloatingLifecycleObserver
    public void onDestroy() {
        FloatingActivitySwitcher floatingActivitySwitcherO = FloatingActivitySwitcher.o();
        if (floatingActivitySwitcherO != null) {
            floatingActivitySwitcherO.D(a(), b());
        }
    }

    @Override // miuix.appcompat.app.floatingactivity.FloatingLifecycleObserver
    public void onResume() {
        AppCompatActivity appCompatActivityL;
        FloatingActivitySwitcher floatingActivitySwitcherO = FloatingActivitySwitcher.o();
        if (floatingActivitySwitcherO == null || (appCompatActivityL = floatingActivitySwitcherO.l(a(), b())) == null || !appCompatActivityL.isInFloatingWindowMode()) {
            return;
        }
        if (floatingActivitySwitcherO.r(appCompatActivityL) != null) {
            appCompatActivityL.hideFloatingDimBackground();
        }
        g(appCompatActivityL);
    }
}
