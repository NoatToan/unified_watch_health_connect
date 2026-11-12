package com.xiaomi.hm.health.bt.profile.gdsp.hr;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public interface IHMHrDataCallback {
    void onHrData(ArrayList<HMHrData> datas);

    void onHrStart();

    void onHrStop(boolean result);
}
