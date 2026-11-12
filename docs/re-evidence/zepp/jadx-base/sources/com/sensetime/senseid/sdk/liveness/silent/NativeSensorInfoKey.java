package com.sensetime.senseid.sdk.liveness.silent;

/* JADX INFO: loaded from: classes18.dex */
enum NativeSensorInfoKey {
    ACCLERATION(0),
    ROTATION_RATE(1),
    GRAVITY(2),
    MAGNETIC_FIELD(3);

    private int mValue;

    NativeSensorInfoKey(int i) {
        this.mValue = i;
    }

    public final int getValue() {
        return this.mValue;
    }
}
