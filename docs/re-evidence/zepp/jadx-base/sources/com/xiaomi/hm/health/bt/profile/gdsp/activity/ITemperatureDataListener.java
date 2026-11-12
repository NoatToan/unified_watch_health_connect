package com.xiaomi.hm.health.bt.profile.gdsp.activity;

import com.xiaomi.hm.health.bt.profile.gdsp.temperature.HMTemperatureData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public interface ITemperatureDataListener {
    void onDataReceived(ArrayList<HMTemperatureData> datas);
}
