package com.facebook.react.bridge;

import android.app.Activity;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ReactContextBaseJavaModule extends BaseJavaModule {
    private final ReactApplicationContext mReactApplicationContext;

    public ReactContextBaseJavaModule(ReactApplicationContext reactApplicationContext) {
        this.mReactApplicationContext = reactApplicationContext;
    }

    public final Activity getCurrentActivity() {
        return this.mReactApplicationContext.getCurrentActivity();
    }

    public final ReactApplicationContext getReactApplicationContext() {
        return this.mReactApplicationContext;
    }
}
