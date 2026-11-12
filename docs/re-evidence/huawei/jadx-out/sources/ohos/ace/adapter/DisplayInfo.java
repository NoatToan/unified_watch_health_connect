package ohos.ace.adapter;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.huawei.openalliance.ad.constant.Constants;

/* JADX INFO: loaded from: classes20.dex */
public class DisplayInfo {
    private static final String TAG = "DisplayInfo";
    private static volatile DisplayInfo sInstance;
    private WindowManager mWindowManager;

    private native void nativeSetupDisplayInfo();

    private DisplayInfo() {
        ALog.d(TAG, "DisplayInfo created.");
    }

    public static final DisplayInfo getInstance() {
        if (sInstance == null) {
            synchronized (DisplayInfo.class) {
                if (sInstance == null) {
                    sInstance = new DisplayInfo();
                }
            }
        }
        return sInstance;
    }

    public void setContext(Context context) {
        this.mWindowManager = (WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        nativeSetupDisplayInfo();
    }

    public int getDisplayId() {
        ALog.d(TAG, "getDisplayId called.");
        return this.mWindowManager.getDefaultDisplay().getDisplayId();
    }

    public int getOrentation() {
        ALog.d(TAG, "getOrentation called.");
        return this.mWindowManager.getDefaultDisplay().getRotation();
    }

    public int getWidth() {
        ALog.d(TAG, "getWidth called.");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.mWindowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public int getHeight() {
        ALog.d(TAG, "getHeight called.");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.mWindowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public float getRefreshRate() {
        ALog.d(TAG, "getRefreshRate called.");
        return this.mWindowManager.getDefaultDisplay().getRefreshRate();
    }

    public float getDensityPixels() {
        ALog.d(TAG, "getDensityPixels called.");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.mWindowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    public int getDensityDpi() {
        ALog.d(TAG, "getDensityDpi called.");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.mWindowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.densityDpi;
    }

    public float getScaledDensity() {
        ALog.d(TAG, "getScaledDensity called.");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.mWindowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.scaledDensity;
    }

    public float getXDpi() {
        ALog.d(TAG, "getXDpi called.");
        if (this.mWindowManager == null) {
            return 0.0f;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.mWindowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.xdpi;
    }

    public float getYDpi() {
        ALog.d(TAG, "getYDpi called.");
        if (this.mWindowManager == null) {
            return 0.0f;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.mWindowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.ydpi;
    }
}
