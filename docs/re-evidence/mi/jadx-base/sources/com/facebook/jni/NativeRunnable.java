package com.facebook.jni;

import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
public class NativeRunnable implements Runnable {

    @v07
    private final HybridData mHybridData;

    @v07
    private NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // java.lang.Runnable
    public native void run();
}
