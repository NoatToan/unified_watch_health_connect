package com.facebook.react.bridge;

import androidx.annotation.GuardedBy;
import com.facebook.react.module.model.ReactModuleInfo;
import defpackage.c9i;
import defpackage.e4q;
import defpackage.pyo;
import defpackage.sk1;
import defpackage.v07;
import defpackage.ycj;
import java.util.concurrent.atomic.AtomicInteger;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes4.dex */
@v07
public class ModuleHolder {
    private static final AtomicInteger sInstanceKeyCounter = new AtomicInteger(1);

    @GuardedBy("this")
    private boolean mInitializable;
    private final int mInstanceKey = sInstanceKeyCounter.getAndIncrement();

    @GuardedBy("this")
    private boolean mIsCreating;

    @GuardedBy("this")
    private boolean mIsInitializing;

    @GuardedBy("this")
    private NativeModule mModule;
    private final String mName;
    private Provider<? extends NativeModule> mProvider;
    private final ReactModuleInfo mReactModuleInfo;

    public ModuleHolder(ReactModuleInfo reactModuleInfo, Provider<? extends NativeModule> provider) {
        this.mName = reactModuleInfo.f();
        this.mProvider = provider;
        this.mReactModuleInfo = reactModuleInfo;
        if (reactModuleInfo.g()) {
            this.mModule = create();
        }
    }

    private NativeModule create() {
        boolean z = false;
        SoftAssertions.assertCondition(this.mModule == null, "Creating an already created module.");
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, this.mName, this.mInstanceKey);
        pyo.a(0L, "ModuleHolder.createModule").b("name", this.mName).c();
        c9i.a().c(ycj.e, "NativeModule init: %s", this.mName);
        try {
            NativeModule nativeModule = (NativeModule) ((Provider) sk1.c(this.mProvider)).get();
            this.mProvider = null;
            synchronized (this) {
                try {
                    this.mModule = nativeModule;
                    if (this.mInitializable && !this.mIsInitializing) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                doInitialize(nativeModule);
            }
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END, this.mName, this.mInstanceKey);
            pyo.b(0L).c();
            return nativeModule;
        } catch (Throwable th2) {
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END, this.mName, this.mInstanceKey);
            pyo.b(0L).c();
            throw th2;
        }
    }

    private void doInitialize(NativeModule nativeModule) {
        boolean z;
        pyo.a(0L, "ModuleHolder.initialize").b("name", this.mName).c();
        ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_START, this.mName, this.mInstanceKey);
        try {
            synchronized (this) {
                try {
                    if (!this.mInitializable || this.mIsInitializing) {
                        z = false;
                    } else {
                        z = true;
                        this.mIsInitializing = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                nativeModule.initialize();
                synchronized (this) {
                    this.mIsInitializing = false;
                }
            }
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.mName, this.mInstanceKey);
            pyo.b(0L).c();
        } catch (Throwable th2) {
            ReactMarker.logMarker(ReactMarkerConstants.INITIALIZE_MODULE_END, this.mName, this.mInstanceKey);
            pyo.b(0L).c();
            throw th2;
        }
    }

    public synchronized void destroy() {
        NativeModule nativeModule = this.mModule;
        if (nativeModule != null) {
            nativeModule.onCatalystInstanceDestroy();
        }
    }

    public boolean getCanOverrideExistingModule() {
        return this.mReactModuleInfo.a();
    }

    public String getClassName() {
        return this.mReactModuleInfo.b();
    }

    public boolean getHasConstants() {
        return this.mReactModuleInfo.c();
    }

    @v07
    public NativeModule getModule() {
        boolean z;
        NativeModule nativeModule;
        NativeModule nativeModule2;
        synchronized (this) {
            try {
                NativeModule nativeModule3 = this.mModule;
                if (nativeModule3 != null) {
                    return nativeModule3;
                }
                if (this.mIsCreating) {
                    z = false;
                } else {
                    z = true;
                    this.mIsCreating = true;
                }
                if (z) {
                    NativeModule nativeModuleCreate = create();
                    synchronized (this) {
                        this.mIsCreating = false;
                        notifyAll();
                    }
                    return nativeModuleCreate;
                }
                synchronized (this) {
                    while (true) {
                        nativeModule = this.mModule;
                        if (nativeModule != null || !this.mIsCreating) {
                            break;
                        }
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    nativeModule2 = (NativeModule) sk1.c(nativeModule);
                }
                return nativeModule2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @v07
    public String getName() {
        return this.mName;
    }

    public synchronized boolean hasInstance() {
        return this.mModule != null;
    }

    public boolean isCxxModule() {
        return this.mReactModuleInfo.d();
    }

    public boolean isTurboModule() {
        return this.mReactModuleInfo.e();
    }

    public void markInitializable() {
        boolean z;
        NativeModule nativeModule;
        synchronized (this) {
            z = true;
            try {
                this.mInitializable = true;
                if (this.mModule != null) {
                    sk1.a(!this.mIsInitializing);
                    nativeModule = this.mModule;
                } else {
                    nativeModule = null;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            doInitialize(nativeModule);
        }
    }

    public ModuleHolder(NativeModule nativeModule) {
        String name = nativeModule.getName();
        this.mName = name;
        this.mReactModuleInfo = new ReactModuleInfo(nativeModule.getName(), nativeModule.getClass().getSimpleName(), nativeModule.canOverrideExistingModule(), true, true, CxxModuleWrapper.class.isAssignableFrom(nativeModule.getClass()), e4q.class.isAssignableFrom(nativeModule.getClass()));
        this.mModule = nativeModule;
        c9i.a().c(ycj.e, "NativeModule init: %s", name);
    }
}
