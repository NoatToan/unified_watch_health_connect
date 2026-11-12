package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class StrokeSpeedInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private float speed;
    private long time;

    public StrokeSpeedInfo(long j, float f) {
        this.time = j;
        this.speed = f;
    }

    public float getSpeed() {
        return this.speed;
    }

    public long getTime() {
        return this.time;
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public void setTime(long j) {
        this.time = j;
    }

    public String toString() {
        return "StrokeSpeedInfo{time=" + this.time + ", speed=" + this.speed + AbstractJsonLexerKt.END_OBJ;
    }
}
