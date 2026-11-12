package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
public abstract class NativeMap {

    @v07
    private HybridData mHybridData;

    static {
        ReactBridge.staticInit();
    }

    public NativeMap(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public native String toString();
}
