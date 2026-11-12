package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.learnium.RNDeviceInfo.DeviceType;
import com.mipay.sdk.Mipay;

/* JADX INFO: loaded from: classes5.dex */
public class hu6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20462a;

    public hu6(Context context) {
        this.f20462a = context;
    }

    public DeviceType a() {
        if (this.f20462a.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")) {
            return DeviceType.TV;
        }
        UiModeManager uiModeManager = (UiModeManager) this.f20462a.getSystemService(Mipay.KEY_UI_MODE);
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return DeviceType.TV;
        }
        DeviceType deviceTypeC = c();
        return (deviceTypeC == null || deviceTypeC == DeviceType.UNKNOWN) ? b() : deviceTypeC;
    }

    public final DeviceType b() {
        WindowManager windowManager = (WindowManager) this.f20462a.getSystemService("window");
        if (windowManager == null) {
            return DeviceType.UNKNOWN;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        double dSqrt = Math.sqrt(Math.pow(((double) displayMetrics.widthPixels) / ((double) displayMetrics.xdpi), 2.0d) + Math.pow(((double) displayMetrics.heightPixels) / ((double) displayMetrics.ydpi), 2.0d));
        if (dSqrt < 3.0d || dSqrt > 6.9d) {
            return (dSqrt <= 6.9d || dSqrt > 18.0d) ? DeviceType.UNKNOWN : DeviceType.TABLET;
        }
        return DeviceType.HANDSET;
    }

    public final DeviceType c() {
        int i = this.f20462a.getResources().getConfiguration().smallestScreenWidthDp;
        if (i == 0) {
            return DeviceType.UNKNOWN;
        }
        return i >= 600 ? DeviceType.TABLET : DeviceType.HANDSET;
    }

    public boolean d() {
        return a() == DeviceType.TABLET;
    }
}
