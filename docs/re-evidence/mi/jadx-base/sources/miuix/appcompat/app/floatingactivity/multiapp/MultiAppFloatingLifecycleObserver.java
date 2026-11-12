package miuix.appcompat.app.floatingactivity.multiapp;

import android.view.View;
import android.view.ViewGroup;
import defpackage.ty9;
import defpackage.vy9;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.appcompat.app.AppCompatActivity;
import miuix.appcompat.app.floatingactivity.FloatingLifecycleObserver;

/* JADX INFO: loaded from: classes3.dex */
public class MultiAppFloatingLifecycleObserver extends FloatingLifecycleObserver {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f26360a;

        public a(AppCompatActivity appCompatActivity) {
            this.f26360a = appCompatActivity;
        }

        @Override // java.lang.Runnable
        public void run() {
            MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherC = MultiAppFloatingActivitySwitcher.C();
            if (multiAppFloatingActivitySwitcherC != null) {
                if (multiAppFloatingActivitySwitcherC.A(MultiAppFloatingLifecycleObserver.this.b()) > 1 || multiAppFloatingActivitySwitcherC.E(MultiAppFloatingLifecycleObserver.this.b()) > 1) {
                    if (ty9.f()) {
                        AppCompatActivity appCompatActivity = this.f26360a;
                        ty9.i(appCompatActivity, appCompatActivity.isInFloatingWindowMode());
                    } else if (this.f26360a.isInFloatingWindowMode()) {
                        this.f26360a.executeOpenEnterAnimation();
                        multiAppFloatingActivitySwitcherC.S(MultiAppFloatingLifecycleObserver.this.b(), MultiAppFloatingLifecycleObserver.this.a());
                    }
                }
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f26362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f26363b;

        public class a extends TransitionListener {
            public a() {
            }

            @Override // miuix.animation.listener.TransitionListener
            public void onComplete(Object obj) {
                super.onComplete(obj);
                ((ViewGroup) b.this.f26363b.getParent()).getOverlay().remove(b.this.f26362a);
                MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherC = MultiAppFloatingActivitySwitcher.C();
                if (multiAppFloatingActivitySwitcherC != null) {
                    multiAppFloatingActivitySwitcherC.c0(null);
                }
            }
        }

        public b(View view, View view2) {
            this.f26362a = view;
            this.f26363b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            View childAt = ((ViewGroup) this.f26362a).getChildAt(0);
            AnimConfig animConfigM = vy9.m(0, null);
            animConfigM.addListeners(new a());
            vy9.e(childAt, animConfigM);
        }
    }

    public MultiAppFloatingLifecycleObserver(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    private void g(AppCompatActivity appCompatActivity) {
        int iH = ty9.h(appCompatActivity);
        boolean z = iH >= 0 && !appCompatActivity.isInFloatingWindowMode();
        MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherC = MultiAppFloatingActivitySwitcher.C();
        if (multiAppFloatingActivitySwitcherC != null) {
            if (!z || iH != 0) {
                if (z) {
                    multiAppFloatingActivitySwitcherC.R(appCompatActivity.getTaskId(), appCompatActivity.getActivityIdentity());
                }
            } else {
                multiAppFloatingActivitySwitcherC.R(appCompatActivity.getTaskId(), appCompatActivity.getActivityIdentity());
                if (ty9.f()) {
                    ty9.i(appCompatActivity, false);
                } else {
                    ty9.b(appCompatActivity);
                }
            }
        }
    }

    private void h(AppCompatActivity appCompatActivity) {
        View viewD;
        MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherC = MultiAppFloatingActivitySwitcher.C();
        if (multiAppFloatingActivitySwitcherC == null || (viewD = multiAppFloatingActivitySwitcherC.D()) == null) {
            return;
        }
        viewD.post(new b(viewD, appCompatActivity.getFloatingBrightPanel()));
    }

    @Override // miuix.appcompat.app.floatingactivity.FloatingLifecycleObserver
    public void onCreate() {
        AppCompatActivity appCompatActivityY;
        MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherC = MultiAppFloatingActivitySwitcher.C();
        if (multiAppFloatingActivitySwitcherC == null || (appCompatActivityY = multiAppFloatingActivitySwitcherC.y(b(), a())) == null) {
            return;
        }
        multiAppFloatingActivitySwitcherC.X(b(), a(), new a(appCompatActivityY));
        g(appCompatActivityY);
    }

    @Override // miuix.appcompat.app.floatingactivity.FloatingLifecycleObserver
    public void onDestroy() {
        MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherC = MultiAppFloatingActivitySwitcher.C();
        if (multiAppFloatingActivitySwitcherC != null) {
            multiAppFloatingActivitySwitcherC.u(b(), a());
            multiAppFloatingActivitySwitcherC.Z(b(), a());
            if (multiAppFloatingActivitySwitcherC.A(b()) <= 0) {
                multiAppFloatingActivitySwitcherC.c0(null);
            }
        }
    }

    @Override // miuix.appcompat.app.floatingactivity.FloatingLifecycleObserver
    public void onPause() {
        MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherC = MultiAppFloatingActivitySwitcher.C();
        if (multiAppFloatingActivitySwitcherC != null) {
            multiAppFloatingActivitySwitcherC.i0(b(), a(), false);
        }
    }

    @Override // miuix.appcompat.app.floatingactivity.FloatingLifecycleObserver
    public void onResume() {
        AppCompatActivity appCompatActivityY;
        MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherC = MultiAppFloatingActivitySwitcher.C();
        if (multiAppFloatingActivitySwitcherC == null || (appCompatActivityY = multiAppFloatingActivitySwitcherC.y(b(), a())) == null) {
            return;
        }
        multiAppFloatingActivitySwitcherC.i0(b(), a(), true);
        multiAppFloatingActivitySwitcherC.r(b(), a());
        if (!multiAppFloatingActivitySwitcherC.K(b(), a()) || ty9.f()) {
            return;
        }
        appCompatActivityY.executeCloseEnterAnimation();
        h(appCompatActivityY);
    }
}
