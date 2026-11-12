package com.xiaomi.fitness.service;

import defpackage.cyl;
import defpackage.gbq;
import defpackage.ow5;
import defpackage.txa;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Hilt_DefaultRemoteService extends BaseRemoteService implements txa {
    private volatile cyl componentManager;
    private final Object componentManagerLock = new Object();
    private boolean injected = false;

    public cyl createComponentManager() {
        return new cyl(this);
    }

    @Override // defpackage.sxa
    public final Object generatedComponent() {
        return m555componentManager().generatedComponent();
    }

    public void inject() {
        if (this.injected) {
            return;
        }
        this.injected = true;
        ((ow5) generatedComponent()).b((DefaultRemoteService) gbq.a(this));
    }

    @Override // android.app.Service
    public void onCreate() {
        inject();
        super.onCreate();
    }

    /* JADX INFO: renamed from: componentManager, reason: merged with bridge method [inline-methods] */
    public final cyl m555componentManager() {
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
