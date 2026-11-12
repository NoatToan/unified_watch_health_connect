package com.xiaomi.hm.health.eventbus;

/* JADX INFO: loaded from: classes21.dex */
public class EventQuietModeChange {
    public boolean modeEnable;
    public int startIndex;
    public int stopIndex;

    public EventQuietModeChange(boolean modeEnable, int startIndex, int stopIndex) {
        this.modeEnable = modeEnable;
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
    }

    public EventQuietModeChange() {
        this.modeEnable = false;
        this.startIndex = 0;
        this.stopIndex = 0;
    }
}
