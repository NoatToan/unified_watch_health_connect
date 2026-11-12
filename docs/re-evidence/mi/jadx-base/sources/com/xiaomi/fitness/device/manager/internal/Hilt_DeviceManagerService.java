package com.xiaomi.fitness.device.manager.internal;

import com.xiaomi.fitness.service.BaseRemoteService;
import defpackage.cyl;
import defpackage.gbq;
import defpackage.ma6;
import defpackage.txa;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Hilt_DeviceManagerService extends BaseRemoteService implements txa {
    private volatile cyl componentManager;
    private final Object componentManagerLock = new Object();
    private boolean injected = false;

    public cyl createComponentManager() {
        return new cyl(this);
    }

    @Override // defpackage.sxa
    public final Object generatedComponent() {
        return m243componentManager().generatedComponent();
    }

    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((ma6) generatedComponent()).a((DeviceManagerService) gbq.a(this));
    }

    @Override // android.app.Service
    public void onCreate() {
        inject();
        super.onCreate();
    }

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final cyl m243componentManager() {
        if (this.componentManager == null) {
            synchronized (this.componentManagerLock) {
                try {
                    if (this.componentManager == null) {
                        this.componentManager = createComponentManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.componentManager;
    }
}
