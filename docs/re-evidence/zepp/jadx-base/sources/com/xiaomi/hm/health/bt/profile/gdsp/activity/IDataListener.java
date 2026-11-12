package com.xiaomi.hm.health.bt.profile.gdsp.activity;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public interface IDataListener {
    void onDataMissing();

    void onDataReceived(ArrayList<ActivityData> list);
}
