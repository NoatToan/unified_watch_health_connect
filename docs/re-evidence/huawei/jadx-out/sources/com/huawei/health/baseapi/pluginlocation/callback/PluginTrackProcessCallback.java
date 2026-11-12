package com.huawei.health.baseapi.pluginlocation.callback;

import com.huawei.health.pluginlocation.TrajectoryPoint;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public interface PluginTrackProcessCallback {
    void onResponse(int i, ArrayList<TrajectoryPoint> arrayList, Map<Integer, Integer> map);
}
