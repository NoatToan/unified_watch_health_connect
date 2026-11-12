package com.xiaomi.hm.health.bt.profile.smartwatch.sport;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public interface IHMSportDataCallback extends IHMGpsDataCallback, Serializable {
    public static final long serialVersionUID = 1;

    void onSportData(List<BleSportData> data);
}
