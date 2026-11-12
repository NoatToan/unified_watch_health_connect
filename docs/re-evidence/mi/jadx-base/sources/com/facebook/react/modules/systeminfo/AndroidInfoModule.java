package com.facebook.react.modules.systeminfo;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.os.Build;
import android.provider.Settings;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.mipay.sdk.Mipay;
import com.miui.circulate.device.api.Constant;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnDeviceUtils;
import defpackage.e4q;
import defpackage.ia1;
import defpackage.iti;
import defpackage.ndj;
import defpackage.zdj;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = AndroidInfoModule.NAME)
@SuppressLint({"HardwareIds"})
public class AndroidInfoModule extends ReactContextBaseJavaModule implements e4q {
    private static final String IS_TESTING = "IS_TESTING";
    public static final String NAME = "PlatformConstants";

    public AndroidInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private String getServerHost() {
        return ia1.i(Integer.valueOf(getReactApplicationContext().getApplicationContext().getResources().getInteger(iti.f22077a)));
    }

    private Boolean isRunningScreenshotTest() {
        try {
            Class.forName("androidx.test.rule.ActivityTestRule");
            return Boolean.TRUE;
        } catch (ClassNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    private String uiMode() {
        int currentModeType = ((UiModeManager) getReactApplicationContext().getSystemService(Mipay.KEY_UI_MODE)).getCurrentModeType();
        if (currentModeType == 1) {
            return "normal";
        }
        if (currentModeType == 2) {
            return "desk";
        }
        if (currentModeType == 3) {
            return "car";
        }
        if (currentModeType != 4) {
            return currentModeType != 6 ? "unknown" : Constant.DeviceType.WATCH;
        }
        return RnDeviceUtils.CATEGORY_TV;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getAndroidID() {
        return Settings.Secure.getString(getReactApplicationContext().getContentResolver(), "android_id");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("Version", Integer.valueOf(Build.VERSION.SDK_INT));
        map.put("Release", Build.VERSION.RELEASE);
        map.put("Serial", Build.SERIAL);
        map.put(AIApiConstants.Fingerprint.NAME, Build.FINGERPRINT);
        map.put("Model", Build.MODEL);
        map.put("isTesting", Boolean.valueOf("true".equals(System.getProperty(IS_TESTING)) || isRunningScreenshotTest().booleanValue()));
        map.put("reactNativeVersion", zdj.f41157a);
        map.put("uiMode", uiMode());
        return map;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public void invalidate() {
    }
}
