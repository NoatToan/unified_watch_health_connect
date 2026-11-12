package ohos.stage.ability.adapter;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.openalliance.ad.constant.ParamConstants;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import ohos.ace.adapter.ALog;
import ohos.ace.adapter.WindowViewInterface;

/* JADX INFO: loaded from: classes20.dex */
public class SubWindowManager {
    private static final int API_28 = 28;
    private static final int API_29 = 29;
    private static final int API_30 = 30;
    private static final int HORIZONTAL = 2;
    private static final int LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES = 1;
    private static final int LOCATION_SIZE = 2;
    private static final int LOCATION_X = 0;
    private static final int LOCATION_Y = 1;
    private static final int NO_HEIGHT = 0;
    private static final int REVERSE_HORIZONTAL = 4;
    private static final int REVERSE_VERTICAL = 3;
    private static final String TAG = "SubWindowManager";
    private static final int UI_DARK_COLOR = 1711276032;
    private static final int UI_LIGHT_COLOR = -436207617;
    private static final int UNSPECIFIED = 0;
    private static final int VERTICAL = 1;
    private static SubWindowManager sinstance = null;
    public static int uiOptionsStatic = 4096;
    private String mInstanceName;
    private Activity mRootActivity;
    private Map<String, SubWindow> mSubWindowMap = new HashMap();
    private int uiOptions_ = 4096;

    private native void nativeSetupSubWindowManager();

    private SubWindowManager() {
        ALog.d(TAG, "SubWindowManager created.");
        nativeSetupSubWindowManager();
    }

    public static final SubWindowManager getInstance() {
        if (sinstance == null) {
            synchronized (SubWindowManager.class) {
                if (sinstance == null) {
                    sinstance = new SubWindowManager();
                }
            }
        }
        return sinstance;
    }

    public void setActivity(Activity activity, String str) {
        ALog.d(TAG, "setActivity called, instanceName: " + str);
        this.mRootActivity = activity;
        this.mInstanceName = str;
        if (activity != null) {
            int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
            this.uiOptions_ |= systemUiVisibility;
            uiOptionsStatic = systemUiVisibility | uiOptionsStatic;
        }
    }

    public void releaseActivity(String str) {
        ALog.d(TAG, "releaseActivity called, instanceName: " + str + ", mInstanceName: " + this.mInstanceName);
        if (str == this.mInstanceName) {
            this.mRootActivity = null;
        }
    }

