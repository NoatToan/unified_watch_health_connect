package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
public abstract class JavaScriptExecutor {
    private final HybridData mHybridData;

    public JavaScriptExecutor(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public void close() {
        this.mHybridData.a();
    }

    public abstract String getName();
}
