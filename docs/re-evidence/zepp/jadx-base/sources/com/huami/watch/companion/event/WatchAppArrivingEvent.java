package com.huami.watch.companion.event;

/* JADX INFO: loaded from: classes16.dex */
public class WatchAppArrivingEvent {
    private String cmd;
    private String extraInfo;

    public WatchAppArrivingEvent(String str) {
        this.cmd = null;
        this.extraInfo = null;
        this.cmd = str;
    }

    public String getCmd() {
        return this.cmd;
    }

    public String getExtraInfo() {
        return this.extraInfo;
    }

    public WatchAppArrivingEvent(String str, String str2) {
        this.cmd = null;
        this.extraInfo = null;
        this.cmd = str;
        this.extraInfo = str2;
    }
}
