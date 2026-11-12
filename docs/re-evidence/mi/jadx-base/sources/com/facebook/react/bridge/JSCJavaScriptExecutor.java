package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
class JSCJavaScriptExecutor extends JavaScriptExecutor {
    static {
        ReactBridge.staticInit();
    }

    public JSCJavaScriptExecutor(ReadableNativeMap readableNativeMap) {
        super(initHybrid(readableNativeMap));
    }

    private static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "JSCJavaScriptExecutor";
    }
}
