package com.xiaomi.hm.health.eventbus;

import com.xiaomi.hm.health.dataprocess.DaySportData;
import com.xiaomi.hm.health.dataprocess.ShoesDaySportData;

/* JADX INFO: loaded from: classes21.dex */
public class EventDateDataAnalysisJobFinished {
    public DaySportData a;
    public ShoesDaySportData b;
    public DaySportData c;

    public EventDateDataAnalysisJobFinished(DaySportData data) {
        this.a = data;
    }

    public DaySportData getData() {
        return this.a;
    }

    public DaySportData getEarbudData() {
        return this.c;
    }

    public ShoesDaySportData getShoesData() {
        return this.b;
    }

    public EventDateDataAnalysisJobFinished(ShoesDaySportData data) {
        this.b = data;
    }

    public EventDateDataAnalysisJobFinished(DaySportData data, DaySportData earbudData) {
        this.a = data;
        this.c = earbudData;
    }
}
