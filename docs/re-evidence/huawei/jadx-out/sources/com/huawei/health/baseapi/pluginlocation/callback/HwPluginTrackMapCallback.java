package com.huawei.health.baseapi.pluginlocation.callback;

import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public interface HwPluginTrackMapCallback {
    default void onResponse(int i, Map<Long, double[]> map) {
    }

    default void onResponse(int i, Map<Long, double[]> map, Map<Integer, Integer> map2) {
        onResponse(i, map);
    }
}
