package defpackage;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;

/* JADX INFO: loaded from: classes2.dex */
public class mxr {
    public static boolean a(String str, WritableMap writableMap, ReactContext reactContext) {
        if (writableMap == null) {
            return false;
        }
        zxr.a("YRN_YRNV3_SDK", "YRNJsEventHelper.sendJsEventMap: " + str + " data:" + writableMap.toString());
        if (reactContext == null || !reactContext.hasActiveCatalystInstance()) {
            zxr.a("YRN_YRNV3_SDK", "YRNJsEventHelper.sendJsEventMap: failure because not initialized");
            return false;
        }
        try {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
            return true;
        } catch (Exception e) {
            zxr.b("YRN_YRNV3_SDK", "YRNJsEventHelper.sendJsEventMap: send js event map meet error!" + e);
            e.printStackTrace();
            return false;
        }
    }
}
