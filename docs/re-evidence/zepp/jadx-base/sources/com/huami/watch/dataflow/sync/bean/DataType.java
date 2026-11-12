package com.huami.watch.dataflow.sync.bean;

import com.huami.watch.transdata.transport.DataTransHelper;
import com.xiaomi.hm.health.lab.model.SensorRecordsEnity;

/* JADX INFO: loaded from: classes16.dex */
public enum DataType {
    SPORT(1, DataTransHelper.TYPE_SPORT),
    HEALTH(2, DataTransHelper.TYPE_HEALTH),
    FIRSTBEAT(3, DataTransHelper.TYPE_FIRST_BEAT),
    ATRIAL_FIBRILLATION(4, "ATRIAL FIBRILLATION"),
    ECG(5, SensorRecordsEnity.SensorType.SENSOR_ECG),
    HEART_RATE(6, "HEART_RATE"),
    RR_PEAK(7, "RRPEAK"),
    STRESS(8, "STRESS");

    private String key;
    private int value;

    DataType(int i, String str) {
        this.value = i;
        this.key = str;
    }

    public String getKey() {
        return this.key;
    }

    public int getValue() {
        return this.value;
    }

    public boolean is(String str) {
        return this.key.equals(str);
    }
}
