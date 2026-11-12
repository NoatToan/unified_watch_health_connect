package com.facebook.react.fabric;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.fabric.events.EventBeatManager;
import defpackage.km8;
import defpackage.v07;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"MissingNativeLoadLibrary"})
@v07
public class Binding {

    @v07
    private final HybridData mHybridData = initHybrid();

    static {
        km8.a();
    }

    private static native HybridData initHybrid();

    private native void installFabricUIManager(long j, Object obj, EventBeatManager eventBeatManager, MessageQueueThread messageQueueThread, ComponentFactoryDelegate componentFactoryDelegate, Object obj2);

    private native void uninstallFabricUIManager();

    public void a() {
        uninstallFabricUIManager();
    }

    public native void renderTemplateToSurface(int i, String str);

    public native void setConstraints(int i, float f, float f2, float f3, float f4);

    public native void setPixelDensity(float f);

    public native void startSurface(int i, String str, NativeMap nativeMap);

    public native void startSurfaceWithConstraints(int i, String str, NativeMap nativeMap, float f, float f2, float f3, float f4);

    public native void stopSurface(int i);
}
