package defpackage;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class lxr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedHashMap<ReactContext, LinkedHashMap<String, WritableMap>> f25539a = new LinkedHashMap<>();

    public final void a(String str, WritableMap writableMap, ReactContext reactContext) {
        if (this.f25539a != null) {
            LinkedHashMap<String, WritableMap> linkedHashMap = new LinkedHashMap<>();
            if (this.f25539a.get(reactContext) != null) {
                linkedHashMap = this.f25539a.get(reactContext);
            }
            linkedHashMap.put(str, writableMap);
            this.f25539a.put(reactContext, linkedHashMap);
            zxr.a("YRN_YRNV3_SDK", "YRNJsEventChannel.addPendingEvent");
        }
    }

    public final boolean b(ReactContext reactContext) {
        return reactContext == null || !reactContext.hasActiveCatalystInstance();
    }

    public final void c(ReactContext reactContext) {
        LinkedHashMap<ReactContext, LinkedHashMap<String, WritableMap>> linkedHashMap = this.f25539a;
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            return;
        }
        LinkedHashMap<String, WritableMap> linkedHashMap2 = this.f25539a.get(reactContext);
        if (linkedHashMap2 != null && !linkedHashMap2.isEmpty()) {
            for (Map.Entry<String, WritableMap> entry : linkedHashMap2.entrySet()) {
                mxr.a(entry.getKey(), entry.getValue(), reactContext);
            }
        }
        this.f25539a.remove(reactContext);
        zxr.a("YRN_YRNV3_SDK", "YRNJsEventChannel.recycleSendPendingEvent");
    }

    public synchronized boolean d(String str, WritableMap writableMap, ReactContext reactContext) {
        boolean zB = b(reactContext);
        zxr.a("YRN_YRNV3_SDK", "YRNJsEventChannel.sendJsEventMap:needPend is " + zB + ",eventName is " + str + " data:" + writableMap.toString());
        if (zB) {
            a(str, writableMap, reactContext);
            return false;
        }
        c(reactContext);
        return mxr.a(str, writableMap, reactContext);
    }
}
