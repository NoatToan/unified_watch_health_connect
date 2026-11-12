package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class RiddingInfo implements Serializable {
    private static final long serialVersionUID = 1;
    public float mDistance3DAscend;
    public float mDistance3DDescend;
    public float mDistance3DFlat;
    public float mSpeed3D;
    public long mTimeAscend;
    public long mTimeDescend;
    public long mTimeFlat;

    public float getDistance3DAscend() {
        return this.mDistance3DAscend;
    }

    public float getDistance3DDescend() {
        return this.mDistance3DDescend;
    }

    public float getDistance3DFlat() {
        return this.mDistance3DFlat;
    }

    public float getSpeed3D() {
        return this.mSpeed3D;
    }

    public long getTimeAscend() {
        return this.mTimeAscend;
    }

    public long getTimeDescend() {
        return this.mTimeDescend;
    }

    public long getTimeFlat() {
        return this.mTimeFlat;
    }

    public void setDistance3DAscend(float f) {
        this.mDistance3DAscend = f;
    }

    public void setDistance3DDescend(float f) {
        this.mDistance3DDescend = f;
    }

    public void setDistance3DFlat(float f) {
        this.mDistance3DFlat = f;
    }

    public void setSpeed3D(float f) {
        this.mSpeed3D = f;
    }

    public void setTimeAscend(long j) {
        this.mTimeAscend = j;
    }

    public void setTimeDescend(long j) {
        this.mTimeDescend = j;
    }

    public void setTimeFlat(long j) {
        this.mTimeFlat = j;
    }

    public String toString() {
        return "RiddingInfo{mDistance3DAscend=" + this.mDistance3DAscend + ", mSpeed3D=" + this.mSpeed3D + ", mTimeAscend=" + this.mTimeAscend + ", mDistance3DDescend=" + this.mDistance3DDescend + ", mTimeDescend=" + this.mTimeDescend + ", mDistance3DFlat=" + this.mDistance3DFlat + ", mTimeFlat=" + this.mTimeFlat + AbstractJsonLexerKt.END_OBJ;
    }
}
