package com.huami.watch.dataflow.sync.sport;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class WatchSportDataTransmitter {
    private static WatchSportDataTransmitter c;
    private WatchSportDataSyncedCallback a;
    private List<Pair<Long, String>> b = new ArrayList();

    private WatchSportDataTransmitter() {
    }

    public static WatchSportDataTransmitter getInstance() {
        if (c == null) {
            c = new WatchSportDataTransmitter();
        }
        return c;
    }

    public void addSportIdAndSource(long j, String str) {
        this.b.add(new Pair<>(Long.valueOf(j), str));
    }

    public void setCallback(WatchSportDataSyncedCallback watchSportDataSyncedCallback) {
        this.a = watchSportDataSyncedCallback;
    }

    public void transWatchSportData(String str, String str2) {
        WatchSportDataSyncedCallback watchSportDataSyncedCallback = this.a;
        if (watchSportDataSyncedCallback != null) {
            watchSportDataSyncedCallback.transWatchSportSummaryAndDetailToLocal(str, str2);
        }
    }

    public void updateWatchSportDataState() {
        WatchSportDataSyncedCallback watchSportDataSyncedCallback = this.a;
        if (watchSportDataSyncedCallback != null) {
            watchSportDataSyncedCallback.updateWatchSportSummaryAndDetailState(this.b);
        }
    }
}
