package com.huawei.hms.update.ui;

/* JADX INFO: loaded from: classes34.dex */
public class ConfigChangeHolder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile ConfigChangeHolder f16778b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f16779a = false;

    private ConfigChangeHolder() {
    }

    public static ConfigChangeHolder getInstance() {
        if (f16778b == null) {
            synchronized (ConfigChangeHolder.class) {
                if (f16778b == null) {
                    f16778b = new ConfigChangeHolder();
                }
            }
        }
        return f16778b;
    }

    public boolean isChanged() {
        return this.f16779a;
    }

    public void setChanged(boolean z) {
        this.f16779a = z;
    }
}
