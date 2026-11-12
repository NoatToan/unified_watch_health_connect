package com.xiaomi.hm.health.device.event;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.WeightAdvData;

/* JADX INFO: loaded from: classes20.dex */
public class HMDeviceWeightValueEvent extends HMDeviceEvent {
    private WeightAdvData b;
    private boolean c;

    public HMDeviceWeightValueEvent(WeightAdvData weightAdvData) {
        this(weightAdvData, false);
    }

    public WeightAdvData getWeightAdvData() {
        return this.b;
    }

    public boolean isBoundValue() {
        return this.c;
    }

    public String toString() {
        return "HMDeviceWeightValueEvent{mWeightAdvData=" + this.b + ", mIsBoundValue=" + this.c + '}';
    }

    public HMDeviceWeightValueEvent(WeightAdvData weightAdvData, boolean z) {
        super(HMDeviceType.WEIGHT);
        this.b = null;
        this.c = false;
        this.b = weightAdvData;
        this.c = z;
    }
}
