package com.huami.watch.companion.device;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes16.dex */
public class DeviceState implements Cloneable {
    public static final int STATE_ACTIVE = 1;
    public static final int STATE_CONNECTED = 16;
    public static final int STATE_SYNCED_TO_CLOUD = 256;

    @SerializedName("stateCode")
    private int a;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean isActive() {
        return (this.a & 1) > 0;
    }

    public boolean isConnected() {
        return (this.a & 16) > 0;
    }

    public boolean isSyncedToCloud() {
        return (this.a & 256) > 0;
    }

    public void setActive(boolean z) {
        if (z) {
            this.a |= 1;
        } else {
            this.a &= -2;
        }
    }

    public void setConnected(boolean z) {
        if (z) {
            this.a |= 16;
        } else {
            this.a &= -17;
        }
    }

    public void setSyncedToCloud(boolean z) {
        if (z) {
            this.a |= 256;
        } else {
            this.a &= -257;
        }
    }

    public int state() {
        return this.a;
    }
}
