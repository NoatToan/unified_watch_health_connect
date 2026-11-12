package com.huami.moving.ui.event;

/* JADX INFO: loaded from: classes3.dex */
public class EventCurrSportFinished {
    public int deviceSource;
    public long trackId;

    public EventCurrSportFinished(long j) {
        this.trackId = j;
    }

    public EventCurrSportFinished(long j, int i) {
        this.trackId = j;
        this.deviceSource = i;
    }
}
