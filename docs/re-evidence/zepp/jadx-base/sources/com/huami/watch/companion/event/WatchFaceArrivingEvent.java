package com.huami.watch.companion.event;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceArrivingEvent {
    public static final String CMD_REPLY = "reply";
    public static final String CMD_SET = "set";
    private String cmd;

    public WatchFaceArrivingEvent(String str) {
        this.cmd = str;
    }

    public String getCmd() {
        return this.cmd;
    }
}
