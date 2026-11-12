package com.huami.moving.ui.event;

/* JADX INFO: loaded from: classes3.dex */
public class EventIndoorRunCalibated {
    public int distance;
    public float pace;
    public String recordKey;

    public EventIndoorRunCalibated(String str) {
        this.recordKey = str;
    }

    public EventIndoorRunCalibated(String str, int i, float f) {
        this.recordKey = str;
        this.distance = i;
        this.pace = f;
    }
}
