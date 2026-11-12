package com.huami.watch.dataflow.event;

/* JADX INFO: loaded from: classes16.dex */
public class SportHistoryUpdatedEvent {
    public static final int UPDATE_FROM_WATCH_SYNC = 1;
    public boolean hasNewData;
    public int source = -1;

    public boolean isFromWatch() {
        return this.source == 1;
    }
}
