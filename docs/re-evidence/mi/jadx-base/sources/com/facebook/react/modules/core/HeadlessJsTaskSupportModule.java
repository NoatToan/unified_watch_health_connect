package com.facebook.react.modules.core;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import defpackage.cm8;
import defpackage.gmb;
import defpackage.ndj;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = HeadlessJsTaskSupportModule.NAME)
public class HeadlessJsTaskSupportModule extends ReactContextBaseJavaModule {
    public static final String NAME = "HeadlessJsTaskSupport";

    public HeadlessJsTaskSupportModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void notifyTaskFinished(int i) {
        gmb gmbVarD = gmb.d(getReactApplicationContext());
        if (gmbVarD.f(i)) {
            gmbVarD.c(i);
        } else {
            cm8.A(HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", Integer.valueOf(i));
        }
    }

    @ReactMethod
    public void notifyTaskRetry(int i, Promise promise) {
        gmb gmbVarD = gmb.d(getReactApplicationContext());
        if (gmbVarD.f(i)) {
            promise.resolve(Boolean.valueOf(gmbVarD.i(i)));
        } else {
            cm8.A(HeadlessJsTaskSupportModule.class, "Tried to retry non-active task with id %d. Did it time out?", Integer.valueOf(i));
            promise.resolve(Boolean.FALSE);
        }
    }
}
