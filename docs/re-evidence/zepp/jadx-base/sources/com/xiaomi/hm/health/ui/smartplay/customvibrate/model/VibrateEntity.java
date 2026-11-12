package com.xiaomi.hm.health.ui.smartplay.customvibrate.model;

/* JADX INFO: loaded from: classes22.dex */
public class VibrateEntity {
    public short id;
    public String name;
    public short[] times;

    public VibrateEntity(String name, short id, short[] times) {
        this.name = name;
        this.id = id;
        this.times = times;
    }

    public VibrateEntity() {
    }
}
