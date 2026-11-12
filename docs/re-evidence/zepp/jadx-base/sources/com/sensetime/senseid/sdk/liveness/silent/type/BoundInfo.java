package com.sensetime.senseid.sdk.liveness.silent.type;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public final class BoundInfo {
    private int mRadius;
    private int mX;
    private int mY;

    public BoundInfo(int i, int i2, int i3) {
        this.mX = -1;
        this.mY = -1;
        this.mRadius = -1;
        this.mX = i;
        this.mY = i2;
        this.mRadius = i3;
    }

    public final int getRadius() {
        return this.mRadius;
    }

    public final int getX() {
        return this.mX;
    }

    public final int getY() {
        return this.mY;
    }

    public final String toString() {
        return "BoundInfo[X: " + this.mX + ", Y: " + this.mY + ", Radius: " + this.mRadius + "]";
    }
}
