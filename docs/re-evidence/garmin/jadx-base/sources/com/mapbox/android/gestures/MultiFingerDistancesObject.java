package com.mapbox.android.gestures;

/* JADX INFO: loaded from: classes2.dex */
public class MultiFingerDistancesObject {
    private final float currFingersDiffX;
    private final float currFingersDiffXY;
    private final float currFingersDiffY;
    private final float prevFingersDiffX;
    private final float prevFingersDiffXY;
    private final float prevFingersDiffY;

    public MultiFingerDistancesObject(float f14, float f15, float f16, float f17) {
        this.prevFingersDiffX = f14;
        this.prevFingersDiffY = f15;
        this.currFingersDiffX = f16;
        this.currFingersDiffY = f17;
        this.prevFingersDiffXY = (float) Math.sqrt((f15 * f15) + (f14 * f14));
        this.currFingersDiffXY = (float) Math.sqrt((f17 * f17) + (f16 * f16));
    }

    public float getCurrFingersDiffX() {
        return this.currFingersDiffX;
    }

    public float getCurrFingersDiffXY() {
        return this.currFingersDiffXY;
    }

    public float getCurrFingersDiffY() {
        return this.currFingersDiffY;
    }

    public float getPrevFingersDiffX() {
        return this.prevFingersDiffX;
    }

    public float getPrevFingersDiffXY() {
        return this.prevFingersDiffXY;
    }

    public float getPrevFingersDiffY() {
        return this.prevFingersDiffY;
    }
}
