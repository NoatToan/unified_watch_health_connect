package com.huawei.hwarkuix;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.pressure.PressureApi;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.transition.ActivityTransitionAnimator;
import defpackage.qjb;
import defpackage.qji;
import defpackage.qre;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import ohos.stage.ability.adapter.StageActivity;

/* JADX INFO: loaded from: classes36.dex */
public class BaseActivity extends StageActivity {
    private static final String CLEAN_ACTIVITY = "com.huawei.commonui.CLEAN_ACTIVITY";
    private static final String DARK_FLAG = "MEIZU_FLAG_DARK_STATUS_BAR_ICON";
    private static final int DEFAULT_THEME_ID = 0;
    private static final String DEF_VALUE = "[]";
    private static final String EMUI_STYLE = "androidhwext:style/Theme.Emui.NoActionBar";
    private static final int LIGHT_FLAG = 0;
    private static final String MANUFACTURER_FLAG_GOOGLE = "google";
    private static final String MANUFACTURER_FLAG_MEIZU = "meizu";
    private static final String MANUFACTURER_FLAG_MIUI = "xiaomi";
    private static final String MEIZU_FLAG = "meizuFlags";
    private static final String STATUS_BAR_MIUI_CLASS_NAME = "android.view.MiuiWindowManager$LayoutParams";
    private static final String STATUS_BAR_MIUI_FIELD = "EXTRA_FLAG_STATUS_BAR_DARK_MODE";
    private static final String STATUS_BAR_MIUI_METHOD = "setExtraFlags";
    private static final String TAG = "ArkUIX_BaseActivity";
    private CleanActivityBroadcastReceiver mClearActivityBroadcastReceiver;
    private boolean mIsFirstResume = true;
    private int mThemeResources = 0;
    private int mModuleType = 0;

    static class CleanActivityBroadcastReceiver extends BroadcastReceiver {
        private final WeakReference<Activity> mWeakReference;

        CleanActivityBroadcastReceiver(Activity activity) {
            this.mWeakReference = new WeakReference<>(activity);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Activity activity;
            if (intent == null || intent.getAction() == null) {
                return;
            }
            LogUtil.a(BaseActivity.TAG, "mBroadcast Start action = ", intent.getAction());
            if (!"com.huawei.commonui.CLEAN_ACTIVITY".equals(intent.getAction()) || (activity = this.mWeakReference.get()) == null) {
                return;
            }
            activity.finish();
        }
    }