    public boolean createSubWindow(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ALog.d(TAG, "createSubWindow called: " + String.format(Locale.ENGLISH, "name=%s type=%d mode=%d tag=%d parentId=%d x=%d y=%d width=%d height=%d", str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)));
        if (this.mRootActivity == null) {
            ALog.e(TAG, "createSubWindow failed mRootActivity is invalid");
            return false;
        }
        if (this.mSubWindowMap.get(str) == null) {
            SubWindow subWindow = new SubWindow(this.mRootActivity, str);
            subWindow.createSubWindow(i, i2, i3, i4, i5, i6, i7, i8);
            this.mSubWindowMap.put(str, subWindow);
            return true;
        }
        ALog.e(TAG, "SubWindow " + str + " already created.");
        return false;
    }

    public View getContentView(String str) {
        ALog.d(TAG, "getContentView called. name=" + str);
        SubWindow subWindow = this.mSubWindowMap.get(str);
        if (subWindow != null) {
            return subWindow.getContentView();
        }
        return null;
    }

    public int getWindowId(String str) {
        ALog.d(TAG, "getWindowId called. name=" + str);
        SubWindow subWindow = this.mSubWindowMap.get(str);
        if (subWindow != null) {
            return subWindow.getWindowId();
        }
        return -1;
    }

    public View getTopWindow() {
        ALog.d(TAG, "getTopWindow called. ");
        Activity activity = this.mRootActivity;
        if (activity == null) {
            return null;
        }
        View viewFindFocus = activity.getWindow().getDecorView().findFocus();
        if (viewFindFocus instanceof WindowViewInterface) {
            return viewFindFocus;
        }
        return null;
    }

    public boolean showWindow(String str) {
        ALog.d(TAG, "showWindow called. name=" + str);
        SubWindow subWindow = this.mSubWindowMap.get(str);
        if (subWindow != null) {
            subWindow.showWindow();
            if (subWindow.getSubWindowView().isShowing()) {
                return true;
            }
            ALog.e(TAG, "showWindow failed due to not shown.");
            return false;
        }
        ALog.e(TAG, "not found SubWindow: " + str);
        return false;
    }

    public boolean isShowing(String str) {
        ALog.d(TAG, "isShowing called. name=" + str);
        SubWindow subWindow = this.mSubWindowMap.get(str);
        if (subWindow != null) {
            if (subWindow.getSubWindowView().isShowing()) {
                ALog.e(TAG, "sub window is shown.");
                return true;
            }
            ALog.e(TAG, "sub window is not shown.");
            return false;
        }
        ALog.e(TAG, "not found SubWindow: " + str);
        return false;
    }

    public boolean resize(String str, int i, int i2) {
        ALog.d(TAG, "resize called. name=" + str + ", width=" + i + ", height=" + i2);
        SubWindow subWindow = this.mSubWindowMap.get(str);
        if (subWindow != null) {
            subWindow.resize(i, i2);
            return true;
        }
        ALog.e(TAG, "not found SubWindow: " + str);
        return false;
    }

    public boolean moveWindowTo(String str, int i, int i2) {
        ALog.d(TAG, "moveWindowTo called. name=" + str + ", x=" + i + ", y=" + i2);
        SubWindow subWindow = this.mSubWindowMap.get(str);
        if (subWindow != null) {
            subWindow.moveWindowTo(i, i2);
            return true;
        }
        ALog.e(TAG, "not found SubWindow: " + str);
        return false;
    }

    public boolean destroyWindow(String str) {
        ALog.d(TAG, "destroyWindow called. name=" + str);
        SubWindow subWindow = this.mSubWindowMap.get(str);
        if (subWindow != null) {
            subWindow.destroyWindow();
            this.mSubWindowMap.remove(str);
            return true;
        }
        ALog.e(TAG, "not found SubWindow: " + str);
        return false;
    }

    public boolean setBackgroundColor(int i) {
        ALog.d(TAG, "setBackgroundColor called: color=" + i);
        Activity activity = this.mRootActivity;
        if (activity == null) {
            return false;
        }
        activity.getCurrentFocus().setBackgroundColor(i);
        return true;
    }

    public boolean setAppScreenBrightness(float f) {
        ALog.d(TAG, "setAppScreenBrightness called: birghtessValue=" + f);
        Activity activity = this.mRootActivity;
        if (activity == null) {
            return false;
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = f;
        window.setAttributes(attributes);
        return true;
    }

    public float getAppScreenBrightness() {
        int i;
        Activity activity = this.mRootActivity;
        if (activity == null) {
            ALog.e(TAG, "getAppScreenBrightness failed, mRootActivity is null");
            return 0.0f;
        }
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        if (attributes != null) {
            if (attributes.screenBrightness != -1.0f) {
                ALog.d(TAG, "getAppScreenBrightness called: brightnessValue=" + attributes.screenBrightness);
                return attributes.screenBrightness;
            }
            ALog.e(TAG, "getAppScreenBrightness is not set, use system brightness");
        }
        try {
            i = Settings.System.getInt(this.mRootActivity.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException unused) {
            ALog.e(TAG, "getAppScreenBrightness is not set, query system brightness exception");
            i = 0;
        }
        float f = i / 255.0f;
        ALog.d(TAG, "getAppScreenBrightness called: system brightnessValue=" + f);
        return f;
    }

    public boolean setKeepScreenOn(boolean z) {
        ALog.d(TAG, "setKeepScreenOn called: keepScreenOn=" + z);
        Activity activity = this.mRootActivity;
        if (activity == null) {
            return false;
        }
        Window window = activity.getWindow();
        if (z) {
            window.addFlags(128);
            return true;
        }
        window.clearFlags(128);
        return true;
    }

    public boolean isKeepScreenOn() {
        ALog.d(TAG, "isKeepScreenOn called");
        Activity activity = this.mRootActivity;
        return (activity == null || (activity.getWindow().getAttributes().flags & 128) == 0) ? false : true;
    }

    public boolean requestOrientation(int i) {
        ALog.d(TAG, "requestOrientation called: direction=" + i);
        int i2 = 0;
        if (this.mRootActivity == null) {
            return false;
        }
        if (i == 0 || i == 1) {
            i2 = 1;
        } else if (i == 2) {
            i2 = 8;
        } else if (i == 3) {
            i2 = 9;
        } else if (i != 4) {
            ALog.e(TAG, "unspecified orientation: -1");
            i2 = -1;
        }
        this.mRootActivity.setRequestedOrientation(i2);
        return true;
    }

    private void setLayoutInDisplayCutoutMode(Window window) {
        if (window == null) {
            ALog.e(TAG, "setLayoutInDisplayCutoutMode failed.");
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        try {
            Field declaredField = Class.forName("android.view.WindowManager$LayoutParams").getDeclaredField(ParamConstants.Param.LAYOUT_IN_DISPLAY_CUTOUT_MODE);
            declaredField.setAccessible(true);
            declaredField.setInt(attributes, 1);
            window.setAttributes(attributes);
        } catch (ClassNotFoundException unused) {
            ALog.e(TAG, "layoutParamsClass Class.forName failed, ClassNotFoundException.");
        } catch (IllegalAccessException unused2) {
            ALog.e(TAG, "layoutParamsClass AccessException failed, IllegalAccessException.");
        } catch (NoSuchFieldException unused3) {
            ALog.e(TAG, "layoutParamsClass getDeclaredField failed, NoSuchFieldException.");
        }
    }

    public static void keepSystemUiVisibility(Activity activity) {
        if (activity == null || Build.VERSION.SDK_INT >= 30) {
            return;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(uiOptionsStatic);
    }

    private boolean setSystemUiVisibilityInner() {
        Activity activity = this.mRootActivity;
        if (activity == null) {
            return false;
        }
        Window window = activity.getWindow();
        if (Build.VERSION.SDK_INT >= 28) {
            setLayoutInDisplayCutoutMode(window);
        }
        window.getDecorView().setSystemUiVisibility(this.uiOptions_);
        uiOptionsStatic = this.uiOptions_;
        return true;
    }

    public boolean setWindowLayoutFullScreen(boolean z) {
        if (z) {
            this.uiOptions_ |= HealthData.BLOODPRESURE;
        } else {
            this.uiOptions_ &= -1537;
        }
        return setSystemUiVisibilityInner();
    }

    public boolean setNavigationBarStatus(boolean z) {
        if (z) {
            this.uiOptions_ |= 2;
        } else {
            this.uiOptions_ &= -3;
        }
        return setSystemUiVisibilityInner();
    }

    public boolean setNavigationIndicatorStatus(boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            return setNavigationBarStatus(z);
        }
        ALog.e(TAG, "Not supported by the Android version.");
        return false;
    }

    public boolean setStatusBarStatus(boolean z) {
        if (z) {
            this.uiOptions_ |= 4;
        } else {
            this.uiOptions_ &= -5;
        }
        return setSystemUiVisibilityInner();
    }

    public boolean setActionBarStatus(boolean z) {
        ALog.d(TAG, "setActionBarStatus called: hide=" + z);
        Activity activity = this.mRootActivity;
        if (activity == null) {
            return false;
        }
        View decorView = activity.getWindow().getDecorView();
        ActionBar actionBar = this.mRootActivity.getActionBar();
        if (z) {
            if (actionBar != null && actionBar.isShowing()) {
                actionBar.hide();
            }
            return true;
        }
        decorView.setSystemUiVisibility(0);
        if (actionBar != null && !actionBar.isShowing()) {
            actionBar.show();
        }
        return true;
    }

    public boolean setOnDismissListener(String str, PopupWindow.OnDismissListener onDismissListener) {
        SubWindow subWindow = this.mSubWindowMap.get(str);
        if (subWindow == null) {
            return false;
        }
        subWindow.getSubWindowView().setOnDismissListener(onDismissListener);
        return true;
    }

    public boolean setTouchInterceptor(String str, View.OnTouchListener onTouchListener) {
        SubWindow subWindow = this.mSubWindowMap.get(str);
        if (subWindow == null) {
            return false;
        }
        subWindow.getSubWindowView().setTouchInterceptor(onTouchListener);
        return true;
    }

    public int getScreenOrientation() {
        Activity activity = this.mRootActivity;
        if (activity == null) {
            ALog.e(TAG, "The mRootActivity is null, getScreenOrientation failed.");
            return 1;
        }
        WindowManager windowManager = (WindowManager) activity.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (windowManager == null) {
            ALog.e(TAG, "The windowManager is null, getScreenOrientation failed.");
            return 1;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay == null) {
            ALog.e(TAG, "The display is null, getScreenOrientation failed.");
            return 1;
        }
        int rotation = defaultDisplay.getRotation();
        if (this.mRootActivity.getResources().getConfiguration().orientation == 2) {
            return (rotation == 0 || rotation == 1) ? 0 : 8;
        }
        return 1;
    }

    public Rect getSafeArea() {
        Rect rect = new Rect(0, 0, 0, 0);
        Activity activity = this.mRootActivity;
        if (activity != null && (activity instanceof StageActivity)) {
            ((StageActivity) activity).getInstanceId();
            int width = this.mRootActivity.getWindow().getDecorView().findViewById(R.id.content).getWidth();
            int height = this.mRootActivity.getWindow().getDecorView().findViewById(R.id.content).getHeight();
            int[] iArr = new int[2];
            this.mRootActivity.getWindow().getDecorView().findViewById(R.id.content).getLocationOnScreen(iArr);
            rect.set(iArr[0], iArr[1], width, height);
            return rect;
        }
        ALog.e(TAG, "The mRootActivity is null or of the wrong type, getSafeArea failed.");
        return rect;
    }

    private boolean systemUIStatus(int i) {
        Activity activity = this.mRootActivity;
        if (activity != null) {
            Window window = activity.getWindow();
            if (window == null) {
                ALog.e(TAG, "Window is null for activity: " + this.mRootActivity.getClass().getSimpleName());
                return true;
            }
            View decorView = window.getDecorView();
            if (decorView != null) {
                return (i & decorView.getSystemUiVisibility()) == 0;
            }
            ALog.e(TAG, "DecorView is null for activity: " + this.mRootActivity.getClass().getSimpleName());
            return true;
        }
        ALog.e(TAG, "mRootActivity is null");
        return true;
    }

    public int getStatusBarHeight() {
        Activity activity = this.mRootActivity;
        if (activity != null) {
            int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", OsType.ANDROID);
            if (identifier > 0) {
                return this.mRootActivity.getResources().getDimensionPixelSize(identifier);
            }
            return 0;
        }
        ALog.e(TAG, "The mRootActivity is null, getStatusBarHeight failed.");
        return 0;
    }

    public int getCutoutBarHeight() {
        if (Build.VERSION.SDK_INT >= 28) {
            return getStatusBarHeight();
        }
        ALog.e(TAG, "Not supported by the Android version.");
        return 0;
    }

    public boolean getNavigationBarStatus() {
        return systemUIStatus(2);
    }

    public boolean getNavigationIndicatorStatus() {
        if (Build.VERSION.SDK_INT >= 29) {
            return systemUIStatus(2);
        }
        return false;
    }

    public boolean hide(String str) {
        ALog.d(TAG, "hide called. name=" + str);
        SubWindow subWindow = this.mSubWindowMap.get(str);
        if (subWindow == null) {
            ALog.e(TAG, "not found SubWindow: " + str);
            return false;
        }
        if (!subWindow.getSubWindowView().isShowing()) {
            ALog.e(TAG, "not showing.");
            return false;
        }
        subWindow.destroyWindow();
        if (!subWindow.getSubWindowView().isShowing()) {
            return true;
        }
        ALog.e(TAG, "hide failed.");
        return false;
    }

    public boolean setFocusable(String str, boolean z) {
        ALog.d(TAG, "setFocusable called. name=" + str + ", isFocusable=" + z);
        SubWindow subWindow = this.mSubWindowMap.get(str);
        if (subWindow == null) {
            ALog.e(TAG, "not found SubWindow: " + str);
            return false;
        }
        subWindow.setFocusable(z);
        if (!subWindow.getSubWindowView().isShowing()) {
            return true;
        }
        subWindow.getSubWindowView().update();
        return true;
    }

    public boolean setTouchable(String str, boolean z) {
        ALog.d(TAG, "setTouchable called. name=" + str + ", isFocusable=" + z);
        SubWindow subWindow = this.mSubWindowMap.get(str);
        if (subWindow == null) {
            ALog.e(TAG, "not found SubWindow: " + str);
            return false;
        }
        subWindow.setTouchable(z);
        if (subWindow.getSubWindowView().isTouchable() != z) {
            ALog.e(TAG, "setTouchable to " + z + " failed.");
            return false;
        }
        if (!subWindow.getSubWindowView().isShowing()) {
            return true;
        }
        subWindow.getSubWindowView().update();
        return true;
    }

    public boolean requestFocus(String str) {
        ALog.d(TAG, "requestFocus called. name=" + str);
        SubWindow subWindow = this.mSubWindowMap.get(str);
        if (subWindow == null) {
            ALog.e(TAG, "not found SubWindow: " + str);
            return false;
        }
        return subWindow.requestFocus();
    }

    public boolean setTouchHotArea(String str, Rect[] rectArr) {
        ALog.d(TAG, "setTouchHotArea called. name=" + str);
        SubWindow subWindow = this.mSubWindowMap.get(str);
        if (subWindow == null) {
            ALog.e(TAG, "not found SubWindow: " + str);
            return false;
        }
        subWindow.setTouchHotArea(rectArr);
        return true;
    }

    public boolean setFullScreen(String str, boolean z) {
        ALog.d(TAG, "setFullScreen called. name=" + str);
        SubWindow subWindow = this.mSubWindowMap.get(str);
        if (subWindow == null) {
            ALog.e(TAG, "not found SubWindow: " + str);
            return false;
        }
        subWindow.setFullScreen(z);
        return true;
    }

    public boolean setOnTop(String str, boolean z) {
        SubWindow subWindow = this.mSubWindowMap.get(str);
        if (subWindow == null) {
            ALog.e(TAG, "not found SubWindow: " + str);
            return false;
        }
        subWindow.setOnTop(z);
        return true;
    }

    public boolean registerSubWindow(String str, long j) {
        ALog.d(TAG, "registerSubWindow called. name=" + str);
        SubWindow subWindow = this.mSubWindowMap.get(str);
        if (subWindow == null) {
            ALog.e(TAG, "not found SubWindow: " + str);
            return false;
        }
        subWindow.registerSubWindow(j);
        return true;
    }

    public boolean unregisterSubWindow(String str) {
        ALog.d(TAG, "unRegisterSubWindow called. name=" + str);
        SubWindow subWindow = this.mSubWindowMap.get(str);
        if (subWindow == null) {
            ALog.e(TAG, "not found SubWindow: " + str);
            return false;
        }
        subWindow.unregisterSubWindow();
        return true;
    }

    public boolean setStatusBar(int i, int i2) {
        ALog.d(TAG, "setStatusBar called: backgroundColor=" + i + ", contentColor=" + i2);
        Activity activity = this.mRootActivity;
        if (activity == null) {
            return false;
        }
        Window window = activity.getWindow();
        View decorView = window.getDecorView();
        if (i2 == UI_DARK_COLOR) {
            this.uiOptions_ |= 8192;
        } else if (i2 == UI_LIGHT_COLOR) {
            this.uiOptions_ &= -8193;
        }
        window.addFlags(Integer.MIN_VALUE);
        decorView.setSystemUiVisibility(this.uiOptions_);
        window.setStatusBarColor(i);
        return true;
    }

    public boolean setNavigationBar(int i, int i2) {
        Window window;
        View decorView;
        ALog.d(TAG, "setNavigationBar called: backgroundColor=" + i + ", contentColor=" + i2);
        Activity activity = this.mRootActivity;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return false;
        }
        if (i2 == UI_DARK_COLOR) {
            this.uiOptions_ |= 16;
        } else if (i2 == UI_LIGHT_COLOR) {
            this.uiOptions_ &= -17;
        }
        window.addFlags(Integer.MIN_VALUE);
        decorView.setSystemUiVisibility(this.uiOptions_);
        window.setNavigationBarColor(i);
        return true;
    }

    public boolean setWindowPrivacyMode(boolean z) {
        Window window;
        ALog.d(TAG, "setWindowPrivacyMode called: windowPrivacyMode=" + z);
        Activity activity = this.mRootActivity;
        if (activity == null || (window = activity.getWindow()) == null) {
            return false;
        }
        if (z) {
            window.addFlags(8192);
            return true;
        }
        window.clearFlags(8192);
        return true;
    }

    public Rect getSurfaceRect() {
        Rect rect = new Rect();
        Activity activity = this.mRootActivity;
        if (activity != null && (activity instanceof StageActivity)) {
            View decorView = activity.getWindow().getDecorView();
            int[] iArr = new int[2];
            decorView.getLocationOnScreen(iArr);
            rect.set(iArr[0], iArr[1], decorView.getWidth(), decorView.getHeight());
            return rect;
        }
        ALog.e(TAG, "mRootActivity is null");
        return rect;
    }
}
