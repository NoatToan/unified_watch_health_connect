package com.milink.api.v1;

/* JADX INFO: loaded from: classes5.dex */
public interface MiLinkClientDeviceListener {
    void onDeviceFound(MiLinkClientDevice miLinkClientDevice);

    void onDeviceLost(MiLinkClientDevice miLinkClientDevice);
}
