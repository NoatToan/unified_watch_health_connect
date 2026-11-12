package com.facebook.yrn.cxx.bridge;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactBridge;
import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
public class YRNModuleRegistryHolder {
    private final HybridData mHybridData;

    static {
        ReactBridge.staticInit();
    }

    private YRNModuleRegistryHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
