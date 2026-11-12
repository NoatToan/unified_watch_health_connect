package com.huawei.wearengine.sensor;

import defpackage.yky;

/* JADX INFO: loaded from: classes46.dex */
public class SensorClient$6 extends AsyncStopCallback.Stub {
    final /* synthetic */ yky this$0;
    final /* synthetic */ SensorStopCallback val$sensorStopCallback;

    SensorClient$6(yky ykyVar, SensorStopCallback sensorStopCallback) {
        this.this$0 = ykyVar;
        this.val$sensorStopCallback = sensorStopCallback;
    }

    @Override // com.huawei.wearengine.sensor.AsyncStopCallback
    public void onStopResult(int i) {
        SensorStopCallback sensorStopCallback = this.val$sensorStopCallback;
        if (sensorStopCallback != null) {
            sensorStopCallback.onStopResult(i);
        }
    }
}
