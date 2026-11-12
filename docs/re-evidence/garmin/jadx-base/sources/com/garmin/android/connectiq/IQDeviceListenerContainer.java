package com.garmin.android.connectiq;

import java.util.HashMap;

/* JADX INFO: loaded from: classes9.dex */
class IQDeviceListenerContainer {
    private final long deviceIdentifier;
    private final HashMap<String, ConnectIQ.IQApplicationInfoListener> appInfoListeners = new HashMap<>();
    private final HashMap<String, ConnectIQ.IQOpenApplicationListener> openApplicationListeners = new HashMap<>();
    private final HashMap<String, ConnectIQ.IQSendMessageListener> sendMessageListeners = new HashMap<>();
    private ConnectIQ.IQDeviceEventListener deviceListener = null;
    private final HashMap<String, ConnectIQ.IQApplicationEventListener> appListeners = new HashMap<>();

    public IQDeviceListenerContainer(long j8) {
        this.deviceIdentifier = j8;
    }

    public void clearAppListeners() {
        this.appListeners.clear();
    }

    public void clearApplicationInfoListeners() {
        this.appInfoListeners.clear();
    }

    public void clearDeviceListener() {
        this.deviceListener = null;
    }

    public void clearOpenApplicationListeners() {
        this.openApplicationListeners.clear();
    }

    public void clearSendMessageListeners() {
        this.sendMessageListeners.clear();
    }

    public ConnectIQ.IQApplicationEventListener getAppListener(String str) {
        return this.appListeners.get(str);
    }

    public ConnectIQ.IQApplicationInfoListener getApplicationInfoListener(String str) {
        return this.appInfoListeners.get(str);
    }

    public ConnectIQ.IQDeviceEventListener getDeviceListener() {
        return this.deviceListener;
    }

    public ConnectIQ.IQOpenApplicationListener getOpenApplicationListener(String str) {
        return this.openApplicationListeners.get(str);
    }

    public ConnectIQ.IQSendMessageListener getSendMessageListener(String str) {
        return this.sendMessageListeners.get(str);
    }

    public void setAppListener(String str, ConnectIQ.IQApplicationEventListener iQApplicationEventListener) {
        this.appListeners.put(str, iQApplicationEventListener);
    }

    public void setApplicationInfoListener(String str, ConnectIQ.IQApplicationInfoListener iQApplicationInfoListener) {
        this.appInfoListeners.put(str, iQApplicationInfoListener);
    }

    public void setDeviceListener(ConnectIQ.IQDeviceEventListener iQDeviceEventListener) {
        this.deviceListener = iQDeviceEventListener;
    }

    public void setOpenApplicationListener(String str, ConnectIQ.IQOpenApplicationListener iQOpenApplicationListener) {
        this.openApplicationListeners.put(str, iQOpenApplicationListener);
    }

    public void setSendMessageListener(String str, ConnectIQ.IQSendMessageListener iQSendMessageListener) {
        this.sendMessageListeners.put(str, iQSendMessageListener);
    }
}
