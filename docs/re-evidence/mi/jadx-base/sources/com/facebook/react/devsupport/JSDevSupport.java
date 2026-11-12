package com.facebook.react.devsupport;

import android.view.View;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import defpackage.ndj;
import defpackage.wtq;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = JSDevSupport.MODULE_NAME)
public class JSDevSupport extends ReactContextBaseJavaModule {
    public static final int ERROR_CODE_EXCEPTION = 0;
    public static final int ERROR_CODE_VIEW_NOT_FOUND = 1;
    public static final String MODULE_NAME = "JSDevSupport";
    private volatile a mCurrentCallback;

    public interface JSDevSupportModule extends JavaScriptModule {
        void getJSHierarchy(int i);
    }

    public interface a {
        void a(int i, Exception exc);
    }

    public JSDevSupport(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public synchronized void computeDeepestJSHierarchy(View view, a aVar) {
        getJSHierarchy(((View) wtq.a(view).first).getId(), aVar);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put("ERROR_CODE_EXCEPTION", 0);
        map.put("ERROR_CODE_VIEW_NOT_FOUND", 1);
        return map;
    }

    public synchronized void getJSHierarchy(int i, a aVar) {
        JSDevSupportModule jSDevSupportModule = (JSDevSupportModule) getReactApplicationContext().getJSModule(JSDevSupportModule.class);
        if (jSDevSupportModule == null) {
            aVar.a(0, new JSCHeapCapture.CaptureException("JSDevSupport module not registered."));
        } else {
            jSDevSupportModule.getJSHierarchy(i);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    @ReactMethod
    public synchronized void onFailure(int i, String str) {
    }

    @ReactMethod
    public synchronized void onSuccess(String str) {
    }
}
