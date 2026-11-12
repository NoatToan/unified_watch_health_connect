package com.xiaomi.hm.health.databases.model;

import androidx.annotation.NonNull;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public class HeartRate implements Serializable, Comparable<HeartRate> {
    public static final int STATE_NEED_DELETE = 2;
    public static final int STATE_NEED_SYNC = 0;
    public static final int STATE_SYNCED = 1;
    public static final int TYPE_MANUAL = 2;
    private static final long serialVersionUID = 1;
    private Integer a;
    private Integer b;
    private Integer c;
    private Long d;
    private Integer e;
    private Integer f;
    private Integer g;
    private String h;

    public HeartRate(Integer num, Integer num2, Integer num3, Long l, Integer num4, Integer num5, Integer num6, String str) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = l;
        this.e = num4;
        this.f = num5;
        this.g = num6;
        this.h = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof HeartRate) {
            return this.d.equals(((HeartRate) obj).d);
        }
        return false;
    }

    public String getDevice_id() {
        return this.h;
    }

    public Integer getDevice_source() {
        return this.c;
    }

    public Integer getDevice_type() {
        return this.b;
    }

    public Integer getHr() {
        return this.e;
    }

    public Integer getState() {
        return this.f;
    }

    public Long getTime() {
        return this.d;
    }

    public Integer getTime_zone() {
        return this.g;
    }

    public Integer getType() {
        return this.a;
    }

    public void setDevice_id(String str) {
        this.h = str;
    }

    public void setDevice_source(Integer num) {
        this.c = num;
    }

    public void setDevice_type(Integer num) {
        this.b = num;
    }

    public void setHr(Integer num) {
        this.e = num;
    }

    public void setState(Integer num) {
        this.f = num;
    }

    public void setTime(Long l) {
        this.d = l;
    }

    public void setTime_zone(Integer num) {
        this.g = num;
    }

    public void setType(Integer num) {
        this.a = num;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull HeartRate heartRate) {
        return this.d.compareTo(heartRate.d) > 0 ? -1 : 1;
    }

    public HeartRate() {
    }
}
