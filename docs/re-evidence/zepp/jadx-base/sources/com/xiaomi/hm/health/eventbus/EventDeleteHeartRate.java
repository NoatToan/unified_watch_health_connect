package com.xiaomi.hm.health.eventbus;

import com.xiaomi.hm.health.databases.model.HeartRate;

/* JADX INFO: loaded from: classes21.dex */
public class EventDeleteHeartRate {
    public HeartRate deletedHeartRate;

    public EventDeleteHeartRate(HeartRate deletedHeartRate) {
        this.deletedHeartRate = deletedHeartRate;
    }
}
