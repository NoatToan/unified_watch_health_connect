package com.xiaomi.smarthome.core.server.internal.account;

/* JADX INFO: loaded from: classes10.dex */
public class UserDegreeManager {
    private static volatile UserDegreeManager sInstance;
    private volatile boolean mDirtyFlag = true;

    private UserDegreeManager() {
    }

    public static UserDegreeManager getInstance() {
        if (sInstance == null) {
            synchronized (UserDegreeManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new UserDegreeManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public void cleanDirty() {
        this.mDirtyFlag = false;
    }

    public boolean isDirty() {
        return this.mDirtyFlag;
    }

    public void setDirty() {
        this.mDirtyFlag = true;
    }
}
