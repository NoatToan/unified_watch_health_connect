package com.facebook.react.modules.core;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.JavascriptException;
import defpackage.bqd;
import defpackage.cm8;
import defpackage.if8;
import defpackage.n06;
import defpackage.ndj;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = ExceptionsManagerModule.NAME)
public class ExceptionsManagerModule extends BaseJavaModule {
    public static final String NAME = "ExceptionsManager";
    private final n06 mDevSupportManager;

    public ExceptionsManagerModule(n06 n06Var) {
        this.mDevSupportManager = n06Var;
    }

    @ReactMethod
    public void dismissRedbox() {
        if (this.mDevSupportManager.getDevSupportEnabled()) {
            this.mDevSupportManager.hideRedboxDialog();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void reportException(ReadableMap readableMap) {
        String string = readableMap.hasKey("message") ? readableMap.getString("message") : "";
        ReadableArray array = readableMap.hasKey("stack") ? readableMap.getArray("stack") : Arguments.createArray();
        int i = readableMap.hasKey("id") ? readableMap.getInt("id") : -1;
        boolean z = readableMap.hasKey("isFatal") ? readableMap.getBoolean("isFatal") : false;
        if (this.mDevSupportManager.getDevSupportEnabled()) {
            this.mDevSupportManager.showNewJSError(string, array, i);
            return;
        }
        String strA = if8.a(readableMap);
        if (z) {
            throw new JavascriptException(bqd.a(string, array)).setExtraDataAsJson(strA);
        }
        cm8.i("ReactNative", bqd.a(string, array));
        if (strA != null) {
            cm8.c("ReactNative", "extraData: %s", strA);
        }
    }

    @ReactMethod
    public void reportFatalException(String str, ReadableArray readableArray, int i) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", str);
        javaOnlyMap.putArray("stack", readableArray);
        javaOnlyMap.putInt("id", i);
        javaOnlyMap.putBoolean("isFatal", true);
        reportException(javaOnlyMap);
    }

    @ReactMethod
    public void reportSoftException(String str, ReadableArray readableArray, int i) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", str);
        javaOnlyMap.putArray("stack", readableArray);
        javaOnlyMap.putInt("id", i);
        javaOnlyMap.putBoolean("isFatal", false);
        reportException(javaOnlyMap);
    }

    @ReactMethod
    public void updateExceptionMessage(String str, ReadableArray readableArray, int i) {
        if (this.mDevSupportManager.getDevSupportEnabled()) {
            this.mDevSupportManager.updateJSError(str, readableArray, i);
        }
    }
}
