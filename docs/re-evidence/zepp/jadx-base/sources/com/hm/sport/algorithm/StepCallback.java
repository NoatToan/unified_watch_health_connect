package com.hm.sport.algorithm;

/* JADX INFO: loaded from: classes4.dex */
public interface StepCallback {
    void onAccSensorStepReported(TimestampData timestampData);

    void onBandStepReported(TimestampData timestampData);

    void onBlueMonkeyStepReported(TimestampData timestampData);

    void onFusionStepReported(TimestampData timestampData);

    void onPhoneHubStepReported(TimestampData timestampData);

    void onShoeStepReported(TimestampData timestampData);
}
