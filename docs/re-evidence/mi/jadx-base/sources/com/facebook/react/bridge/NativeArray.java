package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
public abstract class NativeArray implements NativeArrayInterface {

    @v07
    private HybridData mHybridData;

    static {
        ReactBridge.staticInit();
    }

    public NativeArray(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.react.bridge.NativeArrayInterface
    public native String toString();
}
