package com.facebook.react.bridge.queue;

import com.facebook.jni.HybridData;
import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
public class NativeRunnable implements Runnable {
    private final HybridData mHybridData;

    @v07
    private NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // java.lang.Runnable
    public native void run();
}
