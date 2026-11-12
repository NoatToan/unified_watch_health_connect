package com.xiaomi.hm.health.bt.profile.gdsp;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import java.util.Calendar;

/* JADX INFO: loaded from: classes13.dex */
public class HMGDSPParameter {
    private Calendar a;
    private HMDeviceSource b;
    private HMGDSPType c;
    private IHMDataCallback<HMGDSPData> d;

    public Calendar getCalendar() {
        return this.a;
    }

    public IHMDataCallback<HMGDSPData> getCallback() {
        return this.d;
    }

    public HMDeviceSource getDeviceSource() {
        return this.b;
    }

    public HMGDSPType getGdspType() {
        return this.c;
    }

    public void setCalendar(Calendar calendar) {
        this.a = calendar;
    }

    public void setCallback(IHMDataCallback<HMGDSPData> callback) {
        this.d = callback;
    }

    public void setDeviceSource(HMDeviceSource deviceSource) {
        this.b = deviceSource;
    }

    public void setGdspType(HMGDSPType gdspType) {
        this.c = gdspType;
    }
}
