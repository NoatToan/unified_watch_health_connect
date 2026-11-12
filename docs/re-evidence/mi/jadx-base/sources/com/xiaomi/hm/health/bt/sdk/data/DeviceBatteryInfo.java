package com.xiaomi.hm.health.bt.sdk.data;

import java.io.Serializable;
import java.util.Calendar;

/* JADX INFO: loaded from: classes11.dex */
public class DeviceBatteryInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean isChargeFull;
    private boolean isCharging;
    private Calendar lastCharge;
    private Calendar lastChargeFull;
    private int lastChargeLevel;
    private int level;

    public DeviceBatteryInfo(int i, int i2, Calendar calendar, Calendar calendar2, boolean z, boolean z2) {
        this.level = i;
        this.lastChargeLevel = i2;
        this.lastCharge = calendar;
        this.lastChargeFull = calendar2;
        this.isCharging = z;
        this.isChargeFull = z2;
    }

    public Calendar getLastCharge() {
        return this.lastCharge;
    }

    public Calendar getLastChargeFull() {
        return this.lastChargeFull;
    }

    public int getLastChargeLevel() {
        return this.lastChargeLevel;
    }

    public int getLevel() {
        return this.level;
    }

    public boolean isChargeFull() {
        return this.isChargeFull;
    }

    public boolean isCharging() {
        return this.isCharging;
    }
}
