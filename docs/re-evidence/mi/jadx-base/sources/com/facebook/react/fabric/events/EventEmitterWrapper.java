package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import defpackage.km8;
import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"MissingNativeLoadLibrary"})
public class EventEmitterWrapper {

    @v07
    private final HybridData mHybridData = initHybrid();

    static {
        km8.a();
    }

    private static native HybridData initHybrid();

    private native void invokeEvent(String str, NativeMap nativeMap);
}
