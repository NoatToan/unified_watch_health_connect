package com.huawei.hms.network.embedded;

import org.chromium.net.CronetEngine;

/* JADX INFO: loaded from: classes34.dex */
public class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CronetEngine f14670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14671b = false;

    public void setEnableConnectionMigrated(boolean z) {
        this.f14671b = z;
    }

    public void setCronetEngine(CronetEngine cronetEngine) {
        this.f14670a = cronetEngine;
    }

    public boolean isEnableConnectionMigrated() {
        return this.f14671b;
    }

    public CronetEngine getCronetEngine() {
        return this.f14670a;
    }
}
