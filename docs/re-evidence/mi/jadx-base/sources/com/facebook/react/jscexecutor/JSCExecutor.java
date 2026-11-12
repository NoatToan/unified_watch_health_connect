package com.facebook.react.jscexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.soloader.SoLoader;
import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
class JSCExecutor extends JavaScriptExecutor {
    static {
        SoLoader.q("jscexecutor");
    }

    private static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    @Override // com.facebook.react.bridge.JavaScriptExecutor
    public String getName() {
        return "JSCExecutor";
    }
}
