package com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.startLine;

/* JADX INFO: loaded from: classes16.dex */
public abstract class StartLine {
    public int masterVersion;
    public int minorVersion;
    public String protocol;

    public int getMasterVersion() {
        return this.masterVersion;
    }

    public int getMinorVersion() {
        return this.minorVersion;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public void setMasterVersion(int i) {
        this.masterVersion = i;
    }

    public void setMinorVersion(int i) {
        this.minorVersion = i;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }
}
