package defpackage;

import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.UIManagerModule;

/* JADX INFO: loaded from: classes4.dex */
public class q7q {
    public static UIManager a(ReactContext reactContext, int i) {
        CatalystInstance catalystInstance = reactContext.getCatalystInstance();
        return i == 2 ? (UIManager) catalystInstance.getJSIModule(JSIModuleType.UIManager) : (UIManager) catalystInstance.getNativeModule(UIManagerModule.class);
    }
}
