package com.mapbox.android.gestures;

/* JADX INFO: loaded from: classes2.dex */
public final class MoveDistancesObject {
    private float currX;
    private float currY;
    private float distanceXSinceLast;
    private float distanceXSinceStart;
    private float distanceYSinceLast;
    private float distanceYSinceStart;
    private final float initialX;
    private final float initialY;
    private float prevX;
    private float prevY;

    public MoveDistancesObject(float f14, float f15) {
        this.initialX = f14;
        this.initialY = f15;
    }

    public void addNewPosition(float f14, float f15) {
        float f16 = this.currX;
        this.prevX = f16;
        float f17 = this.currY;
        this.prevY = f17;
        this.currX = f14;
        this.currY = f15;
        this.distanceXSinceLast = f16 - f14;
        this.distanceYSinceLast = f17 - f15;
        this.distanceXSinceStart = this.initialX - f14;
        this.distanceYSinceStart = this.initialY - f15;
    }

    public float getCurrentX() {
        return this.currX;
    }

    public float getCurrentY() {
        return this.currY;
    }

    public float getDistanceXSinceLast() {
        return this.distanceXSinceLast;
    }

    public float getDistanceXSinceStart() {
        return this.distanceXSinceStart;
    }

    public float getDistanceYSinceLast() {
        return this.distanceYSinceLast;
    }

    public float getDistanceYSinceStart() {
        return this.distanceYSinceStart;
    }

    public float getInitialX() {
        return this.initialX;
    }

    public float getInitialY() {
        return this.initialY;
    }

    public float getPreviousX() {
        return this.prevX;
    }

    public float getPreviousY() {
        return this.prevY;
    }
}
