package com.huami.watch.dataflow.sync.sport;

import android.util.Pair;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public interface WatchSportDataSyncedCallback {
    void transWatchSportSummaryAndDetailToLocal(String str, String str2);

    void updateWatchSportSummaryAndDetailState(List<Pair<Long, String>> list);
}
