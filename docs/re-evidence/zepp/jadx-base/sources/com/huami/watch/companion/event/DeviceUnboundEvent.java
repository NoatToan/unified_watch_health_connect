package com.huami.watch.companion.event;

/* JADX INFO: loaded from: classes16.dex */
public class DeviceUnboundEvent {
    public String address;
    public String did;
    public boolean isActive;
    public boolean isBLE;

    public DeviceUnboundEvent(String str, String str2, boolean z, boolean z2) {
        this.did = str;
        this.address = str2;
        this.isActive = z;
        this.isBLE = z2;
    }
}
