package com.xiaomi.hm.health.bodyfat.event;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.model.WeightAdvData;

/* JADX INFO: loaded from: classes19.dex */
public class BFDeviceWeightValueEvent extends BFDeviceEvent {
    private WeightAdvData b;
    private boolean c;

    public BFDeviceWeightValueEvent(WeightAdvData weightAdvData) {
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

    public BFDeviceWeightValueEvent(WeightAdvData weightAdvData, boolean z) {
        super(HMDeviceType.WEIGHT);
        this.b = null;
        this.c = false;
        this.b = weightAdvData;
        this.c = z;
    }
}
