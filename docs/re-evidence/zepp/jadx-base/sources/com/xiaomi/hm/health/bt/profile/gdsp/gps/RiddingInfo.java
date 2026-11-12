package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class RiddingInfo implements Serializable {
    private static final long serialVersionUID = 1;
    public float a;
    public long b;
    public long c;
    public long d;
    public float e;
    public float f;
    public float g;

    public float getDistance3DAscend() {
        return this.e;
    }

    public float getDistance3DDescend() {
        return this.f;
    }

    public float getDistance3DFlat() {
        return this.g;
    }

    public float getSpeed3D() {
        return this.a;
    }

    public long getTimeAscend() {
        return this.b;
    }

    public long getTimeDescend() {
        return this.c;
    }

    public long getTimeFlat() {
        return this.d;
    }

    public void setDistance3DAscend(float distance3DAscend) {
        this.e = distance3DAscend;
    }

    public void setDistance3DDescend(float distance3DDescend) {
        this.f = distance3DDescend;
    }

    public void setDistance3DFlat(float distance3DFlat) {
        this.g = distance3DFlat;
    }

    public void setSpeed3D(float speed3D) {
        this.a = speed3D;
    }

    public void setTimeAscend(long timeAscend) {
        this.b = timeAscend;
    }

    public void setTimeDescend(long timeDescend) {
        this.c = timeDescend;
    }

    public void setTimeFlat(long timeFlat) {
        this.d = timeFlat;
    }

    public String toString() {
        return "RiddingInfo{mDistance3DAscend=" + this.e + ", mSpeed3D=" + this.a + ", mTimeAscend=" + this.b + ", mDistance3DDescend=" + this.f + ", mTimeDescend=" + this.c + ", mDistance3DFlat=" + this.g + ", mTimeFlat=" + this.d + '}';
    }
}
