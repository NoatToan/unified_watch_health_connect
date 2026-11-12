package com.huawei.hms.network;

/* JADX INFO: loaded from: classes3.dex */
public class DynamicLoaderHelper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final DynamicLoaderHelper f14444b = new DynamicLoaderHelper();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f14445a = false;

    public void setDynamicStatus(boolean z) {
        synchronized (this) {
            this.f14445a = z;
        }
    }

    public boolean getDynamicStatus() {
        boolean z;
        synchronized (this) {
            z = this.f14445a;
        }
        return z;
    }

    public static DynamicLoaderHelper getInstance() {
        return f14444b;
    }

    private DynamicLoaderHelper() {
    }
}
