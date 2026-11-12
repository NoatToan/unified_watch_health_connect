package com.huawei.wearengine.sensor;

import defpackage.yky;

/* JADX INFO: loaded from: classes46.dex */
public class SensorClient$4 extends AsyncReadCallback.Stub {
    final /* synthetic */ yky this$0;
    final /* synthetic */ SensorReadCallback val$sensorReadCallback;

    SensorClient$4(yky ykyVar, SensorReadCallback sensorReadCallback) {
        this.this$0 = ykyVar;
        this.val$sensorReadCallback = sensorReadCallback;
    }

    @Override // com.huawei.wearengine.sensor.AsyncReadCallback
    public void onReadResult(int i, DataResult dataResult) {
        SensorReadCallback sensorReadCallback = this.val$sensorReadCallback;
        if (sensorReadCallback != null) {
            sensorReadCallback.onReadResult(i, dataResult);
        }
    }
}