    @Override // ohos.stage.ability.adapter.StageActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str = "com.huawei.hmos.health:" + getModuleName() + ":ArkuixAbility:";
        setInstanceName(str);
        ReleaseLogUtil.c(TAG, "onCreate INSTANCE_NAME = ", str);
        super.onCreate(bundle);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.commonui.CLEAN_ACTIVITY");
        this.mClearActivityBroadcastReceiver = new CleanActivityBroadcastReceiver(this);
        LocalBroadcastManager.getInstance().registerReceiver(this.mClearActivityBroadcastReceiver, intentFilter);
        this.mThemeResources = getResources().getIdentifier(EMUI_STYLE, null, null);
        this.mModuleType = getIntent().getIntExtra(ArkUIXConstants.ARKUIX_MODULE_TYPE_KEY, 0);
        initSystemBar();
        setNavigationBarColor();
    }

    protected String getModuleName() {
        return "arkuix";
    }

    @Override // ohos.stage.ability.adapter.StageActivity, android.app.Activity
    public void onDestroy() {
        BaseDialog.cleanAllDialog(this);
        qji.d(toString());
        super.onDestroy();
        if (this.mClearActivityBroadcastReceiver != null) {
            LocalBroadcastManager.getInstance().unregisterReceiver(this.mClearActivityBroadcastReceiver);
        }
    }

    private void setNavigationBarColor() {
        if (isGoogle()) {
            return;
        }
        if (CommonUtil.bg() || isFlyme() || Build.VERSION.SDK_INT >= 29) {
            Window window = getWindow();
            if (window == null) {
                ReleaseLogUtil.d(TAG, "setNavigationBarColor window is null");
            } else {
                window.setNavigationBarColor(qre.e(this, com.huawei.health.arkuixengine.R.color.arkcolorBackground));
            }
        }
    }

    protected void initSystemBar() {
        Window window = getWindow();
        if (window == null) {
            ReleaseLogUtil.d(TAG, "initSystemBar window is null");
            return;
        }
        boolean zIsDarkMode = isDarkMode(getApplicationContext());
        if (this.mThemeResources == 0 && isMiui()) {
            setTranslucentStatus(window);
            setXiaoMiStatusBar(window, zIsDarkMode);
            setContentPadding(window, zIsDarkMode);
        } else if (this.mThemeResources == 0 && isFlyme()) {
            setTranslucentStatus(window);
            setMeiZuStatusBar(window, zIsDarkMode);
        } else {
            setTranslucentStatus(window);
            setStatusBarMode(window, zIsDarkMode);
        }
    }

    private static void setMeiZuStatusBar(Window window, boolean z) {
        try {
            WindowManager.LayoutParams attributes = window.getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField(DARK_FLAG);
            Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField(MEIZU_FLAG);
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            int i = declaredField.getInt(null);
            int i2 = declaredField2.getInt(attributes);
            declaredField2.setInt(attributes, z ? (~i) & i2 : i | i2);
            window.setAttributes(attributes);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            ReleaseLogUtil.b(TAG, "setMeiZuStatusBar exception ", ExceptionUtils.c(e));
        }
        if (z) {
            LogUtil.a(TAG, "setMeiZuStatusBar isDarkMode");
        } else {
            window.getDecorView().setSystemUiVisibility(8192);
        }
    }

    public static boolean isDarkMode(Context context) {
        if (context != null) {
            return Build.VERSION.SDK_INT > 28 && (context.getResources().getConfiguration().uiMode & 48) == 32;
        }
        LogUtil.j(TAG, "isDarkMode: contxet is null");
        return false;
    }

    public static boolean isGoogle() {
        return Build.BRAND.toLowerCase(Locale.ENGLISH).contains(MANUFACTURER_FLAG_GOOGLE);
    }

    private static void setXiaoMiStatusBar(Window window, boolean z) {
        Class<?> cls = window.getClass();
        try {
            Class<?> cls2 = Class.forName(STATUS_BAR_MIUI_CLASS_NAME);
            int i = cls2.getField(STATUS_BAR_MIUI_FIELD).getInt(cls2);
            cls.getMethod(STATUS_BAR_MIUI_METHOD, Integer.TYPE, Integer.TYPE).invoke(window, Integer.valueOf(z ? 0 : i), Integer.valueOf(i));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            ReleaseLogUtil.b(TAG, "setXiaoMiStatusBar exception ", ExceptionUtils.c(e));
        }
        if (z) {
            LogUtil.a(TAG, "setXiaoMiStatusBar isDarkMode");
        } else {
            window.getDecorView().setSystemUiVisibility(8192);
        }
    }

    private void setStatusBarMode(Window window, boolean z) {
        int systemUiVisibility;
        int i;
        View decorView = window.getDecorView();
        if (z) {
            systemUiVisibility = (decorView.getSystemUiVisibility() & (-8193)) | 256;
            if (!PermissionUtil.d()) {
                i = -2;
            }
            window.setLayout(-1, i);
            decorView.setSystemUiVisibility(systemUiVisibility);
            setContentPadding(window, z);
        }
        systemUiVisibility = CommonUtil.bb() ? decorView.getSystemUiVisibility() | 8192 : 8192;
        i = -1;
        window.setLayout(-1, i);
        decorView.setSystemUiVisibility(systemUiVisibility);
        setContentPadding(window, z);
    }

    private void setContentPadding(Window window, boolean z) {
        if (!z || PermissionUtil.d()) {
            final View viewFindViewById = window.getDecorView().findViewById(android.R.id.content);
            if (viewFindViewById == null) {
                ReleaseLogUtil.d(TAG, "setContentPadding content is null");
            } else {
                ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new OnApplyWindowInsetsListener() { // from class: com.huawei.hwarkuix.BaseActivity.1
                    @Override // androidx.core.view.OnApplyWindowInsetsListener
                    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                        LogUtil.a(BaseActivity.TAG, "onApplyWindowInsets enter!");
                        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
                        health.compact.a.LogUtil.b(BaseActivity.TAG, "initView onApplyWindowInsets insets:", insets);
                        viewFindViewById.setPadding(0, insets.top, 0, insets.bottom);
                        return windowInsetsCompat;
                    }
                });
                ViewCompat.requestApplyInsets(viewFindViewById);
            }
        }
    }

    private void setTranslucentStatus(Window window) {
        if (this.mThemeResources == 0) {
            window.clearFlags(67108864);
            window.getDecorView().setSystemUiVisibility(256);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            return;
        }
        window.setStatusBarColor(qre.e(this, com.huawei.health.arkuixengine.R.color.arkcolorBackground));
    }

    public static boolean isMiui() {
        return MANUFACTURER_FLAG_MIUI.equalsIgnoreCase(Build.MANUFACTURER);
    }

    public static boolean isFlyme() {
        return Build.MANUFACTURER.equalsIgnoreCase(MANUFACTURER_FLAG_MEIZU);
    }

    @Override // ohos.stage.ability.adapter.StageActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.mIsFirstResume && ActivityTransitionAnimator.c().a()) {
            this.mIsFirstResume = false;
            return;
        }
        this.mIsFirstResume = false;
        setContentPadding(getWindow(), isDarkMode(getApplicationContext()));
        initMinibar();
    }

    protected void initMinibar() {
        LogUtil.a(TAG, "initMinibar");
        View viewB = qjb.c().b();
        if (viewB == null) {
            return;
        }
        qjb.c().d();
        FrameLayout frameLayout = (FrameLayout) getWindow().getDecorView().findViewById(android.R.id.content);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 80;
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.bottomMargin = getMiniBarBottomMargin();
        viewB.setVisibility(0);
        frameLayout.addView(viewB, layoutParams);
        int childCount = frameLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = frameLayout.getChildAt(i);
            if (childAt instanceof SurfaceView) {
                ((SurfaceView) childAt).setZOrderOnTop(false);
            }
        }
        LogUtil.a(TAG, "initMinibar end");
    }

    private int getMiniBarBottomMargin() {
        int i = this.mModuleType;
        if (1 == i) {
            if ("[]".equals(((PressureApi) Services.b("Main", PressureApi.class)).getSupportPressureDevice())) {
                return qre.b(com.huawei.ui.commonui.R.dimen.health_common_0dp);
            }
            return qre.b(com.huawei.ui.commonui.R.dimen.health_common_48dp);
        }
        if (6 == i) {
            return qre.b(com.huawei.ui.commonui.R.dimen.health_common_48dp);
        }
        if (5 == i) {
            return qre.b(com.huawei.ui.commonui.R.dimen.health_common_48dp);
        }
        return 0;
    }
}
