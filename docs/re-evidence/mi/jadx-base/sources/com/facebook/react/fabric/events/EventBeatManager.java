package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import defpackage.km8;
import defpackage.v07;
import defpackage.zg2;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"MissingNativeLoadLibrary"})
public class EventBeatManager implements zg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReactApplicationContext f7351a;

    @v07
    private final HybridData mHybridData;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            EventBeatManager.this.beat();
        }
    }

    static {
        km8.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void beat();

    private static native HybridData initHybrid();

    @Override // defpackage.zg2
    public void a() {
        c();
    }

    public final void c() {
        if (this.f7351a.isOnJSQueueThread()) {
            beat();
        } else {
            this.f7351a.runOnJSQueueThread(new a());
        }
    }
}
