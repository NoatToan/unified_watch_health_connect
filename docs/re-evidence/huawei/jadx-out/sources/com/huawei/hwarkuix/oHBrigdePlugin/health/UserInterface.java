package com.huawei.hwarkuix.oHBrigdePlugin.health;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hms.ads.jsb.constant.Constant;
import com.huawei.hwarkuix.oHProEngine.OHProBridgePlugin;
import health.compact.a.util.LogUtil;
import ohos.ace.adapter.capability.bridge.BridgeManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class UserInterface extends OHProBridgePlugin {
    private static final String R_TAG = "R_ArkUIX_UserInterface";
    private static final String TAG = "ArkUIX_UserInterface";

    public UserInterface(Context context, String str, int i) {
        super(context, str, i);
    }

    public UserInterface(Context context, String str, BridgeManager bridgeManager) {
        super(context, str, bridgeManager);
    }

    public void getSafeArea(int i, Object[] objArr) {
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            return;
        }
        ReleaseLogUtil.c(R_TAG, "getSafeArea enter");
        JSONObject jSONObject = new JSONObject();
        Rect safeArea = getSafeArea(activityJ);
        try {
            jSONObject.put(Constant.MAP_KEY_TOP, safeArea.top);
            jSONObject.put("left", safeArea.left);
            jSONObject.put("bottom", safeArea.bottom);
            jSONObject.put("right", safeArea.right);
        } catch (JSONException unused) {
            LogUtil.c(TAG, "getSafeArea occur error.");
        }
        ReleaseLogUtil.c(R_TAG, "getSafeArea resp: ", jSONObject.toString());
        ohProOnSuccess(i, jSONObject);
    }

    private static Rect getSafeArea(Activity activity) {
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        Rect rect = new Rect();
        if (Build.VERSION.SDK_INT >= 28 && (rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets()) != null && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
            rect.set(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
        }
        return rect;
    }

    public void setWindowOrientation(int i, String str) {
        ReleaseLogUtil.c(R_TAG, "setWindowOrientation enter");
        final Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            LogUtil.a(TAG, "context is null");
            return;
        }
        final boolean z = false;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("isLandscape")) {
                ReleaseLogUtil.b(R_TAG, "setWindowOrientation unknown direction param.");
                ohProOnFailure(i, new Object());
                return;
            }
            z = jSONObject.getBoolean("isLandscape");
            if (!(activityJ instanceof Activity)) {
                ReleaseLogUtil.b(R_TAG, "setWindowOrientation mContext type error.");
                ohProOnFailure(i, new Object());
            } else {
                activityJ.runOnUiThread(new Runnable() { // from class: com.huawei.hwarkuix.oHBrigdePlugin.health.UserInterface.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            ((Activity) activityJ).setRequestedOrientation(!z ? 1 : 0);
                        } catch (Exception unused) {
                            ReleaseLogUtil.b(UserInterface.R_TAG, "setWindowOrientation occur Exception error.");
                        }
                    }
                });
                ohProOnSuccess(i, true);
            }
        } catch (JSONException unused) {
            ReleaseLogUtil.e(R_TAG, "setWindowOrientation occur json error.");
        }
    }
}
