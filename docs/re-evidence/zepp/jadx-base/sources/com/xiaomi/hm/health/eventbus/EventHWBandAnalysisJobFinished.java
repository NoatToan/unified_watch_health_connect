package com.xiaomi.hm.health.eventbus;

import com.xiaomi.hm.health.dataprocess.DaySportData;

/* JADX INFO: loaded from: classes21.dex */
public class EventHWBandAnalysisJobFinished {
    public DaySportData a;
    public int b;
    public int c;

    public EventHWBandAnalysisJobFinished(DaySportData dsd, int type, int deviceType) {
        this.b = 0;
        this.c = 0;
        this.a = dsd;
        this.b = type;
        this.c = deviceType;
    }

    public int getmDataType() {
        return this.b;
    }

    public int getmDeviceType() {
        return this.c;
    }

    public DaySportData getmDsd() {
        return this.a;
    }
}
