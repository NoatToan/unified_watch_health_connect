package com.huawei.healthcloud.plugintrack.manager.inteface;

import android.os.Bundle;
import com.huawei.healthcloud.plugintrack.model.SportGpsDataBean;

/* JADX INFO: loaded from: classes10.dex */
public interface TrackRealDataListener {
    void updateGpsData(SportGpsDataBean sportGpsDataBean);

    void updateGpsState(int i);

    void updateLinkStart();

    void updateSportData(Bundle bundle);
}
