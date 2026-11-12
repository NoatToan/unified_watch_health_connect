package com.xiaomi.hm.health.bt.profile.gdsp.activity;

import com.xiaomi.hm.health.bt.profile.gdsp.hr.HMHrData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public interface IHrDataListener {
    void onDataReceived(ArrayList<HMHrData> datas);
}
