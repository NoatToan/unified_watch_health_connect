package com.xiaomi.hm.health.bt.profile.gdsp.activity;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public interface IDiscreteDataListener {
    void onDataFinished(boolean ret);

    void onDataHeaderReceived(DataHeader header);

    void onDataReceived(ArrayList<ActivityData> list);
}
