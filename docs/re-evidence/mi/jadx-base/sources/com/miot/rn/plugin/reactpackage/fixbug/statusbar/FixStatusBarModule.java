package com.miot.rn.plugin.reactpackage.fixbug.statusbar;

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
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.xiaomi.smarthome.library.DarkModeCompat;
import com.xiaomi.smarthome.library.commonapi.SystemApi;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.cm8;
import defpackage.e4f;
import defpackage.exh;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class FixStatusBarModule extends ReactContextBaseJavaModule {
    private static final String HEIGHT_KEY = "HEIGHT";
    private final boolean isDarkMode;
    private final boolean needTurnUIFlag;

    public class a extends GuardedRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f10215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f10216b;
        public final /* synthetic */ int c;

        /* JADX INFO: renamed from: com.miot.rn.plugin.reactpackage.fixbug.statusbar.FixStatusBarModule$a$a, reason: collision with other inner class name */
        public class C0317a implements ValueAnimator.AnimatorUpdateListener {
            public C0317a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                a.this.f10215a.getWindow().setStatusBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ReactContext reactContext, Activity activity, boolean z, int i) {
            super(reactContext);
            this.f10215a = activity;
            this.f10216b = z;
            this.c = i;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        @TargetApi(21)
        public void runGuarded() {
            this.f10215a.getWindow().addFlags(Integer.MIN_VALUE);
            if (!this.f10216b) {
                this.f10215a.getWindow().setStatusBarColor(this.c);
                return;
            }
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f10215a.getWindow().getStatusBarColor()), Integer.valueOf(this.c));
            valueAnimatorOfObject.addUpdateListener(new C0317a());
            valueAnimatorOfObject.setDuration(300L).setStartDelay(0L);
            valueAnimatorOfObject.start();
        }
    }

    public class b extends GuardedRunnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f10218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f10219b;

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
            this.f10218a = activity;
            this.f10219b = z;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        @TargetApi(21)
        public void runGuarded() {
            View decorView = this.f10218a.getWindow().getDecorView();
            if (this.f10219b) {
                decorView.setOnApplyWindowInsetsListener(new a());
            } else {
                decorView.setOnApplyWindowInsetsListener(null);
            }
            androidx.core.view.c.n0(decorView);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f10221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f10222b;

        public c(boolean z, Activity activity) {
            this.f10221a = z;
            this.f10222b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f10221a) {
                this.f10222b.getWindow().addFlags(1024);
                this.f10222b.getWindow().clearFlags(2048);
            } else {
                this.f10222b.getWindow().addFlags(2048);
                this.f10222b.getWindow().clearFlags(1024);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f10223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f10224b;

        public d(Activity activity, String str) {
            this.f10223a = activity;
            this.f10224b = str;
        }

        @Override // java.lang.Runnable
        @TargetApi(23)
        public void run() {
            View decorView = this.f10223a.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility((!"dark-content".equals(this.f10224b) ? FixStatusBarModule.this.needTurnUIFlag : !FixStatusBarModule.this.needTurnUIFlag) ? systemUiVisibility & (-8193) : systemUiVisibility | 8192);
        }
    }

    public FixStatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.isDarkMode = DarkModeCompat.isDarkMode(reactApplicationContext);
        this.needTurnUIFlag = needTurnUIFlag();
    }

    private boolean needTurnUIFlag() {
        return this.isDarkMode && (SystemApi.isSamsungPhone() || SystemApi.isOppoPhone() || SystemApi.isVivoPhone() || SystemApi.isOnePlusPhone());
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        int identifier = reactApplicationContext.getResources().getIdentifier("status_bar_height", "dimen", PluginPackageConstant.RN_DIR_A);
        float fA = identifier > 0 ? exh.a(reactApplicationContext.getResources().getDimensionPixelSize(identifier)) : 0.0f;
        cm8.n("ReactNative", "StatusBarModule getConstants  height: " + fA);
        return e4f.d(HEIGHT_KEY, Float.valueOf(fA));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return StatusBarModule.NAME;
    }

    @ReactMethod
    public void setColor(int i, boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            cm8.C("ReactNative", "StatusBarModule setColor: Ignored status bar change, current activity is null.");
            return;
        }
        cm8.n("ReactNative", "StatusBarModule: animated=" + z);
        UiThreadUtil.runOnUiThread(new a(getReactApplicationContext(), currentActivity, z, i));
    }

    @ReactMethod
    public void setHidden(boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            cm8.C("ReactNative", "StatusBarModule setHidden: Ignored status bar change, current activity is null.");
            return;
        }
        cm8.n("ReactNative", "StatusBarModule: hidden=" + z);
        UiThreadUtil.runOnUiThread(new c(z, currentActivity));
    }

    @ReactMethod
    public void setStyle(String str) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            cm8.C("ReactNative", "StatusBarModule  setStyle: Ignored status bar change, current activity is null.");
            return;
        }
        cm8.n("ReactNative", "StatusBarModule: style=" + str);
        UiThreadUtil.runOnUiThread(new d(currentActivity, str));
    }

    @ReactMethod
    public void setTranslucent(boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            cm8.C("ReactNative", "StatusBarModule setTranslucent: Ignored status bar change, current activity is null.");
            return;
        }
        cm8.n("ReactNative", "StatusBarModule: translucent=" + z);
        UiThreadUtil.runOnUiThread(new b(getReactApplicationContext(), currentActivity, z));
    }
}
