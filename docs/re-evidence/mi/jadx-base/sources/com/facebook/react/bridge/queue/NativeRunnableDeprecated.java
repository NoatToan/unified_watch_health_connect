package com.facebook.react.bridge.queue;

import com.facebook.jni.Countable;
import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@v07
public class NativeRunnableDeprecated extends Countable implements Runnable {
    @v07
    private NativeRunnableDeprecated() {
    }

    @Override // java.lang.Runnable
    public native void run();
}
