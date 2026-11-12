package defpackage;

import android.view.View;
import com.xiaomi.smarthome.library.bluetooth.OTAErrorCode;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.ViewProperty;
import miuix.animation.utils.EaseManager;

/* JADX INFO: loaded from: classes3.dex */
public class vy9 {

    public class a extends TransitionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f37359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AnimConfig f37360b;

        public a(Runnable runnable, AnimConfig animConfig) {
            this.f37359a = runnable;
            this.f37360b = animConfig;
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onCancel(Object obj) {
            super.onCancel(obj);
            Runnable runnable = this.f37359a;
            if (runnable != null) {
                runnable.run();
            }
            this.f37360b.removeListeners(this);
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object obj) {
            super.onComplete(obj);
            Runnable runnable = this.f37359a;
            if (runnable != null) {
                runnable.run();
            }
            this.f37360b.removeListeners(this);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f37361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AnimConfig f37362b;

        public b(View view, AnimConfig animConfig) {
            this.f37361a = view;
            this.f37362b = animConfig;
        }

        @Override // java.lang.Runnable
        public void run() {
            vy9.j(this.f37361a, this.f37362b);
        }
    }

    public static void b(View view) {
        c(view, null);
    }

    public static void c(View view, AnimConfig animConfig) {
        AnimState animState = new AnimState();
        ViewProperty viewProperty = ViewProperty.TRANSLATION_X;
        AnimState animStateAdd = animState.add(viewProperty, 0);
        IStateStyle to = Folme.useAt(view).state().setTo(viewProperty, Integer.valueOf(OTAErrorCode.READ_FRIMWARE_VERSION_FAIL));
        AnimConfig[] animConfigArr = new AnimConfig[1];
        if (animConfig == null) {
            animConfig = m(0, null);
        }
        animConfigArr[0] = animConfig;
        to.to(animStateAdd, animConfigArr);
    }

    public static void d(View view) {
        e(view, null);
    }

    public static void e(View view, AnimConfig animConfig) {
        int width = view.getWidth();
        AnimState animState = new AnimState();
        ViewProperty viewProperty = ViewProperty.TRANSLATION_X;
        AnimState animStateAdd = animState.add(viewProperty, width);
        IStateStyle to = Folme.useAt(view).state().setTo(viewProperty, 0);
        AnimConfig[] animConfigArr = new AnimConfig[1];
        if (animConfig == null) {
            animConfig = k();
        }
        animConfigArr[0] = animConfig;
        to.to(animStateAdd, animConfigArr);
    }

    public static void f(View view) {
        g(view, null);
    }

    public static void g(View view, AnimConfig animConfig) {
        if (view.isAttachedToWindow()) {
            j(view, animConfig);
        } else {
            view.post(new b(view, animConfig));
        }
    }

    public static void h(View view) {
        i(view, null);
    }

    public static void i(View view, AnimConfig animConfig) {
        AnimState animStateAdd = new AnimState().add(ViewProperty.TRANSLATION_X, -200.0d);
        IStateStyle iStateStyleState = Folme.useAt(view).state();
        AnimConfig[] animConfigArr = new AnimConfig[1];
        if (animConfig == null) {
            animConfig = m(0, null);
        }
        animConfigArr[0] = animConfig;
        iStateStyleState.to(animStateAdd, animConfigArr);
    }

    public static void j(View view, AnimConfig animConfig) {
        AnimState animState = new AnimState();
        ViewProperty viewProperty = ViewProperty.TRANSLATION_X;
        AnimState animStateAdd = animState.add(viewProperty, 0.0d);
        IStateStyle to = Folme.useAt(view).state().setTo(viewProperty, Integer.valueOf(view.getWidth()));
        AnimConfig[] animConfigArr = new AnimConfig[1];
        if (animConfig == null) {
            animConfig = k();
        }
        animConfigArr[0] = animConfig;
        to.to(animStateAdd, animConfigArr);
    }

    public static AnimConfig k() {
        return m(0, null);
    }

    public static AnimConfig l(int i) {
        AnimConfig animConfig = new AnimConfig();
        if (i == 1) {
            animConfig.setEase(EaseManager.getStyle(-2, 0.85f, 0.3f));
        } else if (i != 2) {
            animConfig.setEase(EaseManager.getStyle(-2, 1.0f, 0.46f));
        } else {
            animConfig.setEase(EaseManager.getStyle(-2, 0.95f, 0.3f));
        }
        return animConfig;
    }

    public static AnimConfig m(int i, Runnable runnable) {
        AnimConfig animConfigL = l(i);
        if (runnable != null) {
            animConfigL.addListeners(new a(runnable, animConfigL));
        }
        return animConfigL;
    }
}
