package com.facebook.react.modules.statusbar;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.view.View;
import android.view.WindowInsets;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.cm8;
import defpackage.e4f;
import defpackage.exh;
import defpackage.ndj;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = StatusBarModule.NAME)
public class StatusBarModule extends ReactContextBaseJavaModule {
    private static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
    private static final String HEIGHT_KEY = "HEIGHT";
    public static final String NAME = "StatusBarManager";

    public class a extends GuardedRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f7437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f7438b;
        public final /* synthetic */ int c;

        /* JADX INFO: renamed from: com.facebook.react.modules.statusbar.StatusBarModule$a$a, reason: collision with other inner class name */
        public class C0168a implements ValueAnimator.AnimatorUpdateListener {
            public C0168a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                a.this.f7437a.getWindow().setStatusBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ReactContext reactContext, Activity activity, boolean z, int i) {
            super(reactContext);
            this.f7437a = activity;
            this.f7438b = z;
            this.c = i;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        @TargetApi(21)
        public void runGuarded() {
            this.f7437a.getWindow().addFlags(Integer.MIN_VALUE);
            if (!this.f7438b) {
                this.f7437a.getWindow().setStatusBarColor(this.c);
                return;
            }
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f7437a.getWindow().getStatusBarColor()), Integer.valueOf(this.c));
            valueAnimatorOfObject.addUpdateListener(new C0168a());
            valueAnimatorOfObject.setDuration(300L).setStartDelay(0L);
            valueAnimatorOfObject.start();
        }
    }

    public class b extends GuardedRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f7440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f7441b;

        public class a implements View.OnApplyWindowInsetsListener {
            public a() {
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
                return windowInsetsOnApplyWindowInsets.replaceSystemWindowInsets(windowInsetsOnApplyWindowInsets.getSystemWindowInsetLeft(), 0, windowInsetsOnApplyWindowInsets.getSystemWindowInsetRight(), windowInsetsOnApplyWindowInsets.getSystemWindowInsetBottom());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ReactContext reactContext, Activity activity, boolean z) {
            super(reactContext);
            this.f7440a = activity;
            this.f7441b = z;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        @TargetApi(21)
        public void runGuarded() {
            View decorView = this.f7440a.getWindow().getDecorView();
            if (this.f7441b) {
                decorView.setOnApplyWindowInsetsListener(new a());
            } else {
                decorView.setOnApplyWindowInsetsListener(null);
            }
            androidx.core.view.c.n0(decorView);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f7443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f7444b;

        public c(boolean z, Activity activity) {
            this.f7443a = z;
            this.f7444b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7443a) {
                this.f7444b.getWindow().addFlags(1024);
                this.f7444b.getWindow().clearFlags(2048);
            } else {
                this.f7444b.getWindow().addFlags(2048);
                this.f7444b.getWindow().clearFlags(1024);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f7445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f7446b;

        public d(Activity activity, String str) {
            this.f7445a = activity;
            this.f7446b = str;
        }

        @Override // java.lang.Runnable
        @TargetApi(23)
        public void run() {
            View decorView = this.f7445a.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility("dark-content".equals(this.f7446b) ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
    }

    public StatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Activity currentActivity = getCurrentActivity();
        int identifier = reactApplicationContext.getResources().getIdentifier("status_bar_height", "dimen", PluginPackageConstant.RN_DIR_A);
        return e4f.e(HEIGHT_KEY, Float.valueOf(identifier > 0 ? exh.a(reactApplicationContext.getResources().getDimensionPixelSize(identifier)) : 0.0f), DEFAULT_BACKGROUND_COLOR_KEY, currentActivity != null ? String.format("#%06X", Integer.valueOf(currentActivity.getWindow().getStatusBarColor() & 16777215)) : "black");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void setColor(int i, boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            cm8.C("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new a(getReactApplicationContext(), currentActivity, z, i));
        }
    }

    @ReactMethod
    public void setHidden(boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            cm8.C("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new c(z, currentActivity));
        }
    }

    @ReactMethod
    public void setStyle(String str) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            cm8.C("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new d(currentActivity, str));
        }
    }

    @ReactMethod
    public void setTranslucent(boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            cm8.C("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new b(getReactApplicationContext(), currentActivity, z));
        }
    }
}
