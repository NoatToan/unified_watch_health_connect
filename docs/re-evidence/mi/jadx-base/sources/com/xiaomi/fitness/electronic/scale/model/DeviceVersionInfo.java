package com.xiaomi.fitness.electronic.scale.model;

import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class DeviceVersionInfo {
    private int errorCode;
    private boolean isForce;
    private boolean isNeedUpdate;
    private Serializable versionInfo;

    public int getCode() {
        return this.errorCode;
    }

    public Serializable getVersionInfo() {
        return this.versionInfo;
    }

    public boolean isForce() {
        return this.isForce;
    }

    public boolean isNeedUpdate() {
        return this.isNeedUpdate;
    }

    public void setCode(int i) {
        this.errorCode = i;
    }

    public void setForce(boolean z) {
        this.isForce = z;
    }

    public void setNeedUpdate(boolean z) {
        this.isNeedUpdate = z;
    }

    public void setVersionInfo(Serializable serializable) {
        this.versionInfo = serializable;
    }
}
